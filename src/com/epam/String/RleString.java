package com.epam.String;


public class RleString {

    public static void main(String[] args) {
        String string = "Heeeeelllloooppppppppppppq";
        StringBuilder sb = new StringBuilder(string);
        StringBuilder finalString = new StringBuilder();
        finalString = RleString.getRLEString(sb, finalString);
        System.out.println("String " + string);
        System.out.println("RLE String " + finalString);
        StringBuilder decodeString = new StringBuilder();
        decodeString = RleString.getDecodedString(finalString, decodeString);
        System.out.println("Decoded String " + decodeString);
    }


    /**
     * @param string
     * @param finalString
     * @return
     */
    private static StringBuilder getRLEString(StringBuilder string, StringBuilder finalString) {
        for (int i = 0; i <= string.length() - 1; i++) {
            char currentChar = string.charAt(i);
            boolean isLast = i == (string.length() - 1);
            if (isLast) {
                finalString.append(currentChar);
                break;
            }
            char nextChar = string.charAt(i + 1);
            if (currentChar != nextChar) {
                finalString.append(currentChar);
            } else {
                Integer charCount = RleString.getSameCharsCount(string, i);
                finalString.append(charCount).append(currentChar);
                i = i + charCount - 1;
            }
        }
        return finalString;
    }


    /**
     * @param string
     * @param startPosition
     * @return
     */
    private static int getSameCharsCount(StringBuilder string, int startPosition) {
        int j = 1;
        for (int i = startPosition; i < string.length() - 1; i++) {
            if (string.charAt(i) == string.charAt(i + 1)) {
                j++;
                if (j == 9) {
                    break;
                }
            } else {
                break;
            }
        }
        return j;
    }

    /**
     * @param string
     * @param decodeString
     * @return
     */
    private static StringBuilder getDecodedString(StringBuilder string, StringBuilder decodeString) {
        for (int i = 0; i <= string.length() - 1; i++) {
            int charCount = Character.digit(string.charAt(i), 10);
            if (charCount > 0) {
                for(int j = 1; j < charCount; j++){
                    decodeString.append(string.charAt(i+1));
                }
            } else{
                decodeString.append(string.charAt(i));
            }
        }
        return decodeString;

    }


}
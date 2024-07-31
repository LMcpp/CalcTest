class Validation {
    public static int validateAndParse(String strNum){
        try {
            int num = Integer.parseInt(strNum);
            if (num < 1 || num > 10) {
                throw new IllegalArgumentException("Wrong number range");
            }
            return num;
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Wrong number format");
        }
    }
}

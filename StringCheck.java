    public static Boolean StringCheck(String str) throws PatternSyntaxException {
        // 只允許字母和數字
        String regEx = "[^a-zA-Z0-9]";
        // 特殊字元array
        // String regEx =
        // "[`~!@#$%^&*()+=|{}':;',//[//].<>/?~！@#¥%……&*（）——+|{}【】‘；︰”“’。，、？]";
        Pattern p = Pattern.compile(regEx);
        Matcher m = p.matcher(str);
        return m.find();
    }

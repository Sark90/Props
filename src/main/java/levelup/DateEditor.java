package levelup;

import java.beans.PropertyEditorSupport;

public class DateEditor extends PropertyEditorSupport {
    //private Date date;  //CustomDateEditor
    public void setAsText(String text) {
        String s = stripNonNumeric(text);
        String year, month, day;
        year = s.substring(4);
        month = s.substring(2, 4);
        day = s.substring(0, 2);
        setValue(new Date(year, month, day));
    }

    private String stripNonNumeric(String original) {
        StringBuffer numeric = new StringBuffer();
        for (int i=0; i<original.length(); i++) {
            char c  = original.charAt(i);
            if (Character.isDigit(c)) {
                numeric.append(c);
            }
        }
        return numeric.toString();
    }
}

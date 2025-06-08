package gr.aueb.cf.teacherapp.core.exceptions;

public class EntityInvalidArgumentException extends EntityGenericException{
    private static String DEFAULT_CODE = "InvalidArgument";

    public EntityInvalidArgumentException(String code, String message) {
        super(code + DEFAULT_CODE, message);
    }
}

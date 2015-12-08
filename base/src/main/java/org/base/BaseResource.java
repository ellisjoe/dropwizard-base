package org.base;

public class BaseResource implements BaseService {

    public StringResponse test() {
        return new StringResponse("Sucess");
    }

}
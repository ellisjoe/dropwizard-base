package org.base;

public class BaseResource implements BaseService {

    public StringResponse test() {
        return StringResponse.of("Success!");
    }

    @Override
    public StringResponse testInt(Integer val) {
        return StringResponse.of(val.toString());
    }

}
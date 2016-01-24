package org.base;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

@Value.Immutable
@Value.Style(visibility = Value.Style.ImplementationVisibility.PACKAGE)
@JsonSerialize(as = ImmutableStringResponse.class)
@JsonDeserialize(as = ImmutableStringResponse.class)
public abstract class StringResponse {

    @Value.Parameter
    public abstract String getResponse();

    public static StringResponse of(String response) {
        return ImmutableStringResponse.of(response);
    }

}

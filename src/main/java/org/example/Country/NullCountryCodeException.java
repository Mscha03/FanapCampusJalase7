package org.example.Country;

public class NullCountryCodeException extends Throwable{
    public NullCountryCodeException() {
    }

    public NullCountryCodeException(String message) {
        super(message);
    }
}

package za.ac.nwu.ac.domain.service;

import java.io.Serializable;
import java.util.Objects;

public class GeneralResponse<T> implements Serializable {

    private final boolean succcessful;
    private final transient T payload;

    public GeneralResponse(boolean successful, T payload) {
        this.succcessful = successful;
        this.payload = payload;
    }

    public boolean isSucccessful(){ return succcessful;}

    public T getPayload() {return payload;}

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(this == null || getClass() != o.getClass()) return false;
        GeneralResponse<?> that = (GeneralResponse<?>) o;
        return succcessful == that.succcessful && Objects.equals(payload, that.payload);

    }

    @Override
    public int hashCode() {return Objects.hash(succcessful, payload);}

    @Override
    public String toString(){
        return "GeneralResponse{" +
                "successful=" + succcessful +
                ", payload=" + payload +
                '}';
    }
}

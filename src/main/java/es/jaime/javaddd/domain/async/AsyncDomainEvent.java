package es.jaime.javaddd.domain.async;

public interface AsyncDomainEvent extends AsyncMessage {
    @Override
    default AsyncMessageType type(){
        return AsyncMessageType.EVENT;
    }
}

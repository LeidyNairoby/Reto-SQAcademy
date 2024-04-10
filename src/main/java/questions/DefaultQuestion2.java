package questions;

public abstract class DefaultQuestion2<Actor> implements DefaultQuestion2<String> {
    private static String name;


    public abstract String answeredBy(Object actor);

    @Override
    public String answeredBy(Actor actor) {
        return null;
    }

    public abstract String answeredBy(Actor actor);
}
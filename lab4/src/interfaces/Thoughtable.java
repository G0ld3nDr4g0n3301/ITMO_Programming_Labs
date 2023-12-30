package interfaces;

import exceptions.StatisticsFailException;
import shorties.Thought;

public interface Thoughtable {
    public void think(Thought thought) throws StatisticsFailException;
}

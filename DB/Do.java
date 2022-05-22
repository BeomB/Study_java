package DB;

import java.sql.SQLException;
import java.util.Timer;
import java.util.TimerTask;

public class Do {

    public static void main(String[] args) {
    Schdule schdule = new Schdule();
    Timer timer = new Timer();
    long delay = 3000L;
    final TimerTask timerTask = schdule.timerTask;
    timer.schedule(timerTask,delay);


    }
}


class Schdule {

    DBConnection dbConnection = new DBConnection();

    TimerTask timerTask = new TimerTask() {
        @Override
        public void run() {
            try {
                if(dbConnection.db().equals("이범기2"))
                {
                    System.out.println("hello");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    };


}


//https://codechacha.com/ko/java-timer/

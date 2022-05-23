package DB;

import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.Timer;
import java.util.TimerTask;

public class Do {

    public static void main(String[] args) {
    Schdule schdule = new Schdule();
    Timer timer = new Timer();
    long delay = 3000L;
    long period = 1000L;
    final TimerTask timerTask = schdule.timerTask;
    timer.scheduleAtFixedRate(timerTask, delay, period);


    }
}


class Schdule {

    DBConnection dbConnection = new DBConnection();

    TimerTask timerTask = new TimerTask() {
        @Override
        public void run() {
            try {
                if(dbConnection.db()!=null)
                {
                    System.out.println(dbConnection.db().get(0).getName());
                    System.out.println(dbConnection.db().get(1).getName());

                }
            } catch (SQLException e) {
                e.printStackTrace();
            }


        }
    };


}

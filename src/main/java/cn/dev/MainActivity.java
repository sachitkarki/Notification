package cn.dev;

import android.app.Activity;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;

public class MainActivity extends Activity {

    public int ID = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        baseNotification();
    }

    public void baseNotification(){
        NotificationCompat.Builder builder = new NotificationCompat.Builder(this);
        builder.setContentTitle("title");
        builder.setContentText("content");
        builder.setAutoCancel(true);
        builder.setSmallIcon(R.mipmap.ic_launcher);
        builder.setLargeIcon(BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher));

        builder.setPriority(NotificationCompat.PRIORITY_MAX);

        builder.setDefaults(NotificationCompat.DEFAULT_ALL);
//        Notification notification = builder.build();
        NotificationManagerCompat.from(this).notify(ID, builder.build());
    }
}

package teamcamelcase.walkock;


import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class AlarmReceiver extends BroadcastReceiver{

    @Override
    public void onReceive(Context context, Intent intent) {

        String action = intent.getExtras().getString("Action");
        // Create an intent to the ringtone service
        Intent service_intent = new Intent(context, RingtonePlayingService.class);
        service_intent.putExtra("Action", action);
        // Start the ringtone service
        context.startService(service_intent);

    }
}

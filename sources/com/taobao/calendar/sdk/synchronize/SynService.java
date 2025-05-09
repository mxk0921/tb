package com.taobao.calendar.sdk.synchronize;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.taobao.calendar.sdk.alarm.CalendarAlarm;
import com.taobao.calendar.sdk.db.TableSchedule;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class SynService extends Service {
    public static final String TAG = "TBCalendar";

    static {
        t2o.a(414187603);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        TableSchedule.SynIngFlag = true;
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        if (intent == null) {
            return 1;
        }
        String action = intent.getAction();
        String stringExtra = intent.getStringExtra("userId");
        String stringExtra2 = intent.getStringExtra("ttid");
        if (action != null && action.equals(CalendarAlarm.INTENT_SYN)) {
            new SynBusinessProxy(getApplicationContext(), stringExtra, stringExtra2).submitAndUpdate();
        }
        return 1;
    }

    @Override // android.app.Service
    public void onDestroy() {
    }
}

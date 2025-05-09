package com.taobao.calendar.sdk.alarm;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import com.taobao.calendar.sdk.common.DateUtils;
import com.taobao.calendar.sdk.db.ScheduleDO;
import com.taobao.calendar.sdk.db.TableSchedule;
import java.util.Collections;
import java.util.List;
import tb.rto;
import tb.t2o;
import tb.ya;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class CalendarAlarmService extends Service {
    public static int PENDING_INTENT_ID = 1;
    private boolean mPlaying = false;
    private boolean mReseting = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a extends TableSchedule.QueryHandler {
        public a() {
        }

        @Override // com.taobao.calendar.sdk.db.TableSchedule.QueryHandler
        public void callback(int i, List<ScheduleDO> list) {
            if (list.size() != 0) {
                Collections.sort(list, new rto());
                CalendarAlarmService calendarAlarmService = CalendarAlarmService.this;
                calendarAlarmService.setAlarmToSystem(list);
                if (!calendarAlarmService.mPlaying) {
                    calendarAlarmService.stopSelf();
                }
                calendarAlarmService.mReseting = false;
            }
        }
    }

    static {
        t2o.a(414187542);
    }

    private void resetAlarm() {
        this.mReseting = true;
        TableSchedule.getRecentRemindSchedule(new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlarmToSystem(List<ScheduleDO> list) {
        if (list != null && list.size() > 0) {
            try {
                AlarmManager alarmManager = (AlarmManager) getSystemService("alarm");
                int i = 0;
                while (i < list.size()) {
                    ScheduleDO scheduleDO = list.get(i);
                    if (scheduleDO != null) {
                        long j = scheduleDO.alartTime;
                        int hashCode = String.valueOf(j).hashCode();
                        StringBuilder sb = new StringBuilder();
                        sb.append(scheduleDO.eventId);
                        sb.append(",");
                        for (int i2 = i + 1; i2 < list.size(); i2++) {
                            ScheduleDO scheduleDO2 = list.get(i2);
                            if (scheduleDO2 != null) {
                                if (scheduleDO2.alartTime != j) {
                                    break;
                                }
                                sb.append(scheduleDO2.eventId);
                                sb.append(",");
                                i = i2;
                            }
                        }
                        sb.deleteCharAt(sb.length() - 1);
                        String sb2 = sb.toString();
                        Intent intent = new Intent(CalendarAlarm.INTENT_PLAY);
                        intent.putExtra("id", sb2);
                        PendingIntent e = ya.e(this, hashCode, intent, 134217728);
                        alarmManager.cancel(e);
                        Log.e("ALARM", "create" + DateUtils.formatDate(scheduleDO.alartTime));
                        alarmManager.setExact(0, scheduleDO.alartTime, e);
                    }
                    i++;
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        String action;
        if (!(intent == null || (action = intent.getAction()) == null || !action.equals(CalendarAlarm.INTENT_RESET))) {
            resetAlarm();
        }
        return 1;
    }

    @Override // android.app.Service
    public void onCreate() {
    }

    @Override // android.app.Service
    public void onDestroy() {
    }
}

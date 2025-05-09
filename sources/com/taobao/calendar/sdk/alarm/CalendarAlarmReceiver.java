package com.taobao.calendar.sdk.alarm;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.taobao.android.turbo.core.component.BaseOuterComponent;
import com.taobao.calendar.sdk.TBCalendar;
import com.taobao.calendar.sdk.TBCalendarBase;
import com.taobao.calendar.sdk.common.DateUtils;
import com.taobao.calendar.sdk.db.ScheduleDO;
import com.taobao.calendar.sdk.db.TableSchedule;
import com.taobao.calendar.sdk.synchronize.SynService;
import com.taobao.statistic.CT;
import com.taobao.statistic.TBS;
import com.taobao.tao.util.Constants;
import java.util.List;
import tb.t2o;
import tb.ya;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class CalendarAlarmReceiver extends BroadcastReceiver {
    private static int notifyId = 0;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f10274a;

        public a(Context context) {
            this.f10274a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            Intent intent = new Intent(this.f10274a, CalendarAlarmService.class);
            intent.setAction(CalendarAlarm.INTENT_RESET);
            try {
                this.f10274a.startService(intent);
            } catch (Exception unused) {
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Intent f10275a;
        final /* synthetic */ Context b;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class a extends TableSchedule.QueryHandler {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ String f10276a;

            public a(String str) {
                this.f10276a = str;
            }

            @Override // com.taobao.calendar.sdk.db.TableSchedule.QueryHandler
            public void callback(int i, List<ScheduleDO> list) {
                CalendarAlarmReceiver.displayAlarm(b.this.b, this.f10276a, list);
            }
        }

        public b(Intent intent, Context context) {
            this.f10275a = intent;
            this.b = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            String stringExtra = this.f10275a.getStringExtra("id");
            TableSchedule.getSchedule(stringExtra, new a(stringExtra));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f10277a;
        final /* synthetic */ String b;

        public c(Context context, String str) {
            this.f10277a = context;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            Intent intent = new Intent(this.f10277a, CalendarAlarmService.class);
            intent.setAction(this.b);
            try {
                this.f10277a.startService(intent);
            } catch (Exception unused) {
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f10278a;
        final /* synthetic */ Intent b;

        public d(Context context, Intent intent) {
            this.f10278a = context;
            this.b = intent;
        }

        @Override // java.lang.Runnable
        public void run() {
            Intent intent = new Intent(this.f10278a, SynService.class);
            intent.putExtra("userId", this.b.getStringExtra("userId"));
            intent.putExtra("ttid", this.b.getStringExtra("ttid"));
            intent.setAction(CalendarAlarm.INTENT_SYN);
            try {
                this.f10278a.startService(intent);
            } catch (Exception unused) {
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class e {

        /* renamed from: a  reason: collision with root package name */
        public static final Handler f10279a;

        static {
            t2o.a(414187541);
            HandlerThread handlerThread = new HandlerThread("AsyncHandler");
            handlerThread.start();
            f10279a = new Handler(handlerThread.getLooper());
        }

        public static void a(Runnable runnable) {
            f10279a.post(runnable);
        }
    }

    static {
        t2o.a(414187535);
    }

    private static Notification createNotify(Context context, String str, String str2, long j, String str3, String str4) {
        Intent intent = new Intent("com.taobao.headline.calendar.NOTIFY");
        if (context == null) {
            return null;
        }
        intent.putExtra(Constants.MYBROWSERURL, str2);
        intent.putExtra(BaseOuterComponent.b.SOURCE_COMPONENT_ID, str3);
        intent.putExtra("eventId", str4);
        intent.putExtra("date", j);
        Intent intent2 = new Intent(NotificationLogSupport.INTENT_NOTIFY);
        intent2.putExtra("tao_calendar_realIntent", intent);
        return new NotificationCompat.Builder(context).setSmallIcon(TBCalendar.smallIcon).setContentTitle("淘宝巧刻历提醒您").setContentText(str).setWhen(0L).setAutoCancel(true).setDefaults(7).setContentIntent(ya.e(context, notifyId, intent2, 134217728)).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void displayAlarm(Context context, String str, List<ScheduleDO> list) {
        CalendarAlarm.reset(context);
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        if (list.size() != 0) {
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(RemoteMessageConst.NOTIFICATION);
            Long valueOf = Long.valueOf(list.get(0).sourceId);
            if (list.size() == 1) {
                sb.append(valueOf);
                sb2.append(list.get(0).eventId);
                ScheduleDO scheduleDO = list.get(0);
                notificationManager.notify(scheduleDO.eventId, CalendarAlarm.NOTIFY_ID, createNotify(context, "[" + DateUtils.formatDate(scheduleDO.startTime, "HH:mm") + "] " + scheduleDO.getLable(), scheduleDO.link, scheduleDO.startTime, sb.toString(), str));
            } else {
                String str2 = "您有" + list.size() + "个消息提醒，请点击查看!";
                long j = list.get(0).startTime;
                for (ScheduleDO scheduleDO2 : list) {
                    sb.append(scheduleDO2.sourceId);
                    sb.append("_");
                    sb2.append(scheduleDO2.eventId);
                    sb2.append("_");
                }
                sb.deleteCharAt(sb.length() - 1);
                sb2.deleteCharAt(sb2.length() - 1);
                notificationManager.notify(str, CalendarAlarm.NOTIFY_ID, createNotify(context, str2, "http://m.taobao.com/go/tbcalendar?date=" + j, j, sb.toString(), sb2.toString()));
            }
            TBS.Adv.ctrlClicked("Page_Calendar", CT.Button, "show_notify", "sourceId=" + sb.toString(), "eventId=" + sb2.toString());
            updateNotifyId();
        }
    }

    private static void updateNotifyId() {
        int i = notifyId + 1;
        notifyId = i;
        if (i > 10000) {
            notifyId = 0;
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        TBCalendarBase.init(context);
        if (!TextUtils.isEmpty(action)) {
            if (action.equals("android.intent.action.BOOT_COMPLETED") || action.equals("android.intent.action.TIMEZONE_CHANGED") || action.equals("android.intent.action.TIME_SET") || action.equals(CalendarAlarm.INTENT_RESET)) {
                e.a(new a(context));
            } else if (action.equals(CalendarAlarm.INTENT_PLAY)) {
                e.a(new b(intent, context));
            } else if (action.equals(CalendarAlarm.INTENT_KILL) || action.equals(Integer.valueOf(CalendarAlarm.TIMEOUT))) {
                if (action.equals(CalendarAlarm.INTENT_KILL)) {
                    ((NotificationManager) context.getSystemService(RemoteMessageConst.NOTIFICATION)).cancel(intent.getStringExtra("id"), CalendarAlarm.NOTIFY_ID);
                }
                e.a(new c(context, action));
            } else if (action.equals(CalendarAlarm.INTENT_SYN)) {
                e.a(new d(context, intent));
            }
        }
    }
}

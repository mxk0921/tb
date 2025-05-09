package tb;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.desktop.channel.calendar.CalendarInsertData;
import com.taobao.runtimepermission.a;
import tb.uu2;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class uu2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface a {
        void onError();

        void onSuccess();
    }

    static {
        t2o.a(435159053);
    }

    public static boolean a(Context context, String str, String str2, long j, long j2, long j3) {
        String a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3dea5ce", new Object[]{context, str, str2, new Long(j), new Long(j2), new Long(j3)})).booleanValue();
        }
        try {
            ggh.d("CalendarServiceProtocol addCalendarEvent title: " + str + " description: " + str2 + " startTime: " + j + " endTime: " + j2 + " reminderMinutes: " + j3);
            CalendarInsertData calendarInsertData = new CalendarInsertData();
            calendarInsertData.setTitle(str);
            calendarInsertData.setContent(str2);
            calendarInsertData.setReminderTime(j);
            calendarInsertData.setKeepTime(j2 - j);
            calendarInsertData.setPreviousMinutes(j3);
            a2 = lu2.a(context, calendarInsertData);
            StringBuilder sb = new StringBuilder("CalendarServiceProtocol addCalendarEvent: ");
            sb.append(a2);
            ggh.d(sb.toString());
        } catch (Throwable th) {
            ggh.d("CalendarServiceProtocol addCalendarEvent error: " + th.getMessage());
        }
        if (TextUtils.isEmpty(a2)) {
            return true;
        }
        return false;
    }

    public static boolean b(Context context, String str, long j, long j2) {
        String p;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("209ad71b", new Object[]{context, str, new Long(j), new Long(j2)})).booleanValue();
        }
        try {
            p = lu2.p(context, str);
            ggh.d("CalendarServiceProtocol queryResult: " + p);
        } catch (Throwable th) {
            ggh.d("CalendarServiceProtocol checkCalendarEvent error: " + th.getMessage());
        }
        if (Boolean.parseBoolean(p)) {
            return true;
        }
        return false;
    }

    public static boolean c(Context context, String str, long j, long j2) {
        String l;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a40ac2de", new Object[]{context, str, new Long(j), new Long(j2)})).booleanValue();
        }
        try {
            l = lu2.l(context, str);
            ggh.d("CalendarServiceProtocol delResult: " + l);
        } catch (Exception e) {
            ggh.d("CalendarServiceProtocol delCalendarEvent error: " + e.getMessage());
        }
        if (TextUtils.isEmpty(l)) {
            return true;
        }
        return false;
    }

    public static void d(Context context, final a aVar) {
        String[] strArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d6c05a7", new Object[]{context, aVar});
            return;
        }
        try {
            if (q8l.e()) {
                strArr = new String[]{"android.permission.WRITE_CALENDAR"};
            } else {
                strArr = new String[]{"android.permission.READ_CALENDAR", "android.permission.WRITE_CALENDAR"};
            }
            a.C0649a c = com.taobao.runtimepermission.a.c(context, strArr);
            aVar.getClass();
            c.A(new Runnable() { // from class: tb.su2
                @Override // java.lang.Runnable
                public final void run() {
                    uu2.a.this.onSuccess();
                }
            }).z(new Runnable() { // from class: tb.tu2
                @Override // java.lang.Runnable
                public final void run() {
                    uu2.a.this.onError();
                }
            }).m();
        } catch (Throwable th) {
            ggh.d("CalendarServiceProtocol requestCalenderPermission error: " + th.getMessage());
        }
    }
}

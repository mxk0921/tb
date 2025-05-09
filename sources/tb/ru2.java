package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.desktop.channel.calendar.CalendarInsertData;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ru2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(435159052);
    }

    public static void b(final Context context, final String str, final JSONObject jSONObject, final ukb ukbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9c4cae5", new Object[]{context, str, jSONObject, ukbVar});
        } else {
            mn8.c().execute(new Runnable() { // from class: tb.qu2
                @Override // java.lang.Runnable
                public final void run() {
                    ru2.e(str, context, jSONObject, ukbVar);
                }
            });
        }
    }

    public static String c(Context context, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("166378d2", new Object[]{context, jSONObject});
        }
        try {
            CalendarInsertData calendarInsertData = new CalendarInsertData();
            calendarInsertData.setTitle(jSONObject.getString("title"));
            calendarInsertData.setContent(jSONObject.getString("content"));
            calendarInsertData.setReminderTime(jSONObject.getLongValue("start"));
            if (jSONObject.getLongValue("end") == 0) {
                calendarInsertData.setKeepTime(300000L);
            } else {
                calendarInsertData.setKeepTime(jSONObject.getLongValue("end") - jSONObject.getLongValue("start"));
            }
            calendarInsertData.setPreviousMinutes(jSONObject.getLongValue("alarmOffset"));
            JSONObject jSONObject2 = (JSONObject) jSONObject.get("repeatRule");
            if (jSONObject2 != null) {
                String string = jSONObject2.getString("mode");
                calendarInsertData.setFreq(jSONObject2.getString("mode"));
                if (string.equals("weekly") && TextUtils.isEmpty(jSONObject2.getString("daysOfTheWeek"))) {
                    return "PARAM_INVALID";
                }
                if (jSONObject2.getLong("end").longValue() < System.currentTimeMillis()) {
                    return iu2.CALENDAR_ERROR_INVALIDATE_END_TIME;
                }
                calendarInsertData.setByDay(jSONObject2.getString("daysOfTheWeek"));
                calendarInsertData.setRepeatEnd(jSONObject2.getLong("end").longValue());
            }
            String a2 = lu2.a(context, calendarInsertData);
            ggh.b("CalendarServiceHub addCalendarEvent: " + a2);
            return a2;
        } catch (Exception e) {
            ggh.b("CalendarServiceHub addCalenderEvent error: " + e.getMessage());
            return iu2.CALENDAR_ERROR_CATCH;
        }
    }

    public static String d(Context context, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("75cc46c0", new Object[]{context, jSONObject});
        }
        try {
            String l = lu2.l(context, jSONObject.getString("title"));
            ggh.b("CalendarServiceHub delCalendarEvent: " + l);
            return l;
        } catch (Exception e) {
            ggh.b("CalendarServiceHub delCalendarEvent error: " + e.getMessage());
            return iu2.CALENDAR_ERROR_CATCH;
        }
    }

    public static String f(Context context, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7fb725fd", new Object[]{context, jSONObject});
        }
        try {
            String p = lu2.p(context, jSONObject.getString("title"));
            ggh.b("CalendarServiceHub queryCalendarEvent: " + p);
            return p;
        } catch (Exception e) {
            ggh.b("CalendarServiceHub queryCalendarEvent error: " + e.getMessage());
            return iu2.CALENDAR_ERROR_CATCH;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x002f, code lost:
        if (r6.equals(tb.iu2.CALENDAR_EVENT_REMOVE) == false) goto L_0x0026;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void e(java.lang.String r6, android.content.Context r7, com.alibaba.fastjson.JSONObject r8, tb.ukb r9) {
        /*
            r0 = 2
            r1 = 1
            r2 = 0
            com.android.alibaba.ip.runtime.IpChange r3 = tb.ru2.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x001b
            java.lang.String r4 = "1becf08a"
            r5 = 4
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r2] = r6
            r5[r1] = r7
            r5[r0] = r8
            r6 = 3
            r5[r6] = r9
            r3.ipc$dispatch(r4, r5)
            return
        L_0x001b:
            r6.hashCode()
            r3 = -1
            int r4 = r6.hashCode()
            switch(r4) {
                case -2130661467: goto L_0x003d;
                case -1259780487: goto L_0x0032;
                case -317506442: goto L_0x0028;
                default: goto L_0x0026;
            }
        L_0x0026:
            r0 = -1
            goto L_0x0047
        L_0x0028:
            java.lang.String r1 = "removeEvent"
            boolean r6 = r6.equals(r1)
            if (r6 != 0) goto L_0x0047
            goto L_0x0026
        L_0x0032:
            java.lang.String r0 = "addEvent"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x003b
            goto L_0x0026
        L_0x003b:
            r0 = 1
            goto L_0x0047
        L_0x003d:
            java.lang.String r0 = "checkEventExist"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x0046
            goto L_0x0026
        L_0x0046:
            r0 = 0
        L_0x0047:
            switch(r0) {
                case 0: goto L_0x0066;
                case 1: goto L_0x005c;
                case 2: goto L_0x0052;
                default: goto L_0x004a;
            }
        L_0x004a:
            java.lang.String r6 = "api not find"
            tb.pu2$a r9 = (tb.pu2.a) r9
            r9.e(r6)
            goto L_0x006f
        L_0x0052:
            java.lang.String r6 = d(r7, r8)
            tb.pu2$a r9 = (tb.pu2.a) r9
            r9.f(r6)
            goto L_0x006f
        L_0x005c:
            java.lang.String r6 = c(r7, r8)
            tb.pu2$a r9 = (tb.pu2.a) r9
            r9.f(r6)
            goto L_0x006f
        L_0x0066:
            java.lang.String r6 = f(r7, r8)
            tb.pu2$a r9 = (tb.pu2.a) r9
            r9.f(r6)
        L_0x006f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.ru2.e(java.lang.String, android.content.Context, com.alibaba.fastjson.JSONObject, tb.ukb):void");
    }
}

package com.taobao.desktop.channel.calendar.api;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.desktop.channel.calendar.CalendarInsertData;
import com.taobao.desktop.channel.calendar.api.WVCalendarPlugin;
import com.taobao.login4android.api.Login;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTHitBuilders$UTCustomHitBuilder;
import java.util.HashMap;
import java.util.Map;
import tb.ggh;
import tb.kpw;
import tb.lu2;
import tb.mn8;
import tb.nsw;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class WVCalendarPlugin extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String WV_CALENDAR_PLUGIN = "WVCalendarPlugin";

    static {
        t2o.a(435159056);
    }

    private String addCalendarEvent(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4c5b7af4", new Object[]{this, str});
        }
        JSONObject parseObject = JSON.parseObject(str);
        ggh.d("addCalendarEvent.json" + parseObject);
        CalendarInsertData calendarInsertData = new CalendarInsertData();
        calendarInsertData.setTitle(parseObject.getString("title"));
        calendarInsertData.setContent(parseObject.getString("content"));
        calendarInsertData.setReminderTime(parseObject.getLongValue("reminderTime") * 1000);
        calendarInsertData.setKeepTime(parseObject.getLongValue("keepTime") * 1000);
        calendarInsertData.setPreviousMinutes(parseObject.getLongValue("previousMinutes"));
        calendarInsertData.setRepeatEnd(parseObject.getLongValue("repeatEnd") * 1000);
        calendarInsertData.setFreq(parseObject.getString("repeatUnit"));
        calendarInsertData.setByDay(parseObject.getString("repeatWeekList"));
        calendarInsertData.setDeepLink(parseObject.getString("deepLink"));
        calendarInsertData.setTargetUrl(parseObject.getString("targetUrl"));
        calendarInsertData.setHuaweiLink(parseObject.getString("huaweiLink"));
        calendarInsertData.setHuaweiType(parseObject.getString("huaweiType"));
        calendarInsertData.setHuaweiDesc(parseObject.getString("huaweiDesc"));
        calendarInsertData.setHuaweiImportant(parseObject.getString("huaweiImportant"));
        calendarInsertData.setButtonText(parseObject.getString("buttonText"));
        String a2 = lu2.a(this.mContext, calendarInsertData);
        HashMap hashMap = new HashMap(8);
        hashMap.put("action", "addCalendarEvent");
        hashMap.put("title", calendarInsertData.getTitle());
        hashMap.put("content", calendarInsertData.getContent());
        hashMap.put("reminderTime", String.valueOf(calendarInsertData.getReminderTime()));
        hashMap.put("keepTime", String.valueOf(calendarInsertData.getKeepTime()));
        hashMap.put("previousMinutes", String.valueOf(calendarInsertData.getPreviousMinutes()));
        hashMap.put("failReason", a2);
        trackUT(hashMap);
        ggh.d("WVCalendarPlugin addCalendarEvent: " + a2);
        return a2;
    }

    private String deleteCalendarEvent(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("838ef6fe", new Object[]{this, str});
        }
        String string = JSON.parseObject(str).getString("title");
        String l = lu2.l(this.mContext, string);
        HashMap hashMap = new HashMap(4);
        hashMap.put("action", "deleteCalendarEvent");
        hashMap.put("title", string);
        hashMap.put("failReason", l);
        trackUT(hashMap);
        ggh.d("WVCalendarPlugin deleteCalendarEvent: " + l);
        return l;
    }

    public static /* synthetic */ Object ipc$super(WVCalendarPlugin wVCalendarPlugin, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/desktop/channel/calendar/api/WVCalendarPlugin");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$actionExecute$39(WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1a2ce4c", new Object[]{wVCallBackContext});
        } else {
            wVCallBackContext.success("");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$actionExecute$40(nsw nswVar, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15e25764", new Object[]{nswVar, wVCallBackContext});
            return;
        }
        nswVar.b("errorCode", "USER_NOT_GRANTED");
        wVCallBackContext.error(nswVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$execute$38(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddf45949", new Object[]{this, str, str2, wVCallBackContext});
        } else {
            actionExecute(str, str2, wVCallBackContext);
        }
    }

    private String queryCalendarEvent(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("192a259b", new Object[]{this, str});
        }
        JSONObject parseObject = JSON.parseObject(str);
        ggh.d("queryCalendarEvent.json" + parseObject);
        String p = lu2.p(this.mContext, parseObject.getString("title"));
        ggh.d("WVCalendarPlugin queryCalendarEvent: " + p);
        return p;
    }

    private void trackUT(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e17a0eb4", new Object[]{this, map});
            return;
        }
        try {
            String userId = Login.getUserId();
            if (TextUtils.isEmpty(userId)) {
                userId = "";
            }
            map.put("userId", userId);
            UTHitBuilders$UTCustomHitBuilder uTHitBuilders$UTCustomHitBuilder = new UTHitBuilders$UTCustomHitBuilder("calendar");
            uTHitBuilders$UTCustomHitBuilder.setEventPage("TBCalendarEventManager");
            uTHitBuilders$UTCustomHitBuilder.setProperties(map);
            UTAnalytics.getInstance().getDefaultTracker().send(uTHitBuilders$UTCustomHitBuilder.build());
            ggh.d("WVCalendarPlugin.trackMap: " + map.toString());
        } catch (Throwable th) {
            ggh.d("WVCalendarPlugin.error: " + th.getMessage());
        }
    }

    @Override // tb.kpw
    public boolean execute(final String str, final String str2, final WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        try {
            mn8.c().execute(new Runnable() { // from class: tb.rpw
                @Override // java.lang.Runnable
                public final void run() {
                    WVCalendarPlugin.this.lambda$execute$38(str, str2, wVCallBackContext);
                }
            });
            return true;
        } catch (Throwable th) {
            ggh.d("WVShortcutsPlugin.execute." + str + ".error: " + th.getMessage());
            wVCallBackContext.error();
            return false;
        }
    }

    private String updateCalendarEvent(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cda5f71c", new Object[]{this, str});
        }
        JSONObject parseObject = JSON.parseObject(str);
        String string = parseObject.getString("title");
        String string2 = parseObject.getString("content");
        long longValue = parseObject.getLongValue("reminderTime") * 1000;
        long longValue2 = parseObject.getLongValue("keepTime") * 1000;
        long longValue3 = parseObject.getLongValue("previousMinutes");
        long longValue4 = parseObject.getLongValue("repeatEnd") * 1000;
        String string3 = parseObject.getString("repeatUnit");
        if (string3 != null) {
            string3 = string3.toUpperCase();
        }
        String v = lu2.v(this.mContext, -1L, string, string2, longValue, longValue2, longValue3, string3, parseObject.getString("repeatWeekList"), longValue4);
        HashMap hashMap = new HashMap(8);
        hashMap.put("action", "updateCalendarEvent");
        hashMap.put("title", string);
        hashMap.put("content", string2);
        hashMap.put("reminderTime", String.valueOf(longValue));
        hashMap.put("keepTime", String.valueOf(longValue2));
        hashMap.put("previousMinutes", String.valueOf(longValue3));
        hashMap.put("failReason", v);
        trackUT(hashMap);
        ggh.d("WVCalendarPlugin updateCalendarEvent: " + v);
        return v;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0074, code lost:
        if (r11.equals(com.taobao.runtimepermission.api.TBRunTimePermission.REQUEST_PERMISSION_API_NAME) == false) goto L_0x003e;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void actionExecute(java.lang.String r11, java.lang.String r12, final android.taobao.windvane.jsbridge.WVCallBackContext r13) {
        /*
            Method dump skipped, instructions count: 460
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.desktop.channel.calendar.api.WVCalendarPlugin.actionExecute(java.lang.String, java.lang.String, android.taobao.windvane.jsbridge.WVCallBackContext):void");
    }
}

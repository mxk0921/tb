package com.taobao.calendar.sdk.alarm;

import android.content.Context;
import android.content.Intent;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class CalendarAlarm {
    public static int NOTIFY_ID = 1;
    public static String INTENT_PLAY = "com.taobao.calendar.sdk.alarm.headline.PLAY";
    public static String INTENT_STOP = "com.taobao.calendar.sdk.alarm.headline.STOP";
    public static String INTENT_KILL = "com.taobao.calendar.sdk.alarm.headline.KILL";
    public static String INTENT_RESET = "com.taobao.calendar.sdk.alarm.headline.RESET";
    public static String INTENT_SYN = "com.taobao.calendar.sdk.alarm.headline.SYN";
    public static String INTENT_TIMEOUT = "com.taobao.calendar.sdk.alarm.headline.TIMEOUT";
    public static String INTENT_ACCEPT = "com.taobao.calendar.sdk.alarm.headline.ACCEPT";
    public static int TIMEOUT = 20000;

    static {
        t2o.a(414187534);
    }

    public static void play(Context context) {
        context.sendBroadcast(new Intent(INTENT_PLAY));
    }

    public static void reset(Context context) {
        context.sendBroadcast(new Intent(INTENT_RESET));
    }

    public static void stop(Context context) {
        context.sendBroadcast(new Intent(INTENT_KILL));
    }

    public static void syn(Context context, String str) {
        Intent intent = new Intent(INTENT_SYN);
        intent.putExtra("userId", str);
        context.sendBroadcast(intent);
    }

    public static void timeout(Context context) {
        context.sendBroadcast(new Intent(INTENT_TIMEOUT));
    }
}

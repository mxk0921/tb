package com.xiaomi.push.service;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public abstract class bj {
    public static String A = "ext_security";
    public static String B = "ext_kick";
    public static String C = "ext_client_attr";
    public static String D = "ext_cloud_attr";
    public static String E = "ext_pkg_name";
    public static String F = "ext_notify_id";
    public static String G = "ext_clicked_button";
    public static String H = "ext_notify_type";
    public static String I = "ext_session";
    public static String J = "sig";
    public static String K = "ext_notify_title";
    public static String L = "ext_notify_description";
    public static String M = "ext_messenger";
    public static String N = "title";
    public static String O = "description";
    public static String P = "notifyId";
    public static String Q = "dump";

    /* renamed from: a  reason: collision with root package name */
    public static String f15074a = "1";
    public static String b = "2";
    public static String c = "3";
    public static String d = "com.xiaomi.push.OPEN_CHANNEL";
    public static String e = "com.xiaomi.push.SEND_MESSAGE";
    public static String f = "com.xiaomi.push.SEND_IQ";
    public static String g = "com.xiaomi.push.BATCH_SEND_MESSAGE";
    public static String h = "com.xiaomi.push.SEND_PRES";
    public static String i = "com.xiaomi.push.CLOSE_CHANNEL";
    public static String j = "com.xiaomi.push.FORCE_RECONN";
    public static String k = "com.xiaomi.push.RESET_CONN";
    public static String l = "com.xiaomi.push.UPDATE_CHANNEL_INFO";
    public static String m = "com.xiaomi.push.SEND_STATS";
    public static String n = "com.xiaomi.push.HANDLE_FCM_MSG";
    public static String o = "com.xiaomi.push.APP_NOTIFY_MSG";
    public static String p = "com.xiaomi.push.CHANGE_HOST";
    public static String q = "com.xiaomi.push.PING_TIMER";
    public static String r = "ext_user_id";
    public static String s = "ext_user_server";
    public static String t = "ext_user_res";
    public static String u = "ext_chid";
    public static String v = "ext_receive_time";
    public static String w = "ext_broadcast_time";
    public static String x = "ext_sid";
    public static String y = "ext_token";
    public static String z = "ext_auth_method";

    public static String a(int i2) {
        switch (i2) {
            case 0:
                return "ERROR_OK";
            case 1:
                return "ERROR_SERVICE_NOT_INSTALLED";
            case 2:
                return "ERROR_NETWORK_NOT_AVAILABLE";
            case 3:
                return "ERROR_NETWORK_FAILED";
            case 4:
                return "ERROR_ACCESS_DENIED";
            case 5:
                return "ERROR_AUTH_FAILED";
            case 6:
                return "ERROR_MULTI_LOGIN";
            case 7:
                return "ERROR_SERVER_ERROR";
            case 8:
                return "ERROR_RECEIVE_TIMEOUT";
            case 9:
                return "ERROR_READ_ERROR";
            case 10:
                return "ERROR_SEND_ERROR";
            case 11:
                return "ERROR_RESET";
            case 12:
                return "ERROR_NO_CLIENT";
            case 13:
                return "ERROR_SERVER_STREAM";
            case 14:
                return "ERROR_THREAD_BLOCK";
            case 15:
                return "ERROR_SERVICE_DESTROY";
            case 16:
                return "ERROR_SESSION_CHANGED";
            case 17:
                return "ERROR_READ_TIMEOUT";
            case 18:
                return "ERROR_CONNECTIING_TIMEOUT";
            case 19:
                return "ERROR_USER_BLOCKED";
            case 20:
                return "ERROR_REDIRECT";
            case 21:
                return "ERROR_BIND_TIMEOUT";
            case 22:
                return "ERROR_PING_TIMEOUT";
            default:
                return String.valueOf(i2);
        }
    }
}

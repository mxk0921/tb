package com.huawei.hms.framework.network.grs.g;

import android.text.TextUtils;
import anet.channel.util.HttpConstant;
import com.alipay.mobile.common.transport.utils.HeaderConstant;
import com.huawei.hms.framework.common.Logger;
import java.nio.ByteBuffer;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import tb.vyl;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class d {
    private static final String o = "d";

    /* renamed from: a  reason: collision with root package name */
    private Map<String, List<String>> f5347a;
    private byte[] b;
    private int c;
    private long d;
    private long e;
    private long f;
    private String g;
    private int h;
    private int i;
    private String j;
    private long k;
    private String l;
    private Exception m;
    private String n;

    public d(int i, Map<String, List<String>> map, byte[] bArr, long j) {
        this.h = 2;
        this.i = 9001;
        this.j = "";
        this.k = 0L;
        this.l = "";
        this.c = i;
        this.f5347a = map;
        this.b = ByteBuffer.wrap(bArr).array();
        this.d = j;
        s();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0041 A[Catch: JSONException -> 0x0033, TRY_LEAVE, TryCatch #0 {JSONException -> 0x0033, blocks: (B:13:0x0026, B:15:0x002c, B:20:0x0035, B:21:0x003b, B:23:0x0041), top: B:26:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void q() {
        /*
            r4 = this;
            boolean r0 = r4.o()
            if (r0 != 0) goto L_0x0013
            boolean r0 = r4.n()
            if (r0 != 0) goto L_0x0013
            boolean r0 = r4.m()
            if (r0 != 0) goto L_0x0013
            return
        L_0x0013:
            java.util.Map r0 = r4.r()
            int r1 = r0.size()
            if (r1 > 0) goto L_0x0026
            java.lang.String r0 = com.huawei.hms.framework.network.grs.g.d.o
            java.lang.String r1 = "parseHeader {headers.size() <= 0}"
            com.huawei.hms.framework.common.Logger.w(r0, r1)
            return
        L_0x0026:
            boolean r1 = r4.o()     // Catch: JSONException -> 0x0033
            if (r1 != 0) goto L_0x0035
            boolean r1 = r4.m()     // Catch: JSONException -> 0x0033
            if (r1 == 0) goto L_0x003b
            goto L_0x0035
        L_0x0033:
            r0 = move-exception
            goto L_0x0045
        L_0x0035:
            r4.b(r0)     // Catch: JSONException -> 0x0033
            r4.a(r0)     // Catch: JSONException -> 0x0033
        L_0x003b:
            boolean r1 = r4.n()     // Catch: JSONException -> 0x0033
            if (r1 == 0) goto L_0x005b
            r4.c(r0)     // Catch: JSONException -> 0x0033
            goto L_0x005b
        L_0x0045:
            java.lang.String r1 = com.huawei.hms.framework.network.grs.g.d.o
            java.lang.String r0 = r0.getMessage()
            java.lang.String r0 = com.huawei.hms.framework.common.StringUtils.anonymizeMessage(r0)
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r0
            java.lang.String r0 = "parseHeader catch JSONException: %s"
            com.huawei.hms.framework.common.Logger.w(r1, r0, r2)
        L_0x005b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.framework.network.grs.g.d.q():void");
    }

    private Map<String, String> r() {
        HashMap hashMap = new HashMap(16);
        Map<String, List<String>> map = this.f5347a;
        if (map == null || map.size() <= 0) {
            Logger.v(o, "parseRespHeaders {respHeaders == null} or {respHeaders.size() <= 0}");
            return hashMap;
        }
        for (Map.Entry<String, List<String>> entry : this.f5347a.entrySet()) {
            String key = entry.getKey();
            for (String str : entry.getValue()) {
                hashMap.put(key, str);
            }
        }
        return hashMap;
    }

    private void s() {
        q();
        p();
    }

    public String a() {
        return this.j;
    }

    public int b() {
        return this.c;
    }

    public int c() {
        return this.i;
    }

    public Exception d() {
        return this.m;
    }

    public String e() {
        return this.l;
    }

    public int f() {
        return this.h;
    }

    public long g() {
        return this.f;
    }

    public long h() {
        return this.e;
    }

    public long i() {
        return this.d;
    }

    public String j() {
        return this.g;
    }

    public long k() {
        return this.k;
    }

    public String l() {
        return this.n;
    }

    public boolean m() {
        if (this.c == 304) {
            return true;
        }
        return false;
    }

    public boolean n() {
        if (this.c == 503) {
            return true;
        }
        return false;
    }

    public boolean o() {
        if (this.c == 200) {
            return true;
        }
        return false;
    }

    public d(Exception exc, long j) {
        this.c = 0;
        this.h = 2;
        this.i = 9001;
        this.j = "";
        this.k = 0L;
        this.l = "";
        this.m = exc;
        this.d = j;
    }

    private void b(int i) {
        this.i = i;
    }

    private void c(int i) {
        this.h = i;
    }

    private void d(String str) {
    }

    private void e(String str) {
    }

    private void f(String str) {
        this.g = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0055, code lost:
        if (r9.getInt("resultCode") == 0) goto L_0x0057;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void p() {
        /*
            r10 = this;
            r0 = 0
            java.lang.String r1 = "errorList"
            java.lang.String r2 = "errorDesc"
            java.lang.String r3 = "errorCode"
            java.lang.String r4 = "resultCode"
            java.lang.String r5 = "isSuccess"
            boolean r6 = r10.m()
            r7 = 1
            if (r6 == 0) goto L_0x001e
            java.lang.String r0 = com.huawei.hms.framework.network.grs.g.d.o
            java.lang.String r1 = "GRSSDK get httpcode{304} not any changed."
            com.huawei.hms.framework.common.Logger.i(r0, r1)
            r10.c(r7)
            return
        L_0x001e:
            boolean r6 = r10.o()
            r8 = 2
            if (r6 != 0) goto L_0x0030
            java.lang.String r0 = com.huawei.hms.framework.network.grs.g.d.o
            java.lang.String r1 = "GRSSDK parse server body all failed."
            com.huawei.hms.framework.common.Logger.i(r0, r1)
            r10.c(r8)
            return
        L_0x0030:
            byte[] r6 = r10.b     // Catch: JSONException -> 0x0048
            java.lang.String r6 = com.huawei.hms.framework.common.StringUtils.byte2Str(r6)     // Catch: JSONException -> 0x0048
            org.json.JSONObject r9 = new org.json.JSONObject     // Catch: JSONException -> 0x0048
            r9.<init>(r6)     // Catch: JSONException -> 0x0048
            boolean r6 = r9.has(r5)     // Catch: JSONException -> 0x0048
            if (r6 == 0) goto L_0x004b
            int r4 = r9.getInt(r5)     // Catch: JSONException -> 0x0048
            if (r4 != r7) goto L_0x0059
            goto L_0x0057
        L_0x0048:
            r1 = move-exception
            goto L_0x00bd
        L_0x004b:
            boolean r5 = r9.has(r4)     // Catch: JSONException -> 0x0048
            if (r5 == 0) goto L_0x005b
            int r4 = r9.getInt(r4)     // Catch: JSONException -> 0x0048
            if (r4 != 0) goto L_0x0059
        L_0x0057:
            r4 = 1
            goto L_0x0064
        L_0x0059:
            r4 = 2
            goto L_0x0064
        L_0x005b:
            java.lang.String r4 = com.huawei.hms.framework.network.grs.g.d.o     // Catch: JSONException -> 0x0048
            java.lang.String r5 = "sth. wrong because server errorcode's key."
            com.huawei.hms.framework.common.Logger.e(r4, r5)     // Catch: JSONException -> 0x0048
            r4 = -1
        L_0x0064:
            java.lang.String r5 = "services"
            if (r4 == r7) goto L_0x0070
            boolean r6 = r9.has(r5)     // Catch: JSONException -> 0x0048
            if (r6 == 0) goto L_0x0070
            r4 = 0
        L_0x0070:
            r10.c(r4)     // Catch: JSONException -> 0x0048
            java.lang.String r6 = ""
            if (r4 == r7) goto L_0x0098
            if (r4 != 0) goto L_0x007a
            goto L_0x0098
        L_0x007a:
            boolean r1 = r9.has(r3)     // Catch: JSONException -> 0x0048
            if (r1 == 0) goto L_0x0085
            int r1 = r9.getInt(r3)     // Catch: JSONException -> 0x0048
            goto L_0x0087
        L_0x0085:
            r1 = 9001(0x2329, float:1.2613E-41)
        L_0x0087:
            r10.b(r1)     // Catch: JSONException -> 0x0048
            boolean r1 = r9.has(r2)     // Catch: JSONException -> 0x0048
            if (r1 == 0) goto L_0x0094
            java.lang.String r6 = r9.getString(r2)     // Catch: JSONException -> 0x0048
        L_0x0094:
            r10.d(r6)     // Catch: JSONException -> 0x0048
            goto L_0x00d3
        L_0x0098:
            boolean r2 = r9.has(r5)     // Catch: JSONException -> 0x0048
            if (r2 == 0) goto L_0x00a7
            org.json.JSONObject r2 = r9.getJSONObject(r5)     // Catch: JSONException -> 0x0048
            java.lang.String r2 = r2.toString()     // Catch: JSONException -> 0x0048
            goto L_0x00a8
        L_0x00a7:
            r2 = r6
        L_0x00a8:
            r10.f(r2)     // Catch: JSONException -> 0x0048
            boolean r2 = r9.has(r1)     // Catch: JSONException -> 0x0048
            if (r2 == 0) goto L_0x00b9
            org.json.JSONObject r1 = r9.getJSONObject(r1)     // Catch: JSONException -> 0x0048
            java.lang.String r6 = r1.toString()     // Catch: JSONException -> 0x0048
        L_0x00b9:
            r10.e(r6)     // Catch: JSONException -> 0x0048
            goto L_0x00d3
        L_0x00bd:
            java.lang.String r2 = com.huawei.hms.framework.network.grs.g.d.o
            java.lang.String r1 = r1.getMessage()
            java.lang.String r1 = com.huawei.hms.framework.common.StringUtils.anonymizeMessage(r1)
            java.lang.Object[] r3 = new java.lang.Object[r7]
            r3[r0] = r1
            java.lang.String r0 = "GrsResponse GrsResponse(String result) JSONException: %s"
            com.huawei.hms.framework.common.Logger.w(r2, r0, r3)
            r10.c(r8)
        L_0x00d3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.framework.network.grs.g.d.p():void");
    }

    public void a(int i) {
    }

    private void c(long j) {
        this.k = j;
    }

    public void a(long j) {
        this.f = j;
    }

    public void b(long j) {
        this.e = j;
    }

    private void c(String str) {
        this.j = str;
    }

    public void a(String str) {
        this.l = str;
    }

    public void b(String str) {
        this.n = str;
    }

    private void a(Map<String, String> map) {
        String str;
        String str2;
        if (map.containsKey(HeaderConstant.HEADER_KEY_ETAG)) {
            String str3 = map.get(HeaderConstant.HEADER_KEY_ETAG);
            if (!TextUtils.isEmpty(str3)) {
                Logger.i(o, "success get Etag from server");
                a(str3);
                return;
            }
            str = o;
            str2 = "The Response Heads Etag is Empty";
        } else {
            str = o;
            str2 = "Response Heads has not Etag";
        }
        Logger.i(str, str2);
    }

    private void b(Map<String, String> map) {
        long j;
        NumberFormatException e;
        if (map.containsKey(HttpConstant.CACHE_CONTROL)) {
            String str = map.get(HttpConstant.CACHE_CONTROL);
            if (!TextUtils.isEmpty(str) && str.contains("max-age=")) {
                try {
                    j = Long.parseLong(str.substring(str.indexOf("max-age=") + 8));
                    try {
                        Logger.v(o, "Cache-Control value{%s}", Long.valueOf(j));
                    } catch (NumberFormatException e2) {
                        e = e2;
                        Logger.w(o, "getExpireTime addHeadersToResult NumberFormatException", e);
                        if (j > 0) {
                        }
                        j = 86400;
                        long j2 = j * 1000;
                        Logger.i(o, "convert expireTime{%s}", Long.valueOf(j2));
                        c(String.valueOf(j2 + System.currentTimeMillis()));
                    }
                } catch (NumberFormatException e3) {
                    e = e3;
                    j = 0;
                }
            }
            j = 0;
        } else {
            if (map.containsKey("Expires")) {
                String str2 = map.get("Expires");
                Logger.v(o, "expires is{%s}", str2);
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss 'GMT'", Locale.ROOT);
                String str3 = map.containsKey("Date") ? map.get("Date") : null;
                try {
                    j = (simpleDateFormat.parse(str2).getTime() - (TextUtils.isEmpty(str3) ? new Date() : simpleDateFormat.parse(str3)).getTime()) / 1000;
                } catch (ParseException e4) {
                    Logger.w(o, "getExpireTime ParseException.", e4);
                }
            } else {
                Logger.i(o, "response headers neither contains Cache-Control nor Expires.");
            }
            j = 0;
        }
        if (j > 0 || j > vyl.MAX_COMMIT_TIME_INTERVAL) {
            j = 86400;
        }
        long j22 = j * 1000;
        Logger.i(o, "convert expireTime{%s}", Long.valueOf(j22));
        c(String.valueOf(j22 + System.currentTimeMillis()));
    }

    private void c(Map<String, String> map) {
        long j;
        if (map.containsKey("Retry-After")) {
            String str = map.get("Retry-After");
            if (!TextUtils.isEmpty(str)) {
                try {
                    j = Long.parseLong(str);
                } catch (NumberFormatException e) {
                    Logger.w(o, "getRetryAfter addHeadersToResult NumberFormatException", e);
                }
                long j2 = j * 1000;
                Logger.v(o, "convert retry-afterTime{%s}", Long.valueOf(j2));
                c(j2);
            }
        }
        j = 0;
        long j22 = j * 1000;
        Logger.v(o, "convert retry-afterTime{%s}", Long.valueOf(j22));
        c(j22);
    }
}

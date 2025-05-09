package tb;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.alibaba.motu.tbrest.rest.RestFieldsScheme;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class jao {

    /* renamed from: a  reason: collision with root package name */
    public static final long f21871a = System.currentTimeMillis();

    static {
        t2o.a(813695024);
    }

    public static String a(String str) {
        char[] charArray;
        if (asq.d(str)) {
            return "-";
        }
        if (str == null || "".equals(str)) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str.length());
        for (char c : str.toCharArray()) {
            if (!(c == '\n' || c == '\r' || c == '\t' || c == '|')) {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static String b(Map<String, String> map) {
        boolean z;
        RestFieldsScheme restFieldsScheme;
        StringBuffer stringBuffer = new StringBuffer();
        RestFieldsScheme[] values = RestFieldsScheme.values();
        int length = values.length;
        int i = 0;
        while (true) {
            String str = null;
            if (i >= length || (restFieldsScheme = values[i]) == RestFieldsScheme.ARGS) {
                break;
            }
            if (map.containsKey(restFieldsScheme.toString())) {
                str = asq.b(map.get(restFieldsScheme.toString()));
                map.remove(restFieldsScheme.toString());
            }
            stringBuffer.append(a(str));
            stringBuffer.append("||");
            i++;
        }
        RestFieldsScheme restFieldsScheme2 = RestFieldsScheme.ARGS;
        if (map.containsKey(restFieldsScheme2.toString())) {
            stringBuffer.append(a(asq.b(map.get(restFieldsScheme2.toString()))));
            map.remove(restFieldsScheme2.toString());
            z = false;
        } else {
            z = true;
        }
        for (String str2 : map.keySet()) {
            String b = map.containsKey(str2) ? asq.b(map.get(str2)) : null;
            if (z) {
                if ("StackTrace".equals(str2)) {
                    stringBuffer.append("StackTrace=====>");
                    stringBuffer.append(b);
                } else {
                    stringBuffer.append(a(str2));
                    stringBuffer.append("=");
                    stringBuffer.append(b);
                }
                z = false;
            } else if ("StackTrace".equals(str2)) {
                stringBuffer.append(",StackTrace=====>");
                stringBuffer.append(b);
            } else {
                stringBuffer.append(",");
                stringBuffer.append(a(str2));
                stringBuffer.append("=");
                stringBuffer.append(b);
            }
        }
        String stringBuffer2 = stringBuffer.toString();
        return (asq.e(stringBuffer2) || !stringBuffer2.endsWith("||")) ? stringBuffer2 : stringBuffer2.concat("-");
    }

    public static String c(String str, long j, String str2, int i, Object obj, Object obj2, Object obj3, Map<String, String> map) {
        if (i == 0) {
            return null;
        }
        try {
            String k = vj7.k(zap.b().f32654a);
            if (k == null) {
                lgh.b("get utdid failure, so build report failure, now return");
                return null;
            }
            String[] h = vj7.h(zap.b().f32654a);
            String str3 = h[0];
            String str4 = (h.length <= 1 || str3 == null || "Wi-Fi".equals(str3)) ? null : h[1];
            String str5 = "" + (j > 0 ? j : System.currentTimeMillis());
            String a2 = a(str2);
            String a3 = a(String.valueOf(i));
            String a4 = a(asq.b(obj));
            String a5 = a(asq.b(obj2));
            String a6 = a(asq.b(obj3));
            String a7 = a(asq.a(map));
            String a8 = a(vj7.d(zap.b().f32654a));
            String a9 = a(vj7.e(zap.b().f32654a));
            String a10 = a(Build.BRAND);
            a(vj7.c());
            a(a8);
            String a11 = a(Build.MODEL);
            String a12 = a(vj7.i(zap.b().f32654a));
            Context context = zap.b().f32654a;
            String a13 = a("unknown");
            String a14 = a(str3);
            String a15 = a(str4);
            String a16 = a(str);
            String a17 = a(zap.b().d);
            String a18 = a(zap.b().e);
            String a19 = a(zap.b().f);
            String a20 = a(zap.b().f);
            zap.b().getClass();
            String str6 = null;
            if (TextUtils.isEmpty(null)) {
                str6 = a(vj7.b());
            } else {
                zap.b().getClass();
            }
            String a21 = a(vj7.f());
            String str7 = zap.b().b;
            String str8 = "a";
            String a22 = a(Build.VERSION.RELEASE);
            long j2 = f21871a;
            String a23 = a(k);
            String a24 = a("_app_build_id=" + zap.b().g);
            String a25 = a("country=" + str6);
            String a26 = a("aliab=" + zap.b().h);
            String a27 = a("utabtestpage=" + zap.b().i);
            zap.b().getClass();
            String a28 = a("dosa_revision_ab=null");
            String a29 = a("languageInfo=" + zap.b().k);
            String str9 = zap.b().j;
            if (!TextUtils.isEmpty(str9)) {
                str9 = up1.g(str9.getBytes());
            }
            String a30 = a(a25 + "," + a24 + "," + a26 + "," + a27 + "," + a("utabtest=" + str9) + "," + a28 + "," + a29);
            asq.d("");
            if (str7 != null && str7.contains("aliyunos")) {
                str8 = "y";
            }
            HashMap hashMap = new HashMap();
            hashMap.put(RestFieldsScheme.IMEI.toString(), a8);
            hashMap.put(RestFieldsScheme.IMSI.toString(), a9);
            hashMap.put(RestFieldsScheme.BRAND.toString(), a10);
            hashMap.put(RestFieldsScheme.DEVICE_MODEL.toString(), a11);
            hashMap.put(RestFieldsScheme.RESOLUTION.toString(), a12);
            hashMap.put(RestFieldsScheme.CARRIER.toString(), a13);
            hashMap.put(RestFieldsScheme.ACCESS.toString(), a14);
            hashMap.put(RestFieldsScheme.ACCESS_SUBTYPE.toString(), a15);
            hashMap.put(RestFieldsScheme.CHANNEL.toString(), a18);
            hashMap.put(RestFieldsScheme.APPKEY.toString(), a16);
            hashMap.put(RestFieldsScheme.APPVERSION.toString(), a17);
            hashMap.put(RestFieldsScheme.LL_USERNICK.toString(), a19);
            hashMap.put(RestFieldsScheme.USERNICK.toString(), a20);
            hashMap.put(RestFieldsScheme.LL_USERID.toString(), "-");
            hashMap.put(RestFieldsScheme.USERID.toString(), "-");
            hashMap.put(RestFieldsScheme.LANGUAGE.toString(), a21);
            hashMap.put(RestFieldsScheme.OS.toString(), str8);
            hashMap.put(RestFieldsScheme.OSVERSION.toString(), a22);
            hashMap.put(RestFieldsScheme.SDKVERSION.toString(), "1.0");
            hashMap.put(RestFieldsScheme.START_SESSION_TIMESTAMP.toString(), "" + j2);
            hashMap.put(RestFieldsScheme.UTDID.toString(), a23);
            hashMap.put(RestFieldsScheme.SDKTYPE.toString(), zj4.SDK_TYPE);
            hashMap.put(RestFieldsScheme.RESERVE2.toString(), a23);
            hashMap.put(RestFieldsScheme.RESERVE3.toString(), "-");
            hashMap.put(RestFieldsScheme.RESERVE4.toString(), "-");
            hashMap.put(RestFieldsScheme.RESERVE5.toString(), "-");
            hashMap.put(RestFieldsScheme.RESERVES.toString(), a30);
            hashMap.put(RestFieldsScheme.RECORD_TIMESTAMP.toString(), str5);
            hashMap.put(RestFieldsScheme.PAGE.toString(), a2);
            hashMap.put(RestFieldsScheme.EVENTID.toString(), a3);
            hashMap.put(RestFieldsScheme.ARG1.toString(), a4);
            hashMap.put(RestFieldsScheme.ARG2.toString(), a5);
            hashMap.put(RestFieldsScheme.ARG3.toString(), a6);
            hashMap.put(RestFieldsScheme.ARGS.toString(), a7);
            return b(hashMap);
        } catch (Exception e) {
            lgh.c("UTRestAPI buildTracePostReqDataObj catch!", e);
            return "";
        }
    }
}

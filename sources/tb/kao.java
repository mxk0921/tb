package tb;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class kao {

    /* renamed from: a  reason: collision with root package name */
    public static final eao f22516a = new eao();

    static {
        t2o.a(813695025);
    }

    public static boolean b(String str) {
        if (wen.a() < dao.b().a(str)) {
            return true;
        }
        return false;
    }

    public static byte[] c(String str, Context context, Map<String, String> map) {
        try {
            return ne2.b(str, context, map);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void d() {
        f22516a.p();
    }

    public static boolean e(int i, String str, Context context, String str2, String str3) {
        byte[] bArr;
        try {
            lgh.d("RestAPI start send log!");
            if (asq.f(str3)) {
                lgh.d("RestAPI build data succ!");
                HashMap hashMap = new HashMap(1);
                hashMap.put(String.valueOf(i), str3);
                try {
                    bArr = c(str, context, hashMap);
                } catch (Exception e) {
                    lgh.b(e.toString());
                    bArr = null;
                }
                if (bArr == null) {
                    return false;
                }
                lgh.d("packRequest success!");
                return epv.b(str2, bArr).a();
            }
            lgh.d("UTRestAPI build data failure!");
            return false;
        } catch (Throwable th) {
            lgh.c("system error!", th);
            return false;
        }
    }

    public static boolean f(Context context, String str, long j, String str2, int i, Object obj, Object obj2, Object obj3, Map<String, String> map) {
        return g(zap.b().c, context, str, j, str2, i, obj, obj2, obj3, map);
    }

    public static boolean g(String str, Context context, String str2, long j, String str3, int i, Object obj, Object obj2, Object obj3, Map<String, String> map) {
        return a(str, context, str2, j, str3, i, obj, obj2, obj3, map, false);
    }

    public static boolean h(String str, Context context, String str2, long j, String str3, int i, Object obj, Object obj2, Object obj3, Map<String, String> map) {
        return a(str, context, str2, j, str3, i, obj, obj2, obj3, map, true);
    }

    public static boolean a(String str, Context context, String str2, long j, String str3, int i, Object obj, Object obj2, Object obj3, Map<String, String> map, boolean z) {
        try {
            lgh.d("RestAPI start send log by url!");
            String c = jao.c(str, j, str3, i, obj, obj2, obj3, map);
            if (asq.f(c)) {
                lgh.d("RestAPI build data succ by url!");
                if (i == 61006 || i == 1 || i == 61003 || iao.d().e()) {
                    try {
                        return e(i, str, context, str2, c);
                    } catch (Exception unused) {
                        return false;
                    }
                } else {
                    if (b(i + str3)) {
                        return f22516a.q(i, str, context, str2, c);
                    }
                }
            } else {
                lgh.d("UTRestAPI build data failure by url!");
            }
        } catch (Throwable th) {
            lgh.c("system error by url!", th);
        }
        return false;
    }
}

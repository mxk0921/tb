package tb;

import com.taobao.tao.log.TLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class lux {

    /* renamed from: a  reason: collision with root package name */
    public static lux f23584a;

    public static synchronized lux a() {
        lux luxVar;
        synchronized (lux.class) {
            try {
                if (f23584a == null) {
                    f23584a = new lux();
                }
                luxVar = f23584a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return luxVar;
    }

    public void b(String str, String str2) {
        TLog.loge("IIFAA_DID", str, str2);
    }

    public void c(String str, String str2) {
        TLog.logi("IIFAA_DID", str, str2);
    }

    public void d(String str, String str2) {
        TLog.logi("IIFAA_DID", str, str2);
    }
}

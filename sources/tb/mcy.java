package tb;

import android.os.HandlerThread;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class mcy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final HashMap<String, HandlerThread> f23955a = new HashMap<>();

    static {
        t2o.a(283115574);
    }

    public static HandlerThread a(String str) {
        HandlerThread handlerThread;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HandlerThread) ipChange.ipc$dispatch("ea867d0d", new Object[]{str});
        }
        HashMap<String, HandlerThread> hashMap = f23955a;
        synchronized (hashMap) {
            try {
                handlerThread = hashMap.get(str);
                if (handlerThread != null && handlerThread.getLooper() == null) {
                    hashMap.remove(str);
                    handlerThread = null;
                }
                if (handlerThread == null) {
                    handlerThread = new HandlerThread(str);
                    handlerThread.start();
                    hashMap.put(str, handlerThread);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return handlerThread;
    }

    public static Looper b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Looper) ipChange.ipc$dispatch("6a16767a", new Object[0]);
        }
        return a("tanx_exposer_sdk").getLooper();
    }
}

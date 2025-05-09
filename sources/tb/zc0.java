package tb;

import android.os.HandlerThread;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class zc0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final HashMap<String, HandlerThread> f32680a = new HashMap<>();

    static {
        t2o.a(1018167399);
    }

    public static HandlerThread a(String str) {
        HandlerThread handlerThread;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HandlerThread) ipChange.ipc$dispatch("e6f7462d", new Object[]{str});
        }
        HashMap<String, HandlerThread> hashMap = f32680a;
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
            return (Looper) ipChange.ipc$dispatch("92edbba3", new Object[0]);
        }
        return a("alimama_ads").getLooper();
    }
}

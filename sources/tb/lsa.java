package tb;

import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class lsa {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile lsa b;

    /* renamed from: a  reason: collision with root package name */
    public final Handler f23540a = new Handler(Looper.getMainLooper());

    public static lsa a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lsa) ipChange.ipc$dispatch("da3cb1e8", new Object[0]);
        }
        if (b == null) {
            synchronized (lsa.class) {
                try {
                    if (b == null) {
                        b = new lsa();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return b;
    }

    public void b(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec6b7f2d", new Object[]{this, runnable});
        } else {
            this.f23540a.post(runnable);
        }
    }
}

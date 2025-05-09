package tb;

import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class a2i extends Handler {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static volatile a2i f15507a;

    static {
        t2o.a(396361825);
    }

    public a2i() {
        super(Looper.getMainLooper());
    }

    public static a2i a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a2i) ipChange.ipc$dispatch("80dc28a9", new Object[0]);
        }
        if (f15507a == null) {
            synchronized (a2i.class) {
                try {
                    if (f15507a == null) {
                        f15507a = new a2i();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f15507a;
    }

    public static /* synthetic */ Object ipc$super(a2i a2iVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/artry/thread/MainThreadHandler");
    }

    public void b(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87b65512", new Object[]{this, runnable});
        } else if (runnable != null) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                runnable.run();
            } else {
                post(runnable);
            }
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[]{this});
        } else {
            f15507a.removeCallbacksAndMessages(null);
        }
    }
}

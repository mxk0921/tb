package tb;

import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class xzh extends Handler {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static volatile xzh f31737a;

    static {
        t2o.a(404750667);
    }

    public xzh() {
        super(Looper.getMainLooper());
    }

    public static xzh a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xzh) ipChange.ipc$dispatch("4fdf0e79", new Object[0]);
        }
        if (f31737a == null) {
            synchronized (xzh.class) {
                try {
                    if (f31737a == null) {
                        f31737a = new xzh();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f31737a;
    }

    public static /* synthetic */ Object ipc$super(xzh xzhVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/behavix/utils/MainHandler");
    }
}

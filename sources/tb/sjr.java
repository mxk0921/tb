package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class sjr extends hwy {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static sjr b;

    static {
        t2o.a(806355017);
    }

    public static sjr g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sjr) ipChange.ipc$dispatch("d9af64a6", new Object[0]);
        }
        if (b == null) {
            synchronized (sjr.class) {
                try {
                    if (b == null) {
                        b = new sjr();
                        hwy.c = qvs.m0();
                        o3s.b(hwy.TAG, "TBLiveEventCenter 初始化单例");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return b;
    }

    public static /* synthetic */ Object ipc$super(sjr sjrVar, String str, Object... objArr) {
        if (str.hashCode() == -1983604863) {
            super.f();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/alilive/aliliveframework/event/TBLiveEventCenter");
    }

    @Override // tb.hwy
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        super.f();
        b = null;
    }
}

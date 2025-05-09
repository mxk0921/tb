package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class wvh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static volatile wvh f30957a;

    static {
        t2o.a(982516188);
    }

    public static wvh a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wvh) ipChange.ipc$dispatch("9ebb3f7e", new Object[0]);
        }
        if (f30957a == null) {
            synchronized (wvh.class) {
                try {
                    if (f30957a == null) {
                        f30957a = new wvh();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f30957a;
    }

    public void b(String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93bf1913", new Object[]{this, str, th});
        }
    }
}

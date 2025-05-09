package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class rx5 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static tvb f27661a;

    static {
        t2o.a(444596496);
    }

    public static void a(Runnable runnable, long... jArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d296d9e0", new Object[]{runnable, jArr});
            return;
        }
        tvb tvbVar = f27661a;
        if (tvbVar != null) {
            tvbVar.a(runnable, jArr);
        } else {
            runnable.run();
        }
    }
}

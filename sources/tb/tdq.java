package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class tdq implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private hdq f28649a;
    private String b;

    static {
        t2o.a(676331634);
    }

    public tdq(hdq hdqVar, String str) {
        this.f28649a = hdqVar;
        this.b = str;
    }

    @Override // java.lang.Runnable
    @Deprecated
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
        }
    }
}

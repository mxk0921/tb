package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class vig {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f30032a;
    public boolean b;
    public boolean c;
    public boolean d;

    static {
        t2o.a(156237997);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c9697b3", new Object[]{this});
            return;
        }
        this.f30032a = 0;
        this.b = false;
        this.c = false;
        this.d = false;
    }
}

package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class mav {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f23898a;
    public final String b;

    static {
        t2o.a(83886290);
    }

    public mav(boolean z, String str) {
        this.f23898a = z;
        this.b = str;
    }

    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("91478625", new Object[]{this});
        }
        return this.b;
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("52e6cb43", new Object[]{this})).booleanValue();
        }
        return this.f23898a;
    }
}

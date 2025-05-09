package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class rvp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f27642a;
    public final boolean b;

    static {
        t2o.a(815793683);
    }

    public rvp(String str, boolean z) {
        ckf.g(str, "filterItemType");
        this.f27642a = str;
        this.b = z;
    }

    public final String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2a5ab85e", new Object[]{this});
        }
        return this.f27642a;
    }

    public final boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6d03969", new Object[]{this})).booleanValue();
        }
        return this.b;
    }
}

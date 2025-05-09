package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class g29 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f19699a;
    public final long b = bvt.d(ftt.Companion);

    static {
        t2o.a(1007681555);
    }

    public g29(String str, String str2) {
        ckf.g(str, "id");
        ckf.g(str2, "favCount");
        this.f19699a = str2;
    }

    public final String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d6a4810f", new Object[]{this});
        }
        return this.f19699a;
    }

    public final long b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("918b677f", new Object[]{this})).longValue();
        }
        return this.b;
    }
}

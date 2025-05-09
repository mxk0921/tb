package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class qo2 implements fjb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final po2 f26843a;

    static {
        t2o.a(729808962);
        t2o.a(729808960);
    }

    public qo2(ro2 ro2Var) {
        this.f26843a = new po2(ro2Var);
    }

    @Override // tb.fjb
    public String build() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c5d594b", new Object[]{this});
        }
        return this.f26843a.c();
    }

    @Override // tb.fjb
    public String getKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("16c52370", new Object[]{this});
        }
        return "bxFeature";
    }
}

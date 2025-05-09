package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.nn.NetConfig;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public abstract class yx<INPUT, OUTPUT> implements vio<INPUT, OUTPUT> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final NetConfig f32400a;

    static {
        t2o.a(481297276);
        t2o.a(481297310);
    }

    public yx(NetConfig netConfig) {
        this.f32400a = netConfig;
    }

    @Override // tb.vio
    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("24310680", new Object[]{this});
        }
        return "";
    }
}

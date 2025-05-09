package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.livehome.plugin.atype.flexalocal.TaoLiveNewHomePage;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class e6t implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ TaoLiveNewHomePage f18332a;

    public e6t(TaoLiveNewHomePage taoLiveNewHomePage) {
        this.f18332a = taoLiveNewHomePage;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
        } else if (TaoLiveNewHomePage.C(this.f18332a) != null && !TaoLiveNewHomePage.D(this.f18332a)) {
            TaoLiveNewHomePage.E(this.f18332a, true);
            TaoLiveNewHomePage.F(this.f18332a);
        }
    }
}

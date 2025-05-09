package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.livehome.plugin.atype.flexalocal.TaoLiveNewHomePage;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class g6t implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ TaoLiveNewHomePage f19760a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                TaoLiveNewHomePage.F(g6t.this.f19760a);
            }
        }
    }

    public g6t(TaoLiveNewHomePage taoLiveNewHomePage) {
        this.f19760a = taoLiveNewHomePage;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
        } else if (TaoLiveNewHomePage.C(this.f19760a) != null && !TaoLiveNewHomePage.D(this.f19760a)) {
            TaoLiveNewHomePage.E(this.f19760a, true);
            TaoLiveNewHomePage.C(this.f19760a).post(new a());
        }
    }
}

package tb;

import android.widget.LinearLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.widget.scrollerlayout.TTDetailScrollerLayout;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class nns implements vyb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ff7 f24852a;
    public final /* synthetic */ lns b;

    public nns(lns lnsVar, ff7 ff7Var) {
        this.b = lnsVar;
        this.f24852a = ff7Var;
    }

    @Override // tb.vyb
    public void a() {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4550b0a", new Object[]{this});
            return;
        }
        if (!lns.H(this.b)) {
            i = 8;
        }
        if (lns.F(this.b).getVisibility() != i && lns.J(this.b) > 0 && lns.J(this.b) > lns.L(this.b)) {
            lns.F(this.b).setVisibility(i);
            lns.G(this.b).setVisibility(i);
        }
    }

    @Override // tb.vyb
    public boolean b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4191a931", new Object[]{this, new Integer(i)})).booleanValue();
        }
        lns.K(this.b, i);
        return lns.M(this.b, i);
    }

    @Override // tb.vyb
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16da4c4a", new Object[]{this});
        } else if (lns.F(this.b).getVisibility() != 8) {
            lns.F(this.b).setVisibility(8);
            lns.G(this.b).setVisibility(8);
            TTDetailScrollerLayout.LayoutParams layoutParams = new TTDetailScrollerLayout.LayoutParams(-1, -1);
            lns lnsVar = this.b;
            layoutParams.f7033a = lnsVar;
            lnsVar.b = false;
            lns.E(lnsVar).setLayoutParams(layoutParams);
        }
    }

    @Override // tb.vyb
    public void d() {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bcdd303", new Object[]{this});
            return;
        }
        if (!lns.H(this.b)) {
            i = 8;
        }
        if (lns.F(this.b).getVisibility() != i) {
            lns.F(this.b).setVisibility(i);
            lns.G(this.b).setVisibility(i);
            TTDetailScrollerLayout.LayoutParams layoutParams = new TTDetailScrollerLayout.LayoutParams(-1, -1);
            lns lnsVar = this.b;
            layoutParams.f7033a = lnsVar;
            lnsVar.b = this.f24852a.f;
            lns.E(lnsVar).setLayoutParams(layoutParams);
        }
    }

    @Override // tb.vyb
    public void error() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1392128f", new Object[]{this});
            return;
        }
        lns.F(this.b).setVisibility(8);
        lns.G(this.b).setVisibility(8);
    }

    @Override // tb.vyb
    public void start() {
        int i;
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
            return;
        }
        LinearLayout F = lns.F(this.b);
        if (!lns.H(this.b)) {
            i = 8;
        } else {
            i = 0;
        }
        F.setVisibility(i);
        LinearLayout G = lns.G(this.b);
        if (!lns.H(this.b)) {
            i2 = 8;
        }
        G.setVisibility(i2);
    }
}

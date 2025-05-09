package tb;

import android.widget.LinearLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.behavior.UserBehaviorTracker;
import tb.lns;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class pns implements lns.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ff7 f26205a;
    public final /* synthetic */ vyb b;
    public final /* synthetic */ lns c;

    public pns(lns lnsVar, ff7 ff7Var, vyb vybVar) {
        this.c = lnsVar;
        this.f26205a = ff7Var;
        this.b = vybVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v21, types: [tb.ed7] */
    @Override // tb.lns.b
    public boolean a(int i) {
        od7 od7Var;
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3a1db8a9", new Object[]{this, new Integer(i)})).booleanValue();
        }
        l6s.a("TTDetailDescComponent", "降级到h5图文详情");
        lns.I(this.c, vbl.C());
        lns.E(this.c).setLayoutParams(lns.A(this.c, this.f26205a));
        if (lns.C(this.c)) {
            od7Var = new ed7(lns.y(this.c), this.f26205a);
        } else {
            od7Var = new od7(lns.y(this.c), this.f26205a);
        }
        od7Var.d(true);
        od7Var.e(this.b);
        lns.B(this.c, od7Var);
        lns.z(this.c).a();
        lns.D(this.c).removeAllViews();
        lns.D(this.c).addView(lns.z(this.c).getComponentView(null));
        lns.F(this.c).setVisibility(lns.H(this.c) ? 0 : 8);
        LinearLayout G = lns.G(this.c);
        if (!lns.H(this.c)) {
            i2 = 8;
        }
        G.setVisibility(i2);
        UserBehaviorTracker.m(lns.y(this.c), "detail_desc_component_type", "h5");
        return true;
    }
}

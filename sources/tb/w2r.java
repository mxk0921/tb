package tb;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.LinearLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.annotations.MemCheck;
import com.taobao.android.live.plugin.atype.flexalocal.tbliveinteractive.InteractiveComponent;
import com.taobao.android.live.plugin.proxy.tbliveinteractive.IInteractiveProxy;
import com.taobao.taobao.R;
import com.taobao.taolive.room.openarchitecture.entity.TaoliveOpenBizCodeEnum;
import com.taobao.taolive.room.openarchitecture.opencompontent.ability.OpenAbilityCompontentTypeEnum;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.tbliveinteractive.view.systemcomponent.IntimacyParams;

/* compiled from: Taobao */
@MemCheck(field = "mContext")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class w2r implements cqk, s3c, IInteractiveProxy.j {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "SystemComponent";
    public final VideoInfo b;
    public final String c;
    public final Context d;
    public final ux9 e;
    public final ukr f;
    public final sgf g;
    public final nc4 h;
    public View i;
    public LinearLayout j;
    public boolean k;
    public xjf l;
    public String o;
    public vfn p;
    public final khf q;
    public sxw r;
    public final String s;

    /* renamed from: a  reason: collision with root package name */
    public boolean f30422a = false;
    public ViewGroup m = null;
    public boolean n = false;

    static {
        t2o.a(295700005);
        t2o.a(806356561);
        t2o.a(806355016);
        t2o.a(806355281);
    }

    public w2r(String str, Context context, ux9 ux9Var, VideoInfo videoInfo, ukr ukrVar, sgf sgfVar, nc4 nc4Var, khf khfVar) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        this.s = "true";
        this.c = str;
        this.d = context;
        this.e = ux9Var;
        this.f = ukrVar;
        this.g = sgfVar;
        this.h = nc4Var;
        this.b = videoInfo;
        this.q = khfVar;
        if (videoInfo != null && (jSONObject = videoInfo.originalData) != null && (jSONObject2 = jSONObject.getJSONObject("intimacyData")) != null) {
            this.s = jSONObject2.getString("enableNewStyle");
        }
    }

    @Override // tb.cqk
    public void R1(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1f21fde", new Object[]{this, jSONObject});
        } else {
            b();
        }
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596df050", new Object[]{this, str});
            return;
        }
        sxw sxwVar = this.r;
        if (sxwVar != null) {
            sxwVar.d(str);
        }
    }

    @Override // tb.s3c
    public String bizCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("36951559", new Object[]{this});
        }
        return ukr.EVENTCENTER_BIZCODE;
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        sjr.g().b(this);
        nc4 nc4Var = this.h;
        if (nc4Var != null) {
            nc4Var.b(this);
        }
        xjf xjfVar = this.l;
        if (xjfVar != null) {
            xjfVar.e();
            this.l = null;
        }
        this.m = null;
        vfn vfnVar = this.p;
        if (vfnVar != null) {
            vfnVar.d();
            this.p = null;
        }
        View view = this.i;
        if (view instanceof ViewGroup) {
            ((ViewGroup) view).removeAllViews();
        }
        this.f30422a = true;
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        nc4 nc4Var = this.h;
        if (nc4Var != null) {
            nc4Var.e(this);
        }
        LinearLayout linearLayout = (LinearLayout) this.i.findViewById(R.id.taolive_room_interactive_system_component_root);
        this.j = linearLayout;
        linearLayout.setGravity(3);
        this.j.setPadding(hw0.b(this.d, 9.0f), 0, 0, 0);
        if (this.j.getLayoutTransition() != null) {
            this.j.getLayoutTransition().setAnimateParentHierarchy(false);
        }
        if (this.f.getActionAdapter().r() instanceof IntimacyParams) {
            IntimacyParams intimacyParams = (IntimacyParams) this.f.getActionAdapter().r();
            this.o = intimacyParams.accountId;
            this.n = intimacyParams.follow;
        }
        sjr.g().a(this);
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82e3ae40", new Object[]{this});
        } else {
            f(false);
        }
    }

    public final void f(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d992cc94", new Object[]{this, new Boolean(z)});
        } else if (!this.f30422a && this.i != null && this.l == null && !i()) {
            if (z) {
                if (!this.n) {
                    return;
                }
            } else if (!((IntimacyParams) this.f.getActionAdapter().r()).follow) {
                return;
            }
            if (!h2t.INSTANCE.k() || !"true".equals(this.s)) {
                xjf xjfVar = new xjf(this.c, this.d, this.f, this.g, this.q);
                this.l = xjfVar;
                this.m = xjfVar.i((ViewStub) this.i.findViewById(R.id.taolive_room_interactive_system_component_intimacy), this.m, this.k);
            }
        }
    }

    public void g() {
        View view;
        ViewStub viewStub;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("178a596c", new Object[]{this});
        } else if (!this.f30422a && (view = this.i) != null && this.b != null && (viewStub = (ViewStub) view.findViewById(R.id.taolive_room_interactive_system_component_rank_module)) != null) {
            vfn vfnVar = new vfn(this.c, this.d, this.e, this.b, this.f, this.g, this.q);
            this.p = vfnVar;
            vfnVar.i(viewStub, this.k);
            this.p.g();
        }
    }

    public void h() {
        View view;
        ViewStub viewStub;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dbc1895", new Object[]{this});
        } else if (!this.f30422a && (view = this.i) != null && this.b != null && (viewStub = (ViewStub) view.findViewById(R.id.taolive_room_interactive_system_component_watch_module)) != null) {
            sxw sxwVar = new sxw(this.c, this.d, this.e, this.b, this.f);
            this.r = sxwVar;
            sxwVar.c(viewStub, this.k);
            this.r.a();
        }
    }

    public final boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("982b80cc", new Object[]{this})).booleanValue();
        }
        VideoInfo videoInfo = this.b;
        if (videoInfo == null || !videoInfo.isOfficialLive()) {
            return false;
        }
        return true;
    }

    public void j(ViewGroup viewGroup, boolean z) {
        View view;
        ukr ukrVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f92a2ece", new Object[]{this, viewGroup, new Boolean(z)});
            return;
        }
        this.k = z;
        if (viewGroup != null) {
            ux9 ux9Var = this.e;
            if (ux9Var == null || ux9Var.A() == null || this.e.A().abilityCompontent == null || !((ibt) this.e.A().abilityCompontent).d(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_CustomizedTopLeftOrder)) {
                view = LayoutInflater.from(this.d).inflate(R.layout.taolive_room_interactive_system_component_parent_flexalocal, (ViewGroup) null);
            } else {
                view = LayoutInflater.from(this.d).inflate(R.layout.taolive_room_interactive_system_component_parent_guangguang_flexalocal, (ViewGroup) null);
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
            ux9 ux9Var2 = this.e;
            if (!(ux9Var2 == null || ux9Var2.A() == null || this.e.A().bizCode == null || !this.e.A().bizCode.equals(TaoliveOpenBizCodeEnum.TaoLiveOpenBizCode_ShopTab3.toString()) || (ukrVar = this.f) == null)) {
                marginLayoutParams.topMargin = ukrVar.d0();
            }
            view.setLayoutParams(marginLayoutParams);
            viewGroup.addView(view);
            this.i = viewGroup;
        }
    }

    public void k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4103026e", new Object[]{this, str});
            return;
        }
        xjf xjfVar = this.l;
        if (xjfVar != null) {
            xjfVar.n(str);
        }
    }

    public void l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e21fc9dd", new Object[]{this, str});
            return;
        }
        xjf xjfVar = this.l;
        if (xjfVar != null) {
            xjfVar.o(str);
        }
    }

    public void m(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc5f26fe", new Object[]{this, obj});
        }
    }

    public final boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("595bc429", new Object[]{this})).booleanValue();
        }
        ux9 ux9Var = this.e;
        if (ux9Var == null || ux9Var.A() == null || this.e.A().bizCode == null || !this.e.A().bizCode.equals(TaoliveOpenBizCodeEnum.TaoLiveOpenBizCode_ShopTab3.toString())) {
            return false;
        }
        return true;
    }

    @Override // tb.s3c
    public String[] observeEvents() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("37b2602b", new Object[]{this});
        }
        return new String[]{uyg.EVENT_FOLLOW_FROM_FOLLOWFRAME, uyg.EVENT_ACTION_FOLLOW, uyg.EVENT_GET_FOLLOW_STATUS, uyg.EVENT_ACTION_UNFOLLOW};
    }

    @Override // tb.s3c
    public String observeUniqueIdentification() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4914bdfe", new Object[]{this});
        }
        return this.c;
    }

    @Override // tb.b0d
    public void onError(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
        if (r8.equals(tb.uyg.EVENT_ACTION_UNFOLLOW) == false) goto L_0x0024;
     */
    @Override // tb.s3c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onEvent(java.lang.String r8, java.lang.Object r9) {
        /*
            r7 = this;
            r0 = 2
            r1 = 3
            r2 = 1
            r3 = 0
            com.android.alibaba.ip.runtime.IpChange r4 = tb.w2r.$ipChange
            boolean r5 = r4 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r5 == 0) goto L_0x0018
            java.lang.String r5 = "c3897928"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r7
            r1[r2] = r8
            r1[r0] = r9
            r4.ipc$dispatch(r5, r1)
            return
        L_0x0018:
            r8.hashCode()
            r4 = 0
            r5 = -1
            int r6 = r8.hashCode()
            switch(r6) {
                case -1815430857: goto L_0x0045;
                case -830550742: goto L_0x003a;
                case -596762262: goto L_0x0031;
                case -554098287: goto L_0x0026;
                default: goto L_0x0024;
            }
        L_0x0024:
            r0 = -1
            goto L_0x004f
        L_0x0026:
            java.lang.String r0 = "com.taobao.taolive.room.follow"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x002f
            goto L_0x0024
        L_0x002f:
            r0 = 3
            goto L_0x004f
        L_0x0031:
            java.lang.String r1 = "com.taobao.taolive.room.unfollow"
            boolean r8 = r8.equals(r1)
            if (r8 != 0) goto L_0x004f
            goto L_0x0024
        L_0x003a:
            java.lang.String r0 = "com.taobao.taolive.room.update_follow_status"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x0043
            goto L_0x0024
        L_0x0043:
            r0 = 1
            goto L_0x004f
        L_0x0045:
            java.lang.String r0 = "com.taobao.taolive.room.get_follow_status"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x004e
            goto L_0x0024
        L_0x004e:
            r0 = 0
        L_0x004f:
            switch(r0) {
                case 0: goto L_0x0081;
                case 1: goto L_0x006d;
                case 2: goto L_0x0053;
                case 3: goto L_0x006d;
                default: goto L_0x0052;
            }
        L_0x0052:
            goto L_0x009c
        L_0x0053:
            boolean r8 = r9 instanceof java.lang.String
            if (r8 == 0) goto L_0x009c
            java.lang.String r8 = r7.o
            java.lang.String r9 = (java.lang.String) r9
            boolean r8 = android.text.TextUtils.equals(r8, r9)
            if (r8 == 0) goto L_0x009c
            r7.n = r3
            tb.xjf r8 = r7.l
            if (r8 == 0) goto L_0x009c
            r8.e()
            r7.l = r4
            goto L_0x009c
        L_0x006d:
            boolean r8 = r9 instanceof java.lang.String
            if (r8 == 0) goto L_0x009c
            java.lang.String r8 = r7.o
            java.lang.String r9 = (java.lang.String) r9
            boolean r8 = android.text.TextUtils.equals(r8, r9)
            if (r8 == 0) goto L_0x009c
            r7.n = r2
            r7.f(r2)
            goto L_0x009c
        L_0x0081:
            boolean r8 = r9 instanceof java.lang.Boolean
            if (r8 == 0) goto L_0x009c
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r8 = r9.booleanValue()
            r7.n = r8
            if (r8 == 0) goto L_0x0093
            r7.f(r2)
            goto L_0x009c
        L_0x0093:
            tb.xjf r8 = r7.l
            if (r8 == 0) goto L_0x009c
            r8.e()
            r7.l = r4
        L_0x009c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.w2r.onEvent(java.lang.String, java.lang.Object):void");
    }

    @Override // tb.b0d
    public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
        } else {
            b();
        }
    }

    @Override // tb.b0d
    public void onSystemError(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
        }
    }

    public final void b() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84c992dc", new Object[]{this});
            return;
        }
        sgf sgfVar = this.g;
        if (sgfVar != null) {
            boolean z2 = false;
            boolean z3 = false;
            for (InteractiveComponent interactiveComponent : sgfVar.u()) {
                if (tws.c(interactiveComponent.fedName)) {
                    z2 = true;
                } else if (tws.Y().equals(interactiveComponent.fedName)) {
                    z3 = true;
                }
            }
            if (n() || !h2t.INSTANCE.k() || !"true".equals(this.s)) {
                z = z2;
            }
            if (!i() && z) {
                e();
            }
            if (z3) {
                g();
            }
            if (!i() && this.f.i0()) {
                h();
            }
        }
    }
}

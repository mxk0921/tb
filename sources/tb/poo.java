package tb;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.datamodel.imp.DMComponent;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;
import com.taobao.taolive.sdk.model.common.LiveItem;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.HashMap;
import tb.xvg;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class poo implements View.OnClickListener, s9z {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "SabAtmosphereTaskController";

    /* renamed from: a  reason: collision with root package name */
    public final Context f26212a;
    public final ux9 b;
    public final ViewGroup c;
    public final View d;
    public LiveItem e;
    public final TUrlImageView f;
    public final TextView g;
    public final TextView h;
    public boolean i;
    public int j;
    public final hoo k;
    public final xvg.a l;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements xvg.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.xvg.a
        public void a(xvg xvgVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c223d18e", new Object[]{this, xvgVar});
            } else {
                poo.c(poo.this);
            }
        }

        @Override // tb.xvg.a
        public void b(xvg xvgVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3f1b83e7", new Object[]{this, xvgVar});
            }
        }

        @Override // tb.xvg.a
        public void c(xvg xvgVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4c3c3fd3", new Object[]{this, xvgVar});
            }
        }

        @Override // tb.xvg.a
        public void d(xvg xvgVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6c294424", new Object[]{this, xvgVar});
            }
        }

        @Override // tb.xvg.a
        public void e(xvg xvgVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dfb09f52", new Object[]{this, xvgVar});
            }
        }
    }

    static {
        t2o.a(295699099);
        t2o.a(806355159);
    }

    public poo(Context context, ux9 ux9Var, ViewGroup viewGroup) {
        a aVar = new a();
        this.f26212a = context;
        this.b = ux9Var;
        this.c = viewGroup;
        View inflate = LayoutInflater.from(context).inflate(R.layout.taolive_sab_atmosphere_layout_flexalocal, viewGroup, false);
        this.d = inflate;
        this.f = (TUrlImageView) inflate.findViewById(R.id.main_title_img);
        this.g = (TextView) inflate.findViewById(R.id.main_title_txt);
        this.h = (TextView) inflate.findViewById(R.id.sub_title);
        if (viewGroup != null) {
            View findViewById = viewGroup.findViewById(R.id.taolive_bottom_bar);
            if (findViewById != null) {
                viewGroup.addView(inflate, viewGroup.indexOfChild(findViewById) - 1);
            } else {
                viewGroup.addView(inflate, 0);
            }
        }
        if (context != null && viewGroup != null) {
            hoo hooVar = new hoo(context, inflate, viewGroup, ux9Var);
            this.k = hooVar;
            hooVar.addAnimationListener(aVar);
        }
    }

    public static /* synthetic */ void c(poo pooVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbdfaaf", new Object[]{pooVar});
        } else {
            pooVar.n();
        }
    }

    public static /* synthetic */ void d(poo pooVar, LiveItem liveItem, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2956ff8b", new Object[]{pooVar, liveItem, new Boolean(z)});
        } else {
            pooVar.g(liveItem, z);
        }
    }

    public static /* synthetic */ Context e(poo pooVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("d3ca3ae5", new Object[]{pooVar});
        }
        return pooVar.f26212a;
    }

    public static boolean h(LiveItem liveItem) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d77241b4", new Object[]{liveItem})).booleanValue();
        }
        if (liveItem == null || (jSONObject = liveItem.liveItemStatusData) == null || !jSONObject.getBooleanValue("isHotItemPreheat")) {
            return false;
        }
        return true;
    }

    public static void q(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edb9138", new Object[]{new Long(j)});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("bizTopItemId", String.valueOf(j));
        hashMap.put(yj4.PARAM_CATEGORY_ID, "9999");
        sjr.g().c(uyg.EVENT_SHOW_GOODSPACKAGE, hashMap, null);
    }

    @Override // tb.s9z
    public void clear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
            return;
        }
        o3s.b(TAG, pg1.ATOM_EXT_clear);
        n();
        this.b.Q = false;
    }

    @Override // tb.s9z
    public void dismiss() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae28e211", new Object[]{this});
            return;
        }
        o3s.b(TAG, "dismiss");
        if (this.k != null) {
            ux9 ux9Var = this.b;
            if (!(ux9Var == null || ux9Var.d() == null)) {
                this.b.d().b(this.k);
            }
            this.k.w();
        }
    }

    public final void g(LiveItem liveItem, boolean z) {
        LiveItem.SabItemAtmosphere sabItemAtmosphere;
        LiveItem.Ext ext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("149e3b8f", new Object[]{this, liveItem, new Boolean(z)});
        } else if (liveItem != null) {
            if (h(liveItem)) {
                sabItemAtmosphere = liveItem.sabItemAtmospherePreHeat;
            } else {
                sabItemAtmosphere = liveItem.sabItemAtmosphere;
            }
            if (sabItemAtmosphere == null || (ext = liveItem.extendVal) == null) {
                o3s.b(TAG, "checkThreshold | atmosphere or extendVal is null");
                return;
            }
            String str = sabItemAtmosphere.clickAction;
            try {
                JSONObject d = fkx.d(ext.secKillInfo);
                JSONObject jSONObject = d != null ? d.getJSONObject("threshold") : null;
                if (nh4.o() && (jSONObject == null || jSONObject.getBoolean(yj4.PARAM_VRPASS) == null)) {
                    k(liveItem, str);
                } else if (jSONObject != null && jSONObject.getBooleanValue(yj4.PARAM_VRPASS)) {
                    o3s.b(TAG, "checkThreshold | threshold or threshold.pass is null");
                    k(liveItem, str);
                } else if (jSONObject == null || !z) {
                    ux9 ux9Var = this.b;
                    if (ux9Var != null && (ux9Var.k() instanceof xea) && !z) {
                        new qnf(new roo(this, liveItem)).K((xea) this.b.k(), liveItem);
                    }
                } else {
                    a1u.a(this.f26212a, jSONObject.getString("denyMsg"));
                }
            } catch (JSONException e) {
                o3s.b(TAG, e.getMessage());
            }
        }
    }

    @Override // tb.s9z
    public boolean isShowing() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d3c33646", new Object[]{this})).booleanValue();
        }
        hoo hooVar = this.k;
        if (hooVar != null) {
            return hooVar.o();
        }
        return false;
    }

    public final boolean j(LiveItem liveItem, boolean z) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6d6b4e84", new Object[]{this, liveItem, new Boolean(z)})).booleanValue();
        }
        if (!h(liveItem)) {
            ux9 ux9Var = this.b;
            if (ux9Var == null || !(ux9Var.k() instanceof xea) || (!TextUtils.equals(((xea) this.b.k()).O, bia.UNDER_TAKE_GOODS_LIST) && !TextUtils.equals(((xea) this.b.k()).O, bia.UNDER_TAKE_INSIDE_DETAIL))) {
                return f();
            }
            return false;
        } else if (!nh4.q0() || (jSONObject = liveItem.personalityData) == null || (jSONObject.getIntValue("hotItemPreheatSubscribeStatus") != 0 && !z)) {
            return false;
        } else {
            return true;
        }
    }

    public final void l(LiveItem liveItem) {
        ux9 ux9Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92e94d60", new Object[]{this, liveItem});
        } else if (liveItem != null && (ux9Var = this.b) != null && (ux9Var.k() instanceof xea)) {
            if (nh4.W() && h(liveItem)) {
                o6b.c((xea) this.b.k(), liveItem, "sabAtmosphere");
            } else if (nh4.r0() && i(liveItem)) {
                q(liveItem.itemId);
            } else if (d9m.n().getActionAdapter() != null) {
                d9m.n().getActionAdapter().q(this.b, this.f26212a, 10000, liveItem, new HashMap());
            }
            if (d9m.n().getTrackAdapter() != null) {
                d9m.n().getTrackAdapter().c("dynamicEffect", zha.e((xea) this.b.k(), liveItem));
            }
        }
    }

    public void m(LiveItem liveItem) {
        LiveItem.SabItemAtmosphere sabItemAtmosphere;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6899687d", new Object[]{this, liveItem});
        } else if (liveItem != null) {
            if (h(liveItem)) {
                sabItemAtmosphere = liveItem.sabItemAtmospherePreHeat;
            } else {
                sabItemAtmosphere = liveItem.sabItemAtmosphere;
            }
            if (sabItemAtmosphere != null) {
                o3s.b(TAG, "refresh");
                this.e = liveItem;
                p(liveItem);
                o();
                hoo hooVar = this.k;
                if (hooVar != null) {
                    hooVar.s(sabItemAtmosphere.posterMark);
                }
                this.f.setImageUrl(sabItemAtmosphere.benefitTitleImg);
                this.h.setText(sabItemAtmosphere.subBenefitTitle);
            }
        }
    }

    public final void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a1da73b", new Object[]{this});
            return;
        }
        ViewGroup viewGroup = this.c;
        if (viewGroup != null && this.g != null && this.h != null) {
            float width = viewGroup.getWidth() / 750.0f;
            this.j = (int) (450.0f * width);
            bhw.a(this.d, this.c.getWidth(), this.j);
            hoo hooVar = this.k;
            if (hooVar != null) {
                hooVar.u();
            }
            this.g.setTextSize(0, 46.0f * width);
            this.h.setTextSize(0, 26.0f * width);
            if (h(this.e)) {
                bhw.a(this.f, -2, (int) (64.0f * width));
            } else {
                bhw.a(this.f, -2, (int) (44.0f * width));
            }
            bhw.b(this.h, 0, (int) (width * 16.0f), 0, nw0.d(this.f26212a, 66.0f));
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        } else if (yga.G()) {
            g(this.e, false);
        } else {
            l(this.e);
        }
    }

    public final void p(LiveItem liveItem) {
        JSONObject jSONObject;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3590cfc", new Object[]{this, liveItem});
            return;
        }
        if (!h(liveItem) || (jSONObject = liveItem.personalityData) == null || jSONObject.getIntValue("hotItemPreheatSubscribeStatus") != 1) {
            z = false;
        }
        this.i = z;
    }

    public final void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
            return;
        }
        o3s.b(TAG, DMComponent.RESET);
        hoo hooVar = this.k;
        if (hooVar != null) {
            hooVar.t();
        }
        View view = this.d;
        if (view != null) {
            view.setVisibility(8);
        }
        this.e = null;
        this.i = false;
    }

    public static boolean i(LiveItem liveItem) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("700defcd", new Object[]{liveItem})).booleanValue();
        }
        return (liveItem == null || (jSONObject = liveItem.itemExtData) == null || !TextUtils.equals(jSONObject.getString("smallCardItemType"), "itemZone")) ? false : true;
    }

    @Override // tb.s9z
    public void b(LiveItem liveItem, boolean z) {
        LiveItem.SabItemAtmosphere sabItemAtmosphere;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bdd925a", new Object[]{this, liveItem, new Boolean(z)});
        } else if (liveItem != null && this.b != null) {
            if (h(liveItem)) {
                sabItemAtmosphere = liveItem.sabItemAtmospherePreHeat;
            } else {
                sabItemAtmosphere = liveItem.sabItemAtmosphere;
            }
            if (sabItemAtmosphere != null) {
                this.e = liveItem;
                if (this.b.w() != null) {
                    this.b.w().a("hasShowBigHotAtmosphere", "true");
                }
                if (!j(liveItem, z)) {
                    o3s.b(TAG, "tryShow | liveItem is invalid");
                    this.b.Q = true;
                    return;
                }
                this.e = liveItem;
                p(liveItem);
                o();
                hoo hooVar = this.k;
                if (hooVar != null) {
                    if (hooVar.o()) {
                        this.k.t();
                    }
                    this.k.p(sabItemAtmosphere);
                    ux9 ux9Var = this.b;
                    if (!(ux9Var == null || ux9Var.d() == null)) {
                        this.b.d().a(this.k);
                    }
                }
                if (!TextUtils.isEmpty(sabItemAtmosphere.benefitTitleImg)) {
                    this.f.setImageUrl(sabItemAtmosphere.benefitTitleImg);
                    this.f.setVisibility(0);
                    this.g.setVisibility(8);
                } else if (!TextUtils.isEmpty(sabItemAtmosphere.benefitTitle)) {
                    this.g.setText(sabItemAtmosphere.benefitTitle);
                    this.g.setVisibility(0);
                    this.f.setVisibility(8);
                }
                this.g.setText(sabItemAtmosphere.benefitTitle);
                this.h.setText(sabItemAtmosphere.subBenefitTitle);
                ViewProxy.setOnClickListener(this.d, this);
            }
        }
    }

    public final boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ba7acbf2", new Object[]{this})).booleanValue();
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - t6t.d("sab_atmosphere_limit_start_time") > nh4.e1() * 60 * 1000) {
            t6t.h("sab_atmosphere_limit_start_time", currentTimeMillis);
            t6t.g("sab_atmosphere_show_frequency", 1);
            return true;
        }
        int c = t6t.c("sab_atmosphere_show_frequency", 0);
        if (c >= nh4.f1()) {
            return false;
        }
        t6t.g("sab_atmosphere_show_frequency", c + 1);
        return true;
    }

    @Override // tb.s9z
    public void a(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc62f2ef", new Object[]{this, strArr});
        } else if (strArr.length == 3) {
            LiveItem liveItem = (LiveItem) fkx.f(strArr[0], LiveItem.class);
            String str = strArr[1];
            String str2 = strArr[2];
            if (liveItem != null) {
                if (isShowing() && !this.i) {
                    m(liveItem);
                } else if (TextUtils.equals(str, "SUCCESS") && TextUtils.equals(str2, "showcase")) {
                    b(liveItem, true);
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0058, code lost:
        if (r8.equals("subscribe") == false) goto L_0x0044;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(com.taobao.taolive.sdk.model.common.LiveItem r7, java.lang.String r8) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.poo.k(com.taobao.taolive.sdk.model.common.LiveItem, java.lang.String):void");
    }
}

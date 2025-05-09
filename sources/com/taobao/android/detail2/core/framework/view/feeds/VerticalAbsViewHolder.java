package com.taobao.android.detail2.core.framework.view.feeds;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.umbrella.link.export.TraceLogEventType;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.base.weex.DetailWeexContainer;
import com.taobao.android.detail2.core.framework.base.widget.RoundRectCardRoot;
import com.taobao.android.detail2.core.framework.data.global.a;
import com.taobao.android.trade.event.ThreadMode;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.component.TBErrorView;
import com.taobao.weex.common.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import tb.byj;
import tb.cjw;
import tb.cxj;
import tb.dh7;
import tb.ec7;
import tb.el8;
import tb.es6;
import tb.gl8;
import tb.j83;
import tb.kk8;
import tb.o2r;
import tb.o3w;
import tb.pqj;
import tb.pt1;
import tb.q0j;
import tb.r19;
import tb.rl8;
import tb.rra;
import tb.t2o;
import tb.txj;
import tb.ueo;
import tb.utv;
import tb.v22;
import tb.vgn;
import tb.x3w;
import tb.xid;
import tb.yj4;
import tb.ywj;
import tb.zgq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class VerticalAbsViewHolder<T extends x3w, E extends o3w> extends RecyclerView.ViewHolder implements rl8<E> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String APPEAR_SCENE_DISMISS = "dismiss";
    public static final String APPEAR_SCENE_FOREGROUND = "foreground";
    public static final String APPEAR_SCENE_REFRESH = "refresh";
    public static final String APPEAR_SCENE_SCROLL = "scroll";
    public static final String DISAPPEAR_SCENE_BACKGROUND = "background";
    public static final String DISAPPEAR_SCENE_DISMISS = "dismiss";
    public static final String DISAPPEAR_SCENE_REFRESH = "refresh";
    public static final String DISAPPEAR_SCENE_SCROLL = "scroll";
    public static final String KEY_CARD_EXTRA_DATA = "cardExtraData";
    public static final String KEY_CURRENT_SHOW_INDEX = "currentShowIndex";
    public static final String KEY_INDEX = "index";
    public static final String KEY_IS_HALF_SCREEN = "isHalfScreen";
    public static final String KEY_IS_NON_FULL_SCREEN = "isNonFullScreen";
    public static final String KEY_POSITION = "position";
    public static final String KEY_PRE_IS_HALF_SCREEN = "preIsHalfScreen";
    public static final String KEY_PRE_IS_NON_FULL_SCREEN = "preIsNonFullScreen";
    public static final String KEY_SCROLL_ENABLE = "scrollEnable";
    public static final String KEY_TYPE = "type";
    public static final String TAG_VIEW_HOLDER = "tag_view_holder";
    public static final String VALUE_SCROLL_ENABLE_FROM_MAIN_PAGE = "MainPageFloatAppear";
    public T c;
    public final cxj d;
    public final dh7 e;
    public final j83 f;
    public final cjw g;
    public final String i;
    public boolean j;
    public TBErrorView k;

    /* renamed from: a  reason: collision with root package name */
    public boolean f7157a = false;
    public boolean b = false;
    public final List<String> h = new ArrayList();
    public final List<DetailWeexContainer> l = new ArrayList();
    public boolean n = false;
    public final RoundRectCardRoot m = (RoundRectCardRoot) this.itemView.findViewById(R.id.half_screen_round_root);

    static {
        t2o.a(352321966);
        t2o.a(723517460);
    }

    public VerticalAbsViewHolder(ViewGroup viewGroup, dh7 dh7Var, cxj cxjVar) {
        super((ViewGroup) viewGroup.getParent());
        this.d = cxjVar;
        this.e = dh7Var;
        String uuid = UUID.randomUUID().toString();
        this.i = uuid;
        this.f = new j83(dh7Var, cxjVar, this);
        this.g = new cjw(dh7Var, cxjVar);
        el8.b(cxjVar.h(), cxjVar.j().B(), kk8.a(o3w.class, uuid), this);
        this.itemView.setTag(327533409, this);
    }

    public static /* synthetic */ Object ipc$super(VerticalAbsViewHolder verticalAbsViewHolder, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail2/core/framework/view/feeds/VerticalAbsViewHolder");
    }

    public String A0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("642e40c7", new Object[]{this});
        }
        return this.i;
    }

    public utv B0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (utv) ipChange.ipc$dispatch("5269a198", new Object[]{this});
        }
        return this.e.a0();
    }

    public final void B1(pt1.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bf4ae6d", new Object[]{this, aVar});
        } else if (this.c != null) {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            T t = this.c;
            JSONObject jSONObject3 = t.p;
            if (jSONObject3 != null) {
                jSONObject2.putAll(jSONObject3);
                Activity i = this.d.i();
                txj.d(i, txj.TAG_RENDER, "weex数据流 info put recommend , itemid: " + this.c.h + ", cardindex: " + this.c.f31127a);
            } else {
                JSONObject jSONObject4 = t.s;
                if (jSONObject4 != null) {
                    jSONObject2.putAll(jSONObject4);
                    Activity i2 = this.d.i();
                    txj.d(i2, txj.TAG_RENDER, "weex数据流 info put openImmediately, itemid: " + this.c.h + ", cardindex: " + this.c.f31127a);
                }
            }
            jSONObject2.put("navStart", (Object) Long.valueOf(this.d.j().F()));
            jSONObject2.put("isImmersive", (Object) Boolean.TRUE);
            JSONObject jSONObject5 = new JSONObject();
            jSONObject5.put("cardnum", (Object) String.valueOf(this.c.f31127a));
            jSONObject2.put(KEY_CARD_EXTRA_DATA, (Object) jSONObject5);
            JSONObject K0 = K0();
            if (K0 != null) {
                jSONObject2.putAll(K0);
            }
            jSONObject.put("detailDataRefresh", (Object) jSONObject2);
            aVar.a(jSONObject);
            Activity i3 = this.d.i();
            txj.d(i3, txj.TAG_RENDER, "weex数据流 getdetaildata给回调啦, itemid: " + this.c.h + ", cardindex: " + this.c.f31127a);
        }
    }

    public List<DetailWeexContainer> C0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("71466bc9", new Object[]{this});
        }
        return this.l;
    }

    public void C1(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89bcf6e2", new Object[]{this, str, jSONObject});
            return;
        }
        Iterator it = ((ArrayList) this.l).iterator();
        while (it.hasNext()) {
            DetailWeexContainer detailWeexContainer = (DetailWeexContainer) it.next();
            if (detailWeexContainer != null) {
                detailWeexContainer.W(str, jSONObject);
            }
        }
    }

    public void E1(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5256e4b", new Object[]{this, str, jSONObject});
            return;
        }
        for (DetailWeexContainer detailWeexContainer : this.l) {
            detailWeexContainer.W(str, jSONObject);
        }
    }

    public final void F0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c30e3d4", new Object[]{this});
            return;
        }
        txj.d(this.d.i(), txj.TAG_UT, "handleAppearWhenNotPreload执行");
        HashMap<String, String> v1 = v1();
        utv a0 = this.e.a0();
        T t = this.c;
        a0.g(t.b, v1, t);
        HashMap<String, String> u1 = u1();
        utv a02 = this.e.a0();
        T t2 = this.c;
        a02.f(t2.b, "NewDetail", "", "", u1, t2);
        D1(true, null, "");
        cxj cxjVar = this.d;
        if (cxjVar != null && cxjVar.j().N().z0()) {
            j0(this.c);
        }
    }

    public final void F1(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89696f9e", new Object[]{this, new Boolean(z)});
            return;
        }
        Iterator it = ((ArrayList) this.l).iterator();
        while (it.hasNext()) {
            DetailWeexContainer detailWeexContainer = (DetailWeexContainer) it.next();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("show", (Object) Boolean.valueOf(z));
            T t = this.c;
            if (t != null) {
                jSONObject.put("index", (Object) String.valueOf(t.f31127a));
                jSONObject.put("position", (Object) String.valueOf(this.e.V(w0())));
            }
            jSONObject.put("scene", (Object) "scroll");
            detailWeexContainer.W("willExposureStatus", jSONObject);
        }
    }

    public final void G0(String str, boolean z) {
        HashMap hashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bf1b838", new Object[]{this, str, new Boolean(z)});
            return;
        }
        HashMap<String, String> D = t0().D();
        if (D == null || D.isEmpty()) {
            hashMap = null;
        } else {
            hashMap = new HashMap(D);
        }
        T t = this.c;
        if (t.z && a.NO_ID_DEFAULT.equals(t.h)) {
            if (hashMap == null) {
                hashMap = new HashMap();
            }
            hashMap.put("nd_card_type", "error");
            hashMap.put("nd_card_subtype", "miss");
            this.e.a0().l(this.c.b, hashMap);
        } else if (hashMap != null) {
            this.e.a0().l(this.c.b, hashMap);
        }
        if (z) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("entrySpm", (Object) this.d.j().w());
            jSONObject.put("entryScm", (Object) this.d.j().v());
            jSONObject.put(yj4.PARAM_ENTRY_UT_PARAM, (Object) this.d.j().r());
            this.e.a0().m(this.c.b, jSONObject);
        }
        this.e.a0().i(this.c.b);
        D1(false, null, str);
    }

    public void G1(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68a163f9", new Object[]{this, new Integer(i)});
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.m.getLayoutParams();
        marginLayoutParams.bottomMargin = i;
        this.m.setLayoutParams(marginLayoutParams);
    }

    public void H1(boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ec71830", new Object[]{this, new Boolean(z), str});
            return;
        }
        this.j = z;
        txj.e(txj.TAG_RENDER, "setNeedpreventBack from: " + str);
    }

    public final void I0(pt1.a aVar, String str, boolean z, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb6e10df", new Object[]{this, aVar, str, new Boolean(z), jSONObject});
        } else if (aVar != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(pt1.CALLBACK_EVENT_KEY, (Object) str);
            jSONObject2.put(pt1.CALLBACK_IS_SUCCESS, (Object) Boolean.valueOf(z));
            jSONObject2.put(str, (Object) jSONObject);
            aVar.a(jSONObject2);
        }
    }

    public void I1(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9b97c19", new Object[]{this, new Integer(i)});
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.itemView.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, i);
        } else {
            layoutParams.height = i;
        }
        this.itemView.setLayoutParams(layoutParams);
    }

    public abstract Map<String, String> J0();

    public void J1(float[] fArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39839146", new Object[]{this, fArr});
            return;
        }
        this.m.setCornerRadius(fArr);
        this.m.invalidate();
    }

    public abstract JSONObject K0();

    public final void L0(JSONObject jSONObject) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("272884cd", new Object[]{this, jSONObject});
            return;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("logData");
        if (jSONObject2 != null) {
            String string = jSONObject2.getString("codeMsg");
            String string2 = jSONObject2.getString("event");
            JSONObject jSONObject3 = jSONObject2.getJSONObject("ext");
            if (jSONObject3 != null) {
                str = jSONObject3.toJSONString();
            } else {
                str = "";
            }
            q0j.v("NewDetail_Front", string2, string, TraceLogEventType.COMMON, str);
        }
    }

    public void L1(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da8d2e2b", new Object[]{this, new Integer(i), obj});
        } else {
            this.itemView.setTag(i, obj);
        }
    }

    public final void M0(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f63cbc77", new Object[]{this, jSONObject});
            return;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("monitorData");
        if (jSONObject2 != null) {
            String string = jSONObject2.getString("monitorType");
            String string2 = jSONObject2.getString("scene");
            String string3 = jSONObject2.getString("errorCode");
            String string4 = jSONObject2.getString("errorMsg");
            if ("dataParser".equals(string)) {
                q0j.r(this.c, string2, string3, string4);
            } else if ("componentRender".equals(string)) {
                q0j.o(this.c, string2, string3, string4);
            }
        }
    }

    public void M1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
        } else {
            onStart();
        }
    }

    public final void N0(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("592ed95b", new Object[]{this, jSONObject});
        } else if (this.c == null) {
            txj.e(txj.TAG_RENDER, "currentNode为空，不上报切换埋点");
        } else {
            JSONObject jSONObject2 = jSONObject.getJSONObject("tempArgs");
            if (jSONObject2 == null) {
                txj.e(txj.TAG_RENDER, "tempArgs为空，不上报切换埋点");
                return;
            }
            String string = this.c.M().getString("nid");
            if (!TextUtils.isEmpty(string)) {
                ((ArrayList) this.c.D).add(string);
            }
            this.c.x0(jSONObject2);
            this.e.a0().i(this.c.b);
            HashMap<String, String> v1 = v1();
            utv a0 = this.e.a0();
            T t = this.c;
            a0.g(t.b, v1, t);
            HashMap<String, String> u1 = u1();
            utv a02 = this.e.a0();
            T t2 = this.c;
            a02.f(t2.b, "NewDetail", "", "", u1, t2);
            txj.e(txj.TAG_RENDER, "handlePageTrace, index: " + this.c.f31127a + ", nid: " + this.c.h + ", tempArgs: " + jSONObject2.toJSONString() + ", cardType: " + this.c.b);
        }
    }

    public void N1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[]{this});
        } else {
            onStop();
        }
    }

    public final void O0(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c8df212", new Object[]{this, jSONObject});
        } else if (jSONObject != null) {
            H1("true".equals(jSONObject.getString("prevent")), "event");
        }
    }

    public void O1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6b976f5", new Object[]{this});
            return;
        }
        Iterator it = ((ArrayList) this.l).iterator();
        while (it.hasNext()) {
            DetailWeexContainer detailWeexContainer = (DetailWeexContainer) it.next();
            if (detailWeexContainer != null) {
                txj.e(txj.TAG_RENDER, getAdapterPosition() + "triggerRender，生命周期，nid=" + w0());
                detailWeexContainer.e0();
            }
        }
    }

    public final void P0(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6e6a7a9", new Object[]{this, jSONObject});
            return;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("quickTraceData");
        if (jSONObject2 != null) {
            String string = jSONObject2.getString("quickTraceType");
            if ("error".equals(string)) {
                q0j.d(this.c, jSONObject2.getString("errorCode"), jSONObject2.getString("errorMsg"), Boolean.getBoolean(jSONObject2.getString("needSecondaryData")));
            } else if (es6.DP_BIZ_CONTEXT.equals(string)) {
                q0j.b(this.c, jSONObject2.getString("bizContextKey"), jSONObject2.getString("bizContextValue"));
            }
        }
    }

    public void P1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c314ed0e", new Object[]{this});
            return;
        }
        if (!this.d.r() || !x0().g0() || !this.e.r0()) {
            F1(true);
        }
        onWillAppear();
    }

    public final void Q0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("486676c1", new Object[]{this});
        } else {
            this.d.h().finishNewDetailContainer();
        }
    }

    public void Q1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d244c18", new Object[]{this});
            return;
        }
        if (!this.d.r() || !x0().g0() || !this.e.r0()) {
            F1(false);
        }
        p1();
    }

    @Override // tb.rl8
    public ThreadMode R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThreadMode) ipChange.ipc$dispatch("6de50c9b", new Object[]{this});
        }
        return ThreadMode.MainThread;
    }

    public final void R0(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58c0989e", new Object[]{this, jSONObject});
            return;
        }
        Iterator it = ((ArrayList) this.l).iterator();
        while (it.hasNext()) {
            DetailWeexContainer detailWeexContainer = (DetailWeexContainer) it.next();
            if (detailWeexContainer != null) {
                detailWeexContainer.W(o3w.OPERATE_SHOW_WEEX_POP, jSONObject);
            }
        }
    }

    public final void S0(JSONObject jSONObject, pt1.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf77f069", new Object[]{this, jSONObject, aVar});
        } else if (jSONObject == null) {
            T0(aVar, "updateDetailResult", false, vgn.RATE_LIST_CODE, "originalNid为空");
        } else {
            String string = jSONObject.getString("originalNid");
            String string2 = jSONObject.getString("targetNid");
            JSONObject jSONObject2 = jSONObject.getJSONObject("queryParams");
            if (TextUtils.isEmpty(string)) {
                T0(aVar, "updateDetailResult", false, vgn.RATE_LIST_CODE, "originalNid为空");
            } else if (TextUtils.isEmpty(string2)) {
                T0(aVar, "updateDetailResult", false, q0j.ERROR_CODE_WEEX_RENDER_EXCEPTION, "targetNid为空");
            } else {
                if (string.equals(string2)) {
                    x1(jSONObject2);
                } else {
                    y1(string2, jSONObject2);
                }
                T0(aVar, "updateDetailResult", true, "", "");
            }
        }
    }

    public final void T0(pt1.a aVar, String str, boolean z, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36fd8deb", new Object[]{this, aVar, str, new Boolean(z), str2, str3});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        if (!z) {
            jSONObject.put("errorCode", (Object) str2);
            jSONObject.put("errorMsg", (Object) str3);
        }
        I0(aVar, str, z, jSONObject);
    }

    public final void U0(pt1 pt1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("166bfd6f", new Object[]{this, pt1Var});
        } else if (pt1Var.d != null && this.e != null) {
            JSONObject i0 = this.d.j().i0();
            dh7 dh7Var = this.e;
            JSONArray d0 = dh7Var.d0(pt1Var.d, dh7Var.V(w0()));
            if (d0 != null) {
                JSONObject f0 = f0(pt1Var.d, i0, d0);
                pt1.a aVar = pt1Var.b;
                if (aVar != null && f0 != null) {
                    aVar.a(f0);
                }
            }
        }
    }

    public final void V0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("777c17a4", new Object[]{this});
        } else if (this.k == null) {
            TBErrorView r0 = r0();
            this.k = r0;
            if (r0 != null) {
                this.m.addView(r0);
            }
        }
    }

    public boolean W0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ec6a7c6a", new Object[]{this})).booleanValue();
        }
        return this.f7157a;
    }

    public boolean X0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7943cbf3", new Object[]{this})).booleanValue();
        }
        View view = this.itemView;
        if (view == null) {
            return false;
        }
        return view.isAttachedToWindow();
    }

    public void Y0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fd8ef62", new Object[]{this, new Integer(i)});
            return;
        }
        for (DetailWeexContainer detailWeexContainer : this.l) {
            View F = detailWeexContainer.F();
            if (F != null) {
                F.setTranslationY(i);
                txj.e(txj.TAG_HALF_SCREEN, "设置卡片" + this.c.f31127a + "的topmargin: " + i);
            }
        }
    }

    public void a1(double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("169a8114", new Object[]{this, new Double(d)});
            return;
        }
        Iterator it = ((ArrayList) this.l).iterator();
        while (it.hasNext()) {
            View F = ((DetailWeexContainer) it.next()).F();
            if (F != null) {
                F.setTranslationY(-((int) (g0() * d)));
            }
        }
    }

    public void b0(DetailWeexContainer detailWeexContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8edc0b27", new Object[]{this, detailWeexContainer});
        } else if (detailWeexContainer != null) {
            this.l.add(detailWeexContainer);
            detailWeexContainer.q(this.f);
        }
    }

    public boolean b1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fe1a6391", new Object[]{this})).booleanValue();
        }
        dh7 dh7Var = this.e;
        if (dh7Var != null) {
            return dh7Var.r0();
        }
        return false;
    }

    public boolean c1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("92aad074", new Object[]{this})).booleanValue();
        }
        return this.j;
    }

    public void d0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69e52c56", new Object[]{this});
        } else {
            l1();
        }
    }

    public abstract void d1(String str);

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        txj.e(txj.TAG_RENDER, "VerticalAbsViewHolder destroy" + getAdapterPosition() + "，nid=" + w0());
        this.f.p();
        onDestroy();
    }

    public abstract boolean e1(T t);

    public final JSONObject f0(JSONObject jSONObject, JSONObject jSONObject2, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("954c4633", new Object[]{this, jSONObject, jSONObject2, jSONArray});
        }
        if (jSONObject == null) {
            return null;
        }
        jSONObject.put("weexPassList", (Object) jSONArray);
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
        }
        jSONObject.put("weexPassGlobalParams", (Object) jSONObject2);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("recommendWeexPassParams", (Object) jSONObject);
        return jSONObject3;
    }

    public abstract int g0();

    public String getType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("13e5e549", new Object[]{this});
        }
        T t = this.c;
        if (t == null) {
            return "";
        }
        return t.b;
    }

    public final void h0(boolean z, String str, String str2, pt1.a aVar) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("466cc14b", new Object[]{this, new Boolean(z), str, str2, aVar});
        } else if (aVar != null) {
            JSONObject jSONObject = new JSONObject();
            if (z) {
                str3 = "success";
            } else {
                str3 = "fail";
            }
            jSONObject.put("status", (Object) str3);
            jSONObject.put("errorCode", (Object) str);
            jSONObject.put("errorMsg", (Object) str2);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("dismissCardStatus", (Object) jSONObject);
            aVar.a(jSONObject2);
        }
    }

    public void h1() {
        com.taobao.android.detail2.core.framework.base.weex.a D;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94b1e2f8", new Object[]{this});
            return;
        }
        Iterator it = ((ArrayList) this.l).iterator();
        while (it.hasNext()) {
            DetailWeexContainer detailWeexContainer = (DetailWeexContainer) it.next();
            if (detailWeexContainer.D() != null && (D = detailWeexContainer.D()) != null && D.y() != null && !D.C()) {
                D.Q(true);
                if (x0().v()) {
                    xid renderComponent = D.y().getRenderComponent();
                    if (renderComponent != null) {
                        renderComponent.D();
                        ((MUSDKInstance) D.y()).refreshPixelCheckTime();
                    } else {
                        return;
                    }
                }
            } else {
                return;
            }
        }
    }

    public final void i0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3d006cd", new Object[]{this, new Integer(i)});
            return;
        }
        TBErrorView tBErrorView = this.k;
        if (tBErrorView != null) {
            tBErrorView.setVisibility(i);
        }
    }

    public void i1() {
        com.taobao.android.detail2.core.framework.base.weex.a D;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("950d7935", new Object[]{this});
            return;
        }
        Iterator it = ((ArrayList) this.l).iterator();
        while (it.hasNext()) {
            DetailWeexContainer detailWeexContainer = (DetailWeexContainer) it.next();
            if (detailWeexContainer.D() != null && (D = detailWeexContainer.D()) != null && D.y() != null && D.C()) {
                D.Q(false);
                if (x0().v()) {
                    xid renderComponent = D.y().getRenderComponent();
                    if (renderComponent != null) {
                        renderComponent.i();
                        if (!x0().z()) {
                            renderComponent.x();
                        } else {
                            renderComponent.d();
                        }
                    } else {
                        return;
                    }
                }
            } else {
                return;
            }
        }
    }

    public final void j0(x3w x3wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5407c808", new Object[]{this, x3wVar});
        } else if (this.d != null && x3wVar != null) {
            if (ywj.a(x3wVar.B(), pqj.KEY_FEATURE_DISABLE_SCREEN_RECORD)) {
                pqj.f(this.d.i());
            } else {
                pqj.g(this.d.i());
            }
        }
    }

    public abstract void j1(String str);

    public abstract gl8 k1(E e);

    public final void l0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b472f05", new Object[]{this});
        } else if (this.e != null) {
            zgq n = this.d.n();
            Iterator it = ((ArrayList) this.c.x).iterator();
            while (it.hasNext()) {
                x3w.a aVar = (x3w.a) it.next();
                if (aVar != null) {
                    if (aVar.c) {
                        n.c(aVar.f31128a, aVar.b);
                    } else {
                        n.b(aVar.f31128a, aVar.b);
                    }
                }
            }
            ((ArrayList) this.c.x).clear();
            for (Map.Entry<String, String> entry : this.c.y.entrySet()) {
                if (entry != null) {
                    n.a(entry.getKey(), entry.getValue());
                }
            }
            this.c.y.clear();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("simpleData", (Object) "true");
            JSONObject jSONObject2 = this.c.p;
            if (jSONObject2 == null) {
                jSONObject.put("response", (Object) "simpleInfo is null");
            } else {
                jSONObject.put("response", (Object) jSONObject2);
            }
            n.i(jSONObject);
            n.d();
        }
    }

    public abstract void l1();

    public final void m0(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c362d2ff", new Object[]{this, jSONObject});
        } else if (jSONObject != null && this.e != null) {
            String string = jSONObject.getString(KEY_SCROLL_ENABLE);
            if (!TextUtils.isEmpty(string) && this.e.P0("true".equals(string)) && !r19.D0()) {
                txj.e(txj.TAG_SET_SCROLL_ENABLE, txj.g("", jSONObject, this.e));
            }
        }
    }

    public abstract void m1(String str);

    public void n0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8cd9d214", new Object[]{this, str});
        } else {
            o0(str, false);
        }
    }

    public abstract void n1();

    public abstract void o1();

    public abstract void onDestroy();

    public abstract void onStart();

    public abstract void onStop();

    public abstract void onWillAppear();

    public void p0(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bf47762", new Object[]{this, str, new Boolean(z)});
        } else {
            m1(str);
        }
    }

    public abstract void p1();

    public final JSONObject q0(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("ab023433", new Object[]{this, map});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.putAll(map);
        T t = this.c;
        if (t != null) {
            jSONObject.put("cardUTArgs", (Object) t.w());
        }
        return jSONObject;
    }

    public void q1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7caa014", new Object[]{this});
            return;
        }
        Iterator it = ((ArrayList) this.l).iterator();
        while (it.hasNext()) {
            DetailWeexContainer detailWeexContainer = (DetailWeexContainer) it.next();
            if (detailWeexContainer != null) {
                detailWeexContainer.K();
            }
        }
    }

    public TBErrorView r0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBErrorView) ipChange.ipc$dispatch("f5501a78", new Object[]{this});
        }
        return null;
    }

    public final JSONObject s0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("19fac3a", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("halfScreenCount", (Object) String.valueOf(this.d.j().z()));
        jSONObject2.put("screenHeight", (Object) String.valueOf(ec7.d(this.d.i(), this.d.j().K().c())));
        jSONObject2.put(x3w.KEY_NEW_DETAIL_VISIBLE_BLOCK_WIDTH, (Object) String.valueOf(ec7.d(this.d.i(), this.d.j().K().b())));
        jSONObject2.put("halfScreenHeight", (Object) String.valueOf(ec7.d(this.d.i(), rra.c(this.d))));
        jSONObject2.put("hasPageSwitch", (Object) String.valueOf(this.d.j().j0()));
        jSONObject.put("args", (Object) jSONObject2);
        jSONObject.put("type", (Object) "append");
        return jSONObject;
    }

    public final void s1(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff8faa16", new Object[]{this, jSONObject});
        } else {
            C1("mainPicDXAction", jSONObject);
        }
    }

    public x3w t0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x3w) ipChange.ipc$dispatch("d6bb73e7", new Object[]{this});
        }
        return this.c;
    }

    public int u0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cf396596", new Object[]{this})).intValue();
        }
        T t = this.c;
        if (t == null) {
            return -1;
        }
        return t.f31127a;
    }

    public HashMap<String, String> u1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("e68fed76", new Object[]{this});
        }
        return null;
    }

    public cxj v0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cxj) ipChange.ipc$dispatch("e58a946c", new Object[]{this});
        }
        return this.d;
    }

    public HashMap<String, String> v1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("c31bb07e", new Object[]{this});
        }
        return null;
    }

    public String w0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2a97e606", new Object[]{this});
        }
        T t = this.c;
        if (t == null) {
            return "";
        }
        return t.h;
    }

    public final byj x0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byj) ipChange.ipc$dispatch("75ad75a4", new Object[]{this});
        }
        return this.d.j().N();
    }

    public void x1(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2611b97d", new Object[]{this, jSONObject});
            return;
        }
        dh7 dh7Var = this.e;
        if (dh7Var != null && dh7Var.Q() != null) {
            ((ArrayList) this.h).add(w0());
            this.e.Q().c(this, jSONObject);
        }
    }

    public Object y0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("e9f51780", new Object[]{this, new Integer(i)});
        }
        return this.itemView.getTag(i);
    }

    public void y1(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("519ac7b3", new Object[]{this, str, jSONObject});
            return;
        }
        dh7 dh7Var = this.e;
        if (dh7Var != null && dh7Var.Q() != null) {
            ((ArrayList) this.h).add(str);
            this.e.Q().b(this, jSONObject, str);
        }
    }

    public Rect z0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("471be896", new Object[]{this});
        }
        Rect rect = new Rect();
        this.itemView.getGlobalVisibleRect(rect);
        return rect;
    }

    public void z1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78796933", new Object[]{this});
        } else {
            Y0(0);
        }
    }

    public void A1(int i, String str, boolean z) {
        String str2;
        boolean z2 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("337f612d", new Object[]{this, new Integer(i), str, new Boolean(z)});
        } else if (((ArrayList) this.l).size() != 0) {
            boolean K0 = this.d.j().K0(i, str);
            j83 j83Var = this.f;
            if (j83Var != null) {
                z2 = j83Var.s();
            }
            txj.e(txj.TAG_RENDER, getAdapterPosition() + "sendCardAppearStatus,appear 生命周期,isCardAppear:" + z);
            Iterator it = ((ArrayList) this.l).iterator();
            while (it.hasNext()) {
                DetailWeexContainer detailWeexContainer = (DetailWeexContainer) it.next();
                JSONObject jSONObject = new JSONObject();
                if (z) {
                    str2 = "appear";
                } else {
                    str2 = "disappear";
                }
                jSONObject.put("type", (Object) str2);
                jSONObject.put(KEY_IS_HALF_SCREEN, (Object) String.valueOf(K0));
                jSONObject.put(KEY_PRE_IS_HALF_SCREEN, (Object) String.valueOf(z2));
                jSONObject.put(KEY_IS_NON_FULL_SCREEN, (Object) String.valueOf(K0));
                jSONObject.put(KEY_PRE_IS_NON_FULL_SCREEN, (Object) String.valueOf(z2));
                detailWeexContainer.W("appearStatus", jSONObject);
            }
        }
    }

    public void f1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10e5f3a", new Object[]{this});
            return;
        }
        txj.e(txj.TAG_RENDER, "卡片显示，生命周期，nid=" + w0() + ",mIsCardDisplay:" + this.b + "，position:" + getAdapterPosition());
        if (!this.b) {
            A1(u0(), getType(), true);
            this.b = true;
        }
    }

    public void g1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85965fdd", new Object[]{this});
            return;
        }
        txj.e(txj.TAG_RENDER, "卡片结束显示，生命周期，nid=" + w0() + ",mIsCardDisplay:" + this.b + "，position:" + getAdapterPosition());
        if (this.b) {
            A1(u0(), getType(), false);
            this.b = false;
        }
    }

    public void r1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1549fe6", new Object[]{this});
            return;
        }
        H1(false, "preventBackExecute");
        Iterator it = ((ArrayList) this.l).iterator();
        while (it.hasNext()) {
            ((DetailWeexContainer) it.next()).W("onUserBack", new JSONObject());
        }
    }

    public final gl8 E0(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gl8) ipChange.ipc$dispatch("90acf54a", new Object[]{this, jSONObject});
        }
        if (jSONObject == null) {
            return gl8.FAILURE;
        }
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("cusNaviSource");
            if (jSONArray == null) {
                return gl8.FAILURE;
            }
            for (int i = 0; i < jSONArray.size(); i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                if (jSONObject2 != null) {
                    ueo ueoVar = new ueo();
                    ueoVar.f(jSONObject2.getString("ndType"));
                    ueoVar.d(jSONObject2.getString("iconFontName"));
                    ueoVar.e(jSONObject2.getString("title"));
                    arrayList.add(ueoVar);
                }
            }
            T t = this.c;
            if (t != null) {
                t.V = arrayList;
                dh7 dh7Var = this.e;
                if (dh7Var != null) {
                    dh7Var.W0();
                }
            }
            return gl8.SUCCESS;
        } catch (Exception e) {
            txj.f("new_detail异常", "addNaviItem参数解析异常", e);
            return gl8.FAILURE;
        }
    }

    public void c0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6567a66", new Object[]{this, str});
        } else if (this.c != null) {
            Activity i = this.d.i();
            txj.d(i, txj.TAG_RENDER, "VerticalAbsViewHolder appear" + getAdapterPosition() + "，nid=" + w0());
            if (!this.d.r() || !x0().g0() || !this.e.r0()) {
                T t = this.c;
                if (!t.F) {
                    Activity i2 = this.d.i();
                    txj.d(i2, txj.TAG_UT, getAdapterPosition() + "appear执行，命中!isPreload");
                    this.c.G = false;
                    F0();
                } else if (t.I) {
                    Activity i3 = this.d.i();
                    txj.d(i3, txj.TAG_UT, getAdapterPosition() + "appear执行，命中mIsPreloadNeedUT");
                    T t2 = this.c;
                    t2.G = false;
                    t2.H = true;
                    F0();
                } else {
                    Activity i4 = this.d.i();
                    txj.d(i4, txj.TAG_UT, getAdapterPosition() + "appear执行，命中isPreload");
                    this.c.G = true;
                }
                this.f7157a = true;
            }
            d1(str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void e0(T r9) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.detail2.core.framework.view.feeds.VerticalAbsViewHolder.e0(tb.x3w):void");
    }

    public final boolean k0(x3w x3wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b020e956", new Object[]{this, x3wVar})).booleanValue();
        }
        if (!x3wVar.z) {
            i0(8);
        } else if (x3wVar.f31127a == 0 && !this.n) {
            V0();
            i0(0);
            q0j.g("eventProcess", q0j.UMBRELLA_TAG_ERROR_PAGE, null);
            q0j.f(x3wVar, "recommend", q0j.ERROR_CODE_RECOMMEND_FIRST_CARD_ERROR_SHOW, "NewDetail进入错误重试页面：" + this.d.j().u() + ", 当前id：" + x3wVar.h, true);
        } else if (this.f7157a) {
            txj.e("new_detail异常", "数据获取出错");
        }
        return x3wVar.z;
    }

    public void o0(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e612340", new Object[]{this, str, new Boolean(z)});
        } else if (this.c != null) {
            Activity i = this.d.i();
            txj.d(i, txj.TAG_RENDER, "VerticalAbsViewHolder disappear" + getAdapterPosition() + "，nid=" + w0());
            H1(false, "disappear");
            j1(str);
            T t = this.c;
            if ((!t.F || t.I) && (!this.d.r() || !x0().g0() || !this.e.r0())) {
                G0(str, z);
            }
            this.f7157a = false;
            this.b = false;
            if (this.c != null && (!this.d.r() || !x0().g0() || !this.e.r0())) {
                T t2 = this.c;
                ((ArrayList) t2.D).add(t2.M().getString("nid"));
                if (this.c.N()) {
                    this.c.A = true;
                }
            }
            if (this.c != null && (!this.d.r() || !x0().g0() || !this.e.r0())) {
                this.c.p();
                this.c.o();
            }
            l0();
        }
    }

    public final void t1(JSONObject jSONObject, pt1.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21d382d9", new Object[]{this, jSONObject, aVar});
        } else if (jSONObject != null && this.c != null) {
            if (!TextUtils.equals(jSONObject.getString("nid"), this.c.h)) {
                h0(false, "20803", "nid unmatch", aVar);
            } else if (this.e.K() == null || this.e.K().size() <= 1) {
                h0(false, "20804", "only one card", aVar);
            } else {
                if (u0() == 0) {
                    Intent intent = new Intent();
                    intent.putExtra("passParam", this.d.j().R().w);
                    Activity i = this.d.i();
                    if (i != null) {
                        i.setResult(-1, intent);
                    }
                }
                this.e.x(this.c.h);
                h0(true, "", "", aVar);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003f, code lost:
        if (r3.equals("monitor") == false) goto L_0x002a;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void D0(com.alibaba.fastjson.JSONObject r7) {
        /*
            r6 = this;
            r0 = 1
            r1 = 0
            r2 = 2
            com.android.alibaba.ip.runtime.IpChange r3 = com.taobao.android.detail2.core.framework.view.feeds.VerticalAbsViewHolder.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x0015
            java.lang.String r4 = "6af64262"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r6
            r2[r0] = r7
            r3.ipc$dispatch(r4, r2)
            return
        L_0x0015:
            if (r7 != 0) goto L_0x0018
            return
        L_0x0018:
            java.lang.String r3 = "type"
            java.lang.String r3 = r7.getString(r3)
            r3.hashCode()
            r4 = -1
            int r5 = r3.hashCode()
            switch(r5) {
                case 107332: goto L_0x0042;
                case 1236319578: goto L_0x0038;
                case 1669433176: goto L_0x002c;
                default: goto L_0x002a;
            }
        L_0x002a:
            r0 = -1
            goto L_0x004d
        L_0x002c:
            java.lang.String r0 = "quickTrace"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x0036
            goto L_0x002a
        L_0x0036:
            r0 = 2
            goto L_0x004d
        L_0x0038:
            java.lang.String r1 = "monitor"
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L_0x004d
            goto L_0x002a
        L_0x0042:
            java.lang.String r0 = "log"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x004c
            goto L_0x002a
        L_0x004c:
            r0 = 0
        L_0x004d:
            switch(r0) {
                case 0: goto L_0x0059;
                case 1: goto L_0x0055;
                case 2: goto L_0x0051;
                default: goto L_0x0050;
            }
        L_0x0050:
            goto L_0x005c
        L_0x0051:
            r6.P0(r7)
            goto L_0x005c
        L_0x0055:
            r6.M0(r7)
            goto L_0x005c
        L_0x0059:
            r6.L0(r7)
        L_0x005c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.detail2.core.framework.view.feeds.VerticalAbsViewHolder.D0(com.alibaba.fastjson.JSONObject):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x010f, code lost:
        if (r3.equals(tb.o3w.OPERATE_UPDATE_DATA) == false) goto L_0x007c;
     */
    /* renamed from: H0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public tb.gl8 h(E r7) {
        /*
            Method dump skipped, instructions count: 488
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.detail2.core.framework.view.feeds.VerticalAbsViewHolder.h(tb.o3w):tb.gl8");
    }

    public void D1(boolean z, pt1.a aVar, String str) {
        String str2 = str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96800b3a", new Object[]{this, new Boolean(z), aVar, str2});
            return;
        }
        o2r.a("sendExposureStatusWithUT");
        Map<String, String> J0 = J0();
        if (this.e != null) {
            J0 = v22.e(this.d.h(), this.d.j(), J0, this.c);
        }
        if (aVar != null) {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("show", (Object) String.valueOf(this.f7157a));
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put(Constants.Name.CONTENT_OFFSET, (Object) String.valueOf(ec7.a(this.d.i(), this.e.M().D())));
            jSONObject2.put("gestureInfo", (Object) jSONObject3);
            if (z) {
                jSONObject.put("detailUTParams", (Object) q0(J0));
                jSONObject.put("interactiveUTParams", (Object) s0());
            } else {
                jSONObject.put("scene", (Object) str);
            }
            jSONObject.put("exposureStatus", (Object) jSONObject2);
            jSONObject.put("weexPassGlobalParams", (Object) this.d.j().i0());
            aVar.a(jSONObject);
        } else if (((ArrayList) this.l).size() == 0) {
            o2r.b();
            return;
        } else {
            Iterator it = ((ArrayList) this.l).iterator();
            while (it.hasNext()) {
                DetailWeexContainer detailWeexContainer = (DetailWeexContainer) it.next();
                if (z) {
                    JSONObject q0 = q0(J0);
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put("detailUTParams", (Object) q0);
                    jSONObject4.put("interactiveUTParams", (Object) s0());
                    detailWeexContainer.U(jSONObject4);
                }
                JSONObject jSONObject5 = new JSONObject();
                jSONObject5.put("show", (Object) String.valueOf(z));
                if (!z) {
                    jSONObject5.put("scene", (Object) str2);
                }
                jSONObject5.put("index", (Object) String.valueOf(u0()));
                jSONObject5.put("position", (Object) String.valueOf(this.e.V(w0())));
                jSONObject5.put(KEY_CURRENT_SHOW_INDEX, (Object) String.valueOf(this.e.C()));
                JSONObject jSONObject6 = new JSONObject();
                jSONObject6.put(Constants.Name.CONTENT_OFFSET, (Object) String.valueOf(ec7.a(this.d.i(), this.e.M().D())));
                jSONObject5.put("gestureInfo", (Object) jSONObject6);
                detailWeexContainer.W("exposureStatus", jSONObject5);
                detailWeexContainer.W("weexPassGlobalParams", this.d.j().i0());
                it = it;
                str2 = str;
            }
        }
        o2r.b();
    }
}

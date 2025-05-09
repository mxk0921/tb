package tb;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.alibaba.android.ultron.vfw.weex2.UltronWeex2DialogFragment;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.async.AsyncProcessor;
import com.taobao.android.detail.ttdetail.component.module.DataEntry;
import com.taobao.android.detail.ttdetail.data.meta.Item;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import com.taobao.android.detail.ttdetail.mega.DetailMegaAbility;
import com.taobao.android.detail.ttdetail.utils.DataUtils;
import com.taobao.android.detail.ttdetail.weex.AliDetailGalleryWVPlugin;
import com.taobao.android.weex.WeexErrorType;
import com.taobao.android.weex.WeexInstance;
import com.taobao.android.weex.WeexInstanceMode;
import com.taobao.android.weex.WeexRenderType;
import com.taobao.android.weex.WeexValueImpl;
import com.taobao.android.weex.config.WeexInstanceConfig;
import com.taobao.android.weex.config.WeexUnicornConfig;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class m2k extends oa4<nb4> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public View f23737a;
    public FrameLayout b;
    public boolean c;
    public WeexInstance d;
    public String e;
    public j6x f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class a {
        static {
            t2o.a(912261446);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class b implements j6x {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.j6x
        public void E1(WeexInstance weexInstance, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f794a71b", new Object[]{this, weexInstance, new Boolean(z)});
            }
        }

        @Override // tb.j6x
        public void H0(WeexInstance weexInstance, boolean z, WeexErrorType weexErrorType, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("99cc9148", new Object[]{this, weexInstance, new Boolean(z), weexErrorType, str});
                return;
            }
            HashMap hashMap = new HashMap();
            ze7 ze7Var = m2k.this.mDetailContext;
            ckf.c(ze7Var, "mDetailContext");
            hashMap.put("itemId", DataUtils.v((Item) ze7Var.e().f(Item.class)));
            hashMap.put("errorMsg", str);
            bw7.b(hashMap, -600008, "头图weex2结构化帧渲染失败");
            tgh.b("WeexVersion2Component", "RenderFailed " + str);
        }

        @Override // tb.j6x
        public void I1(WeexInstance weexInstance) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("68c948df", new Object[]{this, weexInstance});
            }
        }

        @Override // tb.j6x
        public void K0(WeexInstance weexInstance) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ad8178b2", new Object[]{this, weexInstance});
            }
        }

        @Override // tb.j6x
        public void K1(WeexInstance weexInstance, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a414e261", new Object[]{this, weexInstance, new Boolean(z)});
            }
        }

        @Override // tb.j6x
        public void d2(WeexInstance weexInstance, WeexErrorType weexErrorType, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7a7821b2", new Object[]{this, weexInstance, weexErrorType, str});
                return;
            }
            tgh.b("WeexVersion2Component", "EngineException " + str);
        }

        @Override // tb.j6x
        public void e2(WeexInstance weexInstance, WeexErrorType weexErrorType, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("52b846bb", new Object[]{this, weexInstance, weexErrorType, str});
                return;
            }
            tgh.b("WeexVersion2Component", "ScriptException " + str);
        }

        @Override // tb.j6x
        public void l2(WeexInstance weexInstance, WeexErrorType weexErrorType, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("55726f6d", new Object[]{this, weexInstance, weexErrorType, str});
            }
        }

        @Override // tb.j6x
        public void z1(WeexInstance weexInstance, boolean z, WeexErrorType weexErrorType, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8bee002", new Object[]{this, weexInstance, new Boolean(z), weexErrorType, str});
                return;
            }
            tgh.b("WeexVersion2Component", "InitFailed " + str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class c implements AsyncProcessor.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // com.taobao.android.detail.ttdetail.async.AsyncProcessor.d
        public void a(JSONObject jSONObject, JSONObject jSONObject2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fe679aeb", new Object[]{this, jSONObject, jSONObject2});
            } else if (yc4.q(m2k.this.mComponentData)) {
                m2k.this.fireExposeEvent(new RuntimeAbilityParam[0]);
                m2k.u(m2k.this);
            } else {
                onFail("not set component fields asyncStatus=success");
            }
        }

        @Override // com.taobao.android.detail.ttdetail.async.AsyncProcessor.d
        public void onFail(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("239cc86e", new Object[]{this, str});
                return;
            }
            tgh.b("WeexVersion2Component", "AsyncProcessor onFail " + str);
            m2k.v(m2k.this, false);
        }
    }

    static {
        t2o.a(912261445);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2k(Context context, ze7 ze7Var, nb4 nb4Var, DataEntry... dataEntryArr) {
        super(context, ze7Var, nb4Var, (DataEntry[]) Arrays.copyOf(dataEntryArr, dataEntryArr.length));
        ckf.h(context, "context");
        ckf.h(nb4Var, "componentData");
        ckf.h(dataEntryArr, "initComponentData");
    }

    public static /* synthetic */ Object ipc$super(m2k m2kVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1857981988) {
            super.onDidAppear();
            return null;
        } else if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/detail/ttdetail/component/module/NewWeex2Component");
        }
    }

    public static final /* synthetic */ void u(m2k m2kVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c2265fe", new Object[]{m2kVar});
        } else {
            m2kVar.y();
        }
    }

    public static final /* synthetic */ void v(m2k m2kVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2cf3cb9", new Object[]{m2kVar, new Boolean(z)});
        } else {
            m2kVar.c = z;
        }
    }

    public final String B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b9b36c81", new Object[]{this});
        }
        T t = this.mComponentData;
        ckf.c(t, "mComponentData");
        JSONObject f = t.f();
        if (f == null) {
            return null;
        }
        String string = f.getString(UltronWeex2DialogFragment.WEEX2_URL);
        return string != null ? string : f.getString("url");
    }

    public final JSONObject getInitRenderData() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("448fed2d", new Object[]{this});
        }
        T t = this.mComponentData;
        ckf.c(t, "mComponentData");
        JSONObject f = t.f();
        if (f == null || (jSONObject = f.getJSONObject("params")) == null) {
            return null;
        }
        return jSONObject.getJSONObject(AliDetailGalleryWVPlugin.KEY_PARAMS_BRIDGE_DATA);
    }

    @Override // tb.oa4
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        DetailMegaAbility.a aVar = DetailMegaAbility.Companion;
        T t = this.mComponentData;
        ckf.c(t, "mComponentData");
        aVar.c(t.g());
        WeexInstance weexInstance = this.d;
        if (weexInstance != null) {
            weexInstance.removeInstanceListener(this.f);
        }
        WeexInstance weexInstance2 = this.d;
        if (weexInstance2 != null) {
            weexInstance2.destroy();
        }
    }

    @Override // tb.oa4
    public void onDidAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("914171dc", new Object[]{this});
            return;
        }
        if (yc4.r(this.mComponentData)) {
            super.onDidAppear();
        }
        renderUrl();
    }

    @Override // tb.oa4
    public View onGetComponentView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("f631742", new Object[]{this, view});
        }
        if (this.d == null) {
            x();
        }
        return w(view);
    }

    public final void renderUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0ab7c00", new Object[]{this});
        } else if (!this.c) {
            if (yc4.p(this.mComponentData)) {
                AsyncProcessor asyncProcessor = new AsyncProcessor(this.mDetailContext);
                nb4 nb4Var = this.mComponentData;
                c cVar = new c();
                RuntimeAbilityParam[] appendTriggerComponent = appendTriggerComponent(true, new RuntimeAbilityParam[0]);
                asyncProcessor.u(nb4Var, cVar, (RuntimeAbilityParam[]) Arrays.copyOf(appendTriggerComponent, appendTriggerComponent.length));
            } else {
                y();
            }
            this.c = true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005f, code lost:
        if (r2 != r5.f23737a) goto L_0x0061;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View w(android.view.View r6) {
        /*
            r5 = this;
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = tb.m2k.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0018
            java.lang.String r3 = "9a22db9a"
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r1] = r5
            r4[r0] = r6
            java.lang.Object r6 = r2.ipc$dispatch(r3, r4)
            android.view.View r6 = (android.view.View) r6
            return r6
        L_0x0018:
            r2 = 0
            if (r6 == 0) goto L_0x0024
            int r3 = r6.getId()
            int r4 = com.taobao.taobao.R.id.ll_weex2_container
            if (r3 != r4) goto L_0x0024
            goto L_0x0043
        L_0x0024:
            android.content.Context r6 = r5.mContext
            com.taobao.android.detail.ttdetail.performance.PreRenderManager r6 = com.taobao.android.detail.ttdetail.performance.PreRenderManager.g(r6)
            if (r6 == 0) goto L_0x0037
            android.content.Context r3 = r5.mContext
            int r4 = com.taobao.taobao.R.layout.tt_detail_weex2_component
            android.view.View r6 = r6.j(r3, r4, r2, r0)
            if (r6 == 0) goto L_0x0037
            goto L_0x0043
        L_0x0037:
            android.content.Context r6 = r5.mContext
            android.view.LayoutInflater r6 = android.view.LayoutInflater.from(r6)
            int r3 = com.taobao.taobao.R.layout.tt_detail_weex2_component
            android.view.View r6 = r6.inflate(r3, r2)
        L_0x0043:
            int r3 = com.taobao.taobao.R.id.ll_weex2_container
            android.view.View r3 = r6.findViewById(r3)
            android.widget.FrameLayout r3 = (android.widget.FrameLayout) r3
            r5.b = r3
            if (r3 == 0) goto L_0x0061
            int r3 = r3.getChildCount()
            if (r3 != r0) goto L_0x0061
            android.widget.FrameLayout r0 = r5.b
            if (r0 == 0) goto L_0x005d
            android.view.View r2 = r0.getChildAt(r1)
        L_0x005d:
            android.view.View r0 = r5.f23737a
            if (r2 == r0) goto L_0x0080
        L_0x0061:
            android.widget.FrameLayout r0 = r5.b
            if (r0 == 0) goto L_0x0068
            r0.removeAllViews()
        L_0x0068:
            android.view.View r0 = r5.f23737a
            if (r0 == 0) goto L_0x0080
            tb.ygw.a(r0)
            android.widget.FrameLayout r0 = r5.b
            if (r0 == 0) goto L_0x0080
            android.view.View r1 = r5.f23737a
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r3 = 17
            r4 = -1
            r2.<init>(r4, r4, r3)
            r0.addView(r1, r2)
        L_0x0080:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.m2k.w(android.view.View):android.view.View");
    }

    public final void x() {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb2c2e59", new Object[]{this});
            return;
        }
        WeexInstanceConfig weexInstanceConfig = new WeexInstanceConfig();
        WeexUnicornConfig weexUnicornConfig = new WeexUnicornConfig();
        weexUnicornConfig.i(WeexUnicornConfig.RenderMode.texture);
        weexUnicornConfig.k(true);
        weexInstanceConfig.s(weexUnicornConfig);
        String a2 = jov.a(B(), A());
        this.e = a2;
        WeexInstance a3 = com.taobao.android.weex.b.a(this.mContext, a2, WeexInstanceMode.DOM, WeexRenderType.UNICORN, null, weexInstanceConfig);
        this.d = a3;
        b bVar = new b();
        this.f = bVar;
        if (a3 != null) {
            a3.addInstanceListener(bVar);
        }
        WeexInstance weexInstance = this.d;
        if (weexInstance != null) {
            view = weexInstance.getRootView();
        } else {
            view = null;
        }
        this.f23737a = view;
    }

    public final void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b6176d5", new Object[]{this});
            return;
        }
        DetailMegaAbility.a aVar = DetailMegaAbility.Companion;
        T t = this.mComponentData;
        ckf.c(t, "mComponentData");
        String g = t.g();
        T t2 = this.mComponentData;
        ckf.c(t2, "mComponentData");
        JSONObject f = t2.f();
        aVar.b(g, f != null ? f.getJSONObject("params") : null);
        WeexInstance weexInstance = this.d;
        if (weexInstance != null) {
            weexInstance.initWithURL(this.e);
        }
        WeexInstance weexInstance2 = this.d;
        if (weexInstance2 != null) {
            weexInstance2.render(WeexValueImpl.ofJSON(getInitRenderData()));
        }
    }

    public final String z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("63fa638e", new Object[]{this});
        }
        qql parentComponent = getParentComponent();
        if (!(parentComponent instanceof sx9)) {
            return null;
        }
        String B = ((sx9) parentComponent).B();
        if (TextUtils.isEmpty(B)) {
            return null;
        }
        return B;
    }

    public final HashMap<String, String> A() {
        int parseInt;
        int i = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("c4662209", new Object[]{this});
        }
        String z = z();
        if (z != null) {
            try {
                List z0 = wsq.z0(z, new String[]{":"}, false, 0, 6, null);
                i = Integer.parseInt((String) z0.get(0));
                parseInt = Integer.parseInt((String) z0.get(1));
            } catch (Exception e) {
                tgh.c("WeexVersion2Component", "getUrlParams() parse dimension: ", e);
            }
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put("MAINPIC_WIDTH", String.valueOf(i));
            hashMap.put("MAINPIC_HEIGHT", String.valueOf(parseInt));
            ze7 ze7Var = this.mDetailContext;
            ckf.c(ze7Var, "mDetailContext");
            viq i2 = ze7Var.i();
            ckf.c(i2, "mDetailContext.stateCenter");
            String b2 = i2.b();
            ckf.c(b2, "mDetailContext.stateCenter.containerToken");
            hashMap.put("mh_token", b2);
            ze7 ze7Var2 = this.mDetailContext;
            ckf.c(ze7Var2, "mDetailContext");
            String v = DataUtils.v((Item) ze7Var2.e().f(Item.class));
            ckf.c(v, "DataUtils.getItemId(mDet…edData(Item::class.java))");
            hashMap.put("mh_itemId", v);
            T t = this.mComponentData;
            ckf.c(t, "mComponentData");
            String g = t.g();
            ckf.c(g, "mComponentData.id");
            hashMap.put("voName", g);
            return hashMap;
        }
        parseInt = 1;
        HashMap<String, String> hashMap2 = new HashMap<>();
        hashMap2.put("MAINPIC_WIDTH", String.valueOf(i));
        hashMap2.put("MAINPIC_HEIGHT", String.valueOf(parseInt));
        ze7 ze7Var3 = this.mDetailContext;
        ckf.c(ze7Var3, "mDetailContext");
        viq i22 = ze7Var3.i();
        ckf.c(i22, "mDetailContext.stateCenter");
        String b22 = i22.b();
        ckf.c(b22, "mDetailContext.stateCenter.containerToken");
        hashMap2.put("mh_token", b22);
        ze7 ze7Var22 = this.mDetailContext;
        ckf.c(ze7Var22, "mDetailContext");
        String v2 = DataUtils.v((Item) ze7Var22.e().f(Item.class));
        ckf.c(v2, "DataUtils.getItemId(mDet…edData(Item::class.java))");
        hashMap2.put("mh_itemId", v2);
        T t2 = this.mComponentData;
        ckf.c(t2, "mComponentData");
        String g2 = t2.g();
        ckf.c(g2, "mComponentData.id");
        hashMap2.put("voName", g2);
        return hashMap2;
    }
}

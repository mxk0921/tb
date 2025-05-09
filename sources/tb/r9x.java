package tb;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.async.AsyncProcessor;
import com.taobao.android.detail.ttdetail.component.module.DataEntry;
import com.taobao.android.detail.ttdetail.data.meta.Item;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import com.taobao.android.detail.ttdetail.performance.PreRenderManager;
import com.taobao.android.detail.ttdetail.utils.DataUtils;
import com.taobao.android.detail.ttdetail.weex.AliDetailGalleryWVPlugin;
import com.taobao.taobao.R;
import com.taobao.vessel.VesselView;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class r9x extends oa4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public volatile boolean b;
    public final VesselView c;
    public final ask d;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, String> f27218a = new HashMap();
    public final zy9 e = new zy9(-1, -1, 17);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements ask {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.ask
        public void onDowngrade(g4w g4wVar, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("36618407", new Object[]{this, g4wVar, map});
                return;
            }
            tgh.b("WeexVersion1Component", "onDowngrade code: " + g4wVar.f19727a + " msg: " + g4wVar.b);
        }

        @Override // tb.ask
        public void onLoadError(g4w g4wVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("365c1211", new Object[]{this, g4wVar});
                return;
            }
            tgh.b("WeexVersion1Component", "onLoadError code: " + g4wVar.f19727a + " msg: " + g4wVar.b);
        }

        @Override // tb.ask
        public void onLoadFinish(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c38c0593", new Object[]{this, view});
            } else {
                r9x.u(r9x.this).setVisibility(0);
            }
        }

        @Override // tb.ask
        public void onLoadStart() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f829aa04", new Object[]{this});
            }
        }
    }

    static {
        t2o.a(912261459);
    }

    public r9x(Context context, ze7 ze7Var, nb4 nb4Var, DataEntry... dataEntryArr) {
        super(context, ze7Var, nb4Var, dataEntryArr);
        a aVar = new a();
        VesselView vesselView = new VesselView(context);
        this.c = vesselView;
        vesselView.setOnLoadListener(aVar);
        vesselView.setVisibility(4);
    }

    public static /* synthetic */ Object ipc$super(r9x r9xVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1857981988) {
            super.onDidAppear();
            return null;
        } else if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode == 413640386) {
            super.onCreate();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/detail/ttdetail/component/module/WeexVersion1Component");
        }
    }

    public static /* synthetic */ VesselView u(r9x r9xVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VesselView) ipChange.ipc$dispatch("de201cbf", new Object[]{r9xVar});
        }
        return r9xVar.c;
    }

    public static /* synthetic */ void v(r9x r9xVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f5d5e4", new Object[]{r9xVar});
        } else {
            r9xVar.A();
        }
    }

    public static /* synthetic */ void w(r9x r9xVar, nb4 nb4Var, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90d78e67", new Object[]{r9xVar, nb4Var, jSONObject});
        } else {
            r9xVar.I(nb4Var, jSONObject);
        }
    }

    public static /* synthetic */ boolean x(r9x r9xVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9aff8f8", new Object[]{r9xVar, new Boolean(z)})).booleanValue();
        }
        r9xVar.b = z;
        return z;
    }

    public final void A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b6176d5", new Object[]{this});
            return;
        }
        AliDetailGalleryWVPlugin.registerComponentParams(this.mComponentData.g(), B());
        String F = F();
        if (!G()) {
            F = jov.a(F, E());
        }
        this.c.loadUrl(F);
    }

    public final JSONObject B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("a41af53c", new Object[]{this});
        }
        JSONObject f = this.mComponentData.f();
        if (f != null) {
            return f.getJSONObject("params");
        }
        return null;
    }

    public final nb4 C(nb4 nb4Var) {
        rql i;
        List r;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nb4) ipChange.ipc$dispatch("9209cbf9", new Object[]{this, nb4Var});
        }
        if (nb4Var == null || (i = nb4Var.i()) == null || (r = i.r()) == null || r.size() < 1) {
            return null;
        }
        return (nb4) r.get(0);
    }

    public final String D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("19c9cc3d", new Object[]{this});
        }
        qql parentComponent = getParentComponent();
        if (parentComponent instanceof sx9) {
            return ((sx9) parentComponent).B();
        }
        return "1:1";
    }

    public final String F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b9b36c81", new Object[]{this});
        }
        JSONObject f = this.mComponentData.f();
        if (f != null) {
            return f.getString("url");
        }
        return null;
    }

    public final void H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0ab7c00", new Object[]{this});
        } else if (!this.b) {
            if (yc4.p(this.mComponentData)) {
                new AsyncProcessor(this.mDetailContext).u(this.mComponentData, new s9x(this), appendTriggerComponent(true, new RuntimeAbilityParam[0]));
            } else {
                A();
            }
            this.b = true;
        }
    }

    public final void I(nb4 nb4Var, JSONObject jSONObject) {
        JSONObject f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe64b76c", new Object[]{this, nb4Var, jSONObject});
            return;
        }
        nb4 C = C(nb4Var);
        if (C != null && (f = C.f()) != null) {
            String[] strArr = {"fields", "aysncValue", "videoAction", "videoThumbnailURL"};
            Object z = z(new String[]{"fields", "aysncValue", "imageAction", "url"}, jSONObject);
            if (!(z instanceof String)) {
                z = z(strArr, jSONObject);
            }
            if (z instanceof String) {
                f.put("url", z);
            }
        }
    }

    @Override // tb.oa4
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
            return;
        }
        super.onCreate();
        AliDetailGalleryWVPlugin.registerCurrentModule();
    }

    @Override // tb.oa4
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        this.c.onDestroy();
        this.c.setOnLoadListener(null);
        AliDetailGalleryWVPlugin.removeComponentParams(this.mComponentData.g());
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
        H();
    }

    @Override // tb.oa4
    public View onGetComponentView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("f631742", new Object[]{this, view});
        }
        return y(view);
    }

    @Override // tb.oa4
    public zy9 onGetFrameSize(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zy9) ipChange.ipc$dispatch("5fd8d0bf", new Object[]{this, new Integer(i), new Integer(i2)});
        }
        return this.e;
    }

    public View y(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("9a22db9a", new Object[]{this, view});
        }
        if (view == null || view.getId() != R.id.ll_weex1_container) {
            PreRenderManager g = PreRenderManager.g(this.mContext);
            if (g != null) {
                view = g.j(this.mContext, R.layout.tt_detail_weex1_component, null, true);
            } else {
                view = LayoutInflater.from(this.mContext).inflate(R.layout.tt_detail_weex1_component, (ViewGroup) null);
            }
        }
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.ll_weex1_container);
        if (!(frameLayout.getChildCount() == 1 && frameLayout.getChildAt(0) == this.c)) {
            frameLayout.removeAllViews();
            ViewParent parent = this.c.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.c);
            }
            frameLayout.addView(this.c, new FrameLayout.LayoutParams(-1, -1, 17));
        }
        return view;
    }

    public final Object z(String[] strArr, JSONObject jSONObject) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("fca2da0a", new Object[]{this, strArr, jSONObject});
        }
        int length = strArr.length;
        Object obj = jSONObject;
        while (i < length) {
            String str = strArr[i];
            if (obj instanceof Map) {
                obj = ((Map) obj).get(str);
            }
            i++;
            obj = obj;
        }
        return obj;
    }

    public final boolean G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4d67d2e5", new Object[]{this})).booleanValue();
        }
        JSONObject B = B();
        if (B != null) {
            return Boolean.parseBoolean(B.getString(o1x.KEY_USE_BRIDGE));
        }
        return false;
    }

    public final Map<String, String> E() {
        int i;
        int i2 = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("908941db", new Object[]{this});
        }
        ((HashMap) this.f27218a).clear();
        String D = D();
        if (!TextUtils.isEmpty(D)) {
            String[] split = D.split(":");
            try {
                i2 = Integer.parseInt(split[0]);
                i = Integer.parseInt(split[1]);
            } catch (Throwable th) {
                tgh.c("WeexVersion1Component", "getUrlParams() parse dimension: ", th);
            }
            ((HashMap) this.f27218a).put("MAINPIC_WIDTH", String.valueOf(i2));
            ((HashMap) this.f27218a).put("MAINPIC_HEIGHT", String.valueOf(i));
            ((HashMap) this.f27218a).put("mh_token", this.mDetailContext.i().b());
            ((HashMap) this.f27218a).put("mh_itemId", DataUtils.v((Item) this.mDetailContext.e().f(Item.class)));
            ((HashMap) this.f27218a).put("voName", this.mComponentData.g());
            return this.f27218a;
        }
        i = 1;
        ((HashMap) this.f27218a).put("MAINPIC_WIDTH", String.valueOf(i2));
        ((HashMap) this.f27218a).put("MAINPIC_HEIGHT", String.valueOf(i));
        ((HashMap) this.f27218a).put("mh_token", this.mDetailContext.i().b());
        ((HashMap) this.f27218a).put("mh_itemId", DataUtils.v((Item) this.mDetailContext.e().f(Item.class)));
        ((HashMap) this.f27218a).put("voName", this.mComponentData.g());
        return this.f27218a;
    }
}

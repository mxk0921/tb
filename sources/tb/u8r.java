package tb;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentContainer;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentData;
import com.alibaba.android.aura.util.AURATraceUtil;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.buy.internal.AliBuyPresenterImpl;
import com.taobao.android.buy.toggle.AliBuyPerfSwitcher;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.HashMap;
import java.util.Map;
import tb.ck;
import tb.r58;

/* compiled from: Taobao */
@AURAExtensionImpl(code = "tbbuy.impl.component.lifeCycle.native")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class u8r extends kt implements r58.e {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Object d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements r58.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AURARenderComponent f29232a;

        public a(AURARenderComponent aURARenderComponent) {
            this.f29232a = aURARenderComponent;
        }

        public void a(String str, Map<String, Object> map, String str2, String... strArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e61d037", new Object[]{this, str, map, str2, strArr});
            } else {
                u8r.B(u8r.this, str, map, this.f29232a, str2, strArr);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b extends oh {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(708837495);
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            if (str.hashCode() == -929276007) {
                return new Boolean(super.c((qi) objArr[0], (nbb) objArr[1]));
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/purchase/aura/extension/nativerender/TBBuyNativeRenderLifeExtension$TBBuyURulesTapEventWrapper");
        }

        @Override // tb.oh, tb.ph, tb.ts
        public boolean c(qi qiVar, nbb nbbVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("c89c5f99", new Object[]{this, qiVar, nbbVar})).booleanValue();
            }
            return super.c(qiVar, nbbVar);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class c extends ph {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(708837496);
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            if (str.hashCode() == -929276007) {
                return new Boolean(super.c((qi) objArr[0], (nbb) objArr[1]));
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/purchase/aura/extension/nativerender/TBBuyNativeRenderLifeExtension$TBBuyUTapEventWrapper");
        }

        @Override // tb.ph, tb.ts
        public boolean c(qi qiVar, nbb nbbVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("c89c5f99", new Object[]{this, qiVar, nbbVar})).booleanValue();
            }
            return super.c(qiVar, nbbVar);
        }
    }

    static {
        t2o.a(708837493);
        t2o.a(708837615);
    }

    public static /* synthetic */ void B(u8r u8rVar, String str, Map map, AURARenderComponent aURARenderComponent, String str2, Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9b5eda0", new Object[]{u8rVar, str, map, aURARenderComponent, str2, objArr});
        } else {
            u8rVar.N0(str, map, aURARenderComponent, str2, objArr);
        }
    }

    public static /* synthetic */ Object ipc$super(u8r u8rVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode == -1162528052) {
            super.onDataChanged((AURAFlowData) objArr[0], (AURAGlobalData) objArr[1], (hbb) objArr[2]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/purchase/aura/extension/nativerender/TBBuyNativeRenderLifeExtension");
        }
    }

    @Override // tb.lcb
    public View C0(AURARenderComponentContainer aURARenderComponentContainer, ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("159ea598", new Object[]{this, aURARenderComponentContainer, viewGroup, new Integer(i)});
        }
        if (!J0()) {
            return null;
        }
        if (aURARenderComponentContainer == null || aURARenderComponentContainer.name == null || aURARenderComponentContainer.version == null) {
            ck.g().e("container name or version is null", ck.b.b().i("AURA/nativeRender").a());
            return null;
        }
        Object M0 = M0();
        if (this.d == null) {
            ck.g().e("tradeRenderEngine is null", ck.b.b().i("AURA/nativeRender").a());
            return null;
        }
        Object e = r58.e(M0, aURARenderComponentContainer.name, aURARenderComponentContainer.version);
        if (e == null) {
            return null;
        }
        View d = r58.d(e);
        if (d == null) {
            rbb g = ck.g();
            g.e(aURARenderComponentContainer.name + " view is null", ck.b.b().i("AURA/nativeRender").a());
            return null;
        }
        d.setTag(R.id.buy_view_holder, e);
        return d;
    }

    public final boolean J0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b7724a3b", new Object[]{this})).booleanValue();
        }
        if (!v48.a() || !AliBuyPerfSwitcher.enableNativeRender() || a8r.b(x().f())) {
            return false;
        }
        return true;
    }

    public final String K0(AURARenderComponent aURARenderComponent) {
        AURARenderComponentContainer aURARenderComponentContainer;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cc7cfde5", new Object[]{this, aURARenderComponent});
        }
        AURARenderComponentData aURARenderComponentData = aURARenderComponent.data;
        if (aURARenderComponentData == null || (aURARenderComponentContainer = aURARenderComponentData.container) == null) {
            return null;
        }
        return aURARenderComponentContainer.name + "#" + aURARenderComponentContainer.version;
    }

    public final void L(AURARenderComponent aURARenderComponent, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6ada302", new Object[]{this, aURARenderComponent, new Long(j)});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        AURATraceUtil.b(3);
        long j2 = currentTimeMillis - j;
        P0(aURARenderComponent, j2);
        if (AliBuyPresenterImpl.DEFAULT_AURA_BUY_MAIN_FLOW.equals(r().getFlowCode()) && th.c()) {
            String L0 = L0(aURARenderComponent);
            hl.b("[" + aURARenderComponent.key + "#" + L0 + "] native渲染完成，耗时 " + j2, null);
        }
    }

    public final String L0(AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4d3ec30a", new Object[]{this, aURARenderComponent});
        }
        try {
            return aURARenderComponent.data.container.name + "#" + aURARenderComponent.data.container.version;
        } catch (Throwable unused) {
            return null;
        }
    }

    public final Object M0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("63d02305", new Object[]{this});
        }
        if (this.d == null) {
            Object c2 = r58.c(x().f());
            this.d = c2;
            if (c2 != null) {
                r58.j(c2, this);
            }
        }
        return this.d;
    }

    public final void N0(String str, Map<String, Object> map, AURARenderComponent aURARenderComponent, String str2, Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36f690de", new Object[]{this, str, map, aURARenderComponent, str2, objArr});
            return;
        }
        qi qiVar = new qi();
        qiVar.t(aURARenderComponent);
        qiVar.l(objArr);
        qiVar.o(str2);
        qiVar.r(map);
        if ("handleDinamicXEvent".equals(str) || "uTap".equals(str)) {
            new c().c(qiVar, x().c());
        } else if ("uRuleTap".equals(str)) {
            new b().c(qiVar, x().c());
        }
    }

    public final void P0(AURARenderComponent aURARenderComponent, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66ae6633", new Object[]{this, aURARenderComponent, new Long(j)});
            return;
        }
        try {
            Map map = (Map) r().get("AURAFirstScreenRender", Map.class);
            if (map == null) {
                map = new HashMap();
            }
            map.put(aURARenderComponent.key.split("_")[0] + "@native_" + K0(aURARenderComponent), j + "");
            r().update("AURAFirstScreenRender", map);
        } catch (Throwable th) {
            vm0.e("SAVE_FIRST_SCREEN_RENDER_INFO_EXCEPTION", th.getMessage());
        }
    }

    @Override // tb.lcb
    public boolean c0(AURARenderComponent aURARenderComponent, View view, int i) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("90bcce3c", new Object[]{this, aURARenderComponent, view, new Integer(i)})).booleanValue();
        }
        Object tag = view.getTag(R.id.buy_view_holder);
        if (tag == null) {
            return false;
        }
        AURARenderComponentData aURARenderComponentData = aURARenderComponent.data;
        if (aURARenderComponentData == null || aURARenderComponentData.fields == null) {
            r58.b("beforeItemViewRender", aURARenderComponent.key + " bindData为空");
            return false;
        }
        if (aURARenderComponentData.events != null) {
            r58.i(tag, new a(aURARenderComponent));
        }
        long currentTimeMillis = System.currentTimeMillis();
        m0(aURARenderComponent);
        AURARenderComponentContainer aURARenderComponentContainer = aURARenderComponentData.container;
        JSONObject jSONObject = null;
        if (aURARenderComponentContainer != null) {
            str = aURARenderComponentContainer.name + "#" + aURARenderComponentContainer.version;
            if ("buy_v2_item".equals(aURARenderComponentContainer.name) || "buy_v3_item".equals(aURARenderComponentContainer.name)) {
                jSONObject = JSON.parseObject(JSON.toJSONString(aURARenderComponentData.events));
            }
        } else {
            str = "";
        }
        boolean a2 = r58.a(tag, r58.f((JSONObject) aURARenderComponentData.fields, jSONObject, aURARenderComponent.key, str));
        L(aURARenderComponent, currentTimeMillis);
        return a2;
    }

    public final void m0(AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6850d9bf", new Object[]{this, aURARenderComponent});
            return;
        }
        AURATraceUtil.a(3, "[" + aURARenderComponent.key + "] 开始渲染");
        if (AliBuyPresenterImpl.DEFAULT_AURA_BUY_MAIN_FLOW.equals(r().getFlowCode())) {
            hl.b("[" + aURARenderComponent.key + "] 开始渲染", null);
        }
    }

    @Override // tb.kt, tb.lbb
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, hbb hbbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bab53acc", new Object[]{this, aURAFlowData, aURAGlobalData, hbbVar});
            return;
        }
        super.onDataChanged(aURAFlowData, aURAGlobalData, hbbVar);
        if (J0()) {
            this.d = M0();
        }
    }

    @Override // tb.kt, tb.ybb
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        if (J0()) {
            r58.h(x().f());
        }
    }

    public boolean O0(View view, String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("27eb6f0b", new Object[]{this, view, str})).booleanValue();
        }
        Drawable j = m8r.j(str);
        boolean z = j != null && (view instanceof TUrlImageView);
        if (z) {
            TUrlImageView tUrlImageView = (TUrlImageView) view;
            tUrlImageView.setAutoRelease(false);
            tUrlImageView.enableSizeInLayoutParams(true);
            tUrlImageView.setImageDrawable(j);
            tUrlImageView.setPlaceHoldForeground(j);
        }
        rbb g = ck.g();
        if (z) {
            str2 = "命中商品图片";
        } else {
            str2 = "未命中商品图片";
        }
        g.e(str2, ck.b.b().i("AURA/performance").a());
        return z;
    }
}

package tb;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentContainer;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentData;
import com.alibaba.android.umf.constants.UMFConstants$ErrorCode;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.weex.AliDetailGalleryWVPlugin;
import com.taobao.android.weex_framework.MUSEngine;
import com.taobao.android.weex_framework.module.MUSModule;
import com.taobao.taobao.R;
import io.unicorn.plugin.platform.WeexPlatformView;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
@AURAExtensionImpl(code = "aura.impl.render.component.creator.weex2")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class to extends ps {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public c3x g;
    public hbb h;
    public AURAGlobalData i;
    public final e3x j = new e3x();

    static {
        t2o.a(81789239);
    }

    public static /* synthetic */ Object ipc$super(to toVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode == -1162528052) {
            super.onDataChanged((AURAFlowData) objArr[0], (AURAGlobalData) objArr[1], (hbb) objArr[2]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alibaba/android/aura/taobao/adapter/extension/weex2/extension/AURAWeex2ComponentExtension");
        }
    }

    public final d3x J0(FrameLayout frameLayout, uo uoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d3x) ipChange.ipc$dispatch("846d42ad", new Object[]{this, frameLayout, uoVar});
        }
        int i = R.id.aura_render_component_weex2_instance;
        Object tag = frameLayout.getTag(i);
        if (tag instanceof d3x) {
            return (d3x) tag;
        }
        d3x d3xVar = new d3x(frameLayout, this.j, this.c, this.i, this.h, uoVar);
        frameLayout.setTag(i, d3xVar);
        L(d3xVar);
        for (ddb ddbVar : r().f(ddb.class)) {
            ddbVar.F(d3xVar, frameLayout);
        }
        return d3xVar;
    }

    public final void K0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3f36c2c", new Object[]{this});
            return;
        }
        c3x c3xVar = (c3x) this.i.get("auraWeex2InstanceManager", c3x.class);
        this.g = c3xVar;
        if (c3xVar == null) {
            c3x c3xVar2 = new c3x();
            this.g = c3xVar2;
            this.i.update("auraWeex2InstanceManager", c3xVar2);
        }
    }

    public final void L(d3x d3xVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84d49649", new Object[]{this, d3xVar});
            return;
        }
        c3x c3xVar = this.g;
        if (c3xVar != null) {
            c3xVar.a(d3xVar);
        }
    }

    public final uo L0(AURARenderComponent aURARenderComponent) {
        Map<String, Object> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uo) ipChange.ipc$dispatch("2a77cf23", new Object[]{this, aURARenderComponent});
        }
        AURARenderComponentData aURARenderComponentData = aURARenderComponent.data;
        JSONObject jSONObject = null;
        if (aURARenderComponentData == null || (map = aURARenderComponentData.fields) == null) {
            return null;
        }
        String str = (String) map.get("url");
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Object obj = aURARenderComponent.data.fields.get("params");
        if (obj instanceof JSONObject) {
            Object obj2 = ((JSONObject) obj).get(AliDetailGalleryWVPlugin.KEY_PARAMS_BRIDGE_DATA);
            if (obj2 instanceof JSONObject) {
                jSONObject = (JSONObject) obj2;
            }
        }
        uo uoVar = new uo(str);
        uoVar.g(jSONObject);
        return uoVar;
    }

    public final void M0(String str, Map<String, Class<? extends MUSModule>> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("147df8d1", new Object[]{this, str, map});
            return;
        }
        try {
            for (Map.Entry<String, Class<? extends MUSModule>> entry : map.entrySet()) {
                MUSEngine.registerModule(entry.getKey(), entry.getValue());
            }
        } catch (Exception e) {
            O0(e.getMessage(), "weex2#containerViewError", str);
        }
    }

    public final void N0(String str, Map<String, Class<? extends WeexPlatformView>> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc124645", new Object[]{this, str, map});
            return;
        }
        try {
            for (Map.Entry<String, Class<? extends WeexPlatformView>> entry : map.entrySet()) {
                MUSEngine.registerPlatformView(entry.getKey(), entry.getValue());
            }
        } catch (Exception e) {
            O0(e.getMessage(), "weex2#containerViewError", str);
        }
    }

    @Override // tb.jcb
    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("533be778", new Object[]{this});
        }
        return "weex2";
    }

    @Override // tb.jcb
    public View f(ViewGroup viewGroup, AURARenderComponentContainer aURARenderComponentContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("19b5d83d", new Object[]{this, viewGroup, aURARenderComponentContainer});
        }
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        return frameLayout;
    }

    @Override // tb.jcb
    public String l(AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b7004174", new Object[]{this, aURARenderComponent});
        }
        AURARenderComponentData aURARenderComponentData = aURARenderComponent.data;
        if (aURARenderComponentData == null) {
            return String.valueOf(System.currentTimeMillis());
        }
        AURARenderComponentContainer aURARenderComponentContainer = aURARenderComponentData.container;
        if (aURARenderComponentContainer == null) {
            return String.valueOf(System.currentTimeMillis());
        }
        return aURARenderComponent.key + aURARenderComponentContainer.name + aURARenderComponentContainer.version;
    }

    @Override // tb.ps, tb.lbb
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, hbb hbbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bab53acc", new Object[]{this, aURAFlowData, aURAGlobalData, hbbVar});
            return;
        }
        this.h = hbbVar;
        this.i = aURAGlobalData;
        this.j.f18249a = r();
        this.j.b = hbbVar;
        K0();
        super.onDataChanged(aURAFlowData, aURAGlobalData, hbbVar);
    }

    @Override // tb.ps, tb.ybb
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        K0();
        c3x c3xVar = this.g;
        if (c3xVar != null) {
            List<d3x> c = c3xVar.c();
            if (!c.isEmpty()) {
                for (d3x d3xVar : c) {
                    if (d3xVar != null) {
                        d3xVar.c();
                    }
                }
                this.g.b();
            }
        }
    }

    public final void O0(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c623f59", new Object[]{this, str, str2, str3});
        } else if (this.h == null) {
            ck.g().b("AURAWeex2ComponentExtension", "reportError", str);
        } else {
            mi miVar = new mi(1, "Weex2", str2, str);
            if (!TextUtils.isEmpty(str3)) {
                HashMap hashMap = new HashMap();
                hashMap.put("AuraComponentKey", str3);
                miVar.i(hashMap);
            }
            this.h.b(miVar);
        }
    }

    @Override // tb.jcb
    public void g(AURARenderComponent aURARenderComponent, View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a87728a", new Object[]{this, aURARenderComponent, view, new Integer(i)});
        } else if (!(view instanceof FrameLayout)) {
            this.h.b(new mi(1, "DomainTaobaoAdapter", UMFConstants$ErrorCode.WORKFLOW_CONTAIN_NO_EXECUTOR, "view type is not FrameLayout"));
        } else {
            List<ddb> f = r().f(ddb.class);
            FrameLayout frameLayout = (FrameLayout) view;
            if (m0(aURARenderComponent, frameLayout, f)) {
                O0("downgrade", "weex2#containerViewError", aURARenderComponent.key);
                return;
            }
            Iterator<ddb> it = f.iterator();
            uo uoVar = null;
            while (it.hasNext() && (uoVar = it.next().j(aURARenderComponent, frameLayout, i)) == null) {
            }
            if (uoVar.e() != null && uoVar.e().size() > 0) {
                M0(aURARenderComponent.key, uoVar.e());
            }
            if (uoVar.f() != null && uoVar.f().size() > 0) {
                N0(aURARenderComponent.key, uoVar.f());
            }
            d3x J0 = J0(frameLayout, uoVar);
            if (J0.l() == 0) {
                try {
                    J0.s(aURARenderComponent);
                    if (TextUtils.isEmpty(uoVar.d())) {
                        uoVar = L0(aURARenderComponent);
                    }
                    if (uoVar != null && !TextUtils.isEmpty(uoVar.d())) {
                        for (ddb ddbVar : f) {
                            ddbVar.b0(J0, aURARenderComponent, frameLayout, i);
                        }
                        J0.p(uoVar);
                        return;
                    }
                    O0("AURAWeexComponentRenderModel生成失败", "weex2#containerViewError", aURARenderComponent.key);
                    J0.c();
                    c3x c3xVar = this.g;
                    if (c3xVar != null) {
                        c3xVar.e(J0);
                    }
                } catch (Exception e) {
                    O0(e.getMessage(), "weex2#containerViewError", aURARenderComponent.key);
                }
            }
        }
    }

    public final boolean m0(AURARenderComponent aURARenderComponent, FrameLayout frameLayout, List<ddb> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4986645f", new Object[]{this, aURARenderComponent, frameLayout, list})).booleanValue();
        }
        try {
            for (ddb ddbVar : list) {
                if (ddbVar.k0(aURARenderComponent)) {
                    int i = R.id.aura_render_component_weex2_instance;
                    Object tag = frameLayout.getTag(i);
                    if (tag instanceof d3x) {
                        frameLayout.setTag(i, null);
                        frameLayout.removeAllViews();
                        ((d3x) tag).c();
                        c3x c3xVar = this.g;
                        if (c3xVar != null) {
                            c3xVar.e((d3x) tag);
                        }
                    }
                    return true;
                }
            }
        } catch (Exception e) {
            O0("checkDowngrade|" + e.getMessage(), "weex2#containerViewError", aURARenderComponent.key);
        }
        return false;
    }
}

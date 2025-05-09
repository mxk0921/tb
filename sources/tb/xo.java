package tb;

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
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.weex.WXSDKInstance;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
@AURAExtensionImpl(code = "aura.impl.render.component.creator.weex")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class xo extends ps {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public List<WXSDKInstance> g;
    public hbb h;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements gbe {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ViewGroup f31490a;

        public a(ViewGroup viewGroup) {
            this.f31490a = viewGroup;
        }

        @Override // tb.gbe
        public void onException(WXSDKInstance wXSDKInstance, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("88f82eeb", new Object[]{this, wXSDKInstance, str, str2});
                return;
            }
            xo xoVar = xo.this;
            xo.L(xoVar, str + "|" + str2);
        }

        @Override // tb.gbe
        public void onRefreshSuccess(WXSDKInstance wXSDKInstance, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d57f8320", new Object[]{this, wXSDKInstance, new Integer(i), new Integer(i2)});
            }
        }

        @Override // tb.gbe
        public void onRenderSuccess(WXSDKInstance wXSDKInstance, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c414a5f9", new Object[]{this, wXSDKInstance, new Integer(i), new Integer(i2)});
            }
        }

        @Override // tb.gbe
        public void onViewCreated(WXSDKInstance wXSDKInstance, View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9eab5f0f", new Object[]{this, wXSDKInstance, view});
            } else if (view == null) {
                xo.L(xo.this, "onViewCreated#view is null");
            } else {
                ViewGroup viewGroup = this.f31490a;
                if (viewGroup == null) {
                    xo.L(xo.this, "onViewCreated#containerLayout is null");
                    return;
                }
                viewGroup.removeAllViews();
                view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                for (edb edbVar : xo.m0(xo.this).f(edb.class)) {
                    edbVar.G0(this.f31490a, view);
                }
                this.f31490a.addView(view);
            }
        }
    }

    static {
        t2o.a(81789023);
    }

    public static /* synthetic */ void L(xo xoVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6b7d7db", new Object[]{xoVar, str});
        } else {
            xoVar.M0(str);
        }
    }

    public static /* synthetic */ Object ipc$super(xo xoVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode == -1162528052) {
            super.onDataChanged((AURAFlowData) objArr[0], (AURAGlobalData) objArr[1], (hbb) objArr[2]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alibaba/android/aura/taobao/adapter/extension/common/render/weex/AURAWeexComponentExtension");
        }
    }

    public static /* synthetic */ yi m0(xo xoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yi) ipChange.ipc$dispatch("164133e5", new Object[]{xoVar});
        }
        return xoVar.r();
    }

    public final void J0(WXSDKInstance wXSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b75fbd2f", new Object[]{this, wXSDKInstance});
        } else {
            this.g.add(wXSDKInstance);
        }
    }

    public final WXSDKInstance K0(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WXSDKInstance) ipChange.ipc$dispatch("6b06f0ba", new Object[]{this, viewGroup});
        }
        int i = R.id.aura_render_component_weex_instance;
        Object tag = viewGroup.getTag(i);
        if (tag instanceof WXSDKInstance) {
            return (WXSDKInstance) tag;
        }
        WXSDKInstance wXSDKInstance = new WXSDKInstance(viewGroup.getContext());
        wXSDKInstance.registerRenderListener(new a(viewGroup));
        viewGroup.setTag(i, wXSDKInstance);
        J0(wXSDKInstance);
        return wXSDKInstance;
    }

    public final void L0(AURAGlobalData aURAGlobalData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49b7d240", new Object[]{this, aURAGlobalData});
            return;
        }
        List<WXSDKInstance> list = (List) aURAGlobalData.get("auraRenderWeexInstances", List.class);
        this.g = list;
        if (list == null) {
            ArrayList arrayList = new ArrayList();
            this.g = arrayList;
            aURAGlobalData.update("auraRenderWeexInstances", arrayList);
        }
    }

    @Override // tb.jcb
    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("533be778", new Object[]{this});
        }
        return dm.g;
    }

    @Override // tb.jcb
    public View f(ViewGroup viewGroup, AURARenderComponentContainer aURARenderComponentContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("19b5d83d", new Object[]{this, viewGroup, aURARenderComponentContainer});
        }
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        WXSDKInstance K0 = K0(frameLayout);
        for (edb edbVar : r().f(edb.class)) {
            edbVar.y(K0, viewGroup, frameLayout);
        }
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
        L0(aURAGlobalData);
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
        List<WXSDKInstance> list = this.g;
        if (list != null) {
            for (WXSDKInstance wXSDKInstance : list) {
                if (wXSDKInstance != null) {
                    wXSDKInstance.destroy();
                }
            }
            this.g.clear();
        }
    }

    public final void M0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2dd48c5", new Object[]{this, str});
            return;
        }
        hbb hbbVar = this.h;
        if (hbbVar == null) {
            ck.g().b("AURAWeexComponentExtension", "reportError", str);
        } else {
            hbbVar.b(new mi(1, "Weex", "", str));
        }
    }

    @Override // tb.jcb
    public void g(AURARenderComponent aURARenderComponent, View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a87728a", new Object[]{this, aURARenderComponent, view, new Integer(i)});
        } else if (!(view instanceof ViewGroup)) {
            this.h.b(new mi(1, "DomainTaobaoAdapter", UMFConstants$ErrorCode.WORKFLOW_CONTAIN_NO_EXECUTOR, "view type is not ViewGroup"));
        } else {
            ViewGroup viewGroup = (ViewGroup) view;
            K0(viewGroup);
            try {
                List<edb> f = r().f(edb.class);
                if (f.isEmpty()) {
                    M0("没有配置扩展点：【aura.extension.render.component.creator.weex.lifecycle】");
                    return;
                }
                for (edb edbVar : f) {
                    edbVar.j(aURARenderComponent, viewGroup, i);
                }
                M0("AURAWeexComponentRenderModel生成失败");
            } catch (Exception e) {
                M0(e.getMessage());
            }
        }
    }
}

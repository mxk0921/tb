package tb;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import anet.channel.strategy.dispatch.DispatchCore;
import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentContainer;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentData;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXEngineConfig;
import com.taobao.android.dinamicx.DXResult;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.s;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import tb.ck;
import tb.nh;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class rs extends ps {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final String g = rs.class.getSimpleName();
    public s h;
    public tm i;
    public hbb j;
    public int k;
    public int l;

    static {
        t2o.a(81789005);
    }

    public static /* synthetic */ Object ipc$super(rs rsVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode == -1162528052) {
            super.onDataChanged((AURAFlowData) objArr[0], (AURAGlobalData) objArr[1], (hbb) objArr[2]);
            return null;
        } else if (hashCode == -25033014) {
            super.onCreate((lo) objArr[0], (yi) objArr[1]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alibaba/android/aura/taobao/adapter/extension/common/render/dx/AbsAURADXComponentExtension");
        }
    }

    public abstract void J0(s sVar, nh nhVar);

    public final void K0(AURAGlobalData aURAGlobalData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edd44c42", new Object[]{this, aURAGlobalData});
            return;
        }
        s sVar = (s) aURAGlobalData.get("auraRenderDxEngine", s.class);
        this.h = sVar;
        if (sVar == null) {
            s sVar2 = new s(new DXEngineConfig(this.c.d()));
            this.h = sVar2;
            sVar2.s(38447420286L, new ph());
            this.h.s(7023701163946200378L, new oh());
            aURAGlobalData.update("auraRenderDxEngine", this.h);
        }
    }

    public final void L(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18163b6f", new Object[]{this, viewGroup});
            return;
        }
        this.l = pb6.i();
        this.k = View.MeasureSpec.makeMeasureSpec(viewGroup.getWidth(), 1073741824);
    }

    public final DXRootView L0(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRootView) ipChange.ipc$dispatch("f073f160", new Object[]{this, view});
        }
        if (view instanceof DXRootView) {
            return (DXRootView) view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            DXRootView L0 = L0(viewGroup.getChildAt(i));
            if (L0 != null) {
                return L0;
            }
        }
        return null;
    }

    public final void M0(String str, String str2, AURARenderComponentContainer aURARenderComponentContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8d57a03", new Object[]{this, str, str2, aURARenderComponentContainer});
        } else if (this.j != null) {
            mi miVar = new mi(1, "AURARenderServiceDomain", str, str2);
            if (aURARenderComponentContainer != null) {
                miVar.g("containerName", aURARenderComponentContainer.name).g("containerVersion", aURARenderComponentContainer.version).g("containerUrl", aURARenderComponentContainer.url);
            }
            this.j.b(miVar);
        }
    }

    @Override // tb.jcb
    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("533be778", new Object[]{this});
        }
        return dm.f17906a;
    }

    @Override // tb.jcb
    public View f(ViewGroup viewGroup, AURARenderComponentContainer aURARenderComponentContainer) {
        DXRootView dXRootView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("19b5d83d", new Object[]{this, viewGroup, aURARenderComponentContainer});
        }
        Context context = viewGroup.getContext();
        if (this.h == null) {
            M0(DispatchCore.CHECK_SIGN_FAIL, "engineRouter为空", aURARenderComponentContainer);
            return m0(context);
        }
        L(viewGroup);
        DXTemplateItem b = vwu.b(aURARenderComponentContainer);
        if (b == null) {
            M0("-1001", "组件信息无法转换为DXTemplateItem", aURARenderComponentContainer);
            return m0(context);
        }
        DXTemplateItem i = this.h.i(b);
        if (i == null) {
            rbb g = ck.g();
            ck.b l = ck.b.b().l(this.g);
            String str = b.f7343a;
            if (str == null) {
                str = "";
            }
            g.f("createViewError#dxTemplateItem is null", l.g(yh6.CONFIG_KEY_TEMPLATE_NAME, str).a());
            i = b;
        }
        DXResult<DXRootView> o = this.h.o(context, i);
        if (o == null || o.d() || (dXRootView = o.f7291a) == null) {
            M0("-1001", "创建组件失败", aURARenderComponentContainer);
            return m0(context);
        }
        DXRootView dXRootView2 = dXRootView;
        return th.c() ? bn6.a(dXRootView2, b) : dXRootView2;
    }

    @Override // tb.jcb
    public void g(AURARenderComponent aURARenderComponent, View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a87728a", new Object[]{this, aURARenderComponent, view, new Integer(i)});
        } else if (this.h == null) {
            M0(DispatchCore.RESOLVE_ANSWER_FAIL, "engineRouter为空", null);
        } else {
            AURARenderComponentData aURARenderComponentData = aURARenderComponent.data;
            if (aURARenderComponentData == null) {
                M0("-1002", "渲染失败，组件数据为空", null);
                return;
            }
            DXRootView L0 = L0(view);
            if (L0 != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("fields", JSON.toJSON(aURARenderComponentData.fields));
                jSONObject.put("events", JSON.toJSON(aURARenderComponentData.events));
                jSONObject.put("status", (Object) aURARenderComponentData.status);
                J0(this.h, new nh.b().f(i).b(aURARenderComponent).g(L0).e(jSONObject).c(this.l).d(this.k).a());
                return;
            }
            M0("-1002", "找不到DXRootView", aURARenderComponentData.container);
        }
    }

    @Override // tb.jcb
    public String l(AURARenderComponent aURARenderComponent) {
        String str;
        AURARenderComponentContainer aURARenderComponentContainer;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b7004174", new Object[]{this, aURARenderComponent});
        }
        AURARenderComponentData aURARenderComponentData = aURARenderComponent.data;
        if (aURARenderComponentData == null || (aURARenderComponentContainer = aURARenderComponentData.container) == null) {
            str = null;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(aURARenderComponentContainer.containerType);
            sb.append("_");
            sb.append(aURARenderComponentContainer.name);
            sb.append("_");
            sb.append(aURARenderComponentContainer.version);
            String str2 = aURARenderComponentContainer.identifySuffix;
            if (str2 == null) {
                str2 = "";
            }
            sb.append(str2);
            str = sb.toString();
        }
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        String valueOf = String.valueOf(System.currentTimeMillis());
        rbb g = ck.g();
        String str3 = this.g;
        g.b(str3, "getItemViewType", "failed to get itemViewType from component, use system time instead, component=" + aURARenderComponent);
        return valueOf;
    }

    public final View m0(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("14b4b684", new Object[]{this, context});
        }
        if (this.i == null) {
            this.i = new tm();
        }
        return this.i.a(context);
    }

    @Override // tb.ps, tb.ybb
    public void onCreate(lo loVar, yi yiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe8206ca", new Object[]{this, loVar, yiVar});
        } else {
            super.onCreate(loVar, yiVar);
        }
    }

    @Override // tb.ps, tb.lbb
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, hbb hbbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bab53acc", new Object[]{this, aURAFlowData, aURAGlobalData, hbbVar});
            return;
        }
        super.onDataChanged(aURAFlowData, aURAGlobalData, hbbVar);
        K0(aURAGlobalData);
        this.j = hbbVar;
    }

    @Override // tb.ps, tb.ybb
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        this.j = null;
        s sVar = this.h;
        if (!(sVar == null || sVar.k() == null)) {
            this.h.k().q0();
        }
        this.h = null;
    }
}

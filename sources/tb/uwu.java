package tb;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentContainer;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentData;
import com.alibaba.android.aura.service.render.widget.roundcornerlayout.UMFRoundCornerLayout;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXEngineConfig;
import com.taobao.android.dinamicx.DXResult;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.s;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class uwu extends fz {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final String e = uwu.class.getSimpleName();
    public s f;
    public tm g;
    public mh h;

    static {
        t2o.a(80740753);
    }

    public static /* synthetic */ Object ipc$super(uwu uwuVar, String str, Object... objArr) {
        if (str.hashCode() == 1970911401) {
            super.d((txu) objArr[0], (f4e) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/umf/node/service/render/extension/impl/UMFDXRenderComponentCreatorExtension");
    }

    @Override // tb.d4e
    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("533be778", new Object[]{this});
        }
        return dm.f17906a;
    }

    public final View c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("14b4b684", new Object[]{this, context});
        }
        if (this.g == null) {
            this.g = new tm();
        }
        return this.g.a(context);
    }

    @Override // tb.fz, tb.d4e
    public void d(txu txuVar, f4e f4eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7579b8a9", new Object[]{this, txuVar, f4eVar});
            return;
        }
        super.d(txuVar, f4eVar);
        e(txuVar);
    }

    public final void e(txu txuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f86c7955", new Object[]{this, txuVar});
            return;
        }
        s sVar = (s) txuVar.c("dinamicXEngineRouter", s.class);
        if (sVar == null) {
            this.f = new s(new DXEngineConfig.b(txuVar.a()).Q(2).F());
            if (txuVar.b() instanceof Activity) {
                this.f.k().l1((Activity) txuVar.b());
            }
            txuVar.f("dinamicXEngineRouter", this.f);
            return;
        }
        this.f = sVar;
    }

    @Override // tb.d4e
    public View f(ViewGroup viewGroup, AURARenderComponentContainer aURARenderComponentContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("19b5d83d", new Object[]{this, viewGroup, aURARenderComponentContainer});
        }
        Context context = viewGroup.getContext();
        DXTemplateItem b = vwu.b(aURARenderComponentContainer);
        if (b == null) {
            dxu.a().e(this.e, "createView#containerInfo is null");
            gxu.a(this.c, "DX_CREATE_EXCEPTION", "umf", "containerInfo invalid");
            return c(context);
        }
        DXResult<DXRootView> g = this.f.g(context, viewGroup, b);
        if (g == null || g.d() || g.f7291a == null) {
            b4e a2 = dxu.a();
            String str = this.e;
            StringBuilder sb = new StringBuilder("createView#error=");
            sb.append(g != null ? g.a().toString() : null);
            a2.e(str, sb.toString());
            if (i().a(aURARenderComponentContainer)) {
                return f(viewGroup, aURARenderComponentContainer);
            }
            gxu.a(this.c, "DX_CREATE_EXCEPTION", "umf", "downgrade failure");
            return c(context);
        }
        UMFRoundCornerLayout uMFRoundCornerLayout = new UMFRoundCornerLayout(context);
        uMFRoundCornerLayout.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        uMFRoundCornerLayout.setBackgroundColor(-1);
        g.f7291a.setBackgroundColor(-1);
        uMFRoundCornerLayout.addView(g.f7291a);
        return uMFRoundCornerLayout;
    }

    @Override // tb.d4e
    public void g(AURARenderComponent aURARenderComponent, View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a87728a", new Object[]{this, aURARenderComponent, view, new Integer(i)});
            return;
        }
        DXRootView h = h(view);
        if (h != null) {
            int j = pb6.j();
            int i2 = pb6.i();
            JSONObject jSONObject = new JSONObject();
            AURARenderComponentData aURARenderComponentData = aURARenderComponent.data;
            if (aURARenderComponentData != null) {
                jSONObject.put("fields", JSON.toJSON(aURARenderComponentData.fields));
            }
            DXResult<DXRootView> v = this.f.v(this.d, jSONObject, h, j, i2, pxu.a(this.f19640a, aURARenderComponent));
            if (v == null || v.d()) {
                b4e a2 = dxu.a();
                String str = this.e;
                a2.e(str, "renderView#renderTemplate error,DXResultError=" + v.a());
                if (!i().a(aURARenderComponentData.container)) {
                    String str2 = this.c;
                    gxu.a(str2, "DX_RENDER_DOWNGRADE_EXCEPTION", "umf", "downgrade failure,componentData=" + aURARenderComponentData);
                    b4e a3 = dxu.a();
                    String str3 = this.e;
                    a3.e(str3, "renderView#already downgrade failed,view=" + view);
                } else if (this.b != null) {
                    dxu.a().d(this.e, "renderView#downgrade refresh");
                    this.b.L();
                }
            } else {
                this.f.k().t0(h);
            }
        } else {
            b4e a4 = dxu.a();
            String str4 = this.e;
            a4.e(str4, "renderView#view type is not DXRootView, view=" + view);
            String str5 = this.c;
            gxu.a(str5, "DX_RENDER_WRONG_VIEW_TYPE_EXCEPTION", "umf", "render failure, view is not DXRootView,view=" + view + ",component=" + aURARenderComponent);
        }
    }

    public final DXRootView h(View view) {
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
            DXRootView h = h(viewGroup.getChildAt(i));
            if (h != null) {
                return h;
            }
        }
        return null;
    }

    public final mh i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mh) ipChange.ipc$dispatch("a114affd", new Object[]{this});
        }
        if (this.h == null) {
            this.h = new mh();
        }
        return this.h;
    }

    @Override // tb.d4e
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
            str = aURARenderComponentContainer.containerType + "_" + aURARenderComponentContainer.name + "_" + aURARenderComponentContainer.version;
        }
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        String valueOf = String.valueOf(System.currentTimeMillis());
        dxu.a().e(this.e, "getItemViewType#failed to get itemViewType from component, use system time instead, component=" + aURARenderComponent);
        return valueOf;
    }
}

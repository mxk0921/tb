package com.taobao.android.dinamicx;

import android.content.Context;
import android.widget.LinearLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXEngineConfig;
import com.taobao.android.dinamicx.DXRenderOptions;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.taobao.R;
import java.util.ArrayList;
import tb.fl6;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class TemplateView extends LinearLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private DinamicXEngine dxEngine = null;

    static {
        t2o.a(444596628);
    }

    public TemplateView(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(TemplateView templateView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/TemplateView");
    }

    private DXButterRootView renderTemplate(DXTemplateItem dXTemplateItem, DXButterRootView dXButterRootView, JSONObject jSONObject, fl6 fl6Var, DXWidgetNode dXWidgetNode) {
        DXTemplateItem dXTemplateItem2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXButterRootView) ipChange.ipc$dispatch("20e9d51d", new Object[]{this, dXTemplateItem, dXButterRootView, jSONObject, fl6Var, dXWidgetNode});
        }
        DinamicXEngine engine = getEngine();
        if (dXTemplateItem == null) {
            return dXButterRootView;
        }
        if (dXButterRootView == null) {
            DXTemplateItem u = engine.u(dXTemplateItem);
            if (u == null || u.b != dXTemplateItem.b) {
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(dXTemplateItem);
                engine.p(arrayList);
            }
            if (u != null) {
                u.g = true;
                dXButterRootView = (DXButterRootView) engine.o(getContext(), u).f7291a;
                dXButterRootView.setTag(R.id.dinamicXTemplateNode, dXWidgetNode);
                dXButterRootView.useSysMeasureSpec = true;
            }
            dXTemplateItem2 = u;
        } else {
            dXTemplateItem2 = dXTemplateItem;
        }
        return (DXButterRootView) engine.i1(getContext(), dXButterRootView, dXTemplateItem2, jSONObject, 0, new DXRenderOptions.b().E(fl6Var).q()).f7291a;
    }

    public DinamicXEngine getEngine() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DinamicXEngine) ipChange.ipc$dispatch("b092b8e8", new Object[]{this});
        }
        if (this.dxEngine == null) {
            this.dxEngine = new DinamicXEngine(new DXEngineConfig.b("dxView").U(true).F());
        }
        return this.dxEngine;
    }

    public void setData(DXTemplateItem dXTemplateItem, JSONObject jSONObject, fl6 fl6Var, DXWidgetNode dXWidgetNode) {
        String str;
        DXButterRootView dXButterRootView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c2c8fdf", new Object[]{this, dXTemplateItem, jSONObject, fl6Var, dXWidgetNode});
            return;
        }
        String d = dXTemplateItem.d();
        DXButterRootView dXButterRootView2 = (DXButterRootView) getChildAt(0);
        if (dXButterRootView2 != null) {
            str = dXButterRootView2.getDxTemplateItem().d();
        } else {
            str = "";
        }
        if (d.equals(str)) {
            dXButterRootView = dXButterRootView2;
        } else {
            dXButterRootView = null;
        }
        DXButterRootView renderTemplate = renderTemplate(dXTemplateItem, dXButterRootView, jSONObject, fl6Var, dXWidgetNode);
        if (renderTemplate != null && renderTemplate != dXButterRootView2) {
            if (dXButterRootView2 != null) {
                removeAllViews();
            }
            addView(renderTemplate);
        }
    }

    public void shareDXEngine(DinamicXEngine dinamicXEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90e6960d", new Object[]{this, dinamicXEngine});
        } else {
            this.dxEngine = dinamicXEngine;
        }
    }
}

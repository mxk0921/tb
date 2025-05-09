package tb;

import android.app.Activity;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRenderOptions;
import com.taobao.android.dinamicx.DXResult;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.tao.log.TLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class wzn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f31042a;

    static {
        boolean z;
        t2o.a(729809656);
        if (b9b.e() || b9b.h()) {
            z = true;
        } else {
            z = false;
        }
        f31042a = z;
    }

    public static DXResult<DXRootView> a(DinamicXEngine dinamicXEngine, DXRootView dXRootView, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXResult) ipChange.ipc$dispatch("bf931a53", new Object[]{dinamicXEngine, dXRootView, jSONObject});
        }
        return dinamicXEngine.j1(dXRootView, jSONObject);
    }

    public static DXResult<DXRootView> b(DinamicXEngine dinamicXEngine, DXRootView dXRootView, JSONObject jSONObject, fl6 fl6Var, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXResult) ipChange.ipc$dispatch("c5139154", new Object[]{dinamicXEngine, dXRootView, jSONObject, fl6Var, new Integer(i)});
        }
        int j = pb6.j();
        Activity y = dinamicXEngine.y();
        if (y != null && f31042a) {
            if (i <= 0) {
                i = b9b.a(y);
            }
            j = DXWidgetNode.DXMeasureSpec.c(i, 1073741824);
        }
        DXResult<DXRootView> i1 = dinamicXEngine.i1(dXRootView.getContext(), dXRootView, dXRootView.getDxTemplateItem(), jSONObject, -1, new DXRenderOptions.b().G(j).t(pb6.i()).E(fl6Var).q());
        try {
            if (i1.d()) {
                cd0.a(jSONObject, i1.a());
            }
        } catch (Throwable th) {
            TLog.loge("AdMonitorHelper", "checkLunBoSection error.", th);
        }
        return i1;
    }
}

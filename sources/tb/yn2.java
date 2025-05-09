package tb;

import android.view.View;
import android.view.ViewGroup;
import com.alibaba.android.ultron.vfw.core.ViewEngine;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class yn2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(479199473);
    }

    public static List<List<JSONObject>> a(fdd fddVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("741e65d4", new Object[]{fddVar, new Integer(i)});
        }
        ArrayList arrayList = new ArrayList();
        if ((1 & i) != 0) {
            arrayList.add(d(fddVar.e().r()));
        }
        if ((i & 2) != 0) {
            arrayList.add(d(fddVar.e().o()));
        }
        if ((i & 4) != 0) {
            arrayList.add(d(fddVar.e().p()));
        }
        return arrayList;
    }

    public static kmb b(DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kmb) ipChange.ipc$dispatch("87871eb3", new Object[]{dXRuntimeContext});
        }
        if (!(dXRuntimeContext == null || dXRuntimeContext.q() == null || !(dXRuntimeContext.q() instanceof Map))) {
            Object obj = ((Map) dXRuntimeContext.q()).get("ViewEngine");
            if (obj instanceof ViewEngine) {
                return (kmb) ((ViewEngine) obj).a0(kmb.class);
            }
        }
        return null;
    }

    public static IDMComponent c(DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDMComponent) ipChange.ipc$dispatch("d9c2e8c3", new Object[]{dXRuntimeContext});
        }
        if (dXRuntimeContext == null) {
            return null;
        }
        Object q = dXRuntimeContext.q();
        if (!(q instanceof Map)) {
            return null;
        }
        Object obj = ((Map) q).get(xo7.TAG_DINAMICX_VIEW_COMPONENT);
        if (obj instanceof IDMComponent) {
            return (IDMComponent) obj;
        }
        return null;
    }

    public static List<JSONObject> d(ViewGroup viewGroup) {
        JSONObject data;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("a0af2eb6", new Object[]{viewGroup});
        }
        ArrayList arrayList = new ArrayList();
        if (viewGroup == null) {
            return arrayList;
        }
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (!(!(childAt instanceof DXRootView) || (data = ((DXRootView) childAt).getData()) == null || (jSONObject = data.getJSONObject("fields")) == null)) {
                arrayList.add(jSONObject);
            }
        }
        return arrayList;
    }
}

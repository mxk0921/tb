package tb;

import android.content.Context;
import com.alibaba.android.umf.datamodel.protocol.ultron.Container;
import com.alibaba.android.umf.datamodel.protocol.ultron.UltronProtocol;
import com.alibaba.android.umf.datamodel.protocol.ultron.base.Component;
import com.alibaba.android.umf.datamodel.protocol.ultron.base.ComponentView;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXEngineConfig;
import com.taobao.android.dinamicx.s;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class gm0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(301989912);
    }

    public static DXTemplateItem a(ComponentView componentView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXTemplateItem) ipChange.ipc$dispatch("c35f1710", new Object[]{componentView});
        }
        DXTemplateItem dXTemplateItem = new DXTemplateItem();
        dXTemplateItem.c = componentView.getUrl();
        dXTemplateItem.f7343a = componentView.getName();
        try {
            dXTemplateItem.b = Long.parseLong(componentView.getVersion());
        } catch (Exception e) {
            dXTemplateItem.b = 1L;
            rbb g = ck.g();
            g.b("AliBuyDXEngineWrapper", "convert for template:" + componentView.getName(), e.getMessage());
        }
        return dXTemplateItem;
    }

    public static List<DXTemplateItem> b(List<ComponentView> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("690a7d3c", new Object[]{list});
        }
        ArrayList arrayList = new ArrayList();
        for (ComponentView componentView : list) {
            if (componentView != null) {
                arrayList.add(a(componentView));
            }
        }
        return arrayList;
    }

    public static DXTemplateItem c(String str, List<ComponentView> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXTemplateItem) ipChange.ipc$dispatch("8cd8f199", new Object[]{str, list});
        }
        if (str == null) {
            return null;
        }
        for (ComponentView componentView : list) {
            if (componentView.getType() != null && componentView.getType().contains(str)) {
                return a(componentView);
            }
        }
        return null;
    }

    public static void e(Context context, s sVar, UltronProtocol ultronProtocol) {
        Container container;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("998208a3", new Object[]{context, sVar, ultronProtocol});
        } else if (ultronProtocol == null) {
            ck.g().e("protocol is null");
        } else {
            Map<String, Component> data = ultronProtocol.getData();
            if (!bh.b(data) && (container = ultronProtocol.getContainer()) != null) {
                List<ComponentView> data2 = container.getData();
                if (!bh.a(data2)) {
                    for (String str : data.keySet()) {
                        Component component = data.get(str);
                        if (component != null) {
                            sVar.p(context, c(component.getType(), data2), (JSONObject) JSON.toJSON(component.getFields()), -1, null);
                        }
                    }
                }
            }
        }
    }

    public static void f(s sVar, Container container) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d4ff03e", new Object[]{sVar, container});
        } else if (container == null) {
            ck.g().e("containerCache is null");
        } else {
            List<ComponentView> data = container.getData();
            if (!bh.a(data)) {
                sVar.k().A0(b(data));
            }
        }
    }

    public static s d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (s) ipChange.ipc$dispatch("4afaae9e", new Object[]{context});
        }
        DXEngineConfig.b X = new DXEngineConfig.b("purchase").Q(2).Y("purchase").X(88);
        if (xh.b(context)) {
            X.H(true, true);
        }
        s sVar = new s(X.F());
        sVar.k().T0(new nm0());
        return sVar;
    }
}

package tb;

import com.alibaba.android.ultron.vfw.core.ViewEngine;
import com.alibaba.android.ultron.vfw.instance.a;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.model.UltronTradeHybridStage;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRenderOptions;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.s;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class cdl {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final cdl INSTANCE = new cdl();
    public static final String TAG = "OrderDXPrerender";

    static {
        t2o.a(614465732);
    }

    @JvmStatic
    public static final String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("38a78a1a", new Object[0]);
        }
        String k = uel.k("dxPreRenderWhiteList", "new_babel_orderlistseller,new_babel_orderlistorderop,new_babel_orderlistpay,new_babel_orderlistlogistics,new_babel_orderlistlogistics_waitsend,new_orederlist_waitpay_item,new_babel_orderlist_sendgift_label,new_ol3_repeatBuyComponent");
        ckf.f(k, "OrderOrangeUtil.getStrin…atBuyComponent\"\n        )");
        return k;
    }

    @JvmStatic
    public static final boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9c6aca2c", new Object[0])).booleanValue();
        }
        return uel.l("enableOLDXButter", true);
    }

    public final DXTemplateItem a(JSONObject jSONObject) {
        String string;
        String string2;
        Long o;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXTemplateItem) ipChange.ipc$dispatch("1afee352", new Object[]{this, jSONObject});
        }
        if (jSONObject == null || (string = jSONObject.getString("name")) == null || (string2 = jSONObject.getString("version")) == null || (o = ssq.o(string2)) == null) {
            return null;
        }
        long longValue = o.longValue();
        String string3 = jSONObject.getString("url");
        if (string3 == null) {
            return null;
        }
        DXTemplateItem dXTemplateItem = new DXTemplateItem();
        dXTemplateItem.f7343a = string;
        dXTemplateItem.b = longValue;
        dXTemplateItem.c = string3;
        return dXTemplateItem;
    }

    @JvmStatic
    public static final void d(a aVar) {
        String str;
        jo7 Q;
        s b;
        DinamicXEngine k;
        JSONObject jSONObject;
        et6 z;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e18ec40f", new Object[]{aVar});
            return;
        }
        List<IDMComponent> c = (aVar == null || (z = aVar.z()) == null) ? null : z.c();
        if (c == null || c.size() == 0) {
            hav.d(TAG, "bodyList is empty");
            return;
        }
        List<String> y0 = wsq.y0(b(), new char[]{','}, false, 0, 6, null);
        ArrayList arrayList = new ArrayList(zz3.q(y0, 10));
        for (String str2 : y0) {
            if (str2 != null) {
                arrayList.add(wsq.Q0(str2).toString());
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
            }
        }
        Set G0 = i04.G0(arrayList);
        hav.d(TAG, "preRender start");
        ArrayList arrayList2 = new ArrayList();
        try {
            for (IDMComponent iDMComponent : c) {
                ckf.f(iDMComponent, "component");
                JSONObject containerInfo = iDMComponent.getContainerInfo();
                if (containerInfo == null || (str = containerInfo.getString("name")) == null) {
                    str = "";
                }
                if ("new_babel_orderlistitem".equals(str)) {
                    JSONObject fields = iDMComponent.getFields();
                    String string = (fields == null || (jSONObject = fields.getJSONObject("item")) == null) ? null : jSONObject.getString("pic");
                    if (!(string == null || string.length() == 0)) {
                        arrayList2.add(string);
                    }
                }
                if (G0.contains(str)) {
                    if (ckf.b("new_babel_orderlistseller", str)) {
                        i++;
                    }
                    if (i == 4) {
                        break;
                    }
                    JSONObject containerInfo2 = iDMComponent.getContainerInfo();
                    DXTemplateItem a2 = containerInfo2 != null ? INSTANCE.a(containerInfo2) : null;
                    if (!(iDMComponent.getData() == null || a2 == null)) {
                        DXRenderOptions.b bVar = new DXRenderOptions.b();
                        ViewEngine G = aVar.G();
                        DXRenderOptions.b y = bVar.y(G != null ? G.O() : null);
                        ViewEngine G2 = aVar.G();
                        if (!(G2 == null || (Q = G2.Q()) == null || (b = Q.b()) == null || (k = b.k()) == null)) {
                            k.C0(aVar.getContext(), a2, iDMComponent.getData(), -1, y.q());
                        }
                    }
                    hav.d(TAG, "data or template is null");
                }
            }
        } catch (Throwable unused) {
        }
        hav.d(TAG, "preRender end");
        hav.d(TAG, "prefetchImg");
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put((JSONObject) ccv.PARAM_PREFETCH_IMG_LIST, (String) arrayList2);
        qbv.j().a(UltronTradeHybridStage.ON_TOUCH_DOWN, "mytaobao", jSONObject2);
        hav.g(TAG, "prefetchOLImgOnTouchDown:", "try to prefetch: " + arrayList2);
    }
}

package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRenderOptions;
import com.taobao.android.dinamicx.DXResult;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.DXWidgetRefreshOption;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import tb.qe6;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ikr implements b0d {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile ikr c;

    /* renamed from: a  reason: collision with root package name */
    public DinamicXEngine f21371a;
    public String b = null;

    static {
        t2o.a(295698971);
        t2o.a(806355932);
    }

    public ikr() {
        DinamicXEngine dinamicXEngine = new DinamicXEngine(zvs.a("live").g0(false).F());
        this.f21371a = dinamicXEngine;
        dinamicXEngine.V0(pn5.DX_PARSER_JSONARRAYSTR2TEXTBYKEY, new pn5());
        this.f21371a.V0(ri5.DX_PARSER_CALLFUN, new ri5());
        this.f21371a.V0(fs5.DX_PARSER_TBLIVE_GETSERVERTIME, new fs5());
        this.f21371a.V0(qr5.DX_PARSER_TAOLIVEDXAB, new qr5());
        this.f21371a.W0(ch6.DX_EVENT_TBLIVE_ADDTOCART, new ch6());
        this.f21371a.W0(wg6.DX_EVENT_TBLIVEGOTODETAIL, new wg6());
        this.f21371a.W0(yg6.DX_EVENT_TBLIVEROOMACTION, new yg6());
        this.f21371a.W0(ah6.DX_EVENT_TBLIVESENDDYNAMICMESSAGE, new ah6());
        this.f21371a.W0(qi6.DX_EVENT_TLOPENINTERACTIVECOMPONENT, new qi6());
        this.f21371a.W0(gh6.DX_EVENT_TBLIVE_GOODS_SECKILL_ITEM_ADD, new gh6());
        this.f21371a.W0(eh6.DX_EVENT_TBLIVE_GOODS_EXPLOSION_ITEM_CLICK_EVENT, new eh6());
        this.f21371a.W0(gg6.DX_EVENT_TAOLIVEROOMCOMMONHANDLER, new gg6());
        this.f21371a.W0(ph6.DX_EVENT_TBLIVEGOODCASEGOTODETAIL, new ph6());
        this.f21371a.W0(ih6.DX_EVENT_TBLIVE_GOODS_TOP_CARD, new ih6());
        this.f21371a.W0(kh6.DX_EVENT_TBLIVE_PRESALE, new kh6());
        this.f21371a.e1(qe6.DXTBLTIMER_TBLTIMER, new qe6.b());
        this.f21371a.W0(qf6.DX_EVENT_TAOLIVEANCHORCARDACTION, new qf6());
        this.f21371a.W0(dg6.DX_EVENT_TAOLIVEOFFICIALENTRYCLICK, new dg6());
        this.f21371a.W0(sf6.DX_EVENT_TAOLIVECOMMENTACTION, new sf6());
        this.f21371a.W0(yf6.DX_EVENT_TAOLIVEHOTRESERVATIONCARDACTION, new yf6());
    }

    public static ikr f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ikr) ipChange.ipc$dispatch("badce381", new Object[0]);
        }
        if (c == null) {
            synchronized (ikr.class) {
                try {
                    if (c == null) {
                        c = new ikr();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ee, code lost:
        tb.hha.b("TBLiveGoodsDXManager", "createDX Error : name=" + r8 + " version=" + r9 + " url=" + r13);
        r3.put("name", r8);
        r3.put("version", java.lang.String.valueOf(r9));
        r3.put("url", r13);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.taobao.android.dinamicx.DXRootView a(android.content.Context r12, java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 392
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.ikr.a(android.content.Context, java.lang.String):com.taobao.android.dinamicx.DXRootView");
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        c = null;
        DinamicXEngine dinamicXEngine = this.f21371a;
        if (dinamicXEngine != null) {
            dinamicXEngine.q0();
            this.f21371a = null;
        }
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("653d8cad", new Object[]{this, str});
            return;
        }
        try {
            JSONObject jSONObject = (JSONObject) fkx.a(str);
            if (jSONObject != null) {
                JSONArray jSONArray = jSONObject.getJSONArray("result");
                ArrayList arrayList = new ArrayList();
                Iterator<Object> it = jSONArray.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    String string = ((JSONObject) next).getString("name");
                    String string2 = ((JSONObject) next).getString("url4Android");
                    long longValue = ((JSONObject) next).getLongValue("version4Android");
                    DXTemplateItem dXTemplateItem = new DXTemplateItem();
                    dXTemplateItem.f7343a = string;
                    dXTemplateItem.c = string2;
                    dXTemplateItem.b = longValue;
                    arrayList.add(dXTemplateItem);
                }
                this.f21371a.p(arrayList);
            }
        } catch (Throwable th) {
            hha.b("TBLiveGoodsDXManager", "downloadDX Error: " + th.getMessage());
        }
    }

    public String d(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3eeed052", new Object[]{this, context, str});
        }
        String b = wt2.b(context);
        if (TextUtils.isEmpty(b) && context != null && context.getResources() != null) {
            return wt2.a(context, str);
        }
        hha.c("TBLiveGoodsDXManager", "使用cache预置数据");
        return b;
    }

    public DinamicXEngine e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DinamicXEngine) ipChange.ipc$dispatch("954c806f", new Object[]{this});
        }
        return this.f21371a;
    }

    public void g(DXRootView dXRootView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c287fa53", new Object[]{this, dXRootView});
        } else if (dXRootView != null) {
            this.f21371a.u0(dXRootView);
        }
    }

    public void h(DXRootView dXRootView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("578aec54", new Object[]{this, dXRootView});
        } else if (dXRootView != null) {
            this.f21371a.t0(dXRootView);
        }
    }

    public void i(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b1af98d", new Object[]{this, dXWidgetNode});
        } else {
            this.f21371a.I0(dXWidgetNode, 0, new DXWidgetRefreshOption.a().d(true).a());
        }
    }

    @Deprecated
    public void j(DXRootView dXRootView, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e594c7e", new Object[]{this, dXRootView, jSONObject});
        } else {
            l(dXRootView, jSONObject, null);
        }
    }

    public void k(DXRootView dXRootView, JSONObject jSONObject, DXRenderOptions dXRenderOptions) {
        DXResult<DXRootView> dXResult;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fac21322", new Object[]{this, dXRootView, jSONObject, dXRenderOptions});
            return;
        }
        if (dXRenderOptions == null) {
            dXResult = this.f21371a.j1(dXRootView, jSONObject);
        } else {
            dXResult = this.f21371a.i1(dXRootView.getContext(), dXRootView, dXRootView.getDxTemplateItem(), jSONObject, -1, dXRenderOptions);
        }
        hha.c("TBLiveGoodsDXManager", "renderTime dxTemplateName:" + dXResult.b().toString());
        boolean d = dXResult.d();
        HashMap hashMap = new HashMap();
        if (dXRootView == null || dXRootView.getDxTemplateItem() == null) {
            str = "";
        } else {
            str = dXRootView.getDxTemplateItem().f7343a;
        }
        hashMap.put("name", str);
        if (d) {
            hha.b("TBLiveGoodsDXManager", "renderDX Error:" + dXResult.a().toString());
            igq.n().c(xy.DXMANAGER_RENDER_POINT, fkx.i(hashMap), dXResult.a().toString(), dXResult.a().toString());
            return;
        }
        igq.n().e(xy.DXMANAGER_RENDER_POINT, fkx.i(hashMap));
    }

    public void l(DXRootView dXRootView, JSONObject jSONObject, jxg jxgVar) {
        DXResult<DXRootView> dXResult;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9e15bbe", new Object[]{this, dXRootView, jSONObject, jxgVar});
            return;
        }
        if (jxgVar == null) {
            dXResult = this.f21371a.j1(dXRootView, jSONObject);
        } else {
            dXResult = this.f21371a.i1(dXRootView.getContext(), dXRootView, dXRootView.getDxTemplateItem(), jSONObject, -1, new DXRenderOptions.b().E(jxgVar).q());
        }
        hha.c("TBLiveGoodsDXManager", "renderTime dxTemplateName:" + dXResult.b().toString());
        boolean d = dXResult.d();
        HashMap hashMap = new HashMap();
        if (dXRootView == null || dXRootView.getDxTemplateItem() == null) {
            str = "";
        } else {
            str = dXRootView.getDxTemplateItem().f7343a;
        }
        hashMap.put("name", str);
        if (d) {
            hha.b("TBLiveGoodsDXManager", "renderDX Error:" + dXResult.a().toString());
            igq.n().c(xy.DXMANAGER_RENDER_POINT, fkx.i(hashMap), dXResult.a().toString(), dXResult.a().toString());
            return;
        }
        igq.n().e(xy.DXMANAGER_RENDER_POINT, fkx.i(hashMap));
    }

    public void m(DXRootView dXRootView, JSONObject jSONObject, xea xeaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5be59256", new Object[]{this, dXRootView, jSONObject, xeaVar});
        } else {
            l(dXRootView, jSONObject, new jxg(xeaVar));
        }
    }

    public void n(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("722234fe", new Object[]{this, str});
        } else if (yga.P()) {
            this.b = str;
        }
    }

    @Override // tb.b0d
    public void onError(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
        } else {
            onSystemError(i, netResponse, obj);
        }
    }

    @Override // tb.b0d
    public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
        } else if (netResponse != null && netResponse.getDataJsonObject() != null) {
            String jSONObject = netResponse.getDataJsonObject().toString();
            JSONObject jSONObject2 = (JSONObject) fkx.a(jSONObject);
            if (jSONObject2 == null || jSONObject2.getJSONArray("result") == null || jSONObject2.getJSONArray("result").isEmpty()) {
                String d = d(null, "template_list.json");
                if (!TextUtils.isEmpty(d)) {
                    c(d);
                    return;
                }
                return;
            }
            this.b = jSONObject;
            c(jSONObject);
            if (!TextUtils.isEmpty(this.b)) {
                wt2.c(null, this.b);
            }
        }
    }

    @Override // tb.b0d
    public void onSystemError(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
            return;
        }
        String str = "onSystemError";
        String responseCode = netResponse != null ? netResponse.getResponseCode() : str;
        if (netResponse != null) {
            str = netResponse.getRetMsg();
        }
        hha.b("TBLiveGoodsDXManager", "errorCode = " + responseCode + " , errorMsg = " + str);
    }
}

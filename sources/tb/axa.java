package tb;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXEngineConfig;
import com.taobao.android.dinamicx.DXRenderOptions;
import com.taobao.android.dinamicx.DXResult;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.codetrack.sdk.assets.AssetsDelegate;
import com.taobao.taolive.movehighlight.dx.widget.scrollerLayout.DXHighlightScrollableLayoutWidgetNode;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import tb.n06;
import tb.q06;
import tb.s06;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class axa implements b0d, pcc {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String e = axa.class.getSimpleName();
    public static axa f;

    /* renamed from: a  reason: collision with root package name */
    public DinamicXEngine f16057a;
    public Context b;
    public ywa c;
    public String d = null;

    static {
        t2o.a(779092624);
        t2o.a(806355932);
        t2o.a(806355712);
    }

    public axa() {
        DinamicXEngine dinamicXEngine = new DinamicXEngine(new DXEngineConfig("live_highlight"));
        this.f16057a = dinamicXEngine;
        dinamicXEngine.W0(p06.DX_EVENT_HIGHLIGHTSCROLLABLEONLOADMORE, new p06());
        this.f16057a.W0(mh6.DX_EVENT_TBLIVE_TIMESHIFT_CUSTOM, new mh6());
        this.f16057a.W0(r06.DX_EVENT_HIGHLIGHTTRACKUTILS, new r06());
        this.f16057a.W0(nh6.DX_EVENT_TBLIVE_TIMEMOVE_SECKILL_ITEM_ADD, new nh6());
        this.f16057a.e1(DXHighlightScrollableLayoutWidgetNode.DXHIGHLIGHTSCROLLABLELAYOUT_HIGHLIGHTSCROLLABLELAYOUT, new DXHighlightScrollableLayoutWidgetNode.e());
        this.f16057a.e1(q06.DXHIGHLIGHTSTRUCTLISTVIEW_HIGHLIGHTSTRUCTLISTVIEW, new q06.a());
        this.f16057a.e1(s06.DXHIGLIGHTPLAYERCONTROLLERNEW_HIGLIGHTPLAYERCONTROLLERNEW, new s06.a());
        this.f16057a.e1(n06.DXHIGHLIGHTCONTENTVIEW_HIGHLIGHTCONTENTVIEW, new n06.a());
        d9m.n().getGoodHandlerProxy().b(this.f16057a);
        this.f16057a.V0(qm5.DX_PARSER_HIGHLIGHTSTRTOMAP, new qm5());
        this.f16057a.V0(pm5.DX_PARSER_HIGHLIGHTABCONFIG, new pm5());
        this.f16057a.V0(rm5.DX_PARSER_HIGHLIGHT_STRUCT_JSON_STR, new rm5());
        d9m.n().getGoodHandlerProxy().d(this.f16057a);
        d9m.n().getGoodHandlerProxy().i(this.f16057a);
        d9m.n().getGoodHandlerProxy().a(this.f16057a);
    }

    public static axa f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (axa) ipChange.ipc$dispatch("264f1b3", new Object[0]);
        }
        if (f == null) {
            synchronized (axa.class) {
                f = new axa();
            }
        }
        return f;
    }

    public DXRootView a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRootView) ipChange.ipc$dispatch("e00af95c", new Object[]{this, context, str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("name", str);
        if (TextUtils.isEmpty(this.d)) {
            this.d = d(context);
        }
        if (TextUtils.isEmpty(this.d)) {
            igq.n().c("Highlight_DXManager_Create_Point", fkx.i(hashMap), "mTemplateString", "mTemplateString");
            return null;
        }
        try {
            JSONObject d = fkx.d(this.d);
            if (d == null) {
                igq.n().c("Highlight_DXManager_Create_Point", fkx.i(hashMap), "parseObject", "parseObject");
                return null;
            }
            Iterator<Object> it = d.getJSONArray("result").iterator();
            while (it.hasNext()) {
                Object next = it.next();
                String string = ((JSONObject) next).getString("name");
                if (str.equals(string)) {
                    String string2 = ((JSONObject) next).getString("url4Android");
                    long longValue = ((JSONObject) next).getLongValue("version4Android");
                    String str2 = e;
                    Log.e(str2, string + string2 + longValue);
                    DXTemplateItem dXTemplateItem = new DXTemplateItem();
                    dXTemplateItem.f7343a = string;
                    dXTemplateItem.c = string2;
                    dXTemplateItem.b = longValue;
                    DXResult<DXRootView> o = this.f16057a.o(context, this.f16057a.u(dXTemplateItem));
                    if (o.d()) {
                        igq.n().c("Highlight_DXManager_Create_Point", fkx.i(hashMap), o.toString(), o.toString());
                    } else {
                        igq.n().e("Highlight_DXManager_Create_Point", fkx.i(hashMap));
                    }
                    return o.f7291a;
                }
            }
            igq.n().c("Highlight_DXManager_Create_Point", fkx.i(hashMap), "null", "null");
            return null;
        } catch (Throwable unused) {
            igq.n().c("Highlight_DXManager_Create_Point", fkx.i(hashMap), "try_catch", "try_catch");
            return null;
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        ywa ywaVar = this.c;
        if (ywaVar != null) {
            ywaVar.destroy();
            this.c = null;
        }
        this.b = null;
        f = null;
        DinamicXEngine dinamicXEngine = this.f16057a;
        if (dinamicXEngine != null) {
            dinamicXEngine.q0();
            this.f16057a = null;
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
                this.f16057a.p(arrayList);
            }
        } catch (Throwable th) {
            cwd A = v2s.o().A();
            A.c("downloadDX", "downloadDX error " + th.toString());
        }
    }

    public String d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("afe743dc", new Object[]{this, context});
        }
        String e2 = e(context);
        if (!TextUtils.isEmpty(e2) || context == null || context.getResources() == null) {
            return e2;
        }
        try {
            InputStream proxy_open = AssetsDelegate.proxy_open(context.getResources().getAssets(), "highlight_template_list.json");
            InputStreamReader inputStreamReader = new InputStreamReader(proxy_open, "UTF-8");
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            StringBuilder sb = new StringBuilder();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb.append(readLine + "\n");
                } else {
                    bufferedReader.close();
                    inputStreamReader.close();
                    proxy_open.close();
                    return sb.toString();
                }
            }
        } catch (Exception e3) {
            e3.printStackTrace();
            e3.toString();
            return "";
        }
    }

    public String e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c63f97d", new Object[]{this, context});
        }
        try {
            return rg9.a(context.getCacheDir().getPath(), "highlight_template_list.json");
        } catch (Exception unused) {
            return null;
        }
    }

    public void g(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
            return;
        }
        this.b = context;
        DinamicXEngine dinamicXEngine = this.f16057a;
        if (!(dinamicXEngine == null || dinamicXEngine.d() == null)) {
            if (vc.a() && vc.i(this.b)) {
                this.f16057a.d().b(true, true);
            }
            if (vc.a() && vc.d(this.b)) {
                this.f16057a.d().a(true);
            }
        }
        ywa ywaVar = this.c;
        if (ywaVar != null) {
            ywaVar.destroy();
        }
        ywa ywaVar2 = new ywa(this);
        this.c = ywaVar2;
        ywaVar2.K();
    }

    public void h(DXRootView dXRootView, JSONObject jSONObject, ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10c43071", new Object[]{this, dXRootView, jSONObject, ux9Var});
        } else if (ux9Var == null) {
            DinamicXEngine dinamicXEngine = this.f16057a;
            if (dinamicXEngine != null) {
                dinamicXEngine.j1(dXRootView, jSONObject);
            }
        } else {
            DXRenderOptions q = new DXRenderOptions.b().E(new zwa(ux9Var)).q();
            DinamicXEngine dinamicXEngine2 = this.f16057a;
            if (dinamicXEngine2 != null && dXRootView != null) {
                dinamicXEngine2.i1(dXRootView.getContext(), dXRootView, dXRootView.getDxTemplateItem(), jSONObject, -1, q);
            }
        }
    }

    public void i(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f95f399", new Object[]{this, context, str});
            return;
        }
        try {
            rg9.b(context.getCacheDir().getPath(), "highlight_template_list.json", str);
        } catch (Exception unused) {
        }
    }

    @Override // tb.b0d
    public void onError(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
        } else {
            Log.e(e, "onError");
        }
    }

    @Override // tb.b0d
    public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
            return;
        }
        String str = e;
        Log.e(str, "onSuccess");
        if (netResponse != null && netResponse.getDataJsonObject() != null) {
            String jSONObject = netResponse.getDataJsonObject().toString();
            JSONObject jSONObject2 = (JSONObject) fkx.a(jSONObject);
            if (jSONObject2 == null || jSONObject2.getJSONArray("result") == null || jSONObject2.getJSONArray("result").isEmpty()) {
                String d = d(this.b);
                if (!TextUtils.isEmpty(d)) {
                    c(d);
                    return;
                }
                return;
            }
            this.d = jSONObject;
            c(jSONObject);
            if (TextUtils.isEmpty(this.d) || this.d.equals(d(this.b))) {
                Log.e(str, "mTemplateString is null OR same cache");
            } else {
                i(this.b, this.d);
            }
        }
    }

    @Override // tb.b0d
    public void onSystemError(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
        }
    }
}

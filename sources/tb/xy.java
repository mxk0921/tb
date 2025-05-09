package tb;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
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
import com.taobao.tao.log.TLog;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import tb.w26;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public abstract class xy implements b0d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DXImageBizId = 3101;
    public static final String DXMANAGER_CREATE_POINT = "DXManager_Create_Point";
    public static final String DXMANAGER_RENDER_POINT = "DXManager_Render_Point";

    /* renamed from: a  reason: collision with root package name */
    public DinamicXEngine f31671a;
    public fjt d;
    public Context e;
    public volatile boolean b = false;
    public final ArrayList<c> c = new ArrayList<>();
    public volatile String f = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements iwb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.iwb
        public void onNotificationListener(k66 k66Var) {
            List<DXTemplateItem> list;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2f1f5baf", new Object[]{this, k66Var});
            } else if (k66Var != null && (list = k66Var.f22428a) != null && !list.isEmpty()) {
                for (DXTemplateItem dXTemplateItem : k66Var.f22428a) {
                    if (dXTemplateItem != null) {
                        Iterator<c> it = xy.this.c.iterator();
                        while (it.hasNext()) {
                            c next = it.next();
                            if (next != null && next.b(dXTemplateItem.f7343a)) {
                                next.a();
                            }
                        }
                    }
                }
                for (DXTemplateItem dXTemplateItem2 : k66Var.b) {
                    if (dXTemplateItem2 != null) {
                        Iterator<c> it2 = xy.this.c.iterator();
                        while (it2.hasNext()) {
                            c next2 = it2.next();
                            if (next2 != null && next2.b(dXTemplateItem2.f7343a)) {
                                next2.a();
                            }
                        }
                    }
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b implements ra6 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b(xy xyVar) {
        }

        @Override // tb.ra6
        public long a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("403ecf43", new Object[]{this})).longValue();
            }
            return pfa.m();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f31673a;
        public final bvb b;
        public final Context c;
        public final xy d;
        public final Runnable e;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    c.this.a();
                }
            }
        }

        static {
            t2o.a(779092947);
        }

        public c(xy xyVar, Context context, String str, bvb bvbVar, xy xyVar2) {
            a aVar = new a();
            this.e = aVar;
            this.c = context;
            this.f31673a = str;
            this.b = bvbVar;
            this.d = xyVar2;
            new Handler(Looper.getMainLooper()).postDelayed(aVar, 3000L);
        }

        public void a() {
            Context context;
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("40471717", new Object[]{this});
                return;
            }
            xy xyVar = this.d;
            if (xyVar != null && (context = this.c) != null && (str = this.f31673a) != null && this.b != null) {
                this.b.a(xyVar.a(context, str));
                this.d.c.remove(this);
                new Handler(Looper.getMainLooper()).removeCallbacks(this.e);
            }
        }

        public boolean b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("375dedca", new Object[]{this, str})).booleanValue();
            }
            return TextUtils.equals(this.f31673a, str);
        }
    }

    static {
        t2o.a(779092944);
        t2o.a(806355932);
    }

    public xy() {
        DinamicXEngine dinamicXEngine = new DinamicXEngine(zvs.a(f()).X(3101).g0(false).F());
        this.f31671a = dinamicXEngine;
        dinamicXEngine.a1(new a());
        d9m.n().getGoodHandlerProxy().a(this.f31671a);
        d9m.n().getGoodHandlerProxy().i(this.f31671a);
        d9m.n().getGoodHandlerProxy().g(this.f31671a);
        d9m.n().getGoodHandlerProxy().h(this.f31671a);
        d9m.n().getGoodHandlerProxy().j(this.f31671a);
        d9m.n().getGoodHandlerProxy().f(this.f31671a);
        d9m.n().getGoodHandlerProxy().e(this.f31671a);
        this.f31671a.e1(w26.DXLIVECOUNTDOWNVIEW_LIVECOUNTDOWNVIEW, new w26.b());
        this.f31671a.W0(5360605235400031797L, new qg6());
        this.f31671a.T0(new b(this));
        d9m.n().getGoodHandlerProxy().c(this.f31671a);
        this.f31671a.W0(wf6.DX_EVENT_TAOLIVEHOMETABCLICK, new wf6());
        this.f31671a.W0(lh6.DX_EVENT_TBLIVE_ROOM_SET_FAVORITE, new lh6());
        this.f31671a.W0(py5.DX_EVENT_GROWTHTAP, new py5());
        this.f31671a.W0(eg6.DX_EVENT_TAOLIVERECOMMENDCARDGOODSACTION, new eg6());
        this.f31671a.W0(zf6.DX_EVENT_TAOLIVEHOTRESERVATIONSWITCHCARDACTION, new zf6());
        this.f31671a.W0(((Long) d9m.B().getRankEntranceDXHandler().first).longValue(), (mvb) d9m.B().getRankEntranceDXHandler().second);
        d9m.p().registerEventHandlerAndWidget(this.f31671a);
        this.f31671a.W0(((Long) d9m.x().getOfficialLiveEntryDXHandler().first).longValue(), (mvb) d9m.x().getOfficialLiveEntryDXHandler().second);
        if (d9m.A().getProjectScreenDXHandler() != null) {
            this.f31671a.W0(((Long) d9m.A().getProjectScreenDXHandler().first).longValue(), (mvb) d9m.A().getProjectScreenDXHandler().second);
        }
        this.f31671a.V0(ns5.DX_PARSER_TBLVSCREENHEIGHT, new ns5());
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
        if (TextUtils.isEmpty(this.f)) {
            this.f = e(context);
        }
        if (TextUtils.isEmpty(this.f)) {
            igq.n().c(DXMANAGER_CREATE_POINT, fkx.i(hashMap), "mTemplateString", "mTemplateString");
            return null;
        }
        try {
            JSONObject d = fkx.d(this.f);
            if (d == null) {
                igq.n().c(DXMANAGER_CREATE_POINT, fkx.i(hashMap), "parseObject", "parseObject");
                return null;
            }
            Iterator<Object> it = d.getJSONArray("result").iterator();
            while (it.hasNext()) {
                Object next = it.next();
                String string = ((JSONObject) next).getString("name");
                if (str.equals(string)) {
                    String string2 = ((JSONObject) next).getString("url4Android");
                    long longValue = ((JSONObject) next).getLongValue("version4Android");
                    Log.e("DXManager", string + string2 + longValue);
                    DXTemplateItem dXTemplateItem = new DXTemplateItem();
                    dXTemplateItem.f7343a = string;
                    dXTemplateItem.c = string2;
                    dXTemplateItem.b = longValue;
                    DXResult<DXRootView> o = this.f31671a.o(context, this.f31671a.u(dXTemplateItem));
                    if (o.d()) {
                        igq.n().c(DXMANAGER_CREATE_POINT, fkx.i(hashMap), o.toString(), o.toString());
                    } else {
                        igq.n().e(DXMANAGER_CREATE_POINT, fkx.i(hashMap));
                    }
                    return o.f7291a;
                }
            }
            igq.n().c(DXMANAGER_CREATE_POINT, fkx.i(hashMap), "null", "null");
            return null;
        } catch (Throwable unused) {
            igq.n().c(DXMANAGER_CREATE_POINT, fkx.i(hashMap), "try_catch", "try_catch");
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c6, code lost:
        r11.a(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c9, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(android.content.Context r9, java.lang.String r10, tb.bvb r11) {
        /*
            r8 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tb.xy.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x001b
            java.lang.String r1 = "8e5ba4c6"
            r2 = 4
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r8
            r3 = 1
            r2[r3] = r9
            r9 = 2
            r2[r9] = r10
            r9 = 3
            r2[r9] = r11
            r0.ipc$dispatch(r1, r2)
            return
        L_0x001b:
            java.lang.String r0 = r8.f
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L_0x0027
            java.lang.String r0 = r8.e(r9)
        L_0x0027:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L_0x0043
            boolean r1 = r8.b
            if (r1 != 0) goto L_0x0043
            java.util.ArrayList<tb.xy$c> r0 = r8.c
            tb.xy$c r7 = new tb.xy$c
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            r0.add(r7)
            goto L_0x00c3
        L_0x0043:
            com.taobao.android.dinamicx.DXRootView r1 = r8.a(r9, r10)
            if (r1 == 0) goto L_0x0050
            if (r11 == 0) goto L_0x00c3
            r11.a(r1)
            goto L_0x00c3
        L_0x0050:
            r1 = 0
            java.lang.Object r0 = tb.fkx.a(r0)     // Catch: all -> 0x00b1
            com.alibaba.fastjson.JSONObject r0 = (com.alibaba.fastjson.JSONObject) r0     // Catch: all -> 0x00b1
            if (r0 == 0) goto L_0x00c4
            boolean r2 = android.text.TextUtils.isEmpty(r10)     // Catch: all -> 0x00b1
            if (r2 == 0) goto L_0x0060
            goto L_0x00c4
        L_0x0060:
            java.lang.String r2 = "result"
            com.alibaba.fastjson.JSONArray r0 = r0.getJSONArray(r2)     // Catch: all -> 0x00b1
            java.util.Iterator r0 = r0.iterator()     // Catch: all -> 0x00b1
        L_0x006b:
            boolean r2 = r0.hasNext()     // Catch: all -> 0x00b1
            if (r2 == 0) goto L_0x00b3
            java.lang.Object r2 = r0.next()     // Catch: all -> 0x00b1
            r3 = r2
            com.alibaba.fastjson.JSONObject r3 = (com.alibaba.fastjson.JSONObject) r3     // Catch: all -> 0x00b1
            java.lang.String r4 = "name"
            java.lang.String r3 = r3.getString(r4)     // Catch: all -> 0x00b1
            r4 = r2
            com.alibaba.fastjson.JSONObject r4 = (com.alibaba.fastjson.JSONObject) r4     // Catch: all -> 0x00b1
            java.lang.String r5 = "url4Android"
            java.lang.String r4 = r4.getString(r5)     // Catch: all -> 0x00b1
            com.alibaba.fastjson.JSONObject r2 = (com.alibaba.fastjson.JSONObject) r2     // Catch: all -> 0x00b1
            java.lang.String r5 = "version4Android"
            long r5 = r2.getLongValue(r5)     // Catch: all -> 0x00b1
            boolean r2 = android.text.TextUtils.equals(r10, r3)     // Catch: all -> 0x00b1
            if (r2 == 0) goto L_0x006b
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: all -> 0x00b1
            r0.<init>()     // Catch: all -> 0x00b1
            com.taobao.android.dinamicx.template.download.DXTemplateItem r2 = new com.taobao.android.dinamicx.template.download.DXTemplateItem     // Catch: all -> 0x00b1
            r2.<init>()     // Catch: all -> 0x00b1
            r2.f7343a = r3     // Catch: all -> 0x00b1
            r2.c = r4     // Catch: all -> 0x00b1
            r2.b = r5     // Catch: all -> 0x00b1
            r0.add(r2)     // Catch: all -> 0x00b1
            com.taobao.android.dinamicx.DinamicXEngine r2 = r8.f31671a     // Catch: all -> 0x00b1
            r2.p(r0)     // Catch: all -> 0x00b1
            goto L_0x00b3
        L_0x00b1:
            goto L_0x00ca
        L_0x00b3:
            java.util.ArrayList<tb.xy$c> r0 = r8.c
            tb.xy$c r7 = new tb.xy$c
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            r0.add(r7)
        L_0x00c3:
            return
        L_0x00c4:
            if (r11 == 0) goto L_0x00c9
            r11.a(r1)     // Catch: all -> 0x00b1
        L_0x00c9:
            return
        L_0x00ca:
            if (r11 == 0) goto L_0x00cf
            r11.a(r1)
        L_0x00cf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.xy.b(android.content.Context, java.lang.String, tb.bvb):void");
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        fjt fjtVar = this.d;
        if (fjtVar != null) {
            fjtVar.destroy();
            this.d = null;
        }
        this.e = null;
        DinamicXEngine dinamicXEngine = this.f31671a;
        if (dinamicXEngine != null) {
            dinamicXEngine.q0();
            this.f31671a = null;
        }
        if (pvs.W()) {
            d9m.n().destroyDXManger();
        }
        axa.f().b();
    }

    public void d(String str) {
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
                this.f31671a.p(arrayList);
            }
        } catch (Throwable th) {
            cwd A = v2s.o().A();
            A.c("downloadDX", "downloadDX error " + th.toString());
        }
    }

    public String e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("afe743dc", new Object[]{this, context});
        }
        String a2 = yt2.a(context);
        if (!TextUtils.isEmpty(a2) || context == null || context.getResources() == null) {
            return a2;
        }
        try {
            InputStream proxy_open = AssetsDelegate.proxy_open(context.getResources().getAssets(), "template_list.json");
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
        } catch (Exception e) {
            e.printStackTrace();
            e.toString();
            return "";
        }
    }

    public abstract String f();

    public void g(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
            return;
        }
        this.e = context;
        DinamicXEngine dinamicXEngine = this.f31671a;
        if (dinamicXEngine != null) {
            DXEngineConfig d = dinamicXEngine.d();
            if (vc.a() && vc.i(this.e)) {
                d.b(true, true);
            }
            if (!d4s.e(d4s.SWITCH_ENABLE_T_DX_CONFIG, true) && vc.a() && vc.d(this.e)) {
                d.a(true);
            }
        }
        fjt fjtVar = this.d;
        if (fjtVar != null) {
            fjtVar.destroy();
        }
        fjt fjtVar2 = new fjt(this);
        this.d = fjtVar2;
        fjtVar2.K();
        axa.f().g(context);
    }

    public void h(DXRootView dXRootView, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e594c7e", new Object[]{this, dXRootView, jSONObject});
        } else {
            i(dXRootView, jSONObject, null);
        }
    }

    public void i(DXRootView dXRootView, JSONObject jSONObject, DXRenderOptions dXRenderOptions) {
        DXResult<DXRootView> dXResult;
        String str;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fac21322", new Object[]{this, dXRootView, jSONObject, dXRenderOptions});
            return;
        }
        if (dXRenderOptions == null) {
            dXResult = this.f31671a.j1(dXRootView, jSONObject);
        } else {
            dXResult = this.f31671a.i1(dXRootView.getContext(), dXRootView, dXRootView.getDxTemplateItem(), jSONObject, -1, dXRenderOptions);
        }
        if (dXResult != null) {
            z = dXResult.d();
        }
        HashMap hashMap = new HashMap();
        if (dXRootView == null || dXRootView.getDxTemplateItem() == null) {
            str = "";
        } else {
            str = dXRootView.getDxTemplateItem().f7343a;
        }
        hashMap.put("name", str);
        if (z) {
            igq.n().c(DXMANAGER_RENDER_POINT, fkx.i(hashMap), dXResult.toString(), dXResult.toString());
        } else {
            igq.n().e(DXMANAGER_RENDER_POINT, fkx.i(hashMap));
        }
    }

    @Override // tb.b0d
    public void onError(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
            return;
        }
        Log.e("DXManager", "onError");
        this.b = true;
        Iterator<c> it = this.c.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    @Override // tb.b0d
    public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
            return;
        }
        TLog.loge("tblive", "DXManager", "onSuccess, " + Thread.currentThread().getName());
        this.b = true;
        if (netResponse != null && netResponse.getDataJsonObject() != null) {
            String jSONObject = netResponse.getDataJsonObject().toString();
            JSONObject jSONObject2 = (JSONObject) fkx.a(jSONObject);
            if (jSONObject2 == null || jSONObject2.getJSONArray("result") == null || jSONObject2.getJSONArray("result").isEmpty()) {
                String e = e(this.e);
                if (!TextUtils.isEmpty(e)) {
                    d(e);
                    return;
                }
                return;
            }
            this.f = jSONObject;
            d9m.n().setTemplateString(this.f);
            d(this.f);
            if (TextUtils.isEmpty(this.f) || this.f.equals(e(this.e))) {
                Log.e("DXManager", "mTemplateString is null OR same cache");
            } else {
                yt2.b(this.e, this.f);
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
        this.b = true;
        Log.e("DXManager", "onError");
        Iterator<c> it = this.c.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }
}

package com.taobao.tao.flexbox.layoutmanager.container.dx;

import android.os.Handler;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.android.ugc.h5.WVMicorPublishPlugin;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import tb.ckf;
import tb.d1a;
import tb.g1a;
import tb.ggs;
import tb.n38;
import tb.t2o;
import tb.tfs;
import tb.vfs;
import tb.w1a;
import tb.wnf;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class DxTemplateVersionManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int STRATEGY_DOWN_RENDER = 2;
    public static final int STRATEGY_ONLY_DOWN = 1;
    public static Handler c;
    public static boolean e;
    public static long f;
    public static final DxTemplateVersionManager INSTANCE = new DxTemplateVersionManager();

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, wnf> f12180a = new LinkedHashMap();
    public static final Map<String, List<w1a<wnf, Boolean, Integer, xhv>>> b = new LinkedHashMap();
    public static int d = 1;
    public static final d1a<xhv> g = DxTemplateVersionManager$syncRunnable$1.INSTANCE;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a implements vfs.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final a INSTANCE = new a();

        /* compiled from: Taobao */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        /* renamed from: com.taobao.tao.flexbox.layoutmanager.container.dx.DxTemplateVersionManager$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public static final class RunnableC0689a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ String f12181a;

            public RunnableC0689a(String str) {
                this.f12181a = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    DxTemplateVersionManager.a(DxTemplateVersionManager.INSTANCE, this.f12181a);
                }
            }
        }

        @Override // tb.vfs.b
        public final void a(String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1ea082d8", new Object[]{this, str, str2, str3});
            } else {
                DxTemplateVersionManager.b(DxTemplateVersionManager.INSTANCE).postDelayed(new RunnableC0689a(str3), 1000L);
            }
        }
    }

    static {
        t2o.a(502268266);
    }

    public static final /* synthetic */ void a(DxTemplateVersionManager dxTemplateVersionManager, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ed6a195", new Object[]{dxTemplateVersionManager, str});
        } else {
            dxTemplateVersionManager.d(str);
        }
    }

    public static final /* synthetic */ Handler b(DxTemplateVersionManager dxTemplateVersionManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("dbf8ab75", new Object[]{dxTemplateVersionManager});
        }
        return dxTemplateVersionManager.e();
    }

    public static final /* synthetic */ void c(DxTemplateVersionManager dxTemplateVersionManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c42651c2", new Object[]{dxTemplateVersionManager});
        } else {
            dxTemplateVersionManager.o();
        }
    }

    public final Handler e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("b90bbf7d", new Object[]{this});
        }
        Handler handler = c;
        if (handler != null) {
            return handler;
        }
        Handler handler2 = new Handler();
        c = handler2;
        return handler2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [tb.n38] */
    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66fdfd51", new Object[]{this});
            return;
        }
        e().removeCallbacksAndMessages(null);
        Handler e2 = e();
        d1a<xhv> d1aVar = g;
        if (d1aVar != null) {
            d1aVar = new n38(d1aVar);
        }
        e2.postDelayed((Runnable) d1aVar, 1000L);
    }

    public final void g(g1a<? super wnf, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f547ea4", new Object[]{this, g1aVar});
            return;
        }
        ckf.g(g1aVar, "call");
        for (Object obj : ((LinkedHashMap) f12180a).values()) {
            g1aVar.invoke(obj);
        }
    }

    public final String h(List<? extends DXTemplateItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6ab55acc", new Object[]{this, list});
        }
        StringBuilder sb = new StringBuilder();
        for (DXTemplateItem dXTemplateItem : list) {
            sb.append(dXTemplateItem.toString());
            sb.append(";");
        }
        String sb2 = sb.toString();
        ckf.f(sb2, "stringBuilder.toString()");
        return sb2;
    }

    public final wnf i(JSONObject jSONObject) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wnf) ipChange.ipc$dispatch("3d7a39da", new Object[]{this, jSONObject});
        }
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject("item");
            DXTemplateItem dXTemplateItem = new DXTemplateItem();
            String str2 = "";
            if (jSONObject2 == null || (str = jSONObject2.getString("name")) == null) {
                str = str2;
            }
            dXTemplateItem.f7343a = str;
            String string = jSONObject2.getString(WVMicorPublishPlugin.TEMPLATE_URL);
            if (string != null) {
                str2 = string;
            }
            dXTemplateItem.c = str2;
            Long l = jSONObject2.getLong("version");
            dXTemplateItem.b = l != null ? l.longValue() : 0L;
            String str3 = dXTemplateItem.f7343a;
            ckf.f(str3, "dxTemplateItem.name");
            long j = dXTemplateItem.b;
            String str4 = dXTemplateItem.c;
            ckf.f(str4, "dxTemplateItem.templateUrl");
            return new wnf(str3, j, str4, -1L, "");
        } catch (Throwable unused) {
            return null;
        }
    }

    public final void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edbf76d5", new Object[]{this});
        } else if (!e) {
            l();
            m();
            n();
            e = true;
        }
    }

    public final List<DXTemplateItem> k(String str) {
        JSONObject jSONObject;
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("2d070013", new Object[]{this, str});
        }
        ArrayList arrayList = new ArrayList();
        try {
            Object parse = JSON.parse(str);
            if (parse != null && (parse instanceof JSONArray)) {
                for (Object obj2 : (JSONArray) parse) {
                    if (!(obj2 == null || !(obj2 instanceof JSONObject) || (obj = (jSONObject = (JSONObject) obj2).get("name")) == null)) {
                        DXTemplateItem dXTemplateItem = new DXTemplateItem();
                        dXTemplateItem.f7343a = (String) obj;
                        Object obj3 = jSONObject.get("version");
                        if (obj3 == null) {
                            obj3 = "0";
                        }
                        dXTemplateItem.b = Long.parseLong((String) obj3);
                        Object obj4 = jSONObject.get("url");
                        if (obj4 == null) {
                            obj4 = "";
                        }
                        dXTemplateItem.c = (String) obj4;
                        xhv xhvVar = xhv.INSTANCE;
                        arrayList.add(dXTemplateItem);
                    }
                }
            }
        } catch (Throwable unused) {
            tfs.d("orange 配置读取出错");
        }
        return arrayList;
    }

    public final void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5febb009", new Object[]{this});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        tfs.e("DxTemplateVersionManager", "readConfigsFromDisk :" + currentTimeMillis);
        try {
            Object a2 = ggs.a("guangguang_local_dx_version");
            if (a2 != null) {
                String str = (String) a2;
                tfs.e("DxTemplateVersionManager", "readConfigsFromDisk configString:".concat(str));
                JSONObject parseObject = JSON.parseObject(str);
                ckf.f(parseObject, "JSONObject.parseObject(configString)");
                for (Map.Entry<String, Object> entry : parseObject.entrySet()) {
                    DxTemplateVersionManager dxTemplateVersionManager = INSTANCE;
                    Object value = entry.getValue();
                    if (value != null) {
                        wnf i = dxTemplateVersionManager.i((JSONObject) value);
                        if (i != null) {
                            Map<String, wnf> map = f12180a;
                            String key = entry.getKey();
                            ckf.f(key, "it.key");
                            map.put(key, i);
                        }
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type com.alibaba.fastjson.JSONObject");
                    }
                }
                f = System.currentTimeMillis() - currentTimeMillis;
                tfs.e("DxTemplateVersionManager", "readConfigsFromDisk 解析结束，解析出" + f12180a.size() + "个数据，耗时：" + f);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        } catch (Throwable th) {
            tfs.e("DxTemplateVersionManager", "从磁盘读取本地DX版本失效,异常：" + th.getMessage());
        }
    }

    public final void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ef1b010", new Object[]{this});
            return;
        }
        String e2 = vfs.g().e("weitao_switch", "DX_template", "");
        tfs.e("DxTemplateVersionManager", "startPrefetch: 拉取到的orange配置为：" + e2);
        d(e2);
        vfs.g().p("weitao_switch", "DX_template", a.INSTANCE);
    }

    public final void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1cbc688", new Object[]{this});
            return;
        }
        try {
            String e2 = vfs.g().e("weitao_switch", "dxVersionStrategy", "1");
            ckf.f(e2, "orangeStrategy");
            d = Integer.parseInt(e2);
            tfs.e("DxTemplateVersionManager", "orange 上的策略配置为：" + d);
        } catch (Throwable unused) {
            tfs.e("DxTemplateVersionManager", "拉取并解析Orange 配置失败，请检查Orange配置");
        }
    }

    public final void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b8ff43a", new Object[]{this});
            return;
        }
        tfs.e("DxTemplateVersionManager", "syncToDisk ");
        String jSONString = JSON.toJSONString(f12180a);
        tfs.e("DxTemplateVersionManager", "syncToDisk localConfigs:" + jSONString);
        ggs.e("guangguang_local_dx_version", jSONString);
    }

    public final void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c92638d", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            ckf.d(str);
            List<DXTemplateItem> k = k(str);
            tfs.e(DxPreloadExecutor.TAG, "startReadFromOrange: 解析出的配置个数：" + k.size() + "信息如下:" + h(k));
            for (DXTemplateItem dXTemplateItem : k) {
                DxTemplateVersionManager dxTemplateVersionManager = INSTANCE;
                String str2 = dXTemplateItem.f7343a;
                ckf.f(str2, "it.name");
                long j = dXTemplateItem.b;
                String str3 = dXTemplateItem.c;
                ckf.f(str3, "it.templateUrl");
                dxTemplateVersionManager.p(new wnf(str2, j, str3, -1L, ""), true);
            }
            f();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0070, code lost:
        if (r2.c() != r9.c()) goto L_0x0072;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0072, code lost:
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0081, code lost:
        if (r2.c() < r9.c()) goto L_0x0072;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0084, code lost:
        tb.tfs.e("DxTemplateVersionManager", "versionCheck" + r1 + ",url判断：" + (true ^ tb.ckf.b(r2.e(), r9.e())));
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00ab, code lost:
        if (r1 != false) goto L_0x00bb;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00b9, code lost:
        if (tb.ckf.b(r2.e(), r9.e()) != false) goto L_0x0145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00bb, code lost:
        r2.h(r9.c());
        r2.i(r9.e());
        r2.g(r9.b());
        r2.f(r9.a());
        r9 = (java.util.List) ((java.util.LinkedHashMap) com.taobao.tao.flexbox.layoutmanager.container.dx.DxTemplateVersionManager.b).get(r9.d());
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00e5, code lost:
        if (r9 == null) goto L_0x0145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00e7, code lost:
        r9 = r9.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00f1, code lost:
        if (r9.hasNext() == false) goto L_0x0145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00f3, code lost:
        tb.tfs.e("DxTemplateVersionManager", " 激活更新的监听器");
        ((tb.w1a) r9.next()).invoke(r2, java.lang.Boolean.TRUE, java.lang.Integer.valueOf(com.taobao.tao.flexbox.layoutmanager.container.dx.DxTemplateVersionManager.d));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void p(tb.wnf r9, boolean r10) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.flexbox.layoutmanager.container.dx.DxTemplateVersionManager.p(tb.wnf, boolean):void");
    }
}

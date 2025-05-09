package com.taobao.android.turbo.subpage.component.dx;

import android.os.Handler;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.android.ugc.h5.WVMicorPublishPlugin;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import tb.ckf;
import tb.d1a;
import tb.ggs;
import tb.m38;
import tb.t2o;
import tb.tfs;
import tb.unf;
import tb.vfs;
import tb.w1a;
import tb.xhv;
import tb.yh6;
import tb.yz3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class DxTemplateVersionManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int STRATEGY_DOWN_RENDER = 2;
    public static final int STRATEGY_ONLY_DOWN = 1;
    public static Handler c;
    public static boolean e;
    public static long f;
    public static final DxTemplateVersionManager INSTANCE = new DxTemplateVersionManager();

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, unf> f9803a = new LinkedHashMap();
    public static final Map<String, List<w1a<unf, Boolean, Integer, xhv>>> b = new LinkedHashMap();
    public static int d = 1;
    public static final d1a<xhv> g = DxTemplateVersionManager$syncRunnable$1.INSTANCE;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a implements vfs.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final a INSTANCE = new a();

        /* compiled from: Taobao */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        /* renamed from: com.taobao.android.turbo.subpage.component.dx.DxTemplateVersionManager$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public static final class RunnableC0506a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ String f9804a;

            public RunnableC0506a(String str) {
                this.f9804a = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    DxTemplateVersionManager.a(DxTemplateVersionManager.INSTANCE, this.f9804a);
                }
            }
        }

        @Override // tb.vfs.b
        public final void a(String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1ea082d8", new Object[]{this, str, str2, str3});
            } else {
                DxTemplateVersionManager.b(DxTemplateVersionManager.INSTANCE).postDelayed(new RunnableC0506a(str3), 1000L);
            }
        }
    }

    static {
        t2o.a(916455744);
    }

    public static final /* synthetic */ void a(DxTemplateVersionManager dxTemplateVersionManager, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4e06834", new Object[]{dxTemplateVersionManager, str});
        } else {
            dxTemplateVersionManager.d(str);
        }
    }

    public static final /* synthetic */ Handler b(DxTemplateVersionManager dxTemplateVersionManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("9e0555b6", new Object[]{dxTemplateVersionManager});
        }
        return dxTemplateVersionManager.f();
    }

    public static final /* synthetic */ void c(DxTemplateVersionManager dxTemplateVersionManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9d305a1", new Object[]{dxTemplateVersionManager});
        } else {
            dxTemplateVersionManager.s();
        }
    }

    public final void e(String str, long j, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52b1fe6e", new Object[]{this, str, new Long(j), str2});
            return;
        }
        ckf.g(str, yh6.CONFIG_KEY_TEMPLATE_NAME);
        ckf.g(str2, WVMicorPublishPlugin.TEMPLATE_URL);
        Map<String, unf> map = f9803a;
        unf unfVar = (unf) ((LinkedHashMap) map).get(str);
        if (unfVar != null) {
            unfVar.g(j);
            unfVar.f(str2);
        } else {
            unfVar = new unf(str, j, str2, j, str2);
        }
        map.put(str, unfVar);
        g();
    }

    public final Handler f() {
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
    /* JADX WARN: Type inference failed for: r2v1, types: [tb.m38] */
    public final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66fdfd51", new Object[]{this});
            return;
        }
        f().removeCallbacksAndMessages(null);
        Handler f2 = f();
        d1a<xhv> d1aVar = g;
        if (d1aVar != null) {
            d1aVar = new m38(d1aVar);
        }
        f2.postDelayed((Runnable) d1aVar, 1000L);
    }

    public final long h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("feddb631", new Object[]{this})).longValue();
        }
        return f;
    }

    public final unf i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (unf) ipChange.ipc$dispatch("1d5d88bf", new Object[]{this, str});
        }
        ckf.g(str, "name");
        tfs.e("DxTemplateVersionManager", "获取当前的版本管理器里面的信息");
        return (unf) ((LinkedHashMap) f9803a).get(str);
    }

    public final DXTemplateItem j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXTemplateItem) ipChange.ipc$dispatch("183a4b3e", new Object[]{this, str});
        }
        ckf.g(str, yh6.CONFIG_KEY_TEMPLATE_NAME);
        unf unfVar = (unf) ((LinkedHashMap) f9803a).get(str);
        if ((unfVar != null ? unfVar.b() : 0L) <= 0) {
            return null;
        }
        DXTemplateItem dXTemplateItem = new DXTemplateItem();
        dXTemplateItem.f7343a = str;
        ckf.d(unfVar);
        dXTemplateItem.b = unfVar.b();
        dXTemplateItem.c = unfVar.a();
        return dXTemplateItem;
    }

    public final String k(List<? extends DXTemplateItem> list) {
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

    public final unf l(JSONObject jSONObject) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (unf) ipChange.ipc$dispatch("26c92ef9", new Object[]{this, jSONObject});
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
            return new unf(str3, j, str4, -1L, "");
        } catch (Throwable unused) {
            return null;
        }
    }

    public final void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edbf76d5", new Object[]{this});
        } else if (!e) {
            o();
            p();
            q();
            e = true;
        }
    }

    public final List<DXTemplateItem> n(String str) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("2d070013", new Object[]{this, str});
        }
        ArrayList arrayList = new ArrayList();
        try {
            Object parse = JSON.parse(str);
            if (parse != null && (parse instanceof JSONArray)) {
                for (Object obj2 : (Iterable) parse) {
                    if (!(obj2 == null || !(obj2 instanceof JSONObject) || (obj = ((JSONObject) obj2).get("name")) == null)) {
                        DXTemplateItem dXTemplateItem = new DXTemplateItem();
                        dXTemplateItem.f7343a = (String) obj;
                        Object obj3 = ((JSONObject) obj2).get("version");
                        if (obj3 == null) {
                            obj3 = "0";
                        }
                        dXTemplateItem.b = Long.parseLong((String) obj3);
                        Object obj4 = ((JSONObject) obj2).get("url");
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

    public final void o() {
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
                        unf l = dxTemplateVersionManager.l((JSONObject) value);
                        if (l != null) {
                            Map<String, unf> map = f9803a;
                            String key = entry.getKey();
                            ckf.f(key, "it.key");
                            map.put(key, l);
                        }
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type com.alibaba.fastjson.JSONObject");
                    }
                }
                f = System.currentTimeMillis() - currentTimeMillis;
                tfs.e("DxTemplateVersionManager", "readConfigsFromDisk 解析结束，解析出" + f9803a.size() + "个数据，耗时：" + f);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        } catch (Throwable th) {
            tfs.e("DxTemplateVersionManager", "从磁盘读取本地DX版本失效,异常：" + th.getMessage());
        }
    }

    public final void p() {
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

    public final void q() {
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

    public final void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b8ff43a", new Object[]{this});
            return;
        }
        tfs.e("DxTemplateVersionManager", "syncToDisk ");
        String jSONString = JSON.toJSONString(f9803a);
        tfs.e("DxTemplateVersionManager", "syncToDisk localConfigs:" + jSONString);
        ggs.e("guangguang_local_dx_version", jSONString);
    }

    public final void t(String str, w1a<? super unf, ? super Boolean, ? super Integer, xhv> w1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("addb82e5", new Object[]{this, str, w1aVar});
            return;
        }
        ckf.g(str, "name");
        ckf.g(w1aVar, DataReceiveMonitor.CB_LISTENER);
        List list = (List) ((LinkedHashMap) b).get(str);
        if (list != null && list.contains(w1aVar)) {
            list.remove(w1aVar);
        }
    }

    public final void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c92638d", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            ckf.d(str);
            List<DXTemplateItem> n = n(str);
            tfs.e("DxTemplateVersionManager", "startReadFromOrange: 解析出的配置个数：" + n.size() + "信息如下:" + k(n));
            for (DXTemplateItem dXTemplateItem : n) {
                DxTemplateVersionManager dxTemplateVersionManager = INSTANCE;
                String str2 = dXTemplateItem.f7343a;
                ckf.f(str2, "it.name");
                long j = dXTemplateItem.b;
                String str3 = dXTemplateItem.c;
                ckf.f(str3, "it.templateUrl");
                dxTemplateVersionManager.u(new unf(str2, j, str3, -1L, ""), true);
            }
            g();
        }
    }

    public final void r(String str, w1a<? super unf, ? super Boolean, ? super Integer, xhv> w1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a99b08de", new Object[]{this, str, w1aVar});
            return;
        }
        ckf.g(str, "name");
        ckf.g(w1aVar, DataReceiveMonitor.CB_LISTENER);
        Map<String, List<w1a<unf, Boolean, Integer, xhv>>> map = b;
        List list = (List) ((LinkedHashMap) map).get(str);
        if (list != null && list.contains(w1aVar)) {
            return;
        }
        if (list != null) {
            list.add(w1aVar);
            return;
        }
        map.put(str, yz3.m(w1aVar));
        xhv xhvVar = xhv.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0066, code lost:
        if (r2.c() != r9.c()) goto L_0x0068;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0068, code lost:
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0077, code lost:
        if (r2.c() < r9.c()) goto L_0x0068;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x007a, code lost:
        tb.tfs.e("DxTemplateVersionManager", "versionCheck" + r1 + ",url判断：" + (true ^ tb.ckf.b(r2.e(), r9.e())));
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00a1, code lost:
        if (r1 != false) goto L_0x00b1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00af, code lost:
        if (tb.ckf.b(r2.e(), r9.e()) != false) goto L_0x013b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00b1, code lost:
        r2.h(r9.c());
        r2.i(r9.e());
        r2.g(r9.b());
        r2.f(r9.a());
        r9 = (java.util.List) ((java.util.LinkedHashMap) com.taobao.android.turbo.subpage.component.dx.DxTemplateVersionManager.b).get(r9.d());
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00db, code lost:
        if (r9 == null) goto L_0x013b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00dd, code lost:
        r9 = r9.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00e7, code lost:
        if (r9.hasNext() == false) goto L_0x013b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00e9, code lost:
        tb.tfs.e("DxTemplateVersionManager", " 激活更新的监听器");
        ((tb.w1a) r9.next()).invoke(r2, java.lang.Boolean.TRUE, java.lang.Integer.valueOf(com.taobao.android.turbo.subpage.component.dx.DxTemplateVersionManager.d));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void u(tb.unf r9, boolean r10) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.turbo.subpage.component.dx.DxTemplateVersionManager.u(tb.unf, boolean):void");
    }
}

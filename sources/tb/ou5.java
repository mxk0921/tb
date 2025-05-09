package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXResult;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.f;
import com.taobao.android.dinamicx.p;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ou5 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final hvb f25656a;
    public final WeakReference<j66> b;
    public final Map<String, DXTemplateItem> c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ List f25657a;
        public final /* synthetic */ String b;
        public final /* synthetic */ vwb c;
        public final /* synthetic */ boolean d;

        /* compiled from: Taobao */
        /* renamed from: tb.ou5$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class C1017a implements c {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ pu5 f25658a;
            public final /* synthetic */ long b;

            public C1017a(pu5 pu5Var, long j) {
                this.f25658a = pu5Var;
                this.b = j;
            }

            public void a(DXResult<DXTemplateItem> dXResult) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("a43be78e", new Object[]{this, dXResult});
                    return;
                }
                if (zg5.U3()) {
                    a aVar = a.this;
                    ou5.a(ou5.this, aVar.b, dXResult.f7291a);
                }
                pu5 pu5Var = this.f25658a;
                pu5Var.b = false;
                pu5Var.f26307a = dXResult.f7291a;
                j66 j66Var = (j66) ou5.b(ou5.this).get();
                if (j66Var != null && a.this.d) {
                    j66Var.h(this.f25658a);
                }
                DXTemplateItem dXTemplateItem = dXResult.f7291a;
                if (dXTemplateItem != null && !TextUtils.isEmpty(dXTemplateItem.c)) {
                    f fVar = new f(a.this.b);
                    fVar.c = new ArrayList();
                    f.a aVar2 = new f.a("Downloader", "Downloader_download_count", 60004);
                    fVar.b = dXResult.f7291a;
                    fVar.c.add(aVar2);
                    ou5.d(ou5.this, fVar);
                }
                ou5.d(ou5.this, dXResult.a());
                if (this.f25658a.f26307a != null) {
                    la6.b("模板下载失败" + this.f25658a.f26307a.toString());
                    return;
                }
                la6.b("模板下载失败 result.item ==null");
            }

            public void b(DXTemplateItem dXTemplateItem) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("ff4a0521", new Object[]{this, dXTemplateItem});
                    return;
                }
                if (zg5.U3()) {
                    a aVar = a.this;
                    ou5.a(ou5.this, aVar.b, dXTemplateItem);
                }
                pu5 pu5Var = this.f25658a;
                pu5Var.b = true;
                pu5Var.f26307a = dXTemplateItem;
                j66 j66Var = (j66) ou5.b(ou5.this).get();
                if (j66Var != null && a.this.d) {
                    la6.b("模板下载通知NotificationCenter");
                    j66Var.h(this.f25658a);
                }
                long nanoTime = System.nanoTime() - this.b;
                la6.b("模板下载完成" + dXTemplateItem.toString() + "耗时=" + nanoTime);
                a aVar2 = a.this;
                ou5.c(ou5.this, "Downloader_download_count", aVar2.b, dXTemplateItem, nanoTime);
            }
        }

        public a(List list, String str, vwb vwbVar, boolean z) {
            this.f25657a = list;
            this.b = str;
            this.c = vwbVar;
            this.d = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            for (DXTemplateItem dXTemplateItem : this.f25657a) {
                long nanoTime = System.nanoTime();
                pu5 pu5Var = new pu5();
                la6.b("开始下载模板" + dXTemplateItem.toString());
                ou5.e(ou5.this, this.b, dXTemplateItem, this.c, new C1017a(pu5Var, nanoTime));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b implements vwb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f25659a;

        public b(String str) {
            this.f25659a = str;
        }

        @Override // tb.vwb
        public boolean a(DXTemplateItem dXTemplateItem, Map<String, byte[]> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("1d15ce1e", new Object[]{this, dXTemplateItem, map})).booleanValue();
            }
            if (map == null || map.size() <= 0) {
                return false;
            }
            int size = map.size();
            AtomicInteger atomicInteger = new AtomicInteger();
            for (Map.Entry<String, byte[]> entry : map.entrySet()) {
                if (dx5.d().j(entry.getKey(), entry.getValue()) && atomicInteger.incrementAndGet() == size) {
                    sh6.c().e(this.f25659a, dXTemplateItem);
                }
            }
            uh6.h().z(this.f25659a, 1L, dXTemplateItem);
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface c {
    }

    static {
        t2o.a(444596988);
    }

    public ou5(hvb hvbVar, j66 j66Var, Map<String, DXTemplateItem> map) {
        if (hvbVar == null) {
            this.f25656a = new j7b();
        } else {
            this.f25656a = hvbVar;
        }
        this.b = new WeakReference<>(j66Var);
        this.c = map;
    }

    public static /* synthetic */ boolean a(ou5 ou5Var, String str, DXTemplateItem dXTemplateItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3c18dc95", new Object[]{ou5Var, str, dXTemplateItem})).booleanValue();
        }
        return ou5Var.i(str, dXTemplateItem);
    }

    public static /* synthetic */ WeakReference b(ou5 ou5Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeakReference) ipChange.ipc$dispatch("c13238cb", new Object[]{ou5Var});
        }
        return ou5Var.b;
    }

    public static /* synthetic */ void c(ou5 ou5Var, String str, String str2, DXTemplateItem dXTemplateItem, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f37bd8cb", new Object[]{ou5Var, str, str2, dXTemplateItem, new Long(j)});
        } else {
            ou5Var.j(str, str2, dXTemplateItem, j);
        }
    }

    public static /* synthetic */ void d(ou5 ou5Var, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dabdaaa5", new Object[]{ou5Var, fVar});
        } else {
            ou5Var.k(fVar);
        }
    }

    public static /* synthetic */ void e(ou5 ou5Var, String str, DXTemplateItem dXTemplateItem, vwb vwbVar, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fa832c8", new Object[]{ou5Var, str, dXTemplateItem, vwbVar, cVar});
        } else {
            ou5Var.f(str, dXTemplateItem, vwbVar, cVar);
        }
    }

    public final void f(String str, DXTemplateItem dXTemplateItem, vwb vwbVar, c cVar) {
        byte[] bArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51037120", new Object[]{this, str, dXTemplateItem, vwbVar, cVar});
            return;
        }
        DXResult<DXTemplateItem> dXResult = new DXResult<>();
        f fVar = new f(str);
        String l = l(dXTemplateItem.c);
        if (!TextUtils.isEmpty(l)) {
            hvb hvbVar = this.f25656a;
            if (hvbVar instanceof j7b) {
                bArr = ((j7b) hvbVar).b(l, str, dXTemplateItem);
            } else {
                bArr = hvbVar.a(l);
            }
        } else {
            String d = dXTemplateItem.d();
            la6.b(str + "传入的url是空 " + d);
            bArr = null;
        }
        if (bArr == null) {
            f.a aVar = new f.a("Downloader", "Downloader_download", TextUtils.isEmpty(l) ? f.DX_DB_OPEN_ERROR_38 : 60000);
            dXResult.f7291a = dXTemplateItem;
            fVar.b = dXTemplateItem;
            ((ArrayList) fVar.c).add(aVar);
            dXResult.e(fVar);
            ((a.C1017a) cVar).a(dXResult);
            return;
        }
        if (u06.j(dXTemplateItem, bArr, dx5.d().c() + wh6.DIR + str + wh6.DIR + dXTemplateItem.f7343a + wh6.DIR + dXTemplateItem.b + wh6.DIR, vwbVar, fVar)) {
            ((a.C1017a) cVar).b(dXTemplateItem);
            return;
        }
        dXResult.f7291a = dXTemplateItem;
        dXResult.e(fVar);
        ((a.C1017a) cVar).a(dXResult);
    }

    public void g(String str, List<DXTemplateItem> list, vwb vwbVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3b708a7", new Object[]{this, str, list, vwbVar, new Boolean(z)});
        } else if (list != null && list.size() > 0) {
            mu5 mu5Var = new mu5(0, new a(list, str, vwbVar, z));
            if (z) {
                jb6.h(mu5Var);
            } else {
                mu5Var.run();
            }
        }
    }

    public final boolean i(String str, DXTemplateItem dXTemplateItem) {
        Map<String, DXTemplateItem> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("585c2902", new Object[]{this, str, dXTemplateItem})).booleanValue();
        }
        if (!(dXTemplateItem == null || (map = this.c) == null || map.isEmpty())) {
            String p = p.p(str, dXTemplateItem);
            for (Map.Entry<String, DXTemplateItem> entry : this.c.entrySet()) {
                if (p.equals(entry.getKey())) {
                    this.c.remove(entry.getKey());
                    if (DinamicXEngine.j0()) {
                        h36.b("DXDownloadManager", p + " 已在下载完成，从队列移除 " + this.c.size());
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final void j(String str, String str2, DXTemplateItem dXTemplateItem, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8be283f", new Object[]{this, str, str2, dXTemplateItem, new Long(j)});
        } else {
            ic5.u(2, str2, "Downloader", str, dXTemplateItem, null, j, true);
        }
    }

    public final void k(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2914c129", new Object[]{this, fVar});
        } else {
            ic5.p(fVar);
        }
    }

    public final String l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ddfcf001", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        if (str.indexOf("._dxv4") < 0) {
            return str;
        }
        String str2 = str.split("._dxv4")[0];
        if (ao6.a().d()) {
            return str2 + "_js.zip";
        }
        return str2 + "_android.zip";
    }

    public static boolean h(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e475ba1d", new Object[]{map})).booleanValue();
        }
        if (!zg5.m5() || map == null || map.isEmpty()) {
            return false;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("content", map.toString());
        ic5.u(2, "Predownload_trigger", "PreDownloader", "Predownload_trigger", null, hashMap, vu3.b.GEO_NOT_SUPPORT, true);
        JSONObject jSONObject = (JSONObject) map.get("ext");
        String str = jSONObject == null ? null : (String) jSONObject.get("androidEngineId");
        JSONObject jSONObject2 = (JSONObject) map.get("templates");
        if (jSONObject2 == null) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : jSONObject2.keySet()) {
            JSONArray jSONArray = (JSONArray) jSONObject2.get(str2);
            if (jSONArray == null) {
                return false;
            }
            for (int i = 0; i < jSONArray.size(); i++) {
                JSONObject jSONObject3 = (JSONObject) jSONArray.get(i);
                if (jSONObject3 == null) {
                    return false;
                }
                DXTemplateItem dXTemplateItem = new DXTemplateItem();
                dXTemplateItem.f7343a = (String) jSONObject3.get(yh6.CONFIG_KEY_TEMPLATE_NAME);
                dXTemplateItem.b = Long.parseLong((String) jSONObject3.get("version"));
                dXTemplateItem.c = (String) jSONObject3.get("url");
                arrayList.add(dXTemplateItem);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        la6.b("开始预下载模板");
        j86.d(str, arrayList, new b(str), true);
        return true;
    }
}

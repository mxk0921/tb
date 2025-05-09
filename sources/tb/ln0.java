package tb;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.alibaba.android.aura.datamodel.nextrpc.AURANextRPCEndpoint;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.buy.toggle.AliBuyPerfSwitcher;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.intf.MtopBuilder;
import mtopsdk.mtop.intf.MtopPrefetch;
import tb.ck;
import tb.rk;
import tb.ubb;
import tb.vm0;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ln0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference<Context> f23430a;
    public final Intent b;
    public final long c;
    public final Map<String, String> d;
    public final Map<String, String> e;
    public final boolean f;
    public final ubb.a g;
    public final boolean h;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements MtopPrefetch.IPrefetchComparator {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ long f23431a;

        public a(long j) {
            this.f23431a = j;
        }

        public final List<String> b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("a59c18f", new Object[]{this});
            }
            String string = AliBuyPerfSwitcher.getString("prefetchCompareWhiteList", "websiteLanguage,bcflsrc,lng,ua,areaDivisionCode,lat");
            ArrayList arrayList = new ArrayList();
            if (!TextUtils.isEmpty(string)) {
                arrayList = new ArrayList(Arrays.asList(string.split(",")));
            }
            arrayList.add("cartTraceId");
            arrayList.add("cartIsLoading");
            arrayList.add("cartIsLocalCalculate");
            return arrayList;
        }

        @Override // mtopsdk.mtop.intf.MtopPrefetch.IPrefetchComparator
        public MtopPrefetch.CompareResult compare(MtopBuilder mtopBuilder, MtopBuilder mtopBuilder2) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (MtopPrefetch.CompareResult) ipChange.ipc$dispatch("cca63c2e", new Object[]{this, mtopBuilder, mtopBuilder2});
            }
            ln0.a(ln0.this, System.currentTimeMillis() - this.f23431a);
            MtopPrefetch.CompareResult compareResult = new MtopPrefetch.CompareResult();
            try {
                compareResult = c(mtopBuilder.request, mtopBuilder2.request, b());
                h15 message = vm0.a.a("mtop_prefetchV2").message(compareResult.getData().toString());
                if (compareResult.isSame()) {
                    str = "命中";
                } else {
                    str = "未命中";
                }
                vm0.d(message.tag(str).sampling(0.01f));
                rbb g = ck.g();
                g.e("MTOP 预处理结束，结果 ：" + compareResult.isSame(), ck.b.b().i("AURA/performance").g("realValue", compareResult.getData().get("realValue")).g("prefetchValue", compareResult.getData().get("prefetchValue")).g("missMsg", compareResult.getData().get("missMsg")).g("missKey", compareResult.getData().get("missKey")).d("delay", System.currentTimeMillis() - this.f23431a).a());
            } catch (Throwable th) {
                vm0.e("RRE_FETCH_COMPARE_EXCEPTION", th.getMessage());
            }
            return compareResult;
        }

        public final MtopPrefetch.CompareResult c(MtopRequest mtopRequest, MtopRequest mtopRequest2, List<String> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (MtopPrefetch.CompareResult) ipChange.ipc$dispatch("924228e3", new Object[]{this, mtopRequest, mtopRequest2, list});
            }
            MtopPrefetch.CompareResult compareResult = new MtopPrefetch.CompareResult();
            if (TextUtils.isEmpty(mtopRequest2.getKey()) || !mtopRequest2.getKey().equals(mtopRequest.getKey())) {
                compareResult.getData().put("missKey", "apiKey");
                compareResult.getData().put("missMsg", "missApi");
                compareResult.getData().put("prefetchValue", mtopRequest.getKey());
                compareResult.getData().put("realValue", mtopRequest2.getKey());
            } else if (a(mtopRequest.dataParams, mtopRequest2.dataParams, list, compareResult)) {
                compareResult.setSame(true);
            }
            return compareResult;
        }

        public final boolean a(Map<String, String> map, Map<String, String> map2, List<String> list, MtopPrefetch.CompareResult compareResult) {
            String key;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("32c7b9c5", new Object[]{this, map, map2, list, compareResult})).booleanValue();
            }
            if (map == null && map2 == null) {
                return true;
            }
            if (map == null) {
                compareResult.getData().put("prefetchValue", "is null");
                return false;
            } else if (map2 == null) {
                compareResult.getData().put("realValue", "is null");
                return false;
            } else {
                nk nkVar = new nk();
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    String key2 = entry.getKey();
                    if (key2 == null) {
                        return true;
                    }
                    if (!s84.a(key2, map.get(key2), map2.get(key2), list, nkVar)) {
                        compareResult.setSame(false);
                        compareResult.setData(nkVar.a());
                        return false;
                    }
                }
                Iterator<Map.Entry<String, String>> it = map2.entrySet().iterator();
                while (it.hasNext() && (key = it.next().getKey()) != null) {
                    if (!s84.a(key, map.get(key), map2.get(key), list, nkVar)) {
                        compareResult.setSame(false);
                        compareResult.setData(nkVar.a());
                        return false;
                    }
                }
                return true;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final Context f23432a;
        public final Intent b;
        public Map<String, String> c;
        public Map<String, String> d;
        public boolean e;
        public ubb.a f;
        public boolean g;

        static {
            t2o.a(301990085);
        }

        public b(Context context, Intent intent) {
            this.f23432a = context;
            this.b = intent;
        }

        public static /* synthetic */ long a(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("1667e0e8", new Object[]{bVar})).longValue();
            }
            bVar.getClass();
            return 5000L;
        }

        public static /* synthetic */ String b(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("cc8d000b", new Object[]{bVar});
            }
            bVar.getClass();
            return null;
        }

        public static /* synthetic */ Map c(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("6f90352b", new Object[]{bVar});
            }
            return bVar.c;
        }

        public static /* synthetic */ Map d(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("705eb3ac", new Object[]{bVar});
            }
            return bVar.d;
        }

        public static /* synthetic */ boolean e(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("e4a5f1fc", new Object[]{bVar})).booleanValue();
            }
            return bVar.e;
        }

        public static /* synthetic */ ubb.a f(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ubb.a) ipChange.ipc$dispatch("1e9329d2", new Object[]{bVar});
            }
            return bVar.f;
        }

        public static /* synthetic */ boolean g(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("cbc4fa7e", new Object[]{bVar})).booleanValue();
            }
            return bVar.g;
        }

        public ln0 h() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ln0) ipChange.ipc$dispatch("e35c6635", new Object[]{this});
            }
            return new ln0(this);
        }

        public b i(ubb.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("b9cf1939", new Object[]{this, aVar});
            }
            this.f = aVar;
            return this;
        }

        public b j(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("e5f759a9", new Object[]{this, new Boolean(z)});
            }
            this.e = z;
            return this;
        }

        public b k(Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("7fefd5da", new Object[]{this, map});
            }
            this.d = map;
            return this;
        }

        public b l(Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("d50c203c", new Object[]{this, map});
            }
            this.c = map;
            return this;
        }

        public b m(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("c202060f", new Object[]{this, new Boolean(z)});
            }
            this.g = z;
            return this;
        }
    }

    static {
        t2o.a(301990083);
        t2o.a(301990087);
    }

    public ln0(b bVar) {
        this.f23430a = new WeakReference<>(bVar.f23432a);
        this.b = bVar.b;
        this.c = b.a(bVar);
        b.b(bVar);
        this.d = b.c(bVar);
        this.e = b.d(bVar);
        this.f = b.e(bVar);
        this.g = b.f(bVar);
        this.h = b.g(bVar);
    }

    public static /* synthetic */ void a(ln0 ln0Var, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7cdb212", new Object[]{ln0Var, new Long(j)});
        } else {
            ln0Var.c(j);
        }
    }

    public final void c(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("616eaeba", new Object[]{this, new Long(j)});
            return;
        }
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("勾选到结算耗时", Long.valueOf(j));
            vm0.h("首屏渲染性能监控", hashMap, null, null, 0.01f);
            rbb g = ck.g();
            g.f("勾选到结算耗时：" + j, ck.b.b().i("AURA/performance").a());
        } catch (Throwable th) {
            vm0.e("FIRST_SCREEN_MONITOR_EXCEPTION", th.getMessage());
        }
    }

    public void e(String str) {
        Context context;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede54682", new Object[]{this, str});
            return;
        }
        WeakReference<Context> weakReference = this.f23430a;
        if (weakReference == null) {
            context = null;
        } else {
            context = weakReference.get();
        }
        if (context == null) {
            ck.g().e("AliBuyPrefetch", "context is null");
        } else {
            d(str, b(context, this.b, true));
        }
    }

    public void f(String str) {
        Context context;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3802d24a", new Object[]{this, str});
            return;
        }
        WeakReference<Context> weakReference = this.f23430a;
        if (weakReference == null) {
            context = null;
        } else {
            context = weakReference.get();
        }
        if (context == null) {
            ck.g().e("AliBuyPrefetch", "context is null");
        } else {
            d(str, b(context, this.b, false));
        }
    }

    public final AURANextRPCEndpoint b(Context context, Intent intent, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURANextRPCEndpoint) ipChange.ipc$dispatch("c0b412e4", new Object[]{this, context, intent, new Boolean(z)});
        }
        g4o g4oVar = new g4o(context, intent);
        Map<String, String> map = this.d;
        if (map != null) {
            g4oVar.b(map);
        }
        Map<String, String> map2 = this.e;
        if (map2 != null) {
            g4oVar.a(map2);
        }
        rk c = new rk.a().d(this.c).c();
        un0 d = g4oVar.d();
        if (z) {
            vm0.d(vm0.a.a("mtop_prefetchV2").tag("进入预处理").sampling(0.01f));
            long currentTimeMillis = System.currentTimeMillis();
            d.j(1);
            d.i(new a(currentTimeMillis));
        }
        return g4oVar.d().c(c, this.f, this.h);
    }

    public final void d(String str, AURANextRPCEndpoint aURANextRPCEndpoint) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f5eebab", new Object[]{this, str, aURANextRPCEndpoint});
            return;
        }
        WeakReference<Context> weakReference = this.f23430a;
        Context context = weakReference == null ? null : weakReference.get();
        if (context == null) {
            ck.g().e("AliBuyPrefetch", "context is null");
            return;
        }
        if (!this.f || !AliBuyPerfSwitcher.enableForceMainThreadPerf()) {
            z = false;
        }
        ubb g = mk.g(context.getApplicationContext(), str, aURANextRPCEndpoint.getStreamModel(), AliBuyPerfSwitcher.enableStreamJson(), z);
        ck.g().e("startPrefetch ", ck.b.b().i("AURA/performance").d("time", System.currentTimeMillis()).a());
        g.a(aURANextRPCEndpoint, this.g);
    }
}

package tb;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.ck;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class cog {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<Integer, a> f17200a = new ConcurrentHashMap();
    public final Map<Integer, dkc> b = new ConcurrentHashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public bog f17201a;

        static {
            t2o.a(708837393);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class b {
        public static final cog sInstance = new cog();

        static {
            t2o.a(708837394);
        }
    }

    static {
        t2o.a(708837392);
    }

    public static cog f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cog) ipChange.ipc$dispatch("56c85e74", new Object[0]);
        }
        return b.sInstance;
    }

    public synchronized void a(Context context, JSONObject jSONObject, List<JSONObject> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b7eb2ac", new Object[]{this, context, jSONObject, list});
            return;
        }
        int identityHashCode = System.identityHashCode(context);
        bog bogVar = e(identityHashCode).f17201a;
        if (bogVar != null) {
            if (jSONObject != null) {
                bogVar.e(jSONObject);
            }
            if (list != null && list.size() > 0) {
                bogVar.a(list);
                ck.g().f("副响应数据返回", ck.b.b().l("LightBuyDataSourceManager").i("LightBuy/common").g("info", "副响应数据返回").a());
            }
        }
        dkc g = g(identityHashCode);
        if (g != null) {
            ck.g().f("通知前端更新数据", ck.b.b().i("LightBuy/preload").a());
            h(identityHashCode, g);
        } else {
            ck.g().f("数据回来，数据还未bind", ck.b.b().l("LightBuyDataSourceManager").i("LightBuy/common").g("info", "数据回来，数据还未bind").a());
        }
    }

    public void b(Context context, dkc dkcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e34e3e2f", new Object[]{this, context, dkcVar});
            return;
        }
        int identityHashCode = System.identityHashCode(context);
        j(identityHashCode, dkcVar);
        h(identityHashCode, dkcVar);
    }

    public void c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26587bb2", new Object[]{this, context});
            return;
        }
        int identityHashCode = System.identityHashCode(context);
        ((ConcurrentHashMap) this.b).remove(Integer.valueOf(identityHashCode));
        ((ConcurrentHashMap) this.f17200a).remove(Integer.valueOf(identityHashCode));
    }

    public final synchronized JSONObject d(bog bogVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("120201a", new Object[]{this, bogVar});
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject c = bogVar.c();
        if (c != null) {
            jSONObject.put("mainResponse", (Object) c);
        }
        List<JSONObject> b2 = bogVar.b();
        if (b2 != null && !b2.isEmpty()) {
            jSONObject.put("attachedResponses", (Object) b2);
        }
        JSONObject d = bogVar.d();
        if (d != null) {
            jSONObject.put("requestParams", (Object) d);
        }
        return jSONObject;
    }

    public final a e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("25e535e0", new Object[]{this, new Integer(i)});
        }
        a aVar = (a) ((ConcurrentHashMap) this.f17200a).get(Integer.valueOf(i));
        if (aVar != null) {
            return aVar;
        }
        a aVar2 = new a();
        aVar2.f17201a = new bog();
        ((ConcurrentHashMap) this.f17200a).put(Integer.valueOf(i), aVar2);
        rbb g = ck.g();
        ck.b i2 = ck.b.b().l("LightBuyDataSourceManager").i("LightBuy/common");
        g.f("新增数据", i2.g("info", "加入新的数据源 " + i + " ;size:" + ((ConcurrentHashMap) this.f17200a).size()).a());
        return aVar2;
    }

    public final dkc g(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dkc) ipChange.ipc$dispatch("64099fb7", new Object[]{this, new Integer(i)});
        }
        if (((ConcurrentHashMap) this.b).containsKey(Integer.valueOf(i))) {
            return (dkc) ((ConcurrentHashMap) this.b).get(Integer.valueOf(i));
        }
        return null;
    }

    public final synchronized void h(int i, dkc dkcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1a025b2", new Object[]{this, new Integer(i), dkcVar});
            return;
        }
        if (!((ConcurrentHashMap) this.f17200a).containsKey(Integer.valueOf(i))) {
            rbb g = ck.g();
            ck.b i2 = ck.b.b().l("LightBuyDataSourceManager").i("LightBuy/common");
            g.f("dataSource 未找到对应的identify", i2.g("info", "dataSource 未找到对应的identify " + i).a());
            eog.c("resultModule is null", null);
            dkcVar.b("NO_DATA", "resultModule is null");
        } else {
            bog bogVar = ((a) ((ConcurrentHashMap) this.f17200a).remove(Integer.valueOf(i))).f17201a;
            if (bogVar == null) {
                ck.g().f("bindDataChanged 成功，当前没有数据", ck.b.b().l("LightBuyDataSourceManager").i("LightBuy/common").g("info", "bindDataChanged 成功，当前没有数据").a());
                eog.c("没有数据", null);
                dkcVar.b("NO_DATA", "resultModule is null");
                return;
            }
            JSONObject d = d(bogVar);
            if (d.size() == 0) {
                ck.g().f("bindDataChanged 成功，当前没有数据", ck.b.b().l("LightBuyDataSourceManager").i("LightBuy/common").g("info", "bindDataChanged 成功，当前没有数据").a());
                eog.c("没有数据", null);
                dkcVar.b("NO_DATA", "没有数据");
                return;
            }
            dkcVar.a(d);
        }
    }

    public void i(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78d6e68d", new Object[]{this, context});
            return;
        }
        ((ConcurrentHashMap) this.f17200a).remove(Integer.valueOf(System.identityHashCode(context)));
    }

    public final void j(int i, dkc dkcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b44a578", new Object[]{this, new Integer(i), dkcVar});
        } else if (!((ConcurrentHashMap) this.b).containsKey(Integer.valueOf(i))) {
            ((ConcurrentHashMap) this.b).put(Integer.valueOf(i), dkcVar);
        }
    }

    public synchronized void k(Context context, JSONObject jSONObject) {
        bog bogVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bd29262", new Object[]{this, context, jSONObject});
            return;
        }
        int identityHashCode = System.identityHashCode(context);
        bog bogVar2 = e(identityHashCode).f17201a;
        if (!(bogVar2 == null || jSONObject == null)) {
            bogVar2.f(jSONObject);
        }
        dkc g = g(identityHashCode);
        if (!(g == null || (bogVar = ((a) ((ConcurrentHashMap) this.f17200a).remove(Integer.valueOf(identityHashCode))).f17201a) == null)) {
            g.a(d(bogVar));
        }
    }
}

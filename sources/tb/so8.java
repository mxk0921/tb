package tb;

import android.text.TextUtils;
import com.alibaba.evo.internal.bucketing.model.ExperimentV5;
import com.alibaba.evo.internal.database.ExperimentDO;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class so8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final jo8 f28170a;
    public final Map<Long, List<ExperimentV5>> b = new HashMap();
    @Deprecated
    public final Map<Long, ExperimentV5> c = new HashMap();
    public final Map<Long, Object> d = new ConcurrentHashMap();

    static {
        t2o.a(961544208);
    }

    public so8(jo8 jo8Var) {
        this.f28170a = jo8Var;
    }

    public final synchronized void a(ExperimentV5 experimentV5) {
        List<ExperimentV5> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a208c72d", new Object[]{this, experimentV5});
        } else if (experimentV5 != null) {
            if (n.j().a().q() || !experimentV5.isColdWork()) {
                if (experimentV5.isRetain()) {
                    ExperimentV5 experimentV52 = (ExperimentV5) ((HashMap) this.c).put(Long.valueOf(experimentV5.getId()), experimentV5);
                    if (!(experimentV52 == null || (list = (List) ((HashMap) this.b).get(Long.valueOf(experimentV52.getLayerId()))) == null)) {
                        for (ExperimentV5 experimentV53 : list) {
                            if (experimentV53.getId() == experimentV52.getId()) {
                                list.remove(experimentV53);
                            }
                        }
                    }
                    List list2 = (List) ((HashMap) this.b).get(Long.valueOf(experimentV5.getLayerId()));
                    if (list2 == null) {
                        list2 = new ArrayList();
                        ((HashMap) this.b).put(Long.valueOf(experimentV5.getLayerId()), list2);
                    }
                    list2.add(experimentV5);
                }
            }
        }
    }

    public synchronized void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d49bc7a", new Object[]{this});
            return;
        }
        ((HashMap) this.b).clear();
        ((HashMap) this.c).clear();
    }

    public synchronized void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61ac39ab", new Object[]{this});
            return;
        }
        for (Map.Entry entry : ((HashMap) this.b).entrySet()) {
            if (!(entry == null || entry.getValue() == null)) {
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (!((ExperimentV5) it.next()).isColdWork()) {
                        it.remove();
                    }
                }
            }
        }
        Iterator it2 = ((HashMap) this.c).entrySet().iterator();
        while (it2.hasNext()) {
            if (!((ExperimentV5) ((Map.Entry) it2.next()).getValue()).isColdWork()) {
                it2.remove();
            }
        }
    }

    public void f(List<ExperimentV5> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dba10ae4", new Object[]{this, list});
        } else if (n.j().a().d()) {
            if (n.j().a().I()) {
                if (n.j().a().q()) {
                    c();
                    ((ConcurrentHashMap) this.d).clear();
                } else {
                    b();
                }
            }
            if (list != null) {
                for (ExperimentV5 experimentV5 : list) {
                    if (!experimentV5.isColdWork()) {
                        a(experimentV5);
                    } else if (n.j().a().q() && !((ConcurrentHashMap) this.d).containsKey(Long.valueOf(experimentV5.getLayerId()))) {
                        ((ConcurrentHashMap) this.d).put(Long.valueOf(experimentV5.getLayerId()), Boolean.TRUE);
                    }
                }
            }
        }
    }

    public synchronized List<ExperimentV5> d(Long l) {
        String[] split;
        synchronized (this) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("755c66d5", new Object[]{this, l});
            }
            List<ExperimentV5> list = (List) ((HashMap) this.b).get(l);
            if ((list == null || list.isEmpty()) && n.j().a().Q() && !((ConcurrentHashMap) this.d).containsKey(l)) {
                ((ConcurrentHashMap) this.d).put(l, Boolean.TRUE);
                String string = n.j().b().getSharedPreferences("ut-ab", 0).getString("layerId_" + l, "");
                if (!TextUtils.isEmpty(string)) {
                    for (String str : string.split("###")) {
                        String d = bqm.a().d("expKey_" + str, null);
                        if (!TextUtils.isEmpty(d)) {
                            a((ExperimentV5) JSON.parseObject(d, ExperimentV5.class));
                        }
                    }
                    return (List) ((HashMap) this.b).get(l);
                }
            }
            return list;
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b110817", new Object[]{this});
        } else if (n.j().a().d()) {
            try {
                max maxVar = new max();
                maxVar.f(new lax("ext_int=?", 1), new lax[0]);
                maxVar.f(new lax("end_time>?", Long.valueOf(mcp.a())), new lax[0]);
                lax b = maxVar.b();
                ArrayList<T> h = this.f28170a.h(null, null, 0, 0, b.c(), b.d());
                if (h != 0 && !h.isEmpty()) {
                    Iterator it = h.iterator();
                    while (it.hasNext()) {
                        ExperimentV5 l = go8.l((ExperimentDO) it.next());
                        if (l != null) {
                            a(l);
                        }
                    }
                }
                ogh.e("ExperimentRetainCache", "加载全局空桶实验缓存" + ((HashMap) this.c).size() + "层。");
            } catch (Throwable th) {
                ku0.j("ExperimentRetainCache.initialize", th);
            }
        }
    }
}

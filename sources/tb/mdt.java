package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.tmall.android.dai.DAIKVStoreage;
import com.tmall.android.dai.internal.compute.ServiceListener;
import com.tmall.android.dai.internal.util.LogUtil;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.tensorflow.contrib.tmall.task.TaskManager;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class mdt {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final mdt b = new mdt();

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, Map<Integer, adt>> f23981a = Collections.synchronizedMap(new HashMap());

    static {
        t2o.a(1034944618);
    }

    public static mdt e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mdt) ipChange.ipc$dispatch("22ae12a5", new Object[0]);
        }
        return b;
    }

    public static /* synthetic */ Map g(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("903183a4", new Object[]{map});
        }
        HashMap hashMap = new HashMap();
        hashMap.put(pg1.ATOM_EXT_match, String.valueOf(kj1.a((String) map.get("crowd_ids"))));
        return hashMap;
    }

    public void b(String str, int i, adt adtVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a37e483e", new Object[]{this, str, new Integer(i), adtVar});
            return;
        }
        Map<Integer, adt> map = this.f23981a.get(str);
        if (map == null) {
            map = new HashMap<>();
            this.f23981a.put(str, map);
        }
        map.put(Integer.valueOf(i), adtVar);
    }

    public void c(int i, adt adtVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5993d35e", new Object[]{this, new Integer(i), adtVar});
        } else {
            b("__walle_inner_model_all", i, adtVar);
        }
    }

    public Map<String, String> d(String str, int i, Map<String, String> map) {
        adt adtVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("c3235ccf", new Object[]{this, str, new Integer(i), map});
        }
        Map<Integer, adt> map2 = this.f23981a.get(str);
        if (map2 == null) {
            map2 = this.f23981a.get("__walle_inner_model_all");
        }
        if (map2 == null || map2.size() <= 0 || (adtVar = map2.get(Integer.valueOf(i))) == null) {
            return null;
        }
        return adtVar.a(map);
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("685af5e5", new Object[]{this});
        } else if (!kzo.c().o()) {
            try {
                LogUtil.d("DAI", "initialNativeTaskHandle start");
                TaskManager.getInstance().addListener(new ServiceListener());
                e().c(8, new psj());
                e().c(9, new kjn());
                e().c(11, new ni7(kzo.c().b()));
                e().c(12, new bm8());
                e().c(13, new av7());
                e().c(17, new boa());
                e().c(18, new zai());
                e().c(19, new uh4());
                e().c(20, new adt() { // from class: tb.ldt
                    @Override // tb.adt
                    public final Map a(Map map) {
                        Map g;
                        g = mdt.g(map);
                        return g;
                    }
                });
                e().c(22, new yxi());
                e().c(24, new ajj());
                if (!ral.e().h()) {
                    LogUtil.d("DAI", "initialNativeTaskHandle onNativeInit");
                    TaskManager.getInstance().onNativeInit();
                }
                boolean equals = "true".equals(DAIKVStoreage.getValue("JARVIS", "featureUploadAllSwitch"));
                vxa.k(equals);
                TaskManager.getInstance().initializeMonitor(equals);
                LogUtil.d("DAI", "initialNativeTaskHandle addTaskInner success");
                kzo.c().v(true);
                LogUtil.d("DAI", "initialNativeTaskHandle success");
            } catch (Throwable th) {
                LogUtil.e("DAI", "initialNativeTaskHandle error!!!", th);
                lu0.a("Business", "initialize", String.valueOf(181), th.getMessage());
                kzo.c().s(true);
                lu0.d("DAI", 19999, "init_error", "java-c bridge", null, null);
            }
        }
    }
}

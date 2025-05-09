package tb;

import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.taobao.adapter.extension.monitor.model.AURABlockDataModel;
import com.alibaba.android.umbrella.link.UMLinkLogInterface;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
@AURAExtensionImpl(code = xf.AURA_CODE)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class xf extends ls {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String AURA_CODE = "aura.impl.aspect.error.alarm.monitor";
    public UMLinkLogInterface c;
    public ExecutorService d;
    public zf e;
    public List<vab> f;
    public List<uab> g;
    public List<vt> h;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ mi f31342a;
        public final /* synthetic */ long b;

        public a(mi miVar, long j) {
            this.f31342a = miVar;
            this.b = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                xf.B(xf.this, this.f31342a, this.b);
                if (!xf.L(xf.this, this.f31342a) && xf.m0(xf.this) != null && fj.e("enableJsTracker", true, true)) {
                    xf.m0(xf.this).k(xf.J0(xf.this));
                    xf.m0(xf.this).b(this.f31342a);
                }
            } catch (Throwable th) {
                ck.g().e("AURAAlarmMonitorExtension", th.getMessage());
            }
        }
    }

    static {
        t2o.a(81789162);
    }

    public static /* synthetic */ void B(xf xfVar, mi miVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ed74efd", new Object[]{xfVar, miVar, new Long(j)});
        } else {
            xfVar.L0(miVar, j);
        }
    }

    public static /* synthetic */ AURAGlobalData J0(xf xfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURAGlobalData) ipChange.ipc$dispatch("f5630ba5", new Object[]{xfVar});
        }
        return xfVar.r();
    }

    public static /* synthetic */ boolean L(xf xfVar, mi miVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("97d3488a", new Object[]{xfVar, miVar})).booleanValue();
        }
        return xfVar.O0(miVar);
    }

    public static /* synthetic */ Object ipc$super(xf xfVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode == -25033014) {
            super.onCreate((lo) objArr[0], (yi) objArr[1]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alibaba/android/aura/taobao/adapter/extension/monitor/AURAAlarmMonitorExtension");
        }
    }

    public static /* synthetic */ zf m0(xf xfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zf) ipChange.ipc$dispatch("81096ccf", new Object[]{xfVar});
        }
        return xfVar.e;
    }

    public final boolean K0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("85da919c", new Object[]{this})).booleanValue();
        }
        List<uab> list = this.g;
        if (list == null) {
            return true;
        }
        Iterator<uab> it = list.iterator();
        if (it.hasNext()) {
            return it.next().x0();
        }
        return true;
    }

    public final void L0(mi miVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27a3b27a", new Object[]{this, miVar, new Long(j)});
        } else if (K0()) {
            String d = x().d();
            String c = miVar.c();
            String b = miVar.b();
            String str = c + "_" + b;
            String e = miVar.e();
            AURABlockDataModel M0 = M0(miVar);
            HashMap<String, String> N0 = N0(miVar);
            N0.put("auraTime", String.valueOf(j));
            if (M0 != null) {
                N0.put("sliceLinkId", M0.getLinkId());
                N0.put("sliceCount", String.valueOf(M0.getSliceDataList().size()));
            }
            P0(c, b, d, str, e, N0);
            if (M0 != null) {
                for (AURABlockDataModel.AURASliceDataModel aURASliceDataModel : M0.getSliceDataList()) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("sliceLinkId", aURASliceDataModel.getSliceLinkId());
                    hashMap.put("sliceNum", aURASliceDataModel.getSliceNum());
                    hashMap.put("sliceData", aURASliceDataModel.getData());
                    P0(c, b, d, str, e, hashMap);
                }
            }
        }
    }

    public final AURABlockDataModel M0(mi miVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURABlockDataModel) ipChange.ipc$dispatch("5be4bfd2", new Object[]{this, miVar});
        }
        List<vab> list = this.f;
        if (list == null) {
            return null;
        }
        for (vab vabVar : list) {
            AURABlockDataModel G = vabVar.G(miVar);
            if (G != null) {
                return G;
            }
        }
        return null;
    }

    public final HashMap<String, String> N0(mi miVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("5fc822b0", new Object[]{this, miVar});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("bizCode", x().d());
        Map<String, Object> d = miVar.d();
        if (d != null) {
            for (Map.Entry<String, Object> entry : d.entrySet()) {
                Object value = entry.getValue();
                if (value instanceof Map) {
                    hashMap.put(entry.getKey(), tj.c(value));
                } else {
                    hashMap.put(entry.getKey(), String.valueOf(entry.getValue()));
                }
            }
        }
        ni a2 = miVar.a();
        if (a2 != null) {
            hashMap.put("serviceCode", a2.b());
            hashMap.put("flowCode", a2.a());
        }
        return hashMap;
    }

    public final boolean O0(mi miVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9bd67fd0", new Object[]{this, miVar})).booleanValue();
        }
        List<vt> list = this.h;
        if (list == null) {
            return false;
        }
        for (vt vtVar : list) {
            if (vtVar.L(miVar)) {
                return true;
            }
        }
        return false;
    }

    @Override // tb.wab
    public void b(mi miVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b02141a5", new Object[]{this, miVar});
        } else {
            this.d.execute(new a(miVar, System.currentTimeMillis()));
        }
    }

    @Override // tb.ls, tb.ybb
    public void onCreate(lo loVar, yi yiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe8206ca", new Object[]{this, loVar, yiVar});
            return;
        }
        super.onCreate(loVar, yiVar);
        this.c = hdv.a();
        this.f = yiVar.f(vab.class);
        this.g = yiVar.f(uab.class);
        this.h = yiVar.f(vt.class);
        this.d = dn.d(1, 3, 3L, TimeUnit.SECONDS, "AURAUserTrackEvent");
        this.e = new zf(loVar.d());
    }

    @Override // tb.ls, tb.ybb
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        ExecutorService executorService = this.d;
        if (executorService != null && !executorService.isShutdown()) {
            this.d.shutdown();
        }
        this.d = null;
    }

    public final void P0(String str, String str2, String str3, String str4, String str5, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85c705a5", new Object[]{this, str, str2, str3, str4, str5, map});
            return;
        }
        this.c.logError("AURAMonitor", str3, str, null, str4, str5, null, cyu.b(map));
        this.c.commitFailure(str, str2, "1.0", "AURAMonitor", str3, map, str4, str5);
        rbb g = ck.g();
        g.b(ck.AURA_LOGGER, "onError", str3 + "|" + str + "|" + str4 + "|" + str5 + "|" + map);
    }
}

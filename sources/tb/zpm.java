package tb;

import android.text.TextUtils;
import androidx.collection.LruCache;
import anetwork.channel.monitor.NetworkQualityMonitor;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.business.intelligence.netpredict.NetFactor;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.data.datamodel.a;
import com.taobao.android.fluid.framework.preload.IPreCacheService;
import com.taobao.login4android.api.Login;
import com.taobao.tao.flexbox.layoutmanager.player.videodecide.VideoControllerManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class zpm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final LruCache<String, Integer> f32934a;
    public final LruCache<String, NetFactor> b;
    public final LruCache<Integer, List<Long>> c;
    public final LruCache<Integer, List<String>> d;
    public final LruCache<Integer, Long> e;
    public int f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final zpm f32935a = new zpm();

        static {
            t2o.a(468713527);
        }

        public static /* synthetic */ zpm a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (zpm) ipChange.ipc$dispatch("e4d7b4", new Object[0]);
            }
            return f32935a;
        }
    }

    static {
        t2o.a(468713525);
    }

    public static zpm g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zpm) ipChange.ipc$dispatch("f059169a", new Object[0]);
        }
        return b.a();
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bbc248c", new Object[]{this});
        } else {
            this.f = 0;
        }
    }

    public void b(FluidContext fluidContext, List<com.taobao.android.fluid.framework.data.datamodel.a> list, int i) {
        Throwable th;
        int i2;
        float f;
        boolean z = false;
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e8ab517", new Object[]{this, fluidContext, list, new Integer(i)});
        } else if (!ief.e()) {
            ir9.b("PreCache-Predicter", i + " return : 开关 拦截");
        } else {
            int i3 = this.f;
            if (i3 == i || i3 > i) {
                ir9.b("PreCache-Predicter", i + " return : index 拦截");
                return;
            }
            this.f = i;
            NetFactor netFactor = new NetFactor();
            netFactor.netLibSpeed = NetworkQualityMonitor.getInstance().getGlobalCurrentBandwidth();
            netFactor.netAvSpeed = z5r.l();
            netFactor.netQuality = NetworkQualityMonitor.getGlobalNetworkQuality();
            netFactor.netType = z5r.n(null, FluidSDK.getContext());
            try {
                IPreCacheService iPreCacheService = (IPreCacheService) fluidContext.getService(IPreCacheService.class);
                if (iPreCacheService != null) {
                    iPreCacheService.commitFeature(list, i - 1);
                }
                netFactor.abnormalInfo = e(i);
                netFactor.playErrorInfo = i(i);
                netFactor.firstFrameInfo = f(i);
            } catch (Throwable th2) {
                th = th2;
            }
            if (list.size() <= i) {
                ir9.b("PreCache-Predicter", i + " return :  size 拦截");
                d(fluidContext, netFactor);
                return;
            }
            com.taobao.android.fluid.framework.data.datamodel.a aVar = list.get(i);
            if (aVar.e() == null) {
                ir9.b("PreCache-Predicter", i + " return : data null");
                d(fluidContext, netFactor);
            } else if (aVar.e().z()) {
                try {
                    ir9.b("PreCache-Predicter", i + " return : data null");
                } catch (Throwable th3) {
                    th = th3;
                    z = true;
                    z2 = false;
                    try {
                        th.printStackTrace();
                        ir9.b("PreCache-Predicter", i + " return : error " + th.getMessage());
                    } finally {
                        if (!z && !z2) {
                            d(fluidContext, netFactor);
                        }
                    }
                }
            } else if (aVar.e().w()) {
                try {
                    ir9.b("PreCache-Predicter", i + " return : data ad");
                } catch (Throwable th4) {
                    th = th4;
                    th.printStackTrace();
                    ir9.b("PreCache-Predicter", i + " return : error " + th.getMessage());
                }
            } else if (!aVar.e().C()) {
                ir9.b("PreCache-Predicter", i + " return : not video ");
                d(fluidContext, netFactor);
            } else if (hrm.a().b().b <= 0) {
                ir9.b("PreCache-Predicter", i + " return : predownloadSize < 0");
                d(fluidContext, netFactor);
            } else {
                a.d e = aVar.e();
                String O = e.O();
                netFactor.sessionId = Login.getUserId() + "-" + O + "-" + i;
                Map<String, String> a2 = pmm.b().a(O);
                if (a2 != null) {
                    i2 = nwv.t(a2.get(pg1.ATOM_length), 0);
                } else {
                    i2 = -1;
                }
                if (i2 > 0 && this.f32934a.get(O) != null) {
                    float intValue = this.f32934a.get(O).intValue();
                    netFactor.cacheProgress = (1.0f * intValue) / i2;
                    netFactor.duration = e.i();
                    VideoControllerManager.a g = VideoControllerManager.g(O);
                    if (g == null) {
                        ir9.b("PreCache-Predicter", i + " return : DecidedVideoResModel null");
                        d(fluidContext, netFactor);
                        return;
                    }
                    int i4 = g.d;
                    netFactor.bitrate = i4;
                    if (i4 > 0) {
                        f = (intValue * 8.0f) / (i4 * 1000);
                    } else {
                        f = 0.0f;
                    }
                    netFactor.cacheDuration = f;
                    ir9.b("PreCache-Predicter", i + ": netFactor: " + JSON.toJSONString(netFactor));
                }
                ir9.b("PreCache-Predicter", i + " 开始预测：  videoId: " + O);
                this.b.put(O, netFactor);
            }
        }
    }

    public final void c(FluidContext fluidContext, String str, String str2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3721b2a6", new Object[]{this, fluidContext, str, str2, obj});
            return;
        }
        IPreCacheService iPreCacheService = (IPreCacheService) fluidContext.getService(IPreCacheService.class);
        if (iPreCacheService != null) {
            iPreCacheService.commitLabel(str, str2, obj);
        }
    }

    public final void d(FluidContext fluidContext, NetFactor netFactor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60a32ee8", new Object[]{this, fluidContext, netFactor});
            return;
        }
        IPreCacheService iPreCacheService = (IPreCacheService) fluidContext.getService(IPreCacheService.class);
        if (iPreCacheService != null && iPreCacheService.enablePreCache()) {
            ir9.b("PreCache-Predicter", " -----doPredict----- ");
            if (iPreCacheService.isWeakNetWork(netFactor)) {
                iPreCacheService.pickCacheData();
            } else {
                ir9.b("PreCache-Predicter", " -----doPredict--:-noNeed-- ");
            }
        }
    }

    public final String e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("53c29b50", new Object[]{this, new Integer(i)});
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = i - 4; i2 < i; i2++) {
            List<Long> list = this.c.get(Integer.valueOf(i2));
            if (list != null && list.size() > 0) {
                arrayList.add(list);
            }
        }
        if (arrayList.size() > 0) {
            return JSON.toJSONString(arrayList);
        }
        return null;
    }

    public final String f(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c8632de5", new Object[]{this, new Integer(i)});
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = i - 4; i2 < i; i2++) {
            Long l = this.e.get(Integer.valueOf(i2));
            if (l != null) {
                arrayList.add(l);
            }
        }
        if (arrayList.size() > 0) {
            return JSON.toJSONString(arrayList);
        }
        return null;
    }

    public String h(String str) {
        NetFactor remove;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("32ec4966", new Object[]{this, str});
        }
        if (!TextUtils.isEmpty(str) && (remove = this.b.remove(str)) != null) {
            return JSON.toJSONString(remove);
        }
        return null;
    }

    public final String i(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("322daa10", new Object[]{this, new Integer(i)});
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = i - 4; i2 < i; i2++) {
            List<String> list = this.d.get(Integer.valueOf(i2));
            if (list != null && list.size() > 0) {
                arrayList.add(list);
            }
        }
        if (arrayList.size() > 0) {
            return JSON.toJSONString(arrayList);
        }
        return null;
    }

    public LruCache<String, Integer> j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LruCache) ipChange.ipc$dispatch("239c8aa7", new Object[]{this});
        }
        return this.f32934a;
    }

    public void k(FluidContext fluidContext, String str, int i, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("848fd323", new Object[]{this, fluidContext, str, new Integer(i), new Long(j)});
        } else if (j > 0) {
            List<Long> list = this.c.get(Integer.valueOf(i));
            if (list == null) {
                list = new ArrayList<>();
            }
            list.add(Long.valueOf(j));
            this.c.put(Integer.valueOf(i), list);
            c(fluidContext, str, "abnormal", list);
        }
    }

    public void l(FluidContext fluidContext, int i, String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc968b24", new Object[]{this, fluidContext, new Integer(i), str, new Long(j)});
            return;
        }
        this.e.put(Integer.valueOf(i), Long.valueOf(j));
        c(fluidContext, str, "firstFrame", Long.valueOf(j));
    }

    public void m(FluidContext fluidContext, String str, int i, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d25c1c51", new Object[]{this, fluidContext, str, new Integer(i), str2});
            return;
        }
        List<String> list = this.d.get(Integer.valueOf(i));
        if (list == null) {
            list = new ArrayList<>();
        }
        list.add(str2);
        this.d.put(Integer.valueOf(i), list);
        c(fluidContext, str, "playError", str2);
    }

    public void n(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d058bbc", new Object[]{this, str, new Integer(i)});
        } else if (!TextUtils.isEmpty(str)) {
            this.f32934a.put(str, Integer.valueOf(i));
        }
    }

    public zpm() {
        this.f32934a = new LruCache<>(3);
        this.b = new LruCache<>(10);
        this.c = new LruCache<>(3);
        this.d = new LruCache<>(3);
        this.e = new LruCache<>(3);
    }
}

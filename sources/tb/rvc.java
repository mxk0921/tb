package tb;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.Display;
import android.view.WindowManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.monitor.bean.LiveAPMBean;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.qvc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class rvc implements qvc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public ConcurrentHashMap<String, LiveAPMBean> f27634a;
    public final Handler b = new c(Looper.getMainLooper());
    public final ykv c = new ykv();
    public ConcurrentHashMap<String, String> d;
    public WeakReference<Context> e;
    public nya f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ LiveAPMBean f27635a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;

        public a(LiveAPMBean liveAPMBean, String str, String str2) {
            this.f27635a = liveAPMBean;
            this.b = str;
            this.c = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            rvc.b(rvc.this).d(this.f27635a);
            this.f27635a.dataDelay5s = new LiveAPMBean.PerformanceData();
            this.f27635a.dataDelay5s.currentTime = System.currentTimeMillis();
            LiveAPMBean liveAPMBean = this.f27635a;
            LiveAPMBean.PerformanceData performanceData = liveAPMBean.dataDelay5s;
            LiveAPMBean.PerformanceData performanceData2 = liveAPMBean.endPerformanceData;
            performanceData.allFrameNums = performanceData2.allFrameNums;
            long j = performanceData.currentTime - performanceData2.startTime;
            if (j <= 0 || j > l0r.DEFAULT_TCP_CONNECT_TIMEOUT_MS) {
                cwd A = v2s.o().A();
                A.c("IMonitorExecutorImpl", "bad costTime : " + j);
                j = 5000;
            }
            LiveAPMBean liveAPMBean2 = this.f27635a;
            LiveAPMBean.PerformanceData performanceData3 = liveAPMBean2.dataDelay5s;
            performanceData3.costTime = j;
            LiveAPMBean.PerformanceData performanceData4 = liveAPMBean2.endPerformanceData;
            performanceData3.fps = ((float) performanceData4.allFrameNums) / (((float) j) / 1000.0f);
            performanceData3.hitchTotal = performanceData4.hitchTotal / 5000000;
            cwd A2 = v2s.o().A();
            A2.c("IMonitorExecutorImpl", "5s fps : " + this.f27635a.dataDelay5s.fps + " costTime:" + j);
            rvc.c(rvc.this, this.b, this.c);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f27636a;
        public final /* synthetic */ LiveAPMBean b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;

        public b(boolean z, LiveAPMBean liveAPMBean, String str, String str2) {
            this.f27636a = z;
            this.b = liveAPMBean;
            this.c = str;
            this.d = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            if (this.f27636a) {
                rvc.b(rvc.this).d(this.b);
            }
            this.b.dataDelay1s = new LiveAPMBean.PerformanceData();
            this.b.dataDelay1s.currentTime = System.currentTimeMillis();
            LiveAPMBean liveAPMBean = this.b;
            long j = liveAPMBean.dataDelay1s.currentTime - liveAPMBean.endPerformanceData.startTime;
            if (j <= 0 || j > 2000) {
                cwd A = v2s.o().A();
                A.c("IMonitorExecutorImpl", "bad costTime : " + j);
                j = 1000;
            }
            LiveAPMBean liveAPMBean2 = this.b;
            LiveAPMBean.PerformanceData performanceData = liveAPMBean2.dataDelay1s;
            performanceData.costTime = j;
            LiveAPMBean.PerformanceData performanceData2 = liveAPMBean2.endPerformanceData;
            long j2 = performanceData2.allFrameNums;
            performanceData.fps = ((float) j2) / (((float) j) / 1000.0f);
            performanceData.hitchTotal = performanceData2.hitchTotal / 1000000;
            performanceData.allFrameNums = j2;
            cwd A2 = v2s.o().A();
            StringBuilder sb = new StringBuilder("1s fps : ");
            sb.append(this.b.dataDelay1s.fps);
            sb.append(" costTime:");
            sb.append(j);
            sb.append(" refreshRate:");
            rvc rvcVar = rvc.this;
            sb.append(rvc.e(rvcVar, rvc.d(rvcVar)));
            A2.c("IMonitorExecutorImpl", sb.toString());
            if (this.f27636a) {
                rvc.c(rvc.this, this.c, this.d);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class c extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(806356371);
        }

        public c(Looper looper) {
            super(looper);
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            if (str.hashCode() == 673877017) {
                super.handleMessage((Message) objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/sdk/monitor/impl/IMonitorExecutorImpl$LiveAPMHandler");
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                return;
            }
            super.handleMessage(message);
            if (message != null) {
                int i = message.what;
                if (i == 1000) {
                    Message obtain = Message.obtain();
                    obtain.obj = message.obj;
                    obtain.what = 1001;
                    sendMessage(obtain);
                } else if (i == 1001) {
                    Object obj = message.obj;
                    if (obj instanceof String) {
                        try {
                            rvc.a(rvc.this, (String) obj);
                        } catch (Exception e) {
                            cwd A = v2s.o().A();
                            A.c("IMonitorExecutorImpl", "recordEndInteractive error : " + e.getMessage());
                        }
                    }
                }
            }
        }
    }

    static {
        t2o.a(806356368);
        t2o.a(806356353);
    }

    public static /* synthetic */ void a(rvc rvcVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8486f09b", new Object[]{rvcVar, str});
        } else {
            rvcVar.r(str);
        }
    }

    public static /* synthetic */ nya b(rvc rvcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nya) ipChange.ipc$dispatch("73bf15ba", new Object[]{rvcVar});
        }
        return rvcVar.f;
    }

    public static /* synthetic */ void c(rvc rvcVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25afe0a7", new Object[]{rvcVar, str, str2});
        } else {
            rvcVar.v(str, str2);
        }
    }

    public static /* synthetic */ WeakReference d(rvc rvcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeakReference) ipChange.ipc$dispatch("d6d1b7e2", new Object[]{rvcVar});
        }
        return rvcVar.e;
    }

    public static /* synthetic */ float e(rvc rvcVar, WeakReference weakReference) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e3a84d99", new Object[]{rvcVar, weakReference})).floatValue();
        }
        return rvcVar.o(weakReference);
    }

    public void f(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b36f899", new Object[]{this, str, str2});
        } else {
            g(str, str2, null);
        }
    }

    public void g(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79797dcc", new Object[]{this, str, str2, map});
            return;
        }
        cwd A = v2s.o().A();
        A.a("IMonitorExecutorImpl", "addMiddleCollectData sessionId: " + str + " sceneId" + str2);
        if (this.d.containsKey(str)) {
            String str3 = this.d.get(str);
            if (this.f27634a.containsKey(str3)) {
                LiveAPMBean liveAPMBean = this.f27634a.get(str3);
                liveAPMBean.sceneDataList.add(h(liveAPMBean, str2));
                if (liveAPMBean.extParams == null) {
                    liveAPMBean.extParams = new HashMap<>();
                }
                if (map != null && map.size() > 0) {
                    liveAPMBean.extParams.putAll(map);
                }
                cwd A2 = v2s.o().A();
                A2.a("IMonitorExecutorImpl", "addMiddleCollectData generateSessionId: " + str3 + " sceneId" + str2);
                return;
            }
        }
        v2s.o().A().a("IMonitorExecutorImpl", "addMiddleCollectData  bad case ");
    }

    public final LiveAPMBean.SceneData h(LiveAPMBean liveAPMBean, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LiveAPMBean.SceneData) ipChange.ipc$dispatch("930e02f9", new Object[]{this, liveAPMBean, str});
        }
        LiveAPMBean.SceneData sceneData = new LiveAPMBean.SceneData();
        LiveAPMBean.PerformanceData performanceData = new LiveAPMBean.PerformanceData();
        sceneData.performanceData = performanceData;
        performanceData.currentTime = System.currentTimeMillis();
        sceneData.scenePoint = str;
        if (sceneData.performanceData == null) {
            sceneData.performanceData = new LiveAPMBean.PerformanceData();
        }
        if (liveAPMBean.sceneDataList.size() > 0) {
            LiveAPMBean.PerformanceData performanceData2 = sceneData.performanceData;
            performanceData2.costTime = performanceData2.currentTime - liveAPMBean.sceneDataList.get(0).performanceData.currentTime;
        }
        LiveAPMBean.PerformanceData performanceData3 = sceneData.performanceData;
        LiveAPMBean.PerformanceData performanceData4 = liveAPMBean.totalPerformanceData;
        performanceData3.freezeFrameNums = performanceData4.freezeFrameNums;
        performanceData3.hitchTotal = performanceData4.hitchTotal / 1000000;
        long j = performanceData4.allFrameNums;
        performanceData3.allFrameNums = j;
        long j2 = performanceData3.costTime;
        if (j2 > 0) {
            performanceData3.fps = (j * 1000) / j2;
        }
        performanceData3.frameNumsNormal_100 = performanceData4.frameNumsNormal_100;
        performanceData3.frameNums100_300 = performanceData4.frameNums100_300;
        performanceData3.frameNums300_500 = performanceData4.frameNums300_500;
        performanceData3.frameNums500_700 = performanceData4.frameNums500_700;
        performanceData3.stuckFrames = performanceData4.stuckFrames;
        performanceData3.seriousFrames = performanceData4.seriousFrames;
        performanceData3.f0_t1 = performanceData4.f0_t1;
        performanceData3.ft1_t2 = performanceData4.ft1_t2;
        performanceData3.ft2_x = performanceData4.ft2_x;
        performanceData3.frameNums100_150 = performanceData4.frameNums100_150;
        performanceData3.frameNums150_300 = performanceData4.frameNums150_300;
        return sceneData;
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        try {
            ConcurrentHashMap<String, LiveAPMBean> concurrentHashMap = this.f27634a;
            if (concurrentHashMap != null && concurrentHashMap.keySet().size() > 0) {
                for (String str : this.f27634a.keySet()) {
                    this.c.b(str, this.f27634a);
                }
            }
            s();
            Handler handler = this.b;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            ConcurrentHashMap<String, LiveAPMBean> concurrentHashMap2 = this.f27634a;
            if (concurrentHashMap2 != null) {
                concurrentHashMap2.clear();
            }
        } catch (Exception e) {
            cwd A = v2s.o().A();
            A.a("IMonitorExecutorImpl", "upload data error:" + e.getMessage());
        }
    }

    public void j(String str, String str2, Map<String, String> map, qvc.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c8b7ab9", new Object[]{this, str, str2, map, aVar});
            return;
        }
        lca.f23253a = false;
        if (this.d.containsKey(str)) {
            String str3 = this.d.get(str);
            if (this.f27634a.containsKey(str3)) {
                LiveAPMBean liveAPMBean = this.f27634a.get(str3);
                if (liveAPMBean.isEnd) {
                    cwd A = v2s.o().A();
                    A.a("IMonitorExecutorImpl", "endCollectData has called end: " + str3);
                    return;
                }
                liveAPMBean.isEnd = true;
                liveAPMBean.sceneDataList.add(h(liveAPMBean, str2));
                if (liveAPMBean.extParams == null) {
                    liveAPMBean.extParams = new HashMap<>();
                }
                if (map != null && map.size() > 0) {
                    liveAPMBean.extParams.putAll(map);
                }
                Message obtain = Message.obtain();
                obtain.obj = str;
                obtain.what = 1000;
                this.b.sendMessage(obtain);
                cwd A2 = v2s.o().A();
                A2.a("IMonitorExecutorImpl", "endCollectData generateSessionId: " + str3);
                return;
            }
        }
        v2s.o().A().a("IMonitorExecutorImpl", "endCollectData bad case ");
    }

    public final void k(LiveAPMBean liveAPMBean, boolean z, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e88bc8f0", new Object[]{this, liveAPMBean, new Boolean(z), str, str2});
        } else {
            this.b.postDelayed(new b(z, liveAPMBean, str, str2), 1000L);
        }
    }

    public final void l(String str, String str2, LiveAPMBean liveAPMBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da119a68", new Object[]{this, str, str2, liveAPMBean});
        } else {
            this.b.postDelayed(new a(liveAPMBean, str, str2), 5000L);
        }
    }

    public final String m(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9d098253", new Object[]{this, str});
        }
        String str2 = str + "_" + System.currentTimeMillis();
        this.d.put(str, str2);
        return str2;
    }

    public final LiveAPMBean n(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LiveAPMBean) ipChange.ipc$dispatch("cf20138", new Object[]{this, str, map});
        }
        LiveAPMBean liveAPMBean = new LiveAPMBean();
        if (liveAPMBean.extParams == null) {
            liveAPMBean.extParams = new HashMap<>();
        }
        if (map != null && map.size() > 0) {
            liveAPMBean.extParams.putAll(map);
        }
        liveAPMBean.endPerformanceData = new LiveAPMBean.PerformanceData();
        if (lca.f23253a) {
            liveAPMBean.isColdStart = true;
        } else {
            liveAPMBean.isColdStart = false;
        }
        liveAPMBean.startSessionTime = System.currentTimeMillis();
        liveAPMBean.originSessionId = str;
        liveAPMBean.sceneDataList = new ArrayList();
        liveAPMBean.totalPerformanceData = new LiveAPMBean.PerformanceData();
        liveAPMBean.refreshRate = o(this.e);
        return liveAPMBean;
    }

    public final float o(WeakReference weakReference) {
        WindowManager windowManager;
        Display defaultDisplay;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("92b21a72", new Object[]{this, weakReference})).floatValue();
        }
        if (weakReference == null || weakReference.get() == null || !(weakReference.get() instanceof Activity) || (windowManager = ((Activity) weakReference.get()).getWindowManager()) == null || (defaultDisplay = windowManager.getDefaultDisplay()) == null) {
            return 60.0f;
        }
        return defaultDisplay.getRefreshRate();
    }

    public void p(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
            return;
        }
        this.e = new WeakReference<>(context);
        this.f27634a = new ConcurrentHashMap<>();
        this.d = new ConcurrentHashMap<>();
    }

    public void q(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b28d7dd3", new Object[]{this, str});
            return;
        }
        cwd A = v2s.o().A();
        A.a("IMonitorExecutorImpl", "intercept sessionId:" + str);
        if (this.d.containsKey(str)) {
            String str2 = this.d.get(str);
            cwd A2 = v2s.o().A();
            A2.a("IMonitorExecutorImpl", "intercept generateSessionId:" + str2);
            if (this.f27634a.containsKey(str2)) {
                v(str, str2);
                s();
                cwd A3 = v2s.o().A();
                A3.a("IMonitorExecutorImpl", "intercept uploadData generateSessionId:" + str2);
            }
        }
    }

    public final void r(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5098de49", new Object[]{this, str});
        } else if (this.d.containsKey(str)) {
            String str2 = this.d.get(str);
            if (this.f27634a.containsKey(str2)) {
                LiveAPMBean liveAPMBean = this.f27634a.get(str2);
                liveAPMBean.sceneDataList.add(h(liveAPMBean, lca.STAGE_INTERACTIVE));
                if (this.c != null) {
                    if (liveAPMBean.endPerformanceData == null) {
                        liveAPMBean.endPerformanceData = new LiveAPMBean.PerformanceData();
                    }
                    liveAPMBean.endPerformanceData.allFrameNums = 0L;
                    liveAPMBean.isWholeSession = true;
                    if (TextUtils.equals("LIVE_CODE_BOOT_STAGE", str)) {
                        k(liveAPMBean, false, str, str2);
                        l(str, str2, liveAPMBean);
                        return;
                    }
                    k(liveAPMBean, true, str, str2);
                }
            }
        }
    }

    public final void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
            return;
        }
        Handler handler = this.b;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            v2s.o().A().a("IMonitorExecutorImpl", "intercept  removeMessage");
        }
        nya nyaVar = this.f;
        if (nyaVar != null) {
            nyaVar.d(null);
        }
        ConcurrentHashMap<String, LiveAPMBean> concurrentHashMap = this.f27634a;
        if (concurrentHashMap != null) {
            concurrentHashMap.clear();
        }
        ConcurrentHashMap<String, String> concurrentHashMap2 = this.d;
        if (concurrentHashMap2 != null) {
            concurrentHashMap2.clear();
        }
        v2s.o().A().a("IMonitorExecutorImpl", "reset all data");
    }

    public void t(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a164154", new Object[]{this, context});
        } else {
            this.e = new WeakReference<>(context);
        }
    }

    public void u(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3ebdd98", new Object[]{this, str, str2, map});
            return;
        }
        String m = m(str);
        if (this.f27634a.containsKey(m)) {
            this.f27634a.remove(m);
            cwd A = v2s.o().A();
            A.a("IMonitorExecutorImpl", "start collect remove generateSessionId: " + m);
        }
        if (!this.f27634a.containsKey(m)) {
            LiveAPMBean n = n(str, map);
            n.sceneDataList.add(h(n, str2));
            this.f27634a.put(m, n);
            cwd A2 = v2s.o().A();
            A2.a("IMonitorExecutorImpl", "start collect data generateSessionId: " + m);
            if (this.f == null) {
                this.f = new nya();
            }
            this.f.g(this.e, n);
        }
    }

    public final void v(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14f26466", new Object[]{this, str, str2});
            return;
        }
        cwd A = v2s.o().A();
        A.c("IMonitorExecutorImpl", "uploadData  generateSessionId: " + str2);
        this.c.b(str2, this.f27634a);
        if (this.f27634a.keySet().contains(str2)) {
            this.f27634a.remove(str2);
        }
        if (this.d.keySet().contains(str)) {
            this.d.remove(str);
        }
    }
}

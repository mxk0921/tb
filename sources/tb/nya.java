package tb;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import android.view.Display;
import android.view.WindowManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.monitor.bean.LiveAPMBean;
import java.lang.ref.WeakReference;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class nya implements Choreographer.FrameCallback {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public float f25028a = 16.6f;
    public final float b = 700.0f;
    public final float c = 500.0f;
    public final float d = 300.0f;
    public final float e = 100.0f;
    public final float f = 150.0f;
    public long g = -1;
    public long h = -1;
    public final CopyOnWriteArrayList<LiveAPMBean> i = new CopyOnWriteArrayList<>();
    public final c j = new c(Looper.getMainLooper());

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ LiveAPMBean f25029a;

        public a(LiveAPMBean liveAPMBean) {
            this.f25029a = liveAPMBean;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (nya.a(nya.this).size() <= 0 || nya.b(nya.this) <= 0) {
                nya.a(nya.this).add(this.f25029a);
                Choreographer.getInstance().postFrameCallback(nya.this);
                v2s.o().A().a("HitchRateStage", "post main thread start postFrameCallback");
            } else {
                nya.a(nya.this).add(this.f25029a);
                cwd A = v2s.o().A();
                A.a("HitchRateStage", "post main thread start addListener" + this.f25029a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ LiveAPMBean f25030a;

        public b(LiveAPMBean liveAPMBean) {
            this.f25030a = liveAPMBean;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (this.f25030a == null) {
                Choreographer.getInstance().removeFrameCallback(nya.this);
                nya.a(nya.this).clear();
                nya.this.f();
                v2s.o().A().a("HitchRateStage", "post main thread intercept remove all monitor");
                nya.c(nya.this).removeCallbacksAndMessages(null);
            } else {
                if (nya.a(nya.this).contains(this.f25030a)) {
                    nya.a(nya.this).remove(this.f25030a);
                    cwd A = v2s.o().A();
                    A.a("HitchRateStage", "post main thread end remove liveAPMBean：" + this.f25030a.hashCode());
                }
                if (nya.a(nya.this).size() == 0) {
                    Choreographer.getInstance().removeFrameCallback(nya.this);
                    nya.this.f();
                    v2s.o().A().a("HitchRateStage", "post main thread end remove all monitor");
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class c extends Handler {
        static {
            t2o.a(806356367);
        }

        public c(Looper looper) {
            super(looper);
        }
    }

    static {
        t2o.a(806356364);
    }

    public static /* synthetic */ CopyOnWriteArrayList a(nya nyaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CopyOnWriteArrayList) ipChange.ipc$dispatch("da09684e", new Object[]{nyaVar});
        }
        return nyaVar.i;
    }

    public static /* synthetic */ long b(nya nyaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4db0bdf4", new Object[]{nyaVar})).longValue();
        }
        return nyaVar.g;
    }

    public static /* synthetic */ c c(nya nyaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("a2f0959a", new Object[]{nyaVar});
        }
        return nyaVar.j;
    }

    public void d(LiveAPMBean liveAPMBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1b8723e", new Object[]{this, liveAPMBean});
            return;
        }
        c cVar = this.j;
        if (cVar != null) {
            cVar.post(new b(liveAPMBean));
        }
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j) {
        long j2;
        LiveAPMBean.PerformanceData performanceData;
        float f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f46aacbb", new Object[]{this, new Long(j)});
            return;
        }
        Choreographer.getInstance().postFrameCallback(this);
        double d = ((j - this.h) * 1.0d) / 1000000.0d;
        this.h = j;
        CopyOnWriteArrayList<LiveAPMBean> copyOnWriteArrayList = this.i;
        if (copyOnWriteArrayList != null && copyOnWriteArrayList.size() > 0) {
            for (int i = 0; i < this.i.size(); i++) {
                LiveAPMBean liveAPMBean = this.i.get(i);
                if (liveAPMBean.isWholeSession) {
                    if (liveAPMBean.endPerformanceData == null) {
                        liveAPMBean.endPerformanceData = new LiveAPMBean.PerformanceData();
                    }
                    performanceData = liveAPMBean.endPerformanceData;
                } else {
                    performanceData = liveAPMBean.totalPerformanceData;
                }
                if (performanceData.allFrameNums == 0) {
                    performanceData.startTime = System.currentTimeMillis();
                }
                performanceData.allFrameNums++;
                int i2 = (d > this.f25028a ? 1 : (d == this.f25028a ? 0 : -1));
                if (i2 > 0 && d <= this.e) {
                    performanceData.frameNumsNormal_100++;
                } else if (d > this.e && d <= this.d) {
                    performanceData.frameNums100_300++;
                } else if (d > this.d && d <= this.c) {
                    performanceData.frameNums300_500++;
                } else if (d > this.c && d <= this.b) {
                    performanceData.frameNums500_700++;
                } else if (d > this.b) {
                    performanceData.freezeFrameNums++;
                }
                if (d > this.e && d <= this.f) {
                    performanceData.frameNums100_150++;
                } else if (d > this.f && d <= this.d) {
                    performanceData.frameNums150_300++;
                }
                if (i2 > 0) {
                    performanceData.hitchTotal = ((float) performanceData.hitchTotal) + (((float) j2) - f);
                }
            }
        }
    }

    public final float e(WeakReference weakReference) {
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

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
            return;
        }
        this.g = -1L;
        this.h = -1L;
    }

    public void g(WeakReference<Context> weakReference, LiveAPMBean liveAPMBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1266cb2b", new Object[]{this, weakReference, liveAPMBean});
        } else if (this.j != null) {
            this.f25028a = 1000.0f / e(weakReference);
            long nanoTime = System.nanoTime();
            this.g = nanoTime;
            this.h = nanoTime;
            if (liveAPMBean == null) {
                v2s.o().A().a("HitchRateStage", "liveAPMBean is null return");
            } else {
                this.j.post(new a(liveAPMBean));
            }
        }
    }
}

package tb;

import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.uniinfra_kmp.common_utils.ContainerType;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.Metadata;
import tb.yvt;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class yvt implements qzf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Timer f32378a;
    public long b;
    public boolean c;
    public pzf d;
    public d1a<xhv> e;
    public Handler f;

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"tb/yvt$a", "Ljava/util/TimerTask;", "Ltb/xhv;", "run", "()V", "common_utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a extends TimerTask {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ pzf f32379a;
        public final /* synthetic */ yvt b;
        public final /* synthetic */ d1a<xhv> c;

        public a(pzf pzfVar, yvt yvtVar, d1a<xhv> d1aVar) {
            this.f32379a = pzfVar;
            this.b = yvtVar;
            this.c = d1aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(d1a d1aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d06dbc7a", new Object[]{d1aVar});
            } else {
                d1aVar.invoke();
            }
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/uniinfra_kmp/common_utils/TimerTask$startTimerTask$1");
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            pzf pzfVar = this.f32379a;
            if (pzfVar == null || ((aet) pzfVar).j() != ContainerType.KMain) {
                this.c.invoke();
                return;
            }
            yvt.d(this.b, new Handler(Looper.getMainLooper()));
            Handler c = yvt.c(this.b);
            if (c != null) {
                final d1a<xhv> d1aVar = this.c;
                c.post(new Runnable() { // from class: tb.xvt
                    @Override // java.lang.Runnable
                    public final void run() {
                        yvt.a.b(d1a.this);
                    }
                });
            }
        }
    }

    static {
        t2o.a(1029701673);
        t2o.a(1029701656);
    }

    public static final /* synthetic */ Handler c(yvt yvtVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("59ad2a76", new Object[]{yvtVar});
        }
        return yvtVar.f;
    }

    public static final /* synthetic */ void d(yvt yvtVar, Handler handler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e2d8b8c", new Object[]{yvtVar, handler});
        } else {
            yvtVar.f = handler;
        }
    }

    @Override // tb.qzf
    public void a(d1a<xhv> d1aVar, boolean z, long j, int i, pzf pzfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad178deb", new Object[]{this, d1aVar, new Boolean(z), new Long(j), new Integer(i), pzfVar});
            return;
        }
        ckf.g(d1aVar, "onTick");
        if (this.f32378a != null) {
            b();
        }
        this.f32378a = new Timer();
        a aVar = new a(pzfVar, this, d1aVar);
        this.b = j;
        this.c = z;
        this.d = pzfVar;
        this.e = d1aVar;
        if (z) {
            Timer timer = this.f32378a;
            if (timer != null) {
                timer.schedule(aVar, 0L, j);
                return;
            }
            return;
        }
        Timer timer2 = this.f32378a;
        if (timer2 != null) {
            timer2.schedule(aVar, 0L);
        }
    }

    @Override // tb.qzf
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c96810f", new Object[]{this});
            return;
        }
        Timer timer = this.f32378a;
        if (timer != null) {
            timer.cancel();
        }
        Handler handler = this.f;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f = null;
        }
        this.f32378a = null;
    }

    @Override // tb.qzf
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            b();
        }
    }

    public final yvt e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yvt) ipChange.ipc$dispatch("c6f6479f", new Object[]{this});
        }
        return this;
    }

    @Override // tb.qzf
    public void resume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("deb96e34", new Object[]{this});
            return;
        }
        d1a<xhv> d1aVar = this.e;
        if (d1aVar != null) {
            a(d1aVar, this.c, this.b, -1, this.d);
        }
    }
}

package tb;

import android.content.Context;
import android.content.Intent;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.diagnose.scene.a;
import com.taobao.tao.log.logger.EventLogger;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class rki {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f27442a;
    public final qk7 b;
    public a c = null;
    public final AtomicBoolean d = new AtomicBoolean(false);
    public boolean e = false;
    public int f = 0;
    public boolean g = false;
    public long h = 0;

    static {
        t2o.a(615514161);
    }

    public rki(Context context, qk7 qk7Var) {
        this.f27442a = context;
        this.b = qk7Var;
    }

    public void c(final long j, final long j2, final long j3, long j4, long j5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a220b00", new Object[]{this, new Long(j), new Long(j2), new Long(j3), new Long(j4), new Long(j5)});
            return;
        }
        a.p("fact_heap_level", Long.valueOf(j2));
        if (mk7.n.isCheckExhaustEnable() && !this.d.compareAndSet(false, true)) {
            al7.b().a(new Runnable() { // from class: tb.qki
                @Override // java.lang.Runnable
                public final void run() {
                    rki.this.d(j, j2, j3);
                }
            });
        }
    }

    public final /* synthetic */ void d(long j, long j2, long j3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d5f5155", new Object[]{this, new Long(j), new Long(j2), new Long(j3)});
            return;
        }
        try {
            b(j, j2, j3);
        } finally {
            this.d.set(false);
        }
    }

    public void e(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad7a13f7", new Object[]{this, aVar});
        } else {
            this.c = aVar;
        }
    }

    public final void b(long j, long j2, long j3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc658dbe", new Object[]{this, new Long(j), new Long(j2), new Long(j3)});
        } else if (!this.e) {
            if (j2 < mk7.n.memExhaustLevel) {
                this.f = 0;
                return;
            }
            int i = this.f;
            if (i == 0) {
                this.h = j3;
            }
            int i2 = i + 1;
            this.f = i2;
            if (i2 >= 3) {
                if (i2 == 3) {
                    System.gc();
                    System.runFinalization();
                    return;
                }
                if (!this.g) {
                    xk7.d(j >> 20, j2, (this.b.i() != null ? this.b.i().b : 0L) >> 20, this.h >> 20);
                    if (this.b.c().isInner) {
                        xk7.e(14);
                    }
                    this.g = true;
                }
                if (!mk7.o || this.f >= mk7.n.exhaustCount + 3) {
                    this.e = true;
                    Intent intent = new Intent("com.taobao.android.diagnose.action.JAVA_LOW_MEMORY");
                    intent.putExtra("used", j);
                    intent.putExtra("ratio", j2);
                    LocalBroadcastManager.getInstance(this.f27442a).sendBroadcast(intent);
                    idh.b("MemoryChecker", "Notify JAVA_LOW_MEMORY. ratio=" + j2);
                    EventLogger.builder(5).setData("type", String.valueOf(14)).setData("used", String.valueOf(j)).setData("ratio", String.valueOf(j2)).setData("before", String.valueOf(this.h)).log();
                    this.c.n("scene_mem_exhaust", null);
                }
            }
        }
    }
}

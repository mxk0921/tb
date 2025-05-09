package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class suo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final juo sScheduler = new ydp();

    /* renamed from: a  reason: collision with root package name */
    public final Runnable f28283a;
    public long b = 0;
    public juo c = sScheduler;

    public suo(Runnable runnable) {
        this.f28283a = runnable;
    }

    public static suo c(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (suo) ipChange.ipc$dispatch("2b0c1945", new Object[]{runnable});
        }
        return new suo(runnable);
    }

    public suo a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (suo) ipChange.ipc$dispatch("4d5fd236", new Object[]{this, new Long(j)});
        }
        this.b = j;
        return this;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4532f39e", new Object[]{this});
        } else {
            this.c.a(this.f28283a, this.b);
        }
    }

    public suo d(juo juoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (suo) ipChange.ipc$dispatch("dde2c764", new Object[]{this, juoVar});
        }
        this.c = juoVar;
        return this;
    }
}

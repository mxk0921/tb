package tb;

import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Deque;
import java.util.LinkedList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class lfh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Deque<civ> f23313a = new LinkedList();
    public int b;
    public final long c;
    public final long d;
    public final long e;

    static {
        t2o.a(116391941);
    }

    public lfh(long j, long j2, long j3) {
        this.c = j;
        this.d = j2;
        this.e = j3;
    }

    public final boolean a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3b1ef25d", new Object[]{this, new Integer(i)})).booleanValue();
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        synchronized (this.f23313a) {
            try {
                b(elapsedRealtime);
                if (this.b + i > this.c) {
                    return false;
                }
                civ civVar = (civ) ((LinkedList) this.f23313a).peekLast();
                if (civVar != null) {
                    if (elapsedRealtime - civVar.b() > this.e) {
                        civVar = null;
                    }
                    if (civVar != null) {
                        civVar.c(civVar.a() + i);
                        this.b += i;
                        return true;
                    }
                }
                ((LinkedList) this.f23313a).add(new civ(elapsedRealtime, i));
                this.b += i;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(long j) {
        long j2;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3cc57001", new Object[]{this, new Long(j)});
            return;
        }
        long j3 = j - this.d;
        while (!this.f23313a.isEmpty()) {
            civ civVar = (civ) ((LinkedList) this.f23313a).peek();
            if (civVar != null) {
                j2 = civVar.b();
            } else {
                j2 = j;
            }
            if (j2 < j3) {
                civ civVar2 = (civ) ((LinkedList) this.f23313a).poll();
                int i2 = this.b;
                if (civVar2 != null) {
                    i = civVar2.a();
                } else {
                    i = 0;
                }
                this.b = i2 - i;
            } else {
                return;
            }
        }
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
            return;
        }
        synchronized (this.f23313a) {
            ((LinkedList) this.f23313a).clear();
            this.b = 0;
            xhv xhvVar = xhv.INSTANCE;
        }
    }
}

package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayDeque;
import java.util.Queue;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class pdt<TResult> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Object f26034a = new Object();
    public Queue<odt<TResult>> b;
    public boolean c;

    static {
        t2o.a(677380279);
    }

    public final void a(odt<TResult> odtVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e71a99a0", new Object[]{this, odtVar});
            return;
        }
        synchronized (this.f26034a) {
            try {
                if (this.b == null) {
                    this.b = new ArrayDeque();
                }
                this.b.add(odtVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(bdt bdtVar) {
        odt odtVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b820062f", new Object[]{this, bdtVar});
            return;
        }
        synchronized (this.f26034a) {
            if (this.b != null && !this.c) {
                this.c = true;
                while (true) {
                    synchronized (this.f26034a) {
                        try {
                            odtVar = (odt) ((ArrayDeque) this.b).poll();
                            if (odtVar == null) {
                                this.c = false;
                                return;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    odtVar.a(bdtVar);
                }
            }
        }
    }
}

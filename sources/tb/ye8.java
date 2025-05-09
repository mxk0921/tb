package tb;

import com.alibaba.jsi.standard.JSEngine;
import com.alibaba.jsi.standard.js.Bridge;
import com.alibaba.security.realidentity.g4;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ye8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final JSEngine f32020a;
    public long b = 0;
    public Thread c = null;

    static {
        t2o.a(921698333);
    }

    public ye8(JSEngine jSEngine) {
        this.f32020a = jSEngine;
        b();
    }

    public final void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        throw new Error("Can not call EngineScope." + str + " across thread: current is" + Thread.currentThread() + ", while the scope has thread " + this.c);
    }

    public synchronized boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ccc95f63", new Object[]{this})).booleanValue();
        }
        if (this.b != 0) {
            if (this.c == Thread.currentThread()) {
                return true;
            }
            a(g4.b.i);
        }
        if (!this.f32020a.isDisposed()) {
            Object engineCmd = Bridge.engineCmd(this.f32020a, 1, 0L);
            if (engineCmd instanceof Long) {
                this.b = ((Long) engineCmd).longValue();
                this.c = Thread.currentThread();
            }
            if (this.b != 0) {
                return true;
            }
            return false;
        }
        throw new Error("JSEngine '" + this.f32020a.getEmbedderName() + "' has been disposed!");
    }

    public synchronized void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81677ea5", new Object[]{this});
        } else if (this.b != 0) {
            if (this.c != Thread.currentThread()) {
                a("exit");
            }
            if (!this.f32020a.isDisposed()) {
                Bridge.engineCmd(this.f32020a, 2, this.b);
                this.b = 0L;
                this.c = null;
            }
        }
    }
}

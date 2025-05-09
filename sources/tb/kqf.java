package tb;

import com.alibaba.jsi.standard.js.Bridge;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class kqf implements wa7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final dqf f22853a;
    public long b;
    public boolean c = false;

    static {
        t2o.a(921698339);
        t2o.a(921698332);
    }

    public kqf(dqf dqfVar, String str) {
        this.f22853a = dqfVar;
        this.b = Bridge.createNative(dqfVar, 21, new Object[]{str});
        lwx.d(dqfVar, this);
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.c) {
            throw new RuntimeException("JSException has been deleted: " + this);
        }
    }

    public String b(dqf dqfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("40c3ae5d", new Object[]{this, dqfVar});
        }
        a();
        Object cmd = Bridge.cmd(dqfVar, 602, this.b);
        if (cmd instanceof String) {
            return (String) cmd;
        }
        return null;
    }

    public String c(dqf dqfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("91c33d2d", new Object[]{this, dqfVar});
        }
        a();
        Object cmd = Bridge.cmd(dqfVar, 601, this.b);
        if (cmd instanceof String) {
            return (String) cmd;
        }
        return null;
    }

    public String d(dqf dqfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5a51387c", new Object[]{this, dqfVar});
        }
        a();
        Object cmd = Bridge.cmd(dqfVar, 603, this.b);
        if (cmd instanceof String) {
            return (String) cmd;
        }
        return null;
    }

    @Override // tb.wa7
    public void delete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("691b3cb2", new Object[]{this});
            return;
        }
        long j = this.b;
        if (j != 0 && !this.c) {
            Bridge.nativeDelete(j, 4);
            this.b = 0L;
            lwx.i(this.f22853a, this);
        }
        this.c = true;
    }

    public ksf e(dqf dqfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ksf) ipChange.ipc$dispatch("76af2da", new Object[]{this, dqfVar});
        }
        a();
        Object cmd = Bridge.cmd(dqfVar, 604, this.b);
        if (cmd instanceof ksf) {
            return (ksf) cmd;
        }
        return null;
    }

    public String f(dqf dqfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("32af5822", new Object[]{this, dqfVar});
        }
        a();
        Object cmd = Bridge.cmd(dqfVar, 600, this.b);
        if (cmd instanceof String) {
            return (String) cmd;
        }
        return null;
    }

    public kqf(dqf dqfVar, long j) {
        this.f22853a = dqfVar;
        this.b = j;
        lwx.d(dqfVar, this);
    }
}

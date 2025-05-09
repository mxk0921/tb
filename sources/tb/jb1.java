package tb;

import com.alibaba.jsi.standard.js.Bridge;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class jb1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public long f21879a;
    public dqf c = null;
    public int d = -1;
    public String e = null;
    public boolean b = false;

    static {
        t2o.a(921698330);
    }

    public jb1(long j) {
        this.f21879a = j;
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.b) {
            throw new RuntimeException("Arguments has been detached: " + this);
        }
    }

    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("507fb609", new Object[]{this})).intValue();
        }
        a();
        if (this.d == -1) {
            Object cmd = Bridge.cmd((dqf) null, 700, this.f21879a);
            if (cmd instanceof Long) {
                this.d = ((Long) cmd).intValue();
            } else {
                this.d = 0;
            }
        }
        return this.d;
    }

    public ksf c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ksf) ipChange.ipc$dispatch("74781593", new Object[]{this, new Integer(i)});
        }
        a();
        Object cmd = Bridge.cmd((dqf) null, 701, this.f21879a, i);
        if (cmd instanceof ksf) {
            return (ksf) cmd;
        }
        return null;
    }

    public dqf d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dqf) ipChange.ipc$dispatch("f0801fa1", new Object[]{this});
        }
        a();
        if (this.c == null) {
            Object cmd = Bridge.cmd((dqf) null, 702, this.f21879a);
            if (cmd instanceof Long) {
                this.c = dqf.d(((Long) cmd).longValue());
            }
        }
        return this.c;
    }

    public String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("39216ba0", new Object[]{this});
        }
        a();
        if (this.e == null) {
            Object cmd = Bridge.cmd((dqf) null, 704, this.f21879a);
            if (cmd instanceof String) {
                this.e = (String) cmd;
            }
        }
        return this.e;
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d3ef8cd6", new Object[]{this})).booleanValue();
        }
        a();
        if (Bridge.cmd((dqf) null, 705, this.f21879a) != null) {
            return true;
        }
        return false;
    }

    public ksf g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ksf) ipChange.ipc$dispatch("9a04fd79", new Object[]{this});
        }
        a();
        Object cmd = Bridge.cmd((dqf) null, 703, this.f21879a);
        if (cmd instanceof ksf) {
            return (ksf) cmd;
        }
        return null;
    }
}

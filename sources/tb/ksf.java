package tb;

import com.alibaba.jsi.standard.js.Bridge;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ksf implements wa7 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int kAttributeDontDelete = 4;
    public static final int kAttributeDontEnum = 2;
    public static final int kAttributeNone = 0;
    public static final int kAttributeReadOnly = 1;
    public static final int kIntegrityFrozen = 0;
    public static final int kIntegritySealed = 1;

    /* renamed from: a  reason: collision with root package name */
    public dqf f22887a;
    public long b;
    public boolean c;

    static {
        t2o.a(921698354);
        t2o.a(921698332);
    }

    public ksf(dqf dqfVar) {
        this.c = false;
        this.f22887a = null;
        this.b = 0L;
    }

    public ksf a(dqf dqfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ksf) ipChange.ipc$dispatch("db5ac280", new Object[]{this, dqfVar});
        }
        return this;
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.c) {
            throw new RuntimeException("JSValue has been deleted: " + this);
        }
    }

    public yrf c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yrf) ipChange.ipc$dispatch("58c6b458", new Object[]{this});
        }
        return null;
    }

    public ksf d(dqf dqfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ksf) ipChange.ipc$dispatch("cf24d394", new Object[]{this, dqfVar});
        }
        long j = this.b;
        if (j == 0) {
            return null;
        }
        Object cmd = Bridge.cmd(dqfVar, 51, j);
        if (cmd instanceof ksf) {
            return (ksf) cmd;
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
            Bridge.nativeDelete(j, 1);
            this.b = 0L;
            lwx.i(this.f22887a, this);
            this.f22887a = null;
            this.c = true;
        }
    }

    public final nsf e(dqf dqfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nsf) ipChange.ipc$dispatch("9b031b1b", new Object[]{this, dqfVar});
        }
        b();
        long j = this.b;
        if (j == 0) {
            return null;
        }
        Object cmd = Bridge.cmd(dqfVar, 53, j);
        if (cmd instanceof ksf) {
            return new nsf(dqfVar, (ksf) cmd, true);
        }
        return null;
    }

    public final ksf f(dqf dqfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ksf) ipChange.ipc$dispatch("de94bc84", new Object[]{this, dqfVar});
        }
        b();
        long j = this.b;
        if (j == 0) {
            return null;
        }
        Object cmd = Bridge.cmd(dqfVar, 54, j);
        if (cmd instanceof ksf) {
            return (ksf) cmd;
        }
        return null;
    }

    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f13c645a", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("38cc5d7a", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3e833929", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("36c59288", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c5f63ead", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fea9ac9d", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("69f8901e", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2eb91dbd", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("239570e6", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b0c4885", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public boolean q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b199369", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Deprecated
    public lsf r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lsf) ipChange.ipc$dispatch("c2e0ee17", new Object[]{this});
        }
        return s(this.f22887a);
    }

    public lsf s(dqf dqfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lsf) ipChange.ipc$dispatch("1c11fc62", new Object[]{this, dqfVar});
        }
        b();
        Object cmd = Bridge.cmd(dqfVar, 750, this.b);
        if (cmd instanceof Long) {
            return new lsf((Long) cmd);
        }
        return null;
    }

    public String t(dqf dqfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("32af5822", new Object[]{this, dqfVar});
        }
        long j = this.b;
        if (j == 0) {
            return null;
        }
        Object cmd = Bridge.cmd(dqfVar, 50, j);
        if (cmd instanceof String) {
            return (String) cmd;
        }
        return null;
    }

    public ksf(dqf dqfVar, long j) {
        this.c = false;
        this.f22887a = dqfVar;
        this.b = j;
        if (j != 0) {
            lwx.d(dqfVar, this);
        }
    }
}

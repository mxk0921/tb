package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public abstract class df {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public a4d f17767a;
    public z3d b;
    public u3d c;
    public q3d d;
    public y3d e;

    static {
        t2o.a(806355725);
        t2o.a(806355730);
    }

    public void K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76627729", new Object[]{this});
        }
    }

    public Object L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("8263caf0", new Object[]{this});
        }
        return null;
    }

    public boolean M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b8f9e31", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public q3d N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (q3d) ipChange.ipc$dispatch("7e889f12", new Object[]{this});
        }
        return this.d;
    }

    public u3d O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (u3d) ipChange.ipc$dispatch("4d1bc0f2", new Object[]{this});
        }
        return this.c;
    }

    public y3d P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (y3d) ipChange.ipc$dispatch("6720a95a", new Object[]{this});
        }
        return this.e;
    }

    public z3d Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (z3d) ipChange.ipc$dispatch("f9ced592", new Object[]{this});
        }
        return this.b;
    }

    public a4d R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a4d) ipChange.ipc$dispatch("fac959b0", new Object[]{this});
        }
        return this.f17767a;
    }

    public void S(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f297880f", new Object[]{this, str});
        }
    }

    public boolean T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("97890f26", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public boolean U() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("73e036b7", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public void V(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9df4207f", new Object[]{this, obj});
        }
    }

    public void W(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f3e9f2d", new Object[]{this, obj});
        }
    }

    public void X(q3d q3dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70dc628c", new Object[]{this, q3dVar});
        } else {
            this.d = q3dVar;
        }
    }

    public void Y(u3d u3dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f7cf016", new Object[]{this, u3dVar});
        } else {
            this.c = u3dVar;
        }
    }

    public void Z(y3d y3dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("963effc8", new Object[]{this, y3dVar});
        } else {
            this.e = y3dVar;
        }
    }

    public void a0(z3d z3dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd763c04", new Object[]{this, z3dVar});
        } else {
            this.b = z3dVar;
        }
    }

    public void b0(a4d a4dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7d52a28", new Object[]{this, a4dVar});
        } else {
            this.f17767a = a4dVar;
        }
    }
}

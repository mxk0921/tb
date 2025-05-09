package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class yl6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public dm6 f32163a;
    public ul6 b = new ul6();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final int f32164a;
        public final byte b;

        static {
            t2o.a(444598001);
        }

        public a(int i, byte b) {
            this.f32164a = i;
            this.b = b;
        }

        public int a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("abb1683a", new Object[]{this})).intValue();
            }
            return this.f32164a;
        }

        public byte b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("94633cff", new Object[]{this})).byteValue();
            }
            return this.b;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final byte f32165a;
        public final boolean b;
        public final short c;
        public final String d;

        static {
            t2o.a(444598002);
        }

        public b(byte b, boolean z, short s, String str) {
            this.f32165a = b;
            this.b = z;
            this.c = s;
            this.d = str;
        }

        public short a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("f2611929", new Object[]{this})).shortValue();
            }
            return this.c;
        }

        public String b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("37b484cb", new Object[]{this});
            }
            return this.d;
        }

        public byte c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("fa40de77", new Object[]{this})).byteValue();
            }
            return this.f32165a;
        }

        public boolean d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("28d6e1f1", new Object[]{this})).booleanValue();
            }
            return this.b;
        }
    }

    static {
        t2o.a(444598000);
    }

    public void a(yl6 yl6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e88b21f2", new Object[]{this, yl6Var});
            return;
        }
        yl6Var.b = this.b;
        dm6 dm6Var = this.f32163a;
        if (dm6Var == null) {
            yl6Var.f32163a = null;
        } else {
            yl6Var.f32163a = dm6Var.a();
        }
    }

    public uw5 b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uw5) ipChange.ipc$dispatch("d4664df0", new Object[]{this});
        }
        dm6 dm6Var = this.f32163a;
        if (dm6Var != null) {
            short g = dm6Var.g();
            if (g == 1 || g == 2) {
                return uw5.S(this.f32163a.e());
            }
            if (g == 3) {
                return uw5.P(this.f32163a.c());
            }
            if (g != 4) {
                if (g == 8) {
                    return uw5.N((List) this.f32163a.f());
                }
                if (g == 9) {
                    return uw5.U((Map) this.f32163a.f());
                }
                if (g == 14) {
                    return uw5.T(this.f32163a.f());
                }
                if (g == 15) {
                    return uw5.O(this.f32163a.b());
                }
                if (g == 17) {
                    return uw5.Q(this.f32163a.d());
                }
            } else if (this.f32163a.f() != null) {
                return uw5.W(this.f32163a.f().toString());
            } else {
                return uw5.W(null);
            }
        }
        return uw5.V();
    }

    public yl6 c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yl6) ipChange.ipc$dispatch("4570ddbd", new Object[]{this});
        }
        return null;
    }

    public List<a> d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("a2e71df8", new Object[]{this});
        }
        return this.b.e;
    }

    public List<gc5> e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("db1e17db", new Object[]{this});
        }
        return this.b.c;
    }

    public b f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("76babf64", new Object[]{this});
        }
        return this.b.d;
    }

    public byte g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("70433819", new Object[]{this})).byteValue();
        }
        return this.b.f29462a;
    }

    public dm6 h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dm6) ipChange.ipc$dispatch("2e9b261e", new Object[]{this});
        }
        return this.f32163a;
    }

    public short i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9e51f47d", new Object[]{this})).shortValue();
        }
        return this.b.b;
    }

    public void j(List<a> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30e95a92", new Object[]{this, list});
        } else {
            this.b.e = list;
        }
    }

    public void k(List<gc5> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22702ae9", new Object[]{this, list});
        } else {
            this.b.c = list;
        }
    }

    public void l(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbddb3a0", new Object[]{this, bVar});
        } else {
            this.b.d = bVar;
        }
    }

    public void m(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8e323b7", new Object[]{this, new Integer(i)});
        } else {
            this.b.getClass();
        }
    }

    public void n(byte b2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73ba32a3", new Object[]{this, new Byte(b2)});
        } else {
            this.b.f29462a = b2;
        }
    }

    public void o(dm6 dm6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8ab4800", new Object[]{this, dm6Var});
        } else {
            this.f32163a = dm6Var;
        }
    }

    public void p(short s) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e30d019", new Object[]{this, new Short(s)});
        } else {
            this.b.b = s;
        }
    }
}

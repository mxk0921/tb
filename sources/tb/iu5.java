package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class iu5 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final iu5 CodeExact;
    public static final iu5 CodeExactUnNotify;
    public static final iu5 DeadLock;
    public static final iu5 DeadLockUnNotify;
    public static final iu5 Default;
    public static final iu5 DefaultUnNotify;
    public static final iu5 XmlExact;
    public static final iu5 XmlExactUnNotify;
    public static final iu5 XmlLayout;
    public static final iu5 XmlLayoutUnNotify;
    public static final iu5 XmlWrap;
    public static final iu5 XmlWrapUnNotify;
    public static final iu5[] values;

    /* renamed from: a  reason: collision with root package name */
    public final int f21586a;
    public final boolean b;

    static {
        t2o.a(444597641);
        iu5 iu5Var = new iu5(0, false);
        DefaultUnNotify = iu5Var;
        iu5 iu5Var2 = new iu5(1, true);
        Default = iu5Var2;
        iu5 iu5Var3 = new iu5(2, false);
        XmlWrapUnNotify = iu5Var3;
        iu5 iu5Var4 = new iu5(3, true);
        XmlWrap = iu5Var4;
        iu5 iu5Var5 = new iu5(4, false);
        XmlExactUnNotify = iu5Var5;
        iu5 iu5Var6 = new iu5(5, true);
        XmlExact = iu5Var6;
        iu5 iu5Var7 = new iu5(6, false);
        XmlLayoutUnNotify = iu5Var7;
        iu5 iu5Var8 = new iu5(7, true);
        XmlLayout = iu5Var8;
        iu5 iu5Var9 = new iu5(8, false);
        CodeExactUnNotify = iu5Var9;
        iu5 iu5Var10 = new iu5(9, true);
        CodeExact = iu5Var10;
        iu5 iu5Var11 = new iu5(10, false);
        DeadLockUnNotify = iu5Var11;
        iu5 iu5Var12 = new iu5(10, true);
        DeadLock = iu5Var12;
        values = new iu5[]{iu5Var, iu5Var2, iu5Var3, iu5Var4, iu5Var5, iu5Var6, iu5Var7, iu5Var8, iu5Var9, iu5Var10, iu5Var11, iu5Var12};
    }

    public iu5(int i, boolean z) {
        this.f21586a = i;
        this.b = z;
    }

    public boolean a(iu5 iu5Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("116546f2", new Object[]{this, iu5Var})).booleanValue();
        }
        int i = this.f21586a;
        int i2 = iu5Var.f21586a;
        if (i < i2) {
            return true;
        }
        if ((!this.b || CodeExact == this) && i == i2) {
            return true;
        }
        return false;
    }

    public iu5 b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (iu5) ipChange.ipc$dispatch("5182f2d4", new Object[]{this});
        }
        if (!this.b) {
            return values[this.f21586a + 1];
        }
        return this;
    }

    public iu5 c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (iu5) ipChange.ipc$dispatch("1310ca6a", new Object[]{this});
        }
        if (!this.b) {
            return this;
        }
        iu5 iu5Var = values[this.f21586a - 1];
        if (!iu5Var.b) {
            return iu5Var;
        }
        return DefaultUnNotify;
    }
}

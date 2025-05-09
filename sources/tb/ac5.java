package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ac5 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final byte f15653a;
    public final String b;
    public final int c;
    public final int d;
    public final int e;
    public fc5 f;

    static {
        t2o.a(444597960);
    }

    public ac5(byte b, String str, int i, int i2, int i3) {
        this.f15653a = b;
        this.b = str;
        this.c = i;
        this.d = i2;
        this.e = i3;
    }

    public ac5 a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ac5) ipChange.ipc$dispatch("1f9561a4", new Object[]{this});
        }
        ac5 ac5Var = new ac5(this.f15653a, this.b, this.c, this.d, this.e);
        ac5Var.f = this.f;
        return ac5Var;
    }

    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e1c5c6ae", new Object[]{this})).intValue();
        }
        return this.d;
    }

    public byte c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4156299b", new Object[]{this})).byteValue();
        }
        return this.f15653a;
    }

    public fc5 d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fc5) ipChange.ipc$dispatch("940d0981", new Object[]{this});
        }
        return this.f;
    }

    public String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("685c19cf", new Object[]{this});
        }
        return this.b;
    }

    public int f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("13f9d8cd", new Object[]{this})).intValue();
        }
        return this.c;
    }

    public void g(fc5 fc5Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8a476bd", new Object[]{this, fc5Var});
        } else {
            this.f = fc5Var;
        }
    }
}

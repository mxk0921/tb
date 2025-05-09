package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public abstract class cy1<M> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f17429a;
    public float b = 0.001f;
    public final String c;
    public final String d;
    public String e;
    public final String f;

    static {
        t2o.a(794820625);
    }

    public cy1(String str, String str2, String str3) {
        this.c = str2;
        this.d = str == null ? "Ultron" : str;
        this.f = str3;
    }

    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("826ffbcf", new Object[]{this});
        }
        return this.d;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dd61839e", new Object[]{this});
        }
        return this.f;
    }

    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c8c32fc8", new Object[]{this});
        }
        String str = this.e;
        if (str == null) {
            return "";
        }
        return str;
    }

    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("229b03c4", new Object[]{this});
        }
        return this.c;
    }

    public float e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("68809b54", new Object[]{this})).floatValue();
        }
        return this.b;
    }

    public String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1a2f0b68", new Object[]{this});
        }
        return this.f17429a;
    }

    public M g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (M) ipChange.ipc$dispatch("5b5ec6da", new Object[]{this, str});
        }
        this.e = str;
        return this;
    }

    public M h(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (M) ipChange.ipc$dispatch("7d5e10e0", new Object[]{this, new Float(f)});
        }
        this.b = f;
        return this;
    }

    public cy1<M> i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cy1) ipChange.ipc$dispatch("325057e3", new Object[]{this, str});
        }
        this.f17429a = str;
        return this;
    }
}

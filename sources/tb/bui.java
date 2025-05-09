package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class bui {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f16639a;
    public final String b;
    public final String[] c;
    public final boolean d;
    public final a e;
    public final boolean f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface a {
        boolean a(byte[] bArr);
    }

    static {
        t2o.a(618659897);
    }

    public bui(String str, String str2, String[] strArr, a aVar) {
        this(str, str2, strArr, false, false, aVar);
    }

    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("397ac68b", new Object[]{this});
        }
        return this.f16639a;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("473e080f", new Object[]{this});
        }
        return this.b;
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9bce316f", new Object[]{this})).booleanValue();
        }
        return this.d;
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fa3e9505", new Object[]{this})).booleanValue();
        }
        return this.f;
    }

    public boolean e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3554823e", new Object[]{this, str})).booleanValue();
        }
        for (String str2 : this.c) {
            if (str2.equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    public boolean f(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cc02bff5", new Object[]{this, bArr})).booleanValue();
        }
        return this.e.a(bArr);
    }

    public boolean g(bui buiVar) {
        String b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("20257a6e", new Object[]{this, buiVar})).booleanValue();
        }
        if (buiVar == null || (b = b()) == null || !b.equals(buiVar.b())) {
            return false;
        }
        return true;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "image/" + b();
    }

    public bui(String str, String str2, String[] strArr, boolean z, a aVar) {
        this(str, str2, strArr, z, false, aVar);
    }

    public bui(String str, String str2, boolean z, String[] strArr, a aVar) {
        this(str, str2, strArr, false, z, aVar);
    }

    public bui(String str, String str2, String[] strArr, boolean z, boolean z2, a aVar) {
        this.f16639a = str;
        this.b = str2;
        this.c = strArr;
        this.d = z;
        this.f = z2;
        this.e = aVar;
    }
}

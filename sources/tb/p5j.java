package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class p5j extends dy1<p5j> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f25891a;
    public final String b;
    public final boolean c;
    public long d;
    public String e;
    public Map<String, String> f;
    public boolean g;

    static {
        t2o.a(83886305);
    }

    public p5j(String str, String str2, String str3, String str4, boolean z) {
        super(str, str2, str3);
        this.b = str4;
        this.c = z;
    }

    public static p5j a(String str, String str2, boolean z, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (p5j) ipChange.ipc$dispatch("dda88cc6", new Object[]{str, str2, new Boolean(z), str3, str4});
        }
        return new p5j(str, str3, str4, str2, z);
    }

    public static /* synthetic */ Object ipc$super(p5j p5jVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/ultron/tracker/model/MtopModel");
    }

    public p5j b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (p5j) ipChange.ipc$dispatch("66e093b", new Object[]{this, str});
        }
        this.e = str;
        return this;
    }

    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("67b7a95", new Object[]{this});
        }
        return this.b;
    }

    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f72feefa", new Object[]{this});
        }
        return this.e;
    }

    public Map<String, String> e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("f10013f8", new Object[]{this});
        }
        return this.f;
    }

    public long f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1e5df7bb", new Object[]{this})).longValue();
        }
        return this.d;
    }

    public String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9afc202f", new Object[]{this});
        }
        return this.f25891a;
    }

    public boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b307dd22", new Object[]{this})).booleanValue();
        }
        return this.g;
    }

    /* renamed from: i */
    public p5j message(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (p5j) ipChange.ipc$dispatch("6345b72d", new Object[]{this, str});
        }
        this.message = str;
        return this;
    }

    public boolean isSuccess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6049a784", new Object[]{this})).booleanValue();
        }
        return this.c;
    }

    public p5j j(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (p5j) ipChange.ipc$dispatch("6bfd60ad", new Object[]{this, map});
        }
        this.f = map;
        return this;
    }

    /* renamed from: k */
    public p5j sampling(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (p5j) ipChange.ipc$dispatch("5a9645e7", new Object[]{this, new Float(f)});
        }
        this.sampling = f;
        return this;
    }

    public p5j l(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (p5j) ipChange.ipc$dispatch("1011b601", new Object[]{this, new Boolean(z)});
        }
        this.g = z;
        return this;
    }

    public p5j m(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (p5j) ipChange.ipc$dispatch("fa32f828", new Object[]{this, new Long(j)});
        }
        this.d = j;
        return this;
    }

    public p5j n(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (p5j) ipChange.ipc$dispatch("98ece366", new Object[]{this, str});
        }
        this.f25891a = str;
        return this;
    }
}

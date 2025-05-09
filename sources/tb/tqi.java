package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import tb.uqi;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public abstract class tqi {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "MessageServiceTask";

    /* renamed from: a  reason: collision with root package name */
    public final String f28884a;
    public final int b;
    public final String c;
    public final String d;
    public final boolean e;
    public final String f;
    public final String g;
    public final uqi.c h;
    public final WeakReference<bwd> i;

    static {
        t2o.a(806356166);
    }

    public tqi(String str, int i, String str2, String str3, boolean z, String str4, String str5, uqi.c cVar, bwd bwdVar) {
        this.f28884a = str;
        this.b = i;
        this.c = str2;
        this.d = str3;
        this.e = z;
        this.f = str4;
        this.g = str5;
        this.h = cVar;
        this.i = new WeakReference<>(bwdVar);
    }

    public int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("842ad8e4", new Object[]{this})).intValue();
        }
        return this.b;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3babe84c", new Object[]{this});
        }
        return this.c;
    }

    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fcd84ee", new Object[]{this});
        }
        return this.f;
    }

    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9d48c0c0", new Object[]{this});
        }
        return this.d;
    }

    public String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6d484b96", new Object[]{this});
        }
        return this.g;
    }

    public String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f2a1d120", new Object[]{this});
        }
        return this.f28884a;
    }

    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("14cbff24", new Object[]{this})).booleanValue();
        }
        return this.e;
    }

    public boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c32224ba", new Object[]{this})).booleanValue();
        }
        WeakReference<bwd> weakReference = this.i;
        if (weakReference == null || weakReference.get() == null || this.f28884a == null || this.g == null) {
            return false;
        }
        return true;
    }

    public abstract boolean i();

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "MessageServiceTask{topic='" + this.f28884a + "', mBizCode=" + this.b + ", mChannel='" + this.c + "', nick='" + this.d + "', isFandom=" + this.e + '}';
    }
}

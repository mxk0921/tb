package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class x7m {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f31194a;
    public final Integer b;
    public Object c;
    public boolean d;

    static {
        t2o.a(481297339);
    }

    public x7m() {
        this(null, null, 3, null);
    }

    public final Object a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("7e8dff9d", new Object[]{this});
        }
        return this.c;
    }

    public final String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("35374867", new Object[]{this});
        }
        return this.f31194a;
    }

    public final boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9a974863", new Object[]{this})).booleanValue();
        }
        return this.d;
    }

    public final boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6049a784", new Object[]{this})).booleanValue();
        }
        Integer num = this.b;
        if (num != null && num.intValue() == 1) {
            return true;
        }
        return false;
    }

    public final void e(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed874645", new Object[]{this, obj});
        } else {
            this.c = obj;
        }
    }

    public final void f(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff1c598d", new Object[]{this, new Boolean(z)});
        } else {
            this.d = z;
        }
    }

    public x7m(String str, Integer num) {
        this.f31194a = str;
        this.b = num;
    }

    public /* synthetic */ x7m(String str, Integer num, int i, a07 a07Var) {
        this((i & 1) != 0 ? "Unknown" : str, (i & 2) != 0 ? 1 : num);
    }
}

package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class apl<L, R> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final L f15920a;
    public final R b;

    static {
        t2o.a(665845844);
    }

    public apl(L l, R r) {
        this.f15920a = l;
        this.b = r;
    }

    public R a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (R) ipChange.ipc$dispatch("abac44e5", new Object[]{this});
        }
        return this.b;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return f7l.BRACKET_START_STR + this.f15920a + ", " + this.b + f7l.BRACKET_END_STR;
    }
}

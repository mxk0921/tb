package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class lre {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public volatile String f23528a;
    public volatile Integer[] b;

    static {
        t2o.a(481297343);
    }

    public lre() {
        this(null, null, 3, null);
    }

    public final String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a8f63920", new Object[]{this});
        }
        return this.f23528a;
    }

    public final Integer[] b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer[]) ipChange.ipc$dispatch("5ad2fa4e", new Object[]{this});
        }
        return this.b;
    }

    public lre(String str, Integer[] numArr) {
        this.f23528a = str;
        this.b = numArr;
    }

    public /* synthetic */ lre(String str, Integer[] numArr, int i, a07 a07Var) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : numArr);
    }
}

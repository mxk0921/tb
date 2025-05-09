package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class pi3 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Integer f26109a;
    public final String b;
    public final long c;

    static {
        t2o.a(481297042);
    }

    public pi3(Integer num, String str, long j) {
        this.f26109a = num;
        this.b = str;
        this.c = j;
    }

    public final long a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ad04ad81", new Object[]{this})).longValue();
        }
        return this.c;
    }

    public final String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4ff2c1d1", new Object[]{this});
        }
        return this.b;
    }

    public final Integer c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("da5e78d9", new Object[]{this});
        }
        return this.f26109a;
    }
}

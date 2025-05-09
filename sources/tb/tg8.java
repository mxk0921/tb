package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class tg8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public static final tg8 f28705a = new tg8();

        static {
            t2o.a(623902770);
        }
    }

    static {
        t2o.a(623902768);
    }

    public static tg8 b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tg8) ipChange.ipc$dispatch("d3248365", new Object[0]);
        }
        return b.f28705a;
    }

    public ikq a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ikq) ipChange.ipc$dispatch("9fa2779", new Object[]{this});
        }
        return null;
    }

    public tg8() {
    }
}

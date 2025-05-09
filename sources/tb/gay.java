package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class gay {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final day f19855a = new byx();

        static {
            t2o.a(628097521);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public static final day f19856a = new l4y();

        static {
            t2o.a(628097522);
        }
    }

    static {
        t2o.a(628097520);
    }

    public static day a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (day) ipChange.ipc$dispatch("96225a4b", new Object[0]);
        }
        return a.f19855a;
    }

    public static day b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (day) ipChange.ipc$dispatch("a2bb4fcc", new Object[0]);
        }
        return b.f19856a;
    }
}

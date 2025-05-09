package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class bk0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final bk0 f16440a = new bk0();

        static {
            t2o.a(481296453);
        }

        public static /* synthetic */ bk0 a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (bk0) ipChange.ipc$dispatch("f58e551c", new Object[0]);
            }
            return f16440a;
        }
    }

    static {
        t2o.a(481296451);
    }

    public static bk0 b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bk0) ipChange.ipc$dispatch("ba3fdaf6", new Object[0]);
        }
        return b.a();
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("402b2982", new Object[]{this});
        }
    }

    public bk0() {
    }
}

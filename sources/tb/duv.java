package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class duv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final duv f18079a = new duv();

        static {
            t2o.a(83886084);
        }

        public static /* synthetic */ duv a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (duv) ipChange.ipc$dispatch("5e83578", new Object[0]);
            }
            return f18079a;
        }
    }

    static {
        t2o.a(83886083);
    }

    public static duv a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (duv) ipChange.ipc$dispatch("ca2c2e3d", new Object[0]);
        }
        return a.a();
    }

    public void b(v7e v7eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73aa8c55", new Object[]{this, v7eVar});
        }
    }
}

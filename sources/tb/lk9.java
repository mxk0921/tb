package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class lk9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final AtomicBoolean f23380a = new AtomicBoolean(false);
    public final AtomicBoolean b = new AtomicBoolean(false);
    public final a c = new a(false);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(729809168);
        }

        public a(boolean z) {
        }

        public void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("518a700b", new Object[]{this, new Boolean(z)});
            }
        }
    }

    static {
        t2o.a(729809167);
    }

    public a a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("576535f9", new Object[]{this});
        }
        return this.c;
    }

    public AtomicBoolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicBoolean) ipChange.ipc$dispatch("83e8c5e", new Object[]{this});
        }
        return this.b;
    }

    public AtomicBoolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicBoolean) ipChange.ipc$dispatch("5d772ee2", new Object[]{this});
        }
        return this.f23380a;
    }
}

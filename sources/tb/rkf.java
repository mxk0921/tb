package tb;

import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class rkf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public udu f27439a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final rkf f27440a = new rkf();

        static {
            t2o.a(1018167302);
        }

        public static /* synthetic */ rkf a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (rkf) ipChange.ipc$dispatch("2ddbea2", new Object[0]);
            }
            return f27440a;
        }
    }

    static {
        t2o.a(1018167301);
    }

    public static rkf b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rkf) ipChange.ipc$dispatch("cee18d1d", new Object[0]);
        }
        return a.a();
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        SystemClock.elapsedRealtime();
        this.f27439a = new udu();
        SystemClock.elapsedRealtime();
    }

    public Object c(rdu rduVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ec06731", new Object[]{this, rduVar});
        }
        udu uduVar = this.f27439a;
        if (uduVar != null) {
            return uduVar.a(rduVar);
        }
        throw new IllegalStateException("SDK Not initialized!");
    }
}

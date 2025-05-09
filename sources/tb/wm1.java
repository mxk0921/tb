package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.util.ActivityMonitor;
import com.taobao.android.behavir.util.PopStateMonitor;
import com.taobao.android.behavir.util.Utils;
import com.taobao.android.behavir.util.b;
import com.taobao.android.behavix.bhxbridge.BHXCXXBaseBridge;
import com.taobao.android.launcher.common.LauncherRuntime;
import com.taobao.android.ucp.bridge.NativeDelegate;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class wm1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a extends b.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/behavir/init/BRInitTask$1");
        }

        @Override // tb.m02
        public void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
            } else {
                BHXCXXBaseBridge.setupBHXCpp();
            }
        }
    }

    static {
        t2o.a(404750381);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else if (gwv.x()) {
            try {
                ActivityMonitor r = ActivityMonitor.r();
                f82.d().registerActivityLifecycleCallbacks(r);
                com.taobao.tao.navigation.a.G(r);
            } catch (Throwable unused) {
            }
        }
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[0]);
            return;
        }
        zau.a("BXInit");
        PopStateMonitor.b();
        NativeDelegate.init();
        a();
        if (f82.d() != null && Utils.h()) {
            boolean i = bzn.b().d("bhx_cxx").i();
            if (!LauncherRuntime.m && i) {
                BHXCXXBaseBridge.LoadCXXLib();
                b.b(new a());
            }
        }
    }
}

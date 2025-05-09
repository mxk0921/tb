package tb;

import android.content.Context;
import android.content.pm.PackageInfo;
import com.android.alibaba.ip.runtime.IpChange;
import com.flybird.support.basics.AppContextHolder;
import java.util.concurrent.Callable;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class saa {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static volatile boolean f27903a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class a implements Callable<PackageInfo> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, android.content.pm.PackageInfo] */
        @Override // java.util.concurrent.Callable
        public PackageInfo call() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("6d249ded", new Object[]{this});
            }
            Context context = AppContextHolder.f5004a;
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        }
    }

    public static synchronized void a() {
        synchronized (saa.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[0]);
            } else if (!f27903a) {
                uca.b(new os2("App:PackageInfo", new nkf(), new a()));
                f27903a = true;
            }
        }
    }
}

package tb;

import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.android.SystemUtils;
import com.taobao.android.task.Coordinator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class uvr implements huo {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int b = 27;

    /* renamed from: a  reason: collision with root package name */
    private final Coordinator.CoordThreadPoolExecutor f29640a = (Coordinator.CoordThreadPoolExecutor) Coordinator.getDefaultThreadPoolExecutor();

    private uvr() {
    }

    public static void d(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71b27585", new Object[]{new Boolean(z), new Boolean(z2)});
        } else {
            b(false);
        }
    }

    private static boolean g() {
        boolean is64Bit;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c3d24b10", new Object[0])).booleanValue();
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            is64Bit = Process.is64Bit();
            if (!is64Bit) {
                return true;
            }
        }
        String str = Build.BRAND;
        if ((TextUtils.equals(str, SystemUtils.PRODUCT_HUAWEI) || TextUtils.equals(str, SystemUtils.PRODUCT_HONOR)) && i >= 23 && i <= 27) {
            return true;
        }
        return false;
    }

    @Override // tb.huo
    public void a(buo buoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("388bbf9d", new Object[]{this, buoVar});
        } else {
            this.f29640a.execute(buoVar, 27);
        }
    }

    @Override // tb.huo
    public int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a2751476", new Object[]{this})).intValue();
        }
        return this.f29640a.getQueue().size();
    }

    @Override // tb.huo
    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("50b9f46f", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // tb.huo
    public String getStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("71829d11", new Object[]{this});
        }
        return "TBScheduler4Phenix[queue=" + c() + ",active=" + this.f29640a.getActiveCount() + ",pool=" + this.f29640a.getPoolSize() + ",largest=" + this.f29640a.getLargestPoolSize() + ",tasks=" + this.f29640a.getTaskCount() + ",completes=" + this.f29640a.getCompletedTaskCount() + "]";
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void b(boolean r22) {
        /*
            Method dump skipped, instructions count: 217
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.uvr.b(boolean):void");
    }
}

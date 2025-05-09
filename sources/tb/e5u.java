package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.taobaoavsdk.AVSDKLog;
import java.io.File;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class e5u extends ymh {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final long c;
    public final int d;
    public final int e;

    static {
        t2o.a(774897915);
    }

    public e5u(long j, int i) {
        if (j <= 0) {
            throw new IllegalArgumentException("Max size must be positive number!");
        } else if (i > 0) {
            this.c = j;
            this.d = 20;
            this.e = ew0.u(OrangeConfig.getInstance().getConfig("DWInteractive", "defMaxHighCount", "10"));
        } else {
            throw new IllegalArgumentException("Max count must be positive number!");
        }
    }

    public static /* synthetic */ Object ipc$super(e5u e5uVar, String str, Object... objArr) {
        if (str.hashCode() == 1915994941) {
            e5uVar.e((File) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taobaoavsdk/cache/library/file/TotalSizeCountLruDiskUsage");
    }

    @Override // tb.ymh
    public boolean b(File file, long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3c027d7d", new Object[]{this, file, new Long(j), new Integer(i)})).booleanValue();
        }
        if (j > this.c || i > this.d) {
            return false;
        }
        return true;
    }

    @Override // tb.ymh
    public boolean a(File file, long j, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("902f1fa2", new Object[]{this, file, new Long(j), new Integer(i), new Integer(i2)})).booleanValue();
        }
        boolean s = ew0.s(OrangeConfig.getInstance().getConfig("DWInteractive", "enableDelFileWhichNoData", "true"));
        if (file.length() == 0 && s) {
            AVSDKLog.e(tfb.MODULE_SDK_PAGE, file.getName() + " length is 0, totalSize:" + j + ", totalCount:" + i);
            return false;
        } else if (!file.getName().startsWith("0_") || file.lastModified() <= System.currentTimeMillis() - 259200000 || i2 >= this.e) {
            return j <= this.c && i <= this.d;
        } else {
            return true;
        }
    }
}

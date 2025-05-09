package tb;

import android.os.Environment;
import android.os.StatFs;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class oaq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final long f25263a = 1048576;

    static {
        t2o.a(676331697);
    }

    public static long a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9068c1bf", new Object[0])).longValue();
        }
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return (statFs.getAvailableBlocks() * statFs.getBlockSize()) / f25263a;
    }
}

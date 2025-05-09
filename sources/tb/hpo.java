package tb;

import android.system.Os;
import android.system.StructStat;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class hpo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(106954777);
    }

    public static bqo a(String str) {
        try {
            StructStat stat = Os.stat(str);
            return new bqo(stat.st_dev, stat.st_ino, stat.st_mode, stat.st_nlink, stat.st_uid, stat.st_gid, stat.st_rdev, stat.st_size, stat.st_atime, stat.st_mtime, stat.st_ctime, stat.st_blksize, stat.st_blocks);
        } catch (Exception unused) {
            return null;
        }
    }
}

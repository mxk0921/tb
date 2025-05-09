package anet.channel.util;

import android.content.Context;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.statist.StrategyStatObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.Serializable;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class SerializeHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "awcn.SerializeHelper";
    private static File cacheDir = null;

    static {
        t2o.a(607125956);
    }

    public static File getCacheFiles(String str) {
        Context context;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("1ea9b631", new Object[]{str});
        }
        if (cacheDir == null && (context = GlobalAppRuntimeInfo.getContext()) != null) {
            cacheDir = context.getCacheDir();
        }
        return new File(cacheDir, str);
    }

    public static synchronized void persist(Serializable serializable, File file) {
        synchronized (SerializeHelper.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("972a3166", new Object[]{serializable, file});
            } else {
                persist(serializable, file, (StrategyStatObject) null);
            }
        }
    }

    public static synchronized <T> T restore(File file) {
        synchronized (SerializeHelper.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (T) ipChange.ipc$dispatch("4f627e6", new Object[]{file});
            }
            return (T) restore(file, null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d2, code lost:
        if (r10 != null) goto L_0x00b2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static synchronized <T> T restore(java.io.File r17, anet.channel.statist.StrategyStatObject r18) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: anet.channel.util.SerializeHelper.restore(java.io.File, anet.channel.statist.StrategyStatObject):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009f A[Catch: all -> 0x0022, TryCatch #2 {, blocks: (B:4:0x000d, B:6:0x0013, B:13:0x002c, B:17:0x0062, B:31:0x0094, B:33:0x0098, B:35:0x009f, B:37:0x00b1, B:39:0x00b7, B:40:0x00eb, B:42:0x00f7, B:46:0x0108, B:47:0x010c, B:51:0x011a, B:52:0x011d, B:53:0x011e), top: B:65:0x000d, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b1 A[Catch: all -> 0x0022, TryCatch #2 {, blocks: (B:4:0x000d, B:6:0x0013, B:13:0x002c, B:17:0x0062, B:31:0x0094, B:33:0x0098, B:35:0x009f, B:37:0x00b1, B:39:0x00b7, B:40:0x00eb, B:42:0x00f7, B:46:0x0108, B:47:0x010c, B:51:0x011a, B:52:0x011d, B:53:0x011e), top: B:65:0x000d, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x011a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [int, boolean] */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static synchronized void persist(java.io.Serializable r18, java.io.File r19, anet.channel.statist.StrategyStatObject r20) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: anet.channel.util.SerializeHelper.persist(java.io.Serializable, java.io.File, anet.channel.statist.StrategyStatObject):void");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(4:52|(4:86|53|(1:55)|60)|80|61) */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0147, code lost:
        if (r9 != null) goto L_0x0108;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static synchronized android.os.Parcel restoreParcelable(java.io.File r16, anet.channel.statist.StrategyStatObject r17) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: anet.channel.util.SerializeHelper.restoreParcelable(java.io.File, anet.channel.statist.StrategyStatObject):android.os.Parcel");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0089 A[Catch: all -> 0x008f, TRY_LEAVE, TryCatch #3 {, blocks: (B:4:0x000e, B:6:0x0014, B:12:0x002d, B:16:0x005e, B:27:0x0094, B:29:0x0098, B:31:0x009f, B:33:0x00b1, B:35:0x00b7, B:36:0x00ea, B:38:0x00f6, B:45:0x0126, B:42:0x0107, B:23:0x006b, B:25:0x0089), top: B:52:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009f A[Catch: all -> 0x0024, TryCatch #3 {, blocks: (B:4:0x000e, B:6:0x0014, B:12:0x002d, B:16:0x005e, B:27:0x0094, B:29:0x0098, B:31:0x009f, B:33:0x00b1, B:35:0x00b7, B:36:0x00ea, B:38:0x00f6, B:45:0x0126, B:42:0x0107, B:23:0x006b, B:25:0x0089), top: B:52:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b1 A[Catch: all -> 0x0024, TryCatch #3 {, blocks: (B:4:0x000e, B:6:0x0014, B:12:0x002d, B:16:0x005e, B:27:0x0094, B:29:0x0098, B:31:0x009f, B:33:0x00b1, B:35:0x00b7, B:36:0x00ea, B:38:0x00f6, B:45:0x0126, B:42:0x0107, B:23:0x006b, B:25:0x0089), top: B:52:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0105 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0094 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [int, boolean] */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static synchronized void persist(android.os.Parcelable r19, java.io.File r20, anet.channel.statist.StrategyStatObject r21) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: anet.channel.util.SerializeHelper.persist(android.os.Parcelable, java.io.File, anet.channel.statist.StrategyStatObject):void");
    }
}

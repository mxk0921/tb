package mtopsdk.mtop.antiattack;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ConcurrentHashMap;
import mtopsdk.common.util.StringUtils;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.global.SwitchConfig;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class ApiLockHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final long LOCK_PERIOD = 10;
    private static final String TAG = "mtopsdk.ApiLockHelper";
    private static ConcurrentHashMap<String, LockedEntity> lockedMap = new ConcurrentHashMap<>();

    static {
        t2o.a(589299856);
    }

    public static void lock(String str, long j, long j2) {
        long j3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f69666fc", new Object[]{str, new Long(j), new Long(j2)});
        } else if (!StringUtils.isBlank(str)) {
            LockedEntity lockedEntity = lockedMap.get(str);
            if (j2 > 0) {
                j3 = j2 / 1000;
            } else {
                j3 = SwitchConfig.getInstance().getIndividualApiLockInterval(str);
            }
            if (j3 <= 0) {
                j3 = SwitchConfig.getInstance().getGlobalApiLockInterval();
                if (j3 <= 0) {
                    j3 = 10;
                }
            }
            if (lockedEntity == null) {
                lockedEntity = new LockedEntity(str, j, j3);
            } else {
                lockedEntity.lockStartTime = j;
                lockedEntity.lockInterval = j3;
            }
            lockedMap.put(str, lockedEntity);
            if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.WarnEnable)) {
                StringBuilder sb = new StringBuilder("[lock]");
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append(", currentTime=");
                sb2.append(j);
                sb2.append(", lockEntity=");
                sb2.append(lockedEntity.toString());
                sb.append((Object) sb2);
                TBSdkLog.w(TAG, sb.toString());
            }
        }
    }

    public static boolean iSApiLocked(String str, long j) {
        LockedEntity lockedEntity;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1aa39d3d", new Object[]{str, new Long(j)})).booleanValue();
        }
        if (StringUtils.isBlank(str) || (lockedEntity = lockedMap.get(str)) == null) {
            return false;
        }
        if (Math.abs(j - lockedEntity.lockStartTime) >= lockedEntity.lockInterval) {
            lockedMap.remove(str);
            if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.WarnEnable)) {
                TBSdkLog.w(TAG, "[iSApiLocked]remove apiKey=" + str);
            }
            z = false;
        }
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.WarnEnable)) {
            StringBuilder sb = new StringBuilder("[iSApiLocked] isLocked=");
            sb.append(z);
            sb.append(", ");
            StringBuilder sb2 = new StringBuilder(32);
            sb2.append(", currentTime=");
            sb2.append(j);
            sb2.append(", lockEntity=");
            sb2.append(lockedEntity.toString());
            sb.append((Object) sb2);
            TBSdkLog.w(TAG, sb.toString());
        }
        return z;
    }
}

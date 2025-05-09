package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.update.apk.ApkUpdateContext;
import com.taobao.update.framework.UpdateRuntime;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class lg8 implements czm<ApkUpdateContext> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static int UpdateDataDiskFreeSize = 100;

    static {
        t2o.a(953155607);
        t2o.a(947912754);
    }

    public void execute(ApkUpdateContext apkUpdateContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aeed841b", new Object[]{this, apkUpdateContext});
        } else if (TextUtils.isEmpty(apkUpdateContext.apkPath)) {
            if (nkv.getNetworkType() == 0) {
                apkUpdateContext.success = false;
                apkUpdateContext.errorCode = -22;
                apkUpdateContext.errorMsg = nkv.getAppNameString(R.string.notice_update_err_nonetwork, UpdateRuntime.sAppName);
            } else if (apkUpdateContext.skipUpdate()) {
                apkUpdateContext.success = false;
                apkUpdateContext.errorCode = -23;
                apkUpdateContext.errorMsg = "不满足网络条件";
            } else {
                String storePath = nkv.getStorePath(apkUpdateContext.context);
                long j = apkUpdateContext.mainUpdate.size;
                if (j == 0) {
                    j = UpdateDataDiskFreeSize * 1048576;
                }
                if (!nkv.hasEnoughSpace(storePath, j)) {
                    apkUpdateContext.success = false;
                    apkUpdateContext.errorCode = -21;
                    apkUpdateContext.errorMsg = nkv.getAppNameString(R.string.update_no_sdcard_space, UpdateRuntime.sAppName);
                }
            }
        }
    }
}

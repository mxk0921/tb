package tb;

import android.text.TextUtils;
import android.util.Log;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class r71 implements tvc {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String APP_MONITOR_MODULE = "Biz_Change_Tinct";
    public static final String APP_MONITOR_MONITOR_POINT = "tinct_change";
    public static final String TAG = "AppMonitorUploader";

    @Override // tb.tvc
    public void commit(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df0d9088", new Object[]{this, str});
            return;
        }
        try {
            if (!TextUtils.isEmpty(str)) {
                AppMonitor.Alarm.commitSuccess(APP_MONITOR_MODULE, APP_MONITOR_MONITOR_POINT, str);
                new StringBuilder("Report change info to appmonitor: ").append(str);
            } else {
                Log.e(TAG, "Failed to report change info to appmonitor: " + str);
            }
        } catch (Exception e) {
            e.printStackTrace();
            Log.e(TAG, "Exception when report change info to appmonitor: " + str);
        }
    }
}

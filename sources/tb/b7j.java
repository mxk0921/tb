package tb;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.trade.boost.daemon.UploadStackTraceClient;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.global.SDKConfig;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class b7j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a(MtopRequest mtopRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("820bd6aa", new Object[]{mtopRequest});
        } else if (mtopRequest != null) {
            String apiName = mtopRequest.getApiName();
            String version = mtopRequest.getVersion();
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            StringBuilder sb = new StringBuilder();
            if (stackTrace != null) {
                for (StackTraceElement stackTraceElement : stackTrace) {
                    sb.append(stackTraceElement.toString());
                    sb.append(",");
                }
            }
            String sb2 = sb.toString();
            new UploadStackTraceClient().execute(new cmv(apiName, version, sb2, null), null, SDKConfig.getInstance().getGlobalTtid());
            Log.e(trj.TAG, "[MtopRuntimeInfoCollector collect], stackTrace:" + sb2);
        }
    }

    public static boolean b() {
        ApplicationInfo applicationInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4500e523", new Object[0])).booleanValue();
        }
        Context globalContext = SDKConfig.getInstance().getGlobalContext();
        if (globalContext == null || (applicationInfo = globalContext.getApplicationContext().getApplicationInfo()) == null || (applicationInfo.flags & 2) == 0) {
            return false;
        }
        return true;
    }
}

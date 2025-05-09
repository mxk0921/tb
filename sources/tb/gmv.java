package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.common.util.RemoteConfig;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.util.MtopSDKThreadPoolExecutorFactory;
import tb.t5j;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class gmv extends t5j.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            RemoteConfig.getInstance().updateUploadRemoteConfig();
            fmv a2 = fmv.a();
            a2.c();
            a2.d();
            a2.b();
        }
    }

    public static /* synthetic */ Object ipc$super(gmv gmvVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in mtopsdk/config/upload/UploadSwitchListener");
    }

    @Override // tb.t5j.a, tb.z8l
    public void onConfigUpdate(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9458c0f9", new Object[]{this, str, new Boolean(z)});
            return;
        }
        TBSdkLog.LogEnable logEnable = TBSdkLog.LogEnable.InfoEnable;
        if (TBSdkLog.isLogEnable(logEnable)) {
            StringBuilder sb = new StringBuilder(64);
            sb.append("[onConfigUpdate] groupName=");
            sb.append(str);
            sb.append(",fromCache=");
            sb.append(z);
            TBSdkLog.i("mtopsdk.UploadSwitchListener", sb.toString());
        }
        MtopSDKThreadPoolExecutorFactory.submit(new a());
        if (TBSdkLog.isLogEnable(logEnable)) {
            TBSdkLog.i("mtopsdk.UploadSwitchListener", "[onConfigUpdate]submit UploadSwitchConfigBroadcast task to ThreadPool");
        }
    }
}

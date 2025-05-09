package tb;

import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.update.apk.ApkUpdateContext;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class b5g implements czm<ApkUpdateContext> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ ApkUpdateContext val$taskInfo;

        public a(ApkUpdateContext apkUpdateContext) {
            this.val$taskInfo = apkUpdateContext;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            nkv.killChildProcesses(this.val$taskInfo.context);
            int myPid = Process.myPid();
            new StringBuilder("atlas killprocess:").append(myPid);
            Process.killProcess(myPid);
        }
    }

    static {
        t2o.a(953155608);
        t2o.a(947912754);
    }

    public void execute(ApkUpdateContext apkUpdateContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aeed841b", new Object[]{this, apkUpdateContext});
        } else if (apkUpdateContext.isForceUpdate()) {
            new Handler(Looper.getMainLooper()).postDelayed(new a(apkUpdateContext), 1000L);
        }
    }
}

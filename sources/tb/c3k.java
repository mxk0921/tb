package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.update.apk.ApkUpdateContext;
import com.taobao.update.framework.UpdateRuntime;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class c3k {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String APEFFICIENCY = "apefficiency";

    /* renamed from: a  reason: collision with root package name */
    public final ekv f16819a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final c3k f16820a = new c3k();

        static {
            t2o.a(953155595);
        }

        public static /* synthetic */ c3k access$000() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c3k) ipChange.ipc$dispatch("61d1100c", new Object[0]);
            }
            return f16820a;
        }
    }

    static {
        t2o.a(953155593);
    }

    public static c3k getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c3k) ipChange.ipc$dispatch("260c2fe7", new Object[0]);
        }
        return b.access$000();
    }

    public c3k() {
        try {
            this.f16819a = (ekv) c62.getInstance(ekv.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ApkUpdateContext doUpdate(ApkUpdateContext apkUpdateContext, boolean z, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ApkUpdateContext) ipChange.ipc$dispatch("8247f3e7", new Object[]{this, apkUpdateContext, new Boolean(z), str, str2});
        }
        if (!z) {
            new bak().execute(apkUpdateContext);
            ekv ekvVar = this.f16819a;
            if (ekvVar != null) {
                ekvVar.add("apefficiency", apkUpdateContext.success, "notifydownload", String.valueOf(apkUpdateContext.errorCode), apkUpdateContext.errorMsg, str, str2, 0L, 0L);
            }
            if (!apkUpdateContext.success) {
                UpdateRuntime.log("UpdateFlowController failed to pass NotifyNewApkUpdateProcessor " + apkUpdateContext);
                return apkUpdateContext;
            }
        }
        System.currentTimeMillis();
        new j11().execute(apkUpdateContext);
        this.f16819a.add("apefficiency", apkUpdateContext.success, "download", String.valueOf(apkUpdateContext.errorCode), apkUpdateContext.errorMsg, str, str2, 0L, System.currentTimeMillis());
        if (!apkUpdateContext.success) {
            UpdateRuntime.log("UpdateFlowController failed to pass ApkDownloadProcessor " + apkUpdateContext);
            apkUpdateContext.isDownloadError = true;
            return apkUpdateContext;
        }
        if (!apkUpdateContext.isDefaultUpdate() || UpdateRuntime.popDialogBeforeInstall || !nkv.isNotificationPermissioned()) {
            UpdateRuntime.log("UpdateFlowController start to do ApkInstallProcessor ");
            new m11().execute(apkUpdateContext);
            this.f16819a.add("apefficiency", apkUpdateContext.success, "notifyinstall", String.valueOf(apkUpdateContext.errorCode), apkUpdateContext.errorMsg, str, str2, 0L, 0L);
        }
        UpdateRuntime.log("UpdateFlowController apk upgrade execute result is " + apkUpdateContext);
        if (!apkUpdateContext.success && TextUtils.isEmpty(apkUpdateContext.errorMsg)) {
            apkUpdateContext.errorMsg = nkv.getAppNameString(R.string.notice_errorupdate, UpdateRuntime.sAppName);
        }
        UpdateRuntime.log("UpdateFlowController update finished with result " + apkUpdateContext);
        return apkUpdateContext;
    }
}

package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.update.apk.ApkUpdateContext;
import com.taobao.update.apk.MainUpdateData;
import com.taobao.update.framework.UpdateRuntime;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.concurrent.CountDownLatch;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class bak implements czm<ApkUpdateContext> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String UA_NOTIFY_FORCE_TYPE = "NOTIFY_NEW_APK_UPDATE_FORCE_RETRY";
    public static final String UA_NOTIFY_TYPE = "NOTIFY_NEW_APK_UPDATE";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements npv {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ CountDownLatch val$countDownLatch;
        public final /* synthetic */ ApkUpdateContext val$taskInfo;

        /* compiled from: Taobao */
        /* renamed from: tb.bak$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public class C0881a implements npv {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public C0881a() {
            }

            @Override // tb.npv
            public String getCancelText() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (String) ipChange.ipc$dispatch("338a645c", new Object[]{this});
                }
                return "退出";
            }

            @Override // tb.npv
            public String getConfirmText() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (String) ipChange.ipc$dispatch("4f0d2482", new Object[]{this});
                }
                return "立即下载";
            }

            @Override // tb.npv
            public String getTitleText() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (String) ipChange.ipc$dispatch("4800096a", new Object[]{this});
                }
                if (!tg4.getInstance().enableDialogUiV2()) {
                    return null;
                }
                return "快来更新" + UpdateRuntime.sAppName;
            }

            @Override // tb.npv
            public String getType() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (String) ipChange.ipc$dispatch("13e5e549", new Object[]{this});
                }
                return bak.UA_NOTIFY_FORCE_TYPE;
            }

            @Override // tb.npv
            public void onCancel() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("379d4540", new Object[]{this});
                    return;
                }
                a aVar = a.this;
                ApkUpdateContext apkUpdateContext = aVar.val$taskInfo;
                apkUpdateContext.success = false;
                apkUpdateContext.errorCode = -51;
                aVar.val$countDownLatch.countDown();
            }

            @Override // tb.npv
            public void onConfirm() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("310393e8", new Object[]{this});
                } else {
                    a.this.val$countDownLatch.countDown();
                }
            }
        }

        public a(CountDownLatch countDownLatch, ApkUpdateContext apkUpdateContext) {
            this.val$countDownLatch = countDownLatch;
            this.val$taskInfo = apkUpdateContext;
        }

        @Override // tb.npv
        public String getCancelText() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("338a645c", new Object[]{this});
            }
            if (tg4.getInstance().enableDialogUiV2()) {
                return null;
            }
            return wmc.CANCEL;
        }

        @Override // tb.npv
        public String getConfirmText() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("4f0d2482", new Object[]{this});
            }
            return "立即下载";
        }

        @Override // tb.npv
        public String getTitleText() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("4800096a", new Object[]{this});
            }
            if (!tg4.getInstance().enableDialogUiV2()) {
                return null;
            }
            return "快来更新" + UpdateRuntime.sAppName;
        }

        @Override // tb.npv
        public String getType() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("13e5e549", new Object[]{this});
            }
            return bak.UA_NOTIFY_TYPE;
        }

        @Override // tb.npv
        public void onCancel() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("379d4540", new Object[]{this});
            } else if (this.val$taskInfo.isForceUpdate()) {
                UpdateRuntime.doUIAlertForConfirm(nkv.getAppNameString(R.string.confirm_forceupdate_cancel, UpdateRuntime.sAppName), new C0881a());
            } else {
                ApkUpdateContext apkUpdateContext = this.val$taskInfo;
                apkUpdateContext.success = false;
                apkUpdateContext.errorCode = -51;
                this.val$countDownLatch.countDown();
            }
        }

        @Override // tb.npv
        public void onConfirm() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("310393e8", new Object[]{this});
            } else {
                this.val$countDownLatch.countDown();
            }
        }
    }

    static {
        t2o.a(953155612);
        t2o.a(947912754);
    }

    public final String a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("acf1ab14", new Object[]{this, new Long(j)});
        }
        if (j / 1048576 > 0) {
            DecimalFormat decimalFormat = new DecimalFormat("#.##");
            DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols();
            decimalFormatSymbols.setDecimalSeparator('.');
            decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);
            return "" + decimalFormat.format(((float) j) / 1048576.0f) + "MB";
        }
        long j2 = j / 1024;
        if (j2 > 0) {
            return "" + j2 + "KB";
        }
        return "" + j + "B";
    }

    public final boolean b(ApkUpdateContext apkUpdateContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("65946394", new Object[]{this, apkUpdateContext})).booleanValue();
        }
        return !apkUpdateContext.isSilentUpdate();
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1d6cb69", new Object[]{this});
        } else {
            kjv.setLastPopTime(System.currentTimeMillis());
        }
    }

    public void execute(ApkUpdateContext apkUpdateContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aeed841b", new Object[]{this, apkUpdateContext});
            return;
        }
        MainUpdateData mainUpdateData = apkUpdateContext.mainUpdate;
        if (mainUpdateData == null || TextUtils.isEmpty(mainUpdateData.getDownloadUrl())) {
            apkUpdateContext.success = false;
            apkUpdateContext.errorCode = 31;
            return;
        }
        onf onfVar = new onf();
        onfVar.f25507a = mainUpdateData.getDownloadUrl();
        onfVar.b = mainUpdateData.size;
        onfVar.c = mainUpdateData.md5;
        String f = rv7.e().f(nkv.getStorePath(apkUpdateContext.context) + "/apkupdate/" + mainUpdateData.version, onfVar);
        if (!TextUtils.isEmpty(f)) {
            apkUpdateContext.apkPath = f;
        } else if (b(apkUpdateContext)) {
            apkUpdateContext.hasNotified = true;
            CountDownLatch countDownLatch = new CountDownLatch(1);
            UpdateRuntime.doUIAlertForConfirm(mainUpdateData.info + "\n\n更新包大小：" + a(mainUpdateData.size), new a(countDownLatch, apkUpdateContext));
            c();
            try {
                countDownLatch.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

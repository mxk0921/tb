package tb;

import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.update.apk.ApkUpdateContext;
import com.taobao.update.apk.history.ApkUpdateHistory;
import com.taobao.update.framework.UpdateRuntime;
import com.taobao.update.provider.UpdateProvider;
import java.io.File;
import java.util.concurrent.CountDownLatch;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class m11 implements czm<ApkUpdateContext> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String UA_INSTALL_FORCE_TYPE = "APK_INSTALL_CONFIRM_FORCE_RETRY";
    public static final String UA_INSTALL_TYPE = "APK_INSTALL_CONFIRM";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements npv {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ CountDownLatch val$countDownLatch;
        public final /* synthetic */ ApkUpdateContext val$updateContext;

        /* compiled from: Taobao */
        /* renamed from: tb.m11$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public class C0987a implements npv {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public C0987a() {
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
                return "立即安装";
            }

            @Override // tb.npv
            public String getTitleText() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (String) ipChange.ipc$dispatch("4800096a", new Object[]{this});
                }
                return "提醒";
            }

            @Override // tb.npv
            public String getType() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (String) ipChange.ipc$dispatch("13e5e549", new Object[]{this});
                }
                return m11.UA_INSTALL_FORCE_TYPE;
            }

            @Override // tb.npv
            public void onCancel() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("379d4540", new Object[]{this});
                    return;
                }
                a aVar = a.this;
                ApkUpdateContext apkUpdateContext = aVar.val$updateContext;
                apkUpdateContext.errorCode = -51;
                m11.access$100(m11.this, apkUpdateContext);
                a.this.val$countDownLatch.countDown();
            }

            @Override // tb.npv
            public void onConfirm() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("310393e8", new Object[]{this});
                    return;
                }
                a aVar = a.this;
                m11.access$000(m11.this, aVar.val$updateContext);
                a.this.val$countDownLatch.countDown();
            }
        }

        public a(ApkUpdateContext apkUpdateContext, CountDownLatch countDownLatch) {
            this.val$updateContext = apkUpdateContext;
            this.val$countDownLatch = countDownLatch;
        }

        @Override // tb.npv
        public String getCancelText() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("338a645c", new Object[]{this});
            }
            return wmc.CANCEL;
        }

        @Override // tb.npv
        public String getConfirmText() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("4f0d2482", new Object[]{this});
            }
            return "立即安装";
        }

        @Override // tb.npv
        public String getTitleText() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("4800096a", new Object[]{this});
            }
            return "安装";
        }

        @Override // tb.npv
        public String getType() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("13e5e549", new Object[]{this});
            }
            return m11.UA_INSTALL_TYPE;
        }

        @Override // tb.npv
        public void onCancel() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("379d4540", new Object[]{this});
            } else if (this.val$updateContext.isForceUpdate()) {
                UpdateRuntime.doUIAlertForConfirm(nkv.getAppNameString(R.string.confirm_forceupdate_install, UpdateRuntime.sAppName), new C0987a());
            } else {
                ApkUpdateContext apkUpdateContext = this.val$updateContext;
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
                return;
            }
            m11.access$000(m11.this, this.val$updateContext);
            this.val$countDownLatch.countDown();
        }
    }

    static {
        t2o.a(953155603);
        t2o.a(947912754);
    }

    public static /* synthetic */ void access$000(m11 m11Var, ApkUpdateContext apkUpdateContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee8543b9", new Object[]{m11Var, apkUpdateContext});
        } else {
            m11Var.b(apkUpdateContext);
        }
    }

    public static /* synthetic */ void access$100(m11 m11Var, ApkUpdateContext apkUpdateContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7120418", new Object[]{m11Var, apkUpdateContext});
        } else {
            m11Var.a(apkUpdateContext);
        }
    }

    public final void a(ApkUpdateContext apkUpdateContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca35778b", new Object[]{this, apkUpdateContext});
            return;
        }
        apkUpdateContext.success = false;
        apkUpdateContext.errorCode = -51;
    }

    public final void b(ApkUpdateContext apkUpdateContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8071eb6", new Object[]{this, apkUpdateContext});
            return;
        }
        ApkUpdateHistory.Data data = new ApkUpdateHistory.Data();
        data.fromVersion = nkv.getVersionName();
        data.toVersion = apkUpdateContext.mainUpdate.version;
        data.ext = apkUpdateContext.apkPath;
        ApkUpdateHistory.update(data);
        File file = new File(apkUpdateContext.apkPath);
        if (file.exists()) {
            String path = file.getPath();
            int indexOf = path.indexOf("apkupdate");
            if (indexOf > -1) {
                path = path.substring(0, indexOf + 9);
            }
            try {
                Runtime runtime = Runtime.getRuntime();
                runtime.exec("chmod -R 775 " + path);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setFlags(268435456);
        if (Build.VERSION.SDK_INT >= 24) {
            Uri uriForFile = UpdateProvider.getUriForFile(apkUpdateContext.context, new File(apkUpdateContext.apkPath));
            intent.addFlags(1);
            for (ResolveInfo resolveInfo : apkUpdateContext.context.getPackageManager().queryIntentActivities(intent, 65536)) {
                apkUpdateContext.context.grantUriPermission(resolveInfo.activityInfo.packageName, uriForFile, 1);
            }
            intent.setDataAndType(uriForFile, "application/vnd.android.package-archive");
            apkUpdateContext.context.startActivity(intent);
        } else {
            intent.setDataAndType(Uri.fromFile(new File(apkUpdateContext.apkPath)), "application/vnd.android.package-archive");
        }
        apkUpdateContext.context.startActivity(intent);
    }

    public void execute(ApkUpdateContext apkUpdateContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aeed841b", new Object[]{this, apkUpdateContext});
        } else if (UpdateRuntime.forceInstallAfaterDownload) {
            b(apkUpdateContext);
        } else {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            UpdateRuntime.doUIAlertForConfirm(apkUpdateContext.hasNotified ? nkv.getAppNameString(R.string.update_notification_finish, UpdateRuntime.sAppName) : nkv.getAppNameString(R.string.confirm_install_hint1, UpdateRuntime.sAppName), new a(apkUpdateContext, countDownLatch));
            try {
                countDownLatch.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

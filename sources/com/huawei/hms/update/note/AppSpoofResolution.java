package com.huawei.hms.update.note;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.KeyEvent;
import com.huawei.hms.activity.IBridgeActivityDelegate;
import com.huawei.hms.adapter.sysobs.SystemManager;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.ui.AbstractDialog;
import com.huawei.hms.ui.AbstractPromptDialog;
import com.huawei.hms.utils.PackageManagerHelper;
import com.huawei.hms.utils.ResourceLoaderUtil;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class AppSpoofResolution implements IBridgeActivityDelegate {

    /* renamed from: a  reason: collision with root package name */
    private Activity f5497a;
    private b b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements AbstractDialog.Callback {
        public a() {
        }

        @Override // com.huawei.hms.ui.AbstractDialog.Callback
        public void onCancel(AbstractDialog abstractDialog) {
            com.huawei.hms.availableupdate.a.c.a(true);
            AppSpoofResolution.this.b = null;
            AppSpoofResolution.this.a();
        }

        @Override // com.huawei.hms.ui.AbstractDialog.Callback
        public void onDoWork(AbstractDialog abstractDialog) {
            com.huawei.hms.availableupdate.a.c.a(true);
            AppSpoofResolution.this.b = null;
            AppSpoofResolution.this.a();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b extends AbstractPromptDialog {
        private b() {
        }

        @Override // com.huawei.hms.ui.AbstractDialog
        public String onGetMessageString(Context context) {
            String str = "com.huawei.hwid";
            String applicationName = new PackageManagerHelper(context).getApplicationName(str);
            if (!TextUtils.isEmpty(applicationName)) {
                str = applicationName;
            }
            if (ResourceLoaderUtil.getmContext() == null) {
                ResourceLoaderUtil.setmContext(context);
            }
            return ResourceLoaderUtil.getString("hms_is_spoof", str);
        }

        @Override // com.huawei.hms.ui.AbstractDialog
        public String onGetPositiveButtonString(Context context) {
            if (ResourceLoaderUtil.getmContext() == null) {
                ResourceLoaderUtil.setmContext(context);
            }
            return ResourceLoaderUtil.getString("hms_confirm");
        }

        @Override // com.huawei.hms.ui.AbstractPromptDialog, com.huawei.hms.ui.AbstractDialog
        public String onGetTitleString(Context context) {
            if (ResourceLoaderUtil.getmContext() == null) {
                ResourceLoaderUtil.setmContext(context);
            }
            return ResourceLoaderUtil.getString("hms_spoof_hints");
        }

        public /* synthetic */ b(a aVar) {
            this();
        }
    }

    private void b() {
        Activity activity = getActivity();
        if (activity != null && !activity.isFinishing()) {
            b bVar = this.b;
            if (bVar == null) {
                this.b = new b(null);
            } else {
                bVar.dismiss();
            }
            HMSLog.i("AppSpoofResolution", "enter AppSpoofResolution showPromptdlg to resolve conn error");
            this.b.show(activity, new a());
        }
    }

    public Activity getActivity() {
        return this.f5497a;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public int getRequestCode() {
        return 0;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeActivityCreate(Activity activity) {
        HMSLog.i("AppSpoofResolution", "enter AppSpoofResolution onBridgeActivityCreate");
        if (activity == null || activity.isFinishing()) {
            HMSLog.e("AppSpoofResolution", "activity is null or finishing");
            return;
        }
        this.f5497a = activity;
        com.huawei.hms.availableupdate.a aVar = com.huawei.hms.availableupdate.a.c;
        aVar.a(activity);
        aVar.a(false);
        b();
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeActivityDestroy() {
        HMSLog.i("AppSpoofResolution", "enter AppSpoofResolution onBridgeActivityDestroy");
        com.huawei.hms.availableupdate.a aVar = com.huawei.hms.availableupdate.a.c;
        if (aVar.a().compareAndSet(true, false)) {
            SystemManager.getInstance().notifyNoticeResult(29);
        }
        aVar.b(this.f5497a);
        this.f5497a = null;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public boolean onBridgeActivityResult(int i, int i2, Intent intent) {
        if (i != getRequestCode()) {
            return false;
        }
        HMSLog.i("AppSpoofResolution", "enter AppSpoofResolution onBridgeActivityResult");
        return true;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeConfigurationChanged() {
        if (this.b != null) {
            HMSLog.i("AppSpoofResolution", "enter AppSpoofResolution re show prompt dialog");
            b();
        }
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onKeyUp(int i, KeyEvent keyEvent) {
        HMSLog.i("AppSpoofResolution", "enter AppSpoofResolution On key up when resolve spoof error");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        Activity activity = getActivity();
        if (activity != null && !activity.isFinishing()) {
            HMSLog.i("AppSpoofResolution", "enter AppSpoofResolution finishBridgeActivity：");
            if (com.huawei.hms.availableupdate.a.c.a().compareAndSet(true, false)) {
                SystemManager.getInstance().notifyNoticeResult(29);
            }
            activity.finish();
        }
    }
}

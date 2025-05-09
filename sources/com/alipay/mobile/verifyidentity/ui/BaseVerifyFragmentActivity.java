package com.alipay.mobile.verifyidentity.ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import com.alipay.mobile.verifyidentity.engine.MicroModuleContext;
import com.alipay.mobile.verifyidentity.log.VerifyLogCat;
import com.alipay.mobile.verifyidentity.module.MicroModule;
import com.alipay.mobile.verifyidentity.ui.helper.ActivityHelper;
import com.alipay.mobile.verifyidentity.ui.helper.DialogHelper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public abstract class BaseVerifyFragmentActivity extends AdapterFragmentActivity implements ActivityResponsable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public ActivityHelper D0;
    public MicroModuleContext mMicroModuleContext;
    public MicroModule mModule;

    public static /* synthetic */ Object ipc$super(BaseVerifyFragmentActivity baseVerifyFragmentActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.onResume();
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 1150324634:
                super.finish();
                return null;
            case 1264052993:
                super.onNewIntent((Intent) objArr[0]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/verifyidentity/ui/BaseVerifyFragmentActivity");
        }
    }

    @Override // com.alipay.mobile.verifyidentity.ui.ActivityResponsable
    public void alert(String str, String str2, String str3, DialogInterface.OnClickListener onClickListener, String str4, DialogInterface.OnClickListener onClickListener2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17008757", new Object[]{this, str, str2, str3, onClickListener, str4, onClickListener2});
        } else {
            this.D0.alert(str, str2, str3, onClickListener, str4, onClickListener2);
        }
    }

    @Override // com.alipay.mobile.verifyidentity.ui.ActivityResponsable
    public void dismissProgressDialog() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afa6c806", new Object[]{this});
        } else {
            this.D0.dismissProgressDialog();
        }
    }

    @Override // android.app.Activity
    public void finish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44908f9a", new Object[]{this});
            return;
        }
        this.D0.finish();
        super.finish();
        overridePendingTransition(0, 0);
    }

    public DialogHelper getDialogHelper() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DialogHelper) ipChange.ipc$dispatch("3a7cfdc6", new Object[]{this});
        }
        return this.D0.getDialogHelper();
    }

    public boolean isDialogShowing() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fe93935e", new Object[]{this})).booleanValue();
        }
        return this.D0.getDialogHelper().isDialogShowing();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        setTheme(R.style.VITranslucentBaseTheme);
        super.onCreate(bundle);
        ActivityHelper activityHelper = new ActivityHelper(this);
        this.D0 = activityHelper;
        this.mModule = activityHelper.getModule();
        this.mMicroModuleContext = this.D0.getMicroModuleContext();
        if (this.mModule == null) {
            if (!ActivityHelper.isInWhiteList(getClass().getName())) {
                this.mModule = this.D0.whenModuleIsNull();
                finish();
            } else {
                return;
            }
        }
        if (!MicroModuleContext.getInstance().canTaskContinue(this.mModule.getTask())) {
            VerifyLogCat.e(getClass().getSimpleName(), "Activity所属Task已经过期，直接销毁");
            finish();
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b57eb01", new Object[]{this, intent});
            return;
        }
        super.onNewIntent(intent);
        this.D0.onNewIntent(intent);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        this.D0.onPause();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        this.D0.onResume();
    }

    @Override // com.alipay.mobile.verifyidentity.ui.ActivityResponsable
    public void showProgressDialog(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4a6743", new Object[]{this, str});
        } else {
            this.D0.showProgressDialog(str);
        }
    }

    @Override // com.alipay.mobile.verifyidentity.ui.ActivityResponsable
    public void toast(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4329f88b", new Object[]{this, str, new Integer(i)});
        } else {
            this.D0.toast(str, i);
        }
    }

    @Override // com.alipay.mobile.verifyidentity.ui.ActivityResponsable
    public void alert(String str, String str2, String str3, DialogInterface.OnClickListener onClickListener, String str4, DialogInterface.OnClickListener onClickListener2, Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a82bc296", new Object[]{this, str, str2, str3, onClickListener, str4, onClickListener2, bool});
        } else {
            this.D0.alert(str, str2, str3, onClickListener, str4, onClickListener2, bool);
        }
    }

    @Override // com.alipay.mobile.verifyidentity.ui.ActivityResponsable
    public void showProgressDialog(String str, boolean z, DialogInterface.OnCancelListener onCancelListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11a225aa", new Object[]{this, str, new Boolean(z), onCancelListener});
        } else {
            this.D0.showProgressDialog(str, z, onCancelListener);
        }
    }

    @Override // com.alipay.mobile.verifyidentity.ui.ActivityResponsable
    public void showProgressDialog(String str, boolean z, DialogInterface.OnCancelListener onCancelListener, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22a3426a", new Object[]{this, str, new Boolean(z), onCancelListener, new Boolean(z2)});
        } else {
            this.D0.showProgressDialog(str, z, onCancelListener, z2);
        }
    }
}

package com.alipay.mobile.verifyidentity.ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.alipay.mobile.verifyidentity.engine.MicroModuleContext;
import com.alipay.mobile.verifyidentity.log.VerifyLogCat;
import com.alipay.mobile.verifyidentity.module.MicroModule;
import com.alipay.mobile.verifyidentity.ui.helper.ActivityHelper;
import com.alipay.mobile.verifyidentity.ui.helper.DialogHelper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.lang.reflect.Method;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public abstract class BaseVerifyActivity extends AdapterActivity implements ActivityResponsable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public ActivityHelper f4463a;
    public MicroModuleContext mMicroModuleContext;
    public MicroModule mModule;

    public static /* synthetic */ Object ipc$super(BaseVerifyActivity baseVerifyActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.onResume();
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case -349229044:
                super.onConfigurationChanged((Configuration) objArr[0]);
                return null;
            case 323739864:
                super.setRequestedOrientation(((Number) objArr[0]).intValue());
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
            case 2133689546:
                super.onStart();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/verifyidentity/ui/BaseVerifyActivity");
        }
    }

    @Override // com.alipay.mobile.verifyidentity.ui.ActivityResponsable
    public void alert(String str, String str2, String str3, DialogInterface.OnClickListener onClickListener, String str4, DialogInterface.OnClickListener onClickListener2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17008757", new Object[]{this, str, str2, str3, onClickListener, str4, onClickListener2});
        } else {
            this.f4463a.alert(str, str2, str3, onClickListener, str4, onClickListener2);
        }
    }

    @Override // com.alipay.mobile.verifyidentity.ui.ActivityResponsable
    public void dismissProgressDialog() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afa6c806", new Object[]{this});
        } else {
            this.f4463a.dismissProgressDialog();
        }
    }

    @Override // android.app.Activity
    public void finish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44908f9a", new Object[]{this});
            return;
        }
        ActivityHelper activityHelper = this.f4463a;
        if (activityHelper != null) {
            activityHelper.finish();
        }
        super.finish();
        overridePendingTransition(0, 0);
    }

    public DialogHelper getDialogHelper() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DialogHelper) ipChange.ipc$dispatch("3a7cfdc6", new Object[]{this});
        }
        return this.f4463a.getDialogHelper();
    }

    public View getRootView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("17b33166", new Object[]{this});
        }
        return ((ViewGroup) findViewById(16908290)).getChildAt(0);
    }

    public boolean isDialogShowing() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fe93935e", new Object[]{this})).booleanValue();
        }
        return this.f4463a.getDialogHelper().isDialogShowing();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb2f300c", new Object[]{this, configuration});
            return;
        }
        super.onConfigurationChanged(configuration);
        updateAlertLayout();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        setTheme(R.style.VITranslucentBaseTheme);
        super.onCreate(bundle);
        setRequestedOrientation(1);
        ActivityHelper activityHelper = new ActivityHelper(this);
        this.f4463a = activityHelper;
        this.mModule = activityHelper.getModule();
        this.mMicroModuleContext = this.f4463a.getMicroModuleContext();
        MicroModuleContext.getInstance().removeStartActivityMonitor();
        if (this.mModule == null) {
            if (!ActivityHelper.isInWhiteList(getClass().getName())) {
                this.mModule = this.f4463a.whenModuleIsNull();
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

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b57eb01", new Object[]{this, intent});
            return;
        }
        super.onNewIntent(intent);
        this.f4463a.onNewIntent(intent);
        MicroModuleContext.getInstance().removeStartActivityMonitor();
    }

    @Override // android.app.Activity
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        this.f4463a.onPause();
    }

    @Override // android.app.Activity
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        this.f4463a.onResume();
    }

    @Override // android.app.Activity
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        super.onStart();
        forbidDark(getRootView());
    }

    @Override // android.app.Activity
    public void setRequestedOrientation(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("134be0d8", new Object[]{this, new Integer(i)});
            return;
        }
        try {
            super.setRequestedOrientation(i);
        } catch (Throwable th) {
            VerifyLogCat.w(getClass().getSimpleName(), th);
        }
    }

    @Override // com.alipay.mobile.verifyidentity.ui.ActivityResponsable
    public void showProgressDialog(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4a6743", new Object[]{this, str});
        } else {
            this.f4463a.showProgressDialog(str);
        }
    }

    @Override // com.alipay.mobile.verifyidentity.ui.ActivityResponsable
    public void toast(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4329f88b", new Object[]{this, str, new Integer(i)});
        } else {
            this.f4463a.toast(str, i);
        }
    }

    public void updateAlertLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19e1f124", new Object[]{this});
        } else {
            this.f4463a.updateAlertLayout();
        }
    }

    public void alert(String str, String str2, String str3, DialogInterface.OnClickListener onClickListener, String str4, DialogInterface.OnClickListener onClickListener2, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("392f581d", new Object[]{this, str, str2, str3, onClickListener, str4, onClickListener2, bundle});
        } else {
            this.f4463a.alert(str, str2, str3, onClickListener, str4, onClickListener2, bundle);
        }
    }

    @Override // com.alipay.mobile.verifyidentity.ui.ActivityResponsable
    public void showProgressDialog(String str, boolean z, DialogInterface.OnCancelListener onCancelListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11a225aa", new Object[]{this, str, new Boolean(z), onCancelListener});
        } else {
            this.f4463a.showProgressDialog(str, z, onCancelListener);
        }
    }

    public void toast(String str, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22158bd8", new Object[]{this, str, new Integer(i), new Integer(i2)});
        } else {
            this.f4463a.toast(str, i, i2);
        }
    }

    @Override // com.alipay.mobile.verifyidentity.ui.ActivityResponsable
    public void alert(String str, String str2, String str3, DialogInterface.OnClickListener onClickListener, String str4, DialogInterface.OnClickListener onClickListener2, Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a82bc296", new Object[]{this, str, str2, str3, onClickListener, str4, onClickListener2, bool});
        } else {
            this.f4463a.alert(str, str2, str3, onClickListener, str4, onClickListener2, bool);
        }
    }

    public void forbidDark(View view) {
        if (Build.VERSION.SDK_INT > 28 && view != null) {
            try {
                Method method = View.class.getMethod("setForceDarkAllowed", Boolean.TYPE);
                method.setAccessible(true);
                method.invoke(view, Boolean.FALSE);
            } catch (Throwable th) {
                VerifyLogCat.printStackTraceAndMore(th);
            }
        }
    }

    @Override // com.alipay.mobile.verifyidentity.ui.ActivityResponsable
    public void showProgressDialog(String str, boolean z, DialogInterface.OnCancelListener onCancelListener, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22a3426a", new Object[]{this, str, new Boolean(z), onCancelListener, new Boolean(z2)});
        } else {
            this.f4463a.showProgressDialog(str, z, onCancelListener, z2);
        }
    }
}

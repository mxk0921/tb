package com.ali.user.mobile.register.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.ali.user.mobile.app.constant.FragmentConstant;
import com.ali.user.mobile.login.model.LoginConstant;
import com.ali.user.mobile.login.newui.NewRegSMSVerification;
import com.ali.user.mobile.model.RegistParam;
import com.ali.user.mobile.register.RegistConstants;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.acq;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class AliUserRegisterSMSCodeActivity extends AliUserRegisterActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(70254821);
    }

    public static Intent getCallingIntent(Context context, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("8fcdf196", new Object[]{context, bundle});
        }
        Intent intent = new Intent(context, AliUserRegisterSMSCodeActivity.class);
        intent.putExtras(bundle);
        return intent;
    }

    public static /* synthetic */ Object ipc$super(AliUserRegisterSMSCodeActivity aliUserRegisterSMSCodeActivity, String str, Object... objArr) {
        if (str.hashCode() == 514894248) {
            super.attachBaseContext((Context) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ali/user/mobile/register/ui/AliUserRegisterSMSCodeActivity");
    }

    @Override // com.ali.user.mobile.register.ui.AliUserRegisterActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        super.attachBaseContext(context);
        acq.B(context);
    }

    @Override // com.ali.user.mobile.register.ui.AliUserRegisterActivity, com.ali.user.mobile.base.ui.BaseActivity
    public int getLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("28b929a", new Object[]{this})).intValue();
        }
        return R.layout.aliuser_activity_container;
    }

    @Override // com.ali.user.mobile.register.ui.AliUserRegisterActivity
    public void changeFragmentByConfig(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e55547d", new Object[]{this, intent});
            return;
        }
        try {
            Fragment newRegSMSVerification = new NewRegSMSVerification();
            if (intent != null) {
                try {
                    Bundle extras = intent.getExtras();
                    if (extras == null) {
                        extras = new Bundle();
                    }
                    if (extras.getBoolean(LoginConstant.FROM_OVERSEA, false)) {
                        newRegSMSVerification = new AliUserRegisterSMSVerificationFragment();
                    }
                    RegistParam registParam = this.mRegistParam;
                    if (registParam != null) {
                        extras.putSerializable(RegistConstants.REGISTPARAM, registParam);
                    }
                    newRegSMSVerification.setArguments(extras);
                } catch (Throwable unused) {
                }
            }
            addFragment(newRegSMSVerification, FragmentConstant.REG_FRAGMENT_TAG);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

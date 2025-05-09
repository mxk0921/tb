package com.ali.user.mobile.register.ui.oversea;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.ali.user.mobile.app.constant.FragmentConstant;
import com.ali.user.mobile.common.api.AliUserLogin;
import com.ali.user.mobile.login.ui.UserLoginActivity;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.acq;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class EmailCodeActivity extends UserLoginActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(70254865);
    }

    public static Intent getCallingIntent(Context context, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("8fcdf196", new Object[]{context, bundle});
        }
        Intent intent = new Intent(context, EmailCodeActivity.class);
        intent.putExtras(bundle);
        return intent;
    }

    public static /* synthetic */ Object ipc$super(EmailCodeActivity emailCodeActivity, String str, Object... objArr) {
        if (str.hashCode() == 514894248) {
            super.attachBaseContext((Context) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ali/user/mobile/register/ui/oversea/EmailCodeActivity");
    }

    @Override // com.ali.user.mobile.login.ui.UserLoginActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        super.attachBaseContext(context);
        acq.B(context);
    }

    @Override // com.ali.user.mobile.login.ui.UserLoginActivity, com.ali.user.mobile.base.ui.BaseActivity
    public int getLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("28b929a", new Object[]{this})).intValue();
        }
        return R.layout.aliuser_activity_container;
    }

    @Override // com.ali.user.mobile.login.ui.UserLoginActivity
    public void openFragmentByConfig(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a946817", new Object[]{this, intent});
            return;
        }
        try {
            AliUserLogin.getAppreanceExtentions();
            AliEmailCodeFragment aliEmailCodeFragment = new AliEmailCodeFragment();
            if (intent != null) {
                try {
                    Bundle extras = intent.getExtras();
                    if (extras == null) {
                        extras = new Bundle();
                    }
                    aliEmailCodeFragment.setArguments(extras);
                } catch (Throwable unused) {
                }
            }
            addFragment(intent, aliEmailCodeFragment, FragmentConstant.REG_FRAGMENT_TAG);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

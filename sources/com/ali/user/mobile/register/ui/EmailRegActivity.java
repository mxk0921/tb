package com.ali.user.mobile.register.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.ali.user.mobile.app.constant.FragmentConstant;
import com.ali.user.mobile.base.ui.BaseActivity;
import com.ali.user.mobile.log.UserTrackAdapter;
import com.ali.user.mobile.login.ui.UserLoginActivity;
import com.ali.user.mobile.register.ui.oversea.AliEmailFragment;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.acq;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class EmailRegActivity extends UserLoginActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(70254839);
    }

    public static Intent getCallingIntent(Context context, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("8fcdf196", new Object[]{context, bundle});
        }
        Intent intent = new Intent(context, EmailRegActivity.class);
        intent.putExtras(bundle);
        return intent;
    }

    public static /* synthetic */ Object ipc$super(EmailRegActivity emailRegActivity, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -3136315) {
            super.initViews();
            return null;
        } else if (hashCode == 514894248) {
            super.attachBaseContext((Context) objArr[0]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/ali/user/mobile/register/ui/EmailRegActivity");
        }
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

    @Override // com.ali.user.mobile.login.ui.UserLoginActivity
    public void doFinishThing() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("991f8f17", new Object[]{this});
            return;
        }
        try {
            if (!isFinishing()) {
                UserTrackAdapter.sendUT(getPageName(), "handle_login_close_page");
                finish();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.ali.user.mobile.login.ui.UserLoginActivity, com.ali.user.mobile.base.ui.BaseActivity
    public void initViews() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffd024c5", new Object[]{this});
            return;
        }
        super.initViews();
        setBackground(true ^ BaseActivity.isChinese);
    }

    @Override // com.ali.user.mobile.login.ui.UserLoginActivity
    public void openFragmentByConfig(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a946817", new Object[]{this, intent});
            return;
        }
        try {
            AliEmailFragment aliEmailFragment = new AliEmailFragment();
            if (intent != null) {
                try {
                    Bundle extras = intent.getExtras();
                    if (extras == null) {
                        extras = new Bundle();
                    }
                    aliEmailFragment.setArguments(extras);
                } catch (Throwable unused) {
                }
            }
            addFragment(intent, aliEmailFragment, FragmentConstant.REG_FRAGMENT_TAG);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.ali.user.mobile.login.ui.UserLoginActivity, com.ali.user.mobile.base.ui.BaseActivity
    public void setDefaultTheme() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8c0ad11", new Object[]{this});
        }
    }
}

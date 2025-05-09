package com.alipay.mobile.verifyidentity.module.password.pay.ui;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alipay.mobile.verifyidentity.log.VerifyLogCat;
import com.alipay.mobile.verifyidentity.ui.APRelativeLayout;
import com.alipay.mobile.verifyidentity.ui.APScrollView;
import com.alipay.mobile.verifyidentity.ui.APTitleBar;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.acq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class PayPwdFullActivity extends PayPwdCommonActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public APTitleBar g;

    public static /* synthetic */ Object ipc$super(PayPwdFullActivity payPwdFullActivity, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        } else if (hashCode == 514894248) {
            super.attachBaseContext((Context) objArr[0]);
            return null;
        } else if (hashCode == 2133689546) {
            super.onStart();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alipay/mobile/verifyidentity/module/password/pay/ui/PayPwdFullActivity");
        }
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        super.attachBaseContext(context);
        acq.B(context);
    }

    public void initViewHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("484d0be3", new Object[]{this});
            return;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        Rect rect = new Rect();
        getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        this.mViewHeight = (displayMetrics.heightPixels - this.g.getHeight()) - rect.top;
        VerifyLogCat.i("PayPwdFullActivity", "mViewHeight: " + this.mViewHeight);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88afc63", new Object[]{this});
            return;
        }
        notifyCancel("102");
        writePwdBehavorLog("UC-MobileIC-20190606-2", "USER_CLICK_BACK", "wallet_cn");
    }

    @Override // com.alipay.mobile.verifyidentity.ui.BaseVerifyActivity, android.app.Activity
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        super.onStart();
        if (!isDialogShowing()) {
            showKeyBoardDelay(200L);
        }
    }

    @Override // com.alipay.mobile.verifyidentity.module.password.pay.ui.AbsPayPwdActivity, com.alipay.mobile.verifyidentity.ui.BaseVerifyActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        VerifyLogCat.i("PayPwdFullActivity", "onCreate");
        if (!this.mIsLogicInterrupted && getIntent() != null && getIntent().getExtras() != null) {
            setContentView(R.layout.new_pwd_full);
            this.mRoot = findViewById(R.id.paypwd_bg);
            this.mWrapper = (APScrollView) findViewById(R.id.pwd_wrapper);
            this.g = (APTitleBar) findViewById(R.id.auth_titleBar);
            LinearLayout linearLayout = (LinearLayout) findViewById(R.id.keyboard_layout);
            this.mRoot.setVisibility(0);
            initViewHeight();
            ((APRelativeLayout) findViewById(R.id.pwd_titlebar)).setVisibility(8);
            if (!(getIntent() == null || getIntent().getExtras() == null)) {
                String string = getIntent().getExtras().getString("title");
                if (!TextUtils.isEmpty(string)) {
                    this.g.setTitleText("");
                    TextView textView = (TextView) findViewById(R.id.full_title);
                    if (textView != null) {
                        textView.setText(string);
                    }
                } else {
                    TextView textView2 = (TextView) findViewById(R.id.full_title);
                    if (textView2 != null) {
                        textView2.setText(getResources().getString(R.string.pwd_input_alert_please));
                    }
                }
            }
            initSubtitle();
            initKeyBoard(linearLayout);
            initInput();
            initProgress();
            initContent();
            initGoOther();
            forbidCapture();
        }
    }
}

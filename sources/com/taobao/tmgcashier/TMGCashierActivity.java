package com.taobao.tmgcashier;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.google.android.gms.wallet.CardInfo;
import com.google.android.gms.wallet.PaymentData;
import com.google.android.gms.wallet.PaymentMethodToken;
import com.taobao.android.weex.b;
import com.taobao.android.weex_ability.page.WeexFragment;
import com.taobao.tao.log.TLog;
import com.taobao.taobao.R;
import com.taobao.tmgcashier.fragment.TMGCashierWebView;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.List;
import tb.acq;
import tb.b8s;
import tb.r6s;
import tb.t2o;
import tb.x6s;
import tb.y6s;
import tb.z7s;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TMGCashierActivity extends AppCompatActivity implements r6s {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public x6s f13833a;
    public y6s b;
    public int c = -1;
    public Uri d;

    static {
        t2o.a(860880900);
        t2o.a(860880921);
    }

    public static /* synthetic */ Object ipc$super(TMGCashierActivity tMGCashierActivity, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        } else if (hashCode == 514894248) {
            super.attachBaseContext((Context) objArr[0]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/tmgcashier/TMGCashierActivity");
        }
    }

    public static void o3(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28c570a7", new Object[]{application});
        } else {
            b.d().c(application);
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        super.attachBaseContext(context);
        acq.B(context);
    }

    public void containerOuterClick(View view) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c172c7fd", new Object[]{this, view});
            return;
        }
        Uri uri = this.d;
        if (uri != null) {
            str = uri.getQueryParameter("mask_close");
        } else {
            str = "true";
        }
        if ("false".equals(str)) {
            TLog.loge("frontCashier", "CashActivity", "点击空白区域，链接命中 mask_close");
        } else {
            finish();
        }
    }

    public Context getContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        return this;
    }

    public void l3(Fragment fragment) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0d63d8f", new Object[]{this, fragment});
            return;
        }
        if (fragment instanceof WeexFragment) {
            str = ((WeexFragment) fragment).getBundleUrl();
        } else if (fragment instanceof TMGCashierWebView) {
            str = ((TMGCashierWebView) fragment).getBundleUrl();
        } else {
            str = "";
        }
        Uri parse = Uri.parse(str);
        this.d = parse;
        String queryParameter = parse.getQueryParameter("height");
        if (!String.valueOf(this.c).equals(queryParameter)) {
            try {
                if (!TextUtils.isEmpty(queryParameter)) {
                    this.c = Integer.parseInt(queryParameter);
                } else {
                    this.c = 880;
                }
            } catch (Exception e) {
                e.printStackTrace();
                new StringBuilder("parseInt error:").append(e.getMessage());
            }
            LinearLayout linearLayout = (LinearLayout) findViewById(R.id.frontCashierContainer);
            int i = getResources().getDisplayMetrics().heightPixels;
            if (this.c != 0) {
                int a2 = (int) (this.c * b8s.a(this));
                if (a2 <= i) {
                    i = a2;
                }
                if (i > 0) {
                    ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
                    layoutParams.height = i;
                    linearLayout.setLayoutParams(layoutParams);
                }
                WindowManager.LayoutParams attributes = getWindow().getAttributes();
                attributes.dimAmount = 0.5f;
                getWindow().setAttributes(attributes);
            } else {
                linearLayout.getLayoutParams().height = i;
                linearLayout.setBackground(null);
                WindowManager.LayoutParams attributes2 = getWindow().getAttributes();
                attributes2.dimAmount = 0.5f;
                getWindow().setAttributes(attributes2);
            }
            if ("false".equals(parse.getQueryParameter("dimEnabled"))) {
                getWindow().setDimAmount(0.0f);
            }
        }
    }

    public final void m3(Intent intent, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fe3dda4", new Object[]{this, intent, new Integer(i)});
            return;
        }
        try {
            HashMap hashMap = new HashMap();
            if (i == -1) {
                hashMap.put("status", "SUCCESS");
                PaymentData fromIntent = PaymentData.getFromIntent(intent);
                if (fromIntent == null) {
                    hashMap.put("status", "FAILED");
                    this.b.l(hashMap);
                    TLog.loge("tmgcashier", "TMGGooglePayUtils", "paymentData null");
                    return;
                }
                CardInfo cardInfo = fromIntent.getCardInfo();
                if (cardInfo == null) {
                    hashMap.put("status", "FAILED");
                    this.b.l(hashMap);
                    TLog.loge("tmgcashier", "TMGGooglePayUtils", "cardInfo null");
                    return;
                }
                PaymentMethodToken paymentMethodToken = fromIntent.getPaymentMethodToken();
                if (paymentMethodToken == null) {
                    hashMap.put("status", "FAILED");
                    this.b.l(hashMap);
                    TLog.loge("tmgcashier", "TMGGooglePayUtils", "paymentMethodToken null");
                    return;
                }
                String cardNetwork = cardInfo.getCardNetwork();
                hashMap.put("cardBrand", cardNetwork);
                hashMap.put("extenalToken", paymentMethodToken.getToken());
                hashMap.put("extenalTokenIssuer", "GOOGLE_PAY");
                hashMap.put("brand", cardNetwork);
                hashMap.toString();
                this.b.l(hashMap);
            } else if (i != 0) {
                hashMap.put("status", "FAILED");
                this.b.l(hashMap);
                TLog.loge("tmgcashier", "TMGGooglePayUtils", "handlePaymentResult resultCode" + i);
            } else {
                hashMap.put("status", "CANCEL");
                this.b.l(hashMap);
            }
        } catch (Throwable th) {
            TLog.loge("tmgcashier", "TMGGooglePayUtils", "handlePaymentResult error :" + th.getMessage());
        }
    }

    public final void n3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        Intent intent = getIntent();
        this.b = new y6s(this);
        this.f13833a = new x6s(this.b, Looper.getMainLooper());
        if (intent == null) {
            Toast.makeText(this, "TMGCashierActivity intent 为空！", 1).show();
            finish();
            return;
        }
        this.b.f(intent);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
        } else if (i == 991) {
            m3(intent, i2);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88afc63", new Object[]{this});
        } else {
            finish();
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        this.f13833a.removeCallbacks(null);
        this.f13833a = null;
    }

    public void p3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca3e8649", new Object[]{this});
            return;
        }
        List<Fragment> fragments = getSupportFragmentManager().getFragments();
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        for (Fragment fragment : fragments) {
            beginTransaction.remove(fragment);
        }
        beginTransaction.commitAllowingStateLoss();
    }

    public void q3(Fragment fragment, boolean z, String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4911826", new Object[]{this, fragment, new Boolean(z), str});
        } else if (!isFinishing() && fragment != null) {
            FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
            List<Fragment> fragments = getSupportFragmentManager().getFragments();
            Fragment fragment2 = !fragments.isEmpty() ? fragments.get(fragments.size() - 1) : null;
            if (fragment2 != null) {
                if (fragment2 instanceof WeexFragment) {
                    str2 = ((WeexFragment) fragment2).getBundleUrl();
                } else if (fragment2 instanceof TMGCashierWebView) {
                    str2 = ((TMGCashierWebView) fragment2).getBundleUrl();
                } else {
                    str2 = "";
                }
                if (!TextUtils.isEmpty(str) && !str.equalsIgnoreCase(str2)) {
                    TLog.loge("tmgcashier", "TMGCashierActivity", "当前URL和老的不一致，终止刷新！");
                    return;
                } else if (!z) {
                    beginTransaction.hide(fragment2);
                } else {
                    beginTransaction.remove(fragment2);
                }
            }
            if (!fragment.isAdded()) {
                beginTransaction.add(R.id.frontCashierContainer, fragment);
            }
            beginTransaction.show(fragment);
            beginTransaction.commitAllowingStateLoss();
            l3(fragment);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        Intent intent = getIntent();
        if (intent.getBooleanExtra("needDecode", false)) {
            try {
                Uri parse = Uri.parse(URLDecoder.decode(intent.getData().toString(), "utf-8"));
                TLog.loge("tmgcashier", "TMGCashierActivity", "paresedUri:" + parse);
                intent.setData(parse);
                setIntent(intent);
                TLog.loge("tmgcashier", "TMGCashierActivity", "paresedUri after:" + getIntent().getData().toString());
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        if (Build.VERSION.SDK_INT >= 28) {
            Window window = getWindow();
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.layoutInDisplayCutoutMode = 1;
            window.setAttributes(attributes);
        }
        super.onCreate(bundle);
        Uri data = getIntent().getData();
        if (data != null) {
            str = data.getQueryParameter("height");
        } else {
            str = "";
        }
        if (TextUtils.isEmpty(str) || !str.equals("0")) {
            setContentView(R.layout.tmg_cashier_activity_main);
        } else {
            setContentView(R.layout.tmg_cashier_activity_main_no_cornor);
        }
        overridePendingTransition(R.anim.tmg_cashier_push_up_in, R.anim.tmg_cashier_push_down_out);
        o3(getApplication());
        n3();
        StringBuilder sb = new StringBuilder("oversea_url:");
        sb.append(data == null ? null : data.toString());
        z7s.b("Page_OverseaNewCashier", 2101, "Page_OverseaNewCashier_urlMonitor", sb.toString());
    }
}

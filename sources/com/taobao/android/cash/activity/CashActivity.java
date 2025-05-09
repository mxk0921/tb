package com.taobao.android.cash.activity;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.appcompat.app.AppCompatActivity;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.cash.enume.PrefetchDataState;
import com.taobao.android.cash.jsbridge.CashJSBridge;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.log.TLog;
import com.taobao.taobao.R;
import tb.a8s;
import tb.acq;
import tb.fsw;
import tb.qj4;
import tb.t2o;
import tb.x4x;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class CashActivity extends AppCompatActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int RESULT_CODE_WEEXV2 = 20001;

    /* renamed from: a  reason: collision with root package name */
    public BroadcastReceiver f6501a;
    public Activity b;
    public String c = x4x.e;
    public String d = x4x.d;
    public String e = x4x.f;

    static {
        t2o.a(416284679);
    }

    public static /* synthetic */ Object ipc$super(CashActivity cashActivity, String str, Object... objArr) {
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
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/cash/activity/CashActivity");
        }
    }

    public static /* synthetic */ PrefetchDataState l3(CashActivity cashActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PrefetchDataState) ipChange.ipc$dispatch("d2b872a6", new Object[]{cashActivity});
        }
        cashActivity.getClass();
        return null;
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

    public final void m3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dc70356", new Object[]{this});
            return;
        }
        try {
            this.c = OrangeConfig.getInstance().getConfig("cash4android", "payloading_url", x4x.e);
            this.d = OrangeConfig.getInstance().getConfig("cash4android", "cashier_url", x4x.d);
            this.e = OrangeConfig.getInstance().getConfig("cash4android", "simple_cashier_url", x4x.f);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        m3();
        super.onCreate(bundle);
        this.b = this;
        fsw.h("ALBBCashier", CashJSBridge.class);
        this.f6501a = new BroadcastReceiver() { // from class: com.taobao.android.cash.activity.CashActivity.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/cash/activity/CashActivity$1");
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                    return;
                }
                TLog.logd("frontCashier", "CashActivity", "onReceived: action = " + intent.getAction() + "activity:" + CashActivity.this.b);
                if ("com.ali.user.cash.close.all".equals(intent.getAction())) {
                    CashActivity.this.b.setResult(0);
                    CashActivity.this.finish();
                    CashActivity.this.overridePendingTransition(0, 0);
                } else if ("com.ali.user.cash.card.selected".equals(intent.getAction())) {
                    Intent intent2 = new Intent();
                    intent2.putExtra("data", intent.getStringExtra("data"));
                    CashActivity.this.b.setResult(-1, intent2);
                    CashActivity.this.finish();
                    CashActivity.this.overridePendingTransition(0, 0);
                } else if ("com.ali.user.cash.bridge.requestPrefetchData".equals(intent.getAction()) && CashActivity.l3(CashActivity.this) != null) {
                    CashActivity.l3(CashActivity.this).setState(PrefetchDataState.PrefetchDataStateEnum.REQUESTED, null);
                }
            }
        };
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.ali.user.cash.close.all");
        intentFilter.addAction("com.ali.user.cash.card.selected");
        intentFilter.addAction("com.ali.user.cash.bridge.requestPrefetchData");
        LocalBroadcastManager.getInstance(getApplicationContext()).registerReceiver(this.f6501a, intentFilter);
        n3();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        if (this.f6501a != null) {
            LocalBroadcastManager.getInstance(getApplicationContext()).unregisterReceiver(this.f6501a);
        }
    }

    public void o3(Uri uri, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78f92231", new Object[]{this, uri, str});
            return;
        }
        String encodedQuery = uri.getEncodedQuery();
        Intent intent = new Intent(this, PopupWXActivity.class);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(encodedQuery)) {
            if (this.d.indexOf("?") > -1) {
                sb.append("&");
                sb.append(encodedQuery);
            } else {
                sb.append("?");
                sb.append(encodedQuery);
            }
        }
        intent.putExtra(qj4.e, sb.toString());
        intent.putExtra(qj4.c, sb.toString());
        intent.putExtra("type", x4x.b);
        intent.putExtra("fullPage", 0);
        startActivity(intent);
        overridePendingTransition(R.anim.tmg_cash_pop_enter_anim, R.anim.tmg_cash_pop_exit_anim);
    }

    public final void p3(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5aa811d", new Object[]{this, str});
            return;
        }
        if (str.contains("wh_weex=true")) {
            Intent intent = new Intent(this, TMGWeex2Activity.class);
            intent.setData(Uri.parse(str));
            startActivity(intent);
        } else {
            Intent intent2 = new Intent(this, CustomBrowserActivity.class);
            intent2.putExtra("url", Uri.decode(str));
            intent2.putExtra("hasNavBar", Uri.decode(str).contains("hasNavBar=1") ? 1 : 0);
            startActivity(intent2);
        }
        overridePendingTransition(0, 0);
        finish();
    }

    public final void n3() {
        String[] split;
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aace2af2", new Object[]{this});
        } else if (getIntent() != null && getIntent().getData() != null) {
            try {
                Uri data = getIntent().getData();
                a8s.b("Page_OverseaNewCashier", 2101, "Page_OverseaNewCashier_oldUrlMonitor", "oversea_url:" + data.toString());
                String path = data.getPath();
                if ("h5.m.taobao.com".equalsIgnoreCase(data.getHost()) && x4x.UNI_PATH.equalsIgnoreCase(path)) {
                    p3(data.getQueryParameter("baseUrl"));
                } else if (data.toString().contains("baseUrl")) {
                    String queryParameter = data.getQueryParameter("baseUrl");
                    String str3 = "";
                    for (String str4 : data.getEncodedQuery().split("&")) {
                        if (str4.contains("baseUrl=")) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(str4.replace("baseUrl=", "").trim());
                            if (Uri.decode(str4).contains("?")) {
                                str2 = "";
                            } else {
                                str2 = "?";
                            }
                            sb.append(str2);
                            sb.append(str3);
                            str3 = sb.toString();
                        } else {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(str3);
                            if (str3.endsWith("?")) {
                                str = "";
                            } else {
                                str = "&";
                            }
                            sb2.append(str);
                            sb2.append(str4);
                            str3 = sb2.toString();
                        }
                    }
                    if (queryParameter == null || queryParameter.contains("weex_mode=dom")) {
                        Intent intent = new Intent(this, TMGWeex2Activity.class);
                        intent.putExtra("routerTime", 0L);
                        intent.setData(Uri.parse(Uri.decode(str3)));
                        startActivityForResult(intent, 20001);
                        overridePendingTransition(0, 0);
                        return;
                    }
                    Intent intent2 = new Intent(this, CustomBrowserActivity.class);
                    intent2.putExtra("url", Uri.decode(str3));
                    intent2.putExtra("hasNavBar", Uri.decode(str3).contains("hasNavBar=1") ? 1 : 0);
                    intent2.putExtra("downgrade", true);
                    startActivity(intent2);
                    overridePendingTransition(0, 0);
                } else if (!TextUtils.isEmpty(path) && path.contains("go/openCashier")) {
                    o3(data, this.d);
                } else if (!TextUtils.isEmpty(path) && path.contains("go/simpleCashier")) {
                    o3(data, this.e);
                } else if (TextUtils.isEmpty(path) || !path.contains("go/startPayment")) {
                    Intent intent3 = new Intent(this, PopupWXActivity.class);
                    intent3.putExtra(qj4.e, data.toString());
                    intent3.putExtra(qj4.c, data.toString());
                    startActivity(intent3);
                } else {
                    Intent intent4 = new Intent(this, CustomHalfWXActivity.class);
                    String query = data.getQuery();
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(this.c);
                    if (!TextUtils.isEmpty(this.c) && !TextUtils.isEmpty(query)) {
                        if (this.d.indexOf("?") > -1) {
                            sb3.append("&");
                            sb3.append(query);
                        } else {
                            sb3.append("?");
                            sb3.append(query);
                        }
                    }
                    intent4.putExtra("fullPage", 1);
                    intent4.putExtra("type", x4x.c);
                    intent4.putExtra(qj4.e, sb3.toString());
                    intent4.putExtra(qj4.c, sb3.toString());
                    startActivity(intent4);
                }
            } catch (Exception e) {
                e.getMessage();
                finish();
            }
        }
    }
}

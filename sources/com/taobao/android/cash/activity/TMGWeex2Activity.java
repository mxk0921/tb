package com.taobao.android.cash.activity;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.taobao.windvane.standardmodal.WVStandardEventCenter;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.ali.user.open.ucc.data.ApiConstants;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.b;
import com.taobao.android.weex_ability.page.WeexFragment;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.schedule.ViewProxy;
import com.taobao.tao.log.TLog;
import com.taobao.taobao.R;
import com.ut.mini.UTAnalytics;
import java.util.HashMap;
import tb.a8s;
import tb.acq;
import tb.npc;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class TMGWeex2Activity extends AppCompatActivity implements npc {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static String g;

    /* renamed from: a  reason: collision with root package name */
    public WeexFragment f6513a;
    public BroadcastReceiver b;
    public String c;
    public int d = 0;
    public int e = 880;
    public boolean f = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                TMGWeex2Activity.this.t3(new Intent("com.ali.user.cash.close.all"));
            }
        }
    }

    static {
        t2o.a(416284695);
        t2o.a(982515990);
    }

    public static /* synthetic */ Object ipc$super(TMGWeex2Activity tMGWeex2Activity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 143326307:
                super.onBackPressed();
                return null;
            case 514894248:
                super.attachBaseContext((Context) objArr[0]);
                return null;
            case 797441118:
                super.onPause();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/cash/activity/TMGWeex2Activity");
        }
    }

    public static void p3(Application application) {
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

    public final void l3(boolean z) {
        Intent intent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c63653bc", new Object[]{this, new Boolean(z)});
        } else if (!TextUtils.isEmpty(this.c)) {
            if (!z && (intent = getIntent()) != null) {
                intent.getLongExtra("routerTime", 0L);
                String stringExtra = intent.getStringExtra("nativeFrom");
                if (!TextUtils.isEmpty(stringExtra)) {
                    this.c += "&nativeFrom=" + stringExtra;
                }
                Log.e("TMGWeex2Activity", "weexUrl:" + this.c);
            }
            String str = this.c;
            WeexFragment B2 = WeexFragment.B2(str, str, null, null, null);
            this.f6513a = B2;
            B2.T2(this);
            FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
            if (z) {
                beginTransaction.replace(R.id.container, this.f6513a, "ali_mus_fragment_tag");
            } else {
                beginTransaction.add(R.id.container, this.f6513a, "ali_mus_fragment_tag");
            }
            beginTransaction.commitAllowingStateLoss();
        }
    }

    public final void m3() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98532c97", new Object[]{this});
            return;
        }
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.container);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int i2 = displayMetrics.widthPixels;
        int i3 = displayMetrics.heightPixels;
        if (this.d == 0 && (i = this.e) > 0) {
            int i4 = (int) (i * (i2 / 750.0f));
            if (i4 <= i3) {
                i3 = i4;
            }
            if (i3 > 0) {
                ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
                layoutParams.height = i3;
                linearLayout.setLayoutParams(layoutParams);
            }
        }
    }

    public void o3(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22872f3d", new Object[]{this, intent});
            return;
        }
        TLog.logd("cash4android", "TMGWeex2Activity", "onReceived: action = " + intent.getAction());
        if ("com.ali.user.cash.close.all".equals(intent.getAction()) || "com.ali.user.cash.close.all.weex".equals(intent.getAction())) {
            setResult(0);
            finish();
            overridePendingTransition(0, 0);
        } else if ("com.ali.user.cash.card.selected".equals(intent.getAction())) {
            Intent intent2 = new Intent();
            intent2.putExtra("data", intent.getStringExtra("data"));
            setResult(-1, intent2);
            finish();
            overridePendingTransition(0, 0);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88afc63", new Object[]{this});
            return;
        }
        super.onBackPressed();
        t3(new Intent("com.ali.user.cash.close.all"));
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        if (!this.f) {
            u3();
        }
        if (this.b != null) {
            LocalBroadcastManager.getInstance(getApplicationContext()).unregisterReceiver(this.b);
        }
    }

    @Override // tb.npc
    public void onDestroyed(MUSDKInstance mUSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32f7f995", new Object[]{this, mUSDKInstance});
        }
    }

    @Override // tb.npc
    public void onJSException(com.taobao.android.weex_framework.a aVar, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c41b6de", new Object[]{this, aVar, new Integer(i), str});
        } else {
            new StringBuilder("onJSException:").append(str);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        HashMap hashMap = new HashMap(16);
        hashMap.put("spm-url", "a2141.b17898281.0.0");
        UTAnalytics.getInstance().getDefaultTracker().updateNextPageProperties(hashMap);
        UTAnalytics.getInstance().getDefaultTracker().pageDisAppear(this);
    }

    @Override // tb.npc
    public void onPrepareSuccess(com.taobao.android.weex_framework.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27a2635b", new Object[]{this, aVar});
        }
    }

    @Override // tb.npc
    public void onRefreshFailed(com.taobao.android.weex_framework.a aVar, int i, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc0861e4", new Object[]{this, aVar, new Integer(i), str, new Boolean(z)});
        }
    }

    @Override // tb.npc
    public void onRefreshSuccess(com.taobao.android.weex_framework.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("963c382f", new Object[]{this, aVar});
        }
    }

    @Override // tb.npc
    public void onRenderFailed(com.taobao.android.weex_framework.a aVar, int i, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc0cbe2b", new Object[]{this, aVar, new Integer(i), str, new Boolean(z)});
            return;
        }
        n3();
        a8s.b("Page_OverseaNewCashier", 2101, "Page_OverseaNewCashier_oversea_weex_degrade", "weex_degrade_url=" + this.c, "onRenderFailed type:" + i + ",degrade_error=" + str + ",isFatal:" + z);
    }

    @Override // tb.npc
    public void onRenderSuccess(com.taobao.android.weex_framework.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b2aeb48", new Object[]{this, aVar});
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        HashMap hashMap = new HashMap(16);
        hashMap.put("spm-cnt", "a2141.b17898281.0.0");
        UTAnalytics.getInstance().getDefaultTracker().updatePageName(this, "Page_OverseaNewCashier");
        UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(this, hashMap);
        UTAnalytics.getInstance().getDefaultTracker().pageAppear(this, "Page_OverseaNewCashier");
    }

    public final void q3(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f845f3", new Object[]{this, intent});
        } else {
            r3(intent.getData());
        }
    }

    public final void r3(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("646ec7d1", new Object[]{this, uri});
        } else if (uri != null) {
            this.c = uri.toString();
            String queryParameter = uri.getQueryParameter("height");
            String queryParameter2 = uri.getQueryParameter("cashierHeight");
            String queryParameter3 = uri.getQueryParameter("fullPage");
            try {
                if (!TextUtils.isEmpty(queryParameter)) {
                    this.e = Integer.parseInt(queryParameter);
                }
                if (!TextUtils.isEmpty(queryParameter2)) {
                    this.e = Integer.parseInt(queryParameter2);
                }
                if (!TextUtils.isEmpty(queryParameter3)) {
                    this.d = Integer.parseInt(queryParameter3);
                }
                if ("false".equals(uri.getQueryParameter("dimEnabled"))) {
                    getWindow().setDimAmount(0.0f);
                }
            } catch (Exception e) {
                e.printStackTrace();
                new StringBuilder("parseInt error:").append(e.getMessage());
            }
        }
    }

    public void s3(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("945a23a5", new Object[]{this, uri});
            return;
        }
        if (uri != null) {
            r3(uri);
        }
        l3(true);
    }

    public boolean t3(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3b9ca1a6", new Object[]{this, intent})).booleanValue();
        }
        boolean sendBroadcast = LocalBroadcastManager.getInstance(getApplicationContext()).sendBroadcast(intent);
        TLog.logd("cash4android", "TMGWeex2Activity", intent.getAction() + "; sendResult=" + sendBroadcast);
        return sendBroadcast;
    }

    public final void u3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58b5a39a", new Object[]{this});
        } else {
            WVStandardEventCenter.postNotificationToJS("ALBBCashierCloseNotification", g);
        }
    }

    public final void n3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d31cccbe", new Object[]{this});
            return;
        }
        this.f = true;
        if (this.c.contains("&openDataPrefetch=true")) {
            this.c = this.c.replace("&openDataPrefetch=true", "");
        }
        if (this.c.contains("&nativeFrom=buy")) {
            this.c = this.c.replace("&nativeFrom=buy", "");
        }
        Intent intent = new Intent(this, CustomBrowserActivity.class);
        intent.putExtra("url", this.c);
        intent.putExtra("hasNavBar", this.c.contains("hasNavBar=1") ? 1 : 0);
        startActivity(intent);
        overridePendingTransition(0, 0);
        finish();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 28) {
            Window window = getWindow();
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.layoutInDisplayCutoutMode = 1;
            window.setAttributes(attributes);
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(ApiConstants.ApiField.USER_ACTION, (Object) "1");
        g = JSON.toJSONString(jSONObject);
        this.b = new BroadcastReceiver() { // from class: com.taobao.android.cash.activity.TMGWeex2Activity.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/cash/activity/TMGWeex2Activity$1");
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                } else {
                    TMGWeex2Activity.this.o3(intent);
                }
            }
        };
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.ali.user.cash.close.all");
        intentFilter.addAction("com.ali.user.cash.close.all.weex");
        intentFilter.addAction("com.ali.user.cash.card.selected");
        LocalBroadcastManager.getInstance(getApplicationContext()).registerReceiver(this.b, intentFilter);
        p3(getApplication());
        setContentView(R.layout.weexv2_activity);
        q3(getIntent());
        l3(false);
        ViewProxy.setOnClickListener(findViewById(R.id.fl_render), new a());
        m3();
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
    }
}

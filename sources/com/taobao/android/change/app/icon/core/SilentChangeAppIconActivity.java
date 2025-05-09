package com.taobao.android.change.app.icon.core;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.ali.user.mobile.utils.ImageUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.change.app.icon.core.SilentChangeAppIconActivity;
import com.taobao.android.change.app.icon.model.ChangeAppIconJSModel;
import com.taobao.taobao.R;
import com.taobao.tlog.adapter.AdapterForTLog;
import java.lang.ref.WeakReference;
import tb.acq;
import tb.hxv;
import tb.t2o;
import tb.t4v;
import tb.ubl;
import tb.umb;
import tb.vh3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class SilentChangeAppIconActivity extends AppCompatActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int HANDLER_MSG_CHANGE_APP_ICON_ON_RESULT = 1;
    public static final String KEY_CHANGE_APP_ICON_DATA = "key_change_app_icon_data";
    public static final String TAG = "SilentChangeAppIcon";

    /* renamed from: a  reason: collision with root package name */
    public b f6522a;
    public TextView b;
    public TextView c;
    public Runnable d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements umb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.umb
        public void onProgress(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5ec8f5b0", new Object[]{this, new Integer(i)});
                return;
            }
            AdapterForTLog.loge(SilentChangeAppIconActivity.TAG, "progress:" + i);
        }

        @Override // tb.umb
        public void onResult(Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f4d1d691", new Object[]{this, bundle});
                return;
            }
            boolean z = bundle.getBoolean("result");
            boolean z2 = bundle.getBoolean("moreIcons");
            boolean z3 = bundle.getBoolean("timeOut");
            AdapterForTLog.loge(SilentChangeAppIconActivity.TAG, "onResult result:" + z + " moreIcons:" + z2 + " timeOut:" + z3);
            StringBuilder sb = new StringBuilder("data:");
            sb.append(bundle.toString());
            String sb2 = sb.toString();
            StringBuilder sb3 = new StringBuilder("result:");
            sb3.append(z);
            t4v.a(t4v.PAGE_NAME, "silent_act", sb2, sb3.toString(), null);
            SilentChangeAppIconActivity.n3(SilentChangeAppIconActivity.this).setText(R.string.str_change_app_icon_success);
            long c = ubl.c(ubl.ORANGE_KEY_CHANGE_APP_ICON_ACT_DELAY_FINISH_TIME_MS, 1000L);
            AdapterForTLog.loge(SilentChangeAppIconActivity.TAG, "act_delay_finish_ms:" + c);
            SilentChangeAppIconActivity.o3(SilentChangeAppIconActivity.this, c, false);
        }
    }

    static {
        t2o.a(284164107);
    }

    public static /* synthetic */ Object ipc$super(SilentChangeAppIconActivity silentChangeAppIconActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
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
            case 1150324634:
                super.finish();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/change/app/icon/core/SilentChangeAppIconActivity");
        }
    }

    public static /* synthetic */ TextView n3(SilentChangeAppIconActivity silentChangeAppIconActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("2574fa4e", new Object[]{silentChangeAppIconActivity});
        }
        return silentChangeAppIconActivity.b;
    }

    public static /* synthetic */ void o3(SilentChangeAppIconActivity silentChangeAppIconActivity, long j, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68f79789", new Object[]{silentChangeAppIconActivity, new Long(j), new Boolean(z)});
        } else {
            silentChangeAppIconActivity.r3(j, z);
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

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88afc63", new Object[]{this});
            return;
        }
        t4v.b(t4v.PAGE_NAME, "silent_act", "back finish", null, null);
        super.onBackPressed();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        this.c.removeCallbacks(this.d);
        this.f6522a.removeCallbacksAndMessages(null);
    }

    public final /* synthetic */ void p3(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db81d3a5", new Object[]{this, view});
            return;
        }
        t4v.b(t4v.PAGE_NAME, "silent_act", "active finish", null, null);
        finish();
    }

    public final /* synthetic */ void q3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ddf8e", new Object[]{this});
        } else {
            this.c.setVisibility(0);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<SilentChangeAppIconActivity> f6524a;

        static {
            t2o.a(284164109);
        }

        public b(SilentChangeAppIconActivity silentChangeAppIconActivity) {
            super(Looper.getMainLooper());
            this.f6524a = new WeakReference<>(silentChangeAppIconActivity);
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            if (str.hashCode() == 673877017) {
                super.handleMessage((Message) objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/change/app/icon/core/SilentChangeAppIconActivity$InnerHandler");
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            boolean z = false;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                return;
            }
            super.handleMessage(message);
            SilentChangeAppIconActivity silentChangeAppIconActivity = this.f6524a.get();
            if (silentChangeAppIconActivity == null) {
                AdapterForTLog.loge(SilentChangeAppIconActivity.TAG, "handle act is null");
                t4v.c(t4v.PAGE_NAME, "silent_act", "handle act is null", "act is null", null);
            } else if (message.what == 1) {
                try {
                    z = ((Boolean) message.obj).booleanValue();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                AdapterForTLog.loge(SilentChangeAppIconActivity.TAG, "handle forceFinish:" + z);
                t4v.c(t4v.PAGE_NAME, "silent_act", "handle success", "forceFinish:" + z, null);
                silentChangeAppIconActivity.finish();
            }
        }
    }

    @Override // android.app.Activity
    public void finish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44908f9a", new Object[]{this});
            return;
        }
        overridePendingTransition(0, 0);
        AdapterForTLog.loge(TAG, "real finish getTaskId:" + getTaskId());
        super.finish();
    }

    public final void r3(long j, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("457b7825", new Object[]{this, new Long(j), new Boolean(z)});
            return;
        }
        AdapterForTLog.loge(TAG, "sendDelayFinish finishDelayMs:" + j + " force:" + z);
        Message message = new Message();
        message.what = 1;
        message.obj = Boolean.valueOf(z);
        this.f6522a.sendMessageDelayed(message, j);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        Intent intent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        overridePendingTransition(0, 0);
        super.onCreate(bundle);
        setContentView(R.layout.activity_change_app_icon);
        try {
            this.f6522a = new b(this);
            TextView textView = (TextView) findViewById(R.id.view_change_app_icon_tips);
            this.b = textView;
            textView.setText(R.string.str_change_app_icon_tips);
            this.c = (TextView) findViewById(R.id.view_change_app_icon_close);
            ImageUtil.updateImage((ImageView) findViewById(R.id.view_change_app_icon_image), "https://gw.alicdn.com/imgextra/i4/O1CN0129uWJi21ikvBb1Jo4_!!6000000007019-2-tps-270-218.png");
            this.c.setOnClickListener(new View.OnClickListener() { // from class: tb.rwp
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SilentChangeAppIconActivity.this.p3(view);
                }
            });
            AdapterForTLog.loge(TAG, "onCreate getTaskId:" + getTaskId());
            intent = getIntent();
        } catch (Exception e) {
            AdapterForTLog.loge(TAG, "onCreate changeAppIcon error:" + e.getMessage(), e);
            t4v.c(t4v.PAGE_NAME, "silent_act", "changeAppIcon error", e.getMessage(), null);
        }
        if (intent != null) {
            String stringExtra = intent.getStringExtra(KEY_CHANGE_APP_ICON_DATA);
            t4v.c(t4v.PAGE_NAME, "silent_act", "create", stringExtra, null);
            vh3.f().d((ChangeAppIconJSModel) hxv.g(stringExtra, ChangeAppIconJSModel.class), new a());
            long c = ubl.c(ubl.ORANGE_KEY_CHANGE_APP_ICON_ACT_DELAY_FORCE_FINISH_TIME_MS, 3000L);
            AdapterForTLog.loge(TAG, "act_delay_force_finish_ms:" + c);
            r3(c, true);
            Runnable swpVar = new Runnable() { // from class: tb.swp
                @Override // java.lang.Runnable
                public final void run() {
                    SilentChangeAppIconActivity.this.q3();
                }
            };
            this.d = swpVar;
            this.c.postDelayed(swpVar, c);
        }
    }
}

package com.taobao.android.pissarro.remote;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Toast;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSAppMonitor;
import com.taobao.appbundle.activity.BaseFeatureDownloadActivity;
import com.taobao.tao.log.TLog;
import com.taobao.taobao.R;
import tb.acq;
import tb.bdq;
import tb.ezn;
import tb.t2o;
import tb.x6u;
import tb.xbt;
import tb.xdn;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class RemoteLoadingActivity extends BaseFeatureDownloadActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public RemoteLoadingView j;
    public TaopaiLoadConfig k;
    public String l;
    public long o;
    public final Handler m = new Handler(Looper.myLooper());
    public int n = 0;
    public final Runnable p = new a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            RemoteLoadingActivity.u3(RemoteLoadingActivity.this);
            RemoteLoadingActivity.v3(RemoteLoadingActivity.this, "100", "");
            RemoteLoadingActivity.w3(RemoteLoadingActivity.this);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ long f9171a;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    RemoteLoadingActivity.x3(RemoteLoadingActivity.this);
                }
            }
        }

        public b(long j) {
            this.f9171a = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            TLog.loge("TaopaiCheck-Download", "prepareRace so load success");
            ezn.a("loadRace", "success", "", System.currentTimeMillis() - this.f9171a);
            RemoteLoadingActivity.y3(RemoteLoadingActivity.this).post(new a());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ long f9173a;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                String str;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                Throwable th = xdn.b;
                if (th != null) {
                    str = th.getMessage();
                } else {
                    str = "";
                }
                ezn.a("loadRace", "fail", str, System.currentTimeMillis() - c.this.f9173a);
                RemoteLoadingActivity.v3(RemoteLoadingActivity.this, "104", str);
                RemoteLoadingActivity.w3(RemoteLoadingActivity.this);
                TLog.loge("TaopaiCheck-Download", "prepareRace so load fail, " + str);
            }
        }

        public c(long j) {
            this.f9173a = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                RemoteLoadingActivity.y3(RemoteLoadingActivity.this).post(new a());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class d implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            RemoteLoadingActivity.v3(RemoteLoadingActivity.this, "103", "");
            RemoteLoadingActivity.this.finish();
        }
    }

    static {
        t2o.a(623902782);
    }

    public static /* synthetic */ Object ipc$super(RemoteLoadingActivity remoteLoadingActivity, String str, Object... objArr) {
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
            case 269871974:
                super.s3();
                return null;
            case 514894248:
                super.attachBaseContext((Context) objArr[0]);
                return null;
            case 797441118:
                super.onPause();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/pissarro/remote/RemoteLoadingActivity");
        }
    }

    public static /* synthetic */ void u3(RemoteLoadingActivity remoteLoadingActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0773295", new Object[]{remoteLoadingActivity});
        } else {
            remoteLoadingActivity.A3();
        }
    }

    public static /* synthetic */ void v3(RemoteLoadingActivity remoteLoadingActivity, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e262ccaa", new Object[]{remoteLoadingActivity, str, str2});
        } else {
            remoteLoadingActivity.G3(str, str2);
        }
    }

    public static /* synthetic */ void w3(RemoteLoadingActivity remoteLoadingActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bf62297", new Object[]{remoteLoadingActivity});
        } else {
            remoteLoadingActivity.D3();
        }
    }

    public static /* synthetic */ void x3(RemoteLoadingActivity remoteLoadingActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99b59a98", new Object[]{remoteLoadingActivity});
        } else {
            remoteLoadingActivity.z3();
        }
    }

    public static /* synthetic */ Handler y3(RemoteLoadingActivity remoteLoadingActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("880a7b8d", new Object[]{remoteLoadingActivity});
        }
        return remoteLoadingActivity.m;
    }

    public final void A3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee402e00", new Object[]{this});
        } else {
            this.m.removeCallbacks(this.p);
        }
    }

    public final void B3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0fb53b", new Object[]{this});
            return;
        }
        TaopaiLoadConfig taopaiLoadConfig = this.k;
        if (taopaiLoadConfig == null) {
            Toast.makeText(getApplicationContext(), getString(R.string.pissarro_function_load_fail), 1).show();
        } else if (taopaiLoadConfig.getFailIntent() != null) {
            startActivity(this.k.getFailIntent());
            if (this.k.isActivityAnimFromBottom()) {
                overridePendingTransition(R.anim.pissarro_fragment_in_bottom, R.anim.pissarro_fragment_out_bottom);
            }
        } else if (!this.k.isToastEnable()) {
        } else {
            if (!TextUtils.isEmpty(this.k.getFailToastText())) {
                Toast.makeText(getApplicationContext(), this.k.getFailToastText(), 1).show();
            } else {
                Toast.makeText(getApplicationContext(), getString(R.string.pissarro_taopai_load_fail), 1).show();
            }
        }
    }

    public final void C3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a959ac81", new Object[]{this});
            return;
        }
        try {
            System.loadLibrary("SECV");
            ezn.a("loadSECV", "success", "", 0L);
            TLog.loge("TaopaiCheck-Download", "secv so load success");
        } catch (Throwable th) {
            ezn.a("loadSECV", "fail", th.getMessage(), 0L);
            TLog.loge("TaopaiCheck-Download", "secv so load fail, " + th.getMessage());
        }
        if (xbt.f()) {
            TLog.loge("TaopaiCheck-Download", "race so load success");
            z3();
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        xdn.d(new b(currentTimeMillis), new c(currentTimeMillis));
    }

    public final void D3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1451b89", new Object[]{this});
            return;
        }
        A3();
        B3();
        finish();
    }

    public final void E3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c28ab603", new Object[]{this});
            return;
        }
        TaopaiLoadConfig taopaiLoadConfig = this.k;
        if (taopaiLoadConfig == null || TextUtils.isEmpty(taopaiLoadConfig.getBizScene())) {
            Intent intent = this.f;
            if (intent != null) {
                Uri data = intent.getData();
                if (data == null) {
                    Log.e("TaopaiCheck-Download", "bizScene uri = null");
                    return;
                }
                this.l = Uri.decode(data.getQueryParameter("biz_scene"));
            }
            TLog.logi("TaopaiCheck-Download", "bizScene = " + this.l);
            return;
        }
        this.l = this.k.getBizScene();
        Log.e("TaopaiCheck-Download", "bizScene from Config = " + this.l);
    }

    public final void F3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2eb993f", new Object[]{this});
        } else if (x6u.b() > 0) {
            this.m.removeCallbacks(this.p);
            this.m.postDelayed(this.p, x6u.b());
        }
    }

    public final void G3(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b377bb6", new Object[]{this, str, str2});
            return;
        }
        Intent intent = new Intent();
        intent.setAction("action.taopai.load.fail");
        intent.putExtra("error_code", str);
        intent.putExtra(MUSAppMonitor.ERROR_MSG, str2);
        LocalBroadcastManager.getInstance(getApplicationContext()).sendBroadcast(intent);
        ezn.c(this.l, this.n, str, str2, System.currentTimeMillis() - this.o);
    }

    public final void H3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b4e612d", new Object[]{this});
            return;
        }
        Intent intent = new Intent();
        intent.setAction("action.taopai.load.success");
        LocalBroadcastManager.getInstance(getApplicationContext()).sendBroadcast(intent);
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

    @Override // com.taobao.appbundle.activity.BaseFeatureDownloadActivity
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1065913a", new Object[]{this});
            return;
        }
        this.n = 1;
        this.j.updateProgress(1);
        F3();
        TLog.loge("TaopaiCheck-Download", " onRequestSuccess");
    }

    @Override // com.taobao.appbundle.activity.BaseFeatureDownloadActivity
    public void n3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72f213ed", new Object[]{this});
            return;
        }
        this.j.updateProgress(99);
        this.n = 13;
        TLog.logi("TaopaiCheck-Download", " download finish");
    }

    @Override // com.taobao.appbundle.activity.BaseFeatureDownloadActivity
    public void o3(bdq bdqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4d6fe01", new Object[]{this, bdqVar});
            return;
        }
        this.n = bdqVar.i();
        this.j.updateProgress(((int) (((float) bdqVar.a()) * 0.98f)) + 1);
        F3();
        TLog.loge("TaopaiCheck-Download", " onDownloading " + bdqVar.a() + " , " + bdqVar.j());
    }

    @Override // com.taobao.appbundle.activity.BaseFeatureDownloadActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        setResult(i2, intent);
        finish();
        TLog.logi("TaopaiCheck-Download", "onActivityResult, requestCode = " + i + ", resultCode = " + i2);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88afc63", new Object[]{this});
            return;
        }
        super.onBackPressed();
        G3("103", "");
    }

    @Override // com.taobao.appbundle.activity.BaseFeatureDownloadActivity, com.taobao.tao.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        this.k = (TaopaiLoadConfig) getIntent().getParcelableExtra("taopai_load_config");
        RemoteLoadingView remoteLoadingView = new RemoteLoadingView(this, this.k, new d());
        this.j = remoteLoadingView;
        setContentView(remoteLoadingView);
        E3();
        ezn.b(this, this.l);
        this.o = System.currentTimeMillis();
        if (this.k != null) {
            Log.e("TaopaiCheck-Download", "LoadConfig = " + this.k.toString());
        }
        TLog.loge("TaopaiCheck-Download", " onCreate");
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        A3();
    }

    @Override // com.taobao.appbundle.activity.BaseFeatureDownloadActivity, com.taobao.tao.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        A3();
    }

    @Override // com.taobao.appbundle.activity.BaseFeatureDownloadActivity, com.taobao.tao.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        F3();
    }

    @Override // com.taobao.appbundle.activity.BaseFeatureDownloadActivity
    public void p3(bdq bdqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a45bf9f", new Object[]{this, bdqVar});
            return;
        }
        this.n = bdqVar.i();
        G3("102", bdqVar.c() + "|" + bdqVar.b());
        D3();
        TLog.loge("TaopaiCheck-Download", " onInstallFailed , errorInfo = " + bdqVar.c() + "|" + bdqVar.b());
    }

    @Override // com.taobao.appbundle.activity.BaseFeatureDownloadActivity
    public void q3(bdq bdqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a82d88ec", new Object[]{this, bdqVar});
            return;
        }
        this.n = bdqVar.i();
        TLog.logi("TaopaiCheck-Download", " onInstalling");
    }

    @Override // com.taobao.appbundle.activity.BaseFeatureDownloadActivity
    public void r3(Exception exc) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("653f49e5", new Object[]{this, exc});
            return;
        }
        this.n = 6;
        if (exc != null) {
            str = exc.getMessage();
        } else {
            str = "null";
        }
        G3("101", str);
        D3();
        TLog.loge("TaopaiCheck-Download", " onRequestFailure " + Log.getStackTraceString(exc));
    }

    @Override // com.taobao.appbundle.activity.BaseFeatureDownloadActivity
    public void s3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1015eb66", new Object[]{this});
            return;
        }
        this.n = 5;
        C3();
    }

    @Override // com.taobao.appbundle.activity.BaseFeatureDownloadActivity
    public void t3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d17ed31", new Object[]{this});
            return;
        }
        this.n = 10;
        F3();
        TLog.logi("TaopaiCheck-Download", " onVerifying");
    }

    public final void z3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9835fe8", new Object[]{this});
            return;
        }
        A3();
        H3();
        TaopaiLoadConfig taopaiLoadConfig = this.k;
        if (taopaiLoadConfig != null) {
            if (taopaiLoadConfig.getSuccessIntent() != null) {
                startActivity(this.k.getSuccessIntent());
                if (this.k.isActivityAnimFromBottom()) {
                    overridePendingTransition(R.anim.pissarro_fragment_in_bottom, R.anim.pissarro_fragment_out_bottom);
                }
            }
            if (this.k.isToastEnable() && !TextUtils.isEmpty(this.k.getSuccessToastText())) {
                Toast.makeText(getApplicationContext(), this.k.getSuccessToastText(), 0).show();
            }
            finish();
        } else if (this.f != null) {
            super.s3();
        } else {
            finish();
        }
        ezn.e(this.l, System.currentTimeMillis() - this.o);
    }
}

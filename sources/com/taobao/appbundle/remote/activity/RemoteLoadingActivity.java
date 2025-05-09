package com.taobao.appbundle.remote.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.widget.Toast;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSAppMonitor;
import com.taobao.appbundle.activity.BaseFeatureDownloadActivity;
import com.taobao.appbundle.remote.LoadConfig;
import com.taobao.appbundle.remote.view.RemoteLoadingView;
import com.taobao.taobao.R;
import tb.acq;
import tb.bdq;
import tb.i49;
import tb.kyn;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class RemoteLoadingActivity extends BaseFeatureDownloadActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public RemoteLoadingView j;
    public final Handler k = new Handler(Looper.myLooper());
    public final Runnable l = new a();
    public LoadConfig m;

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
            RemoteLoadingActivity.v3(RemoteLoadingActivity.this);
        }
    }

    static {
        t2o.a(377487405);
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
            case -432656633:
                super.overridePendingTransition(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case 116272469:
                super.startActivity((Intent) objArr[0]);
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
            case 1150324634:
                super.finish();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/appbundle/remote/activity/RemoteLoadingActivity");
        }
    }

    public static /* synthetic */ void u3(RemoteLoadingActivity remoteLoadingActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ee0c177", new Object[]{remoteLoadingActivity});
        } else {
            remoteLoadingActivity.w3();
        }
    }

    public static /* synthetic */ void v3(RemoteLoadingActivity remoteLoadingActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4aa23d38", new Object[]{remoteLoadingActivity});
        } else {
            remoteLoadingActivity.y3();
        }
    }

    public final void A3(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b377bb6", new Object[]{this, str, str2});
            return;
        }
        Intent intent = new Intent();
        intent.setAction("action.load.fail");
        intent.putExtra("error_code", str);
        intent.putExtra(MUSAppMonitor.ERROR_MSG, str2);
        LocalBroadcastManager.getInstance(getApplicationContext()).sendBroadcast(intent);
    }

    public final void B3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b4e612d", new Object[]{this});
            return;
        }
        Intent intent = new Intent();
        intent.setAction("action.load.success");
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
        this.j.updateProgress(1);
        z3();
    }

    @Override // com.taobao.appbundle.activity.BaseFeatureDownloadActivity
    public void n3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72f213ed", new Object[]{this});
        } else {
            this.j.updateProgress(99);
        }
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
        StringBuilder sb = new StringBuilder("onActivityResult, requestCode = ");
        sb.append(i);
        sb.append(", resultCode = ");
        sb.append(i2);
    }

    @Override // com.taobao.appbundle.activity.BaseFeatureDownloadActivity, com.taobao.tao.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        this.m = (LoadConfig) getIntent().getParcelableExtra("load_config");
        RemoteLoadingView remoteLoadingView = new RemoteLoadingView(this, this.m);
        this.j = remoteLoadingView;
        setContentView(remoteLoadingView);
        System.currentTimeMillis();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        w3();
    }

    @Override // com.taobao.appbundle.activity.BaseFeatureDownloadActivity, com.taobao.tao.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        w3();
    }

    @Override // com.taobao.appbundle.activity.BaseFeatureDownloadActivity, com.taobao.tao.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        z3();
    }

    @Override // com.taobao.appbundle.activity.BaseFeatureDownloadActivity
    public void p3(bdq bdqVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a45bf9f", new Object[]{this, bdqVar});
            return;
        }
        bdqVar.i();
        y3();
        String str2 = this.b;
        Intent intent = this.f;
        if (intent == null) {
            str = "";
        } else {
            str = intent.getDataString();
        }
        kyn.b(str2, str, "install failed");
    }

    @Override // com.taobao.appbundle.activity.BaseFeatureDownloadActivity
    public void q3(bdq bdqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a82d88ec", new Object[]{this, bdqVar});
        } else {
            bdqVar.i();
        }
    }

    @Override // com.taobao.appbundle.activity.BaseFeatureDownloadActivity
    public void r3(Exception exc) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("653f49e5", new Object[]{this, exc});
            return;
        }
        if (exc != null) {
            str = exc.getMessage();
        } else {
            str = "null";
        }
        A3("101", str);
        y3();
        Log.e("RemoteDownload", "onRequestFailure");
    }

    @Override // com.taobao.appbundle.activity.BaseFeatureDownloadActivity
    public void s3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1015eb66", new Object[]{this});
            return;
        }
        w3();
        B3();
        LoadConfig loadConfig = this.m;
        if (loadConfig == null) {
            super.s3();
        } else if (loadConfig.getSuccessIntent() != null) {
            super.startActivity(this.m.getSuccessIntent());
            if (this.m.isActivityAnimFromBottom()) {
                super.overridePendingTransition(R.anim.fragment_in_bottom, R.anim.fragment_out_bottom);
            }
            super.finish();
        } else {
            if (this.m.isToastEnable() && !TextUtils.isEmpty(this.m.getSuccessToastText())) {
                Toast.makeText(getApplicationContext(), this.m.getSuccessToastText(), 0).show();
            }
            super.s3();
        }
    }

    @Override // com.taobao.appbundle.activity.BaseFeatureDownloadActivity
    public void t3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d17ed31", new Object[]{this});
        } else {
            z3();
        }
    }

    public final void w3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee402e00", new Object[]{this});
        } else {
            this.k.removeCallbacksAndMessages(null);
        }
    }

    public final void y3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1451b89", new Object[]{this});
            return;
        }
        w3();
        x3();
        finish();
    }

    public final void z3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2eb993f", new Object[]{this});
        } else if (i49.b() > 0) {
            this.k.removeCallbacksAndMessages(null);
            this.k.postDelayed(this.l, i49.b());
        }
    }

    @Override // com.taobao.appbundle.activity.BaseFeatureDownloadActivity
    public void o3(bdq bdqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4d6fe01", new Object[]{this, bdqVar});
            return;
        }
        bdqVar.i();
        this.j.updateProgress(((int) (((float) bdqVar.a()) * 0.98f)) + 1);
        z3();
        Log.e("RemoteDownload", "onDownloading " + bdqVar.a() + " , " + bdqVar.j());
    }

    public final void x3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d7c6a8c", new Object[]{this});
            return;
        }
        LoadConfig loadConfig = this.m;
        if (loadConfig == null) {
            return;
        }
        if (loadConfig.getFailIntent() != null) {
            startActivity(this.m.getFailIntent());
            if (this.m.isActivityAnimFromBottom()) {
                overridePendingTransition(R.anim.fragment_in_bottom, R.anim.fragment_out_bottom);
            }
        } else if (!this.m.isToastEnable()) {
        } else {
            if (TextUtils.isEmpty(this.m.getFailToastText())) {
                Toast.makeText(getApplicationContext(), this.m.getFailToastText(), 1).show();
            } else {
                Toast.makeText(getApplicationContext(), "模块加载失败，请稍后重试", 1).show();
            }
        }
    }
}

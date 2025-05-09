package com.taobao.android.industry.base;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.widget.ProgressBar;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.fastjson.JSON;
import com.alibaba.poplayer.PopLayer;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.request.params.MainRequestParams;
import com.taobao.android.industry.base.IdsMonitorUtil;
import com.taobao.android.nav.Nav;
import com.taobao.appbundle.activity.BaseFeatureDownloadActivity;
import com.taobao.tao.log.TLog;
import com.taobao.taobao.R;
import java.util.List;
import tb.acq;
import tb.bdq;
import tb.fh4;
import tb.ndv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class IdstryModuleLoadActivity extends BaseFeatureDownloadActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public long j;
    public ProgressBar l;
    public final Handler k = new Handler();
    public boolean m = false;
    public final BroadcastReceiver n = new BroadcastReceiver() { // from class: com.taobao.android.industry.base.IdstryModuleLoadActivity.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/industry/base/IdstryModuleLoadActivity$1");
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (intent.getAction().equals(PopLayer.ACTION_OUT_DISMISS) && IdstryModuleLoadActivity.class.getName().equals(intent.getExtras().getString("nativeUri"))) {
                LocalBroadcastManager.getInstance(IdstryModuleLoadActivity.this).unregisterReceiver(IdstryModuleLoadActivity.u3(IdstryModuleLoadActivity.this));
                IdstryModuleLoadActivity.this.finish();
            }
        }
    };

    public static /* synthetic */ Object ipc$super(IdstryModuleLoadActivity idstryModuleLoadActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1765592623:
                super.disableFinishAnimationOnce();
                return null;
            case -1512649357:
                super.onResume();
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 269871974:
                super.s3();
                return null;
            case 514894248:
                super.attachBaseContext((Context) objArr[0]);
                return null;
            case 1150324634:
                super.finish();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/industry/base/IdstryModuleLoadActivity");
        }
    }

    public static /* synthetic */ BroadcastReceiver u3(IdstryModuleLoadActivity idstryModuleLoadActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BroadcastReceiver) ipChange.ipc$dispatch("3a3b9edd", new Object[]{idstryModuleLoadActivity});
        }
        return idstryModuleLoadActivity.n;
    }

    public static /* synthetic */ ProgressBar v3(IdstryModuleLoadActivity idstryModuleLoadActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ProgressBar) ipChange.ipc$dispatch("e8da9b65", new Object[]{idstryModuleLoadActivity});
        }
        return idstryModuleLoadActivity.l;
    }

    public static /* synthetic */ void w3(IdstryModuleLoadActivity idstryModuleLoadActivity, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af1f2b0", new Object[]{idstryModuleLoadActivity, new Boolean(z)});
        } else {
            idstryModuleLoadActivity.y3(z);
        }
    }

    public static /* synthetic */ boolean x3(IdstryModuleLoadActivity idstryModuleLoadActivity, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c2325e77", new Object[]{idstryModuleLoadActivity, new Boolean(z)})).booleanValue();
        }
        idstryModuleLoadActivity.m = z;
        return z;
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
        TLog.loge("IdstryLoad", "onRequestSuccess", "" + System.currentTimeMillis());
        IdsMonitorUtil.c(MainRequestParams.INDUSTRY, IdsMonitorUtil.StageType.STAGE_REQUESTED.getValue(), (double) (System.currentTimeMillis() - this.j));
    }

    @Override // com.taobao.tao.BaseActivity, android.app.Activity
    public void finish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44908f9a", new Object[]{this});
            return;
        }
        super.disableFinishAnimationOnce();
        super.finish();
        overridePendingTransition(0, 0);
    }

    @Override // com.taobao.appbundle.activity.BaseFeatureDownloadActivity
    public void n3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72f213ed", new Object[]{this});
            return;
        }
        TLog.loge("IdstryLoad", "onDownloaded", "" + System.currentTimeMillis());
        IdsMonitorUtil.c(MainRequestParams.INDUSTRY, IdsMonitorUtil.StageType.STAGE_DOWNLOADED.getValue(), (double) (System.currentTimeMillis() - this.j));
    }

    @Override // com.taobao.appbundle.activity.BaseFeatureDownloadActivity
    public void o3(bdq bdqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4d6fe01", new Object[]{this, bdqVar});
        }
    }

    @Override // com.taobao.appbundle.activity.BaseFeatureDownloadActivity, com.taobao.tao.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        setContentView(R.layout.ids_load_activity);
        overridePendingTransition(0, 0);
        this.l = (ProgressBar) findViewById(R.id.mask_view_progressbar);
        if (fh4.a(fh4.NAMESPACE, "installAllDowngrade", false)) {
            y3(true);
            return;
        }
        int b = fh4.b(fh4.NAMESPACE, "installTimeoutMill", -1);
        if (b > 0) {
            this.k.postDelayed(new a(b), b);
        }
    }

    @Override // com.taobao.appbundle.activity.BaseFeatureDownloadActivity, com.taobao.tao.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        this.j = System.currentTimeMillis();
        TLog.loge("IdstryLoad", "onResume", "" + this.j);
        super.onResume();
    }

    @Override // com.taobao.appbundle.activity.BaseFeatureDownloadActivity
    public void q3(bdq bdqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a82d88ec", new Object[]{this, bdqVar});
        }
    }

    @Override // com.taobao.appbundle.activity.BaseFeatureDownloadActivity
    public void s3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1015eb66", new Object[]{this});
            return;
        }
        TLog.loge("IdstryLoad", "onSuccessfulLoad", "" + System.currentTimeMillis());
        IdsMonitorUtil.c(MainRequestParams.INDUSTRY, IdsMonitorUtil.StageType.STAGE_INSTALL.getValue(), (double) (System.currentTimeMillis() - this.j));
        IdsMonitorUtil.b(MainRequestParams.INDUSTRY, null);
        if (!this.m) {
            super.s3();
        }
        if (!isFinishing()) {
            finish();
        }
    }

    @Override // com.taobao.appbundle.activity.BaseFeatureDownloadActivity
    public void t3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d17ed31", new Object[]{this});
            return;
        }
        Log.e("IdstryLoad", "onVerifying:" + System.currentTimeMillis());
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f8104a;

        public a(int i) {
            this.f8104a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                if (!IdstryModuleLoadActivity.this.isFinishing() && IdstryModuleLoadActivity.v3(IdstryModuleLoadActivity.this) != null) {
                    TLog.loge("IdstryLoad", "timeOut", "installTimeoutMill:" + this.f8104a);
                    IdsMonitorUtil.a(MainRequestParams.INDUSTRY, null, "moduleInstallError", "onInstallTimeoutDowngrade: " + this.f8104a);
                    IdstryModuleLoadActivity.w3(IdstryModuleLoadActivity.this, fh4.a(fh4.NAMESPACE, "intallTimeoutFinish", false));
                    IdstryModuleLoadActivity.x3(IdstryModuleLoadActivity.this, true);
                }
            } catch (Exception e) {
                TLog.loge("IdstryLoad", "timeOut", e.toString() + ", installTimeoutMill:" + this.f8104a);
            }
        }
    }

    @Override // com.taobao.appbundle.activity.BaseFeatureDownloadActivity
    public void p3(bdq bdqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a45bf9f", new Object[]{this, bdqVar});
            return;
        }
        TLog.loge("IdstryLoad", "onInstallFailed", "" + System.currentTimeMillis());
        IdsMonitorUtil.a(MainRequestParams.INDUSTRY, null, "moduleInstallError", "onInstallFailed");
        y3(true);
    }

    @Override // com.taobao.appbundle.activity.BaseFeatureDownloadActivity
    public void r3(Exception exc) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("653f49e5", new Object[]{this, exc});
            return;
        }
        TLog.loge("IdstryLoad", "onRequestFailure", "" + System.currentTimeMillis());
        IdsMonitorUtil.a(MainRequestParams.INDUSTRY, null, "moduleInstallError", "onRequestFailure");
        y3(true);
    }

    public final void y3(boolean z) {
        String str;
        char c = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af596bf8", new Object[]{this, new Boolean(z)});
            return;
        }
        Uri data = this.f.getData();
        String c2 = fh4.c(fh4.NAMESPACE, "downgradeUrlMap", fh4.DEFAULT_GOWNGRADE_URL);
        TLog.loge("IdstryLoad", ndv.UMB_FEATURE_DOWN_GRADE, "config=" + c2);
        try {
            List parseArray = JSON.parseArray(c2, String.class);
            if (parseArray != null) {
                int i = 0;
                while (i < parseArray.size()) {
                    String str2 = (String) parseArray.get(i);
                    if (!TextUtils.isEmpty(str2) && str2.contains(">")) {
                        String[] split = str2.split(">");
                        if (split.length == 2) {
                            String str3 = split[c];
                            String str4 = split[1];
                            if (data.toString().contains(str3)) {
                                if (str4.contains("?") || TextUtils.isEmpty(data.getEncodedQuery())) {
                                    str = str4 + "&" + data.getEncodedQuery();
                                } else {
                                    str = str4 + "?" + data.getEncodedQuery();
                                }
                                if (str.startsWith("poplayer:")) {
                                    IntentFilter intentFilter = new IntentFilter();
                                    intentFilter.addAction(PopLayer.ACTION_OUT_DISMISS);
                                    LocalBroadcastManager.getInstance(this).registerReceiver(this.n, intentFilter);
                                    Nav.from(this).forResult(10001).toUri(str);
                                    IdsMonitorUtil.a(MainRequestParams.INDUSTRY, null, "moduleInstallDowngrade", "newUrl:" + str);
                                } else {
                                    Nav.from(this).toUri(str);
                                    IdsMonitorUtil.a(MainRequestParams.INDUSTRY, null, "moduleInstallDowngrade", "newUrl:" + str);
                                    if (z) {
                                        finish();
                                    }
                                }
                                TLog.loge("IdstryLoad", ndv.UMB_FEATURE_DOWN_GRADE, str);
                                return;
                            }
                            IdsMonitorUtil.a(MainRequestParams.INDUSTRY, null, "moduleInstallDowngrade", "no downgrade targe, origin:" + data);
                        }
                    }
                    i++;
                    c = 0;
                }
            }
        } catch (Exception e) {
            TLog.loge("IdstryLoad", ndv.UMB_FEATURE_DOWN_GRADE, "Exception=" + e.getMessage());
            IdsMonitorUtil.a(MainRequestParams.INDUSTRY, null, "moduleInstallDowngrade", "Exception:" + e.getMessage());
        }
    }
}

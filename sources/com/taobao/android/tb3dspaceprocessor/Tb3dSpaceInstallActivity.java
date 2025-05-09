package com.taobao.android.tb3dspaceprocessor;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.taobao.windvane.standardmodal.WVStandardEventCenter;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tb3dspaceprocessor.web.HybridWebView;
import com.taobao.appbundle.activity.BaseFeatureDownloadActivity;
import com.taobao.appbundle.remote.activity.RemoteLoadingActivity;
import com.taobao.taobao.R;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import org.json.JSONObject;
import tb.acq;
import tb.bdq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class Tb3dSpaceInstallActivity extends BaseFeatureDownloadActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public HybridWebView j;
    public Context k;
    public Handler l = new Handler(Looper.getMainLooper());
    public String m = "";

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
            } else if (Tb3dSpaceInstallActivity.u3(Tb3dSpaceInstallActivity.this) != null) {
                Toast.makeText(Tb3dSpaceInstallActivity.u3(Tb3dSpaceInstallActivity.this), "远程包安装失败，请退出后重试", 1).show();
                Tb3dSpaceInstallActivity.this.finish();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ long f9533a;

        public b(long j) {
            this.f9533a = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("progress", "" + this.f9533a);
            } catch (Throwable unused) {
            }
            WVStandardEventCenter.postNotificationToJS(Tb3dSpaceInstallActivity.v3(Tb3dSpaceInstallActivity.this), "T3dDownloadProgess", jSONObject.toString());
        }
    }

    public static /* synthetic */ Object ipc$super(Tb3dSpaceInstallActivity tb3dSpaceInstallActivity, String str, Object... objArr) {
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
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tb3dspaceprocessor/Tb3dSpaceInstallActivity");
        }
    }

    public static /* synthetic */ Context u3(Tb3dSpaceInstallActivity tb3dSpaceInstallActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("a518b32a", new Object[]{tb3dSpaceInstallActivity});
        }
        return tb3dSpaceInstallActivity.k;
    }

    public static /* synthetic */ HybridWebView v3(Tb3dSpaceInstallActivity tb3dSpaceInstallActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HybridWebView) ipChange.ipc$dispatch("be4fbc13", new Object[]{tb3dSpaceInstallActivity});
        }
        return tb3dSpaceInstallActivity.j;
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
        }
    }

    @Override // com.taobao.appbundle.activity.BaseFeatureDownloadActivity
    public void n3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72f213ed", new Object[]{this});
        }
    }

    @Override // com.taobao.appbundle.activity.BaseFeatureDownloadActivity
    public void o3(bdq bdqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4d6fe01", new Object[]{this, bdqVar});
            return;
        }
        long a2 = bdqVar.a();
        Handler handler = this.l;
        if (handler != null) {
            handler.post(new b(a2));
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
        Uri data = this.f.getData();
        if (data == null) {
            w3();
            return;
        }
        String queryParameter = data.getQueryParameter("CustomLoadPage");
        if (TextUtils.isEmpty(queryParameter)) {
            queryParameter = data.getQueryParameter("appUrl");
            try {
                queryParameter = Uri.parse(queryParameter).getQueryParameter("CustomLoadPage");
            } catch (Throwable unused) {
            }
        }
        if (queryParameter != null) {
            try {
                this.m = URLDecoder.decode(queryParameter, "UTF-8");
            } catch (UnsupportedEncodingException unused2) {
            }
        }
        if (TextUtils.isEmpty(this.m)) {
            w3();
            return;
        }
        this.k = getActivity();
        setContentView(R.layout.activity_tb3d_space_install);
        this.j = new HybridWebView(this.k);
        ((ViewGroup) getActivity().findViewById(R.id.loading_root_container)).addView(this.j, new FrameLayout.LayoutParams(-1, -1));
        x3(this.m);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        this.l = null;
        HybridWebView hybridWebView = this.j;
        if (hybridWebView != null) {
            hybridWebView.onDestroy();
        }
        this.k = null;
        this.j = null;
    }

    @Override // com.taobao.appbundle.activity.BaseFeatureDownloadActivity, com.taobao.tao.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        HybridWebView hybridWebView = this.j;
        if (hybridWebView != null) {
            hybridWebView.onPause();
        }
    }

    @Override // com.taobao.appbundle.activity.BaseFeatureDownloadActivity, com.taobao.tao.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        HybridWebView hybridWebView = this.j;
        if (hybridWebView != null) {
            hybridWebView.onResume();
        }
    }

    @Override // com.taobao.appbundle.activity.BaseFeatureDownloadActivity
    public void p3(bdq bdqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a45bf9f", new Object[]{this, bdqVar});
            return;
        }
        Handler handler = this.l;
        if (handler != null) {
            handler.post(new a());
        }
    }

    @Override // com.taobao.appbundle.activity.BaseFeatureDownloadActivity
    public void q3(bdq bdqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a82d88ec", new Object[]{this, bdqVar});
        }
    }

    @Override // com.taobao.appbundle.activity.BaseFeatureDownloadActivity
    public void r3(Exception exc) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("653f49e5", new Object[]{this, exc});
        }
    }

    @Override // com.taobao.appbundle.activity.BaseFeatureDownloadActivity
    public void s3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1015eb66", new Object[]{this});
        } else {
            super.s3();
        }
    }

    @Override // com.taobao.appbundle.activity.BaseFeatureDownloadActivity
    public void t3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d17ed31", new Object[]{this});
        }
    }

    public final void w3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d602f23f", new Object[]{this});
            return;
        }
        Intent intent = getActivity().getIntent();
        Activity activity = getActivity();
        intent.setClassName(activity.getPackageName(), RemoteLoadingActivity.class.getName());
        intent.addFlags(268435456);
        activity.startActivity(intent);
        finish();
    }

    public void x3(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75501eb3", new Object[]{this, str});
            return;
        }
        HybridWebView hybridWebView = this.j;
        if (hybridWebView == null) {
            return;
        }
        if (TextUtils.equals(hybridWebView.getUrl(), str)) {
            this.j.refresh();
        } else {
            this.j.loadUrl(str);
        }
    }
}

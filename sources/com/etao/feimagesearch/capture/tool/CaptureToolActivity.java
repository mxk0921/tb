package com.etao.feimagesearch.capture.tool;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.FEISBaseActivity;
import com.taobao.android.searchbaseframe.uikit.screentype.ScreenType;
import com.taobao.search.sf.util.tlog.TLogTracker;
import com.ut.mini.UTAnalytics;
import java.util.HashMap;
import tb.acq;
import tb.caa;
import tb.ckf;
import tb.lg4;
import tb.t2o;
import tb.y70;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class CaptureToolActivity extends FEISBaseActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public CaptureToolController b;

    static {
        t2o.a(730857598);
    }

    public static /* synthetic */ Object ipc$super(CaptureToolActivity captureToolActivity, String str, Object... objArr) {
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
            case 188604040:
                super.onStop();
                return null;
            case 514894248:
                super.attachBaseContext((Context) objArr[0]);
                return null;
            case 797441118:
                super.onPause();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/capture/tool/CaptureToolActivity");
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

    @Override // com.taobao.tao.BaseActivity
    public boolean isFitsWindowsOnRoot() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("86dc3ce3", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.tao.BaseActivity
    public boolean isTranslucent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab05a0da", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // com.etao.feimagesearch.FEISBaseActivity, com.etao.feimagesearch.ISBaseActivity, com.taobao.baseactivity.CustomBaseActivity, com.taobao.tao.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        TLogTracker.s("PltCameraTool");
        String dataString = getIntent().getDataString();
        UTAnalytics.getInstance().getDefaultTracker().skipPage(this);
        super.onCreate(bundle);
        HashMap hashMap = new HashMap();
        String decode = Uri.decode(dataString);
        ckf.f(decode, "decode(pageUrl)");
        hashMap.put("url", decode);
        TLogTracker.l("Default", hashMap);
        if (lg4.N()) {
            ScreenType.b(this);
        }
        CaptureToolController captureToolController = new CaptureToolController(this);
        this.b = captureToolController;
        captureToolController.d();
        if (caa.q()) {
            y70.f(this);
        }
    }

    @Override // com.etao.feimagesearch.FEISBaseActivity, com.etao.feimagesearch.ISBaseActivity, com.taobao.baseactivity.CustomBaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        CaptureToolController captureToolController = this.b;
        if (captureToolController != null) {
            captureToolController.e();
        } else {
            ckf.y("captureController");
            throw null;
        }
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, com.taobao.tao.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        CaptureToolController captureToolController = this.b;
        if (captureToolController != null) {
            captureToolController.f();
        } else {
            ckf.y("captureController");
            throw null;
        }
    }

    @Override // com.etao.feimagesearch.FEISBaseActivity, com.taobao.baseactivity.CustomBaseActivity, com.taobao.tao.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        TLogTracker.s("PltCameraTool");
        super.onResume();
        CaptureToolController captureToolController = this.b;
        if (captureToolController != null) {
            captureToolController.g();
        } else {
            ckf.y("captureController");
            throw null;
        }
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        super.onStop();
        CaptureToolController captureToolController = this.b;
        if (captureToolController != null) {
            captureToolController.h();
        } else {
            ckf.y("captureController");
            throw null;
        }
    }
}

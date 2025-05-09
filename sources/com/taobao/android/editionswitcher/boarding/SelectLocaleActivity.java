package com.taobao.android.editionswitcher.boarding;

import android.content.Context;
import android.os.Bundle;
import android.view.Window;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.baseactivity.CustomBaseActivity;
import com.taobao.taobao.R;
import tb.acq;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class SelectLocaleActivity extends CustomBaseActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(456130648);
    }

    public static /* synthetic */ Object ipc$super(SelectLocaleActivity selectLocaleActivity, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        } else if (hashCode == 514894248) {
            super.attachBaseContext((Context) objArr[0]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/editionswitcher/boarding/SelectLocaleActivity");
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

    @Override // com.taobao.baseactivity.CustomBaseActivity, com.taobao.tao.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        setContentView(R.layout.ovs_layout_locale_activity);
        getSupportActionBar().hide();
        setTranslucentStatus();
        setUTPageName("Page_LocalBoarding");
        getSupportFragmentManager().beginTransaction().replace(R.id.container, new SelectLocaleFragment(), (String) null).commit();
    }

    @Override // android.view.Window.Callback
    public void onPointerCaptureChanged(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed9f2f21", new Object[]{this, new Boolean(z)});
        } else {
            super.onPointerCaptureChanged(z);
        }
    }

    public void setTranslucentStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5071d070", new Object[]{this});
            return;
        }
        Window window = getWindow();
        window.addFlags(Integer.MIN_VALUE);
        window.clearFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
        window.setStatusBarColor(0);
        getWindow().getDecorView().setSystemUiVisibility(1280);
    }
}

package com.taobao.android.lightvane.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MenuItem;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.lightvane.fragment.LVWebViewFragment;
import com.taobao.taobao.R;
import tb.acq;
import tb.keg;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class LVWebViewActivity extends AppCompatActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(507510787);
    }

    public static /* synthetic */ Object ipc$super(LVWebViewActivity lVWebViewActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -884160602:
                return new Boolean(super.onKeyDown(((Number) objArr[0]).intValue(), (KeyEvent) objArr[1]));
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 514894248:
                super.attachBaseContext((Context) objArr[0]);
                return null;
            case 1893326613:
                return new Boolean(super.onOptionsItemSelected((MenuItem) objArr[0]));
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/lightvane/activity/LVWebViewActivity");
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

    public Fragment l3(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Fragment) ipChange.ipc$dispatch("ae84493c", new Object[]{this, intent});
        }
        return new LVWebViewFragment();
    }

    public final void m3(ActionBar actionBar, Toolbar toolbar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("950b0e69", new Object[]{this, actionBar, toolbar});
            return;
        }
        if (actionBar != null) {
            actionBar.hide();
        }
        toolbar.setVisibility(8);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        setContentView(R.layout.lv_webview_acitivty);
        Intent intent = getIntent();
        if (intent == null) {
            keg.d(6, "LVWebViewActivity", "intent is null!!");
            finish();
            return;
        }
        String stringExtra = intent.getStringExtra("url");
        if (TextUtils.isEmpty(stringExtra)) {
            keg.d(6, "LVWebViewActivity", "url is null!!");
            finish();
            return;
        }
        m3(getSupportActionBar(), (Toolbar) findViewById(R.id.lv_toolbar));
        Fragment l3 = l3(intent);
        Bundle arguments = l3.getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        arguments.putString("url", stringExtra);
        l3.setArguments(arguments);
        getSupportFragmentManager().beginTransaction().replace(R.id.web_container, l3).commitAllowingStateLoss();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb4cc7a6", new Object[]{this, new Integer(i), keyEvent})).booleanValue();
        }
        if (i == 4) {
            Fragment findFragmentById = getSupportFragmentManager().findFragmentById(R.id.web_container);
            if ((findFragmentById instanceof LVWebViewFragment) && ((LVWebViewFragment) findFragmentById).onBackPressed()) {
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("70d9df15", new Object[]{this, menuItem})).booleanValue();
        }
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        return false;
    }
}

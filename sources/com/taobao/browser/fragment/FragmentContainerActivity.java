package com.taobao.browser.fragment;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.browser.utils.BrowserUtil;
import com.taobao.tao.BaseActivity;
import com.taobao.taobao.R;
import tb.acq;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class FragmentContainerActivity extends BaseActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(619708494);
    }

    public static /* synthetic */ Object ipc$super(FragmentContainerActivity fragmentContainerActivity, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        } else if (hashCode == 514894248) {
            super.attachBaseContext((Context) objArr[0]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/browser/fragment/FragmentContainerActivity");
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

    @Override // com.taobao.tao.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.fragementcontainer);
        overridePendingTransition(R.anim.abc_fade_in, R.anim.abc_fade_out);
        getSupportActionBar().hide();
        Bundle extras = getIntent().getExtras();
        BrowserUtil.b("FragmentContainerActivity", BrowserUtil.b, BrowserUtil.c, null, null);
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        String stringExtra = getIntent().getStringExtra("fragmentClassName");
        if (stringExtra != null && stringExtra.length() > 0) {
            try {
                Fragment fragment = (Fragment) getClassLoader().loadClass(stringExtra).getConstructor(new Class[0]).newInstance(new Object[0]);
                fragment.setArguments(extras);
                beginTransaction.add(R.id.browser_fragment_layout, fragment);
                beginTransaction.commit();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

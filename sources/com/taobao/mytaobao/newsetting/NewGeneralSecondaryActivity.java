package com.taobao.mytaobao.newsetting;

import android.content.Context;
import android.os.Bundle;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.ir.runtime.ApplicationInvoker;
import com.taobao.android.nav.Nav;
import com.taobao.tao.BaseActivity;
import com.taobao.tao.TaobaoApplication;
import com.taobao.taobao.R;
import tb.acq;
import tb.s32;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class NewGeneralSecondaryActivity extends BaseActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(745537787);
    }

    public NewGeneralSecondaryActivity() {
        ApplicationInvoker.getInstance("com.taobao.mytaobao").invoke("com.taobao.tao.MytaobaoApplication", TaobaoApplication.sApplication);
    }

    public static /* synthetic */ Object ipc$super(NewGeneralSecondaryActivity newGeneralSecondaryActivity, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        } else if (hashCode == 514894248) {
            super.attachBaseContext((Context) objArr[0]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/mytaobao/newsetting/NewGeneralSecondaryActivity");
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
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        setContentView(R.layout.mytaobao_font_setting_activity);
        s32.c().i("NewGeneralSecondaryActivity");
        try {
            Nav.from(this).toUri("http://m.taobao.com/go/newmytaobaocommonsettings2");
        } catch (Exception e) {
            e.printStackTrace();
        }
        finish();
    }
}

package com.taobao.taolivehome;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.taolive.room.launch.TaoLiveLaunchInitializer;
import tb.acq;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class MixLiveRouterActivity extends FragmentActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PARAM_TARGET_URL = "targetUrl";

    static {
        t2o.a(776994820);
    }

    public static /* synthetic */ Object ipc$super(MixLiveRouterActivity mixLiveRouterActivity, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        } else if (hashCode == 514894248) {
            super.attachBaseContext((Context) objArr[0]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/taolivehome/MixLiveRouterActivity");
        }
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        super.attachBaseContext(context);
        acq.B(context);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        TaoLiveLaunchInitializer.init();
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent != null) {
            String stringExtra = intent.getStringExtra("targetUrl");
            if (!TextUtils.isEmpty(stringExtra)) {
                Nav.from(this).toUri(stringExtra);
                finish();
            }
        }
    }
}

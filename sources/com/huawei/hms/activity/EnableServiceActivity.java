package com.huawei.hms.activity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.huawei.hms.utils.ResourceLoaderUtil;
import tb.acq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class EnableServiceActivity extends Activity {
    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        acq.B(context);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        if (ResourceLoaderUtil.getmContext() == null) {
            ResourceLoaderUtil.setmContext(getApplicationContext());
        }
        setContentView(ResourceLoaderUtil.getLayoutId("activity_endisable_service"));
    }
}

package com.huawei.hms.support.api.push;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.huawei.hms.push.t;
import com.taobao.taobao.R;
import tb.acq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class TransActivity extends Activity {
    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        acq.B(context);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.hwpush_trans_activity);
        getWindow().addFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
        t.a(this, getIntent());
        finish();
    }
}

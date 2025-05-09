package com.taobao.android.cash.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import com.taobao.taobao.R;
import tb.acq;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class PopupWXActivity extends CustomHalfWXActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(416284694);
    }

    public static /* synthetic */ Object ipc$super(PopupWXActivity popupWXActivity, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        } else if (hashCode == 514894248) {
            super.attachBaseContext((Context) objArr[0]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/cash/activity/PopupWXActivity");
        }
    }

    @Override // com.taobao.android.cash.activity.CustomHalfWXActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        super.attachBaseContext(context);
        acq.B(context);
    }

    @Override // com.taobao.android.cash.activity.CustomHalfWXActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        x3();
    }

    @Override // com.taobao.android.cash.activity.CustomHalfWXActivity
    public void r3(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22872f3d", new Object[]{this, intent});
            return;
        }
        String str = CustomHalfWXActivity.i;
        TLog.logd(str, "onReceived: action = " + intent.getAction() + "activity:" + this.d);
        if ("com.ali.user.cash.close.all".equals(intent.getAction()) || "com.ali.user.cash.close.all.weex".equals(intent.getAction())) {
            this.d.setResult(0);
            finish();
            overridePendingTransition(R.anim.push_up_in, R.anim.push_down_out);
        }
    }

    public final void x3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("589c910b", new Object[]{this});
            return;
        }
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        window.setAttributes(attributes);
    }
}

package com.ali.user.mobile.login.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.ali.user.mobile.base.ui.BaseActivity;
import com.ali.user.mobile.model.CommonCallback;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.acq;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class AliUserContainer extends BaseActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_TYPE = "actionType";
    public static final String TAG = "login.container";
    public static String TYPE_FINGER = "finger";
    public static CommonCallback callback;
    public FragmentManager mFragmentManager;

    static {
        t2o.a(70254747);
    }

    public static /* synthetic */ Object ipc$super(AliUserContainer aliUserContainer, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        } else if (hashCode == 514894248) {
            super.attachBaseContext((Context) objArr[0]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/ali/user/mobile/login/ui/AliUserContainer");
        }
    }

    private void openFragmentByConfig(Intent intent) {
        String stringExtra;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a946817", new Object[]{this, intent});
            return;
        }
        if (intent != null) {
            try {
                stringExtra = intent.getStringExtra("actionType");
            } catch (Throwable th) {
                th.printStackTrace();
                return;
            }
        } else {
            stringExtra = null;
        }
        if (TYPE_FINGER.equals(stringExtra)) {
            FingerPrintDialog fingerPrintDialog = new FingerPrintDialog(callback);
            fingerPrintDialog.setArguments(intent.getExtras());
            fingerPrintDialog.show(this.mFragmentManager, "finger");
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

    @Override // com.ali.user.mobile.base.ui.BaseActivity
    public void initViews() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffd024c5", new Object[]{this});
        } else {
            openFragmentByConfig(getIntent());
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88afc63", new Object[]{this});
            return;
        }
        try {
            if (!isFinishing()) {
                finish();
                overridePendingTransition(0, 0);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.ali.user.mobile.base.ui.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        this.activityIsTranslucent = true;
        this.mFragmentManager = getSupportFragmentManager();
        super.onCreate(bundle);
        setContentView(R.layout.aliuser_activity_frame_content);
    }
}

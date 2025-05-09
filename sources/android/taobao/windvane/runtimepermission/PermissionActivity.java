package android.taobao.windvane.runtimepermission;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.FrameLayout;
import androidx.core.app.ActivityCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.runtimepermission.api.TBRunTimePermission;
import tb.acq;
import tb.hzl;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class PermissionActivity extends Activity implements ActivityCompat.OnRequestPermissionsResultCallback {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "PermissionActivity";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class a implements DialogInterface.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String[] f1820a;

        public a(String[] strArr) {
            this.f1820a = strArr;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                return;
            }
            ActivityCompat.requestPermissions(PermissionActivity.this, this.f1820a, 0);
            dialogInterface.dismiss();
        }
    }

    static {
        t2o.a(989856377);
    }

    public static /* synthetic */ Object ipc$super(PermissionActivity permissionActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.onResume();
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 514894248:
                super.attachBaseContext((Context) objArr[0]);
                return null;
            case 1257714799:
                super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
                return null;
            case 1281559479:
                super.onRestart();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in android/taobao/windvane/runtimepermission/PermissionActivity");
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

    public final boolean b(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("27900ad3", new Object[]{this, strArr})).booleanValue();
        }
        if (strArr != null) {
            for (String str : strArr) {
                if (ActivityCompat.shouldShowRequestPermissionRationale(this, str)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        super.onActivityResult(i, i2, intent);
        if (i == 123) {
            hzl.c(i, i2, intent);
        }
        finish();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb4cc7a6", new Object[]{this, new Integer(i), keyEvent})).booleanValue();
        }
        return true;
    }

    @Override // android.app.Activity, androidx.core.app.ActivityCompat.OnRequestPermissionsResultCallback
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23e85742", new Object[]{this, new Integer(i), strArr, iArr});
            return;
        }
        if (i == 0) {
            hzl.d(i, strArr, iArr);
        }
        finish();
    }

    @Override // android.app.Activity
    public void onRestart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c630bb7", new Object[]{this});
        } else {
            super.onRestart();
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
        } else {
            super.onResume();
        }
    }

    public final void a(String[] strArr, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d1aac1d", new Object[]{this, strArr, str, str2});
        } else if (b(strArr) && (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2))) {
            new AlertDialog.Builder(this).setPositiveButton("我知道了", new a(strArr)).setTitle(str2).setMessage(str).setCancelable(false).show();
        } else if (strArr != null) {
            ActivityCompat.requestPermissions(this, strArr, 0);
        }
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ed33fa1f", new Object[]{this, new Integer(i), keyEvent})).booleanValue();
        }
        return true;
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        getWindow().addFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
        super.onCreate(bundle);
        FrameLayout frameLayout = new FrameLayout(this);
        try {
            frameLayout.setAlpha(0.0f);
        } catch (Throwable unused) {
        }
        setContentView(frameLayout);
        String[] stringArrayExtra = getIntent().getStringArrayExtra("permissions");
        String stringExtra = getIntent().getStringExtra(TBRunTimePermission.EXPLAIN_PARAM_NAME);
        String stringExtra2 = getIntent().getStringExtra("title");
        if (stringArrayExtra == null || stringArrayExtra.length != 1 || !stringArrayExtra[0].equals("android.permission.SYSTEM_ALERT_WINDOW")) {
            a(stringArrayExtra, stringExtra, stringExtra2);
            return;
        }
        startActivityForResult(new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse("package:" + getPackageName())), 123);
    }
}

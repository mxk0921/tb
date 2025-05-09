package com.taobao.taolive.sdk.permisson;

import android.app.Activity;
import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;
import android.view.KeyEvent;
import android.view.View;
import androidx.core.app.ActivityCompat;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.Iterator;
import tb.acq;
import tb.i0m;
import tb.n2s;
import tb.t2o;
import tb.v2s;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class PermissionActivity extends Activity {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Dialog b;

    /* renamed from: a  reason: collision with root package name */
    public final BroadcastReceiver f13289a = new BroadcastReceiver() { // from class: com.taobao.taolive.sdk.permisson.PermissionActivity.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/sdk/permisson/PermissionActivity$1");
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (intent != null && "com.taobao.taolive.sdk.permission.stop".equals(intent.getAction())) {
                v2s.o().A().a("TBLiveXXXX", "ACTION STOP PERMISSON CHECK");
                if (PermissionActivity.a(PermissionActivity.this) != null) {
                    try {
                        if (!PermissionActivity.this.isFinishing() && !PermissionActivity.this.isDestroyed()) {
                            PermissionActivity.a(PermissionActivity.this).dismiss();
                        }
                    } catch (Throwable unused) {
                    }
                    i0m.g(false);
                }
                PermissionActivity.this.finish();
            }
        }
    };
    public boolean c = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            i0m.g(false);
            PermissionActivity.this.finish();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ n2s f13292a;

        public b(n2s n2sVar) {
            this.f13292a = n2sVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            try {
                PermissionActivity.this.startActivityForResult(new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse("package:" + PermissionActivity.this.getPackageName())), 10000);
            } catch (ActivityNotFoundException unused) {
            }
            try {
                if (!PermissionActivity.this.isFinishing() && !PermissionActivity.this.isDestroyed()) {
                    this.f13292a.dismiss();
                }
            } catch (Throwable unused2) {
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class c implements DialogInterface.OnCancelListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f4ed3926", new Object[]{this, dialogInterface});
                return;
            }
            i0m.g(false);
            PermissionActivity.this.finish();
        }
    }

    static {
        t2o.a(806356393);
    }

    public static /* synthetic */ Dialog a(PermissionActivity permissionActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Dialog) ipChange.ipc$dispatch("2c99bb43", new Object[]{permissionActivity});
        }
        return permissionActivity.b;
    }

    public static /* synthetic */ Object ipc$super(PermissionActivity permissionActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1504501726:
                super.onDestroy();
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
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/sdk/permisson/PermissionActivity");
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

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("613e85b2", new Object[]{this});
            return;
        }
        n2s n2sVar = new n2s(this, R.style.TLLive_Permission_Dialog);
        n2sVar.e("开启直播悬浮窗");
        n2sVar.b("开启直播悬浮窗可以边看直播边浏览其他内容，需要您在应用设置中开启悬浮窗权限，是否前往开启？");
        n2sVar.d("暂不", new a());
        n2sVar.c("开启", new b(n2sVar));
        this.b = n2sVar;
        n2sVar.setOnCancelListener(new c());
        if (!isFinishing()) {
            this.b.show();
        }
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        boolean canDrawOverlays;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        super.onActivityResult(i, i2, intent);
        if (i == 10000) {
            canDrawOverlays = Settings.canDrawOverlays(this);
            i0m.g(canDrawOverlays);
        }
        finish();
    }

    @Override // android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        if (!this.c) {
            try {
                LocalBroadcastManager.getInstance(this).unregisterReceiver(this.f13289a);
            } catch (Exception unused) {
            }
        }
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb4cc7a6", new Object[]{this, new Integer(i), keyEvent})).booleanValue();
        }
        return true;
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
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23e85742", new Object[]{this, new Integer(i), strArr, iArr});
            return;
        }
        if (i == 33) {
            i0m.h(i, strArr, iArr);
        }
        finish();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        ArrayList<String> stringArrayListExtra = getIntent().getStringArrayListExtra("permissions");
        if (stringArrayListExtra != null) {
            if (!stringArrayListExtra.isEmpty()) {
                Iterator<String> it = stringArrayListExtra.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
            this.c = true;
            ActivityCompat.requestPermissions(this, (String[]) stringArrayListExtra.toArray(new String[stringArrayListExtra.size()]), 33);
            return;
        }
        try {
            LocalBroadcastManager.getInstance(this).registerReceiver(this.f13289a, new IntentFilter("com.taobao.taolive.sdk.permission.stop"));
        } catch (Exception unused) {
        }
        b();
    }
}

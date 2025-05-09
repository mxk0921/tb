package com.taobao.trtc.impl;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.projection.MediaProjectionManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.trtc.impl.PermissionActivity;
import com.taobao.trtc.utils.TrtcLog;
import java.lang.ref.WeakReference;
import tb.acq;
import tb.pg1;
import tb.t2o;
import tb.tmu;
import tb.wmc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class PermissionActivity extends Activity {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PERMISSION_TYPE_MEDIA_PEOJECTION = "PERMISSION_TYPE_MEDIA_PEOJECTION";
    public static final String PERMISSION_TYPE_OVERLAY = "PERMISSION_TYPE_OVERLAY";
    public static final String PERMISSION_TYPE_OVERLAY_WITH_DIALOG = "PERMISSION_TYPE_OVERLAY_WITH_DIALOG";
    public static b d;
    public static b e;

    /* renamed from: a  reason: collision with root package name */
    public AlertDialog f13909a;
    public boolean b = false;
    public final BroadcastReceiver c = new BroadcastReceiver() { // from class: com.taobao.trtc.impl.PermissionActivity.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/trtc/impl/PermissionActivity$1");
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                return;
            }
            TrtcLog.j("PermissionActivity", "onReceive >>> " + intent.getAction());
            PermissionActivity.this.finish();
        }
    };

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements DialogInterface.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                return;
            }
            PermissionActivity.c(PermissionActivity.this).dismiss();
            TrtcLog.j("PermissionActivity", "Cancel for overlay permission");
            PermissionActivity permissionActivity = PermissionActivity.this;
            PermissionActivity.d(permissionActivity, PermissionActivity.e(permissionActivity), null);
            PermissionActivity.this.finish();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface b {
        void a(boolean z, Intent intent);
    }

    static {
        t2o.a(395313481);
    }

    public static /* synthetic */ AlertDialog c(PermissionActivity permissionActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AlertDialog) ipChange.ipc$dispatch("9bf6ec7", new Object[]{permissionActivity});
        }
        return permissionActivity.f13909a;
    }

    public static /* synthetic */ void d(PermissionActivity permissionActivity, boolean z, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aed76e26", new Object[]{permissionActivity, new Boolean(z), intent});
        } else {
            permissionActivity.i(z, intent);
        }
    }

    public static boolean e(Context context) {
        boolean canDrawOverlays;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b6659091", new Object[]{context})).booleanValue();
        }
        if (Build.VERSION.SDK_INT < 23) {
            return true;
        }
        canDrawOverlays = Settings.canDrawOverlays(context);
        return canDrawOverlays;
    }

    public static void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[0]);
            return;
        }
        TrtcLog.j("PermissionActivity", pg1.ATOM_EXT_clear);
        d = null;
        e = null;
    }

    public static /* synthetic */ Object ipc$super(PermissionActivity permissionActivity, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        } else if (hashCode == 514894248) {
            super.attachBaseContext((Context) objArr[0]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/trtc/impl/PermissionActivity");
        }
    }

    public static void l(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23c02dad", new Object[]{bVar});
            return;
        }
        synchronized (PermissionActivity.class) {
            d = bVar;
        }
    }

    public static void m(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c22c4354", new Object[]{bVar});
            return;
        }
        synchronized (PermissionActivity.class) {
            e = bVar;
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

    public final /* synthetic */ void g(DialogInterface dialogInterface, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14a97f79", new Object[]{this, dialogInterface, new Integer(i)});
            return;
        }
        n();
        this.f13909a.dismiss();
    }

    public final /* synthetic */ void h(DialogInterface dialogInterface) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59bb2969", new Object[]{this, dialogInterface});
            return;
        }
        i(e(this), null);
        finish();
    }

    public final void i(boolean z, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4271e098", new Object[]{this, new Boolean(z), intent});
            return;
        }
        synchronized (PermissionActivity.class) {
            try {
                b bVar = d;
                if (bVar != null) {
                    bVar.a(z, intent);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void j(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e5a9a1", new Object[]{this, new Boolean(z)});
        } else if (z) {
            AlertDialog create = new AlertDialog.Builder(this).setMessage("请开启淘宝悬浮窗权限").setPositiveButton("开启", new DialogInterface.OnClickListener() { // from class: tb.iyl
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    PermissionActivity.this.g(dialogInterface, i);
                }
            }).setNegativeButton(wmc.CANCEL, new a()).create();
            this.f13909a = create;
            create.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: tb.jyl
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    PermissionActivity.this.h(dialogInterface);
                }
            });
            if (!isFinishing()) {
                this.f13909a.show();
            }
        } else {
            n();
        }
    }

    public final void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32286eba", new Object[]{this});
            return;
        }
        MediaProjectionManager mediaProjectionManager = (MediaProjectionManager) getApplication().getSystemService("media_projection");
        if (mediaProjectionManager != null) {
            startActivityForResult(mediaProjectionManager.createScreenCaptureIntent(), 124);
        }
    }

    public final void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d111e6b3", new Object[]{this});
            return;
        }
        try {
            Uri parse = Uri.parse("package:" + getPackageName());
            TrtcLog.j("PermissionActivity", "uri: " + parse);
            startActivityForResult(new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", parse), 123);
        } catch (ActivityNotFoundException unused) {
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        TrtcLog.j("PermissionActivity", "onDestroy");
        if (this.b) {
            LocalBroadcastManager.getInstance(this).unregisterReceiver(this.c);
            this.b = false;
        }
        if (getIntent().getBooleanExtra(PERMISSION_TYPE_OVERLAY, false)) {
            finishActivity(123);
        } else if (getIntent().getBooleanExtra(PERMISSION_TYPE_MEDIA_PEOJECTION, false)) {
            finishActivity(124);
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        if (i == 123) {
            tmu.f("PermissionActivity", "onActivityResult, permission for overlay: " + e(this));
            i(e(this), intent);
        } else if (i == 124) {
            tmu.f("PermissionActivity", "onActivityResult, permission for mediaprojection, result: " + i2);
            synchronized (PermissionActivity.class) {
                try {
                    b bVar = e;
                    if (bVar != null) {
                        if (i2 != -1) {
                            z = false;
                        }
                        bVar.a(z, intent);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
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
        new WeakReference(this);
        super.onCreate(bundle);
        try {
            LocalBroadcastManager.getInstance(this).registerReceiver(this.c, new IntentFilter("com.taobao.trtc.impl.PermissionActivity.stop"));
            this.b = true;
            TrtcLog.j("PermissionActivity", "registerReceiver done");
        } catch (Exception unused) {
        }
        if (getIntent().getBooleanExtra(PERMISSION_TYPE_OVERLAY, false)) {
            TrtcLog.j("PermissionActivity", "type: PERMISSION_TYPE_OVERLAY");
            if (!e(this)) {
                j(getIntent().getBooleanExtra(PERMISSION_TYPE_OVERLAY_WITH_DIALOG, true));
            } else {
                i(true, null);
            }
        } else if (getIntent().getBooleanExtra(PERMISSION_TYPE_MEDIA_PEOJECTION, false)) {
            TrtcLog.j("PermissionActivity", "type: PERMISSION_TYPE_MEDIA_PEOJECTION");
            k();
        }
    }
}

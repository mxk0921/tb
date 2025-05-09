package com.taobao.android.fluid.framework.permission;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.provider.Settings;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import tb.ir9;
import tb.ono;
import tb.t2o;
import tb.xau;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class PermissionManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_OVERLAY_PERMISSION_DENY_TIMESTAMP = "overlay_permission_deny_timestamp";
    public a b;

    /* renamed from: a  reason: collision with root package name */
    public boolean f7885a = false;
    public final BroadcastReceiver c = new BroadcastReceiver() { // from class: com.taobao.android.fluid.framework.permission.PermissionManager.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/framework/permission/PermissionManager$1");
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (intent != null && PermissionActivity.ACTION_PERMISSION_RESULT.equals(intent.getAction()) && PermissionManager.a(PermissionManager.this) != null) {
                if (PermissionManager.c(PermissionManager.this, context)) {
                    xau.h();
                    ir9.d("ShortVideo_Permission", "checkPermission granted");
                    PermissionManager.a(PermissionManager.this).onGranted();
                } else {
                    PermissionManager.d(PermissionManager.this, context);
                    xau.g();
                    ir9.d("ShortVideo_Permission", "checkPermission denied");
                    PermissionManager.a(PermissionManager.this).onDenied();
                }
                PermissionManager.b(PermissionManager.this, null);
            }
        }
    };

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface a {
        void onDenied();

        void onGranted();

        void onStartRequest();
    }

    static {
        t2o.a(468714616);
    }

    public static /* synthetic */ a a(PermissionManager permissionManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("f15f1bcc", new Object[]{permissionManager});
        }
        return permissionManager.b;
    }

    public static /* synthetic */ a b(PermissionManager permissionManager, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("873ef21", new Object[]{permissionManager, aVar});
        }
        permissionManager.b = aVar;
        return aVar;
    }

    public static /* synthetic */ boolean c(PermissionManager permissionManager, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("be469a8a", new Object[]{permissionManager, context})).booleanValue();
        }
        return permissionManager.j(context);
    }

    public static /* synthetic */ void d(PermissionManager permissionManager, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edfdce87", new Object[]{permissionManager, context});
        } else {
            permissionManager.l(context);
        }
    }

    public static boolean i(int i, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9ec63827", new Object[]{new Integer(i), new Long(j)})).booleanValue();
        }
        if (System.currentTimeMillis() - j > i * 60000) {
            return true;
        }
        return false;
    }

    public void f(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbf4b767", new Object[]{this, context});
        } else if (this.f7885a) {
            LocalBroadcastManager.getInstance(context).unregisterReceiver(this.c);
            this.f7885a = false;
        }
    }

    public final int h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("eca26820", new Object[]{this})).intValue();
        }
        try {
            return Integer.parseInt(FluidSDK.getRemoteConfigAdapter().getOrangeStringConfig("checkPermissionInterval", "1440"));
        } catch (Exception unused) {
            return 1440;
        }
    }

    public final boolean j(Context context) {
        boolean canDrawOverlays;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("102df5d1", new Object[]{this, context})).booleanValue();
        }
        if (Build.VERSION.SDK_INT < 24) {
            return true;
        }
        canDrawOverlays = Settings.canDrawOverlays(context);
        if (canDrawOverlays) {
            return true;
        }
        return false;
    }

    public final void k(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3bfa525", new Object[]{this, context});
            return;
        }
        Intent intent = new Intent(context, PermissionActivity.class);
        intent.addFlags(268435456);
        context.startActivity(intent);
    }

    public final void l(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42acfaf9", new Object[]{this, context});
        } else {
            ono.i(context, KEY_OVERLAY_PERMISSION_DENY_TIMESTAMP, System.currentTimeMillis());
        }
    }

    public void e(Context context, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5b090ef", new Object[]{this, context, aVar});
            return;
        }
        this.b = aVar;
        if (!g() || j(context)) {
            ir9.d("ShortVideo_Permission", "checkPermission already granted");
            if (aVar != null) {
                aVar.onGranted();
                return;
            }
            return;
        }
        ir9.d("ShortVideo_Permission", "preCheckPermission ");
        long c = ono.c(context, KEY_OVERLAY_PERMISSION_DENY_TIMESTAMP);
        if (c <= 0 || i(h(), c)) {
            ir9.d("ShortVideo_Permission", "checkPermission startRequest:" + c);
            k(context);
            if (!this.f7885a) {
                LocalBroadcastManager.getInstance(context).registerReceiver(this.c, new IntentFilter(PermissionActivity.ACTION_PERMISSION_RESULT));
                this.f7885a = true;
            }
            if (aVar != null) {
                aVar.onStartRequest();
                return;
            }
            return;
        }
        ir9.d("ShortVideo_Permission", "checkPermission deny time is between 0 & thresh hold :" + c);
        if (aVar != null) {
            aVar.onDenied();
        }
    }

    public final boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bf57dcb5", new Object[]{this})).booleanValue();
        }
        try {
            return Boolean.valueOf(FluidSDK.getRemoteConfigAdapter().getOrangeStringConfig("enablePermissionCheck", "true")).booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }
}

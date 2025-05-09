package com.taobao.android.detail2.core.framework.floatwindow.permission;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.provider.Settings;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.byj;
import tb.t2o;
import tb.txj;
import tb.xmo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class FloatPermissionManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_PERMISSION_RESULT = "newdetail_float_permission_result";

    /* renamed from: a  reason: collision with root package name */
    public a f7141a;
    public boolean b;
    public final BroadcastReceiver c = new BroadcastReceiver() { // from class: com.taobao.android.detail2.core.framework.floatwindow.permission.FloatPermissionManager.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail2/core/framework/floatwindow/permission/FloatPermissionManager$1");
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (intent != null && FloatPermissionManager.ACTION_PERMISSION_RESULT.equals(intent.getAction()) && FloatPermissionManager.a(FloatPermissionManager.this) != null) {
                if (FloatPermissionManager.b(FloatPermissionManager.this, context)) {
                    FloatPermissionManager.a(FloatPermissionManager.this).b(true);
                    return;
                }
                FloatPermissionManager.a(FloatPermissionManager.this).a(true);
                xmo.w(context, System.currentTimeMillis());
            }
        }
    };

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface a {
        void a(boolean z);

        void b(boolean z);

        void onStartRequest();
    }

    static {
        t2o.a(352321847);
    }

    public static /* synthetic */ a a(FloatPermissionManager floatPermissionManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("9706cdc", new Object[]{floatPermissionManager});
        }
        return floatPermissionManager.f7141a;
    }

    public static /* synthetic */ boolean b(FloatPermissionManager floatPermissionManager, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("81668882", new Object[]{floatPermissionManager, context})).booleanValue();
        }
        return floatPermissionManager.e(context);
    }

    public final boolean c(Context context) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("33239017", new Object[]{this, context})).booleanValue();
        }
        long e = xmo.e(context);
        txj.a("PermissionManager", "lastDenyTime: " + e);
        if (e <= 0) {
            return true;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long D = byj.D();
        StringBuilder sb = new StringBuilder("canRequestPermission lastDenyTime:");
        sb.append(e);
        sb.append(",nowTime:");
        sb.append(currentTimeMillis);
        sb.append(",permissionInterval:");
        sb.append(D);
        sb.append(",result:");
        int i = ((currentTimeMillis - e) > D ? 1 : ((currentTimeMillis - e) == D ? 0 : -1));
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        sb.append(z);
        txj.a("PermissionManager", sb.toString());
        if (i >= 0) {
            return true;
        }
        return false;
    }

    public void d(Context context, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b8e2623", new Object[]{this, context, aVar});
        } else if (aVar != null && context != null) {
            this.f7141a = aVar;
            if (e(context)) {
                aVar.b(false);
            } else if (c(context)) {
                g(context);
                f(context);
                aVar.onStartRequest();
            } else {
                aVar.a(false);
            }
        }
    }

    public final boolean e(Context context) {
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

    public final void f(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab9528af", new Object[]{this, context});
        } else if (!this.b) {
            LocalBroadcastManager.getInstance(context).registerReceiver(this.c, new IntentFilter(ACTION_PERMISSION_RESULT));
            this.b = true;
        }
    }

    public final void g(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3bfa525", new Object[]{this, context});
            return;
        }
        Intent intent = new Intent(context, PermissionActivity.class);
        intent.addFlags(268435456);
        context.startActivity(intent);
    }
}

package androidx.core.content;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import androidx.core.content.UnusedAppRestrictionsBackportServiceConnection;
import androidx.core.os.UserManagerCompat;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.Executors;
import tb.bvg;
import tb.y6o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class PackageManagerCompat {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_PERMISSION_REVOCATION_SETTINGS = "android.intent.action.AUTO_REVOKE_PERMISSIONS";
    public static final String LOG_TAG = "PackageManagerCompat";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api30Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api30Impl() {
        }

        public static boolean areUnusedAppRestrictionsEnabled(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("9d075ae2", new Object[]{context})).booleanValue();
            }
            return !context.getPackageManager().isAutoRevokeWhitelisted();
        }
    }

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public @interface UnusedAppRestrictionsStatus {
    }

    private PackageManagerCompat() {
    }

    public static boolean areUnusedAppRestrictionsAvailable(PackageManager packageManager) {
        boolean z;
        boolean z2;
        boolean z3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2fe2aef0", new Object[]{packageManager})).booleanValue();
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            z = true;
        } else {
            z = false;
        }
        if (i < 23 || i >= 30) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (getPermissionRevocationVerifierApp(packageManager) != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z || (z2 && z3)) {
            return true;
        }
        return false;
    }

    public static bvg<Integer> getUnusedAppRestrictionsStatus(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bvg) ipChange.ipc$dispatch("9a8224e7", new Object[]{context});
        }
        y6o<Integer> t = y6o.t();
        if (!UserManagerCompat.isUserUnlocked(context)) {
            t.p(0);
            Log.e(LOG_TAG, "User is in locked direct boot mode");
            return t;
        } else if (!areUnusedAppRestrictionsAvailable(context.getPackageManager())) {
            t.p(1);
            return t;
        } else {
            int i = context.getApplicationInfo().targetSdkVersion;
            if (i < 30) {
                t.p(0);
                Log.e(LOG_TAG, "Target SDK version below API 30");
                return t;
            }
            int i2 = Build.VERSION.SDK_INT;
            int i3 = 2;
            int i4 = 4;
            if (i2 >= 31) {
                if (Api30Impl.areUnusedAppRestrictionsEnabled(context)) {
                    if (i >= 31) {
                        i4 = 5;
                    }
                    t.p(Integer.valueOf(i4));
                } else {
                    t.p(2);
                }
                return t;
            } else if (i2 == 30) {
                if (Api30Impl.areUnusedAppRestrictionsEnabled(context)) {
                    i3 = 4;
                }
                t.p(Integer.valueOf(i3));
                return t;
            } else {
                final UnusedAppRestrictionsBackportServiceConnection unusedAppRestrictionsBackportServiceConnection = new UnusedAppRestrictionsBackportServiceConnection(context);
                t.a(new Runnable() { // from class: tb.mkl
                    @Override // java.lang.Runnable
                    public final void run() {
                        UnusedAppRestrictionsBackportServiceConnection.this.disconnectFromService();
                    }
                }, Executors.newSingleThreadExecutor());
                unusedAppRestrictionsBackportServiceConnection.connectAndFetchResult(t);
                return t;
            }
        }
    }

    public static String getPermissionRevocationVerifierApp(PackageManager packageManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3b0e8031", new Object[]{packageManager});
        }
        String str = null;
        for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(new Intent(ACTION_PERMISSION_REVOCATION_SETTINGS).setData(Uri.fromParts("package", "com.example", null)), 0)) {
            String str2 = resolveInfo.activityInfo.packageName;
            if (packageManager.checkPermission("android.permission.PACKAGE_VERIFICATION_AGENT", str2) == 0) {
                if (str != null) {
                    return str;
                }
                str = str2;
            }
        }
        return str;
    }
}

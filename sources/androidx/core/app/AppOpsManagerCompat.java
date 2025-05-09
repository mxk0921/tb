package androidx.core.app;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Binder;
import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class AppOpsManagerCompat {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int MODE_ALLOWED = 0;
    public static final int MODE_DEFAULT = 3;
    public static final int MODE_ERRORED = 2;
    public static final int MODE_IGNORED = 1;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api23Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api23Impl() {
        }

        public static <T> T getSystemService(Context context, Class<T> cls) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (T) ipChange.ipc$dispatch("983f36a6", new Object[]{context, cls});
            }
            return (T) context.getSystemService(cls);
        }

        public static int noteProxyOp(AppOpsManager appOpsManager, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("f470cdb6", new Object[]{appOpsManager, str, str2})).intValue();
            }
            return appOpsManager.noteProxyOp(str, str2);
        }

        public static int noteProxyOpNoThrow(AppOpsManager appOpsManager, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("b097542b", new Object[]{appOpsManager, str, str2})).intValue();
            }
            return appOpsManager.noteProxyOpNoThrow(str, str2);
        }

        public static String permissionToOp(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("3c7663a4", new Object[]{str});
            }
            return AppOpsManager.permissionToOp(str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api29Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api29Impl() {
        }

        public static int checkOpNoThrow(AppOpsManager appOpsManager, String str, int i, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("b63de166", new Object[]{appOpsManager, str, new Integer(i), str2})).intValue();
            }
            if (appOpsManager == null) {
                return 1;
            }
            return appOpsManager.checkOpNoThrow(str, i, str2);
        }

        public static String getOpPackageName(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("15163fb9", new Object[]{context});
            }
            return context.getOpPackageName();
        }

        public static AppOpsManager getSystemService(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (AppOpsManager) ipChange.ipc$dispatch("c5803214", new Object[]{context});
            }
            return (AppOpsManager) context.getSystemService(AppOpsManager.class);
        }
    }

    private AppOpsManagerCompat() {
    }

    public static int checkOrNoteProxyOp(Context context, int i, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("25dbe41b", new Object[]{context, new Integer(i), str, str2})).intValue();
        }
        if (Build.VERSION.SDK_INT < 29) {
            return noteProxyOpNoThrow(context, str, str2);
        }
        AppOpsManager systemService = Api29Impl.getSystemService(context);
        int checkOpNoThrow = Api29Impl.checkOpNoThrow(systemService, str, Binder.getCallingUid(), str2);
        if (checkOpNoThrow != 0) {
            return checkOpNoThrow;
        }
        return Api29Impl.checkOpNoThrow(systemService, str, i, Api29Impl.getOpPackageName(context));
    }

    public static int noteOp(Context context, String str, int i, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9d2a3028", new Object[]{context, str, new Integer(i), str2})).intValue();
        }
        return ((AppOpsManager) context.getSystemService("appops")).noteOp(str, i, str2);
    }

    public static int noteOpNoThrow(Context context, String str, int i, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d62913a7", new Object[]{context, str, new Integer(i), str2})).intValue();
        }
        return ((AppOpsManager) context.getSystemService("appops")).noteOpNoThrow(str, i, str2);
    }

    public static int noteProxyOp(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c4b8ecab", new Object[]{context, str, str2})).intValue();
        }
        if (Build.VERSION.SDK_INT >= 23) {
            return Api23Impl.noteProxyOp((AppOpsManager) Api23Impl.getSystemService(context, AppOpsManager.class), str, str2);
        }
        return 1;
    }

    public static int noteProxyOpNoThrow(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a6488c60", new Object[]{context, str, str2})).intValue();
        }
        if (Build.VERSION.SDK_INT >= 23) {
            return Api23Impl.noteProxyOpNoThrow((AppOpsManager) Api23Impl.getSystemService(context, AppOpsManager.class), str, str2);
        }
        return 1;
    }

    public static String permissionToOp(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3c7663a4", new Object[]{str});
        }
        if (Build.VERSION.SDK_INT >= 23) {
            return Api23Impl.permissionToOp(str);
        }
        return null;
    }
}

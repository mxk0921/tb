package androidx.core.content;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import androidx.core.util.Preconditions;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.ArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class IntentCompat {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_CREATE_REMINDER = "android.intent.action.CREATE_REMINDER";
    public static final String CATEGORY_LEANBACK_LAUNCHER = "android.intent.category.LEANBACK_LAUNCHER";
    public static final String EXTRA_HTML_TEXT = "android.intent.extra.HTML_TEXT";
    public static final String EXTRA_START_PLAYBACK = "android.intent.extra.START_PLAYBACK";
    public static final String EXTRA_TIME = "android.intent.extra.TIME";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api33Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api33Impl() {
        }

        public static <T> T[] getParcelableArrayExtra(Intent intent, String str, Class<T> cls) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (T[]) ((Object[]) ipChange.ipc$dispatch("3cae60a0", new Object[]{intent, str, cls}));
            }
            return (T[]) intent.getParcelableArrayExtra(str, cls);
        }

        public static <T> ArrayList<T> getParcelableArrayListExtra(Intent intent, String str, Class<? extends T> cls) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ArrayList) ipChange.ipc$dispatch("86ce9517", new Object[]{intent, str, cls});
            }
            return intent.getParcelableArrayListExtra(str, cls);
        }

        public static <T> T getParcelableExtra(Intent intent, String str, Class<T> cls) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (T) ipChange.ipc$dispatch("77cba2da", new Object[]{intent, str, cls});
            }
            return (T) intent.getParcelableExtra(str, cls);
        }

        public static <T extends Serializable> T getSerializableExtra(Intent intent, String str, Class<T> cls) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (T) ((Serializable) ipChange.ipc$dispatch("910b9876", new Object[]{intent, str, cls}));
            }
            return (T) intent.getSerializableExtra(str, cls);
        }
    }

    private IntentCompat() {
    }

    public static Intent createManageUnusedAppRestrictionsIntent(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("ee4adb75", new Object[]{context, str});
        }
        if (PackageManagerCompat.areUnusedAppRestrictionsAvailable(context.getPackageManager())) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 31) {
                return new Intent("android.settings.APPLICATION_DETAILS_SETTINGS").setData(Uri.fromParts("package", str, null));
            }
            Intent data = new Intent(PackageManagerCompat.ACTION_PERMISSION_REVOCATION_SETTINGS).setData(Uri.fromParts("package", str, null));
            return i >= 30 ? data : data.setPackage((String) Preconditions.checkNotNull(PackageManagerCompat.getPermissionRevocationVerifierApp(context.getPackageManager())));
        }
        throw new UnsupportedOperationException("Unused App Restriction features are not available on this device");
    }

    public static Parcelable[] getParcelableArrayExtra(Intent intent, String str, Class<? extends Parcelable> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Parcelable[]) ipChange.ipc$dispatch("90833e55", new Object[]{intent, str, cls});
        }
        if (Build.VERSION.SDK_INT >= 34) {
            return (Parcelable[]) Api33Impl.getParcelableArrayExtra(intent, str, cls);
        }
        return intent.getParcelableArrayExtra(str);
    }

    public static <T> ArrayList<T> getParcelableArrayListExtra(Intent intent, String str, Class<? extends T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("86ce9517", new Object[]{intent, str, cls});
        }
        if (Build.VERSION.SDK_INT >= 34) {
            return Api33Impl.getParcelableArrayListExtra(intent, str, cls);
        }
        return intent.getParcelableArrayListExtra(str);
    }

    public static <T> T getParcelableExtra(Intent intent, String str, Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("77cba2da", new Object[]{intent, str, cls});
        }
        if (Build.VERSION.SDK_INT >= 34) {
            return (T) Api33Impl.getParcelableExtra(intent, str, cls);
        }
        T t = (T) intent.getParcelableExtra(str);
        if (cls.isInstance(t)) {
            return t;
        }
        return null;
    }

    public static <T extends Serializable> T getSerializableExtra(Intent intent, String str, Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ((Serializable) ipChange.ipc$dispatch("910b9876", new Object[]{intent, str, cls}));
        }
        if (Build.VERSION.SDK_INT >= 34) {
            return (T) Api33Impl.getSerializableExtra(intent, str, cls);
        }
        T t = (T) intent.getSerializableExtra(str);
        if (cls.isInstance(t)) {
            return t;
        }
        return null;
    }

    public static Intent makeMainSelectorActivity(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("34941703", new Object[]{str, str2});
        }
        return Intent.makeMainSelectorActivity(str, str2);
    }
}

package androidx.core.os;

import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.SparseArray;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.ArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class BundleCompat {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api33Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api33Impl() {
        }

        public static <T> T getParcelable(Bundle bundle, String str, Class<T> cls) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (T) ipChange.ipc$dispatch("7578ced3", new Object[]{bundle, str, cls});
            }
            return (T) bundle.getParcelable(str, cls);
        }

        public static <T> T[] getParcelableArray(Bundle bundle, String str, Class<T> cls) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (T[]) ((Object[]) ipChange.ipc$dispatch("53205887", new Object[]{bundle, str, cls}));
            }
            return (T[]) bundle.getParcelableArray(str, cls);
        }

        public static <T> ArrayList<T> getParcelableArrayList(Bundle bundle, String str, Class<? extends T> cls) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ArrayList) ipChange.ipc$dispatch("f9b2e4be", new Object[]{bundle, str, cls});
            }
            return bundle.getParcelableArrayList(str, cls);
        }

        public static <T extends Serializable> T getSerializable(Bundle bundle, String str, Class<T> cls) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (T) ((Serializable) ipChange.ipc$dispatch("dfe82cef", new Object[]{bundle, str, cls}));
            }
            return (T) bundle.getSerializable(str, cls);
        }

        public static <T> SparseArray<T> getSparseParcelableArray(Bundle bundle, String str, Class<? extends T> cls) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SparseArray) ipChange.ipc$dispatch("33f73253", new Object[]{bundle, str, cls});
            }
            return bundle.getSparseParcelableArray(str, cls);
        }
    }

    private BundleCompat() {
    }

    @Deprecated
    public static IBinder getBinder(Bundle bundle, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IBinder) ipChange.ipc$dispatch("a84b586", new Object[]{bundle, str});
        }
        return bundle.getBinder(str);
    }

    public static <T> T getParcelable(Bundle bundle, String str, Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("7578ced3", new Object[]{bundle, str, cls});
        }
        if (Build.VERSION.SDK_INT >= 34) {
            return (T) Api33Impl.getParcelable(bundle, str, cls);
        }
        T t = (T) bundle.getParcelable(str);
        if (cls.isInstance(t)) {
            return t;
        }
        return null;
    }

    public static Parcelable[] getParcelableArray(Bundle bundle, String str, Class<? extends Parcelable> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Parcelable[]) ipChange.ipc$dispatch("dfe31ece", new Object[]{bundle, str, cls});
        }
        if (Build.VERSION.SDK_INT >= 34) {
            return (Parcelable[]) Api33Impl.getParcelableArray(bundle, str, cls);
        }
        return bundle.getParcelableArray(str);
    }

    public static <T> ArrayList<T> getParcelableArrayList(Bundle bundle, String str, Class<? extends T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("f9b2e4be", new Object[]{bundle, str, cls});
        }
        if (Build.VERSION.SDK_INT >= 34) {
            return Api33Impl.getParcelableArrayList(bundle, str, cls);
        }
        return bundle.getParcelableArrayList(str);
    }

    public static <T extends Serializable> T getSerializable(Bundle bundle, String str, Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ((Serializable) ipChange.ipc$dispatch("dfe82cef", new Object[]{bundle, str, cls}));
        }
        if (Build.VERSION.SDK_INT >= 34) {
            return (T) Api33Impl.getSerializable(bundle, str, cls);
        }
        T t = (T) bundle.getSerializable(str);
        if (cls.isInstance(t)) {
            return t;
        }
        return null;
    }

    public static <T> SparseArray<T> getSparseParcelableArray(Bundle bundle, String str, Class<? extends T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SparseArray) ipChange.ipc$dispatch("33f73253", new Object[]{bundle, str, cls});
        }
        if (Build.VERSION.SDK_INT >= 34) {
            return Api33Impl.getSparseParcelableArray(bundle, str, cls);
        }
        return bundle.getSparseParcelableArray(str);
    }

    @Deprecated
    public static void putBinder(Bundle bundle, String str, IBinder iBinder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41ffb765", new Object[]{bundle, str, iBinder});
        } else {
            bundle.putBinder(str, iBinder);
        }
    }
}

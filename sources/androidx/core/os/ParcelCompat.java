package androidx.core.os;

import android.os.BadParcelableException;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class ParcelCompat {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api29Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api29Impl() {
        }

        public static <T extends Parcelable> List<T> readParcelableList(Parcel parcel, List<T> list, ClassLoader classLoader) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("62f0705d", new Object[]{parcel, list, classLoader});
            }
            return parcel.readParcelableList(list, classLoader);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api30Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api30Impl() {
        }

        public static Parcelable.Creator<?> readParcelableCreator(Parcel parcel, ClassLoader classLoader) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Parcelable.Creator) ipChange.ipc$dispatch("9d9e9792", new Object[]{parcel, classLoader});
            }
            return parcel.readParcelableCreator(classLoader);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api33Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api33Impl() {
        }

        public static <T> T[] readArray(Parcel parcel, ClassLoader classLoader, Class<T> cls) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (T[]) ((Object[]) ipChange.ipc$dispatch("e267ee37", new Object[]{parcel, classLoader, cls}));
            }
            return (T[]) parcel.readArray(classLoader, cls);
        }

        public static <T> ArrayList<T> readArrayList(Parcel parcel, ClassLoader classLoader, Class<? extends T> cls) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ArrayList) ipChange.ipc$dispatch("e373fe32", new Object[]{parcel, classLoader, cls});
            }
            return parcel.readArrayList(classLoader, cls);
        }

        public static <V, K> HashMap<K, V> readHashMap(Parcel parcel, ClassLoader classLoader, Class<? extends K> cls, Class<? extends V> cls2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (HashMap) ipChange.ipc$dispatch("f9c0559f", new Object[]{parcel, classLoader, cls, cls2});
            }
            return parcel.readHashMap(classLoader, cls, cls2);
        }

        public static <T> void readList(Parcel parcel, List<? super T> list, ClassLoader classLoader, Class<T> cls) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e5f3de36", new Object[]{parcel, list, classLoader, cls});
            } else {
                parcel.readList(list, classLoader, cls);
            }
        }

        public static <K, V> void readMap(Parcel parcel, Map<? super K, ? super V> map, ClassLoader classLoader, Class<K> cls, Class<V> cls2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("60cc0305", new Object[]{parcel, map, classLoader, cls, cls2});
            } else {
                parcel.readMap(map, classLoader, cls, cls2);
            }
        }

        public static <T extends Parcelable> T readParcelable(Parcel parcel, ClassLoader classLoader, Class<T> cls) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (T) ((Parcelable) ipChange.ipc$dispatch("7e7168e3", new Object[]{parcel, classLoader, cls}));
            }
            return (T) ((Parcelable) parcel.readParcelable(classLoader, cls));
        }

        public static <T> T[] readParcelableArray(Parcel parcel, ClassLoader classLoader, Class<T> cls) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (T[]) ((Object[]) ipChange.ipc$dispatch("8795c37a", new Object[]{parcel, classLoader, cls}));
            }
            return (T[]) parcel.readParcelableArray(classLoader, cls);
        }

        public static <T> Parcelable.Creator<T> readParcelableCreator(Parcel parcel, ClassLoader classLoader, Class<T> cls) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Parcelable.Creator) ipChange.ipc$dispatch("39024501", new Object[]{parcel, classLoader, cls});
            }
            return parcel.readParcelableCreator(classLoader, cls);
        }

        public static <T> List<T> readParcelableList(Parcel parcel, List<T> list, ClassLoader classLoader, Class<T> cls) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("23c00a14", new Object[]{parcel, list, classLoader, cls});
            }
            return parcel.readParcelableList(list, classLoader, cls);
        }

        public static <T extends Serializable> T readSerializable(Parcel parcel, ClassLoader classLoader, Class<T> cls) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (T) ((Serializable) ipChange.ipc$dispatch("982246a6", new Object[]{parcel, classLoader, cls}));
            }
            return (T) ((Serializable) parcel.readSerializable(classLoader, cls));
        }

        public static <T> SparseArray<T> readSparseArray(Parcel parcel, ClassLoader classLoader, Class<? extends T> cls) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SparseArray) ipChange.ipc$dispatch("702d323", new Object[]{parcel, classLoader, cls});
            }
            return parcel.readSparseArray(classLoader, cls);
        }
    }

    private ParcelCompat() {
    }

    public static <T> Object[] readArray(Parcel parcel, ClassLoader classLoader, Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Object[]) ipChange.ipc$dispatch("e267ee37", new Object[]{parcel, classLoader, cls});
        }
        if (Build.VERSION.SDK_INT >= 34) {
            return Api33Impl.readArray(parcel, classLoader, cls);
        }
        return parcel.readArray(classLoader);
    }

    public static <T> ArrayList<T> readArrayList(Parcel parcel, ClassLoader classLoader, Class<? extends T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("e373fe32", new Object[]{parcel, classLoader, cls});
        }
        if (Build.VERSION.SDK_INT >= 34) {
            return Api33Impl.readArrayList(parcel, classLoader, cls);
        }
        return parcel.readArrayList(classLoader);
    }

    public static boolean readBoolean(Parcel parcel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aa77e18", new Object[]{parcel})).booleanValue();
        }
        if (parcel.readInt() != 0) {
            return true;
        }
        return false;
    }

    public static <K, V> HashMap<K, V> readHashMap(Parcel parcel, ClassLoader classLoader, Class<? extends K> cls, Class<? extends V> cls2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("f9c0559f", new Object[]{parcel, classLoader, cls, cls2});
        }
        if (Build.VERSION.SDK_INT >= 34) {
            return Api33Impl.readHashMap(parcel, classLoader, cls, cls2);
        }
        return parcel.readHashMap(classLoader);
    }

    public static <T> void readList(Parcel parcel, List<? super T> list, ClassLoader classLoader, Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5f3de36", new Object[]{parcel, list, classLoader, cls});
        } else if (Build.VERSION.SDK_INT >= 34) {
            Api33Impl.readList(parcel, list, classLoader, cls);
        } else {
            parcel.readList(list, classLoader);
        }
    }

    public static <K, V> void readMap(Parcel parcel, Map<? super K, ? super V> map, ClassLoader classLoader, Class<K> cls, Class<V> cls2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60cc0305", new Object[]{parcel, map, classLoader, cls, cls2});
        } else if (Build.VERSION.SDK_INT >= 34) {
            Api33Impl.readMap(parcel, map, classLoader, cls, cls2);
        } else {
            parcel.readMap(map, classLoader);
        }
    }

    public static <T extends Parcelable> T readParcelable(Parcel parcel, ClassLoader classLoader, Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ((Parcelable) ipChange.ipc$dispatch("7e7168e3", new Object[]{parcel, classLoader, cls}));
        }
        if (Build.VERSION.SDK_INT >= 34) {
            return (T) Api33Impl.readParcelable(parcel, classLoader, cls);
        }
        T t = (T) parcel.readParcelable(classLoader);
        if (t == null || cls.isInstance(t)) {
            return t;
        }
        throw new BadParcelableException("Parcelable " + t.getClass() + " is not a subclass of required class " + cls.getName() + " provided in the parameter");
    }

    @Deprecated
    public static <T> T[] readParcelableArray(Parcel parcel, ClassLoader classLoader, Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T[]) ((Object[]) ipChange.ipc$dispatch("8795c37a", new Object[]{parcel, classLoader, cls}));
        }
        if (Build.VERSION.SDK_INT >= 34) {
            return (T[]) Api33Impl.readParcelableArray(parcel, classLoader, cls);
        }
        T[] tArr = (T[]) parcel.readParcelableArray(classLoader);
        if (cls.isAssignableFrom(Parcelable.class)) {
            return tArr;
        }
        T[] tArr2 = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, tArr.length));
        for (int i = 0; i < tArr.length; i++) {
            try {
                tArr2[i] = cls.cast(tArr[i]);
            } catch (ClassCastException unused) {
                throw new BadParcelableException("Parcelable at index " + i + " is not a subclass of required class " + cls.getName() + " provided in the parameter");
            }
        }
        return tArr2;
    }

    public static <T> Parcelable[] readParcelableArrayTyped(Parcel parcel, ClassLoader classLoader, Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Parcelable[]) ipChange.ipc$dispatch("e707305", new Object[]{parcel, classLoader, cls});
        }
        if (Build.VERSION.SDK_INT >= 34) {
            return (Parcelable[]) Api33Impl.readParcelableArray(parcel, classLoader, cls);
        }
        return parcel.readParcelableArray(classLoader);
    }

    public static <T> Parcelable.Creator<T> readParcelableCreator(Parcel parcel, ClassLoader classLoader, Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Parcelable.Creator) ipChange.ipc$dispatch("39024501", new Object[]{parcel, classLoader, cls});
        }
        if (Build.VERSION.SDK_INT >= 34) {
            return Api33Impl.readParcelableCreator(parcel, classLoader, cls);
        }
        return (Parcelable.Creator<T>) Api30Impl.readParcelableCreator(parcel, classLoader);
    }

    public static <T> List<T> readParcelableList(Parcel parcel, List<T> list, ClassLoader classLoader, Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("23c00a14", new Object[]{parcel, list, classLoader, cls});
        }
        if (Build.VERSION.SDK_INT >= 34) {
            return Api33Impl.readParcelableList(parcel, list, classLoader, cls);
        }
        return Api29Impl.readParcelableList(parcel, list, classLoader);
    }

    public static <T extends Serializable> T readSerializable(Parcel parcel, ClassLoader classLoader, Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ((Serializable) ipChange.ipc$dispatch("982246a6", new Object[]{parcel, classLoader, cls}));
        }
        if (Build.VERSION.SDK_INT >= 33) {
            return (T) Api33Impl.readSerializable(parcel, classLoader, cls);
        }
        return (T) parcel.readSerializable();
    }

    public static <T> SparseArray<T> readSparseArray(Parcel parcel, ClassLoader classLoader, Class<? extends T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SparseArray) ipChange.ipc$dispatch("702d323", new Object[]{parcel, classLoader, cls});
        }
        if (Build.VERSION.SDK_INT >= 34) {
            return Api33Impl.readSparseArray(parcel, classLoader, cls);
        }
        return parcel.readSparseArray(classLoader);
    }

    public static void writeBoolean(Parcel parcel, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("275e6fd7", new Object[]{parcel, new Boolean(z)});
        } else {
            parcel.writeInt(z ? 1 : 0);
        }
    }
}

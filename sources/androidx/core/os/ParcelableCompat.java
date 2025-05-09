package androidx.core.os;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class ParcelableCompat {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class ParcelableCompatCreatorHoneycombMR2<T> implements Parcelable.ClassLoaderCreator<T> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final ParcelableCompatCreatorCallbacks<T> mCallbacks;

        public ParcelableCompatCreatorHoneycombMR2(ParcelableCompatCreatorCallbacks<T> parcelableCompatCreatorCallbacks) {
            this.mCallbacks = parcelableCompatCreatorCallbacks;
        }

        @Override // android.os.Parcelable.Creator
        public T createFromParcel(Parcel parcel) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("c057b5b", new Object[]{this, parcel}) : this.mCallbacks.createFromParcel(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        public T[] newArray(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (T[]) ((Object[]) ipChange.ipc$dispatch("aaa7de04", new Object[]{this, new Integer(i)}));
            }
            return this.mCallbacks.newArray(i);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public T createFromParcel(Parcel parcel, ClassLoader classLoader) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("fcd477bf", new Object[]{this, parcel, classLoader}) : this.mCallbacks.createFromParcel(parcel, classLoader);
        }
    }

    private ParcelableCompat() {
    }

    @Deprecated
    public static <T> Parcelable.Creator<T> newCreator(ParcelableCompatCreatorCallbacks<T> parcelableCompatCreatorCallbacks) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Parcelable.Creator) ipChange.ipc$dispatch("29f0681", new Object[]{parcelableCompatCreatorCallbacks});
        }
        return new ParcelableCompatCreatorHoneycombMR2(parcelableCompatCreatorCallbacks);
    }
}

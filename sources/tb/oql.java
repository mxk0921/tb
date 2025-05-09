package tb;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class oql {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final ClassLoader classLoader = oql.class.getClassLoader();

    static {
        t2o.a(683671553);
    }

    public static Parcelable a(Parcel parcel, Parcelable.Creator creator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Parcelable) ipChange.ipc$dispatch("a1db96d7", new Object[]{parcel, creator});
        }
        if (parcel.readInt() != 0) {
            return (Parcelable) creator.createFromParcel(parcel);
        }
        return null;
    }

    public static void b(Parcel parcel, Parcelable parcelable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d5ad530", new Object[]{parcel, parcelable});
        } else if (parcelable != null) {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
    }
}

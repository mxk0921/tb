package com.alibaba.android.split.core.internal;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ParcelUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(677380150);
    }

    public static Parcelable toBundle(Parcel parcel, Parcelable.Creator creator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Parcelable) ipChange.ipc$dispatch("26928645", new Object[]{parcel, creator});
        }
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    public static void writeParcel(Parcel parcel, Parcelable parcelable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7666dd5", new Object[]{parcel, parcelable});
        } else if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
        }
    }

    public static void writeStrongBinder(Parcel parcel, IInterface iInterface) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("756c26a0", new Object[]{parcel, iInterface});
        } else if (iInterface == null) {
            parcel.writeStrongBinder(null);
        } else {
            parcel.writeStrongBinder(iInterface.asBinder());
        }
    }
}

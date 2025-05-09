package com.alibaba.mtl.appmonitor.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import tb.nhh;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class DimensionSet implements Parcelable {
    public static final Parcelable.Creator<DimensionSet> CREATOR = new Parcelable.Creator<DimensionSet>() { // from class: com.alibaba.mtl.appmonitor.model.DimensionSet.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DimensionSet createFromParcel(Parcel parcel) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (DimensionSet) ipChange.ipc$dispatch("d9d6099b", new Object[]{this, parcel}) : DimensionSet.readFromParcel(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DimensionSet[] newArray(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (DimensionSet[]) ipChange.ipc$dispatch("22243392", new Object[]{this, new Integer(i)}) : new DimensionSet[i];
        }
    };
    private static final int INIT_SIZE = 3;
    private static final String TAG = "DimensionSet";
    private List<Dimension> dimensions = new ArrayList(3);

    static {
        t2o.a(962593103);
    }

    private DimensionSet() {
    }

    public static DimensionSet create() {
        return new DimensionSet();
    }

    public DimensionSet addDimension(Dimension dimension) {
        if (this.dimensions.contains(dimension)) {
            return this;
        }
        this.dimensions.add(dimension);
        return this;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Dimension getDimension(String str) {
        for (Dimension dimension : this.dimensions) {
            if (dimension.getName().equals(str)) {
                return dimension;
            }
        }
        return null;
    }

    public List<Dimension> getDimensions() {
        return this.dimensions;
    }

    public void setConstantValue(DimensionValueSet dimensionValueSet) {
        List<Dimension> list = this.dimensions;
        if (!(list == null || dimensionValueSet == null)) {
            for (Dimension dimension : list) {
                if (dimension.getConstantValue() != null && dimensionValueSet.getValue(dimension.getName()) == null) {
                    dimensionValueSet.setValue(dimension.getName(), dimension.getConstantValue());
                }
            }
        }
    }

    public boolean valid(DimensionValueSet dimensionValueSet) {
        List<Dimension> list = this.dimensions;
        if (list == null) {
            return true;
        }
        if (dimensionValueSet == null) {
            return false;
        }
        for (Dimension dimension : list) {
            if (!dimensionValueSet.containValue(dimension.getName())) {
                return false;
            }
        }
        return true;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Dimension[] dimensionArr;
        List<Dimension> list = this.dimensions;
        if (list != null) {
            try {
                Object[] array = list.toArray();
                if (array != null) {
                    dimensionArr = new Dimension[array.length];
                    for (int i2 = 0; i2 < array.length; i2++) {
                        dimensionArr[i2] = (Dimension) array[i2];
                    }
                } else {
                    dimensionArr = null;
                }
                parcel.writeParcelableArray(dimensionArr, i);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static DimensionSet create(Collection<String> collection) {
        DimensionSet dimensionSet = new DimensionSet();
        if (collection != null) {
            for (String str : collection) {
                dimensionSet.addDimension(new Dimension(str));
            }
        }
        return dimensionSet;
    }

    public DimensionSet addDimension(String str) {
        return addDimension(new Dimension(str));
    }

    public static DimensionSet readFromParcel(Parcel parcel) {
        DimensionSet create = create();
        try {
            Parcelable[] readParcelableArray = parcel.readParcelableArray(DimensionSet.class.getClassLoader());
            if (readParcelableArray != null) {
                if (create.dimensions == null) {
                    create.dimensions = new ArrayList();
                }
                for (Parcelable parcelable : readParcelableArray) {
                    if (parcelable == null || !(parcelable instanceof Dimension)) {
                        nhh.f(TAG, "parcelables[i]:", parcelable);
                    } else {
                        create.dimensions.add((Dimension) parcelable);
                    }
                }
            }
        } catch (Throwable th) {
            nhh.v(TAG, "[readFromParcel]", th);
        }
        return create;
    }

    public static DimensionSet create(String[] strArr) {
        DimensionSet dimensionSet = new DimensionSet();
        if (strArr != null) {
            for (String str : strArr) {
                dimensionSet.addDimension(new Dimension(str));
            }
        }
        return dimensionSet;
    }

    public DimensionSet addDimension(String str, String str2) {
        return addDimension(new Dimension(str, str2));
    }
}

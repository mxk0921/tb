package com.alibaba.mtl.appmonitor.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.LinkedHashMap;
import java.util.Map;
import tb.rbo;
import tb.t2o;
import tb.to1;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class DimensionValueSet implements rbo, Parcelable {
    public static final Parcelable.Creator<DimensionValueSet> CREATOR = new Parcelable.Creator<DimensionValueSet>() { // from class: com.alibaba.mtl.appmonitor.model.DimensionValueSet.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DimensionValueSet createFromParcel(Parcel parcel) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (DimensionValueSet) ipChange.ipc$dispatch("1ecd1ce8", new Object[]{this, parcel}) : DimensionValueSet.readFromParcel(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DimensionValueSet[] newArray(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (DimensionValueSet[]) ipChange.ipc$dispatch("736d9551", new Object[]{this, new Integer(i)}) : new DimensionValueSet[i];
        }
    };
    protected Map<String, String> map;

    static {
        t2o.a(962593105);
        t2o.a(962593059);
    }

    @Deprecated
    public DimensionValueSet() {
        if (this.map == null) {
            this.map = new LinkedHashMap();
        }
    }

    public static DimensionValueSet create() {
        return (DimensionValueSet) to1.a().d(DimensionValueSet.class, new Object[0]);
    }

    public static DimensionValueSet fromStringMap(Map<String, String> map) {
        String str;
        DimensionValueSet dimensionValueSet = (DimensionValueSet) to1.a().d(DimensionValueSet.class, new Object[0]);
        for (Map.Entry<String, String> entry : map.entrySet()) {
            Map<String, String> map2 = dimensionValueSet.map;
            String key = entry.getKey();
            if (entry.getValue() != null) {
                str = entry.getValue();
            } else {
                str = "null";
            }
            map2.put(key, str);
        }
        return dimensionValueSet;
    }

    public static DimensionValueSet readFromParcel(Parcel parcel) {
        DimensionValueSet dimensionValueSet;
        Throwable th;
        try {
            dimensionValueSet = create();
            try {
                dimensionValueSet.map = parcel.readHashMap(DimensionValueSet.class.getClassLoader());
            } catch (Throwable th2) {
                th = th2;
                th.printStackTrace();
                return dimensionValueSet;
            }
        } catch (Throwable th3) {
            th = th3;
            dimensionValueSet = null;
        }
        return dimensionValueSet;
    }

    @Override // tb.rbo
    public void clean() {
        this.map.clear();
    }

    public boolean containValue(String str) {
        return this.map.containsKey(str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DimensionValueSet dimensionValueSet = (DimensionValueSet) obj;
        Map<String, String> map = this.map;
        if (map == null) {
            if (dimensionValueSet.map != null) {
                return false;
            }
        } else if (!map.equals(dimensionValueSet.map)) {
            return false;
        }
        return true;
    }

    @Override // tb.rbo
    public void fill(Object... objArr) {
        if (this.map == null) {
            this.map = new LinkedHashMap();
        }
    }

    public Map<String, String> getMap() {
        return this.map;
    }

    public String getValue(String str) {
        return this.map.get(str);
    }

    public int hashCode() {
        int i;
        Map<String, String> map = this.map;
        if (map == null) {
            i = 0;
        } else {
            i = map.hashCode();
        }
        return 31 + i;
    }

    public void setMap(Map<String, String> map) {
        String str;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            Map<String, String> map2 = this.map;
            String key = entry.getKey();
            if (entry.getValue() != null) {
                str = entry.getValue();
            } else {
                str = "null";
            }
            map2.put(key, str);
        }
    }

    public DimensionValueSet setValue(String str, String str2) {
        Map<String, String> map = this.map;
        if (str2 == null) {
            str2 = "null";
        }
        map.put(str, str2);
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeMap(this.map);
    }

    @Deprecated
    public static DimensionValueSet create(int i) {
        return (DimensionValueSet) to1.a().d(DimensionValueSet.class, new Object[0]);
    }

    public DimensionValueSet addValues(DimensionValueSet dimensionValueSet) {
        Map<String, String> map;
        String str;
        if (!(dimensionValueSet == null || (map = dimensionValueSet.getMap()) == null)) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                Map<String, String> map2 = this.map;
                String key = entry.getKey();
                if (entry.getValue() != null) {
                    str = entry.getValue();
                } else {
                    str = "null";
                }
                map2.put(key, str);
            }
        }
        return this;
    }
}

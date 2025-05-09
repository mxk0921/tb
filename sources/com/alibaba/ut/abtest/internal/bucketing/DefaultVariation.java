package com.alibaba.ut.abtest.internal.bucketing;

import android.os.Parcel;
import android.os.Parcelable;
import com.alibaba.ut.abtest.Variation;
import com.android.alibaba.ip.runtime.IpChange;
import tb.ku0;
import tb.ogh;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class DefaultVariation implements Variation {
    public static final Parcelable.Creator<DefaultVariation> CREATOR = new a();
    private static final String TAG = "DefaultVariation";
    private final String name;
    private final String value;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class a implements Parcelable.Creator<DefaultVariation> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public DefaultVariation createFromParcel(Parcel parcel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DefaultVariation) ipChange.ipc$dispatch("e283fb5a", new Object[]{this, parcel});
            }
            return new DefaultVariation(parcel.readString(), parcel.readString());
        }

        /* renamed from: b */
        public DefaultVariation[] newArray(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DefaultVariation[]) ipChange.ipc$dispatch("4247ead1", new Object[]{this, new Integer(i)});
            }
            return new DefaultVariation[i];
        }
    }

    static {
        t2o.a(961544315);
        t2o.a(961544258);
    }

    public DefaultVariation(String str, String str2) {
        this.name = str;
        this.value = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.alibaba.ut.abtest.Variation
    public String getName() {
        return this.name;
    }

    @Override // com.alibaba.ut.abtest.Variation
    public Object getValue(Object obj) {
        String str = this.value;
        if (str != null) {
            return str;
        }
        return obj;
    }

    @Override // com.alibaba.ut.abtest.Variation
    public boolean getValueAsBoolean(boolean z) {
        String str = this.value;
        if (!(str == null || str.length() == 0)) {
            try {
                return Boolean.parseBoolean(this.value);
            } catch (Exception e) {
                ogh.o(TAG, "变量 '" + this.name + "' 不能转换成 boolean 类型，变量值：" + this.value, e);
                ku0.j("DefaultVariation.getValueAsBoolean", e);
            }
        }
        return z;
    }

    @Override // com.alibaba.ut.abtest.Variation
    public double getValueAsDouble(double d) {
        String str = this.value;
        if (!(str == null || str.length() == 0)) {
            try {
                return Double.parseDouble(this.value);
            } catch (Exception e) {
                ogh.o(TAG, "变量 '" + this.name + "' 不能转换成 double 类型，变量值：" + this.value, e);
                ku0.j("DefaultVariation.getValueAsDouble", e);
            }
        }
        return d;
    }

    @Override // com.alibaba.ut.abtest.Variation
    public float getValueAsFloat(float f) {
        String str = this.value;
        if (!(str == null || str.length() == 0)) {
            try {
                return Float.parseFloat(this.value);
            } catch (Exception e) {
                ogh.o(TAG, "变量 '" + this.name + "' 不能转换成 float 类型，变量值：" + this.value, e);
                ku0.j("DefaultVariation.getValueAsFloat", e);
            }
        }
        return f;
    }

    @Override // com.alibaba.ut.abtest.Variation
    public int getValueAsInt(int i) {
        String str = this.value;
        if (!(str == null || str.length() == 0)) {
            try {
                return Integer.parseInt(this.value);
            } catch (Exception e) {
                ogh.o(TAG, "变量 '" + this.name + "' 不能转换成 int 类型，变量值：" + this.value, e);
                ku0.j("DefaultVariation.getValueAsInt", e);
            }
        }
        return i;
    }

    @Override // com.alibaba.ut.abtest.Variation
    public long getValueAsLong(long j) {
        String str = this.value;
        if (!(str == null || str.length() == 0)) {
            try {
                return Long.parseLong(this.value);
            } catch (Exception e) {
                ogh.o(TAG, "变量 '" + this.name + "' 不能转换成 long 类型，变量值：" + this.value, e);
                ku0.j("DefaultVariation.getValueAsLong", e);
            }
        }
        return j;
    }

    @Override // com.alibaba.ut.abtest.Variation
    public short getValueAsShort(short s) {
        String str = this.value;
        if (!(str == null || str.length() == 0)) {
            try {
                return Short.parseShort(this.value);
            } catch (Exception e) {
                ogh.o(TAG, "变量 '" + this.name + "' 不能转换成 short 类型，变量值：" + this.value, e);
                ku0.j("DefaultVariation.getValueAsShort", e);
            }
        }
        return s;
    }

    @Override // com.alibaba.ut.abtest.Variation
    public String getValueAsString(String str) {
        String str2 = this.value;
        if (str2 == null || str2.length() == 0) {
            return str;
        }
        return this.value;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        try {
            parcel.writeString(this.name);
            parcel.writeString(this.value);
        } catch (Throwable th) {
            ku0.j("DefaultVariation.writeToParcel", th);
        }
    }
}

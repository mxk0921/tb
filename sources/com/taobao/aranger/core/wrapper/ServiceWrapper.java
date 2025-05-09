package com.taobao.aranger.core.wrapper;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.alibaba.ip.runtime.IpChange;
import tb.n32;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class ServiceWrapper extends n32 implements Parcelable {
    public static final Parcelable.Creator<ServiceWrapper> CREATOR = new a();
    private String mTimeStamp;
    private int mType;
    private Class serviceInterfaceClass;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements Parcelable.Creator<ServiceWrapper> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public ServiceWrapper createFromParcel(Parcel parcel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ServiceWrapper) ipChange.ipc$dispatch("ad82e930", new Object[]{this, parcel});
            }
            ServiceWrapper serviceWrapper = new ServiceWrapper(null);
            serviceWrapper.readFromParcel(parcel);
            return serviceWrapper;
        }

        /* renamed from: b */
        public ServiceWrapper[] newArray(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ServiceWrapper[]) ipChange.ipc$dispatch("6ef9fe19", new Object[]{this, new Integer(i)});
            }
            return new ServiceWrapper[i];
        }
    }

    static {
        t2o.a(393216072);
    }

    public /* synthetic */ ServiceWrapper(a aVar) {
        this();
    }

    public static ServiceWrapper obtain() {
        return new ServiceWrapper();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Class getServiceInterfaceClass() {
        return this.serviceInterfaceClass;
    }

    public String getTimeStamp() {
        return this.mTimeStamp;
    }

    public int getType() {
        return this.mType;
    }

    @Override // tb.n32
    public void readFromParcel(Parcel parcel) {
        this.mTimeStamp = parcel.readString();
        byte readByte = parcel.readByte();
        this.mType = readByte;
        if (readByte != 3) {
            super.readFromParcel(parcel);
        }
    }

    public ServiceWrapper setServiceInterfaceClass(Class<?> cls) {
        this.serviceInterfaceClass = cls;
        return this;
    }

    public ServiceWrapper setServiceName(String str) {
        super.setName(str);
        return this;
    }

    public ServiceWrapper setTimeStamp(String str) {
        this.mTimeStamp = str;
        return this;
    }

    public ServiceWrapper setType(int i) {
        this.mType = i;
        return this;
    }

    @Override // tb.n32, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mTimeStamp);
        parcel.writeByte((byte) this.mType);
        if (this.mType != 3) {
            super.writeToParcel(parcel, i);
        }
    }

    private ServiceWrapper() {
    }
}

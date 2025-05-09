package com.taobao.aranger.core.wrapper;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.aranger.utils.TypeUtils;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.b5d;
import tb.gcp;
import tb.n32;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class ParameterWrapper extends n32 implements Parcelable {
    private IBinder mClientServiceBinder;
    private Object mData;
    private int mFlowFlag = 0;
    private String mTimeStamp;
    private static final String TAG = ParameterWrapper.class.getSimpleName();
    public static final Parcelable.Creator<ParameterWrapper> CREATOR = new a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements Parcelable.Creator<ParameterWrapper> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public ParameterWrapper createFromParcel(Parcel parcel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ParameterWrapper) ipChange.ipc$dispatch("79d39964", new Object[]{this, parcel});
            }
            ParameterWrapper obtain = ParameterWrapper.obtain();
            obtain.readFromParcel(parcel);
            return obtain;
        }

        /* renamed from: b */
        public ParameterWrapper[] newArray(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ParameterWrapper[]) ipChange.ipc$dispatch("b9d9180d", new Object[]{this, new Integer(i)});
            }
            return new ParameterWrapper[i];
        }
    }

    static {
        t2o.a(393216070);
    }

    private ParameterWrapper() {
    }

    public static ParameterWrapper obtain() {
        return new ParameterWrapper();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public IBinder getClientServiceBinder() {
        return this.mClientServiceBinder;
    }

    public Object getData() {
        return this.mData;
    }

    public int getFlowFlag() {
        return this.mFlowFlag;
    }

    public String getTimeStamp() {
        return this.mTimeStamp;
    }

    @Override // tb.n32
    public void readFromParcel(Parcel parcel) {
        if (parcel.readByte() == 0) {
            super.readFromParcel(parcel);
        }
        this.mFlowFlag = parcel.readByte();
        if (parcel.readByte() == 0) {
            this.mTimeStamp = parcel.readString();
            this.mClientServiceBinder = parcel.readStrongBinder();
        }
        Object e = gcp.e(getClass().getClassLoader(), parcel);
        this.mData = e;
        if (e != null && getName() == null) {
            setName(this.mData.getClass().getName());
        }
    }

    public ParameterWrapper setClientServiceBinder(IBinder iBinder) {
        this.mClientServiceBinder = iBinder;
        return this;
    }

    public ParameterWrapper setData(Object obj) {
        this.mData = obj;
        if (obj == null) {
            return this;
        }
        Class<?> cls = obj.getClass();
        if (this.mFlowFlag == 1) {
            if (cls.isArray()) {
                if (cls.getComponentType() != null) {
                    this.mData = Array.newInstance(cls.getComponentType(), TypeUtils.m(cls.getName(), this.mData));
                } else {
                    this.mData = Array.newInstance(Object.class, TypeUtils.m(cls.getName(), this.mData));
                }
            } else if (List.class.isAssignableFrom(cls)) {
                this.mData = new ArrayList();
            } else if (Map.class.isAssignableFrom(cls)) {
                this.mData = new HashMap();
            } else {
                try {
                    this.mData = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Exception e) {
                    b5d.h(TAG, "[setData][newInstance]", e, new Object[0]);
                }
            }
        }
        return this;
    }

    public ParameterWrapper setFlowFlag(int i) {
        this.mFlowFlag = i;
        return this;
    }

    public ParameterWrapper setParameterName(String str) {
        setName(str);
        return this;
    }

    public ParameterWrapper setTimeStamp(String str) {
        this.mTimeStamp = str;
        return this;
    }

    @Override // tb.n32, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Object obj = this.mData;
        if (obj == null || !obj.getClass().getName().equals(getName())) {
            parcel.writeByte((byte) 0);
            super.writeToParcel(parcel, i);
        } else {
            parcel.writeByte((byte) 1);
        }
        parcel.writeByte((byte) this.mFlowFlag);
        if (this.mTimeStamp == null && this.mClientServiceBinder == null) {
            parcel.writeByte((byte) 1);
        } else {
            parcel.writeByte((byte) 0);
            parcel.writeString(this.mTimeStamp);
            parcel.writeStrongBinder(this.mClientServiceBinder);
        }
        gcp.g(parcel, this.mData, i, false);
    }
}

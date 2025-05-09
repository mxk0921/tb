package com.taobao.aranger.core.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.aranger.core.wrapper.MethodWrapper;
import com.taobao.aranger.core.wrapper.ParameterWrapper;
import tb.gcp;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class Callback implements Parcelable {
    public static final Parcelable.Creator<Callback> CREATOR = new Parcelable.Creator<Callback>() { // from class: com.taobao.aranger.core.entity.Callback.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public Callback createFromParcel(Parcel parcel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Callback) ipChange.ipc$dispatch("1cfa8d3b", new Object[]{this, parcel});
            }
            Callback obtain = Callback.obtain();
            obtain.readFromParcel(parcel);
            return obtain;
        }

        /* renamed from: b */
        public Callback[] newArray(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Callback[]) ipChange.ipc$dispatch("1dd13c72", new Object[]{this, new Integer(i)});
            }
            return new Callback[i];
        }
    };
    private boolean isOneWay;
    private long mDataSize;
    private MethodWrapper mMethodWrapper;
    private ParameterWrapper[] mParameterWrappers;
    private String mTimeStamp;

    static {
        t2o.a(393216026);
    }

    private Callback() {
    }

    public static Callback obtain() {
        return new Callback();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void readFromParcel(Parcel parcel) {
        this.mTimeStamp = parcel.readString();
        this.mMethodWrapper = MethodWrapper.CREATOR.createFromParcel(parcel);
        this.mParameterWrappers = (ParameterWrapper[]) gcp.e(getClass().getClassLoader(), parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public long getDataSize() {
        return this.mDataSize;
    }

    public MethodWrapper getMethodWrapper() {
        return this.mMethodWrapper;
    }

    public ParameterWrapper[] getParameterWrappers() {
        return this.mParameterWrappers;
    }

    public String getTimeStamp() {
        return this.mTimeStamp;
    }

    public boolean isOneWay() {
        return this.isOneWay;
    }

    public Callback setMethodWrapper(MethodWrapper methodWrapper) {
        this.mMethodWrapper = methodWrapper;
        return this;
    }

    public Callback setOneWay(boolean z) {
        this.isOneWay = z;
        return this;
    }

    public Callback setParameterWrappers(ParameterWrapper[] parameterWrapperArr) {
        this.mParameterWrappers = parameterWrapperArr;
        return this;
    }

    public Callback setTimeStamp(String str) {
        this.mTimeStamp = str;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mTimeStamp);
        this.mMethodWrapper.writeToParcel(parcel, i);
        this.mDataSize = gcp.g(parcel, this.mParameterWrappers, i, true);
    }
}

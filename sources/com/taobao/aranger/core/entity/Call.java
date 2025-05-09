package com.taobao.aranger.core.entity;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.aranger.core.wrapper.MethodWrapper;
import com.taobao.aranger.core.wrapper.ParameterWrapper;
import com.taobao.aranger.core.wrapper.ServiceWrapper;
import tb.gcp;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class Call implements Parcelable {
    public static final Parcelable.Creator<Call> CREATOR = new Parcelable.Creator<Call>() { // from class: com.taobao.aranger.core.entity.Call.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public Call createFromParcel(Parcel parcel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Call) ipChange.ipc$dispatch("ab4190c2", new Object[]{this, parcel});
            }
            Call obtain = Call.obtain();
            obtain.readFromParcel(parcel);
            return obtain;
        }

        /* renamed from: b */
        public Call[] newArray(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Call[]) ipChange.ipc$dispatch("d3467379", new Object[]{this, new Integer(i)});
            }
            return new Call[i];
        }
    };
    private boolean isAutoRecover;
    private boolean isOneWay;
    private boolean isSameApp;
    private long mDataSize;
    private MethodWrapper mMethodWrapper;
    private ParameterWrapper[] mParameterWrappers;
    private Uri mRemoteProviderUri;
    private ServiceWrapper mServiceWrapper;

    static {
        t2o.a(393216024);
    }

    private Call() {
    }

    public static Call obtain() {
        return new Call();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void readFromParcel(Parcel parcel) {
        this.mServiceWrapper = ServiceWrapper.CREATOR.createFromParcel(parcel);
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

    public Uri getRemoteProviderUri() {
        return this.mRemoteProviderUri;
    }

    public ServiceWrapper getServiceWrapper() {
        return this.mServiceWrapper;
    }

    public boolean isAutoRecover() {
        return this.isAutoRecover;
    }

    public boolean isOneWay() {
        return this.isOneWay;
    }

    public boolean isSameApp() {
        return this.isSameApp;
    }

    public Call setAutoRecover(boolean z) {
        this.isAutoRecover = z;
        return this;
    }

    public Call setMethodWrapper(MethodWrapper methodWrapper) {
        this.mMethodWrapper = methodWrapper;
        return this;
    }

    public Call setOneWay(boolean z) {
        this.isOneWay = z;
        return this;
    }

    public Call setParameterWrappers(ParameterWrapper[] parameterWrapperArr) {
        this.mParameterWrappers = parameterWrapperArr;
        return this;
    }

    public Call setRemoteProviderUri(Uri uri) {
        this.mRemoteProviderUri = uri;
        return this;
    }

    public Call setSameApp(boolean z) {
        this.isSameApp = z;
        return this;
    }

    public Call setServiceWrapper(ServiceWrapper serviceWrapper) {
        this.mServiceWrapper = serviceWrapper;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        this.mServiceWrapper.writeToParcel(parcel, i);
        this.mMethodWrapper.writeToParcel(parcel, i);
        this.mDataSize = gcp.g(parcel, this.mParameterWrappers, i, true);
    }
}

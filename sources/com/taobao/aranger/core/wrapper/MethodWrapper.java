package com.taobao.aranger.core.wrapper;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.alibaba.ip.runtime.IpChange;
import tb.n32;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class MethodWrapper extends n32 implements Parcelable {
    public static final Parcelable.Creator<MethodWrapper> CREATOR = new a();
    private boolean isVoid;
    private String mReturnType;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements Parcelable.Creator<MethodWrapper> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public MethodWrapper createFromParcel(Parcel parcel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (MethodWrapper) ipChange.ipc$dispatch("20262656", new Object[]{this, parcel});
            }
            MethodWrapper obtain = MethodWrapper.obtain();
            obtain.readFromParcel(parcel);
            return obtain;
        }

        /* renamed from: b */
        public MethodWrapper[] newArray(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (MethodWrapper[]) ipChange.ipc$dispatch("6874504d", new Object[]{this, new Integer(i)});
            }
            return new MethodWrapper[i];
        }
    }

    static {
        t2o.a(393216068);
    }

    private MethodWrapper() {
    }

    public static MethodWrapper obtain() {
        return new MethodWrapper();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getReturnType() {
        return this.mReturnType;
    }

    public boolean isVoid() {
        return this.isVoid;
    }

    @Override // tb.n32
    public void readFromParcel(Parcel parcel) {
        super.readFromParcel(parcel);
        if (parcel.readByte() == 0) {
            this.mReturnType = parcel.readString();
        } else {
            this.isVoid = true;
        }
    }

    public MethodWrapper setMethodName(String str) {
        setName(str);
        return this;
    }

    public void setReturnType(String str) {
        this.mReturnType = str;
    }

    public MethodWrapper setVoid(boolean z) {
        this.isVoid = z;
        return this;
    }

    @Override // tb.n32, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        if (!this.isVoid) {
            parcel.writeByte((byte) 0);
            parcel.writeString(this.mReturnType);
            return;
        }
        parcel.writeByte((byte) 1);
    }
}

package com.taobao.aranger.core.entity;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.aranger.core.wrapper.ParameterWrapper;
import tb.gcp;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class Reply implements Parcelable {
    public static final Parcelable.Creator<Reply> CREATOR = new Parcelable.Creator<Reply>() { // from class: com.taobao.aranger.core.entity.Reply.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public Reply createFromParcel(Parcel parcel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Reply) ipChange.ipc$dispatch("d6c3700c", new Object[]{this, parcel});
            }
            Reply obtain = Reply.obtain();
            obtain.readFromParcel(parcel);
            return obtain;
        }

        /* renamed from: b */
        public Reply[] newArray(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Reply[]) ipChange.ipc$dispatch("af5ae435", new Object[]{this, new Integer(i)});
            }
            return new Reply[i];
        }
    };
    private int mErrorCode;
    private String mErrorMessage;
    private ParameterWrapper[] mFlowParameterWrappers;
    private long mInvokeTime;
    private Object mResult;

    static {
        t2o.a(393216028);
    }

    private Reply() {
    }

    public static Reply obtain() {
        return new Reply();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void readFromParcel(Parcel parcel) {
        this.mErrorCode = parcel.readByte();
        if (parcel.readByte() == 0) {
            this.mErrorMessage = parcel.readString();
        }
        if (parcel.readByte() == 0) {
            this.mFlowParameterWrappers = (ParameterWrapper[]) gcp.e(getClass().getClassLoader(), parcel);
        }
        this.mInvokeTime = parcel.readInt();
        this.mResult = gcp.e(getClass().getClassLoader(), parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getErrorCode() {
        return this.mErrorCode;
    }

    public String getErrorMessage() {
        return this.mErrorMessage;
    }

    public ParameterWrapper[] getFlowParameterWrappers() {
        return this.mFlowParameterWrappers;
    }

    public long getInvokeTime() {
        return this.mInvokeTime;
    }

    public Object getResult() {
        return this.mResult;
    }

    public boolean isError() {
        if (this.mErrorCode != 0) {
            return true;
        }
        return false;
    }

    public Reply setErrorCode(int i) {
        this.mErrorCode = i;
        return this;
    }

    public Reply setErrorMessage(String str) {
        this.mErrorMessage = str;
        return this;
    }

    public Reply setFlowParameterWrappers(ParameterWrapper[] parameterWrapperArr) {
        this.mFlowParameterWrappers = parameterWrapperArr;
        return this;
    }

    public Reply setInvokeTime(long j) {
        this.mInvokeTime = j;
        return this;
    }

    public Reply setResult(Object obj) {
        this.mResult = obj;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte((byte) this.mErrorCode);
        if (!TextUtils.isEmpty(this.mErrorMessage)) {
            parcel.writeByte((byte) 0);
            parcel.writeString(this.mErrorMessage);
        } else {
            parcel.writeByte((byte) 1);
        }
        if (this.mFlowParameterWrappers != null) {
            parcel.writeByte((byte) 0);
            gcp.g(parcel, this.mFlowParameterWrappers, i, true);
        } else {
            parcel.writeByte((byte) 1);
        }
        parcel.writeInt((int) this.mInvokeTime);
        gcp.g(parcel, this.mResult, i, true);
    }
}

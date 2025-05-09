package com.alibaba.ariver.kernel.ipc.uniform;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class IPCResult implements Parcelable {
    public static final Parcelable.Creator<IPCResult> CREATOR = new Parcelable.Creator<IPCResult>() { // from class: com.alibaba.ariver.kernel.ipc.uniform.IPCResult.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public IPCResult createFromParcel(Parcel parcel) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (IPCResult) ipChange.ipc$dispatch("7eab90cc", new Object[]{this, parcel}) : new IPCResult(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public IPCResult[] newArray(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (IPCResult[]) ipChange.ipc$dispatch("ec171903", new Object[]{this, new Integer(i)}) : new IPCResult[i];
        }
    };
    public static final byte SER_TYPE_PARCELABLE = 2;
    public static final byte SER_TYPE_SERIALIZE = 1;
    private static final String TAG = "IPCResult";
    public Parcelable parcelable;
    public int resultCode;
    public String resultMsg;
    public String resultType;
    public byte[] resultValue;
    public byte serType;

    public IPCResult() {
        this.resultCode = 0;
        this.resultMsg = "";
        this.serType = (byte) 1;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void readFromParcel(Parcel parcel) {
        try {
            this.serType = parcel.readByte();
            this.resultCode = parcel.readInt();
            this.resultMsg = parcel.readString();
            String readString = parcel.readString();
            this.resultType = readString;
            if (!TextUtils.equals(readString, Void.TYPE.getName())) {
                if (this.serType == 2) {
                    this.parcelable = parcel.readParcelable(getClass().getClassLoader());
                } else {
                    this.resultValue = parcel.createByteArray();
                }
            }
        } catch (Exception e) {
            RVLogger.e(TAG, "readFromParcel exception", e);
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        try {
            parcel.writeByte(this.serType);
            parcel.writeInt(this.resultCode);
            parcel.writeString(this.resultMsg);
            if (TextUtils.isEmpty(this.resultType)) {
                String name = Void.TYPE.getName();
                this.resultType = name;
                parcel.writeString(name);
                return;
            }
            parcel.writeString(this.resultType);
            if (this.serType == 2) {
                parcel.writeParcelable(this.parcelable, i);
                return;
            }
            if (this.resultValue == null) {
                this.resultValue = new byte[0];
            }
            parcel.writeByteArray(this.resultValue);
        } catch (Exception e) {
            RVLogger.e(TAG, "writeToParcel exception", e);
        }
    }

    public IPCResult(Parcel parcel) {
        this.resultCode = 0;
        this.resultMsg = "";
        readFromParcel(parcel);
    }
}

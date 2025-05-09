package com.taobao.interact.upload.service;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class MtopInfo implements Parcelable {
    public static final Parcelable.Creator<MtopInfo> CREATOR = new a();
    private String bizCode;
    private String ownerNick;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a implements Parcelable.Creator<MtopInfo> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public MtopInfo createFromParcel(Parcel parcel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (MtopInfo) ipChange.ipc$dispatch("5baa57f0", new Object[]{this, parcel});
            }
            MtopInfo mtopInfo = new MtopInfo();
            mtopInfo.bizCode = parcel.readString();
            mtopInfo.ownerNick = parcel.readString();
            return mtopInfo;
        }

        /* renamed from: b */
        public MtopInfo[] newArray(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (MtopInfo[]) ipChange.ipc$dispatch("a69893a7", new Object[]{this, new Integer(i)});
            }
            return new MtopInfo[i];
        }
    }

    static {
        t2o.a(495976498);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getBizCode() {
        return this.bizCode;
    }

    public String getOwnerNick() {
        return this.ownerNick;
    }

    public void setBizCode(String str) {
        this.bizCode = str;
    }

    public void setOwnerNick(String str) {
        this.ownerNick = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.bizCode);
        parcel.writeString(this.ownerNick);
    }
}

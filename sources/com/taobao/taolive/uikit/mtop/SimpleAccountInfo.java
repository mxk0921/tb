package com.taobao.taolive.uikit.mtop;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class SimpleAccountInfo implements IMTOPDataObject, Parcelable {
    public static final Parcelable.Creator<SimpleAccountInfo> CREATOR = new a();
    public String accountDes;
    public String accountExplain;
    public long accountId;
    public String accountNick;
    public String accountUrl;
    public String headImg;
    public String level;
    public String levelLogo;
    public String shop;
    public String shopLogoTxt;
    public String tmall;
    public boolean v;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a implements Parcelable.Creator<SimpleAccountInfo> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public SimpleAccountInfo createFromParcel(Parcel parcel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SimpleAccountInfo) ipChange.ipc$dispatch("42f41805", new Object[]{this, parcel});
            }
            return new SimpleAccountInfo(parcel);
        }

        /* renamed from: b */
        public SimpleAccountInfo[] newArray(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SimpleAccountInfo[]) ipChange.ipc$dispatch("b05fa03c", new Object[]{this, new Integer(i)});
            }
            return new SimpleAccountInfo[i];
        }
    }

    static {
        t2o.a(779093636);
        t2o.a(589299906);
    }

    public SimpleAccountInfo() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.accountId);
        parcel.writeString(this.accountNick);
        parcel.writeString(this.headImg);
        parcel.writeString(this.accountDes);
        parcel.writeString(this.accountExplain);
        parcel.writeString(this.accountUrl);
        parcel.writeByte(this.v ? (byte) 1 : (byte) 0);
    }

    public SimpleAccountInfo(Parcel parcel) {
        this.accountId = parcel.readLong();
        this.accountNick = parcel.readString();
        this.headImg = parcel.readString();
        this.accountDes = parcel.readString();
        this.accountExplain = parcel.readString();
        this.accountUrl = parcel.readString();
        this.v = parcel.readByte() != 0;
    }
}

package com.taobao.cainiao.card;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class GoodsInfoEntity implements Parcelable {
    public String authCode;
    public String cpCode;
    public String cpName;
    public boolean fromMtop;
    public String goodsCount;
    public String goodsName;
    public String goodsUrl;
    public String orderCode;
    public String predictArriveTime;
    public String providerName;
    public String status;
    public String statusDesc;
    public String traceNo;
    public String tradeId;
    public int type;
    public static final String TAG = GoodsInfoEntity.class.getSimpleName();
    public static final Parcelable.Creator<GoodsInfoEntity> CREATOR = new a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements Parcelable.Creator<GoodsInfoEntity> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public GoodsInfoEntity createFromParcel(Parcel parcel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (GoodsInfoEntity) ipChange.ipc$dispatch("f3fe3432", new Object[]{this, parcel});
            }
            return new GoodsInfoEntity(parcel);
        }

        /* renamed from: b */
        public GoodsInfoEntity[] newArray(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (GoodsInfoEntity[]) ipChange.ipc$dispatch("f4d4e369", new Object[]{this, new Integer(i)});
            }
            return new GoodsInfoEntity[i];
        }
    }

    static {
        t2o.a(713032017);
    }

    public GoodsInfoEntity() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.traceNo);
        parcel.writeString(this.cpCode);
        parcel.writeString(this.orderCode);
        parcel.writeString(this.goodsUrl);
        parcel.writeString(this.goodsName);
        parcel.writeString(this.goodsCount);
        parcel.writeString(this.cpName);
        parcel.writeString(this.statusDesc);
        parcel.writeString(this.status);
        parcel.writeString(this.tradeId);
        parcel.writeString(this.predictArriveTime);
        parcel.writeString(this.authCode);
        parcel.writeInt(this.type);
        parcel.writeString(this.providerName);
        parcel.writeByte(this.fromMtop ? (byte) 1 : (byte) 0);
    }

    public GoodsInfoEntity(Parcel parcel) {
        this.traceNo = parcel.readString();
        this.cpCode = parcel.readString();
        this.orderCode = parcel.readString();
        this.goodsUrl = parcel.readString();
        this.goodsName = parcel.readString();
        this.goodsCount = parcel.readString();
        this.cpName = parcel.readString();
        this.statusDesc = parcel.readString();
        this.status = parcel.readString();
        this.tradeId = parcel.readString();
        this.predictArriveTime = parcel.readString();
        this.authCode = parcel.readString();
        this.type = parcel.readInt();
        this.providerName = parcel.readString();
        this.fromMtop = parcel.readByte() != 0;
    }
}

package com.ut.share.business;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TBShareMediaInfo implements Parcelable {
    public static final Parcelable.Creator<TBShareMediaInfo> CREATOR = new Parcelable.Creator<TBShareMediaInfo>() { // from class: com.ut.share.business.TBShareMediaInfo.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public TBShareMediaInfo createFromParcel(Parcel parcel) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (TBShareMediaInfo) ipChange.ipc$dispatch("278b22f0", new Object[]{this, parcel}) : new TBShareMediaInfo(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public TBShareMediaInfo[] newArray(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (TBShareMediaInfo[]) ipChange.ipc$dispatch("381630d9", new Object[]{this, new Integer(i)}) : new TBShareMediaInfo[i];
        }
    };
    private float height;
    @TBShareMediaContentType
    private int type;
    private float width;

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.RUNTIME)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public @interface TBShareMediaContentType {
        public static final int TYPE_IMAGE = 1;
        public static final int TYPE_NONE = 0;
        public static final int TYPE_VIDEO = 2;
    }

    static {
        t2o.a(663748653);
    }

    public TBShareMediaInfo() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public float getHeight() {
        return this.height;
    }

    public int getType() {
        return this.type;
    }

    public float getWidth() {
        return this.width;
    }

    public void setHeight(float f) {
        this.height = f;
    }

    public void setType(int i) {
        this.type = i;
    }

    public void setWidth(float f) {
        this.width = f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.type);
        parcel.writeFloat(this.width);
        parcel.writeFloat(this.height);
    }

    public TBShareMediaInfo(Parcel parcel) {
        this.type = parcel.readInt();
        this.width = parcel.readFloat();
        this.height = parcel.readFloat();
    }
}

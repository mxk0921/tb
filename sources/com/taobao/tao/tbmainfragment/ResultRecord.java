package com.taobao.tao.tbmainfragment;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class ResultRecord implements Parcelable {
    public static final Parcelable.Creator<ResultRecord> CREATOR = new a();
    public int requestCode;
    public Bundle resultBundle;
    public int resultCode;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a implements Parcelable.Creator<ResultRecord> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public ResultRecord createFromParcel(Parcel parcel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ResultRecord) ipChange.ipc$dispatch("89cffe28", new Object[]{this, parcel});
            }
            return new ResultRecord(parcel);
        }

        /* renamed from: b */
        public ResultRecord[] newArray(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ResultRecord[]) ipChange.ipc$dispatch("20dfef91", new Object[]{this, new Integer(i)});
            }
            return new ResultRecord[i];
        }
    }

    static {
        t2o.a(775946368);
    }

    public ResultRecord() {
        this.resultCode = 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.requestCode);
        parcel.writeInt(this.resultCode);
        parcel.writeBundle(this.resultBundle);
    }

    public ResultRecord(Parcel parcel) {
        this.resultCode = 0;
        this.requestCode = parcel.readInt();
        this.resultCode = parcel.readInt();
        this.resultBundle = parcel.readBundle(ResultRecord.class.getClassLoader());
    }
}

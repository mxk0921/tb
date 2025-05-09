package com.taobao.interact.publish.service;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class BitmapSize implements Parcelable, Serializable {
    public static final Parcelable.Creator<BitmapSize> CREATOR = new a();
    private int height;
    private int width;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a implements Parcelable.Creator<BitmapSize> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public BitmapSize createFromParcel(Parcel parcel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (BitmapSize) ipChange.ipc$dispatch("2f6e1efe", new Object[]{this, parcel});
            }
            BitmapSize bitmapSize = new BitmapSize();
            bitmapSize.width = parcel.readInt();
            bitmapSize.height = parcel.readInt();
            return bitmapSize;
        }

        /* renamed from: b */
        public BitmapSize[] newArray(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (BitmapSize[]) ipChange.ipc$dispatch("f0e533e7", new Object[]{this, new Integer(i)});
            }
            return new BitmapSize[i];
        }
    }

    static {
        t2o.a(495976465);
    }

    public BitmapSize() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public void setWidth(int i) {
        this.width = i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
    }

    public BitmapSize(int i, int i2) {
        this.width = i;
        this.height = i2;
    }
}

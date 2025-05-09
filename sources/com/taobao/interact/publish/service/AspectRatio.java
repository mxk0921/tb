package com.taobao.interact.publish.service;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class AspectRatio implements Parcelable, Serializable {
    public static final Parcelable.Creator<AspectRatio> CREATOR = new a();
    private int aspectRatioX;
    private int aspectRatioY;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a implements Parcelable.Creator<AspectRatio> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public AspectRatio createFromParcel(Parcel parcel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (AspectRatio) ipChange.ipc$dispatch("b57ce7d5", new Object[]{this, parcel});
            }
            AspectRatio aspectRatio = new AspectRatio();
            aspectRatio.aspectRatioX = parcel.readInt();
            aspectRatio.aspectRatioY = parcel.readInt();
            return aspectRatio;
        }

        /* renamed from: b */
        public AspectRatio[] newArray(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (AspectRatio[]) ipChange.ipc$dispatch("22e8700c", new Object[]{this, new Integer(i)});
            }
            return new AspectRatio[i];
        }
    }

    static {
        t2o.a(495976463);
    }

    public AspectRatio() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getAspectRatioX() {
        return this.aspectRatioX;
    }

    public int getAspectRatioY() {
        return this.aspectRatioY;
    }

    public void setAspectRatioX(int i) {
        this.aspectRatioX = i;
    }

    public void setAspectRatioY(int i) {
        this.aspectRatioY = i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.aspectRatioX);
        parcel.writeInt(this.aspectRatioY);
    }

    public AspectRatio(int i, int i2) {
        this.aspectRatioX = i;
        this.aspectRatioY = i2;
    }
}

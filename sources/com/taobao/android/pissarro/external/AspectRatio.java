package com.taobao.android.pissarro.external;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class AspectRatio implements Parcelable, Serializable {
    public static final Parcelable.Creator<AspectRatio> CREATOR = new a();
    private int aspectRatioX;
    private int aspectRatioY;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements Parcelable.Creator<AspectRatio> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public AspectRatio createFromParcel(Parcel parcel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (AspectRatio) ipChange.ipc$dispatch("bbf1ce2a", new Object[]{this, parcel});
            }
            return new AspectRatio(parcel.readInt(), parcel.readInt());
        }

        /* renamed from: b */
        public AspectRatio[] newArray(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (AspectRatio[]) ipChange.ipc$dispatch("fbf74cd3", new Object[]{this, new Integer(i)});
            }
            return new AspectRatio[i];
        }
    }

    static {
        t2o.a(623902757);
    }

    public AspectRatio(int i, int i2) {
        this.aspectRatioX = i;
        this.aspectRatioY = i2;
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

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.aspectRatioX);
        parcel.writeInt(this.aspectRatioY);
    }
}

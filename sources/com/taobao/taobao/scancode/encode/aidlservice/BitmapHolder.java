package com.taobao.taobao.scancode.encode.aidlservice;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class BitmapHolder implements Parcelable {
    public static final Parcelable.Creator<BitmapHolder> CREATOR = new a();
    public Bitmap encodeResult;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a implements Parcelable.Creator<BitmapHolder> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public BitmapHolder createFromParcel(Parcel parcel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (BitmapHolder) ipChange.ipc$dispatch("8ce1a9c7", new Object[]{this, parcel});
            }
            return new BitmapHolder((Bitmap) Bitmap.CREATOR.createFromParcel(parcel));
        }

        /* renamed from: b */
        public BitmapHolder[] newArray(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (BitmapHolder[]) ipChange.ipc$dispatch("259ba930", new Object[]{this, new Integer(i)});
            }
            return new BitmapHolder[i];
        }
    }

    static {
        t2o.a(656408578);
    }

    public BitmapHolder(Bitmap bitmap) {
        this.encodeResult = bitmap;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void readFromParcel(Parcel parcel) {
        this.encodeResult = (Bitmap) Bitmap.CREATOR.createFromParcel(parcel);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        this.encodeResult.writeToParcel(parcel, i);
    }
}

package com.taobao.taopai2.material.business.res;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taopai2.material.business.musicdetail.MusicItemBean;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class MusicResource extends MusicItemBean {
    public static final Parcelable.Creator<MusicResource> CREATOR = new a();
    public String musicPath;
    public String musicWavePath;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a implements Parcelable.Creator<MusicResource> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public MusicResource createFromParcel(Parcel parcel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (MusicResource) ipChange.ipc$dispatch("e6d3efd7", new Object[]{this, parcel});
            }
            return new MusicResource(parcel);
        }

        /* renamed from: b */
        public MusicResource[] newArray(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (MusicResource[]) ipChange.ipc$dispatch("8c400bc0", new Object[]{this, new Integer(i)});
            }
            return new MusicResource[i];
        }
    }

    static {
        t2o.a(782237905);
    }

    public MusicResource() {
    }

    @Override // com.taobao.taopai2.material.business.musicdetail.MusicItemBean, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.taobao.taopai2.material.business.musicdetail.MusicItemBean, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.musicPath);
        parcel.writeString(this.musicWavePath);
    }

    public MusicResource(Parcel parcel) {
        super(parcel);
        this.musicPath = parcel.readString();
        this.musicWavePath = parcel.readString();
    }
}

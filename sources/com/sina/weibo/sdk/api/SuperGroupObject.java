package com.sina.weibo.sdk.api;

import android.os.Parcel;
import android.os.Parcelable;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class SuperGroupObject extends MediaObject {
    public static final Parcelable.Creator<SuperGroupObject> CREATOR = new Parcelable.Creator<SuperGroupObject>() { // from class: com.sina.weibo.sdk.api.SuperGroupObject.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SuperGroupObject createFromParcel(Parcel parcel) {
            return new SuperGroupObject(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SuperGroupObject[] newArray(int i) {
            return new SuperGroupObject[i];
        }
    };
    public String secName;
    public String sgExtParam;
    public String sgName;

    static {
        t2o.a(988807192);
    }

    public SuperGroupObject() {
    }

    @Override // com.sina.weibo.sdk.api.MediaObject, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.sina.weibo.sdk.api.MediaObject, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.sgName);
        parcel.writeString(this.secName);
        parcel.writeString(this.sgExtParam);
    }

    public SuperGroupObject(Parcel parcel) {
        this.sgName = parcel.readString();
        this.secName = parcel.readString();
        this.sgExtParam = parcel.readString();
    }
}

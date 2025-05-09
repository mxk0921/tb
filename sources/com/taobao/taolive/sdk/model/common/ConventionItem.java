package com.taobao.taolive.sdk.model.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ConventionItem implements INetDataObject, Parcelable {
    public static final Parcelable.Creator<ConventionItem> CREATOR = new a();
    public String content;
    public String mockNick;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a implements Parcelable.Creator<ConventionItem> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public ConventionItem createFromParcel(Parcel parcel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ConventionItem) ipChange.ipc$dispatch("b569975", new Object[]{this, parcel});
            }
            return new ConventionItem(parcel);
        }

        /* renamed from: b */
        public ConventionItem[] newArray(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ConventionItem[]) ipChange.ipc$dispatch("5ff711de", new Object[]{this, new Integer(i)});
            }
            return new ConventionItem[i];
        }
    }

    static {
        t2o.a(806356212);
        t2o.a(806355930);
    }

    public ConventionItem() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mockNick);
        parcel.writeString(this.content);
    }

    public ConventionItem(Parcel parcel) {
        this.mockNick = parcel.readString();
        this.content = parcel.readString();
    }
}

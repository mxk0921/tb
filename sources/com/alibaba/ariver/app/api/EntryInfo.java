package com.alibaba.ariver.app.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class EntryInfo implements Parcelable {
    public static final Parcelable.Creator<EntryInfo> CREATOR = new Parcelable.Creator<EntryInfo>() { // from class: com.alibaba.ariver.app.api.EntryInfo.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public EntryInfo createFromParcel(Parcel parcel) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (EntryInfo) ipChange.ipc$dispatch("3dc64494", new Object[]{this, parcel}) : new EntryInfo(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public EntryInfo[] newArray(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (EntryInfo[]) ipChange.ipc$dispatch("165db8bd", new Object[]{this, new Integer(i)}) : new EntryInfo[i];
        }
    };
    public String desc;
    public JSONObject extraInfo;
    public String iconUrl;
    public boolean isOffline;
    public String slogan;
    public String title;

    public EntryInfo() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "EntryInfo{title='" + this.title + "', iconUrl='" + this.iconUrl + "', slogan='" + this.slogan + "', desc='" + this.desc + "', extraInfo='" + this.extraInfo + "'}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.iconUrl);
        parcel.writeString(this.slogan);
        parcel.writeString(this.desc);
        parcel.writeByte((byte) (!this.isOffline ? 1 : 0));
        parcel.writeSerializable(this.extraInfo);
    }

    public EntryInfo(String str, String str2, String str3, boolean z) {
        this.title = str;
        this.iconUrl = str2;
        this.slogan = str3;
        this.isOffline = z;
    }

    public EntryInfo(Parcel parcel) {
        this.title = parcel.readString();
        this.iconUrl = parcel.readString();
        this.slogan = parcel.readString();
        this.desc = parcel.readString();
        this.isOffline = parcel.readByte() != 1 ? false : true;
        this.extraInfo = (JSONObject) parcel.readSerializable();
    }
}

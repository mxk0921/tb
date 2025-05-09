package com.taobao.live.timemove.video.videoitem.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import java.util.ArrayList;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class AccountInfo implements INetDataObject, Parcelable {
    public static final Parcelable.Creator<AccountInfo> CREATOR = new a();
    public static final String TYPE_DAREN = "daren";
    public static final String TYPE_SHOP = "shop";
    public String accountDes;
    public String accountExplain;
    public String accountId;
    public String accountInfoNewUrl;
    public String accountInfoUrl;
    public String accountIntroduce;
    public String accountName;
    public boolean anchorGuard;
    public String anchorSideKey;
    public Atmosphere atmosphere;
    public String backGroundImg;
    public JSONObject clickMaidian;
    public long fansNum;
    public boolean follow;
    public String headImg;
    public String jumpUrl;
    public long lastTime;
    public long lastVideoId;
    public String ratingPicUrl;
    public String shopName;
    public String shopUrl;
    public JSONObject showMaidian;
    public int status;
    public String strDes;
    public String subAccountName;
    public boolean subscribe;
    public JSONObject tag;
    public boolean taoKe;
    public String tidbitsUrl;
    public boolean tmall;
    public String tmallHomepageUrl;
    public String topicId;
    public String topicShowImage;
    public String topicTitle;
    public String trackInfo;
    public String type;
    public String typeLogo;
    public ArrayList<String> types;
    public String url;
    public boolean v;
    public String wangwangLink;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class Atmosphere implements INetDataObject, Parcelable {
        public static final Parcelable.Creator<Atmosphere> CREATOR = new a();
        public String headIcon;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
        public static class a implements Parcelable.Creator<Atmosphere> {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a */
            public Atmosphere createFromParcel(Parcel parcel) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Atmosphere) ipChange.ipc$dispatch("982dec48", new Object[]{this, parcel});
                }
                return new Atmosphere(parcel);
            }

            /* renamed from: b */
            public Atmosphere[] newArray(int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Atmosphere[]) ipChange.ipc$dispatch("e6e84371", new Object[]{this, new Integer(i)});
                }
                return new Atmosphere[i];
            }
        }

        static {
            t2o.a(779092204);
            t2o.a(806355930);
        }

        public Atmosphere() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.headIcon);
        }

        public Atmosphere(Parcel parcel) {
            this.headIcon = parcel.readString();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a implements Parcelable.Creator<AccountInfo> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public AccountInfo createFromParcel(Parcel parcel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (AccountInfo) ipChange.ipc$dispatch("31809668", new Object[]{this, parcel});
            }
            return new AccountInfo(parcel);
        }

        /* renamed from: b */
        public AccountInfo[] newArray(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (AccountInfo[]) ipChange.ipc$dispatch("edb51edf", new Object[]{this, new Integer(i)});
            }
            return new AccountInfo[i];
        }
    }

    static {
        t2o.a(779092202);
        t2o.a(806355930);
    }

    public AccountInfo() {
        this.lastTime = 0L;
        this.lastVideoId = 0L;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.accountId);
        parcel.writeString(this.accountName);
        parcel.writeString(this.accountDes);
        parcel.writeString(this.accountExplain);
        parcel.writeString(this.accountIntroduce);
        parcel.writeString(this.url);
        parcel.writeString(this.jumpUrl);
        parcel.writeString(this.wangwangLink);
        parcel.writeString(this.type);
        parcel.writeString(this.headImg);
        parcel.writeString(this.typeLogo);
        parcel.writeInt(this.status);
        parcel.writeByte(this.v ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.follow ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.subscribe ? (byte) 1 : (byte) 0);
        parcel.writeString(this.strDes);
        parcel.writeString(this.backGroundImg);
        parcel.writeLong(this.lastTime);
        parcel.writeLong(this.lastVideoId);
        parcel.writeString(this.accountInfoUrl);
        parcel.writeString(this.tidbitsUrl);
        parcel.writeByte(this.tmall ? (byte) 1 : (byte) 0);
        parcel.writeString(this.shopUrl);
        parcel.writeString(this.tmallHomepageUrl);
        parcel.writeString(this.subAccountName);
        parcel.writeString(this.ratingPicUrl);
        parcel.writeString(this.shopName);
        parcel.writeLong(this.fansNum);
        parcel.writeByte(this.anchorGuard ? (byte) 1 : (byte) 0);
        parcel.writeString(this.topicId);
        parcel.writeString(this.topicTitle);
        parcel.writeString(this.topicShowImage);
        parcel.writeParcelable(this.atmosphere, i);
        parcel.writeList(this.types);
        parcel.writeValue(this.tag);
        parcel.writeValue(this.clickMaidian);
        parcel.writeValue(this.showMaidian);
        parcel.writeString(this.trackInfo);
    }

    public AccountInfo(Parcel parcel) {
        this.lastTime = 0L;
        this.lastVideoId = 0L;
        this.accountId = parcel.readString();
        this.accountName = parcel.readString();
        this.accountDes = parcel.readString();
        this.accountExplain = parcel.readString();
        this.accountIntroduce = parcel.readString();
        this.url = parcel.readString();
        this.jumpUrl = parcel.readString();
        this.wangwangLink = parcel.readString();
        this.type = parcel.readString();
        this.headImg = parcel.readString();
        this.typeLogo = parcel.readString();
        this.status = parcel.readInt();
        boolean z = false;
        this.v = parcel.readByte() != 0;
        this.follow = parcel.readByte() != 0;
        this.subscribe = parcel.readByte() != 0;
        this.strDes = parcel.readString();
        this.backGroundImg = parcel.readString();
        this.lastTime = parcel.readLong();
        this.lastVideoId = parcel.readLong();
        this.accountInfoUrl = parcel.readString();
        this.tidbitsUrl = parcel.readString();
        this.tmall = parcel.readByte() != 0;
        this.shopUrl = parcel.readString();
        this.tmallHomepageUrl = parcel.readString();
        this.subAccountName = parcel.readString();
        this.ratingPicUrl = parcel.readString();
        this.shopName = parcel.readString();
        this.fansNum = parcel.readLong();
        this.anchorGuard = parcel.readByte() != 0 ? true : z;
        this.topicId = parcel.readString();
        this.topicTitle = parcel.readString();
        this.topicShowImage = parcel.readString();
        this.atmosphere = (Atmosphere) parcel.readParcelable(Atmosphere.class.getClassLoader());
        this.types = parcel.readArrayList(String.class.getClassLoader());
        this.tag = (JSONObject) parcel.readValue(JSONObject.class.getClassLoader());
        this.clickMaidian = (JSONObject) parcel.readValue(JSONObject.class.getClassLoader());
        this.showMaidian = (JSONObject) parcel.readValue(JSONObject.class.getClassLoader());
        this.trackInfo = parcel.readString();
    }
}

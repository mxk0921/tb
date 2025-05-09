package com.taobao.taolive.sdk.model.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class MillionbabyInfo implements INetDataObject, Parcelable {
    public static final Parcelable.Creator<MillionbabyInfo> CREATOR = new a();
    public boolean answerUseWeex;
    public String answerWeexUrl;
    public boolean canAnswer;
    public String gameId;
    public String icon;
    public String inviteCode;
    public PlayerSetting playerSetting;
    public int resurrectionCardNum;
    public String sk;
    public String unlimitCardNum;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class PlayerSetting implements INetDataObject, Parcelable {
        public static final Parcelable.Creator<PlayerSetting> CREATOR = new a();
        public String maxFastPlay;
        public String maxNormalPlay;
        public String minNormalPlay;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public static class a implements Parcelable.Creator<PlayerSetting> {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a */
            public PlayerSetting createFromParcel(Parcel parcel) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (PlayerSetting) ipChange.ipc$dispatch("48766982", new Object[]{this, parcel});
                }
                return new PlayerSetting(parcel);
            }

            /* renamed from: b */
            public PlayerSetting[] newArray(int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (PlayerSetting[]) ipChange.ipc$dispatch("4aaf1f9", new Object[]{this, new Integer(i)});
                }
                return new PlayerSetting[i];
            }
        }

        static {
            t2o.a(806356242);
            t2o.a(806355930);
        }

        public PlayerSetting() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.maxNormalPlay);
            parcel.writeString(this.minNormalPlay);
            parcel.writeString(this.maxFastPlay);
        }

        public PlayerSetting(Parcel parcel) {
            this.maxNormalPlay = parcel.readString();
            this.minNormalPlay = parcel.readString();
            this.maxFastPlay = parcel.readString();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a implements Parcelable.Creator<MillionbabyInfo> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public MillionbabyInfo createFromParcel(Parcel parcel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (MillionbabyInfo) ipChange.ipc$dispatch("11b7fa0d", new Object[]{this, parcel});
            }
            return new MillionbabyInfo(parcel);
        }

        /* renamed from: b */
        public MillionbabyInfo[] newArray(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (MillionbabyInfo[]) ipChange.ipc$dispatch("51268ec4", new Object[]{this, new Integer(i)});
            }
            return new MillionbabyInfo[i];
        }
    }

    static {
        t2o.a(806356240);
        t2o.a(806355930);
    }

    public MillionbabyInfo() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.answerUseWeex ? (byte) 1 : (byte) 0);
        parcel.writeString(this.answerWeexUrl);
        parcel.writeByte(this.canAnswer ? (byte) 1 : (byte) 0);
        parcel.writeString(this.icon);
        parcel.writeString(this.inviteCode);
        parcel.writeParcelable(this.playerSetting, i);
        parcel.writeString(this.unlimitCardNum);
        parcel.writeInt(this.resurrectionCardNum);
        parcel.writeString(this.sk);
        parcel.writeString(this.gameId);
    }

    public MillionbabyInfo(Parcel parcel) {
        boolean z = false;
        this.answerUseWeex = parcel.readByte() != 0;
        this.answerWeexUrl = parcel.readString();
        this.canAnswer = parcel.readByte() != 0 ? true : z;
        this.icon = parcel.readString();
        this.inviteCode = parcel.readString();
        this.playerSetting = (PlayerSetting) parcel.readParcelable(PlayerSetting.class.getClassLoader());
        this.unlimitCardNum = parcel.readString();
        this.resurrectionCardNum = parcel.readInt();
        this.sk = parcel.readString();
        this.gameId = parcel.readString();
    }
}

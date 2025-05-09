package com.taobao.taolive.sdk.model.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
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
    public List<BroadCasterTag> broadCasterTags;
    public String encodeAccountId;
    public long fansNum;
    public boolean follow;
    public boolean frameLockForbidden;
    public String headImg;
    public String jumpUrl;
    public long lastTime;
    public long lastVideoId;
    public Map<String, String> profileJumpConfig;
    public String ratingPicUrl;
    public String shopId;
    public String shopName;
    public String shopUrl;
    public int status;
    public String strDes;
    public String subAccountName;
    public boolean subscribe;
    public boolean taoKe;
    public String tidbitsUrl;
    public boolean tmall;
    public String tmallHomepageUrl;
    public boolean topFollow;
    public String topicId;
    public String topicShowImage;
    public String topicTitle;
    public String type;
    public String typeLogo;
    public ArrayList<String> types;
    public String url;
    public boolean v;
    public List<BroadCasterTag> viconInfos;
    public List<String> vicons;
    public String wangwangLink;
    public WidgetTip widgetTip;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class Atmosphere implements INetDataObject, Parcelable {
        public static final Parcelable.Creator<Atmosphere> CREATOR = new a();
        public String headIcon;
        public String headIconForLight;
        public boolean questionChallenge;
        public String questionExplain;
        public String questionUrl;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public static class a implements Parcelable.Creator<Atmosphere> {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a */
            public Atmosphere createFromParcel(Parcel parcel) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Atmosphere) ipChange.ipc$dispatch("c22a956e", new Object[]{this, parcel});
                }
                return new Atmosphere(parcel);
            }

            /* renamed from: b */
            public Atmosphere[] newArray(int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Atmosphere[]) ipChange.ipc$dispatch("5ae494d7", new Object[]{this, new Integer(i)});
                }
                return new Atmosphere[i];
            }
        }

        static {
            t2o.a(806356203);
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
            parcel.writeString(this.headIconForLight);
            parcel.writeByte(this.questionChallenge ? (byte) 1 : (byte) 0);
            parcel.writeString(this.questionUrl);
            parcel.writeString(this.questionExplain);
        }

        public Atmosphere(Parcel parcel) {
            this.headIcon = parcel.readString();
            this.headIconForLight = parcel.readString();
            this.questionChallenge = parcel.readByte() != 0;
            this.questionUrl = parcel.readString();
            this.questionExplain = parcel.readString();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class BroadCasterTag implements Parcelable {
        public static final Parcelable.Creator<BroadCasterTag> CREATOR = new a();
        public String icon;
        public boolean isAccountTag;
        public String jumpUrl;
        public String showTime;
        public String text;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public static class a implements Parcelable.Creator<BroadCasterTag> {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a */
            public BroadCasterTag createFromParcel(Parcel parcel) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (BroadCasterTag) ipChange.ipc$dispatch("417241e4", new Object[]{this, parcel});
                }
                return new BroadCasterTag(parcel);
            }

            /* renamed from: b */
            public BroadCasterTag[] newArray(int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (BroadCasterTag[]) ipChange.ipc$dispatch("e4dc64cd", new Object[]{this, new Integer(i)});
                }
                return new BroadCasterTag[i];
            }
        }

        static {
            t2o.a(806356205);
        }

        public BroadCasterTag() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public void readFromParcel(Parcel parcel) {
            boolean z;
            this.showTime = parcel.readString();
            this.icon = parcel.readString();
            this.text = parcel.readString();
            this.jumpUrl = parcel.readString();
            if (parcel.readByte() != 0) {
                z = true;
            } else {
                z = false;
            }
            this.isAccountTag = z;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.showTime);
            parcel.writeString(this.icon);
            parcel.writeString(this.text);
            parcel.writeString(this.jumpUrl);
            parcel.writeByte(this.isAccountTag ? (byte) 1 : (byte) 0);
        }

        public BroadCasterTag(Parcel parcel) {
            this.showTime = parcel.readString();
            this.icon = parcel.readString();
            this.text = parcel.readString();
            this.jumpUrl = parcel.readString();
            this.isAccountTag = parcel.readByte() != 0;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class ComponentData implements Parcelable {
        public static final Parcelable.Creator<ComponentData> CREATOR = new a();
        public String componentName;
        public Map<String, String> params;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public static class a implements Parcelable.Creator<ComponentData> {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a */
            public ComponentData createFromParcel(Parcel parcel) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (ComponentData) ipChange.ipc$dispatch("b6060c9f", new Object[]{this, parcel});
                }
                return new ComponentData(parcel);
            }

            /* renamed from: b */
            public ComponentData[] newArray(int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (ComponentData[]) ipChange.ipc$dispatch("aac76896", new Object[]{this, new Integer(i)});
                }
                return new ComponentData[i];
            }
        }

        static {
            t2o.a(806356207);
        }

        public ComponentData() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.componentName);
            parcel.writeInt(this.params.size());
            for (Map.Entry<String, String> entry : this.params.entrySet()) {
                parcel.writeString(entry.getKey());
                parcel.writeString(entry.getValue());
            }
        }

        public ComponentData(Parcel parcel) {
            this.componentName = parcel.readString();
            int readInt = parcel.readInt();
            this.params = new HashMap(readInt);
            for (int i = 0; i < readInt; i++) {
                this.params.put(parcel.readString(), parcel.readString());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class WidgetTip implements Parcelable {
        public static final Parcelable.Creator<WidgetTip> CREATOR = new a();
        public ComponentData componentData;
        public String jumpType;
        public boolean showWidgetTip;
        public boolean widgetAddition;
        public String widgetJumpUrl;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public static class a implements Parcelable.Creator<WidgetTip> {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a */
            public WidgetTip createFromParcel(Parcel parcel) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (WidgetTip) ipChange.ipc$dispatch("c3f27aaf", new Object[]{this, parcel});
                }
                return new WidgetTip(parcel);
            }

            /* renamed from: b */
            public WidgetTip[] newArray(int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (WidgetTip[]) ipChange.ipc$dispatch("23b66a26", new Object[]{this, new Integer(i)});
                }
                return new WidgetTip[i];
            }
        }

        static {
            t2o.a(806356209);
        }

        public WidgetTip() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeByte(this.widgetAddition ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.showWidgetTip ? (byte) 1 : (byte) 0);
            parcel.writeString(this.widgetJumpUrl);
            parcel.writeString(this.jumpType);
            parcel.writeParcelable(this.componentData, i);
        }

        public WidgetTip(Parcel parcel) {
            boolean z = false;
            this.widgetAddition = parcel.readByte() != 0;
            this.showWidgetTip = parcel.readByte() != 0 ? true : z;
            this.widgetJumpUrl = parcel.readString();
            this.jumpType = parcel.readString();
            this.componentData = (ComponentData) parcel.readParcelable(ComponentData.class.getClassLoader());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a implements Parcelable.Creator<AccountInfo> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public AccountInfo createFromParcel(Parcel parcel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (AccountInfo) ipChange.ipc$dispatch("64122902", new Object[]{this, parcel});
            }
            return new AccountInfo(parcel);
        }

        /* renamed from: b */
        public AccountInfo[] newArray(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (AccountInfo[]) ipChange.ipc$dispatch("d17db139", new Object[]{this, new Integer(i)});
            }
            return new AccountInfo[i];
        }
    }

    static {
        t2o.a(806356201);
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
        parcel.writeString(this.encodeAccountId);
        parcel.writeString(this.shopId);
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
        parcel.writeByte(this.frameLockForbidden ? (byte) 1 : (byte) 0);
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
        parcel.writeList(this.broadCasterTags);
        parcel.writeStringList(this.vicons);
        parcel.writeParcelable(this.widgetTip, i);
        parcel.writeInt(this.profileJumpConfig.size());
        for (Map.Entry<String, String> entry : this.profileJumpConfig.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeString(entry.getValue());
        }
    }

    public AccountInfo(Parcel parcel) {
        this.lastTime = 0L;
        this.lastVideoId = 0L;
        this.accountId = parcel.readString();
        this.encodeAccountId = parcel.readString();
        this.shopId = parcel.readString();
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
        boolean z = true;
        this.v = parcel.readByte() != 0;
        this.follow = parcel.readByte() != 0;
        this.subscribe = parcel.readByte() != 0;
        this.frameLockForbidden = parcel.readByte() != 0;
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
        this.anchorGuard = parcel.readByte() == 0 ? false : z;
        this.topicId = parcel.readString();
        this.topicTitle = parcel.readString();
        this.topicShowImage = parcel.readString();
        this.atmosphere = (Atmosphere) parcel.readParcelable(Atmosphere.class.getClassLoader());
        this.types = parcel.readArrayList(String.class.getClassLoader());
        ArrayList arrayList = new ArrayList();
        this.broadCasterTags = arrayList;
        parcel.readList(arrayList, BroadCasterTag.class.getClassLoader());
        this.vicons = parcel.createStringArrayList();
        this.widgetTip = (WidgetTip) parcel.readParcelable(WidgetTip.class.getClassLoader());
        int readInt = parcel.readInt();
        this.profileJumpConfig = new HashMap(readInt);
        for (int i = 0; i < readInt; i++) {
            this.profileJumpConfig.put(parcel.readString(), parcel.readString());
        }
    }
}

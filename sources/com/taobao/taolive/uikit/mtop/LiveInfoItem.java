package com.taobao.taolive.uikit.mtop;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.frr;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class LiveInfoItem implements IMTOPDataObject, Parcelable {
    public static final int APPROVAL_APPROVALED = 1;
    public static final int APPROVAL_APPROVALED_AND_TO_HOME_PAGE = 5;
    public static final int APPROVAL_DENIED = 2;
    public static final int APPROVAL_NOT_YET = 0;
    public static final int APPROVAL_TO_HOME_PAGE = 4;
    public static final Parcelable.Creator<LiveInfoItem> CREATOR = new a();
    public static final int PRELIVE_STATUS_DELETE = 1002;
    public static final int PRELIVE_STATUS_NORMAL = 1000;
    public static final int PRELIVE_STATUS_STARTED = 1001;
    public static final int ROOM_STATUS_END = 2;
    public static final int ROOM_STATUS_LIVE = 1;
    public static final int ROOM_STATUS_NOTSTART = 0;
    public static final int ROOM_TYPE_1111 = 1;
    public static final int ROOM_TYPE_1212 = 3;
    public static final int ROOM_TYPE_NORMAL = 0;
    public static final int ROOM_TYPE_PURCHASE = 2;
    public static final int ROOM_TYPE_YEAR = 4;
    public static final int STATUS_APPOINTMENT = 2;
    public static final int STATUS_END = 1;
    public static final int STATUS_LIVE = 0;
    public static final int STATUS_NOTSTART = 4;
    public static final int STATUS_NOT_EXIST = -1;
    public static final int STATUS_PAUSE = 3;
    public static final int STREAM_STATUS_NOTPUSH = 0;
    public static final int STREAM_STATUS_PUSH = 1;
    public SimpleAccountInfo accountDO;
    public long accountId;
    public String actionType;
    public long appointmentTime;
    public String connectLocation;
    public String coverImg;
    public String favorIcon;
    public String favorImg;
    public ArrayList<GoodItem> goodsList;
    public boolean h265;
    public String id;
    public boolean isInJinXuan;
    public boolean isOnLook;
    public int joinCount;
    public boolean landScape;
    public String liveChannelId;
    public String liveColumnId;
    public long liveId;
    public String liveUrl;
    public String liveUrlHls;
    public List<QualitySelectItem> liveUrlList;
    public String location;
    public String matchType;
    public String mediaConfig;
    public String nativeFeedDetailUrl;
    public String pid;
    public int praiseCount;
    public long preLiveId;
    public boolean rateAdapte;
    public String replayUrl;
    public int roomStatus;
    public String scm;
    public boolean shownOnceFlg;
    public String spm;
    public int status;
    public int tagIndex;
    public String title;
    public int totalJoinCount;
    public String trackInfo;
    public int type;
    public boolean useArtp;
    public String videoId;
    public String videoPlayUrl;
    public long viewCount;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a implements Parcelable.Creator<LiveInfoItem> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public LiveInfoItem createFromParcel(Parcel parcel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (LiveInfoItem) ipChange.ipc$dispatch("15f045fb", new Object[]{this, parcel});
            }
            return new LiveInfoItem(parcel);
        }

        /* renamed from: b */
        public LiveInfoItem[] newArray(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (LiveInfoItem[]) ipChange.ipc$dispatch("ad003764", new Object[]{this, new Integer(i)});
            }
            return new LiveInfoItem[i];
        }
    }

    static {
        t2o.a(779093626);
        t2o.a(589299906);
    }

    public LiveInfoItem() {
        this.isOnLook = false;
        this.viewCount = 1L;
        this.tagIndex = -1;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getDefalutQualityIndex() {
        List<QualitySelectItem> list = this.liveUrlList;
        if (list == null || list.size() <= 0) {
            return -1;
        }
        if (this.liveUrlList.size() == 1) {
            return 0;
        }
        if (this.liveUrlList.size() >= 2) {
            return 1;
        }
        return -1;
    }

    public String getLiveUrl() {
        int defalutQualityIndex = getDefalutQualityIndex();
        if (defalutQualityIndex == -1) {
            return this.liveUrl;
        }
        String str = this.liveUrlList.get(defalutQualityIndex).h265Url;
        if (TextUtils.isEmpty(str) || !frr.t()) {
            return this.liveUrlList.get(defalutQualityIndex).flvUrl;
        }
        return str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeInt(this.type);
        parcel.writeInt(this.status);
        parcel.writeString(this.title);
        parcel.writeString(this.coverImg);
        parcel.writeLong(this.viewCount);
        parcel.writeInt(this.joinCount);
        parcel.writeInt(this.totalJoinCount);
        parcel.writeString(this.replayUrl);
        parcel.writeString(this.liveUrl);
        parcel.writeString(this.nativeFeedDetailUrl);
        parcel.writeParcelable(this.accountDO, i);
        parcel.writeString(this.location);
        parcel.writeString(this.connectLocation);
        parcel.writeList(this.goodsList);
        parcel.writeString(this.trackInfo);
        parcel.writeString(this.scm);
        parcel.writeString(this.spm);
        parcel.writeInt(this.praiseCount);
        parcel.writeString(this.matchType);
        parcel.writeByte(this.shownOnceFlg ? (byte) 1 : (byte) 0);
        parcel.writeList(this.liveUrlList);
        parcel.writeString(this.favorImg);
        parcel.writeString(this.favorIcon);
        parcel.writeLong(this.appointmentTime);
        parcel.writeString(this.actionType);
        parcel.writeString(this.liveChannelId);
        parcel.writeString(this.liveColumnId);
        parcel.writeString(this.pid);
        parcel.writeInt(this.tagIndex);
        parcel.writeLong(this.preLiveId);
        parcel.writeString(this.liveUrlHls);
        parcel.writeString(this.videoPlayUrl);
        parcel.writeByte(this.isInJinXuan ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isOnLook ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.landScape ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.roomStatus);
        parcel.writeString(this.videoId);
        parcel.writeLong(this.liveId);
        parcel.writeLong(this.accountId);
    }

    public LiveInfoItem(Parcel parcel) {
        boolean z = false;
        this.isOnLook = false;
        this.viewCount = 1L;
        this.tagIndex = -1;
        this.id = parcel.readString();
        this.type = parcel.readInt();
        this.status = parcel.readInt();
        this.title = parcel.readString();
        this.coverImg = parcel.readString();
        this.viewCount = parcel.readLong();
        this.joinCount = parcel.readInt();
        this.totalJoinCount = parcel.readInt();
        this.replayUrl = parcel.readString();
        this.liveUrl = parcel.readString();
        this.nativeFeedDetailUrl = parcel.readString();
        this.accountDO = (SimpleAccountInfo) parcel.readParcelable(LiveInfoItem.class.getClassLoader());
        this.location = parcel.readString();
        this.connectLocation = parcel.readString();
        this.goodsList = parcel.readArrayList(LiveInfoItem.class.getClassLoader());
        this.trackInfo = parcel.readString();
        this.scm = parcel.readString();
        this.spm = parcel.readString();
        this.praiseCount = parcel.readInt();
        this.matchType = parcel.readString();
        this.shownOnceFlg = parcel.readByte() != 0;
        this.liveUrlList = parcel.readArrayList(LiveInfoItem.class.getClassLoader());
        this.favorImg = parcel.readString();
        this.favorIcon = parcel.readString();
        this.appointmentTime = parcel.readLong();
        this.actionType = parcel.readString();
        this.liveChannelId = parcel.readString();
        this.liveColumnId = parcel.readString();
        this.pid = parcel.readString();
        this.tagIndex = parcel.readInt();
        this.preLiveId = parcel.readLong();
        this.liveUrlHls = parcel.readString();
        this.videoPlayUrl = parcel.readString();
        this.isInJinXuan = parcel.readByte() != 0;
        this.isOnLook = parcel.readByte() != 0;
        this.landScape = parcel.readByte() != 0 ? true : z;
        this.roomStatus = parcel.readInt();
        this.videoId = parcel.readString();
        this.liveId = parcel.readLong();
        this.accountId = parcel.readLong();
    }
}

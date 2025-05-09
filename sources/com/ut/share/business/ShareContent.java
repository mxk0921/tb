package com.ut.share.business;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ShareContent implements Parcelable {
    public static final Parcelable.Creator<ShareContent> CREATOR = new Parcelable.Creator<ShareContent>() { // from class: com.ut.share.business.ShareContent.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ShareContent createFromParcel(Parcel parcel) {
            boolean z = true;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ShareContent) ipChange.ipc$dispatch("2a5098f7", new Object[]{this, parcel});
            }
            ShareContent shareContent = new ShareContent();
            shareContent.businessId = parcel.readString();
            shareContent.suId = parcel.readString();
            shareContent.shareId = parcel.readString();
            shareContent.title = parcel.readString();
            shareContent.description = parcel.readString();
            shareContent.imageUrl = parcel.readString();
            shareContent.url = parcel.readString();
            shareContent.shareScene = parcel.readString();
            shareContent.wwMsgType = WWMessageType.getEnum(parcel.readString());
            shareContent.weixinMsgType = parcel.readString();
            shareContent.weixinAppId = parcel.readString();
            shareContent.isActivity = parcel.readString();
            shareContent.needSaveContent = parcel.readString();
            shareContent.snapshotImages = parcel.readArrayList(List.class.getClassLoader());
            shareContent.headUrl = parcel.readString();
            shareContent.disableQrcode = parcel.readByte() != 0;
            shareContent.disableTextInfo = parcel.readByte() != 0;
            if (parcel.readByte() == 0) {
                z = false;
            }
            shareContent.disableHeadUrl = z;
            shareContent.qrConfig = JSON.parseObject(parcel.readString());
            shareContent.popType = TaoPasswordPopType.findType(parcel.readString());
            shareContent.popUrl = parcel.readString();
            parcel.readMap(shareContent.activityParams, Map.class.getClassLoader());
            parcel.readMap(shareContent.templateParams, Map.class.getClassLoader());
            parcel.readMap(shareContent.extraParams, Map.class.getClassLoader());
            shareContent.mediaPublisher = (TBShareMediaPublisher) parcel.readParcelable(TBShareMediaPublisher.class.getClassLoader());
            shareContent.mediaInfo = (TBShareMediaInfo) parcel.readParcelable(TBShareMediaInfo.class.getClassLoader());
            return shareContent;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ShareContent[] newArray(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ShareContent[]) ipChange.ipc$dispatch("23590360", new Object[]{this, new Integer(i)}) : new ShareContent[i];
        }
    };
    public Map<String, String> activityParams;
    public String businessId;
    public Map<String, String> businessInfo;
    public String contentType;
    public String description;
    public boolean disableBackToClient;
    public Map<String, String> extendParams;
    @Deprecated
    public Map<String, String> extraParams;
    public String headUrl;
    @Deprecated
    public Bitmap imageSoure;
    public String imageUrl;
    public String isActivity;
    public Map<String, String> markMap;
    public TBShareMediaInfo mediaInfo;
    public TBShareMediaPublisher mediaPublisher;
    public String needSaveContent;
    public List<String> phoneNumberList;
    public String popUrl;
    public JSONObject qrConfig;
    public String qrTipsText;
    public String shareId;
    @Deprecated
    public String shareScene;
    public String smsTemplate;
    public List<String> snapshotImages;
    public String suId;
    public String templateId;
    public Map<String, Object> templateParams;
    public String title;
    public String url;
    public String weixinAppId;
    public String weixinMsgType;
    public WWMessageType wwMsgType;
    public boolean disableQrcode = false;
    public boolean disableTextInfo = false;
    public boolean disableHeadUrl = false;
    public String maskAlpha = "";
    public TaoPasswordPopType popType = TaoPasswordPopType.NONE;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public enum TaoPasswordPopType {
        WEEX("weex"),
        NONE("");
        
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public String name;

        TaoPasswordPopType(String str) {
            this.name = str;
        }

        public static TaoPasswordPopType findType(String str) {
            TaoPasswordPopType[] values;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TaoPasswordPopType) ipChange.ipc$dispatch("aa74015a", new Object[]{str});
            }
            for (TaoPasswordPopType taoPasswordPopType : values()) {
                if (taoPasswordPopType.name.equals(str)) {
                    return taoPasswordPopType;
                }
            }
            return NONE;
        }

        public static /* synthetic */ Object ipc$super(TaoPasswordPopType taoPasswordPopType, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ut/share/business/ShareContent$TaoPasswordPopType");
        }

        public static TaoPasswordPopType valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TaoPasswordPopType) ipChange.ipc$dispatch("f598306f", new Object[]{str});
            }
            return (TaoPasswordPopType) Enum.valueOf(TaoPasswordPopType.class, str);
        }

        public String getName() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
            }
            return this.name;
        }
    }

    static {
        t2o.a(663748646);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.businessId);
        parcel.writeString(this.suId);
        parcel.writeString(this.shareId);
        parcel.writeString(this.title);
        parcel.writeString(this.description);
        parcel.writeString(this.imageUrl);
        parcel.writeString(this.url);
        parcel.writeString(this.shareScene);
        parcel.writeString(this.wwMsgType.getValue());
        parcel.writeString(this.weixinMsgType);
        parcel.writeString(this.weixinAppId);
        parcel.writeString(this.isActivity);
        parcel.writeString(this.needSaveContent);
        parcel.writeMap(this.activityParams);
        parcel.writeMap(this.templateParams);
        parcel.writeMap(this.extraParams);
        parcel.writeList(this.snapshotImages);
        parcel.writeString(this.headUrl);
        parcel.writeByte(this.disableQrcode ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.disableTextInfo ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.disableHeadUrl ? (byte) 1 : (byte) 0);
        parcel.writeString(JSON.toJSONString(this.qrConfig));
        parcel.writeString(this.popType.name);
        parcel.writeString(this.popUrl);
        parcel.writeParcelable(this.mediaPublisher, i);
        parcel.writeParcelable(this.mediaInfo, i);
    }
}

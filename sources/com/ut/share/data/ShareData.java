package com.ut.share.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ShareData implements Parcelable {
    public static final Parcelable.Creator<ShareData> CREATOR = new Parcelable.Creator<ShareData>() { // from class: com.ut.share.data.ShareData.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ShareData createFromParcel(Parcel parcel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ShareData) ipChange.ipc$dispatch("f2abc732", new Object[]{this, parcel});
            }
            ShareData shareData = new ShareData();
            shareData.setBusinessId(parcel.readString());
            shareData.setTitle(parcel.readString());
            shareData.setText(parcel.readString());
            shareData.setLink(parcel.readString());
            shareData.setImageUrl(parcel.readString());
            shareData.setImagePath(parcel.readString());
            shareData.setType(MessageType.values()[parcel.readInt()]);
            shareData.setPrice(parcel.readFloat());
            shareData.setBizType(parcel.readString());
            return shareData;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ShareData[] newArray(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ShareData[]) ipChange.ipc$dispatch("505e50e9", new Object[]{this, new Integer(i)}) : new ShareData[i];
        }
    };
    private String businessId;
    private String imagePath;
    private String imageUrl;
    private String link;
    private String text;
    private String title;
    private MessageType type;
    private Map<String, String> userInfo;
    private String sourceType = "";
    private float price = 0.0f;
    private String bizType = "";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public enum MessageType {
        TEXT(0),
        IMAGE(1),
        VIDEO(2),
        MEDIA(3),
        WEBPAGE(4),
        OTHER(5);
        
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private int value;

        MessageType(int i) {
            this.value = i;
        }

        public static MessageType getEnum(int i) {
            MessageType[] values;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (MessageType) ipChange.ipc$dispatch("271f8cc3", new Object[]{new Integer(i)});
            }
            for (MessageType messageType : values()) {
                if (messageType.value == i) {
                    return messageType;
                }
            }
            return null;
        }

        public static /* synthetic */ Object ipc$super(MessageType messageType, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ut/share/data/ShareData$MessageType");
        }

        public static MessageType valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (MessageType) ipChange.ipc$dispatch("2c6da437", new Object[]{str});
            }
            return (MessageType) Enum.valueOf(MessageType.class, str);
        }

        public int getValue() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("d1b766b5", new Object[]{this})).intValue();
            }
            return this.value;
        }

        @Override // java.lang.Enum
        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return name();
        }
    }

    static {
        t2o.a(662700056);
    }

    public ShareData() {
        this.businessId = "";
        this.title = "";
        this.text = "";
        this.link = "";
        this.imageUrl = "";
        this.imagePath = "";
        MessageType messageType = MessageType.MEDIA;
        this.businessId = "";
        this.title = "";
        this.text = "";
        this.link = "";
        this.imageUrl = "";
        this.imagePath = "";
        this.type = messageType;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getBizType() {
        return this.bizType;
    }

    public String getBusinessId() {
        return this.businessId;
    }

    public String getImagePath() {
        return this.imagePath;
    }

    public String getImageUrl() {
        return this.imageUrl;
    }

    public String getLink() {
        return this.link;
    }

    public float getPrice() {
        return this.price;
    }

    public String getSourceType() {
        return this.sourceType;
    }

    public String getText() {
        return this.text;
    }

    public String getTitle() {
        return this.title;
    }

    public MessageType getType() {
        return this.type;
    }

    public Map<String, String> getUserInfo() {
        return this.userInfo;
    }

    public void setBizType(String str) {
        this.bizType = str;
    }

    public void setBusinessId(String str) {
        this.businessId = str;
    }

    public void setImagePath(String str) {
        this.imagePath = str;
    }

    public void setImageUrl(String str) {
        this.imageUrl = str;
    }

    public void setLink(String str) {
        this.link = str;
    }

    public void setPrice(float f) {
        this.price = f;
    }

    public void setSourceType(String str) {
        this.sourceType = str;
    }

    public void setText(String str) {
        this.text = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setType(MessageType messageType) {
        this.type = messageType;
    }

    public void setUserInfo(Map<String, String> map) {
        this.userInfo = map;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.businessId);
        parcel.writeString(this.title);
        parcel.writeString(this.text);
        parcel.writeString(this.link);
        parcel.writeString(this.imageUrl);
        parcel.writeString(this.imagePath);
        parcel.writeInt(this.type.ordinal());
        parcel.writeFloat(this.price);
        parcel.writeString(this.bizType);
    }
}

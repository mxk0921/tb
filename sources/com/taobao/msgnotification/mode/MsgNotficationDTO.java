package com.taobao.msgnotification.mode;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.alibaba.ip.runtime.IpChange;
import org.json.JSONObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class MsgNotficationDTO implements Parcelable {
    public static final Parcelable.Creator<MsgNotficationDTO> CREATOR = new a();
    public int bizType;
    public String channelId;
    public int closeLocalPush;
    public String extraImgUrl;
    public String importance;
    public boolean isMultiContent;
    public String localPushRightImg;
    public int mergeType;
    public String notification;
    public int notificationId;
    public String personalImgUrl;
    public int popup;
    public JSONObject sceneTemplateData;
    public int sceneTemplateId;
    public String sound;
    public String text;
    public String ticker;
    public String title;
    public String url;
    public int view_type;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a implements Parcelable.Creator<MsgNotficationDTO> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public MsgNotficationDTO createFromParcel(Parcel parcel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (MsgNotficationDTO) ipChange.ipc$dispatch("7ea3a726", new Object[]{this, parcel});
            }
            return new MsgNotficationDTO(parcel);
        }

        /* renamed from: b */
        public MsgNotficationDTO[] newArray(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (MsgNotficationDTO[]) ipChange.ipc$dispatch("3f4dfd9d", new Object[]{this, new Integer(i)});
            }
            return new MsgNotficationDTO[i];
        }
    }

    static {
        t2o.a(588251166);
    }

    public MsgNotficationDTO() {
        this.mergeType = 0;
        this.view_type = 0;
        this.bizType = -1;
        this.sceneTemplateData = null;
        this.sceneTemplateId = -1;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.ticker);
        parcel.writeString(this.text);
        parcel.writeString(this.url);
        parcel.writeString(this.personalImgUrl);
        parcel.writeString(this.notification);
        parcel.writeString(this.sound);
        parcel.writeInt(this.popup);
        parcel.writeInt(this.notificationId);
        parcel.writeInt(this.view_type);
    }

    public MsgNotficationDTO(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, int i2, int i3, int i4, int i5, JSONObject jSONObject, int i6) {
        this.title = str;
        this.ticker = str2;
        this.text = str3;
        this.url = str4;
        this.personalImgUrl = str5;
        this.notification = str6;
        this.sound = str7;
        this.popup = i;
        this.notificationId = i2;
        this.view_type = i3;
        this.mergeType = i4;
        this.sceneTemplateId = i5;
        this.sceneTemplateData = jSONObject;
        this.bizType = i6;
    }

    public MsgNotficationDTO(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, int i2, int i3) {
        this.mergeType = 0;
        this.bizType = -1;
        this.sceneTemplateData = null;
        this.sceneTemplateId = -1;
        this.title = str;
        this.ticker = str2;
        this.text = str3;
        this.url = str4;
        this.personalImgUrl = str5;
        this.notification = str6;
        this.sound = str7;
        this.popup = i;
        this.notificationId = i2;
        this.view_type = i3;
    }

    public MsgNotficationDTO(Parcel parcel) {
        this.mergeType = 0;
        this.view_type = 0;
        this.bizType = -1;
        this.sceneTemplateData = null;
        this.sceneTemplateId = -1;
        this.title = parcel.readString();
        this.ticker = parcel.readString();
        this.text = parcel.readString();
        this.url = parcel.readString();
        this.personalImgUrl = parcel.readString();
        this.notification = parcel.readString();
        this.sound = parcel.readString();
        this.popup = parcel.readInt();
        this.notificationId = parcel.readInt();
        this.view_type = parcel.readInt();
    }
}

package com.taobao.share.globalmodel;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.alibaba.ability.localization.Localization;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.taobao.R;
import com.ut.share.business.WWMessageType;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class TBShareContent implements Parcelable {
    public static final String COMMON_TEMPLATE = "common";
    public static final Parcelable.Creator<TBShareContent> CREATOR = new a();
    private static final String DESCRIPTION = "share_card_description";
    public static final String DETAIL_TEMPLATE = "detail";
    public static final String GROUP_TEMPLATE = "group";
    public static final String LIVE_TEMPLATE = "live";
    private static final String NAME_SPACE = "shareui_theme";
    public static final String SHOP_TEMPLATE = "shop";
    public static final String WEEX_TEMPLATE = "weex";
    public String _defineToolUrl;
    public String _initShareUrl;
    public String _shareBizActivityInfo;
    public Map<String, String> activityParams;
    public String activityUrl;
    public String businessId;
    public Map<String, String> businessInfo;
    public String description;
    public String detailSharePosition;
    public boolean disableBackToClient;
    public Map<String, String> extraParams;
    public String headUrl;
    @Deprecated
    public Bitmap imageSoure;
    public String imageUrl;
    public String imgPath;
    public String isActivity;
    public Map<String, String> markMap;
    public JSONObject mediaInfo;
    public JSONObject mediaPublisher;
    public String needSaveContent;
    public String openMultiTargetUrl;
    public String originBizCode;
    public List<String> phoneNumberList;
    public String popUrl;
    public JSONObject qrConfig;
    public String qrTipsTxt;
    public String screenshot;
    public String serverDataTrackMap;
    public String shareId;
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
    public String validateTime = Localization.q(R.string.taobao_app_1010_1_18143);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
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
                return (TaoPasswordPopType) ipChange.ipc$dispatch("e825a463", new Object[]{str});
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
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/share/globalmodel/TBShareContent$TaoPasswordPopType");
        }

        public static TaoPasswordPopType valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TaoPasswordPopType) ipChange.ipc$dispatch("6b4c9cee", new Object[]{str});
            }
            return (TaoPasswordPopType) Enum.valueOf(TaoPasswordPopType.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a implements Parcelable.Creator<TBShareContent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public TBShareContent createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2 = true;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TBShareContent) ipChange.ipc$dispatch("60762494", new Object[]{this, parcel});
            }
            TBShareContent tBShareContent = new TBShareContent();
            tBShareContent.businessId = parcel.readString();
            tBShareContent.suId = parcel.readString();
            tBShareContent.shareId = parcel.readString();
            tBShareContent.title = parcel.readString();
            tBShareContent.description = parcel.readString();
            tBShareContent.imageUrl = parcel.readString();
            tBShareContent.url = parcel.readString();
            tBShareContent.shareScene = parcel.readString();
            tBShareContent.wwMsgType = WWMessageType.getEnum(parcel.readString());
            tBShareContent.weixinMsgType = parcel.readString();
            tBShareContent.weixinAppId = parcel.readString();
            tBShareContent.isActivity = parcel.readString();
            tBShareContent.needSaveContent = parcel.readString();
            tBShareContent.headUrl = parcel.readString();
            if (parcel.readByte() != 0) {
                z = true;
            } else {
                z = false;
            }
            tBShareContent.disableQrcode = z;
            if (parcel.readByte() == 0) {
                z2 = false;
            }
            tBShareContent.disableTextInfo = z2;
            tBShareContent.qrConfig = JSON.parseObject(parcel.readString());
            tBShareContent.snapshotImages = parcel.readArrayList(List.class.getClassLoader());
            parcel.readMap(tBShareContent.activityParams, Map.class.getClassLoader());
            parcel.readMap(tBShareContent.extraParams, Map.class.getClassLoader());
            parcel.readMap(tBShareContent.templateParams, Map.class.getClassLoader());
            tBShareContent.popType = TaoPasswordPopType.findType(parcel.readString());
            tBShareContent.popUrl = parcel.readString();
            tBShareContent.maskAlpha = parcel.readString();
            tBShareContent.screenshot = parcel.readString();
            tBShareContent.mediaPublisher = JSON.parseObject(parcel.readString());
            tBShareContent.mediaInfo = JSON.parseObject(parcel.readString());
            return tBShareContent;
        }

        /* renamed from: b */
        public TBShareContent[] newArray(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TBShareContent[]) ipChange.ipc$dispatch("ab64604b", new Object[]{this, new Integer(i)});
            }
            return new TBShareContent[i];
        }
    }

    static {
        t2o.a(665845780);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void fillUTProperties(Properties properties) {
        if (!TextUtils.isEmpty(this.originBizCode)) {
            properties.put("originBizCode", this.originBizCode);
        }
        if (!TextUtils.isEmpty(this.detailSharePosition)) {
            properties.put("detailSharePosition", this.detailSharePosition);
        }
    }

    public String originUTArgs() {
        String str;
        StringBuilder sb = new StringBuilder("serverDataTrackMap=");
        if (TextUtils.isEmpty(this.serverDataTrackMap)) {
            str = "null";
        } else {
            str = this.serverDataTrackMap;
        }
        sb.append(str);
        String sb2 = sb.toString();
        if (!TextUtils.isEmpty(this.originBizCode) && !TextUtils.isEmpty(this.detailSharePosition)) {
            return sb2 + "&originBizCode=" + this.originBizCode + "&detailSharePosition=" + this.detailSharePosition;
        } else if (!TextUtils.isEmpty(this.originBizCode)) {
            return sb2 + "&originBizCode=" + this.originBizCode;
        } else if (TextUtils.isEmpty(this.detailSharePosition)) {
            return sb2;
        } else {
            return sb2 + "&detailSharePosition=" + this.detailSharePosition;
        }
    }

    public void setDefault() {
        String str;
        if (TextUtils.isEmpty(this.businessId)) {
            this.businessId = "10000";
        }
        if (TextUtils.isEmpty(this.title)) {
            if (!TextUtils.isEmpty(this.templateId)) {
                String str2 = this.templateId;
                str2.hashCode();
                char c = 65535;
                switch (str2.hashCode()) {
                    case -1335224239:
                        if (str2.equals("detail")) {
                            c = 0;
                            break;
                        }
                        break;
                    case 3322092:
                        if (str2.equals("live")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 3529462:
                        if (str2.equals("shop")) {
                            c = 2;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        str = Localization.q(R.string.taobao_app_1010_1_18111);
                        break;
                    case 1:
                        str = Localization.q(R.string.taobao_app_1010_1_18110);
                        break;
                    case 2:
                        str = Localization.q(R.string.taobao_app_1010_1_18129);
                        break;
                }
                this.title = Localization.q(R.string.taobao_app_1010_1_18140) + str;
            }
            str = "";
            this.title = Localization.q(R.string.taobao_app_1010_1_18140) + str;
        } else if (Localization.q(R.string.taobao_app_1010_1_18110).equals(this.title)) {
            this.title = Localization.q(R.string.taobao_app_1010_1_18123);
        }
        if (TextUtils.isEmpty(this.description)) {
            String config = OrangeConfig.getInstance().getConfig(NAME_SPACE, DESCRIPTION, null);
            if (TextUtils.isEmpty(config)) {
                config = Localization.q(R.string.taobao_app_1010_1_18113);
            }
            this.description = config;
        }
        if ("1".equals(this.businessId) || TextUtils.equals(this.businessId, "detail") || TextUtils.equals(this.businessId, "tm_detail")) {
            this.shareScene = "item";
        }
        if (TextUtils.isEmpty(this.shareScene)) {
            this.shareScene = "other";
        }
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
        parcel.writeMap(this.extraParams);
        parcel.writeString(this.templateId);
        parcel.writeList(this.snapshotImages);
        parcel.writeString(JSON.toJSONString(this.qrConfig));
        parcel.writeString(this.popType.name);
        parcel.writeString(this.popUrl);
        parcel.writeString(this.maskAlpha);
        parcel.writeString(this.screenshot);
        parcel.writeMap(this.businessInfo);
        parcel.writeMap(this.templateParams);
        parcel.writeString(JSON.toJSONString(this.mediaPublisher));
        parcel.writeString(JSON.toJSONString(this.mediaInfo));
    }
}

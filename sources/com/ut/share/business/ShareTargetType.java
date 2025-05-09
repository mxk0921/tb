package com.ut.share.business;

import android.text.TextUtils;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.alipay.mobile.verifyidentity.common.ModuleConstants;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.tn1;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public enum ShareTargetType {
    Share2TYQ("tyq"),
    Share2HUABAO("huabao"),
    Share2Laiwang("laiwang"),
    Share2SinaWeibo("weibo"),
    Share2Weixin("wxfriend"),
    Share2WeixinTimeline("wxtimeline"),
    Share2Wangxin(tn1.KEY_SHARE_CONFIG_WANGXIN),
    Share2QQ("qq"),
    Share2Qzone("qzone"),
    Share2SMS("sms"),
    Share2Copy("copy"),
    Share2QRCode("qrcode"),
    Share2ScanCode("scancode"),
    Share2Contact("contacts"),
    Share2TaoPassword("taopassword"),
    Share2Alipay("alipay"),
    Share2Screenshots(tn1.KEY_SHARE_CONFIG_SCREENSHOT),
    Share2IShopping("guangjie"),
    Share2IPresent("present"),
    Share2DingTalk("dingtalk"),
    Share2Messenger("Messenger"),
    Share2Line("Line"),
    Share2Telegram("Telegram"),
    Share2WeChat("WeChat"),
    Share2WhatsApp("WhatsApp"),
    Share2Instagram("Instagram"),
    Share2Facebook("Facebook"),
    Share2I18Napp("I18Napp"),
    Share2Other("other");
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String value;

    ShareTargetType(String str) {
        this.value = str;
    }

    public static ShareTargetType getEnum(String str) {
        ShareTargetType[] values;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShareTargetType) ipChange.ipc$dispatch("6f12b64c", new Object[]{str});
        }
        for (ShareTargetType shareTargetType : values()) {
            if (shareTargetType.value.equals(str)) {
                return shareTargetType;
            }
        }
        return null;
    }

    public static String getTargetByType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cd72e797", new Object[]{str});
        }
        if (Share2SinaWeibo.getValue().equals(str)) {
            return "WB";
        }
        if (Share2Wangxin.getValue().equals(str)) {
            return "WX";
        }
        if (Share2Weixin.getValue().equals(str)) {
            return "WEIXIN";
        }
        if (Share2WeixinTimeline.getValue().equals(str)) {
            return "WXFRIEND";
        }
        if (Share2Copy.getValue().equals(str)) {
            return "COPY";
        }
        if (Share2Contact.getValue().equals(str)) {
            return "CONTACTS";
        }
        if (Share2QRCode.getValue().equals(str)) {
            return "QR";
        }
        if (Share2ScanCode.getValue().equals(str)) {
            return "SCAN";
        }
        if (Share2Alipay.getValue().equals(str)) {
            return "ALIPAY";
        }
        if (Share2QQ.getValue().equals(str)) {
            return "QQ";
        }
        if (Share2IPresent.getValue().equals(str)) {
            return "PRESENT";
        }
        if (Share2IShopping.getValue().equals(str)) {
            return "GUANGJIE";
        }
        if (Share2DingTalk.getValue().equals(str)) {
            return RPCDataItems.DT;
        }
        if (Share2SMS.getValue().equals(str)) {
            return ModuleConstants.VI_MODULE_NAME_SMS;
        }
        if (Share2Messenger.getValue().equals(str)) {
            return "MESSENGER";
        }
        if (Share2Telegram.getValue().equals(str)) {
            return "TELEGRAM";
        }
        if (Share2WeChat.getValue().equals(str)) {
            return "WECHAT";
        }
        if (Share2WhatsApp.getValue().equals(str)) {
            return "WHATSAPP";
        }
        if (Share2Instagram.getValue().equals(str)) {
            return "INSTAGRAM";
        }
        if (Share2Facebook.getValue().equals(str)) {
            return "FACEBOOK";
        }
        if (Share2I18Napp.getValue().equals(str)) {
            return "I18NAPP";
        }
        if (Share2Line.getValue().equals(str)) {
            return "LINE";
        }
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        return "UNKNOWN";
    }

    public static /* synthetic */ Object ipc$super(ShareTargetType shareTargetType, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ut/share/business/ShareTargetType");
    }

    public static ShareTargetType valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShareTargetType) ipChange.ipc$dispatch("4058347d", new Object[]{str});
        }
        return (ShareTargetType) Enum.valueOf(ShareTargetType.class, str);
    }

    public String getValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5308aa1e", new Object[]{this});
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

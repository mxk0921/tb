package com.ut.share;

import com.alipay.mobile.verifyidentity.common.ModuleConstants;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public enum SharePlatform {
    LaiwangChat("LaiwangChat"),
    LaiwangShare("LaiwangShare"),
    SinaWeibo("SinaWeibo"),
    Weixin("WeChatSDK_Chat"),
    WeixinPengyouquan("WeChatSDK_Quan"),
    Wangxin("Wangxin"),
    QQ("QQ"),
    QZone("QZone"),
    SMS(ModuleConstants.VI_MODULE_NAME_SMS),
    Copy("Copy"),
    Alipay("Alipay"),
    DingTalk("DingTalk"),
    Messenger("Messenger"),
    Line("Line"),
    Telegram("Telegram"),
    WeChat("WeChat"),
    WhatsApp("WhatsApp"),
    Instagram("Instagram"),
    Facebook("Facebook"),
    Other("Other");
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String value;

    SharePlatform(String str) {
        this.value = str;
    }

    public static /* synthetic */ Object ipc$super(SharePlatform sharePlatform, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ut/share/SharePlatform");
    }

    public static SharePlatform valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharePlatform) ipChange.ipc$dispatch("fbaa372c", new Object[]{str});
        }
        return (SharePlatform) Enum.valueOf(SharePlatform.class, str);
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

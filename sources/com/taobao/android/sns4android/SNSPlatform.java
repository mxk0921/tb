package com.taobao.android.sns4android;

import android.text.TextUtils;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.tn1;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public enum SNSPlatform {
    PLATFORM_GOOGLE("google", "", false),
    PLATFORM_FACEBOOK("facebook", "com.facebook.katana", true),
    PLATFORM_TWITTER("twitter", "com.twitter.android", true),
    PLATFORM_LINKEDIN("linkedin", "com.linkedin.android", true),
    PLATFORM_QQ("qq", "com.tencent.mobileqq", false),
    PLATFORM_WEIXIN(tn1.KEY_SHARE_CONFIG_WEIXIN, "com.tencent.mm", false),
    PLATFORM_WEIBO("weibo", "com.sina.weibo", true),
    PLATFORM_ALIPAY("alipay", "com.eg.android.AlipayGphone", true),
    PLATFORM_ALIPAYHK(MspGlobalDefine.ALIPAYHK_SCHEME, "hk.alipay.wallet", true),
    PLATFORM_LINE("line", "jp.naver.line.android", true),
    PLATFORM_TAOBAO("taobao", "com.taobao.taobao", true),
    PLATFORM_HUAWEI("Huawei", "", false),
    PLATFORM_NETEASE("wangyi_mail", "", true),
    PLATFORM_WC("ctid", "cn.cyberIdentity.certification", false);
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean canAuthByH5;
    private String packageName;
    private String platform;

    SNSPlatform(String str, String str2, boolean z) {
        this.platform = str;
        this.packageName = str2;
        this.canAuthByH5 = z;
    }

    public static SNSPlatform convertSNSPlatform(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SNSPlatform) ipChange.ipc$dispatch("ef4cf0a0", new Object[]{str});
        }
        if (TextUtils.equals(str, "qq")) {
            return PLATFORM_QQ;
        }
        if (TextUtils.equals(str, "alipay") || TextUtils.equals(str, "alipay3")) {
            return PLATFORM_ALIPAY;
        }
        if (TextUtils.equals(str, "weibo") || TextUtils.equals(str, "sina")) {
            return PLATFORM_WEIBO;
        }
        if (TextUtils.equals(str, tn1.KEY_SHARE_CONFIG_WEIXIN) || TextUtils.equals(str, "wechat")) {
            return PLATFORM_WEIXIN;
        }
        if (TextUtils.equals(str, "taobao")) {
            return PLATFORM_TAOBAO;
        }
        if (TextUtils.equals(str, MspGlobalDefine.ALIPAYHK_SCHEME)) {
            return PLATFORM_ALIPAYHK;
        }
        return null;
    }

    public static /* synthetic */ Object ipc$super(SNSPlatform sNSPlatform, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/sns4android/SNSPlatform");
    }

    public static SNSPlatform valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SNSPlatform) ipChange.ipc$dispatch("479321d0", new Object[]{str});
        }
        return (SNSPlatform) Enum.valueOf(SNSPlatform.class, str);
    }

    public String getPackageName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b4fb6b1e", new Object[]{this});
        }
        return this.packageName;
    }

    public String getPlatform() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("611384b0", new Object[]{this});
        }
        return this.platform;
    }
}

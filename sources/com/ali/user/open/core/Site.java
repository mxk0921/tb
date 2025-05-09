package com.ali.user.open.core;

import android.text.TextUtils;
import com.ali.user.open.core.config.ConfigManager;
import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.mtop.intf.MtopAccountSiteUtils;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class Site {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ALIPAY = "alipay";
    public static final String ALIYUN_YUNPAN = "yunpan";
    public static final String AMAP = "gaode";
    public static final String CAINIAO = "cainiao";
    public static final String CAINIAO2C = "cainiao2c";
    public static final String DAMAI = "damai";
    public static final String DING = "dingding";
    public static final String ELEME = "eleme";
    public static final String ICBU = "icbu";
    public static final String JIUYOU = "jiuyou";
    public static final String KAOLA = "kaola";
    public static final String LAIFENG = "lai_feng";
    public static final String MIFENG = "mifeng";
    public static final String NETEASE = "netease";
    public static final String QQ = "qq";
    public static final String QURAK = "qurak";
    public static final String QU_TOUTIAO = "qu_toutiao";
    public static final String STARBUCKS = "starbucks";
    public static final String TAOBAO = "taobao";
    public static final String UC = "uc";
    public static final String WECHAT = "wechat";
    public static final String WEIBO = "weibo";
    public static final String WENYU_GAME = "wenyu_game";
    public static final String XIAMI = "xiami";
    public static final String XIANYU = "xianyu";
    public static final String YABO = "yabo";
    public static final String YOUKU = "youku";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public @interface SiteName {
    }

    static {
        t2o.a(71303171);
    }

    public static String getMtopInstanceTag(String str) {
        if (ConfigManager.getInstance().useNewMtopInstanceId) {
            try {
                IpChange ipChange = MtopAccountSiteUtils.$ipChange;
                return (String) MtopAccountSiteUtils.class.getMethod("getInstanceId", String.class).invoke(null, str);
            } catch (Throwable unused) {
                return "";
            }
        } else {
            return "havana-instance-" + str;
        }
    }

    public static int getHavanaSite(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("510b978", new Object[]{str})).intValue();
        }
        if (TextUtils.equals(str, "taobao")) {
            return 0;
        }
        if (TextUtils.equals(str, ICBU)) {
            return 4;
        }
        if (TextUtils.equals(str, DAMAI)) {
            return 18;
        }
        if (TextUtils.equals(str, CAINIAO)) {
            return 21;
        }
        if (TextUtils.equals(str, "eleme")) {
            return 25;
        }
        if (TextUtils.equals(str, YABO)) {
            return 28;
        }
        if (TextUtils.equals(str, KAOLA)) {
            return 39;
        }
        if (TextUtils.equals(str, ALIYUN_YUNPAN)) {
            return 52;
        }
        if (TextUtils.equals(str, "xianyu")) {
            return 77;
        }
        return TextUtils.equals(str, CAINIAO2C) ? 78 : 0;
    }

    public static boolean isHavanaSite(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1a82e75d", new Object[]{str})).booleanValue();
        }
        return TextUtils.equals(str, "taobao") || TextUtils.equals(str, ICBU) || TextUtils.equals(str, DAMAI) || TextUtils.equals(str, YABO) || TextUtils.equals(str, YOUKU) || TextUtils.equals(str, ALIYUN_YUNPAN) || TextUtils.equals(str, CAINIAO) || TextUtils.equals(str, CAINIAO2C);
    }
}

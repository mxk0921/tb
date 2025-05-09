package com.taobao.share.taopassword.constants;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.tn1;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public enum TPTargetType {
    OTHER("other", 0),
    COPY("copy", 1),
    SINAWEIBO(tn1.KEY_SHARE_CONFIG_SINAWEIBO, 2),
    WEIXIN(tn1.KEY_SHARE_CONFIG_WEIXIN, 3),
    WEIXINPENGYOUQUAN("weixinpengyouquan", 4),
    WANGXIN(tn1.KEY_SHARE_CONFIG_WANGXIN, 5),
    LAIWANGCHAT("laiwangchat", 6),
    ALIPAY("alipay", 6),
    QZONE("qqzone", 7),
    QQFRIEND("qqfriend", 8),
    TAOFRIEND("taofriend", 9),
    MOMO(tn1.KEY_SHARE_CONFIG_MOMO, 10),
    SMS("sms", 11);
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int id;
    private String name;

    TPTargetType(String str, int i) {
        this.name = str;
        this.id = i;
    }

    public static /* synthetic */ Object ipc$super(TPTargetType tPTargetType, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/share/taopassword/constants/TPTargetType");
    }

    public static TPTargetType valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TPTargetType) ipChange.ipc$dispatch("5789dbae", new Object[]{str});
        }
        return (TPTargetType) Enum.valueOf(TPTargetType.class, str);
    }

    public int getId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1ddaaf0b", new Object[]{this})).intValue();
        }
        return this.id;
    }

    public String getInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ed0ac055", new Object[]{this});
        }
        return this.name;
    }
}

package com.taobao.msgnotification.Constants;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public enum BizSoundType {
    HONGBAO("redpacketcome");
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String type;

    BizSoundType(String str) {
        this.type = str;
    }

    public static /* synthetic */ Object ipc$super(BizSoundType bizSoundType, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/msgnotification/Constants/BizSoundType");
    }

    public static BizSoundType valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BizSoundType) ipChange.ipc$dispatch("1b39931e", new Object[]{str});
        }
        return (BizSoundType) Enum.valueOf(BizSoundType.class, str);
    }

    public String getType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("13e5e549", new Object[]{this});
        }
        return this.type;
    }
}

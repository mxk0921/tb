package com.alipay.mobile.verifyidentity.log;

import com.alipay.mobile.common.logging.api.behavor.BehavorID;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public enum BehaviourIdEnum {
    NONE("none"),
    EVENT("event"),
    CLICKED(BehavorID.CLICK),
    OPENPAGE(BehavorID.OPENPAGE);
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String desc;

    BehaviourIdEnum(String str) {
        this.desc = str;
    }

    public static /* synthetic */ Object ipc$super(BehaviourIdEnum behaviourIdEnum, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/verifyidentity/log/BehaviourIdEnum");
    }

    public static BehaviourIdEnum valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BehaviourIdEnum) ipChange.ipc$dispatch("51a15680", new Object[]{str});
        }
        return (BehaviourIdEnum) Enum.valueOf(BehaviourIdEnum.class, str);
    }

    public final String getDes() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b97db9d", new Object[]{this});
        }
        return this.desc;
    }
}

package com.taobao.share.taopassword.genpassword.model;

import com.alipay.mobile.verifyidentity.common.ModuleConstants;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public enum TaoPasswordShareType {
    ShareTypeQQ("QQ"),
    ShareTypeWeixin("Weixin"),
    ShareTypeCopy("Copy"),
    ShareTypeSMS(ModuleConstants.VI_MODULE_NAME_SMS),
    ShareTypeOther("Other");
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String value;

    TaoPasswordShareType(String str) {
        this.value = str;
    }

    public static /* synthetic */ Object ipc$super(TaoPasswordShareType taoPasswordShareType, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/share/taopassword/genpassword/model/TaoPasswordShareType");
    }

    public static TaoPasswordShareType valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoPasswordShareType) ipChange.ipc$dispatch("b6730a8f", new Object[]{str});
        }
        return (TaoPasswordShareType) Enum.valueOf(TaoPasswordShareType.class, str);
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

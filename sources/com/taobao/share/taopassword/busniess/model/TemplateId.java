package com.taobao.share.taopassword.busniess.model;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kis;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public enum TemplateId {
    ITEM("item"),
    SHOP("shop"),
    WEEX("weex"),
    COUPON("coupon"),
    COMMON("common");
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String templateId;

    TemplateId(String str) {
        this.templateId = str;
    }

    public static /* synthetic */ Object ipc$super(TemplateId templateId, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/share/taopassword/busniess/model/TemplateId");
    }

    public static TemplateId valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TemplateId) ipChange.ipc$dispatch("7e5d8ca1", new Object[]{str});
        }
        return (TemplateId) Enum.valueOf(TemplateId.class, str);
    }

    public boolean equals(kis kisVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f13878d", new Object[]{this, kisVar})).booleanValue();
        }
        throw null;
    }

    @Override // java.lang.Enum
    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return this.templateId;
    }

    public boolean equals(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b9abd114", new Object[]{this, str})).booleanValue() : this.templateId.equals(str);
    }
}

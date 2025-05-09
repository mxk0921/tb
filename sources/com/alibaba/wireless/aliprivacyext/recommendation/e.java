package com.alibaba.wireless.aliprivacyext.recommendation;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.ui.coordinatorcard.FactoryType;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public enum e {
    INVALID(FactoryType.TYPE_INVALID),
    NO_UID("noUid"),
    OPEN("open"),
    CLOSE("close");
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String status;

    e(String str) {
        this.status = str;
    }

    public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/wireless/aliprivacyext/recommendation/e");
    }

    public static e valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("a2274813", new Object[]{str});
        }
        return (e) Enum.valueOf(e.class, str);
    }

    public boolean getRecommendSwitchBooleanStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f0d8080b", new Object[]{this})).booleanValue();
        }
        if (this != CLOSE) {
            return true;
        }
        return false;
    }

    public String getStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("71829d11", new Object[]{this});
        }
        return this.status;
    }

    @Override // java.lang.Enum
    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return getStatus();
    }
}

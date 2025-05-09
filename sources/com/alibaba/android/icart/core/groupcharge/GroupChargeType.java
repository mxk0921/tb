package com.alibaba.android.icart.core.groupcharge;

import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public enum GroupChargeType {
    BC("B&C", Localization.q(R.string.taobao_app_1028_1_21680), 0),
    SM("SM", Localization.q(R.string.taobao_app_1028_1_21667), 1),
    HK("HK", Localization.q(R.string.taobao_app_1028_1_21644), 2),
    HKDF("HKDF", Localization.q(R.string.taobao_app_1028_1_21664), 3),
    YY("YY", Localization.q(R.string.taobao_app_1028_1_21656), 4),
    ALITRIP("ALITRIP", Localization.q(R.string.taobao_app_1028_1_21675), 5);
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String code;
    private int priority;
    private String title;

    GroupChargeType(String str, String str2, int i) {
        this.code = str;
        this.title = str2;
        this.priority = i;
    }

    public static /* synthetic */ Object ipc$super(GroupChargeType groupChargeType, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/icart/core/groupcharge/GroupChargeType");
    }

    public static GroupChargeType valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (GroupChargeType) ipChange.ipc$dispatch("c72f15a4", new Object[]{str});
        }
        return (GroupChargeType) Enum.valueOf(GroupChargeType.class, str);
    }

    public String getCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fa4e0476", new Object[]{this});
        }
        return this.code;
    }

    public int getPriority() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("49b31e94", new Object[]{this})).intValue();
        }
        return this.priority;
    }

    public String getTitle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5267f97", new Object[]{this});
        }
        return this.title;
    }
}

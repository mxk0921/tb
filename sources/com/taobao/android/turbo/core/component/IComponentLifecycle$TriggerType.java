package com.taobao.android.turbo.core.component;

import com.alipay.mobile.common.transportext.biz.diagnose.network.Configuration;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"com/taobao/android/turbo/core/component/IComponentLifecycle$TriggerType", "", "Lcom/taobao/android/turbo/core/component/IComponentLifecycle$TriggerType;", "<init>", "(Ljava/lang/String;I)V", "PAGE_LIFECYCLE_CHANGE", "DRAWER_OPEN_CLOSE", "TAB_SELECT", "TAB_SCROLL", Configuration.IDLE, "UNSPECIFIED", "turboflow_framework_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public enum IComponentLifecycle$TriggerType {
    PAGE_LIFECYCLE_CHANGE,
    DRAWER_OPEN_CLOSE,
    TAB_SELECT,
    TAB_SCROLL,
    IDLE,
    UNSPECIFIED;
    
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/turbo/core/component/IComponentLifecycle$TriggerType");
    }

    public static IComponentLifecycle$TriggerType valueOf(String str) {
        Object valueOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            valueOf = ipChange.ipc$dispatch("68c5b964", new Object[]{str});
        } else {
            valueOf = Enum.valueOf(IComponentLifecycle$TriggerType.class, str);
        }
        return (IComponentLifecycle$TriggerType) valueOf;
    }
}

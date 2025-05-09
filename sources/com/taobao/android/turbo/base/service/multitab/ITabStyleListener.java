package com.taobao.android.turbo.base.service.multitab;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public interface ITabStyleListener {

    /* compiled from: Taobao */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/taobao/android/turbo/base/service/multitab/ITabStyleListener$TriggerType;", "", "(Ljava/lang/String;I)V", "TAB_SCROLLED", "DATA_UPDATED", "FESTIVAL_CHANGED", "turboflow_biz_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public enum TriggerType {
        TAB_SCROLLED,
        DATA_UPDATED,
        FESTIVAL_CHANGED;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(TriggerType triggerType, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/turbo/base/service/multitab/ITabStyleListener$TriggerType");
        }

        public static TriggerType valueOf(String str) {
            Object valueOf;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                valueOf = ipChange.ipc$dispatch("2b46d724", new Object[]{str});
            } else {
                valueOf = Enum.valueOf(TriggerType.class, str);
            }
            return (TriggerType) valueOf;
        }
    }

    void a(int i, float f, boolean z, boolean z2, TriggerType triggerType);
}

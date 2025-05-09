package com.taobao.industry.tbiunicontainer.core.component;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;

/* compiled from: Taobao */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/taobao/industry/tbiunicontainer/core/component/DXLoadStrategy;", "", "(Ljava/lang/String;I)V", "LOCAL_ONLY", "TARGET_ONLY", "DOUBLE_RENDER", "tbi_uniContainer_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public enum DXLoadStrategy {
    LOCAL_ONLY,
    TARGET_ONLY,
    DOUBLE_RENDER;
    
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(DXLoadStrategy dXLoadStrategy, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/industry/tbiunicontainer/core/component/DXLoadStrategy");
    }

    public static DXLoadStrategy valueOf(String str) {
        Object valueOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            valueOf = ipChange.ipc$dispatch("7f7b2b7c", new Object[]{str});
        } else {
            valueOf = Enum.valueOf(DXLoadStrategy.class, str);
        }
        return (DXLoadStrategy) valueOf;
    }
}

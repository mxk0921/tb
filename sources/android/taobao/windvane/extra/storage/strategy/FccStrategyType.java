package android.taobao.windvane.extra.storage.strategy;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public enum FccStrategyType {
    CACHE,
    SNAPSHOT,
    DEFAULT,
    LEGACY;
    
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(FccStrategyType fccStrategyType, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in android/taobao/windvane/extra/storage/strategy/FccStrategyType");
    }

    public static FccStrategyType valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FccStrategyType) ipChange.ipc$dispatch("3a774f7e", new Object[]{str});
        }
        return (FccStrategyType) Enum.valueOf(FccStrategyType.class, str);
    }
}

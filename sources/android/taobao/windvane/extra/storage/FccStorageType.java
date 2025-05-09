package android.taobao.windvane.extra.storage;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public enum FccStorageType {
    CACHE("cache"),
    SNAPSHOT("snapshot");
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final String name;

    FccStorageType(String str) {
        this.name = str;
    }

    public static /* synthetic */ Object ipc$super(FccStorageType fccStorageType, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in android/taobao/windvane/extra/storage/FccStorageType");
    }

    public static FccStorageType valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FccStorageType) ipChange.ipc$dispatch("fd99bea6", new Object[]{str});
        }
        return (FccStorageType) Enum.valueOf(FccStorageType.class, str);
    }
}

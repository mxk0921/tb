package com.taobao.android.hudong;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/taobao/android/hudong/ZCacheMatchType;", "", "(Ljava/lang/String;I)V", "PREFIX", "REFERER", "hudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class ZCacheMatchType extends Enum<ZCacheMatchType> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final ZCacheMatchType PREFIX = new ZCacheMatchType("PREFIX", 0);
    public static final ZCacheMatchType REFERER = new ZCacheMatchType("REFERER", 1);
    private static final /* synthetic */ ZCacheMatchType[] $VALUES = $values();

    private static final /* synthetic */ ZCacheMatchType[] $values() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ZCacheMatchType[]) ipChange.ipc$dispatch("b2595929", new Object[0]) : new ZCacheMatchType[]{PREFIX, REFERER};
    }

    private ZCacheMatchType(String str, int i) {
    }

    public static /* synthetic */ Object ipc$super(ZCacheMatchType zCacheMatchType, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/hudong/ZCacheMatchType");
    }

    public static ZCacheMatchType valueOf(String str) {
        Object valueOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            valueOf = ipChange.ipc$dispatch("71cfafde", new Object[]{str});
        } else {
            valueOf = Enum.valueOf(ZCacheMatchType.class, str);
        }
        return (ZCacheMatchType) valueOf;
    }

    public static ZCacheMatchType[] values() {
        Object clone;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            clone = ipChange.ipc$dispatch("67b8acd", new Object[0]);
        } else {
            clone = $VALUES.clone();
        }
        return (ZCacheMatchType[]) clone;
    }
}

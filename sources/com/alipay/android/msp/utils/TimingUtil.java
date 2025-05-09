package com.alipay.android.msp.utils;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class TimingUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public enum PreposeTimingEnum {
        PaTiming,
        HasAlipayTiming,
        TidTiming,
        UaTiming,
        UtdidTiming;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(PreposeTimingEnum preposeTimingEnum, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/utils/TimingUtil$PreposeTimingEnum");
        }

        public static PreposeTimingEnum valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (PreposeTimingEnum) ipChange.ipc$dispatch("4f13e809", new Object[]{str});
            }
            return (PreposeTimingEnum) Enum.valueOf(PreposeTimingEnum.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class TimingMsMap<X extends Enum<X>> extends HashMap<X, Long> {
    }

    public static long getLong(Long l, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5f097d00", new Object[]{l, new Long(j)})).longValue();
        }
        if (l == null) {
            return j;
        }
        return l.longValue();
    }
}

package com.taobao.android.detail2.core.framework.base.media.frame;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.cbw;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public enum DimensionEnum {
    ONE_ONE("1:1", 750.0d, 1.0d),
    THREE_FOUR(cbw.VALUE_THREE_FOUR_RATIO, 1000.0d, 0.75d),
    NINE_SIXTEEN("9:16", 1333.0d, 0.5625d),
    SIXTEEN_NINE(cbw.VALUE_SIXTEEN_NINE_RATIO, 421.875d, 1.7778d);
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String dimensionRatio;
    private double height;
    private double value;

    DimensionEnum(String str, double d, double d2) {
        this.dimensionRatio = str;
        this.height = d;
        this.value = d2;
    }

    public static /* synthetic */ Object ipc$super(DimensionEnum dimensionEnum, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail2/core/framework/base/media/frame/DimensionEnum");
    }

    public static DimensionEnum valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DimensionEnum) ipChange.ipc$dispatch("90f750f0", new Object[]{str});
        }
        return (DimensionEnum) Enum.valueOf(DimensionEnum.class, str);
    }

    public String getDimensionRatio() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e8a8629e", new Object[]{this});
        }
        return this.dimensionRatio;
    }

    public double getHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4703e212", new Object[]{this})).doubleValue();
        }
        return this.height;
    }

    public double getValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d1b766b0", new Object[]{this})).doubleValue();
        }
        return this.value;
    }
}

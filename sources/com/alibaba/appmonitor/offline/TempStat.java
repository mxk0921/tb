package com.alibaba.appmonitor.offline;

import android.text.TextUtils;
import com.alibaba.analytics.core.db.annotation.Column;
import com.alibaba.analytics.core.db.annotation.TableName;
import com.alibaba.fastjson.JSON;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;
import tb.zht;

/* compiled from: Taobao */
@TableName("stat_temp")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class TempStat extends zht {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @Column("dimension_values")
    private String dimension_values;
    @Column("measure_values")
    private String measure_values;

    static {
        t2o.a(962593056);
    }

    public TempStat() {
    }

    public static /* synthetic */ Object ipc$super(TempStat tempStat, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/appmonitor/offline/TempStat");
    }

    public DimensionValueSet getDimensionValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DimensionValueSet) ipChange.ipc$dispatch("293a1557", new Object[]{this});
        }
        if (!TextUtils.isEmpty(this.dimension_values)) {
            return (DimensionValueSet) JSON.parseObject(this.dimension_values, DimensionValueSet.class);
        }
        return null;
    }

    public MeasureValueSet getMeasureVauleSet() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MeasureValueSet) ipChange.ipc$dispatch("6d4530f9", new Object[]{this});
        }
        if (!TextUtils.isEmpty(this.measure_values)) {
            return (MeasureValueSet) JSON.parseObject(this.measure_values, MeasureValueSet.class);
        }
        return null;
    }

    @Override // tb.zht
    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "TempStat{module='" + this.module + "'monitorPoint='" + this.monitorPoint + "'dimension_values='" + this.dimension_values + "', measure_values='" + this.measure_values + "'}";
    }

    public TempStat(String str, String str2, DimensionValueSet dimensionValueSet, MeasureValueSet measureValueSet, String str3, String str4) {
        super(str, str2, str3, str4);
        this.dimension_values = JSON.toJSONString(dimensionValueSet);
        this.measure_values = JSON.toJSONString(measureValueSet);
    }
}

package com.alibaba.appmonitor.model;

import android.text.TextUtils;
import com.alibaba.analytics.core.db.annotation.Column;
import com.alibaba.analytics.core.db.annotation.Ingore;
import com.alibaba.analytics.core.db.annotation.TableName;
import com.alibaba.fastjson.JSON;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.Measure;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.UUID;
import tb.rbo;
import tb.rf8;
import tb.sa;
import tb.t2o;
import tb.zht;

/* compiled from: Taobao */
@TableName("stat_register_temp")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class Metric extends rf8 implements rbo {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    @Ingore
    private static final String SEPERATOR = "$";
    @Ingore
    private DimensionSet dimensionSet;
    @Column("dimensions")
    private String dimensions;
    @Ingore
    private String extraArg;
    @Column("is_commit_detail")
    private boolean isCommitDetail;
    @Ingore
    private MeasureSet measureSet;
    @Column("measures")
    private String measures;
    @Column("module")
    private String module;
    @Column(zht.TAG_MONITOR_POINT)
    private String monitorPoint;
    @Ingore
    private String transactionId;

    static {
        t2o.a(962593044);
        t2o.a(962593059);
    }

    @Deprecated
    public Metric() {
    }

    @Deprecated
    private Measure getMeasureByName(String str, List<Measure> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Measure) ipChange.ipc$dispatch("d00055ac", new Object[]{this, str, list});
        }
        if (list == null) {
            return null;
        }
        for (Measure measure : list) {
            if (TextUtils.equals(str, measure.name)) {
                return measure;
            }
        }
        return null;
    }

    public static /* synthetic */ Object ipc$super(Metric metric, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/appmonitor/model/Metric");
    }

    @Override // tb.rbo
    public void clean() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3f4ee50", new Object[]{this});
            return;
        }
        this.module = null;
        this.monitorPoint = null;
        this.extraArg = null;
        this.isCommitDetail = false;
        this.dimensionSet = null;
        this.measureSet = null;
        this.transactionId = null;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Metric metric = (Metric) obj;
        String str = this.extraArg;
        if (str == null) {
            if (metric.extraArg != null) {
                return false;
            }
        } else if (!str.equals(metric.extraArg)) {
            return false;
        }
        String str2 = this.module;
        if (str2 == null) {
            if (metric.module != null) {
                return false;
            }
        } else if (!str2.equals(metric.module)) {
            return false;
        }
        String str3 = this.monitorPoint;
        if (str3 == null) {
            if (metric.monitorPoint != null) {
                return false;
            }
        } else if (!str3.equals(metric.monitorPoint)) {
            return false;
        }
        return true;
    }

    public DimensionSet getDimensionSet() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DimensionSet) ipChange.ipc$dispatch("d17e007d", new Object[]{this});
        }
        if (this.dimensionSet == null && !TextUtils.isEmpty(this.dimensions)) {
            this.dimensionSet = (DimensionSet) JSON.parseObject(this.dimensions, DimensionSet.class);
        }
        return this.dimensionSet;
    }

    public MeasureSet getMeasureSet() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MeasureSet) ipChange.ipc$dispatch("6ddd767d", new Object[]{this});
        }
        if (this.measureSet == null && !TextUtils.isEmpty(this.measures)) {
            this.measureSet = (MeasureSet) JSON.parseObject(this.measures, MeasureSet.class);
        }
        return this.measureSet;
    }

    public String getModule() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a1e176d7", new Object[]{this});
        }
        return this.module;
    }

    public String getMonitorPoint() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aca1a3ad", new Object[]{this});
        }
        return this.monitorPoint;
    }

    public synchronized String getTransactionId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e44f51f6", new Object[]{this});
        }
        if (this.transactionId == null) {
            this.transactionId = UUID.randomUUID().toString() + "$" + this.module + "$" + this.monitorPoint;
        }
        return this.transactionId;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        String str = this.extraArg;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int i4 = (i + 31) * 31;
        String str2 = this.module;
        if (str2 == null) {
            i2 = 0;
        } else {
            i2 = str2.hashCode();
        }
        int i5 = (i4 + i2) * 31;
        String str3 = this.monitorPoint;
        if (str3 != null) {
            i3 = str3.hashCode();
        }
        return i5 + i3;
    }

    public synchronized boolean isCommitDetail() {
        boolean z = false;
        synchronized (this) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6d25f63d", new Object[]{this})).booleanValue();
            }
            if (this.isCommitDetail || sa.h().j(this.module, this.monitorPoint)) {
                z = true;
            }
            return z;
        }
    }

    public void resetTransactionId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94bbb711", new Object[]{this});
        } else {
            this.transactionId = null;
        }
    }

    public boolean valid(DimensionValueSet dimensionValueSet, MeasureValueSet measureValueSet) {
        boolean z;
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("683b4d61", new Object[]{this, dimensionValueSet, measureValueSet})).booleanValue();
        }
        DimensionSet dimensionSet = this.dimensionSet;
        if (dimensionSet != null) {
            z = dimensionSet.valid(dimensionValueSet);
        } else {
            z = true;
        }
        MeasureSet measureSet = this.measureSet;
        if (measureSet == null) {
            return z;
        }
        if (!z || !measureSet.valid(measureValueSet)) {
            z2 = false;
        }
        return z2;
    }

    public Metric(String str, String str2, MeasureSet measureSet, DimensionSet dimensionSet, boolean z) {
        this.module = str;
        this.monitorPoint = str2;
        this.dimensionSet = dimensionSet;
        this.measureSet = measureSet;
        this.extraArg = null;
        this.isCommitDetail = z;
        if (dimensionSet != null) {
            this.dimensions = JSON.toJSONString(dimensionSet);
        }
        this.measures = JSON.toJSONString(measureSet);
    }

    @Override // tb.rbo
    public void fill(Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7129a67", new Object[]{this, objArr});
            return;
        }
        this.module = (String) objArr[0];
        this.monitorPoint = (String) objArr[1];
        if (objArr.length > 2) {
            this.extraArg = (String) objArr[2];
        }
    }

    @Deprecated
    public Metric(String str, String str2, String str3, String str4, boolean z) {
        this.module = str;
        this.monitorPoint = str2;
        this.dimensionSet = (DimensionSet) JSON.parseObject(str4, DimensionSet.class);
        this.measureSet = (MeasureSet) JSON.parseObject(str3, MeasureSet.class);
        this.extraArg = null;
        this.isCommitDetail = z;
        this.dimensions = str4;
        this.measures = str3;
    }
}

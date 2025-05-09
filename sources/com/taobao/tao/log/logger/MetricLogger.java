package com.taobao.tao.log.logger;

import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.LogCategory;
import com.taobao.tao.log.LogLevel;
import com.taobao.tao.log.TLogNative;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import tb.t2o;
import tb.znc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class MetricLogger extends znc implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int METRIC_TRIGGER_LAUNCH = 1;
    public static final int METRIC_TRIGGER_MANUAL = 4;
    public static final int METRIC_TRIGGER_PAGE = 2;
    public static final int METRIC_TRIGGER_SCHEDULE = 3;
    public static final int METRIC_TYPE_APP = 1;
    public static final int METRIC_TYPE_CUSTOM = 2;
    private static final String TAG = "MetricLog";
    @JSONField(name = "id")
    private String pageID = null;
    @JSONField(name = "ts")
    private long time = System.currentTimeMillis();
    @JSONField(name = "trigger")
    private int trigger;
    @JSONField(name = "type")
    private int type;

    static {
        t2o.a(767557673);
    }

    private MetricLogger(int i, int i2) {
        this.type = i;
        this.trigger = i2;
    }

    public static MetricLogger builder(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MetricLogger) ipChange.ipc$dispatch("1835986f", new Object[]{new Integer(i), new Integer(i2)});
        }
        return new MetricLogger(i, i2);
    }

    public static /* synthetic */ Object ipc$super(MetricLogger metricLogger, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/log/logger/MetricLogger");
    }

    public String getPageID() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("84651419", new Object[]{this});
        }
        return this.pageID;
    }

    public int getTrigger() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b12d84fc", new Object[]{this})).intValue();
        }
        return this.trigger;
    }

    public int getType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5378242a", new Object[]{this})).intValue();
        }
        return this.type;
    }

    @Override // tb.znc
    public void log() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("144be5cb", new Object[]{this});
            return;
        }
        Map<String, String> map = this.data;
        if (map != null && !map.isEmpty()) {
            TLogNative.writeLog(LogCategory.MetricLog, LogLevel.I, TAG, "", toString());
        }
    }

    public MetricLogger setData(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MetricLogger) ipChange.ipc$dispatch("1973677f", new Object[]{this, map});
        }
        if (map != null && !map.isEmpty()) {
            if (this.data == null) {
                this.data = new HashMap();
            }
            this.data.putAll(map);
        }
        return this;
    }

    public MetricLogger setPageID(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MetricLogger) ipChange.ipc$dispatch("d7d83614", new Object[]{this, str});
        }
        this.pageID = str;
        return this;
    }

    public MetricLogger setTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MetricLogger) ipChange.ipc$dispatch("17cd6343", new Object[]{this, new Long(j)});
        }
        setData("ts", String.valueOf(j));
        return this;
    }

    public MetricLogger setData(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MetricLogger) ipChange.ipc$dispatch("8d0dde0a", new Object[]{this, str, str2});
        }
        if (this.data == null) {
            this.data = new HashMap();
        }
        this.data.put(str, str2);
        return this;
    }

    public MetricLogger setData(Map.Entry<String, String> entry) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MetricLogger) ipChange.ipc$dispatch("158e542d", new Object[]{this, entry});
        }
        if (this.data == null) {
            this.data = new HashMap();
        }
        this.data.put(entry.getKey(), entry.getValue());
        return this;
    }
}

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
public class EventLogger extends znc implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int EVENT_TYPE_BACKGROUND = 3;
    public static final int EVENT_TYPE_CHANGE = 6;
    public static final int EVENT_TYPE_CLICK = 7;
    public static final int EVENT_TYPE_CUSTOM = 8;
    public static final int EVENT_TYPE_EXCEPTION = 5;
    public static final int EVENT_TYPE_FOREGROUND = 2;
    public static final int EVENT_TYPE_LAUNCH = 1;
    public static final int EVENT_TYPE_NET_CHANGE = 4;
    public static final String TAG = "EventLog";
    @JSONField(name = "type")
    private int eventType;
    @JSONField(name = "id")
    private String pageID = null;

    static {
        t2o.a(767557671);
    }

    public EventLogger(int i) {
        this.eventType = i;
    }

    public static EventLogger builder(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EventLogger) ipChange.ipc$dispatch("1599797c", new Object[]{new Integer(i)});
        }
        return new EventLogger(i);
    }

    public static /* synthetic */ Object ipc$super(EventLogger eventLogger, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/log/logger/EventLogger");
    }

    public int getEventType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("23373fb8", new Object[]{this})).intValue();
        }
        return this.eventType;
    }

    public String getPageID() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("84651419", new Object[]{this});
        }
        return this.pageID;
    }

    @Override // tb.znc
    public void log() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("144be5cb", new Object[]{this});
        } else {
            TLogNative.writeLog(LogCategory.EventLog, LogLevel.I, TAG, "", toString());
        }
    }

    public EventLogger setData(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EventLogger) ipChange.ipc$dispatch("302a6d8d", new Object[]{this, map});
        }
        if (map != null && !map.isEmpty()) {
            if (this.data == null) {
                this.data = new HashMap();
            }
            this.data.putAll(map);
        }
        return this;
    }

    public EventLogger setPageID(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EventLogger) ipChange.ipc$dispatch("5756f858", new Object[]{this, str});
        }
        this.pageID = str;
        return this;
    }

    public EventLogger setTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EventLogger) ipChange.ipc$dispatch("bc7fe949", new Object[]{this, new Long(j)});
        }
        setData("ts", String.valueOf(j));
        return this;
    }

    public EventLogger setData(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EventLogger) ipChange.ipc$dispatch("657179a2", new Object[]{this, str, str2});
        }
        if (this.data == null) {
            this.data = new HashMap();
        }
        this.data.put(str, str2);
        return this;
    }

    public EventLogger setData(Map.Entry<String, String> entry) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EventLogger) ipChange.ipc$dispatch("27c8331f", new Object[]{this, entry});
        }
        if (this.data == null) {
            this.data = new HashMap();
        }
        this.data.put(entry.getKey(), entry.getValue());
        return this;
    }
}

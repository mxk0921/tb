package com.alibaba.appmonitor.event;

import com.alibaba.appmonitor.sample.AlarmConfig;
import com.alibaba.appmonitor.sample.CounterConfig;
import com.alibaba.appmonitor.sample.StatConfig;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.nhh;
import tb.uj4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public enum EventType {
    ALARM(65501, 30, "alarmData", 1000, "ap_alarm", AlarmConfig.class),
    COUNTER(65502, 30, "counterData", 1000, "ap_counter", CounterConfig.class),
    STAT(65503, 30, uj4.KEY_STAT_DATA, 1000, "ap_stat", StatConfig.class);
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static String TAG = "EventType";
    private String aggregateEventArgsKey;
    private Class cls;
    private int defaultSampling;
    private int eventId;
    private String namespce;
    private int triggerCount;
    private int foregroundStatisticsInterval = 25;
    private int backgroundStatisticsInterval = 300;
    private boolean open = true;

    EventType(int i, int i2, String str, int i3, String str2, Class cls) {
        this.eventId = i;
        this.triggerCount = i2;
        this.aggregateEventArgsKey = str;
        this.defaultSampling = i3;
        this.namespce = str2;
        this.cls = cls;
    }

    public static EventType getEventType(int i) {
        EventType[] values;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EventType) ipChange.ipc$dispatch("11a6db9d", new Object[]{new Integer(i)});
        }
        for (EventType eventType : values()) {
            if (eventType != null && eventType.getEventId() == i) {
                return eventType;
            }
        }
        return null;
    }

    public static EventType getEventTypeByNameSpace(String str) {
        EventType[] values;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EventType) ipChange.ipc$dispatch("62f931c4", new Object[]{str});
        }
        if (str == null) {
            return null;
        }
        for (EventType eventType : values()) {
            if (eventType != null && str.equalsIgnoreCase(eventType.getNameSpace())) {
                return eventType;
            }
        }
        return null;
    }

    private String getNameSpace() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3e990d94", new Object[]{this});
        }
        return this.namespce;
    }

    public static /* synthetic */ Object ipc$super(EventType eventType, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/appmonitor/event/EventType");
    }

    public static EventType valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EventType) ipChange.ipc$dispatch("fa5ac762", new Object[]{str});
        }
        return (EventType) Enum.valueOf(EventType.class, str);
    }

    public String getAggregateEventArgsKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3b7ed1a8", new Object[]{this});
        }
        return this.aggregateEventArgsKey;
    }

    public int getBackgroundStatisticsInterval() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("590f6dc6", new Object[]{this})).intValue();
        }
        return this.backgroundStatisticsInterval;
    }

    public Class getCls() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("81ded728", new Object[]{this});
        }
        return this.cls;
    }

    public int getDefaultSampling() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57d0b68c", new Object[]{this})).intValue();
        }
        return this.defaultSampling;
    }

    public int getEventId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ce275619", new Object[]{this})).intValue();
        }
        return this.eventId;
    }

    public int getForegroundStatisticsInterval() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b0ca141b", new Object[]{this})).intValue();
        }
        return this.foregroundStatisticsInterval;
    }

    public int getTriggerCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e3afd6a7", new Object[]{this})).intValue();
        }
        return this.triggerCount;
    }

    public boolean isOpen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b2911d1f", new Object[]{this})).booleanValue();
        }
        return this.open;
    }

    public void setDefaultSampling(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c99be96", new Object[]{this, new Integer(i)});
        } else {
            this.defaultSampling = i;
        }
    }

    public void setOpen(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b51728e1", new Object[]{this, new Boolean(z)});
        } else {
            this.open = z;
        }
    }

    public void setStatisticsInterval(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3c1ca92", new Object[]{this, new Integer(i)});
        } else {
            this.foregroundStatisticsInterval = i;
        }
    }

    @Deprecated
    public void setTriggerCount(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6de17f43", new Object[]{this, new Integer(i)});
            return;
        }
        String str = TAG;
        String str2 = this.aggregateEventArgsKey;
        nhh.f(str, "[setTriggerCount]", str2, i + "");
        this.triggerCount = i;
    }
}

package com.taobao.collection.common;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class SwitchOption {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Map<String, Object> feature;
    private int interval;
    private boolean isOpen;
    private long timeRange;
    private CollectionType type;
    private int version;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public enum CollectionType {
        WIFI,
        BEACON;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(CollectionType collectionType, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/collection/common/SwitchOption$CollectionType");
        }

        public static CollectionType valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (CollectionType) ipChange.ipc$dispatch("4395a53f", new Object[]{str});
            }
            return (CollectionType) Enum.valueOf(CollectionType.class, str);
        }
    }

    static {
        t2o.a(789577788);
    }

    public SwitchOption() {
        this.isOpen = false;
        this.interval = 0;
        this.timeRange = 0L;
        this.version = 0;
    }

    public Map<String, Object> getFeature() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("b97d253c", new Object[]{this});
        }
        return this.feature;
    }

    public int getInterval() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("34e1135", new Object[]{this})).intValue();
        }
        return this.interval;
    }

    public boolean getIsOpen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a0d1d515", new Object[]{this})).booleanValue();
        }
        return this.isOpen;
    }

    public long getTimeRange() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9883735", new Object[]{this})).longValue();
        }
        return this.timeRange;
    }

    public CollectionType getType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CollectionType) ipChange.ipc$dispatch("b5965281", new Object[]{this});
        }
        return this.type;
    }

    public int getVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2d6bc1c", new Object[]{this})).intValue();
        }
        return this.version;
    }

    public void setFeature(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5da7df6a", new Object[]{this, map});
        } else {
            this.feature = map;
        }
    }

    public void setInterval(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f94af075", new Object[]{this, new Integer(i)});
        } else {
            this.interval = i;
        }
    }

    public void setIsOpen(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fcef357", new Object[]{this, new Boolean(z)});
        } else {
            this.isOpen = z;
        }
    }

    public void setTimeRange(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef758faf", new Object[]{this, new Long(j)});
        } else {
            this.timeRange = j;
        }
    }

    public void setType(CollectionType collectionType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b168085", new Object[]{this, collectionType});
        } else {
            this.type = collectionType;
        }
    }

    public void setVersion(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e4a3706", new Object[]{this, new Integer(i)});
        } else {
            this.version = i;
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "SwitchOption [type=" + this.type + ", isOpen=" + this.isOpen + ", interval=" + this.interval + ", timeRange=" + this.timeRange + ", version=" + this.version + ", feature=" + this.feature + "]";
    }

    public SwitchOption(CollectionType collectionType, boolean z) {
        this.interval = 0;
        this.timeRange = 0L;
        this.version = 0;
        this.type = collectionType;
        this.isOpen = z;
    }
}

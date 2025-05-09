package anet.channel.encode;

import anet.channel.AwcnConfig;
import anet.channel.util.ALog;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.io.Serializable;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ZstdAttributes implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String dictKey;
    private boolean isAbandon;
    private boolean isCanUpdate;
    private boolean isExpired;
    private boolean isFileExpired;
    public long lastZstdLinkDictTime;
    public String matchPath;
    private long time;
    private long ttl;
    private long ttlThreshold;
    public long zstdDictFailCount;
    public long zstdDictFailStartTime;

    static {
        t2o.a(607125618);
    }

    public ZstdAttributes(String str, String str2, String str3) {
        this.time = -1L;
        this.ttl = 31536000L;
        this.ttlThreshold = -1L;
        this.isExpired = false;
        this.isFileExpired = false;
        this.isCanUpdate = true;
        this.isAbandon = false;
        this.lastZstdLinkDictTime = -1L;
        this.zstdDictFailStartTime = -1L;
        this.zstdDictFailCount = 0L;
        this.matchPath = null;
        this.dictKey = str2;
        this.time = System.currentTimeMillis();
        this.ttlThreshold = AwcnConfig.getZstdTtl(str3);
        this.matchPath = str;
    }

    public String getDictKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e3366646", new Object[]{this});
        }
        return this.dictKey;
    }

    public long getTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fff5e63e", new Object[]{this})).longValue();
        }
        return this.time;
    }

    public boolean isAbandon() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d8e5acf6", new Object[]{this})).booleanValue();
        }
        return this.isAbandon;
    }

    public boolean isCanUpdate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("79b5fba", new Object[]{this})).booleanValue();
        }
        return this.isCanUpdate;
    }

    public boolean isFileExpired() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a65a2f8a", new Object[]{this})).booleanValue();
        }
        return this.isFileExpired;
    }

    public synchronized void setAbandon(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86d3f5a", new Object[]{this, new Boolean(z)});
        } else {
            this.isAbandon = z;
        }
    }

    public synchronized void setCanUpdate(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbb3f716", new Object[]{this, new Boolean(z)});
        } else {
            this.isCanUpdate = z;
        }
    }

    public synchronized void setFileExpired(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6d8b346", new Object[]{this, new Boolean(z)});
        } else {
            this.isFileExpired = z;
        }
    }

    public synchronized void setTtl(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bd4b333", new Object[]{this, new Long(j)});
        } else {
            this.ttl = j;
        }
    }

    public synchronized boolean isExpired(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("79e339ba", new Object[]{this, str, str2})).booleanValue();
        }
        if (this.ttlThreshold <= 0) {
            this.ttlThreshold = AwcnConfig.getZstdTtl(str);
        }
        long j = this.ttlThreshold;
        if (j > 0 && this.ttl > j) {
            this.ttl = j;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j2 = this.ttl;
        boolean z = (((double) (currentTimeMillis - this.time)) * 1.0d) / 1000.0d >= ((double) j2);
        this.isExpired = z;
        if (z) {
            ALog.e("awcn.ZstdAttributes", "[zstd-d] remove, isExpired=true!", str2, RemoteMessageConst.TTL, Long.valueOf(j2), "time", Long.valueOf(this.time), "curTime", Long.valueOf(currentTimeMillis), "isFileExpired", Boolean.valueOf(this.isFileExpired));
        }
        return this.isExpired;
    }

    public ZstdAttributes(String str, String str2, long j, String str3, long j2) {
        this.time = -1L;
        this.ttlThreshold = -1L;
        this.isExpired = false;
        this.isFileExpired = false;
        this.isCanUpdate = true;
        this.isAbandon = false;
        this.lastZstdLinkDictTime = -1L;
        this.zstdDictFailStartTime = -1L;
        this.zstdDictFailCount = 0L;
        this.matchPath = null;
        this.dictKey = str2;
        this.ttl = j;
        this.time = System.currentTimeMillis();
        this.ttlThreshold = AwcnConfig.getZstdTtl(str3);
        this.lastZstdLinkDictTime = j2;
        this.matchPath = str;
    }
}

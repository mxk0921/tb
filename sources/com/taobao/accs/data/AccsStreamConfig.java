package com.taobao.accs.data;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class AccsStreamConfig implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int endSeq;
    private boolean saveDB = false;
    private int seqSnapshotInterval;
    private String serviceId;
    private int startSeq;
    private String streamId;
    private long syncTimeoutInMill;
    private String userId;

    static {
        t2o.a(343933077);
    }

    public AccsStreamConfig(String str) {
        this.serviceId = str;
    }

    public int getEndSeq() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("71e423f4", new Object[]{this})).intValue();
        }
        return this.endSeq;
    }

    public int getSeqSnapshotInterval() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("892f956c", new Object[]{this})).intValue();
        }
        return this.seqSnapshotInterval;
    }

    public String getServiceId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bc5f673f", new Object[]{this});
        }
        return this.serviceId;
    }

    public int getStartSeq() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cf030d0d", new Object[]{this})).intValue();
        }
        return this.startSeq;
    }

    public String getStreamId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ec97f168", new Object[]{this});
        }
        return this.streamId;
    }

    public long getSyncTimeoutInMill() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("63747c0c", new Object[]{this})).longValue();
        }
        return this.syncTimeoutInMill;
    }

    public String getUserId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("58ad3b3d", new Object[]{this});
        }
        return this.userId;
    }

    public boolean isSaveDB() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a4b80a90", new Object[]{this})).booleanValue();
        }
        return this.saveDB;
    }

    public AccsStreamConfig setEndSeq(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AccsStreamConfig) ipChange.ipc$dispatch("117c5578", new Object[]{this, new Integer(i)});
        }
        this.endSeq = i;
        return this;
    }

    public void setSaveDB(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6911790", new Object[]{this, new Boolean(z)});
        } else {
            this.saveDB = z;
        }
    }

    public AccsStreamConfig setSeqSnapshotInterval(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AccsStreamConfig) ipChange.ipc$dispatch("37ff1098", new Object[]{this, new Integer(i)});
        }
        this.seqSnapshotInterval = i;
        return this;
    }

    public AccsStreamConfig setServiceId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AccsStreamConfig) ipChange.ipc$dispatch("319f98a1", new Object[]{this, str});
        }
        this.serviceId = str;
        return this;
    }

    public AccsStreamConfig setStartSeq(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AccsStreamConfig) ipChange.ipc$dispatch("23e8853f", new Object[]{this, new Integer(i)});
        }
        this.startSeq = i;
        return this;
    }

    public AccsStreamConfig setStreamId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AccsStreamConfig) ipChange.ipc$dispatch("54974ef0", new Object[]{this, str});
        }
        this.streamId = str;
        return this;
    }

    public void setSyncTimeoutInMill(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d5f19b8", new Object[]{this, new Long(j)});
        } else {
            this.syncTimeoutInMill = j;
        }
    }

    public void setUserId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ca419d9", new Object[]{this, str});
        } else {
            this.userId = str;
        }
    }
}

package com.alibaba.security.client.smart.core.track.model;

import android.os.Process;
import com.alibaba.security.ccrc.manager.CcrcContextImpl;
import com.alibaba.security.ccrc.service.build.C1164h;
import com.alibaba.security.ccrc.service.build.vb;
import com.alibaba.security.client.smart.core.core.WukongNativeManager;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import tb.qp0;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class TrackLog implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String ccrcCode;
    public long count;
    public Map<String, Object> ext;
    public String logId;
    public String metaId;
    public String operation;
    public String pId;
    public Map<String, Object> params;
    public String phase;
    public String riskId;
    public String sampleId;
    public int status;
    public String tag;
    public long ts;

    public static Builder newBuilder() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Builder) ipChange.ipc$dispatch("3817a3a5", new Object[0]);
        }
        return new Builder();
    }

    public TrackLog() {
        this.count = 1L;
    }

    public TrackLog(Builder builder) {
        this.count = 1L;
        this.pId = builder.pId;
        this.metaId = builder.metaId;
        this.sampleId = builder.sampleId;
        this.ccrcCode = builder.ccrcCode;
        this.phase = builder.phase;
        this.operation = builder.operation;
        this.params = builder.params;
        this.status = builder.status;
        this.tag = builder.tag;
        this.ext = builder.ext;
        this.ts = builder.ts;
        this.count = builder.count;
        this.riskId = builder.riskId;
        this.logId = builder.logId;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class Builder {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public String ccrcCode;
        public long count;
        public Map<String, Object> ext;
        public String logId;
        public String metaId;
        public String operation;
        public String pId;
        public Map<String, Object> params;
        public String phase;
        public String riskId;
        public String sampleId;
        public int status;
        public String tag;
        public long ts;

        public Builder(TrackLog trackLog) {
            this.count = 1L;
            this.pId = trackLog.pId;
            this.metaId = trackLog.metaId;
            this.sampleId = trackLog.sampleId;
            this.ccrcCode = trackLog.ccrcCode;
            this.phase = trackLog.phase;
            this.operation = trackLog.operation;
            this.params = trackLog.params;
            this.status = trackLog.status;
            this.tag = trackLog.tag;
            this.ext = trackLog.ext;
            this.ts = trackLog.ts;
            this.riskId = trackLog.riskId;
            this.count = trackLog.count;
            this.logId = trackLog.logId;
        }

        public static /* synthetic */ String access$000(Builder builder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("575ff7e4", new Object[]{builder});
            }
            return builder.pId;
        }

        public static /* synthetic */ String access$100(Builder builder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("3d0b5465", new Object[]{builder});
            }
            return builder.metaId;
        }

        public static /* synthetic */ long access$1000(Builder builder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("59e36c61", new Object[]{builder})).longValue();
            }
            return builder.ts;
        }

        public static /* synthetic */ long access$1100(Builder builder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("9bfa99c0", new Object[]{builder})).longValue();
            }
            return builder.count;
        }

        public static /* synthetic */ String access$1200(Builder builder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("9a9008d5", new Object[]{builder});
            }
            return builder.riskId;
        }

        public static /* synthetic */ String access$1300(Builder builder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("803b6556", new Object[]{builder});
            }
            return builder.logId;
        }

        public static /* synthetic */ String access$200(Builder builder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("22b6b0e6", new Object[]{builder});
            }
            return builder.sampleId;
        }

        public static /* synthetic */ String access$300(Builder builder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8620d67", new Object[]{builder});
            }
            return builder.ccrcCode;
        }

        public static /* synthetic */ String access$400(Builder builder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("ee0d69e8", new Object[]{builder});
            }
            return builder.phase;
        }

        public static /* synthetic */ String access$500(Builder builder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("d3b8c669", new Object[]{builder});
            }
            return builder.operation;
        }

        public static /* synthetic */ Map access$600(Builder builder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("908d982b", new Object[]{builder});
            }
            return builder.params;
        }

        public static /* synthetic */ int access$700(Builder builder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("5a74b9c8", new Object[]{builder})).intValue();
            }
            return builder.status;
        }

        public static /* synthetic */ String access$800(Builder builder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("84badbec", new Object[]{builder});
            }
            return builder.tag;
        }

        public static /* synthetic */ Map access$900(Builder builder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("38602988", new Object[]{builder});
            }
            return builder.ext;
        }

        public Builder addAllExt(Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("22102300", new Object[]{this, map});
            }
            if (this.ext == null) {
                this.ext = new HashMap();
            }
            this.ext.putAll(map);
            return this;
        }

        public Builder addAllParam(Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("395ba314", new Object[]{this, map});
            }
            if (this.params == null) {
                this.params = new HashMap();
            }
            if (map != null) {
                this.params.putAll(map);
            }
            return this;
        }

        public Builder addExt(String str, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("5a657730", new Object[]{this, str, obj});
            }
            if (this.ext == null) {
                this.ext = new HashMap();
            }
            this.ext.put(str, obj);
            return this;
        }

        public Builder addParam(String str, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("fd26e7dc", new Object[]{this, str, obj});
            }
            if (this.params == null) {
                this.params = new HashMap();
            }
            this.params.put(str, obj);
            return this;
        }

        public TrackLog build() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TrackLog) ipChange.ipc$dispatch("2bfc752f", new Object[]{this});
            }
            if (!C1164h.a()) {
                addExt("pre", Boolean.TRUE);
            }
            addExt("processID", Integer.valueOf(Process.myPid()));
            addExt("deviceLevel", Integer.valueOf(qp0.b()));
            addExt("isSoLoadSuccess", Boolean.valueOf(WukongNativeManager.c().b()));
            addExt("ttid", CcrcContextImpl.getInstance().getTtid());
            addExt("diskCache", Boolean.valueOf(vb.c().f()));
            return new TrackLog(this);
        }

        public Builder setCcrcCode(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("76c1874", new Object[]{this, str});
            }
            this.ccrcCode = str;
            return this;
        }

        public Builder setCount(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("7f13dd33", new Object[]{this, new Long(j)});
            }
            this.count = j;
            return this;
        }

        public Builder setExt(Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("411c8fa2", new Object[]{this, map});
            }
            this.ext = map;
            return this;
        }

        public Builder setLogId(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("fee2cfd1", new Object[]{this, str});
            }
            this.logId = str;
            return this;
        }

        public Builder setMetaId(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("1b836856", new Object[]{this, str});
            }
            this.metaId = str;
            return this;
        }

        public Builder setOperation(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("ec8c98b9", new Object[]{this, str});
            }
            this.operation = str;
            return this;
        }

        public Builder setParams(Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("eb828b59", new Object[]{this, map});
            }
            this.params = map;
            return this;
        }

        public Builder setPhase(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("32344acd", new Object[]{this, str});
            }
            this.phase = str;
            return this;
        }

        public Builder setRiskId(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("4816ba20", new Object[]{this, str});
            }
            this.riskId = str;
            return this;
        }

        public Builder setSampleId(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("61d5cdfb", new Object[]{this, str});
            }
            this.sampleId = str;
            return this;
        }

        public Builder setStatus(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("2f26a8ab", new Object[]{this, new Integer(i)});
            }
            this.status = i;
            return this;
        }

        public Builder setTag(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("dcc7ac", new Object[]{this, str});
            }
            this.tag = str;
            return this;
        }

        public Builder setTs(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("e4fa62ff", new Object[]{this, new Long(j)});
            }
            this.ts = j;
            return this;
        }

        public Builder setpId(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("e17dda9d", new Object[]{this, str});
            }
            this.pId = str;
            return this;
        }

        public Builder() {
            this.count = 1L;
            this.ts = System.currentTimeMillis();
            this.params = new HashMap();
            this.logId = this.ts + "_" + UUID.randomUUID().toString();
        }
    }
}

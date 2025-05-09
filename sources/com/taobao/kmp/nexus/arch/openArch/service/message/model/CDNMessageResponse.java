package com.taobao.kmp.nexus.arch.openArch.service.message.model;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import tb.a07;
import tb.nzf;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\f\u0018\u0000 @2\u00020\u00012\u00060\u0002j\u0002`\u0003:\u0001AB\u0007¢\u0006\u0004\b\u0004\u0010\u0005R$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR$\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\b\u001a\u0004\b\u000e\u0010\n\"\u0004\b\u000f\u0010\fR*\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR$\u0010\u001f\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010\u001c\"\u0004\b!\u0010\u001eR$\u0010\"\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u001a\u001a\u0004\b#\u0010\u001c\"\u0004\b$\u0010\u001eR$\u0010&\u001a\u0004\u0018\u00010%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R0\u0010-\u001a\u0010\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u0018\u0018\u00010,8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R$\u00103\u001a\u0004\u0018\u00010%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u0010'\u001a\u0004\b4\u0010)\"\u0004\b5\u0010+R$\u00107\u001a\u0004\u0018\u0001068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R$\u0010=\u001a\u0004\u0018\u00010%8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b=\u0010'\u001a\u0004\b>\u0010)\"\u0004\b?\u0010+¨\u0006B"}, d2 = {"Lcom/taobao/kmp/nexus/arch/openArch/service/message/model/CDNMessageResponse;", "Ltb/nzf;", "Ljava/io/Serializable;", "Lcom/taobao/uniinfra_kmp/common_utils/serialization/Serializable;", "<init>", "()V", "", "startTime", "Ljava/lang/Long;", "getStartTime", "()Ljava/lang/Long;", "setStartTime", "(Ljava/lang/Long;)V", "endTime", "getEndTime", "setEndTime", "", "Lcom/taobao/kmp/nexus/arch/openArch/service/message/model/CDNMessagePayload;", "payloads", "Ljava/util/List;", "getPayloads", "()Ljava/util/List;", "setPayloads", "(Ljava/util/List;)V", "", "dataSize", "Ljava/lang/Integer;", "getDataSize", "()Ljava/lang/Integer;", "setDataSize", "(Ljava/lang/Integer;)V", "colorRate", "getColorRate", "setColorRate", "pullInterval", "getPullInterval", "setPullInterval", "", "pullPolicy", "Ljava/lang/String;", "getPullPolicy", "()Ljava/lang/String;", "setPullPolicy", "(Ljava/lang/String;)V", "", "subTypeColorRate", "Ljava/util/Map;", "getSubTypeColorRate", "()Ljava/util/Map;", "setSubTypeColorRate", "(Ljava/util/Map;)V", "traceId", "getTraceId", "setTraceId", "", "hasError", "Ljava/lang/Boolean;", "getHasError", "()Ljava/lang/Boolean;", "setHasError", "(Ljava/lang/Boolean;)V", "uuid", "getUuid", "setUuid", "Companion", "a", "nexus_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class CDNMessageResponse implements nzf, Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    private Integer colorRate;
    private Integer dataSize;
    private Long endTime;
    private Boolean hasError;
    private List<CDNMessagePayload> payloads;
    private Integer pullInterval;
    private String pullPolicy;
    private Long startTime;
    private Map<String, Integer> subTypeColorRate;
    private String traceId;
    private String uuid;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        static {
            t2o.a(1004536577);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(1004536576);
        t2o.a(1029701651);
    }

    public final Integer getColorRate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("2344985b", new Object[]{this});
        }
        return this.colorRate;
    }

    public final Integer getDataSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("9a8f356f", new Object[]{this});
        }
        return this.dataSize;
    }

    public final Long getEndTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Long) ipChange.ipc$dispatch("a1c6a25c", new Object[]{this});
        }
        return this.endTime;
    }

    public final Boolean getHasError() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("8ca1e448", new Object[]{this});
        }
        return this.hasError;
    }

    public final List<CDNMessagePayload> getPayloads() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("d4a41ce5", new Object[]{this});
        }
        return this.payloads;
    }

    public final Integer getPullInterval() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("64adec8e", new Object[]{this});
        }
        return this.pullInterval;
    }

    public final String getPullPolicy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a691914c", new Object[]{this});
        }
        return this.pullPolicy;
    }

    public final Long getStartTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Long) ipChange.ipc$dispatch("7e8a3975", new Object[]{this});
        }
        return this.startTime;
    }

    public final Map<String, Integer> getSubTypeColorRate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a3eb1e9b", new Object[]{this});
        }
        return this.subTypeColorRate;
    }

    public final String getTraceId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9afc202f", new Object[]{this});
        }
        return this.traceId;
    }

    @Override // tb.nzf
    public String getUuid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1a2f0b68", new Object[]{this});
        }
        return this.uuid;
    }

    public nzf keepObj() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nzf) ipChange.ipc$dispatch("f9044030", new Object[]{this});
        }
        return nzf.a.a(this);
    }

    public void release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
        } else {
            nzf.a.b(this);
        }
    }

    public final void setColorRate(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cde0c4cf", new Object[]{this, num});
        } else {
            this.colorRate = num;
        }
    }

    public final void setDataSize(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b3dfea3", new Object[]{this, num});
        } else {
            this.dataSize = num;
        }
    }

    public final void setEndTime(Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90ecc34c", new Object[]{this, l});
        } else {
            this.endTime = l;
        }
    }

    public final void setHasError(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bae8756", new Object[]{this, bool});
        } else {
            this.hasError = bool;
        }
    }

    public final void setPayloads(List<CDNMessagePayload> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9582f91f", new Object[]{this, list});
        } else {
            this.payloads = list;
        }
    }

    public final void setPullInterval(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77585164", new Object[]{this, num});
        } else {
            this.pullInterval = num;
        }
    }

    public final void setPullPolicy(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a28a1faa", new Object[]{this, str});
        } else {
            this.pullPolicy = str;
        }
    }

    public final void setStartTime(Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6c70253", new Object[]{this, l});
        } else {
            this.startTime = l;
        }
    }

    public final void setSubTypeColorRate(Map<String, Integer> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6119b353", new Object[]{this, map});
        } else {
            this.subTypeColorRate = map;
        }
    }

    public final void setTraceId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb8b6e8f", new Object[]{this, str});
        } else {
            this.traceId = str;
        }
    }

    @Override // tb.nzf
    public void setUuid(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c031a20e", new Object[]{this, str});
        } else {
            this.uuid = str;
        }
    }
}

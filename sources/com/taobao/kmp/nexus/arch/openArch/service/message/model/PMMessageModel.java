package com.taobao.kmp.nexus.arch.openArch.service.message.model;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.kmp.kernel.serviceinterface.KSPowerMsgMessageHeader;
import java.util.Map;
import kotlin.Metadata;
import tb.t2o;
import tb.v4s;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR(\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\r\"\u0004\b\u001f\u0010\u000fR\u001c\u0010 \u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\r\"\u0004\b\"\u0010\u000f¨\u0006#"}, d2 = {"Lcom/taobao/kmp/nexus/arch/openArch/service/message/model/PMMessageModel;", "Lcom/taobao/kmp/kernel/serviceinterface/KSPowerMsgMessageHeader;", "<init>", "()V", "bizCode", "", "getBizCode", "()I", "setBizCode", "(I)V", "msg", "", "getMsg", "()Ljava/lang/String;", "setMsg", "(Ljava/lang/String;)V", "liveId", "getLiveId", "setLiveId", "anchorAccountId", "getAnchorAccountId", "setAnchorAccountId", "bizParams", "", "", "getBizParams", "()Ljava/util/Map;", "setBizParams", "(Ljava/util/Map;)V", "liveToken", "getLiveToken", "setLiveToken", v4s.PARAM_SESSION_ID, "getSessionID", "setSessionID", "nexus_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class PMMessageModel extends KSPowerMsgMessageHeader {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String anchorAccountId;
    private int bizCode = 1;
    private Map<String, ? extends Object> bizParams;
    private String liveId;
    private String liveToken;
    private String msg;
    private String sessionID;

    static {
        t2o.a(1004536587);
    }

    public static /* synthetic */ Object ipc$super(PMMessageModel pMMessageModel, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/kmp/nexus/arch/openArch/service/message/model/PMMessageModel");
    }

    public final String getAnchorAccountId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("63e7905c", new Object[]{this});
        }
        return this.anchorAccountId;
    }

    public final int getBizCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("842ad8e4", new Object[]{this})).intValue();
        }
        return this.bizCode;
    }

    public final Map<String, Object> getBizParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("79854d7f", new Object[]{this});
        }
        return this.bizParams;
    }

    public final String getLiveId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3d7740fc", new Object[]{this});
        }
        return this.liveId;
    }

    public final String getLiveToken() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a3e779a2", new Object[]{this});
        }
        return this.liveToken;
    }

    public final String getMsg() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a817838e", new Object[]{this});
        }
        return this.msg;
    }

    public final String getSessionID() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3ed78a5e", new Object[]{this});
        }
        return this.sessionID;
    }

    public final void setAnchorAccountId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3325002", new Object[]{this, str});
        } else {
            this.anchorAccountId = str;
        }
    }

    public final void setBizCode(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3779b33e", new Object[]{this, new Integer(i)});
        } else {
            this.bizCode = i;
        }
    }

    public final void setBizParams(Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9cf6c87", new Object[]{this, map});
        } else {
            this.bizParams = map;
        }
    }

    public final void setLiveId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("111acbfa", new Object[]{this, str});
        } else {
            this.liveId = str;
        }
    }

    public final void setLiveToken(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b45767c", new Object[]{this, str});
        } else {
            this.liveToken = str;
        }
    }

    public final void setMsg(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4965d110", new Object[]{this, str});
        } else {
            this.msg = str;
        }
    }

    public final void setSessionID(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e577d40", new Object[]{this, str});
        } else {
            this.sessionID = str;
        }
    }
}

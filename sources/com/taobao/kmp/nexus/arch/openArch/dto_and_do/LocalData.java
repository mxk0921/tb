package com.taobao.kmp.nexus.arch.openArch.dto_and_do;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import kotlin.Metadata;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\b\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\tR\u001a\u0010\f\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u0007\"\u0004\b\r\u0010\tR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013¨\u0006\u0017"}, d2 = {"Lcom/taobao/kmp/nexus/arch/openArch/dto_and_do/LocalData;", "Ljava/io/Serializable;", "Lcom/taobao/uniinfra_kmp/common_utils/serialization/Serializable;", "<init>", "()V", "isLiveDetailReqSuccess", "", "()Z", "setLiveDetailReqSuccess", "(Z)V", "isLiveDetailHasRequest", "setLiveDetailHasRequest", "isPmHasRegister", "setPmHasRegister", "liveToken", "", "getLiveToken", "()Ljava/lang/String;", "setLiveToken", "(Ljava/lang/String;)V", "pmSessionID", "getPmSessionID", "setPmSessionID", "nexus_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class LocalData implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean isLiveDetailHasRequest;
    private boolean isLiveDetailReqSuccess;
    private boolean isPmHasRegister;
    private String liveToken;
    private String pmSessionID;

    static {
        t2o.a(1004535860);
    }

    public final String getLiveToken() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a3e779a2", new Object[]{this});
        }
        return this.liveToken;
    }

    public final String getPmSessionID() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6336e63b", new Object[]{this});
        }
        return this.pmSessionID;
    }

    public final boolean isLiveDetailHasRequest() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1a6a75a7", new Object[]{this})).booleanValue();
        }
        return this.isLiveDetailHasRequest;
    }

    public final boolean isLiveDetailReqSuccess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7979897", new Object[]{this})).booleanValue();
        }
        return this.isLiveDetailReqSuccess;
    }

    public final boolean isPmHasRegister() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8c25b5a1", new Object[]{this})).booleanValue();
        }
        return this.isPmHasRegister;
    }

    public final void setLiveDetailHasRequest(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d605159", new Object[]{this, new Boolean(z)});
        } else {
            this.isLiveDetailHasRequest = z;
        }
    }

    public final void setLiveDetailReqSuccess(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35d78c69", new Object[]{this, new Boolean(z)});
        } else {
            this.isLiveDetailReqSuccess = z;
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

    public final void setPmHasRegister(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d06b020f", new Object[]{this, new Boolean(z)});
        } else {
            this.isPmHasRegister = z;
        }
    }

    public final void setPmSessionID(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b5d1003", new Object[]{this, str});
        } else {
            this.pmSessionID = str;
        }
    }
}

package com.taobao.android.appdevtools.core.model;

import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import kotlin.Metadata;
import tb.ckf;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J;\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001c"}, d2 = {"Lcom/taobao/android/appdevtools/core/model/RemoteDebugParam;", "Ljava/io/Serializable;", "appWsUrl", "", "debugId", "wsUrl", "ucVersion", "strategy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAppWsUrl", "()Ljava/lang/String;", "getDebugId", "getStrategy", "getUcVersion", "getWsUrl", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "toString", "appdevtools-core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class RemoteDebugParam implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String appWsUrl;
    private final String debugId;
    private final String strategy;
    @SerializedName("uc_version")
    private final String ucVersion;
    private final String wsUrl;

    static {
        t2o.a(998244390);
    }

    public RemoteDebugParam(String str, String str2, String str3, @JSONField(name = "uc_version") String str4, String str5) {
        ckf.g(str, "appWsUrl");
        ckf.g(str2, "debugId");
        ckf.g(str3, "wsUrl");
        ckf.g(str4, "ucVersion");
        ckf.g(str5, "strategy");
        this.appWsUrl = str;
        this.debugId = str2;
        this.wsUrl = str3;
        this.ucVersion = str4;
        this.strategy = str5;
    }

    public static /* synthetic */ RemoteDebugParam copy$default(RemoteDebugParam remoteDebugParam, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RemoteDebugParam) ipChange.ipc$dispatch("bd5b478a", new Object[]{remoteDebugParam, str, str2, str3, str4, str5, new Integer(i), obj});
        }
        if ((i & 1) != 0) {
            str = remoteDebugParam.appWsUrl;
        }
        if ((i & 2) != 0) {
            str2 = remoteDebugParam.debugId;
        }
        if ((i & 4) != 0) {
            str3 = remoteDebugParam.wsUrl;
        }
        if ((i & 8) != 0) {
            str4 = remoteDebugParam.ucVersion;
        }
        if ((i & 16) != 0) {
            str5 = remoteDebugParam.strategy;
        }
        return remoteDebugParam.copy(str, str2, str3, str4, str5);
    }

    public final String component1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7dfa78a5", new Object[]{this});
        }
        return this.appWsUrl;
    }

    public final String component2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4803344", new Object[]{this});
        }
        return this.debugId;
    }

    public final String component3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8b05ede3", new Object[]{this});
        }
        return this.wsUrl;
    }

    public final String component4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("118ba882", new Object[]{this});
        }
        return this.ucVersion;
    }

    public final String component5() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("98116321", new Object[]{this});
        }
        return this.strategy;
    }

    public final RemoteDebugParam copy(String str, String str2, String str3, @JSONField(name = "uc_version") String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RemoteDebugParam) ipChange.ipc$dispatch("5619a95c", new Object[]{this, str, str2, str3, str4, str5});
        }
        ckf.g(str, "appWsUrl");
        ckf.g(str2, "debugId");
        ckf.g(str3, "wsUrl");
        ckf.g(str4, "ucVersion");
        ckf.g(str5, "strategy");
        return new RemoteDebugParam(str, str2, str3, str4, str5);
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RemoteDebugParam)) {
            return false;
        }
        RemoteDebugParam remoteDebugParam = (RemoteDebugParam) obj;
        if (ckf.b(this.appWsUrl, remoteDebugParam.appWsUrl) && ckf.b(this.debugId, remoteDebugParam.debugId) && ckf.b(this.wsUrl, remoteDebugParam.wsUrl) && ckf.b(this.ucVersion, remoteDebugParam.ucVersion) && ckf.b(this.strategy, remoteDebugParam.strategy)) {
            return true;
        }
        return false;
    }

    public final String getAppWsUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("76907b31", new Object[]{this});
        }
        return this.appWsUrl;
    }

    public final String getDebugId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ea0fab61", new Object[]{this});
        }
        return this.debugId;
    }

    public final String getStrategy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8f8429b0", new Object[]{this});
        }
        return this.strategy;
    }

    public final String getUcVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ce1f0bc5", new Object[]{this});
        }
        return this.ucVersion;
    }

    public final String getWsUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cb36dfdc", new Object[]{this});
        }
        return this.wsUrl;
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        return (((((((this.appWsUrl.hashCode() * 31) + this.debugId.hashCode()) * 31) + this.wsUrl.hashCode()) * 31) + this.ucVersion.hashCode()) * 31) + this.strategy.hashCode();
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "RemoteDebugParam(appWsUrl=" + this.appWsUrl + ", debugId=" + this.debugId + ", wsUrl=" + this.wsUrl + ", ucVersion=" + this.ucVersion + ", strategy=" + this.strategy + ')';
    }
}

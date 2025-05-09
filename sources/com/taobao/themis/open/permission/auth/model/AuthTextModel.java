package com.taobao.themis.open.permission.auth.model;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import kotlin.Metadata;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000e¨\u0006\u0015"}, d2 = {"Lcom/taobao/themis/open/permission/auth/model/AuthTextModel;", "Ljava/io/Serializable;", "()V", "authInfo", "Lcom/alibaba/fastjson/JSONObject;", "getAuthInfo", "()Lcom/alibaba/fastjson/JSONObject;", "setAuthInfo", "(Lcom/alibaba/fastjson/JSONObject;)V", "authSceneDesc", "", "getAuthSceneDesc", "()Ljava/lang/String;", "setAuthSceneDesc", "(Ljava/lang/String;)V", "authText", "getAuthText", "setAuthText", "scopeName", "getScopeName", "setScopeName", "themis_open_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class AuthTextModel implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private JSONObject authInfo;
    private String authSceneDesc;
    private String authText;
    private String scopeName;

    static {
        t2o.a(843055337);
    }

    public final JSONObject getAuthInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("c1afad93", new Object[]{this});
        }
        return this.authInfo;
    }

    public final String getAuthSceneDesc() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c76e2b9a", new Object[]{this});
        }
        return this.authSceneDesc;
    }

    public final String getAuthText() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("deef6f6e", new Object[]{this});
        }
        return this.authText;
    }

    public final String getScopeName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("65839250", new Object[]{this});
        }
        return this.scopeName;
    }

    public final void setAuthInfo(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88dd1d51", new Object[]{this, jSONObject});
        } else {
            this.authInfo = jSONObject;
        }
    }

    public final void setAuthSceneDesc(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5af72984", new Object[]{this, str});
        } else {
            this.authSceneDesc = str;
        }
    }

    public final void setAuthText(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89dbd8c8", new Object[]{this, str});
        } else {
            this.authText = str;
        }
    }

    public final void setScopeName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd2c738e", new Object[]{this, str});
        } else {
            this.scopeName = str;
        }
    }
}

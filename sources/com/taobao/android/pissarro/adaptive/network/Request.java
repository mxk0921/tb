package com.taobao.android.pissarro.adaptive.network;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class Request implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String apiName;
    private boolean needEcode;
    private boolean needSession;
    private boolean needWua;
    private Map<String, Serializable> parameters;
    private RequestType type = RequestType.GET;
    private String version;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public enum RequestType {
        GET,
        POST;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(RequestType requestType, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/pissarro/adaptive/network/Request$RequestType");
        }

        public static RequestType valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (RequestType) ipChange.ipc$dispatch("c11f70dd", new Object[]{str});
            }
            return (RequestType) Enum.valueOf(RequestType.class, str);
        }
    }

    static {
        t2o.a(623902747);
    }

    public Request(String str, String str2) {
        this.apiName = str;
        this.version = str2;
    }

    public String getApiName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8523c6ca", new Object[]{this});
        }
        return this.apiName;
    }

    public Map<String, Serializable> getParameters() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("367605c", new Object[]{this});
        }
        return this.parameters;
    }

    public RequestType getType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RequestType) ipChange.ipc$dispatch("abc7bc1f", new Object[]{this});
        }
        return this.type;
    }

    public String getVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2a8fef97", new Object[]{this});
        }
        return this.version;
    }

    public boolean isNeedEcode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f430765d", new Object[]{this})).booleanValue();
        }
        return this.needEcode;
    }

    public boolean isNeedSession() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("64a44321", new Object[]{this})).booleanValue();
        }
        return this.needSession;
    }

    public boolean isNeedWua() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e179ef4e", new Object[]{this})).booleanValue();
        }
        return this.needWua;
    }

    public void setApiName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26589b54", new Object[]{this, str});
        } else {
            this.apiName = str;
        }
    }

    public void setNeedEcode(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1c1b4d3", new Object[]{this, new Boolean(z)});
        } else {
            this.needEcode = z;
        }
    }

    public void setNeedSession(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1d1128f", new Object[]{this, new Boolean(z)});
        } else {
            this.needSession = z;
        }
    }

    public void setNeedWua(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12614802", new Object[]{this, new Boolean(z)});
        } else {
            this.needWua = z;
        }
    }

    public void setParameters(Map<String, Serializable> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c38950b2", new Object[]{this, map});
        } else {
            this.parameters = map;
        }
    }

    public void setType(RequestType requestType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("639713a3", new Object[]{this, requestType});
        } else {
            this.type = requestType;
        }
    }

    public void setVersion(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e718c27", new Object[]{this, str});
        } else {
            this.version = str;
        }
    }
}

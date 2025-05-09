package com.taobao.taolive.sdk.adapter.network;

import android.os.Handler;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class NetRequest implements Serializable, INetDataObject {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final long serialVersionUID = 4662483339645196288L;
    private String apiName;
    public Map<String, String> dataParams;
    private String dataType;
    private boolean isPost;
    private Handler mRequestNotifyHandler;
    private boolean needEcode;
    private boolean needSession;
    private Object requestContext;
    private Map<String, String> requestHeaders;
    private String sessionOption;
    private long timer;
    private String ttid;
    private String version;
    private String data = "{}";
    private String bizId = "-1";
    private boolean isUseWua = false;

    static {
        t2o.a(806355934);
        t2o.a(806355930);
    }

    public String getApiName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8523c6ca", new Object[]{this});
        }
        return this.apiName;
    }

    public String getBizId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d09a5221", new Object[]{this});
        }
        return this.bizId;
    }

    public String getData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3f6b2ad9", new Object[]{this});
        }
        return this.data;
    }

    public Map<String, String> getDataParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("42c19ec2", new Object[]{this});
        }
        return this.dataParams;
    }

    public String getDataType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fa55b3bf", new Object[]{this});
        }
        return this.dataType;
    }

    public Object getRequestContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("340f8235", new Object[]{this});
        }
        return this.requestContext;
    }

    public Map<String, String> getRequestHeaders() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a1965029", new Object[]{this});
        }
        return this.requestHeaders;
    }

    public Handler getRequestNotifyHandler() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("a71573f7", new Object[]{this});
        }
        return this.mRequestNotifyHandler;
    }

    public String getSessionOption() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("85801f24", new Object[]{this});
        }
        return this.sessionOption;
    }

    public long getTimer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("287d28a", new Object[]{this})).longValue();
        }
        return this.timer;
    }

    public String getTtid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("99fd2f88", new Object[]{this});
        }
        return this.ttid;
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

    public boolean isPost() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fdc47475", new Object[]{this})).booleanValue();
        }
        return this.isPost;
    }

    public boolean isUseWua() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("84e1d191", new Object[]{this})).booleanValue();
        }
        return this.isUseWua;
    }

    public void setApiName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26589b54", new Object[]{this, str});
        } else {
            this.apiName = str;
        }
    }

    public void setBizId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef8887dd", new Object[]{this, str});
        } else {
            this.bizId = str;
        }
    }

    public void setData(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("427970bd", new Object[]{this, str});
        } else {
            this.data = str;
        }
    }

    public void setDataParams(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f76df0c", new Object[]{this, map});
        } else {
            this.dataParams = map;
        }
    }

    public void setDataType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db3e1e97", new Object[]{this, str});
        } else {
            this.dataType = str;
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

    public void setPost(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d04ebc4b", new Object[]{this, new Boolean(z)});
        } else {
            this.isPost = z;
        }
    }

    public void setRequestContext(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76c47c45", new Object[]{this, obj});
        } else {
            this.requestContext = obj;
        }
    }

    public void setRequestHeaders(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbec0085", new Object[]{this, map});
        } else {
            this.requestHeaders = map;
        }
    }

    public void setRequestNotifyHandler(Handler handler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0731b2b", new Object[]{this, handler});
        } else {
            this.mRequestNotifyHandler = handler;
        }
    }

    public void setSessionOption(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f23a73a", new Object[]{this, str});
        } else {
            this.sessionOption = str;
        }
    }

    public void setTimer(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c9744fa", new Object[]{this, new Long(j)});
        } else {
            this.timer = j;
        }
    }

    public void setTtid(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a2801ee", new Object[]{this, str});
        } else {
            this.ttid = str;
        }
    }

    public void setUseWua(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dba030af", new Object[]{this, new Boolean(z)});
        } else {
            this.isUseWua = z;
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

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "NetRequest{apiName='" + this.apiName + "', version='" + this.version + "', data='" + this.data + "', needEcode=" + this.needEcode + ", needSession=" + this.needSession + ", dataParams=" + this.dataParams + ", requestContext=" + this.requestContext + ", isPost=" + this.isPost + ", timer=" + this.timer + ", sessionOption='" + this.sessionOption + "', dataType='" + this.dataType + "', requestHeaders=" + this.requestHeaders + ", bizId='" + this.bizId + "', ttid='" + this.ttid + "', isUseWua=" + this.isUseWua + '}';
    }
}

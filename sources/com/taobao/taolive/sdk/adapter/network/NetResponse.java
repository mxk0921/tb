package com.taobao.taolive.sdk.adapter.network;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class NetResponse implements Serializable, INetDataObject {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final long serialVersionUID = 8582228520750197871L;
    private String api;
    private byte[] bytedata;
    private JSONObject dataJsonObject;
    private Map<String, List<String>> headerFields;
    private String responseCode;
    private String retCode;
    private String retMsg;
    private String v;

    static {
        t2o.a(806355935);
        t2o.a(806355930);
    }

    public String getApi() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("67b7a95", new Object[]{this});
        }
        return this.api;
    }

    public byte[] getBytedata() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("6e9b5c0e", new Object[]{this});
        }
        return this.bytedata;
    }

    public JSONObject getDataJsonObject() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("7e24c17c", new Object[]{this});
        }
        return this.dataJsonObject;
    }

    public Map<String, List<String>> getHeaderFields() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d9dad198", new Object[]{this});
        }
        return this.headerFields;
    }

    public String getResponseCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("45f50135", new Object[]{this});
        }
        return this.responseCode;
    }

    public String getRetCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f243c01", new Object[]{this});
        }
        return this.retCode;
    }

    public String getRetMsg() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a526aea3", new Object[]{this});
        }
        return this.retMsg;
    }

    public String getV() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("22bdab39", new Object[]{this});
        }
        return this.v;
    }

    public boolean isApiSuccess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d4a34c5e", new Object[]{this})).booleanValue();
        }
        if (!"SUCCESS".equals(getRetCode()) || getBytedata() == null) {
            return false;
        }
        return true;
    }

    public void setApi(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b780bae9", new Object[]{this, str});
        } else {
            this.api = str;
        }
    }

    public void setBytedata(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2cdce7c2", new Object[]{this, bArr});
        } else {
            this.bytedata = bArr;
        }
    }

    public void setDataJsonObject(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18777064", new Object[]{this, jSONObject});
        } else {
            this.dataJsonObject = jSONObject;
        }
    }

    public void setHeaderFields(Map<String, List<String>> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36be39f6", new Object[]{this, map});
        } else {
            this.headerFields = map;
        }
    }

    public void setResponseCode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94999e1", new Object[]{this, str});
        } else {
            this.responseCode = str;
        }
    }

    public void setRetCode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c66ccfd", new Object[]{this, str});
        } else {
            this.retCode = str;
        }
    }

    public void setRetMsg(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f591333", new Object[]{this, str});
        } else {
            this.retMsg = str;
        }
    }

    public void setV(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efe82bc5", new Object[]{this, str});
        } else {
            this.v = str;
        }
    }
}

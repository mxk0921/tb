package com.taobao.android.detail.ttdetail.request.params;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.session.constants.SessionConstants;
import java.util.HashMap;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class CustomApiRequestParams implements MtopRequestParams {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private JSONObject mApiInfo;
    private String mApiName;
    private String mApiVersion;
    private String mBizTopic;
    private String mEcode;
    private String mEnableUpCompress;
    private Map<String, String> mHeaderMap = new HashMap();
    private Map<String, String> mParams;
    private String mRequestMethod;
    private String mSession;
    private String mUnitStrategy;
    private String mWua;

    static {
        t2o.a(912262182);
        t2o.a(912262184);
    }

    public CustomApiRequestParams(Map<String, String> map) {
        this.mParams = map;
        buildParams();
    }

    private void buildParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f2f3c1b", new Object[]{this});
            return;
        }
        JSONObject parseObject = JSON.parseObject(this.mParams.get("apiInfo"));
        this.mApiInfo = parseObject;
        if (parseObject != null) {
            this.mApiName = parseObject.getString("apiName");
            this.mApiVersion = this.mApiInfo.getString("apiVersion");
            this.mRequestMethod = this.mApiInfo.getString("method");
            this.mEcode = this.mApiInfo.getString(SessionConstants.ECODE);
            this.mSession = this.mApiInfo.getString(MspGlobalDefine.SESSION);
            this.mUnitStrategy = this.mApiInfo.getString("unitStrategy");
            this.mWua = this.mApiInfo.getString("WUA");
            this.mBizTopic = this.mApiInfo.getString("topic");
            this.mEnableUpCompress = this.mApiInfo.getString("enableUpstreamCompress");
            JSONObject parseObject2 = JSON.parseObject(this.mApiInfo.getString("headerInfo"));
            if (parseObject2 != null) {
                for (Map.Entry<String, Object> entry : parseObject2.entrySet()) {
                    this.mHeaderMap.put(entry.getKey(), String.valueOf(entry.getValue()));
                }
            }
        }
    }

    public String getApiName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8523c6ca", new Object[]{this});
        }
        return this.mApiName;
    }

    public String getApiVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("44c0ca25", new Object[]{this});
        }
        return this.mApiVersion;
    }

    public String getBizTopic() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6ebec4e7", new Object[]{this});
        }
        return this.mBizTopic;
    }

    public String getEcode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("42b43e5d", new Object[]{this});
        }
        return this.mEcode;
    }

    public String getEnableUpCompress() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("55578043", new Object[]{this});
        }
        return this.mEnableUpCompress;
    }

    public Map<String, String> getHeaderMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("79ac0f15", new Object[]{this});
        }
        return this.mHeaderMap;
    }

    public String getMethod() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5e63d782", new Object[]{this});
        }
        return this.mRequestMethod;
    }

    public String getSession() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("59f62c99", new Object[]{this});
        }
        return this.mSession;
    }

    public String getUnitStrategy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7072a98c", new Object[]{this});
        }
        return this.mUnitStrategy;
    }

    public String getWua() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ed67eb0c", new Object[]{this});
        }
        return this.mWua;
    }

    @Override // com.taobao.android.detail.ttdetail.request.params.MtopRequestParams
    public String toData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("add28f54", new Object[]{this});
        }
        return this.mParams.get("data");
    }
}

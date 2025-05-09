package com.alibaba.security.client.smart.core.model;

import android.os.Build;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.security.ccrc.manager.CcrcContextImpl;
import com.alibaba.security.ccrc.service.build.C1162ga;
import com.alibaba.security.client.smart.core.algo.SampleData;
import com.alibaba.security.wukong.model.meta.Data;
import com.alipay.android.msp.framework.db.MspDBHelper;
import com.android.alibaba.ip.runtime.IpChange;
import com.ta.utdid2.device.UTDevice;
import com.taobao.android.change.app.icon.biz.ChangeAppIconBridge;
import com.taobao.login4android.Login;
import com.taobao.weex.utils.tools.TimeCalculator;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import tb.pg1;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class InferContext implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CCRC_RESULT_KEY_DATA_ID = "dataId";
    public static final String CCRC_RESULT_KEY_EXTRAS = "extras";
    public static final String CCRC_RESULT_KEY_META_ID = "metaId";
    public static final String CCRC_RESULT_KEY_RISK_ID = "riskId";
    public static final String CCRC_RESULT_KEY_USER_ID = "ccrcUserId";
    @JSONField(name = "appKey")
    public String appKey;
    @JSONField(name = "appName")
    public String appName;
    @JSONField(name = "bizFeatures")
    public Map<String, Object> bizFeatures;
    @JSONField(name = "ccrcCode")
    public String ccrcCode;
    @JSONField(name = "ccrcResults")
    public Map<String, Object> ccrcResults;
    @JSONField(name = ChangeAppIconBridge.KEY_DEVICEMODEL)
    public String deviceModel;
    @JSONField(name = "env")
    public String env;
    @JSONField(name = "wukong_uuid")
    public String eventId;
    @JSONField(name = CCRC_RESULT_KEY_META_ID)
    public String metaId;
    @JSONField(name = "osName")
    public String osName;
    @JSONField(name = "osVersion")
    public String osVersion;
    @JSONField(name = MspDBHelper.BizEntry.COLUMN_NAME_PID)
    public String pid;
    @JSONField(name = "prepareID")
    public String prepareID;
    @JSONField(name = pg1.ATOM_raw)
    public Map<String, Object> raw;
    @JSONField(name = "riskInfoVersion")
    public int riskInfoVersion;
    @JSONField(serialize = false)
    public SampleData sampleData;
    @JSONField(name = "sceneName")
    public String sceneName;
    @JSONField(name = "sdkVersion")
    public String sdkVersion;
    @JSONField(name = "utdid")
    public String utdid;

    public InferContext() {
    }

    private String a(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1a4c023", new Object[]{this, map});
        }
        if (map == null || !map.containsKey(CCRC_RESULT_KEY_USER_ID)) {
            return b() ? Login.getUserId() : "";
        }
        return (String) map.get(CCRC_RESULT_KEY_USER_ID);
    }

    private boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @JSONField(serialize = false)
    public Map<String, Object> getAlgoResults() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("3b37ca29", new Object[]{this});
        }
        HashMap hashMap = new HashMap(getCcrcResults());
        hashMap.remove("dataId");
        hashMap.remove(CCRC_RESULT_KEY_META_ID);
        hashMap.remove(CCRC_RESULT_KEY_RISK_ID);
        hashMap.remove(CCRC_RESULT_KEY_USER_ID);
        return hashMap;
    }

    public Map<String, Object> getCcrcResults() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("76ca23ab", new Object[]{this});
        }
        if (this.ccrcResults == null) {
            this.ccrcResults = new HashMap();
        }
        return this.ccrcResults;
    }

    @JSONField(serialize = false)
    public Map<String, Object> getExtras() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("cf016b95", new Object[]{this});
        }
        return (Map) getCcrcResults().get("extras");
    }

    @JSONField(serialize = false)
    public String getMetaId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("76fc2fc3", new Object[]{this});
        }
        return (String) getCcrcResults().get(CCRC_RESULT_KEY_META_ID);
    }

    @JSONField(serialize = false)
    public String getRiskId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f0d617b9", new Object[]{this});
        }
        return (String) getCcrcResults().get(CCRC_RESULT_KEY_RISK_ID);
    }

    @JSONField(serialize = false)
    public String getSampleID() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("25281e", new Object[]{this});
        }
        return (String) getCcrcResults().get("dataId");
    }

    public InferContext(String str, String str2, String str3, String str4, Map<String, Object> map, SampleData sampleData, int i, String str5) {
        this.sampleData = sampleData;
        this.ccrcCode = str;
        this.pid = str2;
        this.deviceModel = Build.MODEL;
        this.prepareID = str3;
        this.osName = TimeCalculator.PLATFORM_ANDROID;
        this.osVersion = Build.VERSION.RELEASE;
        this.appKey = CcrcContextImpl.getInstance().getAppKey();
        this.appName = CcrcContextImpl.getInstance().getAppName();
        this.sdkVersion = "2.0.0";
        this.eventId = a();
        this.sceneName = str4;
        this.utdid = UTDevice.getUtdid(CcrcContextImpl.getContext());
        this.ccrcResults = map;
        this.bizFeatures = C1162ga.a(str);
        this.riskInfoVersion = i;
        this.env = str5;
        if (sampleData != null) {
            this.metaId = sampleData.metaId;
            Data data = sampleData.mRawData;
            if (data != null) {
                this.raw = data.getRawMap();
            }
            getCcrcResults().putAll(sampleData.inputEngineParams());
            getCcrcResults().put(CCRC_RESULT_KEY_USER_ID, a(getExtras()));
        }
    }

    private String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        return UTDevice.getUtdid(CcrcContextImpl.getContext()) + "_ANDROID_WUKONG_" + System.currentTimeMillis() + "_" + UUID.randomUUID().toString().substring(0, 4);
    }
}

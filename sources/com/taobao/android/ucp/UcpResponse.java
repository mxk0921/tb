package com.taobao.android.ucp;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.sync.IndexUpdateHandler;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class UcpResponse {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public a bestBizItem;
    public List<a> bizList;
    public JSONObject ext;
    public transient JSONObject rawData;
    private String schemeId;
    private int statusCode = Status.UNKNOWN.value;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public enum Status {
        UNKNOWN(0),
        MODEL_SUCCESS(1),
        MODEL_ERROR(2),
        REQUEST_SUCCESS(4),
        REQUEST_DATA_ERROR(8),
        REQUEST_ERROR(16);
        
        private final int value;

        Status(int i) {
            this.value = i;
        }

        public static Status valueOf(int i) {
            Status status = MODEL_SUCCESS;
            if (i == status.value) {
                return status;
            }
            Status status2 = MODEL_ERROR;
            if (i == status2.value) {
                return status2;
            }
            Status status3 = REQUEST_SUCCESS;
            if (i == status3.value) {
                return status3;
            }
            Status status4 = REQUEST_DATA_ERROR;
            if (i == status4.value) {
                return status4;
            }
            Status status5 = REQUEST_ERROR;
            return i == status5.value ? status5 : UNKNOWN;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f9822a;
        public final JSONObject[] b;
        @JSONField(serialize = false)
        public transient JSONObject rawData;

        public a(JSONObject jSONObject) {
            this.f9822a = jSONObject.getString("schemeId");
            jSONObject.getString("bizId");
            jSONObject.getString(IndexUpdateHandler.IndexUpdateInfo.SYNC_KEY_RESOURCEID);
            jSONObject.getJSONObject("actualResult");
            jSONObject.getJSONObject("algParams");
            jSONObject.getJSONObject("ext");
            jSONObject.getString("features");
            JSONArray jSONArray = jSONObject.getJSONArray("materialSchemeList");
            if (jSONArray != null) {
                this.b = new JSONObject[jSONArray.size()];
                for (int i = 0; i < jSONArray.size(); i++) {
                    this.b[i] = jSONArray.getJSONObject(i);
                }
            }
            this.rawData = jSONObject;
        }

        public String a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("3c2f1a3", new Object[]{this});
            }
            return this.f9822a;
        }
    }

    public void addStatus(Status status) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6994ac54", new Object[]{this, status});
        } else {
            this.statusCode = status.value | this.statusCode;
        }
    }

    public int getStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fcf6c362", new Object[]{this})).intValue();
        }
        return this.statusCode;
    }

    public boolean isAllSuccess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("31ac2277", new Object[]{this})).booleanValue();
        }
        if (!isModelSuccess() || !isRequestSuccess()) {
            return false;
        }
        return true;
    }

    public boolean isModelSuccess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("562c116f", new Object[]{this})).booleanValue();
        }
        Status status = Status.MODEL_SUCCESS;
        if ((status.value & this.statusCode) == status.value) {
            return true;
        }
        return false;
    }

    public boolean isRequestSuccess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a6ee73c9", new Object[]{this})).booleanValue();
        }
        Status status = Status.REQUEST_SUCCESS;
        if ((status.value & this.statusCode) == status.value) {
            return true;
        }
        return false;
    }

    public boolean isSuccess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6049a784", new Object[]{this})).booleanValue();
        }
        return isRequestSuccess();
    }

    public void setModelData(JSONObject jSONObject) {
        int size;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d15c49b8", new Object[]{this, jSONObject});
            return;
        }
        this.rawData = jSONObject;
        JSONArray jSONArray = jSONObject.getJSONArray("bizList");
        if (jSONArray == null || (size = jSONArray.size()) <= 0) {
            this.bestBizItem = null;
            this.bizList = null;
            this.schemeId = null;
            return;
        }
        a aVar = new a(jSONArray.getJSONObject(0));
        this.bestBizItem = aVar;
        this.schemeId = aVar.a();
        this.bizList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            this.bizList.add(new a(jSONArray.getJSONObject(i)));
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("statusCode", (Object) Integer.valueOf(this.statusCode));
        jSONObject.put("schemeId", (Object) this.schemeId);
        jSONObject.put("bizList", (Object) this.bizList);
        jSONObject.put("bestBizItem", (Object) this.bestBizItem);
        return jSONObject.toJSONString();
    }
}

package com.meizu.cloud.pushsdk.platform.message;

import com.meizu.cloud.pushsdk.constants.PushConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class SubAliasStatus extends BasicPushStatus {
    private String alias;
    private String pushId;

    public SubAliasStatus() {
    }

    public String getAlias() {
        return this.alias;
    }

    public String getPushId() {
        return this.pushId;
    }

    @Override // com.meizu.cloud.pushsdk.platform.message.BasicPushStatus
    public void parseValueData(JSONObject jSONObject) throws JSONException {
        if (!jSONObject.isNull(PushConstants.KEY_PUSH_ID)) {
            setPushId(jSONObject.getString(PushConstants.KEY_PUSH_ID));
        }
        if (!jSONObject.isNull("alias")) {
            setAlias(jSONObject.getString("alias"));
        }
    }

    public void setAlias(String str) {
        this.alias = str;
    }

    public void setPushId(String str) {
        this.pushId = str;
    }

    @Override // com.meizu.cloud.pushsdk.platform.message.BasicPushStatus
    public String toString() {
        return super.toString() + " SubAliasStatus{pushId='" + this.pushId + "', alias='" + this.alias + "'}";
    }

    public SubAliasStatus(String str) {
        super(str);
    }
}

package com.meizu.cloud.pushsdk.platform.message;

import com.meizu.cloud.pushsdk.constants.PushConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class PushSwitchStatus extends BasicPushStatus {
    private String pushId;
    private boolean switchNotificationMessage;
    private boolean switchThroughMessage;

    public PushSwitchStatus() {
    }

    public String getPushId() {
        return this.pushId;
    }

    public boolean isSwitchNotificationMessage() {
        return this.switchNotificationMessage;
    }

    public boolean isSwitchThroughMessage() {
        return this.switchThroughMessage;
    }

    @Override // com.meizu.cloud.pushsdk.platform.message.BasicPushStatus
    public void parseValueData(JSONObject jSONObject) throws JSONException {
        if (!jSONObject.isNull(PushConstants.KEY_PUSH_ID)) {
            setPushId(jSONObject.getString(PushConstants.KEY_PUSH_ID));
        }
        boolean z = false;
        if (!jSONObject.isNull("barTypeSwitch")) {
            setSwitchNotificationMessage(jSONObject.getInt("barTypeSwitch") == 1);
        }
        if (!jSONObject.isNull("directTypeSwitch")) {
            if (jSONObject.getInt("directTypeSwitch") == 1) {
                z = true;
            }
            setSwitchThroughMessage(z);
        }
    }

    public void setPushId(String str) {
        this.pushId = str;
    }

    public void setSwitchNotificationMessage(boolean z) {
        this.switchNotificationMessage = z;
    }

    public void setSwitchThroughMessage(boolean z) {
        this.switchThroughMessage = z;
    }

    @Override // com.meizu.cloud.pushsdk.platform.message.BasicPushStatus
    public String toString() {
        return super.toString() + "PushSwitchStatus{switchNotificationMessage=" + this.switchNotificationMessage + ", switchThroughMessage=" + this.switchThroughMessage + ", pushId='" + this.pushId + "'}";
    }

    public PushSwitchStatus(String str) {
        super(str);
    }
}

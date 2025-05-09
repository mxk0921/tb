package com.meizu.cloud.pushsdk.platform.message;

import android.text.TextUtils;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.platform.message.SubTagsStatus;
import java.util.ArrayList;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class a {
    public static PushSwitchStatus a(String str) {
        DebugLogger.i("StatusSerialize", "register status serialize stringToPushSwitchStatus start, statusText=" + str);
        try {
            PushSwitchStatus pushSwitchStatus = new PushSwitchStatus();
            JSONObject jSONObject = new JSONObject(str);
            PushSwitchStatus pushSwitchStatus2 = (PushSwitchStatus) b(jSONObject, pushSwitchStatus);
            if (!jSONObject.isNull(PushConstants.REGISTER_STATUS_PUSH_ID)) {
                pushSwitchStatus2.setPushId(jSONObject.getString(PushConstants.REGISTER_STATUS_PUSH_ID));
            }
            if (!jSONObject.isNull(PushConstants.PUSH_SWITCH_STATUS_IS_NOTIFICATION_SWITCH)) {
                pushSwitchStatus2.setSwitchNotificationMessage(jSONObject.getBoolean(PushConstants.PUSH_SWITCH_STATUS_IS_NOTIFICATION_SWITCH));
            }
            if (!jSONObject.isNull(PushConstants.PUSH_SWITCH_STATUS_IS_THROUGH_SWITCH)) {
                pushSwitchStatus2.setSwitchThroughMessage(jSONObject.getBoolean(PushConstants.PUSH_SWITCH_STATUS_IS_THROUGH_SWITCH));
            }
            DebugLogger.i("StatusSerialize", "register status serialize stringToPushSwitchStatus success, PushSwitchStatus=" + pushSwitchStatus2);
            return pushSwitchStatus2;
        } catch (JSONException e) {
            DebugLogger.e("StatusSerialize", "register status serialize stringToPushSwitchStatus error, " + e.getMessage());
            e.printStackTrace();
            return null;
        }
    }

    private static BasicPushStatus b(JSONObject jSONObject, BasicPushStatus basicPushStatus) throws JSONException {
        if (jSONObject == null || basicPushStatus == null) {
            return null;
        }
        if (!jSONObject.isNull("code")) {
            basicPushStatus.setCode(jSONObject.getString("code"));
        }
        if (!jSONObject.isNull("message")) {
            basicPushStatus.setMessage(jSONObject.getString("message"));
        }
        return basicPushStatus;
    }

    public static SubAliasStatus c(String str) {
        DebugLogger.i("StatusSerialize", "register status serialize stringToSubAliasStatus start, statusText=" + str);
        try {
            SubAliasStatus subAliasStatus = new SubAliasStatus();
            JSONObject jSONObject = new JSONObject(str);
            SubAliasStatus subAliasStatus2 = (SubAliasStatus) b(jSONObject, subAliasStatus);
            if (!jSONObject.isNull(PushConstants.REGISTER_STATUS_PUSH_ID)) {
                subAliasStatus2.setPushId(jSONObject.getString(PushConstants.REGISTER_STATUS_PUSH_ID));
            }
            if (!jSONObject.isNull("alias")) {
                subAliasStatus2.setAlias(jSONObject.getString("alias"));
            }
            DebugLogger.i("StatusSerialize", "register status serialize stringToSubAliasStatus success, SubAliasStatus=" + subAliasStatus2);
            return subAliasStatus2;
        } catch (JSONException e) {
            DebugLogger.e("StatusSerialize", "register status serialize stringToSubAliasStatus error, " + e.getMessage());
            e.printStackTrace();
            return null;
        }
    }

    public static SubTagsStatus d(String str) {
        DebugLogger.i("StatusSerialize", "register status serialize stringToSubTagsStatus start, statusText=" + str);
        try {
            SubTagsStatus subTagsStatus = new SubTagsStatus();
            JSONObject jSONObject = new JSONObject(str);
            SubTagsStatus subTagsStatus2 = (SubTagsStatus) b(jSONObject, subTagsStatus);
            if (!jSONObject.isNull(PushConstants.REGISTER_STATUS_PUSH_ID)) {
                subTagsStatus2.setPushId(jSONObject.getString(PushConstants.REGISTER_STATUS_PUSH_ID));
            }
            if (!jSONObject.isNull(PushConstants.SUB_TAGS_STATUS_LIST)) {
                JSONArray jSONArray = jSONObject.getJSONArray(PushConstants.SUB_TAGS_STATUS_LIST);
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                    Objects.requireNonNull(subTagsStatus2);
                    SubTagsStatus.Tag tag = new SubTagsStatus.Tag();
                    if (!jSONObject2.isNull(PushConstants.SUB_TAGS_STATUS_ID)) {
                        tag.setTagId(jSONObject2.getInt(PushConstants.SUB_TAGS_STATUS_ID));
                    }
                    if (!jSONObject2.isNull(PushConstants.SUB_TAGS_STATUS_NAME)) {
                        tag.setTagName(jSONObject2.getString(PushConstants.SUB_TAGS_STATUS_NAME));
                    }
                    arrayList.add(tag);
                }
                subTagsStatus2.setTagList(arrayList);
            }
            DebugLogger.i("StatusSerialize", "register status serialize stringToSubTagsStatus success, SubTagsStatus=" + subTagsStatus2);
            return subTagsStatus2;
        } catch (JSONException e) {
            DebugLogger.e("StatusSerialize", "register status serialize stringToSubTagsStatus error, " + e.getMessage());
            e.printStackTrace();
            return null;
        }
    }

    public static UnRegisterStatus e(String str) {
        DebugLogger.i("StatusSerialize", "register status serialize stringToUnregisterStatus start, statusText=" + str);
        try {
            UnRegisterStatus unRegisterStatus = new UnRegisterStatus();
            JSONObject jSONObject = new JSONObject(str);
            UnRegisterStatus unRegisterStatus2 = (UnRegisterStatus) b(jSONObject, unRegisterStatus);
            if (!jSONObject.isNull(PushConstants.UNREGISTER_STATUS_IS_SUCCESS)) {
                unRegisterStatus2.setIsUnRegisterSuccess(jSONObject.getBoolean(PushConstants.UNREGISTER_STATUS_IS_SUCCESS));
            }
            DebugLogger.i("StatusSerialize", "register status serialize stringToUnregisterStatus success, UnRegisterStatus=" + unRegisterStatus2);
            return unRegisterStatus2;
        } catch (JSONException e) {
            DebugLogger.e("StatusSerialize", "register status serialize stringToUnregisterStatus error, " + e.getMessage());
            e.printStackTrace();
            return null;
        }
    }

    public static String a(PushSwitchStatus pushSwitchStatus) {
        DebugLogger.i("StatusSerialize", "register status serialize pushSwitchStatusToString start, PushSwitchStatus=" + pushSwitchStatus);
        try {
            JSONObject a2 = a(new JSONObject(), pushSwitchStatus);
            if (!TextUtils.isEmpty(pushSwitchStatus.getPushId())) {
                a2.put(PushConstants.REGISTER_STATUS_PUSH_ID, pushSwitchStatus.getPushId());
            }
            a2.put(PushConstants.PUSH_SWITCH_STATUS_IS_NOTIFICATION_SWITCH, pushSwitchStatus.isSwitchNotificationMessage());
            a2.put(PushConstants.PUSH_SWITCH_STATUS_IS_THROUGH_SWITCH, pushSwitchStatus.isSwitchThroughMessage());
            String jSONObject = a2.toString();
            DebugLogger.i("StatusSerialize", "register status serialize pushSwitchStatusToString success, statusText=" + jSONObject);
            return jSONObject;
        } catch (JSONException e) {
            DebugLogger.e("StatusSerialize", "register status serialize pushSwitchStatusToString error, " + e.getMessage());
            e.printStackTrace();
            return null;
        }
    }

    public static RegisterStatus b(String str) {
        DebugLogger.i("StatusSerialize", "register status serialize stringToRegisterStatus start, statusText=" + str);
        try {
            RegisterStatus registerStatus = new RegisterStatus();
            JSONObject jSONObject = new JSONObject(str);
            RegisterStatus registerStatus2 = (RegisterStatus) b(jSONObject, registerStatus);
            if (!jSONObject.isNull(PushConstants.REGISTER_STATUS_PUSH_ID)) {
                registerStatus2.setPushId(jSONObject.getString(PushConstants.REGISTER_STATUS_PUSH_ID));
            }
            if (!jSONObject.isNull(PushConstants.REGISTER_STATUS_EXPIRE_TIME)) {
                registerStatus2.setExpireTime(jSONObject.getInt(PushConstants.REGISTER_STATUS_EXPIRE_TIME));
            }
            DebugLogger.i("StatusSerialize", "register status serialize stringToRegisterStatus success, RegisterStatus=" + registerStatus2);
            return registerStatus2;
        } catch (JSONException e) {
            DebugLogger.e("StatusSerialize", "register status serialize stringToRegisterStatus error, " + e.getMessage());
            e.printStackTrace();
            return null;
        }
    }

    public static String a(RegisterStatus registerStatus) {
        DebugLogger.i("StatusSerialize", "register status serialize registerStatusToString start, RegisterStatus=" + registerStatus);
        try {
            JSONObject a2 = a(new JSONObject(), registerStatus);
            if (!TextUtils.isEmpty(registerStatus.getPushId())) {
                a2.put(PushConstants.REGISTER_STATUS_PUSH_ID, registerStatus.getPushId());
            }
            if (registerStatus.getExpireTime() > 0) {
                a2.put(PushConstants.REGISTER_STATUS_EXPIRE_TIME, registerStatus.getExpireTime());
            }
            String jSONObject = a2.toString();
            DebugLogger.i("StatusSerialize", "register status serialize registerStatusToString success, statusText=" + jSONObject);
            return jSONObject;
        } catch (JSONException e) {
            DebugLogger.e("StatusSerialize", "register status serialize registerStatusToString error, " + e.getMessage());
            e.printStackTrace();
            return null;
        }
    }

    public static String a(SubAliasStatus subAliasStatus) {
        DebugLogger.i("StatusSerialize", "register status serialize subAliasStatusToString start, SubAliasStatus=" + subAliasStatus);
        try {
            JSONObject a2 = a(new JSONObject(), subAliasStatus);
            if (!TextUtils.isEmpty(subAliasStatus.getPushId())) {
                a2.put(PushConstants.REGISTER_STATUS_PUSH_ID, subAliasStatus.getPushId());
            }
            a2.put("alias", subAliasStatus.getAlias());
            String jSONObject = a2.toString();
            DebugLogger.i("StatusSerialize", "register status serialize subAliasStatusToString success, statusText=" + jSONObject);
            return jSONObject;
        } catch (JSONException e) {
            DebugLogger.e("StatusSerialize", "register status serialize subAliasStatusToString error, " + e.getMessage());
            e.printStackTrace();
            return null;
        }
    }

    public static String a(SubTagsStatus subTagsStatus) {
        DebugLogger.i("StatusSerialize", "register status serialize subTagsStatusToString start, SubTagsStatus=" + subTagsStatus);
        try {
            JSONObject a2 = a(new JSONObject(), subTagsStatus);
            if (!TextUtils.isEmpty(subTagsStatus.getPushId())) {
                a2.put(PushConstants.REGISTER_STATUS_PUSH_ID, subTagsStatus.getPushId());
            }
            if (subTagsStatus.getTagList() != null) {
                JSONArray jSONArray = new JSONArray();
                for (int i = 0; i < subTagsStatus.getTagList().size(); i++) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(PushConstants.SUB_TAGS_STATUS_ID, subTagsStatus.getTagList().get(i).getTagId());
                    jSONObject.put(PushConstants.SUB_TAGS_STATUS_NAME, subTagsStatus.getTagList().get(i).getTagName());
                    jSONArray.put(jSONObject);
                }
                a2.put(PushConstants.SUB_TAGS_STATUS_LIST, jSONArray);
            }
            String jSONObject2 = a2.toString();
            DebugLogger.i("StatusSerialize", "register status serialize subTagsStatusToString success, statusText=" + jSONObject2);
            return jSONObject2;
        } catch (JSONException e) {
            DebugLogger.e("StatusSerialize", "register status serialize subTagsStatusToString error, " + e.getMessage());
            e.printStackTrace();
            return null;
        }
    }

    public static String a(UnRegisterStatus unRegisterStatus) {
        DebugLogger.i("StatusSerialize", "register status serialize unregisterStatusToString start, UnRegisterStatus=" + unRegisterStatus);
        try {
            JSONObject a2 = a(new JSONObject(), unRegisterStatus);
            a2.put(PushConstants.UNREGISTER_STATUS_IS_SUCCESS, unRegisterStatus.isUnRegisterSuccess());
            String jSONObject = a2.toString();
            DebugLogger.i("StatusSerialize", "register status serialize unregisterStatusToString success, statusText=" + jSONObject);
            return jSONObject;
        } catch (JSONException e) {
            DebugLogger.e("StatusSerialize", "register status serialize unregisterStatusToString error, " + e.getMessage());
            e.printStackTrace();
            return null;
        }
    }

    private static JSONObject a(JSONObject jSONObject, BasicPushStatus basicPushStatus) throws JSONException {
        if (jSONObject == null || basicPushStatus == null) {
            return null;
        }
        jSONObject.put("code", basicPushStatus.getCode());
        jSONObject.put("message", basicPushStatus.getMessage());
        return jSONObject;
    }
}

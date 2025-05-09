package com.taobao.umipublish.extension.windvane.abilities;

import android.content.Intent;
import android.text.TextUtils;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.dov;
import tb.fkg;
import tb.i6m;
import tb.k4n;
import tb.l2o;
import tb.qrf;
import tb.t2o;
import tb.tl;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class InsertContentListTopAbility extends BaseAbility {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String GUANGGUANG = "guangguang";
    private static final String STATUS_PENDING = "pending";
    private static final String STATUS_START = "start";
    private static final String STATUS_SUCCESS = "success";
    private static final String TAG = "InsertContentListTopAbility";
    private JSONObject mBackParams;

    static {
        t2o.a(944767166);
    }

    private JSONObject getData(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("e2d20fd3", new Object[]{this, jSONObject, str});
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("contentId", (Object) (TextUtils.equals("success", str) ? analyzeContentId(jSONObject) : null));
        jSONObject2.put("failedDraftInfo", (Object) new JSONObject());
        jSONObject2.put("type", (Object) "video");
        jSONObject2.put("publishInfo", (Object) getPublishInfo(jSONObject));
        return jSONObject2;
    }

    private JSONObject getPublishInfo(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("c29325a2", new Object[]{this, jSONObject});
        }
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = jSONObject.getJSONObject("publishRequestData");
        if (jSONObject3 != null) {
            jSONObject2.put("api", (Object) "mtop.taobao.media.guang.publish");
            jSONObject2.put("apiVersion", (Object) "1.0");
            JSONObject jSONObject4 = new JSONObject();
            Boolean bool = Boolean.FALSE;
            jSONObject4.put("enable_asr", (Object) bool);
            jSONObject4.put("enable_hash_tag_guide", (Object) bool);
            jSONObject4.put(dov.KEY_ONIOLN_FITTING_ROOM_SCENE, (Object) "GG");
            jSONObject2.put("extraParams", (Object) jSONObject4);
            jSONObject2.put("formName", (Object) jSONObject3.getString("formName"));
            jSONObject2.put("inputInfo", (Object) jSONObject3.getJSONObject("data"));
            jSONObject2.put("saveToAlbum", (Object) bool);
            JSONObject jSONObject5 = new JSONObject();
            jSONObject5.put("__native_uuid__", (Object) "d49e7a6e-a24f-4367-ae2c-1bd18b041888");
            jSONObject2.put(MspGlobalDefine.SESSION, (Object) jSONObject5);
            jSONObject2.put("triggerName", (Object) jSONObject3.getString("triggerName"));
        }
        return jSONObject2;
    }

    private JSONObject getTaskParameters(JSONObject jSONObject, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("c9f83e22", new Object[]{this, jSONObject, str, str2, str3});
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("biz", (Object) "guangguang");
        jSONObject2.put("progress", (Object) str2);
        jSONObject2.put("status", (Object) str3);
        jSONObject2.put(tl.KEY_STEP, (Object) fkg.PAGE_PUBLISH);
        jSONObject2.put(l2o.COL_TASK, (Object) str);
        jSONObject2.put("backParams", (Object) this.mBackParams);
        jSONObject2.put("data", (Object) getData(jSONObject, str3));
        return jSONObject2;
    }

    public static /* synthetic */ Object ipc$super(InsertContentListTopAbility insertContentListTopAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/umipublish/extension/windvane/abilities/InsertContentListTopAbility");
    }

    private void notifyPublishChange(JSONObject jSONObject, String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f193b95b", new Object[]{this, jSONObject, str, str2, str3, str4});
            return;
        }
        Intent intent = new Intent("UmiAsyncPublishNotification");
        intent.putExtra("tasks", prepareTaskData(jSONObject, str, str3, str4));
        intent.putExtra("userId", str2);
        LocalBroadcastManager.getInstance(k4n.b().c().getApplication()).sendBroadcast(intent);
    }

    private void notifyPublishProgress(JSONObject jSONObject, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7ba536a", new Object[]{this, jSONObject, str, str2});
        } else {
            notifyPublishChange(jSONObject, str, str2, "0.5", STATUS_PENDING);
        }
    }

    private void notifyPublishStart(JSONObject jSONObject, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d3bc4e1", new Object[]{this, jSONObject, str, str2});
        } else {
            notifyPublishChange(jSONObject, str, str2, "0.0", "start");
        }
    }

    private void notifyPublishSuccess(JSONObject jSONObject, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("591c24e0", new Object[]{this, jSONObject, str, str2});
        } else {
            notifyPublishChange(jSONObject, str, str2, i6m.DEFAULT_PLAY_RATE, "success");
        }
    }

    private JSONArray prepareTaskData(JSONObject jSONObject, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("3002b26d", new Object[]{this, jSONObject, str, str2, str3});
        }
        JSONArray jSONArray = new JSONArray();
        jSONArray.add(getTaskParameters(jSONObject, str, str2, str3));
        return jSONArray;
    }

    private String analyzeContentId(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("483031ff", new Object[]{this, jSONObject});
        }
        if (qrf.b(qrf.l(jSONObject, "publishResponseData", "result"), "success", false)) {
            return qrf.n(null, jSONObject, "publishResponseData", "contentId");
        }
        return null;
    }

    @Override // com.taobao.umipublish.extension.windvane.abilities.BaseAbility
    public void onExecute(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95fd7073", new Object[]{this, jSONObject});
        } else if (jSONObject == null) {
            errorCallback("1", "EMPTY_DATA");
        } else {
            JSONObject jSONObject2 = jSONObject.getJSONObject("params");
            boolean booleanValue = (jSONObject2 == null || !jSONObject2.containsKey("async_publish")) ? false : jSONObject2.getBoolean("async_publish").booleanValue();
            JSONObject jSONObject3 = jSONObject.getJSONObject("publishResponseData");
            if (!booleanValue) {
                successCallback(jSONObject3);
                return;
            }
            if (jSONObject2.containsKey(dov.KEY_BACK_PARAMS)) {
                this.mBackParams = JSON.parseObject(jSONObject2.getString(dov.KEY_BACK_PARAMS));
            }
            String userId = k4n.b().c().getUserId();
            notifyPublishSuccess(jSONObject, String.format("%d_%s", Long.valueOf(System.currentTimeMillis()), userId), userId);
            successCallback(jSONObject3);
        }
    }
}

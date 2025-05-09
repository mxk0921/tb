package com.taobao.bootimage.linked;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class FeedsData implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String KEY_IS_TOP_SHOW_CARD = "isTopShowCard";
    public static final String KEY_VIDEO_CURRENT_POSITION = "splashVideoCurrentPosition";
    private JSONObject feedsJson;
    private boolean videoResume;

    static {
        t2o.a(736100446);
    }

    public FeedsData(JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        this.feedsJson = jSONObject;
        if (jSONObject != null) {
            jSONObject.put("sectionBizCode", "home_splash_linked_texiu");
            JSONObject jSONObject4 = jSONObject.getJSONObject("ext");
            if (jSONObject4 == null) {
                jSONObject4 = new JSONObject();
                jSONObject.put("ext", (Object) jSONObject4);
            }
            jSONObject4.put(KEY_IS_TOP_SHOW_CARD, "true");
            JSONObject jSONObject5 = jSONObject.getJSONObject("item");
            if (jSONObject5 != null && (jSONObject2 = jSONObject5.getJSONObject("0")) != null && (jSONObject3 = jSONObject2.getJSONObject("content")) != null) {
                this.videoResume = jSONObject3.getIntValue("isResumable") != 1 ? false : true;
            }
        }
    }

    public JSONObject getFeedsJson() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("7279ba8e", new Object[]{this});
        }
        return this.feedsJson;
    }

    public boolean isVideoResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56d9b289", new Object[]{this})).booleanValue();
        }
        return this.videoResume;
    }

    public void setFeedsJson(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3648514e", new Object[]{this, jSONObject});
        } else {
            this.feedsJson = jSONObject;
        }
    }

    public void setVideoCurrentPosition(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d2d49b3", new Object[]{this, new Integer(i)});
            return;
        }
        JSONObject jSONObject = this.feedsJson;
        if (jSONObject != null) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("ext");
            if (jSONObject2 == null) {
                jSONObject2 = new JSONObject();
                this.feedsJson.put("ext", (Object) jSONObject2);
            }
            jSONObject2.put(KEY_VIDEO_CURRENT_POSITION, (Object) Integer.valueOf(i));
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "FeedsData{feedsJson=" + this.feedsJson + '}';
    }

    public int getVideoCurrentPosition() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("63b8ca37", new Object[]{this})).intValue();
        }
        JSONObject jSONObject = this.feedsJson;
        if (jSONObject == null) {
            return 0;
        }
        return jSONObject.getJSONObject("ext").getIntValue(KEY_VIDEO_CURRENT_POSITION);
    }
}

package com.taobao.android.detail2.core.framework.view.navbar;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.c4x;
import tb.d1i;
import tb.mqj;
import tb.r19;
import tb.t2o;
import tb.txj;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class AtmosParams implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ATMOS_TYPE_HIGHER = "higher";
    public static final String KEY_ATMOS_FEED_PARAMS = "atmosFeedParams";
    public static final String KEY_ATMOS_PARAMS = "atmosParams";
    public static final String KEY_ATMOS_TYPE = "atmosType";
    public String atmosColor;
    public String atmosType;
    public Object entranceCardParams;
    public String jsVersion;
    public LayoutInfo layoutInfo;
    public boolean mHasRefresh;
    public boolean mNeedClearLayoutInfo;
    public boolean showAtmos;
    public String weexUrl;
    public JSONObject mRootData = new JSONObject();
    public Background background = new Background();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class Background implements Serializable {
        public String imageType;
        public String imageUrl;

        static {
            t2o.a(352322077);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class LayoutInfo implements Serializable {
        public int borderRadius;
        public int height;

        static {
            t2o.a(352322078);
        }
    }

    static {
        t2o.a(352322076);
    }

    private void refreshAtmosFeedParamsModel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("781089e9", new Object[]{this});
            return;
        }
        JSONObject jSONObject = this.mRootData.getJSONObject(KEY_ATMOS_FEED_PARAMS);
        if (jSONObject != null) {
            JSONObject jSONObject2 = jSONObject.getJSONObject(d1i.KEY_LAYOUT_INFO);
            this.layoutInfo = null;
            if (jSONObject2 != null) {
                LayoutInfo layoutInfo = new LayoutInfo();
                this.layoutInfo = layoutInfo;
                layoutInfo.height = Integer.parseInt(jSONObject2.getString("height"));
                this.layoutInfo.borderRadius = Integer.parseInt(jSONObject2.getString("borderRadius"));
            }
        }
    }

    private void refreshAtmosParamsModel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e44f7de7", new Object[]{this});
            return;
        }
        JSONObject jSONObject = this.mRootData.getJSONObject(KEY_ATMOS_PARAMS);
        if (jSONObject != null) {
            this.showAtmos = jSONObject.getBooleanValue("showAtmos");
            this.atmosType = jSONObject.containsKey(KEY_ATMOS_TYPE) ? jSONObject.getString(KEY_ATMOS_TYPE) : null;
            this.atmosColor = jSONObject.getString("atmosColor");
            JSONObject jSONObject2 = jSONObject.getJSONObject("background");
            if (this.background == null) {
                this.background = new Background();
            }
            if (jSONObject2 != null) {
                this.background.imageType = jSONObject2.getString("imageType");
                this.background.imageUrl = jSONObject2.getString("imageUrl");
            }
            this.weexUrl = jSONObject.getString("weexUrl");
            if (r19.q0()) {
                this.jsVersion = mqj.e(this.weexUrl);
            } else {
                this.jsVersion = c4x.c(this.weexUrl);
            }
            this.entranceCardParams = jSONObject.getJSONObject("entranceCardParams");
            this.mNeedClearLayoutInfo = jSONObject.getBooleanValue("needClearLayoutInfo");
        }
    }

    private void refreshModel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("446d5695", new Object[]{this});
            return;
        }
        try {
            refreshAtmosParamsModel();
            refreshAtmosFeedParamsModel();
        } catch (Exception e) {
            txj.f("new_detail异常", "atmos refresh model exception", e);
        }
    }

    public boolean isHigherAtmosType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a3524bca", new Object[]{this})).booleanValue();
        }
        if (TextUtils.isEmpty(this.atmosType) || !ATMOS_TYPE_HIGHER.equals(this.atmosType)) {
            return false;
        }
        return true;
    }

    public void parseRootData(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c97f72a", new Object[]{this, jSONObject});
            return;
        }
        this.mRootData.put(KEY_ATMOS_PARAMS, (Object) jSONObject);
        refreshModel();
    }

    public void refreshData(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f28d544", new Object[]{this, jSONObject});
        } else if (jSONObject != null && jSONObject.size() != 0) {
            JSONObject jSONObject2 = (JSONObject) jSONObject.clone();
            this.mRootData.put(KEY_ATMOS_FEED_PARAMS, (Object) jSONObject2);
            JSONObject jSONObject3 = jSONObject2.getJSONObject(KEY_ATMOS_PARAMS);
            if (jSONObject3 != null) {
                String string = jSONObject2.getString("dataHandleType");
                if ("merge".equals(string)) {
                    JSONObject jSONObject4 = this.mRootData.getJSONObject(KEY_ATMOS_PARAMS);
                    if (jSONObject4 == null) {
                        this.mRootData.put(KEY_ATMOS_PARAMS, (Object) jSONObject3);
                    } else {
                        jSONObject4.putAll(jSONObject3);
                    }
                } else if ("append".equals(string)) {
                    JSONObject jSONObject5 = this.mRootData.getJSONObject(KEY_ATMOS_PARAMS);
                    if (jSONObject5 != null) {
                        jSONObject3.putAll(jSONObject5);
                    }
                    this.mRootData.put(KEY_ATMOS_PARAMS, (Object) jSONObject3);
                } else {
                    this.mRootData.put(KEY_ATMOS_PARAMS, (Object) jSONObject3);
                }
                refreshModel();
                jSONObject2.remove(KEY_ATMOS_PARAMS);
            }
        }
    }
}

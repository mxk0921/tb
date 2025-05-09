package com.taobao.avplayer.interactivelifecycle.backcover.model;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.core.IDWObject;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import tb.bia;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class DWBackCoverBean implements IDWObject {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private JSONObject mData;
    private boolean mDataComplete = true;
    private JSONArray mFavorItems;
    private JSONArray mGoodsLisItems;
    private String mGoshopUrl;
    private JSONObject mRecommendVideos;
    private String mShortKeyId;

    static {
        t2o.a(452985090);
        t2o.a(452985056);
    }

    public DWBackCoverBean(JSONObject jSONObject) {
        this.mData = jSONObject;
    }

    private void setRecommendData(JSONObject jSONObject) {
        Object opt;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12dff2d3", new Object[]{this, jSONObject});
            return;
        }
        Object opt2 = jSONObject.opt("recommendVideos");
        if (opt2 != null && (opt2 instanceof JSONObject)) {
            this.mRecommendVideos = (JSONObject) opt2;
            JSONObject jSONObject2 = this.mData;
            if (jSONObject2 != null && (opt = jSONObject2.opt("extendsMap")) != null) {
                try {
                    ((JSONObject) opt).put("recommendVideos", this.mRecommendVideos);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public int getCurrentPage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9ddb71ec", new Object[]{this})).intValue();
        }
        return 0;
    }

    public JSONObject getData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("54c56415", new Object[]{this});
        }
        return this.mData;
    }

    public JSONArray getFavorItems() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("11727b1", new Object[]{this});
        }
        JSONObject jSONObject = this.mData;
        if (jSONObject != null && this.mFavorItems == null) {
            Object opt = jSONObject.opt("extendsMap");
            if (opt == null || !(opt instanceof JSONObject)) {
                return this.mFavorItems;
            }
            JSONObject jSONObject2 = (JSONObject) opt;
            if (jSONObject2.optJSONArray("favorItems") != null) {
                this.mFavorItems = jSONObject2.optJSONArray("favorItems");
            }
        }
        return this.mFavorItems;
    }

    public JSONArray getGoodsList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("11c70eab", new Object[]{this});
        }
        JSONObject jSONObject = this.mData;
        if (jSONObject != null && this.mGoodsLisItems == null) {
            Object opt = jSONObject.opt("extendsMap");
            if (opt == null || !(opt instanceof JSONObject)) {
                return this.mGoodsLisItems;
            }
            JSONObject jSONObject2 = (JSONObject) opt;
            if (jSONObject2.optJSONArray(bia.UNDER_TAKE_GOODS_LIST) != null) {
                this.mGoodsLisItems = jSONObject2.optJSONArray(bia.UNDER_TAKE_GOODS_LIST);
            }
        }
        return this.mGoodsLisItems;
    }

    public String getGoshopUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("375ab3de", new Object[]{this});
        }
        return "";
    }

    public String getShortKeyId() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5af8aac5", new Object[]{this});
        }
        if (TextUtils.isEmpty(this.mShortKeyId) && (jSONObject = this.mData) != null) {
            Object opt = jSONObject.opt("shortKeyId");
            this.mShortKeyId = opt == null ? null : opt.toString();
        }
        return this.mShortKeyId;
    }

    public int getTotalPage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f21b7f37", new Object[]{this})).intValue();
        }
        return 0;
    }

    public boolean isDataComplete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7c744358", new Object[]{this})).booleanValue();
        }
        return this.mDataComplete;
    }

    public void setData(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f6fa1eb", new Object[]{this, jSONObject});
        }
    }

    public void setRecommendInfo(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13806a4f", new Object[]{this, jSONObject});
        } else {
            setRecommendData(jSONObject);
        }
    }

    public void setRecommendInfoOnly(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b4c5803", new Object[]{this, jSONObject});
            return;
        }
        setRecommendData(jSONObject);
        this.mDataComplete = false;
    }

    public boolean showGoshopIcon() {
        Object opt;
        Object opt2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4865dedf", new Object[]{this})).booleanValue();
        }
        JSONObject jSONObject = this.mData;
        if (jSONObject == null || (opt = jSONObject.opt("extendsMap")) == null || (opt2 = ((JSONObject) opt).opt("includeShopUrl")) == null || !opt2.toString().equals("1")) {
            return false;
        }
        return true;
    }

    public boolean showShareIcon() {
        Object opt;
        Object opt2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d29b1986", new Object[]{this})).booleanValue();
        }
        JSONObject jSONObject = this.mData;
        if (jSONObject == null || (opt = jSONObject.opt("extendsMap")) == null || (opt2 = ((JSONObject) opt).opt("includeShare")) == null || !opt2.toString().equals("1")) {
            return false;
        }
        return true;
    }

    public int getPageSize() {
        Object opt;
        Object opt2;
        Object opt3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2822d620", new Object[]{this})).intValue();
        }
        JSONObject jSONObject = this.mData;
        if (jSONObject == null || (opt = jSONObject.opt("extendsMap")) == null || !(opt instanceof JSONObject) || (opt2 = ((JSONObject) opt).opt("recommendVideos")) == null || !(opt2 instanceof JSONObject) || (opt3 = ((JSONObject) opt2).opt("pageSize")) == null || !TextUtils.isDigitsOnly(opt3.toString())) {
            return 0;
        }
        return Integer.valueOf(opt3.toString()).intValue();
    }

    public DWBackCoverBean() {
    }
}

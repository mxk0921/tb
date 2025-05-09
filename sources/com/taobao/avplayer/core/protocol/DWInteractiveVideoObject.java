package com.taobao.avplayer.core.protocol;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.core.IDWObject;
import com.taobao.weex.utils.tools.TimeCalculator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import tb.mop;
import tb.t2o;
import tb.tep;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class DWInteractiveVideoObject implements IDWObject {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public JSONObject mData;
    public JSONObject mInteractiveMap;
    public JSONObject mJsTemplates;

    static {
        t2o.a(452985070);
        t2o.a(452985056);
    }

    public DWInteractiveVideoObject(JSONObject jSONObject) throws JSONException {
        String str;
        this.mData = jSONObject;
        Object opt = jSONObject.opt("interactiveMap");
        if (opt == null) {
            this.mInteractiveMap = new JSONObject();
        } else {
            this.mInteractiveMap = (JSONObject) opt;
        }
        Object opt2 = this.mData.opt("type");
        Object opt3 = this.mData.opt(TimeCalculator.TIMELINE_TAG);
        if ((opt3 instanceof JSONArray) && opt3 != null && ((JSONArray) opt3).length() > 0) {
            JSONObject jSONObject2 = this.mInteractiveMap;
            if (opt2 == null) {
                str = "1";
            } else {
                str = opt2.toString();
            }
            jSONObject2.put(str, opt3);
        }
    }

    public String getBackCoverWXUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7091fcc5", new Object[]{this});
        }
        return "";
    }

    public DWInteractiveVideoObject getBegin() throws JSONException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DWInteractiveVideoObject) ipChange.ipc$dispatch("4651ac13", new Object[]{this});
        }
        Object opt = this.mData.opt("begin");
        if (opt == null) {
            return null;
        }
        return new DWInteractiveVideoObject((JSONObject) opt);
    }

    public JSONObject getComprehensionType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("be5f121d", new Object[]{this});
        }
        Object opt = this.mData.opt("comprehensionType");
        if (opt == null) {
            return null;
        }
        return (JSONObject) opt;
    }

    public String getCoverUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c5f7e00b", new Object[]{this});
        }
        Object opt = this.mData.opt(tep.KEY_TP_RETURN_VIDEO_COVER_CDN_URL);
        if (opt == null) {
            return null;
        }
        return opt.toString();
    }

    public String getDuration() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8e7ace2f", new Object[]{this});
        }
        Object opt = this.mData.opt("duration");
        if (opt == null) {
            return null;
        }
        return opt.toString();
    }

    public DWInteractiveVideoObject getEnd() throws JSONException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DWInteractiveVideoObject) ipChange.ipc$dispatch("ec150321", new Object[]{this});
        }
        Object opt = this.mData.opt("end");
        if (opt == null) {
            return null;
        }
        return new DWInteractiveVideoObject((JSONObject) opt);
    }

    public String getEnterShopUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cbc90c42", new Object[]{this});
        }
        Object opt = this.mData.opt(mop.KEY_APM_SHOP_URL);
        if (opt == null) {
            return null;
        }
        return opt.toString();
    }

    public String getFavorData() {
        Object opt;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("41efb1e7", new Object[]{this});
        }
        Object opt2 = this.mData.opt("extendsParam");
        if (opt2 == null || (opt = ((JSONObject) opt2).opt("favorData")) == null) {
            return null;
        }
        return opt.toString();
    }

    public String getId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("81e05888", new Object[]{this});
        }
        Object opt = this.mData.opt("id");
        if (opt == null) {
            return null;
        }
        return opt.toString();
    }

    public JSONArray getInteractive(String str) {
        Object opt;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("28f19053", new Object[]{this, str});
        }
        JSONObject jSONObject = this.mInteractiveMap;
        if (jSONObject == null || (opt = jSONObject.opt(str)) == null) {
            return null;
        }
        return (JSONArray) opt;
    }

    public String getJsTemplate(String str) {
        JSONObject jsTemplates;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e6c81f36", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str) || !str.startsWith("$") || (jsTemplates = getJsTemplates()) == null || jsTemplates.optString(str.substring(1)) == null) {
            return null;
        }
        return jsTemplates.optString(str.substring(1));
    }

    public String getJsTemplateUrl(String str) {
        JSONObject jsTemplateUrls;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("199af399", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str) || !str.startsWith("$") || (jsTemplateUrls = getJsTemplateUrls()) == null || jsTemplateUrls.optString(str.substring(1)) == null) {
            return null;
        }
        return jsTemplateUrls.optString(str.substring(1));
    }

    public JSONObject getJsTemplateUrls() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("be1b4a52", new Object[]{this});
        }
        Object opt = this.mData.opt("jsUrls");
        if (this.mJsTemplates == null) {
            this.mJsTemplates = opt == null ? null : (JSONObject) opt;
        }
        return this.mJsTemplates;
    }

    public JSONObject getJsTemplates() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("135a5caf", new Object[]{this});
        }
        Object opt = this.mData.opt("jsTemplates");
        if (this.mJsTemplates == null) {
            this.mJsTemplates = opt == null ? null : (JSONObject) opt;
        }
        return this.mJsTemplates;
    }

    public String getShareData() {
        Object opt;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3ea80766", new Object[]{this});
        }
        Object opt2 = this.mData.opt("extendsParam");
        if (opt2 == null || (opt = ((JSONObject) opt2).opt("shareData")) == null) {
            return null;
        }
        return opt.toString();
    }

    public String getShowType() {
        Object opt;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5d31bcc", new Object[]{this});
        }
        Object opt2 = this.mData.opt("extendsParam");
        if (opt2 == null || (opt = ((JSONObject) opt2).opt("showType")) == null) {
            return null;
        }
        return opt.toString();
    }

    public String getSource() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3139e888", new Object[]{this});
        }
        Object opt = this.mData.opt("source");
        if (opt == null) {
            return "";
        }
        return opt.toString();
    }

    public String getTaowaData() {
        Object opt;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("60c3e1f9", new Object[]{this});
        }
        Object opt2 = this.mData.opt("extendsParam");
        if (opt2 == null || (opt = ((JSONObject) opt2).opt("taowaData")) == null) {
            return null;
        }
        return opt.toString();
    }

    public JSONArray getTimeline() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("9c895b32", new Object[]{this});
        }
        Object opt = this.mData.opt(TimeCalculator.TIMELINE_TAG);
        if (opt == null) {
            return null;
        }
        return (JSONArray) opt;
    }

    public String getTitle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5267f97", new Object[]{this});
        }
        Object opt = this.mData.opt("title");
        if (opt == null) {
            return null;
        }
        return opt.toString();
    }

    public String getTopic() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f2a1d120", new Object[]{this});
        }
        Object opt = this.mData.opt("topic");
        if (opt == null) {
            return null;
        }
        return opt.toString();
    }

    public String getUserId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("58ad3b3d", new Object[]{this});
        }
        Object opt = this.mData.opt("userId");
        if (opt == null) {
            return null;
        }
        return opt.toString();
    }

    public String getUserName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d328f00d", new Object[]{this});
        }
        Object opt = this.mData.opt("userName");
        if (opt == null) {
            return null;
        }
        return opt.toString();
    }

    public JSONObject getUtParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("8606e970", new Object[]{this});
        }
        Object opt = this.mData.opt("utParams");
        if (opt == null) {
            return null;
        }
        return (JSONObject) opt;
    }

    public String getVideoId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5ec0c039", new Object[]{this});
        }
        Object opt = this.mData.opt("videoId");
        if (opt == null) {
            return null;
        }
        return opt.toString();
    }

    public JSONArray getVideoIdentification() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("58fce8d6", new Object[]{this});
        }
        Object opt = this.mData.opt("videoIdentification");
        if (opt == null) {
            return null;
        }
        return (JSONArray) opt;
    }

    public String getVideoUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9dbb94cf", new Object[]{this});
        }
        Object opt = this.mData.opt("videoUrl");
        if (opt == null) {
            return null;
        }
        return opt.toString();
    }

    public boolean showInteractiveLogo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("be25377b", new Object[]{this})).booleanValue();
        }
        return false;
    }
}

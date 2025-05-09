package com.taobao.avplayer.core.protocol;

import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.DWContext;
import com.taobao.avplayer.DWVideoScreenType;
import com.taobao.avplayer.core.IDWObject;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class DWInteractiveObject implements IDWObject {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int sCONTROLLER_BAR_HEIGHT = 40;
    private JSONArray mAnchorArray;
    public JSONObject mData;
    private String mRenderOrientation;
    public String mSource;
    private long mStartTime = -1;
    private long mEndTime = -1;

    static {
        t2o.a(452985069);
        t2o.a(452985056);
    }

    public DWInteractiveObject(JSONObject jSONObject, String str) {
        this.mData = jSONObject;
        this.mSource = str;
    }

    public static void assignLayoutParams(DWContext dWContext, FrameLayout.LayoutParams layoutParams, DWVideoScreenType dWVideoScreenType, float f, float f2, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77dcfe5", new Object[]{dWContext, layoutParams, dWVideoScreenType, new Float(f), new Float(f2), str, new Boolean(z)});
        }
    }

    public JSONArray getAnchorArray() {
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("447d7f9b", new Object[]{this});
        }
        if (this.mAnchorArray == null) {
            Object opt = this.mData.opt("anchorArray");
            if (opt == null) {
                jSONArray = null;
            } else {
                jSONArray = (JSONArray) opt;
            }
            this.mAnchorArray = jSONArray;
        }
        return this.mAnchorArray;
    }

    public String getEndAnimations() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4436ae85", new Object[]{this});
        }
        Object opt = this.mData.opt("endAnimations");
        if (opt == null) {
            return null;
        }
        return opt.toString();
    }

    public long getEndTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("250d18d", new Object[]{this})).longValue();
        }
        return this.mEndTime;
    }

    public String getJsData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fea0a710", new Object[]{this});
        }
        Object opt = this.mData.opt("jsData");
        if (opt == null) {
            return "";
        }
        return opt.toString();
    }

    public String getJsTemplate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd6343c0", new Object[]{this});
        }
        Object opt = this.mData.opt("jsTemplate");
        if (opt == null) {
            return null;
        }
        return opt.toString();
    }

    public String getJsTemplateUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5aaa7ae3", new Object[]{this});
        }
        Object opt = this.mData.opt("jsUrl");
        if (opt == null) {
            return null;
        }
        return opt.toString();
    }

    public String getLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bc2f24d9", new Object[]{this});
        }
        Object opt = this.mData.opt("layout");
        if (opt == null) {
            return "relative";
        }
        return opt.toString();
    }

    public String getRenderOrientation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3f6033d5", new Object[]{this});
        }
        if (this.mRenderOrientation == null) {
            Object opt = this.mData.opt("renderOrientation");
            this.mRenderOrientation = opt == null ? null : opt.toString();
        }
        return this.mRenderOrientation;
    }

    public String getStartAnimations() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("86221c9e", new Object[]{this});
        }
        Object opt = this.mData.opt("startAnimations");
        if (opt == null) {
            return null;
        }
        return opt.toString();
    }

    public long getStartTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("490f0b94", new Object[]{this})).longValue();
        }
        return this.mStartTime;
    }

    public String getType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("13e5e549", new Object[]{this});
        }
        Object opt = this.mData.opt("type");
        if (opt == null) {
            return null;
        }
        return opt.toString();
    }

    public void setAnchorArray(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1c3a883", new Object[]{this, jSONArray});
        } else {
            this.mAnchorArray = jSONArray;
        }
    }

    public void setEndTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e12d357", new Object[]{this, new Long(j)});
        } else {
            this.mEndTime = j;
        }
    }

    public void setJsTemplate(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65eebbb6", new Object[]{this, str});
            return;
        }
        try {
            this.mData.putOpt("jsTemplate", str);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public void setRenderOrientation(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa254ea9", new Object[]{this, str});
        } else {
            this.mRenderOrientation = str;
        }
    }

    public void setStartTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0c94730", new Object[]{this, new Long(j)});
        } else {
            this.mStartTime = j;
        }
    }
}

package com.taobao.avplayer.interactivelifecycle.frontcover.model;

import android.text.TextUtils;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.core.IDWObject;
import com.taobao.avplayer.core.model.DWResponse;
import com.taobao.media.MediaTimeUtils;
import org.json.JSONObject;
import tb.t2o;
import tb.tep;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class DWFrontCoverBean implements IDWObject {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String mCoverPicUrl;
    private JSONObject mData;
    private long mPlayTimes;
    private ImageView.ScaleType mScaleType;
    private String mVideoDuration;

    static {
        t2o.a(452985104);
        t2o.a(452985056);
    }

    public DWFrontCoverBean(DWResponse dWResponse) {
        JSONObject jSONObject = dWResponse.data;
        this.mData = jSONObject;
        if (jSONObject != null) {
            Object opt = jSONObject.opt("extendsParam");
            if (opt != null) {
                Object opt2 = ((JSONObject) opt).opt("videoPlayTimes");
                String obj = opt2 == null ? "0" : opt2.toString();
                if (!TextUtils.isEmpty(obj) && TextUtils.isDigitsOnly(obj)) {
                    this.mPlayTimes = Long.parseLong(obj);
                }
            }
            Object opt3 = this.mData.opt(tep.KEY_TP_RETURN_VIDEO_COVER_CDN_URL);
            this.mCoverPicUrl = opt3 == null ? null : String.valueOf(opt3);
            Object opt4 = this.mData.opt("duration");
            String valueOf = opt4 == null ? null : String.valueOf(opt4);
            this.mVideoDuration = valueOf;
            if (TextUtils.isEmpty(valueOf) || !TextUtils.isDigitsOnly(this.mVideoDuration)) {
                this.mVideoDuration = null;
            } else {
                this.mVideoDuration = MediaTimeUtils.sStringForTime(Integer.parseInt(this.mVideoDuration));
            }
        }
    }

    public String getCoverPicUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bb681d3", new Object[]{this});
        }
        return this.mCoverPicUrl;
    }

    public long getPlayTimes() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b19d2437", new Object[]{this})).longValue();
        }
        return this.mPlayTimes;
    }

    public ImageView.ScaleType getScaleType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageView.ScaleType) ipChange.ipc$dispatch("16d492db", new Object[]{this});
        }
        return this.mScaleType;
    }

    public String getVideoDuration() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7860ed20", new Object[]{this});
        }
        return this.mVideoDuration;
    }

    public void setScaleType(ImageView.ScaleType scaleType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("732a5c3", new Object[]{this, scaleType});
        } else {
            this.mScaleType = scaleType;
        }
    }

    public DWFrontCoverBean(Long l, String str, String str2) {
        this.mPlayTimes = l.longValue();
        this.mVideoDuration = str;
        this.mCoverPicUrl = str2;
    }
}

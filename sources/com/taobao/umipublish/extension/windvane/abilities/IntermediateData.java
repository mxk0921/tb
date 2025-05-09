package com.taobao.umipublish.extension.windvane.abilities;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.taobao.umipublish.extension.windvane.abilities.bean.MediaBean;
import java.io.Serializable;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class IntermediateData implements Serializable {
    public JSONObject mPublishRequestParams;
    public int mTemplateClipsCount;
    public final JSONArray mDownloadedMediaList = new JSONArray();
    public JSONObject mTemplateInfo = new JSONObject();
    public final MediaBean mPublishVideo = new MediaBean();
    public final MediaBean mPublishCover = new MediaBean();
    public String mMainClipSource = "0";

    static {
        t2o.a(944767167);
    }
}

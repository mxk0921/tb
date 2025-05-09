package com.taobao.umipublish.extension.windvane.abilities.hander;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.base.data.meta.MediaStatInfoV2;
import com.taobao.umipublish.extension.windvane.abilities.IntermediateData;
import com.taobao.umipublish.extension.windvane.abilities.bean.MediaBean;
import tb.dov;
import tb.i93;
import tb.qrf;
import tb.t2o;
import tb.tep;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class UploadFileHandler extends BaseHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(944767210);
    }

    public UploadFileHandler(JSONObject jSONObject, JSONObject jSONObject2, IntermediateData intermediateData) {
        super(jSONObject, jSONObject2, intermediateData);
    }

    public static void d(MediaStatInfoV2 mediaStatInfoV2, IntermediateData intermediateData) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cf01bfb", new Object[]{mediaStatInfoV2, intermediateData});
        } else if (intermediateData.mTemplateClipsCount > 0) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < intermediateData.mTemplateClipsCount; i++) {
                if (i != 0) {
                    str = ",";
                } else {
                    str = "";
                }
                sb.append(str);
                sb.append(intermediateData.mMainClipSource);
            }
            mediaStatInfoV2.main_clip_source = sb.toString();
        }
    }

    public static /* synthetic */ Object ipc$super(UploadFileHandler uploadFileHandler, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/umipublish/extension/windvane/abilities/hander/UploadFileHandler");
    }

    @Override // com.taobao.umipublish.extension.windvane.abilities.AbilityChain.InputAndOutputHandler
    public JSONObject a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("52e6f464", new Object[]{this, jSONObject});
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("path", (Object) this.c.mPublishVideo.path);
        jSONObject2.put("type", (Object) "video");
        jSONObject2.put("bizCode", (Object) this.b.getString(dov.URL_KEY_VIDEO_BIZ_CODE));
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("type", (Object) "cover");
        jSONObject3.put("path", (Object) this.c.mPublishCover.path);
        jSONObject3.put("bizCode", (Object) this.b.getString(dov.URL_KEY_PHOTO_UPLOAD_CODE));
        jSONObject3.put("width", (Object) this.c.mPublishCover.width);
        jSONObject3.put("height", (Object) this.c.mPublishCover.height);
        JSONArray jSONArray = new JSONArray();
        jSONArray.add(jSONObject2);
        jSONArray.add(jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        jSONObject4.put("uploadList", (Object) jSONArray);
        return jSONObject4;
    }

    @Override // com.taobao.umipublish.extension.windvane.abilities.AbilityChain.InputAndOutputHandler
    public void c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("def50cbb", new Object[]{this, jSONObject});
            return;
        }
        JSONArray jSONArray = jSONObject.getJSONArray("fileList");
        for (int i = 0; i < jSONArray.size(); i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            if (TextUtils.equals(jSONObject2.getString("type"), "video")) {
                this.c.mPublishVideo.fileId = qrf.m(jSONObject2, tep.KEY_TP_RETURN_VIDEO_FILE_ID, "");
                this.c.mPublishVideo.path = qrf.m(jSONObject2, "path", "");
                MediaBean mediaBean = this.c.mPublishVideo;
                mediaBean.mediaType = "video";
                mediaBean.statInfo = i93.a(this.f14073a);
                IntermediateData intermediateData = this.c;
                d(intermediateData.mPublishVideo.statInfo, intermediateData);
            } else if (TextUtils.equals(jSONObject2.getString("type"), "cover")) {
                this.c.mPublishCover.path = qrf.m(jSONObject2, "path", "");
                this.c.mPublishCover.width = Integer.valueOf(qrf.h(jSONObject2, "width", 0));
                this.c.mPublishCover.height = Integer.valueOf(qrf.h(jSONObject2, "height", 0));
                this.c.mPublishCover.url = qrf.m(jSONObject2, "url", "");
                this.c.mPublishCover.mediaType = "cover";
            }
        }
    }
}

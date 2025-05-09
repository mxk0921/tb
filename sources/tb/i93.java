package tb;

import android.text.TextUtils;
import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.base.data.meta.MediaStatInfoV2;
import com.taobao.android.litecreator.sdk.editor.data.MusicInfo;
import com.taobao.umipublish.extension.windvane.abilities.AbilityConst;
import com.taobao.umipublish.extension.windvane.abilities.bean.AudioBean;
import org.android.agoo.common.AgooConstants;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class i93 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(944767251);
    }

    public static MediaStatInfoV2 a(JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONArray jSONArray;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MediaStatInfoV2) ipChange.ipc$dispatch("7b569f26", new Object[]{jSONObject});
        }
        MediaStatInfoV2 mediaStatInfoV2 = new MediaStatInfoV2();
        try {
            jSONObject2 = jSONObject.getJSONObject(AbilityConst.Server.f14056a);
        } catch (Throwable th) {
            odg.c("UploadFileHandler", "generateMediaStatInfo.error:" + Log.getStackTraceString(th));
        }
        if (!(jSONObject2 == null || (jSONArray = jSONObject2.getJSONArray(AbilityConst.Server.b)) == null || jSONArray.size() == 0)) {
            JSONArray jSONArray2 = new JSONArray();
            jSONArray2.addAll(jSONArray);
            JSONObject jSONObject3 = (JSONObject) jSONArray2.remove(0);
            jSONArray2.add(jSONObject3);
            String m = qrf.m(jSONArray2.getJSONObject(0), "materialType", "");
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < jSONArray2.size(); i++) {
                if (i >= 1) {
                    str = ",";
                } else {
                    str = "";
                }
                sb.append(str);
                sb.append(qrf.m(jSONArray2.getJSONObject(i), "tid", ""));
            }
            if (!TextUtils.isEmpty(sb)) {
                if (TextUtils.equals(m, AgooConstants.REPORT_ENCRYPT_FAIL)) {
                    mediaStatInfoV2.source = "ai_portrait";
                } else if (TextUtils.equals(m, AgooConstants.REPORT_DUPLICATE_FAIL)) {
                    mediaStatInfoV2.source = "ai_create";
                } else if (TextUtils.equals(m, "25")) {
                    mediaStatInfoV2.source = "ai_outfit";
                } else {
                    mediaStatInfoV2.source = "template";
                }
                mediaStatInfoV2.album_film_template = sb.toString();
            }
            mediaStatInfoV2.elements = qrf.a(jSONObject, AbilityConst.Server.c, AbilityConst.Server.d);
            b(mediaStatInfoV2, jSONObject2, jSONObject3);
            return mediaStatInfoV2;
        }
        return mediaStatInfoV2;
    }

    public static void b(MediaStatInfoV2 mediaStatInfoV2, JSONObject jSONObject, JSONObject jSONObject2) {
        String str;
        long j;
        String str2;
        String str3;
        AudioBean audioBean;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8307b527", new Object[]{mediaStatInfoV2, jSONObject, jSONObject2});
            return;
        }
        try {
            JSONObject jSONObject3 = jSONObject.getJSONObject("musicInfo");
            long j2 = -1;
            if (jSONObject3 != null) {
                MusicInfo musicInfo = (MusicInfo) JSON.parseObject(jSONObject3.toJSONString(), MusicInfo.class);
                if (musicInfo != null) {
                    str = musicInfo.musicId;
                    str3 = musicInfo.audioId;
                    str2 = musicInfo.vendorType;
                    j2 = musicInfo.startTime;
                    j = musicInfo.endTime;
                    if (TextUtils.isEmpty(str) || !TextUtils.isEmpty(str3)) {
                        audioBean = new AudioBean();
                        audioBean.id = str;
                        audioBean.pieceAudioId = str3;
                        audioBean.vender_type = str2;
                        audioBean.position = "lite_edit";
                        if (j2 >= 0 && j > j2) {
                            audioBean.startTime = j2;
                            audioBean.endTime = j;
                        }
                        JSONArray jSONArray = new JSONArray();
                        jSONArray.add(JSON.toJSON(audioBean));
                        mediaStatInfoV2.audio_id = str3;
                        mediaStatInfoV2.audio_vender_type = str2;
                        mediaStatInfoV2.audio = jSONArray;
                    }
                    return;
                }
                str = "";
                str3 = str;
                str2 = str3;
            } else {
                String n = qrf.n(null, jSONObject2, yj4.PARAM_EXTEND, "videoConfig", "musicId");
                String n2 = qrf.n(null, jSONObject2, yj4.PARAM_EXTEND, "videoConfig", "audioId");
                str2 = qrf.n(null, jSONObject2, yj4.PARAM_EXTEND, "videoConfig", "musicVendor");
                str = n;
                str3 = n2;
            }
            j = -1;
            if (TextUtils.isEmpty(str)) {
            }
            audioBean = new AudioBean();
            audioBean.id = str;
            audioBean.pieceAudioId = str3;
            audioBean.vender_type = str2;
            audioBean.position = "lite_edit";
            if (j2 >= 0) {
                audioBean.startTime = j2;
                audioBean.endTime = j;
            }
            JSONArray jSONArray2 = new JSONArray();
            jSONArray2.add(JSON.toJSON(audioBean));
            mediaStatInfoV2.audio_id = str3;
            mediaStatInfoV2.audio_vender_type = str2;
            mediaStatInfoV2.audio = jSONArray2;
        } catch (Throwable th) {
            odg.c("UploadFileHandler", "generateMediaStatInfo.audio.error:" + Log.getStackTraceString(th));
        }
    }
}

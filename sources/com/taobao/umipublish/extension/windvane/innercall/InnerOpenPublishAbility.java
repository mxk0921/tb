package com.taobao.umipublish.extension.windvane.innercall;

import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.base.data.IUGCMedia;
import com.taobao.android.litecreator.base.data.ImageBean;
import com.taobao.android.litecreator.base.data.UGCImage;
import com.taobao.android.litecreator.base.data.UGCVideo;
import com.taobao.android.litecreator.base.data.VideoBean;
import com.taobao.android.litecreator.base.data.meta.MediaStatInfo;
import com.taobao.android.litecreator.sdk.editor.data.EditorInfo;
import com.taobao.android.litecreator.sdk.editor.data.Material;
import com.taobao.android.litecreator.sdk.editor.data.Resource;
import com.taobao.android.nav.Nav;
import com.taobao.umipublish.monitor.UmiPublishMonitor;
import java.util.ArrayList;
import java.util.List;
import tb.dag;
import tb.dov;
import tb.kuu;
import tb.muu;
import tb.odg;
import tb.ptc;
import tb.qrf;
import tb.t2o;
import tb.yj4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class InnerOpenPublishAbility extends InnerCallBaseAbility {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int MEDIA_TYPE_VIDEO = 3;
    public static final String PARAMS_IMAGE = "images";
    private static final String PARAMS_REF_ID = "ref_id";
    private static final String PARAMS_REF_NAME = "ref_name";
    private static final String PARAMS_STAT_INFO = "statInfo";
    public static final String PARAMS_URL_PARAMS = "activityParams";
    public static final String PARAMS_VIDEO = "video";
    private static final String PUBLISH_PATH = "https://h5.m.taobao.com/lc/publish.html";
    public static final String RELATED_TOPIC_ID = "relatedTopicId";
    private static final String SUB_PARAMS_AUDIO = "audio";
    private static final String SUB_PARAMS_SOURCE = "source";
    private static final String SUB_PARAMS_TEMPLATE_ID = "album_film_template";
    private static final String TAG = "InnerOpenPublishAbility";

    static {
        t2o.a(944767216);
    }

    private void addDataToUgcMedia(List<UGCVideo> list, JSONObject jSONObject, boolean z, IUGCMedia iUGCMedia, boolean z2) {
        Resource resource;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98ad2e1", new Object[]{this, list, jSONObject, new Boolean(z), iUGCMedia, new Boolean(z2)});
            return;
        }
        UGCVideo uGCVideo = new UGCVideo();
        kuu.c(uGCVideo, list, z);
        EditorInfo editorInfo = uGCVideo.editorInfo;
        if (!(editorInfo == null || (resource = editorInfo.resource) == null)) {
            resource.type = Resource.TYPE_DEFAULT_MULTI;
        }
        MediaStatInfo mediaStatInfo = new MediaStatInfo(iUGCMedia.getPublishSessionId());
        mediaStatInfo.source = qrf.n("", jSONObject, PARAMS_STAT_INFO, "source");
        mediaStatInfo.album_film_template = qrf.n("", jSONObject, PARAMS_STAT_INFO, SUB_PARAMS_TEMPLATE_ID);
        mediaStatInfo.relate_topics = qrf.n("", jSONObject, "ref_id");
        fillMusicStatInfo(jSONObject, mediaStatInfo);
        uGCVideo.setMeta("mediaStatInfo", mediaStatInfo);
        addRecommendsExtraInfoToUgcMedia(uGCVideo, jSONObject);
        iUGCMedia.setMeta("xgc_direct_publish", Integer.valueOf(z2 ? 1 : 0));
        iUGCMedia.getImages().clear();
        iUGCMedia.getVideos().clear();
        iUGCMedia.getVideos().add(uGCVideo);
    }

    private void fillMusicStatInfo(JSONObject jSONObject, MediaStatInfo mediaStatInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ababa495", new Object[]{this, jSONObject, mediaStatInfo});
            return;
        }
        JSONArray a2 = qrf.a(jSONObject, PARAMS_STAT_INFO, "audio");
        if (a2 != null) {
            if (mediaStatInfo.audio == null) {
                mediaStatInfo.audio = new JSONArray();
            }
            mediaStatInfo.audio.addAll(a2);
        }
    }

    private static Uri getUri(VideoBean videoBean) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("e53ae123", new Object[]{videoBean});
        }
        String str2 = videoBean.uri;
        if (str2 != null || (str = videoBean.path) == null) {
            return Uri.parse(str2).buildUpon().build();
        }
        return Uri.parse(str);
    }

    public static /* synthetic */ Object ipc$super(InnerOpenPublishAbility innerOpenPublishAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/umipublish/extension/windvane/innercall/InnerOpenPublishAbility");
    }

    public UGCImage createUGCImage(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UGCImage) ipChange.ipc$dispatch("464c1d13", new Object[]{this, str});
        }
        ImageBean k = kuu.k(str);
        if (k == null) {
            return null;
        }
        UGCImage uGCImage = new UGCImage();
        uGCImage.origin = k;
        uGCImage.compress = k;
        uGCImage.setMeta(kuu.c, "image");
        return uGCImage;
    }

    private void addImageToUgcMedia(IUGCMedia iUGCMedia, JSONArray jSONArray) {
        UGCImage createUGCImage;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3cfb2f5", new Object[]{this, iUGCMedia, jSONArray});
        } else if (jSONArray != null && jSONArray.size() > 0) {
            iUGCMedia.getImages().clear();
            iUGCMedia.getVideos().clear();
            for (int i = 0; i < jSONArray.size(); i++) {
                JSONObject jSONObject = (JSONObject) jSONArray.get(i);
                String string = jSONObject.getString("path");
                if (!TextUtils.isEmpty(string) && (createUGCImage = createUGCImage(string)) != null) {
                    MediaStatInfo mediaStatInfo = new MediaStatInfo(iUGCMedia.getPublishSessionId());
                    mediaStatInfo.album_film_template = qrf.n("", jSONObject, PARAMS_STAT_INFO, SUB_PARAMS_TEMPLATE_ID);
                    mediaStatInfo.source = qrf.n("", jSONObject, PARAMS_STAT_INFO, "source");
                    mediaStatInfo.relate_topics = qrf.n("", jSONObject, "ref_id");
                    createUGCImage.setMeta("mediaStatInfo", mediaStatInfo);
                    iUGCMedia.appendImage(createUGCImage);
                }
            }
            iUGCMedia.setMeta("go_publish_page_confirm", Boolean.TRUE);
        }
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0064 -> B:28:0x0071). Please submit an issue!!! */
    private void addRecommendsExtraInfoToUgcMedia(ptc ptcVar, JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("826d9c59", new Object[]{this, ptcVar, jSONObject});
        } else if (jSONObject != null && (jSONObject2 = jSONObject.getJSONObject(yj4.PARAM_EXTEND)) != null) {
            String string = jSONObject2.getString(Material.RECOMMENDED_TITLE);
            String string2 = jSONObject2.getString(Material.RECOMMENDED_TEXT);
            if (!TextUtils.isEmpty(string)) {
                ptcVar.addExtraInfoMeta(Material.RECOMMENDED_TITLE, string);
            } else {
                ptcVar.removeExtraInfoMeta(Material.RECOMMENDED_TITLE);
            }
            if (!TextUtils.isEmpty(string2)) {
                ptcVar.addExtraInfoMeta(Material.RECOMMENDED_TEXT, string2);
            } else {
                ptcVar.removeExtraInfoMeta(Material.RECOMMENDED_TEXT);
            }
            try {
                JSONObject jSONObject3 = jSONObject2.getJSONObject(Material.RECOMMENDED_TOPIC_INFO);
                if (jSONObject3 == null || jSONObject3.isEmpty()) {
                    ptcVar.removeExtraInfoMeta(Material.RECOMMENDED_TOPIC_INFO);
                } else {
                    ptcVar.addExtraInfoMeta(Material.RECOMMENDED_TOPIC_INFO, jSONObject3);
                }
            } catch (Exception e) {
                odg.c(TAG, e.getMessage());
            }
        }
    }

    private void addVideoToUgcMedia(IUGCMedia iUGCMedia, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b825ba3", new Object[]{this, iUGCMedia, jSONObject});
        } else if (jSONObject != null) {
            String string = jSONObject.getString("path");
            String str = "";
            String n = qrf.n(str, jSONObject, "cover", "path");
            VideoBean n2 = kuu.n(string);
            if (n2 != null) {
                n2.cover = kuu.k(n);
                UGCVideo uGCVideo = new UGCVideo();
                uGCVideo.raw = n2;
                uGCVideo.origin = n2;
                uGCVideo.setMeta(kuu.c, "video");
                uGCVideo.setMeta("mediaId", Integer.valueOf(n2.id));
                uGCVideo.setMeta(kuu.KEY_MEDIA_MIME_TYPE, 3);
                Uri uri = getUri(n2);
                if (uri != null) {
                    str = uri.toString();
                }
                uGCVideo.setMeta(kuu.KEY_MEDIA_URI, str);
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(uGCVideo);
                addDataToUgcMedia(arrayList, jSONObject, false, iUGCMedia, true);
            }
        }
    }

    private JSONObject findFirstImageWithTopicParams(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("ef7cb67a", new Object[]{this, jSONArray});
        }
        for (int i = 0; i < jSONArray.size(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            if (!(jSONObject == null || !jSONObject.containsKey("ref_id") || TextUtils.isEmpty(jSONObject.getString("ref_id")))) {
                return jSONObject;
            }
        }
        return jSONArray.getJSONObject(0);
    }

    private void updateRelatedTopic(JSONObject jSONObject, JSONObject jSONObject2, IUGCMedia iUGCMedia) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70be2832", new Object[]{this, jSONObject, jSONObject2, iUGCMedia});
        } else if (jSONObject2 != null) {
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            if (!jSONObject2.containsKey("ref_id") || TextUtils.isEmpty(jSONObject2.getString("ref_id"))) {
                odg.b(TAG, "aYou innerOpenPublish, refId is null");
                UmiPublishMonitor.w().o("wind_vane", "9002", "wind_vane_publish_ability_empty_ref_id", null);
            } else {
                jSONObject.put("ref_id", (Object) jSONObject2.getString("ref_id"));
                iUGCMedia.setMeta(RELATED_TOPIC_ID, jSONObject2.getString("ref_id"));
            }
            if (!jSONObject2.containsKey("ref_name") || TextUtils.isEmpty(jSONObject2.getString("ref_name"))) {
                odg.b(TAG, "aYou innerOpenPublish, refName is null");
                UmiPublishMonitor.w().o("wind_vane", "9002", "wind_vane_publish_ability_empty_ref_name", null);
                return;
            }
            jSONObject.put("ref_name", (Object) jSONObject2.getString("ref_name"));
        }
    }

    @Override // com.taobao.umipublish.extension.windvane.innercall.InnerCallBaseAbility
    public void onExecute(JSONObject jSONObject, dov.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1150513", new Object[]{this, jSONObject, aVar});
            return;
        }
        IUGCMedia n = muu.n(this.mContext);
        if (n == null) {
            errorCallback("2", "ugcMedia is null");
            return;
        }
        JSONArray jSONArray = jSONObject.getJSONArray("images");
        JSONObject jSONObject2 = jSONObject.getJSONObject("video");
        if (jSONArray != null && jSONArray.size() > 0) {
            jSONObject2 = findFirstImageWithTopicParams(jSONArray);
            addImageToUgcMedia(n, jSONArray);
        } else if (jSONObject2 == null || jSONObject2.size() <= 0) {
            odg.b(TAG, "aYou innerOpenPublish, error type");
            errorCallback("9001", " Error type");
            return;
        } else {
            addVideoToUgcMedia(n, jSONObject2);
        }
        JSONObject jSONObject3 = jSONObject.getJSONObject(PARAMS_URL_PARAMS);
        updateRelatedTopic(jSONObject3, jSONObject2, n);
        if (jSONObject3 != null && jSONObject3.size() > 0) {
            updateUrlPrams(jSONObject3);
        }
        successCallback(new JSONObject());
        Nav.from(this.mContext).toUri(dag.c(muu.d(n)).e("PUBLISH_PATH"));
    }
}

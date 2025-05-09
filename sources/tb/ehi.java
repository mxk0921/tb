package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.base.data.IUGCMedia;
import com.taobao.android.litecreator.base.data.UGCImage;
import com.taobao.android.litecreator.base.data.UGCVideo;
import com.taobao.android.litecreator.base.data.meta.MediaStatInfo;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ehi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(511705635);
    }

    public static void a(IUGCMedia iUGCMedia) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad31e013", new Object[]{iUGCMedia});
        } else {
            b(iUGCMedia, null);
        }
    }

    public static void b(IUGCMedia iUGCMedia, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fee44b1d", new Object[]{iUGCMedia, str});
        } else if (iUGCMedia != null) {
            String publishSessionId = iUGCMedia.getPublishSessionId();
            if (!TextUtils.isEmpty(publishSessionId)) {
                List<UGCImage> images = iUGCMedia.getImages();
                List<UGCVideo> videos = iUGCMedia.getVideos();
                JSONArray jSONArray = new JSONArray();
                if (images != null && images.size() > 0) {
                    for (UGCImage uGCImage : images) {
                        MediaStatInfo mediaStatInfo = (MediaStatInfo) uGCImage.getMeta("mediaStatInfo");
                        if (mediaStatInfo != null) {
                            if (!TextUtils.isEmpty(str)) {
                                mediaStatInfo.goods_id = str;
                            }
                            jSONArray.add(JSON.toJSON(mediaStatInfo));
                        }
                    }
                } else if (videos != null && videos.size() > 0) {
                    for (UGCVideo uGCVideo : videos) {
                        MediaStatInfo mediaStatInfo2 = (MediaStatInfo) uGCVideo.getMeta("mediaStatInfo");
                        if (mediaStatInfo2 != null) {
                            if (!TextUtils.isEmpty(str)) {
                                mediaStatInfo2.goods_id = str;
                            }
                            jSONArray.add(JSON.toJSON(mediaStatInfo2));
                        }
                    }
                }
                ko4 ko4Var = ko4.INSTANCE;
                if (ko4Var.f().size() > 0) {
                    JSONArray jSONArray2 = new JSONArray();
                    for (String str2 : ko4Var.f().values()) {
                        jSONArray2.add(str2);
                    }
                    MediaStatInfo mediaStatInfo3 = new MediaStatInfo(iUGCMedia.getPublishSessionId());
                    mediaStatInfo3.template_scene_labels = jSONArray2;
                    if (!TextUtils.isEmpty(str)) {
                        mediaStatInfo3.goods_id = str;
                    }
                    jSONArray.add(JSON.toJSON(mediaStatInfo3));
                }
                MediaStatInfo.getGlobalStatInfo().put(publishSessionId, jSONArray.toJSONString());
            }
        }
    }
}

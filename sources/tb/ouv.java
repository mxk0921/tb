package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.DWContext;
import com.taobao.avplayer.interactivelifecycle.hiv.request.ContentDetailData;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ouv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(452985180);
    }

    public static void a(DWContext dWContext, String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49d7515f", new Object[]{dWContext, str, map});
        } else if (dWContext != null) {
            dWContext.mUTAdapter.a("DWVideo", "Button", str, dWContext.getUTParams(), map);
        }
    }

    public static Map<String, String> b(DWContext dWContext, ContentDetailData contentDetailData) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("6e4e9cf0", new Object[]{dWContext, contentDetailData});
        }
        HashMap hashMap = new HashMap();
        if (dWContext == null) {
            return hashMap;
        }
        if (!TextUtils.isEmpty(dWContext.mContentId)) {
            hashMap.put("feed_id", dWContext.mContentId);
        } else {
            hashMap.put("feed_id", "");
        }
        hashMap.put("interactive_id", String.valueOf(dWContext.mInteractiveId));
        if (!TextUtils.isEmpty(dWContext.mFrom)) {
            hashMap.put("from", dWContext.mFrom);
            hashMap.put("page", dWContext.mFrom);
        }
        Map<String, String> uTParams = dWContext.getUTParams();
        if (uTParams == null || uTParams.get("feed_type") == null) {
            str = "";
        } else {
            str = uTParams.get("feed_type");
        }
        hashMap.put("feed_type", str);
        if (contentDetailData != null) {
            if (!TextUtils.isEmpty(contentDetailData.videoId)) {
                hashMap.put(xau.PROPERTY_VIDEO_ID, contentDetailData.videoId);
            }
            if (!TextUtils.isEmpty(contentDetailData.mediaId)) {
                hashMap.put("video_uid", contentDetailData.mediaId);
            }
        } else {
            hashMap.put("video_uid", "");
        }
        if (!hashMap.containsKey(xau.PROPERTY_VIDEO_ID) && !TextUtils.isEmpty(dWContext.getVideoId())) {
            hashMap.put(xau.PROPERTY_VIDEO_ID, dWContext.getVideoId());
        }
        return hashMap;
    }

    public static Map<String, String> c(DWContext dWContext, ContentDetailData contentDetailData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("c57ba14f", new Object[]{dWContext, contentDetailData});
        }
        HashMap hashMap = new HashMap();
        if (dWContext == null) {
            return hashMap;
        }
        if (!TextUtils.isEmpty(dWContext.mCid)) {
            hashMap.put("feed_id", dWContext.mCid);
        }
        if (!TextUtils.isEmpty(dWContext.mFrom)) {
            hashMap.put("from", dWContext.mFrom);
        }
        if (!TextUtils.isEmpty(dWContext.getVideoId())) {
            hashMap.put(xau.PROPERTY_VIDEO_ID, dWContext.getVideoId());
        }
        return hashMap;
    }
}

package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.monitor.track.spm.merge.MergeUtil;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.framework.preload.cache.DetailCacheData;
import com.taobao.android.fluid.framework.preload.cache.IDetailCache;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class re7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f27315a;

        public a(String str) {
            this.f27315a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            ir9.b("DetailCacheUtil", "removeMediaDetailContent " + this.f27315a);
            ggs.e(re7.a(this.f27315a), null);
        }
    }

    static {
        t2o.a(468714640);
    }

    public static /* synthetic */ String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("28c0253f", new Object[]{str});
        }
        return e(str);
    }

    public static void b(DetailCacheData detailCacheData, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a881de95", new Object[]{detailCacheData, map});
        } else if (map != null && detailCacheData != null) {
            map.put("dc_cacheType", d(detailCacheData));
            map.put("dc_cacheTimestamp", Long.valueOf(detailCacheData.getTimeStamp()));
            map.put("dc_isCacheValid", Boolean.valueOf(detailCacheData.isValid));
            map.put("dc_isVideoCached", Boolean.valueOf(detailCacheData.hasVideoCached));
            map.put("dc_videoCacheKey", detailCacheData.getPlayerCacheKey());
            map.put("dc_hasVideoDownloadSize", String.valueOf(detailCacheData.hasVideoDownloadSize));
            map.put("dc_hasVideoDownloadTime", Long.valueOf(detailCacheData.hasVideoDownloadTime));
            map.put("dc_videoId", detailCacheData.contentId);
        }
    }

    public static List<DetailCacheData> c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("f1cbe9b", new Object[]{str});
        }
        try {
            Object a2 = ggs.a(str);
            if (!(a2 instanceof JSONArray)) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < ((JSONArray) a2).size(); i++) {
                arrayList.add(DetailCacheData.parseFromJson(((JSONArray) a2).getJSONObject(i)));
            }
            return arrayList;
        } catch (Throwable th) {
            ir9.b("DetailCacheUtil", "getCacheDataListFromDisk, error:" + th.getMessage());
            return null;
        }
    }

    public static String d(DetailCacheData detailCacheData) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd26dd83", new Object[]{detailCacheData});
        }
        if (detailCacheData == null || (str = detailCacheData.sceneName) == null) {
            return "none";
        }
        str.hashCode();
        if (str.equals(IDetailCache.SCENE_NAME_SHORT_VIDEO_INTERNAL_EXPOSED)) {
            return MergeUtil.KEY_EXPOSED;
        }
        if (!str.equals(IDetailCache.SCENE_NAME_SHORT_VIDEO_INTERNAL_UNEXPOSED)) {
            return detailCacheData.getSceneName();
        }
        return "unexposed";
    }

    public static String e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e5c51dcb", new Object[]{str});
        }
        return "shortvideo_detail_" + str;
    }

    public static void f(String str, DetailCacheData detailCacheData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a323248b", new Object[]{str, detailCacheData});
            return;
        }
        JSONObject jSONObject = (JSONObject) ggs.a(e(str));
        if (jSONObject != null) {
            detailCacheData.setCurrentDataVersion(jSONObject.getIntValue("currentDataVersion"));
            detailCacheData.setMediaContentDetailData(jSONObject.getJSONObject("mediaContentDetailData"));
            detailCacheData.setMediaContentDetailJson(jSONObject.getJSONObject("mediaContentDetailJson"));
        }
    }

    public static void g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65af999", new Object[]{str});
        } else if (!TextUtils.isEmpty(str)) {
            nwv.A0(new a(str), 5000L);
        }
    }

    public static void h(List<DetailCacheData> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9894ab9", new Object[]{list});
            return;
        }
        for (DetailCacheData detailCacheData : list) {
            if (!(TextUtils.isEmpty(detailCacheData.contentId) || detailCacheData.peekMediaContentDetailData() == null || detailCacheData.peekMediaContentDetailJson() == null)) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("currentDataVersion", (Object) Integer.valueOf(detailCacheData.peekCurrentDataVersion()));
                jSONObject.put("mediaContentDetailData", (Object) detailCacheData.peekMediaContentDetailData());
                jSONObject.put("mediaContentDetailJson", (Object) detailCacheData.peekMediaContentDetailJson());
                ggs.e(e(detailCacheData.contentId), jSONObject);
            }
        }
    }

    public static boolean i(DetailCacheData detailCacheData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a9fb466", new Object[]{detailCacheData})).booleanValue();
        }
        if (detailCacheData == null || !aps.j()) {
            return false;
        }
        r6m.c(detailCacheData.contentId, detailCacheData.getPlayerCacheKey());
        detailCacheData.setPlayerCacheHighPriority(false);
        return true;
    }

    public static boolean j(DetailCacheData detailCacheData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6028675f", new Object[]{detailCacheData})).booleanValue();
        }
        if (detailCacheData == null || !aps.j() || (IDetailCache.SCENE_NAME_SHORT_VIDEO_INTERNAL_EXPOSED.equals(detailCacheData.getSceneName()) && aps.A())) {
            return false;
        }
        String e = r6m.e(detailCacheData.contentId, detailCacheData.getPlayerCacheKey());
        if (!TextUtils.isEmpty(e)) {
            detailCacheData.setPlayerCacheKey(e);
            detailCacheData.setPlayerCacheHighPriority(true);
            return true;
        }
        return false;
    }
}

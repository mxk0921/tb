package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dressup.common.model.PageModel;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class cz7 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final cz7 INSTANCE = new cz7();
    public static final String PAGE_DATA_KEY_PAGE_CACHE_BANNER_DATA_IS_DIRTY_JSON = "pageCacheBannerDataIsDirtyJson";
    public static final String PAGE_DATA_KEY_PAGE_CACHE_UT_FILTER_JSON = "pageCacheUtFilterJson";

    static {
        t2o.a(918552778);
    }

    public final JSONObject a(qpu qpuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("9e09c87b", new Object[]{this, qpuVar});
        }
        if (qpuVar == null) {
            tpu.Companion.a("DressDataServiceUtil", "异常:无turboEngineContext", null);
            return null;
        }
        Object s = ((byb) qpuVar.getService(byb.class)).s();
        PageModel pageModel = s instanceof PageModel ? (PageModel) s : null;
        if (pageModel == null) {
            tpu.Companion.a("DressDataServiceUtil", "异常:无pageModel", null);
            return null;
        }
        JSONObject originData = pageModel.getOriginData();
        if (originData != null) {
            return originData;
        }
        tpu.Companion.a("DressDataServiceUtil", "异常:无有效originData", null);
        return null;
    }
}

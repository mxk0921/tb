package tb;

import android.text.TextUtils;
import com.ali.user.open.core.util.ParamsConstants;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.intf.MtopBuilder;
import mtopsdk.mtop.intf.MtopPrefetch;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class a6z implements MtopPrefetch.IPrefetchComparator {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(490733577);
        t2o.a(589299957);
    }

    @Override // mtopsdk.mtop.intf.MtopPrefetch.IPrefetchComparator
    public MtopPrefetch.CompareResult compare(MtopBuilder mtopBuilder, MtopBuilder mtopBuilder2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopPrefetch.CompareResult) ipChange.ipc$dispatch("cca63c2e", new Object[]{this, mtopBuilder, mtopBuilder2});
        }
        MtopPrefetch.CompareResult compareResult = new MtopPrefetch.CompareResult();
        if (mtopBuilder == null || mtopBuilder2 == null) {
            compareResult.setSame(false);
            return compareResult;
        }
        MtopRequest mtopRequest = mtopBuilder.request;
        String str = null;
        Map<String, String> map = mtopRequest != null ? mtopRequest.dataParams : null;
        MtopRequest mtopRequest2 = mtopBuilder2.request;
        Map<String, String> map2 = mtopRequest2 != null ? mtopRequest2.dataParams : null;
        String str2 = map != null ? map.get(ParamsConstants.Key.PARAM_SCENE_CODE) : null;
        if (map2 != null) {
            str = map2.get(ParamsConstants.Key.PARAM_SCENE_CODE);
        }
        if (str2 == null || str == null) {
            compareResult.setSame(false);
        } else {
            compareResult.setSame(TextUtils.equals(str2, str));
            fve.e("Themis/Prerender", "是否一致：" + compareResult.isSame());
        }
        return compareResult;
    }
}

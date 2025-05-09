package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.oversea.homepage.litetao.service.biz.search.ITaoTeSearchService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class bpj implements dzc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final cfc f16533a;

    public bpj(cfc cfcVar) {
        this.f16533a = cfcVar;
    }

    @Override // tb.dzc
    public JSONObject getSubTabSearchBarData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("bab9b3d1", new Object[]{this});
        }
        ITaoTeSearchService iTaoTeSearchService = (ITaoTeSearchService) this.f16533a.a(ITaoTeSearchService.class);
        if (iTaoTeSearchService != null) {
            return iTaoTeSearchService.getSearchData();
        }
        return null;
    }
}

package com.taobao.search.weex.module;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.FestivalMgr;
import com.taobao.weex.annotation.JSMethod;
import com.taobao.weex.common.WXModule;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class SearchFestivalModule extends WXModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MODULE_NAME = "searchFestival";

    static {
        t2o.a(815793815);
    }

    public static /* synthetic */ Object ipc$super(SearchFestivalModule searchFestivalModule, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/weex/module/SearchFestivalModule");
    }

    @JSMethod(uiThread = false)
    public int getActionBarBackgroundColor(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("55a6ef6e", new Object[]{this, jSONObject})).intValue();
        }
        return FestivalMgr.i().h(FestivalMgr.KEY_GLOBAL_ACTIONBAR_BG, 0);
    }
}

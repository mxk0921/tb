package com.taobao.search.common.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavix.service.BUFS;
import com.taobao.message.kit.util.TextUtils;
import com.taobao.search.common.util.ClientIntelligenceHelper;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.LazyThreadSafetyMode;
import tb.a07;
import tb.d1a;
import tb.i04;
import tb.njg;
import tb.o4p;
import tb.t2o;
import tb.wsq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class ClientIntelligenceHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BIZ_ID_MAIN_SEARCH_COMMON = "PageSearch";
    public static final String BIZ_ID_MAIN_SRP = "BXIdSpec|PageSearch";
    public static final String INVOKE_ID_MAIN_SRP = "search.request.list";
    public static final String INVOKE_ID_SEARCH_DOOR_BG_WORD = "search.request.searchdoor.bgword";
    public static final String INVOKE_ID_SEARCH_DOOR_MAIN_PAGE = "search.request.searchdoor.main";
    public static final String INVOKE_ID_SEARCH_DOOR_SUGGEST = "search.request.searchdoor.suggest";

    /* renamed from: a  reason: collision with root package name */
    public final boolean f11531a;
    public static final a Companion = new a(null);
    public static final njg<ClientIntelligenceHelper> b = kotlin.a.a(LazyThreadSafetyMode.SYNCHRONIZED, new d1a() { // from class: tb.n1z
        @Override // tb.d1a
        public final Object invoke() {
            ClientIntelligenceHelper j;
            j = ClientIntelligenceHelper.j();
            return j;
        }
    });

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(815792208);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public final ClientIntelligenceHelper a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ClientIntelligenceHelper) ipChange.ipc$dispatch("78eed5fe", new Object[]{this});
            }
            return (ClientIntelligenceHelper) ClientIntelligenceHelper.a().getValue();
        }

        public a() {
        }
    }

    static {
        t2o.a(815792207);
    }

    public ClientIntelligenceHelper() {
        Class<BUFS> cls;
        boolean z;
        try {
            cls = BUFS.class;
            IpChange ipChange = BUFS.$ipChange;
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls != null) {
            z = true;
        } else {
            z = false;
        }
        this.f11531a = z;
    }

    public static final /* synthetic */ njg a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (njg) ipChange.ipc$dispatch("59beb729", new Object[0]);
        }
        return b;
    }

    public static final ClientIntelligenceHelper e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ClientIntelligenceHelper) ipChange.ipc$dispatch("78eed5fe", new Object[0]);
        }
        return Companion.a();
    }

    public static final ClientIntelligenceHelper j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ClientIntelligenceHelper) ipChange.ipc$dispatch("2173f841", new Object[0]);
        }
        return new ClientIntelligenceHelper();
    }

    public final String c(String str, String str2, String str3, Integer num) {
        String str4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2352bd58", new Object[]{this, str, str2, str3, num});
        }
        if (!this.f11531a) {
            return "";
        }
        try {
            str4 = BUFS.getFeature(new BUFS.QueryArgs(), str2, str, str3);
        } catch (Throwable th) {
            th.printStackTrace();
            str4 = null;
        }
        if (str4 == null || str4.length() == 0) {
            return "";
        }
        if (num == null || num.intValue() < 0) {
            return str4;
        }
        if (str4.length() > num.intValue()) {
            return "";
        }
        return str4;
    }

    public final String f(String str, String str2, Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aeb0450d", new Object[]{this, str, str2, num});
        }
        return c(BIZ_ID_MAIN_SEARCH_COMMON, str, str2, num);
    }

    public final String g(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e4d420ce", new Object[]{this, num});
        }
        return c(BIZ_ID_MAIN_SRP, INVOKE_ID_MAIN_SRP, "Page_SearchItemList", num);
    }

    public final boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3d8a2150", new Object[]{this})).booleanValue();
        }
        return this.f11531a;
    }

    public final String b(String str) {
        JSONObject d;
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2b6006f5", new Object[]{this, str});
        }
        if (str == null || !o4p.m0()) {
            return "";
        }
        BUFS.QueryArgs queryArgs = new BUFS.QueryArgs();
        queryArgs.setQueryArgsKV("query", str);
        try {
            JSONArray jSONArray = JSON.parseObject(BUFS.getFeature((List<BUFS.QueryArgs>) Collections.singletonList(queryArgs), "search.request.list.exp", BIZ_ID_MAIN_SEARCH_COMMON, "Page_SearchItemList", false)).getJSONArray("tb_bc_search_query_etc_vstr");
            if (jSONArray == null || (d = d(jSONArray, str)) == null || (string = d.getString("exposeItemIds")) == null) {
                return "";
            }
            Set F0 = i04.F0(wsq.z0(string, new String[]{";"}, false, 0, 6, null));
            String string2 = d.getString("clickItemIds");
            F0.removeAll(i04.G0(wsq.z0(string2 == null ? "" : string2, new String[]{";"}, false, 0, 6, null)));
            return i04.j0(F0, ";", "", "", -1, null, null, 48, null);
        } catch (Throwable unused) {
            return "";
        }
    }

    public final JSONObject d(JSONArray jSONArray, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("c2d72f11", new Object[]{this, jSONArray, str});
        }
        int size = jSONArray.size();
        for (int i = 0; i < size; i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            if (TextUtils.equals(jSONObject.getString("query"), str)) {
                return jSONObject;
            }
        }
        return null;
    }
}

package com.taobao.tao.recommend4.recyclerview;

import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.core.utils.lang3.ObjectUtils;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.taobao.subservice.biz.nextpageoptimizeservice.impl.preload.model.PreLoadModel;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.ItemModel;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import com.taobao.tao.recommend3.gateway.model.request.AwesomeGetRequestParams;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerData;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetData;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import tb.etn;
import tb.eyj;
import tb.fnm;
import tb.fve;
import tb.lhd;
import tb.mve;
import tb.qjd;
import tb.t2o;
import tb.yq0;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class RecommendViewPreloadListener extends RecyclerView.OnScrollListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_ENABLE_PRE_LOAD_NEW_DETAIL = "enablePreLoadNewDetail";
    public static boolean b = false;

    /* renamed from: a  reason: collision with root package name */
    public final String f12711a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements qjd.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.qjd.b
        public void a(String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3987b210", new Object[]{this, str, str2, str3});
            }
        }

        @Override // tb.qjd.b
        public void b(String str, String str2, AwesomeGetData awesomeGetData, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d586a494", new Object[]{this, str, str2, awesomeGetData, new Boolean(z)});
            } else if (awesomeGetData != null) {
                RecommendViewPreloadListener.b(RecommendViewPreloadListener.o(RecommendViewPreloadListener.this, awesomeGetData, str));
            }
        }

        @Override // tb.qjd.b
        public void d(String str, AwesomeGetRequestParams awesomeGetRequestParams, String str2, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c78df556", new Object[]{this, str, awesomeGetRequestParams, str2, new Boolean(z)});
            }
        }
    }

    static {
        t2o.a(729810058);
    }

    public RecommendViewPreloadListener(String str, lhd lhdVar) {
        this.f12711a = str;
        lhdVar.m(r());
    }

    public static /* synthetic */ boolean b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e1554b7f", new Object[]{new Boolean(z)})).booleanValue();
        }
        b = z;
        return z;
    }

    public static /* synthetic */ Object ipc$super(RecommendViewPreloadListener recommendViewPreloadListener, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1177043419) {
            super.onScrolled((RecyclerView) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
            return null;
        } else if (hashCode == 1361287682) {
            super.onScrollStateChanged((RecyclerView) objArr[0], ((Number) objArr[1]).intValue());
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/tao/recommend4/recyclerview/RecommendViewPreloadListener");
        }
    }

    public static /* synthetic */ boolean o(RecommendViewPreloadListener recommendViewPreloadListener, AwesomeGetData awesomeGetData, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7e211bb4", new Object[]{recommendViewPreloadListener, awesomeGetData, str})).booleanValue();
        }
        return recommendViewPreloadListener.s(awesomeGetData, str);
    }

    public static void t(RecyclerView recyclerView, String str) {
        RecommendRecyclerAdapter recommendRecyclerAdapter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("181b7fc8", new Object[]{recyclerView, str});
        } else if (b && recyclerView != null && (recommendRecyclerAdapter = (RecommendRecyclerAdapter) recyclerView.getAdapter()) != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            p(recyclerView, recommendRecyclerAdapter, arrayList, arrayList2);
            PreLoadModel d = fnm.d(arrayList, -1, "newDetail", str);
            if (d != null) {
                d.setBizName("new_detail");
                eyj.d(d);
            }
            PreLoadModel d2 = fnm.d(arrayList2, -1, fnm.TARGET_TYPE_LITE_DETAIL, str);
            if (d2 != null) {
                d2.setBizName(yq0.PRELOAD_REQUESTER_BIZ_NAME_LITE);
                eyj.d(d2);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51239a02", new Object[]{this, recyclerView, new Integer(i)});
            return;
        }
        super.onScrollStateChanged(recyclerView, i);
        t(recyclerView, this.f12711a);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9d7be25", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
        } else {
            super.onScrolled(recyclerView, i, i2);
        }
    }

    public final qjd.b r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qjd.b) ipChange.ipc$dispatch("dd6fe33e", new Object[]{this});
        }
        return new a();
    }

    public final boolean s(AwesomeGetData awesomeGetData, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cc049bdb", new Object[]{this, awesomeGetData, str})).booleanValue();
        }
        boolean a2 = mve.a("enableDefaultOpenNDInstant", true);
        Map<String, AwesomeGetContainerData> map = awesomeGetData.containers;
        if (map == null) {
            fve.e("RecommendViewPreloadListener", "enablePreLoadNewDetail containerDataModel is null");
            return a2;
        }
        AwesomeGetContainerData awesomeGetContainerData = map.get(str);
        if (awesomeGetContainerData == null) {
            fve.e("RecommendViewPreloadListener", "baseData == null");
            return a2;
        }
        JSONObject ext = awesomeGetContainerData.getExt();
        if (ext == null) {
            fve.e("RecommendViewPreloadListener", "ext == null");
            return a2;
        }
        JSONObject jSONObject = ext.getJSONObject("homeGlobalABTest");
        if (ObjectUtils.c(jSONObject)) {
            fve.e("RecommendViewPreloadListener", "enablePreLoadNewDetail homeGlobalAbTest is null");
            return a2;
        } else if (jSONObject.getBoolean(KEY_ENABLE_PRE_LOAD_NEW_DETAIL) == null) {
            return a2;
        } else {
            return jSONObject.getBooleanValue(KEY_ENABLE_PRE_LOAD_NEW_DETAIL);
        }
    }

    public static void p(RecyclerView recyclerView, RecommendRecyclerAdapter recommendRecyclerAdapter, List<BaseSectionModel<?>> list, List<BaseSectionModel<?>> list2) {
        SectionModel sectionModel;
        ItemModel item;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c98798c1", new Object[]{recyclerView, recommendRecyclerAdapter, list, list2});
            return;
        }
        int[] c = etn.c(recyclerView);
        if (c == null) {
            fve.e("RecommendViewPreloadListener", "range invalid");
            return;
        }
        int i = c[1];
        for (int i2 = c[0]; i2 < i; i2++) {
            JSONObject W = recommendRecyclerAdapter.W(i2);
            if (!(!(W instanceof SectionModel) || (item = (sectionModel = (SectionModel) W).getItem()) == null || (jSONObject = item.getJSONObject("0")) == null || (jSONObject2 = jSONObject.getJSONObject("ext")) == null)) {
                String string = jSONObject2.getString("targetType");
                if (TextUtils.equals(string, "newDetail")) {
                    list.add(sectionModel);
                } else if (TextUtils.equals(string, fnm.TARGET_TYPE_LITE_DETAIL)) {
                    list2.add(sectionModel);
                }
            }
        }
    }
}

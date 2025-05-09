package com.taobao.tao.recommend4.manager.weex;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.phone.wallet.spmtracker.Constant;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.google.android.material.appbar.AppBarLayout;
import com.taobao.tao.recommend4.recyclerview.HomeChildRecyclerView;
import com.taobao.tao.recommend4.recyclerview.RecommendRecyclerAdapter;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.annotation.JSMethod;
import com.taobao.weex.ui.action.BasicComponentData;
import com.taobao.weex.ui.component.WXComponentProp;
import com.taobao.weex.ui.component.WXVContainer;
import java.io.Serializable;
import java.util.Map;
import tb.a3b;
import tb.arm;
import tb.d11;
import tb.ddv;
import tb.fnn;
import tb.hrg;
import tb.khd;
import tb.l9n;
import tb.mhd;
import tb.sfh;
import tb.t2o;
import tb.z4a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class RecommendWeexContainerView extends WXVContainer<FrameLayout> implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String API = "api";
    private static final String BIZ_PARAMS = "bizParams";
    private static final String CHANNEL = "channel";
    private static final String INFO_FLOW_ATTACH_TO_WINDOW = "infoflowrendered";
    private static final String INFO_FLOW_RENDER_END_TIME = "rendertime";
    private static final String OPTIMIZE_TYPE = "optimizeType";
    private static final String PAGE_RENDER_START_TIME = "pageRenderStartTime";
    private static final String QUERY_PARAMS = "queryParams";
    private static final String SHOW_LOADING = "showLoading";
    private static final String TAG = "RCWeexContainerView";
    private static final String VERSION = "version";
    private FrameLayout container;
    private boolean isShowLoading;
    private khd listener = new a();
    private Context mContext;
    private boolean mIsNotifyEnterPage;
    private fnn mNewRecommendContainer;
    private long mPageRenderStartTime;
    private RecyclerView mRecyclerView;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements khd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.khd
        public void onError() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("11bc4f70", new Object[]{this});
            } else {
                sfh.d(RecommendWeexContainerView.TAG, "IRecommendCallback onError");
            }
        }

        @Override // tb.khd
        public void onSuccess() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d0e393ab", new Object[]{this});
                return;
            }
            RecommendWeexContainerView.access$000(RecommendWeexContainerView.this);
            RecommendWeexContainerView.access$100(RecommendWeexContainerView.this);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements AppBarLayout.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ RecyclerView f12684a;

        public b(RecommendWeexContainerView recommendWeexContainerView, RecyclerView recyclerView) {
            this.f12684a = recyclerView;
        }

        @Override // com.google.android.material.appbar.AppBarLayout.c
        public void a(AppBarLayout appBarLayout, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f1579d24", new Object[]{this, appBarLayout, new Integer(i)});
            } else {
                ((HomeChildRecyclerView) this.f12684a).onScrolledByNestedParent(null);
            }
        }
    }

    static {
        t2o.a(729810009);
    }

    public RecommendWeexContainerView(WXSDKInstance wXSDKInstance, WXVContainer wXVContainer, BasicComponentData basicComponentData) {
        super(wXSDKInstance, wXVContainer, basicComponentData);
    }

    public static /* synthetic */ void access$000(RecommendWeexContainerView recommendWeexContainerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("797790c", new Object[]{recommendWeexContainerView});
        } else {
            recommendWeexContainerView.update();
        }
    }

    public static /* synthetic */ void access$100(RecommendWeexContainerView recommendWeexContainerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2208722b", new Object[]{recommendWeexContainerView});
        } else {
            recommendWeexContainerView.notifyInfoFlowRenderTime();
        }
    }

    private void bizProcess(z4a z4aVar, String str, String str2, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4fc484a", new Object[]{this, z4aVar, str, str2, map});
        } else if (z4aVar != null) {
            boolean initRecommendContainer = initRecommendContainer(this.mContext, z4aVar);
            l9n.b("RC-RecommendContainer", z4aVar.b());
            if (initRecommendContainer || z4aVar != z4a.REC_FAVORITE) {
                requestData(new d11(str, str2), map);
            }
        }
    }

    private ViewParent getNestedParent(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewParent) ipChange.ipc$dispatch("74c0ae31", new Object[]{this, recyclerView});
        }
        if (recyclerView == null) {
            return null;
        }
        for (ViewParent parent = recyclerView.getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof CoordinatorLayout) {
                return parent;
            }
        }
        return null;
    }

    private boolean initRecommendContainer(Context context, z4a z4aVar) {
        RecyclerView.Adapter adapter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c4be662", new Object[]{this, context, z4aVar})).booleanValue();
        }
        if (this.mNewRecommendContainer != null) {
            return false;
        }
        try {
            this.mNewRecommendContainer = fnn.e(z4aVar);
        } catch (Throwable unused) {
            sfh.d(TAG, "RecommendContainer.newInstance error");
        }
        fnn fnnVar = this.mNewRecommendContainer;
        if (fnnVar != null) {
            fnnVar.y(this.listener);
            if (this.mRecyclerView == null) {
                this.mRecyclerView = this.mNewRecommendContainer.a(context);
            }
            if (this.isShowLoading && (adapter = this.mRecyclerView.getAdapter()) != null && (adapter instanceof RecommendRecyclerAdapter)) {
                ((RecommendRecyclerAdapter) this.mRecyclerView.getAdapter()).c0(0);
            }
            if (!this.mIsNotifyEnterPage) {
                notifyEnterPage(this.mNewRecommendContainer, this.mPageRenderStartTime);
            }
        }
        update();
        return true;
    }

    public static /* synthetic */ Object ipc$super(RecommendWeexContainerView recommendWeexContainerView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -734487892) {
            return super.getHostView();
        }
        if (hashCode == -17468269) {
            super.onActivityDestroy();
            return null;
        }
        int hashCode2 = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/tao/recommend4/manager/weex/RecommendWeexContainerView");
    }

    private void notifyInfoFlowRenderTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e23c54f", new Object[]{this});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(INFO_FLOW_RENDER_END_TIME, (Object) String.valueOf(System.currentTimeMillis()));
        jSONObject.put(OPTIMIZE_TYPE, (Object) arm.a());
        fireEvent(INFO_FLOW_ATTACH_TO_WINDOW, jSONObject);
    }

    private void parseBizParamsAndPerform(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("576f7fc1", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            JSONObject parseObject = JSON.parseObject(str);
            z4a d = z4a.d(parseObject.getString("channel"));
            if (d == null) {
                sfh.d(TAG, "containerType is null");
                return;
            }
            String string = parseObject.getString("api");
            String string2 = parseObject.getString("version");
            String string3 = parseObject.getString("queryParams");
            this.isShowLoading = a3b.o(parseObject.getString("showLoading"));
            Map<String, Object> map = null;
            try {
                if (!TextUtils.isEmpty(string3)) {
                    map = (Map) JSON.parseObject(string3, Map.class);
                }
            } catch (Throwable unused) {
                sfh.d(TAG, "queryParamsStr parse error , queryParamsStr :" + string3);
            }
            bizProcess(d, string, string2, map);
        }
    }

    private void requestData(d11 d11Var, Map<String, Object> map) {
        JSONObject parseObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d4f4803", new Object[]{this, d11Var, map});
        } else if (this.mNewRecommendContainer != null) {
            if (map != null) {
                try {
                    parseObject = JSON.parseObject(JSON.toJSONString(map));
                } catch (Exception e) {
                    e.printStackTrace();
                    return;
                }
            } else {
                parseObject = null;
            }
            this.mNewRecommendContainer.w(d11Var, parseObject);
        }
    }

    private void setParentScrollListener(RecyclerView recyclerView) {
        ViewParent nestedParent;
        View childAt;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f02dc83", new Object[]{this, recyclerView});
        } else if (recyclerView != null && (recyclerView instanceof HomeChildRecyclerView) && (nestedParent = getNestedParent(recyclerView)) != null && (nestedParent instanceof CoordinatorLayout) && (childAt = ((CoordinatorLayout) nestedParent).getChildAt(0)) != null && (childAt instanceof AppBarLayout)) {
            ((AppBarLayout) childAt).addOnOffsetChangedListener((AppBarLayout.d) new b(this, recyclerView));
        }
    }

    private void update() {
        FrameLayout frameLayout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee4a30d0", new Object[]{this});
        } else if (this.mNewRecommendContainer != null && (frameLayout = this.container) != null && this.mRecyclerView != null) {
            if (frameLayout.getChildCount() == 0) {
                ViewGroup.LayoutParams layoutParams = this.mRecyclerView.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.height = -1;
                    this.mRecyclerView.setLayoutParams(layoutParams);
                } else {
                    this.mRecyclerView.setLayoutParams(new RecyclerView.LayoutParams(-1, -1));
                }
                if (this.mRecyclerView.getParent() != null) {
                    ((ViewGroup) this.mRecyclerView.getParent()).removeView(this.mRecyclerView);
                }
                this.container.removeAllViews();
                this.container.addView(this.mRecyclerView);
                setParentScrollListener(this.mRecyclerView);
            }
            this.mRecyclerView.setVisibility(0);
            this.mRecyclerView.getAdapter().notifyDataSetChanged();
        }
    }

    @Override // com.taobao.weex.ui.component.WXVContainer, com.taobao.weex.ui.component.WXComponent, tb.yae
    public void onActivityDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fef57493", new Object[]{this});
            return;
        }
        super.onActivityDestroy();
        fnn fnnVar = this.mNewRecommendContainer;
        if (fnnVar != null) {
            fnnVar.c();
        }
    }

    @JSMethod
    public void pageBack() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("131f859d", new Object[]{this});
            return;
        }
        hrg.e("recommendWeex", TAG, Constant.KEY_PAGEBACK);
        fnn fnnVar = this.mNewRecommendContainer;
        if (fnnVar != null) {
            fnnVar.s(null);
        }
    }

    @WXComponentProp(name = "bizParams")
    public void setBizParams(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8612e188", new Object[]{this, str});
            return;
        }
        hrg.e("recommendWeex", TAG, "setBizParams : " + str);
        try {
            parseBizParamsAndPerform(str);
        } catch (Throwable unused) {
            ddv.h("weexSetBizParamsError", "1.0", "weexSetBizParamsError", "weexSetBizParamsError", null, null);
            sfh.d(TAG, "parseBizParamsAndPerform error params :" + str);
        }
    }

    @WXComponentProp(name = PAGE_RENDER_START_TIME)
    public void setPageRenderStartTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5556b515", new Object[]{this, new Long(j)});
            return;
        }
        this.mPageRenderStartTime = j;
        this.mIsNotifyEnterPage = notifyEnterPage(this.mNewRecommendContainer, j);
    }

    @Override // com.taobao.weex.ui.component.WXComponent
    public FrameLayout getHostView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FrameLayout) ipChange.ipc$dispatch("6a491daf", new Object[]{this}) : (FrameLayout) super.getHostView();
    }

    @Override // com.taobao.weex.ui.component.WXComponent
    public FrameLayout initComponentHostView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("2b290a72", new Object[]{this, context});
        }
        this.mContext = context;
        this.container = new FrameLayout(context);
        this.container.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        return this.container;
    }

    private boolean notifyEnterPage(fnn fnnVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("54bd3a10", new Object[]{this, fnnVar, new Long(j)})).booleanValue();
        }
        if (fnnVar == null) {
            sfh.d(TAG, "recommendContainer == null");
            return false;
        }
        mhd p = fnnVar.p();
        if (p == null) {
            sfh.d(TAG, "recommendLifeCycleReport == null");
            return false;
        }
        p.s(j);
        return true;
    }
}

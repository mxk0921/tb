package com.taobao.tao.recommend4.manager.weex2;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorCode;
import com.alipay.android.phone.wallet.spmtracker.Constant;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavix.utils.Debuggable;
import com.taobao.android.weex_framework.platform.JSMethod;
import com.taobao.android.weex_framework.platform.WXComponentProp;
import com.taobao.tao.recommend4.manager.weex2.container.nested.WeexNestedScrollRecommendContainer;
import com.taobao.tao.util.DensityUtil;
import com.taobao.uikit.extend.component.unify.Toast.TBToast;
import io.unicorn.plugin.platform.WeexPlatformView;
import java.util.HashSet;
import java.util.Map;
import tb.d40;
import tb.f4b;
import tb.fve;
import tb.pb6;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class RecommendWeex2ContainerView extends WeexPlatformView {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ORANGE_KEY_ENABLE_AFTER_BUY_CUSTOM_INFO_FLOW_WIDTH = "enableAfterBuyCustomInfoFlowWidth";
    private static final String PROP_BIZ_PARAMS = "bizParams";
    private static final String PROP_BOTTOM_OFFSET = "bottomOffset";
    private static final String PROP_FLY_CHILD_DURATION = "fly-duration";
    private static final String PROP_INFO_FLOW_WIDTH = "infoflowWidth";
    private static final String PROP_LIST_TARGET_HEIGHT = "targetHeight";
    private static final String PROP_PAGE_RENDER_START_TIME = "pageRenderStartTime";
    private static final String PROP_SCROLL_CONTAINER_TYPE = "scrollContainerType";
    private static final String PROP_SWITCH_SCROLL_CLOSE = "enable-scroll-to-dismiss";
    private static final String SCROLL_CONTAINER_TYPE_DRAWER = "drawer";
    private static final String SCROLL_CONTAINER_TYPE_NESTED = "nested";
    private static final String TAG = "RecommendWeex2ContainerView";
    private d40 mAbstractWeexRecommendContainer;
    private final d40.a mWeexPlatformViewInvoker = new a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements d40.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public void a(String str, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("23b3b231", new Object[]{this, str, obj});
                return;
            }
            fve.e(RecommendWeex2ContainerView.TAG, "fireEvent, method: " + str);
            RecommendWeex2ContainerView.access$000(RecommendWeex2ContainerView.this, str, obj);
        }
    }

    static {
        t2o.a(729810012);
    }

    public RecommendWeex2ContainerView(Context context, int i) {
        super(context, i);
    }

    public static /* synthetic */ void access$000(RecommendWeex2ContainerView recommendWeex2ContainerView, String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8ff12d6", new Object[]{recommendWeex2ContainerView, str, obj});
        } else {
            recommendWeex2ContainerView.fireEvent(str, obj);
        }
    }

    public static /* synthetic */ Object ipc$super(RecommendWeex2ContainerView recommendWeex2ContainerView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -346507292) {
            super.onUpdateAttrs((Map) objArr[0]);
            return null;
        } else if (hashCode == 577536806) {
            super.dispose();
            return null;
        } else if (hashCode == 1981136165) {
            super.onUpdateEvents((HashSet) objArr[0]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/tao/recommend4/manager/weex2/RecommendWeex2ContainerView");
        }
    }

    private void setBizParams(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8612e188", new Object[]{this, str});
            return;
        }
        fve.e(TAG, "setBizParams ： " + str);
        if (!TextUtils.isEmpty(str) || !Debuggable.isDebug()) {
            d40 d40Var = this.mAbstractWeexRecommendContainer;
            if (d40Var != null) {
                d40Var.i(str);
                return;
            }
            return;
        }
        TBToast.makeText(getContext(), "bizParams为空").show();
    }

    private void setFlyDuration(String str) {
        d40 d40Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4cfcc636", new Object[]{this, str});
            return;
        }
        fve.e(TAG, "setFlyDuration ： " + str);
        if (!TextUtils.isEmpty(str) && (d40Var = this.mAbstractWeexRecommendContainer) != null) {
            d40Var.k(Integer.parseInt(str));
        }
    }

    private void setPageRenderStartTime(String str) {
        d40 d40Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b1b3799", new Object[]{this, str});
            return;
        }
        fve.e(TAG, "setPageRenderStartTime ： " + str);
        if (!TextUtils.isEmpty(str) && (d40Var = this.mAbstractWeexRecommendContainer) != null) {
            d40Var.m(Long.parseLong(str));
        }
    }

    private void setScrollContainerType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d355db5d", new Object[]{this, str});
            return;
        }
        fve.e(TAG, "setScrollContainerType ： " + str);
        if (SCROLL_CONTAINER_TYPE_NESTED.equals(str)) {
            WeexNestedScrollRecommendContainer weexNestedScrollRecommendContainer = new WeexNestedScrollRecommendContainer(getContext(), this.mWeexPlatformViewInvoker);
            setWeexPlatformListDelegate(weexNestedScrollRecommendContainer.w());
            weexNestedScrollRecommendContainer.D(getNestedScrollManager());
            this.mAbstractWeexRecommendContainer = weexNestedScrollRecommendContainer;
            return;
        }
        fve.e(TAG, "传入了无法识别的滚动容器类型：" + str);
    }

    private void setSwitchScrollClose(String str) {
        d40 d40Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("892287e6", new Object[]{this, str});
            return;
        }
        fve.e(TAG, "setSwitchScrollClose ： " + str);
        if (!TextUtils.isEmpty(str) && (d40Var = this.mAbstractWeexRecommendContainer) != null) {
            d40Var.n(Boolean.parseBoolean(str));
        }
    }

    private void setTargetHeight(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("337d76ab", new Object[]{this, str});
            return;
        }
        fve.e(TAG, "setTargetHeight ： " + str);
        d40 d40Var = this.mAbstractWeexRecommendContainer;
        if (d40Var != null) {
            d40Var.o(str);
        }
    }

    @Override // io.unicorn.plugin.platform.WeexPlatformView, tb.l5m
    public void dispose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("226c8326", new Object[]{this});
            return;
        }
        super.dispose();
        fve.e(TAG, ErrorCode.DEFAULT_WINDOW_FRAME_DISPOSE_EX);
        d40 d40Var = this.mAbstractWeexRecommendContainer;
        if (d40Var != null) {
            d40Var.a();
        }
    }

    @Override // io.unicorn.plugin.platform.WeexPlatformView, tb.l5m
    public View getView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        d40 d40Var = this.mAbstractWeexRecommendContainer;
        if (d40Var != null) {
            return d40Var.d();
        }
        return new View(getContext());
    }

    @Override // io.unicorn.plugin.platform.WeexPlatformView, tb.l5m
    public void onUpdateAttrs(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb58b7e4", new Object[]{this, map});
            return;
        }
        super.onUpdateAttrs(map);
        fve.e(TAG, "onUpdateAttrs ： " + map);
        setScrollContainerType(map.get(PROP_SCROLL_CONTAINER_TYPE));
        setBottomOffset(map.get(PROP_BOTTOM_OFFSET));
        setBizParams(map.get("bizParams"));
        setTargetHeight(map.get(PROP_LIST_TARGET_HEIGHT));
        setFlyDuration(map.get(PROP_FLY_CHILD_DURATION));
        setSwitchScrollClose(map.get(PROP_SWITCH_SCROLL_CLOSE));
        setPageRenderStartTime(map.get(PROP_PAGE_RENDER_START_TIME));
        setInfoFlowWidth(map.get(PROP_INFO_FLOW_WIDTH));
        d40 d40Var = this.mAbstractWeexRecommendContainer;
        if (d40Var != null) {
            d40Var.e(map);
        }
    }

    @Override // io.unicorn.plugin.platform.WeexPlatformView
    public void onUpdateEvents(HashSet<String> hashSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7615bd25", new Object[]{this, hashSet});
            return;
        }
        super.onUpdateEvents(hashSet);
        fve.e(TAG, "onUpdateEvents");
        d40 d40Var = this.mAbstractWeexRecommendContainer;
        if (d40Var != null) {
            d40Var.f(hashSet);
        }
    }

    @JSMethod
    public void pageBack() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("131f859d", new Object[]{this});
            return;
        }
        fve.e(TAG, Constant.KEY_PAGEBACK);
        d40 d40Var = this.mAbstractWeexRecommendContainer;
        if (d40Var != null) {
            d40Var.g();
        }
    }

    @JSMethod
    public void parentScrolled() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92dbb07d", new Object[]{this});
            return;
        }
        d40 d40Var = this.mAbstractWeexRecommendContainer;
        if (d40Var != null) {
            d40Var.h();
        }
    }

    public void setBottomOffset(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d68b4eb1", new Object[]{this, str});
            return;
        }
        fve.e(TAG, "setBottomOffset : " + str);
        if (this.mAbstractWeexRecommendContainer != null && !TextUtils.isEmpty(str)) {
            try {
                this.mAbstractWeexRecommendContainer.j(Integer.parseInt(str));
            } catch (NumberFormatException e) {
                fve.c(TAG, "setBottomOffset error. " + e.getMessage(), e);
                if (Debuggable.isDebug()) {
                    throw e;
                }
            }
        }
    }

    @WXComponentProp(name = "window_move_dy")
    public void updateWindowMoveY(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4d1e560", new Object[]{this, str});
            return;
        }
        fve.e(TAG, "windowMoveY:" + str);
        if (this.mAbstractWeexRecommendContainer != null) {
            try {
                this.mAbstractWeexRecommendContainer.p(DensityUtil.dip2px(getContext(), Float.parseFloat(str)));
            } catch (Exception e) {
                fve.c(TAG, "updateWindowMoveY error. " + e.getMessage(), e);
            }
        }
    }

    private void setInfoFlowWidth(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4dfa779", new Object[]{this, str});
            return;
        }
        fve.e(TAG, "setInfoFlowWidth ： " + str);
        if (!TextUtils.isEmpty(str) && f4b.b(ORANGE_KEY_ENABLE_AFTER_BUY_CUSTOM_INFO_FLOW_WIDTH, true)) {
            try {
                int dip2px = DensityUtil.dip2px(getContext(), (int) Double.parseDouble(str));
                if (dip2px <= 0 || dip2px > pb6.s(getContext())) {
                    fve.e(TAG, "info flow width invalid");
                    return;
                }
                d40 d40Var = this.mAbstractWeexRecommendContainer;
                if (d40Var != null) {
                    d40Var.l(dip2px);
                }
            } catch (Exception e) {
                fve.c(TAG, "setInfoFlowWidth error. " + e.getMessage(), e);
            }
        }
    }
}

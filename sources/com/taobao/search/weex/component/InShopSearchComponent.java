package com.taobao.search.weex.component;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.Space;
import com.alibaba.android.enhance.nested.nested.WXCoordinatorLayout;
import com.alibaba.android.enhance.nested.nested.WXNestedHeader;
import com.alibaba.android.enhance.nested.nested.WXNestedParent;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.ir.runtime.a;
import com.taobao.search.sf.util.tlog.TLogTracker;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.annotation.JSMethod;
import com.taobao.weex.ui.action.BasicComponentData;
import com.taobao.weex.ui.component.WXComponent;
import com.taobao.weex.ui.component.WXComponentProp;
import com.taobao.weex.ui.component.WXVContainer;
import com.taobao.weex.ui.view.refresh.core.WXSwipeLayout;
import java.util.HashMap;
import java.util.Map;
import tb.b4p;
import tb.o4p;
import tb.olo;
import tb.r4p;
import tb.t2o;
import tb.xnp;
import tb.zpd;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class InShopSearchComponent extends WXVContainer<ViewGroup> implements WXNestedHeader.g, WXSwipeLayout.OnRefreshOffsetChangedListener, xnp {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "InShopSearchComponent";
    private boolean isActive;
    private WXSwipeLayout.OnRefreshOffsetChangedListener mOverScrollListener;
    private Map<String, String> mParams;
    private zpd mShopAuctionModule;
    private String mViewState;
    private Space secondFloorHelperView = null;

    static {
        t2o.a(815793813);
        t2o.a(159383575);
        t2o.a(985661786);
        t2o.a(815792533);
    }

    public InShopSearchComponent(WXSDKInstance wXSDKInstance, WXVContainer wXVContainer, BasicComponentData basicComponentData) {
        super(wXSDKInstance, wXVContainer, basicComponentData);
        TLogTracker.t(o4p.i2());
        TLogTracker.s("InShopMain");
        if (!o4p.Z0()) {
            a.a("com.taobao.search", null);
        }
        olo oloVar = new olo(false);
        this.mShopAuctionModule = oloVar;
        oloVar.K(this);
        this.mShopAuctionModule.m(true);
    }

    private WXNestedParent findParent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WXNestedParent) ipChange.ipc$dispatch("ae51c7f7", new Object[]{this});
        }
        Object hostView = getHostView();
        while (true) {
            WXCoordinatorLayout wXCoordinatorLayout = (ViewGroup) hostView;
            if (wXCoordinatorLayout != null) {
                if (!(wXCoordinatorLayout instanceof WXCoordinatorLayout)) {
                    hostView = wXCoordinatorLayout.getParent();
                    if (!(hostView instanceof ViewGroup)) {
                        break;
                    }
                } else {
                    return wXCoordinatorLayout.getComponent();
                }
            } else {
                break;
            }
        }
        return null;
    }

    public static /* synthetic */ Object ipc$super(InShopSearchComponent inShopSearchComponent, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1983604863:
                super.destroy();
                return null;
            case -713828414:
                super.updateProperties((Map) objArr[0]);
                return null;
            case -39247480:
                return new Boolean(super.setProperty((String) objArr[0], objArr[1]));
            case 474982114:
                super.onActivityResume();
                return null;
            case 1692842255:
                super.onActivityPause();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/weex/component/InShopSearchComponent");
        }
    }

    private Map<String, String> parseSearchParams(String str) {
        JSONObject parseObject;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("7736e627", new Object[]{this, str});
        }
        HashMap hashMap = new HashMap();
        if (TextUtils.isEmpty(str)) {
            return hashMap;
        }
        try {
            parseObject = JSON.parseObject(str);
        } catch (Exception unused) {
        }
        if (parseObject == null) {
            return hashMap;
        }
        for (Map.Entry<String, Object> entry : parseObject.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value != null) {
                str2 = value.toString();
            } else {
                str2 = "";
            }
            hashMap.put(key, str2);
            b4p.a(TAG, "parseSearchParams: " + key + " - " + str2);
        }
        return hashMap;
    }

    private void registerPullDownEvent() {
        WXNestedHeader wXNestedHeader;
        WXNestedParent wXNestedParent;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72fb90f7", new Object[]{this});
        } else if (!o4p.X0()) {
            WXCoordinatorLayout wXCoordinatorLayout = (ViewParent) getHostView();
            while (true) {
                wXNestedHeader = null;
                if (wXCoordinatorLayout == null) {
                    wXNestedParent = null;
                    break;
                }
                wXCoordinatorLayout = wXCoordinatorLayout.getParent();
                if (wXCoordinatorLayout instanceof WXCoordinatorLayout) {
                    wXNestedParent = wXCoordinatorLayout.getComponent();
                    break;
                }
            }
            if (wXNestedParent != null) {
                while (true) {
                    if (i >= wXNestedParent.getChildCount()) {
                        break;
                    }
                    WXComponent child = wXNestedParent.getChild(i);
                    if (child instanceof WXNestedHeader) {
                        wXNestedHeader = (WXNestedHeader) child;
                        break;
                    }
                    i++;
                }
                if (wXNestedHeader != null) {
                    wXNestedHeader.registerOnPullDownEventDirectly(this);
                }
            }
        }
    }

    public void addOnRefreshOffsetChangedListener(WXSwipeLayout.OnRefreshOffsetChangedListener onRefreshOffsetChangedListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dcb4314", new Object[]{this, onRefreshOffsetChangedListener});
        } else {
            this.mOverScrollListener = onRefreshOffsetChangedListener;
        }
    }

    @Override // com.taobao.weex.ui.component.WXVContainer, com.taobao.weex.ui.component.WXComponent
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        super.destroy();
        b4p.a(TAG, "onDestroy");
        zpd zpdVar = this.mShopAuctionModule;
        if (zpdVar != null) {
            zpdVar.onDestroy();
        }
    }

    @JSMethod
    public void enableOverScroll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30eeed2b", new Object[]{this});
        } else {
            registerPullDownEvent();
        }
    }

    @WXComponentProp(name = "enableOverScroll")
    public void enableSecondFloor(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37e85f46", new Object[]{this, str});
        } else if (TextUtils.equals(str, "true")) {
            registerPullDownEvent();
        }
    }

    @Override // com.taobao.weex.ui.component.WXVContainer, com.taobao.weex.ui.component.WXComponent, tb.yae
    public void onActivityPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64e6b90f", new Object[]{this});
            return;
        }
        b4p.a(TAG, "onActivityPause");
        super.onActivityPause();
        zpd zpdVar = this.mShopAuctionModule;
        if (zpdVar != null) {
            zpdVar.onPause();
        }
    }

    @Override // com.taobao.weex.ui.component.WXVContainer, com.taobao.weex.ui.component.WXComponent, tb.yae
    public void onActivityResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c4fa6e2", new Object[]{this});
            return;
        }
        b4p.a(TAG, "onActivityResume");
        TLogTracker.s("InShopMain");
        super.onActivityResume();
        zpd zpdVar = this.mShopAuctionModule;
        if (zpdVar != null) {
            zpdVar.onResume();
        }
    }

    @Override // com.taobao.weex.ui.view.refresh.core.WXSwipeLayout.OnRefreshOffsetChangedListener
    public void onOffsetChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25f4d19a", new Object[]{this, new Integer(i)});
            return;
        }
        WXSwipeLayout.OnRefreshOffsetChangedListener onRefreshOffsetChangedListener = this.mOverScrollListener;
        if (onRefreshOffsetChangedListener != null) {
            onRefreshOffsetChangedListener.onOffsetChanged(i);
        }
    }

    @Override // tb.xnp
    public void onPagePropertiesUpdate(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a30d12d4", new Object[]{this, map});
        } else {
            fireEvent("searchcomplete", new HashMap(map));
        }
    }

    @Override // tb.xnp
    public void onSearchRenderEnd() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59913c45", new Object[]{this});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("renderEndTime", String.valueOf(System.currentTimeMillis()));
        fireEvent("searchrenderend", hashMap);
    }

    @WXComponentProp(name = "active")
    public void setActive(boolean z) {
        WXNestedParent findParent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ebc6e25", new Object[]{this, new Boolean(z)});
            return;
        }
        this.isActive = z;
        if (z && (findParent = findParent()) != null) {
            findParent.holdActiveChild(this);
        }
    }

    @WXComponentProp(name = r4p.KEY_MINI_APP)
    public void setIsMiniApp(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c86dcb8f", new Object[]{this, str});
        } else {
            this.mShopAuctionModule.c(str);
        }
    }

    @WXComponentProp(name = "isNewStyle")
    public void setIsNewStyle(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56f3340e", new Object[]{this, str});
            return;
        }
        zpd zpdVar = this.mShopAuctionModule;
        if (zpdVar != null) {
            zpdVar.i("true".equals(str));
        }
    }

    @WXComponentProp(name = r4p.KEY_MINI_APP_CATEGORY_URL)
    public void setMiniAppCategoryUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eddecba", new Object[]{this, str});
        } else {
            this.mShopAuctionModule.j(str);
        }
    }

    @WXComponentProp(name = r4p.KEY_MINI_APP_DETAIL_URL)
    public void setMiniAppDetailUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93505ac7", new Object[]{this, str});
        } else {
            this.mShopAuctionModule.h(str);
        }
    }

    @Override // com.taobao.weex.ui.component.WXComponent
    public boolean setProperty(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fda92188", new Object[]{this, str, obj})).booleanValue();
        }
        return super.setProperty(str, obj);
    }

    @WXComponentProp(name = "params")
    public void setSearchParams(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("120d3961", new Object[]{this, str});
            return;
        }
        Map<String, String> parseSearchParams = parseSearchParams(str);
        if (!this.mParams.equals(parseSearchParams)) {
            this.mShopAuctionModule.e(parseSearchParams);
            this.mParams = parseSearchParams;
            this.mShopAuctionModule.k();
        }
    }

    @WXComponentProp(name = "state")
    public void setViewState(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b2529bb", new Object[]{this, str});
            return;
        }
        this.mViewState = str;
        if (this.mShopAuctionModule != null) {
            if (TextUtils.equals(str, "appear")) {
                this.mShopAuctionModule.a();
            } else if (TextUtils.equals(str, "disappear")) {
                this.mShopAuctionModule.b();
            }
        }
    }

    @JSMethod
    public void syncAddCartPosition() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("339a1496", new Object[]{this});
        } else if (this.mShopAuctionModule != null && TextUtils.equals(this.mViewState, "appear")) {
            this.mShopAuctionModule.l();
        }
    }

    @Override // com.taobao.weex.ui.component.WXComponent
    public void updateProperties(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d573d7c2", new Object[]{this, map});
        } else {
            super.updateProperties(map);
        }
    }

    @Override // com.taobao.weex.ui.component.WXComponent
    public ViewGroup initComponentHostView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("c190d02e", new Object[]{this, context});
        }
        HashMap hashMap = new HashMap();
        this.mParams = hashMap;
        this.mShopAuctionModule.g((Activity) context, hashMap);
        this.mShopAuctionModule.f();
        return (ViewGroup) this.mShopAuctionModule.getView();
    }

    @WXComponentProp(name = "sortBarStatus")
    public void setSortBarStatus(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c78d5d76", new Object[]{this, str});
        } else if (TextUtils.equals(str, "transparent")) {
            this.mShopAuctionModule.n(2);
        } else {
            this.mShopAuctionModule.n(1);
        }
    }
}

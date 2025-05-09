package com.taobao.android.live.plugin.atype.flexalocal.good.ultronnew.bean;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.DXWidgetRefreshOption;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import tb.hha;
import tb.kfg;
import tb.l5k;
import tb.peg;
import tb.q0o;
import tb.t2o;
import tb.teg;
import tb.wda;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class LVView extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "LVView";
    private Map<peg, View> mCachedViews = new HashMap();
    private boolean mEnableRenderPipeline;
    private final teg mPageInfo;
    private kfg mRenderNode;
    private Map<String, Object> mRenderOptions;
    private final q0o mRenderPipeline;
    private final l5k mViewManager;

    static {
        t2o.a(295699218);
    }

    public LVView(Context context, l5k l5kVar, teg tegVar, Map<String, Object> map) {
        super(context);
        this.mViewManager = l5kVar;
        this.mRenderOptions = map;
        this.mPageInfo = tegVar;
        this.mRenderPipeline = new q0o(l5kVar);
    }

    private void cacheViews(kfg kfgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a40b08a1", new Object[]{this, kfgVar});
        } else if (kfgVar != null && kfgVar.d() != null) {
            if (kfgVar.c().e() && kfgVar.d() != null) {
                ViewParent parent = kfgVar.d().getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(kfgVar.d());
                }
                kfgVar.d().setTag(R.id.taolive_gl_lv_view_tag, null);
                this.mCachedViews.put(kfgVar.c(), kfgVar.d());
                if (kfgVar.d() instanceof DXRootView) {
                    this.mViewManager.f((DXRootView) kfgVar.d());
                }
            }
            if (kfgVar.b() != null) {
                for (kfg kfgVar2 : kfgVar.b()) {
                    if (!(kfgVar2 == null || kfgVar2.d() == null)) {
                        cacheViews(kfgVar2);
                    }
                }
            }
        }
    }

    public static /* synthetic */ Object ipc$super(LVView lVView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/good/ultronnew/bean/LVView");
    }

    public boolean checkParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("63bd6239", new Object[]{this})).booleanValue();
        }
        teg tegVar = this.mPageInfo;
        if (tegVar == null || !tegVar.a()) {
            return false;
        }
        return true;
    }

    public void createRootRenderNode(peg pegVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76ff5eea", new Object[]{this, pegVar});
            return;
        }
        kfg kfgVar = new kfg(pegVar, this);
        this.mRenderNode = kfgVar;
        setTag(R.id.taolive_gl_lv_view_tag, kfgVar);
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        resetAndCacheView();
        this.mCachedViews.clear();
        this.mRenderPipeline.c();
    }

    public String getPageCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("eec3fba7", new Object[]{this});
        }
        teg tegVar = this.mPageInfo;
        if (tegVar != null) {
            return tegVar.e();
        }
        hha.b(TAG, "getPageCode | mPageInfo is null.");
        return "";
    }

    public teg getPageInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (teg) ipChange.ipc$dispatch("c285744e", new Object[]{this});
        }
        return this.mPageInfo;
    }

    public kfg getRenderNode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (kfg) ipChange.ipc$dispatch("3f81e4f9", new Object[]{this}) : this.mRenderNode;
    }

    public Map<String, Object> getRenderOptions() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("1704ea6e", new Object[]{this});
        }
        return this.mRenderOptions;
    }

    public q0o getRenderPipeline() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (q0o) ipChange.ipc$dispatch("35bc4888", new Object[]{this});
        }
        return this.mRenderPipeline;
    }

    public boolean isEnableRenderPipeline() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("db7e6d10", new Object[]{this})).booleanValue();
        }
        if (!this.mEnableRenderPipeline || !wda.h()) {
            return false;
        }
        return true;
    }

    public DXWidgetNode queryDXWidgetNodeInternal(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("bb70fa2f", new Object[]{this, str}) : queryDXWidgetNodeInternal(this, str);
    }

    public void refreshDXWidgetNode(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a055c033", new Object[]{this, dXWidgetNode});
        } else if (dXWidgetNode != null && dXWidgetNode.getDXRuntimeContext() != null) {
            DXWidgetRefreshOption a2 = new DXWidgetRefreshOption.a().d(true).a();
            DXRootView L = dXWidgetNode.getDXRuntimeContext().L();
            this.mViewManager.d().I0(dXWidgetNode, 0, a2);
            this.mViewManager.d().t0(L);
        }
    }

    public void resetAndCacheView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8cebe526", new Object[]{this});
            return;
        }
        cacheViews(this.mRenderNode);
        this.mRenderNode = null;
        removeAllViews();
    }

    public kfg resetLayer(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kfg) ipChange.ipc$dispatch("81574997", new Object[]{this, str});
        }
        kfg renderNode = getRenderNode(str);
        if (renderNode == null) {
            return null;
        }
        cacheViews(renderNode);
        View d = renderNode.d();
        if (d instanceof ViewGroup) {
            ((ViewGroup) d).removeAllViews();
        }
        return renderNode;
    }

    public void setRenderPipeline(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6022b813", new Object[]{this, new Boolean(z)});
        } else {
            this.mEnableRenderPipeline = z;
        }
    }

    public View useCacheView(peg pegVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("80598e56", new Object[]{this, pegVar});
        }
        if (pegVar != null && this.mCachedViews.containsKey(pegVar)) {
            return this.mCachedViews.remove(pegVar);
        }
        return null;
    }

    private DXWidgetNode queryDXWidgetNodeInternal(ViewGroup viewGroup, String str) {
        DXWidgetNode queryDXWidgetNodeInternal;
        DXWidgetNode queryWidgetNodeByUserId;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("e9fc28ae", new Object[]{this, viewGroup, str});
        }
        if (viewGroup != null && viewGroup.getChildCount() > 0 && !TextUtils.isEmpty(str)) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt instanceof DXRootView) {
                    DXWidgetNode expandWidgetNode = ((DXRootView) childAt).getExpandWidgetNode();
                    if (!(expandWidgetNode == null || (queryWidgetNodeByUserId = expandWidgetNode.queryWidgetNodeByUserId(str)) == null)) {
                        return queryWidgetNodeByUserId;
                    }
                } else if ((childAt instanceof ViewGroup) && (queryDXWidgetNodeInternal = queryDXWidgetNodeInternal((ViewGroup) childAt, str)) != null) {
                    return queryDXWidgetNodeInternal;
                }
            }
        }
        return null;
    }

    public kfg getRenderNode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kfg) ipChange.ipc$dispatch("5537ad03", new Object[]{this, str});
        }
        Stack stack = new Stack();
        if (getRenderNode() != null) {
            stack.push(getRenderNode());
        }
        while (!stack.isEmpty()) {
            kfg kfgVar = (kfg) stack.pop();
            if (kfgVar != null) {
                if (kfgVar.c() != null && TextUtils.equals(kfgVar.c().c, str)) {
                    return kfgVar;
                }
                for (kfg kfgVar2 : kfgVar.b()) {
                    stack.push(kfgVar2);
                }
            }
        }
        return null;
    }
}

package com.taobao.tao.topmultitab.service.bgcontainer;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.view.HImageView;
import com.taobao.tao.topmultitab.protocol.IHomeSubTabController;
import com.taobao.tao.topmultitab.service.controller.IHomeControllerService;
import com.taobao.tao.topmultitab.service.pulldown.IPullDownService;
import java.util.Map;
import tb.bqa;
import tb.c4b;
import tb.t2o;
import tb.uqa;
import tb.wcc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class BGContainerView extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BIZ_NAME = "homepage";
    private static final String TAG = "home.BGContainerView";
    public View bgView;
    public HImageView bottomMaskView;
    private float currentHeaderAlpha;
    private View globalThemeViewNew;
    private int lastHeaderScrollDistance;
    private wcc mContext;
    public HImageView maskView;
    public HImageView topMaskView;
    public int[] viewHeights;

    static {
        t2o.a(729810159);
    }

    public BGContainerView(Context context) {
        this(context, null);
    }

    private void innerScrollTo(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e30f5f45", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        bqa.h(TAG, "scroll To, setTranslationY=" + i2);
        View view = this.bgView;
        if (view != null) {
            view.setTranslationY(i2);
        }
        HImageView hImageView = this.maskView;
        if (hImageView != null) {
            hImageView.setTranslationY(i2);
        }
        HImageView hImageView2 = this.topMaskView;
        if (hImageView2 != null) {
            hImageView2.setTranslationY(i2);
        }
        HImageView hImageView3 = this.bottomMaskView;
        if (hImageView3 != null) {
            hImageView3.setTranslationY(i2);
        }
    }

    public static /* synthetic */ Object ipc$super(BGContainerView bGContainerView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/topmultitab/service/bgcontainer/BGContainerView");
    }

    private boolean isNeedClearSearchBar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e2d24c09", new Object[]{this})).booleanValue();
        }
        return false;
    }

    private void notifyOnGlobalThemeChanged(boolean z) {
        Map<String, IHomeSubTabController> controllers;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0fae3d7", new Object[]{this, new Boolean(z)});
            return;
        }
        IHomeControllerService iHomeControllerService = (IHomeControllerService) c4b.i().h(IHomeControllerService.class);
        if (!(iHomeControllerService == null || (controllers = iHomeControllerService.getControllers()) == null || controllers.isEmpty())) {
            for (Map.Entry<String, IHomeSubTabController> entry : controllers.entrySet()) {
                String key = entry.getKey();
                IHomeSubTabController value = entry.getValue();
                if (value != null) {
                    uqa.b("TopTabBar", "onCustomGlobalThemeChanged", "controller name = " + key);
                    value.onCustomGlobalThemeChanged("homepage", null, z);
                }
            }
        }
    }

    private void processBgView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32d230f2", new Object[]{this, view});
            return;
        }
        removeMyself(this.globalThemeViewNew);
        if (view != null) {
            removeMyself(view);
            addView(view);
        }
    }

    private void removeMyself(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72a738cf", new Object[]{this, view});
        } else if (view != null && view.getParent() != null) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
    }

    private void setRefreshHeaderAlpha(float f) {
        IPullDownService iPullDownService;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c3eae21", new Object[]{this, new Float(f)});
            return;
        }
        wcc wccVar = this.mContext;
        if (wccVar != null && (iPullDownService = (IPullDownService) wccVar.a(IPullDownService.class)) != null) {
            iPullDownService.setRefreshHeaderAlpha(f);
            bqa.h(TAG, "setRefreshHeaderAlpha, setAhpha=" + f);
        }
    }

    public int getCurrentBgViewId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8428fa22", new Object[]{this})).intValue();
        }
        View view = this.globalThemeViewNew;
        if (view == null) {
            return -1;
        }
        return view.hashCode();
    }

    public int getLastHeaderScrollDistance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("67292df5", new Object[]{this})).intValue();
        }
        return this.lastHeaderScrollDistance;
    }

    @Override // android.view.View
    public void scrollTo(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1f8134f", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        innerScrollTo(i, i2);
        updateHeaderView();
    }

    public void scrollToPosition(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("161fb68b", new Object[]{this, new Integer(i)});
        } else if (i >= 0) {
            scrollToPositionWithOffset(i, 0);
        }
    }

    public void setBGContainerVisibility(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fc50410", new Object[]{this, new Integer(i)});
        } else if (getVisibility() == i) {
            bqa.d(TAG, "当前的visibility没有变化，是" + i);
        } else {
            setVisibility(i);
        }
    }

    public void setBgView(View view) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae059bdf", new Object[]{this, view});
            return;
        }
        processBgView(view);
        if (view != null) {
            z = true;
        }
        notifyOnGlobalThemeChanged(true ^ z);
        this.globalThemeViewNew = view;
        updateHeaderView();
    }

    public void setHomePageContext(wcc wccVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5b026d7", new Object[]{this, wccVar});
        } else {
            this.mContext = wccVar;
        }
    }

    public void updateBgView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3161acd8", new Object[]{this, view});
            return;
        }
        processBgView(view);
        this.globalThemeViewNew = view;
        updateHeaderView();
    }

    public void updateHeaderView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40bebf82", new Object[]{this});
        } else {
            updateHeaderView(this.currentHeaderAlpha, false);
        }
    }

    public void updatePullStatus(int i, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6def424", new Object[]{this, new Integer(i), new Float(f)});
            return;
        }
        this.lastHeaderScrollDistance = i;
        innerScrollTo(0, i);
        updateHeaderView(f, true);
    }

    public BGContainerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void updateHeaderView(float f, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1a2a16", new Object[]{this, new Float(f), new Boolean(z)});
            return;
        }
        boolean isNeedClearSearchBar = isNeedClearSearchBar();
        if (isNeedClearSearchBar && f <= 0.0f) {
            z = false;
        }
        if (z || isNeedClearSearchBar) {
            this.currentHeaderAlpha = f;
            setRefreshHeaderAlpha(f);
        }
    }

    public BGContainerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.currentHeaderAlpha = 0.0f;
        this.lastHeaderScrollDistance = 0;
    }

    private void scrollToPositionWithOffset(int i, int i2) {
        int[] iArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f5c5ef1", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        bqa.a(TAG, "scrollToPositionWithOffset() called with: pos = [" + i + "], offset = [" + i2 + "]");
        if (!(this.bgView == null || (iArr = this.viewHeights) == null || iArr.length == 0)) {
            if (i >= iArr.length) {
                i = iArr.length - 1;
            }
            for (int i3 = 0; i3 < i; i3++) {
                i2 += this.viewHeights[i3];
            }
            if (this.viewHeights[0] == 0 && i > 0 && i2 < this.bgView.getHeight()) {
                i2 = this.bgView.getHeight();
            }
            scrollTo(0, -i2);
            if (i == 0) {
                updateHeaderView(0.0f, false);
            }
        }
    }
}

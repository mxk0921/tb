package com.taobao.search.musie.component.filter;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.graphics.Color;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.datasource.impl.BaseTypedBean;
import com.taobao.android.searchbaseframe.nx3.bean.MuiseBean;
import com.taobao.android.searchbaseframe.nx3.bean.TemplateBean;
import com.taobao.android.searchbaseframe.nx3.bean.WeexBean;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.a;
import com.taobao.android.weex_framework.ui.MUSMethod;
import com.taobao.android.weex_framework.ui.MUSNodeProp;
import com.taobao.android.weex_uikit.widget.div.Div;
import com.taobao.android.xsearchplugin.muise.BaseMuiseCellViewHolder;
import com.taobao.android.xsearchplugin.muise.SFMuiseSDK;
import com.taobao.schedule.ViewProxy;
import com.taobao.search.musie.NSMuiseViewHolder;
import java.util.ArrayList;
import java.util.List;
import tb.ay4;
import tb.b4p;
import tb.b7x;
import tb.bi9;
import tb.cnx;
import tb.f4w;
import tb.fw;
import tb.fxh;
import tb.gu1;
import tb.m8j;
import tb.phw;
import tb.ree;
import tb.t2o;
import tb.x02;
import tb.z6c;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class TbFilter extends Div implements a.AbstractC0518a, View.OnTouchListener, ViewTreeObserver.OnScrollChangedListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ATTR_HALF_STICKY_OFFSET = "halfStickyOffset";
    private static final String ATTR_MAX_WEEX_HEIGHT = "maxWeexHeight";
    public static final int DURATION = 200;
    private static final String EVENT_STATE_CHANGE = "statechange";
    public static final String FILTER_TAG = "tbFilter";
    private static final String KEY_FLAG = "flag";
    private static final String KEY_VISIBLE = "visible";
    private static final String TAG = "TbFilter";
    private FrameLayout container;
    private z6c holder;
    private View interceptView;
    private ObjectAnimator maskAnimation;
    private View maskView;
    private View topView;
    private boolean hasHolderToShow = false;
    public final List<ViewTreeObserver.OnScrollChangedListener> scrollObservers = new ArrayList();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                TbFilter.access$000(TbFilter.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements View.OnTouchListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
            }
            if (motionEvent.getAction() == 0 && TbFilter.access$100(TbFilter.this) != null) {
                view.getParent().requestDisallowInterceptTouchEvent(true);
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/musie/component/filter/TbFilter$3");
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
            } else {
                TbFilter.access$200(TbFilter.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                TbFilter.access$300(TbFilter.this);
            }
        }
    }

    static {
        t2o.a(815792696);
        t2o.a(982516017);
    }

    public TbFilter(int i) {
        super(i);
    }

    public static /* synthetic */ void access$000(TbFilter tbFilter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("358e1f5b", new Object[]{tbFilter});
        } else {
            tbFilter.updateHalfStickyOffset();
        }
    }

    public static /* synthetic */ z6c access$100(TbFilter tbFilter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (z6c) ipChange.ipc$dispatch("2de209c7", new Object[]{tbFilter});
        }
        return tbFilter.holder;
    }

    public static /* synthetic */ void access$200(TbFilter tbFilter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f684d99", new Object[]{tbFilter});
        } else {
            tbFilter.removeFromDecor();
        }
    }

    public static /* synthetic */ void access$300(TbFilter tbFilter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc5564b8", new Object[]{tbFilter});
        } else {
            tbFilter.traverseScrollObservers();
        }
    }

    private void addInterceptView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed6084ed", new Object[]{this});
            return;
        }
        View view = this.interceptView;
        if (view != null && view.getParent() == null) {
            getContainer((Activity) getInstance().getUIContext()).addView(this.interceptView, new FrameLayout.LayoutParams(-1, -1));
        }
    }

    private void addToDecor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f523fd0", new Object[]{this});
            return;
        }
        FrameLayout frameLayout = this.container;
        if (frameLayout != null && frameLayout.getParent() == null) {
            getContainer((Activity) this.container.getContext()).addView(this.container, new ViewGroup.LayoutParams(-1, -1));
            this.maskView.setAlpha(0.0f);
            adjustLocation();
            this.scrollObservers.add(this);
        }
    }

    private void animateContainer(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88f6fc8d", new Object[]{this, new Boolean(z)});
            return;
        }
        ObjectAnimator objectAnimator = this.maskAnimation;
        if (objectAnimator == null || !objectAnimator.isRunning()) {
            if (z) {
                if (this.container.getParent() == null) {
                    addToDecor();
                    this.maskAnimation = ObjectAnimator.ofFloat(this.maskView, View.ALPHA, 0.0f, 1.0f);
                } else {
                    return;
                }
            } else if (this.container.getParent() != null) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.maskView, View.ALPHA, 1.0f, 0.0f);
                this.maskAnimation = ofFloat;
                ofFloat.addListener(new c());
            } else {
                return;
            }
            this.maskAnimation.setDuration(200L);
            this.maskAnimation.start();
        }
    }

    private ViewGroup getContainer(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("e28cef1", new Object[]{this, activity});
        }
        ViewGroup viewGroup = (ViewGroup) activity.findViewById(16908290);
        if (viewGroup == null) {
            return (ViewGroup) activity.getWindow().getDecorView();
        }
        return viewGroup;
    }

    private x02 getCreatorParam(ree reeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x02) ipChange.ipc$dispatch("844e3c9f", new Object[]{this, reeVar});
        }
        return new x02(reeVar.getActivity(), reeVar.getParent(), reeVar.B());
    }

    private void hideDropFilter(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d2c1cb0", new Object[]{this, new Boolean(z), new Boolean(z2)});
            return;
        }
        removeInterceptView();
        z6c z6cVar = this.holder;
        if (z6cVar != null) {
            if (this.hasHolderToShow) {
                z6cVar.a(false);
                this.hasHolderToShow = false;
                this.holder = null;
                return;
            }
            z6cVar.a(z2);
            onStateChange(this.holder.getFlag(), false);
            this.holder = null;
            if (z) {
                animateContainer(false);
            }
        }
    }

    public static /* synthetic */ Object ipc$super(TbFilter tbFilter, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1300470387) {
            super.postCollectBatchTask((List) objArr[0]);
            return null;
        } else if (hashCode == -285278287) {
            super.onMount((MUSDKInstance) objArr[0], objArr[1]);
            return null;
        } else if (hashCode == -136526582) {
            super.onUnmount((MUSDKInstance) objArr[0], objArr[1]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/search/musie/component/filter/TbFilter");
        }
    }

    private void onStateChange(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("900243e1", new Object[]{this, str, new Boolean(z)});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("visible", (Object) String.valueOf(z));
        jSONObject.put("flag", (Object) str);
        fireEvent(EVENT_STATE_CHANGE, jSONObject);
    }

    private void removeFromDecor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fd518be", new Object[]{this});
            return;
        }
        removeInterceptView();
        FrameLayout frameLayout = this.container;
        if (frameLayout != null && frameLayout.getParent() != null) {
            ((ViewGroup) this.container.getParent()).removeView(this.container);
            this.scrollObservers.remove(this);
        }
    }

    private void removeInterceptView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4cc0676a", new Object[]{this});
            return;
        }
        View view = this.interceptView;
        if (view != null && view.getParent() != null) {
            getContainer((Activity) getInstance().getUIContext()).removeView(this.interceptView);
        }
    }

    private void showNewDropFilter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ff77c91", new Object[]{this});
            return;
        }
        removeInterceptView();
        this.hasHolderToShow = false;
        this.holder.attachToContainer();
        this.holder.c(this.container, getContainer((Activity) getInstance().getUIContext()));
        onStateChange(this.holder.getFlag(), true);
        animateContainer(true);
    }

    private void traverseScrollObservers() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42166dc5", new Object[]{this});
            return;
        }
        for (ViewTreeObserver.OnScrollChangedListener onScrollChangedListener : this.scrollObservers) {
            onScrollChangedListener.onScrollChanged();
        }
    }

    private void updateHalfStickyOffset() {
        Integer num;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edb1531f", new Object[]{this});
            return;
        }
        Object tag = getInstance().getTag(SFMuiseSDK.MUISE_EVENT_LISTENER);
        if ((tag instanceof cnx) && (num = (Integer) getAttribute(ATTR_HALF_STICKY_OFFSET)) != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("offset", (Object) num);
            ((cnx) tag).K("updateHalfStickyOffset", jSONObject, null, null);
        }
    }

    @Override // com.taobao.android.weex_uikit.widget.div.Div, com.taobao.android.weex_uikit.ui.UINode
    public boolean isGenerated() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e95a1590", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public void onScrollChanged() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d815a80f", new Object[]{this});
        } else {
            adjustLocation();
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
        }
        if (motionEvent.getActionMasked() != 0) {
            return false;
        }
        ObjectAnimator objectAnimator = this.maskAnimation;
        if (objectAnimator == null || !objectAnimator.isRunning()) {
            hideDropFilter(true, true);
        }
        return true;
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public void postCollectBatchTask(List<Runnable> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b27c658d", new Object[]{this, list});
            return;
        }
        super.postCollectBatchTask(list);
        if (isMounted()) {
            list.add(new a());
        }
    }

    @MUSNodeProp(name = ATTR_HALF_STICKY_OFFSET, refresh = true)
    public void refreshHalfStickyOffset(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d20a88f2", new Object[]{this, new Integer(i)});
        } else {
            updateHalfStickyOffset();
        }
    }

    @MUSNodeProp(name = ATTR_HALF_STICKY_OFFSET)
    public void setHalfStickyOffset(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34e49c02", new Object[]{this, str});
        } else {
            setAttribute(ATTR_HALF_STICKY_OFFSET, Integer.valueOf((int) fxh.e(str)));
        }
    }

    @MUSNodeProp(name = ATTR_MAX_WEEX_HEIGHT)
    public void setMaxWeexHeight(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("847176db", new Object[]{this, str});
        } else {
            setAttribute(ATTR_MAX_WEEX_HEIGHT, Integer.valueOf((int) fxh.e(str)));
        }
    }

    private void adjustLocation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58eeeeb", new Object[]{this});
        } else if (this.maskView != null) {
            View renderRoot = getInstance().getRenderRoot();
            Rect rect = new Rect();
            renderRoot.getGlobalVisibleRect(rect);
            if (((ree) getInstance().getTag(fw.KEY_WIDGET_CONTEXT)) == null) {
                rect.bottom = rect.top + getInstance().getRootHeight();
            }
            this.maskView.setTranslationY(rect.bottom);
            this.topView.getLayoutParams().height = Math.max(rect.top, 0);
            this.topView.requestLayout();
        }
    }

    @Override // tb.hvu
    public void onUnmount(MUSDKInstance mUSDKInstance, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7dcc50a", new Object[]{this, mUSDKInstance, obj});
            return;
        }
        super.onUnmount(mUSDKInstance, obj);
        mUSDKInstance.removeNativeEventCallback(BaseMuiseCellViewHolder.ACTION_CLOSE_PRE_FILTER, this);
        mUSDKInstance.removeNativeEventCallback(NSMuiseViewHolder.ACTION_LIST_SCROLL, this);
        mUSDKInstance.removeNativeEventCallback(NSMuiseViewHolder.ACTION_START_SCROLL, this);
        mUSDKInstance.removeNativeEventCallback(NSMuiseViewHolder.ACTION_STOP_SCROLL, this);
        mUSDKInstance.removeNativeEventCallback(m8j.EVENT_WIDGET_BIND, this);
        ViewProxy.setOnTouchListener(mUSDKInstance.getRenderRoot(), null);
        mUSDKInstance.setTag(FILTER_TAG, new Object());
        this.container.removeAllViews();
        removeFromDecor();
        z6c z6cVar = this.holder;
        if (z6cVar != null) {
            z6cVar.a(false);
            this.holder = null;
        }
    }

    @Override // tb.hvu
    public void onMount(MUSDKInstance mUSDKInstance, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eefeffb1", new Object[]{this, mUSDKInstance, obj});
            return;
        }
        super.onMount(mUSDKInstance, obj);
        updateHalfStickyOffset();
        this.container = new FrameLayout(mUSDKInstance.getUIContext());
        View view = new View(mUSDKInstance.getUIContext());
        this.maskView = view;
        ViewProxy.setOnTouchListener(view, this);
        this.maskView.setBackgroundColor(Color.argb(76, 0, 0, 0));
        View view2 = new View(mUSDKInstance.getUIContext());
        this.topView = view2;
        ViewProxy.setOnTouchListener(view2, this);
        this.container.addView(this.maskView, new FrameLayout.LayoutParams(-1, -1));
        this.container.addView(this.topView, new ViewGroup.LayoutParams(-1, 0));
        View view3 = new View(mUSDKInstance.getUIContext());
        this.interceptView = view3;
        view3.setClickable(true);
        mUSDKInstance.registerNativeEventCallback(BaseMuiseCellViewHolder.ACTION_CLOSE_PRE_FILTER, this);
        mUSDKInstance.registerNativeEventCallback(NSMuiseViewHolder.ACTION_LIST_SCROLL, this);
        mUSDKInstance.registerNativeEventCallback(NSMuiseViewHolder.ACTION_START_SCROLL, this);
        mUSDKInstance.registerNativeEventCallback(NSMuiseViewHolder.ACTION_STOP_SCROLL, this);
        mUSDKInstance.registerNativeEventCallback(m8j.EVENT_WIDGET_BIND, this);
        mUSDKInstance.setTag(FILTER_TAG, FILTER_TAG);
        ViewProxy.setOnTouchListener(mUSDKInstance.getRenderRoot(), new b());
    }

    @MUSMethod(uiThread = true)
    public void toggleDropFilter(String str, JSONObject jSONObject, String str2, String str3, boolean z) {
        ay4 ay4Var;
        Integer num;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9f1845c", new Object[]{this, str, jSONObject, str2, str3, new Boolean(z)});
        } else if (jSONObject == null) {
            b4p.c(TAG, f4w.LOAD_DATA_NULL);
        } else if (TextUtils.isEmpty(str)) {
            b4p.c(TAG, "tItemType is null");
        } else {
            ObjectAnimator objectAnimator = this.maskAnimation;
            if (objectAnimator == null || !objectAnimator.isRunning()) {
                z6c z6cVar = this.holder;
                if (z6cVar == null || !TextUtils.equals(z6cVar.getFlag(), str2)) {
                    ree reeVar = (ree) getInstance().getTag(fw.KEY_WIDGET_CONTEXT);
                    if (reeVar == null) {
                        b4p.c(TAG, "当前不在列表环境下，不支持显示下拉框");
                        return;
                    }
                    TemplateBean template = reeVar.B().e().getTemplate(str);
                    if (template == null) {
                        b4p.c(TAG, "tItemType 对应的模板为空");
                        return;
                    }
                    JSONObject jSONObject2 = jSONObject.getJSONObject("model");
                    if (jSONObject2 == null) {
                        jSONObject2 = new JSONObject();
                    }
                    jSONObject2.put("tItemType", (Object) str);
                    BaseTypedBean d2 = reeVar.getCore().n().d(jSONObject2, (BaseSearchResult) reeVar.B().e().getTotalSearchResult(), null);
                    if (d2 == null) {
                        b4p.c(TAG, "info parse 失败");
                        return;
                    }
                    if (d2 instanceof MuiseBean) {
                        ((MuiseBean) d2).status = jSONObject.getJSONObject("status");
                        ay4Var = reeVar.getCore().j().c.f28608a;
                    } else if (d2 instanceof WeexBean) {
                        ((WeexBean) d2).status = jSONObject.getJSONObject("status");
                        ay4Var = reeVar.getCore().j().b.f28609a;
                    } else {
                        ay4Var = null;
                    }
                    if (ay4Var != null) {
                        phw phwVar = (phw) ay4Var.a(new gu1(getCreatorParam(reeVar), template));
                        if ((phwVar instanceof b7x) && (num = (Integer) getAttribute(ATTR_MAX_WEEX_HEIGHT)) != null) {
                            ((b7x) phwVar).B2(num.intValue());
                        }
                        phwVar.bindWithData(d2);
                        Object tag = getInstance().getTag(SFMuiseSDK.MUISE_EVENT_LISTENER);
                        if (tag != null) {
                            if (phwVar instanceof m8j) {
                                ((m8j) phwVar).N2((cnx) tag);
                            } else if (phwVar instanceof b7x) {
                                ((b7x) phwVar).A2((cnx) tag);
                            }
                        }
                        hideDropFilter(false, true);
                        this.holder = new bi9(this, phwVar, (int) fxh.e(str3), str2);
                        cnx cnxVar = (cnx) getInstance().getTag(SFMuiseSDK.MUISE_EVENT_LISTENER);
                        if (cnxVar != null) {
                            cnxVar.K("showDropFilter", null, null, null);
                        }
                        if (z) {
                            addInterceptView();
                            this.hasHolderToShow = true;
                            if (cnxVar != null) {
                                JSONObject jSONObject3 = new JSONObject();
                                jSONObject3.put("anim", (Object) Boolean.TRUE);
                                jSONObject3.put("offset", (Object) 0);
                                cnxVar.K("scrollCellToTop", jSONObject3, null, null);
                                return;
                            }
                            return;
                        }
                        showNewDropFilter();
                        return;
                    }
                    return;
                }
                hideDropFilter(true, true);
                return;
            }
            b4p.c(TAG, "正在处于开或关的状态中，本次点击跳过");
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0043, code lost:
        if (r7.equals(tb.m8j.EVENT_WIDGET_BIND) == false) goto L_0x0023;
     */
    @Override // com.taobao.android.weex_framework.a.AbstractC0518a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onNativeEvent(java.lang.String r7, java.lang.String r8) {
        /*
            r6 = this;
            r0 = 2
            r1 = 3
            r2 = 1
            r3 = 0
            com.android.alibaba.ip.runtime.IpChange r4 = com.taobao.search.musie.component.filter.TbFilter.$ipChange
            boolean r5 = r4 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r5 == 0) goto L_0x0018
            java.lang.String r5 = "55d43f7f"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r6
            r1[r2] = r7
            r1[r0] = r8
            r4.ipc$dispatch(r5, r1)
            return
        L_0x0018:
            r7.hashCode()
            r8 = -1
            int r4 = r7.hashCode()
            switch(r4) {
                case -1881848369: goto L_0x0052;
                case -1364766353: goto L_0x0046;
                case -923579048: goto L_0x003c;
                case 349312267: goto L_0x0030;
                case 980325089: goto L_0x0025;
                default: goto L_0x0023;
            }
        L_0x0023:
            r0 = -1
            goto L_0x005d
        L_0x0025:
            java.lang.String r0 = "closePreFilterPanel"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x002e
            goto L_0x0023
        L_0x002e:
            r0 = 4
            goto L_0x005d
        L_0x0030:
            java.lang.String r0 = "listScroll"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x003a
            goto L_0x0023
        L_0x003a:
            r0 = 3
            goto L_0x005d
        L_0x003c:
            java.lang.String r1 = "widget_bind"
            boolean r7 = r7.equals(r1)
            if (r7 != 0) goto L_0x005d
            goto L_0x0023
        L_0x0046:
            java.lang.String r0 = "stopScroll"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x0050
            goto L_0x0023
        L_0x0050:
            r0 = 1
            goto L_0x005d
        L_0x0052:
            java.lang.String r0 = "startScroll"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x005c
            goto L_0x0023
        L_0x005c:
            r0 = 0
        L_0x005d:
            switch(r0) {
                case 0: goto L_0x007f;
                case 1: goto L_0x006d;
                case 2: goto L_0x0065;
                case 3: goto L_0x0061;
                case 4: goto L_0x007f;
                default: goto L_0x0060;
            }
        L_0x0060:
            goto L_0x0082
        L_0x0061:
            r6.traverseScrollObservers()
            goto L_0x0082
        L_0x0065:
            tb.z6c r7 = r6.holder
            if (r7 == 0) goto L_0x0082
            r6.hideDropFilter(r2, r3)
            goto L_0x0082
        L_0x006d:
            boolean r7 = r6.hasHolderToShow
            if (r7 == 0) goto L_0x0082
            r6.showNewDropFilter()
            android.widget.FrameLayout r7 = r6.container
            com.taobao.search.musie.component.filter.TbFilter$d r8 = new com.taobao.search.musie.component.filter.TbFilter$d
            r8.<init>()
            r7.post(r8)
            goto L_0x0082
        L_0x007f:
            r6.hideDropFilter(r2, r2)
        L_0x0082:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.search.musie.component.filter.TbFilter.onNativeEvent(java.lang.String, java.lang.String):void");
    }
}

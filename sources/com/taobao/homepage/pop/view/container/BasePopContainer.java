package com.taobao.homepage.pop.view.container;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.pop.protocol.event.IPopMessageListener;
import com.taobao.homepage.pop.protocol.event.IPopViewEventListener;
import com.taobao.homepage.pop.protocol.model.pop.IPopAnchorViewInfo;
import com.taobao.homepage.pop.protocol.model.pop.IPopData;
import com.taobao.homepage.pop.view.popview.BasePopView;
import com.taobao.homepage.pop.view.popview.UcpPopView;
import com.taobao.homepage.pop.viewmodel.PopDataViewModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.bgm;
import tb.dbd;
import tb.e3b;
import tb.esu;
import tb.fet;
import tb.pfw;
import tb.tfm;
import tb.thm;
import tb.vfm;
import tb.vl4;
import tb.xq1;
import tb.xs1;
import tb.yhm;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class BasePopContainer extends FrameLayout implements IPopViewEventListener, IPopMessageListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "BasePopContainer ";
    public int iconScrollOffset;
    public final vl4 mContainerVM;
    public tfm mListenerRegister;
    public e3b mPopEngine;
    public xs1 mPopTrigger;
    public final pfw mViewProviderFactory;
    public final Map<String, BasePopView> mPopViewsOnScreen = new ConcurrentHashMap();
    private boolean mIsDestroyed = false;
    private final Map<String, IPopData<?>> mPopDataOnScreen = new ConcurrentHashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (BasePopContainer.access$000(BasePopContainer.this)) {
                vfm.f(BasePopContainer.TAG, "container is destroyed, skip refreshData trigger");
            } else {
                BasePopContainer basePopContainer = BasePopContainer.this;
                basePopContainer.mPopTrigger.f(basePopContainer.mContainerVM.i(0));
                BasePopContainer basePopContainer2 = BasePopContainer.this;
                basePopContainer2.mPopTrigger.e(basePopContainer2.mContainerVM.i(1));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ IPopData f10599a;

        public b(IPopData iPopData) {
            this.f10599a = iPopData;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            dbd a2 = BasePopContainer.this.mViewProviderFactory.a(this.f10599a.getPopConfig().getPopContentType());
            if (a2 != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(this.f10599a);
                BasePopContainer basePopContainer = BasePopContainer.this;
                a2.h(basePopContainer.mPopEngine, arrayList, BasePopContainer.access$100(basePopContainer));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ List f10600a;
        public final /* synthetic */ int b;
        public final /* synthetic */ View c;

        public c(List list, int i, View view) {
            this.f10600a = list;
            this.b = i;
            this.c = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (BasePopContainer.access$000(BasePopContainer.this)) {
                vfm.f(BasePopContainer.TAG, "container is destroyed, skip onCardAttached trigger");
            } else {
                for (IPopData iPopData : this.f10600a) {
                    if (iPopData.isAllowShow()) {
                        BasePopContainer.this.mPopTrigger.j(new thm(iPopData, this.b, this.c));
                    }
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Map f10601a;
        public final /* synthetic */ e3b b;

        public d(Map map, e3b e3bVar) {
            this.f10601a = map;
            this.b = e3bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            List list;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            for (Integer num : this.f10601a.keySet()) {
                dbd a2 = BasePopContainer.this.mViewProviderFactory.a(num.intValue());
                if (!(a2 == null || (list = (List) this.f10601a.get(num)) == null || list.isEmpty())) {
                    a2.h(this.b, new ArrayList(list), BasePopContainer.access$100(BasePopContainer.this));
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class e implements dbd.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // tb.dbd.a
        public void onSuccess(List<IPopData> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c1c36a9c", new Object[]{this, list});
            } else if (list != null && !list.isEmpty()) {
                vfm.f(BasePopContainer.TAG, "template download success");
                for (IPopData iPopData : list) {
                    BasePopView basePopView = BasePopContainer.this.mPopViewsOnScreen.get(iPopData.getBusinessID());
                    if (iPopData.isAllowShow() || basePopView == null || basePopView.checkReRender()) {
                        iPopData.resetShowCount();
                        BasePopContainer.this.mPopTrigger.h(new thm(iPopData));
                    }
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class f implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ IPopData f10603a;

        public f(IPopData iPopData) {
            this.f10603a = iPopData;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (BasePopContainer.access$000(BasePopContainer.this)) {
                vfm.f(BasePopContainer.TAG, "container is destroyed, skip reTriggerPopByUCP");
            } else {
                BasePopContainer.this.mPopTrigger.u(this.f10603a);
            }
        }
    }

    public BasePopContainer(Context context, pfw pfwVar, int i, e3b e3bVar) {
        super(context);
        this.mViewProviderFactory = pfwVar;
        this.mContainerVM = new vl4(i);
        this.mPopEngine = e3bVar;
        setVisibility(8);
    }

    public static /* synthetic */ boolean access$000(BasePopContainer basePopContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dbb1581", new Object[]{basePopContainer})).booleanValue();
        }
        return basePopContainer.mIsDestroyed;
    }

    public static /* synthetic */ dbd.a access$100(BasePopContainer basePopContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dbd.a) ipChange.ipc$dispatch("65de849e", new Object[]{basePopContainer});
        }
        return basePopContainer.getPopDownloadListener();
    }

    private dbd.a getPopDownloadListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dbd.a) ipChange.ipc$dispatch("7664f2e0", new Object[]{this});
        }
        return new e();
    }

    public static /* synthetic */ Object ipc$super(BasePopContainer basePopContainer, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/homepage/pop/view/container/BasePopContainer");
    }

    private void notifyAddPopView(BasePopView basePopView, IPopData<?> iPopData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4090eba", new Object[]{this, basePopView, iPopData});
            return;
        }
        tfm tfmVar = this.mListenerRegister;
        if (tfmVar != null && basePopView != null) {
            tfmVar.b(basePopView, iPopData);
        }
    }

    private void notifyRemovePopView(BasePopView basePopView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3036b25b", new Object[]{this, basePopView, str});
        } else if (this.mListenerRegister != null && basePopView != null) {
            this.mListenerRegister.a(basePopView, this.mPopDataOnScreen.remove(str));
        }
    }

    private void preloadData(e3b e3bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea62535f", new Object[]{this, e3bVar});
            return;
        }
        Map<Integer, List<IPopData>> k = this.mContainerVM.k();
        if (!k.isEmpty()) {
            fet.a().e(new d(k, e3bVar));
        }
    }

    private void removeInvalidPopView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b50db4a", new Object[]{this});
            return;
        }
        for (String str : this.mPopViewsOnScreen.keySet()) {
            if (this.mContainerVM.g(str) == null) {
                triggerInvalidPopRemove(str);
            }
        }
    }

    private void triggerInvalidPopRemove(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b52889e7", new Object[]{this, str});
            return;
        }
        BasePopView basePopView = this.mPopViewsOnScreen.get(str);
        if (basePopView != null) {
            basePopView.triggerInvalidPopRemove();
        }
    }

    public void generateOnScreenBizParams(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50f32a50", new Object[]{this, jSONObject});
            return;
        }
        for (String str : this.mPopViewsOnScreen.keySet()) {
            BasePopView basePopView = this.mPopViewsOnScreen.get(str);
            if (basePopView != null) {
                jSONObject.put(str, (Object) basePopView.getPopReqParams());
            }
        }
    }

    public IPopAnchorViewInfo getAnchorInfo(IPopData iPopData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IPopAnchorViewInfo) ipChange.ipc$dispatch("59da7512", new Object[]{this, iPopData});
        }
        BasePopView basePopView = this.mPopViewsOnScreen.get(iPopData.getBusinessID());
        if (basePopView != null) {
            return basePopView.getOriginViewInfo();
        }
        return this.mPopTrigger.m(iPopData, this.iconScrollOffset);
    }

    public int getHierarchy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("eed9b079", new Object[]{this})).intValue();
        }
        return this.mContainerVM.f();
    }

    public boolean isUcpPendingTrigger(IPopData iPopData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fe7d1e4", new Object[]{this, iPopData})).booleanValue();
        }
        return this.mPopTrigger.o(iPopData);
    }

    public void onAppToBackground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("938dadf2", new Object[]{this});
            return;
        }
        for (BasePopView basePopView : this.mPopViewsOnScreen.values()) {
            basePopView.onAppToBackground();
        }
    }

    public void onAppToForeground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c3baf87", new Object[]{this});
            return;
        }
        for (BasePopView basePopView : this.mPopViewsOnScreen.values()) {
            basePopView.onAppToForeground();
        }
    }

    public void onCardAttached(int i, View view, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("339efcd3", new Object[]{this, new Integer(i), view, str});
            return;
        }
        List<IPopData> h = this.mContainerVM.h(1, str);
        if (h != null && !h.isEmpty()) {
            fet.a().f(new c(h, i, view), 0L);
        }
    }

    @Override // com.taobao.homepage.pop.protocol.event.IPopViewEventListener
    public void onEvent(int i, IPopData iPopData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b090649f", new Object[]{this, new Integer(i), iPopData});
            return;
        }
        if (yhm.d(i)) {
            removePopView(iPopData.getBusinessID());
        }
        tfm tfmVar = this.mListenerRegister;
        if (tfmVar != null) {
            tfmVar.onEvent(i, iPopData);
        }
    }

    public void onIconScroll(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73803697", new Object[]{this, new Integer(i)});
        } else {
            this.iconScrollOffset = i;
        }
    }

    public void onInfoFlowEnter(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8cb0d3df", new Object[]{this, new Integer(i)});
            return;
        }
        for (BasePopView basePopView : this.mPopViewsOnScreen.values()) {
            basePopView.onInfoFlowEnter(i);
        }
        reTriggerPop(0);
    }

    public void onInfoFlowLeave(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbaf9f60", new Object[]{this, new Integer(i)});
            return;
        }
        for (BasePopView basePopView : this.mPopViewsOnScreen.values()) {
            basePopView.onInfoFlowLeave(i);
        }
    }

    @Override // com.taobao.homepage.pop.protocol.event.IPopMessageListener
    public void onMessage(String str, IPopData iPopData, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9b3eda9", new Object[]{this, str, iPopData, jSONObject});
            return;
        }
        if ("removePop".equals(str) || "other".equals(str)) {
            removePopView(iPopData.getBusinessID());
        }
        tfm tfmVar = this.mListenerRegister;
        if (tfmVar != null) {
            tfmVar.onMessage(str, iPopData, jSONObject);
        }
    }

    public void onPopLayerDismiss() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26527412", new Object[]{this});
            return;
        }
        for (BasePopView basePopView : this.mPopViewsOnScreen.values()) {
            basePopView.onPopLayerDismiss();
        }
    }

    public void onPopLayerShow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99562ea3", new Object[]{this});
            return;
        }
        for (BasePopView basePopView : this.mPopViewsOnScreen.values()) {
            basePopView.onPopLayerShow();
        }
    }

    public void onScrollStateChange(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f0bc1a8", new Object[]{this, viewGroup, new Integer(i)});
            return;
        }
        for (BasePopView basePopView : this.mPopViewsOnScreen.values()) {
            basePopView.onScrollStateChange(viewGroup, i);
        }
    }

    public void onTriggerShow(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("352733f0", new Object[]{this, new Integer(i), str});
            return;
        }
        IPopData g = this.mContainerVM.g(str);
        if (g != null && g.isAllowShow() && g.getPopConfig().getTrigger() == i) {
            this.mPopTrigger.j(new thm(g));
        }
    }

    public void reTriggerPop(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e8e36d0", new Object[]{this, new Integer(i)});
        } else {
            this.mPopTrigger.t(i);
        }
    }

    public void reTriggerPopByUCP(IPopData<?> iPopData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5abc19da", new Object[]{this, iPopData});
        } else {
            fet.a().f(new f(iPopData), 0L);
        }
    }

    public void refreshData(e3b e3bVar, PopDataViewModel popDataViewModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd6cfa7c", new Object[]{this, e3bVar, popDataViewModel});
            return;
        }
        this.mContainerVM.d(popDataViewModel.getAllPopData());
        vfm.c(TAG, "refreshData, hierarchy=" + this.mContainerVM.f() + ", size=" + this.mContainerVM.j());
        preloadData(e3bVar);
        this.mPopTrigger.d();
        removeInvalidPopView();
        fet.a().f(new a(), 0L);
    }

    public void removePopView(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71a9cc83", new Object[]{this, str});
            return;
        }
        BasePopView remove = this.mPopViewsOnScreen.remove(str);
        if (remove != null) {
            removeView(remove);
        }
        notifyRemovePopView(remove, str);
        if (this.mPopViewsOnScreen.isEmpty()) {
            setVisibility(8);
        }
    }

    public void removeUcpPendingPop(IPopData iPopData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d41f8ec1", new Object[]{this, iPopData});
        } else {
            this.mPopTrigger.v(iPopData);
        }
    }

    public void setAlpha(String str, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8026db3", new Object[]{this, str, new Float(f2)});
            return;
        }
        BasePopView basePopView = this.mPopViewsOnScreen.get(str);
        if (basePopView != null) {
            basePopView.setAlpha(f2);
        }
    }

    public void setPopListenerRegister(tfm tfmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9220e8a3", new Object[]{this, tfmVar});
        } else {
            this.mListenerRegister = tfmVar;
        }
    }

    public void translate(float f2, float f3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b81b595", new Object[]{this, new Float(f2), new Float(f3)});
        }
    }

    public void triggerPopMessage(String str, String str2, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcf50ba7", new Object[]{this, str, str2, jSONObject});
            return;
        }
        BasePopView basePopView = this.mPopViewsOnScreen.get(str2);
        if (basePopView != null) {
            basePopView.triggerPopMessage(str, str2, jSONObject);
        }
    }

    public void triggerPopViewEvent(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("708e292a", new Object[]{this, new Integer(i), str});
            return;
        }
        BasePopView basePopView = this.mPopViewsOnScreen.get(str);
        if (basePopView != null) {
            basePopView.triggerPopViewEvent(i, str);
        }
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        this.mIsDestroyed = true;
        this.mPopViewsOnScreen.clear();
        this.mPopDataOnScreen.clear();
        this.mContainerVM.a();
        this.mPopTrigger.d();
        ViewParent parent = getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this);
        }
        vfm.f(TAG, "pop view onDestroy, remove all, hierarchy=" + getHierarchy());
    }

    public void onCardDetached(int i, View view, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8be921", new Object[]{this, new Integer(i), view, str});
            return;
        }
        List<IPopData> h = this.mContainerVM.h(2, str);
        if (!(h == null || h.isEmpty())) {
            for (IPopData iPopData : h) {
                this.mPopTrigger.j(new thm(iPopData, i, view));
            }
        }
    }

    public boolean onTriggerShowByPopData(int i, IPopData<?> iPopData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a213bb56", new Object[]{this, new Integer(i), iPopData})).booleanValue();
        }
        if (iPopData == null || !iPopData.isAllowShow() || iPopData.getPopConfig() == null || iPopData.getPopConfig().getTrigger() != i) {
            vfm.f(TAG, "onTriggerShowByPopData popData is inValid");
            return false;
        }
        fet.a().e(new b(iPopData));
        this.mPopTrigger.j(new thm(iPopData));
        vfm.f(TAG, "onTriggerShowByPopData doTrigger");
        return true;
    }

    public BasePopView createPopView(IPopData iPopData, dbd dbdVar, View view, IPopAnchorViewInfo iPopAnchorViewInfo, xq1 xq1Var, thm thmVar) {
        BasePopView basePopView;
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BasePopView) ipChange.ipc$dispatch("df3eca65", new Object[]{this, iPopData, dbdVar, view, iPopAnchorViewInfo, xq1Var, thmVar});
        }
        String businessID = iPopData.getBusinessID();
        if (iPopData.isFirstShow()) {
            triggerInvalidPopRemove(businessID);
        } else if (this.mPopViewsOnScreen.containsKey(businessID)) {
            bgm.a("PopTargetCardValid", iPopData, "sameBizCodeExist", "");
            return null;
        }
        bgm.b("PopTargetPosVisible", iPopData);
        if (dbdVar == null || getContext() == null) {
            bgm.a("PopViewFirstVisible", iPopData, "popViewCreateFailed", "");
            vfm.f(TAG, "create pop error, viewProvider is empty");
            return null;
        }
        esu d2 = thmVar.d();
        if (d2 == null) {
            basePopView = new BasePopView(getContext(), iPopData, dbdVar, xq1Var, this.mPopEngine);
            str = TAG;
            str2 = businessID;
        } else {
            Context context = getContext();
            e3b e3bVar = this.mPopEngine;
            str = TAG;
            str2 = businessID;
            basePopView = new UcpPopView(context, iPopData, dbdVar, xq1Var, e3bVar, d2);
        }
        if (!basePopView.initPopView(view, iPopAnchorViewInfo, this.iconScrollOffset, this, this)) {
            vfm.f(str, "create pop error, wrap view is empty");
            return null;
        }
        setVisibility(0);
        this.mPopViewsOnScreen.put(str2, basePopView);
        this.mPopDataOnScreen.put(str2, iPopData);
        addView(basePopView, new FrameLayout.LayoutParams(-2, -2));
        iPopData.recordShow();
        basePopView.requestLayout();
        notifyAddPopView(basePopView, iPopData);
        return basePopView;
    }
}

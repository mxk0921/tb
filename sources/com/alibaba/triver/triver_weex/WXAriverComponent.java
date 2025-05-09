package com.alibaba.triver.triver_weex;

import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.alibaba.aliweex.bundle.WeexPageFragment;
import com.alibaba.android.enhance.nested.nested.WXNestedHeader;
import com.alibaba.android.triver.base.api.ITriverRemoteProxy;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.triver.kit.api.proxy.IEnvProxy;
import com.alibaba.triver.triver_render.extension.PagePulldownPoint;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.annotation.Component;
import com.taobao.weex.annotation.JSMethod;
import com.taobao.weex.bridge.JSCallback;
import com.taobao.weex.common.Constants;
import com.taobao.weex.common.OnWXScrollListener;
import com.taobao.weex.ui.action.BasicComponentData;
import com.taobao.weex.ui.component.NestedContainer;
import com.taobao.weex.ui.component.Scrollable;
import com.taobao.weex.ui.component.WXComponent;
import com.taobao.weex.ui.component.WXComponentProp;
import com.taobao.weex.ui.component.WXDiv;
import com.taobao.weex.ui.component.WXVContainer;
import com.taobao.weex.ui.view.refresh.core.WXSwipeLayout;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.ArrayDeque;
import java.util.Map;
import tb.qce;
import tb.qcf;

/* compiled from: Taobao */
@Component(lazyload = false)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class WXAriverComponent extends WXDiv implements WXNestedHeader.g, PagePulldownPoint, WXSDKInstance.y, NestedContainer, Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private FragmentActivity mActivity;
    private boolean mEnablePullDown;
    private View mErrorView;
    private qce mHelperWrapper;
    private d mInstanceOnScrollFireEventInterceptor;
    private boolean mIsVisible;
    private WXSwipeLayout.OnRefreshOffsetChangedListener mOnRefreshOffsetChangedListener;
    private String mSrc;
    public WXSDKInstance mWeexInstance;
    private WeexPageFragment mWeexPageFragment;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class a implements WXSDKInstance.r {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.taobao.weex.WXSDKInstance.r
        public boolean a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d8788f87", new Object[]{this})).booleanValue();
            }
            if (WXAriverComponent.access$000(WXAriverComponent.this) != null) {
                return WXAriverComponent.access$000(WXAriverComponent.this).onBackPressed();
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class b implements WXSDKInstance.x {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // com.taobao.weex.WXSDKInstance.x
        public boolean onBackPressed() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("88afc67", new Object[]{this})).booleanValue();
            }
            if (WXAriverComponent.access$000(WXAriverComponent.this) != null) {
                return WXAriverComponent.access$000(WXAriverComponent.this).onBackPressed();
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class c implements ITriverRemoteProxy.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // com.alibaba.android.triver.base.api.ITriverRemoteProxy.a
        public void onError(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ac367d3a", new Object[]{this, str});
                return;
            }
            try {
                WXAriverComponent wXAriverComponent = WXAriverComponent.this;
                WXAriverComponent.access$202(wXAriverComponent, View.inflate(WXAriverComponent.access$300(wXAriverComponent), R.layout.triver_remote_error, null));
                ((TUrlImageView) WXAriverComponent.access$200(WXAriverComponent.this).findViewById(R.id.triver_error_icon)).setImageUrl("https://img.alicdn.com/tfs/TB1Hh2cQFXXXXbOXFXXXXXXXXXX-220-220.png");
                WXAriverComponent.this.getViewContainer().addView(WXAriverComponent.access$200(WXAriverComponent.this));
            } catch (Throwable unused) {
            }
        }

        @Override // com.alibaba.android.triver.base.api.ITriverRemoteProxy.a
        public void onSuccess() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d0e393ab", new Object[]{this});
            } else {
                WXAriverComponent.access$100(WXAriverComponent.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class d extends qcf implements OnWXScrollListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final WXAriverComponent f3374a;
        public WXComponent b;

        public d(WXAriverComponent wXAriverComponent) {
            this.f3374a = wXAriverComponent;
        }

        public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_weex/WXAriverComponent$EmbedInstanceOnScrollFireEventInterceptor");
        }

        public final WXComponent findFirstLayerScroller() {
            WXComponent wXComponent;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (WXComponent) ipChange.ipc$dispatch("fa00fe0", new Object[]{this});
            }
            WXSDKInstance wXSDKInstance = this.f3374a.mWeexInstance;
            if (wXSDKInstance == null) {
                return null;
            }
            WXComponent rootComponent = wXSDKInstance.getRootComponent();
            if (rootComponent instanceof Scrollable) {
                return rootComponent;
            }
            ArrayDeque arrayDeque = new ArrayDeque();
            arrayDeque.offer(rootComponent);
            while (!arrayDeque.isEmpty() && (wXComponent = (WXComponent) arrayDeque.poll()) != null) {
                if (wXComponent instanceof Scrollable) {
                    return wXComponent;
                }
                if (wXComponent instanceof WXVContainer) {
                    WXVContainer wXVContainer = (WXVContainer) wXComponent;
                    for (int i = 0; i < wXVContainer.getChildCount(); i++) {
                        arrayDeque.offer(wXVContainer.getChild(i));
                    }
                }
            }
            return null;
        }

        public final void initFirstLayerScroller() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4b860c12", new Object[]{this});
            } else if (this.b == null) {
                WXComponent findFirstLayerScroller = findFirstLayerScroller();
                this.b = findFirstLayerScroller;
                if (findFirstLayerScroller != null) {
                    for (String str : getListenEvents()) {
                        if (!this.b.containsEvent(str)) {
                            this.b.getEvents().add(str);
                            this.b.addEvent(str);
                        }
                    }
                }
            }
        }

        @Override // tb.qcf
        public void onFireEvent(String str, String str2, String str3, Map<String, Object> map, Map<String, Object> map2) {
            WXSDKInstance wXSDKInstance;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("883d45aa", new Object[]{this, str, str2, str3, map, map2});
                return;
            }
            WXAriverComponent wXAriverComponent = this.f3374a;
            if (wXAriverComponent != null && (wXSDKInstance = wXAriverComponent.mWeexInstance) != null && wXSDKInstance.N().equals(str)) {
                if (this.b == null) {
                    initFirstLayerScroller();
                }
                WXComponent wXComponent = this.b;
                if (wXComponent != null && wXComponent.getRef().equals(str2)) {
                    this.f3374a.getInstance().z(this.f3374a.getRef(), str3, map, map2);
                }
            }
        }

        @Override // com.taobao.weex.common.OnWXScrollListener
        public void onScrollStateChanged(View view, int i, int i2, int i3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b177cda7", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3)});
            }
        }

        @Override // com.taobao.weex.common.OnWXScrollListener
        public void onScrolled(View view, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f253d1c0", new Object[]{this, view, new Integer(i), new Integer(i2)});
            } else if (this.b == null && getListenEvents().size() > 0) {
                initFirstLayerScroller();
            }
        }
    }

    @Deprecated
    public WXAriverComponent(WXSDKInstance wXSDKInstance, WXVContainer wXVContainer, String str, boolean z, BasicComponentData basicComponentData) {
        this(wXSDKInstance, wXVContainer, basicComponentData);
    }

    public static /* synthetic */ qce access$000(WXAriverComponent wXAriverComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qce) ipChange.ipc$dispatch("dba4cbd8", new Object[]{wXAriverComponent});
        }
        return wXAriverComponent.mHelperWrapper;
    }

    public static /* synthetic */ void access$100(WXAriverComponent wXAriverComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16ab42f3", new Object[]{wXAriverComponent});
        } else {
            wXAriverComponent.launcherApp();
        }
    }

    public static /* synthetic */ View access$200(WXAriverComponent wXAriverComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("e4064f36", new Object[]{wXAriverComponent});
        }
        return wXAriverComponent.mErrorView;
    }

    public static /* synthetic */ View access$202(WXAriverComponent wXAriverComponent, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("ced17bde", new Object[]{wXAriverComponent, view});
        }
        wXAriverComponent.mErrorView = view;
        return view;
    }

    public static /* synthetic */ FragmentActivity access$300(WXAriverComponent wXAriverComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FragmentActivity) ipChange.ipc$dispatch("a3efdf2a", new Object[]{wXAriverComponent});
        }
        return wXAriverComponent.mActivity;
    }

    public static /* synthetic */ Object ipc$super(WXAriverComponent wXAriverComponent, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1983604863:
                super.destroy();
                return null;
            case -1470271414:
                super.addEvent((String) objArr[0]);
                return null;
            case -475248713:
                super.onActivityStop();
                return null;
            case -17468269:
                super.onActivityDestroy();
                return null;
            case 474982114:
                super.onActivityResume();
                return null;
            case 602429250:
                super.onRequestPermissionsResult(((Number) objArr[0]).intValue(), (String[]) objArr[1], (int[]) objArr[2]);
                return null;
            case 1257714799:
                super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
                return null;
            case 1692842255:
                super.onActivityPause();
                return null;
            case 1778838323:
                super.updateStyles((Map) objArr[0]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_weex/WXAriverComponent");
        }
    }

    private void launcherApp() {
        try {
            this.mHelperWrapper = (qce) Class.forName("com.alibaba.triver.triver_weex.WeexTRViewHelperWrapper").getConstructor(FragmentActivity.class, WXSDKInstance.class, PagePulldownPoint.class, WeexPageFragment.class, ViewGroup.class, Boolean.TYPE).newInstance(this.mActivity, this.mWeexInstance, this, this.mWeexPageFragment, getViewContainer(), Boolean.valueOf(this.mEnablePullDown));
        } catch (Throwable unused) {
        }
        qce qceVar = this.mHelperWrapper;
        if (qceVar != null) {
            qceVar.init();
            this.mHelperWrapper.startApp(this.mSrc);
        }
    }

    private void tryLauncherApp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f575a32d", new Object[]{this});
        } else {
            com.alibaba.android.triver.base.api.a.b("WXAriverComponent", this.mSrc, ITriverRemoteProxy.DependenceMode.TRIVER_AND_UC, this.mActivity, new c());
        }
    }

    @Override // com.taobao.weex.ui.component.WXComponent
    public void addEvent(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a85d704a", new Object[]{this, str});
            return;
        }
        super.addEvent(str);
        if ("scrollstart".equals(str)) {
            this.mInstanceOnScrollFireEventInterceptor.addInterceptEvent(str);
        } else if ("scrollend".equals(str)) {
            this.mInstanceOnScrollFireEventInterceptor.addInterceptEvent(str);
        } else if ("scroll".equals(str)) {
            this.mInstanceOnScrollFireEventInterceptor.addInterceptEvent(str);
        }
    }

    @Override // com.taobao.weex.ui.component.WXComponent
    public void addLayerOverFlowListener(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c05be57", new Object[]{this, str});
            return;
        }
        WXSDKInstance wXSDKInstance = this.mWeexInstance;
        if (wXSDKInstance != null) {
            wXSDKInstance.n(getRef());
        }
    }

    public void addOnRefreshOffsetChangedListener(WXSwipeLayout.OnRefreshOffsetChangedListener onRefreshOffsetChangedListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dcb4314", new Object[]{this, onRefreshOffsetChangedListener});
        } else {
            this.mOnRefreshOffsetChangedListener = onRefreshOffsetChangedListener;
        }
    }

    @JSMethod(uiThread = false)
    public void destroy(JSCallback jSCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33982167", new Object[]{this, jSCallback});
            return;
        }
        qce qceVar = this.mHelperWrapper;
        if (qceVar != null) {
            qceVar.destroyApp();
            this.mHelperWrapper = null;
        }
    }

    @Override // com.taobao.weex.ui.component.NestedContainer
    public ViewGroup getViewContainer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("bb9ebe48", new Object[]{this});
        }
        return (ViewGroup) getHostView();
    }

    @Override // com.taobao.weex.ui.component.WXVContainer, com.taobao.weex.ui.component.WXComponent, tb.yae
    public void onActivityDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fef57493", new Object[]{this});
            return;
        }
        super.onActivityDestroy();
        qce qceVar = this.mHelperWrapper;
        if (qceVar != null) {
            qceVar.onDestroy();
        }
    }

    @Override // com.taobao.weex.ui.component.WXVContainer, com.taobao.weex.ui.component.WXComponent, tb.yae
    public void onActivityPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64e6b90f", new Object[]{this});
            return;
        }
        super.onActivityPause();
        qce qceVar = this.mHelperWrapper;
        if (qceVar != null) {
            qceVar.onPause();
        }
    }

    @Override // com.taobao.weex.ui.component.WXVContainer, com.taobao.weex.ui.component.WXComponent
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        super.onActivityResult(i, i2, intent);
        qce qceVar = this.mHelperWrapper;
        if (qceVar != null) {
            qceVar.onActivityResult(i, i2, intent);
        }
    }

    @Override // com.taobao.weex.ui.component.WXVContainer, com.taobao.weex.ui.component.WXComponent, tb.yae
    public void onActivityResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c4fa6e2", new Object[]{this});
            return;
        }
        super.onActivityResume();
        qce qceVar = this.mHelperWrapper;
        if (qceVar != null) {
            qceVar.onResume();
        }
    }

    @Override // com.taobao.weex.ui.component.WXVContainer, com.taobao.weex.ui.component.WXComponent, tb.yae
    public void onActivityStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3ac47b7", new Object[]{this});
            return;
        }
        super.onActivityStop();
        qce qceVar = this.mHelperWrapper;
        if (qceVar != null) {
            qceVar.onStop();
        }
    }

    @Override // com.taobao.weex.WXSDKInstance.y
    public void onAppear() {
        WXSDKInstance wXSDKInstance;
        WXComponent rootComponent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("321cdedb", new Object[]{this});
        } else if (this.mIsVisible && (wXSDKInstance = this.mWeexInstance) != null && (rootComponent = wXSDKInstance.getRootComponent()) != null) {
            rootComponent.fireEvent(Constants.Event.VIEWAPPEAR);
        }
    }

    @Override // com.taobao.weex.WXSDKInstance.y
    public void onDisappear() {
        WXSDKInstance wXSDKInstance;
        WXComponent rootComponent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3d60f0b", new Object[]{this});
        } else if (this.mIsVisible && (wXSDKInstance = this.mWeexInstance) != null && (rootComponent = wXSDKInstance.getRootComponent()) != null) {
            rootComponent.fireEvent(Constants.Event.VIEWDISAPPEAR);
        }
    }

    @Override // com.alibaba.ariver.kernel.api.extension.Extension
    public void onFinalized() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd1b9dee", new Object[]{this});
        }
    }

    @Override // com.alibaba.ariver.kernel.api.extension.Extension
    public void onInitialized() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94f2f17c", new Object[]{this});
        }
    }

    @Override // com.alibaba.triver.triver_render.extension.PagePulldownPoint
    public void onReachPullRefreshDistance(App app, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e896bb1", new Object[]{this, app, new Integer(i)});
            return;
        }
        WXSwipeLayout.OnRefreshOffsetChangedListener onRefreshOffsetChangedListener = this.mOnRefreshOffsetChangedListener;
        if (onRefreshOffsetChangedListener != null) {
            onRefreshOffsetChangedListener.onOffsetChanged(i);
        }
    }

    @Override // com.alibaba.triver.triver_render.extension.PagePulldownPoint
    public void onRefresh(App app) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("281e3f97", new Object[]{this, app});
        }
    }

    @Override // com.taobao.weex.ui.component.WXVContainer, com.taobao.weex.ui.component.WXComponent
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23e85742", new Object[]{this, new Integer(i), strArr, iArr});
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
        qce qceVar = this.mHelperWrapper;
        if (qceVar != null) {
            qceVar.onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    @JSMethod(uiThread = false)
    public void relaunch(JSCallback jSCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a68383b", new Object[]{this, jSCallback});
        } else {
            tryLauncherApp();
        }
    }

    @Override // com.taobao.weex.ui.component.NestedContainer
    public void reload() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5a391a0", new Object[]{this});
        }
    }

    @Override // com.taobao.weex.ui.component.WXComponent
    public void removeLayerOverFlowListener(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0044e94", new Object[]{this, str});
            return;
        }
        WXSDKInstance wXSDKInstance = this.mWeexInstance;
        if (wXSDKInstance != null) {
            wXSDKInstance.R0(str);
        }
    }

    @Override // com.taobao.weex.ui.component.NestedContainer
    public void renderNewURL(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a6f31b6", new Object[]{this, str});
        }
    }

    @WXComponentProp(name = "mEnablePullDown")
    public void setEnablePullDown(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df61d281", new Object[]{this, new Boolean(z)});
        } else {
            this.mEnablePullDown = z;
        }
    }

    @Override // com.taobao.weex.ui.component.NestedContainer
    public void setOnNestEventListener(NestedContainer.OnNestedInstanceEventListener onNestedInstanceEventListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b90a214", new Object[]{this, onNestedInstanceEventListener});
        }
    }

    @WXComponentProp(name = "src")
    public void setSrc(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dbfab33", new Object[]{this, str});
            return;
        }
        this.mSrc = str;
        try {
            tryLauncherApp();
        } catch (Exception e) {
            RVLogger.w(Log.getStackTraceString(e));
        }
    }

    public WXAriverComponent(WXSDKInstance wXSDKInstance, WXVContainer wXVContainer, BasicComponentData basicComponentData) {
        super(wXSDKInstance, wXVContainer, basicComponentData);
        this.mIsVisible = true;
        this.mEnablePullDown = true;
        wXSDKInstance.G0(new a());
        wXSDKInstance.H0(new b());
        this.mWeexInstance = wXSDKInstance;
        this.mInstanceOnScrollFireEventInterceptor = new d(this);
        this.mActivity = (FragmentActivity) getContext();
        try {
            if ("TM".equals(((IEnvProxy) RVProxy.get(IEnvProxy.class)).getEnvValue("appName"))) {
                Field declaredField = this.mActivity.getClass().getDeclaredField("mWeexPageFragment");
                declaredField.setAccessible(true);
                this.mWeexPageFragment = (WeexPageFragment) declaredField.get(this.mActivity);
            } else {
                Field declaredField2 = this.mActivity.getClass().getDeclaredField("mPageFragment");
                declaredField2.setAccessible(true);
                this.mWeexPageFragment = (WeexPageFragment) declaredField2.get(this.mActivity);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.taobao.weex.ui.component.WXComponent
    public void updateStyles(Map<String, Object> map) {
        qce qceVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a06eb33", new Object[]{this, map});
            return;
        }
        super.updateStyles(map);
        if (!map.containsKey("visibility")) {
            return;
        }
        if (TextUtils.equals("hidden", map.get("visibility").toString())) {
            qce qceVar2 = this.mHelperWrapper;
            if (qceVar2 != null) {
                this.mIsVisible = false;
                qceVar2.onHidden();
                this.mHelperWrapper.onPause();
                this.mHelperWrapper.onStop();
            }
        } else if (TextUtils.equals("visible", map.get("visibility").toString()) && (qceVar = this.mHelperWrapper) != null) {
            this.mIsVisible = true;
            qceVar.onVisible();
            this.mHelperWrapper.onResume();
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
        this.mSrc = null;
        if (getInstance() != null) {
            getInstance().S0(this);
        }
    }
}

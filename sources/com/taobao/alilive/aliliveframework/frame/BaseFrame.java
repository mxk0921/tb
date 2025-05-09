package com.taobao.alilive.aliliveframework.frame;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.adaemon.ADaemon;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.live.plugin.proxy.FlexaLiveX;
import com.taobao.taolive.sdk.controller.IRecyclerModel;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.cwd;
import tb.fe1;
import tb.h4s;
import tb.hjr;
import tb.iw0;
import tb.o3s;
import tb.qvs;
import tb.t2o;
import tb.ux9;
import tb.v2s;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class BaseFrame implements IComponent {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int STATUS_INIT_SUCCESS = 1;
    private static final String TAG = "BaseFrame";
    private static final String TRACE_TASK = "ComponentLifeCycle/";
    public static final int VIEW_STATUS_APPEAR = 2;
    public static final int VIEW_STATUS_DISAPPEAR = 3;
    public static final int VIEW_STATUS_INIT = 1;
    public static final int VIEW_STATUS_WILL_APPEAR = 4;
    private static int count = 0;
    public static String name;
    public static long startTime;
    public static long time;
    public boolean layoutFrozen;
    public List<IComponent> mComponents;
    public View mContainer;
    public Context mContext;
    public long mCreateViewTime;
    public ux9 mFrameContext;
    private AtomicBoolean mIsCallCleanUp;
    private AtomicBoolean mIsCallDataReceived;
    public boolean mIsPaused;
    public boolean mLandscape;
    public TBLiveDataModel mLiveDataModel;
    public int mViewStatus;
    public ViewStub mViewStub;
    public boolean viewCreated;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ViewStub f6173a;
        public final /* synthetic */ ViewGroup b;
        public final /* synthetic */ BaseFrame c;
        public final /* synthetic */ Handler d;

        /* compiled from: Taobao */
        /* renamed from: com.taobao.alilive.aliliveframework.frame.BaseFrame$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class C0319a extends fe1 {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public final /* synthetic */ View b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0319a(View view, View view2) {
                super(view);
                this.b = view2;
            }

            public static /* synthetic */ Object ipc$super(C0319a aVar, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/alilive/aliliveframework/frame/BaseFrame$1$1");
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                a aVar = a.this;
                BaseFrame.this.replaceSelfWithView(this.b, aVar.b, aVar.f6173a);
                BaseFrame baseFrame = BaseFrame.this;
                View view = this.b;
                baseFrame.mContainer = view;
                baseFrame.onViewCreated(view);
                a aVar2 = a.this;
                aVar2.c.addComponent(BaseFrame.this);
            }
        }

        public a(ViewStub viewStub, ViewGroup viewGroup, BaseFrame baseFrame, Handler handler) {
            this.f6173a = viewStub;
            this.b = viewGroup;
            this.c = baseFrame;
            this.d = handler;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            View inflateViewNoAdd = BaseFrame.this.inflateViewNoAdd(this.f6173a);
            this.d.post(new C0319a(inflateViewNoAdd, inflateViewNoAdd));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface b {
        void a(BaseFrame baseFrame);
    }

    static {
        t2o.a(806355020);
        t2o.a(806355029);
    }

    @Deprecated
    public BaseFrame(Context context) {
        this(context, false);
    }

    private View getDecorView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("6d69b8fd", new Object[]{this});
        }
        View view = this.mContainer;
        if (view != null) {
            while (view.getParent() instanceof View) {
                view = (View) view.getParent();
            }
        }
        return view;
    }

    private void inflateViewByStub(final BaseFrame baseFrame, final ViewStub viewStub, final b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3978cfc", new Object[]{this, baseFrame, viewStub, bVar});
        } else if (lazyInflate()) {
            keepViewStubWithoutInflate(viewStub);
            invokeFrameLifecycle(baseFrame, bVar);
        } else if (!asyncRenderComponent() || Build.VERSION.SDK_INT <= 27) {
            o3s.b(TAG, this + ", inflate view by ViewStub");
            onCreateView(viewStub);
            invokeFrameLifecycle(baseFrame, bVar);
        } else {
            o3s.b(TAG, this + ", async inflate view by ViewStub");
            final View inflateViewNoAdd = inflateViewNoAdd(viewStub);
            ADaemon.postMainLooper(new Runnable() { // from class: tb.wu1
                @Override // java.lang.Runnable
                public final void run() {
                    BaseFrame.this.lambda$inflateViewByStub$1(viewStub, inflateViewNoAdd, baseFrame, bVar);
                }
            }, new long[0]);
        }
    }

    private void inflateViewByViewGroup(BaseFrame baseFrame, ViewGroup viewGroup, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d95b083", new Object[]{this, baseFrame, viewGroup, bVar});
            return;
        }
        o3s.b(TAG, this + ", inflate view by ViewGroup");
        onCreateView2(viewGroup);
        invokeFrameLifecycle(baseFrame, bVar);
    }

    private void internalCleanUp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41110e4e", new Object[]{this});
            return;
        }
        if (this.mIsCallCleanUp.compareAndSet(false, true)) {
            onCleanUp();
        }
        this.layoutFrozen = false;
        this.mIsCallDataReceived.set(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$inflateViewByStub$1(ViewStub viewStub, View view, BaseFrame baseFrame, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f7dc11a", new Object[]{this, viewStub, view, baseFrame, bVar});
            return;
        }
        if (viewStub == null || viewStub.getParent() == null) {
            o3s.b(TAG, this + " inflate already!");
        } else {
            replaceSelfWithView(view, (ViewGroup) viewStub.getParent(), viewStub);
            this.mContainer = view;
            onViewCreated(view);
        }
        invokeFrameLifecycle(baseFrame, bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onInstall$0(BaseFrame baseFrame, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70a1c9f6", new Object[]{this, baseFrame, bVar});
            return;
        }
        if (hjr.g()) {
            if (!isVisibleWhenInit()) {
                o3s.b(TAG, this + " isVisibleWhenInit is false");
            } else if (getContainerView() != null) {
                getContainerView().setVisibility(0);
            }
        } else if (getContainerView() != null) {
            getContainerView().setVisibility(0);
        }
        invokeFrameLifecycle(baseFrame, bVar);
    }

    public boolean asyncRenderComponent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3514e8f6", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public final void asyncRenderComponentWithSerialFrameInstaller(BaseFrame baseFrame, ViewGroup viewGroup, ViewStub viewStub, Handler handler, Handler handler2, Object obj, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2725786", new Object[]{this, baseFrame, viewGroup, viewStub, handler, handler2, obj, new Long(j)});
            return;
        }
        a aVar = new a(viewStub, viewGroup, baseFrame, handler2);
        if (Build.VERSION.SDK_INT >= 28) {
            handler.postDelayed(aVar, obj, j);
        } else {
            handler.postDelayed(aVar, j);
        }
    }

    public boolean childrenAppearImmediately() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b790d775", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // com.taobao.alilive.aliliveframework.frame.IComponent
    public void clearComponent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40cab9b7", new Object[]{this});
            return;
        }
        List<IComponent> list = this.mComponents;
        if (list != null) {
            list.clear();
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.IComponent
    public boolean createView(ViewStub viewStub) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4f881d80", new Object[]{this, viewStub})).booleanValue();
        }
        o3s.a(TAG, this + " 调用 createView(ViewStub stub)");
        h4s.c(getComponentClassName(), "createView_by_stub");
        long elapsedRealtime = SystemClock.elapsedRealtime();
        FlexaLiveX.u();
        if (viewStub == null || viewStub.getParent() == null) {
            createView((ViewGroup) null);
            h4s.e();
            return false;
        }
        viewStub.setLayoutResource(getLayoutResId());
        View inflate = viewStub.inflate();
        this.mContainer = inflate;
        onViewCreated(inflate);
        this.mCreateViewTime = SystemClock.elapsedRealtime() - elapsedRealtime;
        o3s.a(TAG, this + " createView cost = " + this.mCreateViewTime);
        h4s.e();
        return true;
    }

    @Override // com.taobao.alilive.aliliveframework.frame.IComponent
    public void deleteComponent(IComponent iComponent) {
        List<IComponent> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4828ddaf", new Object[]{this, iComponent});
        } else if (iComponent != null && (list = this.mComponents) != null) {
            list.remove(iComponent);
        }
    }

    public void dispatchChildrenOnDidAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52f55803", new Object[]{this});
            return;
        }
        List<IComponent> list = this.mComponents;
        if (list != null) {
            for (IComponent iComponent : list) {
                if (iComponent.getViewStatus() != 2) {
                    iComponent.onDidAppear();
                }
            }
        }
    }

    public View findViewById(int i) {
        View findViewById;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("6fb8a9ae", new Object[]{this, new Integer(i)});
        }
        View view = this.mContainer;
        if (view == null) {
            return null;
        }
        View findViewById2 = view.findViewById(i);
        if (findViewById2 != null) {
            return findViewById2;
        }
        View decorView = getDecorView();
        if (decorView != null && (findViewById = decorView.findViewById(i)) != null) {
            return findViewById;
        }
        Context context = this.mContext;
        if (context instanceof Activity) {
            return ((Activity) context).findViewById(i);
        }
        return null;
    }

    @Override // com.taobao.alilive.aliliveframework.frame.IComponent
    public IComponent getComponentByName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IComponent) ipChange.ipc$dispatch("58361172", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.equals(getComponentName())) {
            return this;
        }
        for (IComponent iComponent : this.mComponents) {
            IComponent componentByName = iComponent.getComponentByName(str);
            if (componentByName != null) {
                return componentByName;
            }
        }
        return null;
    }

    public String getComponentClassName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("93e3add", new Object[]{this});
        }
        return getClass().getSimpleName();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.IComponent
    public String getComponentName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bb5fe8c7", new Object[]{this});
        }
        return getClass().getSimpleName();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.IComponent
    public View getComponentView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("2d47995", new Object[]{this});
        }
        return this.mContainer;
    }

    public final View getContainerView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("3268c19", new Object[]{this});
        }
        return this.mContainer;
    }

    public ux9 getFrameContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ux9) ipChange.ipc$dispatch("59d375df", new Object[]{this});
        }
        return this.mFrameContext;
    }

    public int getLayoutResId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f1151e95", new Object[]{this})).intValue();
        }
        return 0;
    }

    @Override // com.taobao.alilive.aliliveframework.frame.IComponent
    public TBLiveDataModel getLiveDataModel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBLiveDataModel) ipChange.ipc$dispatch("82cec8ab", new Object[]{this});
        }
        return this.mLiveDataModel;
    }

    public String getLiveId() {
        VideoInfo videoInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3d7740fc", new Object[]{this});
        }
        TBLiveDataModel tBLiveDataModel = this.mLiveDataModel;
        if (tBLiveDataModel == null || (videoInfo = tBLiveDataModel.mVideoInfo) == null) {
            return null;
        }
        return videoInfo.liveId;
    }

    @Override // com.taobao.alilive.aliliveframework.frame.IComponent
    public View getViewByName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("6b6e3610", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (TextUtils.equals(str, getComponentName())) {
            return getComponentView();
        }
        for (IComponent iComponent : this.mComponents) {
            View viewByName = iComponent.getViewByName(str);
            if (viewByName != null) {
                return viewByName;
            }
        }
        return null;
    }

    @Override // com.taobao.alilive.aliliveframework.frame.IComponent
    public int getViewStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a37da4e7", new Object[]{this})).intValue();
        }
        return this.mViewStatus;
    }

    @Override // com.taobao.alilive.aliliveframework.frame.IComponent
    public void hide() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9631f0c9", new Object[]{this});
            return;
        }
        View view = this.mContainer;
        if (view != null) {
            view.setVisibility(4);
        }
    }

    public View inflateViewNoAdd(ViewStub viewStub) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("336fd62b", new Object[]{this, viewStub});
        }
        View inflate = LayoutInflater.from(this.mContext).cloneInContext(this.mContext).inflate(getLayoutResId(), (ViewGroup) null);
        if (viewStub != null) {
            inflate.setId(viewStub.getInflatedId());
        } else {
            o3s.b(TAG, "ViewStub 为空，组件：" + getComponentName());
        }
        return inflate;
    }

    public void inflateViewOnNeed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed34788", new Object[]{this});
            return;
        }
        ViewStub viewStub = this.mViewStub;
        if (viewStub != null && viewStub.getParent() != null && createView(this.mViewStub)) {
            StringBuilder sb = new StringBuilder();
            sb.append(getComponentName());
            sb.append(" inflate view lazily ");
            sb.append(System.currentTimeMillis());
        }
    }

    public void invokeFrameLifecycle(BaseFrame baseFrame, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce4f24a0", new Object[]{this, baseFrame, bVar});
            return;
        }
        o3s.b(TAG, this + ", invoke frame onBindDat/onDidAppear");
        TBLiveDataModel tBLiveDataModel = baseFrame.mLiveDataModel;
        if (!(tBLiveDataModel == null || tBLiveDataModel == this.mLiveDataModel)) {
            onBindData(tBLiveDataModel);
        }
        if (baseFrame.mViewStatus == 2 && getViewStatus() != 2) {
            onDidAppear();
        }
        if (bVar != null) {
            bVar.a(this);
        }
    }

    public boolean isLandscape() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("89cf8bc", new Object[]{this})).booleanValue();
        }
        return this.mLandscape;
    }

    public boolean isVisibleWhenInit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("be5806fd", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public boolean keepViewStubWithoutInflate(ViewStub viewStub) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8b637faa", new Object[]{this, viewStub})).booleanValue();
        }
        this.mViewStub = viewStub;
        return true;
    }

    public boolean lazyInflate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f4de9efe", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.alilive.aliliveframework.frame.IComponent
    public void onBindData(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("292c0dc6", new Object[]{this, tBLiveDataModel});
            return;
        }
        o3s.a(TAG, this + " 调用 onBindData");
        h4s.c(getComponentClassName(), "onBindData");
        this.mLiveDataModel = tBLiveDataModel;
        if (this.mViewStatus == 2) {
            onStatusChange(1, tBLiveDataModel);
        }
        List<IComponent> list = this.mComponents;
        if (list != null) {
            for (IComponent iComponent : list) {
                iComponent.onBindData(tBLiveDataModel);
            }
        }
        h4s.e();
    }

    public void onCleanUp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed865dec", new Object[]{this});
            return;
        }
        o3s.a(TAG, this + " 调用 onCleanUp, mViewStatus: " + this.mViewStatus + ", mViewCreated: " + this.viewCreated);
    }

    @Override // com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
            return;
        }
        o3s.a(TAG, this + " 调用 onCreate");
        h4s.c(getComponentClassName(), "onCreate");
        List<IComponent> list = this.mComponents;
        if (list != null) {
            for (IComponent iComponent : list) {
                iComponent.onCreate();
            }
        }
        h4s.e();
    }

    @Deprecated
    public void onCreateView(ViewStub viewStub) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3782edd", new Object[]{this, viewStub});
            return;
        }
        o3s.a(TAG, this + " 调用 onCreateView");
        createView(viewStub);
    }

    @Deprecated
    public void onCreateView2(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96103bf8", new Object[]{this, viewGroup});
            return;
        }
        o3s.a(TAG, this + " 调用 onCreateView2");
        createView(viewGroup);
    }

    @Override // com.taobao.alilive.aliliveframework.frame.IComponent, com.taobao.taolive.sdk.controller.IComponentLifeCycle2, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onDataReceived(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b420d76a", new Object[]{this, tBLiveDataModel});
            return;
        }
        o3s.a(TAG, this + " 调用 onDataReceived");
    }

    @Override // com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        o3s.a(TAG, this + " 调用 onDestroy");
        h4s.c(getComponentClassName(), "onDestroy");
        List<IComponent> list = this.mComponents;
        if (list != null) {
            for (IComponent iComponent : list) {
                iComponent.onDestroy();
            }
            this.mComponents.clear();
        }
        View view = this.mContainer;
        if (view != null) {
            view.setVisibility(8);
        }
        internalCleanUp();
        count = 0;
        h4s.e();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onDidAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("914171dc", new Object[]{this});
            return;
        }
        o3s.a(TAG, this + " 调用 onDidAppear");
        h4s.c(getComponentClassName(), "onDidAppear");
        this.mViewStatus = 2;
        TBLiveDataModel tBLiveDataModel = this.mLiveDataModel;
        if (tBLiveDataModel != null) {
            onStatusChange(1, tBLiveDataModel);
        }
        if (childrenAppearImmediately()) {
            dispatchChildrenOnDidAppear();
        }
        this.mIsCallCleanUp.set(false);
        h4s.e();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onDidDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b505106a", new Object[]{this});
            return;
        }
        o3s.a(TAG, this + " 调用 onDidDisappear");
        h4s.c(getComponentClassName(), "onDidDisappear");
        this.mViewStatus = 3;
        List<IComponent> list = this.mComponents;
        if (list != null) {
            for (IComponent iComponent : list) {
                if (iComponent.getViewStatus() != 3) {
                    iComponent.onDidDisappear();
                }
            }
        }
        internalCleanUp();
        this.mLiveDataModel = null;
        h4s.e();
    }

    public void onFreezeLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c00894a7", new Object[]{this});
            return;
        }
        o3s.a(TAG, this + " 调用 onFreezeLayout");
        this.layoutFrozen = true;
    }

    public void onInstall(final BaseFrame baseFrame, ViewStub viewStub, ViewGroup viewGroup, final b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6af54f52", new Object[]{this, baseFrame, viewStub, viewGroup, bVar});
            return;
        }
        h4s.a(TRACE_TASK + getComponentName(), hashCode());
        if (hjr.g()) {
            if (viewStub == null && viewGroup == null) {
                if (!this.viewCreated) {
                    createView((ViewGroup) null);
                }
            } else if (!this.viewCreated) {
                if (viewStub == null || viewStub.getParent() == null) {
                    inflateViewByViewGroup(baseFrame, viewGroup, bVar);
                    return;
                } else {
                    inflateViewByStub(baseFrame, viewStub, bVar);
                    return;
                }
            }
        } else if (!this.viewCreated) {
            if (viewStub == null || viewStub.getParent() == null) {
                inflateViewByViewGroup(baseFrame, viewGroup, bVar);
                return;
            } else {
                inflateViewByStub(baseFrame, viewStub, bVar);
                return;
            }
        }
        Runnable vu1Var = new Runnable() { // from class: tb.vu1
            @Override // java.lang.Runnable
            public final void run() {
                BaseFrame.this.lambda$onInstall$0(baseFrame, bVar);
            }
        };
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            vu1Var.run();
        } else {
            ADaemon.postMainLooper(vu1Var, new long[0]);
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        o3s.a(TAG, this + " 调用 onPause");
        h4s.c(getComponentClassName(), "onPause");
        this.mIsPaused = true;
        List<IComponent> list = this.mComponents;
        if (list != null) {
            for (IComponent iComponent : list) {
                iComponent.onPause();
            }
        }
        h4s.e();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onPreloadView(IRecyclerModel iRecyclerModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a72946fa", new Object[]{this, iRecyclerModel});
            return;
        }
        o3s.a(TAG, this + " 调用 onPreloadView");
        h4s.c(getComponentClassName(), "onPreloadView");
        List<IComponent> list = this.mComponents;
        if (list != null) {
            for (IComponent iComponent : list) {
                iComponent.onPreloadView(iRecyclerModel);
            }
        }
        h4s.e();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.IComponent, com.taobao.taolive.sdk.controller.IComponentLifeCycle2, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onRemove() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("885fa4a", new Object[]{this});
            return;
        }
        o3s.a(TAG, this + " 调用 onRemove");
        h4s.c(getComponentClassName(), "onRemove");
        for (IComponent iComponent : this.mComponents) {
            iComponent.onRemove();
        }
        h4s.e();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        o3s.a(TAG, this + " 调用 onResume");
        h4s.c(getComponentClassName(), "onResume");
        this.mIsPaused = false;
        List<IComponent> list = this.mComponents;
        if (list != null) {
            for (IComponent iComponent : list) {
                iComponent.onResume();
            }
        }
        h4s.e();
    }

    @Override // com.taobao.taolive.sdk.controller.IComponentLifeCycle2
    public void onScrollStateChanged(int i) {
        ux9 ux9Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62ef402d", new Object[]{this, new Integer(i)});
            return;
        }
        List<IComponent> list = this.mComponents;
        if (list != null) {
            for (IComponent iComponent : list) {
                iComponent.onScrollStateChanged(i);
            }
        }
        if (!qvs.u() && (ux9Var = this.mFrameContext) != null && ux9Var.j().p() != null) {
            if (i != 1 && i != 2) {
                View view = this.mContainer;
                if (view != null && view.isAttachedToWindow() && this.mFrameContext.j().p().getChildCount() == 1 && this.layoutFrozen) {
                    onUnfreezeLayout();
                }
            } else if (!this.layoutFrozen) {
                onFreezeLayout();
            }
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.IComponent, com.taobao.taolive.sdk.controller.IComponentLifeCycle2, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        o3s.a(TAG, this + " 调用 onStart");
        h4s.c(getComponentClassName(), "onStart");
        for (IComponent iComponent : this.mComponents) {
            iComponent.onStart();
        }
        h4s.e();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        o3s.a(TAG, this + " 调用 onStop");
        h4s.c(getComponentClassName(), "onStop");
        List<IComponent> list = this.mComponents;
        if (list != null) {
            for (IComponent iComponent : list) {
                iComponent.onStop();
            }
        }
        h4s.e();
    }

    public void onUnInstall() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6660f8aa", new Object[]{this});
        } else if (this.mViewStatus == 2) {
            View view = this.mContainer;
            if (view != null) {
                view.setVisibility(8);
            }
            internalCleanUp();
        }
    }

    public void onUnfreezeLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9d54d80", new Object[]{this});
            return;
        }
        o3s.a(TAG, this + " 调用 onFreezeLayout");
        this.layoutFrozen = false;
    }

    @Override // com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onUnloadView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7931608a", new Object[]{this});
            return;
        }
        o3s.a(TAG, this + " 调用 onUnloadView");
        h4s.c(getComponentClassName(), "onUnloadView");
        List<IComponent> list = this.mComponents;
        if (list != null) {
            for (IComponent iComponent : list) {
                iComponent.onUnloadView();
            }
        }
        h4s.e();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.IComponent
    public void onVideoStatusChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2319dd36", new Object[]{this, new Integer(i)});
            return;
        }
        List<IComponent> list = this.mComponents;
        if (list != null && list.size() > 0) {
            for (IComponent iComponent : this.mComponents) {
                iComponent.onVideoStatusChanged(i);
            }
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onViewCreated(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("574a747", new Object[]{this, view});
            return;
        }
        o3s.a(TAG, this + " 调用 onViewCreated");
        this.viewCreated = true;
    }

    @Override // com.taobao.taolive.sdk.controller.IComponentLifeCycle2
    public void onViewHolderDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cef86571", new Object[]{this});
            return;
        }
        List<IComponent> list = this.mComponents;
        if (list != null) {
            for (IComponent iComponent : list) {
                iComponent.onViewHolderDestroy();
            }
        }
    }

    @Override // com.taobao.taolive.sdk.controller.IComponentLifeCycle2
    public void onViewHolderDidAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25aa9f6b", new Object[]{this});
            return;
        }
        List<IComponent> list = this.mComponents;
        if (list != null) {
            for (IComponent iComponent : list) {
                iComponent.onViewHolderDidAppear();
            }
        }
        if (this.layoutFrozen) {
            onUnfreezeLayout();
        }
    }

    @Override // com.taobao.taolive.sdk.controller.IComponentLifeCycle2
    public void onViewHolderDidDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70b1c47b", new Object[]{this});
            return;
        }
        List<IComponent> list = this.mComponents;
        if (list != null) {
            for (IComponent iComponent : list) {
                iComponent.onViewHolderDidDisappear();
            }
        }
    }

    @Override // com.taobao.taolive.sdk.controller.IComponentLifeCycle2
    public void onViewHolderWillAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea9f191e", new Object[]{this});
            return;
        }
        List<IComponent> list = this.mComponents;
        if (list != null) {
            for (IComponent iComponent : list) {
                iComponent.onViewHolderWillAppear();
            }
        }
    }

    @Override // com.taobao.taolive.sdk.controller.IComponentLifeCycle2
    public void onViewHolderWillDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e9009e8", new Object[]{this});
            return;
        }
        List<IComponent> list = this.mComponents;
        if (list != null) {
            for (IComponent iComponent : list) {
                iComponent.onViewHolderWillDisappear();
            }
        }
        if (!this.layoutFrozen) {
            onFreezeLayout();
        }
    }

    @Override // com.taobao.taolive.sdk.controller.IComponentLifeCycle2
    public void onViewHolderWillLoad(IRecyclerModel iRecyclerModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efaa6133", new Object[]{this, iRecyclerModel});
            return;
        }
        List<IComponent> list = this.mComponents;
        if (list != null) {
            for (IComponent iComponent : list) {
                iComponent.onViewHolderWillLoad(iRecyclerModel);
            }
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onWillAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1e294cd", new Object[]{this});
            return;
        }
        o3s.a(TAG, this + " 调用 onWillAppear");
        h4s.c(getComponentClassName(), "onWillAppear");
        this.mViewStatus = 4;
        List<IComponent> list = this.mComponents;
        if (list != null) {
            for (IComponent iComponent : list) {
                iComponent.onWillAppear();
            }
        }
        h4s.e();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onWillDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94a63bd9", new Object[]{this});
            return;
        }
        o3s.a(TAG, this + " 调用 onWillDisappear");
        h4s.c(getComponentClassName(), "onWillDisappear");
        this.mViewStatus = 3;
        List<IComponent> list = this.mComponents;
        if (list != null) {
            for (IComponent iComponent : list) {
                iComponent.onWillDisappear();
            }
        }
        this.mLiveDataModel = null;
        h4s.e();
    }

    public void replaceSelfWithView(View view, ViewGroup viewGroup, ViewStub viewStub) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4519165", new Object[]{this, view, viewGroup, viewStub});
            return;
        }
        int indexOfChild = viewGroup.indexOfChild(viewStub);
        viewGroup.removeViewInLayout(viewStub);
        ViewGroup.LayoutParams layoutParams = viewStub.getLayoutParams();
        if (indexOfChild == -1) {
            o3s.b(TAG, "viewStub 不在View Tree，组件：" + getComponentName());
        } else if (layoutParams != null) {
            viewGroup.addView(view, indexOfChild, layoutParams);
        } else {
            viewGroup.addView(view, indexOfChild);
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.IComponent
    public void show() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
            return;
        }
        View view = this.mContainer;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "[" + getComponentName() + "@" + hashCode() + "]";
    }

    @Deprecated
    public BaseFrame(Context context, boolean z) {
        this.mLandscape = false;
        this.mViewStatus = 1;
        this.viewCreated = false;
        this.mComponents = new CopyOnWriteArrayList();
        this.mIsCallCleanUp = new AtomicBoolean(false);
        this.mIsCallDataReceived = new AtomicBoolean(false);
        this.layoutFrozen = false;
        o3s.a(TAG, this + " 调用构造函数");
        this.mContext = context;
        this.mLandscape = z;
        if (iw0.j(context)) {
            name = getClass().getSimpleName();
            time = System.currentTimeMillis();
        }
        cwd A = v2s.o().A();
        A.a(TAG, "registerFrame name---" + name);
        startTime = System.currentTimeMillis();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.IComponent
    public void addComponent(IComponent iComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4912ef9", new Object[]{this, iComponent});
        } else if (iComponent != null && this.mComponents != null) {
            if (this.mLiveDataModel != null && iComponent.getLiveDataModel() == null) {
                iComponent.onBindData(this.mLiveDataModel);
            }
            if (this.mViewStatus == 2 && iComponent.getViewStatus() != 2) {
                iComponent.onDidAppear();
            }
            this.mComponents.add(iComponent);
            if (iw0.j(this.mContext)) {
                count++;
                long currentTimeMillis = name.equals(iComponent.getClass().getSimpleName()) ? System.currentTimeMillis() - time : 0L;
                StringBuilder sb = new StringBuilder("addComponent:");
                sb.append(iComponent.getClass().getSimpleName());
                sb.append(" ");
                sb.append(count);
                sb.append(" ");
                sb.append(currentTimeMillis);
                if (currentTimeMillis > 10) {
                    Log.e("LiveMonitor", iComponent.getClass().getSimpleName() + "组件耗时" + currentTimeMillis + "ms过长,请优化");
                }
            }
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onStatusChange(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("defbc957", new Object[]{this, new Integer(i), obj});
            return;
        }
        h4s.c(getComponentClassName(), "onStatusChange");
        if (i == 1 && (obj instanceof TBLiveDataModel) && this.mIsCallDataReceived.compareAndSet(false, true)) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            onDataReceived((TBLiveDataModel) obj);
            o3s.a(TAG, this + "Frame total cost = " + (this.mCreateViewTime + (SystemClock.elapsedRealtime() - elapsedRealtime)));
        }
        h4s.e();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.IComponent
    public void createView(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50080207", new Object[]{this, viewGroup});
            return;
        }
        o3s.a(TAG, this + " 调用 createView(ViewGroup root)");
        h4s.c(getComponentClassName(), "createView_by_view");
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int layoutResId = getLayoutResId();
        if (layoutResId > 0) {
            this.mContainer = LayoutInflater.from(this.mContext).inflate(layoutResId, viewGroup);
        }
        onViewCreated(this.mContainer);
        this.mCreateViewTime = SystemClock.elapsedRealtime() - elapsedRealtime;
        o3s.a(TAG, this + " createView cost = " + this.mCreateViewTime);
        h4s.e();
    }

    public BaseFrame(Context context, ux9 ux9Var) {
        this(context, ux9Var.c);
        this.mFrameContext = ux9Var;
    }

    @Deprecated
    public BaseFrame(Context context, boolean z, TBLiveDataModel tBLiveDataModel) {
        this(context, z);
        this.mLiveDataModel = tBLiveDataModel;
    }

    public BaseFrame(Context context, boolean z, TBLiveDataModel tBLiveDataModel, ux9 ux9Var) {
        this(context, z, tBLiveDataModel);
        this.mFrameContext = ux9Var;
    }
}

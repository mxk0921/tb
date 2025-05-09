package com.taobao.android.live.plugin.atype.flexalocal.tbliveinteractive.room.system_component;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.live.plugin.proxy.tbliveinteractive.IInteractiveProxy;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.message.MessageTypeFilter;
import tb.cpr;
import tb.t2o;
import tb.t54;
import tb.ux9;
import tb.w2r;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class SystemComponentFrameSDK extends BaseFrame {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private cpr.b mMessageListener = new b();
    private w2r mSystemComponentController;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a extends MessageTypeFilter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(SystemComponentFrameSDK systemComponentFrameSDK) {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/tbliveinteractive/room/system_component/SystemComponentFrameSDK$1");
        }

        @Override // com.taobao.taolive.sdk.model.message.MessageTypeFilter
        public boolean filter(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("c81f1ee8", new Object[]{this, new Integer(i)})).booleanValue();
            }
            if (i == 1052 || i == 1053 || i == 11055 || i == 11056) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements cpr.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.gtc
        public void onMessageReceived(int i, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5b152aef", new Object[]{this, new Integer(i), obj});
            } else if (1052 == i || 1053 == i) {
                if (SystemComponentFrameSDK.access$000(SystemComponentFrameSDK.this) != null) {
                    SystemComponentFrameSDK.access$000(SystemComponentFrameSDK.this).m(obj);
                }
            } else if (11055 != i) {
            } else {
                if (SystemComponentFrameSDK.access$000(SystemComponentFrameSDK.this) != null && (obj instanceof String)) {
                    SystemComponentFrameSDK.access$000(SystemComponentFrameSDK.this).l((String) obj);
                } else if (11056 == i && SystemComponentFrameSDK.access$000(SystemComponentFrameSDK.this) != null && (obj instanceof String)) {
                    SystemComponentFrameSDK.access$000(SystemComponentFrameSDK.this).k((String) obj);
                }
            }
        }
    }

    static {
        t2o.a(295699945);
    }

    public SystemComponentFrameSDK(Context context, boolean z, TBLiveDataModel tBLiveDataModel) {
        super(context, z, tBLiveDataModel);
    }

    public static /* synthetic */ w2r access$000(SystemComponentFrameSDK systemComponentFrameSDK) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w2r) ipChange.ipc$dispatch("aa5f20c2", new Object[]{systemComponentFrameSDK});
        }
        return systemComponentFrameSDK.mSystemComponentController;
    }

    private IInteractiveProxy.h getTBLiveInteractiveManager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IInteractiveProxy.h) ipChange.ipc$dispatch("d5cdd132", new Object[]{this});
        }
        ux9 ux9Var = this.mFrameContext;
        if (ux9Var instanceof t54) {
            return ((t54) ux9Var).z0();
        }
        return null;
    }

    public static /* synthetic */ Object ipc$super(SystemComponentFrameSDK systemComponentFrameSDK, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1777320968:
                super.onCreateView2((ViewGroup) objArr[0]);
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -1257959318:
                super.onDidDisappear();
                return null;
            case -553924265:
                super.onStatusChange(((Number) objArr[0]).intValue(), objArr[1]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/tbliveinteractive/room/system_component/SystemComponentFrameSDK");
        }
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        ux9 ux9Var = this.mFrameContext;
        if (!(ux9Var == null || ux9Var.t() == null)) {
            this.mFrameContext.t().a(this.mMessageListener);
        }
        w2r w2rVar = this.mSystemComponentController;
        if (w2rVar != null) {
            w2rVar.c();
            this.mSystemComponentController = null;
        }
        View view = this.mContainer;
        if (view instanceof ViewGroup) {
            ((ViewGroup) view).removeAllViews();
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponent
    public String getComponentName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bb5fe8c7", new Object[]{this});
        }
        return w2r.TAG;
    }

    public void init() {
        TBLiveDataModel tBLiveDataModel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        IInteractiveProxy.h tBLiveInteractiveManager = getTBLiveInteractiveManager();
        if (tBLiveInteractiveManager != null) {
            View view = this.mContainer;
            if ((view instanceof ViewGroup) && (tBLiveDataModel = this.mLiveDataModel) != null) {
                IInteractiveProxy.j x = tBLiveInteractiveManager.x((ViewGroup) view, tBLiveDataModel.mVideoInfo, isLandscape());
                if (x instanceof w2r) {
                    w2r w2rVar = (w2r) x;
                    this.mSystemComponentController = w2rVar;
                    w2rVar.d();
                }
            }
        }
        ux9 ux9Var = this.mFrameContext;
        if (ux9Var != null && ux9Var.t() != null) {
            this.mFrameContext.t().l(this.mMessageListener, new a(this));
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onCreateView(ViewStub viewStub) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3782edd", new Object[]{this, viewStub});
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onCreateView2(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96103bf8", new Object[]{this, viewGroup});
            return;
        }
        super.onCreateView2(viewGroup);
        this.mContainer = viewGroup;
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        destroy();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onDidDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b505106a", new Object[]{this});
            return;
        }
        super.onDidDisappear();
        destroy();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onStatusChange(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("defbc957", new Object[]{this, new Integer(i), obj});
            return;
        }
        super.onStatusChange(i, obj);
        if (i == 1) {
            init();
        }
    }

    public SystemComponentFrameSDK(Context context, boolean z, TBLiveDataModel tBLiveDataModel, ux9 ux9Var) {
        super(context, z, tBLiveDataModel, ux9Var);
    }
}

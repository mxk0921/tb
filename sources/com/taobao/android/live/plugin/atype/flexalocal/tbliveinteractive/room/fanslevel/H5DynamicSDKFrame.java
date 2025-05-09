package com.taobao.android.live.plugin.atype.flexalocal.tbliveinteractive.room.fanslevel;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.live.plugin.proxy.tbliveinteractive.IInteractiveProxy;
import com.taobao.taobao.R;
import com.taobao.taolive.room.openarchitecture.entity.ATaoLiveOpenEntity;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.FandomInfo;
import com.taobao.taolive.sdk.model.common.FandomPreLiveInfo;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import java.util.HashMap;
import tb.b1u;
import tb.cwd;
import tb.czd;
import tb.hjr;
import tb.hw0;
import tb.iba;
import tb.jbu;
import tb.khf;
import tb.pu;
import tb.qoa;
import tb.qvs;
import tb.rbt;
import tb.t2o;
import tb.t54;
import tb.tws;
import tb.ty;
import tb.ukr;
import tb.up6;
import tb.ux9;
import tb.v2s;
import tb.vx9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class H5DynamicSDKFrame extends BaseFrame {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public qoa mH5Container;
    public long setupTime;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements pu.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ long f8682a;

        public a(long j) {
            this.f8682a = j;
        }

        @Override // tb.pu.b
        public void a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b312762d", new Object[]{this, str, str2});
                return;
            }
            View view = H5DynamicSDKFrame.this.mContainer;
            if (view != null) {
                view.setVisibility(8);
            }
            if (hw0.l()) {
                b1u.b(H5DynamicSDKFrame.this.mContext, "errorCode :" + str + "\nerrorMsg :" + str2);
            }
            long j = 0;
            String valueOf = String.valueOf(this.f8682a > 0 ? System.nanoTime() - this.f8682a : 0L);
            if (H5DynamicSDKFrame.this.setupTime > 0) {
                j = System.currentTimeMillis() - H5DynamicSDKFrame.this.setupTime;
            }
            String valueOf2 = String.valueOf(j);
            if (H5DynamicSDKFrame.access$000(H5DynamicSDKFrame.this) instanceof ukr) {
                jbu.d((ukr) H5DynamicSDKFrame.access$000(H5DynamicSDKFrame.this), "h5Render", "renderTime=" + valueOf, "isReloadRender=false", "duration=" + valueOf2, "status=0", "errorMsg=" + str2);
            }
        }

        @Override // tb.pu.b
        public void renderSuccess(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9c8590be", new Object[]{this, view});
                return;
            }
            View view2 = H5DynamicSDKFrame.this.mContainer;
            if (view2 != null) {
                view2.setBackgroundColor(0);
                H5DynamicSDKFrame.this.mContainer.setVisibility(0);
            }
            HashMap hashMap = new HashMap();
            long j = 0;
            String valueOf = String.valueOf(this.f8682a > 0 ? System.nanoTime() - this.f8682a : 0L);
            if (H5DynamicSDKFrame.this.setupTime > 0) {
                j = System.currentTimeMillis() - H5DynamicSDKFrame.this.setupTime;
            }
            String valueOf2 = String.valueOf(j);
            hashMap.put("renderTime", valueOf);
            hashMap.put("isReloadRender", "false");
            if (H5DynamicSDKFrame.access$000(H5DynamicSDKFrame.this) instanceof ukr) {
                jbu.g((ukr) H5DynamicSDKFrame.access$000(H5DynamicSDKFrame.this), "Show-H5DynamicFrame", hashMap);
                jbu.d((ukr) H5DynamicSDKFrame.access$000(H5DynamicSDKFrame.this), "h5Render", "renderTime=" + valueOf, "isReloadRender=false", "duration=" + valueOf2, "status=1");
            }
            v2s.o().A().b(cwd.LOG_TAG, "renderSuccess---renderTime:" + valueOf + " isReloadH5Container:false");
        }
    }

    static {
        t2o.a(295699928);
    }

    public H5DynamicSDKFrame(Context context, boolean z, TBLiveDataModel tBLiveDataModel, ux9 ux9Var) {
        super(context, z, tBLiveDataModel, ux9Var);
    }

    public static /* synthetic */ IInteractiveProxy.h access$000(H5DynamicSDKFrame h5DynamicSDKFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IInteractiveProxy.h) ipChange.ipc$dispatch("58cbe747", new Object[]{h5DynamicSDKFrame});
        }
        return h5DynamicSDKFrame.getTBLiveInteractiveManager();
    }

    private void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        jbu.a("VideoAdapterFrame", "H5DynamicSDKFrame destroy");
        qoa qoaVar = this.mH5Container;
        if (qoaVar != null) {
            qoaVar.i();
            this.mH5Container = null;
        }
        View view = this.mContainer;
        if (view instanceof ViewGroup) {
            ((ViewGroup) view).removeAllViews();
        }
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

    public static /* synthetic */ Object ipc$super(H5DynamicSDKFrame h5DynamicSDKFrame, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -1257959318:
                super.onDidDisappear();
                return null;
            case -1073179481:
                super.onFreezeLayout();
                return null;
            case -908767872:
                super.onUnfreezeLayout();
                return null;
            case -553924265:
                super.onStatusChange(((Number) objArr[0]).intValue(), objArr[1]);
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 1659846701:
                super.onScrollStateChanged(((Number) objArr[0]).intValue());
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/tbliveinteractive/room/fanslevel/H5DynamicSDKFrame");
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponent
    public String getComponentName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bb5fe8c7", new Object[]{this});
        }
        return "dynamic_h5_sdk";
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onCreateView(ViewStub viewStub) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3782edd", new Object[]{this, viewStub});
        } else if (viewStub != null) {
            viewStub.setLayoutResource(R.layout.taolive_fansrights_bubble_flexalocal);
            this.mContainer = viewStub.inflate();
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        qoa qoaVar = this.mH5Container;
        if (qoaVar != null) {
            qoaVar.R();
        }
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

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onFreezeLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c00894a7", new Object[]{this});
        } else {
            super.onFreezeLayout();
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        qoa qoaVar = this.mH5Container;
        if (qoaVar != null) {
            qoaVar.j();
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        qoa qoaVar = this.mH5Container;
        if (qoaVar != null) {
            qoaVar.m();
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.taolive.sdk.controller.IComponentLifeCycle2
    public void onScrollStateChanged(int i) {
        IInteractiveProxy.h tBLiveInteractiveManager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62ef402d", new Object[]{this, new Integer(i)});
            return;
        }
        super.onScrollStateChanged(i);
        if (!tws.m()) {
            return;
        }
        if (i == 1) {
            IInteractiveProxy.h tBLiveInteractiveManager2 = getTBLiveInteractiveManager();
            if (tBLiveInteractiveManager2 != null) {
                tBLiveInteractiveManager2.o("TBLiveWVPlugin.Event.liveroom.h5_onTouchScroll_DRAGGING", "");
            }
        } else if (i == 0 && (tBLiveInteractiveManager = getTBLiveInteractiveManager()) != null) {
            tBLiveInteractiveManager.o("TBLiveWVPlugin.Event.liveroom.h5_onTouchScroll_IDLE", "");
        }
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
            setupView();
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onUnfreezeLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9d54d80", new Object[]{this});
        } else {
            super.onUnfreezeLayout();
        }
    }

    private void setupView() {
        int i;
        int i2;
        ATaoLiveOpenEntity A;
        czd czdVar;
        ty tyVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7423b649", new Object[]{this});
            return;
        }
        ux9 ux9Var = this.mFrameContext;
        if (ux9Var == null || (A = ux9Var.A()) == null || (czdVar = A.uiCompontent) == null || !(((rbt) czdVar).b() instanceof ty) || (tyVar = (ty) ((rbt) A.uiCompontent).b()) == null) {
            i2 = 0;
            i = 0;
        } else {
            Float b = tyVar.b();
            i = b != null ? b.intValue() : 0;
            Float a2 = tyVar.a();
            i2 = a2 != null ? a2.intValue() : 0;
        }
        View view = this.mContainer;
        if (view != null) {
            view.setPadding(0, i, 0, i2);
        }
        this.setupTime = System.currentTimeMillis();
        IInteractiveProxy.h tBLiveInteractiveManager = getTBLiveInteractiveManager();
        if (tBLiveInteractiveManager instanceof ukr) {
            ukr ukrVar = (ukr) tBLiveInteractiveManager;
            ukrVar.e0().f(this.mFrameContext);
            if (ukrVar.q() != null) {
                ((khf) ukrVar.q()).l();
            }
            VideoInfo c0 = up6.c0(this.mFrameContext);
            FandomInfo A2 = up6.A(this.mLiveDataModel, this.mFrameContext);
            String str = null;
            if (c0 != null) {
                str = c0.liveId;
                VideoInfo.DynamicRender dynamicRender = c0.dynamicRender;
                if (dynamicRender != null) {
                    str = dynamicRender.h5DynamicRenderUrl;
                }
            } else if (A2 != null) {
                FandomPreLiveInfo j = up6.j(this.mFrameContext);
                if (j != null) {
                    str = j.liveId;
                }
                str = A2.h5DynamicRenderUrl;
            } else {
                str = null;
            }
            if (qvs.P()) {
                str = hjr.A("taolive", "MockH5DynamicRenderUrl", "mockH5DynamicRenderUrl", str);
            }
            IInteractiveProxy.d S = ukrVar.S((ViewGroup) this.mContainer, iba.B(vx9.f(this.mFrameContext)), str);
            if (S instanceof qoa) {
                qoa qoaVar = (qoa) S;
                this.mH5Container = qoaVar;
                qoaVar.s(ukrVar.X());
                this.mH5Container.r(ukrVar.W());
                this.mH5Container.n(new a(System.nanoTime()));
                this.mH5Container.o(str);
                v2s.o().A().b(cwd.LOG_TAG, "H5ContainerRender---" + str + " url---" + str);
            }
        }
    }
}

package com.taobao.taolive.room.mediaplatform;

import android.content.Context;
import android.view.ViewStub;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.live.plugin.proxy.tbliveinteractive.IInteractiveProxy;
import com.taobao.taolive.room.mediaplatform.container.h5.TBLiveBaseWVPlugin;
import com.taobao.taolive.room.mediaplatform.container.h5.TBLiveGoodsWVPlugin;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import tb.b0d;
import tb.bl9;
import tb.d9m;
import tb.fsw;
import tb.o3s;
import tb.t2o;
import tb.t54;
import tb.ux9;
import tb.v2s;
import tb.w2s;
import tb.x5t;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class MediaPlatformFrame extends BaseFrame implements b0d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ACCESS_POINT_MESSAGE = "message";
    private static final String ACCESS_POINT_MESSINFO = "messinfo";
    private static final String ACCESS_POINT_URL = "url";
    private static final String TAG;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a implements bl9.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.bl9.b
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9bef331", new Object[]{this});
            } else {
                MediaPlatformFrame.access$000();
            }
        }
    }

    static {
        t2o.a(779092972);
        t2o.a(806355932);
        if (v2s.o().I("JSBridge")) {
            try {
                if (d9m.p().getWvApiClassMap(IInteractiveProxy.KEY_TB_LIVE_WV_PLUGIN) != null) {
                    fsw.i(IInteractiveProxy.KEY_TB_LIVE_WV_PLUGIN, d9m.p().getWvApiClassMap(IInteractiveProxy.KEY_TB_LIVE_WV_PLUGIN), true);
                }
                if (w2s.j() && d9m.p().getWvApiClassMap("TBLiveOnlyDebugWVPlugin") != null) {
                    fsw.i("TBLiveOnlyDebugWVPlugin", d9m.p().getWvApiClassMap("TBLiveOnlyDebugWVPlugin"), true);
                }
            } catch (Throwable th) {
                x5t.d("MediaPlatformFrame", th.getMessage());
            }
            fsw.i("TBLiveBaseWVPlugin", TBLiveBaseWVPlugin.class, true);
            fsw.i("TBLiveGoodsWVPlugin", TBLiveGoodsWVPlugin.class, true);
            try {
                if (bl9.g().b()) {
                    appLinkRegisterPluginInner();
                } else {
                    bl9.g().i(new a());
                }
            } catch (Throwable th2) {
                o3s.b("MediaPlatformFrame", "[<clinit>] error: " + th2.getMessage());
            }
        }
        TAG = MediaPlatformFrame.class.getSimpleName();
    }

    @Deprecated
    public MediaPlatformFrame(Context context, boolean z, TBLiveDataModel tBLiveDataModel) {
        super(context, z, tBLiveDataModel);
    }

    public static /* synthetic */ void access$000() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcd60777", new Object[0]);
        } else {
            appLinkRegisterPluginInner();
        }
    }

    private static void appLinkRegisterPluginInner() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1660d08c", new Object[0]);
        } else if (d9m.k() != null) {
            try {
                d9m.k().appLinkRegisterPlugin();
            } catch (Throwable th) {
                String str = TAG;
                o3s.b(str, "[appLinkRegisterPluginInner] error: " + th.getMessage());
            }
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

    public static /* synthetic */ Object ipc$super(MediaPlatformFrame mediaPlatformFrame, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1512649357) {
            super.onResume();
            return null;
        } else if (hashCode == 797441118) {
            super.onPause();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/taolive/room/mediaplatform/MediaPlatformFrame");
        }
    }

    public void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        ux9 ux9Var = this.mFrameContext;
        if (ux9Var != null && ux9Var.q() != null) {
            this.mFrameContext.q().d(this);
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onCreateView(ViewStub viewStub) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3782edd", new Object[]{this, viewStub});
        } else {
            init();
        }
    }

    @Override // tb.b0d
    public void onError(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
        } else {
            super.onPause();
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
        } else {
            super.onResume();
        }
    }

    @Override // tb.b0d
    public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
        } else {
            v2s.o().A().a(TAG, "getMessInfo success------");
        }
    }

    @Override // tb.b0d
    public void onSystemError(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
        }
    }

    public MediaPlatformFrame(Context context, boolean z, TBLiveDataModel tBLiveDataModel, ux9 ux9Var) {
        super(context, z, tBLiveDataModel, ux9Var);
    }
}

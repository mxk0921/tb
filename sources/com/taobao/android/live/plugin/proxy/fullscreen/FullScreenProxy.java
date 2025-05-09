package com.taobao.android.live.plugin.proxy.fullscreen;

import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.live.plugin.atype.flexalocal.proxy.FullScreenProxyX;
import com.taobao.android.live.plugin.proxy.FlexaLiveX;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import java.util.Map;
import tb.k2n;
import tb.t2o;
import tb.ux9;
import tb.v3d;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class FullScreenProxy extends k2n<IFullScreenProxy> implements IFullScreenProxy {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "FullScreenProxy";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final FullScreenProxy f8746a = new FullScreenProxy();

        static {
            t2o.a(806355146);
        }

        public static /* synthetic */ FullScreenProxy a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (FullScreenProxy) ipChange.ipc$dispatch("19b68bbd", new Object[0]);
            }
            return f8746a;
        }
    }

    static {
        t2o.a(806355144);
        t2o.a(806355147);
    }

    public static FullScreenProxy getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FullScreenProxy) ipChange.ipc$dispatch("c682d217", new Object[0]);
        }
        return b.a();
    }

    public static /* synthetic */ Object ipc$super(FullScreenProxy fullScreenProxy, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/proxy/fullscreen/FullScreenProxy");
    }

    @Override // com.taobao.android.live.plugin.proxy.fullscreen.IFullScreenProxy
    public BaseFrame createFullScreenLiveFrame2(Context context, boolean z, TBLiveDataModel tBLiveDataModel, ux9 ux9Var) {
        BaseFrame baseFrame;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseFrame) ipChange.ipc$dispatch("7aa60476", new Object[]{this, context, new Boolean(z), tBLiveDataModel, ux9Var});
        }
        IFullScreenProxy real = getReal();
        if (real != null) {
            baseFrame = real.createFullScreenLiveFrame2(context, z, tBLiveDataModel, ux9Var);
        } else {
            baseFrame = null;
        }
        FlexaLiveX.w("[FullScreenProxy#createFullScreenLiveFrame2]  value: " + baseFrame);
        return baseFrame;
    }

    @Override // com.taobao.android.live.plugin.proxy.fullscreen.IFullScreenProxy
    public BaseFrame createFullScreenReplayFrame2(Context context, boolean z, TBLiveDataModel tBLiveDataModel, ux9 ux9Var) {
        BaseFrame baseFrame;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseFrame) ipChange.ipc$dispatch("492b5c71", new Object[]{this, context, new Boolean(z), tBLiveDataModel, ux9Var});
        }
        IFullScreenProxy real = getReal();
        if (real != null) {
            baseFrame = real.createFullScreenReplayFrame2(context, z, tBLiveDataModel, ux9Var);
        } else {
            baseFrame = null;
        }
        FlexaLiveX.w("[FullScreenProxy#createFullScreenReplayFrame2]  value: " + baseFrame);
        return baseFrame;
    }

    @Override // com.taobao.android.live.plugin.proxy.fullscreen.IFullScreenProxy
    public BaseFrame createInteractBizCenterFrame(Context context, ux9 ux9Var) {
        BaseFrame baseFrame;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseFrame) ipChange.ipc$dispatch("6355e82c", new Object[]{this, context, ux9Var});
        }
        IFullScreenProxy real = getReal();
        if (real != null) {
            baseFrame = real.createInteractBizCenterFrame(context, ux9Var);
        } else {
            baseFrame = null;
        }
        FlexaLiveX.w("[FullScreenProxy#createInteractBizCenterFrame]  value: " + baseFrame);
        return baseFrame;
    }

    @Override // com.taobao.android.live.plugin.proxy.fullscreen.IFullScreenProxy
    public v3d createLiveRoomOpenPushManager(Context context) {
        v3d v3dVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (v3d) ipChange.ipc$dispatch("40e542c3", new Object[]{this, context});
        }
        IFullScreenProxy real = getReal();
        if (real != null) {
            v3dVar = real.createLiveRoomOpenPushManager(context);
        } else {
            v3dVar = null;
        }
        FlexaLiveX.w("[FullScreenProxy#createLiveRoomOpenPushManager]  value: " + v3dVar);
        return v3dVar;
    }

    @Override // tb.k2n
    public String getIProxyKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c6fa8b95", new Object[]{this});
        }
        return IFullScreenProxy.KEY;
    }

    @Override // tb.k2n
    public String getLocalClassName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("48c0fdcb", new Object[]{this});
        }
        return "com.taobao.android.live.plugin.atype.flexalocal.proxy.FullScreenProxyX";
    }

    @Override // tb.k2n
    public String getOrangeKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9d3bd33e", new Object[]{this});
        }
        return "installLiveFullScreenPlugin";
    }

    @Override // com.taobao.android.live.plugin.proxy.fullscreen.IFullScreenProxy
    public Map<String, Integer> getRealRIdMap() {
        Map<String, Integer> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("45ea97df", new Object[]{this});
        }
        IFullScreenProxy real = getReal();
        if (real != null) {
            map = real.getRealRIdMap();
        } else {
            map = null;
        }
        FlexaLiveX.w("[FullScreenProxy#getRealRIdMap]  value: " + map);
        return map;
    }

    @Override // tb.k2n
    public String getTrackName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c86a5339", new Object[]{this});
        }
        return "直播间布局框架";
    }

    @Override // com.taobao.android.live.plugin.proxy.fullscreen.IFullScreenProxy
    public boolean isInstanceOfFullScreenFrame(Object obj) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8a6f1503", new Object[]{this, obj})).booleanValue();
        }
        IFullScreenProxy real = getReal();
        if (real != null) {
            z = real.isInstanceOfFullScreenFrame(obj);
        }
        FlexaLiveX.w("[FullScreenProxy#isInstanceOfFullScreenFrame]  value: " + z);
        return z;
    }

    @Override // com.taobao.android.live.plugin.proxy.fullscreen.IFullScreenProxy
    public boolean isInstanceOfFullScreenLiveFrame2(Object obj) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("26ecd109", new Object[]{this, obj})).booleanValue();
        }
        IFullScreenProxy real = getReal();
        if (real != null) {
            z = real.isInstanceOfFullScreenLiveFrame2(obj);
        }
        FlexaLiveX.w("[FullScreenProxy#isInstanceOfFullScreenLiveFrame2]  value: " + z);
        return z;
    }

    @Override // com.taobao.android.live.plugin.proxy.fullscreen.IFullScreenProxy
    public boolean isInstanceOfFullScreenReplayFrame2(Object obj) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2c0e8944", new Object[]{this, obj})).booleanValue();
        }
        IFullScreenProxy real = getReal();
        if (real != null) {
            z = real.isInstanceOfFullScreenReplayFrame2(obj);
        }
        FlexaLiveX.w("[FullScreenProxy#isInstanceOfFullScreenReplayFrame2]  value: " + z);
        return z;
    }

    private FullScreenProxy() {
        try {
            initAType();
        } catch (Throwable th) {
            FlexaLiveX.w("[FullScreenProxy<init>] error: " + th.getMessage());
        }
    }

    @Override // tb.k2n
    public <ProxyType extends IFullScreenProxy> ProxyType createLocalFromTpl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ProxyType) ((IFullScreenProxy) ipChange.ipc$dispatch("5e7083d6", new Object[]{this})) : new FullScreenProxyX();
    }
}

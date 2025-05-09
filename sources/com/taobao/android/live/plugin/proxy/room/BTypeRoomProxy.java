package com.taobao.android.live.plugin.proxy.room;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.live.plugin.btype.flexaremote.proxy.BTypeRoomProxyX;
import com.taobao.android.live.plugin.proxy.FlexaLiveX;
import com.taobao.android.live.plugin.proxy.room.IBTypeRoomProxy;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import tb.b0d;
import tb.k2n;
import tb.o7c;
import tb.t2o;
import tb.ux9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class BTypeRoomProxy extends k2n<IBTypeRoomProxy> implements IBTypeRoomProxy {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "BTypeRoomProxy";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final BTypeRoomProxy f8766a = new BTypeRoomProxy();

        static {
            t2o.a(806355238);
        }

        public static /* synthetic */ BTypeRoomProxy a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (BTypeRoomProxy) ipChange.ipc$dispatch("65b9956f", new Object[0]);
            }
            return f8766a;
        }
    }

    static {
        t2o.a(806355236);
        t2o.a(806355239);
    }

    public static BTypeRoomProxy getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BTypeRoomProxy) ipChange.ipc$dispatch("67646055", new Object[0]);
        }
        return b.a();
    }

    public static /* synthetic */ Object ipc$super(BTypeRoomProxy bTypeRoomProxy, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/proxy/room/BTypeRoomProxy");
    }

    @Override // com.taobao.android.live.plugin.proxy.room.IBTypeRoomProxy
    public void adjustBBConnectionVideoSize(Context context, ux9 ux9Var, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5c35aa4", new Object[]{this, context, ux9Var, str});
            return;
        }
        IBTypeRoomProxy real = getReal();
        if (real != null) {
            real.adjustBBConnectionVideoSize(context, ux9Var, str);
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.room.IBTypeRoomProxy
    public boolean checkFollowFromCache(String str) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5e850874", new Object[]{this, str})).booleanValue();
        }
        IBTypeRoomProxy real = getReal();
        if (real != null) {
            z = real.checkFollowFromCache(str);
        }
        FlexaLiveX.w("[BTypeRoomProxy#checkFollowFromCache]  value: " + z);
        return z;
    }

    @Override // com.taobao.android.live.plugin.proxy.room.IBTypeRoomProxy
    public BaseFrame createConnectionFrame(Context context, boolean z, TBLiveDataModel tBLiveDataModel, ux9 ux9Var, ViewStub viewStub) {
        BaseFrame baseFrame;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseFrame) ipChange.ipc$dispatch("de28917", new Object[]{this, context, new Boolean(z), tBLiveDataModel, ux9Var, viewStub});
        }
        IBTypeRoomProxy real = getReal();
        if (real != null) {
            baseFrame = real.createConnectionFrame(context, z, tBLiveDataModel, ux9Var, viewStub);
        } else {
            baseFrame = null;
        }
        FlexaLiveX.w("[BTypeRoomProxy#createConnectionFrame]  value: " + baseFrame);
        return baseFrame;
    }

    @Override // com.taobao.android.live.plugin.proxy.room.IBTypeRoomProxy
    public BaseFrame createDecelerationZoneFrame(Context context, boolean z, TBLiveDataModel tBLiveDataModel, ux9 ux9Var) {
        BaseFrame baseFrame;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseFrame) ipChange.ipc$dispatch("68a592d4", new Object[]{this, context, new Boolean(z), tBLiveDataModel, ux9Var});
        }
        IBTypeRoomProxy real = getReal();
        if (real != null) {
            baseFrame = real.createDecelerationZoneFrame(context, z, tBLiveDataModel, ux9Var);
        } else {
            baseFrame = null;
        }
        FlexaLiveX.w("[BTypeRoomProxy#createDecelerationZoneFrame]  value: " + baseFrame);
        return baseFrame;
    }

    @Override // com.taobao.android.live.plugin.proxy.room.IBTypeRoomProxy
    public IBTypeRoomProxy.AbsFavorCountFrame createFavorCountFrame(Context context, long j, String str, boolean z, ViewStub viewStub) {
        IBTypeRoomProxy.AbsFavorCountFrame absFavorCountFrame;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IBTypeRoomProxy.AbsFavorCountFrame) ipChange.ipc$dispatch("74b208d3", new Object[]{this, context, new Long(j), str, new Boolean(z), viewStub});
        }
        IBTypeRoomProxy real = getReal();
        if (real != null) {
            absFavorCountFrame = real.createFavorCountFrame(context, j, str, z, viewStub);
        } else {
            absFavorCountFrame = null;
        }
        FlexaLiveX.w("[BTypeRoomProxy#createFavorCountFrame]  value: " + absFavorCountFrame);
        return absFavorCountFrame;
    }

    @Override // com.taobao.android.live.plugin.proxy.room.IBTypeRoomProxy
    public BaseFrame createNonageFrame(Context context, boolean z, TBLiveDataModel tBLiveDataModel, ux9 ux9Var) {
        BaseFrame baseFrame;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseFrame) ipChange.ipc$dispatch("a3841c8d", new Object[]{this, context, new Boolean(z), tBLiveDataModel, ux9Var});
        }
        IBTypeRoomProxy real = getReal();
        if (real != null) {
            baseFrame = real.createNonageFrame(context, z, tBLiveDataModel, ux9Var);
        } else {
            baseFrame = null;
        }
        FlexaLiveX.w("[BTypeRoomProxy#createNonageFrame]  value: " + baseFrame);
        return baseFrame;
    }

    @Override // com.taobao.android.live.plugin.proxy.room.IBTypeRoomProxy
    public BaseFrame createPrivateVipFrame(Context context, boolean z, TBLiveDataModel tBLiveDataModel, ViewStub viewStub) {
        BaseFrame baseFrame;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseFrame) ipChange.ipc$dispatch("76493afb", new Object[]{this, context, new Boolean(z), tBLiveDataModel, viewStub});
        }
        IBTypeRoomProxy real = getReal();
        if (real != null) {
            baseFrame = real.createPrivateVipFrame(context, z, tBLiveDataModel, viewStub);
        } else {
            baseFrame = null;
        }
        FlexaLiveX.w("[BTypeRoomProxy#createPrivateVipFrame]  value: " + baseFrame);
        return baseFrame;
    }

    @Override // com.taobao.android.live.plugin.proxy.room.IBTypeRoomProxy
    public BaseFrame createRankFrame(Context context, ux9 ux9Var) {
        BaseFrame baseFrame;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseFrame) ipChange.ipc$dispatch("25b93de", new Object[]{this, context, ux9Var});
        }
        IBTypeRoomProxy real = getReal();
        if (real != null) {
            baseFrame = real.createRankFrame(context, ux9Var);
        } else {
            baseFrame = null;
        }
        FlexaLiveX.w("[BTypeRoomProxy#createRankFrame]  value: " + baseFrame);
        return baseFrame;
    }

    @Override // com.taobao.android.live.plugin.proxy.room.IBTypeRoomProxy
    public BaseFrame createRightBackwardTipsFrame(Context context, boolean z, TBLiveDataModel tBLiveDataModel, ux9 ux9Var) {
        BaseFrame baseFrame;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseFrame) ipChange.ipc$dispatch("e3c25e80", new Object[]{this, context, new Boolean(z), tBLiveDataModel, ux9Var});
        }
        IBTypeRoomProxy real = getReal();
        if (real != null) {
            baseFrame = real.createRightBackwardTipsFrame(context, z, tBLiveDataModel, ux9Var);
        } else {
            baseFrame = null;
        }
        FlexaLiveX.w("[BTypeRoomProxy#createRightBackwardTipsFrame]  value: " + baseFrame);
        return baseFrame;
    }

    @Override // com.taobao.android.live.plugin.proxy.room.IBTypeRoomProxy
    public BaseFrame createSubscribeCardFrame(Context context, boolean z, TBLiveDataModel tBLiveDataModel, View view, ViewGroup viewGroup) {
        BaseFrame baseFrame;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseFrame) ipChange.ipc$dispatch("40f1c6f0", new Object[]{this, context, new Boolean(z), tBLiveDataModel, view, viewGroup});
        }
        IBTypeRoomProxy real = getReal();
        if (real != null) {
            baseFrame = real.createSubscribeCardFrame(context, z, tBLiveDataModel, view, viewGroup);
        } else {
            baseFrame = null;
        }
        FlexaLiveX.w("[BTypeRoomProxy#createSubscribeCardFrame]  value: " + baseFrame);
        return baseFrame;
    }

    @Override // com.taobao.android.live.plugin.proxy.room.IBTypeRoomProxy
    public o7c createTBFollowBusiness(b0d b0dVar) {
        o7c o7cVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (o7c) ipChange.ipc$dispatch("4ab5c22b", new Object[]{this, b0dVar});
        }
        IBTypeRoomProxy real = getReal();
        if (real != null) {
            o7cVar = real.createTBFollowBusiness(b0dVar);
        } else {
            o7cVar = null;
        }
        FlexaLiveX.w("[BTypeRoomProxy#createTBFollowBusiness]  value: " + o7cVar);
        return o7cVar;
    }

    @Override // com.taobao.android.live.plugin.proxy.room.IBTypeRoomProxy
    public o7c createTBFollowGuangBusiness(b0d b0dVar) {
        o7c o7cVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (o7c) ipChange.ipc$dispatch("4df5a21", new Object[]{this, b0dVar});
        }
        IBTypeRoomProxy real = getReal();
        if (real != null) {
            o7cVar = real.createTBFollowGuangBusiness(b0dVar);
        } else {
            o7cVar = null;
        }
        FlexaLiveX.w("[BTypeRoomProxy#createTBFollowGuangBusiness]  value: " + o7cVar);
        return o7cVar;
    }

    @Override // com.taobao.android.live.plugin.proxy.room.IBTypeRoomProxy
    public IBTypeRoomProxy.c createTBLiveFollowBusiness(String str, int i, String str2, IBTypeRoomProxy.d dVar) {
        IBTypeRoomProxy.c cVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IBTypeRoomProxy.c) ipChange.ipc$dispatch("5890f251", new Object[]{this, str, new Integer(i), str2, dVar});
        }
        IBTypeRoomProxy real = getReal();
        if (real != null) {
            cVar = real.createTBLiveFollowBusiness(str, i, str2, dVar);
        } else {
            cVar = null;
        }
        FlexaLiveX.w("[BTypeRoomProxy#createTBLiveFollowBusiness]  value: " + cVar);
        return cVar;
    }

    @Override // com.taobao.android.live.plugin.proxy.room.IBTypeRoomProxy
    public IBTypeRoomProxy.a getBackwardX() {
        IBTypeRoomProxy.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IBTypeRoomProxy.a) ipChange.ipc$dispatch("a1e8dd68", new Object[]{this});
        }
        IBTypeRoomProxy real = getReal();
        if (real != null) {
            aVar = real.getBackwardX();
        } else {
            aVar = null;
        }
        FlexaLiveX.w("[BTypeRoomProxy#getBackwardX]  value: " + aVar);
        return aVar;
    }

    @Override // com.taobao.android.live.plugin.proxy.room.IBTypeRoomProxy
    public Class<? extends BaseFrame> getFrameClassMap(String str) {
        Class<? extends BaseFrame> cls;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("3ad7fa99", new Object[]{this, str});
        }
        IBTypeRoomProxy real = getReal();
        if (real != null) {
            cls = real.getFrameClassMap(str);
        } else {
            cls = null;
        }
        FlexaLiveX.w("[BTypeRoomProxy#getFrameClassMap]  clazz: " + cls);
        return cls;
    }

    @Override // tb.k2n
    public String getIProxyKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c6fa8b95", new Object[]{this});
        }
        return IBTypeRoomProxy.KEY;
    }

    @Override // tb.k2n
    public String getLocalClassName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("48c0fdcb", new Object[]{this});
        }
        return "com.taobao.android.live.plugin.btype.flexaremote.proxy.BTypeRoomProxyX";
    }

    @Override // com.taobao.android.live.plugin.proxy.room.IBTypeRoomProxy
    public IBTypeRoomProxy.b getNonageServiceX() {
        IBTypeRoomProxy.b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IBTypeRoomProxy.b) ipChange.ipc$dispatch("694b5e90", new Object[]{this});
        }
        IBTypeRoomProxy real = getReal();
        if (real != null) {
            bVar = real.getNonageServiceX();
        } else {
            bVar = null;
        }
        FlexaLiveX.w("[BTypeRoomProxy#getNonageServiceX]  value: " + bVar);
        return bVar;
    }

    @Override // tb.k2n
    public String getOrangeKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9d3bd33e", new Object[]{this});
        }
        return null;
    }

    @Override // tb.k2n
    public String getTrackName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c86a5339", new Object[]{this});
        }
        return "直播间其它 BType 功能";
    }

    @Override // com.taobao.android.live.plugin.proxy.room.IBTypeRoomProxy
    public void initBTypeOtherFrame(BaseFrame baseFrame, Context context, boolean z, TBLiveDataModel tBLiveDataModel, ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51974307", new Object[]{this, baseFrame, context, new Boolean(z), tBLiveDataModel, ux9Var});
            return;
        }
        IBTypeRoomProxy real = getReal();
        if (real != null) {
            real.initBTypeOtherFrame(baseFrame, context, z, tBLiveDataModel, ux9Var);
        }
        FlexaLiveX.w("[BTypeRoomProxy#initBTypeOtherFrame]");
    }

    @Override // com.taobao.android.live.plugin.proxy.room.IBTypeRoomProxy
    public void updateFollow(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65b1ef49", new Object[]{this, str, new Boolean(z)});
            return;
        }
        IBTypeRoomProxy real = getReal();
        if (real != null) {
            real.updateFollow(str, z);
        }
        FlexaLiveX.w("[BTypeRoomProxy#updateFollow]");
    }

    private BTypeRoomProxy() {
        try {
            initBType();
        } catch (Throwable th) {
            FlexaLiveX.w("[BTypeRoomProxy<init>] error: " + th.getMessage());
        }
    }

    @Override // tb.k2n
    public <ProxyType extends IBTypeRoomProxy> ProxyType createLocalFromTpl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ProxyType) ((IBTypeRoomProxy) ipChange.ipc$dispatch("7146f5f6", new Object[]{this})) : new BTypeRoomProxyX();
    }

    @Override // com.taobao.android.live.plugin.proxy.room.IBTypeRoomProxy
    public boolean checkFollowFromCache(String str, IBTypeRoomProxy.d dVar) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4aad3868", new Object[]{this, str, dVar})).booleanValue();
        }
        IBTypeRoomProxy real = getReal();
        if (real != null) {
            z = real.checkFollowFromCache(str, dVar);
        }
        FlexaLiveX.w("[BTypeRoomProxy#checkFollowFromCache]  value: " + z);
        return z;
    }
}

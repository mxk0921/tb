package com.taobao.android.live.plugin.proxy.bottom;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.live.plugin.atype.flexalocal.proxy.BottomProxyX;
import com.taobao.android.live.plugin.proxy.FlexaLiveX;
import com.taobao.android.live.plugin.proxy.bottom.IBottomProxy;
import java.util.HashMap;
import java.util.Map;
import tb.c7m;
import tb.k2n;
import tb.pcc;
import tb.t2o;
import tb.ux9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class BottomProxy extends k2n<IBottomProxy> implements IBottomProxy {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "BottomProxy";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final BottomProxy f8742a = new BottomProxy();

        static {
            t2o.a(806355126);
        }

        public static /* synthetic */ BottomProxy a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (BottomProxy) ipChange.ipc$dispatch("74a2c49d", new Object[0]);
            }
            return f8742a;
        }
    }

    static {
        t2o.a(806355124);
        t2o.a(806355127);
    }

    public static BottomProxy getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BottomProxy) ipChange.ipc$dispatch("32a004f7", new Object[0]);
        }
        return b.a();
    }

    public static /* synthetic */ Object ipc$super(BottomProxy bottomProxy, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/proxy/bottom/BottomProxy");
    }

    @Override // com.taobao.android.live.plugin.proxy.bottom.IBottomProxy
    public BaseFrame createBottomBarFrame3(Context context, ux9 ux9Var, ViewStub viewStub) {
        BaseFrame baseFrame;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseFrame) ipChange.ipc$dispatch("732b63a7", new Object[]{this, context, ux9Var, viewStub});
        }
        IBottomProxy real = getReal();
        if (real != null) {
            baseFrame = real.createBottomBarFrame3(context, ux9Var, viewStub);
        } else {
            baseFrame = null;
        }
        FlexaLiveX.w("[BottomProxy#createBottomBarFrame3]  value: " + baseFrame);
        return baseFrame;
    }

    @Override // com.taobao.android.live.plugin.proxy.bottom.IBottomProxy
    public BaseFrame createHighlightBottomBarFrame(Context context, ux9 ux9Var, ViewStub viewStub, pcc pccVar, JSONObject jSONObject, c7m c7mVar, View view) {
        BaseFrame baseFrame;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseFrame) ipChange.ipc$dispatch("b657161e", new Object[]{this, context, ux9Var, viewStub, pccVar, jSONObject, c7mVar, view});
        }
        IBottomProxy real = getReal();
        if (real != null) {
            baseFrame = real.createHighlightBottomBarFrame(context, ux9Var, viewStub, pccVar, jSONObject, c7mVar, view);
        } else {
            baseFrame = null;
        }
        FlexaLiveX.w("[BottomProxy#createHighlightBottomBarFrame]  value: " + baseFrame);
        return baseFrame;
    }

    @Override // com.taobao.android.live.plugin.proxy.bottom.IBottomProxy
    public BaseFrame createReplayBottomBarFrame(Context context, ux9 ux9Var, ViewStub viewStub) {
        BaseFrame baseFrame;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseFrame) ipChange.ipc$dispatch("2ff1bb1d", new Object[]{this, context, ux9Var, viewStub});
        }
        IBottomProxy real = getReal();
        if (real != null) {
            baseFrame = real.createReplayBottomBarFrame(context, ux9Var, viewStub);
        } else {
            baseFrame = null;
        }
        FlexaLiveX.w("[BottomProxy#createReplayBottomBarFrame]  value: " + baseFrame);
        return baseFrame;
    }

    @Override // com.taobao.android.live.plugin.proxy.bottom.IBottomProxy
    public IBottomProxy.a createShareFission() {
        IBottomProxy.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IBottomProxy.a) ipChange.ipc$dispatch("850dd7c0", new Object[]{this});
        }
        IBottomProxy real = getReal();
        if (real != null) {
            aVar = real.createShareFission();
        } else {
            aVar = null;
        }
        FlexaLiveX.w("[BottomProxy#createShareFission]  value: " + aVar);
        return aVar;
    }

    @Override // com.taobao.android.live.plugin.proxy.bottom.IBottomProxy
    public int getBottomBarBottomDP() {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ffdab543", new Object[]{this})).intValue();
        }
        IBottomProxy real = getReal();
        if (real != null) {
            i = real.getBottomBarBottomDP();
        }
        FlexaLiveX.w("[BottomProxy#getBottomBarBottomDP]  value: " + i);
        return i;
    }

    @Override // com.taobao.android.live.plugin.proxy.bottom.IBottomProxy
    public int getBottomBarLeftDP() {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c29ad29f", new Object[]{this})).intValue();
        }
        IBottomProxy real = getReal();
        if (real != null) {
            i = real.getBottomBarLeftDP();
        }
        FlexaLiveX.w("[BottomProxy#getBottomBarLeftDP]  value: " + i);
        return i;
    }

    @Override // com.taobao.android.live.plugin.proxy.bottom.IBottomProxy
    public Class<? extends BaseFrame> getFrameClassMap(String str) {
        Class<? extends BaseFrame> cls;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("3ad7fa99", new Object[]{this, str});
        }
        IBottomProxy real = getReal();
        if (real != null) {
            cls = real.getFrameClassMap(str);
        } else {
            cls = null;
        }
        FlexaLiveX.w("[BottomProxy#getFrameClassMap]  value: " + cls);
        return cls;
    }

    @Override // tb.k2n
    public String getIProxyKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c6fa8b95", new Object[]{this});
        }
        return IBottomProxy.KEY;
    }

    @Override // com.taobao.android.live.plugin.proxy.bottom.IBottomProxy
    public Map<String, Integer> getIdMap() {
        Map<String, Integer> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("5f99e47", new Object[]{this});
        }
        IBottomProxy real = getReal();
        if (real != null) {
            map = real.getIdMap();
        } else {
            map = new HashMap<>();
        }
        FlexaLiveX.w("[BottomProxy#getIdMap]  value: " + map);
        return map;
    }

    @Override // tb.k2n
    public String getLocalClassName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("48c0fdcb", new Object[]{this});
        }
        return "com.taobao.android.live.plugin.atype.flexalocal.proxy.BottomProxyX";
    }

    @Override // tb.k2n
    public String getOrangeKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9d3bd33e", new Object[]{this});
        }
        return "installLiveBottomPlugin";
    }

    @Override // com.taobao.android.live.plugin.proxy.bottom.IBottomProxy
    public String getRewardGuideResponseDataActionOpenRewardPanel() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b96a3a66", new Object[]{this});
        }
        IBottomProxy real = getReal();
        if (real != null) {
            str = real.getRewardGuideResponseDataActionOpenRewardPanel();
        } else {
            str = null;
        }
        FlexaLiveX.w("[BottomProxy#getRewardGuideResponseDataActionOpenRewardPanel]  value: " + str);
        return str;
    }

    @Override // com.taobao.android.live.plugin.proxy.bottom.IBottomProxy
    public String getShareFissionLiveShareActionInfoParams() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("81eaf378", new Object[]{this});
        }
        IBottomProxy real = getReal();
        if (real != null) {
            str = real.getShareFissionLiveShareActionInfoParams();
        } else {
            str = null;
        }
        FlexaLiveX.w("[BottomProxy#getShareFissionLiveShareActionInfoParams]  value: " + str);
        return str;
    }

    @Override // tb.k2n
    public String getTrackName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c86a5339", new Object[]{this});
        }
        return "直播间底部区";
    }

    private BottomProxy() {
        try {
            initAType();
        } catch (Throwable th) {
            FlexaLiveX.w("[BottomProxy<init>] error: " + th.getMessage());
        }
    }

    @Override // tb.k2n
    public <ProxyType extends IBottomProxy> ProxyType createLocalFromTpl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ProxyType) ((IBottomProxy) ipChange.ipc$dispatch("fefc3016", new Object[]{this})) : new BottomProxyX();
    }
}

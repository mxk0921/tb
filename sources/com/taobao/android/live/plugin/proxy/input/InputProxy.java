package com.taobao.android.live.plugin.proxy.input;

import android.content.Context;
import android.view.ViewStub;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.live.plugin.atype.flexalocal.proxy.InputProxyX;
import com.taobao.android.live.plugin.proxy.FlexaLiveX;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import java.util.HashMap;
import java.util.List;
import tb.k2n;
import tb.mhb;
import tb.s98;
import tb.t2o;
import tb.ux9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class InputProxy extends k2n<IInputProxy> implements IInputProxy {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "InputProxy";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final InputProxy f8749a = new InputProxy();

        static {
            t2o.a(806355163);
        }

        public static /* synthetic */ InputProxy a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (InputProxy) ipChange.ipc$dispatch("f434eed3", new Object[0]);
            }
            return f8749a;
        }
    }

    static {
        t2o.a(806355161);
        t2o.a(806355160);
    }

    public static InputProxy getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InputProxy) ipChange.ipc$dispatch("655a7dad", new Object[0]);
        }
        return b.a();
    }

    public static /* synthetic */ Object ipc$super(InputProxy inputProxy, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/proxy/input/InputProxy");
    }

    @Override // com.taobao.android.live.plugin.proxy.input.IInputProxy
    public void absInputFrameOnCreateView(Object obj, ViewStub viewStub) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6be532ec", new Object[]{this, obj, viewStub});
            return;
        }
        IInputProxy real = getReal();
        if (real != null) {
            real.absInputFrameOnCreateView(obj, viewStub);
        }
        FlexaLiveX.w("[InputProxy#absInputFrameOnCreateView");
    }

    @Override // com.taobao.android.live.plugin.proxy.input.IInputProxy
    public void absInputFrameOnDestroy(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e82deae9", new Object[]{this, obj});
            return;
        }
        IInputProxy real = getReal();
        if (real != null) {
            real.absInputFrameOnDestroy(obj);
        }
        FlexaLiveX.w("[InputProxy#absInputFrameOnDestroy");
    }

    @Override // com.taobao.android.live.plugin.proxy.input.IInputProxy
    public void atmosphereInstanceDestroy(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("780f452", new Object[]{this, ux9Var});
            return;
        }
        IInputProxy real = getReal();
        if (real != null) {
            real.atmosphereInstanceDestroy(ux9Var);
        }
        FlexaLiveX.w("[InputProxy#atmosphereInstanceDestroy frameContext");
    }

    @Override // com.taobao.android.live.plugin.proxy.input.IInputProxy
    public void atmosphereInstanceGetAtmosphereRes(ux9 ux9Var, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b4fe7ec", new Object[]{this, ux9Var, str, str2, str3});
            return;
        }
        mhb createAtmosphereManager = createAtmosphereManager();
        if (!(createAtmosphereManager == null || ux9Var == null)) {
            ux9Var.Q(createAtmosphereManager);
        }
        IInputProxy real = getReal();
        if (real != null) {
            real.atmosphereInstanceGetAtmosphereRes(ux9Var, str, str2, str3);
        }
        FlexaLiveX.w("[InputProxy#atmosphereInstanceGetAtmosphereRes frameContext");
    }

    @Override // com.taobao.android.live.plugin.proxy.input.IInputProxy
    public List<JSONObject> atmosphereInstanceGetEffectResConfig(ux9 ux9Var, String str) {
        List<JSONObject> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("1619f83c", new Object[]{this, ux9Var, str});
        }
        IInputProxy real = getReal();
        if (real != null) {
            list = real.atmosphereInstanceGetEffectResConfig(ux9Var, str);
        } else {
            list = null;
        }
        FlexaLiveX.w("[InputProxy#atmosphereInstanceGetEffectResConfig]  frameContext value: " + list);
        return list;
    }

    @Override // com.taobao.android.live.plugin.proxy.input.IInputProxy
    public HashMap<Integer, String> atmosphereInstanceGetFansLightMap(ux9 ux9Var) {
        HashMap<Integer, String> hashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("26ca3b77", new Object[]{this, ux9Var});
        }
        IInputProxy real = getReal();
        if (real != null) {
            hashMap = real.atmosphereInstanceGetFansLightMap(ux9Var);
        } else {
            hashMap = null;
        }
        FlexaLiveX.w("[InputProxy#atmosphereInstanceGetFansLightMap] frameContext  value: " + hashMap);
        return hashMap;
    }

    @Override // com.taobao.android.live.plugin.proxy.input.IInputProxy
    public HashMap<String, JSONObject> atmosphereInstanceGetStickerIdMatchMap(ux9 ux9Var) {
        HashMap<String, JSONObject> hashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("a5c8b4c2", new Object[]{this, ux9Var});
        }
        IInputProxy real = getReal();
        if (real != null) {
            hashMap = real.atmosphereInstanceGetStickerIdMatchMap(ux9Var);
        } else {
            hashMap = null;
        }
        FlexaLiveX.w("[InputProxy#atmosphereInstanceGetStickerIdMatchMap]  frameContext value: " + hashMap);
        return hashMap;
    }

    @Override // com.taobao.android.live.plugin.proxy.input.IInputProxy
    public HashMap<String, JSONObject> atmosphereInstanceGetStickerKeyMatchMap(ux9 ux9Var) {
        HashMap<String, JSONObject> hashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("7b290a0a", new Object[]{this, ux9Var});
        }
        IInputProxy real = getReal();
        if (real != null) {
            hashMap = real.atmosphereInstanceGetStickerKeyMatchMap(ux9Var);
        } else {
            hashMap = null;
        }
        FlexaLiveX.w("[InputProxy#atmosphereInstanceGetStickerKeyMatchMap frameContext ]  value: " + hashMap);
        return hashMap;
    }

    @Override // com.taobao.android.live.plugin.proxy.input.IInputProxy
    public void atmosphereInstanceProcessEffectRes(ux9 ux9Var, JSONObject jSONObject, s98 s98Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f551b38", new Object[]{this, ux9Var, jSONObject, s98Var});
            return;
        }
        IInputProxy real = getReal();
        if (real != null) {
            real.atmosphereInstanceProcessEffectRes(ux9Var, jSONObject, s98Var);
        }
        FlexaLiveX.w("[InputProxy#atmosphereInstanceProcessEffectRes frameContext");
    }

    @Override // com.taobao.android.live.plugin.proxy.input.IInputProxy
    public JSONObject convertToPosition(Context context, JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("f20181a6", new Object[]{this, context, jSONObject});
        }
        IInputProxy real = getReal();
        if (real != null) {
            jSONObject2 = real.convertToPosition(context, jSONObject);
        } else {
            jSONObject2 = null;
        }
        FlexaLiveX.w("[InputProxy#convertToPosition]  value: " + jSONObject2);
        return jSONObject2;
    }

    @Override // com.taobao.android.live.plugin.proxy.input.IInputProxy
    public JSONObject convertToPositionStaticResource(Context context, JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("9c90d122", new Object[]{this, context, jSONObject});
        }
        IInputProxy real = getReal();
        if (real != null) {
            jSONObject2 = real.convertToPositionStaticResource(context, jSONObject);
        } else {
            jSONObject2 = null;
        }
        FlexaLiveX.w("[InputProxy#convertToPositionStaticResource]  value: " + jSONObject2);
        return jSONObject2;
    }

    @Override // com.taobao.android.live.plugin.proxy.input.IInputProxy
    public mhb createAtmosphereManager() {
        mhb mhbVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mhb) ipChange.ipc$dispatch("a7c0166e", new Object[]{this});
        }
        IInputProxy real = getReal();
        if (real != null) {
            mhbVar = real.createAtmosphereManager();
        } else {
            mhbVar = null;
        }
        FlexaLiveX.w("[InputProxy#createAtmosphereManager]  value: " + mhbVar);
        return mhbVar;
    }

    @Override // com.taobao.android.live.plugin.proxy.input.IInputProxy
    public JSONObject getAtmosphereResItem(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("275c8e20", new Object[]{this, str, str2, str3});
        }
        IInputProxy real = getReal();
        JSONObject atmosphereResItem = real != null ? real.getAtmosphereResItem(str, str2, str3) : null;
        FlexaLiveX.w("[InputProxy#getAtmosphereResItem]  value: " + atmosphereResItem);
        return atmosphereResItem;
    }

    @Override // tb.k2n
    public String getIProxyKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c6fa8b95", new Object[]{this});
        }
        return IInputProxy.KEY;
    }

    @Override // com.taobao.android.live.plugin.proxy.input.IInputProxy
    public Class<? extends BaseFrame> getInputFrame3Class() {
        Class<? extends BaseFrame> cls;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("60141632", new Object[]{this});
        }
        IInputProxy real = getReal();
        if (real != null) {
            cls = real.getInputFrame3Class();
        } else {
            cls = null;
        }
        FlexaLiveX.w("[InputProxy#getInputFrame3Class]  value: " + cls);
        return cls;
    }

    @Override // tb.k2n
    public String getLocalClassName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("48c0fdcb", new Object[]{this});
        }
        return "com.taobao.android.live.plugin.atype.flexalocal.proxy.InputProxyX";
    }

    @Override // com.taobao.android.live.plugin.proxy.input.IInputProxy
    public BaseFrame getMemberGuideFrame2(Context context, boolean z, TBLiveDataModel tBLiveDataModel, ux9 ux9Var) {
        BaseFrame baseFrame;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseFrame) ipChange.ipc$dispatch("4c09767f", new Object[]{this, context, new Boolean(z), tBLiveDataModel, ux9Var});
        }
        IInputProxy real = getReal();
        if (real != null) {
            baseFrame = real.getMemberGuideFrame2(context, z, tBLiveDataModel, ux9Var);
        } else {
            baseFrame = null;
        }
        FlexaLiveX.w("[InputProxy#getMemberGuideFrame2]  value: " + baseFrame);
        return baseFrame;
    }

    @Override // tb.k2n
    public String getOrangeKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9d3bd33e", new Object[]{this});
        }
        return "installLiveInputPlugin";
    }

    @Override // com.taobao.android.live.plugin.proxy.input.IInputProxy
    public List<JSONObject> getStickerConfig(ux9 ux9Var) {
        List<JSONObject> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("92d700ef", new Object[]{this, ux9Var});
        }
        IInputProxy real = getReal();
        if (real != null) {
            list = real.getStickerConfig(ux9Var);
        } else {
            list = null;
        }
        FlexaLiveX.w("[InputProxy#getStickerConfig] frameContext  value: " + list);
        return list;
    }

    @Override // tb.k2n
    public String getTrackName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c86a5339", new Object[]{this});
        }
        return "输入与表情";
    }

    @Override // com.taobao.android.live.plugin.proxy.input.IInputProxy
    public void iInputFrameHideContentView(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4943a13", new Object[]{this, obj});
            return;
        }
        IInputProxy real = getReal();
        if (real != null) {
            real.iInputFrameHideContentView(obj);
        }
        FlexaLiveX.w("[InputProxy#iInputFrameHideContentView");
    }

    @Override // com.taobao.android.live.plugin.proxy.input.IInputProxy
    public void iInputFrameHideKeyBoard(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b73c538", new Object[]{this, obj});
            return;
        }
        IInputProxy real = getReal();
        if (real != null) {
            real.iInputFrameHideKeyBoard(obj);
        }
        FlexaLiveX.w("[InputProxy#iInputFrameHideKeyBoard");
    }

    @Override // com.taobao.android.live.plugin.proxy.input.IInputProxy
    public void iInputFrameShowContentView(Object obj, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2cd4a4b", new Object[]{this, obj, new Integer(i)});
            return;
        }
        IInputProxy real = getReal();
        if (real != null) {
            real.iInputFrameShowContentView(obj, i);
        }
        FlexaLiveX.w("[InputProxy#iInputFrameShowContentView");
    }

    private InputProxy() {
        try {
            initAType();
        } catch (Throwable th) {
            FlexaLiveX.w("[InputProxy<init>] error: " + th.getMessage());
        }
    }

    @Override // tb.k2n
    public <ProxyType extends IInputProxy> ProxyType createLocalFromTpl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ProxyType) ((IInputProxy) ipChange.ipc$dispatch("b6f9c0cc", new Object[]{this})) : new InputProxyX();
    }

    @Override // com.taobao.android.live.plugin.proxy.input.IInputProxy
    public JSONObject getAtmosphereResItem(ux9 ux9Var, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("52567d48", new Object[]{this, ux9Var, str, str2, str3});
        }
        IInputProxy real = getReal();
        JSONObject atmosphereResItem = real != null ? real.getAtmosphereResItem(ux9Var, str, str2, str3) : null;
        FlexaLiveX.w("[InputProxy#getAtmosphereResItem]  value: " + atmosphereResItem);
        return atmosphereResItem;
    }
}

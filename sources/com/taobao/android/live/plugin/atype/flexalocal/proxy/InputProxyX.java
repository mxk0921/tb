package com.taobao.android.live.plugin.atype.flexalocal.proxy;

import android.content.Context;
import android.view.ViewStub;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.context.atmo.bean.AtmosphereResListResponseData;
import com.taobao.alilive.aliliveframework.context.atmo.bean.EffectResConfig;
import com.taobao.alilive.aliliveframework.context.atmo.bean.StickerConfig;
import com.taobao.alilive.aliliveframework.context.atmo.bean.StickerGroup;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.live.plugin.atype.flexalocal.input.atmosphere.EffectResPosition;
import com.taobao.android.live.plugin.atype.flexalocal.input.atmosphere.SwashLettersMsg;
import com.taobao.android.live.plugin.atype.flexalocal.input.member.MemberGuideFrame2;
import com.taobao.android.live.plugin.atype.flexalocal.inputPanelKMP.InputPanelFrameKMP;
import com.taobao.android.live.plugin.proxy.input.IInputProxy;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import tb.fkx;
import tb.kg1;
import tb.mhb;
import tb.rfc;
import tb.s98;
import tb.t2o;
import tb.ux9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class InputProxyX implements IInputProxy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(295699605);
        t2o.a(806355160);
    }

    @Override // com.taobao.android.live.plugin.proxy.input.IInputProxy
    public void absInputFrameOnCreateView(Object obj, ViewStub viewStub) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6be532ec", new Object[]{this, obj, viewStub});
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.input.IInputProxy
    public void absInputFrameOnDestroy(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e82deae9", new Object[]{this, obj});
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.input.IInputProxy
    public void atmosphereInstanceDestroy(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("780f452", new Object[]{this, ux9Var});
        } else if (ux9Var != null && (ux9Var.e() instanceof mhb)) {
            ((mhb) ux9Var.e()).destroy();
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.input.IInputProxy
    public void atmosphereInstanceGetAtmosphereRes(ux9 ux9Var, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b4fe7ec", new Object[]{this, ux9Var, str, str2, str3});
        } else if (ux9Var != null && (ux9Var.e() instanceof mhb)) {
            ((mhb) ux9Var.e()).l(ux9Var, str, str2, str3);
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.input.IInputProxy
    public List<JSONObject> atmosphereInstanceGetEffectResConfig(ux9 ux9Var, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("1619f83c", new Object[]{this, ux9Var, str});
        }
        if (ux9Var == null || !(ux9Var.e() instanceof mhb)) {
            return null;
        }
        List<EffectResConfig> e = ((mhb) ux9Var.e()).e(str);
        ArrayList arrayList = new ArrayList();
        if (e != null) {
            for (EffectResConfig effectResConfig : e) {
                arrayList.add(JSON.parseObject(JSON.toJSONString(effectResConfig)));
            }
        }
        return arrayList;
    }

    @Override // com.taobao.android.live.plugin.proxy.input.IInputProxy
    public HashMap<Integer, String> atmosphereInstanceGetFansLightMap(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("26ca3b77", new Object[]{this, ux9Var});
        }
        if (ux9Var == null || !(ux9Var.e() instanceof mhb)) {
            return null;
        }
        return ((mhb) ux9Var.e()).n();
    }

    @Override // com.taobao.android.live.plugin.proxy.input.IInputProxy
    public HashMap<String, JSONObject> atmosphereInstanceGetStickerIdMatchMap(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("a5c8b4c2", new Object[]{this, ux9Var});
        }
        if (ux9Var == null || !(ux9Var.e() instanceof mhb)) {
            return null;
        }
        HashMap<String, StickerConfig> f = ((mhb) ux9Var.e()).f();
        HashMap<String, JSONObject> hashMap = new HashMap<>();
        if (f != null) {
            for (String str : f.keySet()) {
                hashMap.put(str, JSON.parseObject(JSON.toJSONString(f.get(str))));
            }
        }
        return hashMap;
    }

    @Override // com.taobao.android.live.plugin.proxy.input.IInputProxy
    public HashMap<String, JSONObject> atmosphereInstanceGetStickerKeyMatchMap(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("7b290a0a", new Object[]{this, ux9Var});
        }
        if (ux9Var == null || !(ux9Var.e() instanceof mhb)) {
            return null;
        }
        HashMap<String, StickerConfig> r = ((mhb) ux9Var.e()).r();
        HashMap<String, JSONObject> hashMap = new HashMap<>();
        if (r != null) {
            for (String str : r.keySet()) {
                hashMap.put(str, JSON.parseObject(JSON.toJSONString(r.get(str))));
            }
        }
        return hashMap;
    }

    @Override // com.taobao.android.live.plugin.proxy.input.IInputProxy
    public void atmosphereInstanceProcessEffectRes(ux9 ux9Var, JSONObject jSONObject, s98 s98Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f551b38", new Object[]{this, ux9Var, jSONObject, s98Var});
        } else if (ux9Var != null && (ux9Var.e() instanceof mhb)) {
            ((mhb) ux9Var.e()).b(ux9Var, (AtmosphereResListResponseData.AtmosphereResItem) fkx.f(jSONObject.toJSONString(), AtmosphereResListResponseData.AtmosphereResItem.class), s98Var);
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.input.IInputProxy
    public JSONObject convertToPosition(Context context, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("f20181a6", new Object[]{this, context, jSONObject});
        }
        return JSON.parseObject(JSON.toJSONString(EffectResPosition.convertToPosition(context, (EffectResConfig) fkx.f(jSONObject.toJSONString(), EffectResConfig.class))));
    }

    @Override // com.taobao.android.live.plugin.proxy.input.IInputProxy
    public JSONObject convertToPositionStaticResource(Context context, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("9c90d122", new Object[]{this, context, jSONObject});
        }
        return JSON.parseObject(JSON.toJSONString(EffectResPosition.convertToPosition(context, (SwashLettersMsg.StaticResource) fkx.f(jSONObject.toJSONString(), SwashLettersMsg.StaticResource.class))));
    }

    @Override // com.taobao.android.live.plugin.proxy.input.IInputProxy
    public mhb createAtmosphereManager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mhb) ipChange.ipc$dispatch("a7c0166e", new Object[]{this});
        }
        return new kg1();
    }

    @Override // com.taobao.android.live.plugin.proxy.input.IInputProxy
    public JSONObject getAtmosphereResItem(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("275c8e20", new Object[]{this, str, str2, str3});
        }
        AtmosphereResListResponseData.AtmosphereResItem atmosphereResItem = new AtmosphereResListResponseData.AtmosphereResItem();
        atmosphereResItem.matchKey = str;
        atmosphereResItem.type = str2;
        atmosphereResItem.resUrl = str3;
        return JSON.parseObject(JSON.toJSONString(atmosphereResItem));
    }

    @Override // com.taobao.android.live.plugin.proxy.input.IInputProxy
    public Class<? extends BaseFrame> getInputFrame3Class() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("60141632", new Object[]{this});
        }
        return InputPanelFrameKMP.class;
    }

    @Override // com.taobao.android.live.plugin.proxy.input.IInputProxy
    public BaseFrame getMemberGuideFrame2(Context context, boolean z, TBLiveDataModel tBLiveDataModel, ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseFrame) ipChange.ipc$dispatch("4c09767f", new Object[]{this, context, new Boolean(z), tBLiveDataModel, ux9Var});
        }
        return new MemberGuideFrame2(context, z, tBLiveDataModel, ux9Var);
    }

    @Override // com.taobao.android.live.plugin.proxy.input.IInputProxy
    public List<JSONObject> getStickerConfig(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("92d700ef", new Object[]{this, ux9Var});
        }
        if (ux9Var == null || !(ux9Var.e() instanceof mhb)) {
            return null;
        }
        List<StickerGroup> j = ((mhb) ux9Var.e()).j();
        ArrayList arrayList = new ArrayList();
        if (j != null) {
            for (StickerGroup stickerGroup : j) {
                arrayList.add(JSON.parseObject(JSON.toJSONString(stickerGroup)));
            }
        }
        return arrayList;
    }

    @Override // com.taobao.android.live.plugin.proxy.input.IInputProxy
    public void iInputFrameHideContentView(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4943a13", new Object[]{this, obj});
        } else if (obj instanceof rfc) {
            ((rfc) obj).hideContentView();
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.input.IInputProxy
    public void iInputFrameHideKeyBoard(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b73c538", new Object[]{this, obj});
        } else if (obj instanceof rfc) {
            ((rfc) obj).hideKeyBoard();
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.input.IInputProxy
    public void iInputFrameShowContentView(Object obj, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2cd4a4b", new Object[]{this, obj, new Integer(i)});
        } else if (obj instanceof rfc) {
            ((rfc) obj).showContentView(i);
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.input.IInputProxy
    public JSONObject getAtmosphereResItem(ux9 ux9Var, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("52567d48", new Object[]{this, ux9Var, str, str2, str3});
        }
        AtmosphereResListResponseData.AtmosphereResItem atmosphereResItem = new AtmosphereResListResponseData.AtmosphereResItem();
        atmosphereResItem.matchKey = str;
        atmosphereResItem.type = str2;
        atmosphereResItem.resUrl = str3;
        return JSON.parseObject(JSON.toJSONString(atmosphereResItem));
    }
}

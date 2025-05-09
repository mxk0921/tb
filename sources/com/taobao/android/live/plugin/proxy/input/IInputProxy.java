package com.taobao.android.live.plugin.proxy.input;

import android.content.Context;
import android.view.ViewStub;
import com.alibaba.fastjson.JSONObject;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.live.plugin.proxy.IProxy;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import java.util.HashMap;
import java.util.List;
import tb.mhb;
import tb.s98;
import tb.ux9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public interface IInputProxy extends IProxy {
    public static final String KEY = "IInputProxy";

    void absInputFrameOnCreateView(Object obj, ViewStub viewStub);

    void absInputFrameOnDestroy(Object obj);

    void atmosphereInstanceDestroy(ux9 ux9Var);

    void atmosphereInstanceGetAtmosphereRes(ux9 ux9Var, String str, String str2, String str3);

    List<JSONObject> atmosphereInstanceGetEffectResConfig(ux9 ux9Var, String str);

    HashMap<Integer, String> atmosphereInstanceGetFansLightMap(ux9 ux9Var);

    HashMap<String, JSONObject> atmosphereInstanceGetStickerIdMatchMap(ux9 ux9Var);

    HashMap<String, JSONObject> atmosphereInstanceGetStickerKeyMatchMap(ux9 ux9Var);

    void atmosphereInstanceProcessEffectRes(ux9 ux9Var, JSONObject jSONObject, s98 s98Var);

    JSONObject convertToPosition(Context context, JSONObject jSONObject);

    JSONObject convertToPositionStaticResource(Context context, JSONObject jSONObject);

    mhb createAtmosphereManager();

    JSONObject getAtmosphereResItem(String str, String str2, String str3);

    JSONObject getAtmosphereResItem(ux9 ux9Var, String str, String str2, String str3);

    Class<? extends BaseFrame> getInputFrame3Class();

    BaseFrame getMemberGuideFrame2(Context context, boolean z, TBLiveDataModel tBLiveDataModel, ux9 ux9Var);

    List<JSONObject> getStickerConfig(ux9 ux9Var);

    void iInputFrameHideContentView(Object obj);

    void iInputFrameHideKeyBoard(Object obj);

    void iInputFrameShowContentView(Object obj, int i);
}

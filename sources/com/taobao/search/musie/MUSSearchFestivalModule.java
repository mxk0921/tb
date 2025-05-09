package com.taobao.search.musie;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.FestivalMgr;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.module.MUSModule;
import com.taobao.android.weex_framework.ui.MUSMethod;
import com.taobao.search.sf.BaseResultActivity;
import tb.ckf;
import tb.o4p;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class MUSSearchFestivalModule extends MUSModule {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean miniSearch;

    static {
        t2o.a(815792634);
    }

    public MUSSearchFestivalModule(String str, MUSDKInstance mUSDKInstance) {
        super(str, mUSDKInstance);
        Context context;
        boolean z;
        if (mUSDKInstance != null) {
            context = mUSDKInstance.getUIContext();
        } else {
            context = null;
        }
        if (context instanceof BaseResultActivity) {
            Context uIContext = mUSDKInstance.getUIContext();
            ckf.e(uIContext, "null cannot be cast to non-null type com.taobao.search.sf.BaseResultActivity");
            if (!((BaseResultActivity) uIContext).j4() || !o4p.n1()) {
                z = false;
            } else {
                z = true;
            }
            this.miniSearch = z;
        }
    }

    public static /* synthetic */ Object ipc$super(MUSSearchFestivalModule mUSSearchFestivalModule, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/musie/MUSSearchFestivalModule");
    }

    @MUSMethod(uiThread = false)
    public int getActionBarBackgroundColor(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("55a6ef6e", new Object[]{this, jSONObject})).intValue();
        }
        return FestivalMgr.i().h(FestivalMgr.KEY_GLOBAL_ACTIONBAR_BG, 0);
    }

    @MUSMethod(uiThread = false)
    public final JSONObject getModuleConfig(String str) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("1635edf5", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str) || this.miniSearch) {
            return new JSONObject();
        }
        Object json = JSON.toJSON(FestivalMgr.i().j(str));
        if (json instanceof JSONObject) {
            jSONObject = (JSONObject) json;
        } else {
            jSONObject = null;
        }
        if (jSONObject == null) {
            return new JSONObject();
        }
        return jSONObject;
    }

    @MUSMethod(uiThread = false)
    public final boolean isFestival() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("36a9b44d", new Object[]{this})).booleanValue();
        }
        if (this.miniSearch) {
            return false;
        }
        return FestivalMgr.i().v("global");
    }
}

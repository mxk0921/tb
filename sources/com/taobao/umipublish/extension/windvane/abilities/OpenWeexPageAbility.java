package com.taobao.umipublish.extension.windvane.abilities;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import tb.nj7;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class OpenWeexPageAbility extends BaseAbility {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String CLASS_NAME = "com.taobao.umipublish.biz.weex.UnifyWeexActivity";

    static {
        t2o.a(944767174);
    }

    public static /* synthetic */ Object ipc$super(OpenWeexPageAbility openWeexPageAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/umipublish/extension/windvane/abilities/OpenWeexPageAbility");
    }

    @Override // com.taobao.umipublish.extension.windvane.abilities.BaseAbility
    public void onExecute(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95fd7073", new Object[]{this, jSONObject});
        } else if (jSONObject == null) {
            errorCallback("1", "Params is null");
        } else {
            String string = jSONObject.getString("weexUrl");
            if (TextUtils.isEmpty(string)) {
                errorCallback("2", "WeexUrl is null");
                return;
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject("params");
            Uri.Builder buildUpon = Uri.parse(string).buildUpon();
            buildUpon.appendQueryParameter(nj7.LARGE_SCREEN_STYLE_KEY, "fullscreen");
            successCallback(new JSONObject());
            Bundle bundle = new Bundle();
            bundle.putSerializable("unify_weex_init_data", jSONObject2);
            Nav.from(this.mContext).withExtras(bundle).withAction("android.intent.action.UMI").withClassName(this.mContext.getPackageName(), CLASS_NAME).forResult(60004).toUri(buildUpon.build());
        }
    }
}

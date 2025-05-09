package com.taobao.taobao.internal.helper;

import android.app.Activity;
import com.alibaba.ability.hub.AbilityHubAdapter;
import com.alibaba.ability.impl.stdpop.StdPopAbility;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.ability.result.FinishResult;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.internal.helper.AbilityParams;
import com.taobao.tlog.adapter.AdapterForTLog;
import tb.nbf;
import tb.s2d;
import tb.xq;
import tb.zq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "AbilityPop";

    /* compiled from: Taobao */
    /* renamed from: com.taobao.taobao.internal.helper.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class C0734a implements s2d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.s2d
        public void onCallback(ExecuteResult executeResult) {
            String str;
            String str2;
            String str3;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f183ed74", new Object[]{this, executeResult});
            } else if (!(executeResult instanceof FinishResult)) {
                if (executeResult instanceof ErrorResult) {
                    ErrorResult errorResult = (ErrorResult) executeResult;
                    str3 = errorResult.getCode();
                    str2 = errorResult.getMsg();
                    str = errorResult.getType();
                } else {
                    str3 = "";
                    str = str3;
                    str2 = str;
                }
                AdapterForTLog.loge(a.TAG, "code=" + str3 + ",message=" + str2 + ",type=" + str);
            }
        }
    }

    public static void a(Activity activity, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e28b5e14", new Object[]{activity, str, str2, str3});
            return;
        }
        AbilityHubAdapter abilityHubAdapter = new AbilityHubAdapter(new zq(str, "weex2Pop").a(activity));
        AbilityParams abilityParams = new AbilityParams();
        abilityParams.popId = str2;
        abilityParams.bizId = str;
        AbilityParams.b bVar = new AbilityParams.b();
        bVar.animation = nbf.STDPOP_ANIMATION_BOTTOM;
        bVar.panEnable = "false";
        bVar.contentBackColor = "#FFFFFF";
        bVar.maxHeight = 0.8f;
        bVar.attachMode = "activity";
        abilityParams.popConfig = bVar;
        abilityParams.url = str3;
        abilityHubAdapter.j("stdPop", StdPopAbility.API_WEEX2, new xq().p(activity.getWindow().getDecorView()), (JSONObject) JSON.toJSON(abilityParams), new C0734a());
    }
}

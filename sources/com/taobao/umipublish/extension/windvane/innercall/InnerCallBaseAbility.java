package com.taobao.umipublish.extension.windvane.innercall;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.umipublish.extension.windvane.abilities.BaseAbility;
import java.util.HashMap;
import java.util.Map;
import tb.dov;
import tb.muu;
import tb.odg;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public abstract class InnerCallBaseAbility extends BaseAbility {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "InnerCallBaseAbility";
    public dov.a mPrevParams;
    public String mSessionId = "";

    static {
        t2o.a(944767213);
    }

    public static /* synthetic */ Object ipc$super(InnerCallBaseAbility innerCallBaseAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/umipublish/extension/windvane/innercall/InnerCallBaseAbility");
    }

    @Override // com.taobao.umipublish.extension.windvane.abilities.BaseAbility
    public final void onExecute(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95fd7073", new Object[]{this, jSONObject});
            return;
        }
        odg.d(TAG, "params = " + jSONObject.toJSONString());
        String j = muu.j(this.mContext);
        if (j == null) {
            errorCallback("2", "EMPTY_SESSION_ID");
            return;
        }
        this.mSessionId = j;
        dov.a b = dov.b(j);
        this.mPrevParams = b;
        onExecute(jSONObject, b);
    }

    public abstract void onExecute(JSONObject jSONObject, dov.a aVar);

    public void revertUrlParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae61a658", new Object[]{this});
            return;
        }
        dov.a aVar = this.mPrevParams;
        if (aVar != null) {
            dov.d(this.mSessionId, aVar);
        }
    }

    public void updateUrlPrams(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5067e6a", new Object[]{this, jSONObject});
            return;
        }
        this.mPrevParams = dov.b(this.mSessionId);
        HashMap hashMap = new HashMap(this.mPrevParams.o());
        for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
            if (!TextUtils.isEmpty(entry.getKey())) {
                if (TextUtils.equals("publishParams", entry.getKey()) || TextUtils.equals("data", entry.getKey())) {
                    for (Map.Entry<String, Object> entry2 : jSONObject.getJSONObject(entry.getKey()).entrySet()) {
                        if (!TextUtils.isEmpty(entry2.getKey())) {
                            hashMap.put(entry2.getKey(), entry2.getValue().toString());
                        }
                    }
                } else {
                    hashMap.put(entry.getKey(), entry.getValue().toString());
                }
            }
        }
        dov.a aVar = new dov.a();
        aVar.s(hashMap);
        dov.d(this.mSessionId, aVar);
    }
}

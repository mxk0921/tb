package com.taobao.umipublish.extension.windvane.abilities;

import android.util.Log;
import androidx.appcompat.taobao.util.Globals;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taopai.material.bean.MaterialResource;
import tb.fkg;
import tb.grc;
import tb.k7i;
import tb.krq;
import tb.t2o;
import tb.v7i;
import tb.vyl;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class DownloadMaterialAbility extends BaseAbility implements grc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(944767152);
        t2o.a(782237815);
    }

    public static /* synthetic */ Object ipc$super(DownloadMaterialAbility downloadMaterialAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/umipublish/extension/windvane/abilities/DownloadMaterialAbility");
    }

    @Override // tb.pjd
    public void onFail(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2f5f2b8", new Object[]{this, str, str2});
            return;
        }
        errorCallback("5001", str + "," + str2);
    }

    @Override // tb.grc
    public void onProgress(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ec8f5b0", new Object[]{this, new Integer(i)});
        } else {
            progressCallback(i);
        }
    }

    @Override // tb.grc
    public void onSuccess(MaterialResource materialResource) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63df5368", new Object[]{this, materialResource});
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray();
            jSONArray.add((JSONObject) JSON.toJSON(materialResource));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("materialList", (Object) jSONArray);
            successCallback(jSONObject);
        } catch (Throwable th) {
            errorCallback("5001", Log.getStackTraceString(th));
        }
    }

    @Override // com.taobao.umipublish.extension.windvane.abilities.BaseAbility
    public void onExecute(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95fd7073", new Object[]{this, jSONObject});
        } else if (jSONObject == null) {
            errorCallback("5001", "EMPTY_PARAMS");
        } else {
            JSONArray jSONArray = jSONObject.getJSONArray("materialIds");
            if (jSONArray == null || jSONArray.size() == 0) {
                errorCallback("5001", "EMPTY_DATA");
                return;
            }
            int i = fkg.LE_VERSION;
            v7i v7iVar = new v7i(krq.i(jSONArray.getString(0), 0));
            v7iVar.h(true);
            v7iVar.f(vyl.MAX_COMMIT_TIME_INTERVAL);
            v7iVar.g(i);
            new k7i(this.mContext, "guangguang", "guangguang").D(Globals.getApplication(), v7iVar, this);
        }
    }
}

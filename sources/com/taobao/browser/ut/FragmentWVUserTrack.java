package com.taobao.browser.ut;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.core.WVUserTrack;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import tb.hsq;
import tb.ox9;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class FragmentWVUserTrack extends WVUserTrack {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(619708642);
    }

    public static /* synthetic */ Object ipc$super(FragmentWVUserTrack fragmentWVUserTrack, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/browser/ut/FragmentWVUserTrack");
    }

    private Map<String, String> transStringToMap(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("bfe72e8e", new Object[]{this, str});
        }
        HashMap hashMap = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (!hsq.f(next)) {
                    String string = jSONObject.getString(next);
                    if (!hsq.f(string)) {
                        hashMap.put(next, string);
                    }
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return hashMap;
    }

    @Override // com.ut.mini.core.WVUserTrack
    public void toUT2(String str, WVCallBackContext wVCallBackContext) {
        Map<String, String> transStringToMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c085266", new Object[]{this, str, wVCallBackContext});
            return;
        }
        if (!(this.mContext == null || (transStringToMap = transStringToMap(str)) == null)) {
            ox9.p().s(transStringToMap, this.mContext, wVCallBackContext.getWebview());
        }
        wVCallBackContext.success();
    }
}

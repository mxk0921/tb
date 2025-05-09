package com.uc.webview.internal.stats;

import android.text.TextUtils;
import com.uc.webview.base.EnvInfo;
import com.uc.webview.base.Log;
import com.uc.webview.export.extension.IStatsHandler;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import tb.gat;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static final String f14504a = "a";

    public static boolean a(List<d> list) {
        IStatsHandler iStatsHandler;
        String jSONObject;
        if (IStatsHandler.Instance.get() == null) {
            Log.b();
            return false;
        }
        boolean z = !EnvInfo.g();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("lt", "ev");
            jSONObject2.put(gat.CT, "corepv");
            HashMap hashMap = new HashMap();
            i.a();
            i.a(hashMap);
            for (Map.Entry entry : hashMap.entrySet()) {
                jSONObject2.put((String) entry.getKey(), entry.getValue());
            }
            JSONArray jSONArray = new JSONArray();
            for (d dVar : list) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("ev_ac", dVar.f14511a);
                for (Map.Entry<String, String> entry2 : dVar.b.entrySet()) {
                    jSONObject3.put(entry2.getKey(), entry2.getValue());
                }
                jSONArray.put(jSONObject3);
            }
            jSONObject2.put("items", jSONArray);
            jSONObject2.put("stat_size", String.valueOf(jSONObject2.toString().length()));
            if (!TextUtils.isEmpty(jSONObject2.toString())) {
                z |= !iStatsHandler.stat(jSONObject);
                Log.b();
            }
        } catch (Throwable th) {
            Log.w(f14504a, "IStatsHandler failed", th);
        }
        return !z;
    }
}

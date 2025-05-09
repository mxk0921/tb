package com.huawei.hms.framework.network.grs.g.i;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.StringUtils;
import com.huawei.hms.framework.network.grs.GrsApp;
import com.huawei.hms.framework.network.grs.g.j.d;
import com.huawei.hms.framework.network.grs.h.c;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static final String f5352a = "a";
    private static d b;
    private static final Object c = new Object();

    public static synchronized d a(Context context) {
        synchronized (a.class) {
            synchronized (c) {
                d dVar = b;
                if (dVar != null) {
                    return dVar;
                }
                String a2 = c.a(GrsApp.getInstance().getBrand("/") + "grs_sdk_server_config.json", context);
                ArrayList arrayList = null;
                if (TextUtils.isEmpty(a2)) {
                    return null;
                }
                try {
                    JSONObject jSONObject = new JSONObject(a2).getJSONObject("grs_server");
                    JSONArray jSONArray = jSONObject.getJSONArray("grs_base_url");
                    if (jSONArray != null && jSONArray.length() > 0) {
                        arrayList = new ArrayList();
                        for (int i = 0; i < jSONArray.length(); i++) {
                            arrayList.add(jSONArray.get(i).toString());
                        }
                    }
                    d dVar2 = new d();
                    b = dVar2;
                    dVar2.a(arrayList);
                    b.a(jSONObject.getString("grs_query_endpoint_2.0"));
                    b.a(jSONObject.getInt("grs_query_timeout"));
                } catch (JSONException e) {
                    Logger.w(f5352a, "getGrsServerBean catch JSONException: %s", StringUtils.anonymizeMessage(e.getMessage()));
                }
                return b;
            }
        }
    }
}

package com.flybird.app.jsplugin;

import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public interface JSMultiImplPlugin {
    String getPluginDomain();

    String[] getPluginMethods();

    JSONObject handlePluginInvoke(String str, JSONObject jSONObject, Object obj);
}

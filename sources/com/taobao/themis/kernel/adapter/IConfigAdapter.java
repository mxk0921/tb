package com.taobao.themis.kernel.adapter;

import com.taobao.themis.kernel.basic.DefaultAdapterImpl;
import java.util.Map;
import tb.n8s;

/* compiled from: Taobao */
@DefaultAdapterImpl("com.taobao.themis.inside.adapter.TMSOrangeImpl")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface IConfigAdapter extends n8s {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface a {
        void a(Map<String, String> map);
    }

    void clearConfigLocal(String str, String str2);

    String getConfigByGroupAndName(String str, String str2, String str3);

    String getConfigByGroupAndNameFromLocal(String str, String str2, String str3);

    Map<String, String> getConfigs(String str);

    String getCustomConfig(String str, String str2);

    String getCustomConfigByLocal(String str, String str2);

    void registerListener(String str, a aVar);

    void unregisterListener(String str);
}

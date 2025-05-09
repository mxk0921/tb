package tb;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.taobao.android.weex.WeexInstance;
import com.taobao.android.weex.config.WeexInstanceConfig;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public interface d6x {
    WeexInstance createChildInstance(Context context, String str, JSONObject jSONObject, WeexInstanceConfig weexInstanceConfig);

    WeexInstance createChildInstance(Context context, String str, JSONObject jSONObject, WeexInstanceConfig weexInstanceConfig, WeexInstance weexInstance, int i);

    void registerSourceMapURL(String str, String str2);
}

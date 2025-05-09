package tb;

import com.alibaba.fastjson.JSONObject;
import tb.yjv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface tif extends yjv {
    @Override // tb.yjv
    /* synthetic */ void onUpdate(boolean z, JSONObject jSONObject, String str);

    @Override // tb.yjv
    /* synthetic */ void patchProcessListener(yjv.a aVar);

    void registerInterceptor(uif uifVar);
}

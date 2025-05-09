package tb;

import com.alibaba.fastjson.JSONObject;
import com.taobao.update.result.BundleUpdateStep;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface yjv {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface a {
        void hasPatched(boolean z);

        void patchFailed(String str);

        void patchStart();

        void patchSuccess();

        void patching(BundleUpdateStep bundleUpdateStep);
    }

    void onUpdate(boolean z, JSONObject jSONObject, String str);

    void patchProcessListener(a aVar);
}

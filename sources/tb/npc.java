package tb;

import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public interface npc {
    void onDestroyed(MUSDKInstance mUSDKInstance);

    void onJSException(a aVar, int i, String str);

    void onPrepareSuccess(a aVar);

    void onRefreshFailed(a aVar, int i, String str, boolean z);

    void onRefreshSuccess(a aVar);

    void onRenderFailed(a aVar, int i, String str, boolean z);

    void onRenderSuccess(a aVar);
}

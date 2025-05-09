package tb;

import android.view.View;
import com.taobao.weex.WXSDKInstance;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface gbe {
    void onException(WXSDKInstance wXSDKInstance, String str, String str2);

    void onRefreshSuccess(WXSDKInstance wXSDKInstance, int i, int i2);

    void onRenderSuccess(WXSDKInstance wXSDKInstance, int i, int i2);

    void onViewCreated(WXSDKInstance wXSDKInstance, View view);
}

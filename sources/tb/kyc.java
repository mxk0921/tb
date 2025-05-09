package tb;

import com.taobao.android.weex_framework.a;
import com.taobao.android.weex_uikit.ui.UINode;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public interface kyc {
    void fireNativeEvent(String str, String str2);

    String getNativeState(String str, UINode uINode);

    void registerNativeStateListener(String str, UINode uINode, a.b bVar);

    void unregisterNativeStateListener(String str, UINode uINode, a.b bVar);
}

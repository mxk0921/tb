package tb;

import android.view.Menu;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.ui.component.NestedContainer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public interface dbe extends WXSDKInstance.v {
    void destroy();

    NestedContainer getNestedContainer(WXSDKInstance wXSDKInstance);

    void onCreateOptionsMenu(Menu menu);
}

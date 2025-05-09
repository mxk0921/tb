package tb;

import android.app.Activity;
import com.taobao.android.xrappos.scene.Scene;
import com.taobao.android.xrappos.v2.view.XRAppOSView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public interface ie {
    void destroy();

    Scene getScene();

    XRAppOSView getXRAppOSView();

    void init(Activity activity);

    void loadModel(String str, String str2);
}

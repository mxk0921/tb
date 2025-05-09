package tb;

import android.view.View;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public interface l5m {
    void dispose();

    View getView();

    void onActivityDestroy();

    void onActivityPause();

    void onActivityResume();

    void onActivityStart();

    void onActivityStop();

    void onFlutterViewAttached(View view);

    void onFlutterViewDetached();

    void onUpdateAttrs(Map<String, String> map);
}

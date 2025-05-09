package tb;

import android.app.Activity;
import android.os.Bundle;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public interface n2e {
    Map<String, String> getParams();

    boolean prefetch(Activity activity, Bundle bundle);

    boolean process(Activity activity, Bundle bundle, int i);
}

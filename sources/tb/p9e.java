package tb;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public interface p9e<VIEW, PRESENTER> {
    void d(PRESENTER presenter, yko ykoVar);

    void destroy();

    VIEW getView();

    void init(Activity activity);

    VIEW t(Context context, ViewGroup viewGroup);
}

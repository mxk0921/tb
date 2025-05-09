package tb;

import android.content.Context;
import android.os.Handler;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface x6e {
    boolean cancelAsync(z6e z6eVar);

    boolean cancelAsync(z6e z6eVar, int i);

    boolean continueAsync(z6e z6eVar);

    boolean getUnfinishedTasksAsync(String str, lzd lzdVar, Handler handler);

    boolean initialize(Context context, w6e w6eVar);

    boolean isInitialized();

    boolean pauseAsync(z6e z6eVar);

    boolean uploadAsync(z6e z6eVar, mzd mzdVar, Handler handler);

    boolean uploadAsync(z6e z6eVar, mzd mzdVar, Handler handler, boolean z);
}

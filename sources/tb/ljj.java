package tb;

import android.os.Bundle;
import android.webkit.ValueCallback;
import com.taobao.android.tcrash.UncaughtCrashHeader;
import java.util.concurrent.Callable;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public interface ljj {
    void a(Callable<String> callable);

    void b(ValueCallback<Bundle> valueCallback);

    void disable();

    void enable();

    UncaughtCrashHeader getUncaughtCrashHeader();
}

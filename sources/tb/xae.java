package tb;

import java.util.concurrent.Future;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public interface xae {
    void execute(Runnable runnable);

    Future<?> submit(Runnable runnable);
}

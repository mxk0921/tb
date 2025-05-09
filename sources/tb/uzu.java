package tb;

import android.app.Activity;
import android.os.Bundle;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface uzu extends tzu {
    @Override // tb.tzu
    /* synthetic */ void onActivityCreated(Activity activity, Bundle bundle);

    @Override // tb.tzu
    /* synthetic */ void onActivityDestroyed(Activity activity);

    @Override // tb.tzu
    /* synthetic */ void onActivityPaused(Activity activity);

    @Override // tb.tzu
    /* synthetic */ void onActivityResumed(Activity activity);

    @Override // tb.tzu
    /* synthetic */ void onActivitySaveInstanceState(Activity activity, Bundle bundle);

    @Override // tb.tzu
    /* synthetic */ void onActivityStarted(Activity activity);

    @Override // tb.tzu
    /* synthetic */ void onActivityStopped(Activity activity);

    @Override // tb.tzu
    /* synthetic */ void onSwitchBackground();

    void onSwitchBackgroundDelay();

    @Override // tb.tzu
    /* synthetic */ void onSwitchForeground();
}

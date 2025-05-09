package tb;

import android.content.Intent;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public interface qce {
    void destroyApp();

    void init();

    void onActivityResult(int i, int i2, Intent intent);

    boolean onBackPressed();

    void onDestroy();

    void onHidden();

    void onPause();

    void onRequestPermissionsResult(int i, String[] strArr, int[] iArr);

    void onResume();

    void onStop();

    void onVisible();

    void startApp(String str);
}

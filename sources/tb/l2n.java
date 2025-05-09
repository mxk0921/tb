package tb;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public interface l2n {
    public static final int INVALID_CONTENT_VALUE = 0;

    View a(ViewGroup viewGroup);

    int b(int i);

    void onCompleteUpdate(CharSequence charSequence);

    void onFreeze(boolean z, CharSequence charSequence);

    void onPull(float f);

    void onRefreshing();

    void onRelease(float f);

    void onReset();

    void onUpdateDirection(int i);
}

package tb;

import android.graphics.Canvas;
import android.view.View;
import com.taobao.android.weex_uikit.ui.MUSNodeHost;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public interface bjd {
    void a(int i, int i2, int i3, int i4);

    void attach();

    void b(Canvas canvas, MUSNodeHost mUSNodeHost, int i, int i2, float f);

    void c(boolean z);

    void d(View view);

    void detach();

    void e();

    boolean isEnabled();

    void setContentDescription(CharSequence charSequence);

    void updateBorderRadius();
}

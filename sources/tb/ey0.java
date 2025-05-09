package tb;

import android.graphics.Bitmap;
import com.taobao.pexode.animate.AnimatedDrawableFrameInfo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public interface ey0 {
    void dispose();

    AnimatedDrawableFrameInfo getFrameInfo();

    int getHeight();

    int getWidth();

    int getXOffset();

    int getYOffset();

    void renderFrame(int i, int i2, Bitmap bitmap);
}

package tb;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.os.LocaleList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class qdg extends Paint {
    public qdg() {
    }

    @Override // android.graphics.Paint
    public void setAlpha(int i) {
        if (Build.VERSION.SDK_INT < 30) {
            setColor((uvi.d(i, 0, 255) << 24) | (getColor() & 16777215));
            return;
        }
        super.setAlpha(uvi.d(i, 0, 255));
    }

    public qdg(int i) {
        super(i);
    }

    public qdg(PorterDuff.Mode mode) {
        setXfermode(new PorterDuffXfermode(mode));
    }

    public qdg(int i, PorterDuff.Mode mode) {
        super(i);
        setXfermode(new PorterDuffXfermode(mode));
    }

    @Override // android.graphics.Paint
    public void setTextLocales(LocaleList localeList) {
    }
}

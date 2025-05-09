package tb;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import androidx.core.content.ContextCompat;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class s14 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static boolean a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("887ce543", new Object[]{new Integer(i)})).booleanValue();
        }
        if (1.0d - ((((Color.red(i) * 0.299d) + (Color.green(i) * 0.587d)) + (Color.blue(i) * 0.114d)) / 255.0d) < 0.5d) {
            return true;
        }
        return false;
    }

    public static Drawable b(Context context, int i, int i2) {
        Drawable drawable;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("12e85b52", new Object[]{context, new Integer(i), new Integer(i2)});
        }
        if (context == null) {
            return null;
        }
        try {
            drawable = ContextCompat.getDrawable(context, i);
        } catch (Resources.NotFoundException unused) {
            TLog.loge(y9a.c(), "ColorUtil", "get res failed");
            drawable = null;
        }
        if (drawable == null) {
            return null;
        }
        return c(drawable.mutate(), i2);
    }

    public static Drawable c(Drawable drawable, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("e145adbb", new Object[]{drawable, new Integer(i)});
        }
        drawable.setColorFilter(i, PorterDuff.Mode.SRC_ATOP);
        return drawable;
    }
}

package tb;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.IBinder;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.binder.BitmapBinder;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class hz0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779093336);
    }

    public static Bundle a(Context context) {
        Intent intent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("bdffc29c", new Object[]{context});
        }
        if ((context instanceof Activity) && (intent = ((Activity) context).getIntent()) != null) {
            return intent.getBundleExtra("nav_animation_extra");
        }
        return null;
    }

    public static BitmapBinder b(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BitmapBinder) ipChange.ipc$dispatch("69abc2b9", new Object[]{bundle});
        }
        if (bundle == null) {
            return null;
        }
        IBinder binder = bundle.getBinder("view_source_drawable");
        if (binder instanceof BitmapBinder) {
            return (BitmapBinder) binder;
        }
        return null;
    }

    public static Drawable c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("2d55b6cd", new Object[]{context});
        }
        BitmapBinder b = b(a(context));
        if (b != null) {
            return b.getDrawable();
        }
        return null;
    }
}

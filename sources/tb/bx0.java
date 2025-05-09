package tb;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.IBinder;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.view.frameanim.NewDetailMaskFrameLayout;
import com.taobao.android.nav.binder.BitmapBinder;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class bx0 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ANIM_INT_FALSE = 0;
    public static final int ANIM_INT_NULL = -1;
    public static final int ANIM_INT_TRUE = 1;
    public static final int DEFAULT_CUSTOM_ANIMATION_FRAME_MAX_COUNT = 12;
    public static final int DEFAULT_CUSTOM_ANIMATION_MIN_FRAME_FIT = 32;
    public static final int DEFAULT_MASK_AUTO_ADAPTER_ANIM_DURATION_GT80_MAX_VALUE = 260;
    public static final int DEFAULT_MASK_AUTO_ADAPTER_ANIM_DURATION_LT40_MAX_VALUE = 320;
    public static final int DEFAULT_MASK_AUTO_ADAPTER_ANIM_DURATION_LT60_MAX_VALUE = 310;
    public static final int DEFAULT_MASK_AUTO_ADAPTER_ANIM_DURATION_MAX_VALUE = 280;
    public static final int DEFAULT_VALUE_MASK_FRAME_ANIM_DURATION = 240;
    public static final int DEFAULT_VALUE_MASK_FRAME_GT80_ANIM_DURATION = 230;
    public static final int DEFAULT_VALUE_MASK_FRAME_LT40_ANIM_DURATION = 280;
    public static final int DEFAULT_VALUE_MASK_FRAME_LT60_ANIM_DURATION = 270;
    public static final int MASK_ANIM_VERSION_V1 = 101;
    public static final int MASK_ANIM_VERSION_V2 = 201;
    public static final int MASK_ANIM_VERSION_V3 = 301;
    public static final String PARAMS_KEY_ANIM_ITEM_IS_RUNNING = "anim_item_is_running";
    public static final String PARAMS_KEY_ANIM_MAIN_IMAGE_VIEW_HEIGHT = "anim_main_image_view_height";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface a {
        NewDetailMaskFrameLayout s0();
    }

    static {
        t2o.a(352321972);
    }

    public static boolean a(ImageView imageView) {
        Drawable g;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f9cead6a", new Object[]{imageView})).booleanValue();
        }
        if (imageView == null || (g = g(imageView.getContext())) == null) {
            return false;
        }
        imageView.setImageDrawable(g);
        return true;
    }

    public static Bundle b(Context context) {
        Intent intent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("bdffc29c", new Object[]{context});
        }
        Activity realActivity = NewDetailMaskFrameLayout.getRealActivity(context);
        if (realActivity == null || (intent = realActivity.getIntent()) == null) {
            return null;
        }
        return intent.getBundleExtra("nav_animation_extra");
    }

    public static int c(int i, l5i l5iVar) {
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4cac5296", new Object[]{new Integer(i), l5iVar})).intValue();
        }
        int deviceScore = NewDetailMaskFrameLayout.getDeviceScore();
        int i3 = l5iVar.i();
        if (i3 > 0) {
            long j = l5iVar.j();
            if (NewDetailMaskFrameLayout.sFrameSpeedAvgDuration > j) {
                int h = l5iVar.h();
                int k = l5iVar.k();
                int o = l5iVar.o();
                int q = o - l5iVar.q();
                float f = (float) ((NewDetailMaskFrameLayout.sFrameSpeedAvgDuration - j) * i3);
                if (k != -2 && deviceScore > q && deviceScore < 101) {
                    if (deviceScore > o) {
                        i2 = (Math.min(l5iVar.t(), deviceScore) - o) * k;
                    } else {
                        i2 = ((deviceScore - q) * k) / 2;
                    }
                    h -= i2;
                    f = Math.max(f - i2, 0.0f);
                }
                int i4 = (int) (i + f);
                if (i4 <= h) {
                    h = i4;
                }
                if (h >= i) {
                    i = h;
                }
                l5iVar.a(l5iVar.n(), "animDuration frameSpeedDuration Result: " + i + " sFrameSpeedAvgDuration: " + NewDetailMaskFrameLayout.sFrameSpeedAvgDuration + " DeviceScore:" + deviceScore + " deviceMultiplier:" + k + " deviceReduce:" + i2);
            }
        }
        return i;
    }

    public static int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4d268dc6", new Object[0])).intValue();
        }
        int deviceScore = NewDetailMaskFrameLayout.getDeviceScore();
        if (deviceScore < 40) {
            return 320;
        }
        if (deviceScore < 60) {
            return 310;
        }
        if (deviceScore < 80) {
            return 280;
        }
        return 260;
    }

    public static int e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5352c305", new Object[0])).intValue();
        }
        int deviceScore = NewDetailMaskFrameLayout.getDeviceScore();
        if (deviceScore < 40) {
            return 280;
        }
        if (deviceScore < 60) {
            return 270;
        }
        if (deviceScore < 80) {
            return 240;
        }
        return 230;
    }

    public static BitmapBinder f(Bundle bundle) {
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

    public static Drawable g(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("2d55b6cd", new Object[]{context});
        }
        BitmapBinder f = f(b(context));
        if (f != null) {
            return f.getDrawable();
        }
        return null;
    }

    public static boolean h(Intent intent, zmj zmjVar) {
        Bundle g;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("758ad09c", new Object[]{intent, zmjVar})).booleanValue();
        }
        if (zmjVar == null || intent == null || (g = zmjVar.g()) == null) {
            return false;
        }
        float f = g.getFloat(PARAMS_KEY_ANIM_MAIN_IMAGE_VIEW_HEIGHT, -1.0f);
        if (f > 0.0f) {
            intent.putExtra(PARAMS_KEY_ANIM_MAIN_IMAGE_VIEW_HEIGHT, f);
        }
        if (g.containsKey(PARAMS_KEY_ANIM_ITEM_IS_RUNNING)) {
            intent.putExtra(PARAMS_KEY_ANIM_ITEM_IS_RUNNING, g.getBoolean(PARAMS_KEY_ANIM_ITEM_IS_RUNNING, false));
        }
        return true;
    }
}

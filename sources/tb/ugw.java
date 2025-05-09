package tb;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.view.View;
import android.view.ViewTreeObserver;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ugw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(503317441);
    }

    public static int a(View view, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4b029ce3", new Object[]{view, new Integer(i), new Integer(i2)})).intValue();
        }
        Bitmap createBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.translate(-i, -i2);
        view.draw(canvas);
        return Color.alpha(createBitmap.getPixel(0, 0));
    }

    public static void b(View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8196714", new Object[]{view, onGlobalLayoutListener});
            return;
        }
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    public static void c(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84fecb09", new Object[]{view});
        } else if (view != null) {
            tfs.e("ViewUtil", "updateApmInvalid: " + view);
            view.setTag(dgw.APM_VIEW_TOKEN, dgw.APM_VIEW_INVALID);
        }
    }

    public static void d(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45fa30a4", new Object[]{view});
        } else if (view != null) {
            tfs.e("ViewUtil", "updateApmValid:" + view);
            view.setTag(dgw.APM_VIEW_TOKEN, dgw.APM_VIEW_VALID);
        }
    }
}

package tb;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import com.android.alibaba.ip.runtime.IpChange;
import com.uc.webview.internal.interfaces.IWebViewExtension;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class gg2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final gg2 INSTANCE = new gg2();

    static {
        t2o.a(481297582);
    }

    @JvmStatic
    public static final Bitmap a(Context context, Bitmap bitmap, Bitmap bitmap2, int i, int i2) {
        Bitmap bitmap3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("4363ede1", new Object[]{context, bitmap, bitmap2, new Integer(i), new Integer(i2)});
        }
        ckf.g(context, "ctx");
        ckf.g(bitmap, IWebViewExtension.SNAPSHOT_BUNDLE_KEY_BITMAP);
        Bitmap.Config config = bitmap.getConfig();
        Bitmap.Config config2 = Bitmap.Config.ARGB_8888;
        if (config != config2) {
            Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), config2);
            Canvas canvas = new Canvas(createBitmap);
            Paint paint = new Paint(1);
            ColorMatrix colorMatrix = new ColorMatrix();
            colorMatrix.set(new float[]{0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f});
            paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
            bitmap = createBitmap;
        }
        RenderScript create = RenderScript.create(context);
        if (bitmap2 == null) {
            bitmap3 = Bitmap.createBitmap(i, i2, config2);
            ckf.f(bitmap3, "{\n      Bitmap.createBit…p.Config.ARGB_8888)\n    }");
        } else {
            bitmap3 = Bitmap.createBitmap(bitmap2.getWidth(), bitmap2.getHeight(), config2);
            ckf.f(bitmap3, "{\n      Bitmap.createBit…p.Config.ARGB_8888)\n    }");
        }
        Allocation createFromBitmap = Allocation.createFromBitmap(create, bitmap);
        Allocation createTyped = Allocation.createTyped(create, createFromBitmap.getType());
        ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
        create2.setInput(createFromBitmap);
        create2.setRadius(25.0f);
        create2.forEach(createTyped);
        createTyped.copyTo(bitmap3);
        create.destroy();
        createFromBitmap.destroy();
        createTyped.destroy();
        return bitmap3;
    }
}

package tb;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tlog.adapter.AdapterForTLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class dq1 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "ChangeAppIcon.bitmap";

    static {
        t2o.a(284164120);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String a(android.graphics.Bitmap r5) {
        /*
            r0 = 0
            com.android.alibaba.ip.runtime.IpChange r1 = tb.dq1.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r2 == 0) goto L_0x0015
            java.lang.String r2 = "54d16232"
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r0] = r5
            java.lang.Object r5 = r1.ipc$dispatch(r2, r3)
            java.lang.String r5 = (java.lang.String) r5
            return r5
        L_0x0015:
            r1 = 0
            if (r5 == 0) goto L_0x005d
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream     // Catch: all -> 0x003a, Exception -> 0x003c
            r2.<init>()     // Catch: all -> 0x003a, Exception -> 0x003c
            android.graphics.Bitmap$CompressFormat r3 = android.graphics.Bitmap.CompressFormat.PNG     // Catch: all -> 0x0035, Exception -> 0x0038
            r4 = 100
            r5.compress(r3, r4, r2)     // Catch: all -> 0x0035, Exception -> 0x0038
            r2.flush()     // Catch: all -> 0x0035, Exception -> 0x0038
            r2.close()     // Catch: all -> 0x0035, Exception -> 0x0038
            byte[] r5 = r2.toByteArray()     // Catch: all -> 0x0035, Exception -> 0x0038
            java.lang.String r1 = android.util.Base64.encodeToString(r5, r0)     // Catch: all -> 0x0035, Exception -> 0x0038
            r5 = r1
            r1 = r2
            goto L_0x005e
        L_0x0035:
            r5 = move-exception
            r1 = r2
            goto L_0x004f
        L_0x0038:
            r5 = move-exception
            goto L_0x003e
        L_0x003a:
            r5 = move-exception
            goto L_0x004f
        L_0x003c:
            r5 = move-exception
            r2 = r1
        L_0x003e:
            r5.printStackTrace()     // Catch: all -> 0x0035
            if (r2 == 0) goto L_0x006c
            r2.flush()     // Catch: Exception -> 0x004a
            r2.close()     // Catch: Exception -> 0x004a
            goto L_0x006c
        L_0x004a:
            r5 = move-exception
            r5.printStackTrace()
            goto L_0x006c
        L_0x004f:
            if (r1 == 0) goto L_0x005c
            r1.flush()     // Catch: Exception -> 0x0058
            r1.close()     // Catch: Exception -> 0x0058
            goto L_0x005c
        L_0x0058:
            r0 = move-exception
            r0.printStackTrace()
        L_0x005c:
            throw r5
        L_0x005d:
            r5 = r1
        L_0x005e:
            if (r1 == 0) goto L_0x006b
            r1.flush()     // Catch: Exception -> 0x0067
            r1.close()     // Catch: Exception -> 0x0067
            goto L_0x006b
        L_0x0067:
            r0 = move-exception
            r0.printStackTrace()
        L_0x006b:
            r1 = r5
        L_0x006c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.dq1.a(android.graphics.Bitmap):java.lang.String");
    }

    public static Bitmap b(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("cc237851", new Object[]{drawable});
        }
        if (drawable == null) {
            AdapterForTLog.loge(TAG, "drawable is null");
            return null;
        } else if (drawable instanceof BitmapDrawable) {
            AdapterForTLog.loge(TAG, "drawable is BitmapDrawable");
            return ((BitmapDrawable) drawable).getBitmap();
        } else {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            AdapterForTLog.loge(TAG, "drawable start convert to bitmap");
            if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
                intrinsicWidth = Math.round(TypedValue.applyDimension(1, 200.0f, Resources.getSystem().getDisplayMetrics()));
                intrinsicHeight = intrinsicWidth;
            }
            Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
            return createBitmap;
        }
    }
}

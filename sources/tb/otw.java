package tb;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.text.TextUtils;
import android.util.Base64;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.weex.utils.WXLogUtils;
import tb.fzc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class otw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f25650a = -1;
    public int b = -1;
    public Bitmap c = null;
    public String d = "";
    public String e = "";
    public Intent f = null;
    public boolean g = false;
    public fzc.a h;

    static {
        t2o.a(773849089);
    }

    public static Bitmap b(Bitmap bitmap, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("6bd6d5fd", new Object[]{bitmap, new Integer(i)});
        }
        if (bitmap == null) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        float f = i / height;
        Matrix matrix = new Matrix();
        matrix.postScale(f, f);
        return Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
    }

    public boolean c(String str, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f0bdd309", new Object[]{this, str, new Float(f)})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String replace = str.replace(' ', '+');
        try {
            byte[] decode = Base64.decode(replace, 0);
            Bitmap b = b(BitmapFactory.decodeByteArray(decode, 0, decode.length), (int) (f / 2.0f));
            this.c = b;
            if (b == null) {
                WXLogUtils.e("TBWXActionBarMenuItem", replace + "is not a base64 bitmap data");
            }
        } catch (IllegalArgumentException unused) {
            WXLogUtils.e("TBWXActionBarMenuItem", "base64 to byteArr decode fail");
        }
        if (this.c != null) {
            return true;
        }
        return false;
    }

    public int d(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6c672859", new Object[]{this, context, str})).intValue();
        }
        int a2 = a(context, str);
        this.b = a2;
        return a2;
    }

    public int e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("94f08524", new Object[]{this, str})).intValue();
        }
        int i = "tb_icon_navibar_default_right".equals(str) ? R.drawable.tb_icon_navibar_default_right : -1;
        this.f25650a = i;
        return i;
    }

    public void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c820927", new Object[]{this, str});
        } else {
            this.d = str;
        }
    }

    public static final int a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("24399fe5", new Object[]{context, str})).intValue();
        }
        if (context == null || context.getResources() == null) {
            return 0;
        }
        Resources resources = context.getResources();
        return resources.getIdentifier("uik_icon_" + str, "string", context.getPackageName());
    }
}

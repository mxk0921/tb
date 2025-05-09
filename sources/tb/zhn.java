package tb;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.view.WindowInsets;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.TBAutoSizeConfig;
import com.taobao.android.autosize.TBDeviceUtils;
import com.taobao.codetrack.sdk.assets.AssetsDelegate;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.tao.Globals;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class zhn {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final boolean DEFAULT_LOAD_ON_FLING = true;

    /* renamed from: a  reason: collision with root package name */
    public static Boolean f32777a;

    public static void B(Closeable closeable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50e99ee0", new Object[]{closeable});
        } else if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x003b: MOVE  (r1 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:14:0x003b */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.io.Reader, java.io.InputStreamReader] */
    public static String C(Context context, String str) {
        Throwable th;
        BufferedReader bufferedReader;
        IOException e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3f1eebc5", new Object[]{context, str});
        }
        StringBuilder sb = new StringBuilder();
        Closeable closeable = null;
        try {
            try {
                context = AssetsDelegate.proxy_open(context.getAssets(), str);
                try {
                    str = new InputStreamReader(context);
                } catch (IOException e2) {
                    bufferedReader = null;
                    e = e2;
                    str = 0;
                } catch (Throwable th2) {
                    th = th2;
                    str = 0;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (IOException e3) {
            str = 0;
            bufferedReader = null;
            e = e3;
            context = 0;
        } catch (Throwable th4) {
            th = th4;
            context = 0;
            str = 0;
        }
        try {
            bufferedReader = new BufferedReader(str);
            while (true) {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    sb.append(readLine);
                } catch (IOException e4) {
                    e = e4;
                    e.printStackTrace();
                    B(bufferedReader);
                    B(str);
                    B(context);
                    return sb.toString();
                }
            }
        } catch (IOException e5) {
            bufferedReader = null;
            e = e5;
        } catch (Throwable th5) {
            th = th5;
            B(closeable);
            B(str);
            B(context);
            throw th;
        }
        B(bufferedReader);
        B(str);
        B(context);
        return sb.toString();
    }

    public static Bitmap D(Bitmap bitmap, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("7405630c", new Object[]{bitmap, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6)});
        }
        if (bitmap == null) {
            return null;
        }
        float f = i;
        float f2 = i2;
        Matrix matrix = new Matrix();
        matrix.setScale((f * 1.0f) / bitmap.getWidth(), (1.0f * f2) / bitmap.getHeight());
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        bitmapShader.setLocalMatrix(matrix);
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setShader(bitmapShader);
        RectF rectF = new RectF();
        if (i3 >= 0) {
            float f3 = i3;
            canvas.drawRoundRect(new RectF(0.0f, 0.0f, (i / 2) + i3, (i2 / 2) + i3), f3, f3, paint);
        }
        if (i4 >= 0) {
            i7 = 2;
            float f4 = i4;
            canvas.drawRoundRect(new RectF((i / 2) - i4, 0.0f, f, (i2 / 2) + i4), f4, f4, paint);
        } else {
            i7 = 2;
        }
        if (i6 >= 0) {
            float f5 = i6;
            canvas.drawRoundRect(new RectF(0.0f, (i2 / 2) - i6, (i / 2) + i6, f2), f5, f5, paint);
        }
        if (i5 >= 0) {
            float f6 = i5;
            canvas.drawRoundRect(new RectF((i / i7) - i5, (i2 / i7) - i5, f, f2), f6, f6, paint);
        }
        canvas.drawRect(rectF, paint);
        return createBitmap;
    }

    public static int E(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1c014e72", new Object[]{new Integer(i)})).intValue();
        }
        return (int) (i * (q() / 720.0f));
    }

    public static int F(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d9040fef", new Object[]{new Float(f)})).intValue();
        }
        return (int) ((f * Globals.getApplication().getResources().getDisplayMetrics().scaledDensity) + 0.5f);
    }

    public static int G(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("338074d7", new Object[]{str, new Integer(i)})).intValue();
        }
        try {
            return Integer.parseInt(str);
        } catch (Exception e) {
            e.printStackTrace();
            return i;
        }
    }

    public static long H(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ad61214a", new Object[]{str, new Long(j)})).longValue();
        }
        try {
            return Long.parseLong(str);
        } catch (Exception e) {
            e.printStackTrace();
            return j;
        }
    }

    public static JSONObject b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("22cb6723", new Object[]{str, str2});
        }
        JSONObject jSONObject = new JSONObject();
        if (!TextUtils.isEmpty(str)) {
            jSONObject.put("title", (Object) str);
        }
        jSONObject.put("titleColor", (Object) why.DEFAULT_MASK_BACKGROUND_COLOR);
        jSONObject.put("contentTextSize", (Object) "13");
        jSONObject.put("text", (Object) str2);
        jSONObject.put("textColor", (Object) why.DEFAULT_MASK_BACKGROUND_COLOR);
        return jSONObject;
    }

    public static JSONObject c(String str, String str2, Integer num, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("ad339bc8", new Object[]{str, str2, num, str3, str4});
        }
        JSONObject jSONObject = new JSONObject();
        if (!TextUtils.isEmpty(str)) {
            jSONObject.put("title", (Object) str);
            jSONObject.put("titleColor", (Object) str4);
        }
        jSONObject.put("contentTextSize", (Object) str3);
        jSONObject.put("text", (Object) str2);
        jSONObject.put("textStyle", (Object) num);
        jSONObject.put("textColor", (Object) str4);
        return jSONObject;
    }

    public static String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c8f6d337", new Object[0]);
        }
        String str = Build.CPU_ABI;
        if (str == null || str.length() == 0 || str.equals("Unknown")) {
            str = "armeabi";
        }
        return str.toLowerCase();
    }

    public static void e(TUrlImageView tUrlImageView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c17c972", new Object[]{tUrlImageView, str});
        } else {
            g(tUrlImageView, str, null);
        }
    }

    public static void f(TUrlImageView tUrlImageView, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f0d4013", new Object[]{tUrlImageView, str, new Integer(i)});
        } else {
            h(tUrlImageView, str, true, i);
        }
    }

    public static void g(TUrlImageView tUrlImageView, String str, s8d<FailPhenixEvent> s8dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59a77bf3", new Object[]{tUrlImageView, str, s8dVar});
            return;
        }
        f(tUrlImageView, str, 0);
        tUrlImageView.failListener(s8dVar);
    }

    public static void h(TUrlImageView tUrlImageView, String str, boolean z, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2a2ef9f", new Object[]{tUrlImageView, str, new Boolean(z), new Integer(i)});
            return;
        }
        Drawable background = tUrlImageView.getBackground();
        if (background == null) {
            tUrlImageView.setBackgroundResource(i);
        }
        if (background == null) {
            tUrlImageView.setErrorImageResId(i);
        }
        tUrlImageView.setPlaceHoldImageResId(i);
        tUrlImageView.enableLoadOnFling(z);
        tUrlImageView.setImageUrl(str);
    }

    public static int i(Context context, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1a48ebe0", new Object[]{context, new Float(f)})).intValue();
        }
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static int j(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("11e1b4dd", new Object[]{new Float(f)})).intValue();
        }
        return (int) ((f * Globals.getApplication().getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static String k(long j) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("822a8df2", new Object[]{new Long(j)});
        }
        if (j < 10000) {
            return String.valueOf(j);
        }
        StringBuffer stringBuffer = new StringBuffer();
        int i2 = (int) (j / 10000);
        int i3 = (int) ((j % 10000) / 1000);
        if (((int) ((j % 1000) / 100)) < 5 || (i3 = i3 + 1) <= 9) {
            i = i3;
        } else {
            i2++;
        }
        stringBuffer.append(i2);
        if (i > 0) {
            stringBuffer.append(".");
            stringBuffer.append(i);
        }
        stringBuffer.append(dx1.b(R.string.rate_ten_thousand));
        return stringBuffer.toString();
    }

    public static int l(Context context, WindowInsets windowInsets) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f1a0318c", new Object[]{context, windowInsets})).intValue();
        }
        return oxq.g(context, windowInsets);
    }

    public static int m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4f7254aa", new Object[0])).intValue();
        }
        try {
            Resources resources = Globals.getApplication().getResources();
            return resources.getDimensionPixelSize(resources.getIdentifier("navigation_bar_height", "dimen", "android"));
        } catch (Exception unused) {
            return 0;
        }
    }

    public static Set<String> n(Uri uri) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("ea011e", new Object[]{uri});
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (uri == null) {
            return Collections.unmodifiableSet(linkedHashSet);
        }
        if (!uri.isOpaque()) {
            String encodedQuery = uri.getEncodedQuery();
            if (encodedQuery == null) {
                return Collections.emptySet();
            }
            do {
                int indexOf = encodedQuery.indexOf(38, i);
                if (indexOf == -1) {
                    indexOf = encodedQuery.length();
                }
                int indexOf2 = encodedQuery.indexOf(61, i);
                if (indexOf2 > indexOf || indexOf2 == -1) {
                    indexOf2 = indexOf;
                }
                linkedHashSet.add(Uri.decode(encodedQuery.substring(i, indexOf2)));
                i = indexOf + 1;
            } while (i < encodedQuery.length());
            return Collections.unmodifiableSet(linkedHashSet);
        }
        throw new UnsupportedOperationException("This isn't a hierarchical URI.");
    }

    public static RoundRectShape o(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RoundRectShape) ipChange.ipc$dispatch("cf76d93e", new Object[]{new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        }
        float[] fArr = new float[8];
        if (i > 0) {
            float f = i;
            fArr[0] = f;
            fArr[1] = f;
        }
        if (i2 > 0) {
            float f2 = i2;
            fArr[2] = f2;
            fArr[3] = f2;
        }
        if (i3 > 0) {
            float f3 = i3;
            fArr[4] = f3;
            fArr[5] = f3;
        }
        if (i4 > 0) {
            float f4 = i4;
            fArr[6] = f4;
            fArr[7] = f4;
        }
        return new RoundRectShape(fArr, null, null);
    }

    public static int p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3d9e9723", new Object[0])).intValue();
        }
        return Globals.getApplication().getResources().getDisplayMetrics().heightPixels;
    }

    public static int q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("43d49fe", new Object[0])).intValue();
        }
        return Globals.getApplication().getResources().getDisplayMetrics().widthPixels;
    }

    public static int r(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7b698891", new Object[]{context})).intValue();
        }
        return oxq.o(context);
    }

    public static boolean s(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("65da8e95", new Object[]{context})).booleanValue();
        }
        if (TBDeviceUtils.t(context) || TBDeviceUtils.G(context)) {
            return true;
        }
        return false;
    }

    public static boolean t(Context context, WindowInsets windowInsets) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f375a1b6", new Object[]{context, windowInsets})).booleanValue();
        }
        return oxq.q(context, windowInsets);
    }

    public static boolean u(Collection collection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1b35377f", new Object[]{collection})).booleanValue();
        }
        if (collection == null || collection.isEmpty()) {
            return true;
        }
        return false;
    }

    public static boolean v(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("afe54a44", new Object[]{context})).booleanValue();
        }
        return TBDeviceUtils.p(context);
    }

    public static boolean w(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b55c22bc", new Object[]{context})).booleanValue();
        }
        if (x(context) || v(context) || TBAutoSizeConfig.x().R(context)) {
            return true;
        }
        return false;
    }

    public static boolean x(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f374103f", new Object[]{context})).booleanValue();
        }
        return TBDeviceUtils.P(context);
    }

    public static boolean y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bfaea77", new Object[0])).booleanValue();
        }
        if (f32777a == null) {
            f32777a = Boolean.valueOf(TextUtils.equals(d(), "x86"));
        }
        return f32777a.booleanValue();
    }

    public static void z(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d63b606", new Object[]{jSONObject, jSONObject2});
        } else if (jSONObject != null) {
            Set<String> keySet = jSONObject.keySet();
            if (!u(keySet)) {
                for (String str : keySet) {
                    jSONObject2.put(str, jSONObject.get(str));
                }
            }
        }
    }

    public static int A(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("170122f4", new Object[]{str})).intValue();
        }
        if (str.equals(pg1.ATOM_EXT_random)) {
            return tkt.DEFAULT_SHADOW_COLOR;
        }
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        if (str.charAt(0) == '#' && str.length() > 7) {
            str = "#" + str.substring(7) + str.substring(1, 7);
        }
        try {
            return Color.parseColor(str);
        } catch (IllegalArgumentException unused) {
            return 0;
        }
    }

    public static JSONArray a(JSONArray jSONArray) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("36d06bc7", new Object[]{jSONArray});
        }
        JSONArray jSONArray2 = new JSONArray();
        if (jSONArray == null) {
            return jSONArray2;
        }
        for (int i = 0; i < jSONArray.size(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            if (jSONObject != null) {
                JSONObject jSONObject2 = new JSONObject();
                boolean equals = "label".equals(jSONObject.getString("type"));
                if (!jSONObject.containsKey("newline") || !jSONObject.getBoolean("newline").booleanValue()) {
                    if (equals) {
                        jSONObject2.put("title", (Object) jSONObject.getString("text"));
                    } else {
                        jSONObject2.put("text", (Object) jSONObject.getString("text"));
                    }
                } else if (equals) {
                    jSONObject2.put("title", (Object) (jSONObject.getString("text") + "\n"));
                } else {
                    jSONObject2.put("text", (Object) (jSONObject.getString("text") + "\n"));
                }
                String string = jSONObject.getString("font");
                int i2 = 13;
                if (!TextUtils.isEmpty(string) && TextUtils.isDigitsOnly(string)) {
                    try {
                        i2 = Integer.valueOf(string).intValue() / 2;
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                jSONObject2.put("contentTextSize", (Object) Integer.valueOf(i2));
                if (!TextUtils.isEmpty(jSONObject.getString("color"))) {
                    str = jSONObject.getString("color");
                } else {
                    str = why.DEFAULT_MASK_BACKGROUND_COLOR;
                }
                jSONObject2.put("textColor", (Object) str);
                jSONArray2.add(jSONObject2);
            }
        }
        return jSONArray2;
    }
}

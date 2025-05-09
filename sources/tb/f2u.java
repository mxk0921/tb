package tb;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class f2u {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static DisplayMetrics f18967a;

    static {
        t2o.a(297795587);
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("710063ce", new Object[]{str});
        }
        if (!kjf.a()) {
            return str;
        }
        try {
            JSONObject parseObject = JSON.parseObject(str);
            parseObject.put("inner", (Object) "1");
            return parseObject.toJSONString();
        } catch (JSONException unused) {
            return str;
        }
    }

    public static String b(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f31b0b24", new Object[]{str, jSONObject});
        }
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        if (jSONObject == null || jSONObject.isEmpty()) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str);
        if (!str.contains("?")) {
            sb.append("?");
        } else {
            sb.append("&");
        }
        for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
            if (!(entry == null || TextUtils.isEmpty(entry.getKey()) || entry.getValue() == null)) {
                sb.append(entry.getKey());
                sb.append("=");
                sb.append(entry.getValue());
                sb.append("&");
            }
        }
        return sb.deleteCharAt(sb.length() - 1).toString();
    }

    public static int c(BitmapFactory.Options options, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e7b37ce", new Object[]{options, new Integer(i), new Integer(i2)})).intValue();
        }
        int i3 = options.outHeight;
        int i4 = options.outWidth;
        if (i3 > i2 || i4 > i) {
            return Math.min(Math.round(i3 / i2), Math.round(i4 / i));
        }
        return 1;
    }

    public static void e(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84e6c898", new Object[]{recyclerView});
            return;
        }
        String d = uel.d();
        if (!TextUtils.isEmpty(d) && recyclerView != null && "vivo".equalsIgnoreCase(Build.BRAND)) {
            String lowerCase = d.toLowerCase();
            if (lowerCase.contains(Build.MODEL.toLowerCase() + ",") && recyclerView.getItemAnimator() != null) {
                recyclerView.getItemAnimator().setAddDuration(0L);
                recyclerView.getItemAnimator().setChangeDuration(0L);
                recyclerView.getItemAnimator().setMoveDuration(0L);
                ndv.a(null, "disableRecyclerAnim", ndv.UMB_FEATURE_ORDER_MONITOR, "disableRecyclerAnim", "DISABLE_RECYCLER_ANIM", "disabled-recycler-anim", null);
            }
        }
    }

    public static int f(Context context, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1a48ebe0", new Object[]{context, new Float(f)})).intValue();
        }
        if (context == null) {
            return 0;
        }
        return (int) (context.getResources().getDisplayMetrics().density * f);
    }

    public static DisplayMetrics g(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DisplayMetrics) ipChange.ipc$dispatch("aeee540d", new Object[]{context});
        }
        if (f18967a == null) {
            Display defaultDisplay = ((WindowManager) context.getSystemService(pg1.ATOM_EXT_window)).getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            f18967a = displayMetrics;
            defaultDisplay.getMetrics(displayMetrics);
        }
        return f18967a;
    }

    public static int h(Context context, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("64b9c813", new Object[]{context, new Float(f)})).intValue();
        }
        return (int) (f / context.getResources().getDisplayMetrics().density);
    }

    public static int i(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b6582e9a", new Object[]{context})).intValue();
        }
        if (context == null) {
            return 0;
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        if (context.getResources().getConfiguration().orientation == 1) {
            return displayMetrics.widthPixels;
        }
        return displayMetrics.heightPixels;
    }

    public static Bitmap d(Resources resources, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("3b7bccfa", new Object[]{resources, new Integer(i), new Integer(i2), new Integer(i3)});
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        try {
            BitmapFactory.decodeResource(resources, i, options);
            options.inSampleSize = c(options, i2, i3);
            options.inJustDecodeBounds = false;
            try {
                return BitmapFactory.decodeResource(resources, i, options);
            } catch (Throwable th) {
                ndv.a(null, "decodeSampledBitmapFromResource", ndv.UMB_FEATURE_ORDER_MONITOR, "decodeSampledBitmapFromResource", "DECODE_SKELETON_ERROR", th.toString(), null);
                return null;
            }
        } catch (Throwable unused) {
        }
    }
}

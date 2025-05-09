package tb;

import android.text.TextUtils;
import android.util.SparseIntArray;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class pbo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final SparseIntArray f26001a = new SparseIntArray();

    public static int b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a7072c16", new Object[]{new Integer(i)})).intValue();
        }
        return f26001a.get(i);
    }

    public static void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba8a8535", new Object[]{new Integer(i)});
            return;
        }
        SparseIntArray sparseIntArray = f26001a;
        sparseIntArray.put(i, sparseIntArray.get(i) + 1);
        o7h.b().f25187a.edit().putString("retry_count", sparseIntArray.toString().replaceAll(" ", "")).apply();
    }

    public static void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f571fd04", new Object[]{str});
            return;
        }
        String[] split = str.substring(1, str.lastIndexOf("}")).split(",");
        for (int i = 0; i < split.length; i++) {
            f26001a.put(Integer.valueOf(split[i].split("=")[0].trim()).intValue(), Integer.valueOf(split[i].split("=")[1].trim()).intValue());
        }
    }

    static {
        t2o.a(654311471);
        try {
            String string = o7h.b().f25187a.getString("retry_count", "");
            if (!TextUtils.isEmpty(string) && !string.equals("{}")) {
                c(string);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}

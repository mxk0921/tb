package tb;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import com.alibaba.poplayer.layermanager.d;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.qrcode.result.Result;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.lang.ref.WeakReference;
import java.util.Objects;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class lyv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static int f23652a = 0;

    static {
        t2o.a(626000053);
    }

    public static int a(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8536bb04", new Object[]{context, new Integer(i)})).intValue();
        }
        return (int) ((i * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static boolean b(Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7b37c282", new Object[]{obj, obj2})).booleanValue();
        }
        return Objects.equals(obj, obj2);
    }

    public static <T> T c(WeakReference<T> weakReference) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("9e0acc72", new Object[]{weakReference});
        }
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public static float d(Context context, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6885ccb4", new Object[]{context, new Float(f)})).floatValue();
        }
        return e(context, f, true);
    }

    public static float e(Context context, float f, boolean z) {
        float intValue;
        float f2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a8347e80", new Object[]{context, new Float(f), new Boolean(z)})).floatValue();
        }
        if (Float.isNaN(f)) {
            return f;
        }
        Pair<Integer, Integer> a2 = ivo.a(context);
        if (z) {
            intValue = f * ((Integer) a2.first).intValue();
            f2 = 750.0f;
        } else {
            intValue = f * ((Integer) a2.first).intValue();
            f2 = 1300.0f;
        }
        float f3 = intValue / f2;
        double d = f3;
        if (d <= 0.005d || f3 >= 1.0f) {
            return (float) Math.rint(d);
        }
        return 1.0f;
    }

    public static float f(Context context, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a396a912", new Object[]{context, new Float(f)})).floatValue();
        }
        if (Float.isNaN(f)) {
            return f;
        }
        float intValue = (f * 750.0f) / ((Integer) ivo.a(context).first).intValue();
        double d = intValue;
        if (d <= 0.005d || intValue >= 1.0f) {
            return (float) Math.rint(d);
        }
        return 1.0f;
    }

    public static String h(String str) {
        Throwable th;
        FileInputStream fileInputStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a3589122", new Object[]{str});
        }
        if (Looper.getMainLooper() == Looper.myLooper()) {
            wdm.a("Utils.convertStreamToString.InMainThread!!!");
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        File file = new File(str);
        if (!file.exists()) {
            return "";
        }
        try {
            fileInputStream = new FileInputStream(file);
            try {
                byte[] bArr = new byte[fileInputStream.available()];
                fileInputStream.read(bArr);
                i(fileInputStream);
                return new String(bArr);
            } catch (Throwable th2) {
                th = th2;
                try {
                    wdm.h("Utils.convertStreamToString.error.", th);
                    return "";
                } finally {
                    i(fileInputStream);
                }
            }
        } catch (Throwable th3) {
            fileInputStream = null;
            th = th3;
        }
    }

    public static void i(Closeable closeable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("274b86d2", new Object[]{closeable});
        } else if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    public static boolean j(Activity activity) {
        boolean z;
        boolean z2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1260fa7f", new Object[]{activity})).booleanValue();
        }
        if (activity == null) {
            return false;
        }
        try {
            int systemUiVisibility = activity.getWindow().getDecorView().getSystemUiVisibility();
            if ((systemUiVisibility & 1024) == 1024) {
                z = true;
            } else {
                z = false;
            }
            if ((systemUiVisibility & 512) == 512) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z || z2) {
                return true;
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean k(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7b2e149e", new Object[]{activity})).booleanValue();
        }
        IpChange ipChange2 = d.$ipChange;
        return false;
    }

    public static void l(String str, String str2) {
        Throwable th;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("597b3940", new Object[]{str, str2});
            return;
        }
        if (Looper.getMainLooper() == Looper.myLooper()) {
            wdm.a("Utils.saveStringToFile.InMainThread!!!");
        }
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            BufferedWriter bufferedWriter = null;
            try {
                File file = new File(str);
                if (file.exists() && file.isDirectory()) {
                    file.delete();
                }
                if (!file.getParentFile().exists()) {
                    file.getParentFile().mkdirs();
                }
                if (file.exists()) {
                    file.delete();
                }
                file.createNewFile();
                bufferedWriter = new BufferedWriter(new FileWriter(file));
                try {
                    bufferedWriter.write(str2);
                    bufferedWriter.flush();
                    bufferedWriter.close();
                    i(bufferedWriter);
                } catch (Throwable th2) {
                    bufferedWriter = bufferedWriter;
                    th = th2;
                    try {
                        wdm.h("Utils.saveStringToFile.error.", th);
                    } finally {
                        i(bufferedWriter);
                    }
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    public static int g(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("226dbd42", new Object[]{context})).intValue();
        }
        try {
            int i = f23652a;
            if (i > 0) {
                return i;
            }
            Resources resources = context.getResources();
            int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
            if (identifier > 0) {
                f23652a = resources.getDimensionPixelSize(identifier);
            }
            return f23652a;
        } catch (Throwable unused) {
            return 0;
        }
    }

    public static boolean m(String str, String str2) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d413112f", new Object[]{str, str2})).booleanValue();
        }
        if (TextUtils.isEmpty(str) || str.equals("*") || str.equals("-")) {
            return true;
        }
        try {
            b3w b3wVar = new b3w(str2);
            if (str.contains("|")) {
                try {
                    int indexOf = str.indexOf("|");
                    String substring = str.substring(0, indexOf);
                    String[] split = str.substring(indexOf + 1).split(",");
                    if (split.length > 0) {
                        for (String str3 : split) {
                            if (!TextUtils.isEmpty(str3)) {
                                try {
                                    if (new b3w(str3).equals(b3wVar)) {
                                        return false;
                                    }
                                } catch (IllegalArgumentException e) {
                                    wdm.h("CommonConfigRule.versionCheck.check enum version error.", e);
                                    return false;
                                }
                            }
                        }
                    }
                    str = substring;
                } catch (Throwable th) {
                    wdm.h("CommonConfigRule.versionCheck.check enum version error.", th);
                    return false;
                }
            } else {
                wdm.d("CommonConfigRule.versionCheck.no exclude info.", new Object[0]);
            }
            if (TextUtils.isEmpty(str)) {
                return true;
            }
            if (!str.contains("-")) {
                String[] split2 = str.split(",");
                if (split2.length > 0) {
                    for (String str4 : split2) {
                        try {
                        } catch (IllegalArgumentException e2) {
                            wdm.h("CommonConfigRule.versionCheck.check enum version error.", e2);
                        }
                        if (new b3w(str4).equals(b3wVar)) {
                            wdm.d("CommonConfigRule.versionCheck.enum.success", new Object[0]);
                            return true;
                        }
                        continue;
                    }
                }
            } else {
                String[] split3 = str.split("-");
                String str5 = "Fail";
                if (str.endsWith("-") && split3.length == 1) {
                    try {
                        if (b3wVar.compareTo(new b3w(split3[0])) < 0) {
                            z = false;
                        }
                        StringBuilder sb = new StringBuilder();
                        sb.append("CommonConfigRule.versionCheck.Interval.Start.");
                        if (z) {
                            str5 = Result.MSG_SUCCESS;
                        }
                        sb.append(str5);
                        wdm.d(sb.toString(), new Object[0]);
                        return z;
                    } catch (IllegalArgumentException e3) {
                        wdm.h("CommonConfigRule.versionCheck.check end version error.", e3);
                    }
                } else if (str.startsWith("-") && split3.length == 2) {
                    try {
                        if (b3wVar.compareTo(new b3w(split3[1])) > 0) {
                            z = false;
                        }
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("CommonConfigRule.versionCheck.Interval.End.");
                        if (z) {
                            str5 = Result.MSG_SUCCESS;
                        }
                        sb2.append(str5);
                        wdm.d(sb2.toString(), new Object[0]);
                        return z;
                    } catch (IllegalArgumentException e4) {
                        wdm.h("CommonConfigRule.versionCheck.check start version error.", e4);
                    }
                } else if (split3.length == 2) {
                    try {
                        b3w b3wVar2 = new b3w(split3[0]);
                        b3w b3wVar3 = new b3w(split3[1]);
                        if (b3wVar2.compareTo(b3wVar3) > 0 || b3wVar.compareTo(b3wVar3) > 0 || b3wVar.compareTo(b3wVar2) < 0) {
                            z = false;
                        }
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("CommonConfigRule.versionCheck.Interval.End.");
                        if (z) {
                            str5 = Result.MSG_SUCCESS;
                        }
                        sb3.append(str5);
                        wdm.d(sb3.toString(), new Object[0]);
                        return z;
                    } catch (IllegalArgumentException e5) {
                        wdm.h("CommonConfigRule.versionCheck.check start end version error.", e5);
                    }
                }
            }
            return false;
        } catch (IllegalArgumentException e6) {
            wdm.i(true, "CommonConfigRule.versionCheck.format curVersion error.", e6);
            return false;
        }
    }
}

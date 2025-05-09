package tb;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.alibaba.android.ultron.engine.model.TemplateComponent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.utils.UnifyLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class qcv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Handler f26674a = new Handler(Looper.getMainLooper());

    static {
        t2o.a(157286499);
    }

    public static String a(TemplateComponent templateComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6014f1b0", new Object[]{templateComponent});
        }
        if (templateComponent.id == null) {
            templateComponent.id = Long.valueOf(xen.b());
        }
        return templateComponent.tag + "_" + templateComponent.id;
    }

    public static String b(x6v x6vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dd080615", new Object[]{x6vVar});
        }
        if (TextUtils.isEmpty(x6vVar.f31184a) || "null".equals(x6vVar.f31184a)) {
            x6vVar.f31184a = String.valueOf(xen.b());
        }
        return x6vVar.b + "_" + x6vVar.f31184a;
    }

    public static boolean c(Context context, String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8f7aad81", new Object[]{context, str, obj})).booleanValue();
        }
        if (e19.d(context)) {
            return e19.g(str, obj);
        }
        return d(context, str, obj);
    }

    public static boolean d(Context context, String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d1ffb9c8", new Object[]{context, str, obj})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        Object d = qq8.d(obj, str);
        if (d == null) {
            return false;
        }
        return g68.a(context).b(d.toString());
    }

    public static void e(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f52770d", new Object[]{runnable});
        } else if (runnable != null) {
            try {
                if (Looper.myLooper() != Looper.getMainLooper()) {
                    f26674a.post(runnable);
                } else {
                    runnable.run();
                }
            } catch (Throwable th) {
                UnifyLog.e("UltronUtils", "runOnUIThread error", th.getMessage());
            }
        }
    }
}

package tb;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.layoutmanager.adapter.impl.tbtheme.a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class xar {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static volatile a f31254a;

    static {
        t2o.a(502267978);
    }

    public static boolean a(Context context) {
        Resources resources;
        Configuration configuration;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e8b94ae1", new Object[]{context})).booleanValue();
        }
        if (context == null) {
            return false;
        }
        if ((!(context instanceof Activity) || !((Activity) context).isFinishing()) && (resources = context.getResources()) != null && (configuration = resources.getConfiguration()) != null && (configuration.uiMode & 48) == 32) {
            return true;
        }
        return false;
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3cba252b", new Object[0]);
        } else if (f31254a == null) {
            synchronized (xar.class) {
                try {
                    if (f31254a == null) {
                        f31254a = new a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static int c(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9821d931", new Object[]{new Integer(i), new Integer(i2)})).intValue();
        }
        b();
        return f31254a.a(i, i2);
    }
}

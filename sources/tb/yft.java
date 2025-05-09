package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class yft implements zec {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static Boolean f32060a;

    static {
        t2o.a(491782149);
        t2o.a(486539296);
    }

    public static boolean a(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ed893b92", new Object[]{application})).booleanValue();
        }
        try {
            if ((application.getApplicationInfo().flags & 2) != 0) {
                return true;
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // tb.zec
    public Application getApplication() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Application) ipChange.ipc$dispatch("5749e470", new Object[]{this});
        }
        return Globals.getApplication();
    }

    @Override // tb.zec
    public boolean isDebug() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3a59fb54", new Object[]{this})).booleanValue();
        }
        Boolean bool = f32060a;
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean a2 = a(Globals.getApplication());
        f32060a = Boolean.valueOf(a2);
        return a2;
    }
}

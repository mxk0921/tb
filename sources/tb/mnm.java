package tb;

import android.content.Context;
import android.os.Looper;
import android.view.View;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import com.taobao.tao.topmultitab.service.view.IHomeViewService;
import java.lang.reflect.Field;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class mnm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final cew f24168a = new cew(Globals.getApplication());

    static {
        t2o.a(729809359);
    }

    public final boolean a() {
        try {
            Field declaredField = Looper.class.getDeclaredField("sThreadLocal");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(Looper.getMainLooper());
            if (obj instanceof ThreadLocal) {
                ((ThreadLocal) obj).set(Looper.getMainLooper());
            }
            return true;
        } catch (Throwable th) {
            bqa.b("PreRenderNativeView", "changeThreadToMainLooper", th);
            return false;
        }
    }

    public Context b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        return this.f24168a.a();
    }

    public View c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("c3b8e61b", new Object[]{this});
        }
        if (a()) {
            return new r3b().a(this.f24168a);
        }
        bqa.d("PreRenderNativeView", "preRenderRocketView 线程切换失败");
        return null;
    }

    public View d(IHomeViewService iHomeViewService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("9111e6de", new Object[]{this, iHomeViewService});
        }
        if (!a()) {
            bqa.d("PreRenderNativeView", "preRenderRootView 线程切换失败");
            return null;
        }
        FrameLayout k = new x2b().k(this.f24168a);
        if (iHomeViewService != null) {
            iHomeViewService.createView(k);
        }
        return k;
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bd63fb7", new Object[]{this});
        } else if (!a()) {
            bqa.d("PreRenderNativeView", "preRenderTheme 线程切换失败");
        } else {
            xti.a().i(yyj.e().k());
        }
    }

    public void f(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("740cd63b", new Object[]{this, context});
        } else {
            this.f24168a.c(context);
        }
    }
}

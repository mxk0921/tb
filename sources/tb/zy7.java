package tb;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class zy7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final zy7 INSTANCE = new zy7();

    static {
        t2o.a(918552606);
    }

    @JvmStatic
    public static final xpz a(Context context, View view, xfb xfbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xpz) ipChange.ipc$dispatch("548a93cc", new Object[]{context, view, xfbVar});
        }
        ckf.g(context, "context");
        ckf.g(view, "rootView");
        Activity c = INSTANCE.c(context);
        Intent intent = c != null ? c.getIntent() : null;
        aqz b = bqz.b("DressUpPage", view, intent, intent != null ? intent.getExtras() : null);
        b.g(context);
        b.j(R.id.rootParentFrameLayout);
        b.i(R.id.rootAnimFrameLayout);
        b.f(xfbVar);
        b.e(new q5z());
        if (b.a()) {
            tpu.Companion.a("DressAnimViewUtil", "无极缩放:二跳开始:跟后返回:穿搭星球二跳页开始处理跟后返回逻辑:II", null);
            xpz d = ypz.d(b);
            ckf.f(d, "TRNAnimInterfaceFactory.…thDragBack(trnAnimParams)");
            return d;
        }
        tpu.Companion.a("DressAnimViewUtil", "无极缩放:二跳开始:基础版本:穿搭星球二跳开始处理基础版本无极缩放逻辑:I", null);
        xpz c2 = ypz.c(b);
        ckf.f(c2, "TRNAnimInterfaceFactory.…eFrameAnim(trnAnimParams)");
        return c2;
    }

    public final Activity c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("f2c7faaa", new Object[]{this, context});
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (!(context instanceof bew)) {
            return null;
        }
        Context b = ((bew) context).b();
        if (b instanceof Activity) {
            return (Activity) b;
        }
        return null;
    }

    @JvmStatic
    public static final boolean b(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6496543c", new Object[]{view})).booleanValue();
        }
        ckf.g(view, "view");
        ViewParent parent = view.getParent();
        if (!(parent instanceof ViewGroup)) {
            return parent == null;
        }
        ((ViewGroup) parent).removeView(view);
        return true;
    }
}

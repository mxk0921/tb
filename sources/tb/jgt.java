package tb;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import tb.hfc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class jgt implements hfc {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_EXTRA_FRAME_ANIM_REASON = "extraFrameAnimReason";

    static {
        t2o.a(491782156);
        t2o.a(486539307);
    }

    @Override // tb.hfc
    public boolean a(Context context, hfc.b bVar, String str, View view, peu peuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d380cacd", new Object[]{this, context, bVar, str, view, peuVar})).booleanValue();
        }
        Context a2 = wq4.a(context);
        if (a2 != null) {
            context = a2;
        }
        Nav from = Nav.from(context);
        Bundle b = bVar.b();
        Bundle extras = bVar.getExtras();
        peu.a(peuVar, from, extras);
        if (b != null) {
            from.withOptions(b);
        }
        if (bVar.c()) {
            d(from, extras);
        }
        if (extras != null) {
            from.withExtras(extras);
        }
        if (bVar.getRequestCode() > 0) {
            if (bVar.a() != null) {
                from.withFragment(bVar.a());
            }
            try {
                from.forResult(bVar.getRequestCode());
            } catch (Exception e) {
                fve.c("TbDefaultInfoFlowNav", "nav for result error", e);
            }
        }
        if (bVar.c()) {
            return from.toUriSimple(Uri.parse(str));
        }
        return from.toUri(str);
    }

    @Override // tb.hfc
    public boolean b(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("481ddb9e", new Object[]{this, context, str})).booleanValue();
        }
        Context a2 = wq4.a(context);
        if (a2 != null) {
            context = a2;
        }
        return Nav.from(context).toUri(str);
    }

    @Override // tb.hfc
    public boolean c(Context context, hfc.b bVar, String str, View view, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fc31df06", new Object[]{this, context, bVar, str, view, new Boolean(z)})).booleanValue();
        }
        Context a2 = wq4.a(context);
        if (a2 != null) {
            context = a2;
        }
        Nav from = Nav.from(context);
        Bundle b = bVar.b();
        Bundle extras = bVar.getExtras();
        if (bVar.getRequestCode() > 0) {
            if (bVar.a() != null) {
                from.withFragment(bVar.a());
            }
            try {
                from.forResult(bVar.getRequestCode());
            } catch (Exception e) {
                fve.c("TbDefaultInfoFlowNav", "nav for result error", e);
            }
        }
        if (bVar.c()) {
            d(from, extras);
        }
        if (b != null) {
            from.withOptions(bVar.b());
        }
        if (extras != null) {
            if (z && view != null) {
                try {
                    extras.putString("extraFrameAnimReason", "animSuccess-withSharedElement");
                    from.withExtras(bVar.getExtras());
                    from.withSharedElement(view).disableTransition();
                    fve.e("TbDefaultInfoFlowNav", "命中无极缩放跳转动画，默认导航动画已禁用。");
                    if (bVar.c()) {
                        return from.toUriSimple(str);
                    }
                    return from.toUri(str);
                } catch (Throwable th) {
                    r4b.g(extras);
                    fve.e("TbDefaultInfoFlowNav", "未知异常。新动画跳转失败，将自动降级。");
                    extras.putString("extraFrameAnimReason", "animError:" + th.getCause());
                }
            }
            from.withExtras(bVar.getExtras());
        }
        if (bVar.c()) {
            return from.toUriSimple(Uri.parse(str));
        }
        return from.toUri(str);
    }

    public boolean e(Context context, hfc.b bVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8ed9aac4", new Object[]{this, context, bVar, str})).booleanValue();
        }
        return c(context, bVar, str, null, false);
    }

    public final void d(Nav nav, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2bdac6ed", new Object[]{this, nav, bundle});
        } else if (nav != null && bundle != null) {
            nav.withOptions(bundle);
            bundle.putBoolean("ndExtraDataHasAppend", true);
        }
    }
}

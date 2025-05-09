package tb;

import android.app.Activity;
import android.net.Uri;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.net.URLEncoder;
import tb.xb3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class vb3 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final vb3 INSTANCE = new vb3();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a extends xb3.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/opencart/joingroup/CartJoinGroup$show$1$1");
        }

        @Override // tb.xb3.a
        public void a(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fbb2708b", new Object[]{this, view});
                return;
            }
            ckf.g(view, "containerView");
            view.setAlpha(1.0f);
        }

        @Override // tb.xb3.a
        public void b(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cd74a62f", new Object[]{this, view});
                return;
            }
            ckf.g(view, "containerView");
            view.setAlpha(0.0f);
        }
    }

    public final String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e3ae7aca", new Object[]{this});
        }
        if (n7v.a()) {
            return "https://meta.wapa.taobao.com/app/tb-trade/icart-group-list2/detailPop?wh_weex=true&weex_mode=dom&wx_opaque=0&renderMode=texture&is_loading=0";
        }
        return "https://meta.m.taobao.com/app/tb-trade/icart-group-list2/detailPop?wh_weex=true&weex_mode=dom&wx_opaque=0&renderMode=texture&is_loading=0";
    }

    public final void b(Activity activity, wb3 wb3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed4d8865", new Object[]{this, activity, wb3Var});
            return;
        }
        ckf.g(activity, "activity");
        ckf.g(wb3Var, "model");
        if (n7v.a()) {
            hav.d("CartJoinGroup", "mode=" + wb3Var);
        }
        if (wb3Var.c().length() == 0) {
            hav.a("CartJoinGroup", "cartId不能为空");
            return;
        }
        Uri.Builder buildUpon = Uri.parse(a()).buildUpon();
        buildUpon.appendQueryParameter("cartId", wb3Var.c());
        buildUpon.appendQueryParameter("direction", wb3Var.e());
        buildUpon.appendQueryParameter("x", String.valueOf(wb3Var.b().x));
        buildUpon.appendQueryParameter("y", String.valueOf(wb3Var.b().y));
        String a2 = wb3Var.a();
        if (a2 != null) {
            buildUpon.appendQueryParameter("exParams", URLEncoder.encode(a2, "UTF-8"));
        }
        Uri build = buildUpon.build();
        yb3 yb3Var = new yb3(activity);
        String uri = build.toString();
        ckf.f(uri, "url.toString()");
        xb3 xb3Var = new xb3(uri, wb3Var.d() * 1000);
        xb3Var.e(new a());
        xhv xhvVar = xhv.INSTANCE;
        yb3Var.h(xb3Var);
    }
}

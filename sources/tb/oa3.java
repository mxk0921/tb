package tb;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class oa3 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final oa3 INSTANCE = new oa3();

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f25242a;
    public static final String b;

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final a INSTANCE = new a();

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                oa3.a(oa3.INSTANCE);
            } catch (Throwable th) {
                xh8 c = xh8.a("Ultron").c("CartDXButterUpgrade");
                String message = th.getMessage();
                if (message == null) {
                    message = "出错了";
                }
                f9v.q(c.message(message));
            }
        }
    }

    static {
        t2o.a(479199507);
        b = "";
        String str = "icart_elevator,icart_mix_header,icart_submit,icart_footer_addon_bar,icart_tab,icart_invalid_item,icart_mix_group,icart_mix_item,icart_promotion,icart_calculate_4_column,icart_submit_promotion,cart_footer_promotion,icart_ad_banner";
        if (l9v.a("forceEnableDXButter")) {
            f25242a = true;
            b = str;
        } else {
            m9v d = m9v.d(c9x.CART_BIZ_NAME);
            ckf.f(d, "UltronMMKV.get(CartConstants.CART_BIZ_NAME)");
            f25242a = d.h("enableSmoothButter", true);
            String l = d.l("containerWhiteListForDXButter");
            if (l != null) {
                str = l;
            }
            b = str;
        }
        hav.d("CartDXButterUpgrade", "init,enableSmoothButter=" + f25242a + ",templateWhiteList=" + b);
    }

    public static final /* synthetic */ void a(oa3 oa3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d503092", new Object[]{oa3Var});
        } else {
            oa3Var.d();
        }
    }

    @JvmStatic
    public static final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97a8406", new Object[0]);
        } else {
            pav.k(a.INSTANCE);
        }
    }

    public final boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("59c5b572", new Object[]{this})).booleanValue();
        }
        return f25242a;
    }

    public final String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bb19a302", new Object[]{this});
        }
        return b;
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67e51eba", new Object[]{this});
            return;
        }
        m9v d = m9v.d(c9x.CART_BIZ_NAME);
        ckf.f(d, "UltronMMKV.get(CartConstants.CART_BIZ_NAME)");
        boolean a2 = vav.a(c9x.CART_BIZ_NAME, "enableSmoothButterOrange", true);
        d.p("enableSmoothButter", a2);
        String str = "icart_elevator,icart_mix_header,icart_submit,icart_footer_addon_bar,icart_tab,icart_invalid_item,icart_mix_group,icart_mix_item,icart_promotion,icart_calculate_4_column,icart_submit_promotion,cart_footer_promotion,icart_ad_banner";
        String g = vav.g(c9x.CART_BIZ_NAME, "containerWhiteListForDXButter", str);
        if (g != null) {
            str = g;
        }
        d.s("containerWhiteListForDXButter", str);
        hav.d("CartDXButterUpgrade", "updateDXButterSwitchConfig,enableDXButter=" + a2 + ",whiteList=" + str);
    }
}

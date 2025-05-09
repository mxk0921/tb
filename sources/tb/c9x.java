package tb;

import android.taobao.mulitenv.EnvironmentSwitcher;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class c9x {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CART_BIZ_NAME = "iCart";
    public static final a Companion = new a(null);
    public static final String TAG = "CartWeex";

    /* renamed from: a  reason: collision with root package name */
    public static String f16931a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(478151058);
        }

        public a() {
        }

        public final String a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("7692f948", new Object[]{this});
            }
            if (!cw6.b()) {
                return null;
            }
            return c9x.a();
        }

        public final String b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("b9b36c81", new Object[]{this});
            }
            if (!cw6.b()) {
                return "https://meta.m.taobao.com/app/mtb/icart/cart?wh_weex=true&weex_mode=dom&wx_limit_raster_cache=true&wx_navbar_hidden=true";
            }
            String a2 = c9x.a();
            if (a2 != null && a2.length() > 0) {
                String a3 = c9x.a();
                ckf.d(a3);
                return a3;
            } else if (c()) {
                return "https://meta.m.taobao.com/app/mtb/icart/cart?wh_weex=true&weex_mode=dom&wx_limit_raster_cache=true&wx_navbar_hidden=true";
            } else {
                return "https://meta.wapa.taobao.com/app/mtb/icart/cart?wh_weex=true&weex_mode=dom&wx_limit_raster_cache=true&wx_navbar_hidden=true";
            }
        }

        public final boolean c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7d0d00bb", new Object[]{this})).booleanValue();
            }
            if (EnvironmentSwitcher.EnvType.OnLINE.getValue() == EnvironmentSwitcher.a()) {
                return true;
            }
            return false;
        }

        public final void d(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ec6aa42e", new Object[]{this, str});
            } else if (cw6.b()) {
                c9x.b(str);
            }
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(478151057);
    }

    public static final /* synthetic */ String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5dc6ca5a", new Object[0]);
        }
        return f16931a;
    }

    public static final /* synthetic */ void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72c9afc4", new Object[]{str});
        } else {
            f16931a = str;
        }
    }
}

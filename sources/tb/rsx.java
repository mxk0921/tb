package tb;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.Login;
import java.util.List;
import mtopsdk.mtop.intf.Mtop;
import mtopsdk.mtop.intf.MtopParamType;
import mtopsdk.mtop.intf.MtopSetting;
import tb.cr0;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class rsx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("258fda74", new Object[]{context, new Boolean(z)});
            return;
        }
        hxm.E(context, z);
        if (f(context)) {
            g(z);
        }
    }

    public static boolean b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{context})).booleanValue();
        }
        if (Login.checkSessionValid() || !u9l.l(context)) {
            return false;
        }
        String k = u9l.k(context);
        if (!TextUtils.isEmpty(k) && c(context, mwx.f(k, String.class))) {
            return mwx.n(context, u9l.c(context));
        }
        return false;
    }

    public static boolean c(Context context, List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9773155", new Object[]{context, list})).booleanValue();
        }
        if (list == null || list.isEmpty()) {
            return false;
        }
        return list.contains(mwx.m(context));
    }

    public static boolean d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9eca1003", new Object[]{context})).booleanValue();
        }
        return hxm.p(context);
    }

    public static cr0.a e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cr0.a) ipChange.ipc$dispatch("f85a226e", new Object[]{context});
        }
        cr0.a aVar = new cr0.a();
        aVar.d(u9l.b(context));
        aVar.c(u9l.i(context));
        aVar.e(i(context));
        return aVar;
    }

    public static boolean f(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a0236741", new Object[]{context})).booleanValue();
        }
        if (context != null && u9l.p(context)) {
            return mwx.n(context, u9l.o(context));
        }
        return false;
    }

    public static void g(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{new Boolean(z)});
            return;
        }
        MtopSetting.setParam(Mtop.Id.INNER, MtopParamType.HEADER, "cro-privacy-recommend-switch-without-uid", String.valueOf(z));
        MtopSetting.setParam(Mtop.Id.SSR, MtopParamType.HEADER, "cro-privacy-recommend-switch-without-uid", String.valueOf(z));
    }

    public static void h(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0d012dc", new Object[]{context});
        } else if (f(context)) {
            MtopSetting.removeParam(Mtop.Id.INNER, MtopParamType.HEADER, "cro-privacy-recommend-switch-without-uid");
            MtopSetting.removeParam(Mtop.Id.SSR, MtopParamType.HEADER, "cro-privacy-recommend-switch-without-uid");
        }
    }

    public static boolean i(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a17cbe7f", new Object[]{context})).booleanValue();
        }
        if ("0".equals(u9l.h(context))) {
            return false;
        }
        return b(context);
    }
}

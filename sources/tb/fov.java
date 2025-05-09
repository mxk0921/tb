package tb;

import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class fov {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final fov INSTANCE = new fov();

    /* renamed from: a  reason: collision with root package name */
    public static final ArrayList<String> f19448a = yz3.g("*.taobao.com", "*.tmall.com", "*.alicdn.com", "*.alibaba-inc.com");

    static {
        t2o.a(839909895);
    }

    public final yyl a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yyl) ipChange.ipc$dispatch("84ff0860", new Object[]{this, str});
        }
        if (str == null) {
            return new yyl(false);
        }
        try {
            Uri parse = Uri.parse(str);
            if (parse == null) {
                return new yyl(false);
            }
            String host = parse.getHost();
            if (host == null) {
                return new yyl(false);
            }
            String d4 = q9s.d4();
            if (TextUtils.isEmpty(d4)) {
                return new yyl(c(host, f19448a));
            }
            return new yyl(c(host, wsq.z0(d4, new String[]{","}, false, 0, 6, null)));
        } catch (Exception unused) {
            return new yyl(false);
        }
    }

    public final boolean b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("216932e4", new Object[]{this, str, str2})).booleanValue();
        }
        if (ckf.b(str2, "*")) {
            return true;
        }
        if (!tsq.I(str2, "*.", false, 2, null)) {
            return ckf.b(str, str2);
        }
        String T0 = ysq.T0(str2, 2);
        if (!tsq.w(str, T0, false, 2, null) || str.length() <= T0.length() || str.charAt((str.length() - T0.length()) - 1) != '.') {
            return false;
        }
        return true;
    }

    public final boolean c(String str, List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("140de38b", new Object[]{this, str, list})).booleanValue();
        }
        for (String str2 : list) {
            if (b(str, str2)) {
                return true;
            }
        }
        return false;
    }
}

package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.editionswitcher.PositionInfo;
import com.taobao.tao.Globals;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class k1p {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final String f22347a = k1p.class.getSimpleName();
    public static String b = "";
    public static String c = "";
    public static String d = "";

    static {
        t2o.a(815792587);
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7094bfac", new Object[0]);
        }
        return b;
    }

    public static String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("898aab3", new Object[0]);
        }
        return c;
    }

    public static String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7176de84", new Object[0]);
        }
        return d;
    }

    public static void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e97eda1", new Object[0]);
            return;
        }
        PositionInfo i = o78.i(Globals.getApplication());
        if (i != null) {
            String str = i.countryCode;
            String str2 = "";
            if (str == null) {
                str = str2;
            }
            b = str;
            String str3 = i.countryNumCode;
            if (str3 == null) {
                str3 = str2;
            }
            c = str3;
            String str4 = i.editionCode;
            if (str4 != null) {
                str2 = str4;
            }
            d = str2;
            String str5 = f22347a;
            b4p.a(str5, "country code:" + b + ", country num:" + c + ", edition code:" + d);
        }
    }
}

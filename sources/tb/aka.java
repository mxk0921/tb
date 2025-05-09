package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class aka {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_AIR_TAG = "wxAirTag";
    public static final String KEY_CONTENT_VERSION = "x-air-content-version";
    public static final String KEY_ENV = "x-air-env";
    public static final String KEY_GREY = "x-air-grey";

    /* renamed from: a  reason: collision with root package name */
    public final String f15787a;
    public final String b;
    public final String c;

    static {
        t2o.a(989856190);
    }

    public aka(String str, String str2, String str3) {
        this.f15787a = str;
        this.b = str2;
        this.c = str3;
        v7t.l("GreyPageInfo", "GreyPageInfo() called with: URL = [" + str + "], envParam = [" + str2 + "], isGreyPage = [" + str3 + "]");
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c7a48a60", new Object[]{this});
        }
        return this.f15787a;
    }

    public String a() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("72e516d2", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        String str = this.b;
        if (str != null && !str.isEmpty()) {
            sb.append("x-air-env=");
            sb.append(this.b);
            z = true;
        }
        String str2 = this.b;
        if (str2 != null && !str2.isEmpty()) {
            if (z) {
                sb.append("&");
            }
            sb.append("x-air-grey=");
            sb.append(this.c);
        }
        String sb2 = sb.toString();
        v7t.l("GreyPageInfo", "generateOutputString: " + sb2);
        return sb2;
    }
}

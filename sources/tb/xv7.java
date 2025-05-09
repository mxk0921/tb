package tb;

import com.alibaba.ability.MegaUtils;
import com.taobao.android.abilityidl.ability.DownloaderNetworkType;
import com.taobao.android.abilityidl.ability.DownloaderRequestType;
import java.util.Map;
import org.android.agoo.common.AgooConstants;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class xv7 {

    /* renamed from: a  reason: collision with root package name */
    public final String f31624a;
    public final String b;
    public final String c;
    public final int d;
    public final Long e;
    public final String f;
    public final String g;
    public final Map<String, ? extends Object> h;
    public final Map<String, ? extends Object> i;

    static {
        t2o.a(525336868);
    }

    public xv7() {
        this.f31624a = "";
        this.b = "";
        this.d = 1000;
        this.g = "ANY";
    }

    public xv7(Map<String, ? extends Object> map) {
        this();
        String x = MegaUtils.x(map, "path", null);
        if (x != null) {
            this.f31624a = x;
            String x2 = MegaUtils.x(map, "url", null);
            if (x2 != null) {
                this.b = x2;
                this.c = MegaUtils.x(map, "name", null);
                int i = 1000;
                Integer m = MegaUtils.m(map, "minUpdateInterval", 1000);
                this.d = m != null ? m.intValue() : i;
                DownloaderRequestType.Companion.a(MegaUtils.x(map, "method", "GET"));
                this.e = MegaUtils.q(map, "size", null);
                this.f = MegaUtils.x(map, "md5", null);
                String str = "ANY";
                String a2 = DownloaderNetworkType.Companion.a(MegaUtils.x(map, "networkType", str));
                this.g = a2 != null ? a2 : str;
                this.h = MegaUtils.s(map, "headers");
                this.i = MegaUtils.s(map, AgooConstants.MESSAGE_BODY);
                return;
            }
            throw new RuntimeException("url 参数必传！");
        }
        throw new RuntimeException("path 参数必传！");
    }
}

package tb;

import com.taobao.weex.common.Constants;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class u45 implements l45 {

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, Object> f29127a;
    public final String b;
    public final String c;
    public Long d = null;

    static {
        t2o.a(1034944610);
        t2o.a(1034944698);
    }

    public u45(Map<String, Object> map) {
        this.f29127a = map;
        try {
            this.b = (String) map.get("loop");
            this.c = (String) map.get(Constants.Name.INTERVAL);
        } catch (Throwable unused) {
        }
    }
}

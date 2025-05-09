package tb;

import com.alibaba.ability.MegaUtils;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class wpa {

    /* renamed from: a  reason: collision with root package name */
    public final String f30837a;
    public final String b;
    public final String c;
    public final Map<String, ? extends Object> d;

    static {
        t2o.a(525336973);
    }

    public wpa() {
        this.f30837a = "";
        this.b = "";
        this.c = "";
    }

    public wpa(Map<String, ? extends Object> map) {
        this();
        String x = MegaUtils.x(map, "invokeID", null);
        if (x != null) {
            this.f30837a = x;
            String x2 = MegaUtils.x(map, "bizIdentifier", null);
            if (x2 != null) {
                this.b = x2;
                String x3 = MegaUtils.x(map, "currentScene", null);
                if (x3 != null) {
                    this.c = x3;
                    this.d = MegaUtils.s(map, "queryArgs");
                    return;
                }
                throw new RuntimeException("currentScene 参数必传！");
            }
            throw new RuntimeException("bizIdentifier 参数必传！");
        }
        throw new RuntimeException("invokeID 参数必传！");
    }
}

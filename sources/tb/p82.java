package tb;

import com.alibaba.ability.MegaUtils;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class p82 {

    /* renamed from: a  reason: collision with root package name */
    public final String f25930a;
    public final String b;
    public final String c;
    public final Boolean d;
    public final Map<String, ? extends Object> e;

    static {
        t2o.a(525336732);
    }

    public p82() {
        this.f25930a = "";
        this.b = "";
        this.c = "";
    }

    public p82(Map<String, ? extends Object> map) {
        this();
        String x = MegaUtils.x(map, "invokeID", null);
        if (x != null) {
            this.f25930a = x;
            String x2 = MegaUtils.x(map, "bizIdentifier", null);
            if (x2 != null) {
                this.b = x2;
                String x3 = MegaUtils.x(map, "currentScene", null);
                if (x3 != null) {
                    this.c = x3;
                    this.d = MegaUtils.h(map, "needCompress", null);
                    this.e = MegaUtils.s(map, "queryArgs");
                    return;
                }
                throw new RuntimeException("currentScene 参数必传！");
            }
            throw new RuntimeException("bizIdentifier 参数必传！");
        }
        throw new RuntimeException("invokeID 参数必传！");
    }
}

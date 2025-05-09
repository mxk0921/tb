package tb;

import com.alibaba.ability.MegaUtils;
import com.taobao.android.abilityidl.ability.UTCommitAction;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class l0v {

    /* renamed from: a  reason: collision with root package name */
    public final String f23047a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final Map<String, ? extends Object> f;
    public final Integer g;
    public final boolean h;

    static {
        t2o.a(525337590);
    }

    public l0v() {
        this.f23047a = "";
    }

    public l0v(Map<String, ? extends Object> map) {
        this();
        String a2 = UTCommitAction.Companion.a(MegaUtils.x(map, "action", null));
        if (a2 != null) {
            this.f23047a = a2;
            this.b = MegaUtils.x(map, "pageName", null);
            this.c = MegaUtils.x(map, "arg1", null);
            this.d = MegaUtils.x(map, "arg2", null);
            this.e = MegaUtils.x(map, "arg3", null);
            this.f = MegaUtils.s(map, "args");
            this.g = MegaUtils.m(map, "eventId", null);
            Boolean h = MegaUtils.h(map, "useCustomBuilder", Boolean.FALSE);
            this.h = h != null ? h.booleanValue() : false;
            return;
        }
        throw new RuntimeException("action 参数必传！");
    }
}

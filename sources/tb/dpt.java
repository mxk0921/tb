package tb;

import com.alibaba.ability.MegaUtils;
import com.taobao.android.festival.jsbridge.AliFestivalWVPlugin;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class dpt {

    /* renamed from: a  reason: collision with root package name */
    public final String f18000a;

    static {
        t2o.a(525337543);
    }

    public dpt() {
    }

    public dpt(Map<String, ? extends Object> map) {
        this();
        this.f18000a = MegaUtils.x(map, AliFestivalWVPlugin.PARAMS_MODULE_NAME, null);
    }
}

package tb;

import com.alibaba.ability.MegaUtils;
import com.taobao.android.abilityidl.ability.SharePannelSaveImageType;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class tjp {

    /* renamed from: a  reason: collision with root package name */
    public final String f28754a;
    public final String b;
    public final Map<String, ? extends Object> c;

    static {
        t2o.a(525337509);
    }

    public tjp() {
        this.f28754a = "DEFAULT";
    }

    public tjp(Map<String, ? extends Object> map) {
        this();
        String str = "DEFAULT";
        String a2 = SharePannelSaveImageType.Companion.a(MegaUtils.x(map, "type", str));
        this.f28754a = a2 != null ? a2 : str;
        this.b = MegaUtils.x(map, "snapshotID", null);
        this.c = MegaUtils.s(map, "longScreenShotOptions");
    }
}

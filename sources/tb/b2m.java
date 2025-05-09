package tb;

import com.alibaba.ability.MegaUtils;
import com.taobao.android.abilityidl.ability.PhotoSaveToAlbumMediaType;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class b2m {

    /* renamed from: a  reason: collision with root package name */
    public final String f16144a;
    public final String b;

    static {
        t2o.a(525337399);
    }

    public b2m() {
        this.f16144a = "";
        this.b = "IMAGE";
    }

    public b2m(Map<String, ? extends Object> map) {
        this();
        String x = MegaUtils.x(map, "source", null);
        if (x != null) {
            this.f16144a = x;
            String str = "IMAGE";
            String a2 = PhotoSaveToAlbumMediaType.Companion.a(MegaUtils.x(map, "mediaType", str));
            this.b = a2 != null ? a2 : str;
            return;
        }
        throw new RuntimeException("source 参数必传！");
    }
}

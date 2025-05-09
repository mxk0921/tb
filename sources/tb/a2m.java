package tb;

import com.alibaba.ability.MegaUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class a2m {

    /* renamed from: a  reason: collision with root package name */
    public final List<b2m> f15510a;

    static {
        t2o.a(525337396);
    }

    public a2m() {
        this.f15510a = yz3.i();
    }

    public a2m(Map<String, ? extends Object> map) {
        this();
        List<Object> o = MegaUtils.o(map, "medias");
        if (o != null) {
            List<Object> list = o;
            ArrayList arrayList = new ArrayList(zz3.q(list, 10));
            for (Object obj : list) {
                try {
                    arrayList.add(new b2m((Map) (!(obj instanceof Map) ? null : obj)));
                } catch (Exception e) {
                    throw new RuntimeException("medias 参数类型错误， 必须是 List<PhotoSaveToAlbumMedia> 类型！" + e.getMessage());
                }
            }
            this.f15510a = arrayList;
            return;
        }
        throw new RuntimeException("medias 参数必传！");
    }
}

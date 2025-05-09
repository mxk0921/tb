package tb;

import com.alibaba.ability.MegaUtils;
import com.taobao.tao.flexbox.layoutmanager.player.videodecide.VideoControllerManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class dn4 {

    /* renamed from: a  reason: collision with root package name */
    public final List<en4> f17958a;

    static {
        t2o.a(525336811);
    }

    public dn4() {
    }

    public dn4(Map<String, ? extends Object> map) {
        this();
        List<Object> o = MegaUtils.o(map, VideoControllerManager.ARRAY_KEY_RESOURCES);
        ArrayList arrayList = null;
        if (o != null) {
            List<Object> list = o;
            ArrayList arrayList2 = new ArrayList(zz3.q(list, 10));
            for (Object obj : list) {
                try {
                    arrayList2.add(new en4((Map) (!(obj instanceof Map) ? null : obj)));
                } catch (Exception e) {
                    throw new RuntimeException("resources 参数类型错误，必须是 List<ContainerResourcePrewarmParams> 类型！" + e.getMessage());
                }
            }
            arrayList = arrayList2;
        }
        this.f17958a = arrayList;
    }
}

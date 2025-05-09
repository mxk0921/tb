package tb;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.share.globalmodel.ComponentType;
import com.taobao.tao.sharepanel.common.ItemViewHolder;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class bpf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, Class<? extends rnf>> f16530a;

    static {
        t2o.a(666894547);
        HashMap hashMap = new HashMap();
        f16530a = hashMap;
        hashMap.put(ComponentType.CHANNEL_ITEM.desc, gip.class);
        hashMap.put(ComponentType.CONTACT_ITEM.desc, nip.class);
    }

    public static ItemViewHolder a(Context context, int i, boolean z, JSONObject jSONObject) {
        try {
            Class cls = (Class) ((HashMap) f16530a).get(ComponentType.getTypeByIndex(i).desc);
            if (cls == null) {
                return null;
            }
            Constructor declaredConstructor = cls.getDeclaredConstructor(Context.class);
            declaredConstructor.setAccessible(true);
            return new ItemViewHolder((rnf) declaredConstructor.newInstance(context), z, jSONObject);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}

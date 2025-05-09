package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class qe8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, Map<String, coc>> f26699a = new HashMap();

    static {
        t2o.a(157286418);
    }

    public void a(String str, String str2, coc cocVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fdb35f2", new Object[]{this, str, str2, cocVar});
        } else if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && cocVar != null) {
            Map map = (Map) ((HashMap) this.f26699a).get(str);
            if (map == null) {
                map = new HashMap();
                ((HashMap) this.f26699a).put(str, map);
            }
            map.put(str2, cocVar);
        }
    }

    public coc b(String str, String str2) {
        Map map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (coc) ipChange.ipc$dispatch("4c73a98f", new Object[]{this, str, str2});
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || (map = (Map) ((HashMap) this.f26699a).get(str)) == null) {
            return null;
        }
        return (coc) map.get(str2);
    }
}

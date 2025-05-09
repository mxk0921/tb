package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamic.tempate.DTemplateManager;
import com.taobao.android.dinamic.tempate.DinamicTemplate;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import java.util.HashMap;
import java.util.Map;
import tb.tit;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class yon {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Map<z4a, Integer> d;

    /* renamed from: a  reason: collision with root package name */
    public int f32242a;
    public final HashMap<String, Integer> b = new HashMap<>(64);
    public final HashMap<Integer, tit.a> c = new HashMap<>(64);

    static {
        t2o.a(729810060);
        HashMap hashMap = new HashMap();
        d = hashMap;
        hashMap.put(z4a.HOME_MAIN, 0);
        hashMap.put(z4a.HOME_INTL, 100);
        hashMap.put(z4a.HOME_CUN, 200);
        hashMap.put(z4a.HOME_OLD, 300);
    }

    public yon(z4a z4aVar) {
        Integer num = (Integer) ((HashMap) d).get(z4aVar == null ? z4a.HOME_MAIN : z4aVar);
        this.f32242a = (num == null ? 0 : num).intValue();
    }

    public tit.a a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tit.a) ipChange.ipc$dispatch("99253935", new Object[]{this, new Integer(i)});
        }
        return this.c.get(Integer.valueOf(i));
    }

    public int b(JSONObject jSONObject) {
        Integer num;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("358be767", new Object[]{this, jSONObject})).intValue();
        }
        if (jSONObject == null) {
            return -1;
        }
        tit.a b = tit.b(jSONObject);
        String d2 = b.d();
        String e = b.e();
        if (TextUtils.isEmpty(d2) || TextUtils.isEmpty(e)) {
            num = -1;
        } else {
            String str = d2 + "_" + e;
            if (b.g()) {
                this.b.remove(str);
                b.i(false);
            }
            num = this.b.get(str);
            if (num != null) {
                this.c.put(num, b);
            } else if (b.h()) {
                DXTemplateItem u = knn.g().h().u(b.b());
                if (u == null) {
                    i = -1;
                    num = i;
                } else {
                    if (!TextUtils.equals(u.f7343a, d2) || !TextUtils.equals(String.valueOf(u.b), e)) {
                        str = u.f7343a + "_" + u.b;
                    }
                    num = this.b.get(str);
                    if (num == null) {
                        int i2 = this.f32242a;
                        this.f32242a = 1 + i2;
                        num = Integer.valueOf(i2);
                        this.b.put(str, num);
                        this.c.put(num, b);
                    }
                }
            } else {
                DinamicTemplate f = DTemplateManager.t("guess").f(b.c());
                if (f == null) {
                    i = -1;
                    num = i;
                } else {
                    if (!TextUtils.equals(f.name, d2) || !TextUtils.equals(f.version, e)) {
                        str = f.name + "_" + f.version;
                    }
                    num = this.b.get(str);
                    if (num == null) {
                        int i3 = this.f32242a;
                        this.f32242a = 1 + i3;
                        num = Integer.valueOf(i3);
                        this.b.put(str, num);
                        this.c.put(num, b);
                    }
                }
            }
        }
        return num.intValue();
    }
}

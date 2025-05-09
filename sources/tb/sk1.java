package tb;

import android.graphics.RectF;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class sk1 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String INVALID_RESULT_CODE = "A00001";
    public static final String NEW_ALGORITHM_CODE = "A00000";
    public static final String OLD_ALGORITHM_CODE = "A00002";

    /* renamed from: a  reason: collision with root package name */
    public List<Integer> f28104a;
    public List<RectF> b;
    public List<Float> c;
    public String d;

    static {
        t2o.a(481296995);
    }

    public static boolean c(sk1 sk1Var) {
        List<Float> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("79436fc2", new Object[]{sk1Var})).booleanValue();
        }
        if (sk1Var.f28104a == null || sk1Var.b == null || (list = sk1Var.c) == null || list.size() != sk1Var.b.size() || TextUtils.isEmpty(sk1Var.d)) {
            return true;
        }
        return false;
    }

    public static sk1 e(Map<String, Object> map) {
        List<List> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sk1) ipChange.ipc$dispatch("c39c5e41", new Object[]{map});
        }
        try {
            sk1 f = f(map);
            if (f == null || (list = (List) map.get("boxes")) == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(list.size());
            for (List list2 : list) {
                if (list2 != null && list2.size() == 4) {
                    arrayList.add(new RectF(((Double) list2.get(0)).floatValue(), ((Double) list2.get(1)).floatValue(), ((Double) list2.get(2)).floatValue(), ((Double) list2.get(3)).floatValue()));
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            f.b = arrayList;
            if (c(f)) {
                return null;
            }
            return f;
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    public static sk1 f(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sk1) ipChange.ipc$dispatch("c2d2ea5e", new Object[]{map});
        }
        if (map == null) {
            return null;
        }
        try {
            sk1 sk1Var = new sk1();
            sk1Var.f28104a = (List) map.get("labels");
            sk1Var.c = (List) map.get("scores");
            sk1Var.d = (String) map.get("result_code");
            return sk1Var;
        } catch (ClassCastException | NullPointerException e) {
            e.printStackTrace();
            return null;
        }
    }

    public List<RectF> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("870627fd", new Object[]{this});
        }
        return this.b;
    }

    public List<Float> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("5f10fa69", new Object[]{this});
        }
        return this.c;
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4fe4a001", new Object[]{this})).booleanValue();
        }
        if (TextUtils.isEmpty(this.d) || !NEW_ALGORITHM_CODE.equalsIgnoreCase(this.d)) {
            return false;
        }
        return true;
    }
}

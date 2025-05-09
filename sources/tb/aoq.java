package tb;

import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.common.util.SymbolExpUtil;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class aoq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, bpl<String, Integer>> f15906a = new HashMap();

    static {
        t2o.a(993001941);
    }

    public aoq() {
        b();
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8a1d211", new Object[]{this});
            return;
        }
        for (Map.Entry<String, ?> entry : a().getAll().entrySet()) {
            if (entry.getValue() != null) {
                String key = entry.getKey();
                String[] split = entry.getValue().toString().split(SymbolExpUtil.SYMBOL_VERTICALBAR);
                if (split.length >= 2) {
                    String str = split[0];
                    int e = qrl.e(split[1], -1);
                    if (e >= 0) {
                        this.f15906a.put(key, bpl.a(str, Integer.valueOf(e)));
                    }
                }
            }
        }
    }

    public bpl<String, Integer> c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bpl) ipChange.ipc$dispatch("be8db296", new Object[]{this, str});
        }
        return (bpl) ((HashMap) this.f15906a).get(str);
    }

    public void d(Map<String, bpl<String, Integer>> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db6c516c", new Object[]{this, map});
            return;
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, bpl<String, Integer>> entry : map.entrySet()) {
            String key = entry.getKey();
            bpl<String, Integer> value = entry.getValue();
            bpl bplVar = (bpl) ((HashMap) this.f15906a).get(key);
            Integer num = value.b;
            if (bplVar == null || num.intValue() > ((Integer) bplVar.b).intValue()) {
                hashMap.put(key, value);
                ((HashMap) this.f15906a).put(key, value);
            }
        }
        if (!hashMap.isEmpty()) {
            SharedPreferences.Editor edit = a().edit();
            for (Map.Entry entry2 : hashMap.entrySet()) {
                bpl bplVar2 = (bpl) entry2.getValue();
                edit.putString((String) entry2.getKey(), ((String) bplVar2.f16534a) + "|" + bplVar2.b);
            }
            edit.apply();
        }
    }

    public final SharedPreferences a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("75ba1678", new Object[]{this});
        }
        return Globals.getApplication().getSharedPreferences("search_roman_page", 0);
    }
}

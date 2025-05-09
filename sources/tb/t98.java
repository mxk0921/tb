package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.security.realidentity.g4;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class t98 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile t98 e;

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<String, List<String>> f28577a;
    public final HashMap<String, Boolean> b;
    public final HashMap<String, HashMap<String, Boolean>> c;
    public String d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a extends TypeReference<HashMap<String, String>> {
        public a(t98 t98Var) {
        }
    }

    static {
        t2o.a(729808947);
    }

    public t98() {
        HashMap<String, List<String>> hashMap = new HashMap<>();
        this.f28577a = hashMap;
        HashMap<String, Boolean> hashMap2 = new HashMap<>();
        this.b = hashMap2;
        HashMap<String, HashMap<String, Boolean>> hashMap3 = new HashMap<>();
        this.c = hashMap3;
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(g4.b.i);
        hashMap.put(i2b.VIEW_PROVIDER_MAIN_ENTRANCE, arrayList);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList2.add("animation");
        hashMap.put(vaj.KEY_BG_IMG, arrayList2);
        slp.c("mainEffectDegrade", "false");
        hashMap2.put(i2b.VIEW_PROVIDER_MAIN_ENTRANCE, Boolean.valueOf(slp.a("mainEntranceEffectDegrade", false)));
        hashMap2.put(vaj.KEY_BG_IMG, Boolean.valueOf(slp.a("bgImgEffectDegrade", false)));
        HashMap<String, Boolean> hashMap4 = new HashMap<>();
        hashMap4.put(g4.b.i, Boolean.valueOf(slp.a("mainEntrance_enter", false)));
        hashMap3.put(i2b.VIEW_PROVIDER_MAIN_ENTRANCE, hashMap4);
        HashMap<String, Boolean> hashMap5 = new HashMap<>();
        hashMap5.put("animation", Boolean.valueOf(slp.a("bgImg_animation", false)));
        hashMap3.put(vaj.KEY_BG_IMG, hashMap5);
    }

    public static t98 b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (t98) ipChange.ipc$dispatch("25cd58eb", new Object[0]);
        }
        synchronized (t98.class) {
            try {
                if (e == null) {
                    e = new t98();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return e;
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f57e3c2", new Object[]{this});
            return;
        }
        slp.e("mainEffectDegrade", f4b.h("mainEffectDegrade", "false"));
        for (Map.Entry<String, List<String>> entry : this.f28577a.entrySet()) {
            String key = entry.getKey();
            boolean equals = "true".equals(f4b.h(key + "EffectDegrade", "false"));
            this.b.put(key, Boolean.valueOf(equals));
            slp.d(key + "EffectDegrade", equals);
            List<String> list = this.f28577a.get(key);
            if (list != null && list.size() > 0) {
                for (String str : list) {
                    boolean a2 = a(key, str);
                    this.c.get(key).put(str, Boolean.valueOf(a2));
                    slp.d(key + "_" + str, a2);
                }
            }
        }
    }

    public final boolean a(String str, String str2) {
        HashMap hashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e1c7facb", new Object[]{this, str, str2})).booleanValue();
        }
        if (TextUtils.isEmpty(this.d)) {
            this.d = m0b.d();
            bqa.e("EffectSwitchCoordinator", "deviceHML=" + this.d);
        }
        String h = f4b.h(str + "_" + str2, null);
        if (TextUtils.isEmpty(h) || (hashMap = (HashMap) JSON.parseObject(h, new a(this), new Feature[0])) == null) {
            return false;
        }
        return "off".equals(hashMap.get(this.d));
    }
}

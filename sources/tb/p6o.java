package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tbpoplayer.nativerender.dsl.DSLModel;
import com.taobao.tbpoplayer.nativerender.dsl.StateModel;
import com.taobao.tbpoplayer.nativerender.dsl.StateVersionModel;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class p6o {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a extends TypeReference<ArrayList<JSONObject>> {
    }

    static {
        t2o.a(790626427);
    }

    public static void b(oe8 oe8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58dded3e", new Object[]{oe8Var});
            return;
        }
        try {
            DSLModel p = oe8Var.j().p();
            List<String> list = p.resPreLoad;
            if (list != null && list.contains("image")) {
                String i = oe8Var.j().i();
                HashSet hashSet = new HashSet();
                for (StateModel stateModel : p.component) {
                    if (stateModel != null && stateModel.isValid() && !TextUtils.isEmpty(i) && !i.equals(stateModel.id)) {
                        if (stateModel.isMultiVersion()) {
                            for (StateVersionModel stateVersionModel : stateModel.versions) {
                                a(stateVersionModel.children, hashSet);
                            }
                        } else {
                            a(stateModel.children, hashSet);
                        }
                    }
                }
                if (!hashSet.isEmpty()) {
                    s0m.B().e0("common", new ArrayList(hashSet)).b();
                }
                wdm.d("ResPreLoader.startPreLoad.imageRes=%s", hashSet);
            }
        } catch (Throwable th) {
            wdm.h("ResPreLoader.error", th);
        }
    }

    public static void a(List<JSONObject> list, Set<String> set) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72809169", new Object[]{list, set});
        } else if (list != null && !list.isEmpty()) {
            for (JSONObject jSONObject : list) {
                String string = jSONObject.getString("type");
                if (vbm.TYPE_CLOSE_BTN.equals(string) || vbm.TYPE_IMAGE.equals(string)) {
                    String string2 = jSONObject.getString("url");
                    if (!TextUtils.isEmpty(string2) && !a1n.a(string2)) {
                        set.add(string2);
                    }
                } else if (vbm.TYPE_BLOCK.equals(string)) {
                    a((List) JSON.parseObject(jSONObject.getString("children"), new a().getType(), new Feature[0]), set);
                }
            }
        }
    }
}

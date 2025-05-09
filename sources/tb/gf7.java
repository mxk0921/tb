package tb;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.ActionModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class gf7 extends vg7<md7> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public HashMap<String, zc7> b;
    public final ArrayList<ux1> c = new ArrayList<>();

    static {
        t2o.a(912262479);
    }

    public gf7(List<md7> list) {
        super(list);
    }

    public static /* synthetic */ Object ipc$super(gf7 gf7Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/skeleton/desc/natives/structure/DetailDescStructure");
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a638176e", new Object[]{this})).booleanValue();
        }
        HashMap<String, zc7> hashMap = this.b;
        if (hashMap == null || hashMap.isEmpty()) {
            return false;
        }
        return true;
    }

    public void b(Context context, ArrayList<ActionModel> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f75f31d5", new Object[]{this, context, arrayList});
            return;
        }
        Iterator<ActionModel> it = arrayList.iterator();
        while (it.hasNext()) {
            ux1 a2 = coi.a(it.next(), null);
            if (a2 != null) {
                this.c.add(a2);
            }
        }
    }

    public void c(ArrayList<zc7> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b141473d", new Object[]{this, arrayList});
            return;
        }
        this.b = new HashMap<>();
        Iterator<zc7> it = arrayList.iterator();
        while (it.hasNext()) {
            zc7 next = it.next();
            if (!TextUtils.isEmpty(next.f32682a)) {
                this.b.put(next.f32682a, next);
            }
        }
    }
}

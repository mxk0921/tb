package tb;

import android.text.TextUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.TypeDX;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class cpf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final xea f17217a;
    public final Map<Integer, String> b;
    public final uga c;
    public final HashMap<Integer, String> d;

    static {
        t2o.a(295699373);
    }

    public cpf(xea xeaVar, uga ugaVar) {
        String str;
        this.f17217a = xeaVar;
        this.c = ugaVar;
        HashMap<Integer, String> hashMap = new HashMap<>();
        this.d = hashMap;
        hashMap.put(4, "normal2");
        hashMap.put(7, "pcg");
        hashMap.put(1, "rightsTopV2");
        hashMap.put(8, "categoryTop");
        hashMap.put(10, "searchBottom");
        HashMap hashMap2 = new HashMap();
        this.b = hashMap2;
        if (xeaVar.r() == null || TextUtils.isEmpty(xeaVar.r().templateName)) {
            str = "taolive_goodslist_interact_red_packet";
        } else {
            str = xeaVar.r().templateName;
        }
        hashMap2.put(2, str);
    }

    public TypeDX a(int i) {
        n10 n10Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TypeDX) ipChange.ipc$dispatch("3eccfd5a", new Object[]{this, new Integer(i)});
        }
        String str = this.d.get(Integer.valueOf(i));
        if (!TextUtils.isEmpty(str)) {
            if (wda.e()) {
                n10Var = new ieg(this.f17217a, str);
            } else {
                n10Var = new d9v(this.f17217a, this.c, str);
            }
        } else if (!TextUtils.isEmpty((CharSequence) ((HashMap) this.b).get(Integer.valueOf(i)))) {
            n10Var = new r16(this.f17217a, (String) ((HashMap) this.b).get(Integer.valueOf(i)));
        } else if (i == 9) {
            n10Var = new zi2(this.f17217a);
        } else {
            n10Var = null;
        }
        if (n10Var != null) {
            TypeDX b = n10Var.b(i);
            b.e0(n10Var);
            return b;
        }
        hha.b("ItemViewFactory", "createTypeDX | viewType=" + i);
        return new TypeDX(new View(this.f17217a.i()));
    }
}

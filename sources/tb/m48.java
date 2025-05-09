package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.BaseTypedBean;
import com.taobao.android.searchbaseframe.util.ListStyle;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class m48 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f23767a;
    public final HashMap<String, Integer> b = new HashMap<>();

    static {
        t2o.a(993001835);
    }

    public m48(int i) {
        this.f23767a = i;
    }

    public int a(BaseTypedBean baseTypedBean, ListStyle listStyle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ce276890", new Object[]{this, baseTypedBean, listStyle})).intValue();
        }
        if (baseTypedBean == null) {
            return 0;
        }
        String str = baseTypedBean.type;
        if (TextUtils.isEmpty(str) || str.length() == 0) {
            return 0;
        }
        Integer num = this.b.get(str);
        if (num == null) {
            num = Integer.valueOf(this.f23767a);
            this.f23767a += 2;
            this.b.put(str, num);
        }
        if (listStyle == ListStyle.LIST) {
            return num.intValue();
        }
        return num.intValue() + 1;
    }
}

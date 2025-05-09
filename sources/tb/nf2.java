package tb;

import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class nf2 extends m1u {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final List<m1u> c;

    static {
        t2o.a(985661614);
    }

    public nf2(List<m1u> list, int i) {
        super("", i);
        this.c = list;
    }

    public static /* synthetic */ Object ipc$super(nf2 nf2Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/weex/el/parse/Block");
    }

    @Override // tb.m1u
    public Object a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("44fe4fda", new Object[]{this, obj});
        }
        if (c() == 7) {
            List<m1u> list = this.c;
            if (list == null || list.size() == 0) {
                return new JSONArray(4);
            }
            JSONArray jSONArray = new JSONArray(this.c.size());
            for (int i = 0; i < this.c.size(); i++) {
                m1u m1uVar = this.c.get(i);
                if (m1uVar == null) {
                    jSONArray.add(null);
                } else {
                    jSONArray.add(m1uVar.a(obj));
                }
            }
            return jSONArray;
        }
        List<m1u> list2 = this.c;
        if (list2 == null || list2.size() == 0) {
            return null;
        }
        return this.c.get(0).a(obj);
    }

    @Override // tb.m1u
    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        if (c() == 7) {
            return "" + this.c + "";
        }
        List<m1u> list = this.c;
        if (list == null || list.size() != 1) {
            return "{" + this.c + '}';
        }
        return "{" + this.c.get(0) + '}';
    }
}

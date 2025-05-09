package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class ggw {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int c;

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<String, Integer> f19981a = new HashMap<>(8);
    public final HashMap<Integer, String> b = new HashMap<>(8);
    public int d = 10000;

    static {
        t2o.a(745537912);
    }

    public final boolean a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c176c2", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (i >= 0 && 9999 >= i) {
            return true;
        }
        return false;
    }

    public final boolean b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dc19f9f5", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (10000 <= i && 19999 >= i) {
            return true;
        }
        return false;
    }

    public final String d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d1a58c43", new Object[]{this, new Integer(i)});
        }
        String str = this.b.get(Integer.valueOf(i));
        if (str != null) {
            return str;
        }
        return "empty";
    }

    public final int c(h3j h3jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2d8b1cfc", new Object[]{this, h3jVar})).intValue();
        }
        ckf.h(h3jVar, "mtbComponentModel");
        String str = h3jVar.a() + '_' + h3jVar.f();
        if (this.f19981a.containsKey(str)) {
            Integer num = this.f19981a.get(str);
            if (num != null) {
                ckf.c(num, "identify2type[identify]!!");
                return num.intValue();
            }
            ckf.s();
            throw null;
        } else if (ckf.b(h3jVar.a(), "weex")) {
            int i = this.d + 1;
            this.d = i;
            this.f19981a.put(str, Integer.valueOf(i));
            this.b.put(Integer.valueOf(this.d), str);
            return this.d;
        } else if (!ckf.b(h3jVar.a(), "dinamicx")) {
            return -1;
        } else {
            int i2 = this.c + 1;
            this.c = i2;
            this.f19981a.put(str, Integer.valueOf(i2));
            this.b.put(Integer.valueOf(this.c), str);
            return this.c;
        }
    }
}

package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class bsa {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final List<dbh> f16599a;
    public int b = 0;

    static {
        t2o.a(654311464);
        t2o.a(654311465);
    }

    public bsa(List<dbh> list) {
        this.f16599a = list;
    }

    public String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("12e23192", new Object[]{this, str});
        }
        if (this.b + 1 > this.f16599a.size()) {
            this.b = 0;
            return str;
        }
        List<dbh> list = this.f16599a;
        int i = this.b;
        this.b = 1 + i;
        return list.get(i).a(str, this);
    }
}

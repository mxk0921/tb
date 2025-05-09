package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collections;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class lax {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f23224a;
    public final Object[] b;

    static {
        t2o.a(961544354);
    }

    public lax(String str, Object... objArr) {
        this.f23224a = str;
        this.b = objArr;
    }

    public void a(StringBuilder sb) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e874d66f", new Object[]{this, sb});
        } else {
            sb.append(this.f23224a);
        }
    }

    public void b(List<Object> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5a0a26f", new Object[]{this, list});
            return;
        }
        Object[] objArr = this.b;
        if (objArr != null) {
            Collections.addAll(list, objArr);
        }
    }

    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("97297536", new Object[]{this});
        }
        return this.f23224a;
    }

    public String[] d() {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("a13902ae", new Object[]{this});
        }
        Object[] objArr = this.b;
        if (objArr == null || objArr.length <= 0) {
            return null;
        }
        String[] strArr = new String[objArr.length];
        while (true) {
            Object[] objArr2 = this.b;
            if (i >= objArr2.length) {
                return strArr;
            }
            strArr[i] = objArr2[i].toString();
            i++;
        }
    }
}

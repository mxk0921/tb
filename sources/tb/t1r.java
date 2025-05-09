package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class t1r implements r1r {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final r1r[] f28419a;

    public t1r(r1r... r1rVarArr) {
        this.f28419a = (r1r[]) Arrays.copyOf(r1rVarArr, r1rVarArr.length);
    }

    @Override // tb.r1r
    public void a(Context context, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb13d969", new Object[]{this, context, str, new Boolean(z)});
            return;
        }
        for (r1r r1rVar : this.f28419a) {
            r1rVar.a(context, str, z);
        }
    }

    @Override // tb.r1r
    public void b(Context context, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67ec839", new Object[]{this, context, map});
            return;
        }
        for (r1r r1rVar : this.f28419a) {
            r1rVar.b(context, map);
        }
    }

    @Override // tb.r1r
    public Map<String, tij> c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("8d448ddf", new Object[]{this, context});
        }
        HashMap hashMap = new HashMap();
        for (r1r r1rVar : this.f28419a) {
            try {
                Map<String, tij> c = r1rVar.c(context);
                if (!c.isEmpty()) {
                    HashMap hashMap2 = new HashMap(c);
                    hashMap2.remove(r1r.KEY_AGE_VARIATIONS);
                    hashMap.putAll(hashMap2);
                }
            } catch (UnsupportedOperationException unused) {
            }
        }
        HashMap hashMap3 = new HashMap(hashMap);
        hashMap3.put(r1r.KEY_AGE_VARIATIONS, (tij) f(context));
        return hashMap3;
    }

    @Override // tb.r1r
    public void d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6cf9289", new Object[]{this, context});
            return;
        }
        for (r1r r1rVar : this.f28419a) {
            r1rVar.d(context);
        }
    }

    @Override // tb.r1r
    public Boolean e(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("ed4b7600", new Object[]{this, context, str});
        }
        for (r1r r1rVar : this.f28419a) {
            Boolean e = r1rVar.e(context, str);
            if (e != null) {
                return e;
            }
        }
        return Boolean.FALSE;
    }

    @Override // tb.r1r
    public r2w f(Context context) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (r2w) ipChange.ipc$dispatch("3cb9ab1b", new Object[]{this, context});
        }
        r2w[] r2wVarArr = new r2w[this.f28419a.length];
        while (true) {
            r1r[] r1rVarArr = this.f28419a;
            if (i >= r1rVarArr.length) {
                return t2w.a(tij.EMPTY, r2wVarArr);
            }
            r2wVarArr[i] = r1rVarArr[i].f(context);
            i++;
        }
    }
}

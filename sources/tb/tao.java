package tb;

import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.ability.result.FinishResult;
import com.alibaba.ability.result.IAbilityResult;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collection;
import java.util.Map;
import kotlin.collections.a;
import tb.c3c;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class tao<T, E extends c3c> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final T f28600a;
    public final E b;

    static {
        t2o.a(144703602);
    }

    public tao() {
        this(null, null, 3, null);
    }

    public final T a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("8b379b37", new Object[]{this});
        }
        return this.f28600a;
    }

    public final tao<T, E> b(T t, E e) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tao) ipChange.ipc$dispatch("ee97fb69", new Object[]{this, t, e});
        }
        return new tao<>(t, e);
    }

    public final T c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("4ca84d6b", new Object[]{this});
        }
        return this.f28600a;
    }

    public final E d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (E) ((c3c) ipChange.ipc$dispatch("5aa8f342", new Object[]{this}));
        }
        return this.b;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof tao) {
                tao taoVar = (tao) obj;
                if (!ckf.b(this.f28600a, taoVar.f28600a) || !ckf.b(this.b, taoVar.b)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i;
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        T t = this.f28600a;
        if (t != null) {
            i = t.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        E e = this.b;
        if (e != null) {
            i2 = e.hashCode();
        }
        return i3 + i2;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "Result(data=" + this.f28600a + ", error=" + this.b + f7l.BRACKET_END_STR;
    }

    public tao(T t) {
        this(t, null, 2, null);
    }

    public tao(T t, E e) {
        this.f28600a = t;
        this.b = e;
    }

    public final ExecuteResult e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("6d1513e5", new Object[]{this});
        }
        E e = this.b;
        if (e != null) {
            return (ErrorResult) e;
        }
        T t = this.f28600a;
        if (t == null) {
            return new FinishResult(null, null, 3, null);
        }
        if (t instanceof IAbilityResult) {
            Object json = JSON.toJSON(t);
            if (!(json instanceof JSONObject)) {
                json = null;
            }
            return new FinishResult((JSONObject) json, null, 2, null);
        } else if ((t instanceof Collection) || (t instanceof Map)) {
            return new FinishResult(new JSONObject(a.k(jpu.a("result", JSON.toJSON(t)))), null, 2, null);
        } else {
            return new FinishResult(new JSONObject(a.k(jpu.a("result", t))), null, 2, null);
        }
    }

    public /* synthetic */ tao(Object obj, c3c c3cVar, int i, a07 a07Var) {
        this((i & 1) != 0 ? null : obj, (i & 2) != 0 ? null : c3cVar);
    }
}

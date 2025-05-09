package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.uniinfra_kmp.common_utils.app.OSType;
import com.taobao.uniinfra_kmp.common_utils.app.a;
import com.taobao.uniinfra_kmp.common_utils.serialization.KMPJsonObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class qjg<T> implements mjn<Object, T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public T f26784a;
    public final mzf b;
    public final y1a<Object, String, KMPJsonObject, String, T> c;

    static {
        t2o.a(1029701713);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public qjg(T t, mzf mzfVar, y1a<Object, ? super String, ? super KMPJsonObject, ? super String, ? extends T> y1aVar) {
        ckf.g(y1aVar, "getterImpl");
        this.f26784a = t;
        this.b = mzfVar;
        this.c = y1aVar;
    }

    @Override // tb.mjn
    public void a(Object obj, a0g<?> a0gVar, T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c500cbbd", new Object[]{this, obj, a0gVar, t});
            return;
        }
        ckf.g(a0gVar, "property");
        this.f26784a = t;
    }

    @Override // tb.mjn
    public T b(Object obj, a0g<?> a0gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("591fe725", new Object[]{this, obj, a0gVar});
        }
        ckf.g(a0gVar, "property");
        if (a.d() == OSType.ANDROID) {
            return this.f26784a;
        }
        ckf.d(obj);
        String valueOf = String.valueOf(((ns3) dun.b(obj.getClass())).getSimpleName());
        y1a<Object, String, KMPJsonObject, String, T> y1aVar = this.c;
        mzf mzfVar = this.b;
        T invoke = y1aVar.invoke(obj, valueOf, mzfVar != null ? mzfVar.getJsonObj() : null, a0gVar.getName());
        this.f26784a = invoke;
        return invoke;
    }
}

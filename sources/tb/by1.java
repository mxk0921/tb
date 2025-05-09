package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: Taobao */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010%\n\u0002\u0010!\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003Jx\u0010\u0011\u001a\u00020\f\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0006\u001a\u00020\u00052Y\u0010\u000e\u001aU\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\t\u0012\u0015\u0012\u0013\u0018\u00018\u0000¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0015\u0012\u0013\u0018\u00018\u0000¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\u0007j\b\u0012\u0004\u0012\u00028\u0000`\rH\u0000¢\u0006\u0004\b\u000f\u0010\u0010Jx\u0010\u0013\u001a\u00020\f\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0006\u001a\u00020\u00052Y\u0010\u000e\u001aU\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\t\u0012\u0015\u0012\u0013\u0018\u00018\u0000¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0015\u0012\u0013\u0018\u00018\u0000¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\u0007j\b\u0012\u0004\u0012\u00028\u0000`\rH\u0000¢\u0006\u0004\b\u0012\u0010\u0010J-\u0010\u0018\u001a\u00020\f\"\u0004\b\u0000\u0010\u00042\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u0016\u0010\u0017RQ\u0010\u001b\u001a?\u0012\u0004\u0012\u00020\u0005\u00125\u00123\u0012/\u0012-\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\t\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\f0\u0007j\u0006\u0012\u0002\b\u0003`\r0\u001a0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Ltb/by1;", "", "<init>", "()V", "T", "", "key", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "value", "old", "Ltb/xhv;", "Lcom/taobao/kmp/render/ObserverCallBack;", atj.CALL_BACK, "addObserver$cmp_foundation_release", "(Ljava/lang/String;Ltb/w1a;)V", "addObserver", "removeObserver$cmp_foundation_release", "removeObserver", "oldValue", "newValue", "update$cmp_foundation_release", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V", "update", "", "", "observers", "Ljava/util/Map;", "cmp-foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public abstract class by1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final Map<String, List<w1a<String, ?, ?, xhv>>> observers = new LinkedHashMap();

    static {
        t2o.a(1001390081);
    }

    public final <T> void addObserver$cmp_foundation_release(String str, w1a<? super String, ? super T, ? super T, xhv> w1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2529fb16", new Object[]{this, str, w1aVar});
            return;
        }
        ckf.g(str, "key");
        ckf.g(w1aVar, atj.CALL_BACK);
        List<w1a<String, ?, ?, xhv>> list = this.observers.get(str);
        if (list == null) {
            this.observers.put(str, yz3.m(w1aVar));
        } else {
            list.add(w1aVar);
        }
    }

    public final <T> void removeObserver$cmp_foundation_release(String str, w1a<? super String, ? super T, ? super T, xhv> w1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a8bef13", new Object[]{this, str, w1aVar});
            return;
        }
        ckf.g(str, "key");
        ckf.g(w1aVar, atj.CALL_BACK);
        List<w1a<String, ?, ?, xhv>> list = this.observers.get(str);
        if (list != null) {
            list.remove(w1aVar);
        }
    }

    public final <T> void update$cmp_foundation_release(String str, T t, T t2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fda78c58", new Object[]{this, str, t, t2});
            return;
        }
        ckf.g(str, "name");
        List<w1a<String, ?, ?, xhv>> list = this.observers.get(str);
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                w1a w1aVar = (w1a) it.next();
                ckf.e(w1aVar, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"name\")] kotlin.String, @[ParameterName(name = \"value\")] T of com.taobao.kmp.render.BaseModel.update?, @[ParameterName(name = \"old\")] T of com.taobao.kmp.render.BaseModel.update?, kotlin.Unit>");
                kqu.e(w1aVar, 3);
                w1aVar.invoke(str, t2, t);
            }
        }
        List<w1a<String, ?, ?, xhv>> list2 = this.observers.get("*");
        if (list2 != null) {
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                w1a w1aVar2 = (w1a) it2.next();
                ckf.e(w1aVar2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"name\")] kotlin.String, @[ParameterName(name = \"value\")] T of com.taobao.kmp.render.BaseModel.update?, @[ParameterName(name = \"old\")] T of com.taobao.kmp.render.BaseModel.update?, kotlin.Unit>");
                kqu.e(w1aVar2, 3);
                w1aVar2.invoke(str, t2, t);
            }
        }
    }
}

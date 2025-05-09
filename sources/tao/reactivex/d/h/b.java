package tao.reactivex.d.h;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import tb.lzx;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public enum b implements Callable<List<Object>>, lzx<Object, List<Object>> {
    INSTANCE;
    
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in tao/reactivex/d/h/b");
    }

    public static b valueOf(String str) {
        Object valueOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            valueOf = ipChange.ipc$dispatch("c69ea57", new Object[]{str});
        } else {
            valueOf = Enum.valueOf(b.class, str);
        }
        return (b) valueOf;
    }

    public List<Object> a(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("18196f83", new Object[]{this, obj}) : new ArrayList();
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, java.util.List<java.lang.Object>] */
    @Override // tb.lzx
    public /* synthetic */ List<Object> apply(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("7a74adc1", new Object[]{this, obj});
        }
        return a(obj);
    }

    public List<Object> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("4a17df3e", new Object[]{this});
        }
        return new ArrayList();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List<java.lang.Object>] */
    @Override // java.util.concurrent.Callable
    public /* synthetic */ List<Object> call() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("6d249ded", new Object[]{this});
        }
        return b();
    }

    public static <T> Callable<List<T>> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Callable) ipChange.ipc$dispatch("c505ea29", new Object[0]) : INSTANCE;
    }
}

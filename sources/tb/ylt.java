package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Iterator;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ylt implements Iterable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, String> f32179a;

    static {
        t2o.a(315621397);
        t2o.a(315621396);
    }

    public ylt(Map<String, String> map) {
        this.f32179a = map;
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<String, String>> iterator() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Iterator) ipChange.ipc$dispatch("8f345362", new Object[]{this});
        }
        return this.f32179a.entrySet().iterator();
    }
}

package tb;

import android.util.Pair;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class yb5<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final View f31958a;
    public final List<Pair<String, T>> b;

    static {
        t2o.a(444597736);
    }

    public yb5(View view, List<Pair<String, T>> list) {
        this.f31958a = view;
        this.b = list;
    }

    public List<Pair<String, T>> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("13d38973", new Object[]{this});
        }
        return this.b;
    }

    public View b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("2c2b0e50", new Object[]{this});
        }
        return this.f31958a;
    }
}

package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class kk9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final View f22725a;
    public final int b;

    static {
        t2o.a(785383544);
    }

    public kk9(View view) {
        this.f22725a = view;
        this.b = view.hashCode();
    }

    public int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b49c3d8b", new Object[]{this})).intValue();
        }
        return this.b;
    }

    public View b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        return this.f22725a;
    }
}

package tb;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class a27 implements sjc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final LayoutInflater f15500a;

    static {
        t2o.a(519045151);
        t2o.a(519045152);
    }

    public a27(Context context) {
        this.f15500a = LayoutInflater.from(context);
    }

    @Override // tb.sjc
    public View a(int i, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("7a0bba36", new Object[]{this, new Integer(i), viewGroup});
        }
        return this.f15500a.inflate(i, viewGroup, false);
    }
}

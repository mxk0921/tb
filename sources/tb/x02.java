package tb;

import android.app.Activity;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class x02 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Activity f31046a;
    public final ude b;
    public acx<? extends o02<? extends BaseSearchResult, ?>> c;
    public ViewGroup d;
    public vfw e;

    static {
        t2o.a(993001698);
    }

    public x02(Activity activity, ude udeVar, acx<? extends o02<? extends BaseSearchResult, ?>> acxVar) {
        this.f31046a = activity;
        this.b = udeVar;
        this.c = acxVar;
    }

    public x02 a(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x02) ipChange.ipc$dispatch("c1c9f5a4", new Object[]{this, viewGroup});
        }
        this.d = viewGroup;
        return this;
    }

    public x02 b(vfw vfwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x02) ipChange.ipc$dispatch("7715a555", new Object[]{this, vfwVar});
        }
        this.e = vfwVar;
        return this;
    }
}

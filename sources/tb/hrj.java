package tb;

import android.content.Context;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.component.module.DataEntry;
import com.taobao.android.detail.ttdetail.widget.scrollerlayout.TTDetailScrollerLayout;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class hrj extends oa4<nb4> implements ozc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f20842a;
    public boolean b;

    static {
        t2o.a(912261444);
        t2o.a(912261426);
        t2o.a(912261427);
    }

    public hrj(Context context, ze7 ze7Var, nb4 nb4Var, DataEntry... dataEntryArr) {
        super(context, ze7Var, nb4Var, dataEntryArr);
    }

    public static /* synthetic */ Object ipc$super(hrj hrjVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/component/module/NestedComponent");
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c57fdb6", new Object[]{this});
        }
    }

    public void k(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2314fd0", new Object[]{this, new Integer(i)});
        }
    }

    public View r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("c3161e04", new Object[]{this});
        }
        return null;
    }

    @Override // tb.ozc
    public void t(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9588d6ca", new Object[]{this, new Boolean(z), new Boolean(z2)});
        }
    }

    public TTDetailScrollerLayout.LayoutParams u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TTDetailScrollerLayout.LayoutParams) ipChange.ipc$dispatch("99746aed", new Object[]{this});
        }
        return null;
    }

    public String v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("978e443e", new Object[]{this});
        }
        return "";
    }

    public boolean w(TTDetailScrollerLayout tTDetailScrollerLayout, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("da673174", new Object[]{this, tTDetailScrollerLayout, str, new Integer(i)})).booleanValue();
        }
        return false;
    }

    public void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e72940b2", new Object[]{this});
        }
    }
}

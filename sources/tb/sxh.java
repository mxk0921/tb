package tb;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.ddd;
import tb.p9e;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public abstract class sxh<V extends View, IV extends p9e, IP extends ddd, MODEL, BEAN> extends phw<BEAN, V, MODEL> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final IV f28339a;
    public final IP b;

    static {
        t2o.a(993002009);
    }

    public sxh(Activity activity, ude udeVar, MODEL model, ViewGroup viewGroup, vfw vfwVar) {
        super(activity, udeVar, model, viewGroup, vfwVar);
        IP q2 = q2();
        this.b = q2;
        IV s2 = s2();
        this.f28339a = s2;
        q2.bind(s2, this, c());
        s2.d(q2, c());
        s2.init(activity);
        q2.init();
    }

    public static /* synthetic */ Object ipc$super(sxh sxhVar, String str, Object... objArr) {
        if (str.hashCode() == -211767613) {
            super.onComponentDestroy();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/searchbaseframe/widget/MVPWidget");
    }

    @Override // tb.abx
    public void onComponentDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f360aec3", new Object[]{this});
            return;
        }
        super.onComponentDestroy();
        this.b.destroy();
        this.f28339a.destroy();
    }

    @Override // tb.phw
    public V onCreateView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (V) ((View) ipChange.ipc$dispatch("ebecba09", new Object[]{this}));
        }
        return (V) ((View) this.f28339a.t(getActivity(), getContainer()));
    }

    public abstract IP q2();

    public abstract IV s2();

    public IV t2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IV) ((p9e) ipChange.ipc$dispatch("f44d98df", new Object[]{this}));
        }
        return this.f28339a;
    }

    public IP u2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IP) ((ddd) ipChange.ipc$dispatch("b0ca6fd0", new Object[]{this}));
        }
        return this.b;
    }
}

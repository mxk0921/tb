package tb;

import android.app.Activity;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.alibaba.triver.triver_shop.newShop.event.broadcast.a;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.xsl.refact.XslDataSource;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class fox extends phw<Void, LinearLayout, acx<XslDataSource>> implements auc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f19449a;
    public final LinearLayout b;
    public final ArrayList<kae<?, ?>> c = new ArrayList<>();

    static {
        t2o.a(993002084);
        t2o.a(993001866);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fox(Activity activity, ude udeVar, acx<XslDataSource> acxVar, ViewGroup viewGroup, vfw vfwVar, boolean z) {
        super(activity, udeVar, acxVar, viewGroup, vfwVar);
        ckf.g(activity, "activity");
        ckf.g(udeVar, a.MSG_SOURCE_PARENT);
        this.f19449a = z;
        this.b = new LinearLayout(activity);
    }

    public static /* synthetic */ Object ipc$super(fox foxVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/searchbaseframe/xsl/refact/XslHeaderWidget");
    }

    @Override // tb.auc
    public void K0(boolean z, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("224521ba", new Object[]{this, new Boolean(z), new Float(f)});
        }
    }

    @Override // tb.auc
    public void Z0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a95530d", new Object[]{this});
            return;
        }
        Iterator<kae<?, ?>> it = this.c.iterator();
        ckf.f(it, "iterator(...)");
        while (it.hasNext()) {
            kae<?, ?> next = it.next();
            ckf.f(next, "next(...)");
            kae<?, ?> kaeVar = next;
            if (kaeVar instanceof x91) {
                ((x91) kaeVar).S0();
            }
        }
    }

    @Override // tb.auc
    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6833c7a", new Object[]{this, new Integer(i)});
        }
    }

    @Override // tb.auc
    public int f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("af5b5a8a", new Object[]{this})).intValue();
        }
        return 0;
    }

    @Override // tb.auc
    public kr1 getBehavior() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kr1) ipChange.ipc$dispatch("9c30dbef", new Object[]{this});
        }
        return null;
    }

    @Override // tb.abx
    public String getLogTag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("55d7c1cd", new Object[]{this});
        }
        return "";
    }

    @Override // tb.auc
    public void h0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("726a97c8", new Object[]{this});
            return;
        }
        Iterator<kae<?, ?>> it = this.c.iterator();
        ckf.f(it, "iterator(...)");
        while (it.hasNext()) {
            kae<?, ?> next = it.next();
            ckf.f(next, "next(...)");
            kae<?, ?> kaeVar = next;
            if (kaeVar instanceof x91) {
                ((x91) kaeVar).j2();
            }
        }
    }

    @Override // tb.auc
    public boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9409b0bc", new Object[]{this})).booleanValue();
        }
        return this.f19449a;
    }

    public final void q2(kae<?, ?> kaeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92484a80", new Object[]{this, kaeVar});
            return;
        }
        ckf.g(kaeVar, "widget");
        this.c.add(kaeVar);
        this.b.addView(kaeVar.getView());
    }

    public final void s2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a997329", new Object[]{this});
            return;
        }
        this.c.clear();
        this.b.removeAllViews();
    }

    /* renamed from: t2 */
    public LinearLayout onCreateView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinearLayout) ipChange.ipc$dispatch("887bc65e", new Object[]{this});
        }
        LinearLayout linearLayout = this.b;
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return linearLayout;
    }
}

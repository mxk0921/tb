package tb;

import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.recycler.refresh.TBAbsRefreshHeader;
import com.taobao.android.dinamicx.widget.recycler.refresh.TBRefreshHeader;
import com.taobao.android.dinamicx.widget.refresh.layout.DXRefreshLayout;
import com.taobao.android.dinamicx.widget.refresh.layout.constant.DXRefreshState;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class fa6 extends rb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final TBAbsRefreshHeader e;

    static {
        t2o.a(444597621);
    }

    public fa6(Context context) {
        this(context, null);
    }

    public static /* synthetic */ Object ipc$super(fa6 fa6Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/widget/refresh/header/DXRefreshHeader");
    }

    @Override // tb.avk
    public void d(DXRefreshLayout dXRefreshLayout, DXRefreshState dXRefreshState, DXRefreshState dXRefreshState2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8269120", new Object[]{this, dXRefreshLayout, dXRefreshState, dXRefreshState2});
            return;
        }
        this.e.changeToState(w(dXRefreshState2));
        avk avkVar = this.f27244a;
        if (avkVar != null) {
            avkVar.d(dXRefreshLayout, dXRefreshState, dXRefreshState2);
        }
    }

    @Override // tb.ba6
    public View getView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        return this.e;
    }

    @Override // tb.rb5, tb.ba6
    public void j(boolean z, float f, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c971f23", new Object[]{this, new Boolean(z), new Float(f), new Integer(i), new Integer(i2), new Integer(i3)});
        } else {
            this.e.setProgress(f);
        }
    }

    public final TBAbsRefreshHeader.RefreshState w(DXRefreshState dXRefreshState) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBAbsRefreshHeader.RefreshState) ipChange.ipc$dispatch("96c5a567", new Object[]{this, dXRefreshState});
        }
        return ga6.a(dXRefreshState, this.e.getCurrentState());
    }

    public fa6(Context context, TBAbsRefreshHeader tBAbsRefreshHeader) {
        tBAbsRefreshHeader = tBAbsRefreshHeader == null ? new TBRefreshHeader(context) : tBAbsRefreshHeader;
        this.e = tBAbsRefreshHeader;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(14);
        layoutParams.addRule(12);
        tBAbsRefreshHeader.setLayoutParams(layoutParams);
    }
}

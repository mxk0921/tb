package tb;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Typeface;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import com.taobao.taobao.R;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class xop extends vuu {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static Typeface e;
    public static final String f = Globals.getApplication().getResources().getString(R.string.uik_icon_right);
    public static final String g = Globals.getApplication().getResources().getString(R.string.uik_icon_tb_ArrowRight);
    public static final int h = Color.parseColor("#999999");
    public static final int i = Color.parseColor("#aaaaaa");
    public static final int j = p1p.a(3.0f);
    public static final int k = p1p.a(4.0f);
    public static final int l = p1p.a(14.0f);
    public static final int m = p1p.a(12.0f);
    public List<tqp> c;
    public wop d;

    static {
        t2o.a(815792572);
    }

    public static /* synthetic */ Object ipc$super(xop xopVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/mmd/uikit/shopinfo/ShopInfoDrawable");
    }

    public static void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b7f3ace", new Object[0]);
        } else if (e == null) {
            try {
                e = Typeface.createFromAsset(Globals.getApplication().getAssets(), "uik_iconfont.ttf");
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    @Override // tb.vuu
    public void l(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        List<tqp> list = this.c;
        if (list != null && list.size() > 0) {
            wop wopVar = this.d;
            if (wopVar != null) {
                int c = wopVar.c();
                List<tqp> list2 = this.c;
                this.d.a(canvas, c + list2.get(list2.size() - 1).b(), getBounds().height());
            }
            for (tqp tqpVar : this.c) {
                tqpVar.a(canvas, e);
            }
        }
    }

    public void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
            return;
        }
        List<tqp> list = this.c;
        if (list != null && list.size() > 0) {
            for (tqp tqpVar : this.c) {
                tqpVar.j();
            }
        }
    }

    public void q(List<tqp> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edd0be0e", new Object[]{this, list});
            return;
        }
        o();
        this.c = list;
        if (list != null && list.size() > 0) {
            for (tqp tqpVar : this.c) {
                tqpVar.g(this);
            }
        }
        invalidateSelf();
    }

    public void r(wop wopVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af5e4199", new Object[]{this, wopVar});
            return;
        }
        this.d = wopVar;
        invalidateSelf();
    }
}

package tb;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.TypeDX;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class zi2 extends n10 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final ux9 b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            if (kkr.i().o() != null) {
                kkr.i().o().c("SwitchTab_PreviewItem", null);
            }
            sjr g = sjr.g();
            if (zi2.d(zi2.this) == null) {
                str = null;
            } else {
                str = zi2.d(zi2.this).C();
            }
            g.c("com.taobao.taolive.goods.preheat.tab", null, str);
        }
    }

    static {
        t2o.a(295699370);
    }

    public zi2(xea xeaVar) {
        super(xeaVar);
        this.b = xeaVar.q();
    }

    public static /* synthetic */ ux9 d(zi2 zi2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ux9) ipChange.ipc$dispatch("d9757e40", new Object[]{zi2Var});
        }
        return zi2Var.b;
    }

    public static /* synthetic */ Object ipc$super(zi2 zi2Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/good/view/liveGoodsList/liveStateView/impl/itemview/BottomButtonItem");
    }

    @Override // tb.n10
    public TypeDX b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TypeDX) ipChange.ipc$dispatch("3eccfd5a", new Object[]{this, new Integer(i)});
        }
        View inflate = LayoutInflater.from(this.f24437a.i()).inflate(R.layout.taolive_goods_item_bottom_button_flexalocal, (ViewGroup) null);
        TypeDX typeDX = new TypeDX(inflate);
        if (inflate == null) {
            return typeDX;
        }
        inflate.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        ViewProxy.setOnClickListener(inflate, new a());
        return typeDX;
    }

    @Override // tb.n10
    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("90085d1", new Object[]{this});
        }
        return "bottomButton";
    }
}

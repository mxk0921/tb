package tb;

import android.content.Context;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.schedule.ViewProxy;
import com.taobao.tbpoplayer.nativerender.dsl.ComponentBaseModel;
import com.taobao.tbpoplayer.nativerender.dsl.HotSpotModel;
import com.taobao.tbpoplayer.nativerender.dsl.style.StyleModel;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class bdm extends ubm<HotSpotModel> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(790626477);
    }

    public bdm(oe8 oe8Var, HotSpotModel hotSpotModel) {
        super(oe8Var, hotSpotModel, false);
    }

    public static /* synthetic */ Object ipc$super(bdm bdmVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tbpoplayer/nativerender/render/component/PopHotSpotComponent");
    }

    @Override // tb.ubm
    public View c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("79a2c742", new Object[]{this, context});
        }
        View view = new View(context);
        i(view, ((HotSpotModel) this.b).style);
        view.setBackgroundColor(0);
        ViewProxy.setOnClickListener(view, new View.OnClickListener() { // from class: tb.zcm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                bdm.this.z(view2);
            }
        });
        ViewProxy.setOnLongClickListener(view, new View.OnLongClickListener() { // from class: tb.adm
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view2) {
                boolean A;
                A = bdm.this.A(view2);
                return A;
            }
        });
        return view;
    }

    @Override // tb.ubm
    public StyleModel f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StyleModel) ipChange.ipc$dispatch("14e3d48a", new Object[]{this});
        }
        T t = this.b;
        if (t != 0) {
            return ((HotSpotModel) t).style;
        }
        return null;
    }

    public final /* synthetic */ void z(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2672fcc6", new Object[]{this, view});
            return;
        }
        oe8 oe8Var = this.f29277a;
        ComponentBaseModel componentBaseModel = this.b;
        oe8Var.l(componentBaseModel, "click", ((HotSpotModel) componentBaseModel).action, ((HotSpotModel) componentBaseModel).actions);
    }

    public final /* synthetic */ boolean A(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("22748ba9", new Object[]{this, view})).booleanValue();
        }
        oe8 oe8Var = this.f29277a;
        ComponentBaseModel componentBaseModel = this.b;
        oe8Var.l(componentBaseModel, "longClick", ((HotSpotModel) componentBaseModel).action, ((HotSpotModel) componentBaseModel).actions);
        return true;
    }
}

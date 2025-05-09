package tb;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.taobao.R;
import com.taobao.tbpoplayer.nativerender.dsl.PopCloseBtnModel;
import com.taobao.tbpoplayer.nativerender.dsl.style.StyleModel;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class rbm extends ubm<PopCloseBtnModel> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(790626472);
    }

    public rbm(oe8 oe8Var, PopCloseBtnModel popCloseBtnModel) {
        super(oe8Var, popCloseBtnModel, false);
    }

    public static /* synthetic */ Object ipc$super(rbm rbmVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tbpoplayer/nativerender/render/component/PopCloseBtnComponent");
    }

    public final /* synthetic */ boolean A(String str, FailPhenixEvent failPhenixEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("65989a3d", new Object[]{this, str, failPhenixEvent})).booleanValue();
        }
        this.f29277a.s("CLOSEBTN_LOAD_ERROR", str);
        wdm.a("Phenix.loadBgImageError.imageUrl=" + str);
        return false;
    }

    @Override // tb.ubm
    public View c(Context context) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("79a2c742", new Object[]{this, context});
        }
        final ImageView imageView = new ImageView(context);
        if (!TextUtils.isEmpty(((PopCloseBtnModel) this.b).alt)) {
            str = ((PopCloseBtnModel) this.b).alt;
        } else {
            str = "关闭按钮";
        }
        imageView.setContentDescription(str);
        if (((PopCloseBtnModel) this.b).url.contains("gw.alicdn.com/imgextra/i1/O1CN01pu2yug24D6I5h7JbZ_!!6000000007356-2-tps-72-72.png")) {
            imageView.setImageResource(R.drawable.native_close_btn_light);
            this.f29277a.o();
        } else {
            final String g = a1n.g(this.f29277a, ((PopCloseBtnModel) this.b).url);
            if (TextUtils.isEmpty(g)) {
                this.f29277a.s("RenderError", "imageUrlIsEmpty");
                return null;
            }
            s0m.B().T(g).succListener(new s8d() { // from class: tb.pbm
                @Override // tb.s8d
                public final boolean onHappen(b1m b1mVar) {
                    boolean z;
                    z = rbm.this.z(imageView, g, (SuccPhenixEvent) b1mVar);
                    return z;
                }
            }).failListener(new s8d() { // from class: tb.qbm
                @Override // tb.s8d
                public final boolean onHappen(b1m b1mVar) {
                    boolean A;
                    A = rbm.this.A(g, (FailPhenixEvent) b1mVar);
                    return A;
                }
            }).fetch();
        }
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        return imageView;
    }

    @Override // tb.ubm
    public StyleModel f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StyleModel) ipChange.ipc$dispatch("14e3d48a", new Object[]{this});
        }
        T t = this.b;
        if (t != 0) {
            return ((PopCloseBtnModel) t).style;
        }
        return null;
    }

    public final /* synthetic */ boolean z(ImageView imageView, String str, SuccPhenixEvent succPhenixEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ef41721a", new Object[]{this, imageView, str, succPhenixEvent})).booleanValue();
        }
        if (succPhenixEvent == null || succPhenixEvent.getDrawable() == null) {
            this.f29277a.s("CLOSEBTN_LOAD_DRAWABLE_ERROR", str);
            wdm.a("Phenix.loadBgImageNoDrawable.imageUrl=" + str);
        } else {
            imageView.setImageDrawable(succPhenixEvent.getDrawable());
            this.f29277a.o();
        }
        return false;
    }
}

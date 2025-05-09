package tb;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.tbpoplayer.nativerender.dsl.ComponentBaseModel;
import com.taobao.tbpoplayer.nativerender.dsl.ImageModel;
import com.taobao.tbpoplayer.nativerender.dsl.style.StyleModel;
import tb.yam;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class idm extends ubm<ImageModel> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(790626478);
    }

    public idm(oe8 oe8Var, ImageModel imageModel, boolean z) {
        super(oe8Var, imageModel, z);
    }

    public static /* synthetic */ Object ipc$super(idm idmVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tbpoplayer/nativerender/render/component/PopImageComponent");
    }

    public final /* synthetic */ boolean E(String str, FailPhenixEvent failPhenixEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("af00ccb8", new Object[]{this, str, failPhenixEvent})).booleanValue();
        }
        this.f29277a.s("IMAGE_LOAD_ERROR", str);
        wdm.a("Phenix.loadBgImageError.imageUrl=" + str);
        return false;
    }

    public final /* synthetic */ void F(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("366cc14a", new Object[]{this, view});
            return;
        }
        yam f = this.f29277a.f();
        oe8 oe8Var = this.f29277a;
        ComponentBaseModel componentBaseModel = this.b;
        f.e(oe8Var, "click", ((ImageModel) componentBaseModel).animation, this.c, componentBaseModel, new yam.f() { // from class: tb.hdm
            @Override // tb.yam.f
            public final void onAnimationEnd() {
                idm.this.I();
            }
        });
    }

    public final /* synthetic */ void I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6efc4ac1", new Object[]{this});
            return;
        }
        oe8 oe8Var = this.f29277a;
        ComponentBaseModel componentBaseModel = this.b;
        oe8Var.l(componentBaseModel, "click", ((ImageModel) componentBaseModel).action, ((ImageModel) componentBaseModel).actions);
    }

    @Override // tb.ubm
    public View c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("79a2c742", new Object[]{this, context});
        }
        final ImageView imageView = new ImageView(context);
        final String g = a1n.g(this.f29277a, ((ImageModel) this.b).url);
        if (TextUtils.isEmpty(g)) {
            this.f29277a.s("ImageRenderError", "imageUrlIsEmpty");
            return null;
        }
        s0m.B().T(g).succListener(new s8d() { // from class: tb.cdm
            @Override // tb.s8d
            public final boolean onHappen(b1m b1mVar) {
                boolean D;
                D = idm.this.D(g, imageView, (SuccPhenixEvent) b1mVar);
                return D;
            }
        }).failListener(new s8d() { // from class: tb.ddm
            @Override // tb.s8d
            public final boolean onHappen(b1m b1mVar) {
                boolean E;
                E = idm.this.E(g, (FailPhenixEvent) b1mVar);
                return E;
            }
        }).fetch();
        i(imageView, ((ImageModel) this.b).style);
        if ("cover".equals(((ImageModel) this.b).style.objectFit)) {
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        } else {
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        }
        imageView.setOnClickListener(new View.OnClickListener() { // from class: tb.edm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                idm.this.F(view);
            }
        });
        imageView.setOnLongClickListener(new View.OnLongClickListener() { // from class: tb.fdm
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                boolean G;
                G = idm.this.G(view);
                return G;
            }
        });
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
            return ((ImageModel) t).style;
        }
        return null;
    }

    public final /* synthetic */ boolean G(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("326e502d", new Object[]{this, view})).booleanValue();
        }
        oe8 oe8Var = this.f29277a;
        ComponentBaseModel componentBaseModel = this.b;
        oe8Var.l(componentBaseModel, "longClick", ((ImageModel) componentBaseModel).action, ((ImageModel) componentBaseModel).actions);
        return true;
    }

    public final /* synthetic */ boolean D(final String str, ImageView imageView, SuccPhenixEvent succPhenixEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("77bf1d80", new Object[]{this, str, imageView, succPhenixEvent})).booleanValue();
        }
        if (succPhenixEvent == null || succPhenixEvent.getDrawable() == null) {
            this.f29277a.s("IMAGE_LOAD_DRAWABLE_ERROR", str);
            wdm.a("Phenix.loadBgImageNoDrawable.imageUrl=" + str);
        } else {
            BitmapDrawable drawable = succPhenixEvent.getDrawable();
            if (drawable instanceof cy0) {
                wdm.d("onImageLoaded.isAnimatedImage.id=%s.url=%s", ((ImageModel) this.b).id, str);
                cy0 cy0Var = (cy0) drawable;
                int i = ((ImageModel) this.b).loopTimes;
                if (i > 0) {
                    cy0Var.B(i);
                    cy0Var.A(new fy0() { // from class: tb.gdm
                        @Override // tb.fy0
                        public final boolean onLoopCompleted(int i2, int i3) {
                            boolean H;
                            H = idm.this.H(str, i2, i3);
                            return H;
                        }
                    });
                }
                cy0Var.C();
            }
            imageView.setImageDrawable(drawable);
            wdm.d("onImageLoaded.id=%s.url=%s", ((ImageModel) this.b).id, str);
            this.f29277a.p();
        }
        return false;
    }

    public final /* synthetic */ boolean H(String str, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("50ed67d7", new Object[]{this, str, new Integer(i), new Integer(i2)})).booleanValue();
        }
        try {
            wdm.d("onAnimatedLoopListener.id=%s.completedLoop=%s.totalLoop=%s", ((ImageModel) this.b).id, Integer.valueOf(i), Integer.valueOf(i2));
            if (i2 > 0 && i == i2) {
                oe8 oe8Var = this.f29277a;
                ComponentBaseModel componentBaseModel = this.b;
                oe8Var.l(componentBaseModel, "animImageFinish", ((ImageModel) componentBaseModel).loopEndAction, ((ImageModel) componentBaseModel).loopEndActions);
            }
        } catch (Throwable th) {
            wdm.h("Phenix.setAnimatedLoopListener.error.imageUrl=" + str, th);
        }
        return i != i2;
    }
}

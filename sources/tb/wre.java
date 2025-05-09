package tb;

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.immerse.IrpManager;
import com.etao.feimagesearch.struct.ViewWidget;
import com.taobao.android.address.themis.ThemisConfig;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class wre extends ViewWidget<View, IrpManager, ghe> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                wre.this.E().finish();
            }
        }
    }

    static {
        t2o.a(481296967);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wre(Activity activity, Object obj, IrpManager irpManager, xfw xfwVar) {
        super(activity, obj, irpManager, xfwVar, false, false, 48, null);
        ckf.g(activity, "activity");
        ckf.g(irpManager, ThemisConfig.SCENE_MANAGER);
        ckf.g(xfwVar, "setter");
    }

    public static /* synthetic */ Object ipc$super(wre wreVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/immerse/ImmerseTitleBarWidget");
    }

    @Override // com.etao.feimagesearch.struct.ViewWidget
    public View b0() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("ebecba09", new Object[]{this});
        }
        FrameLayout frameLayout = new FrameLayout(E());
        int a2 = p1p.a(21.0f);
        ImageView imageView = new ImageView(E());
        imageView.setOnClickListener(new a());
        imageView.setImageResource(R.drawable.feis_ic_back_no_warp);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(a2, a2);
        layoutParams.leftMargin = p1p.a(17.0f);
        Integer b = ipj.INSTANCE.b(E());
        if (b == null) {
            i = p1p.a(32.0f);
        } else {
            i = b.intValue();
        }
        layoutParams.topMargin = i + p1p.a(13.0f);
        xhv xhvVar = xhv.INSTANCE;
        frameLayout.addView(imageView, layoutParams);
        return frameLayout;
    }
}

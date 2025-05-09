package tb;

import android.content.res.ColorStateList;
import android.view.View;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.turbo.core.service.page.IPageBackLifecycle;
import com.taobao.taobao.R;
import tb.tpu;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class in1 extends qr1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final b Companion = new b(null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
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
                in1.m(in1.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class b {
        static {
            t2o.a(916455667);
        }

        public b() {
        }

        public /* synthetic */ b(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(916455666);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public in1(qpu qpuVar) {
        super(qpuVar);
        ckf.g(qpuVar, "turboEngineContext");
    }

    public static /* synthetic */ Object ipc$super(in1 in1Var, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1775111987) {
            return new Boolean(super.hide());
        }
        if (hashCode == -340027128) {
            return new Boolean(super.show());
        }
        if (hashCode == -41557118) {
            super.l(((Number) objArr[0]).intValue());
            return null;
        }
        int hashCode2 = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/turbo/service/topbar/component/BackButtonComponent");
    }

    public static final /* synthetic */ void m(in1 in1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73fb539b", new Object[]{in1Var});
        } else {
            in1Var.o();
        }
    }

    @Override // com.taobao.android.turbo.core.component.BaseComponent
    public boolean hide() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9631f0cd", new Object[]{this})).booleanValue();
        }
        if (!k().a().r()) {
            return super.hide();
        }
        return false;
    }

    @Override // tb.qr1
    public void l(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd85e382", new Object[]{this, new Integer(i)});
            return;
        }
        super.l(i);
        ImageView imageView = (ImageView) getView();
        if (imageView != null) {
            imageView.setImageTintList(ColorStateList.valueOf(i));
        }
    }

    /* renamed from: n */
    public ImageView createViewImpl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageView) ipChange.ipc$dispatch("76f3ad08", new Object[]{this});
        }
        ImageView imageView = new ImageView(getContext());
        imageView.setImageResource(R.drawable.top_bar_back_icon);
        imageView.setContentDescription("返回，按钮");
        imageView.setOnClickListener(new a());
        p(imageView);
        return imageView;
    }

    public final void p(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87974137", new Object[]{this, view});
        } else if (!k().a().r()) {
            view.setVisibility(8);
            setShowing(false);
        }
    }

    @Override // com.taobao.android.turbo.core.component.BaseComponent
    public boolean show() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ebbb9908", new Object[]{this})).booleanValue();
        }
        if (!k().a().r()) {
            return super.show();
        }
        return false;
    }

    public final void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c79264c7", new Object[]{this});
            return;
        }
        tpu.a.b(tpu.Companion, "BackButtonComponent", "处理点击", null, 4, null);
        Object f = k().a().f();
        if (f instanceof IPageBackLifecycle) {
            ((IPageBackLifecycle) f).U0(IPageBackLifecycle.TriggerType.BACK_BUTTON_CLICK);
        } else if (!((b7d) k().getService(b7d.class)).U0(IPageBackLifecycle.TriggerType.BACK_BUTTON_CLICK) && (f instanceof anl)) {
            ((anl) f).finish(true);
        }
    }
}

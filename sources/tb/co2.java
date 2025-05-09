package tb;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.adapter.IImageAdapter;
import com.taobao.themis.kernel.container.Window;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class co2 extends a90 implements kkb {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    public static final String g = co2.class.getSimpleName();
    public ImageView c;
    public String d;
    public String e;
    public Window.Theme f = Window.Theme.LIGHT;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        static {
            t2o.a(835715187);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            t2o.a(835715188);
            int[] iArr = new int[Window.Theme.values().length];
            iArr[Window.Theme.LIGHT.ordinal()] = 1;
            iArr[Window.Theme.DARK.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        t2o.a(835715186);
        t2o.a(835715176);
    }

    public static /* synthetic */ Object ipc$super(co2 co2Var, String str, Object... objArr) {
        if (str.hashCode() == -134981876) {
            super.q((Window.Theme) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/container/title/action/impl/ButtonAction");
    }

    @Override // tb.kkb
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7450a19a", new Object[]{this})).booleanValue();
        }
        ImageView imageView = this.c;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        return true;
    }

    @Override // tb.kkb
    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e195519f", new Object[]{this})).booleanValue();
        }
        ImageView imageView = this.c;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        return true;
    }

    @Override // tb.kkb
    public void h(String str, String str2, View.OnClickListener onClickListener) {
        IImageAdapter iImageAdapter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e00f298a", new Object[]{this, str, str2, onClickListener});
            return;
        }
        ImageView imageView = this.c;
        if (imageView != null) {
            if ((str != null && str.length() != 0) || (str2 != null && str2.length() != 0)) {
                this.d = str;
                this.e = str2;
                imageView.setVisibility(0);
                String r = r(this.f);
                if (!(r == null || r.length() == 0 || (iImageAdapter = (IImageAdapter) p8s.b(IImageAdapter.class)) == null)) {
                    iImageAdapter.setImageUrl(imageView, r, null);
                }
                imageView.setOnClickListener(onClickListener);
            }
        }
    }

    @Override // tb.a90
    public View l(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("1ed25ea8", new Object[]{this, context});
        }
        ckf.g(context, "context");
        if (this.c == null) {
            ImageView imageView = new ImageView(context);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.width = xcs.a(context, 28.0f);
            layoutParams.height = xcs.a(context, 28.0f);
            layoutParams.gravity = 17;
            layoutParams.setMarginEnd(xcs.a(context, 12.0f));
            imageView.setLayoutParams(layoutParams);
            imageView.setTag(g);
            this.c = imageView;
        }
        return this.c;
    }

    @Override // tb.a90
    public void q(Window.Theme theme) {
        ImageView imageView;
        IImageAdapter iImageAdapter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7f4570c", new Object[]{this, theme});
            return;
        }
        ckf.g(theme, "style");
        super.q(theme);
        this.f = theme;
        String r = r(theme);
        if (r != null && (imageView = this.c) != null && (iImageAdapter = (IImageAdapter) p8s.b(IImageAdapter.class)) != null) {
            iImageAdapter.setImageUrl(imageView, r, null);
        }
    }

    public final String r(Window.Theme theme) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5a1b1350", new Object[]{this, theme});
        }
        String str = this.d;
        if (str == null || str.length() == 0) {
            return this.d;
        }
        String str2 = this.e;
        if (str2 == null || str2.length() == 0) {
            return this.e;
        }
        int i = b.$EnumSwitchMapping$0[theme.ordinal()];
        if (i == 1) {
            return this.d;
        }
        if (i != 2) {
            return this.d;
        }
        return this.e;
    }

    public final xhv s(Drawable drawable, View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("270719f9", new Object[]{this, drawable, onClickListener});
        }
        ImageView imageView = this.c;
        if (imageView == null) {
            return null;
        }
        imageView.setVisibility(0);
        imageView.setImageDrawable(drawable);
        imageView.setOnClickListener(onClickListener);
        return xhv.INSTANCE;
    }

    public final xhv t(String str, View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("826dc9d3", new Object[]{this, str, onClickListener});
        }
        ImageView imageView = this.c;
        if (imageView == null) {
            return null;
        }
        if (!TextUtils.isEmpty(str)) {
            imageView.setVisibility(0);
            IImageAdapter iImageAdapter = (IImageAdapter) p8s.b(IImageAdapter.class);
            if (iImageAdapter != null) {
                ckf.d(str);
                iImageAdapter.setImageUrl(imageView, str, null);
            }
            imageView.setOnClickListener(onClickListener);
        }
        return xhv.INSTANCE;
    }
}

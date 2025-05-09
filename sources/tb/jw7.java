package tb;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.sf.BaseResultActivity;
import com.taobao.tao.util.SystemBarDecorator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class jw7 extends phw<Void, FrameLayout, Void> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public FrameLayout f22260a;

    static {
        t2o.a(815793764);
    }

    public jw7(Activity activity, ude udeVar, Void r3, ViewGroup viewGroup, vfw vfwVar) {
        super(activity, udeVar, r3, viewGroup, vfwVar);
    }

    public static /* synthetic */ Object ipc$super(jw7 jw7Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/sf/widgets/searchbar/DragHandlerWidget");
    }

    @Override // tb.abx
    public String getLogTag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("55d7c1cd", new Object[]{this});
        }
        return "DragHandlerWidget";
    }

    /* renamed from: q2 */
    public FrameLayout onCreateView() {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("6075f6f2", new Object[]{this});
        }
        if (((BaseResultActivity) getActivity()).isImmersiveStatus()) {
            i = SystemBarDecorator.getStatusBarHeight(getActivity());
        }
        this.f22260a = new FrameLayout(getActivity());
        this.f22260a.setLayoutParams(new ViewGroup.LayoutParams(-1, (o1p.b(24) + i) - rim.Companion.b()));
        View view = new View(getActivity());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(o1p.a(36.0f), o1p.a(4.0f));
        layoutParams.bottomMargin = o1p.a(6.0f);
        layoutParams.gravity = 81;
        view.setLayoutParams(layoutParams);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(o1p.b(o1p.a(3.5f)));
        gradientDrawable.setColor(Color.parseColor("#D8D8D8"));
        ViewCompat.setBackground(view, gradientDrawable);
        this.f22260a.addView(view);
        this.f22260a.setBackgroundColor(-1);
        return this.f22260a;
    }
}

package tb;

import android.graphics.drawable.Drawable;
import android.view.ViewTreeObserver;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class hne implements ViewTreeObserver.OnPreDrawListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final TUrlImageView f20760a;

    static {
        t2o.a(486539483);
    }

    public hne(TUrlImageView tUrlImageView) {
        this.f20760a = tUrlImageView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5acfbc33", new Object[]{this})).booleanValue();
        }
        if (!p2b.k()) {
            return true;
        }
        Drawable drawable = this.f20760a.getDrawable();
        if (drawable instanceof cy0) {
            cy0 cy0Var = (cy0) drawable;
            if (!p2b.i()) {
                TUrlImageView tUrlImageView = this.f20760a;
                int i = R.id.tag_image_view_animation_state_on_level_page;
                Object tag = tUrlImageView.getTag(i);
                if ((tag instanceof Boolean) && ((Boolean) tag).booleanValue() && !cy0Var.u()) {
                    this.f20760a.setTag(i, null);
                    cy0Var.C();
                }
            } else if (cy0Var.u()) {
                this.f20760a.setTag(R.id.tag_image_view_animation_state_on_level_page, Boolean.TRUE);
                cy0Var.D();
            }
        }
        return true;
    }
}

package tb;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class d6b extends kd7<e6b> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final View h;

    static {
        t2o.a(912262370);
    }

    public d6b(Context context) {
        super(context);
        View view = new View(this.f22590a);
        this.h = view;
        view.setContentDescription("热区");
    }

    public static /* synthetic */ Object ipc$super(d6b d6bVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/skeleton/desc/natives/holder/HotAreaViewHolder");
    }

    /* renamed from: e */
    public boolean m(e6b e6bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c5c7c07a", new Object[]{this, e6bVar})).booleanValue();
        }
        return false;
    }

    public void w(ViewGroup viewGroup, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c84c7b43", new Object[]{this, viewGroup, new Integer(i), new Integer(i2)});
        } else if (this.h != null && viewGroup != null) {
            T t = this.g;
            if (((e6b) t).k == 1) {
                double d = i;
                int i3 = (int) (((e6b) t).l * d);
                double d2 = i2;
                int i4 = (int) (((e6b) t).m * d2);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) (d * (((e6b) t).n - ((e6b) t).l)), (int) (d2 * (((e6b) t).o - ((e6b) t).m)));
                ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = i3;
                ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = i4;
                viewGroup.addView(this.h, layoutParams);
            }
        }
    }

    /* renamed from: x */
    public void h(e6b e6bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("223479f6", new Object[]{this, e6bVar});
            return;
        }
        double d = e6bVar.l;
        if (e6bVar.k == 1) {
            this.h.setBackgroundResource(R.color.tt_detail_transparent);
        }
    }

    /* renamed from: y */
    public View j(e6b e6bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("cb71a8aa", new Object[]{this, e6bVar});
        }
        return this.h;
    }
}

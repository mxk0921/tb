package tb;

import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class eot extends ViewOutlineProvider {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Rect f18734a;

    static {
        t2o.a(779093611);
    }

    public eot(Rect rect) {
        this.f18734a = rect;
    }

    public static /* synthetic */ Object ipc$super(eot eotVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/uikit/homepage/TextureVideoViewOutlineProvider");
    }

    @Override // android.view.ViewOutlineProvider
    public void getOutline(View view, Outline outline) {
        int i;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7054f590", new Object[]{this, view, outline});
        } else if (this.f18734a != null) {
            Rect rect = new Rect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
            Rect rect2 = this.f18734a;
            int i3 = rect2.left;
            if (i3 != 0 && rect2.top != 0 && rect2.right == 0 && rect2.bottom == 0) {
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                int i4 = this.f18734a.top;
                outline.setRoundRect(0, 0, measuredWidth, measuredHeight + i4, i4);
            } else if (i3 == 0 && rect2.top == 0 && rect2.right != 0 && (i2 = rect2.bottom) != 0) {
                outline.setRoundRect(0, -i2, view.getMeasuredWidth(), view.getMeasuredHeight(), this.f18734a.bottom);
            } else if (i3 != 0 && rect2.top == 0 && rect2.right == 0 && rect2.bottom != 0) {
                outline.setRoundRect(0, 0, view.getMeasuredWidth() + this.f18734a.left, view.getMeasuredHeight(), this.f18734a.left);
            } else if (i3 != 0 || rect2.top == 0 || (i = rect2.right) == 0 || rect2.bottom != 0) {
                int max = Math.max(i3, rect2.top);
                Rect rect3 = this.f18734a;
                outline.setRoundRect(rect, Math.max(max, Math.max(rect3.right, rect3.bottom)));
            } else {
                outline.setRoundRect(-i, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), this.f18734a.right);
            }
        }
    }
}

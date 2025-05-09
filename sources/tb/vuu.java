package tb;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_uikit.ui.UINode;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public abstract class vuu extends Drawable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Rect f30271a;
    public UINode b;

    static {
        t2o.a(986710122);
    }

    public static /* synthetic */ Object ipc$super(vuu vuuVar, String str, Object... objArr) {
        if (str.hashCode() == 1386870830) {
            super.invalidateSelf();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_uikit/widget/UIDrawable");
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cc013fa", new Object[]{this, canvas});
        } else {
            l(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2242c5cf", new Object[]{this})).intValue();
        }
        return -1;
    }

    public int h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("86af8f60", new Object[]{this})).intValue();
        }
        Rect rect = this.f30271a;
        if (rect == null) {
            return 0;
        }
        return rect.bottom;
    }

    public int i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("111699fc", new Object[]{this})).intValue();
        }
        Rect rect = this.f30271a;
        if (rect == null) {
            return 0;
        }
        return rect.left;
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52a9f82e", new Object[]{this});
            return;
        }
        UINode uINode = this.b;
        if (uINode != null) {
            uINode.invalidate();
        }
        super.invalidateSelf();
    }

    public int j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4f2526fb", new Object[]{this})).intValue();
        }
        Rect rect = this.f30271a;
        if (rect == null) {
            return 0;
        }
        return rect.right;
    }

    public int k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1c5536f4", new Object[]{this})).intValue();
        }
        Rect rect = this.f30271a;
        if (rect == null) {
            return 0;
        }
        return rect.top;
    }

    public abstract void l(Canvas canvas);

    public void m(UINode uINode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34b7c999", new Object[]{this, uINode});
        } else {
            this.b = uINode;
        }
    }

    public void n(Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c98ee783", new Object[]{this, rect});
        } else {
            this.f30271a = rect;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d144fec0", new Object[]{this, new Integer(i)});
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65fee558", new Object[]{this, colorFilter});
        }
    }
}

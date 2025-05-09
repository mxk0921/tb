package tb;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.ultron.ext.vlayout.ExposeLinearLayoutManagerEx;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class gfl {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int HORIZONTAL = 0;
    public static final int VERTICAL = 1;

    /* renamed from: a  reason: collision with root package name */
    public final ExposeLinearLayoutManagerEx f19952a;
    public int b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class a extends gfl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(ExposeLinearLayoutManagerEx exposeLinearLayoutManagerEx) {
            super(exposeLinearLayoutManagerEx, null);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/ext/vlayout/OrientationHelperEx$1");
        }

        @Override // tb.gfl
        public int d(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("4154f6c4", new Object[]{this, view})).intValue();
            }
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            if (!this.f19952a.m()) {
                return this.f19952a.getDecoratedRight(view) + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
            }
            return this.f19952a.getDecoratedRight(view);
        }

        @Override // tb.gfl
        public int e(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("36e345c3", new Object[]{this, view})).intValue();
            }
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            if (!this.f19952a.m()) {
                return this.f19952a.getDecoratedMeasuredWidth(view) + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
            }
            return this.f19952a.getDecoratedMeasuredWidth(view);
        }

        @Override // tb.gfl
        public int f(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("a55aa32e", new Object[]{this, view})).intValue();
            }
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            return this.f19952a.getDecoratedMeasuredHeight(view) + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        }

        @Override // tb.gfl
        public int g(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("3b9eef1d", new Object[]{this, view})).intValue();
            }
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            if (!this.f19952a.m()) {
                return this.f19952a.getDecoratedLeft(view) - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
            }
            return this.f19952a.getDecoratedLeft(view);
        }

        @Override // tb.gfl
        public int h() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("ddee639f", new Object[]{this})).intValue();
            }
            return this.f19952a.getWidth();
        }

        @Override // tb.gfl
        public int i() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("72158454", new Object[]{this})).intValue();
            }
            return this.f19952a.getWidth() - this.f19952a.getPaddingRight();
        }

        @Override // tb.gfl
        public int j() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("92aab526", new Object[]{this})).intValue();
            }
            return this.f19952a.getPaddingRight();
        }

        @Override // tb.gfl
        public int k() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("a9d8c75b", new Object[]{this})).intValue();
            }
            return this.f19952a.getPaddingLeft();
        }

        @Override // tb.gfl
        public int l() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("e68e0092", new Object[]{this})).intValue();
            }
            return (this.f19952a.getWidth() - this.f19952a.getPaddingLeft()) - this.f19952a.getPaddingRight();
        }

        @Override // tb.gfl
        public void n(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3aac1aea", new Object[]{this, new Integer(i)});
            } else {
                this.f19952a.offsetChildrenHorizontal(i);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class b extends gfl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b(ExposeLinearLayoutManagerEx exposeLinearLayoutManagerEx) {
            super(exposeLinearLayoutManagerEx, null);
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/ext/vlayout/OrientationHelperEx$2");
        }

        @Override // tb.gfl
        public int d(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("4154f6c4", new Object[]{this, view})).intValue();
            }
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            if (!this.f19952a.m()) {
                return this.f19952a.getDecoratedBottom(view) + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
            }
            return this.f19952a.getDecoratedBottom(view);
        }

        @Override // tb.gfl
        public int e(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("36e345c3", new Object[]{this, view})).intValue();
            }
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            if (!this.f19952a.m()) {
                return this.f19952a.getDecoratedMeasuredHeight(view) + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
            }
            return this.f19952a.getDecoratedMeasuredHeight(view);
        }

        @Override // tb.gfl
        public int f(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("a55aa32e", new Object[]{this, view})).intValue();
            }
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            return this.f19952a.getDecoratedMeasuredWidth(view) + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        }

        @Override // tb.gfl
        public int g(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("3b9eef1d", new Object[]{this, view})).intValue();
            }
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            if (!this.f19952a.m()) {
                return this.f19952a.getDecoratedTop(view) - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
            }
            return this.f19952a.getDecoratedTop(view);
        }

        @Override // tb.gfl
        public int h() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("ddee639f", new Object[]{this})).intValue();
            }
            return this.f19952a.getHeight();
        }

        @Override // tb.gfl
        public int i() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("72158454", new Object[]{this})).intValue();
            }
            return this.f19952a.getHeight() - this.f19952a.getPaddingBottom();
        }

        @Override // tb.gfl
        public int j() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("92aab526", new Object[]{this})).intValue();
            }
            return this.f19952a.getPaddingBottom();
        }

        @Override // tb.gfl
        public int k() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("a9d8c75b", new Object[]{this})).intValue();
            }
            return this.f19952a.getPaddingTop();
        }

        @Override // tb.gfl
        public int l() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("e68e0092", new Object[]{this})).intValue();
            }
            return (this.f19952a.getHeight() - this.f19952a.getPaddingTop()) - this.f19952a.getPaddingBottom();
        }

        @Override // tb.gfl
        public void n(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3aac1aea", new Object[]{this, new Integer(i)});
            } else {
                this.f19952a.offsetChildrenVertical(i);
            }
        }
    }

    static {
        t2o.a(156237949);
    }

    public /* synthetic */ gfl(ExposeLinearLayoutManagerEx exposeLinearLayoutManagerEx, a aVar) {
        this(exposeLinearLayoutManagerEx);
    }

    public static gfl a(ExposeLinearLayoutManagerEx exposeLinearLayoutManagerEx) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gfl) ipChange.ipc$dispatch("7caf927d", new Object[]{exposeLinearLayoutManagerEx});
        }
        return new a(exposeLinearLayoutManagerEx);
    }

    public static gfl b(ExposeLinearLayoutManagerEx exposeLinearLayoutManagerEx, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gfl) ipChange.ipc$dispatch("877e83aa", new Object[]{exposeLinearLayoutManagerEx, new Integer(i)});
        }
        if (i == 0) {
            return a(exposeLinearLayoutManagerEx);
        }
        if (i == 1) {
            return c(exposeLinearLayoutManagerEx);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public static gfl c(ExposeLinearLayoutManagerEx exposeLinearLayoutManagerEx) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gfl) ipChange.ipc$dispatch("fc1c7c6b", new Object[]{exposeLinearLayoutManagerEx});
        }
        return new b(exposeLinearLayoutManagerEx);
    }

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f(View view);

    public abstract int g(View view);

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public int m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9e6e2662", new Object[]{this})).intValue();
        }
        if (Integer.MIN_VALUE == this.b) {
            return 0;
        }
        return l() - this.b;
    }

    public abstract void n(int i);

    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d2801c9", new Object[]{this});
        } else {
            this.b = l();
        }
    }

    public gfl(ExposeLinearLayoutManagerEx exposeLinearLayoutManagerEx) {
        this.b = Integer.MIN_VALUE;
        this.f19952a = exposeLinearLayoutManagerEx;
    }
}

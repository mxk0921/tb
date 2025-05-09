package tb;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public abstract class a4w {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int POSITION_NONE = -2;
    public static final int POSITION_UNCHANGED = -1;

    /* renamed from: a  reason: collision with root package name */
    public final DataSetObservable f15546a = new DataSetObservable();

    static {
        t2o.a(764412091);
    }

    public void a(View view, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c889cb41", new Object[]{this, view, new Integer(i), obj});
            return;
        }
        throw new UnsupportedOperationException("Required method destroyItem was not overridden");
    }

    public void b(ViewGroup viewGroup, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a141ccc", new Object[]{this, viewGroup, new Integer(i), obj});
        } else {
            a(viewGroup, i, obj);
        }
    }

    public void c(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a80a62f", new Object[]{this, view});
        }
    }

    public void d(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fad9102", new Object[]{this, viewGroup});
        } else {
            c(viewGroup);
        }
    }

    public abstract int e();

    public int f(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("304bee8", new Object[]{this, obj})).intValue();
        }
        return -1;
    }

    public Object g(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("542dde3d", new Object[]{this, view, new Integer(i)});
        }
        throw new UnsupportedOperationException("Required method instantiateItem was not overridden");
    }

    public Object h(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("1038d332", new Object[]{this, viewGroup, new Integer(i)});
        }
        return g(viewGroup, i);
    }

    public abstract boolean i(View view, Object obj);

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eee9a4ec", new Object[]{this});
        } else {
            this.f15546a.notifyChanged();
        }
    }

    public void k(DataSetObserver dataSetObserver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63701d27", new Object[]{this, dataSetObserver});
        } else {
            this.f15546a.registerObserver(dataSetObserver);
        }
    }

    public void l(Parcelable parcelable, ClassLoader classLoader) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4ccff61", new Object[]{this, parcelable, classLoader});
        }
    }

    public Parcelable m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Parcelable) ipChange.ipc$dispatch("b5f2b05e", new Object[]{this});
        }
        return null;
    }

    public void n(View view, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("383ff807", new Object[]{this, view, new Integer(i), obj});
        }
    }

    public void o(ViewGroup viewGroup, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8338fbc6", new Object[]{this, viewGroup, new Integer(i), obj});
        } else {
            n(viewGroup, i, obj);
        }
    }

    public void p(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("481d94c0", new Object[]{this, view});
        }
    }

    public void q(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c641511", new Object[]{this, viewGroup});
        } else {
            p(viewGroup);
        }
    }

    public void r(DataSetObserver dataSetObserver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66db852e", new Object[]{this, dataSetObserver});
        } else {
            this.f15546a.unregisterObserver(dataSetObserver);
        }
    }
}

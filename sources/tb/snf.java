package tb;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public abstract class snf extends GestureDetector.SimpleOnGestureListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final RecyclerView f28159a;
    public View b;

    static {
        t2o.a(632291386);
    }

    public snf(RecyclerView recyclerView) {
        this.f28159a = recyclerView;
    }

    public static /* synthetic */ Object ipc$super(snf snfVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/ptr/views/recycler/accessories/ItemClickGestureListener");
    }

    public abstract boolean a(RecyclerView recyclerView, View view, int i, long j);

    public abstract boolean b(RecyclerView recyclerView, View view, int i, long j);

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("22fe0341", new Object[]{this, motionEvent})).booleanValue();
        }
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        RecyclerView recyclerView = this.f28159a;
        if (recyclerView != null) {
            this.b = recyclerView.findChildViewUnder(x, y);
        }
        if (this.b != null) {
            return true;
        }
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public void onLongPress(MotionEvent motionEvent) {
        RecyclerView recyclerView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8638ede4", new Object[]{this, motionEvent});
            return;
        }
        View view = this.b;
        if (view != null && (recyclerView = this.f28159a) != null) {
            int childLayoutPosition = recyclerView.getChildLayoutPosition(view);
            if (b(this.f28159a, this.b, childLayoutPosition, this.f28159a.getAdapter().getItemId(childLayoutPosition))) {
                this.b.setPressed(false);
                this.b = null;
            }
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("12546941", new Object[]{this, motionEvent, motionEvent2, new Float(f), new Float(f2)})).booleanValue();
        }
        View view = this.b;
        if (view == null) {
            return false;
        }
        view.setPressed(false);
        this.b = null;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public void onShowPress(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b398c1c3", new Object[]{this, motionEvent});
            return;
        }
        View view = this.b;
        if (view != null) {
            view.setPressed(true);
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5de27077", new Object[]{this, motionEvent})).booleanValue();
        }
        View view = this.b;
        if (view == null || this.f28159a == null) {
            return false;
        }
        view.setPressed(false);
        int childLayoutPosition = this.f28159a.getChildLayoutPosition(this.b);
        boolean a2 = a(this.f28159a, this.b, childLayoutPosition, this.f28159a.getAdapter().getItemId(childLayoutPosition));
        this.b = null;
        return a2;
    }
}

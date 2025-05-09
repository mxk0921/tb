package tb;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.aura.service.render.layout.AURAVlayoutManager;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class xn0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int b;
    public RecyclerView c;
    public LinearLayoutManager d;
    public int e;
    public int f;

    /* renamed from: a  reason: collision with root package name */
    public final Map<Integer, Integer> f31483a = new HashMap();
    public int g = -1;

    static {
        t2o.a(301990079);
    }

    public int a() {
        View findViewByPosition;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5c230527", new Object[]{this})).intValue();
        }
        int findFirstVisibleItemPosition = this.d.findFirstVisibleItemPosition();
        int findLastVisibleItemPosition = this.d.findLastVisibleItemPosition();
        if (findFirstVisibleItemPosition == this.f && this.g == -1 && (findViewByPosition = this.d.findViewByPosition(findFirstVisibleItemPosition)) != null) {
            this.g = findViewByPosition.getTop();
        }
        if (findFirstVisibleItemPosition < this.f) {
            return 0;
        }
        if (!((HashMap) this.f31483a).containsKey(Integer.valueOf(findFirstVisibleItemPosition)) || !((HashMap) this.f31483a).containsKey(Integer.valueOf(findLastVisibleItemPosition))) {
            for (int i = findFirstVisibleItemPosition; i <= findLastVisibleItemPosition; i++) {
                if (((HashMap) this.f31483a).containsKey(Integer.valueOf(i))) {
                    this.b -= ((Integer) ((HashMap) this.f31483a).get(Integer.valueOf(i))).intValue();
                }
                View findViewByPosition2 = this.d.findViewByPosition(i);
                if (!(findViewByPosition2 == null || findViewByPosition2.getMeasuredHeight() == 0)) {
                    ((HashMap) this.f31483a).put(Integer.valueOf(i), Integer.valueOf(findViewByPosition2.getMeasuredHeight()));
                    this.b += ((Integer) ((HashMap) this.f31483a).get(Integer.valueOf(i))).intValue();
                }
            }
        }
        float f = findFirstVisibleItemPosition;
        int i2 = this.f;
        return (int) ((-this.d.findViewByPosition(findFirstVisibleItemPosition).getTop()) + ((this.b / ((HashMap) this.f31483a).size()) * (f - ((i2 * i2) / f))) + this.g);
    }

    public int b() {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cf191e5d", new Object[]{this})).intValue();
        }
        if (((HashMap) this.f31483a).size() != 0) {
            i = (this.b / ((HashMap) this.f31483a).size()) * this.e;
        }
        if (((HashMap) this.f31483a).size() > this.e - 2) {
            return this.b;
        }
        return Math.max(i, this.b);
    }

    public int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("85a27def", new Object[]{this})).intValue();
        }
        AURAVlayoutManager aURAVlayoutManager = (AURAVlayoutManager) this.c.getLayoutManager();
        int childCount = aURAVlayoutManager.getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (!aURAVlayoutManager.k(i).o()) {
                this.f = i;
                return i;
            }
        }
        return 0;
    }

    public void d(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34e01537", new Object[]{this, recyclerView});
            return;
        }
        this.c = recyclerView;
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            this.d = (LinearLayoutManager) layoutManager;
        }
    }
}

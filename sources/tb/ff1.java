package tb;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import tb.ke1;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ff1 implements ke1.e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentHashMap<Integer, ConcurrentLinkedQueue<View>> f19245a = new ConcurrentHashMap<>(30);
    public final ke1 b;

    static {
        t2o.a(912262105);
        t2o.a(912262104);
    }

    public ff1(Context context) {
        this.b = new ke1(context);
    }

    public void a(ArrayList<Integer> arrayList, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1f6c163", new Object[]{this, arrayList, viewGroup});
        } else if (Build.VERSION.SDK_INT >= 28) {
            Iterator<Integer> it = arrayList.iterator();
            while (it.hasNext()) {
                Integer next = it.next();
                if (next != null) {
                    this.b.b(next.intValue(), viewGroup, this);
                }
            }
        }
    }

    public View b(Context context, int i, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("df51f464", new Object[]{this, context, new Integer(i), viewGroup});
        }
        ConcurrentLinkedQueue<View> concurrentLinkedQueue = this.f19245a.get(Integer.valueOf(i));
        if (concurrentLinkedQueue == null || concurrentLinkedQueue.size() <= 0) {
            return null;
        }
        View poll = concurrentLinkedQueue.poll();
        if (poll != null) {
            tgh.b("AsyncViewPreLoader", "getAsyncCacheView resId = " + context.getResources().getResourceEntryName(i));
            d(poll, context);
        }
        return poll;
    }

    public void c(View view, int i, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9e04771", new Object[]{this, view, new Integer(i), viewGroup});
        } else if (view != null) {
            ConcurrentLinkedQueue<View> concurrentLinkedQueue = this.f19245a.get(Integer.valueOf(i));
            if (concurrentLinkedQueue == null) {
                concurrentLinkedQueue = new ConcurrentLinkedQueue<>();
                this.f19245a.put(Integer.valueOf(i), concurrentLinkedQueue);
            }
            if (!concurrentLinkedQueue.contains(view)) {
                concurrentLinkedQueue.add(view);
            }
        }
    }

    public final void d(View view, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3eab9fe", new Object[]{this, view, context});
        } else if (view != null) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    d(viewGroup.getChildAt(i), context);
                }
            } else if (view.getContext() instanceof zdw) {
                ((zdw) view.getContext()).a(context);
            }
        }
    }
}

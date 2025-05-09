package tb;

import android.app.Activity;
import android.util.Pair;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class bjp {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final bjp b = new bjp();

    /* renamed from: a  reason: collision with root package name */
    public List<WeakReference<View>> f16429a;

    static {
        t2o.a(503316960);
    }

    public static bjp a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bjp) ipChange.ipc$dispatch("5f2befa5", new Object[0]);
        }
        return b;
    }

    public List<View> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("d92027d1", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        List<WeakReference<View>> list = this.f16429a;
        if (list != null) {
            Iterator it = ((ArrayList) list).iterator();
            while (it.hasNext()) {
                View view = (View) ((WeakReference) it.next()).get();
                if (view != null && (view.getContext() instanceof Activity) && !((Activity) view.getContext()).isFinishing()) {
                    arrayList.add(view);
                }
            }
        }
        return arrayList;
    }

    public void c(List<Pair<View, String>> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b06331b", new Object[]{this, list});
            return;
        }
        this.f16429a = new ArrayList();
        if (list != null) {
            for (Pair<View, String> pair : list) {
                this.f16429a.add(new WeakReference<>(pair.first));
            }
        }
    }
}

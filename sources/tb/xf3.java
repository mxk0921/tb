package tb;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class xf3 implements omb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<Integer, omb> f31344a;

    static {
        t2o.a(729809572);
        t2o.a(729809573);
    }

    public xf3() {
        HashMap hashMap = new HashMap();
        this.f31344a = hashMap;
        hashMap.put(1, new opl());
        hashMap.put(3, new opl());
        hashMap.put(2, new mf3());
    }

    @Override // tb.omb
    public RecyclerView.ViewHolder a(ViewGroup viewGroup, int i, o7d o7dVar, nmb nmbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView.ViewHolder) ipChange.ipc$dispatch("b5e973df", new Object[]{this, viewGroup, new Integer(i), o7dVar, nmbVar});
        }
        omb ombVar = (omb) ((HashMap) this.f31344a).get(Integer.valueOf(i));
        if (ombVar == null) {
            return null;
        }
        return ombVar.a(viewGroup, i, o7dVar, nmbVar);
    }
}

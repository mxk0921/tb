package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class c3x {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, d3x> f16840a = new ConcurrentHashMap();

    static {
        t2o.a(81789233);
    }

    public void a(d3x d3xVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1887307b", new Object[]{this, d3xVar});
        } else if (d3xVar != null && !TextUtils.isEmpty(d3xVar.i())) {
            ((ConcurrentHashMap) this.f16840a).put(d3xVar.i(), d3xVar);
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78edf851", new Object[]{this});
        } else {
            ((ConcurrentHashMap) this.f16840a).clear();
        }
    }

    public List<d3x> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("82b53ad", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(((ConcurrentHashMap) this.f16840a).values());
        return arrayList;
    }

    public d3x d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d3x) ipChange.ipc$dispatch("2378fd8", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return (d3x) ((ConcurrentHashMap) this.f16840a).get(str);
    }

    public void e(d3x d3xVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67585f9e", new Object[]{this, d3xVar});
        } else if (d3xVar != null && !TextUtils.isEmpty(d3xVar.i())) {
            ((ConcurrentHashMap) this.f16840a).remove(d3xVar.i());
        }
    }
}

package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.resourceguardian.data.model.RGCategoryInfo;
import com.taobao.metrickit.event.EventCenter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class kt6 implements n3c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, List<ht6>> f22903a = new HashMap();
    public boolean b = false;

    public void a(it6 it6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13dfca59", new Object[]{this, it6Var});
            return;
        }
        List<ht6> list = (List) ((HashMap) this.f22903a).get(RGCategoryInfo.a(it6Var.f21563a));
        if (list != null) {
            for (ht6 ht6Var : list) {
                ht6Var.a(it6Var);
            }
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        e();
        new oki(this).a();
        new ar2(this).a();
        new j52(this).a();
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("344dcf05", new Object[]{this})).booleanValue();
        }
        return this.b;
    }

    public void d(int i, ht6 ht6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4d5624", new Object[]{this, new Integer(i), ht6Var});
            return;
        }
        String a2 = RGCategoryInfo.a(i);
        List list = (List) ((HashMap) this.f22903a).get(a2);
        if (list == null) {
            list = new ArrayList(1);
            ((HashMap) this.f22903a).put(a2, list);
        }
        list.add(ht6Var);
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("995019a", new Object[]{this});
            return;
        }
        EventCenter.f().b(0, this);
        EventCenter.f().b(1, this);
    }

    @Override // tb.n3c
    public void onEvent(int i, Map<String, ?> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f16fb524", new Object[]{this, new Integer(i), map});
        } else if (i == 0) {
            this.b = true;
        } else if (i == 1) {
            this.b = false;
        }
    }
}

package tb;

import com.alibaba.poplayer.trigger.BaseConfigItem;
import com.alibaba.poplayer.trigger.a;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class pf4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<a> f26058a = new ArrayList<>();
    public final ArrayList<a> b = new ArrayList<>();
    public final ArrayList<a> c = new ArrayList<>();
    public final ArrayList<a> d = new ArrayList<>();
    public final ArrayList<BaseConfigItem> e = new ArrayList<>();
    public final List<String> f = new ArrayList();
    public final List<String> g = new ArrayList();

    static {
        t2o.a(626000006);
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e33d259b", new Object[]{this})).booleanValue();
        }
        if (!((ArrayList) this.f).isEmpty()) {
            return true;
        }
        if (!this.f26058a.isEmpty() || !this.d.isEmpty() || !this.e.isEmpty() || !this.b.isEmpty() || !this.c.isEmpty()) {
            return false;
        }
        return true;
    }
}

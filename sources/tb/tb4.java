package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.list.WidgetViewHolder;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class tb4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Object f28607a;
    public final b b = new b();
    public final a c = new a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public ay4<gu1, ? extends pwc> f28608a;
        public ay4<w02, ? extends WidgetViewHolder> b;

        static {
            t2o.a(993001735);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public ay4<gu1, ? extends tce> f28609a;
        public ay4<w02, ? extends WidgetViewHolder> b;

        static {
            t2o.a(993001736);
        }
    }

    static {
        t2o.a(993001734);
    }

    public <T> T a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("7c3c791e", new Object[]{this});
        }
        return (T) this.f28607a;
    }

    public void b(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eef14f2", new Object[]{this, obj});
        } else {
            this.f28607a = obj;
        }
    }
}

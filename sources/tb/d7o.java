package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class d7o implements bjb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final List<String> f17642a;
    public final boolean b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f17643a;
        public boolean b;
        public final List<String> c;

        static {
            t2o.a(676331546);
        }

        public d7o a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d7o) ipChange.ipc$dispatch("283c8a25", new Object[]{this});
            }
            return new d7o(this.f17643a, this.c, this.b);
        }

        public b b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("bdea5abe", new Object[]{this, str});
            }
            ((ArrayList) this.c).add(str);
            return this;
        }

        public b c(String... strArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("21c65192", new Object[]{this, strArr});
            }
            if (strArr != null) {
                for (String str : strArr) {
                    ((ArrayList) this.c).add(str);
                }
            }
            return this;
        }

        public b d(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("9885bc61", new Object[]{this, new Boolean(z)});
            }
            this.b = z;
            return this;
        }

        public b(String str) {
            this.c = new ArrayList();
            this.f17643a = str;
        }
    }

    static {
        t2o.a(676331544);
        t2o.a(676331534);
    }

    public d7o(String str, List<String> list, boolean z) {
        new HashMap();
        this.f17642a = list;
        this.b = z;
    }

    public static b b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("4bbce2a5", new Object[]{str});
        }
        return new b(str);
    }

    @Override // tb.bjb
    public void a(Context context) {
        List<String> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4899e04", new Object[]{this, context});
        } else if (!this.b && (list = this.f17642a) != null && list.size() > 0) {
            for (String str : this.f17642a) {
                try {
                    com.alibaba.android.split.manager.a i = ((cad) bcq.a()).i();
                    i.n(context, str);
                    if (i.i(str) != null) {
                        i.e(context, Arrays.asList(i.i(str).c()));
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

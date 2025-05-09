package tb;

import android.text.TextUtils;
import android.util.SparseArray;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.view.navbar.RightNavBarCollectIconHolder;
import com.taobao.android.detail2.core.framework.view.navbar.RightNavBarIconHolder;
import com.taobao.android.detail2.core.framework.view.navbar.RightNavBarMoreIconHolder;
import com.taobao.android.detail2.core.framework.view.navbar.RightNavBarNormalIconHolder;
import com.taobao.android.detail2.core.framework.view.navbar.RightNavBarShareIconHolder;
import com.taobao.android.detail2.core.framework.view.navbar.RightNavBarTransmitIconHolder;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class reo {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MORE = "more";

    /* renamed from: a  reason: collision with root package name */
    public final String[] f27319a = {"share", "normal", "more", "collect", "transmit"};
    public final SparseArray<a> b = new SparseArray<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f27320a;

        static {
            t2o.a(352322091);
        }

        public a(String str) {
            this.f27320a = str;
        }

        public String a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
            }
            return this.f27320a;
        }

        public int b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("5378242a", new Object[]{this})).intValue();
            }
            return this.f27320a.hashCode();
        }
    }

    static {
        t2o.a(352322090);
    }

    public reo() {
        d();
    }

    public RightNavBarIconHolder a(int i, ViewGroup viewGroup, dh7 dh7Var, cxj cxjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RightNavBarIconHolder) ipChange.ipc$dispatch("dd88f354", new Object[]{this, new Integer(i), viewGroup, dh7Var, cxjVar});
        }
        String b = b(i);
        if ("share".equals(b)) {
            return RightNavBarShareIconHolder.j0(viewGroup, dh7Var, cxjVar);
        }
        if ("normal".equals(b)) {
            return RightNavBarNormalIconHolder.j0(viewGroup, dh7Var, cxjVar);
        }
        if ("more".equals(b)) {
            return RightNavBarMoreIconHolder.f0(viewGroup, dh7Var, cxjVar);
        }
        if ("collect".equals(b)) {
            return RightNavBarCollectIconHolder.f0(viewGroup, dh7Var, cxjVar);
        }
        if ("transmit".equals(b)) {
            return RightNavBarTransmitIconHolder.j0(viewGroup, dh7Var, cxjVar);
        }
        return null;
    }

    public String b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("573cb895", new Object[]{this, new Integer(i)});
        }
        a aVar = this.b.get(i);
        if (aVar == null) {
            return "";
        }
        return aVar.a();
    }

    public int c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1e2231c4", new Object[]{this, str})).intValue();
        }
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        return new a(str).b();
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        for (String str : this.f27319a) {
            a aVar = new a(str);
            this.b.put(aVar.b(), aVar);
        }
    }
}

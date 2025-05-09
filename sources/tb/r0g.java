package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.kmp.kernel.serviceinterface.KSPowerMsgCountMessage;
import com.taobao.kmp.kernel.serviceinterface.KSPowerMsgJoinMessage;
import com.taobao.kmp.kernel.serviceinterface.KSPowerMsgPowerMessage;
import com.taobao.kmp.kernel.serviceinterface.KSPowerMsgTextMessage;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class r0g {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public List<KSPowerMsgTextMessage> f27033a;
    public List<KSPowerMsgCountMessage> b;
    public List<KSPowerMsgJoinMessage> c;
    public List<KSPowerMsgPowerMessage> d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        static {
            t2o.a(1002438914);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(1002438913);
    }

    public final List<KSPowerMsgPowerMessage> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("b206873", new Object[]{this});
        }
        return this.d;
    }

    public final List<KSPowerMsgCountMessage> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("d752f2fb", new Object[]{this});
        }
        return this.b;
    }

    public final List<KSPowerMsgJoinMessage> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("24cef054", new Object[]{this});
        }
        return this.c;
    }

    public final List<KSPowerMsgTextMessage> d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("ffbc9e71", new Object[]{this});
        }
        return this.f27033a;
    }

    public final void e(List<KSPowerMsgPowerMessage> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f84a651", new Object[]{this, list});
        } else {
            this.d = list;
        }
    }

    public final void f(List<KSPowerMsgCountMessage> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60bc2731", new Object[]{this, list});
        } else {
            this.b = list;
        }
    }

    public final void g(List<KSPowerMsgJoinMessage> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21f22d90", new Object[]{this, list});
        } else {
            this.c = list;
        }
    }

    public final void h(List<KSPowerMsgTextMessage> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4ba4313", new Object[]{this, list});
        } else {
            this.f27033a = list;
        }
    }
}

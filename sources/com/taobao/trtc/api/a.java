package com.taobao.trtc.api;

import android.os.Bundle;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.trtc.api.TrtcDefines;
import java.util.ArrayList;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public abstract class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* renamed from: com.taobao.trtc.api.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class C0782a {

        /* renamed from: a  reason: collision with root package name */
        public boolean f13892a;
        public boolean b;
        public boolean c;

        static {
            t2o.a(395313384);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public String f13893a;
        public boolean b;
        public boolean c;
        public boolean d;

        static {
            t2o.a(395313385);
        }
    }

    static {
        t2o.a(395313383);
    }

    public void A(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("777c61d2", new Object[]{this, str, str2});
        }
    }

    public void B(ArrayList<TrtcDefines.n> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a08348ac", new Object[]{this, arrayList});
        }
    }

    public void C(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34478d89", new Object[]{this, bVar});
        }
    }

    public void D(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efb3c428", new Object[]{this, new Integer(i)});
        }
    }

    public void E(int i, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4cd5fe60", new Object[]{this, new Integer(i), bundle});
        }
    }

    public void c(TrtcDefines.c cVar, TrtcDefines.TrtcAnswerType trtcAnswerType, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("daedd92a", new Object[]{this, cVar, trtcAnswerType, str});
        }
    }

    public void d(int i, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e20c2125", new Object[]{this, new Integer(i), bundle});
        }
    }

    public void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e99dfd55", new Object[]{this, str});
        }
    }

    public void f(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cda22ffa", new Object[]{this, new Boolean(z)});
        }
    }

    public void g(TrtcDefines.TrtcErrorEvent trtcErrorEvent, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3875e64a", new Object[]{this, trtcErrorEvent, new Integer(i), str});
        }
    }

    public void h(int i, Bundle bundle, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1436032", new Object[]{this, new Integer(i), bundle, map});
        }
    }

    public void i(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d449a76a", new Object[]{this, str, new Integer(i)});
        }
    }

    public void j(String str, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a155f2f", new Object[]{this, str, new Integer(i), new Integer(i2), new Integer(i3)});
        }
    }

    public void k(TrtcDefines.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0423f27", new Object[]{this, eVar});
        }
    }

    public void l(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a43c5222", new Object[]{this, str, new Boolean(z)});
        }
    }

    public void m(C0782a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a357a41", new Object[]{this, aVar});
        }
    }

    public void n(ArrayList<TrtcDefines.c> arrayList, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a61b229", new Object[]{this, arrayList, str});
        }
    }

    public void o(TrtcDefines.TrtcMediaConnectionState trtcMediaConnectionState) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e20a9d0", new Object[]{this, trtcMediaConnectionState});
        }
    }

    public void p(TrtcDefines.TrtcNetWorkQuality trtcNetWorkQuality) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10fee0eb", new Object[]{this, trtcNetWorkQuality});
        }
    }

    public void q(TrtcDefines.l lVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea1e4d2", new Object[]{this, lVar});
        }
    }

    public void r(TrtcDefines.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2eb917f", new Object[]{this, bVar});
        }
    }

    @Deprecated
    public void s(TrtcDefines.TrtcChannelAction trtcChannelAction, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ee6972a", new Object[]{this, trtcChannelAction, str, str2, str3});
        }
    }

    public void t(TrtcDefines.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f18f8c4b", new Object[]{this, dVar});
        }
    }

    public void u(int i, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8132c4bb", new Object[]{this, new Integer(i), bundle});
        }
    }

    public void v(TrtcDefines.b bVar, TrtcDefines.TrtcAnswerType trtcAnswerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7316f370", new Object[]{this, bVar, trtcAnswerType});
        }
    }

    public void w(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb6e88fa", new Object[]{this, str, str2});
        }
    }

    public void x(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c89e060d", new Object[]{this, str, str2});
        }
    }

    public void y(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54825390", new Object[]{this, str, str2});
        }
    }

    public void z(ArrayList<TrtcDefines.n> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a13bd2ae", new Object[]{this, arrayList});
        }
    }
}

package com.taobao.kmp.nexus.arch.openArch.service.message.context;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.kmp.nexus.arch.openArch.service.message.context.a;
import com.taobao.kmp.nexus.arch.openArch.service.powermsg.OpenArchPMBizCode;
import kotlin.LazyThreadSafetyMode;
import tb.a07;
import tb.avs;
import tb.d1a;
import tb.njg;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final C0573a Companion = new C0573a(null);
    public static final njg<String> k = kotlin.a.a(LazyThreadSafetyMode.PUBLICATION, new d1a() { // from class: tb.cgy
        @Override // tb.d1a
        public final Object invoke() {
            String i;
            i = a.i();
            return i;
        }
    });

    /* renamed from: a  reason: collision with root package name */
    public String f10887a;
    public final String b;
    public final int c;
    public final int d;
    public final int g;
    public final boolean h;
    public final String i;
    public final boolean j;

    /* compiled from: Taobao */
    /* renamed from: com.taobao.kmp.nexus.arch.openArch.service.message.context.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class C0573a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(1004536549);
        }

        public /* synthetic */ C0573a(a07 a07Var) {
            this();
        }

        public final a a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("d017eb5b", new Object[]{this, str});
            }
            return new a(str, b());
        }

        public final String b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("a5a8a388", new Object[]{this});
            }
            return (String) a.h().getValue();
        }

        public C0573a() {
        }
    }

    static {
        t2o.a(1004536548);
        t2o.a(1004536553);
    }

    public a() {
        this(null, null, 3, null);
    }

    public static final /* synthetic */ njg h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (njg) ipChange.ipc$dispatch("d232a02f", new Object[0]);
        }
        return k;
    }

    public static final String i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a749050b", new Object[0]);
        }
        return avs.INSTANCE.h("kmpLiveMessageCDNUrl", "https://impaas.alicdn.com/live/message/");
    }

    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("873e9f0e", new Object[]{this});
        }
        return this.b;
    }

    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9b7f7a80", new Object[]{this})).intValue();
        }
        return this.d;
    }

    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1b2369d", new Object[]{this});
        }
        return this.f10887a;
    }

    public void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc6a17e1", new Object[]{this, str});
        } else {
            this.f10887a = str;
        }
    }

    public void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c1f49fa", new Object[]{this, str});
        } else {
            e(str);
        }
    }

    public void g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f43374a6", new Object[]{this, str});
        }
    }

    public int j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f7ccdf92", new Object[]{this})).intValue();
        }
        return this.g;
    }

    public int k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b6056db2", new Object[]{this})).intValue();
        }
        return this.c;
    }

    public final boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("768cd617", new Object[]{this})).booleanValue();
        }
        return this.j;
    }

    public final boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a39e3670", new Object[]{this})).booleanValue();
        }
        return this.h;
    }

    public final String n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("442ac6cf", new Object[]{this});
        }
        return this.i;
    }

    public a(String str, String str2) {
        this.f10887a = str;
        this.b = str2;
        IpChange ipChange = OpenArchPMBizCode.$ipChange;
        this.c = 5;
        this.d = 10000;
        this.g = 18;
        avs avsVar = avs.INSTANCE;
        this.h = avsVar.d("kmpLiveMessageLongPullDisable", true);
        this.i = avsVar.h("kmpLongLiveMessageCDNUrl", "https://livemsgconnect.taobao.com/live/message/");
        this.j = avsVar.d("kmpEnableSecondTimeStamp", true);
    }

    public /* synthetic */ a(String str, String str2, int i, a07 a07Var) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}

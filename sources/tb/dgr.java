package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class dgr implements r8d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f17801a;
        public final /* synthetic */ String b;
        public final /* synthetic */ Map c;

        public a(String str, String str2, Map map) {
            this.f17801a = str;
            this.b = str2;
            this.c = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                l1m.b().onRequest(this.f17801a, this.b, this.c);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f17802a;
        public final /* synthetic */ String b;
        public final /* synthetic */ Map c;

        public b(String str, String str2, Map map) {
            this.f17802a = str;
            this.b = str2;
            this.c = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                l1m.b().onError(this.f17802a, this.b, this.c);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f17803a;
        public final /* synthetic */ String b;
        public final /* synthetic */ Map c;

        public c(String str, String str2, Map map) {
            this.f17803a = str;
            this.b = str2;
            this.c = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                l1m.b().onCancel(this.f17803a, this.b, this.c);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f17804a;
        public final /* synthetic */ String b;
        public final /* synthetic */ Map c;

        public d(String str, String str2, Map map) {
            this.f17804a = str;
            this.b = str2;
            this.c = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                l1m.b().onFinished(this.f17804a, this.b, this.c);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f17805a;
        public final /* synthetic */ String b;
        public final /* synthetic */ Map c;

        public e(String str, String str2, Map map) {
            this.f17805a = str;
            this.b = str2;
            this.c = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                l1m.b().onEvent(this.f17805a, this.b, this.c);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class f {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final dgr f17806a = new dgr();

        public static /* synthetic */ dgr a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (dgr) ipChange.ipc$dispatch("f7c3f9c5", new Object[0]);
            }
            return f17806a;
        }
    }

    public static dgr a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dgr) ipChange.ipc$dispatch("66ecb2a", new Object[0]);
        }
        return f.a();
    }

    @Override // tb.r8d
    public void onCancel(String str, String str2, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74e88eb1", new Object[]{this, str, str2, map});
        } else {
            ert.a(new c(str, str2, map));
        }
    }

    @Override // tb.r8d
    public void onError(String str, String str2, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b0e3681", new Object[]{this, str, str2, map});
        } else {
            ert.a(new b(str, str2, map));
        }
    }

    @Override // tb.r8d
    public void onEvent(String str, String str2, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12b3d9af", new Object[]{this, str, str2, map});
        } else {
            ert.a(new e(str, str2, map));
        }
    }

    @Override // tb.r8d
    public void onFinished(String str, String str2, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1dc51179", new Object[]{this, str, str2, map});
        } else {
            ert.a(new d(str, str2, map));
        }
    }

    @Override // tb.r8d
    public void onRequest(String str, String str2, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e10f665a", new Object[]{this, str, str2, map});
        } else {
            ert.a(new a(str, str2, map));
        }
    }
}

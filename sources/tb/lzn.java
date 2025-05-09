package tb;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.sf.remote.RemoteWidgetFactory;
import com.taobao.search.sf.remote.TaowiseRemoteWidgetFactory;
import com.taobao.tao.Globals;
import tb.b02;
import tb.lzn;
import tb.zk9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class lzn {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final lzn INSTANCE = new lzn();

    /* renamed from: a  reason: collision with root package name */
    public static boolean f23666a;
    public static RemoteWidgetFactory b;
    public static TaowiseRemoteWidgetFactory c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a implements b02.b<Object> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f23667a;
        public final /* synthetic */ mzn b;
        public final /* synthetic */ kzn c;

        public a(String str, mzn mznVar, kzn kznVar) {
            this.f23667a = str;
            this.b = mznVar;
            this.c = kznVar;
        }

        @Override // tb.b02.b
        public void a(String str, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("96fce058", new Object[]{this, str, bundle});
            }
        }

        @Override // tb.b02.b
        public void b(Object obj, Bundle bundle) {
            RemoteWidgetFactory remoteWidgetFactory;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("425b1026", new Object[]{this, obj, bundle});
                return;
            }
            if (obj instanceof RemoteWidgetFactory) {
                remoteWidgetFactory = (RemoteWidgetFactory) obj;
            } else {
                remoteWidgetFactory = null;
            }
            if (remoteWidgetFactory != null) {
                lzn.f(remoteWidgetFactory);
                phw<?, ? extends View, ?> createRemoteWidget = remoteWidgetFactory.createRemoteWidget(this.f23667a, this.b);
                if (createRemoteWidget != null) {
                    try {
                        this.c.a(createRemoteWidget);
                    } catch (Throwable unused) {
                    }
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class b implements zk9.i {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f23668a;
        public final /* synthetic */ mzn b;
        public final /* synthetic */ kzn c;

        public b(String str, mzn mznVar, kzn kznVar) {
            this.f23668a = str;
            this.b = mznVar;
            this.c = kznVar;
        }

        public static final void c(Class cls, String str, mzn mznVar, kzn kznVar) {
            ckf.g(cls, "$aClass");
            ckf.g(str, "$widgetName");
            ckf.g(mznVar, "$remoteWidgetParam");
            ckf.g(kznVar, "$widgetCallback");
            IpChange ipChange = lzn.$ipChange;
            Object newInstance = cls.newInstance();
            ckf.e(newInstance, "null cannot be cast to non-null type com.taobao.search.sf.remote.TaowiseRemoteWidgetFactory");
            lzn.e((TaowiseRemoteWidgetFactory) newInstance);
            TaowiseRemoteWidgetFactory b = lzn.b();
            ckf.d(b);
            phw<?, ? extends View, ?> createRemoteWidget = b.createRemoteWidget(str, mznVar);
            if (createRemoteWidget != null) {
                try {
                    kznVar.a(createRemoteWidget);
                } catch (Throwable th) {
                    c4p.o("RemoteWidgetCreator", "创建语音搜失败", th);
                }
            }
        }

        public static final void d(String str, mzn mznVar, kzn kznVar, Integer num) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c7e33fda", new Object[]{str, mznVar, kznVar, num});
                return;
            }
            ckf.g(str, "$widgetName");
            ckf.g(mznVar, "$remoteWidgetParam");
            ckf.g(kznVar, "$widgetCallback");
            lzn.INSTANCE.h(str, mznVar, kznVar);
        }

        @Override // tb.zk9.i
        public void onClassLoaded(final Class<?> cls) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5ad6f018", new Object[]{this, cls});
                return;
            }
            ckf.g(cls, "aClass");
            Handler handler = new Handler(Looper.getMainLooper());
            final String str = this.f23668a;
            final mzn mznVar = this.b;
            final kzn kznVar = this.c;
            handler.post(new Runnable() { // from class: tb.dlz
                @Override // java.lang.Runnable
                public final void run() {
                    lzn.b.c(cls, str, mznVar, kznVar);
                }
            });
        }

        @Override // tb.zk9.i
        public void onClassNotFound() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ad9dd2ef", new Object[]{this});
                return;
            }
            c4p.n("RemoteWidgetCreator", "问问语音搜类未找到");
            if (!lzn.a()) {
                lzn.d(true);
                bdt<Integer> c = vcq.a(Globals.getApplication()).c(xcq.c().l("taowise_android_aar").n());
                final String str = this.f23668a;
                final mzn mznVar = this.b;
                final kzn kznVar = this.c;
                c.c(new gvk() { // from class: tb.clz
                    @Override // tb.gvk
                    public final void onSuccess(Object obj) {
                        lzn.b.d(str, mznVar, kznVar, (Integer) obj);
                    }
                });
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class c implements b02.b<Object> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ yko f23669a;

        public c(yko ykoVar) {
            this.f23669a = ykoVar;
        }

        @Override // tb.b02.b
        public void a(String str, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("96fce058", new Object[]{this, str, bundle});
            }
        }

        @Override // tb.b02.b
        public void b(Object obj, Bundle bundle) {
            RemoteWidgetFactory remoteWidgetFactory;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("425b1026", new Object[]{this, obj, bundle});
                return;
            }
            if (obj instanceof RemoteWidgetFactory) {
                remoteWidgetFactory = (RemoteWidgetFactory) obj;
            } else {
                remoteWidgetFactory = null;
            }
            if (remoteWidgetFactory != null) {
                lzn.f(remoteWidgetFactory);
                RemoteWidgetFactory c = lzn.c();
                if (c != null) {
                    c.registerRemoteWidget(this.f23669a);
                }
            }
        }
    }

    static {
        t2o.a(815793463);
    }

    public static final /* synthetic */ boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4ff75181", new Object[0])).booleanValue();
        }
        return f23666a;
    }

    public static final /* synthetic */ TaowiseRemoteWidgetFactory b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaowiseRemoteWidgetFactory) ipChange.ipc$dispatch("1615d57d", new Object[0]);
        }
        return c;
    }

    public static final /* synthetic */ RemoteWidgetFactory c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RemoteWidgetFactory) ipChange.ipc$dispatch("c45cc175", new Object[0]);
        }
        return b;
    }

    public static final /* synthetic */ void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("461f1303", new Object[]{new Boolean(z)});
        } else {
            f23666a = z;
        }
    }

    public static final /* synthetic */ void e(TaowiseRemoteWidgetFactory taowiseRemoteWidgetFactory) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5919e6d", new Object[]{taowiseRemoteWidgetFactory});
        } else {
            c = taowiseRemoteWidgetFactory;
        }
    }

    public static final /* synthetic */ void f(RemoteWidgetFactory remoteWidgetFactory) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2307c5ab", new Object[]{remoteWidgetFactory});
        } else {
            b = remoteWidgetFactory;
        }
    }

    public final void g(String str, mzn mznVar, kzn kznVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29375ec7", new Object[]{this, str, mznVar, kznVar});
            return;
        }
        ckf.g(str, com.alibaba.triver.triver_shop.newShop.event.broadcast.a.WIDGET_NAME);
        ckf.g(mznVar, "remoteWidgetParam");
        ckf.g(kznVar, "widgetCallback");
        RemoteWidgetFactory remoteWidgetFactory = b;
        if (remoteWidgetFactory != null) {
            phw<?, ? extends View, ?> createRemoteWidget = remoteWidgetFactory.createRemoteWidget(str, mznVar);
            if (createRemoteWidget != null) {
                try {
                    kznVar.a(createRemoteWidget);
                } catch (Throwable unused) {
                }
            }
        } else {
            Activity a2 = mznVar.a();
            vcq.a(a2).c(xcq.c().m(xdp.l(a2, RemoteWidgetFactory.class).f(new a(str, mznVar, kznVar)).a()).n());
        }
    }

    public final void h(String str, mzn mznVar, kzn kznVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4039fe39", new Object[]{this, str, mznVar, kznVar});
            return;
        }
        ckf.g(str, com.alibaba.triver.triver_shop.newShop.event.broadcast.a.WIDGET_NAME);
        ckf.g(mznVar, "remoteWidgetParam");
        ckf.g(kznVar, "widgetCallback");
        TaowiseRemoteWidgetFactory taowiseRemoteWidgetFactory = c;
        if (taowiseRemoteWidgetFactory != null) {
            phw<?, ? extends View, ?> createRemoteWidget = taowiseRemoteWidgetFactory.createRemoteWidget(str, mznVar);
            if (createRemoteWidget != null) {
                try {
                    kznVar.a(createRemoteWidget);
                } catch (Throwable th) {
                    c4p.o("RemoteWidgetCreator", "创建语音搜失败", th);
                }
            }
        } else {
            try {
                zk9.b("com.taobao.taowise.remote.TwRemoteFactoryImpl", new b(str, mznVar, kznVar));
            } catch (Throwable unused) {
            }
        }
    }

    public final void i(yko ykoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14c1507f", new Object[]{this, ykoVar});
            return;
        }
        ckf.g(ykoVar, "core");
        RemoteWidgetFactory remoteWidgetFactory = b;
        if (remoteWidgetFactory != null) {
            remoteWidgetFactory.registerRemoteWidget(ykoVar);
            return;
        }
        Application application = Globals.getApplication();
        vcq.a(application).c(xcq.c().m(xdp.l(application, RemoteWidgetFactory.class).f(new c(ykoVar)).a()).n());
    }

    public final phw<?, ? extends View, ?> j(String str, mzn mznVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (phw) ipChange.ipc$dispatch("c23dfd2c", new Object[]{this, str, mznVar});
        }
        ckf.g(str, com.alibaba.triver.triver_shop.newShop.event.broadcast.a.WIDGET_NAME);
        ckf.g(mznVar, "remoteWidgetParam");
        RemoteWidgetFactory remoteWidgetFactory = b;
        if (remoteWidgetFactory == null || remoteWidgetFactory == null) {
            return null;
        }
        return remoteWidgetFactory.createRemoteWidget(str, mznVar);
    }
}

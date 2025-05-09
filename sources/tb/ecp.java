package tb;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.adaemon.ADaemon;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.alilive.aliliveframework.frame.loader.config.ConfigItem;
import com.taobao.android.task.Coordinator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ecp extends kv implements dg4, n23 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public List<ConfigItem> d;
    public Handler f;
    public final boolean g;
    public final Handler e = new Handler();
    public final List<Runnable> h = new ArrayList();
    public final atd c = new oal();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ BaseFrame f18476a;
        public final /* synthetic */ String b;
        public final /* synthetic */ ViewStub c;
        public final /* synthetic */ dy9 d;

        public a(BaseFrame baseFrame, String str, ViewStub viewStub, dy9 dy9Var) {
            this.f18476a = baseFrame;
            this.b = str;
            this.c = viewStub;
            this.d = dy9Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            ecp.l(ecp.this, this.f18476a, this.b, this.c, this.d);
            ecp.m(ecp.this).remove(this);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ BaseFrame f18477a;
        public final /* synthetic */ String b;
        public final /* synthetic */ View c;
        public final /* synthetic */ dy9 d;

        public b(BaseFrame baseFrame, String str, View view, dy9 dy9Var) {
            this.f18477a = baseFrame;
            this.b = str;
            this.c = view;
            this.d = dy9Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            ecp.o(ecp.this, this.f18477a, this.b, this.c, this.d);
            ecp.m(ecp.this).remove(this);
        }
    }

    static {
        t2o.a(806355045);
        t2o.a(806355035);
        t2o.a(806355039);
    }

    public ecp(Context context, boolean z, boolean z2) {
        super(context);
        new ArrayList();
        this.g = z2;
        q();
    }

    public static /* synthetic */ Object ipc$super(ecp ecpVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2130491415:
                super.start();
                return null;
            case -1746936735:
                return super.e((BaseFrame) objArr[0], (String) objArr[1], (ViewStub) objArr[2], (dy9) objArr[3]);
            case 266838523:
                return ecpVar.i((BaseFrame) objArr[0], (String) objArr[1], (ViewStub) objArr[2], (dy9) objArr[3]);
            case 712359359:
                return super.f((BaseFrame) objArr[0], (String) objArr[1], (View) objArr[2], (dy9) objArr[3]);
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/alilive/aliliveframework/frame/loader/install/impl/SerialFrameInstaller");
        }
    }

    public static /* synthetic */ f8c l(ecp ecpVar, BaseFrame baseFrame, String str, ViewStub viewStub, dy9 dy9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f8c) ipChange.ipc$dispatch("a032d16f", new Object[]{ecpVar, baseFrame, str, viewStub, dy9Var});
        }
        return super.e(baseFrame, str, viewStub, dy9Var);
    }

    public static /* synthetic */ List m(ecp ecpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("c17c96b3", new Object[]{ecpVar});
        }
        return ecpVar.h;
    }

    public static /* synthetic */ f8c n(ecp ecpVar, BaseFrame baseFrame, String str, ViewStub viewStub, dy9 dy9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f8c) ipChange.ipc$dispatch("15103ad", new Object[]{ecpVar, baseFrame, str, viewStub, dy9Var});
        }
        return ecpVar.i(baseFrame, str, viewStub, dy9Var);
    }

    public static /* synthetic */ f8c o(ecp ecpVar, BaseFrame baseFrame, String str, View view, dy9 dy9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f8c) ipChange.ipc$dispatch("e364947e", new Object[]{ecpVar, baseFrame, str, view, dy9Var});
        }
        return super.f(baseFrame, str, view, dy9Var);
    }

    @Override // tb.n23
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c109531", new Object[]{this});
            return;
        }
        Handler handler = this.e;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        Handler handler2 = this.f;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages(Integer.valueOf(hashCode()));
        }
    }

    @Override // tb.kv, tb.f8c
    public long b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c6256b3f", new Object[]{this, str})).longValue();
        }
        ConfigItem p = p(str);
        long j = 0;
        if (p != null) {
            long j2 = p.delay;
            if (j2 > 0) {
                j = j2;
            }
        }
        if (this.g) {
            j += qvs.w0();
        }
        o3s.a("FrameInstaller", str + " delay = " + j);
        return j;
    }

    @Override // tb.kv, tb.f8c
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        Handler handler = this.e;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        Iterator it = ((ArrayList) this.h).iterator();
        while (it.hasNext()) {
            ADaemon.removeMainLooperCallback((Runnable) it.next());
        }
        Handler handler2 = this.f;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages(Integer.valueOf(hashCode()));
        }
    }

    @Override // tb.kv, tb.f8c
    public f8c e(BaseFrame baseFrame, String str, ViewStub viewStub, dy9 dy9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f8c) ipChange.ipc$dispatch("97dfdc61", new Object[]{this, baseFrame, str, viewStub, dy9Var});
        }
        BaseFrame a2 = this.f22943a.a(str);
        if (a2 == null || !a2.asyncRenderComponent() || this.f == null || !(viewStub.getParent() instanceof ViewGroup) || Build.VERSION.SDK_INT <= 27) {
            a aVar = new a(baseFrame, str, viewStub, dy9Var);
            ((ArrayList) this.h).add(aVar);
            ADaemon.postMainLooper(aVar, b(str));
        } else {
            a2.asyncRenderComponentWithSerialFrameInstaller(baseFrame, (ViewGroup) viewStub.getParent(), viewStub, this.f, this.e, Integer.valueOf(hashCode()), b(str));
        }
        return this;
    }

    @Override // tb.kv, tb.f8c
    public f8c f(BaseFrame baseFrame, String str, View view, dy9 dy9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f8c) ipChange.ipc$dispatch("2a75bdbf", new Object[]{this, baseFrame, str, view, dy9Var});
        }
        b bVar = new b(baseFrame, str, view, dy9Var);
        ((ArrayList) this.h).add(bVar);
        ADaemon.postMainLooper(bVar, b(str));
        return this;
    }

    public final ConfigItem p(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConfigItem) ipChange.ipc$dispatch("a6f87ffc", new Object[]{this, str});
        }
        List<ConfigItem> list = this.d;
        if (list == null || list.isEmpty()) {
            return null;
        }
        for (ConfigItem configItem : this.d) {
            if (configItem.component.equals(str)) {
                return configItem;
            }
        }
        return null;
    }

    public final void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eda91ab6", new Object[]{this});
        } else {
            this.f = new Handler(Coordinator.getWorkerLooper());
        }
    }

    public void r(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cccc2dc6", new Object[]{this, str, str2});
            return;
        }
        o3s.d("FrameInstaller", "Config load failure, errorMsg = " + str2);
    }

    public void s(List<ConfigItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1c36a9c", new Object[]{this, list});
        } else {
            this.d = list;
        }
    }

    @Override // tb.kv, tb.f8c
    public void start() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
            return;
        }
        super.start();
        ((oal) this.c).a(this);
    }
}

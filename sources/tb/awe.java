package tb;

import android.os.Bundle;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.bundleInfo.BundleInfoManager;
import com.taobao.android.information.ai.api.IInformationFlowAiApi;
import com.taobao.android.task.Coordinator;
import com.taobao.appbundle.a;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.b02;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class awe {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final AtomicBoolean b = new AtomicBoolean(false);

    /* renamed from: a  reason: collision with root package name */
    public final d f16039a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            fve.e("AfterBuyAiDownloader", "executeLoad start");
            a.C0529a aVar = com.taobao.appbundle.a.Companion;
            xcq n = xcq.c().m(xdp.l(aVar.a().d(), IInformationFlowAiApi.class).f(awe.a(awe.this)).a()).n();
            ucq h = aVar.a().h();
            if (h != null) {
                h.c(n).b(awe.b(awe.this));
            } else {
                awe.c().set(false);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements rqk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.rqk
        public void onFailure(Exception exc) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ebfde814", new Object[]{this, exc});
                return;
            }
            awe.c().set(false);
            awe.d(awe.this).a(exc.getMessage());
            fve.e("AfterBuyAiDownloader", "bundle开始安装失败");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements b02.b<Object> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // tb.b02.b
        public void a(String str, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("96fce058", new Object[]{this, str, bundle});
                return;
            }
            awe.c().set(false);
            awe.d(awe.this).a(str);
            fve.e("AfterBuyAiDownloader", "bundle加载失败");
        }

        @Override // tb.b02.b
        public void b(Object obj, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("425b1026", new Object[]{this, obj, bundle});
                return;
            }
            fve.e("AfterBuyAiDownloader", "onInstantiate ：" + obj);
            if (!(obj instanceof IInformationFlowAiApi)) {
                fve.e("AfterBuyAiDownloader", "!(o instanceof IAfterBuyAiApi)");
                d d = awe.d(awe.this);
                d.a("加载返回的对象类型不匹配, Object : " + obj);
                return;
            }
            fve.e("AfterBuyAiDownloader", "bundle加载成功");
            awe.d(awe.this).b((IInformationFlowAiApi) obj);
            awe.c().set(false);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface d {
        void a(String str);

        void b(IInformationFlowAiApi iInformationFlowAiApi);
    }

    static {
        t2o.a(327155713);
    }

    public awe(d dVar) {
        this.f16039a = dVar;
    }

    public static /* synthetic */ b02.b a(awe aweVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b02.b) ipChange.ipc$dispatch("671805c7", new Object[]{aweVar});
        }
        return aweVar.e();
    }

    public static /* synthetic */ rqk b(awe aweVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rqk) ipChange.ipc$dispatch("92f70616", new Object[]{aweVar});
        }
        return aweVar.f();
    }

    public static /* synthetic */ AtomicBoolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicBoolean) ipChange.ipc$dispatch("ba126bf9", new Object[0]);
        }
        return b;
    }

    public static /* synthetic */ d d(awe aweVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("80ab97fd", new Object[]{aweVar});
        }
        return aweVar.f16039a;
    }

    public final b02.b<Object> e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b02.b) ipChange.ipc$dispatch("73f8ab58", new Object[]{this});
        }
        return new c();
    }

    public final rqk f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rqk) ipChange.ipc$dispatch("d1253851", new Object[]{this});
        }
        return new b();
    }

    public void g() {
        Object obj;
        if (!bcq.b()) {
            fve.e("AfterBuyAiDownloader", "remote module has not init");
            return;
        }
        AtomicBoolean atomicBoolean = b;
        if (atomicBoolean.get()) {
            fve.e("AfterBuyAiDownloader", "ready download");
            return;
        }
        atomicBoolean.set(true);
        if (BundleInfoManager.instance().getDynamicFeatureInfo("information_flow_ai") == null) {
            d dVar = this.f16039a;
            if (dVar != null) {
                try {
                    obj = Class.forName("com.taobao.informationflowai.InfoFlowAiProvider").newInstance();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                    obj = null;
                    atomicBoolean.set(false);
                    dVar.b((IInformationFlowAiApi) obj);
                    return;
                } catch (IllegalAccessException e2) {
                    e2.printStackTrace();
                    obj = null;
                    atomicBoolean.set(false);
                    dVar.b((IInformationFlowAiApi) obj);
                    return;
                } catch (InstantiationException e3) {
                    e3.printStackTrace();
                    obj = null;
                    atomicBoolean.set(false);
                    dVar.b((IInformationFlowAiApi) obj);
                    return;
                }
                atomicBoolean.set(false);
                dVar.b((IInformationFlowAiApi) obj);
                return;
            }
            return;
        }
        Coordinator.execute(new a());
    }
}

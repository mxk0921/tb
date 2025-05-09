package tb;

import android.os.Looper;
import android.os.MessageQueue;
import android.text.TextUtils;
import com.alibaba.android.aura.nodemodel.branch.AURANodeBranchModel;
import com.alibaba.android.aura.taobao.adapter.extension.asyncModule.model.AsyncModule;
import com.alibaba.android.umf.node.service.parse.state.RenderComponent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.atomic.AtomicInteger;
import tb.au;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class mg extends au {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final nbb b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements MessageQueue.IdleHandler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f24022a;

        public a(String str) {
            this.f24022a = str;
        }

        @Override // android.os.MessageQueue.IdleHandler
        public boolean queueIdle() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("b5e69690", new Object[]{this})).booleanValue();
            }
            mg.d(mg.this, this.f24022a);
            return false;
        }
    }

    static {
        t2o.a(81788971);
    }

    public mg(nbb nbbVar) {
        this.b = nbbVar;
    }

    public static /* synthetic */ void d(mg mgVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ff2922d", new Object[]{mgVar, str});
        } else {
            mgVar.e(str);
        }
    }

    public static /* synthetic */ Object ipc$super(mg mgVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/aura/taobao/adapter/extension/asyncModule/management/AURAAsyncModuleManager");
    }

    @Override // tb.au
    public void a(String str, String str2, RenderComponent renderComponent, AsyncModule asyncModule) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c335003", new Object[]{this, str, str2, renderComponent, asyncModule});
        } else if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && renderComponent != null && asyncModule != null) {
            au.a aVar = new au.a();
            aVar.f16005a = str2;
            aVar.b = new AtomicInteger(0);
            aVar.c = renderComponent;
            aVar.d = asyncModule;
            this.f16004a.put(str, aVar);
        }
    }

    @Override // tb.au
    public AsyncModule b(String str) {
        au.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AsyncModule) ipChange.ipc$dispatch("84fcba9f", new Object[]{this, str});
        }
        if (!TextUtils.isEmpty(str) && (aVar = this.f16004a.get(str)) != null) {
            return aVar.d;
        }
        return null;
    }

    @Override // tb.au
    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81238dc1", new Object[]{this, str});
        } else if (this.b.a(new AURANodeBranchModel("aura.branch.asyncComponent.trigger.idle", true, "default"))) {
            f(str);
        } else {
            e(str);
        }
    }

    public final void e(String str) {
        au.a aVar;
        AtomicInteger atomicInteger;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7493237", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str) && (aVar = this.f16004a.get(str)) != null && (atomicInteger = aVar.b) != null && atomicInteger.get() != 1) {
            qi qiVar = new qi();
            qiVar.t(fxu.f(aVar.c));
            qiVar.p("" + System.currentTimeMillis());
            qiVar.k(kg.EVENT_EXT_PARAMS_ASYNC_MODULE, aVar.d);
            pi.b(this.b, aVar.f16005a, qiVar);
            aVar.b.set(1);
        }
    }

    public final void f(String str) {
        MessageQueue messageQueue;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3aa9742b", new Object[]{this, str});
            return;
        }
        try {
            messageQueue = Looper.myQueue();
        } catch (Exception e) {
            ck.g().b("AURAAsyncModuleManager", "innerTriggerAsyncModuleIdle", e.toString());
            messageQueue = null;
        }
        if (messageQueue == null) {
            e(str);
        } else {
            messageQueue.addIdleHandler(new a(str));
        }
    }
}

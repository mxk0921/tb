package tb;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.appcompat.taobao.util.Globals;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.lifecycle.PanguApplication;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class aak {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final AtomicBoolean f15625a;
    public c b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements PanguApplication.CrossActivityLifecycleCallback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.taobao.android.lifecycle.PanguApplication.CrossActivityLifecycleCallback
        public void onCreated(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5f00e362", new Object[]{this, activity});
            }
        }

        @Override // com.taobao.android.lifecycle.PanguApplication.CrossActivityLifecycleCallback
        public void onDestroyed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fc107b13", new Object[]{this, activity});
            }
        }

        @Override // com.taobao.android.lifecycle.PanguApplication.CrossActivityLifecycleCallback
        public void onStarted(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4b167bb", new Object[]{this, activity});
            } else if (aak.a(aak.this).compareAndSet(true, false)) {
                aak.this.e(true);
                if (aak.b(aak.this) != null) {
                    aak.b(aak.this).a();
                }
            }
        }

        @Override // com.taobao.android.lifecycle.PanguApplication.CrossActivityLifecycleCallback
        public void onStopped(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("82d37207", new Object[]{this, activity});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b {
        public static final aak helper = new aak(null);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface c {
        void a();
    }

    public /* synthetic */ aak(a aVar) {
        this();
    }

    public static /* synthetic */ AtomicBoolean a(aak aakVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicBoolean) ipChange.ipc$dispatch("4ca8b805", new Object[]{aakVar});
        }
        return aakVar.f15625a;
    }

    public static /* synthetic */ c b(aak aakVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("e4f25c7", new Object[]{aakVar});
        }
        return aakVar.b;
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddc98040", new Object[]{this});
            return;
        }
        c cVar = this.b;
        if (cVar != null) {
            cVar.a();
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e509dcf9", new Object[]{this});
        } else {
            e(false);
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be2adbb7", new Object[]{this});
        } else {
            this.f15625a.getAndSet(true);
        }
    }

    public void g(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee56e7a", new Object[]{this, context});
        } else if (context instanceof PanguApplication) {
            ((PanguApplication) context).registerCrossActivityLifecycleCallback(new a());
        }
    }

    public void h(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c93ff9", new Object[]{this, cVar});
        } else {
            this.b = cVar;
        }
    }

    public aak() {
        this.f15625a = new AtomicBoolean(false);
    }

    public void e(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc3274fb", new Object[]{this, new Boolean(z)});
            return;
        }
        Intent intent = new Intent();
        intent.setAction("taobao.action.ACTION_REVISION_SWITCH_CHANGE");
        if (z) {
            intent.putExtra("isLazy", true);
        }
        LocalBroadcastManager.getInstance(Globals.getApplication()).sendBroadcast(intent);
    }
}

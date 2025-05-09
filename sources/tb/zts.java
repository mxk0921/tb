package tb;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.lifecycle.PanguApplication;
import com.taobao.tao.Globals;
import com.taobao.tao.TaoApplication;
import com.taobao.tao.util.GetAppKeyFromSecurity;
import java.util.ArrayList;
import java.util.List;
import tb.hgb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class zts implements ghb {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String c = zts.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    public final List<hgb.a> f33012a = new ArrayList();
    public final PanguApplication.CrossActivityLifecycleCallback b = new a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements PanguApplication.CrossActivityLifecycleCallback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.taobao.android.lifecycle.PanguApplication.CrossActivityLifecycleCallback
        public void onCreated(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5f00e362", new Object[]{this, activity});
            } else {
                zts.c();
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
                return;
            }
            for (hgb.a aVar : zts.d(zts.this)) {
                if (aVar != null) {
                    aVar.onAppInForeground();
                }
            }
        }

        @Override // com.taobao.android.lifecycle.PanguApplication.CrossActivityLifecycleCallback
        public void onStopped(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("82d37207", new Object[]{this, activity});
                return;
            }
            for (hgb.a aVar : zts.d(zts.this)) {
                if (aVar != null) {
                    aVar.onAppInBackgroud();
                }
            }
        }
    }

    static {
        t2o.a(779092306);
        t2o.a(806355906);
    }

    public static /* synthetic */ String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7022ea09", new Object[0]);
        }
        return c;
    }

    public static /* synthetic */ List d(zts ztsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("eedf8433", new Object[]{ztsVar});
        }
        return ztsVar.f33012a;
    }

    @Override // tb.ghb
    public void a(hgb.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24f1ccdf", new Object[]{this, aVar});
        } else if (aVar != null) {
            if (((ArrayList) this.f33012a).isEmpty()) {
                ((PanguApplication) Globals.getApplication()).registerCrossActivityLifecycleCallback(this.b);
            }
            if (!((ArrayList) this.f33012a).contains(aVar)) {
                ((ArrayList) this.f33012a).add(aVar);
            }
        }
    }

    @Override // tb.ghb
    public void b(hgb.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4cc3ce26", new Object[]{this, aVar});
        } else if (aVar != null) {
            ((ArrayList) this.f33012a).remove(aVar);
            if (((ArrayList) this.f33012a).isEmpty()) {
                ((PanguApplication) Globals.getApplication()).unregisterCrossActivityLifecycleCallback(this.b);
            }
        }
    }

    @Override // tb.ghb
    public String getAppKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("49079005", new Object[]{this});
        }
        return GetAppKeyFromSecurity.getAppKey(0);
    }

    @Override // tb.ghb
    public String getAppName(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b8e75335", new Object[]{this, context});
        }
        return "taobao";
    }

    @Override // tb.ghb
    public Application getApplication() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Application) ipChange.ipc$dispatch("5749e470", new Object[]{this});
        }
        return Globals.getApplication();
    }

    @Override // tb.ghb
    public String getTTID() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2e0d7a8", new Object[]{this});
        }
        return TaoApplication.getTTID();
    }
}

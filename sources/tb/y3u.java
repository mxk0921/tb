package tb;

import android.os.Handler;
import android.os.Looper;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;
import com.taobao.android.ugc.h5.WVMicorPublishPlugin;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.search.musie.MUSXSearchEventModule;
import com.taobao.search.sf.BaseResultActivity;
import tb.f64;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class y3u implements cnx, npc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final BaseResultActivity f31833a;
    public com.taobao.android.weex_framework.a b;
    public final ViewGroup c;
    public boolean d = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* renamed from: tb.y3u$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class RunnableC1105a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ JSONObject f31835a;

            public RunnableC1105a(JSONObject jSONObject) {
                this.f31835a = jSONObject;
            }

            @Override // java.lang.Runnable
            public void run() {
                JSONObject jSONObject;
                JSONObject jSONObject2;
                JSONObject jSONObject3;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else if (!y3u.b(y3u.this) && (jSONObject = this.f31835a.getJSONObject("params")) != null && (jSONObject2 = jSONObject.getJSONObject("topHeader")) != null && (jSONObject3 = jSONObject2.getJSONObject("template")) != null) {
                    y3u y3uVar = y3u.this;
                    y3u.d(y3uVar, anx.a(y3u.a(y3uVar), y3u.this, null));
                    y3u.c(y3u.this).registerRenderListener(y3u.this);
                    String string = jSONObject3.getString(WVMicorPublishPlugin.TEMPLATE_URL);
                    y3u.e(y3u.this).getLayoutParams().height = k8x.c(jSONObject3.getString("listHeight"));
                    JSONObject jSONObject4 = jSONObject2.getJSONObject("info");
                    JSONObject jSONObject5 = new JSONObject();
                    jSONObject5.put("model", (Object) jSONObject4);
                    axh.a(y3u.c(y3u.this), string, string, jSONObject5, null);
                    y3u.e(y3u.this).addView(y3u.c(y3u.this).getRenderRoot(), new ViewGroup.LayoutParams(-1, -2));
                }
            }
        }

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            JSONObject navigationInfo = MUSXSearchEventModule.getNavigationInfo(y3u.a(y3u.this));
            if (navigationInfo != null) {
                new Handler(Looper.getMainLooper()).post(new RunnableC1105a(navigationInfo));
            }
        }
    }

    static {
        t2o.a(815793382);
        t2o.a(993002201);
        t2o.a(982515990);
    }

    public y3u(ViewGroup viewGroup, BaseResultActivity baseResultActivity) {
        this.f31833a = baseResultActivity;
        this.c = viewGroup;
    }

    public static /* synthetic */ BaseResultActivity a(y3u y3uVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseResultActivity) ipChange.ipc$dispatch("cc3943ac", new Object[]{y3uVar});
        }
        return y3uVar.f31833a;
    }

    public static /* synthetic */ boolean b(y3u y3uVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56a8fec5", new Object[]{y3uVar})).booleanValue();
        }
        return y3uVar.d;
    }

    public static /* synthetic */ com.taobao.android.weex_framework.a c(y3u y3uVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.weex_framework.a) ipChange.ipc$dispatch("c99fc9cf", new Object[]{y3uVar});
        }
        return y3uVar.b;
    }

    public static /* synthetic */ com.taobao.android.weex_framework.a d(y3u y3uVar, com.taobao.android.weex_framework.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.weex_framework.a) ipChange.ipc$dispatch("86750c66", new Object[]{y3uVar, aVar});
        }
        y3uVar.b = aVar;
        return aVar;
    }

    public static /* synthetic */ ViewGroup e(y3u y3uVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("50970af2", new Object[]{y3uVar});
        }
        return y3uVar.c;
    }

    @Override // tb.cnx
    public boolean K(String str, JSONObject jSONObject, f64.a aVar, f64.a aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1f36856c", new Object[]{this, str, jSONObject, aVar, aVar2})).booleanValue();
        }
        return false;
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        this.d = true;
        com.taobao.android.weex_framework.a aVar = this.b;
        if (aVar != null) {
            aVar.destroy();
        }
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("471a0b1d", new Object[]{this});
        } else if (this.c != null) {
            Coordinator.execute(new a());
        }
    }

    @Override // tb.cnx
    public boolean m2(String str, JSONObject jSONObject, f64.a aVar, f64.a aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9ac25dbb", new Object[]{this, str, jSONObject, aVar, aVar2})).booleanValue();
        }
        this.f31833a.onEventMainThread(f64.a(str, jSONObject, aVar, aVar2));
        return true;
    }

    @Override // tb.npc
    public void onDestroyed(MUSDKInstance mUSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32f7f995", new Object[]{this, mUSDKInstance});
        }
    }

    @Override // tb.npc
    public void onJSException(com.taobao.android.weex_framework.a aVar, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c41b6de", new Object[]{this, aVar, new Integer(i), str});
        }
    }

    @Override // tb.npc
    public void onPrepareSuccess(com.taobao.android.weex_framework.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27a2635b", new Object[]{this, aVar});
        }
    }

    @Override // tb.npc
    public void onRefreshFailed(com.taobao.android.weex_framework.a aVar, int i, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc0861e4", new Object[]{this, aVar, new Integer(i), str, new Boolean(z)});
        }
    }

    @Override // tb.npc
    public void onRefreshSuccess(com.taobao.android.weex_framework.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("963c382f", new Object[]{this, aVar});
        }
    }

    @Override // tb.npc
    public void onRenderFailed(com.taobao.android.weex_framework.a aVar, int i, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc0cbe2b", new Object[]{this, aVar, new Integer(i), str, new Boolean(z)});
            return;
        }
        this.c.getLayoutParams().height = 0;
        this.c.setVisibility(4);
    }

    @Override // tb.npc
    public void onRenderSuccess(com.taobao.android.weex_framework.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b2aeb48", new Object[]{this, aVar});
            return;
        }
        this.c.getLayoutParams().height = -2;
        this.c.requestLayout();
    }
}

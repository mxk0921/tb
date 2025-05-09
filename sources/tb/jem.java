package tb;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.poplayer.trigger.BaseConfigItem;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class jem {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public ufu f21958a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final jem f21959a = new jem();

        static {
            t2o.a(626000018);
        }

        public static /* synthetic */ jem a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (jem) ipChange.ipc$dispatch("6274483", new Object[0]);
            }
            return f21959a;
        }
    }

    static {
        t2o.a(626000016);
    }

    public static jem d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jem) ipChange.ipc$dispatch("ef365e1f", new Object[0]);
        }
        return b.a();
    }

    public final /* synthetic */ void e(BaseConfigItem baseConfigItem, String str, String str2, JSONObject jSONObject, zad zadVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af1b8a63", new Object[]{this, baseConfigItem, str, str2, jSONObject, zadVar});
            return;
        }
        try {
            this.f21958a.c(baseConfigItem, str, str2, jSONObject, zadVar);
        } catch (Throwable th) {
            wdm.h("PopLayerNotifyTrigger.triggerSubPageSwitch.error", th);
        }
    }

    public final /* synthetic */ void f(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0f184d1", new Object[]{this, jSONObject});
            return;
        }
        try {
            this.f21958a.d(jSONObject.getString(ufu.KEY_URI_SET), jSONObject.getString(ufu.KEY_INDEX_MAP), jSONObject.getString(ufu.KEY_NO_ALG_FILTER_MAP), jSONObject.getJSONObject(ufu.KEY_TRACK_MAP), jSONObject.getString("traceId"), jSONObject.getLongValue(ufu.KEY_DEAL_START_TIME), jSONObject.getLongValue(ufu.KEY_DEAL_END_TIME), jSONObject.getLongValue(ufu.KEY_SDK_WAIT_TIME), false);
        } catch (Throwable th) {
            wdm.h("PopLayerNotifyTrigger.triggerPreDeal.error", th);
        }
    }

    public final /* synthetic */ void g(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cc2d3df", new Object[]{this, str, str2, new Boolean(z)});
            return;
        }
        try {
            this.f21958a.b(str, str2, "", z, false);
        } catch (Throwable th) {
            wdm.h("PopLayerNotifyTrigger.triggerSubPageSwitch.error", th);
        }
    }

    public void h(ufu ufuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54e7b279", new Object[]{this, ufuVar});
        } else {
            this.f21958a = ufuVar;
        }
    }

    public void i(final BaseConfigItem baseConfigItem, final String str, final String str2, final JSONObject jSONObject, final zad zadVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3cd72bb", new Object[]{this, baseConfigItem, str, str2, jSONObject, zadVar});
        } else if (baseConfigItem != null && this.f21958a != null) {
            hst.b(new Runnable() { // from class: tb.iem
                @Override // java.lang.Runnable
                public final void run() {
                    jem.this.e(baseConfigItem, str, str2, jSONObject, zadVar);
                }
            });
        }
    }

    public void j(final JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9412b0d2", new Object[]{this, jSONObject});
        } else if (jSONObject != null && this.f21958a != null) {
            hst.b(new Runnable() { // from class: tb.gem
                @Override // java.lang.Runnable
                public final void run() {
                    jem.this.f(jSONObject);
                }
            });
        }
    }

    public void k(final String str, final String str2, final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c941124e", new Object[]{this, str, str2, new Boolean(z)});
        } else if (this.f21958a != null) {
            hst.b(new Runnable() { // from class: tb.hem
                @Override // java.lang.Runnable
                public final void run() {
                    jem.this.g(str, str2, z);
                }
            });
        }
    }

    public jem() {
    }
}

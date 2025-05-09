package tb;

import android.content.Intent;
import android.net.Uri;
import androidx.core.app.NotificationCompat;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.turbo.core.service.page.IPageBackLifecycle;
import java.util.Map;
import tb.mnv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class dnl implements f6d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final String TAG = "PageInvoker";

    /* renamed from: a  reason: collision with root package name */
    public final qpu f17968a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        static {
            t2o.a(919601370);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(919601369);
        t2o.a(919601367);
    }

    public dnl(qpu qpuVar) {
        ckf.g(qpuVar, "context");
        this.f17968a = qpuVar;
    }

    @Override // tb.f6d
    public boolean a(boolean z) {
        IPageBackLifecycle.TriggerType triggerType;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4ae9ef8b", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        b7d b7dVar = (b7d) this.f17968a.getService(b7d.class);
        if (z) {
            triggerType = IPageBackLifecycle.TriggerType.SYSTEM;
        } else {
            triggerType = IPageBackLifecycle.TriggerType.BACK_BUTTON_CLICK;
        }
        return b7dVar.U0(triggerType);
    }

    @Override // tb.f6d
    public void b(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b497a2bd", new Object[]{this, new Long(j)});
        } else {
            ((pab) this.f17968a.getService(pab.class)).G0(j);
        }
    }

    @Override // tb.f6d
    public void c(Uri uri) {
        String str;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b627ed5", new Object[]{this, uri});
            return;
        }
        ckf.g(uri, NotificationCompat.MessagingStyle.Message.KEY_DATA_URI);
        mnv.a aVar = mnv.Companion;
        Map<String, String> e = aVar.e(uri);
        String uri2 = uri.toString();
        ckf.f(uri2, "uri.toString()");
        ((b7d) this.f17968a.getService(b7d.class)).w1(uri2, e);
        vmd vmdVar = (vmd) this.f17968a.getService(vmd.class);
        Map<String, String> e2 = aVar.e(uri);
        String str2 = null;
        if (e2 != null) {
            try {
                str = e2.get("extParams");
            } catch (Exception e3) {
                tpu.Companion.a(TAG, "parse extParams error " + uri, e3);
                jSONObject = null;
            }
        } else {
            str = null;
        }
        jSONObject = JSON.parseObject(str);
        if (e2 != null) {
            str2 = e2.get("tabid");
        }
        vmdVar.Z(new nuo(nuo.MSG_URL_REFRESH, str2, jSONObject, Integer.MAX_VALUE, e2));
    }

    @Override // tb.f6d
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
        } else {
            ((b7d) this.f17968a.getService(b7d.class)).onActivityResult(i, i2, intent);
        }
    }

    @Override // tb.f6d
    public void onRefresh() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9cbba83", new Object[]{this});
        } else {
            ((vmd) this.f17968a.getService(vmd.class)).Z(new nuo("forceRefresh", null, null, 0, null, 24, null));
        }
    }
}

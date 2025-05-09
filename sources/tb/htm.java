package tb;

import android.content.Intent;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.request.preload.PreloadTaskBroadcastReceiver;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class htm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final xrm f20892a = new xrm();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final htm f20893a = new htm();

        static {
            t2o.a(912262209);
        }

        public static /* synthetic */ htm a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (htm) ipChange.ipc$dispatch("939270e6", new Object[0]);
            }
            return f20893a;
        }
    }

    static {
        t2o.a(912262208);
    }

    public static htm a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (htm) ipChange.ipc$dispatch("552d402b", new Object[0]);
        }
        return a.a();
    }

    public final String b(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2cd40fb6", new Object[]{this, intent});
        }
        if (intent == null) {
            return String.valueOf(UUID.randomUUID().hashCode());
        }
        String stringExtra = intent.getStringExtra("detailRequestId");
        if (TextUtils.isEmpty(stringExtra)) {
            return String.valueOf(UUID.randomUUID().hashCode());
        }
        return stringExtra;
    }

    public void c(Intent intent) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1aa9b72a", new Object[]{this, intent});
            return;
        }
        String b = b(intent);
        List<wrm> d = this.f20892a.d(intent);
        if (d == null || d.size() <= 0) {
            str = "";
        } else {
            str = d.get(0).d;
        }
        String stringExtra = intent.getStringExtra(PreloadTaskBroadcastReceiver.START_PRELOAD_TASKS);
        if (nj7.a().f26769a == 1 || ((!"search".equals(str) && !"newDetail".equals(str)) || !vbl.T() || !xe7.c().booleanValue() || TextUtils.isEmpty(stringExtra))) {
            bkn.c(b).e(d, this.f20892a);
            tgh.b("PreloadTaskLoader", "批量预加载静态数据接口触发");
            return;
        }
        for (int i = 0; i < d.size(); i++) {
            wrm wrmVar = d.get(i);
            if (wrmVar != null) {
                JSONObject jSONObject = wrmVar.f30875a;
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                    wrmVar.f30875a = jSONObject;
                }
                jSONObject.put("footprint", (Object) "1");
                ArrayList arrayList = new ArrayList();
                arrayList.add(wrmVar);
                bkn.d(b, true).e(arrayList, this.f20892a);
            }
        }
        tgh.b("PreloadTaskLoader", "批量预加载动态主接口触发");
    }
}

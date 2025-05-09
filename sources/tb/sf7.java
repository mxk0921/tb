package tb;

import android.content.Intent;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.request.preload.PreloadTaskBroadcastReceiver;
import com.taobao.android.preload.core.task.PreloadTaskEntity;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class sf7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static Runnable f28007a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ kmb f28008a;

        /* compiled from: Taobao */
        /* renamed from: tb.sf7$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class RunnableC1052a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public RunnableC1052a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    List<List<JSONObject>> a2 = yn2.a(a.this.f28008a, 2);
                    JSONArray jSONArray = new JSONArray();
                    int e = vav.e(c9x.CART_BIZ_NAME, "maxPreloadCountForDetail", 3);
                    for (List<JSONObject> list : a2) {
                        for (JSONObject jSONObject : list) {
                            if (jSONObject != null) {
                                String string = jSONObject.getString("outerUrl");
                                if (!TextUtils.isEmpty(string)) {
                                    JSONObject jSONObject2 = new JSONObject();
                                    jSONObject2.put("url", (Object) string);
                                    jSONArray.add(jSONObject2);
                                    if (jSONArray.size() >= e) {
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    if (!jSONArray.isEmpty()) {
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("bizName", (Object) PreloadTaskEntity.PAGE_DETAIL);
                        jSONObject3.put(PreloadTaskEntity.SOURCE_FROM, (Object) "cart");
                        jSONObject3.put("items", (Object) jSONArray);
                        Intent intent = new Intent("com.taobao.android.detail.StartPreloadTasks");
                        intent.setPackage("com.taobao.taobao");
                        intent.putExtra(PreloadTaskBroadcastReceiver.START_PRELOAD_TASKS, jSONObject3.toJSONString());
                        FragmentActivity activity = a.this.f28008a.R().getActivity();
                        if (activity != null) {
                            activity.sendBroadcast(intent);
                            hav.d(c9x.CART_BIZ_NAME, "给详情发送预加载广播#商品数量=" + jSONArray.size());
                        }
                    }
                } catch (Exception e2) {
                    ub3.g("详情预加载报错", e2.getMessage());
                }
            }
        }

        public a(kmb kmbVar) {
            this.f28008a = kmbVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                pav.k(new RunnableC1052a());
            }
        }
    }

    static {
        t2o.a(478150837);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("745ee826", new Object[0]);
            return;
        }
        Runnable runnable = f28007a;
        if (runnable != null) {
            pav.f(runnable);
            f28007a = null;
        }
    }

    public static void b(kmb kmbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc28dcb", new Object[]{kmbVar});
        } else if (vav.a(c9x.CART_BIZ_NAME, "enableDetailItemPreloader", true) && kmbVar != null && kmbVar.R() != null) {
            a();
            a aVar = new a(kmbVar);
            f28007a = aVar;
            pav.i(aVar, vav.e(c9x.CART_BIZ_NAME, "preloadVisibleItemForDetailDelayMills", 1000));
        }
    }
}

package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.preload.core.task.PreloadTaskEntity;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class gaj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final on8 f19832a = new on8();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f19833a;

        public a(String str) {
            this.f19833a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                gaj.a(gaj.this, this.f19833a, null);
            }
        }
    }

    public static /* synthetic */ void a(gaj gajVar, String str, ddt ddtVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe7fb4d1", new Object[]{gajVar, str, ddtVar});
        } else {
            gajVar.d(str, ddtVar);
        }
    }

    public ExecutorService b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecutorService) ipChange.ipc$dispatch("a68732d2", new Object[]{this});
        }
        return this.f19832a.a(1, 60, "Detail Preload Loader");
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6772aef7", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str)) {
            wsm.c(csm.a("MultiPreloadTaskLoader"), "params is null");
        } else {
            b().execute(new a(str));
        }
    }

    public final void d(String str, ddt ddtVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8de27c8", new Object[]{this, str, ddtVar});
            return;
        }
        try {
            JSONObject parseObject = JSON.parseObject(str);
            if (parseObject != null) {
                HashMap hashMap = new HashMap();
                JSONArray jSONArray = parseObject.getJSONArray("items");
                if (jSONArray != null) {
                    for (int i = 0; i < jSONArray.size(); i++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i);
                        if (jSONObject != null) {
                            String string = jSONObject.getString("bizName");
                            JSONArray jSONArray2 = (JSONArray) hashMap.get(string);
                            if (jSONArray2 == null) {
                                jSONArray2 = new JSONArray();
                                hashMap.put(string, jSONArray2);
                            }
                            jSONArray2.add(jSONObject);
                        }
                    }
                    for (Map.Entry entry : hashMap.entrySet()) {
                        ftm b = itm.b((String) entry.getKey());
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("items", entry.getValue());
                        jSONObject2.put(PreloadTaskEntity.SOURCE_FROM, (Object) parseObject.getString(PreloadTaskEntity.SOURCE_FROM));
                        jSONObject2.put("pageIndex", (Object) parseObject.getString("pageIndex"));
                        jSONObject2.put(PreloadTaskEntity.PAGE_TOKEN, (Object) parseObject.getString(PreloadTaskEntity.PAGE_TOKEN));
                        b.l(jSONObject2, ddtVar);
                    }
                }
            }
        } catch (Exception e) {
            wsm.b(csm.a("MultiPreloadTaskLoader"), "预加载批量接口任务执行失败", e);
        }
    }
}

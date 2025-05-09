package tb;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.request.preload.PreloadTaskBroadcastReceiver;
import com.taobao.android.preload.core.task.PreloadTaskEntity;
import com.taobao.android.purchase.preload.TBBuyPreloadScene;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class xrm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Deque<wrm> f31555a = new ArrayDeque();

    static {
        t2o.a(912262203);
    }

    public synchronized void a(wrm wrmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66342969", new Object[]{this, wrmVar});
            return;
        }
        if (((ArrayDeque) this.f31555a).contains(wrmVar)) {
            ((ArrayDeque) this.f31555a).remove(wrmVar);
        }
        ((ArrayDeque) this.f31555a).push(wrmVar);
    }

    public final List<wrm> b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("9f2e7be8", new Object[]{this, str});
        }
        ArrayList arrayList = new ArrayList();
        JSONObject parseObject = JSON.parseObject(str);
        if (parseObject == null) {
            return arrayList;
        }
        String string = parseObject.getString(PreloadTaskEntity.SOURCE_FROM);
        if (TextUtils.isEmpty(string) || !vbl.K0().contains(string)) {
            return arrayList;
        }
        String string2 = parseObject.getString("bizName");
        JSONArray jSONArray = parseObject.getJSONArray("items");
        tgh.b("PreloadItemManager", "批量预加载sourceFrom=" + string + ", items=" + jSONArray.size());
        Iterator<Object> it = jSONArray.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) next;
                wrm b = wrm.b(jSONObject);
                JSONObject jSONObject2 = b.f30875a;
                if (TextUtils.isEmpty(jSONObject2.getString("from"))) {
                    jSONObject2.put("from", (Object) (TextUtils.isEmpty(string) ? "unKnow" : string));
                }
                if (!TextUtils.isEmpty(string2)) {
                    jSONObject2.put("bizName", (Object) string2);
                }
                jSONObject2.put(s0j.MTS_TAG_PRELOAD_TYPE, (Object) "batch");
                b.c = jSONObject2.getString(s0j.MTS_TAG_PRELOAD_TYPE);
                b.d = jSONObject2.getString("from");
                String string3 = jSONObject.getString("itemId");
                if (!TextUtils.isEmpty(string3)) {
                    b.b = string3;
                }
                tgh.b("PreloadItemManager", "批量预加载itemId=" + b.b);
                arrayList.add(b);
            }
        }
        return arrayList;
    }

    public List<wrm> d(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("9188049e", new Object[]{this, intent});
        }
        if (intent == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        String stringExtra = intent.getStringExtra(PreloadTaskBroadcastReceiver.START_PRELOAD_TASKS);
        if (!TextUtils.isEmpty(stringExtra)) {
            arrayList.addAll(b(stringExtra));
        } else {
            arrayList.add(c(intent));
        }
        return arrayList;
    }

    public synchronized List<wrm> e() {
        synchronized (this) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("26c7b71c", new Object[]{this});
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; !((ArrayDeque) this.f31555a).isEmpty() && i < 5; i++) {
                arrayList.add(((ArrayDeque) this.f31555a).pop());
            }
            return arrayList;
        }
    }

    public synchronized List<wrm> f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("cc753a72", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        if (!((ArrayDeque) this.f31555a).isEmpty()) {
            arrayList.add(((ArrayDeque) this.f31555a).pop());
        }
        return arrayList;
    }

    public final String g(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1bcee31b", new Object[]{this, uri});
        }
        if (uri == null) {
            return "unKnow";
        }
        String queryParameter = uri.getQueryParameter("from");
        return TextUtils.isEmpty(queryParameter) ? "unKnow" : queryParameter;
    }

    public final wrm c(Intent intent) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wrm) ipChange.ipc$dispatch("cbb954", new Object[]{this, intent});
        }
        Uri data = intent.getData();
        String f = mff.f(intent);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("bizName", (Object) PreloadTaskEntity.PAGE_DETAIL);
        String g = g(data);
        jSONObject.put("from", (Object) g);
        jSONObject.put(s0j.MTS_TAG_PRELOAD_TYPE, (Object) TBBuyPreloadScene.NAV);
        jSONObject.put("id", (Object) f);
        jSONObject.putAll(jov.g(data));
        wrm wrmVar = new wrm();
        wrmVar.b = f;
        wrmVar.c = TBBuyPreloadScene.NAV;
        wrmVar.f30875a = jSONObject;
        wrmVar.d = g;
        if (data == null || !ybf.b(data)) {
            z = false;
        }
        wrmVar.e = z;
        wrmVar.f = intent.getStringExtra("detailRequestId");
        return wrmVar;
    }
}

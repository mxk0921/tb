package tb;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.data.converter.DetailV3Converter;
import com.taobao.android.detail.ttdetail.data.meta.MappingKey;
import com.taobao.android.detail.ttdetail.data.meta.Merged;
import com.taobao.android.detail.ttdetail.feature.DevFeature;
import com.taobao.android.detail.ttdetail.request.MtopInfo;
import com.taobao.android.detail.ttdetail.utils.DataUtils;
import com.taobao.android.detail.ttdetail.utils.DynamicMergeUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantLock;
import mtopsdk.mtop.domain.MtopResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class bq6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ze7 f16548a;
    public JSONObject b;
    public final List<ctd> f;
    public volatile MtopInfo g;
    public final Map<String, Object> c = new HashMap(0);
    public final Map<String, pr6> d = new HashMap(0);
    public final Map<String, Merged> e = new HashMap();
    public final ReentrantLock h = new ReentrantLock();
    public final Map<String, Object> i = new HashMap(2);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f16549a;
        public final /* synthetic */ JSONObject b;
        public final /* synthetic */ MtopInfo c;

        public a(boolean z, JSONObject jSONObject, MtopInfo mtopInfo) {
            this.f16549a = z;
            this.b = jSONObject;
            this.c = mtopInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            if (this.f16549a) {
                bq6.a(bq6.this, this.b);
            }
            bq6.b(bq6.this, this.c);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f16550a;
        public final /* synthetic */ MtopResponse b;

        public b(boolean z, MtopResponse mtopResponse) {
            this.f16550a = z;
            this.b = mtopResponse;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            int size = bq6.c(bq6.this).size();
            for (int i = 0; i < size; i++) {
                ctd ctdVar = (ctd) bq6.c(bq6.this).get(i);
                if (ctdVar != null) {
                    if (this.f16550a) {
                        JSONObject originFastJsonObject = this.b.getOriginFastJsonObject();
                        if (originFastJsonObject == null && this.b.getBytedata() != null) {
                            originFastJsonObject = JSON.parseObject(new String(this.b.getBytedata()));
                        }
                        ctdVar.onSuccess(originFastJsonObject);
                    } else {
                        ctdVar.onFailure(this.b.getRetCode(), this.b.getRetMsg());
                    }
                }
            }
            bq6.c(bq6.this).clear();
        }
    }

    static {
        t2o.a(912261529);
    }

    public bq6(Context context, ze7 ze7Var) {
        this.f = Collections.synchronizedList(new ArrayList());
        this.f16548a = ze7Var;
        if (vbl.p1()) {
            this.f = new CopyOnWriteArrayList();
        }
    }

    public static /* synthetic */ JSONObject a(bq6 bq6Var, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("76bd74a6", new Object[]{bq6Var, jSONObject});
        }
        bq6Var.b = jSONObject;
        return jSONObject;
    }

    public static /* synthetic */ void b(bq6 bq6Var, MtopInfo mtopInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f88ee8f", new Object[]{bq6Var, mtopInfo});
        } else {
            bq6Var.l(mtopInfo);
        }
    }

    public static /* synthetic */ List c(bq6 bq6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("1c461add", new Object[]{bq6Var});
        }
        return bq6Var.f;
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        ((HashMap) this.d).clear();
        ((HashMap) this.c).clear();
        ((HashMap) this.e).clear();
    }

    public <O> O e(String str) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (O) ipChange.ipc$dispatch("7c9327ba", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        O o = (O) ((HashMap) this.c).get(str);
        if (o != null) {
            return o;
        }
        pr6 pr6Var = (pr6) ((HashMap) this.d).get(str);
        if (pr6Var == null || (jSONObject = this.b) == null) {
            return null;
        }
        O o2 = (O) pr6Var.a(jSONObject);
        ((HashMap) this.c).put(str, o2);
        return o2;
    }

    public <M extends Merged> M f(Class<M> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (M) ((Merged) ipChange.ipc$dispatch("8c55ab17", new Object[]{this, cls}));
        }
        return (M) g(cls, true);
    }

    public <M extends Merged> M g(Class<M> cls, boolean z) {
        JSONObject h;
        JSONObject jSONObject;
        if (this.b == null || cls == null) {
            return null;
        }
        MappingKey mappingKey = (MappingKey) cls.getAnnotation(MappingKey.class);
        if (mappingKey == null) {
            tgh.b("DataEngine", "getMergedData failed for not MappingKey annotation, in class: " + cls);
            return null;
        }
        String key = mappingKey.key();
        if (TextUtils.isEmpty(key)) {
            tgh.b("DataEngine", "getMergedData failed with an empty MappingKey key(), in class: " + cls);
            return null;
        }
        JSONObject jSONObject2 = this.b.getJSONObject(key);
        if (!(jSONObject2 != null || (h = DynamicMergeUtils.h(this.b)) == null || (jSONObject = h.getJSONObject("meta")) == null)) {
            jSONObject2 = jSONObject.getJSONObject(key);
        }
        if (jSONObject2 == null) {
            tgh.b("DataEngine", "getMergedData failed with an empty mergedValue for key: '" + key + "', in class: " + cls);
            return null;
        }
        String p = p(key, cls);
        ReentrantLock reentrantLock = this.h;
        reentrantLock.lock();
        Map<String, Merged> map = this.e;
        if (z) {
            try {
                if (((HashMap) map).containsKey(p)) {
                    return (M) ((Merged) ((HashMap) map).get(p));
                }
            } finally {
                reentrantLock.unlock();
            }
        }
        M newInstance = cls.getConstructor(JSONObject.class).newInstance(jSONObject2);
        if (z) {
            ((HashMap) map).put(p, newInstance);
        }
        return newInstance;
    }

    public int h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7ab48898", new Object[]{this})).intValue();
        }
        if (this.g == null) {
            return 0;
        }
        return this.g.b();
    }

    public void i(ctd ctdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71b91f16", new Object[]{this, ctdVar});
        } else if (ctdVar != null) {
            if (a4o.k(this.g)) {
                MtopResponse a2 = this.g.a();
                JSONObject originFastJsonObject = a2.getOriginFastJsonObject();
                if (originFastJsonObject == null && a2.getBytedata() != null) {
                    originFastJsonObject = JSON.parseObject(new String(a2.getBytedata()));
                }
                ctdVar.onSuccess(originFastJsonObject);
                m(true, a2);
            } else if (a4o.i(this.g)) {
                MtopResponse a3 = this.g.a();
                ctdVar.onFailure(a3.getRetCode(), a3.getRetMsg());
                m(false, a3);
            } else {
                this.f.add(ctdVar);
            }
        }
    }

    public JSONObject j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("d6e8ffaa", new Object[]{this});
        }
        return this.b;
    }

    public <T> T k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("dfd26ad6", new Object[]{this, str});
        }
        if (str == null) {
            return null;
        }
        this.h.lock();
        try {
            return (T) ((HashMap) this.i).get(str);
        } finally {
            this.h.unlock();
        }
    }

    public final void l(MtopInfo mtopInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99381313", new Object[]{this, mtopInfo});
            return;
        }
        this.g = mtopInfo;
        if (mtopInfo != null) {
            MtopResponse a2 = mtopInfo.a();
            if (a4o.k(mtopInfo)) {
                m(true, a2);
            } else if (a4o.i(mtopInfo)) {
                m(false, a2);
            }
        }
    }

    public final void m(boolean z, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b869c68c", new Object[]{this, new Boolean(z), mtopResponse});
        } else if (!this.f.isEmpty()) {
            b bVar = new b(z, mtopResponse);
            if (Looper.myLooper() == Looper.getMainLooper()) {
                bVar.run();
            } else {
                this.f16548a.h().g(bVar);
            }
        }
    }

    public boolean n(ctd ctdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("abbc295b", new Object[]{this, ctdVar})).booleanValue();
        }
        if (ctdVar == null) {
            return false;
        }
        for (int size = this.f.size() - 1; size >= 0; size--) {
            if (ctdVar == this.f.get(size)) {
                return true;
            }
        }
        return false;
    }

    public final <M extends Merged> String p(String str, Class<M> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c4af320", new Object[]{this, str, cls});
        }
        return str + "-" + cls.hashCode();
    }

    public void q(String str, pr6 pr6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("721de831", new Object[]{this, str, pr6Var});
        } else if (!TextUtils.isEmpty(str) && pr6Var != null) {
            if (((pr6) ((HashMap) this.d).get(str)) != pr6Var) {
                ((HashMap) this.c).remove(str);
            }
            ((HashMap) this.d).put(str, pr6Var);
        }
    }

    public void r(ctd ctdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("562013ad", new Object[]{this, ctdVar});
        } else if (ctdVar != null) {
            for (int size = this.f.size() - 1; size >= 0; size--) {
                if (ctdVar == this.f.get(size)) {
                    this.f.remove(size);
                }
            }
        }
    }

    public void s(MtopInfo mtopInfo) {
        boolean z;
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72575c19", new Object[]{this, mtopInfo});
            return;
        }
        if (!epq.d(mtopInfo) || !a4o.k(mtopInfo) || !Boolean.FALSE.equals(DevFeature.mFeature.get(DevFeature.sInvokeStreamingFinish))) {
            z = false;
        } else {
            z = true;
        }
        JSONObject jSONObject = null;
        if (z) {
            JSONObject j = DynamicMergeUtils.j(w7j.a(mtopInfo));
            if (DetailV3Converter.B(j)) {
                jSONObject = DetailV3Converter.g(j);
            }
            if (jSONObject == null) {
                z2 = false;
            }
            z = z2;
        }
        af7.a(this.f16548a, new a(z, jSONObject, mtopInfo));
    }

    public void t(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b942411a", new Object[]{this, jSONObject});
            return;
        }
        if (this.b != jSONObject) {
            ((HashMap) this.c).clear();
            ((HashMap) this.e).clear();
            this.g = null;
        }
        this.b = jSONObject;
        this.f16548a.d().g(DataUtils.f(DynamicMergeUtils.h(jSONObject)));
    }

    public void u(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d875c4", new Object[]{this, str, obj});
        } else if (str != null) {
            this.h.lock();
            try {
                ((HashMap) this.i).put(str, obj);
            } finally {
                this.h.unlock();
            }
        }
    }

    public boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e44eb9d4", new Object[]{this})).booleanValue();
        }
        JSONObject jSONObject = this.b;
        if (jSONObject == null) {
            return false;
        }
        return jSONObject.getBooleanValue("preload");
    }
}

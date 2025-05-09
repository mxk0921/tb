package tb;

import android.text.TextUtils;
import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.edlp.mtop.MtopHelper;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.log.TLog;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import mtopsdk.mtop.domain.MtopRequest;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class gqs {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Map<String, gqs> g = new ConcurrentHashMap();

    /* renamed from: a  reason: collision with root package name */
    public JSONObject f20171a;
    public final String b;
    public final List<pp6<JSONObject>> c = new ArrayList();
    public boolean d = false;
    public boolean e = false;
    public uaq f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements pp6<JSONObject> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ drs f20172a;
        public final /* synthetic */ long b;

        public a(drs drsVar, long j) {
            this.f20172a = drsVar;
            this.b = j;
        }

        @Override // tb.pp6
        public void onComplete() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5cbffcbf", new Object[]{this});
            }
        }

        @Override // tb.pp6
        public void onError(String str, String str2, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b263e360", new Object[]{this, str, str2, obj});
                return;
            }
            gqs.b(gqs.this, false);
            if (gqs.e(gqs.this) != null) {
                for (pp6 pp6Var : gqs.e(gqs.this)) {
                    pp6Var.onError(str, str2, obj);
                }
                gqs.e(gqs.this).clear();
            }
        }

        /* renamed from: a */
        public void onData(JSONObject jSONObject) {
            JSONObject jSONObject2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8968ec0", new Object[]{this, jSONObject});
                return;
            }
            TLog.loge("tab3edlp", this.f20172a.c + " preloadData use time is  " + (System.currentTimeMillis() - this.b));
            gqs.a(gqs.this, jSONObject);
            gqs.b(gqs.this, false);
            if (!(jSONObject == null || (jSONObject2 = jSONObject.getJSONObject("data")) == null)) {
                gqs.c(gqs.this, jSONObject, jSONObject2.getJSONArray("imgJsonPath"));
            }
            if (gqs.d(gqs.this) != null) {
                gqs.d(gqs.this).m = System.currentTimeMillis();
                gqs.d(gqs.this).p = gqs.d(gqs.this).m;
            }
            if (gqs.e(gqs.this) != null) {
                for (pp6 pp6Var : gqs.e(gqs.this)) {
                    pp6Var.onData(jSONObject);
                    pp6Var.onComplete();
                }
                gqs.e(gqs.this).clear();
            }
            if (gqs.d(gqs.this) != null) {
                gqs.d(gqs.this).n = System.currentTimeMillis();
            }
        }
    }

    static {
        t2o.a(1032847385);
    }

    public gqs(String str) {
        this.b = str;
    }

    public static /* synthetic */ JSONObject a(gqs gqsVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("3d1e6dc2", new Object[]{gqsVar, jSONObject});
        }
        gqsVar.f20171a = jSONObject;
        return jSONObject;
    }

    public static /* synthetic */ boolean b(gqs gqsVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("77c4dfcb", new Object[]{gqsVar, new Boolean(z)})).booleanValue();
        }
        gqsVar.d = z;
        return z;
    }

    public static /* synthetic */ void c(gqs gqsVar, JSONObject jSONObject, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9454e34a", new Object[]{gqsVar, jSONObject, jSONArray});
        } else {
            gqsVar.j(jSONObject, jSONArray);
        }
    }

    public static /* synthetic */ uaq d(gqs gqsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uaq) ipChange.ipc$dispatch("dad876", new Object[]{gqsVar});
        }
        return gqsVar.f;
    }

    public static /* synthetic */ List e(gqs gqsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("ef4490fb", new Object[]{gqsVar});
        }
        return gqsVar.c;
    }

    public static gqs g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gqs) ipChange.ipc$dispatch("eec16233", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            TLog.loge("tab3edlp", " userId is null ");
            str = "default";
        }
        Map<String, gqs> map = g;
        gqs gqsVar = (gqs) ((ConcurrentHashMap) map).get(str);
        if (gqsVar == null) {
            synchronized (gqs.class) {
                if (gqsVar == null) {
                    try {
                        gqsVar = new gqs(str);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                ((ConcurrentHashMap) map).put(str, gqsVar);
            }
        }
        return gqsVar;
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        this.f20171a = null;
        this.d = false;
        this.e = false;
        ((ArrayList) this.c).clear();
    }

    public final void j(JSONObject jSONObject, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71c4b2df", new Object[]{this, jSONObject, jSONArray});
        } else {
            uto.a().execute(new b(jSONObject, jSONArray));
        }
    }

    public void k(uaq uaqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c1815e6", new Object[]{this, uaqVar});
        } else {
            this.f = uaqVar;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ JSONObject f20173a;
        public final /* synthetic */ JSONArray b;

        public b(JSONObject jSONObject, JSONArray jSONArray) {
            this.f20173a = jSONObject;
            this.b = jSONArray;
        }

        @Override // java.lang.Runnable
        public void run() {
            String str;
            Object a2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (!"1".equals(OrangeConfig.getInstance().getConfig("edlp_business_switch", "closePreloadTabImage", "0")) && this.f20173a != null && this.b != null) {
                for (int i = 0; i < this.b.size(); i++) {
                    JSONObject jSONObject = this.b.getJSONObject(i);
                    String string = jSONObject.getString("keyPath");
                    String string2 = jSONObject.getString("height");
                    String string3 = jSONObject.getString("width");
                    if (TextUtils.isEmpty(string2) || TextUtils.isEmpty(string3)) {
                        str = "_760x760q90.jpg_.webp";
                    } else {
                        str = "_" + string3 + "x" + string2 + "q90.jpg_.webp";
                    }
                    try {
                        if (iwf.a(this.f20173a, string) instanceof String) {
                            String str2 = ((String) a2) + str;
                            if (!TextUtils.isEmpty(str2) && !str2.startsWith("https") && !str2.startsWith("http")) {
                                str2 = uyv.HTTPS_SCHEMA + str2;
                            }
                            TLog.loge("tab3edlp", "preloadImage " + str2);
                            s0m.B().T(str2).releasableDrawable(true).fetch();
                        }
                    } catch (Throwable th) {
                        th.printStackTrace();
                        TLog.loge("tab3edlp", "error is " + Log.getStackTraceString(th));
                    }
                }
            }
        }
    }

    public void h(pp6<JSONObject> pp6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7414f16a", new Object[]{this, pp6Var});
            return;
        }
        this.f.l = System.currentTimeMillis();
        TLog.loge("tab3edlp", "loadData|" + this.b);
        if (this.f20171a != null) {
            this.e = true;
            uaq uaqVar = this.f;
            uaqVar.v = true;
            uaqVar.m = System.currentTimeMillis();
            pp6Var.onData(this.f20171a);
            pp6Var.onComplete();
            this.f.n = System.currentTimeMillis();
            this.f20171a = null;
            TLog.loge("tab3edlp", "loadData from cache|" + this.b);
        } else if (!this.e) {
            if (this.d) {
                if (!((ArrayList) this.c).contains(pp6Var)) {
                    ((ArrayList) this.c).add(pp6Var);
                }
                TLog.loge("EDLPChannelDataLoad", " isRequesting ");
                return;
            }
            TLog.loge("EDLPChannelDataLoad", " isRequesting false  empty");
            pp6Var.onData(new JSONObject());
            pp6Var.onComplete();
        }
    }

    public void i(String str, drs drsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d46dcb9", new Object[]{this, str, drsVar});
        } else if (drsVar != null && !TextUtils.isEmpty(drsVar.c) && this.f20171a == null && !this.e) {
            long currentTimeMillis = System.currentTimeMillis();
            uaq uaqVar = this.f;
            if (uaqVar != null) {
                uaqVar.o = currentTimeMillis;
            }
            TLog.loge("tab3edlp", "preloadData|" + this.b + "|" + str + "｜" + drsVar.c);
            this.d = true;
            MtopRequest mtopRequest = new MtopRequest();
            mtopRequest.setApiName(drsVar.c);
            mtopRequest.setVersion(drsVar.d);
            JSONObject parseObject = JSON.parseObject(drsVar.e);
            if (!TextUtils.isEmpty(str)) {
                parseObject.putAll(JSON.parseObject(str));
            }
            mtopRequest.setData(JSON.toJSONString((Object) parseObject, false));
            mtopRequest.setNeedEcode(true);
            mtopRequest.setNeedSession(true);
            hgh.e("EDLPChannelDataLoad", "preloadData｜" + drsVar.toString() + "｜" + parseObject);
            MtopHelper.a(mtopRequest, new a(drsVar, currentTimeMillis));
        }
    }
}

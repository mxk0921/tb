package tb;

import android.text.TextUtils;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.utils.UltronTradeHybridSwitcherHelper;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXEngineConfig;
import com.taobao.android.dinamicx.s;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Ref$BooleanRef;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class gbv implements t5e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final String PARAM_KEY_DELAYED_DX_DOWNLOAD_LIST = "delayedDXDownloadList";
    public static final String PARAM_KEY_DX_ENGINE = "dxEngine";
    public static final String PARAM_KEY_IMMEDIATE_DX_DOWNLOAD_LIST = "immediateDXDownloadList";

    /* renamed from: a  reason: collision with root package name */
    public final HashSet<String> f19876a = new HashSet<>();
    public final cbv b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class a {
        static {
            t2o.a(157286829);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Ltb/xhv;", "run", "()V", "com/alibaba/android/ultron/vfw/weex2/highPerformance/management/UltronTradeHybridDXPreDownloadManager$dispatchStage$1$1", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ hbv f19877a;
        public final /* synthetic */ gbv b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;
        public final /* synthetic */ JSONObject e;

        public b(hbv hbvVar, gbv gbvVar, String str, String str2, JSONObject jSONObject) {
            this.f19877a = hbvVar;
            this.b = gbvVar;
            this.c = str;
            this.d = str2;
            this.e = jSONObject;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                gbv.c(this.b, this.d, this.e, this.f19877a);
            }
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Ref$BooleanRef b;
        public final /* synthetic */ JSONArray c;
        public final /* synthetic */ s d;

        public c(Ref$BooleanRef ref$BooleanRef, JSONArray jSONArray, s sVar) {
            this.b = ref$BooleanRef;
            this.c = jSONArray;
            this.d = sVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.b.element = gbv.b(gbv.this, this.c, this.d);
            }
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Ref$BooleanRef b;
        public final /* synthetic */ JSONArray c;
        public final /* synthetic */ s d;

        public d(Ref$BooleanRef ref$BooleanRef, JSONArray jSONArray, s sVar) {
            this.b = ref$BooleanRef;
            this.c = jSONArray;
            this.d = sVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.b.element = gbv.b(gbv.this, this.c, this.d);
            }
        }
    }

    static {
        t2o.a(157286828);
        t2o.a(157286824);
        t2o.a(157286825);
    }

    public gbv(cbv cbvVar) {
        this.b = cbvVar;
    }

    public static final /* synthetic */ boolean b(gbv gbvVar, JSONArray jSONArray, s sVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("556dd64f", new Object[]{gbvVar, jSONArray, sVar})).booleanValue();
        }
        return gbvVar.f(jSONArray, sVar);
    }

    public static final /* synthetic */ void c(gbv gbvVar, String str, JSONObject jSONObject, hbv hbvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af03242c", new Object[]{gbvVar, str, jSONObject, hbvVar});
        } else {
            gbvVar.g(str, jSONObject, hbvVar);
        }
    }

    @Override // tb.t5e
    public void a(String str, String str2, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb77c2b6", new Object[]{this, str, str2, jSONObject});
            return;
        }
        ckf.g(str, v4s.PARAM_UPLOAD_STAGE);
        ckf.g(str2, "sceneName");
        e(str, str2, k(jSONObject));
    }

    public final DXTemplateItem d(JSONObject jSONObject) {
        String string;
        String string2;
        Long o;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXTemplateItem) ipChange.ipc$dispatch("1afee352", new Object[]{this, jSONObject});
        }
        if (jSONObject == null || (string = jSONObject.getString("name")) == null || (string2 = jSONObject.getString("version")) == null || (o = ssq.o(string2)) == null) {
            return null;
        }
        long longValue = o.longValue();
        String string3 = jSONObject.getString("url");
        if (string3 == null) {
            return null;
        }
        DXTemplateItem dXTemplateItem = new DXTemplateItem();
        dXTemplateItem.f7343a = string;
        dXTemplateItem.b = longValue;
        dXTemplateItem.c = string3;
        return dXTemplateItem;
    }

    public final void e(String str, String str2, JSONObject jSONObject) {
        hcv c2;
        List<hbv> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("122b7611", new Object[]{this, str, str2, jSONObject});
            return;
        }
        cbv cbvVar = this.b;
        if (!(cbvVar == null || (c2 = cbvVar.c(str2)) == null || (list = c2.f) == null || list.isEmpty())) {
            for (hbv hbvVar : list) {
                if (hbvVar != null) {
                    if (!TextUtils.equals(str, hbvVar.c())) {
                        hav.g("UltronTradeHybridDXPreDownloadManager", "dispatchStage:", str2 + '-' + hbvVar.a() + '-' + str + " stage not match");
                    } else if (!j(str2, hbvVar.a())) {
                        hav.g("UltronTradeHybridDXPreDownloadManager", "dispatchStage:", str2 + '-' + hbvVar.a() + " switcher is off");
                    } else if (!hbvVar.d() || this.f19876a.isEmpty() || !this.f19876a.contains(str2)) {
                        pav.k(new b(hbvVar, this, str, str2, jSONObject));
                    } else {
                        hav.g("UltronTradeHybridDXPreDownloadManager", "dispatchStage:", str2 + " has downloaded");
                    }
                }
            }
        }
    }

    public final boolean f(JSONArray jSONArray, s sVar) {
        DXTemplateItem d2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c34edce3", new Object[]{this, jSONArray, sVar})).booleanValue();
        }
        if (jSONArray != null && !jSONArray.isEmpty()) {
            try {
                ArrayList arrayList = new ArrayList();
                Iterator<Object> it = jSONArray.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if ((next instanceof JSONObject) && (d2 = d((JSONObject) next)) != null) {
                        arrayList.add(d2);
                    }
                }
                sVar.h(arrayList);
                return true;
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return false;
    }

    public final void g(String str, JSONObject jSONObject, hbv hbvVar) {
        s sVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7e4c826", new Object[]{this, str, jSONObject, hbvVar});
            return;
        }
        if ((jSONObject != null ? jSONObject.get(PARAM_KEY_DX_ENGINE) : null) instanceof s) {
            Object obj = jSONObject.get(PARAM_KEY_DX_ENGINE);
            if (obj != null) {
                sVar = (s) obj;
            } else {
                throw new NullPointerException("null cannot be cast to non-null type com.taobao.android.dinamicx.DinamicXEngineRouter");
            }
        } else {
            sVar = new s(new DXEngineConfig.b(hbvVar.a()).F());
        }
        if (h(str, sVar, hbvVar)) {
            this.f19876a.add(str);
        } else if (i(jSONObject, sVar, hbvVar)) {
            this.f19876a.add(str);
        } else {
            hav.g("UltronTradeHybridDXPreDownloadManager", "downloadTemplates:", "skip download templates");
        }
    }

    public final boolean h(String str, s sVar, hbv hbvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3c1dc12b", new Object[]{this, str, sVar, hbvVar})).booleanValue();
        }
        String p = UltronTradeHybridSwitcherHelper.p(str);
        if (p.length() == 0) {
            return false;
        }
        Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        ref$BooleanRef.element = false;
        try {
            JSONArray parseArray = JSON.parseArray(v9v.g(p, PARAM_KEY_IMMEDIATE_DX_DOWNLOAD_LIST, ""));
            if (parseArray != null && (!parseArray.isEmpty())) {
                ref$BooleanRef.element = f(parseArray, sVar);
            }
            JSONArray parseArray2 = JSON.parseArray(v9v.g(p, PARAM_KEY_DELAYED_DX_DOWNLOAD_LIST, ""));
            if (parseArray2 != null && (!parseArray2.isEmpty())) {
                pav.i(new c(ref$BooleanRef, parseArray2, sVar), hbvVar.b());
                ref$BooleanRef.element = true;
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return ref$BooleanRef.element;
    }

    public final boolean i(JSONObject jSONObject, s sVar, hbv hbvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a6e0729f", new Object[]{this, jSONObject, sVar, hbvVar})).booleanValue();
        }
        if (jSONObject == null) {
            return false;
        }
        Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        ref$BooleanRef.element = false;
        try {
            JSONArray jSONArray = jSONObject.getJSONArray(PARAM_KEY_IMMEDIATE_DX_DOWNLOAD_LIST);
            if (jSONArray != null && (!jSONArray.isEmpty())) {
                ref$BooleanRef.element = f(jSONArray, sVar);
            }
            JSONArray jSONArray2 = jSONObject.getJSONArray(PARAM_KEY_DELAYED_DX_DOWNLOAD_LIST);
            if (jSONArray2 != null && (!jSONArray2.isEmpty())) {
                pav.i(new d(ref$BooleanRef, jSONArray2, sVar), hbvVar.b());
                ref$BooleanRef.element = true;
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return ref$BooleanRef.element;
    }

    public boolean j(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4a25e695", new Object[]{this, str, str2})).booleanValue();
        }
        ckf.g(str, "sceneName");
        return UltronTradeHybridSwitcherHelper.b(str, str2);
    }

    public JSONObject k(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("367da879", new Object[]{this, jSONObject});
        }
        return jSONObject;
    }
}

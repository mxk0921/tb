package com.taobao.android.litecreator.comprehension;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dressup.common.component.mediabrowser.AnchorViews;
import com.taobao.android.litecreator.comprehension.mtop.ComprehensionMTopRequest;
import com.taobao.android.litecreator.comprehension.mtop.RecognizeVideoMusicMTopRequest;
import com.taobao.tao.Globals;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.intf.Mtop;
import tb.bq4;
import tb.dnu;
import tb.dov;
import tb.fpb;
import tb.ko4;
import tb.mkd;
import tb.odg;
import tb.sug;
import tb.t2o;
import tb.trt;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class ContentComprehensionTool {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DEFAULT_API_NAME = "mtop.taobao.media.guang.publish.comprehension";
    public static final String TYPE_IMAGE = "image";
    public static final String TYPE_VIDEO = "video";
    public static final Map<String, ContentComprehensionTool> m = new HashMap();
    public static final HashMap<String, String> n;

    /* renamed from: a  reason: collision with root package name */
    public boolean f8246a;
    public String b;
    public com.taobao.android.litecreator.comprehension.a c;
    public fpb f;
    public JSONArray k;
    public final Map<String, ContentComprehensionResult> d = new HashMap();
    public final h e = new h();
    public boolean g = true;
    public boolean h = true;
    public mkd<ContentComprehensionResult> i = null;
    public boolean j = false;
    public final ArrayList<mkd<ContentComprehensionResult>> l = new ArrayList<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f8247a;

        public a(String str) {
            this.f8247a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                ContentComprehensionTool.this.l(this.f8247a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f8248a;
        public final /* synthetic */ JSONArray b;
        public final /* synthetic */ JSONObject c;

        public b(String str, JSONArray jSONArray, JSONObject jSONObject) {
            this.f8248a = str;
            this.b = jSONArray;
            this.c = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                ContentComprehensionTool.a(ContentComprehensionTool.this, this.f8248a, this.b, this.c);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f8249a;

        public c(String str) {
            this.f8249a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            ContentComprehensionTool contentComprehensionTool = ContentComprehensionTool.this;
            contentComprehensionTool.m(this.f8249a, ContentComprehensionTool.b(contentComprehensionTool).j());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ JSONObject f8250a;
        public final /* synthetic */ dov.a b;

        public d(JSONObject jSONObject, dov.a aVar) {
            this.f8250a = jSONObject;
            this.b = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.f8250a.put("publishParams", (Object) JSON.toJSON(this.b.o()).toString());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ContentComprehensionResult f8251a;

        public e(ContentComprehensionResult contentComprehensionResult) {
            this.f8251a = contentComprehensionResult;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Iterator it = ContentComprehensionTool.k(ContentComprehensionTool.this).iterator();
            while (it.hasNext()) {
                mkd mkdVar = (mkd) it.next();
                if (mkdVar != null) {
                    mkdVar.a(this.f8251a);
                }
                it.remove();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class f implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ mkd f8252a;
        public final /* synthetic */ ContentComprehensionResult b;

        public f(mkd mkdVar, ContentComprehensionResult contentComprehensionResult) {
            this.f8252a = mkdVar;
            this.b = contentComprehensionResult;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.f8252a.a(this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class g implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ mkd f8253a;
        public final /* synthetic */ ContentComprehensionResult b;

        public g(mkd mkdVar, ContentComprehensionResult contentComprehensionResult) {
            this.f8253a = mkdVar;
            this.b = contentComprehensionResult;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.f8253a.a(this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class h {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f8254a;
        public String b = "image";
        public String c = "";
        public String d = "";
        public long e = 0;
        public long f = 0;
        public int g = 0;
        public int h = 0;
        public String i = "";
        public JSONArray j;

        static {
            t2o.a(511705194);
        }

        public synchronized void a(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bdf6ddd", new Object[]{this, new Long(j)});
                return;
            }
            this.c += "|" + j;
        }

        public synchronized void b(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a3c8edde", new Object[]{this, new Long(j)});
                return;
            }
            this.d += "|" + j;
        }

        public Map<String, String> c() {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("2dd9d11d", new Object[]{this});
            }
            HashMap hashMap = new HashMap();
            hashMap.put("type", this.b);
            hashMap.put("session_id", this.f8254a);
            hashMap.put("compress_cost", this.c);
            hashMap.put("upload_cost", this.d);
            hashMap.put("pre_processing_cost", String.valueOf(this.e));
            hashMap.put("comprehension_cost", String.valueOf(this.f));
            hashMap.put("total_frame_count", String.valueOf(this.g));
            hashMap.put("total_uploaded_frame_count", String.valueOf(this.h));
            hashMap.put("source", this.i);
            JSONArray jSONArray = this.j;
            if (jSONArray != null) {
                str = jSONArray.toJSONString();
            } else {
                str = "";
            }
            hashMap.put("biz_type", str);
            return hashMap;
        }
    }

    public ContentComprehensionTool(String str) {
        x(str);
    }

    public static /* synthetic */ void a(ContentComprehensionTool contentComprehensionTool, String str, JSONArray jSONArray, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f0b7a66", new Object[]{contentComprehensionTool, str, jSONArray, jSONObject});
        } else {
            contentComprehensionTool.Z(str, jSONArray, jSONObject);
        }
    }

    public static /* synthetic */ com.taobao.android.litecreator.comprehension.a b(ContentComprehensionTool contentComprehensionTool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.litecreator.comprehension.a) ipChange.ipc$dispatch("8d4ccbc4", new Object[]{contentComprehensionTool});
        }
        return contentComprehensionTool.c;
    }

    public static /* synthetic */ boolean c(ContentComprehensionTool contentComprehensionTool, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aae0e284", new Object[]{contentComprehensionTool, new Boolean(z)})).booleanValue();
        }
        contentComprehensionTool.h = z;
        return z;
    }

    public static /* synthetic */ ContentComprehensionResult d(ContentComprehensionTool contentComprehensionTool, String str, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ContentComprehensionResult) ipChange.ipc$dispatch("376ca1be", new Object[]{contentComprehensionTool, str, mtopResponse});
        }
        return contentComprehensionTool.S(str, mtopResponse);
    }

    public static /* synthetic */ mkd e(ContentComprehensionTool contentComprehensionTool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mkd) ipChange.ipc$dispatch("74b58f15", new Object[]{contentComprehensionTool});
        }
        return contentComprehensionTool.i;
    }

    public static /* synthetic */ mkd f(ContentComprehensionTool contentComprehensionTool, mkd mkdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mkd) ipChange.ipc$dispatch("68acb024", new Object[]{contentComprehensionTool, mkdVar});
        }
        contentComprehensionTool.i = mkdVar;
        return mkdVar;
    }

    public static /* synthetic */ boolean g(ContentComprehensionTool contentComprehensionTool, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c05b8947", new Object[]{contentComprehensionTool, new Boolean(z)})).booleanValue();
        }
        contentComprehensionTool.g = z;
        return z;
    }

    public static /* synthetic */ void h(ContentComprehensionTool contentComprehensionTool, ContentComprehensionResult contentComprehensionResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("582d9178", new Object[]{contentComprehensionTool, contentComprehensionResult});
        } else {
            contentComprehensionTool.P(contentComprehensionResult);
        }
    }

    public static /* synthetic */ h i(ContentComprehensionTool contentComprehensionTool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h) ipChange.ipc$dispatch("28c2c846", new Object[]{contentComprehensionTool});
        }
        return contentComprehensionTool.e;
    }

    public static /* synthetic */ fpb j(ContentComprehensionTool contentComprehensionTool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fpb) ipChange.ipc$dispatch("97b3d6c7", new Object[]{contentComprehensionTool});
        }
        return contentComprehensionTool.f;
    }

    public static /* synthetic */ ArrayList k(ContentComprehensionTool contentComprehensionTool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("9f69e1c9", new Object[]{contentComprehensionTool});
        }
        return contentComprehensionTool.l;
    }

    public static void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c823e69b", new Object[0]);
            return;
        }
        for (Map.Entry entry : ((HashMap) m).entrySet()) {
            if (entry != null) {
                ContentComprehensionTool contentComprehensionTool = (ContentComprehensionTool) entry.getValue();
                contentComprehensionTool.t().clear();
                ((HashMap) contentComprehensionTool.d).clear();
                contentComprehensionTool.c.m();
            }
        }
        HashMap hashMap = (HashMap) m;
        hashMap.clear();
        ko4 ko4Var = ko4.INSTANCE;
        ko4Var.f().clear();
        ko4Var.h().clear();
        odg.c("LCCOM.Tool", "clearAll: ContentComprehensionTool " + hashMap.size());
    }

    public static void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e900c9e", new Object[0]);
            return;
        }
        for (Map.Entry entry : ((HashMap) m).entrySet()) {
            if (entry != null) {
                ContentComprehensionTool contentComprehensionTool = (ContentComprehensionTool) entry.getValue();
                contentComprehensionTool.t().clear();
                contentComprehensionTool.c.m();
            }
        }
        odg.c("LCCOM.Tool", "clearData: ContentComprehensionTool " + ((HashMap) m).size());
    }

    public static ContentComprehensionTool s(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ContentComprehensionTool) ipChange.ipc$dispatch("2b8ba286", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            str = "single_session";
        }
        HashMap hashMap = (HashMap) m;
        if (!hashMap.containsKey(str)) {
            hashMap.put(str, new ContentComprehensionTool(str));
        }
        return (ContentComprehensionTool) hashMap.get(str);
    }

    public final boolean A(JSONArray jSONArray, JSONArray jSONArray2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2162384b", new Object[]{this, jSONArray, jSONArray2})).booleanValue();
        }
        if (jSONArray == jSONArray2) {
            return true;
        }
        if (jSONArray == null || jSONArray2 == null || !jSONArray.contains(jSONArray2) || !jSONArray2.contains(jSONArray)) {
            return false;
        }
        return true;
    }

    public ContentComprehensionTool E(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ContentComprehensionTool) ipChange.ipc$dispatch("ca5112cb", new Object[]{this, list});
        }
        F(list, null);
        return this;
    }

    public ContentComprehensionTool F(List<String> list, bq4 bq4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ContentComprehensionTool) ipChange.ipc$dispatch("a4ea2a0b", new Object[]{this, list, bq4Var});
        }
        return G(list, true, bq4Var);
    }

    public ContentComprehensionTool I(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ContentComprehensionTool) ipChange.ipc$dispatch("f90e6976", new Object[]{this, jSONObject});
        }
        if (!y()) {
            return this;
        }
        this.c.q(jSONObject);
        this.j = true;
        return this;
    }

    public ContentComprehensionTool M(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ContentComprehensionTool) ipChange.ipc$dispatch("915072f", new Object[]{this, str});
        }
        this.c.u(str);
        this.j = true;
        return this;
    }

    public final void P(ContentComprehensionResult contentComprehensionResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("675ef4f9", new Object[]{this, contentComprehensionResult});
        } else {
            trt.c(new e(contentComprehensionResult));
        }
    }

    public ContentComprehensionResult Q(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ContentComprehensionResult) ipChange.ipc$dispatch("4d0f274e", new Object[]{this, str});
        }
        return v(str);
    }

    public void R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e794edae", new Object[]{this});
            return;
        }
        this.c.b.clear();
        this.j = true;
    }

    public final ContentComprehensionResult S(String str, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ContentComprehensionResult) ipChange.ipc$dispatch("1c198dd0", new Object[]{this, str, mtopResponse});
        }
        ContentComprehensionResult contentComprehensionResult = new ContentComprehensionResult();
        contentComprehensionResult.timeStamp = System.currentTimeMillis();
        contentComprehensionResult.bizData = mtopResponse.getDataJsonObject();
        ((HashMap) this.d).put(str, contentComprehensionResult);
        return contentComprehensionResult;
    }

    public void T(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c311f8af", new Object[]{this, new Boolean(z)});
        } else {
            this.f8246a = z;
        }
    }

    public void U(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95ad15ee", new Object[]{this, str});
        } else {
            this.e.i = str;
        }
    }

    public void V(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd56044d", new Object[]{this, str});
        } else {
            this.e.b = str;
        }
    }

    public void W(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fadd8a9", new Object[]{this, str});
        } else {
            X(str, null, null);
        }
    }

    public void Y(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d013db67", new Object[]{this, str, jSONObject});
        } else {
            X(str, null, jSONObject);
        }
    }

    public void l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e569c23", new Object[]{this, str});
        } else {
            trt.g(new c(str));
        }
    }

    public void m(final String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4978232d", new Object[]{this, str, str2});
        } else if (!TextUtils.isEmpty(str2)) {
            MtopBusiness.build(Mtop.instance((String) null, Globals.getApplication()), new RecognizeVideoMusicMTopRequest(dov.b(this.b).l(), this.b, str2)).registerListener((IRemoteListener) new IRemoteBaseListener() { // from class: com.taobao.android.litecreator.comprehension.ContentComprehensionTool.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                        return;
                    }
                    ContentComprehensionTool.c(ContentComprehensionTool.this, false);
                    odg.c("LCCOM.Tool", "submit.checkMusicCopy.onError. response:" + mtopResponse);
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                        return;
                    }
                    ContentComprehensionTool.c(ContentComprehensionTool.this, false);
                    ContentComprehensionResult d2 = ContentComprehensionTool.d(ContentComprehensionTool.this, str, mtopResponse);
                    if (ContentComprehensionTool.e(ContentComprehensionTool.this) != null) {
                        ContentComprehensionTool.e(ContentComprehensionTool.this).a(d2);
                        ContentComprehensionTool.f(ContentComprehensionTool.this, null);
                    }
                    odg.d("LCCOM.Tool", "submit.checkMusicCopy.onSuccess. response:" + d2.bizData);
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                        return;
                    }
                    ContentComprehensionTool.c(ContentComprehensionTool.this, false);
                    odg.c("LCCOM.Tool", "submit.checkMusicCopy.onSystemError. response:" + mtopResponse);
                }
            }).reqMethod(MethodEnum.POST).startRequest();
        }
    }

    public void o(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92531630", new Object[]{this, str});
        } else {
            p(str, true);
        }
    }

    public final void p(String str, boolean z) {
        ContentComprehensionResult contentComprehensionResult;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fe14d8e", new Object[]{this, str, new Boolean(z)});
        } else if (((HashMap) this.d).containsKey(str) && (contentComprehensionResult = (ContentComprehensionResult) ((HashMap) this.d).get(str)) != null) {
            contentComprehensionResult.clear();
            if (z) {
                this.g = true;
            }
        }
    }

    public void r(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3143c42c", new Object[]{this, str});
        } else {
            p(str, false);
        }
    }

    public ArrayList<mkd<ContentComprehensionResult>> t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("d1a025c8", new Object[]{this});
        }
        return this.l;
    }

    public h u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h) ipChange.ipc$dispatch("89a114f4", new Object[]{this});
        }
        return this.e;
    }

    public ContentComprehensionResult v(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ContentComprehensionResult) ipChange.ipc$dispatch("f764f2de", new Object[]{this, str});
        }
        if (!((HashMap) this.d).containsKey(str)) {
            return new ContentComprehensionResult();
        }
        ContentComprehensionResult contentComprehensionResult = (ContentComprehensionResult) ((HashMap) this.d).get(str);
        if (contentComprehensionResult != null) {
            return contentComprehensionResult;
        }
        return new ContentComprehensionResult();
    }

    public void w(fpb fpbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa3b9d8d", new Object[]{this, fpbVar});
        } else {
            this.f = fpbVar;
        }
    }

    public final void x(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88f2fa21", new Object[]{this, str});
            return;
        }
        odg.d("LCCOM.Tool", "initialize.");
        this.b = str;
        this.e.f8254a = str;
        this.c = new com.taobao.android.litecreator.comprehension.a(str, this);
    }

    public boolean y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f2312d58", new Object[]{this})).booleanValue();
        }
        if (dov.b(this.b).g("comprehension_enable", false) || z()) {
            return true;
        }
        return false;
    }

    public final boolean z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("38e0c58b", new Object[]{this})).booleanValue();
        }
        return this.f8246a;
    }

    public ContentComprehensionTool B(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ContentComprehensionTool) ipChange.ipc$dispatch("c0d93d2d", new Object[]{this, str});
        }
        if (!y()) {
            return this;
        }
        odg.d("LCCOM.Tool", "offerContent. content:" + str);
        this.c.p(str);
        this.j = true;
        return this;
    }

    public ContentComprehensionTool C(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ContentComprehensionTool) ipChange.ipc$dispatch("78599753", new Object[]{this, new Long(j)});
        }
        if (y() && j > 0) {
            odg.d("LCCOM.Tool", "offerContent. goodsCate:" + j);
            this.c.p = j;
            this.j = true;
        }
        return this;
    }

    public ContentComprehensionTool D(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ContentComprehensionTool) ipChange.ipc$dispatch("91acb4e", new Object[]{this, str});
        }
        if (!y()) {
            return this;
        }
        odg.d("LCCOM.Tool", "offerContent. goodsTitle:" + str);
        this.c.o = str;
        this.j = true;
        return this;
    }

    public ContentComprehensionTool G(List<String> list, boolean z, bq4 bq4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ContentComprehensionTool) ipChange.ipc$dispatch("272ce00f", new Object[]{this, list, new Boolean(z), bq4Var});
        }
        if (!y()) {
            return this;
        }
        odg.d("LCCOM.Tool", "offerImages. imagePath:" + sug.c(list));
        h hVar = this.e;
        hVar.c = "";
        hVar.d = "";
        this.c.r(list, z, bq4Var);
        this.j = true;
        return this;
    }

    public ContentComprehensionTool H(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ContentComprehensionTool) ipChange.ipc$dispatch("ea49519b", new Object[]{this, list});
        }
        if (!y()) {
            return this;
        }
        odg.d("LCCOM.Tool", "offerItems. itemIds:" + sug.c(list));
        this.c.s(list);
        this.j = true;
        return this;
    }

    public ContentComprehensionTool J(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ContentComprehensionTool) ipChange.ipc$dispatch("ed964465", new Object[]{this, new Integer(i)});
        }
        if (!y()) {
            return this;
        }
        odg.d("LCCOM.Tool", "offerContent. score:" + i);
        this.c.q = i;
        this.j = true;
        return this;
    }

    public ContentComprehensionTool K(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ContentComprehensionTool) ipChange.ipc$dispatch("7410221d", new Object[]{this, list});
        }
        this.c.b.clear();
        this.c.b = list;
        this.j = true;
        odg.d("LCCOM.Tool", "offerRemoteUrls. remoteUrls:" + list);
        return this;
    }

    public ContentComprehensionTool L(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ContentComprehensionTool) ipChange.ipc$dispatch("e39a6f8c", new Object[]{this, str});
        }
        if (!y()) {
            return this;
        }
        odg.d("LCCOM.Tool", "offerContent. title:" + str);
        this.c.t(str);
        this.j = true;
        return this;
    }

    public void N(String str, mkd<ContentComprehensionResult> mkdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e5038ec", new Object[]{this, str, mkdVar});
        } else if (mkdVar != null) {
            if (TextUtils.equals(str, "recognizeVideoMusic")) {
                O(str, mkdVar);
                return;
            }
            if (this.f != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("type", this.e.b);
                hashMap.put("session_id", this.e.f8254a);
                hashMap.put("state", String.valueOf(this.g ? 1 : 0));
                this.f.a("QueryResult", hashMap, false);
            }
            if (this.g) {
                odg.d("LCCOM.Tool", "query async.bizType=" + str);
                this.l.add(mkdVar);
                return;
            }
            ContentComprehensionResult v = v(str);
            odg.d("LCCOM.Tool", "query sync.bizType=" + str + ",result=" + v.toString());
            trt.c(new f(mkdVar, v));
        }
    }

    public void O(String str, mkd<ContentComprehensionResult> mkdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c2602fd", new Object[]{this, str, mkdVar});
        } else if (mkdVar != null) {
            if (this.h) {
                odg.d("LCCOM.Tool", "query async.bizType=" + str);
                this.i = mkdVar;
                return;
            }
            ContentComprehensionResult v = v(str);
            odg.d("LCCOM.Tool", "query sync.bizType=" + str + ",result=" + v.toString());
            trt.c(new g(mkdVar, v));
        }
    }

    public void X(String str, JSONArray jSONArray, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1742b3f", new Object[]{this, str, jSONArray, jSONObject});
        } else if (y() || TextUtils.equals("rateTitle", str)) {
            if (jSONArray == null) {
                jSONArray = new JSONArray();
                jSONArray.add(str);
            }
            if (this.j || !A(jSONArray, this.k)) {
                this.j = false;
                odg.d("LCCOM.Tool", "submit.");
                r(str);
                this.k = jSONArray;
                if (TextUtils.equals(str, "recognizeVideoMusic")) {
                    this.h = true;
                    this.c.o(new a(str));
                    return;
                }
                this.g = true;
                this.c.n(new b(str, jSONArray, jSONObject));
            }
        }
    }

    public final void Z(final String str, final JSONArray jSONArray, JSONObject jSONObject) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("295846e2", new Object[]{this, str, jSONArray, jSONObject});
            return;
        }
        this.e.h = this.c.k();
        JSONObject w = this.c.w(jSONArray, jSONObject);
        dov.a b2 = dov.b(this.b);
        w.put("ugcScene", (Object) b2.l());
        if (TextUtils.equals("image", this.e.b)) {
            str2 = AnchorViews.CT_ARTICLE;
        } else {
            str2 = "video";
        }
        w.put("contentType", (Object) str2);
        dnu.a(new d(w, b2));
        boolean z = this.c.l() || (TextUtils.equals(str, "music") || TextUtils.equals(str, "videoEditSticker") || TextUtils.equals(str, "picEditSticker"));
        odg.d("LCCOM.Tool", "submit.afterDataReady.Start. data is valid:" + z + ", data:" + w.toJSONString());
        if (!z) {
            this.g = false;
            P(null);
            return;
        }
        ComprehensionMTopRequest comprehensionMTopRequest = new ComprehensionMTopRequest();
        String str3 = n.get(str);
        if (TextUtils.isEmpty(str3)) {
            str3 = DEFAULT_API_NAME;
        }
        comprehensionMTopRequest.setAPI_NAME(str3);
        comprehensionMTopRequest.setParams(w.toJSONString());
        final long currentTimeMillis = System.currentTimeMillis();
        MtopBusiness.build(Mtop.instance((String) null, Globals.getApplication()), comprehensionMTopRequest).registerListener((IRemoteListener) new IRemoteBaseListener() { // from class: com.taobao.android.litecreator.comprehension.ContentComprehensionTool.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                odg.c("LCCOM.Tool", "submit.afterDataReady.onError. response:" + mtopResponse);
                ContentComprehensionTool.g(ContentComprehensionTool.this, false);
                ContentComprehensionTool.h(ContentComprehensionTool.this, null);
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                    return;
                }
                ContentComprehensionResult d2 = ContentComprehensionTool.d(ContentComprehensionTool.this, str, mtopResponse);
                odg.d("LCCOM.Tool", "submit.afterDataReady.onSuccess. response:" + d2.bizData);
                ContentComprehensionTool.i(ContentComprehensionTool.this).f = System.currentTimeMillis() - currentTimeMillis;
                ContentComprehensionTool.i(ContentComprehensionTool.this).j = jSONArray;
                ContentComprehensionTool.g(ContentComprehensionTool.this, false);
                ContentComprehensionTool.h(ContentComprehensionTool.this, d2);
                if (ContentComprehensionTool.j(ContentComprehensionTool.this) != null) {
                    ContentComprehensionTool.j(ContentComprehensionTool.this).a("Complete", ContentComprehensionTool.i(ContentComprehensionTool.this).c(), false);
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                odg.c("LCCOM.Tool", "submit.afterDataReady.onSystemError. response:" + mtopResponse);
                ContentComprehensionTool.g(ContentComprehensionTool.this, false);
                ContentComprehensionTool.h(ContentComprehensionTool.this, null);
            }
        }).reqMethod(MethodEnum.POST).startRequest();
    }

    static {
        t2o.a(511705184);
        HashMap hashMap = new HashMap();
        hashMap.put("music", "recommendMusics");
        hashMap.put("topic", "recommendTopics");
        hashMap.put("label", "recommendLabels");
        hashMap.put("videoEditSticker", "recommendVideoEditStickers");
        hashMap.put("picEditSticker", "recommendPicEditStickers");
        hashMap.put("recognizeVideoMusic", "recommendVideoMusicRecognize");
        hashMap.put("rateTitle", "recommendRateTitles");
        HashMap<String, String> hashMap2 = new HashMap<>();
        n = hashMap2;
        hashMap2.put("rateTitle", "mtop.taobao.rate.publish.comprehension");
    }
}

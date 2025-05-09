package tb;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.context.atmo.bean.AtmosphereResListResponseData;
import com.taobao.alilive.aliliveframework.context.atmo.bean.AtmosphereResListResponseDataNew;
import com.taobao.alilive.aliliveframework.context.atmo.bean.EffectResConfig;
import com.taobao.alilive.aliliveframework.context.atmo.bean.StickerConfig;
import com.taobao.alilive.aliliveframework.context.atmo.bean.StickerGroup;
import com.taobao.android.live.plugin.atype.flexalocal.input.atmosphere.business.AtmosphereResListResponse;
import com.taobao.android.live.plugin.atype.flexalocal.input.atmosphere.business.AtmosphereResListResponseDataNew2;
import com.taobao.android.live.plugin.atype.flexalocal.input.atmosphere.business.AtmosphereResListResponseNew;
import com.taobao.android.live.plugin.atype.flexalocal.input.atmosphere.business.KeywordAtmosphere;
import com.taobao.android.task.Coordinator;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.mergeInfo.UnImportantLiveInfoResponseData;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import tb.fgv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class kg1 implements b0d, mhb, fgv.e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String STICKER_TYPE_ICON = "icon";
    public static final String STICKER_TYPE_STRIP = "strip";
    public List<AtmosphereResListResponseDataNew.TabInfo> v;
    public ux9 w;

    /* renamed from: a  reason: collision with root package name */
    public final Context f22642a = v2s.o().f().getApplication();
    public boolean r = false;
    public final Handler s = new Handler(Looper.getMainLooper());
    public final Runnable y = new b();
    public final Runnable z = new c();
    public final HashMap<String, StickerGroup> b = new HashMap<>();
    public final List<AtmosphereResListResponseData.AtmosphereResItem> f = new ArrayList();
    public final List<AtmosphereResListResponseData.AtmosphereResItem> g = new ArrayList();
    public final HashMap<String, StickerConfig> c = new HashMap<>();
    public final HashMap<String, StickerConfig> d = new HashMap<>();
    public final HashMap<String, StickerConfig> e = new HashMap<>();
    public final List<d> l = new ArrayList();
    public final List<crl> m = new ArrayList();
    public HashMap<Integer, String> o = new HashMap<>();
    public final List<Integer> n = new ArrayList();
    public final SparseArray<HashMap<String, List<EffectResConfig>>> i = new SparseArray<>();
    public final HashMap<String, List<EffectResConfig>> j = new HashMap<>();
    public final ArrayList<String> p = new ArrayList<>();
    public final ArrayList<String> q = new ArrayList<>();
    public final List<List<AtmosphereResListResponseData.AtmosphereResItem>> h = new ArrayList();
    public final HashMap<String, String> x = new HashMap<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements pt7 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AtmosphereResListResponseData.AtmosphereResItem f22643a;

        public a(AtmosphereResListResponseData.AtmosphereResItem atmosphereResItem, s98 s98Var) {
            this.f22643a = atmosphereResItem;
        }

        @Override // tb.pt7
        public void onDownloadError(String str, int i, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cc722e3b", new Object[]{this, str, new Integer(i), str2});
                return;
            }
            o3s.b("AtmosphereMultiCaseManager", "getAtmosphereResContent:download url error:" + str + ":" + i + ":" + str2);
        }

        @Override // tb.pt7
        public void onDownloadProgress(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("49af8908", new Object[]{this, new Integer(i)});
            }
        }

        @Override // tb.pt7
        public void onDownloadStateChange(String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("98fdb789", new Object[]{this, str, new Boolean(z)});
            }
        }

        @Override // tb.pt7
        public void onFinish(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6a109f1b", new Object[]{this, new Boolean(z)});
            }
        }

        @Override // tb.pt7
        public void onDownloadFinish(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("43d7a315", new Object[]{this, str, str2});
                return;
            }
            o3s.b("AtmosphereMultiCaseManager", "getAtmosphereResContent:download url finish:" + str2);
            try {
                if (!"official_sticker".equals(this.f22643a.type) && !"anchor_custom_sticker".equals(this.f22643a.type) && !"official_strip_sticker".equals(this.f22643a.type)) {
                    if (!"recommend_atmosphere".equals(this.f22643a.type) && !"hot_comment_atmosphere".equals(this.f22643a.type)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(qg9.c(kg1.s(kg1.this)));
                        String str3 = File.separator;
                        sb.append(str3);
                        sb.append(this.f22643a.groupId);
                        sb.append("_");
                        sb.append(this.f22643a.version);
                        String a2 = qg9.a(sb.toString());
                        qg9.f(str2, a2);
                        String a3 = qg9.a(a2 + str3 + "config.json");
                        if (new File(a2).exists() && new File(a3).exists()) {
                            q0h.a("AtmosphereMultiCaseManager", "getVideoMaterialContent:unzip file exist");
                            this.f22643a.file = a2;
                            new d(this.f22643a, kg1.t(kg1.this), kg1.v(kg1.this), kg1.w(kg1.this), kg1.x(kg1.this)).execute(new Void[0]);
                        }
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(qg9.c(kg1.s(kg1.this)));
                    String str4 = File.separator;
                    sb2.append(str4);
                    sb2.append(this.f22643a.type);
                    sb2.append("_");
                    sb2.append(this.f22643a.resUrl.hashCode());
                    String a4 = qg9.a(sb2.toString());
                    qg9.f(str2, a4);
                    String a5 = qg9.a(a4 + str4 + "config.json");
                    if (new File(a4).exists() && new File(a5).exists()) {
                        q0h.a("AtmosphereMultiCaseManager", "getVideoMaterialContent:unzip file exist");
                        this.f22643a.file = a4;
                        new crl(kg1.y(kg1.this), this.f22643a, kg1.z(kg1.this), kg1.A(kg1.this), null).execute(new Void[0]);
                    }
                }
                StringBuilder sb3 = new StringBuilder();
                sb3.append(qg9.c(kg1.s(kg1.this)));
                String str5 = File.separator;
                sb3.append(str5);
                sb3.append(this.f22643a.groupId);
                sb3.append("_");
                sb3.append(this.f22643a.version);
                String a6 = qg9.a(sb3.toString());
                qg9.f(str2, a6);
                String a7 = qg9.a(a6 + str5 + "config.json");
                if (new File(a6).exists() && new File(a7).exists()) {
                    q0h.a("AtmosphereMultiCaseManager", "getVideoMaterialContent:unzip file exist");
                    this.f22643a.file = a6;
                    new d(this.f22643a, kg1.t(kg1.this), kg1.v(kg1.this), kg1.w(kg1.this), kg1.x(kg1.this)).execute(new Void[0]);
                }
            } catch (Throwable th) {
                q0h.a("AtmosphereMultiCaseManager", "unzip exception:" + th);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            t6t.e("recently_expression_catch_key", JSON.toJSONString(kg1.B(kg1.this)));
            t6t.e("quick_expression_catch_key", JSON.toJSONString(kg1.C(kg1.this)));
            o3s.b("AtmosphereMultiCaseManager", "write recently data");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class d extends AsyncTask<Void, Void, List<StickerConfig>> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final AtmosphereResListResponseData.AtmosphereResItem f22647a;
        public final HashMap<String, StickerGroup> b;
        public final HashMap<String, StickerConfig> c;
        public final HashMap<String, StickerConfig> d;
        public final HashMap<String, StickerConfig> e;

        static {
            t2o.a(295699414);
        }

        public d(AtmosphereResListResponseData.AtmosphereResItem atmosphereResItem, HashMap<String, StickerGroup> hashMap, HashMap<String, StickerConfig> hashMap2, HashMap<String, StickerConfig> hashMap3, HashMap<String, StickerConfig> hashMap4) {
            this.f22647a = atmosphereResItem;
            this.b = hashMap;
            this.c = hashMap2;
            this.d = hashMap3;
            this.e = hashMap4;
        }

        public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/input/AtmosphereMultiCaseManager$ParseStickerTask");
        }

        /* JADX WARN: Removed duplicated region for block: B:46:0x0106  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x010c  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x012e A[Catch: Exception -> 0x012a, TRY_LEAVE, TryCatch #5 {Exception -> 0x012a, blocks: (B:52:0x0126, B:56:0x012e), top: B:67:0x0126 }] */
        /* JADX WARN: Removed duplicated region for block: B:59:0x0143  */
        /* JADX WARN: Removed duplicated region for block: B:67:0x0126 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.util.List<com.taobao.alilive.aliliveframework.context.atmo.bean.StickerConfig> doInBackground(java.lang.Void... r11) {
            /*
                Method dump skipped, instructions count: 329
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: tb.kg1.d.doInBackground(java.lang.Void[]):java.util.List");
        }

        /* renamed from: b */
        public void onPostExecute(List<StickerConfig> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("598ba7ce", new Object[]{this, list});
            } else if (this.b != null && this.f22647a != null) {
                StickerGroup stickerGroup = new StickerGroup();
                AtmosphereResListResponseData.AtmosphereResItem atmosphereResItem = this.f22647a;
                stickerGroup.title = atmosphereResItem.title;
                stickerGroup.type = atmosphereResItem.type;
                stickerGroup.stickerType = atmosphereResItem.stickerType;
                stickerGroup.rule = atmosphereResItem.rule;
                stickerGroup.stickers = list;
                o3s.b("AtmosphereMultiCaseManager", "ParseStickerTask group:" + stickerGroup.type);
                if (list != null) {
                    HashMap<String, StickerGroup> hashMap = this.b;
                    hashMap.put(this.f22647a.groupId + "_" + this.f22647a.version, stickerGroup);
                    o3s.b("AtmosphereMultiCaseManager", "onPostExecute type:" + stickerGroup.type + " size:" + list.size());
                    for (StickerConfig stickerConfig : list) {
                        if (TextUtils.equals("official_strip_sticker", stickerGroup.type) || TextUtils.equals("anchor_custom_sticker", stickerGroup.type)) {
                            stickerConfig.type = "1";
                        }
                        if (!TextUtils.isEmpty(stickerGroup.stickerType)) {
                            if (TextUtils.equals(stickerGroup.stickerType, "icon")) {
                                stickerConfig.type = "0";
                            } else {
                                stickerConfig.type = "1";
                            }
                        }
                        this.c.put(stickerConfig.matchKey, stickerConfig);
                        if (TextUtils.equals(stickerGroup.type, "anchor_custom_sticker")) {
                            this.d.put(stickerConfig.id, stickerConfig);
                            this.e.put(stickerConfig.matchKey, stickerConfig);
                        }
                    }
                    return;
                }
                o3s.b("AtmosphereMultiCaseManager", "onPostExecute type:" + stickerGroup.type + " size stickerConfigs is null");
            }
        }
    }

    static {
        t2o.a(295699409);
        t2o.a(806355932);
        t2o.a(806355001);
        t2o.a(806356153);
    }

    public kg1() {
        k0r.k();
        o3s.b("AtmosphereMultiCaseManager", "constructor init");
    }

    public static /* synthetic */ HashMap A(kg1 kg1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("f7dbdb59", new Object[]{kg1Var});
        }
        return kg1Var.j;
    }

    public static /* synthetic */ ArrayList B(kg1 kg1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("eba61ed1", new Object[]{kg1Var});
        }
        return kg1Var.p;
    }

    public static /* synthetic */ ArrayList C(kg1 kg1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("ccb25952", new Object[]{kg1Var});
        }
        return kg1Var.q;
    }

    public static /* synthetic */ Context s(kg1 kg1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("2b6ab667", new Object[]{kg1Var});
        }
        return kg1Var.f22642a;
    }

    public static /* synthetic */ HashMap t(kg1 kg1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("76da72d3", new Object[]{kg1Var});
        }
        return kg1Var.b;
    }

    public static /* synthetic */ Handler u(kg1 kg1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("22e61a28", new Object[]{kg1Var});
        }
        return kg1Var.s;
    }

    public static /* synthetic */ HashMap v(kg1 kg1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("b7055994", new Object[]{kg1Var});
        }
        return kg1Var.c;
    }

    public static /* synthetic */ HashMap w(kg1 kg1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("f7304055", new Object[]{kg1Var});
        }
        return kg1Var.e;
    }

    public static /* synthetic */ HashMap x(kg1 kg1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("375b2716", new Object[]{kg1Var});
        }
        return kg1Var.d;
    }

    public static /* synthetic */ ux9 y(kg1 kg1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ux9) ipChange.ipc$dispatch("2778334a", new Object[]{kg1Var});
        }
        return kg1Var.w;
    }

    public static /* synthetic */ SparseArray z(kg1 kg1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SparseArray) ipChange.ipc$dispatch("d48648a4", new Object[]{kg1Var});
        }
        return kg1Var.i;
    }

    public final void D(AtmosphereResListResponseData.AtmosphereResItem atmosphereResItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("171779dd", new Object[]{this, atmosphereResItem});
        } else {
            E(atmosphereResItem, null);
        }
    }

    public final void E(AtmosphereResListResponseData.AtmosphereResItem atmosphereResItem, s98 s98Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("500e425", new Object[]{this, atmosphereResItem, s98Var});
            return;
        }
        String str = atmosphereResItem.resUrl;
        q0h.a("AtmosphereMultiCaseManager", "getAtmosphereResContent:download url:" + str);
        HashMap hashMap = new HashMap();
        hashMap.put("bizId", "my3dZone");
        hashMap.put("useCache", Boolean.TRUE);
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("url", (Object) str);
        jSONArray.add(jSONObject);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("downloadList", jSONArray);
        hashMap2.put("downloadParam", hashMap);
        ((ArrayList) this.n).add(Integer.valueOf(v2s.o().i().b(hashMap2, new a(atmosphereResItem, s98Var))));
    }

    public final void F(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dea19ec7", new Object[]{this, ux9Var});
        } else if (ux9Var instanceof clo) {
            clo cloVar = (clo) ux9Var;
            if (cloVar.t0() != null) {
                cloVar.t0().i(this);
            }
        }
    }

    public List<JSONObject> I(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("450990f4", new Object[]{this, str});
        }
        List<EffectResConfig> list = this.j.get(str);
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            return a(list);
        }
        return arrayList;
    }

    public final void N(List<KeywordAtmosphere> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac7073e5", new Object[]{this, list});
            return;
        }
        this.x.clear();
        if (!(list == null || list.isEmpty())) {
            for (KeywordAtmosphere keywordAtmosphere : list) {
                if (keywordAtmosphere != null) {
                    this.x.put(keywordAtmosphere.keyword, keywordAtmosphere.url);
                }
            }
        }
    }

    public final void Q(AtmosphereResListResponseDataNew2 atmosphereResListResponseDataNew2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbb7cb21", new Object[]{this, atmosphereResListResponseDataNew2});
        } else if (atmosphereResListResponseDataNew2 != null) {
            U(atmosphereResListResponseDataNew2.otherAtmosphere);
            R(atmosphereResListResponseDataNew2.tabInfoList);
            if (nh4.w()) {
                N(atmosphereResListResponseDataNew2.keywordAtmosphere);
            }
            if (!this.r) {
                V();
                this.r = true;
            }
        }
    }

    public final void R(List<AtmosphereResListResponseDataNew.TabInfo> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1c1b536", new Object[]{this, list});
            return;
        }
        for (AtmosphereResListResponseDataNew.TabInfo tabInfo : list) {
            ArrayList arrayList = new ArrayList();
            Z(tabInfo.stickerList, arrayList);
            ((ArrayList) this.h).add(arrayList);
        }
        this.v = list;
    }

    public final void S(AtmosphereResListResponseData.AtmosphereResItem atmosphereResItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f291edce", new Object[]{this, atmosphereResItem});
            return;
        }
        HashMap<String, List<EffectResConfig>> hashMap = this.i.get(atmosphereResItem.resUrl.hashCode());
        if (hashMap != null) {
            this.j.putAll(hashMap);
            return;
        }
        String a2 = qg9.a(qg9.c(this.f22642a) + File.separator + atmosphereResItem.type + "_" + atmosphereResItem.resUrl.hashCode());
        if (new File(a2).exists()) {
            atmosphereResItem.file = a2;
            crl crlVar = new crl(this.w, atmosphereResItem, this.i, this.j);
            ((ArrayList) this.m).add(crlVar);
            crlVar.execute(new Void[0]);
            return;
        }
        D(atmosphereResItem);
    }

    public final void U(List<AtmosphereResListResponseData.AtmosphereResItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59c83725", new Object[]{this, list});
            return;
        }
        for (AtmosphereResListResponseData.AtmosphereResItem atmosphereResItem : list) {
            if ("anchor_fans_light".equals(atmosphereResItem.type)) {
                AtmosphereResListResponseData.Rule rule = atmosphereResItem.rule;
                if (rule != null) {
                    this.o = rule.fanLevels;
                }
                o3s.b("AtmosphereMultiCaseManager", "processOtherAtmosphereData anchor_fans_light");
            } else if ("recommend_atmosphere".equals(atmosphereResItem.type) || "hot_comment_atmosphere".equals(atmosphereResItem.type)) {
                S(atmosphereResItem);
                o3s.b("AtmosphereMultiCaseManager", "processOtherAtmosphereData processEffectRes");
            }
        }
    }

    public final void V() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73c497b6", new Object[]{this});
        } else {
            Coordinator.execute(this.y);
        }
    }

    public final void W(List<AtmosphereResListResponseData.AtmosphereResItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c77a91e7", new Object[]{this, list});
        } else if (list != null) {
            for (AtmosphereResListResponseData.AtmosphereResItem atmosphereResItem : list) {
                if ("anchor_fans_light".equals(atmosphereResItem.type)) {
                    AtmosphereResListResponseData.Rule rule = atmosphereResItem.rule;
                    if (rule != null) {
                        this.o = rule.fanLevels;
                    }
                    o3s.b("AtmosphereMultiCaseManager", "anchor_fans_light");
                } else if ("official_sticker".equals(atmosphereResItem.type)) {
                    X(atmosphereResItem);
                    o3s.b("AtmosphereMultiCaseManager", "processSticker");
                } else if ("recommend_atmosphere".equals(atmosphereResItem.type) || "hot_comment_atmosphere".equals(atmosphereResItem.type)) {
                    S(atmosphereResItem);
                    o3s.b("AtmosphereMultiCaseManager", "processEffectRes");
                } else if ("anchor_custom_sticker".equals(atmosphereResItem.type) || "official_strip_sticker".equals(atmosphereResItem.type)) {
                    a0(atmosphereResItem);
                    o3s.b("AtmosphereMultiCaseManager", "processTextSticker");
                }
            }
        }
    }

    public final void X(AtmosphereResListResponseData.AtmosphereResItem atmosphereResItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28abb4e0", new Object[]{this, atmosphereResItem});
            return;
        }
        if ("official_sticker".equals(atmosphereResItem.type)) {
            atmosphereResItem.title = "全部表情";
        } else {
            atmosphereResItem.title = "主播专属表情";
        }
        T(atmosphereResItem);
    }

    public final void Z(List<AtmosphereResListResponseData.AtmosphereResItem> list, List<AtmosphereResListResponseData.AtmosphereResItem> list2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24b2212", new Object[]{this, list, list2});
            return;
        }
        for (AtmosphereResListResponseData.AtmosphereResItem atmosphereResItem : list) {
            if (atmosphereResItem != null) {
                String str = atmosphereResItem.stickerType;
                if (TextUtils.equals(str, "icon")) {
                    T(atmosphereResItem);
                    list2.add(atmosphereResItem);
                } else if (TextUtils.equals(str, "strip")) {
                    Y(atmosphereResItem);
                    list2.add(atmosphereResItem);
                }
            }
        }
    }

    public List<JSONObject> a(List<EffectResConfig> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("df74ff8c", new Object[]{this, list});
        }
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (EffectResConfig effectResConfig : list) {
                arrayList.add(JSON.parseObject(JSON.toJSONString(effectResConfig)));
            }
        }
        return arrayList;
    }

    @Override // tb.mhb
    public void b(ux9 ux9Var, AtmosphereResListResponseData.AtmosphereResItem atmosphereResItem, s98 s98Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38380dfc", new Object[]{this, ux9Var, atmosphereResItem, s98Var});
        } else if (atmosphereResItem != null && !yqq.e(atmosphereResItem.resUrl)) {
            HashMap<String, List<EffectResConfig>> hashMap = this.i.get(atmosphereResItem.resUrl.hashCode());
            if (hashMap != null) {
                this.j.putAll(hashMap);
                if (s98Var != null && e(atmosphereResItem.matchKey) != null) {
                    s98Var.a(I(atmosphereResItem.matchKey));
                    return;
                }
                return;
            }
            String a2 = qg9.a(qg9.c(this.f22642a) + File.separator + atmosphereResItem.type + "_" + atmosphereResItem.resUrl.hashCode());
            if (new File(a2).exists()) {
                atmosphereResItem.file = a2;
                crl crlVar = new crl(ux9Var, atmosphereResItem, this.i, this.j, s98Var);
                ((ArrayList) this.m).add(crlVar);
                crlVar.execute(new Void[0]);
                return;
            }
            E(atmosphereResItem, s98Var);
        }
    }

    @Override // tb.mhb
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        Coordinator.execute(this.z);
        this.w = null;
    }

    @Override // tb.mhb
    public List<EffectResConfig> e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("1445613b", new Object[]{this, str});
        }
        return this.j.get(str);
    }

    @Override // tb.mhb
    public HashMap<String, StickerConfig> f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("97774163", new Object[]{this});
        }
        if (this.e == null && iw0.j(this.f22642a)) {
            x0u.a(this.f22642a, "getStickerIdMatchMap is null");
            o3s.b("AtmosphereMultiCaseManager", "getStickerIdMatchMap" + Log.getStackTraceString(new Throwable()));
        }
        return this.e;
    }

    @Override // tb.mhb
    public List<StickerGroup> j() {
        List<StickerConfig> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("d05db117", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) this.f).iterator();
        while (it.hasNext()) {
            AtmosphereResListResponseData.AtmosphereResItem atmosphereResItem = (AtmosphereResListResponseData.AtmosphereResItem) it.next();
            HashMap<String, StickerGroup> hashMap = this.b;
            StickerGroup stickerGroup = hashMap.get(atmosphereResItem.groupId + "_" + atmosphereResItem.version);
            if (!(stickerGroup == null || (list = stickerGroup.stickers) == null || list.isEmpty())) {
                arrayList.add(stickerGroup);
            }
        }
        return arrayList;
    }

    @Override // tb.mhb
    public void l(ux9 ux9Var, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b122e1b5", new Object[]{this, ux9Var, str, str2, str3});
            return;
        }
        this.w = ux9Var;
        Iterator it = ((ArrayList) this.l).iterator();
        while (it.hasNext()) {
            ((d) it.next()).cancel(true);
        }
        Iterator it2 = ((ArrayList) this.m).iterator();
        while (it2.hasNext()) {
            ((crl) it2.next()).cancel(true);
        }
        Iterator it3 = ((ArrayList) this.n).iterator();
        while (it3.hasNext()) {
            v2s.o().i().a(((Integer) it3.next()).intValue());
        }
        ((ArrayList) this.n).clear();
        ((ArrayList) this.l).clear();
        ((ArrayList) this.m).clear();
        ((ArrayList) this.f).clear();
        ((ArrayList) this.g).clear();
        this.c.clear();
        this.e.clear();
        this.o.clear();
        ((ArrayList) this.h).clear();
        if (ggv.a()) {
            F(ux9Var);
        }
    }

    @Override // tb.mhb
    public HashMap<Integer, String> n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("2d7637e6", new Object[]{this});
        }
        return this.o;
    }

    @Override // tb.b0d
    public void onError(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
        } else {
            o3s.b("AtmosphereMultiCaseManager", "onError");
        }
    }

    @Override // tb.b0d
    public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
        } else if (netBaseOutDo instanceof AtmosphereResListResponse) {
            AtmosphereResListResponseData atmosphereResListResponseData = (AtmosphereResListResponseData) netBaseOutDo.getData();
            if (atmosphereResListResponseData != null) {
                W(atmosphereResListResponseData.result);
                if (!this.r) {
                    V();
                    this.r = true;
                }
            }
        } else if (netBaseOutDo instanceof AtmosphereResListResponseNew) {
            Q((AtmosphereResListResponseDataNew2) netBaseOutDo.getData());
        }
    }

    @Override // tb.b0d
    public void onSystemError(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
            return;
        }
        o3s.b("AtmosphereMultiCaseManager", "onError");
        onError(i, netResponse, obj);
    }

    @Override // tb.fgv.e
    public void onUnImportantLiveInfoError(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d54c3ef", new Object[]{this, new Integer(i), netResponse, obj});
        } else {
            onError(i, netResponse, obj);
        }
    }

    @Override // tb.fgv.e
    public void onUnImportantLiveInfoSuccess(int i, NetResponse netResponse, UnImportantLiveInfoResponseData unImportantLiveInfoResponseData, Object obj) {
        String str;
        AtmosphereResListResponseDataNew2 atmosphereResListResponseDataNew2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bacf307", new Object[]{this, new Integer(i), netResponse, unImportantLiveInfoResponseData, obj});
        } else if (unImportantLiveInfoResponseData != null && (str = unImportantLiveInfoResponseData.atmosphereResourceData) != null && (atmosphereResListResponseDataNew2 = (AtmosphereResListResponseDataNew2) zrl.b(str, AtmosphereResListResponseDataNew2.class)) != null) {
            Q(atmosphereResListResponseDataNew2);
        }
    }

    @Override // tb.fgv.e
    public void onUnImportantLiveInfoSystemError(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b1993e", new Object[]{this, new Integer(i), netResponse, obj});
        } else {
            onError(i, netResponse, obj);
        }
    }

    @Override // tb.mhb
    public HashMap<String, StickerConfig> r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("d12f0e39", new Object[]{this});
        }
        if (this.c == null && iw0.j(this.f22642a)) {
            x0u.a(this.f22642a, "getStickerKeyMatchMap is null");
            o3s.b("AtmosphereMultiCaseManager", "getStickerKeyMatchMap" + Log.getStackTraceString(new Throwable()));
        }
        return this.c;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ List f22645a;
            public final /* synthetic */ List b;

            public a(List list, List list2) {
                this.f22645a = list;
                this.b = list2;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                kg1.B(kg1.this).addAll(this.f22645a);
                kg1.C(kg1.this).addAll(this.b);
            }
        }

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            kg1.B(kg1.this).clear();
            kg1.C(kg1.this).clear();
            String a2 = t6t.a("recently_expression_catch_key");
            String a3 = t6t.a("quick_expression_catch_key");
            try {
                ArrayList arrayList = new ArrayList();
                if (!TextUtils.isEmpty(a2)) {
                    JSONArray jSONArray = (JSONArray) JSON.parse(a2);
                    for (int i = 0; i < jSONArray.size(); i++) {
                        Object obj = jSONArray.get(i);
                        if (obj instanceof String) {
                            String str = (String) obj;
                            if (!TextUtils.isEmpty(str)) {
                                arrayList.add(str);
                            }
                        }
                    }
                    o3s.b("AtmosphereMultiCaseManager", "read recently data");
                }
                JSONArray jSONArray2 = (JSONArray) JSON.parse(a3);
                ArrayList arrayList2 = new ArrayList();
                if (!TextUtils.isEmpty(a3)) {
                    for (int i2 = 0; i2 < jSONArray2.size(); i2++) {
                        Object obj2 = jSONArray2.get(i2);
                        if (obj2 instanceof String) {
                            String str2 = (String) obj2;
                            if (!TextUtils.isEmpty(str2)) {
                                arrayList2.add(str2);
                            }
                        }
                    }
                    o3s.b("AtmosphereMultiCaseManager", "read quick data");
                }
                kg1.u(kg1.this).post(new a(arrayList, arrayList2));
            } catch (Exception unused) {
                q0h.a("AtmosphereMultiCaseManager", "mReadExpressionRunnable value:" + a2);
            }
        }
    }

    public final void T(AtmosphereResListResponseData.AtmosphereResItem atmosphereResItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae33f5b9", new Object[]{this, atmosphereResItem});
            return;
        }
        ((ArrayList) this.f).add(atmosphereResItem);
        HashMap<String, StickerGroup> hashMap = this.b;
        if (hashMap.containsKey(atmosphereResItem.groupId + "_" + atmosphereResItem.version)) {
            HashMap<String, StickerGroup> hashMap2 = this.b;
            StickerGroup stickerGroup = hashMap2.get(atmosphereResItem.groupId + "_" + atmosphereResItem.version);
            if (!(stickerGroup == null || stickerGroup.stickers == null)) {
                o3s.b("AtmosphereMultiCaseManager", "processSticker stickers size:" + stickerGroup.stickers.size());
                for (StickerConfig stickerConfig : stickerGroup.stickers) {
                    if ("official_sticker".equals(atmosphereResItem.type)) {
                        this.c.put(stickerConfig.matchKey, stickerConfig);
                    } else {
                        this.c.put(stickerConfig.matchKey, stickerConfig);
                        this.e.put(stickerConfig.id, stickerConfig);
                    }
                    if (!TextUtils.isEmpty(atmosphereResItem.stickerType)) {
                        if (TextUtils.equals(atmosphereResItem.stickerType, "icon")) {
                            stickerConfig.type = "0";
                        } else {
                            stickerConfig.type = "1";
                        }
                    }
                }
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(qg9.c(this.f22642a));
        String str = File.separator;
        sb.append(str);
        sb.append(atmosphereResItem.groupId);
        sb.append("_");
        sb.append(atmosphereResItem.version);
        String a2 = qg9.a(sb.toString());
        String a3 = qg9.a(a2 + str + "config.json");
        if (!new File(a2).exists() || !new File(a3).exists()) {
            D(atmosphereResItem);
            return;
        }
        atmosphereResItem.file = a2;
        d dVar = new d(atmosphereResItem, this.b, this.c, this.e, this.d);
        ((ArrayList) this.l).add(dVar);
        dVar.execute(new Void[0]);
    }

    public final void Y(AtmosphereResListResponseData.AtmosphereResItem atmosphereResItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecc6d5da", new Object[]{this, atmosphereResItem});
            return;
        }
        ((ArrayList) this.g).add(atmosphereResItem);
        HashMap<String, StickerGroup> hashMap = this.b;
        if (hashMap.containsKey(atmosphereResItem.groupId + "_" + atmosphereResItem.version)) {
            HashMap<String, StickerGroup> hashMap2 = this.b;
            StickerGroup stickerGroup = hashMap2.get(atmosphereResItem.groupId + "_" + atmosphereResItem.version);
            if (!(stickerGroup == null || stickerGroup.stickers == null)) {
                o3s.b("AtmosphereMultiCaseManager", "processTextSticker stickers size:" + stickerGroup.stickers.size());
                for (StickerConfig stickerConfig : stickerGroup.stickers) {
                    if (stickerConfig != null) {
                        stickerConfig.type = "1";
                        this.c.put(stickerConfig.matchKey, stickerConfig);
                        if ("anchor_custom_sticker".equals(atmosphereResItem.type)) {
                            this.e.put(stickerConfig.id, stickerConfig);
                            this.d.put(stickerConfig.matchKey, stickerConfig);
                        }
                        if (!TextUtils.isEmpty(atmosphereResItem.stickerType)) {
                            if (TextUtils.equals(atmosphereResItem.stickerType, "icon")) {
                                stickerConfig.type = "0";
                            } else {
                                stickerConfig.type = "1";
                            }
                        }
                    }
                }
                return;
            }
            return;
        }
        o3s.b("AtmosphereMultiCaseManager", "processTextSticker to download and pass");
        StringBuilder sb = new StringBuilder();
        sb.append(qg9.c(this.f22642a));
        String str = File.separator;
        sb.append(str);
        sb.append(atmosphereResItem.groupId);
        sb.append("_");
        sb.append(atmosphereResItem.version);
        String a2 = qg9.a(sb.toString());
        String a3 = qg9.a(a2 + str + "config.json");
        if (!new File(a2).exists() || !new File(a3).exists()) {
            D(atmosphereResItem);
            return;
        }
        atmosphereResItem.file = a2;
        d dVar = new d(atmosphereResItem, this.b, this.c, this.e, this.d);
        ((ArrayList) this.l).add(dVar);
        dVar.execute(new Void[0]);
    }

    public final void a0(AtmosphereResListResponseData.AtmosphereResItem atmosphereResItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb40496d", new Object[]{this, atmosphereResItem});
            return;
        }
        if ("official_strip_sticker".equals(atmosphereResItem.type)) {
            atmosphereResItem.title = "全部表情";
            ((ArrayList) this.g).add(atmosphereResItem);
        } else if ("anchor_custom_sticker".equals(atmosphereResItem.type)) {
            atmosphereResItem.title = "主播专属表情";
            ((ArrayList) this.g).add(0, atmosphereResItem);
        }
        HashMap<String, StickerGroup> hashMap = this.b;
        if (hashMap.containsKey(atmosphereResItem.groupId + "_" + atmosphereResItem.version)) {
            HashMap<String, StickerGroup> hashMap2 = this.b;
            StickerGroup stickerGroup = hashMap2.get(atmosphereResItem.groupId + "_" + atmosphereResItem.version);
            if (!(stickerGroup == null || stickerGroup.stickers == null)) {
                o3s.b("AtmosphereMultiCaseManager", "processTextSticker stickers size:" + stickerGroup.stickers.size());
                for (StickerConfig stickerConfig : stickerGroup.stickers) {
                    if (stickerConfig != null) {
                        stickerConfig.type = "1";
                    }
                    if (("anchor_custom_sticker".equals(atmosphereResItem.type) || "official_strip_sticker".equals(atmosphereResItem.type)) && stickerConfig != null) {
                        this.c.put(stickerConfig.matchKey, stickerConfig);
                    }
                    if ("anchor_custom_sticker".equals(atmosphereResItem.type) && stickerConfig != null) {
                        this.e.put(stickerConfig.id, stickerConfig);
                        this.d.put(stickerConfig.matchKey, stickerConfig);
                    }
                }
                return;
            }
            return;
        }
        o3s.b("AtmosphereMultiCaseManager", "processTextSticker to download and pass");
        StringBuilder sb = new StringBuilder();
        sb.append(qg9.c(this.f22642a));
        String str = File.separator;
        sb.append(str);
        sb.append(atmosphereResItem.groupId);
        sb.append("_");
        sb.append(atmosphereResItem.version);
        String a2 = qg9.a(sb.toString());
        String a3 = qg9.a(a2 + str + "config.json");
        if (!new File(a2).exists() || !new File(a3).exists()) {
            D(atmosphereResItem);
            return;
        }
        atmosphereResItem.file = a2;
        d dVar = new d(atmosphereResItem, this.b, this.c, this.e, this.d);
        ((ArrayList) this.l).add(dVar);
        dVar.execute(new Void[0]);
    }
}

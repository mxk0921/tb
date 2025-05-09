package com.taobao.android.fluid.framework.data.datamodel;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.data.datamodel.MediaContentDetailData;
import com.taobao.android.fluid.framework.scene.ISceneConfigService;
import com.taobao.trtc.api.TrtcConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import tb.c4o;
import tb.fkg;
import tb.fsp;
import tb.hn4;
import tb.ir9;
import tb.kon;
import tb.lak;
import tb.mca;
import tb.nwv;
import tb.p91;
import tb.pg1;
import tb.pr9;
import tb.prp;
import tb.r8e;
import tb.sz3;
import tb.t2o;
import tb.tzv;
import tb.vt6;
import tb.xv4;
import tb.zyw;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "MediaSetData";
    public static final int TYPE_ALBUM = 1;
    public static final int TYPE_CACHE_VIDEO = 100;
    public static final int TYPE_EXT = 4;
    public static final int TYPE_LIVEVIDEO = 2;
    public static final int TYPE_PICTURE_ALBUM = 3;
    public static final int TYPE_SHORTVIDEO = 0;
    public static final int TYPE_UNKNOWN = -1;
    public static final int TYPE_WEB = 5;

    /* renamed from: a  reason: collision with root package name */
    public final LinkedList<d> f7799a;
    public final MediaContentDetailData b;
    public final String c;
    public tzv d;
    public volatile long e = -1;
    public volatile long f = -1;
    public volatile int g = -1;
    public volatile String h;
    public volatile String i;
    public boolean j;
    public final int k;
    public final int l;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final d f7800a;

        static {
            t2o.a(468714206);
        }

        public final String a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("c2d79c05", new Object[]{this});
            }
            if (d.a(this.f7800a) == null) {
                return null;
            }
            return d.a(this.f7800a).id;
        }

        public final String b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("9675f7c1", new Object[]{this});
            }
            if (d.a(this.f7800a) == null || d.a(this.f7800a).content == null) {
                return "";
            }
            return d.a(this.f7800a).content.coverUrl;
        }

        public final String c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("426047ff", new Object[]{this});
            }
            return this.f7800a.M();
        }

        public b(d dVar) {
            this.f7800a = dVar;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class c extends b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(468714207);
        }

        public c(d dVar) {
            super(dVar);
        }

        public static LiveElement d(MediaContentDetailData mediaContentDetailData) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (LiveElement) ipChange.ipc$dispatch("d5bafc1", new Object[]{mediaContentDetailData});
            }
            MediaContentDetailData.Content content = mediaContentDetailData.content;
            if (content == null) {
                return null;
            }
            JSONObject jSONObject = (JSONObject) vt6.b(content.elements);
            if (!sz3.b(jSONObject) && "LIVE".equalsIgnoreCase((String) jSONObject.get("type"))) {
                return (LiveElement) JSON.toJavaObject(jSONObject, LiveElement.class);
            }
            return null;
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/framework/data/datamodel/MediaSetData$LiveDetail");
        }

        public boolean e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("800f189c", new Object[]{this})).booleanValue();
            }
            LiveElement d = d(d.a(this.f7800a));
            if (d != null) {
                return nwv.o(d.landscape, false);
            }
            return false;
        }

        public String f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("729ce667", new Object[]{this});
            }
            LiveElement d = d(d.a(this.f7800a));
            if (d == null) {
                return "";
            }
            return d.liveDetailUrl;
        }

        public String g() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("b6e3ce32", new Object[]{this});
            }
            LiveElement d = d(d.a(this.f7800a));
            if (d == null) {
                return "";
            }
            return d.liveId;
        }

        public Map<String, String> h() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("82a23a6c", new Object[]{this});
            }
            LiveElement d = d(d.a(this.f7800a));
            if (d == null) {
                return new HashMap();
            }
            return d.urls;
        }

        public JSONArray i() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONArray) ipChange.ipc$dispatch("55db97ee", new Object[]{this});
            }
            LiveElement d = d(d.a(this.f7800a));
            if (d == null) {
                return null;
            }
            return d.liveUrlList;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final JSONObject f7801a;
        public final Map b;
        public String c;
        public JSONObject d;
        public MediaContentDetailData e;
        public String f;
        public int g;
        public int h;
        public final a i;
        public boolean j;

        static {
            t2o.a(468714208);
        }

        public static /* synthetic */ MediaContentDetailData a(d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (MediaContentDetailData) ipChange.ipc$dispatch("dea50d85", new Object[]{dVar});
            }
            return dVar.e;
        }

        public static /* synthetic */ boolean b(d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("608a8bea", new Object[]{dVar})).booleanValue();
            }
            return dVar.B();
        }

        public static /* synthetic */ a c(d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("6c74fa2a", new Object[]{dVar});
            }
            return dVar.i;
        }

        public static String j(d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("ab99c02a", new Object[]{dVar});
            }
            if (dVar == null || !dVar.w()) {
                return "";
            }
            return "1";
        }

        public static int s(MediaContentDetailData mediaContentDetailData) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("77580c59", new Object[]{mediaContentDetailData})).intValue();
            }
            VideoElement r = r(mediaContentDetailData);
            if (r == null) {
                return 0;
            }
            return r.height;
        }

        public static String t(MediaContentDetailData mediaContentDetailData) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("9c587c06", new Object[]{mediaContentDetailData});
            }
            VideoElement r = r(mediaContentDetailData);
            if (r == null) {
                return null;
            }
            return r.videoId;
        }

        public static int u(MediaContentDetailData mediaContentDetailData) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("92c694e", new Object[]{mediaContentDetailData})).intValue();
            }
            VideoElement r = r(mediaContentDetailData);
            if (r == null) {
                return 0;
            }
            return r.width;
        }

        public boolean A() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5a1c7166", new Object[]{this})).booleanValue();
            }
            if (a.a(M()) == 3) {
                return true;
            }
            return false;
        }

        public final boolean B() {
            MediaContentDetailData.Content content;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("3cf7096", new Object[]{this})).booleanValue();
            }
            MediaContentDetailData mediaContentDetailData = this.e;
            if (mediaContentDetailData == null || (content = mediaContentDetailData.content) == null || !content.isSecondPageUpBar) {
                return false;
            }
            return true;
        }

        public boolean C() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("1e805234", new Object[]{this})).booleanValue();
            }
            if (a.a(M()) == 0) {
                return true;
            }
            return false;
        }

        public boolean D() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("654da4de", new Object[]{this})).booleanValue();
            }
            MediaContentDetailData.PlayletInfo p = p();
            if (p == null || p.free || !p.locked) {
                return true;
            }
            return false;
        }

        public void E(MediaContentDetailData mediaContentDetailData) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e028335", new Object[]{this, mediaContentDetailData});
            } else {
                this.e = mediaContentDetailData;
            }
        }

        public void F(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4a029777", new Object[]{this, new Boolean(z)});
            } else {
                ((HashMap) this.b).put(c4o.KEY_ISAUTOSLIDE, Boolean.valueOf(z));
            }
        }

        public void G() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("95679f3d", new Object[]{this});
            } else {
                ((HashMap) this.b).put("isCache", Boolean.TRUE);
            }
        }

        public String H() {
            MediaContentDetailData.Config config;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("2c8fccea", new Object[]{this});
            }
            MediaContentDetailData mediaContentDetailData = this.e;
            if (mediaContentDetailData == null || (config = mediaContentDetailData.config) == null) {
                return null;
            }
            return nwv.I(config.slidePageUrl, null);
        }

        public String I() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("55f873a1", new Object[]{this});
            }
            MediaContentDetailData.Content e = e();
            if (e == null) {
                return null;
            }
            return e.title;
        }

        public c J() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("b19b5183", new Object[]{this});
            }
            if (a.a(M()) == 2) {
                return new c(this);
            }
            return null;
        }

        public e K() {
            fsp fspVar;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (e) ipChange.ipc$dispatch("829f6063", new Object[]{this});
            }
            if (a.a(M()) != 0) {
                return null;
            }
            if (this.i.n() instanceof fsp) {
                fspVar = (fsp) this.i.n();
            } else {
                fspVar = null;
            }
            return new e(this, fspVar);
        }

        public f L() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (f) ipChange.ipc$dispatch("39381aff", new Object[]{this});
            }
            if (a.a(M()) == 5) {
                return new f(this);
            }
            return null;
        }

        public String M() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("426047ff", new Object[]{this});
            }
            MediaContentDetailData mediaContentDetailData = this.e;
            if (mediaContentDetailData == null) {
                return null;
            }
            return mediaContentDetailData.type;
        }

        public String O() {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("12e5d9c3", new Object[]{this});
            }
            if (TextUtils.isEmpty(this.f)) {
                MediaContentDetailData mediaContentDetailData = this.e;
                if (mediaContentDetailData == null) {
                    str = null;
                } else {
                    str = t(mediaContentDetailData);
                }
                this.f = str;
            }
            return this.f;
        }

        public int P() {
            int i = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("fcdb5f40", new Object[]{this})).intValue();
            }
            if (this.g == -1) {
                MediaContentDetailData mediaContentDetailData = this.e;
                if (mediaContentDetailData != null) {
                    i = u(mediaContentDetailData);
                }
                this.g = i;
            }
            return this.g;
        }

        public String d() {
            MediaContentDetailData.Account account;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("4bc3cf8e", new Object[]{this});
            }
            MediaContentDetailData mediaContentDetailData = this.e;
            if (mediaContentDetailData == null || (account = mediaContentDetailData.account) == null) {
                return "";
            }
            return account.idStr;
        }

        public MediaContentDetailData.Content e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (MediaContentDetailData.Content) ipChange.ipc$dispatch("d86f9dd4", new Object[]{this});
            }
            MediaContentDetailData mediaContentDetailData = this.e;
            if (mediaContentDetailData == null) {
                return null;
            }
            return mediaContentDetailData.content;
        }

        public String f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("c2d79c05", new Object[]{this});
            }
            MediaContentDetailData mediaContentDetailData = this.e;
            if (mediaContentDetailData == null) {
                return null;
            }
            return mediaContentDetailData.id;
        }

        public MediaContentDetailData g() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (MediaContentDetailData) ipChange.ipc$dispatch("37db9558", new Object[]{this});
            }
            return this.e;
        }

        public Map h(FluidContext fluidContext) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("cac2991b", new Object[]{this, fluidContext});
            }
            MediaContentDetailData mediaContentDetailData = this.e;
            if (mediaContentDetailData == null) {
                return new HashMap();
            }
            JSONObject jSONObject = (JSONObject) JSON.toJSON(mediaContentDetailData);
            jSONObject.put(pg1.ATOM_raw, (Object) this.d);
            jSONObject.put("cardMap", (Object) this.f7801a);
            mca globalState = ((ISceneConfigService) fluidContext.getService(ISceneConfigService.class)).getGlobalState();
            if (globalState != null) {
                jSONObject.put("pageMap", (Object) globalState.f23939a);
            }
            jSONObject.put("processMap", (Object) p91.processMap);
            jSONObject.put("extraMap", (Object) o());
            return jSONObject;
        }

        public Map k() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("7c837996", new Object[]{this});
            }
            MediaContentDetailData mediaContentDetailData = this.e;
            if (mediaContentDetailData != null) {
                return mediaContentDetailData.contentPassParams;
            }
            return null;
        }

        public int l() {
            MediaContentDetailData.Content content;
            int i;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("a9bde388", new Object[]{this})).intValue();
            }
            MediaContentDetailData mediaContentDetailData = this.e;
            if (mediaContentDetailData == null) {
                content = null;
            } else {
                content = mediaContentDetailData.content;
            }
            if (content == null) {
                i = 0;
            } else {
                i = lak.c(content.status);
            }
            if (this.e.publishStatus != null) {
                return 0;
            }
            return i;
        }

        public String m() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("940b5fba", new Object[]{this});
            }
            MediaContentDetailData mediaContentDetailData = this.e;
            String str = "";
            if (mediaContentDetailData == null) {
                return str;
            }
            MediaContentDetailData.Content content = mediaContentDetailData.content;
            if (content != null) {
                str = content.errorText;
            }
            ir9.b(a.TAG, "NewContentErrorStatus 异常内容，下发文案/icon content.errorText=" + str);
            return str;
        }

        public String n() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("1843bb5c", new Object[]{this});
            }
            MediaContentDetailData mediaContentDetailData = this.e;
            String str = "";
            if (mediaContentDetailData == null) {
                return str;
            }
            MediaContentDetailData.Content content = mediaContentDetailData.content;
            if (content != null) {
                str = content.errorUrl;
            }
            ir9.b(a.TAG, "NewContentErrorStatus 异常内容，下发文案/icon content.errorUrl=" + str);
            return str;
        }

        public Map o() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("7f6b169e", new Object[]{this});
            }
            return this.b;
        }

        public MediaContentDetailData.PlayletInfo p() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (MediaContentDetailData.PlayletInfo) ipChange.ipc$dispatch("516571d2", new Object[]{this});
            }
            MediaContentDetailData mediaContentDetailData = this.e;
            if (mediaContentDetailData != null) {
                return mediaContentDetailData.playletInfo;
            }
            return null;
        }

        public MediaContentDetailData.TopTitle q() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (MediaContentDetailData.TopTitle) ipChange.ipc$dispatch("16a3a4e6", new Object[]{this});
            }
            MediaContentDetailData g = g();
            if (g == null) {
                return null;
            }
            return g.topTitle;
        }

        public int v() {
            int i = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("58c32a21", new Object[]{this})).intValue();
            }
            if (this.h == -1) {
                MediaContentDetailData mediaContentDetailData = this.e;
                if (mediaContentDetailData != null) {
                    i = s(mediaContentDetailData);
                }
                this.h = i;
            }
            return this.h;
        }

        public boolean w() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("c8b84db2", new Object[]{this})).booleanValue();
            }
            try {
                MediaContentDetailData g = g();
                if (g == null || sz3.b(g.contentAdParams) || sz3.b(g.utPairs)) {
                    return false;
                }
                if (TextUtils.equals(String.valueOf(g.utPairs.get("is_ad")), "1")) {
                    return true;
                }
                return false;
            } catch (Throwable th) {
                ir9.c(a.TAG, "", th);
                return false;
            }
        }

        public boolean x() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("252be503", new Object[]{this})).booleanValue();
            }
            if (z()) {
                return true;
            }
            return nwv.o(((HashMap) this.b).get("isCache"), false);
        }

        public boolean y() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("c672dec5", new Object[]{this})).booleanValue();
            }
            if (hn4.b()) {
                MediaContentDetailData.Content e = e();
                if (e == null || e.isValid) {
                    return true;
                }
                return false;
            } else if (l() == 0) {
                return true;
            } else {
                return false;
            }
        }

        public boolean z() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("bc562d46", new Object[]{this})).booleanValue();
            }
            MediaContentDetailData mediaContentDetailData = this.e;
            if (mediaContentDetailData == null || !mediaContentDetailData.isLocalPreCacheVideo) {
                return false;
            }
            return true;
        }

        public d(int i, MediaContentDetailData mediaContentDetailData, a aVar) {
            this.f7801a = new JSONObject();
            HashMap hashMap = new HashMap();
            this.b = hashMap;
            this.d = null;
            this.g = -1;
            this.h = -1;
            this.j = false;
            this.e = mediaContentDetailData;
            this.i = aVar;
            Boolean bool = Boolean.FALSE;
            hashMap.put("isCache", bool);
            hashMap.put(c4o.KEY_ISAUTOSLIDE, bool);
        }

        public static VideoElement r(MediaContentDetailData mediaContentDetailData) {
            MediaContentDetailData.Content content;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (VideoElement) ipChange.ipc$dispatch("3438a907", new Object[]{mediaContentDetailData});
            }
            VideoElement videoElement = null;
            if (!"VIDEO".equalsIgnoreCase(mediaContentDetailData.type) || (content = mediaContentDetailData.content) == null) {
                return null;
            }
            List<JSONObject> list = content.elements;
            if (list != null && !list.isEmpty()) {
                if (content.videoElement != null) {
                    ir9.b(a.TAG, "videoElement不为null,return,id:" + content.videoElement.videoId);
                    return content.videoElement;
                }
                JSONObject jSONObject = content.elements.get(0);
                if (!sz3.b(jSONObject) && "VIDEO".equalsIgnoreCase((String) jSONObject.get("type"))) {
                    ir9.b(a.TAG, "videoElement构建:" + jSONObject.toJSONString());
                    try {
                        videoElement = (VideoElement) JSON.toJavaObject(jSONObject, VideoElement.class);
                    } catch (Throwable th) {
                        ir9.b(a.TAG, "getVideoElement error:" + th);
                    }
                    content.videoElement = videoElement;
                }
            }
            return videoElement;
        }

        public String N() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("d80722dc", new Object[]{this});
            }
            int k = a.k(g());
            if (k == 0) {
                return "video";
            }
            if (k == 1) {
                return "picture";
            }
            if (k == 2) {
                return "live";
            }
            if (k == 3) {
                return "picture_album";
            }
            if (k == 4) {
                return TrtcConstants.TRTC_PARAMS_EXTENSION;
            }
            if (k != 5) {
                return "unknown";
            }
            return "game";
        }

        public int i() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("8c90e80e", new Object[]{this})).intValue();
            }
            try {
                JSONObject jSONObject = this.e.content.elements.get(0);
                if (sz3.b(jSONObject) || !"VIDEO".equalsIgnoreCase((String) jSONObject.get("type"))) {
                    return 0;
                }
                return vt6.j((String) jSONObject.get("duration"), 0);
            } catch (Exception unused) {
                return 0;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class e extends b {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public String b;
        public org.json.JSONObject c;
        public final fsp d;

        static {
            t2o.a(468714209);
        }

        public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/framework/data/datamodel/MediaSetData$ShortVideoDetail");
        }

        public int d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("8c90e80e", new Object[]{this})).intValue();
            }
            VideoElement k = k(d.a(this.f7800a));
            if (k == null) {
                return 0;
            }
            return k.duration;
        }

        public String e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("affce6a7", new Object[]{this});
            }
            VideoElement k = k(d.a(this.f7800a));
            if (k == null) {
                return "";
            }
            return k.firstFrameUrl;
        }

        public String f(FluidContext fluidContext) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("7d591e99", new Object[]{this, fluidContext});
            }
            fsp fspVar = this.d;
            if (fspVar != null) {
                str = fspVar.I();
            } else {
                str = null;
            }
            if (TextUtils.isEmpty(str)) {
                str = xv4.a(e(), i(fluidContext, null, false));
                fsp fspVar2 = this.d;
                if (fspVar2 != null) {
                    fspVar2.T(str);
                }
            }
            return str;
        }

        public String g() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("46f29fd6", new Object[]{this});
            }
            return this.b;
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0068  */
        /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public tb.r8e h(com.taobao.android.fluid.core.FluidContext r10, tb.prp r11, int r12, int r13, boolean r14) {
            /*
                r9 = this;
                r0 = 1
                r1 = 0
                com.android.alibaba.ip.runtime.IpChange r2 = com.taobao.android.fluid.framework.data.datamodel.a.e.$ipChange
                boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
                if (r3 == 0) goto L_0x0033
                java.lang.Integer r3 = new java.lang.Integer
                r3.<init>(r12)
                java.lang.Integer r12 = new java.lang.Integer
                r12.<init>(r13)
                java.lang.Boolean r13 = new java.lang.Boolean
                r13.<init>(r14)
                r14 = 6
                java.lang.Object[] r14 = new java.lang.Object[r14]
                r14[r1] = r9
                r14[r0] = r10
                r10 = 2
                r14[r10] = r11
                r10 = 3
                r14[r10] = r3
                r10 = 4
                r14[r10] = r12
                r10 = 5
                r14[r10] = r13
                java.lang.String r10 = "257e5ee6"
                java.lang.Object r10 = r2.ipc$dispatch(r10, r14)
                tb.r8e r10 = (tb.r8e) r10
                return r10
            L_0x0033:
                if (r14 != 0) goto L_0x0065
                if (r11 == 0) goto L_0x005c
                tb.atb r14 = r11.getDWInstance()
                if (r14 == 0) goto L_0x005c
                tb.atb r14 = r11.getDWInstance()
                android.view.ViewGroup r14 = r14.getView()
                if (r14 == 0) goto L_0x005c
                tb.atb r11 = r11.getDWInstance()
                android.view.ViewGroup r11 = r11.getView()
                int r14 = com.taobao.taobao.R.id.fluid_sdk_tag_prerender_videosize_object
                java.lang.Object r11 = r11.getTag(r14)
                boolean r14 = r11 instanceof tb.r8e
                if (r14 == 0) goto L_0x005c
                tb.r8e r11 = (tb.r8e) r11
                return r11
            L_0x005c:
                tb.fsp r11 = r9.d
                if (r11 == 0) goto L_0x0065
                tb.r8e r11 = r11.M()
                goto L_0x0066
            L_0x0065:
                r11 = 0
            L_0x0066:
                if (r11 != 0) goto L_0x00a9
                java.lang.Class<com.taobao.android.fluid.framework.container.IContainerService> r11 = com.taobao.android.fluid.framework.container.IContainerService.class
                com.taobao.android.fluid.core.FluidService r11 = r10.getService(r11)
                com.taobao.android.fluid.framework.container.IContainerService r11 = (com.taobao.android.fluid.framework.container.IContainerService) r11
                tb.r8e r14 = new tb.r8e
                r14.<init>(r10, r12, r13)
                boolean r12 = tb.f2k.d(r10)
                com.taobao.android.fluid.framework.data.datamodel.a$d r13 = r9.f7800a
                com.taobao.android.fluid.framework.data.datamodel.a r13 = com.taobao.android.fluid.framework.data.datamodel.a.d.c(r13)
                int r13 = r13.l
                if (r12 == 0) goto L_0x0089
                if (r13 <= 0) goto L_0x0087
                r5 = 1
                goto L_0x008e
            L_0x0087:
                r5 = 0
                goto L_0x008e
            L_0x0089:
                boolean r0 = r11.isHighActionbar()
                r5 = r0
            L_0x008e:
                if (r12 == 0) goto L_0x0092
                r6 = r13
                goto L_0x0097
            L_0x0092:
                int r12 = r11.getWeexActionBarHeight()
                r6 = r12
            L_0x0097:
                int r3 = r11.getWindowWidth()
                int r4 = r11.getWindowHeight()
                r8 = 0
                r2 = r10
                r7 = r14
                tb.bbw.j(r2, r3, r4, r5, r6, r7, r8)
                r9.q(r14)
                r11 = r14
            L_0x00a9:
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.fluid.framework.data.datamodel.a.e.h(com.taobao.android.fluid.core.FluidContext, tb.prp, int, int, boolean):tb.r8e");
        }

        public r8e i(FluidContext fluidContext, prp prpVar, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (r8e) ipChange.ipc$dispatch("11818006", new Object[]{this, fluidContext, prpVar, new Boolean(z)});
            }
            return h(fluidContext, prpVar, x(), n(), z);
        }

        public VideoElement j() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (VideoElement) ipChange.ipc$dispatch("b997233a", new Object[]{this});
            }
            return k(d.a(this.f7800a));
        }

        public org.json.JSONObject l() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (org.json.JSONObject) ipChange.ipc$dispatch("b299ddf9", new Object[]{this});
            }
            if (this.c == null) {
                String m = m();
                if (!TextUtils.isEmpty(m)) {
                    try {
                        this.c = new org.json.JSONObject(m);
                    } catch (Exception e) {
                        ir9.c(a.TAG, "getVideoResourceObj error:", e);
                    }
                }
            }
            return this.c;
        }

        public String m() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("12f8727b", new Object[]{this});
            }
            VideoElement k = k(d.a(this.f7800a));
            if (k == null) {
                return null;
            }
            return k.resourceStr;
        }

        public int n() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("58c32a21", new Object[]{this})).intValue();
            }
            VideoElement k = k(d.a(this.f7800a));
            if (k == null) {
                return 0;
            }
            return k.height;
        }

        public boolean p() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("3cf7096", new Object[]{this})).booleanValue();
            }
            d dVar = this.f7800a;
            if (dVar == null) {
                return false;
            }
            return d.b(dVar);
        }

        public void q(r8e r8eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f20ed0b2", new Object[]{this, r8eVar});
                return;
            }
            fsp fspVar = this.d;
            if (fspVar != null) {
                fspVar.U(r8eVar);
            }
        }

        public void r(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("88586b5b", new Object[]{this, str});
                return;
            }
            VideoElement k = k(d.a(this.f7800a));
            if (k != null) {
                k.resourceStr = str;
                this.c = null;
            }
        }

        public void s(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b2da5081", new Object[]{this, str});
            } else {
                this.b = str;
            }
        }

        public String t() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("12e5d9c3", new Object[]{this});
            }
            VideoElement k = k(d.a(this.f7800a));
            if (k == null) {
                return "";
            }
            return k.videoId;
        }

        public final String u() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("d4d65443", new Object[]{this});
            }
            VideoElement k = k(d.a(this.f7800a));
            if (k == null) {
                return "";
            }
            return k.videoSource;
        }

        public final String v() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("799003c4", new Object[]{this});
            }
            VideoElement k = k(d.a(this.f7800a));
            if (k == null) {
                return "";
            }
            return k.videoType;
        }

        public String w() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("6e39ac85", new Object[]{this});
            }
            VideoElement k = k(d.a(this.f7800a));
            if (k == null) {
                return "";
            }
            return k.url;
        }

        public int x() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("fcdb5f40", new Object[]{this})).intValue();
            }
            VideoElement k = k(d.a(this.f7800a));
            if (k == null) {
                return 0;
            }
            return k.width;
        }

        public e(d dVar, fsp fspVar) {
            super(dVar);
            this.d = fspVar;
        }

        public static VideoElement k(MediaContentDetailData mediaContentDetailData) {
            MediaContentDetailData.Content content;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (VideoElement) ipChange.ipc$dispatch("3438a907", new Object[]{mediaContentDetailData});
            }
            VideoElement videoElement = null;
            if (!"VIDEO".equalsIgnoreCase(mediaContentDetailData.type) || (content = mediaContentDetailData.content) == null) {
                return null;
            }
            List<JSONObject> list = content.elements;
            if (list != null && !list.isEmpty()) {
                VideoElement videoElement2 = content.videoElement;
                if (videoElement2 != null) {
                    return videoElement2;
                }
                JSONObject jSONObject = content.elements.get(0);
                if (!sz3.b(jSONObject) && "VIDEO".equalsIgnoreCase((String) jSONObject.get("type"))) {
                    ir9.b(a.TAG, "videoElement构建2:" + jSONObject.toJSONString());
                    try {
                        videoElement = (VideoElement) JSON.toJavaObject(jSONObject, VideoElement.class);
                    } catch (Throwable th) {
                        ir9.b(a.TAG, "getVideoElement2 error:" + th);
                    }
                    content.videoElement = videoElement;
                }
            }
            return videoElement;
        }

        public boolean o() {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("9535d425", new Object[]{this})).booleanValue();
            }
            VideoElement k = k(d.a(this.f7800a));
            if (k != null && (str = k.url) != null && !str.startsWith("https") && !k.url.startsWith("http")) {
                if (k.url.startsWith("/storage")) {
                    return true;
                }
                ir9.b(a.TAG, "解析失败url中的内容为" + k.url);
            }
            return false;
        }
    }

    static {
        t2o.a(468714204);
    }

    public a(MediaContentDetailData mediaContentDetailData, JSONObject jSONObject) {
        LinkedList<d> linkedList = new LinkedList<>();
        this.f7799a = linkedList;
        this.k = 0;
        this.l = 0;
        d dVar = new d(0, mediaContentDetailData, this);
        dVar.d = jSONObject;
        linkedList.add(dVar);
        this.b = mediaContentDetailData;
        if (mediaContentDetailData != null) {
            this.l = pr9.q(mediaContentDetailData.contentBottomGap);
            this.k = pr9.q(mediaContentDetailData.progressBarBottomGapMore);
            this.c = mediaContentDetailData.id;
        }
    }

    public static /* synthetic */ int a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bd2b2e75", new Object[]{str})).intValue();
        }
        return l(str);
    }

    public static kon.h b(List<JSONObject> list, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kon.h) ipChange.ipc$dispatch("c0d2ada8", new Object[]{list, str, str2});
        }
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = new JSONArray();
        MediaContentDetailData mediaContentDetailData = new MediaContentDetailData();
        MediaContentDetailData.Content content = new MediaContentDetailData.Content();
        ArrayList arrayList2 = new ArrayList();
        content.elements = arrayList2;
        arrayList2.addAll(list);
        content.music = str2;
        mediaContentDetailData.type = "PICTURE_ALBUM";
        mediaContentDetailData.content = content;
        mediaContentDetailData.publishStatus = fkg.PAGE_PUBLISH;
        jSONArray.add(new JSONObject());
        arrayList.add(mediaContentDetailData);
        return new kon.h(null, arrayList, jSONArray, null, null);
    }

    public static kon.h c(String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kon.h) ipChange.ipc$dispatch("5bd41b7b", new Object[]{str, str2, str3, str4, str5});
        }
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = new JSONArray();
        MediaContentDetailData mediaContentDetailData = new MediaContentDetailData();
        MediaContentDetailData.Content content = new MediaContentDetailData.Content();
        ArrayList arrayList2 = new ArrayList();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", (Object) "VIDEO");
        jSONObject.put("url", (Object) str);
        jSONObject.put("height", (Object) str2);
        jSONObject.put("width", (Object) str3);
        arrayList2.add(jSONObject);
        content.elements = arrayList2;
        mediaContentDetailData.type = "VIDEO";
        mediaContentDetailData.content = content;
        mediaContentDetailData.publishStatus = fkg.PAGE_PUBLISH;
        jSONArray.add(new JSONObject());
        arrayList.add(mediaContentDetailData);
        return new kon.h(null, arrayList, jSONArray, null, null);
    }

    public static int f(a aVar) {
        d e2;
        MediaContentDetailData g;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("42fb4ae7", new Object[]{aVar})).intValue();
        }
        if (aVar == null || (e2 = aVar.e()) == null || (g = e2.g()) == null) {
            return -1;
        }
        return g.index;
    }

    public static a h(List<a> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("3eff4637", new Object[]{list});
        }
        if (sz3.a(list)) {
            return null;
        }
        return list.get(0);
    }

    public static int k(MediaContentDetailData mediaContentDetailData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f7109595", new Object[]{mediaContentDetailData})).intValue();
        }
        if (mediaContentDetailData == null) {
            return -1;
        }
        return l(mediaContentDetailData.type);
    }

    public static int l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("95cd770c", new Object[]{str})).intValue();
        }
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        String upperCase = str.toUpperCase();
        if (TextUtils.equals(upperCase, "VIDEO")) {
            return 0;
        }
        if (TextUtils.equals(upperCase, "COLLECTION")) {
            return 1;
        }
        if (TextUtils.equals(upperCase, "LIVE")) {
            return 2;
        }
        if (TextUtils.equals(upperCase, "PICTURE_ALBUM")) {
            return 3;
        }
        if (TextUtils.equals(upperCase, "EXT")) {
            return 4;
        }
        if (!zyw.e() || !TextUtils.equals(upperCase, "GGGAME")) {
            return -1;
        }
        return 5;
    }

    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8392bcfb", new Object[]{this});
        }
        return this.c;
    }

    public d e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("548daa07", new Object[]{this});
        }
        return this.f7799a.get(0);
    }

    public d g(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("4cb52987", new Object[]{this, new Integer(i)});
        }
        if (i < 0 || i >= this.f7799a.size()) {
            return null;
        }
        return this.f7799a.get(i);
    }

    public MediaContentDetailData i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MediaContentDetailData) ipChange.ipc$dispatch("5601f21c", new Object[]{this});
        }
        return this.b;
    }

    public int j(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6a4f81c7", new Object[]{this, new Integer(i)})).intValue();
        }
        d g = g(i);
        if (g == null) {
            return -1;
        }
        return l(g.M());
    }

    public String m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5d4f79ae", new Object[]{this});
        }
        return e().g().publishStatus;
    }

    public tzv n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tzv) ipChange.ipc$dispatch("621f78a1", new Object[]{this});
        }
        return this.d;
    }

    public boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("64002781", new Object[]{this})).booleanValue();
        }
        return this.j;
    }

    public void p(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6ff842f", new Object[]{this, new Boolean(z)});
        } else {
            this.j = z;
        }
    }

    public void q(tzv tzvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("476dd96f", new Object[]{this, tzvVar});
        } else {
            this.d = tzvVar;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class f extends b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(468714210);
        }

        public f(d dVar) {
            super(dVar);
        }

        public static MediaContentDetailData.Material f(MediaContentDetailData mediaContentDetailData) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (MediaContentDetailData.Material) ipChange.ipc$dispatch("d61ff8f1", new Object[]{mediaContentDetailData});
            }
            MediaContentDetailData.Content content = mediaContentDetailData.content;
            if (content == null) {
                return null;
            }
            return content.material;
        }

        public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/framework/data/datamodel/MediaSetData$WebCardDetail");
        }

        public String d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("18bcaf48", new Object[]{this});
            }
            MediaContentDetailData.Material f = f(d.a(this.f7800a));
            if (f == null) {
                return "";
            }
            return f.toString();
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0052, code lost:
            if (r8.equals("url") == false) goto L_0x0032;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.String e(java.lang.String r8) {
            /*
                r7 = this;
                r0 = 1
                r1 = 0
                r2 = 2
                com.android.alibaba.ip.runtime.IpChange r3 = com.taobao.android.fluid.framework.data.datamodel.a.f.$ipChange
                boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
                if (r4 == 0) goto L_0x0018
                java.lang.String r4 = "22fbbe02"
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r2[r1] = r7
                r2[r0] = r8
                java.lang.Object r8 = r3.ipc$dispatch(r4, r2)
                java.lang.String r8 = (java.lang.String) r8
                return r8
            L_0x0018:
                com.taobao.android.fluid.framework.data.datamodel.a$d r3 = r7.f7800a
                com.taobao.android.fluid.framework.data.datamodel.MediaContentDetailData r3 = com.taobao.android.fluid.framework.data.datamodel.a.d.a(r3)
                com.taobao.android.fluid.framework.data.datamodel.MediaContentDetailData$Material r3 = f(r3)
                java.lang.String r4 = ""
                if (r3 != 0) goto L_0x0027
                return r4
            L_0x0027:
                r8.hashCode()
                r5 = -1
                int r6 = r8.hashCode()
                switch(r6) {
                    case 3355: goto L_0x0055;
                    case 116079: goto L_0x004b;
                    case 94852023: goto L_0x0040;
                    case 408162963: goto L_0x0034;
                    default: goto L_0x0032;
                }
            L_0x0032:
                r0 = -1
                goto L_0x005f
            L_0x0034:
                java.lang.String r0 = "loadingUrl"
                boolean r8 = r8.equals(r0)
                if (r8 != 0) goto L_0x003e
                goto L_0x0032
            L_0x003e:
                r0 = 3
                goto L_0x005f
            L_0x0040:
                java.lang.String r0 = "cover"
                boolean r8 = r8.equals(r0)
                if (r8 != 0) goto L_0x0049
                goto L_0x0032
            L_0x0049:
                r0 = 2
                goto L_0x005f
            L_0x004b:
                java.lang.String r1 = "url"
                boolean r8 = r8.equals(r1)
                if (r8 != 0) goto L_0x005f
                goto L_0x0032
            L_0x0055:
                java.lang.String r0 = "id"
                boolean r8 = r8.equals(r0)
                if (r8 != 0) goto L_0x005e
                goto L_0x0032
            L_0x005e:
                r0 = 0
            L_0x005f:
                switch(r0) {
                    case 0: goto L_0x006c;
                    case 1: goto L_0x0069;
                    case 2: goto L_0x0066;
                    case 3: goto L_0x0063;
                    default: goto L_0x0062;
                }
            L_0x0062:
                goto L_0x006e
            L_0x0063:
                java.lang.String r4 = r3.loadingUrl
                goto L_0x006e
            L_0x0066:
                java.lang.String r4 = r3.cover
                goto L_0x006e
            L_0x0069:
                java.lang.String r4 = r3.url
                goto L_0x006e
            L_0x006c:
                java.lang.String r4 = r3.id
            L_0x006e:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.fluid.framework.data.datamodel.a.f.e(java.lang.String):java.lang.String");
        }
    }
}

package com.taobao.avplayer;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Surface;
import android.view.View;
import android.widget.ImageView;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.DWHighPerformanceInstanceNew;
import com.taobao.avplayer.component.weex.WXSplayerModule;
import com.taobao.media.MediaConstant;
import com.taobao.media.MediaSystemUtils;
import com.taobao.mediaplay.MediaPlayCenter;
import com.taobao.mediaplay.model.MediaLiveInfo;
import com.taobao.mediaplay.model.MediaLiveWarmupConfig;
import com.taobao.mediaplay.model.QualityLiveItem;
import com.taobao.mediaplay.player.MediaAspectRatio;
import com.taobao.orange.OrangeConfig;
import com.taobao.taobaoavsdk.AVSDKLog;
import com.taobao.weex.WXEnvironment;
import com.taobao.weex.WXSDKEngine;
import com.taobao.weex.common.WXException;
import com.uc.webview.export.media.CommandID;
import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;
import tb.abk;
import tb.asc;
import tb.aub;
import tb.b75;
import tb.c2v;
import tb.cub;
import tb.d75;
import tb.dub;
import tb.e2n;
import tb.ew0;
import tb.feh;
import tb.fsc;
import tb.fub;
import tb.h95;
import tb.hsr;
import tb.htb;
import tb.isc;
import tb.ja1;
import tb.jgi;
import tb.jsb;
import tb.k95;
import tb.l95;
import tb.m75;
import tb.nj9;
import tb.qtb;
import tb.r65;
import tb.t2o;
import tb.tfb;
import tb.v85;
import tb.vrc;
import tb.xau;
import tb.y95;
import tb.yrr;
import tb.z75;
import tb.z95;
import tv.danmaku.ijk.media.player.IMediaPlayer;
import tv.danmaku.ijk.media.player.TaobaoMediaPlayer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class s {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final DWHighPerformanceInstanceNew f10212a;
    public final MediaPlayCenter b;
    public MediaPlayCenter c;
    public final int d;
    public d e;
    public List<asc> f;
    public final DWContext g;
    public final String h;
    public final String i;
    public boolean j;
    public final String k;
    public final String l;
    public final boolean m;
    public final Set<String> n;
    public final feh o;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements vrc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d f10213a;

        public a(s sVar, d dVar) {
            this.f10213a = dVar;
        }

        @Override // tb.vrc
        public void onLoopCompletion() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4a22ee66", new Object[]{this});
            } else {
                this.f10213a.I.onLoopCompletion();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements vrc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Object f10214a;

        public b(s sVar, Object obj) {
            this.f10214a = obj;
        }

        @Override // tb.vrc
        public void onLoopCompletion() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4a22ee66", new Object[]{this});
            } else {
                ((aub) this.f10214a).onLoopCompletion();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final yrr f10215a = yrr.c();

        static {
            t2o.a(451936308);
        }

        public static String a(d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("5e028f3d", new Object[]{dVar});
            }
            String f = f(dVar);
            if (TextUtils.isEmpty(f)) {
                return "";
            }
            return e2n.e(f);
        }

        public static s b(d dVar, jgi jgiVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (s) ipChange.ipc$dispatch("84deb19c", new Object[]{dVar, jgiVar});
            }
            String e = e(dVar);
            if (TextUtils.isEmpty(e)) {
                AVSDKLog.e(tfb.MODULE_SDK_PAGE, "lee +++ create player: reuseToken is null, return null");
                return null;
            } else if (jgiVar == null || jgiVar.b() == null) {
                return new s(dVar);
            } else {
                yrr yrrVar = f10215a;
                s d = yrrVar.d(e);
                if (d != null) {
                    s.b(d, dVar);
                } else {
                    d = new s(dVar, jgiVar.b());
                }
                if (dVar.d()) {
                    yrrVar.b(d, e);
                }
                d.L(e);
                return d;
            }
        }

        public static String d(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("ee23d1b5", new Object[]{str});
            }
            return str + UUID.randomUUID().toString();
        }

        public static String e(d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("feca128c", new Object[]{dVar});
            }
            String f = dVar.f();
            if (!TextUtils.isEmpty(f)) {
                AVSDKLog.e(tfb.MODULE_SDK_PAGE, "lee +++ reuseToken:" + f + "set by liveroom");
                return f;
            } else if (dVar.g() == 2) {
                return dVar.m;
            } else {
                String h = dVar.h();
                if (TextUtils.isEmpty(h)) {
                    h = h(dVar.U, f(dVar));
                    if (!TextUtils.isEmpty(h)) {
                        d.b(dVar, h);
                        AVSDKLog.e(tfb.MODULE_SDK_PAGE, "lee +++ parseTopicID reuseToken:" + h);
                    }
                }
                return TextUtils.isEmpty(h) ? a(dVar) : h;
            }
        }

        public static String f(d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("197be9ce", new Object[]{dVar});
            }
            if (dVar.k()) {
                return dVar.i();
            }
            AVSDKLog.e(tfb.MODULE_SDK_PAGE, "play error :nothing {playtoken, feedid, topic, url}");
            return null;
        }

        public static boolean g(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("ec4f6a65", new Object[]{str})).booleanValue();
            }
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            return f10215a.g(str);
        }

        public static s c(String str, d dVar) {
            s sVar;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (s) ipChange.ipc$dispatch("3afc44be", new Object[]{str, dVar});
            }
            if (ew0.n(dVar.o, OrangeConfig.getInstance().getConfig("DWInteractive", "reuseBlackList", "[\"recmd\"]"))) {
                AVSDKLog.e(tfb.MODULE_SDK_PAGE, "TBPlayer create without reuse, sbt=" + dVar.o);
                return new s(dVar);
            }
            String e = e(dVar);
            if (dVar.j() || dVar.d() || f10215a.e() > 0) {
                sVar = dVar.j() ? f10215a.d(e) : null;
                if (sVar != null) {
                    feh a2 = s.a(sVar);
                    AVSDKLog.e(a2, "TBPlayer create get reuse instance=" + sVar + ", sbt=" + dVar.o);
                    s.b(sVar, dVar);
                    e = f10215a.f(e);
                } else {
                    AVSDKLog.e(tfb.MODULE_SDK_PAGE, "TBPlayer create new instance with failed reused =" + sVar + ", sbt=" + dVar.o);
                    sVar = new s(dVar);
                    dVar.f = 0;
                    e = d(e);
                }
                if (dVar.d()) {
                    AVSDKLog.e(tfb.MODULE_SDK_PAGE, "TBPlayer create new instance and add to reuseManager =" + sVar + ", sbt=" + dVar.o);
                    f10215a.b(sVar, e);
                    sVar.L(e);
                } else {
                    AVSDKLog.e(tfb.MODULE_SDK_PAGE, "TBPlayer create new instance and add to reuseManager =" + sVar + ", sbt=" + dVar.o);
                    sVar.L(e);
                }
            } else {
                AVSDKLog.e(tfb.MODULE_SDK_PAGE, "TBPlayer create without reuse, sbt=" + dVar.o);
                sVar = new s(dVar);
                dVar.f = 0;
            }
            feh a3 = s.a(sVar);
            AVSDKLog.e(a3, "lee +++ create player:" + sVar + ", isReuse:" + dVar.j() + ", canReuse:" + dVar.d() + ", reuseToken:" + e + ", mPlayerReuseState:" + dVar.f);
            return sVar;
        }

        public static String h(MediaLiveInfo mediaLiveInfo, String str) {
            int i;
            String str2;
            int indexOf;
            ArrayList<QualityLiveItem> arrayList;
            JSONArray jSONArray;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("9fc7f317", new Object[]{mediaLiveInfo, str});
            }
            if (!(mediaLiveInfo == null || (jSONArray = mediaLiveInfo.liveUrlListJson) == null)) {
                mediaLiveInfo.updateLiveUrlList(jSONArray);
                AVSDKLog.e(tfb.MODULE_SDK_PAGE, "parseTopicID mediaLiveInfo.liveUrlList:" + mediaLiveInfo.liveUrlList);
            }
            if (ew0.s(OrangeConfig.getInstance().getConfig("DWInteractive", "selectFirstURLList", "true"))) {
                AVSDKLog.e(tfb.MODULE_SDK_PAGE, "parseTopicID select first URLList");
                i = 0;
            } else {
                i = 1;
            }
            if (mediaLiveInfo == null || (arrayList = mediaLiveInfo.liveUrlList) == null || arrayList.size() <= i || mediaLiveInfo.liveUrlList.get(i) == null) {
                AVSDKLog.e(tfb.MODULE_SDK_PAGE, " mediaLiveInfo.liveUrlList is null or size=0");
                str2 = null;
            } else {
                if (mediaLiveInfo.liveUrlList.get(i).rtcLiveUrl != null) {
                    str = mediaLiveInfo.liveUrlList.get(i).rtcLiveUrl;
                    str2 = "?";
                } else {
                    str = null;
                    str2 = null;
                }
                if (TextUtils.isEmpty(str) && mediaLiveInfo.liveUrlList.get(i).flvUrl != null) {
                    str = mediaLiveInfo.liveUrlList.get(i).flvUrl;
                    str2 = ".";
                }
                AVSDKLog.e(tfb.MODULE_SDK_PAGE, " mediaLiveInfo.liveUrlList size :" + mediaLiveInfo.liveUrlList.size());
            }
            if (!TextUtils.isEmpty(str)) {
                try {
                    String[] split = new URI(str).getPath().split("/");
                    if (split.length - 1 >= 0) {
                        String str3 = split[split.length - 1];
                        return (str3 == null || (indexOf = str3.indexOf(str2)) < 0) ? str3 : str3.substring(0, indexOf);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            return null;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class d {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public Surface D;
        public fsc E;
        public isc F;
        public qtb G;
        public htb H;
        public aub I;
        public fub J;
        public dub K;
        public qtb L;
        public cub M;
        public MediaLiveInfo U;
        public JSONObject V;
        public ImageView e0;
        public jsb k0;

        /* renamed from: a  reason: collision with root package name */
        public boolean f10216a = false;
        public boolean b = false;
        public String c = "";
        public String d = "";
        public final String e = "";
        public int f = 0;
        public Activity g = null;
        public Context h = null;
        public boolean i = true;
        public String j = "TBVideo";
        public int k = 0;
        public String l = "";
        public String m = "";
        public String n = "";
        public String o = "";
        public boolean p = false;
        public DWAspectRatio q = DWAspectRatio.DW_CENTER_CROP;
        public int r = 2;
        public boolean s = false;
        public asc t = null;
        public nj9 u = null;
        public HashMap<String, String> v = new HashMap<>();
        public HashMap<String, String> w = new HashMap<>();
        public int x = 0;
        public int y = 0;
        public String z = "";
        public boolean A = false;
        public int B = 0;
        public String C = "";
        public boolean N = false;
        public boolean O = false;
        public boolean P = true;
        public String Q = "";
        public String R = "";
        public boolean S = false;
        public boolean T = false;
        public String W = "";
        public boolean X = false;
        public boolean Y = false;
        public DWInstanceType Z = DWInstanceType.VIDEO;
        public boolean a0 = false;
        public boolean b0 = false;
        public HashMap<String, String> c0 = new HashMap<>();
        public int d0 = 0;
        public boolean f0 = false;
        public final HashMap<String, String> g0 = new HashMap<>();
        public boolean h0 = false;
        public boolean i0 = false;
        public boolean j0 = false;

        static {
            t2o.a(451936309);
        }

        public static /* synthetic */ String a(d dVar, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("1d699ca5", new Object[]{dVar, str});
            }
            dVar.C = str;
            return str;
        }

        public static /* synthetic */ String b(d dVar, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("ce6bb228", new Object[]{dVar, str});
            }
            dVar.d = str;
            return str;
        }

        public static /* synthetic */ String c(d dVar, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("b4170ea9", new Object[]{dVar, str});
            }
            dVar.c = str;
            return str;
        }

        public boolean d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("ccc6bb0f", new Object[]{this})).booleanValue();
            }
            return this.b;
        }

        public String e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("dbb989ea", new Object[]{this});
            }
            return this.C;
        }

        public String f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("a21171fe", new Object[]{this});
            }
            return this.c;
        }

        public int g() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("24c94280", new Object[]{this})).intValue();
            }
            return this.r;
        }

        public String h() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("f2a1d120", new Object[]{this});
            }
            return this.d;
        }

        public String i() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("de8f0660", new Object[]{this});
            }
            return this.e;
        }

        public boolean j() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("3fa892f5", new Object[]{this})).booleanValue();
            }
            return this.f10216a;
        }

        public boolean k() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("1691d3bd", new Object[]{this})).booleanValue();
            }
            return true;
        }

        public void l(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1c477be7", new Object[]{this, new Boolean(z)});
            } else {
                this.b = z;
            }
        }

        public void m(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5064873b", new Object[]{this, new Boolean(z)});
            } else {
                this.f10216a = z;
            }
        }

        public void n(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("17065538", new Object[]{this, str});
            } else {
                this.c = str;
            }
        }
    }

    public s(d dVar, MediaPlayCenter mediaPlayCenter) {
        this.d = -1;
        this.j = false;
        this.k = "[\"LiveRoom\",\"TimeMovingPlay\",\"TBMiniLive\", \"shopLiveTab\", \"shop2fLive\", \"shopLiveTab\"]";
        this.l = "[\"TimeMovingPlay\"]";
        this.m = false;
        this.n = new HashSet();
        this.o = new feh(toString(), mediaPlayCenter.getPlayToken());
        this.e = dVar;
        int i = dVar.r;
        this.d = i;
        if (i == 0) {
            this.b = mediaPlayCenter;
        }
    }

    public static /* synthetic */ feh a(s sVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (feh) ipChange.ipc$dispatch("ae44a738", new Object[]{sVar});
        }
        return sVar.o;
    }

    public static /* synthetic */ void b(s sVar, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8e94b2c", new Object[]{sVar, dVar});
        } else {
            sVar.K(dVar);
        }
    }

    public static HashMap<String, String> w(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("72a80734", new Object[]{obj});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        if (obj != null && (obj instanceof Map)) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                if ((key instanceof String) && (value instanceof String) && value != null) {
                    hashMap.put((String) key, (String) value);
                }
            }
        }
        return hashMap;
    }

    public void A(Drawable drawable, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff1014bb", new Object[]{this, drawable, new Boolean(z)});
        } else if (!hsr.a().e("setCoverImg", this.e)) {
            this.n.add("setCoverImg");
        } else if (q()) {
            this.b.setCoverImg(drawable, z);
        } else {
            s();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.taobao.avplayer.TBPlayerConst$TBPlayerInvokeResult C(int r7, long r8) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.avplayer.s.C(int, long):com.taobao.avplayer.TBPlayerConst$TBPlayerInvokeResult");
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x014c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.taobao.avplayer.TBPlayerConst$TBPlayerInvokeResult D(int r4, java.lang.Object r5) {
        /*
            Method dump skipped, instructions count: 588
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.avplayer.s.D(int, java.lang.Object):com.taobao.avplayer.TBPlayerConst$TBPlayerInvokeResult");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.taobao.avplayer.TBPlayerConst$TBPlayerInvokeResult E(int r4, java.lang.String r5) {
        /*
            r3 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.avplayer.s.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x0020
            java.lang.Integer r1 = new java.lang.Integer
            r1.<init>(r4)
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r2 = 0
            r4[r2] = r3
            r2 = 1
            r4[r2] = r1
            r1 = 2
            r4[r1] = r5
            java.lang.String r5 = "92b86b3d"
            java.lang.Object r4 = r0.ipc$dispatch(r5, r4)
            com.taobao.avplayer.TBPlayerConst$TBPlayerInvokeResult r4 = (com.taobao.avplayer.TBPlayerConst$TBPlayerInvokeResult) r4
            return r4
        L_0x0020:
            r0 = 3000(0xbb8, float:4.204E-42)
            if (r4 == r0) goto L_0x002c
            r0 = 3009(0xbc1, float:4.217E-42)
            if (r4 == r0) goto L_0x008d
            switch(r4) {
                case 3004: goto L_0x0049;
                case 3005: goto L_0x0069;
                case 3006: goto L_0x007b;
                default: goto L_0x002b;
            }
        L_0x002b:
            goto L_0x00a0
        L_0x002c:
            com.taobao.avplayer.s$d r0 = r3.e
            r0.m = r5
            boolean r0 = r3.q()
            if (r0 == 0) goto L_0x003e
            com.taobao.mediaplay.MediaPlayCenter r4 = r3.b
            r4.setMediaId(r5)
            com.taobao.avplayer.TBPlayerConst$TBPlayerInvokeResult r4 = com.taobao.avplayer.TBPlayerConst$TBPlayerInvokeResult.TBPlayerInvokeResultSuccess
            return r4
        L_0x003e:
            boolean r0 = r3.s()
            if (r0 == 0) goto L_0x0049
            com.taobao.avplayer.DWHighPerformanceInstanceNew r0 = r3.f10212a
            r0.F0(r5)
        L_0x0049:
            com.taobao.avplayer.s$d r0 = r3.e
            r0.o = r5
            boolean r0 = r3.q()
            if (r0 == 0) goto L_0x005b
            com.taobao.mediaplay.MediaPlayCenter r4 = r3.b
            r4.setBizCode(r5)
            com.taobao.avplayer.TBPlayerConst$TBPlayerInvokeResult r4 = com.taobao.avplayer.TBPlayerConst$TBPlayerInvokeResult.TBPlayerInvokeResultSuccess
            return r4
        L_0x005b:
            boolean r0 = r3.s()
            if (r0 == 0) goto L_0x0069
            com.taobao.avplayer.DWHighPerformanceInstanceNew r4 = r3.f10212a
            r4.i0(r5)
            com.taobao.avplayer.TBPlayerConst$TBPlayerInvokeResult r4 = com.taobao.avplayer.TBPlayerConst$TBPlayerInvokeResult.TBPlayerInvokeResultSuccess
            return r4
        L_0x0069:
            com.taobao.avplayer.s$d r0 = r3.e
            r0.n = r5
            boolean r0 = r3.q()
            if (r0 == 0) goto L_0x007b
            com.taobao.mediaplay.MediaPlayCenter r4 = r3.b
            r4.setBusinessId(r5)
            com.taobao.avplayer.TBPlayerConst$TBPlayerInvokeResult r4 = com.taobao.avplayer.TBPlayerConst$TBPlayerInvokeResult.TBPlayerInvokeResultSuccess
            return r4
        L_0x007b:
            com.taobao.avplayer.s$d r0 = r3.e
            r0.z = r5
            boolean r0 = r3.q()
            if (r0 == 0) goto L_0x008d
            com.taobao.mediaplay.MediaPlayCenter r4 = r3.b
            r4.setVideoToken(r5)
            com.taobao.avplayer.TBPlayerConst$TBPlayerInvokeResult r4 = com.taobao.avplayer.TBPlayerConst$TBPlayerInvokeResult.TBPlayerInvokeResultSuccess
            return r4
        L_0x008d:
            com.taobao.avplayer.s$d r0 = r3.e
            r0.getClass()
            boolean r0 = r3.q()
            if (r0 == 0) goto L_0x00a0
            com.taobao.mediaplay.MediaPlayCenter r4 = r3.b
            r4.setMediaSourceType(r5)
            com.taobao.avplayer.TBPlayerConst$TBPlayerInvokeResult r4 = com.taobao.avplayer.TBPlayerConst$TBPlayerInvokeResult.TBPlayerInvokeResultSuccess
            return r4
        L_0x00a0:
            tb.feh r5 = r3.o
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "call setPlayerProperty with invalidKey="
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            com.taobao.taobaoavsdk.AVSDKLog.e(r5, r4)
            com.taobao.avplayer.TBPlayerConst$TBPlayerInvokeResult r4 = com.taobao.avplayer.TBPlayerConst$TBPlayerInvokeResult.TBPlayerInvokeResultInvalidKey
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.avplayer.s.E(int, java.lang.String):com.taobao.avplayer.TBPlayerConst$TBPlayerInvokeResult");
    }

    public void F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
            return;
        }
        if (q()) {
            if (!ew0.s(OrangeConfig.getInstance().getConfig("DWInteractive", "setupEarly", "true"))) {
                this.b.setup();
            }
            this.b.start();
            g();
        } else if (s()) {
            this.f10212a.O0();
        }
        HashMap hashMap = new HashMap();
        hashMap.put("tbplayer_start_time", System.currentTimeMillis() + "");
        D(4001, hashMap);
        this.e.f = 2;
    }

    public void G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c9262f5", new Object[]{this});
        } else if (this.c != null) {
            feh fehVar = this.o;
            AVSDKLog.e(fehVar, "thumbnail destroy :" + this.c);
            this.c.destroy();
            this.c = null;
        }
    }

    public View H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("1daf8c58", new Object[]{this});
        }
        if (this.c == null) {
            return null;
        }
        feh fehVar = this.o;
        AVSDKLog.e(fehVar, "thumbnail pts " + this.c.getCurrentPosition());
        return this.c.getView();
    }

    public void J(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc32239d", new Object[]{this, new Integer(i)});
            return;
        }
        MediaPlayCenter mediaPlayCenter = this.c;
        if (mediaPlayCenter != null) {
            mediaPlayCenter.seekTo(i, true, true);
        }
    }

    public final void K(d dVar) {
        asc ascVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcd7e92b", new Object[]{this, dVar});
            return;
        }
        d dVar2 = this.e;
        dVar.f = dVar2.f;
        dVar.p = dVar2.p;
        this.e = dVar;
        if (q() && (ascVar = dVar.t) != null) {
            this.b.setMediaLifecycleListener(ascVar);
            x(dVar.t);
        }
    }

    public void L(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8de1759f", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            d.c(this.e, str);
        }
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2489013b", new Object[]{this});
            return;
        }
        List<asc> list = this.f;
        if (list != null) {
            list.clear();
            this.f = null;
        }
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5039db8", new Object[]{this});
        } else if (this.n.size() > 0) {
            HashMap hashMap = new HashMap();
            hashMap.put("denyMethodName", TextUtils.join("_", this.n));
            D(4001, hashMap);
        }
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("979730db", new Object[]{this});
            return;
        }
        DWContext dWContext = this.g;
        if (dWContext == null || dWContext.mUTAdapter == null || this.e == null) {
            feh fehVar = this.o;
            AVSDKLog.e(fehVar, "TBPlayer CommitCloseUT failed mDWContext=" + this.g + ", mPlayerInfo=" + this.e);
            return;
        }
        HashMap hashMap = new HashMap();
        HashMap<String, String> hashMap2 = this.e.c0;
        if (hashMap2 != null) {
            hashMap.putAll(hashMap2);
        }
        Uri data = (this.g.getActivity() == null || this.g.getActivity().getIntent() == null) ? null : this.g.getActivity().getIntent().getData();
        if (data != null) {
            String queryParameter = data.getQueryParameter("spm");
            if (!TextUtils.isEmpty(queryParameter)) {
                hashMap.put("spm-url", queryParameter);
            }
        }
        hashMap.put(abk.FROM_FULL, "0");
        hashMap.put("play_sid", this.h);
        hashMap.put("play_type", "end");
        hashMap.put("instance_playid", this.i);
        long j = 0;
        if (q() && this.b.getDurationTime() > 0) {
            j = this.b.getDurationTime();
        }
        hashMap.put("duration_time", String.valueOf(j));
        hashMap.put("play_token", this.g.getPlayToken());
        hashMap.put("is_live", "1");
        if (this.g.getUTParams() != null) {
            hashMap.putAll(this.g.getUTParams());
        }
        AVSDKLog.e(this.o, "DWLive 12003 commit at commitPlayEndInfo");
        this.g.mUTAdapter.b("DWLive", "Button", IMediaPlayer.MEDIA_INFO_LIVE_DEFINIITON_AUTO_SWITCH_START, (String) hashMap.get(xau.PROPERTY_VIDEO_ID), c2v.getInstance().getCurrentPageName(), (String) hashMap.get("playTime"), hashMap);
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            j();
        }
    }

    public void i(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aececf63", new Object[]{this, new Long(j)});
            return;
        }
        try {
            if (ew0.n(this.e.o, OrangeConfig.getInstance().getConfig("DWInteractive", "reuseBlackList", "[\"recmd\"]"))) {
                j();
                feh fehVar = this.o;
                AVSDKLog.e(fehVar, "TBPlayer destroy without delay, sbt=" + this.e.o);
                return;
            }
            String f = this.e.f();
            boolean h = yrr.c().h(this.e.f(), j);
            if (!h) {
                j();
                feh fehVar2 = this.o;
                AVSDKLog.e(fehVar2, "lee +++ Token not use, destroyInner, token:" + f);
            }
            feh fehVar3 = this.o;
            AVSDKLog.e(fehVar3, "lee +++ destroy, token:" + f + ",delayMillis:" + j + ", returnSuccess:" + h);
        } catch (Exception e) {
            feh fehVar4 = this.o;
            AVSDKLog.e(fehVar4, "An error occurred while destroy player reuse: " + e.getMessage());
        }
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e56f9103", new Object[]{this});
            return;
        }
        e();
        if (q()) {
            f();
            this.b.release();
            this.b.destroy();
        } else if (s()) {
            this.f10212a.y();
        }
        d();
        this.e.f = 0;
    }

    public Bitmap k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("900dd4f", new Object[]{this});
        }
        if (!hsr.a().e("getCurrentFrame", this.e)) {
            this.n.add("getCurrentFrame");
            return null;
        } else if (q()) {
            return this.b.getCurrentFrame();
        } else {
            s();
            return null;
        }
    }

    public float l(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("900f2391", new Object[]{this, new Integer(i)})).floatValue();
        }
        if (i == 2002 && q()) {
            return this.b.getVideoRenderPts();
        }
        return -1.0f;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long m(int r6) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.avplayer.s.m(int):long");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002d, code lost:
        if (r5 != 4501) goto L_0x0071;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object n(int r5) {
        /*
            r4 = this;
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = com.taobao.avplayer.s.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x001b
            java.lang.Integer r3 = new java.lang.Integer
            r3.<init>(r5)
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r1] = r4
            r5[r0] = r3
            java.lang.String r0 = "f9caa300"
            java.lang.Object r5 = r2.ipc$dispatch(r0, r5)
            return r5
        L_0x001b:
            r2 = 4004(0xfa4, float:5.611E-42)
            if (r5 == r2) goto L_0x0030
            r0 = 4005(0xfa5, float:5.612E-42)
            if (r5 == r0) goto L_0x004a
            r0 = 4012(0xfac, float:5.622E-42)
            if (r5 == r0) goto L_0x003d
            r0 = 4500(0x1194, float:6.306E-42)
            if (r5 == r0) goto L_0x0057
            r0 = 4501(0x1195, float:6.307E-42)
            if (r5 == r0) goto L_0x0057
            goto L_0x0071
        L_0x0030:
            boolean r2 = r4.q()
            if (r2 == 0) goto L_0x003d
            com.taobao.mediaplay.MediaPlayCenter r5 = r4.b
            java.util.List r5 = r5.getDefinitionList(r0)
            return r5
        L_0x003d:
            boolean r0 = r4.q()
            if (r0 == 0) goto L_0x004a
            com.taobao.mediaplay.MediaPlayCenter r5 = r4.b
            java.util.List r5 = r5.getDefinitionList(r1)
            return r5
        L_0x004a:
            boolean r0 = r4.q()
            if (r0 == 0) goto L_0x0057
            com.taobao.mediaplay.MediaPlayCenter r5 = r4.b
            com.taobao.mediaplay.model.PlayerQualityItem r5 = r5.getCurrentDefinition()
            return r5
        L_0x0057:
            boolean r0 = r4.q()
            if (r0 == 0) goto L_0x0064
            com.taobao.mediaplay.MediaPlayCenter r5 = r4.b
            java.util.Map r5 = r5.getPlayerQos()
            return r5
        L_0x0064:
            boolean r0 = r4.s()
            if (r0 == 0) goto L_0x0071
            com.taobao.avplayer.DWHighPerformanceInstanceNew r5 = r4.f10212a
            java.util.Map r5 = r5.F()
            return r5
        L_0x0071:
            tb.feh r0 = r4.o
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "call getObjectProperty with invalidKey="
            r1.<init>(r2)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            com.taobao.taobaoavsdk.AVSDKLog.e(r0, r5)
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.avplayer.s.n(int):java.lang.Object");
    }

    public View o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("f39a5525", new Object[]{this});
        }
        if (!hsr.a().e("getPlayerView", this.e)) {
            this.n.add("getPlayerView");
            return null;
        } else if (q()) {
            return this.b.getView();
        } else {
            if (s()) {
                return this.f10212a.K();
            }
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
        if (r4 != 3012) goto L_0x0078;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String p(int r4) {
        /*
            r3 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.avplayer.s.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x001d
            java.lang.Integer r1 = new java.lang.Integer
            r1.<init>(r4)
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r2 = 0
            r4[r2] = r3
            r2 = 1
            r4[r2] = r1
            java.lang.String r1 = "a36581c0"
            java.lang.Object r4 = r0.ipc$dispatch(r1, r4)
            java.lang.String r4 = (java.lang.String) r4
            return r4
        L_0x001d:
            r0 = 3002(0xbba, float:4.207E-42)
            if (r4 == r0) goto L_0x0044
            r0 = 3006(0xbbe, float:4.212E-42)
            if (r4 == r0) goto L_0x002a
            r0 = 3012(0xbc4, float:4.221E-42)
            if (r4 == r0) goto L_0x005e
            goto L_0x0078
        L_0x002a:
            boolean r0 = r3.q()
            if (r0 == 0) goto L_0x0037
            com.taobao.mediaplay.MediaPlayCenter r4 = r3.b
            java.lang.String r4 = r4.getVideoToken()
            return r4
        L_0x0037:
            boolean r0 = r3.s()
            if (r0 == 0) goto L_0x0044
            com.taobao.avplayer.DWHighPerformanceInstanceNew r4 = r3.f10212a
            java.lang.String r4 = r4.I()
            return r4
        L_0x0044:
            boolean r0 = r3.q()
            if (r0 == 0) goto L_0x0051
            com.taobao.mediaplay.MediaPlayCenter r4 = r3.b
            java.lang.String r4 = r4.getMediaPlayUrl()
            return r4
        L_0x0051:
            boolean r0 = r3.s()
            if (r0 == 0) goto L_0x005e
            com.taobao.avplayer.DWHighPerformanceInstanceNew r4 = r3.f10212a
            java.lang.String r4 = r4.E()
            return r4
        L_0x005e:
            boolean r0 = r3.q()
            if (r0 == 0) goto L_0x006b
            com.taobao.mediaplay.MediaPlayCenter r4 = r3.b
            java.lang.String r4 = r4.getPlayToken()
            return r4
        L_0x006b:
            boolean r0 = r3.s()
            if (r0 == 0) goto L_0x0078
            com.taobao.avplayer.DWHighPerformanceInstanceNew r4 = r3.f10212a
            java.lang.String r4 = r4.D()
            return r4
        L_0x0078:
            tb.feh r0 = r3.o
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "call getStringProperty with invalidKey="
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            com.taobao.taobaoavsdk.AVSDKLog.e(r0, r4)
            java.lang.String r4 = ""
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.avplayer.s.p(int):java.lang.String");
    }

    public final boolean q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b1ff7071", new Object[]{this})).booleanValue();
        }
        if (this.b == null) {
            return false;
        }
        if (this.d == 0 || ew0.n(this.e.o, this.l) || ew0.n(this.e.o, this.k) || this.m) {
            return true;
        }
        return false;
    }

    public boolean r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("28c61cbb", new Object[]{this})).booleanValue();
        }
        DisplayMetrics displayMetrics = this.e.h.getResources().getDisplayMetrics();
        float f = displayMetrics.xdpi;
        double d2 = displayMetrics.widthPixels / f;
        double d3 = displayMetrics.heightPixels / displayMetrics.ydpi;
        if (Math.sqrt((d2 * d2) + (d3 * d3)) >= 7.0d) {
            return true;
        }
        return false;
    }

    public final boolean s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("81e365fc", new Object[]{this})).booleanValue();
        }
        if (this.f10212a == null || this.d != 2) {
            return false;
        }
        return true;
    }

    public void t(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4254d4b4", new Object[]{this, new Boolean(z)});
        } else if (!hsr.a().e("mute", this.e)) {
            this.n.add("mute");
        } else {
            this.e.i = z;
            if (q()) {
                this.b.mute(z);
            } else if (s()) {
                this.f10212a.V(z);
            }
        }
    }

    public void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
        } else if (q()) {
            this.b.pause();
        } else if (s()) {
            this.f10212a.W();
        }
    }

    public void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f50cd26", new Object[]{this});
        } else if (!hsr.a().e("prepareToFirstFrame", this.e)) {
            this.n.add("prepareToFirstFrame");
        } else {
            if (s()) {
                this.f10212a.a0();
            } else if (q()) {
                this.b.setup();
                this.b.prepareToFirstFrame();
            }
            this.e.f = 3;
        }
    }

    public final void x(asc ascVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63dcad05", new Object[]{this, ascVar});
        } else if (ascVar != null) {
            if (this.f == null) {
                this.f = new CopyOnWriteArrayList();
            }
            if (!this.f.contains(ascVar)) {
                this.f.add(ascVar);
            }
        }
    }

    public void y(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3275fcb", new Object[]{this, new Integer(i), new Boolean(z)});
        } else if (!hsr.a().e(CommandID.seekTo, this.e)) {
            this.n.add(CommandID.seekTo);
        } else if (q()) {
            this.b.seekTo(i, z);
        } else if (s()) {
            this.f10212a.e0(i, z);
        }
    }

    public void z(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b30379e", new Object[]{this, drawable});
        } else if (!hsr.a().e("setBackgroundImg", this.e)) {
            this.n.add("setBackgroundImg");
        } else if (q()) {
            this.b.setBackgroundResource(drawable);
        } else {
            s();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x002b, code lost:
        if (r5 != 2001) goto L_0x008f;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.taobao.avplayer.TBPlayerConst$TBPlayerInvokeResult B(int r5, float r6) {
        /*
            r4 = this;
            r0 = 0
            com.android.alibaba.ip.runtime.IpChange r1 = com.taobao.avplayer.s.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r2 == 0) goto L_0x0025
            java.lang.Integer r2 = new java.lang.Integer
            r2.<init>(r5)
            java.lang.Float r5 = new java.lang.Float
            r5.<init>(r6)
            r6 = 3
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r6[r0] = r4
            r0 = 1
            r6[r0] = r2
            r0 = 2
            r6[r0] = r5
            java.lang.String r5 = "162b0b0f"
            java.lang.Object r5 = r1.ipc$dispatch(r5, r6)
            com.taobao.avplayer.TBPlayerConst$TBPlayerInvokeResult r5 = (com.taobao.avplayer.TBPlayerConst$TBPlayerInvokeResult) r5
            return r5
        L_0x0025:
            r1 = 2000(0x7d0, float:2.803E-42)
            if (r5 == r1) goto L_0x002e
            r1 = 2001(0x7d1, float:2.804E-42)
            if (r5 == r1) goto L_0x004a
            goto L_0x008f
        L_0x002e:
            boolean r1 = r4.q()
            if (r1 == 0) goto L_0x003c
            com.taobao.mediaplay.MediaPlayCenter r5 = r4.b
            r5.setPlayRate(r6)
            com.taobao.avplayer.TBPlayerConst$TBPlayerInvokeResult r5 = com.taobao.avplayer.TBPlayerConst$TBPlayerInvokeResult.TBPlayerInvokeResultSuccess
            return r5
        L_0x003c:
            boolean r1 = r4.s()
            if (r1 == 0) goto L_0x004a
            com.taobao.avplayer.DWHighPerformanceInstanceNew r5 = r4.f10212a
            r5.z0(r6)
            com.taobao.avplayer.TBPlayerConst$TBPlayerInvokeResult r5 = com.taobao.avplayer.TBPlayerConst$TBPlayerInvokeResult.TBPlayerInvokeResultSuccess
            return r5
        L_0x004a:
            com.taobao.avplayer.s$d r1 = r4.e
            r1.getClass()
            boolean r1 = r4.q()
            if (r1 == 0) goto L_0x005d
            com.taobao.mediaplay.MediaPlayCenter r5 = r4.b
            r5.setVolume(r6)
            com.taobao.avplayer.TBPlayerConst$TBPlayerInvokeResult r5 = com.taobao.avplayer.TBPlayerConst$TBPlayerInvokeResult.TBPlayerInvokeResultSuccess
            return r5
        L_0x005d:
            boolean r1 = r4.s()
            if (r1 == 0) goto L_0x008f
            com.taobao.avplayer.DWHighPerformanceInstanceNew r5 = r4.f10212a
            r5.M0(r6)
            com.taobao.orange.OrangeConfig r5 = com.taobao.orange.OrangeConfig.getInstance()
            java.lang.String r1 = "true"
            java.lang.String r2 = "DWInteractive"
            java.lang.String r3 = "unmuteAfterSetVolume"
            java.lang.String r5 = r5.getConfig(r2, r3, r1)
            boolean r5 = tb.ew0.s(r5)
            r1 = 0
            int r6 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r6 <= 0) goto L_0x008c
            if (r5 == 0) goto L_0x008c
            com.taobao.avplayer.DWHighPerformanceInstanceNew r5 = r4.f10212a
            r5.u0(r0)
            com.taobao.avplayer.s$d r5 = r4.e
            r5.i = r0
        L_0x008c:
            com.taobao.avplayer.TBPlayerConst$TBPlayerInvokeResult r5 = com.taobao.avplayer.TBPlayerConst$TBPlayerInvokeResult.TBPlayerInvokeResultSuccess
            return r5
        L_0x008f:
            tb.feh r6 = r4.o
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "call setPlayerProperty with invalidKey="
            r0.<init>(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            com.taobao.taobaoavsdk.AVSDKLog.e(r6, r5)
            com.taobao.avplayer.TBPlayerConst$TBPlayerInvokeResult r5 = com.taobao.avplayer.TBPlayerConst$TBPlayerInvokeResult.TBPlayerInvokeResultInvalidKey
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.avplayer.s.B(int, float):com.taobao.avplayer.TBPlayerConst$TBPlayerInvokeResult");
    }

    public void M(MediaLiveWarmupConfig mediaLiveWarmupConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36dfca00", new Object[]{this, mediaLiveWarmupConfig});
        } else if (!hsr.a().e("warmupLiveStream", this.e)) {
            this.n.add("warmupLiveStream");
        } else {
            if (q()) {
                this.b.setup();
                this.b.warmupLiveStream(mediaLiveWarmupConfig);
            }
            this.e.f = 1;
        }
    }

    public final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c342d67", new Object[]{this});
            return;
        }
        DWContext dWContext = this.g;
        if (dWContext == null || dWContext.mUTAdapter == null || this.e == null || this.j) {
            feh fehVar = this.o;
            AVSDKLog.e(fehVar, "TBPlayer CommitCloseUT failed mDWContext=" + this.g + ", mPlayerInfo=" + this.e + ", mFirstPlayUTCommited=" + this.j);
            return;
        }
        HashMap hashMap = new HashMap();
        if (this.e.i) {
            hashMap.put("wifiAuto", "true");
        } else {
            hashMap.put("wifiAuto", "false");
        }
        hashMap.put("mute", Boolean.toString(this.e.i));
        if (this.g.mUTAdapter != null) {
            HashMap<String, String> hashMap2 = this.e.c0;
            if (hashMap2 != null) {
                hashMap.putAll(hashMap2);
            }
            Uri data = (this.g.getActivity() == null || this.g.getActivity().getIntent() == null) ? null : this.g.getActivity().getIntent().getData();
            if (data != null) {
                String queryParameter = data.getQueryParameter("spm");
                if (!TextUtils.isEmpty(queryParameter)) {
                    hashMap.put("spm-url", queryParameter);
                }
            }
            hashMap.put("play_sid", this.h);
            hashMap.put("barrage", "false");
            hashMap.put("item", "false");
            hashMap.put("instance_playid", this.i);
            hashMap.put("likes", "false");
            hashMap.put("is_live", "1");
            AVSDKLog.e(this.o, "TBPlayer commit 12002 at commitFirstPlayUT");
            this.g.mUTAdapter.b("DWLive", "Button", 12002, (String) hashMap.get(xau.PROPERTY_VIDEO_ID), "", "", hashMap);
        }
        this.j = true;
    }

    public void I(Context context, String str, asc ascVar) {
        int i;
        int i2;
        MediaAspectRatio mediaAspectRatio;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("147e37c7", new Object[]{this, context, str, ascVar});
            return;
        }
        MediaPlayCenter mediaPlayCenter = this.c;
        if (mediaPlayCenter != null) {
            mediaPlayCenter.destroy();
        }
        this.c = new MediaPlayCenter(context);
        try {
            if (q()) {
                i = this.b.getVideoWidth();
                i2 = this.b.getVideoHeight();
            } else {
                i = 0;
                i2 = 0;
            }
            feh fehVar = this.o;
            AVSDKLog.e(fehVar, "ThumbnailInstance:" + this.c + ",thumbnail init, videoPath:" + str + ", width:" + i + ", high:" + i2);
            MediaPlayCenter mediaPlayCenter2 = this.c;
            if (i > i2) {
                mediaAspectRatio = MediaAspectRatio.DW_FIT_CENTER;
            } else {
                mediaAspectRatio = MediaAspectRatio.DW_CENTER_CROP;
            }
            mediaPlayCenter2.setMediaAspectRatio(mediaAspectRatio);
            this.c.setNeedPlayControlView(false);
            this.c.hideController();
            this.c.setMediaUrl(str);
            this.c.setHardwareAvc(true);
            this.c.setHardwareHevc(true);
            this.c.setup();
            this.c.start();
            this.c.mute(true);
            this.c.setPropertyLong(TaobaoMediaPlayer.FFP_PROP_INT64_THUMBNAIL_ENGINE_ENABLE, 1L);
            if (ascVar != null) {
                this.c.setMediaLifecycleListener(ascVar);
            }
            this.c.pause();
        } catch (Exception e) {
            feh fehVar2 = this.o;
            AVSDKLog.e(fehVar2, "thumbnail init failed: " + e);
            e.printStackTrace();
        }
    }

    static {
        t2o.a(451936305);
        h95.a();
        MediaSystemUtils.sIsSupportWeex = WXEnvironment.isSupport();
        AVSDKLog.e(tfb.MODULE_SDK_PAGE, "sIsSupportWeex=" + MediaSystemUtils.sIsSupportWeex);
        if (MediaSystemUtils.sIsSupportWeex) {
            try {
                WXSDKEngine.registerModule("SplayerModule", WXSplayerModule.class);
            } catch (WXException e) {
                e.printStackTrace();
            }
        }
        r65.f27136a = new m75();
        if (r65.b == null) {
            r65.b = new b75();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0141, code lost:
        if (r11.equals(com.taobao.weex.common.Constants.Event.SLOT_LIFECYCLE.DETACH) == false) goto L_0x0045;
     */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x049a  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x04a8  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x04b6  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x04c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.taobao.avplayer.TBPlayerConst$TBPlayerInvokeResult c(java.lang.String r11, java.util.HashMap<java.lang.String, java.lang.Object> r12) {
        /*
            Method dump skipped, instructions count: 1390
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.avplayer.s.c(java.lang.String, java.util.HashMap):com.taobao.avplayer.TBPlayerConst$TBPlayerInvokeResult");
    }

    public s(d dVar) {
        DWHighPerformanceInstanceNew.h hVar;
        this.d = -1;
        this.j = false;
        this.k = "[\"LiveRoom\",\"TimeMovingPlay\",\"TBMiniLive\", \"shopLiveTab\", \"shop2fLive\", \"shopLiveTab\"]";
        this.l = "[\"TimeMovingPlay\"]";
        this.m = false;
        this.n = new HashSet();
        feh fehVar = new feh(toString(), "");
        this.o = fehVar;
        this.e = dVar;
        int i = dVar.r;
        this.d = i;
        Context context = dVar.h;
        if (context == null && (context = dVar.g) == null) {
            context = null;
        }
        String K = ja1.K(context, "DWInteractive", "useLivePlayerSBT", "[\"LiveRoom\",\"TimeMovingPlay\",\"TBMiniLive\", \"shopLiveTab\", \"shop2fLive\", \"shopLiveTab\"]");
        this.k = K;
        String K2 = ja1.K(context, "DWInteractive", "liveUserVodPlayControlSBT", "[\"TimeMovingPlay\"]");
        this.l = K2;
        String config = OrangeConfig.getInstance().getConfig("DWInteractive", "audioOnlyBT", "[\"MegaBGAudio\"]");
        HashMap<String, String> hashMap = this.e.w;
        if (hashMap != null && ew0.s(hashMap.get("isLiveDomainRequiredParams"))) {
            AVSDKLog.e(fehVar, "TBPlayerInstance createByLiveDomain, isLiveDomainRequiredParams=true.");
            this.m = true;
        }
        String str = "TBPlayer";
        if (i == 0 || ew0.n(this.e.o, K2) || ew0.n(this.e.o, K) || this.m) {
            hsr.a().d(this.e.h);
            MediaPlayCenter mediaPlayCenter = new MediaPlayCenter(dVar.h);
            this.b = mediaPlayCenter;
            mediaPlayCenter.setNeedPlayControlView(false);
            mediaPlayCenter.hideController();
            mediaPlayCenter.setBusinessId(dVar.n);
            if (!ew0.n(this.e.o, K2) || dVar.k != 1) {
                mediaPlayCenter.setIsTBLive(Boolean.TRUE);
            } else {
                mediaPlayCenter.setMediaSource("TBVideo");
                mediaPlayCenter.setTBVideoSourceAdapter(new TBLiveSourceAdapter(dVar.m));
            }
            mediaPlayCenter.setMediaId(dVar.m);
            mediaPlayCenter.setBizCode(dVar.o);
            if (!TextUtils.isEmpty(dVar.Q)) {
                str = dVar.Q + ".TBPlayer";
            }
            mediaPlayCenter.setUsingInterface(str);
            mediaPlayCenter.setScenarioType(dVar.r);
            mediaPlayCenter.setPlayScenes(dVar.W);
            mediaPlayCenter.setPlayerType(3);
            mediaPlayCenter.mute(dVar.i);
            mediaPlayCenter.setMediaSource(dVar.j);
            mediaPlayCenter.addPlayExpUtParams(dVar.v);
            mediaPlayCenter.addControlParams(dVar.w);
            if (dVar.q == DWAspectRatio.DW_FIT_ADAPT) {
                dVar.q = r() ? DWAspectRatio.DW_FIT_CENTER : DWAspectRatio.DW_CENTER_CROP;
                StringBuilder sb = new StringBuilder("device is ");
                sb.append(r() ? "Tablet" : "not Tablet");
                sb.append(", set ");
                sb.append(dVar.q == DWAspectRatio.DW_FIT_CENTER ? "DW_FIT_CENTER" : "DW_CENTER_CROP");
                AVSDKLog.e(fehVar, sb.toString());
            }
            mediaPlayCenter.setMediaAspectRatio(MediaAspectRatio.values()[dVar.q.ordinal()]);
            mediaPlayCenter.setAudioOnly(dVar.Y);
            mediaPlayCenter.setUseRtcLive(true);
            mediaPlayCenter.setUseShortAudioFocus(dVar.s);
            MediaLiveInfo mediaLiveInfo = dVar.U;
            if (mediaLiveInfo != null) {
                mediaLiveInfo.updateLiveUrlList(mediaLiveInfo.liveUrlListJson);
                mediaPlayCenter.updateLiveMediaInfoData(dVar.U);
            } else if (!TextUtils.isEmpty(dVar.l)) {
                mediaPlayCenter.updateLiveMediaInfoData(null);
                mediaPlayCenter.setMediaUrl(dVar.l);
            }
            if (!dVar.p) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put(MediaConstant.CMD_DISABLE_SURFACE_VIEW, "1");
                mediaPlayCenter.callWithMsg(hashMap2);
            } else {
                mediaPlayCenter.setForceUseSurfaceView(true);
            }
            Surface surface = dVar.D;
            if (surface != null) {
                mediaPlayCenter.setExternSurface(surface);
            }
            mediaPlayCenter.setMediaLifecycleListener(dVar.t);
            x(dVar.t);
            if (dVar.I != null) {
                mediaPlayCenter.setIMediaLoopCompleteListener(new a(this, dVar));
            }
            mediaPlayCenter.setFirstRenderAdapter(dVar.u);
            mediaPlayCenter.setVideoLoop(dVar.A);
            mediaPlayCenter.setStartPos(dVar.B);
            mediaPlayCenter.setLiveDefinitionAutoSwitch(dVar.N);
            mediaPlayCenter.setPauseInBackground(dVar.O);
            mediaPlayCenter.setShowNoWifiToast(dVar.P);
            mediaPlayCenter.setUsingNewPlayerInstance(true);
            if (ew0.s(OrangeConfig.getInstance().getConfig("DWInteractive", "setupEarly", "true"))) {
                mediaPlayCenter.setup();
            }
            fehVar.c(mediaPlayCenter.getPlayToken());
            d.a(this.e, mediaPlayCenter.getPlayToken());
            String config2 = OrangeConfig.getInstance().getConfig("DWInteractive", "UTCommitBTWhiteList", "[\"guangguang_pick\"]");
            if (!TextUtils.isEmpty(config2) && config2.contains(this.e.o)) {
                DWContext dWContext = new DWContext((Activity) this.e.h, true);
                this.g = dWContext;
                dWContext.setUserInfoAdapter(new y95());
                dWContext.mUTAdapter = new z95();
                this.h = l95.b("", dWContext.getUserInfoAdapter().getDeviceId());
                this.i = l95.b("", dWContext.getUserInfoAdapter().getDeviceId());
            }
        } else if (i == 2) {
            if (ew0.n(this.e.n, config)) {
                hVar = new DWHighPerformanceInstanceNew.h(dVar.h);
                hsr.a().d(this.e.h);
            } else {
                hVar = new DWHighPerformanceInstanceNew.h(dVar.g);
                hsr.a().d(this.e.g);
            }
            if (!TextUtils.isEmpty(dVar.Q)) {
                str = dVar.Q + ".TBPlayer";
            }
            hVar.Y(str);
            hVar.f0(dVar.l);
            hVar.x(dVar.b0);
            hVar.q(dVar.Z);
            hVar.b0(dVar.m);
            hVar.c0(dVar.A);
            if (dVar.k == 2) {
                dVar.j = "NONTBVideo";
            }
            hVar.d0(dVar.j);
            hVar.g0(dVar.x);
            hVar.t(dVar.y);
            hVar.g(dVar.o);
            hVar.e0(dVar.z);
            hVar.T(dVar.c0);
            hVar.K(dVar.v);
            hVar.m(dVar.w);
            hVar.G(true);
            hVar.A(dVar.i);
            hVar.L(dVar.W);
            hVar.Z(dVar.q);
            hVar.f(dVar.X);
            hVar.J(dVar.O);
            hVar.y(dVar.V);
            hVar.Q(dVar.B);
            hVar.c(dVar.Y);
            hVar.R(dVar.D);
            hVar.r(!dVar.p);
            hVar.s(dVar.p);
            hVar.V(dVar.s);
            hVar.M(dVar.a0);
            hVar.w(dVar.t);
            hVar.h(dVar.n);
            hVar.I(dVar.d0);
            if (!TextUtils.isEmpty(dVar.R)) {
                hVar.n(dVar.R);
            }
            if (!dVar.T) {
                hVar.F(dVar.S);
            }
            hVar.E(dVar.T);
            hVar.D(dVar.f0);
            if (r65.b == null) {
                r65.b = new b75();
            }
            hVar.j(r65.b);
            hVar.k(new d75());
            hVar.u(new DWNetworkAdapter());
            hVar.v(new z95());
            hVar.o(new k95());
            hVar.H(new v85());
            hVar.p(new z75(dVar.g));
            hVar.X(new y95());
            hVar.c(this.e.Y);
            hVar.z(this.e.g0);
            hVar.d(this.e.h0);
            hVar.O(this.e.i0);
            hVar.U(this.e.j0);
            DWHighPerformanceInstanceNew a2 = hVar.a();
            this.f10212a = a2;
            DWContext dWContext2 = a2.d;
            if (dWContext2 != null) {
                dWContext2.setShowNotWifiHint(this.e.P);
            }
            fehVar.c(a2.D());
            d.a(this.e, a2.D());
            qtb qtbVar = dVar.G;
            if (qtbVar != null) {
                a2.C0(qtbVar);
            }
            htb htbVar = dVar.H;
            if (htbVar != null) {
                a2.o0(htbVar);
            }
            fub fubVar = dVar.J;
            if (fubVar != null) {
                a2.s0(fubVar);
            }
            aub aubVar = dVar.I;
            if (aubVar != null) {
                a2.q0(aubVar);
            }
            dub dubVar = dVar.K;
            if (dubVar != null) {
                a2.r0(dubVar);
            }
            qtb qtbVar2 = dVar.L;
            if (qtbVar2 != null) {
                a2.y0(qtbVar2);
            }
            cub cubVar = dVar.M;
            if (cubVar != null) {
                a2.J0(cubVar);
            }
            if (dVar.k0 != null) {
                a2.h0(this.e.k0);
            }
            ImageView imageView = dVar.e0;
            if (imageView != null) {
                a2.x0(imageView);
            }
        }
    }
}

package com.uc.webview.stat;

import anet.channel.strategy.dispatch.DispatchConstants;
import com.alibaba.android.aura.taobao.adapter.extension.linkage.service.utils.LinkageUtils;
import com.alibaba.ariver.kernel.RVStartParams;
import com.alibaba.security.wukong.pipe.RiskDataPipeManager;
import com.alipay.android.msp.framework.db.MspDBHelper;
import com.alipay.android.msp.framework.statisticsv2.value.CountValue;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorType;
import com.alipay.mobile.common.logging.api.LogContext;
import com.alipay.sdk.app.statistic.StatisticRecord;
import com.alipay.sdk.sys.BizContext;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.meizu.cloud.pushsdk.notification.model.AdvertisementOption;
import com.meizu.cloud.pushsdk.notification.model.NotificationStyle;
import com.meizu.cloud.pushsdk.notification.model.TimeDisplaySetting;
import com.taobao.android.alinnkit.entity.FaceDetectionReport;
import com.taobao.media.MediaConstant;
import com.uc.webview.internal.stats.StatsManager;
import com.uc.webview.internal.stats.c;
import java.util.HashMap;
import java.util.Map;
import tb.gat;
import tb.lca;
import tb.rb;
import tb.zj4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class a extends com.uc.webview.internal.stats.g {

    /* compiled from: Taobao */
    /* renamed from: com.uc.webview.stat.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class C0847a {

        /* renamed from: a  reason: collision with root package name */
        static final Map<String, c.a> f14526a;

        static {
            HashMap hashMap = new HashMap();
            f14526a = hashMap;
            hashMap.put("bfcache_v2", new g((byte) 0));
            hashMap.put("prerender_v0", new au((byte) 0));
            hashMap.put("bkpg", new k((byte) 0));
            hashMap.put("wpk_pv", new bs((byte) 0));
            hashMap.put("block_subres", new m((byte) 0));
            hashMap.put("v8aot", new bo((byte) 0));
            hashMap.put("snapsh_load", new bi((byte) 0));
            hashMap.put("snapsh_init", new bg((byte) 0));
            hashMap.put("snapsh_creat", new be((byte) 0));
            hashMap.put("proc_stats2", new aw((byte) 0));
            hashMap.put("jsi", new ag((byte) 0));
            hashMap.put("keyword_hyperlink_expose", new ak((byte) 0));
            hashMap.put("keyword_hyperlink_click", new ai((byte) 0));
            hashMap.put("sdkpv", new ay((byte) 0));
            hashMap.put("sdksat", new ba((byte) 0));
            hashMap.put("sdksus", new bc((byte) 0));
            hashMap.put("lottie_stats", new am((byte) 0));
            hashMap.put("canvas_stats", new o((byte) 0));
            hashMap.put("ac_stats", new c((byte) 0));
            hashMap.put("media_stats", new ao((byte) 0));
            hashMap.put("webrtc_stats", new bq((byte) 0));
            hashMap.put("pinch_zoom", new as((byte) 0));
            hashMap.put("auto_fill", new e((byte) 0));
            hashMap.put("pass_fail", new aq((byte) 0));
            hashMap.put("embed_req", new aa((byte) 0));
            hashMap.put("capture_stat", new q((byte) 0));
            hashMap.put("core_errpage", new u((byte) 0));
            hashMap.put("ext_img", new ac((byte) 0));
            hashMap.put("u4cpns", new bk((byte) 0));
            hashMap.put("fea_s", new ae((byte) 0));
            hashMap.put("css_s", new y((byte) 0));
            hashMap.put("und_s", new bm((byte) 0));
            hashMap.put("con_s", new s((byte) 0));
            hashMap.put("bfcache_w", new i((byte) 0));
            hashMap.put("cre_tpmk", new w((byte) 0));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class aa implements c.a {
        private aa() {
        }

        public /* synthetic */ aa(byte b) {
            this();
        }

        @Override // com.uc.webview.internal.stats.c.a
        public final com.uc.webview.internal.stats.c a(Map<String, String> map) {
            return new z(com.uc.webview.internal.stats.g.a(map, "h", ""), com.uc.webview.internal.stats.g.a(map, "t", ""), com.uc.webview.internal.stats.g.a(map, "v", ""), com.uc.webview.internal.stats.g.a(map, "m"), com.uc.webview.internal.stats.g.a(map, "c"), com.uc.webview.internal.stats.g.a(map, "s"), com.uc.webview.internal.stats.g.a(map, "w"), com.uc.webview.internal.stats.g.a(map, "e"), (byte) 0);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class ab extends com.uc.webview.internal.stats.c {
        private static final com.uc.webview.internal.stats.h g;
        public long b;
        public String c;
        public String d;
        public String e;
        public String f;

        static {
            com.uc.webview.internal.stats.h hVar = new com.uc.webview.internal.stats.h("ext_img");
            g = hVar;
            StatsManager.a(hVar);
        }

        public /* synthetic */ ab(long j, String str, String str2, String str3, String str4, byte b) {
            this(j, str, str2, str3, str4);
        }

        @Override // com.uc.webview.internal.stats.c
        public final com.uc.webview.internal.stats.h b() {
            return g;
        }

        @Override // com.uc.webview.internal.stats.c
        public final int c() {
            if (this.f14510a == 0) {
                this.f14510a = com.uc.webview.internal.stats.g.a(this.b) + 21 + com.uc.webview.internal.stats.g.a(this.c) + com.uc.webview.internal.stats.g.a(this.d) + com.uc.webview.internal.stats.g.a(this.e) + com.uc.webview.internal.stats.g.a(this.f);
            }
            return this.f14510a;
        }

        @Override // com.uc.webview.internal.stats.c
        public final int d() {
            return 21;
        }

        @Override // com.uc.webview.internal.stats.c
        public final Map<String, String> e() {
            HashMap hashMap = new HashMap();
            hashMap.put("_ret", String.valueOf(this.b));
            String str = this.c;
            String str2 = "";
            if (str == null) {
                str = str2;
            }
            hashMap.put("_ver", str);
            String str3 = this.d;
            if (str3 == null) {
                str3 = str2;
            }
            hashMap.put("_fmt", str3);
            String str4 = this.e;
            if (str4 == null) {
                str4 = str2;
            }
            hashMap.put("_ext", str4);
            String str5 = this.f;
            if (str5 != null) {
                str2 = str5;
            }
            hashMap.put("_mime", str2);
            return hashMap;
        }

        @Override // com.uc.webview.internal.stats.c
        public final /* synthetic */ com.uc.webview.internal.stats.c f() {
            return new ab(this.b, this.c, this.d, this.e, this.f);
        }

        @Override // com.uc.webview.internal.stats.c
        public final String j() {
            return "ext_img";
        }

        @Override // com.uc.webview.internal.stats.c
        public final void k() {
            this.b = 0L;
            this.c = null;
            this.d = null;
            this.e = null;
            this.f = null;
            this.f14510a = 0;
        }

        public final String toString() {
            return com.uc.webview.internal.stats.c.a("ext_img", e());
        }

        public ab() {
        }

        private ab(long j, String str, String str2, String str3, String str4) {
            this.b = j;
            if (str != null && str.length() > 64) {
                str = str.substring(0, 64);
            }
            this.c = str;
            if (str2 == null || str2.length() <= 64) {
                this.d = str2;
            } else {
                this.d = str2.substring(0, 64);
            }
            if (str3 == null || str3.length() <= 64) {
                this.e = str3;
            } else {
                this.e = str3.substring(0, 64);
            }
            if (str4 == null || str4.length() <= 64) {
                this.f = str4;
            } else {
                this.f = str4.substring(0, 64);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class ac implements c.a {
        private ac() {
        }

        @Override // com.uc.webview.internal.stats.c.a
        public final com.uc.webview.internal.stats.c a(Map<String, String> map) {
            return new ab(com.uc.webview.internal.stats.g.a(map, rb.RESULT_KEY), com.uc.webview.internal.stats.g.a(map, MspDBHelper.RecordEntry.COLUMN_NAME_VERSION, ""), com.uc.webview.internal.stats.g.a(map, "fmt", ""), com.uc.webview.internal.stats.g.a(map, "ext", ""), com.uc.webview.internal.stats.g.a(map, "mime", ""), (byte) 0);
        }

        public /* synthetic */ ac(byte b) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class ad extends com.uc.webview.internal.stats.c {
        private static final com.uc.webview.internal.stats.h e;
        public String b;
        public String c;
        public String d;

        static {
            com.uc.webview.internal.stats.h hVar = new com.uc.webview.internal.stats.h("fea_s");
            e = hVar;
            StatsManager.a(hVar);
        }

        public /* synthetic */ ad(String str, String str2, String str3, byte b) {
            this(str, str2, str3);
        }

        @Override // com.uc.webview.internal.stats.c
        public final com.uc.webview.internal.stats.h b() {
            return e;
        }

        @Override // com.uc.webview.internal.stats.c
        public final int c() {
            if (this.f14510a == 0) {
                this.f14510a = com.uc.webview.internal.stats.g.a(this.b) + 6 + com.uc.webview.internal.stats.g.a(this.c) + com.uc.webview.internal.stats.g.a(this.d);
            }
            return this.f14510a;
        }

        @Override // com.uc.webview.internal.stats.c
        public final int d() {
            return 6;
        }

        @Override // com.uc.webview.internal.stats.c
        public final Map<String, String> e() {
            HashMap hashMap = new HashMap();
            String str = this.b;
            String str2 = "";
            if (str == null) {
                str = str2;
            }
            hashMap.put("_h", str);
            String str3 = this.c;
            if (str3 == null) {
                str3 = str2;
            }
            hashMap.put("_u", str3);
            String str4 = this.d;
            if (str4 != null) {
                str2 = str4;
            }
            hashMap.put("_r", str2);
            return hashMap;
        }

        @Override // com.uc.webview.internal.stats.c
        public final /* synthetic */ com.uc.webview.internal.stats.c f() {
            return new ad(this.b, this.c, this.d);
        }

        @Override // com.uc.webview.internal.stats.c
        public final String j() {
            return "fea_s";
        }

        @Override // com.uc.webview.internal.stats.c
        public final void k() {
            this.b = null;
            this.c = null;
            this.d = null;
            this.f14510a = 0;
        }

        public final String toString() {
            return com.uc.webview.internal.stats.c.a("fea_s", e());
        }

        public ad() {
        }

        private ad(String str, String str2, String str3) {
            if (str != null && str.length() > 128) {
                str = str.substring(0, 128);
            }
            this.b = str;
            if (str2 == null || str2.length() <= 1024) {
                this.c = str2;
            } else {
                this.c = str2.substring(0, 1024);
            }
            if (str3 == null || str3.length() <= 4096) {
                this.d = str3;
            } else {
                this.d = str3.substring(0, 4096);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class ae implements c.a {
        private ae() {
        }

        @Override // com.uc.webview.internal.stats.c.a
        public final com.uc.webview.internal.stats.c a(Map<String, String> map) {
            return new ad(com.uc.webview.internal.stats.g.a(map, "h", ""), com.uc.webview.internal.stats.g.a(map, "u", ""), com.uc.webview.internal.stats.g.a(map, "r", ""), (byte) 0);
        }

        public /* synthetic */ ae(byte b) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class af extends com.uc.webview.internal.stats.c {
        private static final com.uc.webview.internal.stats.h j;
        public String b;
        public String c;
        public String d;
        public long e;
        public String f;
        public long g;
        public String h;
        public String i;

        static {
            com.uc.webview.internal.stats.h hVar = new com.uc.webview.internal.stats.h("jsi");
            j = hVar;
            StatsManager.a(hVar);
        }

        public /* synthetic */ af(String str, String str2, String str3, long j2, String str4, long j3, String str5, String str6, byte b) {
            this(str, str2, str3, j2, str4, j3, str5, str6);
        }

        @Override // com.uc.webview.internal.stats.c
        public final com.uc.webview.internal.stats.h b() {
            return j;
        }

        @Override // com.uc.webview.internal.stats.c
        public final int c() {
            if (this.f14510a == 0) {
                this.f14510a = com.uc.webview.internal.stats.g.a(this.b) + 35 + com.uc.webview.internal.stats.g.a(this.c) + com.uc.webview.internal.stats.g.a(this.d) + com.uc.webview.internal.stats.g.a(this.e) + com.uc.webview.internal.stats.g.a(this.f) + com.uc.webview.internal.stats.g.a(this.g) + com.uc.webview.internal.stats.g.a(this.h) + com.uc.webview.internal.stats.g.a(this.i);
            }
            return this.f14510a;
        }

        @Override // com.uc.webview.internal.stats.c
        public final int d() {
            return 35;
        }

        @Override // com.uc.webview.internal.stats.c
        public final Map<String, String> e() {
            HashMap hashMap = new HashMap();
            String str = this.b;
            String str2 = "";
            if (str == null) {
                str = str2;
            }
            hashMap.put("_ebd", str);
            String str3 = this.c;
            if (str3 == null) {
                str3 = str2;
            }
            hashMap.put("_prc", str3);
            String str4 = this.d;
            if (str4 == null) {
                str4 = str2;
            }
            hashMap.put("_thr", str4);
            hashMap.put("_jpv", String.valueOf(this.e));
            String str5 = this.f;
            if (str5 == null) {
                str5 = str2;
            }
            hashMap.put("_jsv", str5);
            hashMap.put("_jsvi", String.valueOf(this.g));
            String str6 = this.h;
            if (str6 == null) {
                str6 = str2;
            }
            hashMap.put("_jsid", str6);
            String str7 = this.i;
            if (str7 != null) {
                str2 = str7;
            }
            hashMap.put("_aver", str2);
            return hashMap;
        }

        @Override // com.uc.webview.internal.stats.c
        public final /* synthetic */ com.uc.webview.internal.stats.c f() {
            return new af(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
        }

        @Override // com.uc.webview.internal.stats.c
        public final boolean h() {
            return false;
        }

        @Override // com.uc.webview.internal.stats.c
        public final String j() {
            return "jsi";
        }

        @Override // com.uc.webview.internal.stats.c
        public final void k() {
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = 0L;
            this.f = null;
            this.g = 0L;
            this.h = null;
            this.i = null;
            this.f14510a = 0;
        }

        public final String toString() {
            return com.uc.webview.internal.stats.c.a("jsi", e());
        }

        public af() {
        }

        private af(String str, String str2, String str3, long j2, String str4, long j3, String str5, String str6) {
            this.e = j2;
            this.g = j3;
            if (str != null && str.length() > 64) {
                str = str.substring(0, 64);
            }
            this.b = str;
            if (str2 == null || str2.length() <= 64) {
                this.c = str2;
            } else {
                this.c = str2.substring(0, 64);
            }
            if (str3 == null || str3.length() <= 32) {
                this.d = str3;
            } else {
                this.d = str3.substring(0, 32);
            }
            if (str4 == null || str4.length() <= 16) {
                this.f = str4;
            } else {
                this.f = str4.substring(0, 16);
            }
            if (str5 == null || str5.length() <= 24) {
                this.h = str5;
            } else {
                this.h = str5.substring(0, 24);
            }
            if (str6 == null || str6.length() <= 32) {
                this.i = str6;
            } else {
                this.i = str6.substring(0, 32);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class ag implements c.a {
        private ag() {
        }

        @Override // com.uc.webview.internal.stats.c.a
        public final com.uc.webview.internal.stats.c a(Map<String, String> map) {
            return new af(com.uc.webview.internal.stats.g.a(map, "ebd", ""), com.uc.webview.internal.stats.g.a(map, "prc", ""), com.uc.webview.internal.stats.g.a(map, "thr", ""), com.uc.webview.internal.stats.g.a(map, "jpv"), com.uc.webview.internal.stats.g.a(map, "jsv", ""), com.uc.webview.internal.stats.g.a(map, "jsvi"), com.uc.webview.internal.stats.g.a(map, "jsid", ""), com.uc.webview.internal.stats.g.a(map, "aver", ""), (byte) 0);
        }

        public /* synthetic */ ag(byte b) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class ah extends com.uc.webview.internal.stats.c {
        private static final com.uc.webview.internal.stats.h d;
        public String b;
        public String c;

        static {
            com.uc.webview.internal.stats.h hVar = new com.uc.webview.internal.stats.h("keyword_hyperlink_click");
            d = hVar;
            StatsManager.a(hVar);
        }

        public /* synthetic */ ah(String str, String str2, byte b) {
            this(str, str2);
        }

        @Override // com.uc.webview.internal.stats.c
        public final com.uc.webview.internal.stats.h b() {
            return d;
        }

        @Override // com.uc.webview.internal.stats.c
        public final int c() {
            if (this.f14510a == 0) {
                this.f14510a = com.uc.webview.internal.stats.g.a(this.b) + 8 + com.uc.webview.internal.stats.g.a(this.c);
            }
            return this.f14510a;
        }

        @Override // com.uc.webview.internal.stats.c
        public final int d() {
            return 8;
        }

        @Override // com.uc.webview.internal.stats.c
        public final Map<String, String> e() {
            HashMap hashMap = new HashMap();
            String str = this.b;
            String str2 = "";
            if (str == null) {
                str = str2;
            }
            hashMap.put("_url", str);
            String str3 = this.c;
            if (str3 != null) {
                str2 = str3;
            }
            hashMap.put("_txt", str2);
            return hashMap;
        }

        @Override // com.uc.webview.internal.stats.c
        public final /* synthetic */ com.uc.webview.internal.stats.c f() {
            return new ah(this.b, this.c);
        }

        @Override // com.uc.webview.internal.stats.c
        public final String j() {
            return "keyword_hyperlink_click";
        }

        @Override // com.uc.webview.internal.stats.c
        public final void k() {
            this.b = null;
            this.c = null;
            this.f14510a = 0;
        }

        public final String toString() {
            return com.uc.webview.internal.stats.c.a("keyword_hyperlink_click", e());
        }

        public ah() {
        }

        private ah(String str, String str2) {
            if (str != null && str.length() > 64) {
                str = str.substring(0, 64);
            }
            this.b = str;
            if (str2 == null || str2.length() <= 64) {
                this.c = str2;
            } else {
                this.c = str2.substring(0, 64);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class ai implements c.a {
        private ai() {
        }

        @Override // com.uc.webview.internal.stats.c.a
        public final com.uc.webview.internal.stats.c a(Map<String, String> map) {
            return new ah(com.uc.webview.internal.stats.g.a(map, "url", ""), com.uc.webview.internal.stats.g.a(map, "txt", ""), (byte) 0);
        }

        public /* synthetic */ ai(byte b) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class aj extends com.uc.webview.internal.stats.c {
        private static final com.uc.webview.internal.stats.h d;
        public String b;
        public String c;

        static {
            com.uc.webview.internal.stats.h hVar = new com.uc.webview.internal.stats.h("keyword_hyperlink_expose");
            d = hVar;
            StatsManager.a(hVar);
        }

        public /* synthetic */ aj(String str, String str2, byte b) {
            this(str, str2);
        }

        @Override // com.uc.webview.internal.stats.c
        public final com.uc.webview.internal.stats.h b() {
            return d;
        }

        @Override // com.uc.webview.internal.stats.c
        public final int c() {
            if (this.f14510a == 0) {
                this.f14510a = com.uc.webview.internal.stats.g.a(this.b) + 8 + com.uc.webview.internal.stats.g.a(this.c);
            }
            return this.f14510a;
        }

        @Override // com.uc.webview.internal.stats.c
        public final int d() {
            return 8;
        }

        @Override // com.uc.webview.internal.stats.c
        public final Map<String, String> e() {
            HashMap hashMap = new HashMap();
            String str = this.b;
            String str2 = "";
            if (str == null) {
                str = str2;
            }
            hashMap.put("_url", str);
            String str3 = this.c;
            if (str3 != null) {
                str2 = str3;
            }
            hashMap.put("_txt", str2);
            return hashMap;
        }

        @Override // com.uc.webview.internal.stats.c
        public final /* synthetic */ com.uc.webview.internal.stats.c f() {
            return new aj(this.b, this.c);
        }

        @Override // com.uc.webview.internal.stats.c
        public final String j() {
            return "keyword_hyperlink_expose";
        }

        @Override // com.uc.webview.internal.stats.c
        public final void k() {
            this.b = null;
            this.c = null;
            this.f14510a = 0;
        }

        public final String toString() {
            return com.uc.webview.internal.stats.c.a("keyword_hyperlink_expose", e());
        }

        public aj() {
        }

        private aj(String str, String str2) {
            if (str != null && str.length() > 64) {
                str = str.substring(0, 64);
            }
            this.b = str;
            if (str2 == null || str2.length() <= 64) {
                this.c = str2;
            } else {
                this.c = str2.substring(0, 64);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class ak implements c.a {
        private ak() {
        }

        @Override // com.uc.webview.internal.stats.c.a
        public final com.uc.webview.internal.stats.c a(Map<String, String> map) {
            return new aj(com.uc.webview.internal.stats.g.a(map, "url", ""), com.uc.webview.internal.stats.g.a(map, "txt", ""), (byte) 0);
        }

        public /* synthetic */ ak(byte b) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class al extends com.uc.webview.internal.stats.c {
        private static final com.uc.webview.internal.stats.h s;
        public String b;
        public String c;
        public String d;
        public long e;
        public long f;
        public long g;
        public long h;
        public long i;
        public long j;
        public long k;
        public long l;
        public long m;
        public long n;
        public long o;
        public long p;
        public long q;
        public long r;

        static {
            com.uc.webview.internal.stats.h hVar = new com.uc.webview.internal.stats.h("lottie_stats");
            s = hVar;
            StatsManager.a(hVar);
        }

        public /* synthetic */ al(String str, String str2, String str3, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, byte b) {
            this(str, str2, str3, j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14);
        }

        @Override // com.uc.webview.internal.stats.c
        public final com.uc.webview.internal.stats.h b() {
            return s;
        }

        @Override // com.uc.webview.internal.stats.c
        public final int c() {
            if (this.f14510a == 0) {
                this.f14510a = com.uc.webview.internal.stats.g.a(this.b) + 53 + com.uc.webview.internal.stats.g.a(this.c) + com.uc.webview.internal.stats.g.a(this.d) + com.uc.webview.internal.stats.g.a(this.e) + com.uc.webview.internal.stats.g.a(this.f) + com.uc.webview.internal.stats.g.a(this.g) + com.uc.webview.internal.stats.g.a(this.h) + com.uc.webview.internal.stats.g.a(this.i) + com.uc.webview.internal.stats.g.a(this.j) + com.uc.webview.internal.stats.g.a(this.k) + com.uc.webview.internal.stats.g.a(this.l) + com.uc.webview.internal.stats.g.a(this.m) + com.uc.webview.internal.stats.g.a(this.n) + com.uc.webview.internal.stats.g.a(this.o) + com.uc.webview.internal.stats.g.a(this.p) + com.uc.webview.internal.stats.g.a(this.q) + com.uc.webview.internal.stats.g.a(this.r);
            }
            return this.f14510a;
        }

        @Override // com.uc.webview.internal.stats.c
        public final int d() {
            return 53;
        }

        @Override // com.uc.webview.internal.stats.c
        public final Map<String, String> e() {
            HashMap hashMap = new HashMap();
            String str = this.b;
            String str2 = "";
            if (str == null) {
                str = str2;
            }
            hashMap.put("_ver", str);
            String str3 = this.c;
            if (str3 == null) {
                str3 = str2;
            }
            hashMap.put("_sv", str3);
            String str4 = this.d;
            if (str4 != null) {
                str2 = str4;
            }
            hashMap.put("_url", str2);
            hashMap.put("_jl", String.valueOf(this.e));
            hashMap.put("_js", String.valueOf(this.f));
            hashMap.put("_ja", String.valueOf(this.g));
            hashMap.put("_al", String.valueOf(this.h));
            hashMap.put("_bs", String.valueOf(this.i));
            hashMap.put("_dd", String.valueOf(this.j));
            hashMap.put("_id", String.valueOf(this.k));
            hashMap.put("_fd", String.valueOf(this.l));
            hashMap.put("_ff", String.valueOf(this.m));
            hashMap.put("_t2", String.valueOf(this.n));
            hashMap.put("_fr", String.valueOf(this.o));
            hashMap.put("_ex", String.valueOf(this.p));
            hashMap.put("_ac", String.valueOf(this.q));
            hashMap.put("_rr", String.valueOf(this.r));
            return hashMap;
        }

        @Override // com.uc.webview.internal.stats.c
        public final /* synthetic */ com.uc.webview.internal.stats.c f() {
            return new al(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r);
        }

        @Override // com.uc.webview.internal.stats.c
        public final String j() {
            return "lottie_stats";
        }

        @Override // com.uc.webview.internal.stats.c
        public final void k() {
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = 0L;
            this.f = 0L;
            this.g = 0L;
            this.h = 0L;
            this.i = 0L;
            this.j = 0L;
            this.k = 0L;
            this.l = 0L;
            this.m = 0L;
            this.n = 0L;
            this.o = 0L;
            this.p = 0L;
            this.q = 0L;
            this.r = 0L;
            this.f14510a = 0;
        }

        public final String toString() {
            return com.uc.webview.internal.stats.c.a("lottie_stats", e());
        }

        public al() {
        }

        private al(String str, String str2, String str3, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14) {
            String str4 = str;
            this.e = j;
            this.f = j2;
            this.g = j3;
            this.h = j4;
            this.i = j5;
            this.j = j6;
            this.k = j7;
            this.l = j8;
            this.m = j9;
            this.n = j10;
            this.o = j11;
            this.p = j12;
            this.q = j13;
            this.r = j14;
            if (str4 != null && str.length() > 64) {
                str4 = str.substring(0, 64);
            }
            this.b = str4;
            if (str2 == null || str2.length() <= 64) {
                this.c = str2;
            } else {
                this.c = str2.substring(0, 64);
            }
            if (str3 == null || str3.length() <= 128) {
                this.d = str3;
            } else {
                this.d = str3.substring(0, 128);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class am implements c.a {
        private am() {
        }

        public /* synthetic */ am(byte b) {
            this();
        }

        @Override // com.uc.webview.internal.stats.c.a
        public final com.uc.webview.internal.stats.c a(Map<String, String> map) {
            return new al(com.uc.webview.internal.stats.g.a(map, MspDBHelper.RecordEntry.COLUMN_NAME_VERSION, ""), com.uc.webview.internal.stats.g.a(map, BizContext.KEY_SDK_VERSION, ""), com.uc.webview.internal.stats.g.a(map, "url", ""), com.uc.webview.internal.stats.g.a(map, "jl"), com.uc.webview.internal.stats.g.a(map, "js"), com.uc.webview.internal.stats.g.a(map, "ja"), com.uc.webview.internal.stats.g.a(map, "al"), com.uc.webview.internal.stats.g.a(map, "bs"), com.uc.webview.internal.stats.g.a(map, "dd"), com.uc.webview.internal.stats.g.a(map, "id"), com.uc.webview.internal.stats.g.a(map, "fd"), com.uc.webview.internal.stats.g.a(map, "ff"), com.uc.webview.internal.stats.g.a(map, lca.STAGE_T2), com.uc.webview.internal.stats.g.a(map, "fr"), com.uc.webview.internal.stats.g.a(map, ErrorType.DEFAULT), com.uc.webview.internal.stats.g.a(map, "ac"), com.uc.webview.internal.stats.g.a(map, "rr"), (byte) 0);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class an extends com.uc.webview.internal.stats.c {
        private static final com.uc.webview.internal.stats.h aL;
        public long A;
        public long B;
        public long C;
        public long D;
        public long E;
        public long F;
        public long G;
        public long H;
        public long I;
        public long J;
        public String K;
        public long L;
        public long M;
        public long N;
        public long O;
        public long P;
        public long Q;
        public long R;
        public long S;
        public long T;
        public long U;
        public long V;
        public long W;
        public long X;
        public long Y;
        public long Z;
        public long aA;
        public long aB;
        public long aC;
        public String aD;
        public long aE;
        public long aF;
        public long aG;
        public long aH;
        public String aI;
        public long aJ;
        public long aK;
        public long aa;
        public long ab;
        public long ac;
        public long ad;
        public long ae;
        public long af;
        public long ag;
        public long ah;
        public long ai;
        public long aj;
        public long ak;
        public long al;
        public long am;
        public long an;
        public long ao;
        public long ap;
        public long aq;
        public long ar;
        public long as;
        public long at;
        public long au;
        public long av;
        public long aw;
        public long ax;
        public long ay;
        public long az;
        public long b;
        public long c;
        public long d;
        public String e;
        public String f;
        public long g;
        public long h;
        public long i;
        public long j;
        public long k;
        public long l;
        public long m;
        public long n;
        public long o;
        public long p;
        public long q;
        public long r;
        public long s;
        public long t;
        public long u;
        public long v;
        public long w;
        public long x;
        public long y;
        public long z;

        static {
            com.uc.webview.internal.stats.h hVar = new com.uc.webview.internal.stats.h("media_stats");
            aL = hVar;
            StatsManager.a(hVar);
        }

        @Override // com.uc.webview.internal.stats.c
        public final com.uc.webview.internal.stats.h b() {
            return aL;
        }

        @Override // com.uc.webview.internal.stats.c
        public final int c() {
            if (this.f14510a == 0) {
                this.f14510a = com.uc.webview.internal.stats.g.a(this.b) + FaceDetectionReport.NATIVE_FLOAT_OUT_LENGTH + com.uc.webview.internal.stats.g.a(this.c) + com.uc.webview.internal.stats.g.a(this.d) + com.uc.webview.internal.stats.g.a(this.e) + com.uc.webview.internal.stats.g.a(this.f) + com.uc.webview.internal.stats.g.a(this.g) + com.uc.webview.internal.stats.g.a(this.h) + com.uc.webview.internal.stats.g.a(this.i) + com.uc.webview.internal.stats.g.a(this.j) + com.uc.webview.internal.stats.g.a(this.k) + com.uc.webview.internal.stats.g.a(this.l) + com.uc.webview.internal.stats.g.a(this.m) + com.uc.webview.internal.stats.g.a(this.n) + com.uc.webview.internal.stats.g.a(this.o) + com.uc.webview.internal.stats.g.a(this.p) + com.uc.webview.internal.stats.g.a(this.q) + com.uc.webview.internal.stats.g.a(this.r) + com.uc.webview.internal.stats.g.a(this.s) + com.uc.webview.internal.stats.g.a(this.t) + com.uc.webview.internal.stats.g.a(this.u) + com.uc.webview.internal.stats.g.a(this.v) + com.uc.webview.internal.stats.g.a(this.w) + com.uc.webview.internal.stats.g.a(this.x) + com.uc.webview.internal.stats.g.a(this.y) + com.uc.webview.internal.stats.g.a(this.z) + com.uc.webview.internal.stats.g.a(this.A) + com.uc.webview.internal.stats.g.a(this.B) + com.uc.webview.internal.stats.g.a(this.C) + com.uc.webview.internal.stats.g.a(this.D) + com.uc.webview.internal.stats.g.a(this.E) + com.uc.webview.internal.stats.g.a(this.F) + com.uc.webview.internal.stats.g.a(this.G) + com.uc.webview.internal.stats.g.a(this.H) + com.uc.webview.internal.stats.g.a(this.I) + com.uc.webview.internal.stats.g.a(this.J) + com.uc.webview.internal.stats.g.a(this.K) + com.uc.webview.internal.stats.g.a(this.L) + com.uc.webview.internal.stats.g.a(this.M) + com.uc.webview.internal.stats.g.a(this.N) + com.uc.webview.internal.stats.g.a(this.O) + com.uc.webview.internal.stats.g.a(this.P) + com.uc.webview.internal.stats.g.a(this.Q) + com.uc.webview.internal.stats.g.a(this.R) + com.uc.webview.internal.stats.g.a(this.S) + com.uc.webview.internal.stats.g.a(this.T) + com.uc.webview.internal.stats.g.a(this.U) + com.uc.webview.internal.stats.g.a(this.V) + com.uc.webview.internal.stats.g.a(this.W) + com.uc.webview.internal.stats.g.a(this.X) + com.uc.webview.internal.stats.g.a(this.Y) + com.uc.webview.internal.stats.g.a(this.Z) + com.uc.webview.internal.stats.g.a(this.aa) + com.uc.webview.internal.stats.g.a(this.ab) + com.uc.webview.internal.stats.g.a(this.ac) + com.uc.webview.internal.stats.g.a(this.ad) + com.uc.webview.internal.stats.g.a(this.ae) + com.uc.webview.internal.stats.g.a(this.af) + com.uc.webview.internal.stats.g.a(this.ag) + com.uc.webview.internal.stats.g.a(this.ah) + com.uc.webview.internal.stats.g.a(this.ai) + com.uc.webview.internal.stats.g.a(this.aj) + com.uc.webview.internal.stats.g.a(this.ak) + com.uc.webview.internal.stats.g.a(this.al) + com.uc.webview.internal.stats.g.a(this.am) + com.uc.webview.internal.stats.g.a(this.an) + com.uc.webview.internal.stats.g.a(this.ao) + com.uc.webview.internal.stats.g.a(this.ap) + com.uc.webview.internal.stats.g.a(this.aq) + com.uc.webview.internal.stats.g.a(this.ar) + com.uc.webview.internal.stats.g.a(this.as) + com.uc.webview.internal.stats.g.a(this.at) + com.uc.webview.internal.stats.g.a(this.au) + com.uc.webview.internal.stats.g.a(this.av) + com.uc.webview.internal.stats.g.a(this.aw) + com.uc.webview.internal.stats.g.a(this.ax) + com.uc.webview.internal.stats.g.a(this.ay) + com.uc.webview.internal.stats.g.a(this.az) + com.uc.webview.internal.stats.g.a(this.aA) + com.uc.webview.internal.stats.g.a(this.aB) + com.uc.webview.internal.stats.g.a(this.aC) + com.uc.webview.internal.stats.g.a(this.aD) + com.uc.webview.internal.stats.g.a(this.aE) + com.uc.webview.internal.stats.g.a(this.aF) + com.uc.webview.internal.stats.g.a(this.aG) + com.uc.webview.internal.stats.g.a(this.aH) + com.uc.webview.internal.stats.g.a(this.aI) + com.uc.webview.internal.stats.g.a(this.aJ) + com.uc.webview.internal.stats.g.a(this.aK);
            }
            return this.f14510a;
        }

        @Override // com.uc.webview.internal.stats.c
        public final int d() {
            return FaceDetectionReport.NATIVE_FLOAT_OUT_LENGTH;
        }

        @Override // com.uc.webview.internal.stats.c
        public final Map<String, String> e() {
            HashMap hashMap = new HashMap();
            hashMap.put("_t3", String.valueOf(this.b));
            hashMap.put("_t3n", String.valueOf(this.c));
            hashMap.put("_blob", String.valueOf(this.d));
            String str = this.e;
            String str2 = "";
            if (str == null) {
                str = str2;
            }
            hashMap.put("_ph", str);
            String str3 = this.f;
            if (str3 == null) {
                str3 = str2;
            }
            hashMap.put("_src", str3);
            hashMap.put("_nt", String.valueOf(this.g));
            hashMap.put("_errt", String.valueOf(this.h));
            hashMap.put("_errc", String.valueOf(this.i));
            hashMap.put("_erre", String.valueOf(this.j));
            hashMap.put("_ket", String.valueOf(this.k));
            hashMap.put("_kec", String.valueOf(this.l));
            hashMap.put("_kee", String.valueOf(this.m));
            hashMap.put("_cv", String.valueOf(this.n));
            hashMap.put("_tm", String.valueOf(this.o));
            hashMap.put("_td", String.valueOf(this.p));
            hashMap.put("_tdn", String.valueOf(this.q));
            hashMap.put("_pr", String.valueOf(this.r));
            hashMap.put("_dur", String.valueOf(this.s));
            hashMap.put("_pd", String.valueOf(this.t));
            hashMap.put("_sc", String.valueOf(this.u));
            hashMap.put("_st", String.valueOf(this.v));
            hashMap.put("_bc", String.valueOf(this.w));
            hashMap.put("_bt", String.valueOf(this.x));
            hashMap.put("_pt", String.valueOf(this.y));
            hashMap.put("_t0", String.valueOf(this.z));
            hashMap.put("_gcf", String.valueOf(this.A));
            hashMap.put("_bk", String.valueOf(this.B));
            hashMap.put("_ap", String.valueOf(this.C));
            hashMap.put("_mss", String.valueOf(this.D));
            hashMap.put("_ctr", String.valueOf(this.E));
            hashMap.put("_at", String.valueOf(this.F));
            hashMap.put("_mt", String.valueOf(this.G));
            hashMap.put("_aty", String.valueOf(this.H));
            hashMap.put("_lp", String.valueOf(this.I));
            hashMap.put("_fr", String.valueOf(this.J));
            String str4 = this.K;
            if (str4 == null) {
                str4 = str2;
            }
            hashMap.put("_ver", str4);
            hashMap.put("_rhp", String.valueOf(this.L));
            hashMap.put("_ucf", String.valueOf(this.M));
            hashMap.put("_tp", String.valueOf(this.N));
            hashMap.put("_ts", String.valueOf(this.O));
            hashMap.put("_tpp", String.valueOf(this.P));
            hashMap.put("_tpp2", String.valueOf(this.Q));
            hashMap.put("_dl", String.valueOf(this.R));
            hashMap.put("_vm", String.valueOf(this.S));
            hashMap.put("_sf", String.valueOf(this.T));
            hashMap.put("_se", String.valueOf(this.U));
            hashMap.put("_af", String.valueOf(this.V));
            hashMap.put("_ef", String.valueOf(this.W));
            hashMap.put("_cf", String.valueOf(this.X));
            hashMap.put("_ef1", String.valueOf(this.Y));
            hashMap.put("_cf1", String.valueOf(this.Z));
            hashMap.put("_lw", String.valueOf(this.aa));
            hashMap.put("_lh", String.valueOf(this.ab));
            hashMap.put("_adt", String.valueOf(this.ac));
            hashMap.put("_adtd", String.valueOf(this.ad));
            hashMap.put("_rt", String.valueOf(this.ae));
            hashMap.put("_bc2", String.valueOf(this.af));
            hashMap.put("_bt2", String.valueOf(this.ag));
            hashMap.put("_upr", String.valueOf(this.ah));
            hashMap.put("_upt", String.valueOf(this.ai));
            hashMap.put("_csv", String.valueOf(this.aj));
            hashMap.put("_csv1", String.valueOf(this.ak));
            hashMap.put("_usm", String.valueOf(this.al));
            hashMap.put("_udmc", String.valueOf(this.am));
            hashMap.put("_pl", String.valueOf(this.an));
            hashMap.put("_wt", String.valueOf(this.ao));
            hashMap.put("_efc", String.valueOf(this.ap));
            hashMap.put("_efct", String.valueOf(this.aq));
            hashMap.put("_jsc", String.valueOf(this.ar));
            hashMap.put("_th", String.valueOf(this.as));
            hashMap.put("_ce", String.valueOf(this.at));
            hashMap.put("_hb", String.valueOf(this.au));
            hashMap.put("_hbr", String.valueOf(this.av));
            hashMap.put("_el", String.valueOf(this.aw));
            hashMap.put("_cl", String.valueOf(this.ax));
            hashMap.put("_ef3", String.valueOf(this.ay));
            hashMap.put("_cf3", String.valueOf(this.az));
            hashMap.put("_sd", String.valueOf(this.aA));
            hashMap.put("_sd2", String.valueOf(this.aB));
            hashMap.put("_ib", String.valueOf(this.aC));
            String str5 = this.aD;
            if (str5 == null) {
                str5 = str2;
            }
            hashMap.put("_bid", str5);
            hashMap.put("_unca", String.valueOf(this.aE));
            hashMap.put("_jsf", String.valueOf(this.aF));
            hashMap.put("_cvc", String.valueOf(this.aG));
            hashMap.put("_nafr", String.valueOf(this.aH));
            String str6 = this.aI;
            if (str6 != null) {
                str2 = str6;
            }
            hashMap.put("_fd", str2);
            hashMap.put("_mini", String.valueOf(this.aJ));
            hashMap.put("_fbm", String.valueOf(this.aK));
            return hashMap;
        }

        @Override // com.uc.webview.internal.stats.c
        public final /* synthetic */ com.uc.webview.internal.stats.c f() {
            return new an(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, this.P, this.Q, this.R, this.S, this.T, this.U, this.V, this.W, this.X, this.Y, this.Z, this.aa, this.ab, this.ac, this.ad, this.ae, this.af, this.ag, this.ah, this.ai, this.aj, this.ak, this.al, this.am, this.an, this.ao, this.ap, this.aq, this.ar, this.as, this.at, this.au, this.av, this.aw, this.ax, this.ay, this.az, this.aA, this.aB, this.aC, this.aD, this.aE, this.aF, this.aG, this.aH, this.aI, this.aJ, this.aK);
        }

        @Override // com.uc.webview.internal.stats.c
        public final String j() {
            return "media_stats";
        }

        @Override // com.uc.webview.internal.stats.c
        public final void k() {
            this.b = 0L;
            this.c = 0L;
            this.d = 0L;
            this.e = null;
            this.f = null;
            this.g = 0L;
            this.h = 0L;
            this.i = 0L;
            this.j = 0L;
            this.k = 0L;
            this.l = 0L;
            this.m = 0L;
            this.n = 0L;
            this.o = 0L;
            this.p = 0L;
            this.q = 0L;
            this.r = 0L;
            this.s = 0L;
            this.t = 0L;
            this.u = 0L;
            this.v = 0L;
            this.w = 0L;
            this.x = 0L;
            this.y = 0L;
            this.z = 0L;
            this.A = 0L;
            this.B = 0L;
            this.C = 0L;
            this.D = 0L;
            this.E = 0L;
            this.F = 0L;
            this.G = 0L;
            this.H = 0L;
            this.I = 0L;
            this.J = 0L;
            this.K = null;
            this.L = 0L;
            this.M = 0L;
            this.N = 0L;
            this.O = 0L;
            this.P = 0L;
            this.Q = 0L;
            this.R = 0L;
            this.S = 0L;
            this.T = 0L;
            this.U = 0L;
            this.V = 0L;
            this.W = 0L;
            this.X = 0L;
            this.Y = 0L;
            this.Z = 0L;
            this.aa = 0L;
            this.ab = 0L;
            this.ac = 0L;
            this.ad = 0L;
            this.ae = 0L;
            this.af = 0L;
            this.ag = 0L;
            this.ah = 0L;
            this.ai = 0L;
            this.aj = 0L;
            this.ak = 0L;
            this.al = 0L;
            this.am = 0L;
            this.an = 0L;
            this.ao = 0L;
            this.ap = 0L;
            this.aq = 0L;
            this.ar = 0L;
            this.as = 0L;
            this.at = 0L;
            this.au = 0L;
            this.av = 0L;
            this.aw = 0L;
            this.ax = 0L;
            this.ay = 0L;
            this.az = 0L;
            this.aA = 0L;
            this.aB = 0L;
            this.aC = 0L;
            this.aD = null;
            this.aE = 0L;
            this.aF = 0L;
            this.aG = 0L;
            this.aH = 0L;
            this.aI = null;
            this.aJ = 0L;
            this.aK = 0L;
            this.f14510a = 0;
        }

        public final String toString() {
            return com.uc.webview.internal.stats.c.a("media_stats", e());
        }

        public an() {
        }

        private an(long j, long j2, long j3, String str, String str2, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, String str3, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45, long j46, long j47, long j48, long j49, long j50, long j51, long j52, long j53, long j54, long j55, long j56, long j57, long j58, long j59, long j60, long j61, long j62, long j63, long j64, long j65, long j66, long j67, long j68, long j69, long j70, long j71, long j72, long j73, long j74, long j75, long j76, long j77, String str4, long j78, long j79, long j80, long j81, String str5, long j82, long j83) {
            String str6 = str;
            this.b = j;
            this.c = j2;
            this.d = j3;
            this.g = j4;
            this.h = j5;
            this.i = j6;
            this.j = j7;
            this.k = j8;
            this.l = j9;
            this.m = j10;
            this.n = j11;
            this.o = j12;
            this.p = j13;
            this.q = j14;
            this.r = j15;
            this.s = j16;
            this.t = j17;
            this.u = j18;
            this.v = j19;
            this.w = j20;
            this.x = j21;
            this.y = j22;
            this.z = j23;
            this.A = j24;
            this.B = j25;
            this.C = j26;
            this.D = j27;
            this.E = j28;
            this.F = j29;
            this.G = j30;
            this.H = j31;
            this.I = j32;
            this.J = j33;
            this.L = j34;
            this.M = j35;
            this.N = j36;
            this.O = j37;
            this.P = j38;
            this.Q = j39;
            this.R = j40;
            this.S = j41;
            this.T = j42;
            this.U = j43;
            this.V = j44;
            this.W = j45;
            this.X = j46;
            this.Y = j47;
            this.Z = j48;
            this.aa = j49;
            this.ab = j50;
            this.ac = j51;
            this.ad = j52;
            this.ae = j53;
            this.af = j54;
            this.ag = j55;
            this.ah = j56;
            this.ai = j57;
            this.aj = j58;
            this.ak = j59;
            this.al = j60;
            this.am = j61;
            this.an = j62;
            this.ao = j63;
            this.ap = j64;
            this.aq = j65;
            this.ar = j66;
            this.as = j67;
            this.at = j68;
            this.au = j69;
            this.av = j70;
            this.aw = j71;
            this.ax = j72;
            this.ay = j73;
            this.az = j74;
            this.aA = j75;
            this.aB = j76;
            this.aC = j77;
            this.aE = j78;
            this.aF = j79;
            this.aG = j80;
            this.aH = j81;
            this.aJ = j82;
            this.aK = j83;
            if (str6 != null && str.length() > 64) {
                str6 = str6.substring(0, 64);
            }
            this.e = str6;
            if (str2 == null || str2.length() <= 64) {
                this.f = str2;
            } else {
                this.f = str2.substring(0, 64);
            }
            if (str3 == null || str3.length() <= 64) {
                this.K = str3;
            } else {
                this.K = str3.substring(0, 64);
            }
            if (str4 == null || str4.length() <= 10) {
                this.aD = str4;
            } else {
                this.aD = str4.substring(0, 10);
            }
            if (str5 == null || str5.length() <= 10) {
                this.aI = str5;
            } else {
                this.aI = str5.substring(0, 10);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class ao implements c.a {
        private ao() {
        }

        public /* synthetic */ ao(byte b) {
            this();
        }

        @Override // com.uc.webview.internal.stats.c.a
        public final com.uc.webview.internal.stats.c a(Map<String, String> map) {
            return new an(com.uc.webview.internal.stats.g.a(map, lca.STAGE_T3), com.uc.webview.internal.stats.g.a(map, "t3n"), com.uc.webview.internal.stats.g.a(map, "blob"), com.uc.webview.internal.stats.g.a(map, "ph", ""), com.uc.webview.internal.stats.g.a(map, "src", ""), com.uc.webview.internal.stats.g.a(map, "nt"), com.uc.webview.internal.stats.g.a(map, "errt"), com.uc.webview.internal.stats.g.a(map, "errc"), com.uc.webview.internal.stats.g.a(map, "erre"), com.uc.webview.internal.stats.g.a(map, "ket"), com.uc.webview.internal.stats.g.a(map, "kec"), com.uc.webview.internal.stats.g.a(map, "kee"), com.uc.webview.internal.stats.g.a(map, DispatchConstants.CONFIG_VERSION), com.uc.webview.internal.stats.g.a(map, "tm"), com.uc.webview.internal.stats.g.a(map, TimeDisplaySetting.TIME_DISPLAY), com.uc.webview.internal.stats.g.a(map, "tdn"), com.uc.webview.internal.stats.g.a(map, "pr"), com.uc.webview.internal.stats.g.a(map, "dur"), com.uc.webview.internal.stats.g.a(map, "pd"), com.uc.webview.internal.stats.g.a(map, "sc"), com.uc.webview.internal.stats.g.a(map, "st"), com.uc.webview.internal.stats.g.a(map, "bc"), com.uc.webview.internal.stats.g.a(map, "bt"), com.uc.webview.internal.stats.g.a(map, AdvertisementOption.PRIORITY_VALID_TIME), com.uc.webview.internal.stats.g.a(map, lca.STAGE_T0), com.uc.webview.internal.stats.g.a(map, "gcf"), com.uc.webview.internal.stats.g.a(map, "bk"), com.uc.webview.internal.stats.g.a(map, "ap"), com.uc.webview.internal.stats.g.a(map, "mss"), com.uc.webview.internal.stats.g.a(map, "ctr"), com.uc.webview.internal.stats.g.a(map, "at"), com.uc.webview.internal.stats.g.a(map, "mt"), com.uc.webview.internal.stats.g.a(map, "aty"), com.uc.webview.internal.stats.g.a(map, "lp"), com.uc.webview.internal.stats.g.a(map, "fr"), com.uc.webview.internal.stats.g.a(map, MspDBHelper.RecordEntry.COLUMN_NAME_VERSION, ""), com.uc.webview.internal.stats.g.a(map, "rhp"), com.uc.webview.internal.stats.g.a(map, "ucf"), com.uc.webview.internal.stats.g.a(map, "tp"), com.uc.webview.internal.stats.g.a(map, "ts"), com.uc.webview.internal.stats.g.a(map, "tpp"), com.uc.webview.internal.stats.g.a(map, "tpp2"), com.uc.webview.internal.stats.g.a(map, "dl"), com.uc.webview.internal.stats.g.a(map, "vm"), com.uc.webview.internal.stats.g.a(map, "sf"), com.uc.webview.internal.stats.g.a(map, "se"), com.uc.webview.internal.stats.g.a(map, "af"), com.uc.webview.internal.stats.g.a(map, "ef"), com.uc.webview.internal.stats.g.a(map, "cf"), com.uc.webview.internal.stats.g.a(map, "ef1"), com.uc.webview.internal.stats.g.a(map, "cf1"), com.uc.webview.internal.stats.g.a(map, "lw"), com.uc.webview.internal.stats.g.a(map, "lh"), com.uc.webview.internal.stats.g.a(map, "adt"), com.uc.webview.internal.stats.g.a(map, "adtd"), com.uc.webview.internal.stats.g.a(map, "rt"), com.uc.webview.internal.stats.g.a(map, "bc2"), com.uc.webview.internal.stats.g.a(map, "bt2"), com.uc.webview.internal.stats.g.a(map, "upr"), com.uc.webview.internal.stats.g.a(map, "upt"), com.uc.webview.internal.stats.g.a(map, "csv"), com.uc.webview.internal.stats.g.a(map, "csv1"), com.uc.webview.internal.stats.g.a(map, "usm"), com.uc.webview.internal.stats.g.a(map, "udmc"), com.uc.webview.internal.stats.g.a(map, "pl"), com.uc.webview.internal.stats.g.a(map, "wt"), com.uc.webview.internal.stats.g.a(map, "efc"), com.uc.webview.internal.stats.g.a(map, "efct"), com.uc.webview.internal.stats.g.a(map, "jsc"), com.uc.webview.internal.stats.g.a(map, "th"), com.uc.webview.internal.stats.g.a(map, "ce"), com.uc.webview.internal.stats.g.a(map, "hb"), com.uc.webview.internal.stats.g.a(map, "hbr"), com.uc.webview.internal.stats.g.a(map, "el"), com.uc.webview.internal.stats.g.a(map, "cl"), com.uc.webview.internal.stats.g.a(map, "ef3"), com.uc.webview.internal.stats.g.a(map, "cf3"), com.uc.webview.internal.stats.g.a(map, MediaConstant.DEFINITION_SD), com.uc.webview.internal.stats.g.a(map, "sd2"), com.uc.webview.internal.stats.g.a(map, "ib"), com.uc.webview.internal.stats.g.a(map, "bid", ""), com.uc.webview.internal.stats.g.a(map, "unca"), com.uc.webview.internal.stats.g.a(map, "jsf"), com.uc.webview.internal.stats.g.a(map, "cvc"), com.uc.webview.internal.stats.g.a(map, "nafr"), com.uc.webview.internal.stats.g.a(map, "fd", ""), com.uc.webview.internal.stats.g.a(map, zj4.SDK_TYPE), com.uc.webview.internal.stats.g.a(map, "fbm"));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class ap extends com.uc.webview.internal.stats.c {
        private static final com.uc.webview.internal.stats.h g;
        public long b;
        public long c;
        public long d;
        public long e;
        public String f;

        static {
            com.uc.webview.internal.stats.h hVar = new com.uc.webview.internal.stats.h("pass_fail");
            g = hVar;
            StatsManager.a(hVar);
        }

        public /* synthetic */ ap(long j, long j2, long j3, long j4, String str, byte b) {
            this(j, j2, j3, j4, str);
        }

        @Override // com.uc.webview.internal.stats.c
        public final com.uc.webview.internal.stats.h b() {
            return g;
        }

        @Override // com.uc.webview.internal.stats.c
        public final int c() {
            if (this.f14510a == 0) {
                this.f14510a = com.uc.webview.internal.stats.g.a(this.b) + 10 + com.uc.webview.internal.stats.g.a(this.c) + com.uc.webview.internal.stats.g.a(this.d) + com.uc.webview.internal.stats.g.a(this.e) + com.uc.webview.internal.stats.g.a(this.f);
            }
            return this.f14510a;
        }

        @Override // com.uc.webview.internal.stats.c
        public final int d() {
            return 10;
        }

        @Override // com.uc.webview.internal.stats.c
        public final Map<String, String> e() {
            HashMap hashMap = new HashMap();
            hashMap.put("_r", String.valueOf(this.b));
            hashMap.put("_o", String.valueOf(this.c));
            hashMap.put("_s", String.valueOf(this.d));
            hashMap.put("_n", String.valueOf(this.e));
            String str = this.f;
            if (str == null) {
                str = "";
            }
            hashMap.put("_m", str);
            return hashMap;
        }

        @Override // com.uc.webview.internal.stats.c
        public final /* synthetic */ com.uc.webview.internal.stats.c f() {
            return new ap(this.b, this.c, this.d, this.e, this.f);
        }

        @Override // com.uc.webview.internal.stats.c
        public final String j() {
            return "pass_fail";
        }

        @Override // com.uc.webview.internal.stats.c
        public final void k() {
            this.b = 0L;
            this.c = 0L;
            this.d = 0L;
            this.e = 0L;
            this.f = null;
            this.f14510a = 0;
        }

        public final String toString() {
            return com.uc.webview.internal.stats.c.a("pass_fail", e());
        }

        public ap() {
        }

        private ap(long j, long j2, long j3, long j4, String str) {
            this.b = j;
            this.c = j2;
            this.d = j3;
            this.e = j4;
            if (str == null || str.length() <= 64) {
                this.f = str;
            } else {
                this.f = str.substring(0, 64);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class aq implements c.a {
        private aq() {
        }

        @Override // com.uc.webview.internal.stats.c.a
        public final com.uc.webview.internal.stats.c a(Map<String, String> map) {
            return new ap(com.uc.webview.internal.stats.g.a(map, "r"), com.uc.webview.internal.stats.g.a(map, com.alibaba.security.realidentity.o.b), com.uc.webview.internal.stats.g.a(map, "s"), com.uc.webview.internal.stats.g.a(map, "n"), com.uc.webview.internal.stats.g.a(map, "m", ""), (byte) 0);
        }

        public /* synthetic */ aq(byte b) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class ar extends com.uc.webview.internal.stats.c {
        static final /* synthetic */ boolean d = true;
        private static final com.uc.webview.internal.stats.h e;
        public String b;
        public long c;

        static {
            com.uc.webview.internal.stats.h hVar = new com.uc.webview.internal.stats.h("pinch_zoom");
            e = hVar;
            StatsManager.a(hVar);
        }

        public /* synthetic */ ar(String str, long j, byte b) {
            this(str, j);
        }

        @Override // com.uc.webview.internal.stats.c
        public final boolean a(com.uc.webview.internal.stats.c cVar) {
            if (d || (cVar instanceof ar)) {
                ar arVar = (ar) cVar;
                String str = this.b;
                if (str == null || !str.equals(arVar.b)) {
                    return false;
                }
                return true;
            }
            throw new AssertionError();
        }

        @Override // com.uc.webview.internal.stats.c
        public final com.uc.webview.internal.stats.h b() {
            return e;
        }

        @Override // com.uc.webview.internal.stats.c
        public final int c() {
            if (this.f14510a == 0) {
                this.f14510a = com.uc.webview.internal.stats.g.a(this.b) + 4 + com.uc.webview.internal.stats.g.a(this.c);
            }
            return this.f14510a;
        }

        @Override // com.uc.webview.internal.stats.c
        public final int d() {
            return 4;
        }

        @Override // com.uc.webview.internal.stats.c
        public final Map<String, String> e() {
            HashMap hashMap = new HashMap();
            String str = this.b;
            if (str == null) {
                str = "";
            }
            hashMap.put("_u", str);
            hashMap.put("_c", String.valueOf(this.c));
            return hashMap;
        }

        @Override // com.uc.webview.internal.stats.c
        public final /* synthetic */ com.uc.webview.internal.stats.c f() {
            return new ar(this.b, this.c);
        }

        @Override // com.uc.webview.internal.stats.c
        public final String j() {
            return "pinch_zoom";
        }

        @Override // com.uc.webview.internal.stats.c
        public final void k() {
            this.b = null;
            this.c = 0L;
            this.f14510a = 0;
        }

        public final String toString() {
            return com.uc.webview.internal.stats.c.a("pinch_zoom", e());
        }

        public ar() {
        }

        @Override // com.uc.webview.internal.stats.c
        public final void b(com.uc.webview.internal.stats.c cVar) {
            if (d || (cVar instanceof ar)) {
                this.c += ((ar) cVar).c;
                this.f14510a = 0;
                return;
            }
            throw new AssertionError();
        }

        private ar(String str, long j) {
            this.c = j;
            if (str == null || str.length() <= 256) {
                this.b = str;
            } else {
                this.b = str.substring(0, 256);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class as implements c.a {
        private as() {
        }

        @Override // com.uc.webview.internal.stats.c.a
        public final com.uc.webview.internal.stats.c a(Map<String, String> map) {
            return new ar(com.uc.webview.internal.stats.g.a(map, "u", ""), com.uc.webview.internal.stats.g.a(map, "c"), (byte) 0);
        }

        public /* synthetic */ as(byte b) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class at extends com.uc.webview.internal.stats.c {
        private static final com.uc.webview.internal.stats.h f;
        public long b;
        public long c;
        public long d;
        public long e;

        static {
            com.uc.webview.internal.stats.h hVar = new com.uc.webview.internal.stats.h("prerender_v0");
            f = hVar;
            StatsManager.a(hVar);
        }

        public /* synthetic */ at(long j, long j2, long j3, long j4, byte b) {
            this(j, j2, j3, j4);
        }

        @Override // com.uc.webview.internal.stats.c
        public final com.uc.webview.internal.stats.h b() {
            return f;
        }

        @Override // com.uc.webview.internal.stats.c
        public final int c() {
            if (this.f14510a == 0) {
                this.f14510a = com.uc.webview.internal.stats.g.a(this.b) + 12 + com.uc.webview.internal.stats.g.a(this.c) + com.uc.webview.internal.stats.g.a(this.d) + com.uc.webview.internal.stats.g.a(this.e);
            }
            return this.f14510a;
        }

        @Override // com.uc.webview.internal.stats.c
        public final int d() {
            return 12;
        }

        @Override // com.uc.webview.internal.stats.c
        public final Map<String, String> e() {
            HashMap hashMap = new HashMap();
            hashMap.put("_ps", String.valueOf(this.b));
            hashMap.put("_pr", String.valueOf(this.c));
            hashMap.put("_rs", String.valueOf(this.d));
            hashMap.put("_pt", String.valueOf(this.e));
            return hashMap;
        }

        @Override // com.uc.webview.internal.stats.c
        public final /* synthetic */ com.uc.webview.internal.stats.c f() {
            return new at(this.b, this.c, this.d, this.e);
        }

        @Override // com.uc.webview.internal.stats.c
        public final String j() {
            return "prerender_v0";
        }

        @Override // com.uc.webview.internal.stats.c
        public final void k() {
            this.b = 0L;
            this.c = 0L;
            this.d = 0L;
            this.e = 0L;
            this.f14510a = 0;
        }

        public final String toString() {
            return com.uc.webview.internal.stats.c.a("prerender_v0", e());
        }

        public at() {
        }

        private at(long j, long j2, long j3, long j4) {
            this.b = j;
            this.c = j2;
            this.d = j3;
            this.e = j4;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class au implements c.a {
        private au() {
        }

        @Override // com.uc.webview.internal.stats.c.a
        public final com.uc.webview.internal.stats.c a(Map<String, String> map) {
            return new at(com.uc.webview.internal.stats.g.a(map, "ps"), com.uc.webview.internal.stats.g.a(map, "pr"), com.uc.webview.internal.stats.g.a(map, "rs"), com.uc.webview.internal.stats.g.a(map, AdvertisementOption.PRIORITY_VALID_TIME), (byte) 0);
        }

        public /* synthetic */ au(byte b) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class av extends com.uc.webview.internal.stats.c {
        private static final com.uc.webview.internal.stats.h c;
        public String b;

        static {
            com.uc.webview.internal.stats.h hVar = new com.uc.webview.internal.stats.h("proc_stats2");
            c = hVar;
            StatsManager.a(hVar);
        }

        public /* synthetic */ av(String str, byte b) {
            this(str);
        }

        @Override // com.uc.webview.internal.stats.c
        public final com.uc.webview.internal.stats.h b() {
            return c;
        }

        @Override // com.uc.webview.internal.stats.c
        public final int c() {
            if (this.f14510a == 0) {
                this.f14510a = com.uc.webview.internal.stats.g.a(this.b) + 6;
            }
            return this.f14510a;
        }

        @Override // com.uc.webview.internal.stats.c
        public final int d() {
            return 6;
        }

        @Override // com.uc.webview.internal.stats.c
        public final Map<String, String> e() {
            HashMap hashMap = new HashMap();
            String str = this.b;
            if (str == null) {
                str = "";
            }
            hashMap.put("_procs", str);
            return hashMap;
        }

        @Override // com.uc.webview.internal.stats.c
        public final /* synthetic */ com.uc.webview.internal.stats.c f() {
            return new av(this.b);
        }

        @Override // com.uc.webview.internal.stats.c
        public final String j() {
            return "proc_stats2";
        }

        @Override // com.uc.webview.internal.stats.c
        public final void k() {
            this.b = null;
            this.f14510a = 0;
        }

        public final String toString() {
            return com.uc.webview.internal.stats.c.a("proc_stats2", e());
        }

        public av() {
        }

        private av(String str) {
            if (str == null || str.length() <= 256) {
                this.b = str;
            } else {
                this.b = str.substring(0, 256);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class aw implements c.a {
        private aw() {
        }

        @Override // com.uc.webview.internal.stats.c.a
        public final com.uc.webview.internal.stats.c a(Map<String, String> map) {
            return new av(com.uc.webview.internal.stats.g.a(map, "procs", ""), (byte) 0);
        }

        public /* synthetic */ aw(byte b) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class ax extends com.uc.webview.internal.stats.c {
        static final /* synthetic */ boolean f = true;
        private static final com.uc.webview.internal.stats.h g;
        public long b;
        public long c;
        public long d;
        public long e;

        static {
            com.uc.webview.internal.stats.h hVar = new com.uc.webview.internal.stats.h("sdkpv");
            g = hVar;
            StatsManager.a(hVar);
        }

        public /* synthetic */ ax(long j, long j2, long j3, long j4, byte b) {
            this(j, j2, j3, j4);
        }

        @Override // com.uc.webview.internal.stats.c
        public final boolean a(com.uc.webview.internal.stats.c cVar) {
            if (!f && !(cVar instanceof ax)) {
                throw new AssertionError();
            } else if (this.b == ((ax) cVar).b) {
                return true;
            } else {
                return false;
            }
        }

        @Override // com.uc.webview.internal.stats.c
        public final com.uc.webview.internal.stats.h b() {
            return g;
        }

        @Override // com.uc.webview.internal.stats.c
        public final int c() {
            if (this.f14510a == 0) {
                this.f14510a = com.uc.webview.internal.stats.g.a(this.b) + 16 + com.uc.webview.internal.stats.g.a(this.c) + com.uc.webview.internal.stats.g.a(this.d) + com.uc.webview.internal.stats.g.a(this.e);
            }
            return this.f14510a;
        }

        @Override // com.uc.webview.internal.stats.c
        public final int d() {
            return 16;
        }

        @Override // com.uc.webview.internal.stats.c
        public final Map<String, String> e() {
            HashMap hashMap = new HashMap();
            hashMap.put("_pvt", Long.toString(this.b));
            long j = this.c;
            if (0 != j) {
                hashMap.put("_pvu", Long.toString(j));
            }
            long j2 = this.d;
            if (0 != j2) {
                hashMap.put("_pvs", Long.toString(j2));
            }
            long j3 = this.e;
            if (0 != j3) {
                hashMap.put("_pvi", Long.toString(j3));
            }
            return hashMap;
        }

        @Override // com.uc.webview.internal.stats.c
        public final /* synthetic */ com.uc.webview.internal.stats.c f() {
            return new ax(this.b, this.c, this.d, this.e);
        }

        @Override // com.uc.webview.internal.stats.c
        public final String j() {
            return "sdkpv";
        }

        @Override // com.uc.webview.internal.stats.c
        public final void k() {
            this.b = 0L;
            this.c = 0L;
            this.d = 0L;
            this.e = 0L;
            this.f14510a = 0;
        }

        public final String toString() {
            return com.uc.webview.internal.stats.c.a("sdkpv", e());
        }

        public ax() {
        }

        @Override // com.uc.webview.internal.stats.c
        public final void b(com.uc.webview.internal.stats.c cVar) {
            if (f || (cVar instanceof ax)) {
                ax axVar = (ax) cVar;
                this.c += axVar.c;
                this.d += axVar.d;
                this.e += axVar.e;
                this.f14510a = 0;
                return;
            }
            throw new AssertionError();
        }

        private ax(long j, long j2, long j3, long j4) {
            this.b = j;
            this.c = j2;
            this.d = j3;
            this.e = j4;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class ay implements c.a {
        private ay() {
        }

        @Override // com.uc.webview.internal.stats.c.a
        public final com.uc.webview.internal.stats.c a(Map<String, String> map) {
            return new ax(com.uc.webview.internal.stats.g.a(map, "pvt"), com.uc.webview.internal.stats.g.a(map, "pvu"), com.uc.webview.internal.stats.g.a(map, "pvs"), com.uc.webview.internal.stats.g.a(map, "pvi"), (byte) 0);
        }

        public /* synthetic */ ay(byte b) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class az extends com.uc.webview.internal.stats.c {
        private static final com.uc.webview.internal.stats.h q;
        public long b;
        public long c;
        public long d;
        public long e;
        public String f;
        public String g;
        public long h;
        public String i;
        public long j;
        public long k;
        public long l;
        public String m;
        public String n;
        public String o;
        public long p;

        static {
            com.uc.webview.internal.stats.h hVar = new com.uc.webview.internal.stats.h("sdksat");
            q = hVar;
            StatsManager.a(hVar);
        }

        public /* synthetic */ az(long j, long j2, long j3, long j4, String str, String str2, long j5, String str3, long j6, long j7, long j8, String str4, String str5, String str6, long j9, byte b) {
            this(j, j2, j3, j4, str, str2, j5, str3, j6, j7, j8, str4, str5, str6, j9);
        }

        @Override // com.uc.webview.internal.stats.c
        public final com.uc.webview.internal.stats.h b() {
            return q;
        }

        @Override // com.uc.webview.internal.stats.c
        public final int c() {
            if (this.f14510a == 0) {
                this.f14510a = com.uc.webview.internal.stats.g.a(this.b) + 57 + com.uc.webview.internal.stats.g.a(this.c) + com.uc.webview.internal.stats.g.a(this.d) + com.uc.webview.internal.stats.g.a(this.e) + com.uc.webview.internal.stats.g.a(this.f) + com.uc.webview.internal.stats.g.a(this.g) + com.uc.webview.internal.stats.g.a(this.h) + com.uc.webview.internal.stats.g.a(this.i) + com.uc.webview.internal.stats.g.a(this.j) + com.uc.webview.internal.stats.g.a(this.k) + com.uc.webview.internal.stats.g.a(this.l) + com.uc.webview.internal.stats.g.a(this.m) + com.uc.webview.internal.stats.g.a(this.n) + com.uc.webview.internal.stats.g.a(this.o) + com.uc.webview.internal.stats.g.a(this.p);
            }
            return this.f14510a;
        }

        @Override // com.uc.webview.internal.stats.c
        public final int d() {
            return 57;
        }

        @Override // com.uc.webview.internal.stats.c
        public final Map<String, String> e() {
            HashMap hashMap = new HashMap();
            hashMap.put("_ia", String.valueOf(this.b));
            hashMap.put("_rs", String.valueOf(this.c));
            hashMap.put("_fs", String.valueOf(this.d));
            hashMap.put("_kim", String.valueOf(this.e));
            String str = this.f;
            String str2 = "";
            if (str == null) {
                str = str2;
            }
            hashMap.put("_kpd", str);
            String str3 = this.g;
            if (str3 == null) {
                str3 = str2;
            }
            hashMap.put("_ket", str3);
            hashMap.put("_src", String.valueOf(this.h));
            String str4 = this.i;
            if (str4 == null) {
                str4 = str2;
            }
            hashMap.put("_srd", str4);
            hashMap.put("_riv", String.valueOf(this.j));
            hashMap.put("_ria", String.valueOf(this.k));
            hashMap.put("_rie", String.valueOf(this.l));
            String str5 = this.m;
            if (str5 == null) {
                str5 = str2;
            }
            hashMap.put("_ret", str5);
            String str6 = this.n;
            if (str6 == null) {
                str6 = str2;
            }
            hashMap.put("_rsc", str6);
            String str7 = this.o;
            if (str7 != null) {
                str2 = str7;
            }
            hashMap.put("_rfm", str2);
            hashMap.put("_rrs", String.valueOf(this.p));
            return hashMap;
        }

        @Override // com.uc.webview.internal.stats.c
        public final /* synthetic */ com.uc.webview.internal.stats.c f() {
            return new az(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p);
        }

        @Override // com.uc.webview.internal.stats.c
        public final String j() {
            return "sdksat";
        }

        @Override // com.uc.webview.internal.stats.c
        public final void k() {
            this.b = 0L;
            this.c = 0L;
            this.d = 0L;
            this.e = 0L;
            this.f = null;
            this.g = null;
            this.h = 0L;
            this.i = null;
            this.j = 0L;
            this.k = 0L;
            this.l = 0L;
            this.m = null;
            this.n = null;
            this.o = null;
            this.p = 0L;
            this.f14510a = 0;
        }

        public final String toString() {
            return com.uc.webview.internal.stats.c.a("sdksat", e());
        }

        public az() {
        }

        private az(long j, long j2, long j3, long j4, String str, String str2, long j5, String str3, long j6, long j7, long j8, String str4, String str5, String str6, long j9) {
            String str7 = str;
            this.b = j;
            this.c = j2;
            this.d = j3;
            this.e = j4;
            this.h = j5;
            this.j = j6;
            this.k = j7;
            this.l = j8;
            this.p = j9;
            if (str7 != null && str.length() > 64) {
                str7 = str7.substring(0, 64);
            }
            this.f = str7;
            if (str2 == null || str2.length() <= 64) {
                this.g = str2;
            } else {
                this.g = str2.substring(0, 64);
            }
            if (str3 == null || str3.length() <= 64) {
                this.i = str3;
            } else {
                this.i = str3.substring(0, 64);
            }
            if (str4 == null || str4.length() <= 64) {
                this.m = str4;
            } else {
                this.m = str4.substring(0, 64);
            }
            if (str5 == null || str5.length() <= 64) {
                this.n = str5;
            } else {
                this.n = str5.substring(0, 64);
            }
            if (str6 == null || str6.length() <= 64) {
                this.o = str6;
            } else {
                this.o = str6.substring(0, 64);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class b extends com.uc.webview.internal.stats.c {
        private static final com.uc.webview.internal.stats.h e;
        public long b;
        public String c;
        public long d;

        static {
            com.uc.webview.internal.stats.h hVar = new com.uc.webview.internal.stats.h("ac_stats");
            e = hVar;
            StatsManager.a(hVar);
        }

        public /* synthetic */ b(long j, String str, long j2, byte b) {
            this(j, str, j2);
        }

        @Override // com.uc.webview.internal.stats.c
        public final com.uc.webview.internal.stats.h b() {
            return e;
        }

        @Override // com.uc.webview.internal.stats.c
        public final int c() {
            if (this.f14510a == 0) {
                this.f14510a = com.uc.webview.internal.stats.g.a(this.b) + 9 + com.uc.webview.internal.stats.g.a(this.c) + com.uc.webview.internal.stats.g.a(this.d);
            }
            return this.f14510a;
        }

        @Override // com.uc.webview.internal.stats.c
        public final int d() {
            return 9;
        }

        @Override // com.uc.webview.internal.stats.c
        public final Map<String, String> e() {
            HashMap hashMap = new HashMap();
            hashMap.put("_ac", String.valueOf(this.b));
            String str = this.c;
            if (str == null) {
                str = "";
            }
            hashMap.put("_ph", str);
            hashMap.put("_dc", String.valueOf(this.d));
            return hashMap;
        }

        @Override // com.uc.webview.internal.stats.c
        public final /* synthetic */ com.uc.webview.internal.stats.c f() {
            return new b(this.b, this.c, this.d);
        }

        @Override // com.uc.webview.internal.stats.c
        public final String j() {
            return "ac_stats";
        }

        @Override // com.uc.webview.internal.stats.c
        public final void k() {
            this.b = 0L;
            this.c = null;
            this.d = 0L;
            this.f14510a = 0;
        }

        public final String toString() {
            return com.uc.webview.internal.stats.c.a("ac_stats", e());
        }

        public b() {
        }

        private b(long j, String str, long j2) {
            this.b = j;
            this.d = j2;
            if (str == null || str.length() <= 64) {
                this.c = str;
            } else {
                this.c = str.substring(0, 64);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class ba implements c.a {
        private ba() {
        }

        public /* synthetic */ ba(byte b) {
            this();
        }

        @Override // com.uc.webview.internal.stats.c.a
        public final com.uc.webview.internal.stats.c a(Map<String, String> map) {
            return new az(com.uc.webview.internal.stats.g.a(map, "ia"), com.uc.webview.internal.stats.g.a(map, "rs"), com.uc.webview.internal.stats.g.a(map, RVStartParams.KEY_FULLSCREEN_SHORT), com.uc.webview.internal.stats.g.a(map, "kim"), com.uc.webview.internal.stats.g.a(map, "kpd", ""), com.uc.webview.internal.stats.g.a(map, "ket", ""), com.uc.webview.internal.stats.g.a(map, "src"), com.uc.webview.internal.stats.g.a(map, "srd", ""), com.uc.webview.internal.stats.g.a(map, "riv"), com.uc.webview.internal.stats.g.a(map, "ria"), com.uc.webview.internal.stats.g.a(map, "rie"), com.uc.webview.internal.stats.g.a(map, rb.RESULT_KEY, ""), com.uc.webview.internal.stats.g.a(map, "rsc", ""), com.uc.webview.internal.stats.g.a(map, "rfm", ""), com.uc.webview.internal.stats.g.a(map, "rrs"), (byte) 0);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class bb extends com.uc.webview.internal.stats.c {
        private static final com.uc.webview.internal.stats.h ah;
        public long A;
        public long B;
        public long C;
        public long D;
        public long E;
        public long F;
        public long G;
        public long H;
        public long I;
        public long J;
        public long K;
        public long L;
        public long M;
        public long N;
        public long O;
        public long P;
        public long Q;
        public long R;
        public long S;
        public long T;
        public long U;
        public long V;
        public long W;
        public long X;
        public long Y;
        public long Z;
        public long aa;
        public long ab;
        public long ac;
        public long ad;
        public long ae;
        public long af;
        public long ag;
        public String b;
        public String c;
        public String d;
        public String e;
        public String f;
        public String g;
        public String h;
        public String i;
        public String j;
        public String k;
        public String l;
        public String m;
        public String n;
        public String o;
        public String p;
        public long q;
        public long r;
        public String s;
        public long t;
        public long u;
        public long v;
        public long w;
        public long x;
        public long y;
        public long z;

        static {
            com.uc.webview.internal.stats.h hVar = new com.uc.webview.internal.stats.h("sdksus");
            ah = hVar;
            StatsManager.a(hVar);
        }

        @Override // com.uc.webview.internal.stats.c
        public final com.uc.webview.internal.stats.h b() {
            return ah;
        }

        @Override // com.uc.webview.internal.stats.c
        public final int c() {
            if (this.f14510a == 0) {
                this.f14510a = com.uc.webview.internal.stats.g.a(this.b) + 203 + com.uc.webview.internal.stats.g.a(this.c) + com.uc.webview.internal.stats.g.a(this.d) + com.uc.webview.internal.stats.g.a(this.e) + com.uc.webview.internal.stats.g.a(this.f) + com.uc.webview.internal.stats.g.a(this.g) + com.uc.webview.internal.stats.g.a(this.h) + com.uc.webview.internal.stats.g.a(this.i) + com.uc.webview.internal.stats.g.a(this.j) + com.uc.webview.internal.stats.g.a(this.k) + com.uc.webview.internal.stats.g.a(this.l) + com.uc.webview.internal.stats.g.a(this.m) + com.uc.webview.internal.stats.g.a(this.n) + com.uc.webview.internal.stats.g.a(this.o) + com.uc.webview.internal.stats.g.a(this.p) + com.uc.webview.internal.stats.g.a(this.q) + com.uc.webview.internal.stats.g.a(this.r) + com.uc.webview.internal.stats.g.a(this.s) + com.uc.webview.internal.stats.g.a(this.t) + com.uc.webview.internal.stats.g.a(this.u) + com.uc.webview.internal.stats.g.a(this.v) + com.uc.webview.internal.stats.g.a(this.w) + com.uc.webview.internal.stats.g.a(this.x) + com.uc.webview.internal.stats.g.a(this.y) + com.uc.webview.internal.stats.g.a(this.z) + com.uc.webview.internal.stats.g.a(this.A) + com.uc.webview.internal.stats.g.a(this.B) + com.uc.webview.internal.stats.g.a(this.C) + com.uc.webview.internal.stats.g.a(this.D) + com.uc.webview.internal.stats.g.a(this.E) + com.uc.webview.internal.stats.g.a(this.F) + com.uc.webview.internal.stats.g.a(this.G) + com.uc.webview.internal.stats.g.a(this.H) + com.uc.webview.internal.stats.g.a(this.I) + com.uc.webview.internal.stats.g.a(this.J) + com.uc.webview.internal.stats.g.a(this.K) + com.uc.webview.internal.stats.g.a(this.L) + com.uc.webview.internal.stats.g.a(this.M) + com.uc.webview.internal.stats.g.a(this.N) + com.uc.webview.internal.stats.g.a(this.O) + com.uc.webview.internal.stats.g.a(this.P) + com.uc.webview.internal.stats.g.a(this.Q) + com.uc.webview.internal.stats.g.a(this.R) + com.uc.webview.internal.stats.g.a(this.S) + com.uc.webview.internal.stats.g.a(this.T) + com.uc.webview.internal.stats.g.a(this.U) + com.uc.webview.internal.stats.g.a(this.V) + com.uc.webview.internal.stats.g.a(this.W) + com.uc.webview.internal.stats.g.a(this.X) + com.uc.webview.internal.stats.g.a(this.Y) + com.uc.webview.internal.stats.g.a(this.Z) + com.uc.webview.internal.stats.g.a(this.aa) + com.uc.webview.internal.stats.g.a(this.ab) + com.uc.webview.internal.stats.g.a(this.ac) + com.uc.webview.internal.stats.g.a(this.ad) + com.uc.webview.internal.stats.g.a(this.ae) + com.uc.webview.internal.stats.g.a(this.af) + com.uc.webview.internal.stats.g.a(this.ag);
            }
            return this.f14510a;
        }

        @Override // com.uc.webview.internal.stats.c
        public final int d() {
            return 203;
        }

        @Override // com.uc.webview.internal.stats.c
        public final Map<String, String> e() {
            HashMap hashMap = new HashMap();
            String str = this.b;
            String str2 = "";
            if (str == null) {
                str = str2;
            }
            hashMap.put("_ru", str);
            String str3 = this.c;
            if (str3 == null) {
                str3 = str2;
            }
            hashMap.put("_fu", str3);
            String str4 = this.d;
            if (str4 == null) {
                str4 = str2;
            }
            hashMap.put("_vr", str4);
            String str5 = this.e;
            if (str5 == null) {
                str5 = str2;
            }
            hashMap.put("_it", str5);
            String str6 = this.f;
            if (str6 == null) {
                str6 = str2;
            }
            hashMap.put("_pt", str6);
            String str7 = this.g;
            if (str7 == null) {
                str7 = str2;
            }
            hashMap.put("_dr", str7);
            String str8 = this.h;
            if (str8 == null) {
                str8 = str2;
            }
            hashMap.put("_fc", str8);
            String str9 = this.i;
            if (str9 == null) {
                str9 = str2;
            }
            hashMap.put("_fm", str9);
            String str10 = this.j;
            if (str10 == null) {
                str10 = str2;
            }
            hashMap.put("_re", str10);
            String str11 = this.k;
            if (str11 == null) {
                str11 = str2;
            }
            hashMap.put("_uf", str11);
            String str12 = this.l;
            if (str12 == null) {
                str12 = str2;
            }
            hashMap.put("_zf", str12);
            String str13 = this.m;
            if (str13 == null) {
                str13 = str2;
            }
            hashMap.put("_nd", str13);
            String str14 = this.n;
            if (str14 == null) {
                str14 = str2;
            }
            hashMap.put("_upcd", str14);
            String str15 = this.o;
            if (str15 == null) {
                str15 = str2;
            }
            hashMap.put("_upcs", str15);
            String str16 = this.p;
            if (str16 == null) {
                str16 = str2;
            }
            hashMap.put("_pcdlt", str16);
            hashMap.put("_rcis", String.valueOf(this.q));
            hashMap.put("_rcic", String.valueOf(this.r));
            String str17 = this.s;
            if (str17 != null) {
                str2 = str17;
            }
            hashMap.put("_il", str2);
            hashMap.put("_as", String.valueOf(this.t));
            hashMap.put("_is", String.valueOf(this.u));
            hashMap.put("_ise", String.valueOf(this.v));
            hashMap.put("_cr", String.valueOf(this.w));
            hashMap.put("_cre", String.valueOf(this.x));
            hashMap.put("_us", String.valueOf(this.y));
            hashMap.put("_uh", String.valueOf(this.z));
            hashMap.put("_ue", String.valueOf(this.A));
            hashMap.put("_ux", String.valueOf(this.B));
            hashMap.put("_es", String.valueOf(this.C));
            hashMap.put("_ee", String.valueOf(this.D));
            hashMap.put("_ex", String.valueOf(this.E));
            hashMap.put("_ci", String.valueOf(this.F));
            hashMap.put("_ld", String.valueOf(this.G));
            hashMap.put("_lde", String.valueOf(this.H));
            hashMap.put("_ln", String.valueOf(this.I));
            hashMap.put("_lne", String.valueOf(this.J));
            hashMap.put("_ic", String.valueOf(this.K));
            hashMap.put("_cf", String.valueOf(this.L));
            hashMap.put("_cfe", String.valueOf(this.M));
            hashMap.put("_ce", String.valueOf(this.N));
            hashMap.put("_cee", String.valueOf(this.O));
            hashMap.put("_nl", String.valueOf(this.P));
            hashMap.put("_nle", String.valueOf(this.Q));
            hashMap.put("_psce", String.valueOf(this.R));
            hashMap.put("_pscee", String.valueOf(this.S));
            hashMap.put("_ew", String.valueOf(this.T));
            hashMap.put("_ewe", String.valueOf(this.U));
            hashMap.put("_ww", String.valueOf(this.V));
            hashMap.put("_wwe", String.valueOf(this.W));
            hashMap.put("_aw", String.valueOf(this.X));
            hashMap.put("_awe", String.valueOf(this.Y));
            hashMap.put("_ac", String.valueOf(this.Z));
            hashMap.put("_ace", String.valueOf(this.aa));
            hashMap.put("_pr", String.valueOf(this.ab));
            hashMap.put("_pre", String.valueOf(this.ac));
            hashMap.put("_pi", String.valueOf(this.ad));
            hashMap.put("_pie", String.valueOf(this.ae));
            hashMap.put("_ps", String.valueOf(this.af));
            hashMap.put("_px", String.valueOf(this.ag));
            return hashMap;
        }

        @Override // com.uc.webview.internal.stats.c
        public final /* synthetic */ com.uc.webview.internal.stats.c f() {
            return new bb(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, this.P, this.Q, this.R, this.S, this.T, this.U, this.V, this.W, this.X, this.Y, this.Z, this.aa, this.ab, this.ac, this.ad, this.ae, this.af, this.ag);
        }

        @Override // com.uc.webview.internal.stats.c
        public final String j() {
            return "sdksus";
        }

        @Override // com.uc.webview.internal.stats.c
        public final void k() {
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = null;
            this.f = null;
            this.g = null;
            this.h = null;
            this.i = null;
            this.j = null;
            this.k = null;
            this.l = null;
            this.m = null;
            this.n = null;
            this.o = null;
            this.p = null;
            this.q = 0L;
            this.r = 0L;
            this.s = null;
            this.t = 0L;
            this.u = 0L;
            this.v = 0L;
            this.w = 0L;
            this.x = 0L;
            this.y = 0L;
            this.z = 0L;
            this.A = 0L;
            this.B = 0L;
            this.C = 0L;
            this.D = 0L;
            this.E = 0L;
            this.F = 0L;
            this.G = 0L;
            this.H = 0L;
            this.I = 0L;
            this.J = 0L;
            this.K = 0L;
            this.L = 0L;
            this.M = 0L;
            this.N = 0L;
            this.O = 0L;
            this.P = 0L;
            this.Q = 0L;
            this.R = 0L;
            this.S = 0L;
            this.T = 0L;
            this.U = 0L;
            this.V = 0L;
            this.W = 0L;
            this.X = 0L;
            this.Y = 0L;
            this.Z = 0L;
            this.aa = 0L;
            this.ab = 0L;
            this.ac = 0L;
            this.ad = 0L;
            this.ae = 0L;
            this.af = 0L;
            this.ag = 0L;
            this.f14510a = 0;
        }

        public String toString() {
            return com.uc.webview.internal.stats.c.a("sdksus", e());
        }

        public bb() {
        }

        private bb(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, long j, long j2, String str16, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42) {
            int i;
            String str17 = str;
            this.q = j;
            this.r = j2;
            this.t = j3;
            this.u = j4;
            this.v = j5;
            this.w = j6;
            this.x = j7;
            this.y = j8;
            this.z = j9;
            this.A = j10;
            this.B = j11;
            this.C = j12;
            this.D = j13;
            this.E = j14;
            this.F = j15;
            this.G = j16;
            this.H = j17;
            this.I = j18;
            this.J = j19;
            this.K = j20;
            this.L = j21;
            this.M = j22;
            this.N = j23;
            this.O = j24;
            this.P = j25;
            this.Q = j26;
            this.R = j27;
            this.S = j28;
            this.T = j29;
            this.U = j30;
            this.V = j31;
            this.W = j32;
            this.X = j33;
            this.Y = j34;
            this.Z = j35;
            this.aa = j36;
            this.ab = j37;
            this.ac = j38;
            this.ad = j39;
            this.ae = j40;
            this.af = j41;
            this.ag = j42;
            if (str17 == null || str.length() <= 64) {
                i = 0;
            } else {
                i = 0;
                str17 = str17.substring(0, 64);
            }
            this.b = str17;
            if (str2 == null || str2.length() <= 64) {
                this.c = str2;
            } else {
                this.c = str2.substring(i, 64);
            }
            if (str3 == null || str3.length() <= 64) {
                this.d = str3;
            } else {
                this.d = str3.substring(i, 64);
            }
            if (str4 == null || str4.length() <= 64) {
                this.e = str4;
            } else {
                this.e = str4.substring(i, 64);
            }
            if (str5 == null || str5.length() <= 64) {
                this.f = str5;
            } else {
                this.f = str5.substring(i, 64);
            }
            if (str6 == null || str6.length() <= 64) {
                this.g = str6;
            } else {
                this.g = str6.substring(i, 64);
            }
            if (str7 == null || str7.length() <= 64) {
                this.h = str7;
            } else {
                this.h = str7.substring(i, 64);
            }
            if (str8 == null || str8.length() <= 64) {
                this.i = str8;
            } else {
                this.i = str8.substring(i, 64);
            }
            if (str9 == null || str9.length() <= 64) {
                this.j = str9;
            } else {
                this.j = str9.substring(i, 64);
            }
            if (str10 == null || str10.length() <= 64) {
                this.k = str10;
            } else {
                this.k = str10.substring(i, 64);
            }
            if (str11 == null || str11.length() <= 64) {
                this.l = str11;
            } else {
                this.l = str11.substring(i, 64);
            }
            if (str12 == null || str12.length() <= 64) {
                this.m = str12;
            } else {
                this.m = str12.substring(i, 64);
            }
            if (str13 == null || str13.length() <= 64) {
                this.n = str13;
            } else {
                this.n = str13.substring(i, 64);
            }
            String str18 = str14;
            if (str18 != null && str14.length() > 64) {
                str18 = str18.substring(i, 64);
            }
            this.o = str18;
            String str19 = str15;
            if (str19 != null && str15.length() > 64) {
                str19 = str19.substring(i, 64);
            }
            this.p = str19;
            if (str16 == null || str16.length() <= 64) {
                this.s = str16;
            } else {
                this.s = str16.substring(i, 64);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class bc implements c.a {
        private bc() {
        }

        public /* synthetic */ bc(byte b) {
            this();
        }

        @Override // com.uc.webview.internal.stats.c.a
        public final com.uc.webview.internal.stats.c a(Map<String, String> map) {
            return new bb(com.uc.webview.internal.stats.g.a(map, "ru", ""), com.uc.webview.internal.stats.g.a(map, "fu", ""), com.uc.webview.internal.stats.g.a(map, "vr", ""), com.uc.webview.internal.stats.g.a(map, AdvanceSetting.NETWORK_TYPE, ""), com.uc.webview.internal.stats.g.a(map, AdvertisementOption.PRIORITY_VALID_TIME, ""), com.uc.webview.internal.stats.g.a(map, "dr", ""), com.uc.webview.internal.stats.g.a(map, "fc", ""), com.uc.webview.internal.stats.g.a(map, "fm", ""), com.uc.webview.internal.stats.g.a(map, "re", ""), com.uc.webview.internal.stats.g.a(map, "uf", ""), com.uc.webview.internal.stats.g.a(map, "zf", ""), com.uc.webview.internal.stats.g.a(map, "nd", ""), com.uc.webview.internal.stats.g.a(map, "upcd", ""), com.uc.webview.internal.stats.g.a(map, "upcs", ""), com.uc.webview.internal.stats.g.a(map, "pcdlt", ""), com.uc.webview.internal.stats.g.a(map, "rcis"), com.uc.webview.internal.stats.g.a(map, "rcic"), com.uc.webview.internal.stats.g.a(map, "il", ""), com.uc.webview.internal.stats.g.a(map, "as"), com.uc.webview.internal.stats.g.a(map, "is"), com.uc.webview.internal.stats.g.a(map, "ise"), com.uc.webview.internal.stats.g.a(map, "cr"), com.uc.webview.internal.stats.g.a(map, "cre"), com.uc.webview.internal.stats.g.a(map, "us"), com.uc.webview.internal.stats.g.a(map, "uh"), com.uc.webview.internal.stats.g.a(map, "ue"), com.uc.webview.internal.stats.g.a(map, "ux"), com.uc.webview.internal.stats.g.a(map, "es"), com.uc.webview.internal.stats.g.a(map, "ee"), com.uc.webview.internal.stats.g.a(map, ErrorType.DEFAULT), com.uc.webview.internal.stats.g.a(map, "ci"), com.uc.webview.internal.stats.g.a(map, MediaConstant.DEFINITION_LD), com.uc.webview.internal.stats.g.a(map, "lde"), com.uc.webview.internal.stats.g.a(map, "ln"), com.uc.webview.internal.stats.g.a(map, "lne"), com.uc.webview.internal.stats.g.a(map, "ic"), com.uc.webview.internal.stats.g.a(map, "cf"), com.uc.webview.internal.stats.g.a(map, "cfe"), com.uc.webview.internal.stats.g.a(map, "ce"), com.uc.webview.internal.stats.g.a(map, "cee"), com.uc.webview.internal.stats.g.a(map, "nl"), com.uc.webview.internal.stats.g.a(map, "nle"), com.uc.webview.internal.stats.g.a(map, "psce"), com.uc.webview.internal.stats.g.a(map, "pscee"), com.uc.webview.internal.stats.g.a(map, "ew"), com.uc.webview.internal.stats.g.a(map, "ewe"), com.uc.webview.internal.stats.g.a(map, "ww"), com.uc.webview.internal.stats.g.a(map, "wwe"), com.uc.webview.internal.stats.g.a(map, "aw"), com.uc.webview.internal.stats.g.a(map, "awe"), com.uc.webview.internal.stats.g.a(map, "ac"), com.uc.webview.internal.stats.g.a(map, "ace"), com.uc.webview.internal.stats.g.a(map, "pr"), com.uc.webview.internal.stats.g.a(map, "pre"), com.uc.webview.internal.stats.g.a(map, "pi"), com.uc.webview.internal.stats.g.a(map, "pie"), com.uc.webview.internal.stats.g.a(map, "ps"), com.uc.webview.internal.stats.g.a(map, "px"));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class bd extends com.uc.webview.internal.stats.c {
        private static final com.uc.webview.internal.stats.h g;
        public String b;
        public long c;
        public long d;
        public long e;
        public String f;

        static {
            com.uc.webview.internal.stats.h hVar = new com.uc.webview.internal.stats.h("snapsh_creat");
            g = hVar;
            StatsManager.a(hVar);
        }

        public /* synthetic */ bd(String str, long j, long j2, long j3, String str2, byte b) {
            this(str, j, j2, j3, str2);
        }

        @Override // com.uc.webview.internal.stats.c
        public final com.uc.webview.internal.stats.h b() {
            return g;
        }

        @Override // com.uc.webview.internal.stats.c
        public final int c() {
            if (this.f14510a == 0) {
                this.f14510a = com.uc.webview.internal.stats.g.a(this.b) + 25 + com.uc.webview.internal.stats.g.a(this.c) + com.uc.webview.internal.stats.g.a(this.d) + com.uc.webview.internal.stats.g.a(this.e) + com.uc.webview.internal.stats.g.a(this.f);
            }
            return this.f14510a;
        }

        @Override // com.uc.webview.internal.stats.c
        public final int d() {
            return 25;
        }

        @Override // com.uc.webview.internal.stats.c
        public final Map<String, String> e() {
            HashMap hashMap = new HashMap();
            String str = this.b;
            String str2 = "";
            if (str == null) {
                str = str2;
            }
            hashMap.put("_key", str);
            hashMap.put("_usnap", String.valueOf(this.c));
            hashMap.put("_ccti", String.valueOf(this.d));
            hashMap.put("_ccre", String.valueOf(this.e));
            String str3 = this.f;
            if (str3 != null) {
                str2 = str3;
            }
            hashMap.put("_surl", str2);
            return hashMap;
        }

        @Override // com.uc.webview.internal.stats.c
        public final /* synthetic */ com.uc.webview.internal.stats.c f() {
            return new bd(this.b, this.c, this.d, this.e, this.f);
        }

        @Override // com.uc.webview.internal.stats.c
        public final String j() {
            return "snapsh_creat";
        }

        @Override // com.uc.webview.internal.stats.c
        public final void k() {
            this.b = null;
            this.c = 0L;
            this.d = 0L;
            this.e = 0L;
            this.f = null;
            this.f14510a = 0;
        }

        public final String toString() {
            return com.uc.webview.internal.stats.c.a("snapsh_creat", e());
        }

        public bd() {
        }

        private bd(String str, long j, long j2, long j3, String str2) {
            this.c = j;
            this.d = j2;
            this.e = j3;
            if (str != null && str.length() > 128) {
                str = str.substring(0, 128);
            }
            this.b = str;
            if (str2 == null || str2.length() <= 128) {
                this.f = str2;
            } else {
                this.f = str2.substring(0, 128);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class be implements c.a {
        private be() {
        }

        @Override // com.uc.webview.internal.stats.c.a
        public final com.uc.webview.internal.stats.c a(Map<String, String> map) {
            return new bd(com.uc.webview.internal.stats.g.a(map, "key", ""), com.uc.webview.internal.stats.g.a(map, "usnap"), com.uc.webview.internal.stats.g.a(map, "ccti"), com.uc.webview.internal.stats.g.a(map, "ccre"), com.uc.webview.internal.stats.g.a(map, "surl", ""), (byte) 0);
        }

        public /* synthetic */ be(byte b) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class bf extends com.uc.webview.internal.stats.c {
        private static final com.uc.webview.internal.stats.h g;
        public String b;
        public long c;
        public long d;
        public long e;
        public long f;

        static {
            com.uc.webview.internal.stats.h hVar = new com.uc.webview.internal.stats.h("snapsh_init");
            g = hVar;
            StatsManager.a(hVar);
        }

        public /* synthetic */ bf(String str, long j, long j2, long j3, long j4, byte b) {
            this(str, j, j2, j3, j4);
        }

        @Override // com.uc.webview.internal.stats.c
        public final com.uc.webview.internal.stats.h b() {
            return g;
        }

        @Override // com.uc.webview.internal.stats.c
        public final int c() {
            if (this.f14510a == 0) {
                this.f14510a = com.uc.webview.internal.stats.g.a(this.b) + 24 + com.uc.webview.internal.stats.g.a(this.c) + com.uc.webview.internal.stats.g.a(this.d) + com.uc.webview.internal.stats.g.a(this.e) + com.uc.webview.internal.stats.g.a(this.f);
            }
            return this.f14510a;
        }

        @Override // com.uc.webview.internal.stats.c
        public final int d() {
            return 24;
        }

        @Override // com.uc.webview.internal.stats.c
        public final Map<String, String> e() {
            HashMap hashMap = new HashMap();
            String str = this.b;
            if (str == null) {
                str = "";
            }
            hashMap.put("_key", str);
            hashMap.put("_ssiz", String.valueOf(this.c));
            hashMap.put("_siti", String.valueOf(this.d));
            hashMap.put("_sire", String.valueOf(this.e));
            hashMap.put("_sibd", String.valueOf(this.f));
            return hashMap;
        }

        @Override // com.uc.webview.internal.stats.c
        public final /* synthetic */ com.uc.webview.internal.stats.c f() {
            return new bf(this.b, this.c, this.d, this.e, this.f);
        }

        @Override // com.uc.webview.internal.stats.c
        public final String j() {
            return "snapsh_init";
        }

        @Override // com.uc.webview.internal.stats.c
        public final void k() {
            this.b = null;
            this.c = 0L;
            this.d = 0L;
            this.e = 0L;
            this.f = 0L;
            this.f14510a = 0;
        }

        public final String toString() {
            return com.uc.webview.internal.stats.c.a("snapsh_init", e());
        }

        public bf() {
        }

        private bf(String str, long j, long j2, long j3, long j4) {
            this.c = j;
            this.d = j2;
            this.e = j3;
            this.f = j4;
            if (str == null || str.length() <= 128) {
                this.b = str;
            } else {
                this.b = str.substring(0, 128);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class bg implements c.a {
        private bg() {
        }

        @Override // com.uc.webview.internal.stats.c.a
        public final com.uc.webview.internal.stats.c a(Map<String, String> map) {
            return new bf(com.uc.webview.internal.stats.g.a(map, "key", ""), com.uc.webview.internal.stats.g.a(map, "ssiz"), com.uc.webview.internal.stats.g.a(map, "siti"), com.uc.webview.internal.stats.g.a(map, "sire"), com.uc.webview.internal.stats.g.a(map, "sibd"), (byte) 0);
        }

        public /* synthetic */ bg(byte b) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class bh extends com.uc.webview.internal.stats.c {
        private static final com.uc.webview.internal.stats.h e;
        public String b;
        public String c;
        public long d;

        static {
            com.uc.webview.internal.stats.h hVar = new com.uc.webview.internal.stats.h("snapsh_load");
            e = hVar;
            StatsManager.a(hVar);
        }

        public /* synthetic */ bh(String str, String str2, long j, byte b) {
            this(str, str2, j);
        }

        @Override // com.uc.webview.internal.stats.c
        public final com.uc.webview.internal.stats.h b() {
            return e;
        }

        @Override // com.uc.webview.internal.stats.c
        public final int c() {
            if (this.f14510a == 0) {
                this.f14510a = com.uc.webview.internal.stats.g.a(this.b) + 15 + com.uc.webview.internal.stats.g.a(this.c) + com.uc.webview.internal.stats.g.a(this.d);
            }
            return this.f14510a;
        }

        @Override // com.uc.webview.internal.stats.c
        public final int d() {
            return 15;
        }

        @Override // com.uc.webview.internal.stats.c
        public final Map<String, String> e() {
            HashMap hashMap = new HashMap();
            String str = this.b;
            String str2 = "";
            if (str == null) {
                str = str2;
            }
            hashMap.put("_skey", str);
            String str3 = this.c;
            if (str3 != null) {
                str2 = str3;
            }
            hashMap.put("_surl", str2);
            hashMap.put("_slre", String.valueOf(this.d));
            return hashMap;
        }

        @Override // com.uc.webview.internal.stats.c
        public final /* synthetic */ com.uc.webview.internal.stats.c f() {
            return new bh(this.b, this.c, this.d);
        }

        @Override // com.uc.webview.internal.stats.c
        public final String j() {
            return "snapsh_load";
        }

        @Override // com.uc.webview.internal.stats.c
        public final void k() {
            this.b = null;
            this.c = null;
            this.d = 0L;
            this.f14510a = 0;
        }

        public final String toString() {
            return com.uc.webview.internal.stats.c.a("snapsh_load", e());
        }

        public bh() {
        }

        private bh(String str, String str2, long j) {
            this.d = j;
            if (str != null && str.length() > 128) {
                str = str.substring(0, 128);
            }
            this.b = str;
            if (str2 == null || str2.length() <= 128) {
                this.c = str2;
            } else {
                this.c = str2.substring(0, 128);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class bi implements c.a {
        private bi() {
        }

        @Override // com.uc.webview.internal.stats.c.a
        public final com.uc.webview.internal.stats.c a(Map<String, String> map) {
            return new bh(com.uc.webview.internal.stats.g.a(map, "skey", ""), com.uc.webview.internal.stats.g.a(map, "surl", ""), com.uc.webview.internal.stats.g.a(map, "slre"), (byte) 0);
        }

        public /* synthetic */ bi(byte b) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class bj extends com.uc.webview.internal.stats.c {
        private static final com.uc.webview.internal.stats.h c;
        public String b;

        static {
            com.uc.webview.internal.stats.h hVar = new com.uc.webview.internal.stats.h("u4cpns");
            c = hVar;
            StatsManager.a(hVar);
        }

        public /* synthetic */ bj(String str, byte b) {
            this(str);
        }

        @Override // com.uc.webview.internal.stats.c
        public final com.uc.webview.internal.stats.h b() {
            return c;
        }

        @Override // com.uc.webview.internal.stats.c
        public final int c() {
            if (this.f14510a == 0) {
                this.f14510a = com.uc.webview.internal.stats.g.a(this.b) + 5;
            }
            return this.f14510a;
        }

        @Override // com.uc.webview.internal.stats.c
        public final int d() {
            return 5;
        }

        @Override // com.uc.webview.internal.stats.c
        public final Map<String, String> e() {
            HashMap hashMap = new HashMap();
            String str = this.b;
            if (str == null) {
                str = "";
            }
            hashMap.put("_cpns", str);
            return hashMap;
        }

        @Override // com.uc.webview.internal.stats.c
        public final /* synthetic */ com.uc.webview.internal.stats.c f() {
            return new bj(this.b);
        }

        @Override // com.uc.webview.internal.stats.c
        public final String j() {
            return "u4cpns";
        }

        @Override // com.uc.webview.internal.stats.c
        public final void k() {
            this.b = null;
            this.f14510a = 0;
        }

        public final String toString() {
            return com.uc.webview.internal.stats.c.a("u4cpns", e());
        }

        public bj() {
        }

        private bj(String str) {
            if (str == null || str.length() <= 354) {
                this.b = str;
            } else {
                this.b = str.substring(0, 354);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class bk implements c.a {
        private bk() {
        }

        @Override // com.uc.webview.internal.stats.c.a
        public final com.uc.webview.internal.stats.c a(Map<String, String> map) {
            return new bj(com.uc.webview.internal.stats.g.a(map, "cpns", ""), (byte) 0);
        }

        public /* synthetic */ bk(byte b) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class bl extends com.uc.webview.internal.stats.c {
        private static final com.uc.webview.internal.stats.h f;
        public String b;
        public String c;
        public String d;
        public String e;

        static {
            com.uc.webview.internal.stats.h hVar = new com.uc.webview.internal.stats.h("und_s");
            f = hVar;
            StatsManager.a(hVar);
        }

        public /* synthetic */ bl(String str, String str2, String str3, String str4, byte b) {
            this(str, str2, str3, str4);
        }

        @Override // com.uc.webview.internal.stats.c
        public final com.uc.webview.internal.stats.h b() {
            return f;
        }

        @Override // com.uc.webview.internal.stats.c
        public final int c() {
            if (this.f14510a == 0) {
                this.f14510a = com.uc.webview.internal.stats.g.a(this.b) + 8 + com.uc.webview.internal.stats.g.a(this.c) + com.uc.webview.internal.stats.g.a(this.d) + com.uc.webview.internal.stats.g.a(this.e);
            }
            return this.f14510a;
        }

        @Override // com.uc.webview.internal.stats.c
        public final int d() {
            return 8;
        }

        @Override // com.uc.webview.internal.stats.c
        public final Map<String, String> e() {
            HashMap hashMap = new HashMap();
            String str = this.b;
            String str2 = "";
            if (str == null) {
                str = str2;
            }
            hashMap.put("_h", str);
            String str3 = this.c;
            if (str3 == null) {
                str3 = str2;
            }
            hashMap.put("_u", str3);
            String str4 = this.d;
            if (str4 == null) {
                str4 = str2;
            }
            hashMap.put("_r", str4);
            String str5 = this.e;
            if (str5 != null) {
                str2 = str5;
            }
            hashMap.put("_e", str2);
            return hashMap;
        }

        @Override // com.uc.webview.internal.stats.c
        public final /* synthetic */ com.uc.webview.internal.stats.c f() {
            return new bl(this.b, this.c, this.d, this.e);
        }

        @Override // com.uc.webview.internal.stats.c
        public final String j() {
            return "und_s";
        }

        @Override // com.uc.webview.internal.stats.c
        public final void k() {
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = null;
            this.f14510a = 0;
        }

        public final String toString() {
            return com.uc.webview.internal.stats.c.a("und_s", e());
        }

        public bl() {
        }

        private bl(String str, String str2, String str3, String str4) {
            if (str != null && str.length() > 128) {
                str = str.substring(0, 128);
            }
            this.b = str;
            if (str2 == null || str2.length() <= 1024) {
                this.c = str2;
            } else {
                this.c = str2.substring(0, 1024);
            }
            if (str3 == null || str3.length() <= 4096) {
                this.d = str3;
            } else {
                this.d = str3.substring(0, 4096);
            }
            if (str4 == null || str4.length() <= 4096) {
                this.e = str4;
            } else {
                this.e = str4.substring(0, 4096);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class bm implements c.a {
        private bm() {
        }

        @Override // com.uc.webview.internal.stats.c.a
        public final com.uc.webview.internal.stats.c a(Map<String, String> map) {
            return new bl(com.uc.webview.internal.stats.g.a(map, "h", ""), com.uc.webview.internal.stats.g.a(map, "u", ""), com.uc.webview.internal.stats.g.a(map, "r", ""), com.uc.webview.internal.stats.g.a(map, "e", ""), (byte) 0);
        }

        public /* synthetic */ bm(byte b) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class bn extends com.uc.webview.internal.stats.c {
        private static final com.uc.webview.internal.stats.h s;
        public long b;
        public long c;
        public long d;
        public long e;
        public long f;
        public long g;
        public String h;
        public long i;
        public long j;
        public long k;
        public long l;
        public long m;
        public long n;
        public long o;
        public long p;
        public long q;
        public long r;

        static {
            com.uc.webview.internal.stats.h hVar = new com.uc.webview.internal.stats.h("v8aot");
            s = hVar;
            StatsManager.a(hVar);
        }

        public /* synthetic */ bn(long j, long j2, long j3, long j4, long j5, long j6, String str, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, byte b) {
            this(j, j2, j3, j4, j5, j6, str, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16);
        }

        @Override // com.uc.webview.internal.stats.c
        public final com.uc.webview.internal.stats.h b() {
            return s;
        }

        @Override // com.uc.webview.internal.stats.c
        public final int c() {
            if (this.f14510a == 0) {
                this.f14510a = com.uc.webview.internal.stats.g.a(this.b) + 72 + com.uc.webview.internal.stats.g.a(this.c) + com.uc.webview.internal.stats.g.a(this.d) + com.uc.webview.internal.stats.g.a(this.e) + com.uc.webview.internal.stats.g.a(this.f) + com.uc.webview.internal.stats.g.a(this.g) + com.uc.webview.internal.stats.g.a(this.h) + com.uc.webview.internal.stats.g.a(this.i) + com.uc.webview.internal.stats.g.a(this.j) + com.uc.webview.internal.stats.g.a(this.k) + com.uc.webview.internal.stats.g.a(this.l) + com.uc.webview.internal.stats.g.a(this.m) + com.uc.webview.internal.stats.g.a(this.n) + com.uc.webview.internal.stats.g.a(this.o) + com.uc.webview.internal.stats.g.a(this.p) + com.uc.webview.internal.stats.g.a(this.q) + com.uc.webview.internal.stats.g.a(this.r);
            }
            return this.f14510a;
        }

        @Override // com.uc.webview.internal.stats.c
        public final int d() {
            return 72;
        }

        @Override // com.uc.webview.internal.stats.c
        public final Map<String, String> e() {
            HashMap hashMap = new HashMap();
            long j = this.b;
            if (0 != j) {
                hashMap.put("_tal", Long.toString(j));
            }
            long j2 = this.c;
            if (0 != j2) {
                hashMap.put("_suc", Long.toString(j2));
            }
            long j3 = this.d;
            if (0 != j3) {
                hashMap.put("_neww", Long.toString(j3));
            }
            long j4 = this.e;
            if (0 != j4) {
                hashMap.put("_otal", Long.toString(j4));
            }
            long j5 = this.f;
            if (0 != j5) {
                hashMap.put("_osuc", Long.toString(j5));
            }
            long j6 = this.g;
            if (0 != j6) {
                hashMap.put("_oupd", Long.toString(j6));
            }
            String str = this.h;
            if (str != null && !str.isEmpty()) {
                hashMap.put("_purl", this.h);
            }
            long j7 = this.i;
            if (0 != j7) {
                hashMap.put("_js", Long.toString(j7));
            }
            long j8 = this.j;
            if (0 != j8) {
                hashMap.put("_ctc", Long.toString(j8));
            }
            long j9 = this.k;
            if (0 != j9) {
                hashMap.put("_hmc", Long.toString(j9));
            }
            long j10 = this.l;
            if (0 != j10) {
                hashMap.put("_tcc", Long.toString(j10));
            }
            long j11 = this.m;
            if (0 != j11) {
                hashMap.put("_hcc", Long.toString(j11));
            }
            long j12 = this.n;
            if (0 != j12) {
                hashMap.put("_tuc", Long.toString(j12));
            }
            long j13 = this.o;
            if (0 != j13) {
                hashMap.put("_huc", Long.toString(j13));
            }
            long j14 = this.p;
            if (0 != j14) {
                hashMap.put("_ncc", Long.toString(j14));
            }
            long j15 = this.q;
            if (0 != j15) {
                hashMap.put("_hac", Long.toString(j15));
            }
            long j16 = this.r;
            if (0 != j16) {
                hashMap.put("_afl", Long.toString(j16));
            }
            return hashMap;
        }

        @Override // com.uc.webview.internal.stats.c
        public final /* synthetic */ com.uc.webview.internal.stats.c f() {
            return new bn(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r);
        }

        @Override // com.uc.webview.internal.stats.c
        public final boolean h() {
            return false;
        }

        @Override // com.uc.webview.internal.stats.c
        public final String j() {
            return "v8aot";
        }

        @Override // com.uc.webview.internal.stats.c
        public final void k() {
            this.b = 0L;
            this.c = 0L;
            this.d = 0L;
            this.e = 0L;
            this.f = 0L;
            this.g = 0L;
            this.h = null;
            this.i = 0L;
            this.j = 0L;
            this.k = 0L;
            this.l = 0L;
            this.m = 0L;
            this.n = 0L;
            this.o = 0L;
            this.p = 0L;
            this.q = 0L;
            this.r = 0L;
            this.f14510a = 0;
        }

        public final String toString() {
            return com.uc.webview.internal.stats.c.a("v8aot", e());
        }

        public bn() {
        }

        private bn(long j, long j2, long j3, long j4, long j5, long j6, String str, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16) {
            this.b = j;
            this.c = j2;
            this.d = j3;
            this.e = j4;
            this.f = j5;
            this.g = j6;
            this.i = j7;
            this.j = j8;
            this.k = j9;
            this.l = j10;
            this.m = j11;
            this.n = j12;
            this.o = j13;
            this.p = j14;
            this.q = j15;
            this.r = j16;
            if (str == null || str.length() <= 128) {
                this.h = str;
            } else {
                this.h = str.substring(0, 128);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class bo implements c.a {
        private bo() {
        }

        public /* synthetic */ bo(byte b) {
            this();
        }

        @Override // com.uc.webview.internal.stats.c.a
        public final com.uc.webview.internal.stats.c a(Map<String, String> map) {
            return new bn(com.uc.webview.internal.stats.g.a(map, "tal"), com.uc.webview.internal.stats.g.a(map, "suc"), com.uc.webview.internal.stats.g.a(map, "neww"), com.uc.webview.internal.stats.g.a(map, "otal"), com.uc.webview.internal.stats.g.a(map, "osuc"), com.uc.webview.internal.stats.g.a(map, "oupd"), com.uc.webview.internal.stats.g.a(map, "purl", ""), com.uc.webview.internal.stats.g.a(map, "js"), com.uc.webview.internal.stats.g.a(map, "ctc"), com.uc.webview.internal.stats.g.a(map, "hmc"), com.uc.webview.internal.stats.g.a(map, "tcc"), com.uc.webview.internal.stats.g.a(map, "hcc"), com.uc.webview.internal.stats.g.a(map, "tuc"), com.uc.webview.internal.stats.g.a(map, "huc"), com.uc.webview.internal.stats.g.a(map, "ncc"), com.uc.webview.internal.stats.g.a(map, "hac"), com.uc.webview.internal.stats.g.a(map, "afl"), (byte) 0);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class bp extends com.uc.webview.internal.stats.c {
        private static final com.uc.webview.internal.stats.h m;
        public String b;
        public long c;
        public long d;
        public long e;
        public long f;
        public long g;
        public long h;
        public long i;
        public long j;
        public long k;
        public long l;

        static {
            com.uc.webview.internal.stats.h hVar = new com.uc.webview.internal.stats.h("webrtc_stats");
            m = hVar;
            StatsManager.a(hVar);
        }

        public /* synthetic */ bp(String str, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, byte b) {
            this(str, j, j2, j3, j4, j5, j6, j7, j8, j9, j10);
        }

        @Override // com.uc.webview.internal.stats.c
        public final com.uc.webview.internal.stats.h b() {
            return m;
        }

        @Override // com.uc.webview.internal.stats.c
        public final int c() {
            if (this.f14510a == 0) {
                this.f14510a = com.uc.webview.internal.stats.g.a(this.b) + 34 + com.uc.webview.internal.stats.g.a(this.c) + com.uc.webview.internal.stats.g.a(this.d) + com.uc.webview.internal.stats.g.a(this.e) + com.uc.webview.internal.stats.g.a(this.f) + com.uc.webview.internal.stats.g.a(this.g) + com.uc.webview.internal.stats.g.a(this.h) + com.uc.webview.internal.stats.g.a(this.i) + com.uc.webview.internal.stats.g.a(this.j) + com.uc.webview.internal.stats.g.a(this.k) + com.uc.webview.internal.stats.g.a(this.l);
            }
            return this.f14510a;
        }

        @Override // com.uc.webview.internal.stats.c
        public final int d() {
            return 34;
        }

        @Override // com.uc.webview.internal.stats.c
        public final Map<String, String> e() {
            HashMap hashMap = new HashMap();
            String str = this.b;
            if (str == null) {
                str = "";
            }
            hashMap.put("_ph", str);
            hashMap.put("_cv", String.valueOf(this.c));
            hashMap.put("_ca", String.valueOf(this.d));
            hashMap.put("_cmd", String.valueOf(this.e));
            hashMap.put("_d1", String.valueOf(this.f));
            hashMap.put("_d2", String.valueOf(this.g));
            hashMap.put("_d3", String.valueOf(this.h));
            hashMap.put("_d4", String.valueOf(this.i));
            hashMap.put("_d5", String.valueOf(this.j));
            hashMap.put("_cp", String.valueOf(this.k));
            hashMap.put("_cd", String.valueOf(this.l));
            return hashMap;
        }

        @Override // com.uc.webview.internal.stats.c
        public final /* synthetic */ com.uc.webview.internal.stats.c f() {
            return new bp(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l);
        }

        @Override // com.uc.webview.internal.stats.c
        public final String j() {
            return "webrtc_stats";
        }

        @Override // com.uc.webview.internal.stats.c
        public final void k() {
            this.b = null;
            this.c = 0L;
            this.d = 0L;
            this.e = 0L;
            this.f = 0L;
            this.g = 0L;
            this.h = 0L;
            this.i = 0L;
            this.j = 0L;
            this.k = 0L;
            this.l = 0L;
            this.f14510a = 0;
        }

        public final String toString() {
            return com.uc.webview.internal.stats.c.a("webrtc_stats", e());
        }

        public bp() {
        }

        private bp(String str, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10) {
            this.c = j;
            this.d = j2;
            this.e = j3;
            this.f = j4;
            this.g = j5;
            this.h = j6;
            this.i = j7;
            this.j = j8;
            this.k = j9;
            this.l = j10;
            if (str == null || str.length() <= 64) {
                this.b = str;
            } else {
                this.b = str.substring(0, 64);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class bq implements c.a {
        private bq() {
        }

        public /* synthetic */ bq(byte b) {
            this();
        }

        @Override // com.uc.webview.internal.stats.c.a
        public final com.uc.webview.internal.stats.c a(Map<String, String> map) {
            return new bp(com.uc.webview.internal.stats.g.a(map, "ph", ""), com.uc.webview.internal.stats.g.a(map, DispatchConstants.CONFIG_VERSION), com.uc.webview.internal.stats.g.a(map, "ca"), com.uc.webview.internal.stats.g.a(map, "cmd"), com.uc.webview.internal.stats.g.a(map, "d1"), com.uc.webview.internal.stats.g.a(map, "d2"), com.uc.webview.internal.stats.g.a(map, "d3"), com.uc.webview.internal.stats.g.a(map, "d4"), com.uc.webview.internal.stats.g.a(map, "d5"), com.uc.webview.internal.stats.g.a(map, StatisticRecord.ET_CP), com.uc.webview.internal.stats.g.a(map, "cd"), (byte) 0);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class br extends com.uc.webview.internal.stats.c {
        private static final com.uc.webview.internal.stats.h h;
        public String b;
        public long c;
        public long d;
        public long e;
        public long f;
        public long g;

        static {
            com.uc.webview.internal.stats.h hVar = new com.uc.webview.internal.stats.h("wpk_pv");
            h = hVar;
            StatsManager.a(hVar);
        }

        public /* synthetic */ br(String str, long j, long j2, long j3, long j4, long j5, byte b) {
            this(str, j, j2, j3, j4, j5);
        }

        @Override // com.uc.webview.internal.stats.c
        public final com.uc.webview.internal.stats.h b() {
            return h;
        }

        @Override // com.uc.webview.internal.stats.c
        public final int c() {
            if (this.f14510a == 0) {
                this.f14510a = com.uc.webview.internal.stats.g.a(this.b) + 21 + com.uc.webview.internal.stats.g.a(this.c) + com.uc.webview.internal.stats.g.a(this.d) + com.uc.webview.internal.stats.g.a(this.e) + com.uc.webview.internal.stats.g.a(this.f) + com.uc.webview.internal.stats.g.a(this.g);
            }
            return this.f14510a;
        }

        @Override // com.uc.webview.internal.stats.c
        public final int d() {
            return 21;
        }

        @Override // com.uc.webview.internal.stats.c
        public final Map<String, String> e() {
            HashMap hashMap = new HashMap();
            String str = this.b;
            if (str == null) {
                str = "";
            }
            hashMap.put("_url", str);
            hashMap.put("_src", String.valueOf(this.c));
            hashMap.put("_pt", String.valueOf(this.d));
            hashMap.put("_nt", String.valueOf(this.e));
            hashMap.put("_t0", String.valueOf(this.f));
            hashMap.put("_mct", String.valueOf(this.g));
            return hashMap;
        }

        @Override // com.uc.webview.internal.stats.c
        public final /* synthetic */ com.uc.webview.internal.stats.c f() {
            return new br(this.b, this.c, this.d, this.e, this.f, this.g);
        }

        @Override // com.uc.webview.internal.stats.c
        public final boolean h() {
            return false;
        }

        @Override // com.uc.webview.internal.stats.c
        public final String j() {
            return "wpk_pv";
        }

        @Override // com.uc.webview.internal.stats.c
        public final void k() {
            this.b = null;
            this.c = 0L;
            this.d = 0L;
            this.e = 0L;
            this.f = 0L;
            this.g = 0L;
            this.f14510a = 0;
        }

        public final String toString() {
            return com.uc.webview.internal.stats.c.a("wpk_pv", e());
        }

        public br() {
        }

        private br(String str, long j, long j2, long j3, long j4, long j5) {
            this.c = j;
            this.d = j2;
            this.e = j3;
            this.f = j4;
            this.g = j5;
            if (str == null || str.length() <= 128) {
                this.b = str;
            } else {
                this.b = str.substring(0, 128);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class bs implements c.a {
        private bs() {
        }

        @Override // com.uc.webview.internal.stats.c.a
        public final com.uc.webview.internal.stats.c a(Map<String, String> map) {
            return new br(com.uc.webview.internal.stats.g.a(map, "url", ""), com.uc.webview.internal.stats.g.a(map, "src"), com.uc.webview.internal.stats.g.a(map, AdvertisementOption.PRIORITY_VALID_TIME), com.uc.webview.internal.stats.g.a(map, "nt"), com.uc.webview.internal.stats.g.a(map, lca.STAGE_T0), com.uc.webview.internal.stats.g.a(map, "mct"), (byte) 0);
        }

        public /* synthetic */ bs(byte b) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class c implements c.a {
        private c() {
        }

        @Override // com.uc.webview.internal.stats.c.a
        public final com.uc.webview.internal.stats.c a(Map<String, String> map) {
            return new b(com.uc.webview.internal.stats.g.a(map, "ac"), com.uc.webview.internal.stats.g.a(map, "ph", ""), com.uc.webview.internal.stats.g.a(map, "dc"), (byte) 0);
        }

        public /* synthetic */ c(byte b) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class d extends com.uc.webview.internal.stats.c {
        private static final com.uc.webview.internal.stats.h c;
        public String b;

        static {
            com.uc.webview.internal.stats.h hVar = new com.uc.webview.internal.stats.h("auto_fill");
            c = hVar;
            StatsManager.a(hVar);
        }

        public /* synthetic */ d(String str, byte b) {
            this(str);
        }

        @Override // com.uc.webview.internal.stats.c
        public final com.uc.webview.internal.stats.h b() {
            return c;
        }

        @Override // com.uc.webview.internal.stats.c
        public final int c() {
            if (this.f14510a == 0) {
                this.f14510a = com.uc.webview.internal.stats.g.a(this.b) + 5;
            }
            return this.f14510a;
        }

        @Override // com.uc.webview.internal.stats.c
        public final int d() {
            return 5;
        }

        @Override // com.uc.webview.internal.stats.c
        public final Map<String, String> e() {
            HashMap hashMap = new HashMap();
            String str = this.b;
            if (str == null) {
                str = "";
            }
            hashMap.put("_host", str);
            return hashMap;
        }

        @Override // com.uc.webview.internal.stats.c
        public final /* synthetic */ com.uc.webview.internal.stats.c f() {
            return new d(this.b);
        }

        @Override // com.uc.webview.internal.stats.c
        public final String j() {
            return "auto_fill";
        }

        @Override // com.uc.webview.internal.stats.c
        public final void k() {
            this.b = null;
            this.f14510a = 0;
        }

        public final String toString() {
            return com.uc.webview.internal.stats.c.a("auto_fill", e());
        }

        public d() {
        }

        private d(String str) {
            if (str == null || str.length() <= 64) {
                this.b = str;
            } else {
                this.b = str.substring(0, 64);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class e implements c.a {
        private e() {
        }

        @Override // com.uc.webview.internal.stats.c.a
        public final com.uc.webview.internal.stats.c a(Map<String, String> map) {
            return new d(com.uc.webview.internal.stats.g.a(map, "host", ""), (byte) 0);
        }

        public /* synthetic */ e(byte b) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class f extends com.uc.webview.internal.stats.c {
        private static final com.uc.webview.internal.stats.h s;
        public long b;
        public long c;
        public long d;
        public long e;
        public long f;
        public long g;
        public long h;
        public long i;
        public long j;
        public long k;
        public long l;
        public long m;
        public long n;
        public long o;
        public long p;
        public long q;
        public long r;

        static {
            com.uc.webview.internal.stats.h hVar = new com.uc.webview.internal.stats.h("bfcache_v2");
            s = hVar;
            StatsManager.a(hVar);
        }

        public /* synthetic */ f(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, byte b) {
            this(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17);
        }

        @Override // com.uc.webview.internal.stats.c
        public final com.uc.webview.internal.stats.h b() {
            return s;
        }

        @Override // com.uc.webview.internal.stats.c
        public final int c() {
            if (this.f14510a == 0) {
                this.f14510a = com.uc.webview.internal.stats.g.a(this.b) + 51 + com.uc.webview.internal.stats.g.a(this.c) + com.uc.webview.internal.stats.g.a(this.d) + com.uc.webview.internal.stats.g.a(this.e) + com.uc.webview.internal.stats.g.a(this.f) + com.uc.webview.internal.stats.g.a(this.g) + com.uc.webview.internal.stats.g.a(this.h) + com.uc.webview.internal.stats.g.a(this.i) + com.uc.webview.internal.stats.g.a(this.j) + com.uc.webview.internal.stats.g.a(this.k) + com.uc.webview.internal.stats.g.a(this.l) + com.uc.webview.internal.stats.g.a(this.m) + com.uc.webview.internal.stats.g.a(this.n) + com.uc.webview.internal.stats.g.a(this.o) + com.uc.webview.internal.stats.g.a(this.p) + com.uc.webview.internal.stats.g.a(this.q) + com.uc.webview.internal.stats.g.a(this.r);
            }
            return this.f14510a;
        }

        @Override // com.uc.webview.internal.stats.c
        public final int d() {
            return 51;
        }

        @Override // com.uc.webview.internal.stats.c
        public final Map<String, String> e() {
            HashMap hashMap = new HashMap();
            hashMap.put("_pv", String.valueOf(this.b));
            hashMap.put("_ec", String.valueOf(this.c));
            hashMap.put("_ns", String.valueOf(this.d));
            hashMap.put("_er", String.valueOf(this.e));
            hashMap.put("_fr", String.valueOf(this.f));
            hashMap.put("_rp", String.valueOf(this.g));
            hashMap.put("_sk", String.valueOf(this.h));
            hashMap.put("_nn", String.valueOf(this.i));
            hashMap.put("_ul", String.valueOf(this.j));
            hashMap.put("_rr", String.valueOf(this.k));
            hashMap.put("_bf", String.valueOf(this.l));
            hashMap.put("_hc", String.valueOf(this.m));
            hashMap.put("_mc", String.valueOf(this.n));
            hashMap.put("_pc", String.valueOf(this.o));
            hashMap.put("_rd", String.valueOf(this.p));
            hashMap.put("_ps", String.valueOf(this.q));
            hashMap.put("_pr", String.valueOf(this.r));
            return hashMap;
        }

        @Override // com.uc.webview.internal.stats.c
        public final /* synthetic */ com.uc.webview.internal.stats.c f() {
            return new f(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r);
        }

        @Override // com.uc.webview.internal.stats.c
        public final String j() {
            return "bfcache_v2";
        }

        @Override // com.uc.webview.internal.stats.c
        public final void k() {
            this.b = 0L;
            this.c = 0L;
            this.d = 0L;
            this.e = 0L;
            this.f = 0L;
            this.g = 0L;
            this.h = 0L;
            this.i = 0L;
            this.j = 0L;
            this.k = 0L;
            this.l = 0L;
            this.m = 0L;
            this.n = 0L;
            this.o = 0L;
            this.p = 0L;
            this.q = 0L;
            this.r = 0L;
            this.f14510a = 0;
        }

        public final String toString() {
            return com.uc.webview.internal.stats.c.a("bfcache_v2", e());
        }

        public f() {
        }

        private f(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17) {
            this.b = j;
            this.c = j2;
            this.d = j3;
            this.e = j4;
            this.f = j5;
            this.g = j6;
            this.h = j7;
            this.i = j8;
            this.j = j9;
            this.k = j10;
            this.l = j11;
            this.m = j12;
            this.n = j13;
            this.o = j14;
            this.p = j15;
            this.q = j16;
            this.r = j17;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class g implements c.a {
        private g() {
        }

        public /* synthetic */ g(byte b) {
            this();
        }

        @Override // com.uc.webview.internal.stats.c.a
        public final com.uc.webview.internal.stats.c a(Map<String, String> map) {
            return new f(com.uc.webview.internal.stats.g.a(map, "pv"), com.uc.webview.internal.stats.g.a(map, RiskDataPipeManager.PIPE_RESULT_ERROR_CODE_KEY), com.uc.webview.internal.stats.g.a(map, NotificationStyle.NOTIFICATION_STYLE), com.uc.webview.internal.stats.g.a(map, "er"), com.uc.webview.internal.stats.g.a(map, "fr"), com.uc.webview.internal.stats.g.a(map, CountValue.T_RP), com.uc.webview.internal.stats.g.a(map, "sk"), com.uc.webview.internal.stats.g.a(map, "nn"), com.uc.webview.internal.stats.g.a(map, "ul"), com.uc.webview.internal.stats.g.a(map, "rr"), com.uc.webview.internal.stats.g.a(map, "bf"), com.uc.webview.internal.stats.g.a(map, "hc"), com.uc.webview.internal.stats.g.a(map, "mc"), com.uc.webview.internal.stats.g.a(map, "pc"), com.uc.webview.internal.stats.g.a(map, "rd"), com.uc.webview.internal.stats.g.a(map, "ps"), com.uc.webview.internal.stats.g.a(map, "pr"), (byte) 0);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class h extends com.uc.webview.internal.stats.c {
        private static final com.uc.webview.internal.stats.h e;
        public long b;
        public long c;
        public String d;

        static {
            com.uc.webview.internal.stats.h hVar = new com.uc.webview.internal.stats.h("bfcache_w");
            e = hVar;
            StatsManager.a(hVar);
        }

        public /* synthetic */ h(long j, long j2, String str, byte b) {
            this(j, j2, str);
        }

        @Override // com.uc.webview.internal.stats.c
        public final com.uc.webview.internal.stats.h b() {
            return e;
        }

        @Override // com.uc.webview.internal.stats.c
        public final int c() {
            if (this.f14510a == 0) {
                this.f14510a = com.uc.webview.internal.stats.g.a(this.b) + 6 + com.uc.webview.internal.stats.g.a(this.c) + com.uc.webview.internal.stats.g.a(this.d);
            }
            return this.f14510a;
        }

        @Override // com.uc.webview.internal.stats.c
        public final int d() {
            return 6;
        }

        @Override // com.uc.webview.internal.stats.c
        public final Map<String, String> e() {
            HashMap hashMap = new HashMap();
            hashMap.put("_c", String.valueOf(this.b));
            hashMap.put("_m", String.valueOf(this.c));
            String str = this.d;
            if (str == null) {
                str = "";
            }
            hashMap.put("_h", str);
            return hashMap;
        }

        @Override // com.uc.webview.internal.stats.c
        public final /* synthetic */ com.uc.webview.internal.stats.c f() {
            return new h(this.b, this.c, this.d);
        }

        @Override // com.uc.webview.internal.stats.c
        public final String j() {
            return "bfcache_w";
        }

        @Override // com.uc.webview.internal.stats.c
        public final void k() {
            this.b = 0L;
            this.c = 0L;
            this.d = null;
            this.f14510a = 0;
        }

        public final String toString() {
            return com.uc.webview.internal.stats.c.a("bfcache_w", e());
        }

        public h() {
        }

        private h(long j, long j2, String str) {
            this.b = j;
            this.c = j2;
            if (str == null || str.length() <= 128) {
                this.d = str;
            } else {
                this.d = str.substring(0, 128);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class i implements c.a {
        private i() {
        }

        @Override // com.uc.webview.internal.stats.c.a
        public final com.uc.webview.internal.stats.c a(Map<String, String> map) {
            return new h(com.uc.webview.internal.stats.g.a(map, "c"), com.uc.webview.internal.stats.g.a(map, "m"), com.uc.webview.internal.stats.g.a(map, "h", ""), (byte) 0);
        }

        public /* synthetic */ i(byte b) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class j extends com.uc.webview.internal.stats.c {
        private static final com.uc.webview.internal.stats.h D;
        public long A;
        public String B;
        public String C;
        public long b;
        public long c;
        public long d;
        public long e;
        public long f;
        public long g;
        public String h;
        public String i;
        public String j;
        public String k;
        public long l;
        public long m;
        public long n;
        public long o;
        public long p;
        public long q;
        public long r;
        public long s;
        public long t;
        public long u;
        public long v;
        public long w;
        public long x;
        public long y;
        public long z;

        static {
            com.uc.webview.internal.stats.h hVar = new com.uc.webview.internal.stats.h("bkpg");
            D = hVar;
            StatsManager.a(hVar);
        }

        public /* synthetic */ j(long j, long j2, long j3, long j4, long j5, long j6, String str, String str2, String str3, String str4, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, String str5, String str6, byte b) {
            this(j, j2, j3, j4, j5, j6, str, str2, str3, str4, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, str5, str6);
        }

        @Override // com.uc.webview.internal.stats.c
        public final com.uc.webview.internal.stats.h b() {
            return D;
        }

        @Override // com.uc.webview.internal.stats.c
        public final int c() {
            if (this.f14510a == 0) {
                this.f14510a = com.uc.webview.internal.stats.g.a(this.b) + 99 + com.uc.webview.internal.stats.g.a(this.c) + com.uc.webview.internal.stats.g.a(this.d) + com.uc.webview.internal.stats.g.a(this.e) + com.uc.webview.internal.stats.g.a(this.f) + com.uc.webview.internal.stats.g.a(this.g) + com.uc.webview.internal.stats.g.a(this.h) + com.uc.webview.internal.stats.g.a(this.i) + com.uc.webview.internal.stats.g.a(this.j) + com.uc.webview.internal.stats.g.a(this.k) + com.uc.webview.internal.stats.g.a(this.l) + com.uc.webview.internal.stats.g.a(this.m) + com.uc.webview.internal.stats.g.a(this.n) + com.uc.webview.internal.stats.g.a(this.o) + com.uc.webview.internal.stats.g.a(this.p) + com.uc.webview.internal.stats.g.a(this.q) + com.uc.webview.internal.stats.g.a(this.r) + com.uc.webview.internal.stats.g.a(this.s) + com.uc.webview.internal.stats.g.a(this.t) + com.uc.webview.internal.stats.g.a(this.u) + com.uc.webview.internal.stats.g.a(this.v) + com.uc.webview.internal.stats.g.a(this.w) + com.uc.webview.internal.stats.g.a(this.x) + com.uc.webview.internal.stats.g.a(this.y) + com.uc.webview.internal.stats.g.a(this.z) + com.uc.webview.internal.stats.g.a(this.A) + com.uc.webview.internal.stats.g.a(this.B) + com.uc.webview.internal.stats.g.a(this.C);
            }
            return this.f14510a;
        }

        @Override // com.uc.webview.internal.stats.c
        public final int d() {
            return 99;
        }

        @Override // com.uc.webview.internal.stats.c
        public final Map<String, String> e() {
            HashMap hashMap = new HashMap();
            hashMap.put("_cc", String.valueOf(this.b));
            hashMap.put("_co", String.valueOf(this.c));
            hashMap.put("_ec", String.valueOf(this.d));
            hashMap.put("_ex", String.valueOf(this.e));
            hashMap.put("_sv", String.valueOf(this.f));
            hashMap.put("_rc", String.valueOf(this.g));
            String str = this.h;
            String str2 = "";
            if (str == null) {
                str = str2;
            }
            hashMap.put("_sc", str);
            String str3 = this.i;
            if (str3 == null) {
                str3 = str2;
            }
            hashMap.put("_edl", str3);
            String str4 = this.j;
            if (str4 == null) {
                str4 = str2;
            }
            hashMap.put("_ebl", str4);
            String str5 = this.k;
            if (str5 == null) {
                str5 = str2;
            }
            hashMap.put("_len", str5);
            hashMap.put("_src", String.valueOf(this.l));
            hashMap.put("_es", String.valueOf(this.m));
            hashMap.put("_fp", String.valueOf(this.n));
            hashMap.put("_pt", String.valueOf(this.o));
            hashMap.put("_aw", String.valueOf(this.p));
            hashMap.put("_wlc", String.valueOf(this.q));
            hashMap.put("_cmc", String.valueOf(this.r));
            hashMap.put("_nt", String.valueOf(this.s));
            hashMap.put("_t0", String.valueOf(this.t));
            hashMap.put("_t1", String.valueOf(this.u));
            hashMap.put("_t1l", String.valueOf(this.v));
            hashMap.put("_fpt", String.valueOf(this.w));
            hashMap.put("_t2", String.valueOf(this.x));
            hashMap.put("_t3", String.valueOf(this.y));
            hashMap.put("_sct", String.valueOf(this.z));
            hashMap.put("_time", String.valueOf(this.A));
            String str6 = this.B;
            if (str6 == null) {
                str6 = str2;
            }
            hashMap.put("_url", str6);
            String str7 = this.C;
            if (str7 != null) {
                str2 = str7;
            }
            hashMap.put("_frmid", str2);
            return hashMap;
        }

        @Override // com.uc.webview.internal.stats.c
        public final /* synthetic */ com.uc.webview.internal.stats.c f() {
            return new j(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C);
        }

        @Override // com.uc.webview.internal.stats.c
        public final boolean h() {
            return false;
        }

        @Override // com.uc.webview.internal.stats.c
        public final String j() {
            return "bkpg";
        }

        @Override // com.uc.webview.internal.stats.c
        public final void k() {
            this.b = 0L;
            this.c = 0L;
            this.d = 0L;
            this.e = 0L;
            this.f = 0L;
            this.g = 0L;
            this.h = null;
            this.i = null;
            this.j = null;
            this.k = null;
            this.l = 0L;
            this.m = 0L;
            this.n = 0L;
            this.o = 0L;
            this.p = 0L;
            this.q = 0L;
            this.r = 0L;
            this.s = 0L;
            this.t = 0L;
            this.u = 0L;
            this.v = 0L;
            this.w = 0L;
            this.x = 0L;
            this.y = 0L;
            this.z = 0L;
            this.A = 0L;
            this.B = null;
            this.C = null;
            this.f14510a = 0;
        }

        public final String toString() {
            return com.uc.webview.internal.stats.c.a("bkpg", e());
        }

        public j() {
        }

        private j(long j, long j2, long j3, long j4, long j5, long j6, String str, String str2, String str3, String str4, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, String str5, String str6) {
            String str7 = str;
            this.b = j;
            this.c = j2;
            this.d = j3;
            this.e = j4;
            this.f = j5;
            this.g = j6;
            this.l = j7;
            this.m = j8;
            this.n = j9;
            this.o = j10;
            this.p = j11;
            this.q = j12;
            this.r = j13;
            this.s = j14;
            this.t = j15;
            this.u = j16;
            this.v = j17;
            this.w = j18;
            this.x = j19;
            this.y = j20;
            this.z = j21;
            this.A = j22;
            if (str7 != null && str.length() > 64) {
                str7 = str7.substring(0, 64);
            }
            this.h = str7;
            if (str2 == null || str2.length() <= 64) {
                this.i = str2;
            } else {
                this.i = str2.substring(0, 64);
            }
            if (str3 == null || str3.length() <= 64) {
                this.j = str3;
            } else {
                this.j = str3.substring(0, 64);
            }
            if (str4 == null || str4.length() <= 64) {
                this.k = str4;
            } else {
                this.k = str4.substring(0, 64);
            }
            if (str5 == null || str5.length() <= 128) {
                this.B = str5;
            } else {
                this.B = str5.substring(0, 128);
            }
            if (str6 == null || str6.length() <= 128) {
                this.C = str6;
            } else {
                this.C = str6.substring(0, 128);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class k implements c.a {
        private k() {
        }

        public /* synthetic */ k(byte b) {
            this();
        }

        @Override // com.uc.webview.internal.stats.c.a
        public final com.uc.webview.internal.stats.c a(Map<String, String> map) {
            return new j(com.uc.webview.internal.stats.g.a(map, "cc"), com.uc.webview.internal.stats.g.a(map, "co"), com.uc.webview.internal.stats.g.a(map, RiskDataPipeManager.PIPE_RESULT_ERROR_CODE_KEY), com.uc.webview.internal.stats.g.a(map, ErrorType.DEFAULT), com.uc.webview.internal.stats.g.a(map, BizContext.KEY_SDK_VERSION), com.uc.webview.internal.stats.g.a(map, LogContext.RELEASETYPE_RC), com.uc.webview.internal.stats.g.a(map, "sc", ""), com.uc.webview.internal.stats.g.a(map, "edl", ""), com.uc.webview.internal.stats.g.a(map, "ebl", ""), com.uc.webview.internal.stats.g.a(map, "len", ""), com.uc.webview.internal.stats.g.a(map, "src"), com.uc.webview.internal.stats.g.a(map, "es"), com.uc.webview.internal.stats.g.a(map, "fp"), com.uc.webview.internal.stats.g.a(map, AdvertisementOption.PRIORITY_VALID_TIME), com.uc.webview.internal.stats.g.a(map, "aw"), com.uc.webview.internal.stats.g.a(map, "wlc"), com.uc.webview.internal.stats.g.a(map, "cmc"), com.uc.webview.internal.stats.g.a(map, "nt"), com.uc.webview.internal.stats.g.a(map, lca.STAGE_T0), com.uc.webview.internal.stats.g.a(map, lca.STAGE_T1), com.uc.webview.internal.stats.g.a(map, "t1l"), com.uc.webview.internal.stats.g.a(map, "fpt"), com.uc.webview.internal.stats.g.a(map, lca.STAGE_T2), com.uc.webview.internal.stats.g.a(map, lca.STAGE_T3), com.uc.webview.internal.stats.g.a(map, "sct"), com.uc.webview.internal.stats.g.a(map, "time"), com.uc.webview.internal.stats.g.a(map, "url", ""), com.uc.webview.internal.stats.g.a(map, "frmid", ""), (byte) 0);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class l extends com.uc.webview.internal.stats.c {
        private static final com.uc.webview.internal.stats.h j;
        public String b;
        public String c;
        public String d;
        public String e;
        public String f;
        public String g;
        public long h;
        public long i;

        static {
            com.uc.webview.internal.stats.h hVar = new com.uc.webview.internal.stats.h("block_subres");
            j = hVar;
            StatsManager.a(hVar);
        }

        public /* synthetic */ l(String str, String str2, String str3, String str4, String str5, String str6, long j2, long j3, byte b) {
            this(str, str2, str3, str4, str5, str6, j2, j3);
        }

        @Override // com.uc.webview.internal.stats.c
        public final com.uc.webview.internal.stats.h b() {
            return j;
        }

        @Override // com.uc.webview.internal.stats.c
        public final int c() {
            if (this.f14510a == 0) {
                this.f14510a = com.uc.webview.internal.stats.g.a(this.b) + 28 + com.uc.webview.internal.stats.g.a(this.c) + com.uc.webview.internal.stats.g.a(this.d) + com.uc.webview.internal.stats.g.a(this.e) + com.uc.webview.internal.stats.g.a(this.f) + com.uc.webview.internal.stats.g.a(this.g) + com.uc.webview.internal.stats.g.a(this.h) + com.uc.webview.internal.stats.g.a(this.i);
            }
            return this.f14510a;
        }

        @Override // com.uc.webview.internal.stats.c
        public final int d() {
            return 28;
        }

        @Override // com.uc.webview.internal.stats.c
        public final Map<String, String> e() {
            HashMap hashMap = new HashMap();
            String str = this.b;
            String str2 = "";
            if (str == null) {
                str = str2;
            }
            hashMap.put("_rule", str);
            String str3 = this.c;
            if (str3 == null) {
                str3 = str2;
            }
            hashMap.put("_url", str3);
            String str4 = this.d;
            if (str4 == null) {
                str4 = str2;
            }
            hashMap.put("_suf", str4);
            String str5 = this.e;
            if (str5 == null) {
                str5 = str2;
            }
            hashMap.put("_mt", str5);
            String str6 = this.f;
            if (str6 == null) {
                str6 = str2;
            }
            hashMap.put("_rf", str6);
            String str7 = this.g;
            if (str7 != null) {
                str2 = str7;
            }
            hashMap.put("_dt", str2);
            hashMap.put("_sz", String.valueOf(this.h));
            hashMap.put("_am", String.valueOf(this.i));
            return hashMap;
        }

        @Override // com.uc.webview.internal.stats.c
        public final /* synthetic */ com.uc.webview.internal.stats.c f() {
            return new l(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
        }

        @Override // com.uc.webview.internal.stats.c
        public final String j() {
            return "block_subres";
        }

        @Override // com.uc.webview.internal.stats.c
        public final void k() {
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = null;
            this.f = null;
            this.g = null;
            this.h = 0L;
            this.i = 0L;
            this.f14510a = 0;
        }

        public final String toString() {
            return com.uc.webview.internal.stats.c.a("block_subres", e());
        }

        public l() {
        }

        private l(String str, String str2, String str3, String str4, String str5, String str6, long j2, long j3) {
            this.h = j2;
            this.i = j3;
            if (str != null && str.length() > 64) {
                str = str.substring(0, 64);
            }
            this.b = str;
            if (str2 == null || str2.length() <= 64) {
                this.c = str2;
            } else {
                this.c = str2.substring(0, 64);
            }
            if (str3 == null || str3.length() <= 64) {
                this.d = str3;
            } else {
                this.d = str3.substring(0, 64);
            }
            if (str4 == null || str4.length() <= 64) {
                this.e = str4;
            } else {
                this.e = str4.substring(0, 64);
            }
            if (str5 == null || str5.length() <= 64) {
                this.f = str5;
            } else {
                this.f = str5.substring(0, 64);
            }
            if (str6 == null || str6.length() <= 64) {
                this.g = str6;
            } else {
                this.g = str6.substring(0, 64);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class m implements c.a {
        private m() {
        }

        @Override // com.uc.webview.internal.stats.c.a
        public final com.uc.webview.internal.stats.c a(Map<String, String> map) {
            return new l(com.uc.webview.internal.stats.g.a(map, LinkageUtils.PolicyType.RULE, ""), com.uc.webview.internal.stats.g.a(map, "url", ""), com.uc.webview.internal.stats.g.a(map, "suf", ""), com.uc.webview.internal.stats.g.a(map, "mt", ""), com.uc.webview.internal.stats.g.a(map, "rf", ""), com.uc.webview.internal.stats.g.a(map, "dt", ""), com.uc.webview.internal.stats.g.a(map, "sz"), com.uc.webview.internal.stats.g.a(map, "am"), (byte) 0);
        }

        public /* synthetic */ m(byte b) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class n extends com.uc.webview.internal.stats.c {
        private static final com.uc.webview.internal.stats.h f;
        public long b;
        public String c;
        public long d;
        public long e;

        static {
            com.uc.webview.internal.stats.h hVar = new com.uc.webview.internal.stats.h("canvas_stats");
            f = hVar;
            StatsManager.a(hVar);
        }

        public /* synthetic */ n(long j, String str, long j2, long j3, byte b) {
            this(j, str, j2, j3);
        }

        @Override // com.uc.webview.internal.stats.c
        public final com.uc.webview.internal.stats.h b() {
            return f;
        }

        @Override // com.uc.webview.internal.stats.c
        public final int c() {
            if (this.f14510a == 0) {
                this.f14510a = com.uc.webview.internal.stats.g.a(this.b) + 12 + com.uc.webview.internal.stats.g.a(this.c) + com.uc.webview.internal.stats.g.a(this.d) + com.uc.webview.internal.stats.g.a(this.e);
            }
            return this.f14510a;
        }

        @Override // com.uc.webview.internal.stats.c
        public final int d() {
            return 12;
        }

        @Override // com.uc.webview.internal.stats.c
        public final Map<String, String> e() {
            HashMap hashMap = new HashMap();
            hashMap.put("_ac", String.valueOf(this.b));
            String str = this.c;
            if (str == null) {
                str = "";
            }
            hashMap.put("_ph", str);
            hashMap.put("_sm", String.valueOf(this.d));
            hashMap.put("_pc", String.valueOf(this.e));
            return hashMap;
        }

        @Override // com.uc.webview.internal.stats.c
        public final /* synthetic */ com.uc.webview.internal.stats.c f() {
            return new n(this.b, this.c, this.d, this.e);
        }

        @Override // com.uc.webview.internal.stats.c
        public final String j() {
            return "canvas_stats";
        }

        @Override // com.uc.webview.internal.stats.c
        public final void k() {
            this.b = 0L;
            this.c = null;
            this.d = 0L;
            this.e = 0L;
            this.f14510a = 0;
        }

        public final String toString() {
            return com.uc.webview.internal.stats.c.a("canvas_stats", e());
        }

        public n() {
        }

        private n(long j, String str, long j2, long j3) {
            this.b = j;
            this.d = j2;
            this.e = j3;
            if (str == null || str.length() <= 64) {
                this.c = str;
            } else {
                this.c = str.substring(0, 64);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class o implements c.a {
        private o() {
        }

        @Override // com.uc.webview.internal.stats.c.a
        public final com.uc.webview.internal.stats.c a(Map<String, String> map) {
            return new n(com.uc.webview.internal.stats.g.a(map, "ac"), com.uc.webview.internal.stats.g.a(map, "ph", ""), com.uc.webview.internal.stats.g.a(map, "sm"), com.uc.webview.internal.stats.g.a(map, "pc"), (byte) 0);
        }

        public /* synthetic */ o(byte b) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class p extends com.uc.webview.internal.stats.c {
        private static final com.uc.webview.internal.stats.h j;
        public long b;
        public long c;
        public long d;
        public long e;
        public long f;
        public long g;
        public long h;
        public String i;

        static {
            com.uc.webview.internal.stats.h hVar = new com.uc.webview.internal.stats.h("capture_stat");
            j = hVar;
            StatsManager.a(hVar);
        }

        public /* synthetic */ p(long j2, long j3, long j4, long j5, long j6, long j7, long j8, String str, byte b) {
            this(j2, j3, j4, j5, j6, j7, j8, str);
        }

        @Override // com.uc.webview.internal.stats.c
        public final com.uc.webview.internal.stats.h b() {
            return j;
        }

        @Override // com.uc.webview.internal.stats.c
        public final int c() {
            if (this.f14510a == 0) {
                this.f14510a = com.uc.webview.internal.stats.g.a(this.b) + 26 + com.uc.webview.internal.stats.g.a(this.c) + com.uc.webview.internal.stats.g.a(this.d) + com.uc.webview.internal.stats.g.a(this.e) + com.uc.webview.internal.stats.g.a(this.f) + com.uc.webview.internal.stats.g.a(this.g) + com.uc.webview.internal.stats.g.a(this.h) + com.uc.webview.internal.stats.g.a(this.i);
            }
            return this.f14510a;
        }

        @Override // com.uc.webview.internal.stats.c
        public final int d() {
            return 26;
        }

        @Override // com.uc.webview.internal.stats.c
        public final Map<String, String> e() {
            HashMap hashMap = new HashMap();
            hashMap.put("_fs", String.valueOf(this.b));
            hashMap.put("_pdf", String.valueOf(this.c));
            hashMap.put("_dom", String.valueOf(this.d));
            hashMap.put("_bf", String.valueOf(this.e));
            hashMap.put("_st", String.valueOf(this.f));
            hashMap.put("_ct", String.valueOf(this.g));
            hashMap.put("_dl", String.valueOf(this.h));
            String str = this.i;
            if (str == null) {
                str = "";
            }
            hashMap.put("_ph", str);
            return hashMap;
        }

        @Override // com.uc.webview.internal.stats.c
        public final /* synthetic */ com.uc.webview.internal.stats.c f() {
            return new p(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
        }

        @Override // com.uc.webview.internal.stats.c
        public final String j() {
            return "capture_stat";
        }

        @Override // com.uc.webview.internal.stats.c
        public final void k() {
            this.b = 0L;
            this.c = 0L;
            this.d = 0L;
            this.e = 0L;
            this.f = 0L;
            this.g = 0L;
            this.h = 0L;
            this.i = null;
            this.f14510a = 0;
        }

        public final String toString() {
            return com.uc.webview.internal.stats.c.a("capture_stat", e());
        }

        public p() {
        }

        private p(long j2, long j3, long j4, long j5, long j6, long j7, long j8, String str) {
            this.b = j2;
            this.c = j3;
            this.d = j4;
            this.e = j5;
            this.f = j6;
            this.g = j7;
            this.h = j8;
            if (str == null || str.length() <= 64) {
                this.i = str;
            } else {
                this.i = str.substring(0, 64);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class q implements c.a {
        private q() {
        }

        public /* synthetic */ q(byte b) {
            this();
        }

        @Override // com.uc.webview.internal.stats.c.a
        public final com.uc.webview.internal.stats.c a(Map<String, String> map) {
            return new p(com.uc.webview.internal.stats.g.a(map, RVStartParams.KEY_FULLSCREEN_SHORT), com.uc.webview.internal.stats.g.a(map, "pdf"), com.uc.webview.internal.stats.g.a(map, "dom"), com.uc.webview.internal.stats.g.a(map, "bf"), com.uc.webview.internal.stats.g.a(map, "st"), com.uc.webview.internal.stats.g.a(map, gat.CT), com.uc.webview.internal.stats.g.a(map, "dl"), com.uc.webview.internal.stats.g.a(map, "ph", ""), (byte) 0);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class r extends com.uc.webview.internal.stats.c {
        private static final com.uc.webview.internal.stats.h d;
        public String b;
        public String c;

        static {
            com.uc.webview.internal.stats.h hVar = new com.uc.webview.internal.stats.h("con_s");
            d = hVar;
            StatsManager.a(hVar);
        }

        public /* synthetic */ r(String str, String str2, byte b) {
            this(str, str2);
        }

        @Override // com.uc.webview.internal.stats.c
        public final com.uc.webview.internal.stats.h b() {
            return d;
        }

        @Override // com.uc.webview.internal.stats.c
        public final int c() {
            if (this.f14510a == 0) {
                this.f14510a = com.uc.webview.internal.stats.g.a(this.b) + 4 + com.uc.webview.internal.stats.g.a(this.c);
            }
            return this.f14510a;
        }

        @Override // com.uc.webview.internal.stats.c
        public final int d() {
            return 4;
        }

        @Override // com.uc.webview.internal.stats.c
        public final Map<String, String> e() {
            HashMap hashMap = new HashMap();
            String str = this.b;
            String str2 = "";
            if (str == null) {
                str = str2;
            }
            hashMap.put("_u", str);
            String str3 = this.c;
            if (str3 != null) {
                str2 = str3;
            }
            hashMap.put("_c", str2);
            return hashMap;
        }

        @Override // com.uc.webview.internal.stats.c
        public final /* synthetic */ com.uc.webview.internal.stats.c f() {
            return new r(this.b, this.c);
        }

        @Override // com.uc.webview.internal.stats.c
        public final String j() {
            return "con_s";
        }

        @Override // com.uc.webview.internal.stats.c
        public final void k() {
            this.b = null;
            this.c = null;
            this.f14510a = 0;
        }

        public final String toString() {
            return com.uc.webview.internal.stats.c.a("con_s", e());
        }

        public r() {
        }

        private r(String str, String str2) {
            if (str != null && str.length() > 1024) {
                str = str.substring(0, 1024);
            }
            this.b = str;
            if (str2 == null || str2.length() <= 4096) {
                this.c = str2;
            } else {
                this.c = str2.substring(0, 4096);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class s implements c.a {
        private s() {
        }

        @Override // com.uc.webview.internal.stats.c.a
        public final com.uc.webview.internal.stats.c a(Map<String, String> map) {
            return new r(com.uc.webview.internal.stats.g.a(map, "u", ""), com.uc.webview.internal.stats.g.a(map, "c", ""), (byte) 0);
        }

        public /* synthetic */ s(byte b) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class t extends com.uc.webview.internal.stats.c {
        private static final com.uc.webview.internal.stats.h s;
        public String b;
        public String c;
        public long d;
        public long e;
        public long f;
        public long g;
        public long h;
        public long i;
        public long j;
        public String k;
        public String l;
        public String m;
        public String n;
        public long o;
        public String p;
        public String q;
        public String r;

        static {
            com.uc.webview.internal.stats.h hVar = new com.uc.webview.internal.stats.h("core_errpage");
            s = hVar;
            StatsManager.a(hVar);
        }

        public /* synthetic */ t(String str, String str2, long j, long j2, long j3, long j4, long j5, long j6, long j7, String str3, String str4, String str5, String str6, long j8, String str7, String str8, String str9, byte b) {
            this(str, str2, j, j2, j3, j4, j5, j6, j7, str3, str4, str5, str6, j8, str7, str8, str9);
        }

        @Override // com.uc.webview.internal.stats.c
        public final com.uc.webview.internal.stats.h b() {
            return s;
        }

        @Override // com.uc.webview.internal.stats.c
        public final int c() {
            if (this.f14510a == 0) {
                this.f14510a = com.uc.webview.internal.stats.g.a(this.b) + 54 + com.uc.webview.internal.stats.g.a(this.c) + com.uc.webview.internal.stats.g.a(this.d) + com.uc.webview.internal.stats.g.a(this.e) + com.uc.webview.internal.stats.g.a(this.f) + com.uc.webview.internal.stats.g.a(this.g) + com.uc.webview.internal.stats.g.a(this.h) + com.uc.webview.internal.stats.g.a(this.i) + com.uc.webview.internal.stats.g.a(this.j) + com.uc.webview.internal.stats.g.a(this.k) + com.uc.webview.internal.stats.g.a(this.l) + com.uc.webview.internal.stats.g.a(this.m) + com.uc.webview.internal.stats.g.a(this.n) + com.uc.webview.internal.stats.g.a(this.o) + com.uc.webview.internal.stats.g.a(this.p) + com.uc.webview.internal.stats.g.a(this.q) + com.uc.webview.internal.stats.g.a(this.r);
            }
            return this.f14510a;
        }

        @Override // com.uc.webview.internal.stats.c
        public final int d() {
            return 54;
        }

        @Override // com.uc.webview.internal.stats.c
        public final Map<String, String> e() {
            HashMap hashMap = new HashMap();
            String str = this.b;
            String str2 = "";
            if (str == null) {
                str = str2;
            }
            hashMap.put("_ht", str);
            String str3 = this.c;
            if (str3 == null) {
                str3 = str2;
            }
            hashMap.put("_ad", str3);
            hashMap.put("_rt", String.valueOf(this.d));
            hashMap.put("_ec", String.valueOf(this.e));
            hashMap.put("_oe", String.valueOf(this.f));
            hashMap.put("_nc", String.valueOf(this.g));
            hashMap.put("_nt", String.valueOf(this.h));
            hashMap.put("_rc", String.valueOf(this.i));
            hashMap.put("_fp", String.valueOf(this.j));
            String str4 = this.k;
            if (str4 == null) {
                str4 = str2;
            }
            hashMap.put("_nhi", str4);
            String str5 = this.l;
            if (str5 == null) {
                str5 = str2;
            }
            hashMap.put("_nht", str5);
            String str6 = this.m;
            if (str6 == null) {
                str6 = str2;
            }
            hashMap.put("_nhe", str6);
            String str7 = this.n;
            if (str7 == null) {
                str7 = str2;
            }
            hashMap.put("_fm", str7);
            hashMap.put("_mc", String.valueOf(this.o));
            String str8 = this.p;
            if (str8 == null) {
                str8 = str2;
            }
            hashMap.put("_mr", str8);
            String str9 = this.q;
            if (str9 == null) {
                str9 = str2;
            }
            hashMap.put("_mf", str9);
            String str10 = this.r;
            if (str10 != null) {
                str2 = str10;
            }
            hashMap.put("_ma", str2);
            return hashMap;
        }

        @Override // com.uc.webview.internal.stats.c
        public final /* synthetic */ com.uc.webview.internal.stats.c f() {
            return new t(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r);
        }

        @Override // com.uc.webview.internal.stats.c
        public final String j() {
            return "core_errpage";
        }

        @Override // com.uc.webview.internal.stats.c
        public final void k() {
            this.b = null;
            this.c = null;
            this.d = 0L;
            this.e = 0L;
            this.f = 0L;
            this.g = 0L;
            this.h = 0L;
            this.i = 0L;
            this.j = 0L;
            this.k = null;
            this.l = null;
            this.m = null;
            this.n = null;
            this.o = 0L;
            this.p = null;
            this.q = null;
            this.r = null;
            this.f14510a = 0;
        }

        public final String toString() {
            return com.uc.webview.internal.stats.c.a("core_errpage", e());
        }

        public t() {
        }

        private t(String str, String str2, long j, long j2, long j3, long j4, long j5, long j6, long j7, String str3, String str4, String str5, String str6, long j8, String str7, String str8, String str9) {
            String str10 = str;
            String str11 = str2;
            this.d = j;
            this.e = j2;
            this.f = j3;
            this.g = j4;
            this.h = j5;
            this.i = j6;
            this.j = j7;
            this.o = j8;
            if (str10 != null && str.length() > 128) {
                str10 = str.substring(0, 128);
            }
            this.b = str10;
            if (str11 != null && str2.length() > 64) {
                str11 = str2.substring(0, 64);
            }
            this.c = str11;
            if (str3 == null || str3.length() <= 64) {
                this.k = str3;
            } else {
                this.k = str3.substring(0, 64);
            }
            if (str4 == null || str4.length() <= 64) {
                this.l = str4;
            } else {
                this.l = str4.substring(0, 64);
            }
            if (str5 == null || str5.length() <= 64) {
                this.m = str5;
            } else {
                this.m = str5.substring(0, 64);
            }
            if (str6 == null || str6.length() <= 64) {
                this.n = str6;
            } else {
                this.n = str6.substring(0, 64);
            }
            if (str7 == null || str7.length() <= 64) {
                this.p = str7;
            } else {
                this.p = str7.substring(0, 64);
            }
            if (str8 == null || str8.length() <= 64) {
                this.q = str8;
            } else {
                this.q = str8.substring(0, 64);
            }
            if (str9 == null || str9.length() <= 64) {
                this.r = str9;
            } else {
                this.r = str9.substring(0, 64);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class u implements c.a {
        private u() {
        }

        public /* synthetic */ u(byte b) {
            this();
        }

        @Override // com.uc.webview.internal.stats.c.a
        public final com.uc.webview.internal.stats.c a(Map<String, String> map) {
            return new t(com.uc.webview.internal.stats.g.a(map, "ht", ""), com.uc.webview.internal.stats.g.a(map, "ad", ""), com.uc.webview.internal.stats.g.a(map, "rt"), com.uc.webview.internal.stats.g.a(map, RiskDataPipeManager.PIPE_RESULT_ERROR_CODE_KEY), com.uc.webview.internal.stats.g.a(map, "oe"), com.uc.webview.internal.stats.g.a(map, "nc"), com.uc.webview.internal.stats.g.a(map, "nt"), com.uc.webview.internal.stats.g.a(map, LogContext.RELEASETYPE_RC), com.uc.webview.internal.stats.g.a(map, "fp"), com.uc.webview.internal.stats.g.a(map, "nhi", ""), com.uc.webview.internal.stats.g.a(map, "nht", ""), com.uc.webview.internal.stats.g.a(map, "nhe", ""), com.uc.webview.internal.stats.g.a(map, "fm", ""), com.uc.webview.internal.stats.g.a(map, "mc"), com.uc.webview.internal.stats.g.a(map, "mr", ""), com.uc.webview.internal.stats.g.a(map, "mf", ""), com.uc.webview.internal.stats.g.a(map, "ma", ""), (byte) 0);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class v extends com.uc.webview.internal.stats.c {
        private static final com.uc.webview.internal.stats.h f;
        public String b;
        public String c;
        public String d;
        public long e;

        static {
            com.uc.webview.internal.stats.h hVar = new com.uc.webview.internal.stats.h("cre_tpmk");
            f = hVar;
            StatsManager.a(hVar);
        }

        public /* synthetic */ v(String str, String str2, String str3, long j, byte b) {
            this(str, str2, str3, j);
        }

        @Override // com.uc.webview.internal.stats.c
        public final com.uc.webview.internal.stats.h b() {
            return f;
        }

        @Override // com.uc.webview.internal.stats.c
        public final int c() {
            if (this.f14510a == 0) {
                this.f14510a = com.uc.webview.internal.stats.g.a(this.b) + 8 + com.uc.webview.internal.stats.g.a(this.c) + com.uc.webview.internal.stats.g.a(this.d) + com.uc.webview.internal.stats.g.a(this.e);
            }
            return this.f14510a;
        }

        @Override // com.uc.webview.internal.stats.c
        public final int d() {
            return 8;
        }

        @Override // com.uc.webview.internal.stats.c
        public final Map<String, String> e() {
            HashMap hashMap = new HashMap();
            String str = this.b;
            String str2 = "";
            if (str == null) {
                str = str2;
            }
            hashMap.put("_n", str);
            String str3 = this.c;
            if (str3 == null) {
                str3 = str2;
            }
            hashMap.put("_f", str3);
            String str4 = this.d;
            if (str4 != null) {
                str2 = str4;
            }
            hashMap.put("_d", str2);
            hashMap.put("_r", String.valueOf(this.e));
            return hashMap;
        }

        @Override // com.uc.webview.internal.stats.c
        public final /* synthetic */ com.uc.webview.internal.stats.c f() {
            return new v(this.b, this.c, this.d, this.e);
        }

        @Override // com.uc.webview.internal.stats.c
        public final String j() {
            return "cre_tpmk";
        }

        @Override // com.uc.webview.internal.stats.c
        public final void k() {
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = 0L;
            this.f14510a = 0;
        }

        public final String toString() {
            return com.uc.webview.internal.stats.c.a("cre_tpmk", e());
        }

        public v() {
        }

        private v(String str, String str2, String str3, long j) {
            this.e = j;
            if (str != null && str.length() > 1024) {
                str = str.substring(0, 1024);
            }
            this.b = str;
            if (str2 == null || str2.length() <= 1024) {
                this.c = str2;
            } else {
                this.c = str2.substring(0, 1024);
            }
            if (str3 == null || str3.length() <= 1024) {
                this.d = str3;
            } else {
                this.d = str3.substring(0, 1024);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class w implements c.a {
        private w() {
        }

        @Override // com.uc.webview.internal.stats.c.a
        public final com.uc.webview.internal.stats.c a(Map<String, String> map) {
            return new v(com.uc.webview.internal.stats.g.a(map, "n", ""), com.uc.webview.internal.stats.g.a(map, "f", ""), com.uc.webview.internal.stats.g.a(map, "d", ""), com.uc.webview.internal.stats.g.a(map, "r"), (byte) 0);
        }

        public /* synthetic */ w(byte b) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class x extends com.uc.webview.internal.stats.c {
        private static final com.uc.webview.internal.stats.h e;
        public String b;
        public String c;
        public String d;

        static {
            com.uc.webview.internal.stats.h hVar = new com.uc.webview.internal.stats.h("css_s");
            e = hVar;
            StatsManager.a(hVar);
        }

        public /* synthetic */ x(String str, String str2, String str3, byte b) {
            this(str, str2, str3);
        }

        @Override // com.uc.webview.internal.stats.c
        public final com.uc.webview.internal.stats.h b() {
            return e;
        }

        @Override // com.uc.webview.internal.stats.c
        public final int c() {
            if (this.f14510a == 0) {
                this.f14510a = com.uc.webview.internal.stats.g.a(this.b) + 6 + com.uc.webview.internal.stats.g.a(this.c) + com.uc.webview.internal.stats.g.a(this.d);
            }
            return this.f14510a;
        }

        @Override // com.uc.webview.internal.stats.c
        public final int d() {
            return 6;
        }

        @Override // com.uc.webview.internal.stats.c
        public final Map<String, String> e() {
            HashMap hashMap = new HashMap();
            String str = this.b;
            String str2 = "";
            if (str == null) {
                str = str2;
            }
            hashMap.put("_h", str);
            String str3 = this.c;
            if (str3 == null) {
                str3 = str2;
            }
            hashMap.put("_u", str3);
            String str4 = this.d;
            if (str4 != null) {
                str2 = str4;
            }
            hashMap.put("_r", str2);
            return hashMap;
        }

        @Override // com.uc.webview.internal.stats.c
        public final /* synthetic */ com.uc.webview.internal.stats.c f() {
            return new x(this.b, this.c, this.d);
        }

        @Override // com.uc.webview.internal.stats.c
        public final String j() {
            return "css_s";
        }

        @Override // com.uc.webview.internal.stats.c
        public final void k() {
            this.b = null;
            this.c = null;
            this.d = null;
            this.f14510a = 0;
        }

        public final String toString() {
            return com.uc.webview.internal.stats.c.a("css_s", e());
        }

        public x() {
        }

        private x(String str, String str2, String str3) {
            if (str != null && str.length() > 128) {
                str = str.substring(0, 128);
            }
            this.b = str;
            if (str2 == null || str2.length() <= 1024) {
                this.c = str2;
            } else {
                this.c = str2.substring(0, 1024);
            }
            if (str3 == null || str3.length() <= 4096) {
                this.d = str3;
            } else {
                this.d = str3.substring(0, 4096);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class y implements c.a {
        private y() {
        }

        @Override // com.uc.webview.internal.stats.c.a
        public final com.uc.webview.internal.stats.c a(Map<String, String> map) {
            return new x(com.uc.webview.internal.stats.g.a(map, "h", ""), com.uc.webview.internal.stats.g.a(map, "u", ""), com.uc.webview.internal.stats.g.a(map, "r", ""), (byte) 0);
        }

        public /* synthetic */ y(byte b) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class z extends com.uc.webview.internal.stats.c {
        private static final com.uc.webview.internal.stats.h j;
        public String b;
        public String c;
        public String d;
        public long e;
        public long f;
        public long g;
        public long h;
        public long i;

        static {
            com.uc.webview.internal.stats.h hVar = new com.uc.webview.internal.stats.h("embed_req");
            j = hVar;
            StatsManager.a(hVar);
        }

        public /* synthetic */ z(String str, String str2, String str3, long j2, long j3, long j4, long j5, long j6, byte b) {
            this(str, str2, str3, j2, j3, j4, j5, j6);
        }

        @Override // com.uc.webview.internal.stats.c
        public final com.uc.webview.internal.stats.h b() {
            return j;
        }

        @Override // com.uc.webview.internal.stats.c
        public final int c() {
            if (this.f14510a == 0) {
                this.f14510a = com.uc.webview.internal.stats.g.a(this.b) + 16 + com.uc.webview.internal.stats.g.a(this.c) + com.uc.webview.internal.stats.g.a(this.d) + com.uc.webview.internal.stats.g.a(this.e) + com.uc.webview.internal.stats.g.a(this.f) + com.uc.webview.internal.stats.g.a(this.g) + com.uc.webview.internal.stats.g.a(this.h) + com.uc.webview.internal.stats.g.a(this.i);
            }
            return this.f14510a;
        }

        @Override // com.uc.webview.internal.stats.c
        public final int d() {
            return 16;
        }

        @Override // com.uc.webview.internal.stats.c
        public final Map<String, String> e() {
            HashMap hashMap = new HashMap();
            String str = this.b;
            String str2 = "";
            if (str == null) {
                str = str2;
            }
            hashMap.put("_h", str);
            String str3 = this.c;
            if (str3 == null) {
                str3 = str2;
            }
            hashMap.put("_t", str3);
            String str4 = this.d;
            if (str4 != null) {
                str2 = str4;
            }
            hashMap.put("_v", str2);
            hashMap.put("_m", String.valueOf(this.e));
            hashMap.put("_c", String.valueOf(this.f));
            hashMap.put("_s", String.valueOf(this.g));
            hashMap.put("_w", String.valueOf(this.h));
            hashMap.put("_e", String.valueOf(this.i));
            return hashMap;
        }

        @Override // com.uc.webview.internal.stats.c
        public final /* synthetic */ com.uc.webview.internal.stats.c f() {
            return new z(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
        }

        @Override // com.uc.webview.internal.stats.c
        public final String j() {
            return "embed_req";
        }

        @Override // com.uc.webview.internal.stats.c
        public final void k() {
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = 0L;
            this.f = 0L;
            this.g = 0L;
            this.h = 0L;
            this.i = 0L;
            this.f14510a = 0;
        }

        public final String toString() {
            return com.uc.webview.internal.stats.c.a("embed_req", e());
        }

        public z() {
        }

        private z(String str, String str2, String str3, long j2, long j3, long j4, long j5, long j6) {
            this.e = j2;
            this.f = j3;
            this.g = j4;
            this.h = j5;
            this.i = j6;
            if (str != null && str.length() > 128) {
                str = str.substring(0, 128);
            }
            this.b = str;
            if (str2 != null && str2.length() > 32) {
                str2 = str2.substring(0, 32);
            }
            this.c = str2;
            if (str3 == null || str3.length() <= 32) {
                this.d = str3;
            } else {
                this.d = str3.substring(0, 32);
            }
        }
    }

    public static c.a b(String str) {
        return C0847a.f14526a.get(str);
    }
}

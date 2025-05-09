package com.etao.feimagesearch.util;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.alibaba.ability.localization.Localization;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.model.PhotoFrom;
import com.etao.feimagesearch.result.IrpMuiseModule;
import com.etao.feimagesearch.util.ImageSearchMtopUtil;
import com.taobao.android.searchbaseframe.xsl.module.XslModule;
import com.taobao.android.ugc.h5.WVMicorPublishPlugin;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import com.taobao.wangxin.utils.WXConstantsOut;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.JvmStatic;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import tb.caa;
import tb.ckf;
import tb.cvr;
import tb.d8m;
import tb.e0;
import tb.g1a;
import tb.g6p;
import tb.h19;
import tb.j3p;
import tb.jzu;
import tb.k1p;
import tb.l5b;
import tb.lg4;
import tb.m3p;
import tb.mno;
import tb.o4j;
import tb.p80;
import tb.pmf;
import tb.q5j;
import tb.r4p;
import tb.ri7;
import tb.sr3;
import tb.t2o;
import tb.tsq;
import tb.u1a;
import tb.u7j;
import tb.uj3;
import tb.wh6;
import tb.wxi;
import tb.xhv;
import tb.yko;
import tb.z7m;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ImageSearchMtopUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_IMG = "strimg";
    public static final ImageSearchMtopUtil INSTANCE = new ImageSearchMtopUtil();

    /* renamed from: a  reason: collision with root package name */
    public static String f4881a = "";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface a {
        void a(MtopResponse mtopResponse, String str, String str2, JSONObject jSONObject);

        void b(String str, String str2, Integer num, String str3);
    }

    static {
        t2o.a(481297609);
    }

    public static final /* synthetic */ void a(ImageSearchMtopUtil imageSearchMtopUtil, String str, String str2, Map map, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a480f2", new Object[]{imageSearchMtopUtil, str, str2, map, mtopResponse});
        } else {
            imageSearchMtopUtil.k(str, str2, map, mtopResponse);
        }
    }

    public static final /* synthetic */ String b(ImageSearchMtopUtil imageSearchMtopUtil, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("29fa1a3d", new Object[]{imageSearchMtopUtil, mtopResponse});
        }
        return imageSearchMtopUtil.m(mtopResponse);
    }

    public static final /* synthetic */ String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d9268f0b", new Object[0]);
        }
        return f4881a;
    }

    public static final /* synthetic */ void d(ImageSearchMtopUtil imageSearchMtopUtil, MtopResponse mtopResponse, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22458645", new Object[]{imageSearchMtopUtil, mtopResponse, aVar});
        } else {
            imageSearchMtopUtil.n(mtopResponse, aVar);
        }
    }

    public static final /* synthetic */ void e(ImageSearchMtopUtil imageSearchMtopUtil, MtopResponse mtopResponse, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd67eb53", new Object[]{imageSearchMtopUtil, mtopResponse, aVar});
        } else {
            imageSearchMtopUtil.o(mtopResponse, aVar);
        }
    }

    @JvmStatic
    public static final void f(StringBuilder sb, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5ca5661", new Object[]{sb, str, str2});
            return;
        }
        ckf.g(sb, "extraParams");
        if (str2 != null) {
            sb.append(str);
            sb.append(":");
            sb.append(str2);
            sb.append(";");
        }
    }

    @JvmStatic
    public static final void g(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1d06462", new Object[]{map});
            return;
        }
        ckf.g(map, "params");
        String str = map.get("pssource");
        StringBuilder sb = new StringBuilder("use_multi_cat:1;use_pid_summary:1;cat_deleted:1;use_pid_tag:1;extend_count:3;agg:;auction_agg:tag,svid;");
        ImageSearchMtopUtil imageSearchMtopUtil = INSTANCE;
        imageSearchMtopUtil.i(sb, wxi.KEY_PHOTO_FROM, map.get(wxi.KEY_PHOTO_FROM));
        imageSearchMtopUtil.i(sb, "psfrom", map.get("psfrom"));
        imageSearchMtopUtil.i(sb, "pssource", str);
        imageSearchMtopUtil.i(sb, "region", map.get("region"));
        imageSearchMtopUtil.i(sb, "backflow_id", map.get("backflow_id"));
        if (ckf.b(str, "store") || ckf.b(str, "detailsku")) {
            String str2 = map.get("sellerId");
            if (TextUtils.isEmpty(str2)) {
                str2 = map.get("sellerid");
            }
            if (TextUtils.isEmpty(str2)) {
                str2 = map.get("seller_id");
            }
            imageSearchMtopUtil.i(sb, "sellid", str2);
        }
        String str3 = map.get("shopId");
        if (TextUtils.isEmpty(str3)) {
            str3 = map.get(WXConstantsOut.SHOPID);
        }
        imageSearchMtopUtil.i(sb, WXConstantsOut.SHOPID, str3);
        map.put("extraParams", sb.toString());
        String d2 = lg4.d2(str);
        if (!TextUtils.isEmpty(d2)) {
            map.put("component", d2);
        }
    }

    @JvmStatic
    public static final void h(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4680e97e", new Object[]{map});
        } else if (map != 0) {
            map.put("utd_id", caa.o(caa.c()));
            map.put("rainbow", e0.b());
            if (!map.containsKey("m")) {
                map.put("m", "api4etao");
            }
            if (!map.containsKey("n")) {
                map.put("n", "60");
            }
            map.put("busiKey", "face,floatBar1,icons,poplayer,tjbIcon,atmosphere,resultPoplayer");
            map.put("hdpoplayer", "true");
            map.put("maxn", "60");
            map.put("vm", "nw");
            map.put("biz_type", "pai");
            map.put("setSpApp", "picture");
            map.put("closepict", "false");
            map.put("page", "1");
            map.put("from", "");
            map.put("sversion", caa.i());
            map.put("musPageVersion", lg4.Q2());
            map.put("deviceLevel", ri7.a());
            map.put("subSearchType", "imageText_v3");
            map.put("newPhotoSearch", "true");
            if (ckf.b(map.get(wxi.KEY_PHOTO_FROM), PhotoFrom.Values.PRODUCT_CODE.getValue())) {
                map.put("barcodePage", "plt");
            }
            map.put("base91", "false");
            String a2 = l5b.a();
            if (!TextUtils.isEmpty(a2)) {
                map.put("LBS", a2);
            }
            if (TextUtils.isEmpty(map.get(r4p.KEY_GLOBAL_LBS))) {
                map.put(r4p.KEY_GLOBAL_LBS, m3p.INSTANCE.b(caa.c()));
            }
            if (TextUtils.isEmpty(map.get(r4p.KEY_EDITION_CODE))) {
                map.put(r4p.KEY_EDITION_CODE, k1p.c());
            }
            Pair<String, String> b = u7j.b();
            if (b != null && !TextUtils.isEmpty((CharSequence) b.first) && !TextUtils.isEmpty((CharSequence) b.second)) {
                map.put(b.first, b.second);
            }
            String l = INSTANCE.l();
            if (!TextUtils.isEmpty(l)) {
                map.put("clientIrpUserParams", l);
            }
            if (!map.containsKey(r4p.KEY_GOOD_PRICE)) {
                map.put(r4p.KEY_GOOD_PRICE, String.valueOf(cvr.INSTANCE.d()));
            }
            if (Localization.o()) {
                map.put("foreignImageSearch", "true");
            }
            map.put("triggerElder", String.valueOf(lg4.U0()));
        }
    }

    @JvmStatic
    public static final o4j r(String str, String str2, String str3, String str4, Map<String, String> map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (o4j) ipChange.ipc$dispatch("62d98eac", new Object[]{str, str2, str3, str4, map, new Boolean(z)});
        }
        o4j s = s(str, str2, str3, str4, map, z);
        pmf.E0(s.d());
        return s;
    }

    public static /* synthetic */ o4j t(String str, String str2, String str3, String str4, Map map, boolean z, int i, Object obj) {
        boolean z2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (o4j) ipChange.ipc$dispatch("bfeb0bd8", new Object[]{str, str2, str3, str4, map, new Boolean(z), new Integer(i), obj});
        }
        if ((i & 32) != 0) {
            z2 = true;
        } else {
            z2 = z;
        }
        return s(str, str2, str3, str4, map, z2);
    }

    public final void i(StringBuilder sb, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93ae7948", new Object[]{this, sb, str, str2});
        } else if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            sb.append(str);
            sb.append(":");
            sb.append(str2);
            sb.append(";");
        }
    }

    public final String m(MtopResponse mtopResponse) {
        List<String> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("892d51c7", new Object[]{this, mtopResponse});
        }
        if (mtopResponse == null || mtopResponse.getHeaderFields() == null || (list = mtopResponse.getHeaderFields().get("eagleeye-traceid")) == null || list.size() <= 0) {
            return "";
        }
        return list.get(0);
    }

    public final void n(MtopResponse mtopResponse, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57bd759f", new Object[]{this, mtopResponse, aVar});
            return;
        }
        JSONObject jSONObject = null;
        if (mtopResponse != null) {
            try {
                byte[] bytedata = mtopResponse.getBytedata();
                ckf.f(bytedata, "response.bytedata");
                jSONObject = JSON.parseObject(new String(bytedata, uj3.UTF_8));
            } catch (Exception unused) {
            }
        }
        if (jSONObject == null) {
            aVar.b(f4881a, "", -1, "parse result error");
        } else {
            aVar.a(mtopResponse, f4881a, "", jSONObject);
        }
    }

    public final void o(MtopResponse mtopResponse, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f71cec51", new Object[]{this, mtopResponse, aVar});
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        JSONObject jSONObject = null;
        if (mtopResponse != null) {
            try {
                byte[] bytedata = mtopResponse.getBytedata();
                ckf.f(bytedata, "response.bytedata");
                jSONObject = JSON.parseObject(new String(bytedata, uj3.UTF_8));
                pmf.D0(Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime));
            } catch (Exception unused) {
            }
        }
        String m = m(mtopResponse);
        if (jSONObject == null) {
            aVar.b(f4881a, m, -1, "parse result error");
        } else {
            aVar.a(mtopResponse, f4881a, m, jSONObject);
        }
    }

    @JvmStatic
    public static final void j(String str, final String str2, final String str3, Map<String, String> map, final a aVar) {
        String str4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab4b81cd", new Object[]{str, str2, str3, map, aVar});
            return;
        }
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        yko g = j3p.g();
        if (g != null) {
            p80.p(g, map, "plt-searcth", true);
        }
        linkedHashMap.put("params", JSON.toJSONString(map));
        if (TextUtils.isEmpty(str)) {
            String str5 = "";
            if (!(map == null || (str4 = map.get("pssource")) == null)) {
                str5 = str4;
            }
            str = lg4.H1(str5);
        }
        linkedHashMap.put("appId", str);
        f4881a = u7j.a(str2, str3, linkedHashMap, new IRemoteBaseListener() { // from class: com.etao.feimagesearch.util.ImageSearchMtopUtil$asyncImageSearch$mtopBusiness$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* compiled from: Taobao */
            /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
            public static final class a implements Runnable {
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ MtopResponse f4882a;
                public final /* synthetic */ ImageSearchMtopUtil.a b;

                public a(MtopResponse mtopResponse, ImageSearchMtopUtil.a aVar) {
                    this.f4882a = mtopResponse;
                    this.b = aVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        ImageSearchMtopUtil.e(ImageSearchMtopUtil.INSTANCE, this.f4882a, this.b);
                    }
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                String str6;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                jzu.e("PaiBase64Fail", new String[0]);
                String b = ImageSearchMtopUtil.b(ImageSearchMtopUtil.INSTANCE, mtopResponse);
                ImageSearchMtopUtil.a aVar2 = ImageSearchMtopUtil.a.this;
                if (aVar2 != null) {
                    String c = ImageSearchMtopUtil.c();
                    Integer valueOf = Integer.valueOf(i);
                    if (mtopResponse == null) {
                        str6 = null;
                    } else {
                        str6 = mtopResponse.getRetMsg();
                    }
                    aVar2.b(c, b, valueOf, str6);
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                    return;
                }
                jzu.e("PaiBase64Success", new String[0]);
                ImageSearchMtopUtil.a aVar2 = ImageSearchMtopUtil.a.this;
                if (aVar2 != null) {
                    z7m.c(new a(mtopResponse, aVar2));
                    ImageSearchMtopUtil.a(ImageSearchMtopUtil.INSTANCE, str2, str3, linkedHashMap, mtopResponse);
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:26:0x0069  */
            /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void onSystemError(int r6, mtopsdk.mtop.domain.MtopResponse r7, java.lang.Object r8) {
                /*
                    r5 = this;
                    r0 = 0
                    com.android.alibaba.ip.runtime.IpChange r1 = com.etao.feimagesearch.util.ImageSearchMtopUtil$asyncImageSearch$mtopBusiness$1.$ipChange
                    boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
                    if (r2 == 0) goto L_0x0020
                    java.lang.Integer r2 = new java.lang.Integer
                    r2.<init>(r6)
                    r6 = 4
                    java.lang.Object[] r6 = new java.lang.Object[r6]
                    r6[r0] = r5
                    r0 = 1
                    r6[r0] = r2
                    r0 = 2
                    r6[r0] = r7
                    r7 = 3
                    r6[r7] = r8
                    java.lang.String r7 = "d3b51d43"
                    r1.ipc$dispatch(r7, r6)
                    return
                L_0x0020:
                    java.lang.String[] r8 = new java.lang.String[r0]
                    java.lang.String r0 = "PaiBase64Fail"
                    tb.jzu.e(r0, r8)
                    r8 = 0
                    if (r7 != 0) goto L_0x002c
                    r0 = r8
                    goto L_0x0030
                L_0x002c:
                    java.lang.String r0 = r7.getRetCode()
                L_0x0030:
                    java.lang.String r1 = "FAIL_SYS_TRAFFIC_LIMIT"
                    boolean r0 = tb.ckf.b(r0, r1)
                    if (r0 != 0) goto L_0x005c
                    if (r7 != 0) goto L_0x003c
                    r0 = r8
                    goto L_0x0040
                L_0x003c:
                    java.lang.String r0 = r7.getRetCode()
                L_0x0040:
                    java.lang.String r1 = "FAIL_SYS_FLOW_CONTROL_ERROR"
                    boolean r0 = tb.ckf.b(r0, r1)
                    if (r0 == 0) goto L_0x0049
                    goto L_0x005c
                L_0x0049:
                    if (r7 != 0) goto L_0x004d
                    r0 = r8
                    goto L_0x0051
                L_0x004d:
                    java.lang.String r0 = r7.getRetCode()
                L_0x0051:
                    java.lang.String r1 = "ANDROID_SYS_LOGIN_CANCEL"
                    boolean r0 = tb.ckf.b(r0, r1)
                    if (r0 == 0) goto L_0x005e
                    r6 = -16
                    goto L_0x005e
                L_0x005c:
                    r6 = -17
                L_0x005e:
                    com.etao.feimagesearch.util.ImageSearchMtopUtil r0 = com.etao.feimagesearch.util.ImageSearchMtopUtil.INSTANCE
                    java.lang.String r0 = com.etao.feimagesearch.util.ImageSearchMtopUtil.b(r0, r7)
                    com.etao.feimagesearch.util.ImageSearchMtopUtil$a r1 = com.etao.feimagesearch.util.ImageSearchMtopUtil.a.this
                    if (r1 != 0) goto L_0x0069
                    goto L_0x0097
                L_0x0069:
                    java.lang.String r2 = com.etao.feimagesearch.util.ImageSearchMtopUtil.c()
                    java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                    java.lang.StringBuilder r3 = new java.lang.StringBuilder
                    r3.<init>()
                    if (r7 != 0) goto L_0x007a
                    r4 = r8
                    goto L_0x007e
                L_0x007a:
                    java.lang.String r4 = r7.getRetCode()
                L_0x007e:
                    r3.append(r4)
                    r4 = 58
                    r3.append(r4)
                    if (r7 != 0) goto L_0x0089
                    goto L_0x008d
                L_0x0089:
                    java.lang.String r8 = r7.getRetMsg()
                L_0x008d:
                    r3.append(r8)
                    java.lang.String r7 = r3.toString()
                    r1.b(r2, r0, r6, r7)
                L_0x0097:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.etao.feimagesearch.util.ImageSearchMtopUtil$asyncImageSearch$mtopBusiness$1.onSystemError(int, mtopsdk.mtop.domain.MtopResponse, java.lang.Object):void");
            }
        }, false, true).mtopProp.falcoId;
    }

    @JvmStatic
    public static final void p(String str, String str2, Map<String, String> map, final a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("662847d7", new Object[]{str, str2, map, aVar});
            return;
        }
        yko g = j3p.g();
        if (g != null) {
            p80.p(g, map, "plt-search", true);
        }
        f4881a = u7j.a(str, str2, map, new IRemoteBaseListener() { // from class: com.etao.feimagesearch.util.ImageSearchMtopUtil$searchRequest$mtopBusiness$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* compiled from: Taobao */
            /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
            public static final class a implements Runnable {
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ MtopResponse f4883a;
                public final /* synthetic */ ImageSearchMtopUtil.a b;

                public a(MtopResponse mtopResponse, ImageSearchMtopUtil.a aVar) {
                    this.f4883a = mtopResponse;
                    this.b = aVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        ImageSearchMtopUtil.d(ImageSearchMtopUtil.INSTANCE, this.f4883a, this.b);
                    }
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                String str3;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                ImageSearchMtopUtil.a aVar2 = ImageSearchMtopUtil.a.this;
                if (aVar2 != null) {
                    String c = ImageSearchMtopUtil.c();
                    Integer valueOf = Integer.valueOf(i);
                    if (mtopResponse == null) {
                        str3 = null;
                    } else {
                        str3 = mtopResponse.getRetMsg();
                    }
                    aVar2.b(c, "", valueOf, str3);
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                    return;
                }
                ImageSearchMtopUtil.a aVar2 = ImageSearchMtopUtil.a.this;
                if (aVar2 != null) {
                    z7m.c(new a(mtopResponse, aVar2));
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                String str3;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                ImageSearchMtopUtil.a aVar2 = ImageSearchMtopUtil.a.this;
                if (aVar2 != null) {
                    String c = ImageSearchMtopUtil.c();
                    Integer valueOf = Integer.valueOf(i);
                    if (mtopResponse == null) {
                        str3 = null;
                    } else {
                        str3 = mtopResponse.getRetMsg();
                    }
                    aVar2.b(c, "", valueOf, str3);
                }
            }
        }, false, true).mtopProp.falcoId;
    }

    @JvmStatic
    public static final void q(Map<String, String> map, g1a<? super Map<String, d8m>, xhv> g1aVar, u1a<? super Integer, ? super String, xhv> u1aVar) {
        JSONObject d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e57ed169", new Object[]{map, g1aVar, u1aVar});
            return;
        }
        o4j t = t("38719", lg4.F1(), lg4.G1(), null, map, false, 32, null);
        if (t.g()) {
            JSONObject d2 = h19.d(t.f(), "data");
            if (d2 != null) {
                JSONArray c = h19.c(d2, "result");
                if (c != null && !c.isEmpty()) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    Object obj = c.get(0);
                    if (obj instanceof JSONObject) {
                        JSONObject jSONObject = (JSONObject) obj;
                        for (String str : jSONObject.keySet()) {
                            if (!(str == null || TextUtils.isEmpty(str) || (d = h19.d(jSONObject, str)) == null)) {
                                String i = h19.i(d, "url", "");
                                if (!TextUtils.isEmpty(i)) {
                                    ckf.f(i, WVMicorPublishPlugin.TEMPLATE_URL);
                                    JSONObject jSONObject2 = new JSONObject();
                                    jSONObject2.put((JSONObject) str, (String) d);
                                    xhv xhvVar = xhv.INSTANCE;
                                    linkedHashMap.put(str, new d8m(str, i, jSONObject2));
                                }
                            }
                        }
                        if (linkedHashMap.isEmpty()) {
                            if (u1aVar != null) {
                                u1aVar.invoke(-1, "templates data is empty");
                            }
                        } else if (g1aVar != null) {
                            g1aVar.invoke(linkedHashMap);
                        }
                    } else if (u1aVar != null) {
                        u1aVar.invoke(-1, "templates json is invalid");
                    }
                } else if (u1aVar != null) {
                    u1aVar.invoke(-1, "templates json is empty");
                }
            } else if (u1aVar != null) {
                u1aVar.invoke(-1, "result data is empty");
            }
        } else if (u1aVar != null) {
            u1aVar.invoke(t.b(), t.c());
        }
    }

    public final void k(String str, String str2, Map<String, String> map, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f63ef5c8", new Object[]{this, str, str2, map, mtopResponse});
            return;
        }
        if (XslModule.d().e().a() && sr3.c(XslModule.d())) {
            try {
                String b = g6p.b("http://mtop.taobao.com/" + ((Object) str) + wh6.DIR + ((Object) str2), "data", JSON.toJSONString(map));
                ckf.f(b, "appendQueryParameter(bas…SON.toJSONString(params))");
                XslModule.d().c().f(b, mtopResponse == null ? null : mtopResponse.getBytedata(), "plt-request", true);
            } catch (Exception unused) {
            }
        }
    }

    public final String l() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3c832fa2", new Object[]{this});
        }
        String c = mno.c(caa.c(), IrpMuiseModule.KEY_IRP_USER_DATA);
        if (TextUtils.isEmpty(c)) {
            return "";
        }
        if (!lg4.z0()) {
            ckf.f(c, "clientIrpUserParams");
            return c;
        }
        JSONArray parseArray = JSON.parseArray(c);
        if (parseArray == null || parseArray.isEmpty()) {
            return "";
        }
        long j = 1000;
        long currentTimeMillis = System.currentTimeMillis() / j;
        Iterator<Object> it = parseArray.iterator();
        ckf.f(it, "dataArrs.iterator()");
        while (it.hasNext()) {
            Object next = it.next();
            if (!(next instanceof JSONObject)) {
                it.remove();
            } else if (h19.h((JSONObject) next, "expirationTime", 0L) / j < currentTimeMillis) {
                it.remove();
            }
            z = true;
        }
        if (parseArray.isEmpty()) {
            mno.d(caa.c(), IrpMuiseModule.KEY_IRP_USER_DATA);
            return "";
        }
        String jSONString = JSON.toJSONString(parseArray);
        if (z) {
            mno.h(caa.c(), IrpMuiseModule.KEY_IRP_USER_DATA, jSONString);
        }
        ckf.f(jSONString, "newValue");
        return jSONString;
    }

    @JvmStatic
    public static final o4j s(String str, String str2, String str3, String str4, Map<String, String> map, boolean z) {
        o4j o4jVar;
        JSONObject f;
        Exception e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (o4j) ipChange.ipc$dispatch("65748bc8", new Object[]{str, str2, str3, str4, map, new Boolean(z)});
        }
        o4j o4jVar2 = new o4j(false, null, null, null, null, null, null, 127, null);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str5 = (str4 == null || TextUtils.isEmpty(str4)) ? "plt-search" : str4;
        yko g = j3p.g();
        if (g != null) {
            p80.p(g, map, str5, true);
        }
        if (z) {
            linkedHashMap.put("params", JSON.toJSONString(map));
        } else if (map != null) {
            linkedHashMap.putAll(map);
        }
        linkedHashMap.put("appId", str);
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setApiName(str2);
        mtopRequest.setVersion(str3);
        mtopRequest.setNeedEcode(false);
        mtopRequest.setData(JSON.toJSONString(linkedHashMap));
        MtopBusiness build = MtopBusiness.build(mtopRequest);
        build.reqMethod(MethodEnum.POST);
        build.supportStreamJson(true);
        try {
            MtopResponse syncRequest = build.syncRequest();
            o4jVar = o4jVar2;
            try {
                o4jVar.l(build.mtopProp.falcoId);
                o4jVar.k(syncRequest.getMtopStat());
                yko g2 = j3p.g();
                if (g2 != null) {
                    p80.d(g2, str5, mtopRequest, syncRequest, null);
                }
                o4jVar.h(INSTANCE.m(syncRequest));
                if (!tsq.x("SUCCESS", syncRequest.getRetCode(), true)) {
                    String retCode = syncRequest.getRetCode();
                    if (retCode != null) {
                        int hashCode = retCode.hashCode();
                        if (hashCode == -1943627322) {
                            if (!retCode.equals(q5j.TRAFFIC_LIMIT_STATUS)) {
                            }
                            o4jVar.i(-17);
                        } else if (hashCode != -1061395342) {
                            if (hashCode == 2065842216) {
                                if (!retCode.equals("FAIL_SYS_FLOW_CONTROL_ERROR")) {
                                }
                                o4jVar.i(-17);
                            }
                        } else if (retCode.equals("ANDROID_SYS_LOGIN_CANCEL")) {
                            o4jVar.i(-16);
                        }
                        o4jVar.j(syncRequest.getRetMsg());
                        o4jVar.n(false);
                    }
                    o4jVar.i(Integer.valueOf(syncRequest.getResponseCode()));
                    o4jVar.j(syncRequest.getRetMsg());
                    o4jVar.n(false);
                } else {
                    o4jVar.n(true);
                }
                o4jVar.m(syncRequest.getOriginFastJsonObject());
            } catch (Exception e2) {
                e = e2;
                o4jVar.i(-14);
                o4jVar.j("request exception");
                o4jVar.n(false);
                e.printStackTrace();
                f = o4jVar.f();
                if (f != null) {
                }
                o4jVar.n(false);
                return o4jVar;
            }
        } catch (Exception e3) {
            e = e3;
            o4jVar = o4jVar2;
        }
        f = o4jVar.f();
        if (f != null || f.isEmpty()) {
            o4jVar.n(false);
        }
        return o4jVar;
    }
}

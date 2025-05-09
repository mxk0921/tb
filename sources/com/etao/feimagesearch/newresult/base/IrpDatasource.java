package com.etao.feimagesearch.newresult.base;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.mnn.AutoDetectExtraInfoCache;
import com.etao.feimagesearch.model.IrpParamModel;
import com.etao.feimagesearch.model.PhotoFrom;
import com.etao.feimagesearch.util.PicParamUtils;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.taobao.wangxin.utils.WXConstantsOut;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlin.annotation.AnnotationRetention;
import kotlin.jvm.JvmStatic;
import tb.a07;
import tb.caa;
import tb.ckf;
import tb.e0;
import tb.fnf;
import tb.fxh;
import tb.iai;
import tb.lg4;
import tb.mh7;
import tb.nmf;
import tb.o7m;
import tb.pv8;
import tb.qrl;
import tb.qu3;
import tb.ri7;
import tb.smf;
import tb.t2o;
import tb.v3o;
import tb.wsq;
import tb.wxi;
import tb.xhv;
import tb.yf9;
import tb.yj4;
import tb.yr3;
import tb.zmf;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class IrpDatasource {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int TYPE_COMPATIBLE_SEARCH = 2;
    public static final int TYPE_INVALID = -1;
    public static final int TYPE_NO_PIC_SEARCH = 1;
    public static final int TYPE_PIC_SEARCH = 0;
    public volatile Uri b;
    public volatile int c;
    public Bitmap g;
    public Integer[] h;
    public boolean i;
    public List<RectF> j;
    public LinkedList<mh7> k;
    public Integer m;
    public Map<String, String> n;
    public nmf o;
    public String p;
    public Boolean q;
    public Rect r;
    public int s;
    public fnf t;
    public Boolean u;
    public Boolean v;
    public static final a Companion = new a(null);
    public static int w = -1;

    /* renamed from: a  reason: collision with root package name */
    public volatile PhotoFrom f4785a = PhotoFrom.Values.UNKNOWN;
    public volatile Map<String, String> d = new LinkedHashMap();
    public volatile Map<String, String> e = new LinkedHashMap();
    public volatile Map<String, String> f = new LinkedHashMap();
    public final List<zmf.a> l = new ArrayList();

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public @interface ImgSearchType {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(481297110);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        @JvmStatic
        public final IrpDatasource a(Uri uri, Bitmap bitmap, int i, PhotoFrom photoFrom, yr3 yr3Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (IrpDatasource) ipChange.ipc$dispatch("dfa46c74", new Object[]{this, uri, bitmap, new Integer(i), photoFrom, yr3Var});
            }
            ckf.g(uri, "imgUri");
            ckf.g(photoFrom, "photoFrom");
            ckf.g(yr3Var, "cameraPageModel");
            String shopId = yr3Var.getShopId();
            String sellerId = yr3Var.getSellerId();
            String pssource = yr3Var.getPssource();
            Map<String, String> extraParams = yr3Var.getExtraParams();
            v3o assignRequestConfig = yr3Var.getAssignRequestConfig();
            extraParams.put("component", assignRequestConfig == null ? null : assignRequestConfig.d());
            xhv xhvVar = xhv.INSTANCE;
            return k(uri, bitmap, i, photoFrom, shopId, sellerId, pssource, extraParams);
        }

        @JvmStatic
        public final IrpDatasource b(Bitmap bitmap, String str, IrpParamModel irpParamModel, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (IrpDatasource) ipChange.ipc$dispatch("8948c119", new Object[]{this, bitmap, str, irpParamModel, map});
            }
            ckf.g(bitmap, "sourceBitmap");
            ckf.g(irpParamModel, "irpParamModel");
            ckf.g(map, "extraParams");
            Map<String, String> extraParams = irpParamModel.getExtraParams();
            ckf.f(extraParams, "irpParamModel.extraParams");
            map.putAll(extraParams);
            PhotoFrom photoFrom = irpParamModel.getPhotoFrom();
            ckf.f(photoFrom, "irpParamModel.photoFrom");
            return i(bitmap, str, photoFrom, irpParamModel.getShopId(), irpParamModel.getSellerId(), irpParamModel.getPssource(), null, map, null);
        }

        @JvmStatic
        public final IrpDatasource e(Bitmap bitmap, PhotoFrom photoFrom, IrpParamModel irpParamModel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (IrpDatasource) ipChange.ipc$dispatch("cbb13bae", new Object[]{this, bitmap, photoFrom, irpParamModel});
            }
            ckf.g(bitmap, "sourceBitmap");
            ckf.g(photoFrom, "photoFrom");
            ckf.g(irpParamModel, "pageModel");
            return i(bitmap, null, photoFrom, irpParamModel.getShopId(), irpParamModel.getSellerId(), irpParamModel.getPssource(), null, irpParamModel.getExtraParams(), null);
        }

        public final int h() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("8cc9df93", new Object[]{this})).intValue();
            }
            return IrpDatasource.a();
        }

        public final IrpDatasource i(Bitmap bitmap, String str, PhotoFrom photoFrom, String str2, String str3, String str4, String str5, Map<String, String> map, Map<String, String> map2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (IrpDatasource) ipChange.ipc$dispatch("2c10b7ee", new Object[]{this, bitmap, str, photoFrom, str2, str3, str4, str5, map, map2});
            }
            IrpDatasource irpDatasource = new IrpDatasource();
            irpDatasource.s0(bitmap);
            if (!TextUtils.isEmpty(str)) {
                irpDatasource.u0(Uri.parse(str));
            }
            irpDatasource.n0(photoFrom);
            irpDatasource.r0(str2);
            irpDatasource.p0(str3);
            irpDatasource.l0(str4);
            if (map != null) {
                irpDatasource.A().putAll(map);
            }
            if (TextUtils.isEmpty(str5)) {
                irpDatasource.A().put(PicParamUtils.Companion.c(), PicParamUtils.CameraMode.unknown.name());
            } else {
                irpDatasource.A().put(PicParamUtils.Companion.c(), str5);
            }
            if (map2 != null && !map2.isEmpty()) {
                irpDatasource.m().putAll(map2);
            }
            irpDatasource.N();
            return irpDatasource;
        }

        public final IrpDatasource j(Bitmap bitmap, List<RectF> list, PhotoFrom photoFrom, String str, String str2, String str3, String str4, Map<String, String> map, Map<String, String> map2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (IrpDatasource) ipChange.ipc$dispatch("d53b7fd1", new Object[]{this, bitmap, list, photoFrom, str, str2, str3, str4, map, map2});
            }
            IrpDatasource irpDatasource = new IrpDatasource();
            irpDatasource.s0(bitmap);
            irpDatasource.f0(list);
            irpDatasource.n0(photoFrom);
            irpDatasource.r0(str);
            irpDatasource.p0(str2);
            irpDatasource.l0(str3);
            if (map != null) {
                irpDatasource.A().putAll(map);
            }
            if (TextUtils.isEmpty(str4)) {
                irpDatasource.A().put(PicParamUtils.Companion.c(), PicParamUtils.CameraMode.unknown.name());
            } else {
                irpDatasource.A().put(PicParamUtils.Companion.c(), str4);
            }
            if (map2 != null && !map2.isEmpty()) {
                irpDatasource.m().putAll(map2);
            }
            irpDatasource.N();
            return irpDatasource;
        }

        public final IrpDatasource k(Uri uri, Bitmap bitmap, int i, PhotoFrom photoFrom, String str, String str2, String str3, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (IrpDatasource) ipChange.ipc$dispatch("dfaf9d2", new Object[]{this, uri, bitmap, new Integer(i), photoFrom, str, str2, str3, map});
            }
            IrpDatasource irpDatasource = new IrpDatasource();
            irpDatasource.s0(bitmap);
            irpDatasource.u0(uri);
            irpDatasource.n0(photoFrom);
            irpDatasource.t0(i);
            irpDatasource.A().put("orientation", String.valueOf(i));
            irpDatasource.r0(str);
            irpDatasource.p0(str2);
            irpDatasource.l0(str3);
            if (map != null) {
                irpDatasource.A().putAll(map);
            }
            irpDatasource.N();
            return irpDatasource;
        }

        public final void l(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e80893d7", new Object[]{this, new Integer(i)});
            } else {
                IrpDatasource.b(i);
            }
        }

        public a() {
        }

        @JvmStatic
        public final IrpDatasource c(Bitmap bitmap, List<RectF> list, PhotoFrom photoFrom, yr3 yr3Var, Map<String, String> map, Map<String, String> map2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (IrpDatasource) ipChange.ipc$dispatch("34657fc3", new Object[]{this, bitmap, list, photoFrom, yr3Var, map, map2});
            }
            ckf.g(bitmap, "sourceBitmap");
            ckf.g(photoFrom, "photoFrom");
            ckf.g(yr3Var, "cameraPageModel");
            LinkedHashMap linkedHashMap = map == null ? new LinkedHashMap() : map;
            Map<String, String> extraParams = yr3Var.getExtraParams();
            ckf.f(extraParams, "cameraPageModel.extraParams");
            linkedHashMap.putAll(extraParams);
            IrpDatasource j = j(bitmap, list, photoFrom, yr3Var.getShopId(), yr3Var.getSellerId(), yr3Var.getPssource(), null, linkedHashMap, map2);
            j.m().put(qu3.KEY, linkedHashMap.get(qu3.KEY));
            return j;
        }

        @JvmStatic
        public final IrpDatasource d(Bitmap bitmap, String str, String str2, yr3 yr3Var, Map<String, String> map, Map<String, String> map2, PhotoFrom photoFrom) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (IrpDatasource) ipChange.ipc$dispatch("8b416371", new Object[]{this, bitmap, str, str2, yr3Var, map, map2, photoFrom});
            }
            ckf.g(bitmap, "sourceBitmap");
            ckf.g(yr3Var, "cameraPageModel");
            ckf.g(map, "extraParams");
            Map<String, String> extraParams = yr3Var.getExtraParams();
            ckf.f(extraParams, "cameraPageModel.extraParams");
            map.putAll(extraParams);
            return i(bitmap, str, photoFrom == null ? PhotoFrom.Values.TAKE : photoFrom, yr3Var.getShopId(), yr3Var.getSellerId(), yr3Var.getPssource(), str2, map, map2);
        }

        @JvmStatic
        public final IrpDatasource f(Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (IrpDatasource) ipChange.ipc$dispatch("43b24e18", new Object[]{this, map});
            }
            ckf.g(map, "intentParams");
            IrpDatasource irpDatasource = new IrpDatasource();
            irpDatasource.m0(map);
            String str = map.get("memoryCacheKey");
            if (TextUtils.isEmpty(str)) {
                str = map.get(wxi.KEY_PIC_URL);
            }
            if (!TextUtils.isEmpty(str)) {
                irpDatasource.u0(Uri.parse(str));
            }
            String str2 = map.get("imgRect");
            if (!TextUtils.isEmpty(str2)) {
                ckf.d(str2);
                List z0 = wsq.z0(str2, new String[]{","}, false, 0, 6, null);
                if (z0.size() == 4) {
                    Rect rect = new Rect((int) qrl.d((String) z0.get(0), 0.0f), (int) qrl.d((String) z0.get(1), 0.0f), (int) qrl.d((String) z0.get(2), 0.0f), (int) qrl.d((String) z0.get(3), 0.0f));
                    int h = caa.h(caa.c());
                    if (rect.right > h) {
                        rect.right = h;
                    }
                    int g = caa.g(caa.c());
                    if (rect.bottom > g) {
                        rect.bottom = g;
                    }
                    irpDatasource.o0(rect);
                }
            }
            irpDatasource.q0(qrl.g(map.get("sessionId"), SystemClock.elapsedRealtime()));
            PhotoFrom parseValue = PhotoFrom.Values.parseValue(map.get(wxi.KEY_PHOTO_FROM));
            ckf.f(parseValue, "parseValue(photoFromStr)");
            irpDatasource.n0(parseValue);
            if (irpDatasource.c0() && irpDatasource.A().containsKey("barcode")) {
                irpDatasource.A().put("barCode", irpDatasource.A().remove("barcode"));
            }
            irpDatasource.N();
            return irpDatasource;
        }

        @JvmStatic
        public final IrpDatasource g(smf smfVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (IrpDatasource) ipChange.ipc$dispatch("df960e9e", new Object[]{this, smfVar});
            }
            ckf.g(smfVar, "rebuildCache");
            IrpDatasource irpDatasource = new IrpDatasource();
            irpDatasource.m0(smfVar.h());
            irpDatasource.n0(smfVar.i());
            irpDatasource.u0(smfVar.l());
            irpDatasource.s0(smfVar.j());
            irpDatasource.t0(smfVar.k());
            irpDatasource.f0(smfVar.b());
            String str = smfVar.h().get("imgRect");
            if (!TextUtils.isEmpty(str)) {
                ckf.d(str);
                List z0 = wsq.z0(str, new String[]{","}, false, 0, 6, null);
                if (z0.size() == 4) {
                    Rect rect = new Rect((int) qrl.d((String) z0.get(0), 0.0f), (int) qrl.d((String) z0.get(1), 0.0f), (int) qrl.d((String) z0.get(2), 0.0f), (int) qrl.d((String) z0.get(3), 0.0f));
                    int h = caa.h(caa.c());
                    if (rect.right > h) {
                        rect.right = h;
                    }
                    int g = caa.g(caa.c());
                    if (rect.bottom > g) {
                        rect.bottom = g;
                    }
                    irpDatasource.o0(rect);
                }
            }
            irpDatasource.m().putAll(smfVar.c());
            irpDatasource.N();
            return irpDatasource;
        }
    }

    static {
        t2o.a(481297109);
    }

    public static final /* synthetic */ int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c2571112", new Object[0])).intValue();
        }
        return w;
    }

    public static final /* synthetic */ void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2deb4d0", new Object[]{new Integer(i)});
        } else {
            w = i;
        }
    }

    public final Map<String, String> A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("f10013f8", new Object[]{this});
        }
        return this.d;
    }

    public final PhotoFrom B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PhotoFrom) ipChange.ipc$dispatch("22177411", new Object[]{this});
        }
        return this.f4785a;
    }

    public final Rect C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("da66b2a5", new Object[]{this});
        }
        return this.r;
    }

    public final String D() {
        String f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2a78a878", new Object[]{this});
        }
        if (this.b == null) {
            return "";
        }
        Uri uri = this.b;
        ckf.d(uri);
        String scheme = uri.getScheme();
        if (TextUtils.isEmpty(scheme) || !ckf.b("content", scheme) || (f = yf9.f(caa.c(), this.b)) == null) {
            return "";
        }
        return f;
    }

    public final String F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("822c6289", new Object[]{this});
        }
        String str = this.d.get("sellerId");
        if (TextUtils.isEmpty(str)) {
            str = this.d.get("sellerid");
        }
        return str == null ? "" : str;
    }

    public final String G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3946bb2", new Object[]{this});
        }
        String str = this.d.get("shopId");
        if (TextUtils.isEmpty(str)) {
            str = this.d.get(WXConstantsOut.SHOPID);
        }
        return str == null ? "" : str;
    }

    public final Bitmap H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("709fd605", new Object[]{this});
        }
        return this.g;
    }

    public final Bitmap I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("8f7181a6", new Object[]{this});
        }
        return this.g;
    }

    public final int J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("14b458f8", new Object[]{this})).intValue();
        }
        return this.c;
    }

    public final Uri K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("24b0efd8", new Object[]{this});
        }
        return this.b;
    }

    public final boolean L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("61d54acc", new Object[]{this})).booleanValue();
        }
        return this.i;
    }

    public final boolean M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("63fdff17", new Object[]{this})).booleanValue();
        }
        List<RectF> list = this.j;
        if (list == null || list.size() <= 0) {
            return false;
        }
        return true;
    }

    public final void N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        f();
        O();
    }

    public final void O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56801b34", new Object[]{this});
        } else {
            k0(fnf.Companion.a(this));
        }
    }

    public final boolean P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("87a47374", new Object[]{this})).booleanValue();
        }
        if (this.s == 2) {
            return true;
        }
        return false;
    }

    public final boolean Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2e7a27b7", new Object[]{this})).booleanValue();
        }
        Boolean bool = this.u;
        if (bool == null) {
            if (c0()) {
                bool = Boolean.TRUE;
            } else {
                bool = Boolean.valueOf(lg4.j4(y()));
            }
            this.u = bool;
        }
        return bool.booleanValue();
    }

    public final boolean R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("69afd39c", new Object[]{this})).booleanValue();
        }
        if (this.f4785a == PhotoFrom.Values.FLOAT_BAR) {
            return true;
        }
        return false;
    }

    public final boolean S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3c91e6", new Object[]{this})).booleanValue();
        }
        if (this.f4785a == PhotoFrom.Values.ALBUM || this.f4785a == PhotoFrom.Values.ALBUM_SYS || this.f4785a == PhotoFrom.Values.OUTER_ALBUM_LOCAL || this.f4785a == PhotoFrom.Values.OUTER_ALBUM_RESULT) {
            return true;
        }
        return false;
    }

    public final boolean T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("af76ac3d", new Object[]{this})).booleanValue();
        }
        if (this.f4785a == PhotoFrom.Values.TAKE || this.f4785a == PhotoFrom.Values.HISTORY || this.f4785a == PhotoFrom.Values.ALBUM || this.f4785a == PhotoFrom.Values.ALBUM_SYS || this.f4785a == PhotoFrom.Values.AUTO_DETECT || this.f4785a == PhotoFrom.Values.OUTER_ALBUM_LOCAL || this.f4785a == PhotoFrom.Values.PRODUCT_CODE) {
            return true;
        }
        return false;
    }

    public final boolean U() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("babb728b", new Object[]{this})).booleanValue();
        }
        if (this.f4785a == PhotoFrom.Values.HISTORY || this.f4785a == PhotoFrom.Values.SSK_HISTORY) {
            return true;
        }
        return false;
    }

    public final boolean X() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ddc58408", new Object[]{this})).booleanValue();
        }
        if (this.f4785a == PhotoFrom.Values.TRANSLATE_TAKE || this.f4785a == PhotoFrom.Values.TRANSLATE_ALBUM || this.f4785a == PhotoFrom.Values.TRANSLATE_HISTORY) {
            return true;
        }
        return false;
    }

    public final boolean Y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d20a3bcf", new Object[]{this})).booleanValue();
        }
        Boolean bool = this.v;
        if (bool == null) {
            bool = Boolean.valueOf(lg4.U0());
        }
        this.v = bool;
        return bool.booleanValue();
    }

    public final boolean Z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d294c780", new Object[]{this})).booleanValue();
        }
        if (this.s == -1) {
            return true;
        }
        return false;
    }

    public final boolean a0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4bde3492", new Object[]{this})).booleanValue();
        }
        if (this.s == 1) {
            return true;
        }
        return false;
    }

    public final boolean b0() {
        Boolean bool;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("78a30695", new Object[]{this})).booleanValue();
        }
        Boolean bool2 = this.q;
        if (bool2 != null) {
            return bool2.booleanValue();
        }
        if (lg4.m4()) {
            bool = Boolean.valueOf(ckf.b(this.d.get("showPopup"), "true"));
        } else {
            bool = Boolean.FALSE;
        }
        this.q = bool;
        return bool.booleanValue();
    }

    public final void c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a72a0c", new Object[]{this, str, str2});
        } else if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            this.f.put(str, str2);
        }
    }

    public final boolean c0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("53b4366e", new Object[]{this})).booleanValue();
        }
        if (this.f4785a == PhotoFrom.Values.PRODUCT_CODE) {
            return true;
        }
        return false;
    }

    public final void d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23c8fab", new Object[]{this, str, str2});
        } else if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            this.e.put(str, str2);
        }
    }

    public final void d0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8fa6018", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            this.f.remove(str);
        }
    }

    public final Map<String, String> e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("fd797b46", new Object[]{this});
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        nmf o = o();
        String str = null;
        linkedHashMap.put("tfs", o == null ? null : o.w());
        nmf o2 = o();
        linkedHashMap.put("oss", o2 == null ? null : o2.j());
        nmf o3 = o();
        linkedHashMap.put("bboxes_str", o3 == null ? null : o3.b());
        nmf o4 = o();
        linkedHashMap.put("region", o4 == null ? null : o4.o());
        nmf o5 = o();
        linkedHashMap.put(yj4.PARAM_SEARCH_KEYWORD_RN, o5 == null ? null : o5.r());
        nmf o6 = o();
        linkedHashMap.put(HiAnalyticsConstant.HaKey.BI_KEY_APPID, o6 == null ? null : o6.a());
        nmf o7 = o();
        if (o7 != null) {
            str = o7.n();
        }
        linkedHashMap.put("reach_time", str);
        linkedHashMap.put("rainbow", e0.b());
        linkedHashMap.put("extra_info", z(AutoDetectExtraInfoCache.EXTRA_INFO_KEY));
        linkedHashMap.put(wxi.KEY_PHOTO_FROM, B().getValue());
        linkedHashMap.put("pssource", y());
        linkedHashMap.put("clientmnnType", z(qu3.KEY));
        linkedHashMap.put("bbox_change_raw", z("regionChanged"));
        linkedHashMap.put("deviceLevel", ri7.a());
        return linkedHashMap;
    }

    public final void e0(LinkedList<mh7> linkedList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1baf74c", new Object[]{this, linkedList});
        } else {
            this.k = linkedList;
        }
    }

    public final void f0(List<RectF> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8737c34", new Object[]{this, list});
        } else {
            this.j = list;
        }
    }

    public final LinkedList<mh7> g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinkedList) ipChange.ipc$dispatch("dc95a846", new Object[]{this});
        }
        return this.k;
    }

    public final void g0(Integer[] numArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8116cc65", new Object[]{this, numArr});
        } else {
            this.h = numArr;
        }
    }

    public final RectF h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RectF) ipChange.ipc$dispatch("94408d01", new Object[]{this});
        }
        String str = this.d.get("assignFirstBoxRegion");
        if (str == null) {
            str = "";
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        List z0 = wsq.z0(str, new String[]{","}, false, 0, 6, null);
        if (z0.size() != 4) {
            return null;
        }
        return new RectF(qrl.d((String) z0.get(0), 0.0f), qrl.d((String) z0.get(2), 0.0f), qrl.d((String) z0.get(1), 0.0f), qrl.d((String) z0.get(3), 0.0f));
    }

    public final void h0(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b88ed404", new Object[]{this, map});
        } else {
            this.n = map;
        }
    }

    public final float i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6cf3e648", new Object[]{this})).floatValue();
        }
        return qrl.d(this.d.get(wxi.KEY_DISTANCE), -1.0f);
    }

    public final void i0(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("539b89a3", new Object[]{this, num});
        } else {
            this.m = num;
        }
    }

    public final float j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ff093c26", new Object[]{this})).floatValue();
        }
        return qrl.d(this.d.get(wxi.KEY_RATIO), -1.0f);
    }

    public final void j0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b18a4255", new Object[]{this, str});
        } else {
            this.p = str;
        }
    }

    public final Map<String, String> k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("c5f3ca63", new Object[]{this});
        }
        return this.f;
    }

    public final void k0(fnf fnfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd0d59f", new Object[]{this, fnfVar});
            return;
        }
        ckf.g(fnfVar, "<set-?>");
        this.t = fnfVar;
    }

    public final List<RectF> l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("b2613698", new Object[]{this});
        }
        return this.j;
    }

    public final void l0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c11fcf1", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            this.d.put("pssource", str);
        }
    }

    public final Map<String, String> m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("3efbbbc2", new Object[]{this});
        }
        return this.e;
    }

    public final void m0(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70906a96", new Object[]{this, map});
            return;
        }
        ckf.g(map, "<set-?>");
        this.d = map;
    }

    public final Integer[] n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer[]) ipChange.ipc$dispatch("59499961", new Object[]{this});
        }
        return this.h;
    }

    public final void n0(PhotoFrom photoFrom) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ff88ba9", new Object[]{this, photoFrom});
            return;
        }
        ckf.g(photoFrom, "value");
        this.d.put(wxi.KEY_PHOTO_FROM, photoFrom.getValue());
        this.f4785a = photoFrom;
    }

    public final nmf o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nmf) ipChange.ipc$dispatch("cdf00b22", new Object[]{this});
        }
        return this.o;
    }

    public final void o0(Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49306d31", new Object[]{this, rect});
        } else {
            this.r = rect;
        }
    }

    public final String p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8f56893f", new Object[]{this});
        }
        Bitmap H = H();
        if (H == null) {
            return "";
        }
        return "0," + H.getWidth() + ",0," + H.getHeight();
    }

    public final void p0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e3d490d", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            this.d.put("sellerId", str);
        }
    }

    public final List<zmf.a> q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("3fe3cec6", new Object[]{this});
        }
        return this.l;
    }

    public final void q0(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fdec46e", new Object[]{this, new Long(j)});
        }
    }

    public final zmf.a r(RectF rectF) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zmf.a) ipChange.ipc$dispatch("4b158561", new Object[]{this, rectF});
        }
        if (rectF == null || ((ArrayList) this.l).isEmpty()) {
            return null;
        }
        Iterator it = ((ArrayList) this.l).iterator();
        while (it.hasNext()) {
            zmf.a aVar = (zmf.a) it.next();
            RectF rectF2 = aVar.d;
            if (rectF2 != null && ckf.b(rectF2, rectF)) {
                return aVar;
            }
        }
        return null;
    }

    public final void r0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea2f804", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            this.d.put("shopId", str);
        }
    }

    public final Map<String, String> s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("df061062", new Object[]{this});
        }
        return this.n;
    }

    public final void s0(Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb2d0b72", new Object[]{this, bitmap});
        } else {
            this.g = bitmap;
        }
    }

    public final Integer t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("ff374f6f", new Object[]{this});
        }
        return this.m;
    }

    public final void t0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cba39312", new Object[]{this, new Integer(i)});
        } else {
            this.c = i;
        }
    }

    public final int u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b7b12269", new Object[]{this})).intValue();
        }
        return this.s;
    }

    public final void u0(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d51e73a", new Object[]{this, uri});
        } else {
            this.b = uri;
        }
    }

    public final String v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8368eda9", new Object[]{this});
        }
        return this.p;
    }

    public final void v0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b46acd80", new Object[]{this, new Boolean(z)});
        } else {
            this.i = z;
        }
    }

    public final fnf w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fnf) ipChange.ipc$dispatch("5a983a5f", new Object[]{this});
        }
        fnf fnfVar = this.t;
        if (fnfVar != null) {
            return fnfVar;
        }
        ckf.y("irpUIConfig");
        throw null;
    }

    public final void w0(nmf nmfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2aabbccb", new Object[]{this, nmfVar});
            return;
        }
        this.o = nmfVar;
        if (nmfVar != null) {
            if (!TextUtils.isEmpty(nmfVar.m())) {
                this.d.put("pltSession", nmfVar.m());
            }
            if (this.b == null) {
                this.b = Uri.parse(nmfVar.t());
            }
            if (!lg4.h() && !nmfVar.e().isEmpty()) {
                int d = iai.d(fxh.a(357.0f));
                for (String str : nmfVar.e()) {
                    o7m.a(str, d, d, 1.0f);
                }
            }
        }
    }

    public final int[] x() {
        Bitmap H;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("e08b351e", new Object[]{this});
        }
        int[] iArr = new int[2];
        Integer[] numArr = this.h;
        if (numArr != null) {
            ckf.d(numArr);
            if (numArr.length >= 2) {
                Integer[] numArr2 = this.h;
                ckf.d(numArr2);
                iArr[0] = numArr2[0].intValue();
                Integer[] numArr3 = this.h;
                ckf.d(numArr3);
                iArr[1] = numArr3[1].intValue();
            }
        }
        if ((iArr[0] == 0 || iArr[1] == 0) && (H = H()) != null) {
            iArr[0] = H.getWidth();
            iArr[1] = H.getHeight();
        }
        return iArr;
    }

    public final void x0(List<zmf.a> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e088b7f", new Object[]{this, list});
            return;
        }
        ((ArrayList) this.l).clear();
        List<zmf.a> list2 = list;
        if (!(list2 == null || list2.isEmpty())) {
            for (zmf.a aVar : list) {
                if (!(aVar == null || aVar.f32866a == null || aVar.b == null)) {
                    ((ArrayList) this.l).add(aVar);
                }
            }
        }
    }

    public final String y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d6bfa225", new Object[]{this});
        }
        return this.d.get("pssource");
    }

    public final String z(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fbf0db78", new Object[]{this, str});
        }
        if (str != null && !TextUtils.isEmpty(str)) {
            return this.d.get(str);
        }
        return null;
    }

    public final int E() {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b4bb60f7", new Object[]{this})).intValue();
        }
        LinkedList<mh7> linkedList = this.k;
        if (linkedList == null) {
            return 0;
        }
        Iterator<mh7> it = linkedList.iterator();
        while (it.hasNext()) {
            if (ckf.b(it.next().b, pv8.REGION_SEARCH)) {
                i++;
            }
        }
        return i;
    }

    public final boolean V() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4b9a58e5", new Object[]{this})).booleanValue();
        }
        if (this.b == null || TextUtils.isEmpty(String.valueOf(this.b))) {
            return false;
        }
        try {
            Uri uri = this.b;
            ckf.d(uri);
            String scheme = uri.getScheme();
            if (scheme == null) {
                scheme = "";
            }
            if (!ckf.b("http", scheme)) {
                if (!ckf.b("https", scheme)) {
                    return false;
                }
            }
        } catch (Exception unused) {
        }
        return true;
    }

    public final boolean W() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8ad14013", new Object[]{this})).booleanValue();
        }
        String y = y();
        return ckf.b(y, "zszxs") || ckf.b(y, "zszxs_feedback") || ckf.b(y, "zszxs_more");
    }

    public final void f() {
        int i = 0;
        int i2 = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8747590d", new Object[]{this});
        } else if (!c0()) {
            String y = y();
            if (this.b != null) {
                String[] q2 = lg4.q2();
                ckf.f(q2, "compatibleModePSSourceKeys");
                int length = q2.length;
                while (i < length) {
                    String str = q2[i];
                    i++;
                    if (ckf.b(y, str)) {
                        this.s = 2;
                        return;
                    }
                }
                return;
            }
            String[] z2 = lg4.z2();
            ckf.f(z2, "sourceValidKeys");
            int length2 = z2.length;
            int i3 = 0;
            while (i3 < length2) {
                String str2 = z2[i3];
                i3++;
                if (ckf.b(y(), str2)) {
                    this.s = 1;
                    return;
                }
            }
            String[] A2 = lg4.A2();
            ckf.f(A2, "picValidKeys");
            int length3 = A2.length;
            int i4 = 0;
            while (i4 < length3) {
                String str3 = A2[i4];
                i4++;
                if (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(this.d.get(str3))) {
                    this.s = 0;
                    return;
                }
            }
            if (!lg4.l4()) {
                this.s = -1;
                return;
            }
            String[] y2 = lg4.y2();
            ckf.f(y2, "noPicValidKeys");
            if (y2.length == 0) {
                if (!lg4.k4()) {
                    i2 = -1;
                }
                this.s = i2;
                return;
            }
            int length4 = y2.length;
            while (true) {
                if (i < length4) {
                    String str4 = y2[i];
                    i++;
                    if (!TextUtils.isEmpty(str4) && !TextUtils.isEmpty(this.d.get(str4))) {
                        break;
                    }
                } else if (!lg4.k4()) {
                    i2 = -1;
                }
            }
            this.s = i2;
        }
    }
}

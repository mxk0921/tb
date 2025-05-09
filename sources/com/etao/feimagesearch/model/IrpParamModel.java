package com.etao.feimagesearch.model;

import android.content.Context;
import android.content.Intent;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.config.bean.ImageRule;
import com.etao.feimagesearch.model.PhotoFrom;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;
import java.util.Map;
import tb.agh;
import tb.caa;
import tb.fk0;
import tb.fya;
import tb.jiv;
import tb.lg4;
import tb.n4p;
import tb.t2o;
import tb.trl;
import tb.wxi;
import tb.yr3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class IrpParamModel extends jiv {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int TYPE_INVALID = -1;
    public static final int TYPE_NO_PIC_SEARCH = 1;
    public static final int TYPE_PIC_SEARCH = 0;
    public static Class sActivityClass;
    public static String sActivityUrl = "http://h5.m.taobao.com/tusou/image_editor/index.html";
    public Uri h;
    public String k;
    public String l;
    public boolean m;
    public String p;
    public IrpPageConfig q;
    public long u;
    public int i = 0;
    public boolean j = false;
    public PhotoFrom n = PhotoFrom.Values.UNKNOWN;
    public int o = 0;
    public final Map<String, String> r = new HashMap();
    public final Map<String, String> s = new HashMap();
    public final Map<String, String> t = new HashMap();
    public double v = -1.0d;
    public double w = -1.0d;
    public int x = 0;
    public Boolean y = null;

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public @interface ImgSearchType {
    }

    public IrpParamModel(jiv jivVar) {
        super(jivVar);
    }

    public static double a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("43fb87e3", new Object[]{str})).doubleValue();
        }
        try {
            return Double.parseDouble(str);
        } catch (Exception unused) {
            return -1.0d;
        }
    }

    public static ImageRule getImageRule(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageRule) ipChange.ipc$dispatch("a358deef", new Object[]{context});
        }
        ImageRule imageRule = new ImageRule();
        if (context == null) {
            return imageRule;
        }
        if (caa.u()) {
            return lg4.p2(ImageRule.NET_TYPE_WIFI);
        }
        int a2 = n4p.a();
        if (a2 == 1) {
            return lg4.p2(ImageRule.NET_TYPE_WIFI);
        }
        if (a2 == 2) {
            return lg4.p2(ImageRule.NET_TYPE_2G);
        }
        if (a2 == 3) {
            return lg4.p2(ImageRule.NET_TYPE_3G);
        }
        if (a2 != 4) {
            return lg4.p2(ImageRule.NET_TYPE_OTHER);
        }
        return lg4.p2(ImageRule.NET_TYPE_4G);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0062 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0063 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String getItemidFromUrl(java.lang.String r4) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.etao.feimagesearch.model.IrpParamModel.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x0015
            java.lang.String r1 = "e75548ae"
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r4
            java.lang.Object r4 = r0.ipc$dispatch(r1, r2)
            java.lang.String r4 = (java.lang.String) r4
            return r4
        L_0x0015:
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            java.lang.String r1 = ""
            if (r0 == 0) goto L_0x001e
            return r1
        L_0x001e:
            java.lang.String r0 = "://a.m.taobao.com/i"
            int r0 = r4.lastIndexOf(r0)
            if (r0 <= 0) goto L_0x003a
            r2 = 8
            if (r0 > r2) goto L_0x003a
            java.lang.String r2 = ".htm?"
            int r2 = r4.lastIndexOf(r2)
            r3 = 19
            if (r2 <= r3) goto L_0x004d
            int r3 = r3 + r0
            java.lang.String r4 = r4.substring(r3, r2)
            goto L_0x005c
        L_0x003a:
            java.lang.String r0 = "http://item.taobao.com/item.htm"
            boolean r0 = r4.startsWith(r0)
            if (r0 != 0) goto L_0x004f
            java.lang.String r0 = "https://item.taobao.com/item.htm"
            boolean r0 = r4.startsWith(r0)
            if (r0 == 0) goto L_0x004d
            goto L_0x004f
        L_0x004d:
            r4 = r1
            goto L_0x005c
        L_0x004f:
            java.util.Map r4 = tb.old.a(r4)
            java.lang.String r0 = "id"
            java.lang.Object r4 = r4.get(r0)
            java.lang.String r4 = (java.lang.String) r4
        L_0x005c:
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 == 0) goto L_0x0063
            return r1
        L_0x0063:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etao.feimagesearch.model.IrpParamModel.getItemidFromUrl(java.lang.String):java.lang.String");
    }

    public static int getMaxSize(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("38b5025", new Object[]{context})).intValue();
        }
        if (context == null) {
            return 640;
        }
        return getImageRule(context.getApplicationContext()).maxSize;
    }

    public static int getQuality(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("39b6a0eb", new Object[]{context})).intValue();
        }
        if (context == null) {
            return ImageRule.QUALITY_OTHER;
        }
        return getImageRule(context).quality;
    }

    public static /* synthetic */ Object ipc$super(IrpParamModel irpParamModel, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/model/IrpParamModel");
    }

    public static IrpParamModel parseFromIntent(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IrpParamModel) ipChange.ipc$dispatch("6dc0269a", new Object[]{intent});
        }
        IrpParamModel irpParamModel = new IrpParamModel();
        if (intent == null) {
            return irpParamModel;
        }
        if (d(intent, irpParamModel)) {
            return irpParamModel;
        }
        if (c(intent, irpParamModel)) {
            return irpParamModel;
        }
        b(intent, irpParamModel);
        return irpParamModel;
    }

    public void addExtraParam(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f4e9f9", new Object[]{this, str, str2});
        } else {
            this.r.put(str, str2);
        }
    }

    public void addExtraParams(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bfe0e7a9", new Object[]{this, map});
        } else {
            this.r.putAll(map);
        }
    }

    public void addJsExtraParam(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d37dd2e2", new Object[]{this, str, str2});
        } else {
            this.s.put(str, str2);
        }
    }

    public void addJsExtraParams(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76ae9f12", new Object[]{this, map});
        } else {
            this.s.putAll(map);
        }
    }

    public void addTkExtraParam(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("819aec90", new Object[]{this, str, str2});
        } else {
            this.t.put(str, str2);
        }
    }

    public void checkIsFromOuterTraffic() {
        String[] A2;
        int i = 0;
        int i2 = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c01c7c5", new Object[]{this});
            return;
        }
        for (String str : lg4.z2()) {
            if (getPssource().equals(str)) {
                this.x = 1;
                return;
            }
        }
        if (!isProductCoe()) {
            if (this.h != null) {
                this.x = 0;
                return;
            }
            for (String str2 : lg4.A2()) {
                if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty((String) ((HashMap) this.r).get(str2))) {
                    this.x = 0;
                    return;
                }
            }
            if (!lg4.l4()) {
                this.x = -1;
                return;
            }
            String[] y2 = lg4.y2();
            if (y2.length <= 0) {
                if (!lg4.k4()) {
                    i2 = -1;
                }
                this.x = i2;
                return;
            }
            int length = y2.length;
            while (true) {
                if (i < length) {
                    String str3 = y2[i];
                    if (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty((String) ((HashMap) this.r).get(str3))) {
                        break;
                    }
                    i++;
                } else if (!lg4.k4()) {
                    i2 = -1;
                }
            }
            this.x = i2;
        }
    }

    public void clearExtraParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e61e530", new Object[]{this});
        } else {
            this.r.clear();
        }
    }

    public void clearJsExtraParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b4983e7", new Object[]{this});
        } else {
            this.s.clear();
        }
    }

    public double getDistance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("25f8a060", new Object[]{this})).doubleValue();
        }
        return this.w;
    }

    public String getExtraParam(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7443107c", new Object[]{this, str});
        }
        Map<String, String> map = this.r;
        if (map != null) {
            str2 = map.get(str);
        } else {
            str2 = null;
        }
        if (str2 != null) {
            return str2;
        }
        Map<String, String> map2 = this.s;
        if (map2 != null) {
            return map2.get(str);
        }
        return str2;
    }

    public String getExtraParamValue(String str) {
        Map<String, String> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4cf5e991", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str) || (map = this.r) == null || map.isEmpty()) {
            return "";
        }
        return this.r.get(str);
    }

    public Map<String, String> getExtraParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("8093f2fc", new Object[]{this});
        }
        return this.r;
    }

    public String getIntelliHint() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("90fc04b5", new Object[]{this});
        }
        return this.k;
    }

    public long getIrpPageStartTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f1505bca", new Object[]{this})).longValue();
        }
        return this.u;
    }

    public Map<String, String> getJsExtraParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("73b27bb3", new Object[]{this});
        }
        return this.s;
    }

    public int getOrientation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ad9ae414", new Object[]{this})).intValue();
        }
        return this.i;
    }

    public IrpPageConfig getPageConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IrpPageConfig) ipChange.ipc$dispatch("49ee4694", new Object[]{this});
        }
        return this.q;
    }

    public PhotoFrom getPhotoFrom() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PhotoFrom) ipChange.ipc$dispatch("22177411", new Object[]{this});
        }
        return this.n;
    }

    public int getPhotoSource() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a172bcb1", new Object[]{this})).intValue();
        }
        return this.o;
    }

    public Uri getPicUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("c19c2eb9", new Object[]{this});
        }
        return this.h;
    }

    public double getRatio() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("13ea484a", new Object[]{this})).doubleValue();
        }
        return this.v;
    }

    public String getRegion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3c01b4f", new Object[]{this});
        }
        return this.l;
    }

    public RectF getRegionRectF() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RectF) ipChange.ipc$dispatch("e93e32e8", new Object[]{this});
        }
        if (TextUtils.isEmpty(this.l)) {
            return null;
        }
        String[] split = this.l.split(",");
        return new RectF(Float.valueOf(split[0]).floatValue(), Float.valueOf(split[2]).floatValue(), Float.valueOf(split[1]).floatValue(), Float.valueOf(split[3]).floatValue());
    }

    public String getResolvedUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2a78a878", new Object[]{this});
        }
        String str = this.p;
        if (str != null) {
            return str;
        }
        Uri uri = this.h;
        if (uri == null) {
            return "";
        }
        return uri.toString();
    }

    public Map<String, String> getTkExtraParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("3f64f145", new Object[]{this});
        }
        return this.t;
    }

    public boolean isFromOuterApp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1d690745", new Object[]{this})).booleanValue();
        }
        return this.m;
    }

    public boolean isIntelliDetect() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c4252d7", new Object[]{this})).booleanValue();
        }
        return this.j;
    }

    public boolean isInvalidSearch() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d294c780", new Object[]{this})).booleanValue();
        }
        if (this.x == -1) {
            return true;
        }
        return false;
    }

    public boolean isIrpLoadingOptimize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e84ea27", new Object[]{this})).booleanValue();
        }
        if (this.y == null) {
            this.y = Boolean.valueOf(lg4.j4(getPssource()));
        }
        return this.y.booleanValue();
    }

    public boolean isNoPicSearch() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4bde3492", new Object[]{this})).booleanValue();
        }
        if (this.x == 1) {
            return true;
        }
        return false;
    }

    public boolean isProductCoe() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d6c9595f", new Object[]{this})).booleanValue();
        }
        if (this.n == PhotoFrom.Values.PRODUCT_CODE) {
            return true;
        }
        return false;
    }

    @Override // tb.jiv
    public Intent onCreateBaseIntent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("4096d0c4", new Object[]{this});
        }
        return new Intent(caa.c(), sActivityClass);
    }

    @Override // tb.jiv
    public Uri onCreateBaseUri() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("b637605e", new Object[]{this});
        }
        return Uri.parse(sActivityUrl);
    }

    @Override // tb.jiv
    public void onInsertParams(Uri.Builder builder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0e7550b", new Object[]{this, builder});
            return;
        }
        if (getPicUrl() != null) {
            builder.appendQueryParameter(wxi.KEY_PIC_URL, getPicUrl().toString());
        }
        builder.appendQueryParameter(wxi.KEY_PHOTO_FROM, getPhotoFrom().getValue());
        builder.appendQueryParameter("preload", String.valueOf(getPreloadKey()));
        IrpPageConfig irpPageConfig = this.q;
        if (irpPageConfig != null) {
            builder.appendQueryParameter(wxi.KEY_IRP_PAGE_CONFIG, irpPageConfig.toJsonString());
        }
        builder.appendQueryParameter("orientation", Integer.toString(this.i));
        builder.appendQueryParameter(wxi.KEY_IRP_INTELLI, String.valueOf(isIntelliDetect()));
        builder.appendQueryParameter(wxi.KEY_RATIO, String.valueOf(this.v));
        builder.appendQueryParameter(wxi.KEY_DISTANCE, String.valueOf(this.w));
        String intelliHint = getIntelliHint();
        if (!TextUtils.isEmpty(intelliHint)) {
            builder.appendQueryParameter(wxi.KEY_IRP_INTELLI_HINT, intelliHint);
        }
        Map<String, String> map = this.r;
        if (map != null) {
            for (Map.Entry entry : ((HashMap) map).entrySet()) {
                builder.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
            }
        }
        if (!TextUtils.isEmpty(getSellerId())) {
            builder.appendQueryParameter("sellerId", getSellerId());
        }
        if (!TextUtils.isEmpty(getShopId())) {
            builder.appendQueryParameter("shopId", getShopId());
        }
        Map<String, String> map2 = this.s;
        if (map2 != null && !((HashMap) map2).isEmpty()) {
            builder.appendQueryParameter(wxi.KEY_IRP_JS_EXTRA, JSON.toJSONString(this.s));
        }
        builder.appendQueryParameter("source", String.valueOf(this.o));
        builder.appendQueryParameter(wxi.KEY_FROM_OUTER_APP, String.valueOf(this.m));
        builder.appendQueryParameter("sessionId", String.valueOf(getSessionId()));
    }

    public void setDistance(double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2bf23480", new Object[]{this, new Double(d)});
        } else {
            this.w = d;
        }
    }

    public void setFromOuterApp(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b543b7b", new Object[]{this, new Boolean(z)});
        } else {
            this.m = z;
        }
    }

    public void setIntelliDetect(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e20b99", new Object[]{this, new Boolean(z)});
        } else {
            this.j = z;
        }
    }

    public void setIntelliHint(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a63bc0c9", new Object[]{this, str});
        } else {
            this.k = str;
        }
    }

    public void setIrpPageStartTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ce4822", new Object[]{this, new Long(j)});
        } else {
            this.u = j;
        }
    }

    public void setOrientation(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9bea80e", new Object[]{this, new Integer(i)});
        } else {
            this.i = i;
        }
    }

    public void setPageConfig(IrpPageConfig irpPageConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9689226", new Object[]{this, irpPageConfig});
        } else {
            this.q = irpPageConfig;
        }
    }

    public void setPhotoFrom(PhotoFrom photoFrom) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ff88ba9", new Object[]{this, photoFrom});
        } else {
            this.n = photoFrom;
        }
    }

    public void setPhotoSource(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30e1e311", new Object[]{this, new Integer(i)});
        } else {
            this.o = i;
        }
    }

    public void setPicUrl(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2efeb79", new Object[]{this, uri});
        } else {
            this.h = uri;
        }
    }

    public void setRatio(double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9783716e", new Object[]{this, new Double(d)});
        } else {
            this.v = d;
        }
    }

    public void setRegion(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13ed3c07", new Object[]{this, str});
        } else {
            this.l = str;
        }
    }

    public void setResolvedUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c539566", new Object[]{this, str});
        } else {
            this.p = str;
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "IrpParamModel{mPicUrl='" + this.h.toString() + "', mOrientation=" + this.i + ", mIntelliDetect=" + this.j + ", mIntelliHint='" + this.k + "', mPhotoFrom=" + this.n + ", mPageConfig=" + this.q + ", mExtraParams=" + this.r + ", mJsExtraParams=" + this.s + '}';
    }

    public void updateSessionId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e253780f", new Object[]{this});
        } else {
            this.mSessionId = SystemClock.elapsedRealtime();
        }
    }

    public static void b(Intent intent, IrpParamModel irpParamModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3909031", new Object[]{intent, irpParamModel});
            return;
        }
        Uri data = intent.getData();
        if (data != null) {
            irpParamModel.parseUniversalPrams(data);
            for (String str : data.getQueryParameterNames()) {
                if (!wxi.isLocalKey(str)) {
                    irpParamModel.addExtraParam(str, data.getQueryParameter(str));
                }
            }
            String queryParameter = data.getQueryParameter("region");
            if (!TextUtils.isEmpty(queryParameter)) {
                irpParamModel.setRegion(queryParameter);
            }
            String queryParameter2 = data.getQueryParameter("shopId");
            if (!TextUtils.isEmpty(queryParameter2)) {
                irpParamModel.setShopId(queryParameter2);
            }
            String queryParameter3 = data.getQueryParameter("sellerId");
            if (TextUtils.isEmpty(queryParameter3)) {
                queryParameter3 = data.getQueryParameter("seller_id");
            }
            if (TextUtils.isEmpty(queryParameter3)) {
                queryParameter3 = data.getQueryParameter("sellerid");
            }
            irpParamModel.setSellerId(queryParameter3);
            String queryParameter4 = data.getQueryParameter(wxi.KEY_PIC_URL);
            if (!TextUtils.isEmpty(queryParameter4)) {
                irpParamModel.setPicUrl(Uri.parse(queryParameter4));
            }
            irpParamModel.setOrientation(trl.c(data.getQueryParameter("orientation"), 0));
            irpParamModel.setPhotoFrom(PhotoFrom.Values.parseValue(data.getQueryParameter(wxi.KEY_PHOTO_FROM)));
            String queryParameter5 = data.getQueryParameter(wxi.KEY_IRP_PAGE_CONFIG);
            if (!TextUtils.isEmpty(queryParameter5)) {
                irpParamModel.setPageConfig(IrpPageConfig.createFromJson(queryParameter5));
            }
            irpParamModel.setIntelliDetect(data.getBooleanQueryParameter(wxi.KEY_IRP_INTELLI, false));
            irpParamModel.setIntelliHint(data.getQueryParameter(wxi.KEY_IRP_INTELLI_HINT));
            String queryParameter6 = data.getQueryParameter("preload");
            if (queryParameter6 != null) {
                try {
                    irpParamModel.setPreloadKey(Long.parseLong(queryParameter6));
                } catch (Exception unused) {
                }
            }
            String queryParameter7 = data.getQueryParameter(wxi.KEY_IRP_JS_EXTRA);
            if (!TextUtils.isEmpty(queryParameter7)) {
                try {
                    for (Map.Entry<String, Object> entry : JSON.parseObject(queryParameter7).entrySet()) {
                        Object value = entry.getValue();
                        if (value instanceof String) {
                            irpParamModel.addJsExtraParam(entry.getKey(), (String) value);
                        }
                    }
                } catch (Exception e) {
                    agh.d("IrpParamModel", "js extra param parse error", e);
                }
            }
            irpParamModel.setFromOuterApp(data.getBooleanQueryParameter(wxi.KEY_FROM_OUTER_APP, false));
            irpParamModel.setRatio(a(data.getQueryParameter(wxi.KEY_RATIO)));
            irpParamModel.setDistance(a(data.getQueryParameter(wxi.KEY_DISTANCE)));
        }
    }

    public static boolean c(Intent intent, IrpParamModel irpParamModel) {
        Bundle bundle;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ed3dbb4a", new Object[]{intent, irpParamModel})).booleanValue();
        }
        Bundle extras = intent.getExtras();
        if (extras == null || (bundle = extras.getBundle(wxi.EXTRA_KEY_BUNDLE_PARAM)) == null) {
            return false;
        }
        String string = bundle.getString(wxi.EXTRA_KEY_PIC_URI);
        irpParamModel.setPssource(bundle.getString("pssource"));
        irpParamModel.setPicUrl(Uri.parse(string));
        String string2 = bundle.getString("source");
        if (!TextUtils.isEmpty(string2)) {
            irpParamModel.setPhotoSource(Integer.parseInt(string2));
        } else {
            irpParamModel.setPhotoSource(0);
        }
        String string3 = bundle.getString(wxi.KEY_PHOTO_FROM);
        if (!TextUtils.isEmpty(string3)) {
            irpParamModel.setPhotoFrom(PhotoFrom.Values.parseValue(string3));
        } else {
            irpParamModel.setPhotoFrom(PhotoFrom.Values.PREVIEW);
        }
        return true;
    }

    public static boolean d(Intent intent, IrpParamModel irpParamModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5ee23c3", new Object[]{intent, irpParamModel})).booleanValue();
        }
        Bundle extras = intent.getExtras();
        if (extras == null) {
            return false;
        }
        Parcelable parcelable = extras.getParcelable("android.intent.extra.STREAM");
        if (!(parcelable instanceof Uri)) {
            return false;
        }
        String obj = parcelable.toString();
        irpParamModel.setPssource(wxi.PSSOURCE_SYSTEM_ALBUM);
        irpParamModel.setPicUrl(Uri.parse(obj));
        irpParamModel.setPhotoFrom(PhotoFrom.Values.SYSTEM_ALBUM);
        return true;
    }

    public boolean isLocalPathImage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b6bf26e0", new Object[]{this})).booleanValue();
        }
        Uri uri = this.h;
        if (uri != null && !TextUtils.isEmpty(uri.toString())) {
            try {
                String scheme = this.h.getScheme();
                if (!"http".equals(scheme) && !"https".equals(scheme)) {
                    if (!"content".equals(scheme)) {
                        if (!"file".equals(scheme)) {
                            return false;
                        }
                    }
                    return true;
                }
                return false;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    public boolean isRemotePic() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7d679ce5", new Object[]{this})).booleanValue();
        }
        Uri uri = this.h;
        if (uri == null || TextUtils.isEmpty(uri.toString())) {
            return false;
        }
        try {
            String scheme = this.h.getScheme();
            if (!"http".equals(scheme)) {
                if (!"https".equals(scheme)) {
                    return false;
                }
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return true;
        }
    }

    public boolean isTkExtension() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e0a07589", new Object[]{this})).booleanValue();
        }
        Map<String, String> map = this.r;
        return map != null && TextUtils.equals(map.get("tkExtension"), "true");
    }

    static {
        t2o.a(481297095);
    }

    public IrpParamModel(fya fyaVar) {
        super(fyaVar);
        addExtraParams(fyaVar.getExtraParams());
    }

    public IrpParamModel(yr3 yr3Var) {
        super(yr3Var);
        addExtraParams(yr3Var.getExtraParams());
    }

    public IrpParamModel(fk0 fk0Var) {
        super(fk0Var);
        addExtraParams(fk0Var.getExtraParams());
    }

    public IrpParamModel(String str) {
        setPssource(str);
    }

    public IrpParamModel() {
    }
}

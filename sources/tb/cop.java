package tb;

import android.content.ContentValues;
import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.Uri;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import android.util.LruCache;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.shop.activity.ShopRenderActivity;
import com.taobao.tao.shop.common.ShopConstants;
import com.taobao.tao.shop.fetcher.TBSRCacheData;
import com.taobao.tao.shop.rule.mtop.MtopTaobaoWirelessShopRouteProcessResponseData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class cop extends SQLiteOpenHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile cop f;

    /* renamed from: a  reason: collision with root package name */
    public SQLiteDatabase f17206a;
    public int b = 0;
    public final ReentrantLock c = new ReentrantLock();
    public static final String[] d = {"currentClickTime", h1p.LIST_TYPE_KEY, h1p.LIST_PARAM_KEY, "epid", "clickid", "ad_type", "spm", "spm-url", "spm-pre", "item_id", "pre_item_id", ShopRenderActivity.SHOP_NAVI, djh.SOURCE_TYPE_KEY};
    public static final String[] e = {"currentClickTime", h1p.LIST_TYPE_KEY, h1p.LIST_PARAM_KEY, "epid", "clickid", "ad_type", "spm", "spm-url", "spm-pre", "item_id", "pre_item_id", djh.SOURCE_TYPE_KEY};
    public static final LruCache<String, d> g = new LruCache<>(100);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f17207a;
        public final /* synthetic */ String b;
        public final /* synthetic */ MtopTaobaoWirelessShopRouteProcessResponseData c;
        public final /* synthetic */ long d;

        public a(String str, String str2, MtopTaobaoWirelessShopRouteProcessResponseData mtopTaobaoWirelessShopRouteProcessResponseData, long j) {
            this.f17207a = str;
            this.b = str2;
            this.c = mtopTaobaoWirelessShopRouteProcessResponseData;
            this.d = j;
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x00c7, code lost:
            if (r5.isOpen() == false) goto L_?;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x00c9, code lost:
            tb.cop.g(r14.e);
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x00ce, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:?, code lost:
            return;
         */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() {
            /*
                Method dump skipped, instructions count: 267
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: tb.cop.a.run():void");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final String f17208a;
        public final String b;

        static {
            t2o.a(668991602);
        }

        public b(String str, String str2) {
            this.f17208a = str;
            this.b = str2;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final String f17209a;
        public final Map<String, Integer> b;

        static {
            t2o.a(668991603);
        }

        public c(String str, Map<String, Integer> map) {
            this.f17209a = str;
            this.b = map;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public final MtopTaobaoWirelessShopRouteProcessResponseData f17210a;
        public final long b;

        static {
            t2o.a(668991604);
        }

        public d(MtopTaobaoWirelessShopRouteProcessResponseData mtopTaobaoWirelessShopRouteProcessResponseData, long j) {
            this.f17210a = mtopTaobaoWirelessShopRouteProcessResponseData;
            this.b = j;
        }
    }

    public static cop Z(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cop) ipChange.ipc$dispatch("d5d21d8b", new Object[]{context});
        }
        if (f == null) {
            synchronized (cop.class) {
                try {
                    if (f == null) {
                        f = new cop(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f;
    }

    public static /* synthetic */ SQLiteDatabase a(cop copVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SQLiteDatabase) ipChange.ipc$dispatch("23d1cded", new Object[]{copVar});
        }
        return copVar.B0();
    }

    public static /* synthetic */ void b(cop copVar, SQLiteDatabase sQLiteDatabase, boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a30675c2", new Object[]{copVar, sQLiteDatabase, new Boolean(z), str});
        } else {
            copVar.C(sQLiteDatabase, z, str);
        }
    }

    public static /* synthetic */ String c(cop copVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("780e4432", new Object[]{copVar, str});
        }
        return copVar.f0(str);
    }

    public static /* synthetic */ void e(cop copVar, SQLiteDatabase sQLiteDatabase, String str, String str2, String str3, MtopTaobaoWirelessShopRouteProcessResponseData mtopTaobaoWirelessShopRouteProcessResponseData, String str4) throws SQLException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee1de8ed", new Object[]{copVar, sQLiteDatabase, str, str2, str3, mtopTaobaoWirelessShopRouteProcessResponseData, str4});
        } else {
            copVar.L0(sQLiteDatabase, str, str2, str3, mtopTaobaoWirelessShopRouteProcessResponseData, str4);
        }
    }

    public static /* synthetic */ void g(cop copVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5927b4e6", new Object[]{copVar});
        } else {
            copVar.A();
        }
    }

    public static /* synthetic */ Object ipc$super(cop copVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/shop/util/ShopCacheDBHelper");
    }

    public final void A() {
        SQLiteDatabase sQLiteDatabase;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d00f5e9a", new Object[]{this});
            return;
        }
        this.c.lock();
        int i = this.b - 1;
        this.b = i;
        if (i == 0 && (sQLiteDatabase = this.f17206a) != null && sQLiteDatabase.isOpen()) {
            this.f17206a.close();
        }
        this.c.unlock();
    }

    public final SQLiteDatabase B0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SQLiteDatabase) ipChange.ipc$dispatch("2d5cf8a3", new Object[]{this});
        }
        this.c.lock();
        int i = this.b + 1;
        this.b = i;
        if (i == 1) {
            this.f17206a = getWritableDatabase();
        }
        this.c.unlock();
        return this.f17206a;
    }

    public final void C(SQLiteDatabase sQLiteDatabase, boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed037f41", new Object[]{this, sQLiteDatabase, new Boolean(z), str});
            return;
        }
        mvr.c("execSQL-- sqlComman is " + str);
        if (sQLiteDatabase == null) {
            try {
                try {
                    sQLiteDatabase = B0();
                } catch (Exception e2) {
                    Log.e("ShopCacheDBHelper", "deleteOldCache failed: " + e2);
                    mvr.c("execSQL-- catch an exception: " + e2.toString());
                    if (sQLiteDatabase == null || !sQLiteDatabase.isOpen() || !z) {
                        return;
                    }
                }
            } catch (Throwable th) {
                if (sQLiteDatabase != null && sQLiteDatabase.isOpen() && z) {
                    A();
                }
                throw th;
            }
        }
        sQLiteDatabase.execSQL(str);
        if (!sQLiteDatabase.isOpen() || !z) {
            return;
        }
        A();
    }

    public void D0(String str, String str2, MtopTaobaoWirelessShopRouteProcessResponseData mtopTaobaoWirelessShopRouteProcessResponseData, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("159ac7ce", new Object[]{this, str, str2, mtopTaobaoWirelessShopRouteProcessResponseData, new Long(j)});
            return;
        }
        a aVar = new a(str, str2, mtopTaobaoWirelessShopRouteProcessResponseData, j);
        if (jvr.p().d()) {
            AsyncTask.execute(aVar);
        } else {
            aVar.run();
        }
    }

    public final void F(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f843424e", new Object[]{this, str});
        } else {
            C(null, true, str);
        }
    }

    public final void L0(SQLiteDatabase sQLiteDatabase, String str, String str2, String str3, MtopTaobaoWirelessShopRouteProcessResponseData mtopTaobaoWirelessShopRouteProcessResponseData, String str4) throws SQLException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("531f4d70", new Object[]{this, sQLiteDatabase, str, str2, str3, mtopTaobaoWirelessShopRouteProcessResponseData, str4});
            return;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("keyName", str);
        contentValues.put("keyValue", str2);
        contentValues.put("ruleSetName", str3);
        contentValues.put("targetUrl", f0(mtopTaobaoWirelessShopRouteProcessResponseData.getShopTargetUrl()));
        String str5 = "";
        contentValues.put("shopId", mtopTaobaoWirelessShopRouteProcessResponseData.getShopId() != null ? mtopTaobaoWirelessShopRouteProcessResponseData.getShopId() : str5);
        contentValues.put("sellerId", mtopTaobaoWirelessShopRouteProcessResponseData.getSellerId() != null ? mtopTaobaoWirelessShopRouteProcessResponseData.getSellerId() : str5);
        contentValues.put("isTMall", mtopTaobaoWirelessShopRouteProcessResponseData.getIsTmall() != null ? mtopTaobaoWirelessShopRouteProcessResponseData.getIsTmall() : str5);
        if (mtopTaobaoWirelessShopRouteProcessResponseData.getRenderStyle() != null) {
            str5 = mtopTaobaoWirelessShopRouteProcessResponseData.getRenderStyle();
        }
        contentValues.put("renderStyle", str5);
        contentValues.put("cacheType", str4);
        contentValues.put("createdTime", Long.valueOf(System.currentTimeMillis()));
        sQLiteDatabase.insert("shop_router_cache", null, contentValues);
    }

    public MtopTaobaoWirelessShopRouteProcessResponseData c0(String str, long j) {
        MtopTaobaoWirelessShopRouteProcessResponseData mtopTaobaoWirelessShopRouteProcessResponseData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopTaobaoWirelessShopRouteProcessResponseData) ipChange.ipc$dispatch("d693b78d", new Object[]{this, str, new Long(j)});
        }
        d dVar = g.get(f0(str));
        if (dVar == null || (mtopTaobaoWirelessShopRouteProcessResponseData = dVar.f17210a) == null) {
            return null;
        }
        if (mtopTaobaoWirelessShopRouteProcessResponseData.isMiniAppRenderStyle()) {
            j = jvr.p().s();
        }
        if (dVar.b < System.currentTimeMillis() - (j * 60000)) {
            return null;
        }
        String shopTargetUrl = mtopTaobaoWirelessShopRouteProcessResponseData.getShopTargetUrl();
        if (TextUtils.isEmpty(shopTargetUrl)) {
            return null;
        }
        mtopTaobaoWirelessShopRouteProcessResponseData.setShopTargetUrl(iio.f(str, f0(shopTargetUrl), false, null));
        return mtopTaobaoWirelessShopRouteProcessResponseData;
    }

    public final String f0(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("95bf63ee", new Object[]{this, str});
        }
        Uri parse = Uri.parse(str);
        Map<String, String> g2 = iio.g(parse);
        if (g2 == null || g2.isEmpty()) {
            return str;
        }
        String[] strArr = d;
        if (jvr.p().g()) {
            strArr = e;
        }
        for (String str3 : strArr) {
            g2.remove(str3);
        }
        String scheme = parse.getScheme();
        if ("http".equals(scheme)) {
            scheme = "https";
        }
        String host = parse.getHost();
        String path = parse.getPath();
        String fragment = parse.getFragment();
        String str4 = "";
        if (!g2.isEmpty()) {
            String str5 = str4;
            for (Map.Entry<String, String> entry : g2.entrySet()) {
                StringBuilder sb = new StringBuilder();
                sb.append(str5);
                if (TextUtils.isEmpty(str5)) {
                    str2 = str4;
                } else {
                    str2 = "&";
                }
                sb.append(str2);
                sb.append(entry.getKey());
                sb.append("=");
                sb.append(entry.getValue());
                str5 = sb.toString();
            }
            str4 = str5;
        }
        return new f5v().e(scheme).b(host).c(path).d(str4).a(fragment).toString();
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6815e47b", new Object[]{this, sQLiteDatabase});
        } else {
            sQLiteDatabase.execSQL("create table if not exists shop_router_cache (keyName text, keyValue text, ruleSetName text, targetUrl text, cacheType text, createdTime INTEGER, shopId text, sellerId text, isTMall text, renderStyle text, primary key (keyName,keyValue,cacheType))");
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1967076", new Object[]{this, sQLiteDatabase, new Integer(i), new Integer(i2)});
            return;
        }
        Log.e(ShopConstants.PARAM_SHORTCUT, "onDowngrade");
        sQLiteDatabase.execSQL("drop table shop_router_cache");
        sQLiteDatabase.execSQL("create table if not exists shop_router_cache (keyName text, keyValue text, ruleSetName text, targetUrl text, cacheType text, createdTime INTEGER, shopId text, sellerId text, isTMall text, renderStyle text, primary key (keyName,keyValue,cacheType))");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9203621d", new Object[]{this, sQLiteDatabase, new Integer(i), new Integer(i2)});
            return;
        }
        Log.e(ShopConstants.PARAM_SHORTCUT, "onUpgrade");
        sQLiteDatabase.execSQL("drop table shop_router_cache");
        sQLiteDatabase.execSQL("create table if not exists shop_router_cache (keyName text, keyValue text, ruleSetName text, targetUrl text, cacheType text, createdTime INTEGER, shopId text, sellerId text, isTMall text, renderStyle text, primary key (keyName,keyValue,cacheType))");
    }

    public void w(String str, String str2, MtopTaobaoWirelessShopRouteProcessResponseData mtopTaobaoWirelessShopRouteProcessResponseData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c66f7822", new Object[]{this, str, str2, mtopTaobaoWirelessShopRouteProcessResponseData});
        } else if (!TextUtils.isEmpty(str) && n0(str2, mtopTaobaoWirelessShopRouteProcessResponseData.getShopTargetUrl())) {
            g.put(f0(str), new d(mtopTaobaoWirelessShopRouteProcessResponseData, System.currentTimeMillis()));
        }
    }

    public final boolean n0(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2dd25e4a", new Object[]{this, str, str2})).booleanValue();
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        if (ShopConstants.V_SHOP_RULESET_SHOP.equals(str) || ShopConstants.V_SHOP_RULESET_PERSONAL.equals(str)) {
            return iio.m(str2);
        }
        return false;
    }

    public cop(Context context) {
        super(context, "shop_router.db", (SQLiteDatabase.CursorFactory) null, 3);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(5:13|(6:(1:15)(2:17|(1:19)(2:20|(1:27)(8:26|63|28|66|29|(4:32|(3:72|39|77)|73|30)|68|(1:47))))|66|29|(1:30)|68|(2:45|47))|16|63|28) */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00cb, code lost:
        r13 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00cd, code lost:
        r13 = e;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0085 A[Catch: all -> 0x00b9, Exception -> 0x00bc, TryCatch #4 {Exception -> 0x00bc, all -> 0x00b9, blocks: (B:29:0x0077, B:30:0x007f, B:32:0x0085, B:34:0x009e, B:37:0x00a5, B:39:0x00ae), top: B:66:0x0077 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean C0(tb.cop.c r13, java.util.List<com.taobao.tao.shop.rule.mtop.MtopTaobaoWirelessShopRouteProcessResponseData> r14) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.cop.C0(tb.cop$c, java.util.List):boolean");
    }

    public boolean E0(TBSRCacheData tBSRCacheData) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9f2d08d7", new Object[]{this, tBSRCacheData})).booleanValue();
        }
        F("DELETE FROM shop_router_cache WHERE cacheType = 'remoteCache'");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new c("host", tBSRCacheData.getHost()));
        arrayList.add(new c("promotion", tBSRCacheData.getPromotion()));
        arrayList.add(new c("shopId", tBSRCacheData.getShopId()));
        arrayList.add(new c("sellerId", tBSRCacheData.getSellerId()));
        arrayList.add(new c("sellerNick", tBSRCacheData.getUserNick()));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!C0((c) it.next(), tBSRCacheData.getResult())) {
                z = false;
            }
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0166  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void u0() {
        /*
            Method dump skipped, instructions count: 373
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.cop.u0():void");
    }

    static {
        t2o.a(668991600);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0034, code lost:
        if (r8.equals(com.taobao.tao.shop.common.ShopConstants.V_SHOP_RULESET_PROMOTION) == false) goto L_0x002b;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<tb.cop.b> L(java.lang.String r7, java.lang.String r8) {
        /*
            r6 = this;
            r0 = 2
            r1 = 1
            r2 = 0
            com.android.alibaba.ip.runtime.IpChange r3 = tb.cop.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x001b
            java.lang.String r4 = "5e24ccdd"
            r5 = 3
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r2] = r6
            r5[r1] = r7
            r5[r0] = r8
            java.lang.Object r7 = r3.ipc$dispatch(r4, r5)
            java.util.List r7 = (java.util.List) r7
            return r7
        L_0x001b:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r8.hashCode()
            r4 = -1
            int r5 = r8.hashCode()
            switch(r5) {
                case -1993207176: goto L_0x0043;
                case 810288251: goto L_0x0037;
                case 1719388589: goto L_0x002d;
                default: goto L_0x002b;
            }
        L_0x002b:
            r0 = -1
            goto L_0x004e
        L_0x002d:
            java.lang.String r1 = "shop_ruleSet_promotion_page"
            boolean r8 = r8.equals(r1)
            if (r8 != 0) goto L_0x004e
            goto L_0x002b
        L_0x0037:
            java.lang.String r0 = "shop_ruleSet_personal_shophost"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x0041
            goto L_0x002b
        L_0x0041:
            r0 = 1
            goto L_0x004e
        L_0x0043:
            java.lang.String r0 = "shop_ruleSet_shop"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x004d
            goto L_0x002b
        L_0x004d:
            r0 = 0
        L_0x004e:
            switch(r0) {
                case 0: goto L_0x0072;
                case 1: goto L_0x0062;
                case 2: goto L_0x0052;
                default: goto L_0x0051;
            }
        L_0x0051:
            goto L_0x009f
        L_0x0052:
            java.lang.String r7 = tb.rvr.c(r7)
            tb.cop$b r8 = new tb.cop$b
            java.lang.String r0 = "promotion"
            r8.<init>(r0, r7)
            r3.add(r8)
            goto L_0x009f
        L_0x0062:
            java.lang.String r7 = tb.rvr.b(r7)
            tb.cop$b r8 = new tb.cop$b
            java.lang.String r0 = "host"
            r8.<init>(r0, r7)
            r3.add(r8)
            goto L_0x009f
        L_0x0072:
            tb.cop$b r8 = new tb.cop$b
            java.lang.String r0 = "shopId"
            java.lang.String r1 = tb.rvr.h(r7)
            r8.<init>(r0, r1)
            r3.add(r8)
            tb.cop$b r8 = new tb.cop$b
            java.lang.String r0 = "sellerId"
            java.lang.String r1 = tb.rvr.d(r7)
            r8.<init>(r0, r1)
            r3.add(r8)
            tb.cop$b r8 = new tb.cop$b
            java.lang.String r0 = "sellerNick"
            java.lang.String r7 = tb.rvr.f(r7)
            r8.<init>(r0, r7)
            r3.add(r8)
        L_0x009f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.cop.L(java.lang.String, java.lang.String):java.util.List");
    }

    /* JADX WARN: Not initialized variable reg: 18, insn: 0x0094: MOVE  (r4 I:??[OBJECT, ARRAY]) = (r18 I:??[OBJECT, ARRAY]), block:B:24:0x0094 */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0210  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.taobao.tao.shop.rule.mtop.MtopTaobaoWirelessShopRouteProcessResponseData i0(java.lang.String r26, java.lang.String r27, boolean r28, long r29) {
        /*
            Method dump skipped, instructions count: 558
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.cop.i0(java.lang.String, java.lang.String, boolean, long):com.taobao.tao.shop.rule.mtop.MtopTaobaoWirelessShopRouteProcessResponseData");
    }
}

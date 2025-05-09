package com.taobao.zcache.api;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.zcache.core.IZCacheCore;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
import tb.dpx;
import tb.kpw;
import tb.nsw;
import tb.t2o;
import tb.tft;
import tb.y1r;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ZCacheAPI extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ IZCacheCore f14180a;
        public final /* synthetic */ ArrayList b;
        public final /* synthetic */ String c;
        public final /* synthetic */ WVCallBackContext d;

        public a(IZCacheCore iZCacheCore, ArrayList arrayList, String str, WVCallBackContext wVCallBackContext) {
            this.f14180a = iZCacheCore;
            this.b = arrayList;
            this.c = str;
            this.d = wVCallBackContext;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            this.f14180a.prefetch(this.b, this.c);
            this.d.success(new nsw());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ IZCacheCore f14181a;
        public final /* synthetic */ String b;
        public final /* synthetic */ long c;
        public final /* synthetic */ WVCallBackContext d;

        public b(IZCacheCore iZCacheCore, String str, long j, WVCallBackContext wVCallBackContext) {
            this.f14181a = iZCacheCore;
            this.b = str;
            this.c = j;
            this.d = wVCallBackContext;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            this.f14181a.setPackMinSeq(this.b, this.c, "Bridge");
            this.d.success(new nsw());
        }
    }

    static {
        t2o.a(996147236);
    }

    private static IZCacheCore getCore(WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IZCacheCore) ipChange.ipc$dispatch("ede67f18", new Object[]{wVCallBackContext});
        }
        IZCacheCore b2 = dpx.b();
        if (b2 != null) {
            return b2;
        }
        nsw nswVar = new nsw();
        nswVar.b("message", dpx.e().getMessage());
        wVCallBackContext.error(nswVar);
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
        r0 = r0.getUrl();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String getOrigin() {
        /*
            r4 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.zcache.api.ZCacheAPI.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x0015
            java.lang.String r1 = "c30a065d"
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r4
            java.lang.Object r0 = r0.ipc$dispatch(r1, r2)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L_0x0015:
            android.taobao.windvane.webview.IWVWebView r0 = r4.mWebView
            r1 = 0
            if (r0 != 0) goto L_0x001b
            return r1
        L_0x001b:
            java.lang.String r0 = r0.getUrl()
            if (r0 != 0) goto L_0x0022
            return r1
        L_0x0022:
            java.net.URL r1 = new java.net.URL     // Catch: Exception -> 0x003e
            r1.<init>(r0)     // Catch: Exception -> 0x003e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: Exception -> 0x003e
            r2.<init>()     // Catch: Exception -> 0x003e
            java.lang.String r3 = r1.getHost()     // Catch: Exception -> 0x003e
            r2.append(r3)     // Catch: Exception -> 0x003e
            java.lang.String r1 = r1.getPath()     // Catch: Exception -> 0x003e
            r2.append(r1)     // Catch: Exception -> 0x003e
            java.lang.String r0 = r2.toString()     // Catch: Exception -> 0x003e
        L_0x003e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.zcache.api.ZCacheAPI.getOrigin():java.lang.String");
    }

    public static /* synthetic */ Object ipc$super(ZCacheAPI zCacheAPI, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/zcache/api/ZCacheAPI");
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (TextUtils.equals(str, "prefetch")) {
            IZCacheCore core = getCore(wVCallBackContext);
            if (core == null) {
                return true;
            }
            ArrayList arrayList = new ArrayList();
            try {
                Iterator<String> keys = new JSONObject(str2).keys();
                while (keys.hasNext()) {
                    arrayList.add(keys.next());
                }
            } catch (JSONException unused) {
            }
            tft.a(new a(core, arrayList, getOrigin(), wVCallBackContext));
            return true;
        } else if (!TextUtils.equals(str, "setPackMinVersion")) {
            return false;
        } else {
            IZCacheCore core2 = getCore(wVCallBackContext);
            if (core2 == null) {
                return true;
            }
            try {
                JSONObject jSONObject = new JSONObject(str2);
                tft.a(new b(core2, jSONObject.optString("name"), jSONObject.optLong(y1r.COL_SEQ), wVCallBackContext));
                return true;
            } catch (JSONException unused2) {
                nsw nswVar = new nsw();
                nswVar.b("message", "invalid params");
                wVCallBackContext.error(nswVar);
                return true;
            }
        }
    }
}

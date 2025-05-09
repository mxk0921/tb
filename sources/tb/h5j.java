package tb;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import anet.channel.util.HttpConstant;
import anetwork.channel.NetworkListener;
import anetwork.channel.degrade.DegradableNetwork;
import anetwork.channel.entity.RequestImpl;
import anetwork.channel.util.RequestConstant;
import com.alibaba.idst.nls.restapi.HttpRequest;
import com.alipay.mobile.common.logging.strategy.LogStrategyManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.scene.SceneIdentifier;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Future;
import tb.n7b;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class h5j implements n7b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MTOP_EXTRA_CDN_IP_PORT = "mtop_extra_ip_port";
    public static final String MTOP_EXTRA_CONNECT_TYPE = "mtop_extra_connect_type";
    public static final String MTOP_EXTRA_FIRST_DATA = "mtop_extra_first_data";
    public static final String MTOP_EXTRA_HIT_CDN_CACHE = "mtop_extra_hit_cdn_cache";
    public static final String MTOP_EXTRA_RESPONSE_CODE = "mtop_extra_response_code";
    public static final String MTOP_EXTRA_SEND_BEFORE = "mtop_extra_send_before";
    public static final String MTOP_EXTRA_SERVER_RT = "mtop_extra_server_rt";
    public static final String MTOP_PREFIX = "MtopHttpLoader";

    /* renamed from: a  reason: collision with root package name */
    public final Context f20422a;
    public int b;
    public int c;
    public String d;

    public h5j(Context context) {
        this.f20422a = context;
    }

    @Override // tb.n7b
    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("544a24a5", new Object[]{this, new Integer(i)});
        } else {
            this.b = i;
        }
    }

    @Override // tb.n7b
    public void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1836351", new Object[]{this, new Integer(i)});
        } else {
            this.c = i;
        }
    }

    public final Map<String, String> d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("debb6589", new Object[]{this, str});
        }
        String[] split = str.split(",");
        HashMap hashMap = new HashMap();
        for (String str2 : split) {
            String[] split2 = str2.split(":");
            if (split2.length == 2) {
                hashMap.put(split2[0].trim(), split2[1]);
            } else {
                hashMap.put(split2[0].trim(), "");
            }
        }
        return hashMap;
    }

    public final String f(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("904e852c", new Object[]{this, context});
        }
        if (!TextUtils.isEmpty(this.d)) {
            return this.d;
        }
        if (context != null) {
            try {
                this.d = context.getPackageManager().getPackageInfo(this.f20422a.getPackageName(), 0).versionName;
            } catch (Throwable th) {
                fiv.c(MTOP_PREFIX, "getVersionName error=%s", th);
            }
        }
        return this.d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004b, code lost:
        if (java.lang.Boolean.parseBoolean(r2) != false) goto L_0x004f;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String e(java.lang.String r6, java.util.Map<java.lang.String, java.lang.String> r7) {
        /*
            r5 = this;
            r0 = 1
            r1 = 0
            r2 = 3
            com.android.alibaba.ip.runtime.IpChange r3 = tb.h5j.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x001b
            java.lang.String r4 = "ad30900e"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r5
            r2[r0] = r6
            r6 = 2
            r2[r6] = r7
            java.lang.Object r6 = r3.ipc$dispatch(r4, r2)
            java.lang.String r6 = (java.lang.String) r6
            return r6
        L_0x001b:
            tb.s0m r3 = tb.s0m.B()
            boolean r3 = r3.C()
            if (r3 != 0) goto L_0x002f
            tb.s0m r3 = tb.s0m.B()
            boolean r3 = r3.D()
            if (r3 == 0) goto L_0x0036
        L_0x002f:
            int r3 = com.taobao.analysis.scene.SceneIdentifier.getDeviceLevel()
            if (r3 != r2) goto L_0x0036
            return r6
        L_0x0036:
            if (r7 == 0) goto L_0x004e
            java.lang.String r2 = "retry_request"
            java.lang.Object r2 = r7.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L_0x004e
            boolean r2 = java.lang.Boolean.parseBoolean(r2)
            if (r2 == 0) goto L_0x004e
            goto L_0x004f
        L_0x004e:
            r0 = 0
        L_0x004f:
            tb.s0m r1 = tb.s0m.B()
            boolean r1 = r1.F0()
            java.lang.String r2 = "heicCodecReady"
            if (r1 == 0) goto L_0x007c
            if (r0 != 0) goto L_0x007c
            android.util.Pair r0 = tb.z5b.a(r6)
            if (r7 == 0) goto L_0x008e
            java.lang.Object r1 = r0.second
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x008e
            java.lang.String r1 = "convert_format"
            java.lang.String r3 = "jpeg"
            r7.put(r1, r3)
            java.lang.String r1 = "true"
            r7.put(r2, r1)
            goto L_0x008e
        L_0x007c:
            if (r7 == 0) goto L_0x008d
            tb.s0m r0 = tb.s0m.B()
            boolean r0 = r0.F0()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r7.put(r2, r0)
        L_0x008d:
            r0 = 0
        L_0x008e:
            if (r0 == 0) goto L_0x0094
            java.lang.Object r6 = r0.first
            java.lang.String r6 = (java.lang.String) r6
        L_0x0094:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.h5j.e(java.lang.String, java.util.Map):java.lang.String");
    }

    @Override // tb.n7b
    public Future<?> a(String str, Map<String, String> map, n7b.a aVar) {
        String str2;
        NetworkListener networkListener;
        String str3;
        String str4;
        String str5;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Future) ipChange.ipc$dispatch("57378a83", new Object[]{this, str, map, aVar});
        }
        fiv.n(LogStrategyManager.SP_STRATEGY_KEY_NETWORK, str, "%s async download image", MTOP_PREFIX);
        RequestImpl requestImpl = new RequestImpl(e(str, map));
        requestImpl.setCookieEnabled(false);
        requestImpl.setFollowRedirects(true);
        requestImpl.setConnectTimeout(this.b);
        requestImpl.setReadTimeout(this.c);
        requestImpl.addHeader("f-refer", "picture");
        if ((!s0m.B().C() || SceneIdentifier.getDeviceLevel() != 3) && s0m.B().F0() && !s0m.B().P() && ((map == null || !Boolean.parseBoolean(map.get("retry_request"))) && !TextUtils.isEmpty(str) && (str.contains("/O1CN") || z5b.c(str)))) {
            if (s0m.B().G0()) {
                str5 = ",image/heia";
            } else {
                str5 = "";
            }
            requestImpl.addHeader(HttpRequest.HEADER_ACCEPT, "image/heic" + str5 + ",image/webp,image/*;q=0.9,*/*;q=0.8");
        }
        if (map != null) {
            str2 = map.get(RequestConstant.KEY_TRACE_ID);
            if (str2 != null) {
                requestImpl.setExtProperty(RequestConstant.KEY_TRACE_ID, str2);
            }
        } else {
            str2 = null;
        }
        if (!(map == null || (str4 = map.get("open_trace_context")) == null)) {
            requestImpl.setTraceContext(d(str4));
        }
        if (TextUtils.isEmpty(str2) || !uqr.b()) {
            StringBuilder sb = new StringBuilder(64);
            sb.append("TBAndroid/Native ");
            if (s0m.B().D() && SceneIdentifier.getDeviceLevel() == 3) {
                sb.append("nowebp_lowdevicedemote ");
            }
            sb.append(this.f20422a.getPackageName());
            sb.append(" ");
            sb.append(f(this.f20422a));
            sb.append(" Android");
            sb.append(Build.VERSION.RELEASE);
            if (s0m.B().Q()) {
                sb.append(" ");
                sb.append(ti7.a(SceneIdentifier.getDeviceLevel()));
            }
            requestImpl.addHeader(HttpConstant.USER_AGENT, sb.toString());
        } else {
            StringBuilder sb2 = new StringBuilder(64);
            sb2.append("TBAndroid/Native ");
            if (s0m.B().D() && SceneIdentifier.getDeviceLevel() == 3) {
                sb2.append("nowebp_lowdevicedemote ");
            }
            sb2.append(this.f20422a.getPackageName());
            sb2.append(" ");
            sb2.append(f(this.f20422a));
            sb2.append(" Android");
            sb2.append(Build.VERSION.RELEASE);
            sb2.append(" ");
            sb2.append(str2);
            if (s0m.B().Q()) {
                sb2.append(" ");
                sb2.append(ti7.a(SceneIdentifier.getDeviceLevel()));
            }
            requestImpl.addHeader(HttpConstant.USER_AGENT, sb2.toString());
        }
        if (map != null && map.containsKey("Image-Gray-Traffic")) {
            requestImpl.addHeader("Image-Gray-Traffic", pg1.ATOM_EXT_gray);
        }
        if (!(map == null || (str3 = map.get(nd2.BUNDLE_BIZ_CODE)) == null)) {
            try {
                requestImpl.setBizId(Integer.parseInt(str3));
            } catch (NumberFormatException e) {
                fiv.n(LogStrategyManager.SP_STRATEGY_KEY_NETWORK, str, "%s get biz code from extras error=%s", MTOP_PREFIX, e);
            }
        }
        if (uqr.a()) {
            networkListener = new s5j(aVar, map);
        } else {
            networkListener = new v6j(aVar, map);
        }
        return new DegradableNetwork(this.f20422a).asyncSend(requestImpl, null, null, networkListener);
    }
}

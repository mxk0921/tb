package tb;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.android.icart.core.data.config.RequestConfig;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.interactive_common.CXCommonActivity;
import com.taobao.android.searchbaseframe.xsl.module.XslModule;
import com.taobao.android.tscheduleprotocol.ScheduleProtocolCallback;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import tb.mox;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class twh implements xnj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Set<String> f28999a;
    public static final Set<String> b;
    public static final Set<String> c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements mox.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ long f29000a;
        public final /* synthetic */ yko b;

        public a(twh twhVar, long j, yko ykoVar) {
            this.f29000a = j;
            this.b = ykoVar;
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8922c129", new Object[]{this});
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            this.b.l().c("MUSPageInterceptor", "SaveTime %d", Long.valueOf(currentTimeMillis - this.f29000a));
            new HashMap().put(ScheduleProtocolCallback.MERGE_TIME, String.valueOf(currentTimeMillis));
        }

        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c5881041", new Object[]{this});
            }
        }

        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a13bc209", new Object[]{this});
            }
        }
    }

    @Override // tb.xnj
    public String name() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aa84494e", new Object[]{this});
        }
        return "MUSPagePreprocessor";
    }

    @Override // tb.xnj
    public boolean process(Intent intent, zmj zmjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b3ebca67", new Object[]{this, intent, zmjVar})).booleanValue();
        }
        if (intent == null || zmjVar == null) {
            return true;
        }
        return a(intent);
    }

    @Override // tb.xnj
    public boolean skip() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7fce928a", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public final boolean a(Intent intent) {
        Uri data;
        String path;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("66a5c187", new Object[]{this, intent})).booleanValue();
        }
        if (o4p.G2() || (data = intent.getData()) == null) {
            return true;
        }
        String host = data.getHost();
        Set<String> set = b;
        if (!(((HashSet) set).contains(host) || ((HashSet) c).contains(host)) || (path = data.getPath()) == null) {
            return true;
        }
        if (((HashSet) set).contains(host)) {
            if (!path.contains("/app/asr-pages/")) {
                return true;
            }
        } else if (((HashSet) c).contains(host) && (!path.contains("/search_rec/") || !"true".equals(data.getQueryParameter("wh_muise")))) {
            return true;
        }
        Set<String> queryParameterNames = data.getQueryParameterNames();
        long currentTimeMillis = System.currentTimeMillis();
        yko H = XslModule.H();
        if (H == null) {
            Log.e("MUSPageInterceptor", "No core");
            return true;
        }
        if (queryParameterNames != null && !queryParameterNames.isEmpty()) {
            String queryParameter = data.getQueryParameter("_xsl_prld_id");
            if (TextUtils.isEmpty(queryParameter)) {
                c4p.C("[XS.xsl]", "Preload failed, no _xsl_prld_id in url.", new Object[0]);
                return true;
            }
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            hashMap2.put("appId", queryParameter);
            boolean booleanQueryParameter = data.getBooleanQueryParameter("_xsl_flat_params", false);
            for (String str : queryParameterNames) {
                if (!((HashSet) f28999a).contains(str)) {
                    String queryParameter2 = data.getQueryParameter(str);
                    if (!TextUtils.isEmpty(queryParameter2)) {
                        if (booleanQueryParameter) {
                            hashMap2.put(str, queryParameter2);
                        } else {
                            hashMap.put(str, queryParameter2);
                        }
                    }
                }
            }
            hashMap.put(RequestConfig.IS_ICART_IS_FIRST_REQUEST, "true");
            mox.e().h(data.toString(), "mtop.relationrecommend.WirelessRecommend.recommend", "2.0", hashMap2, hashMap, new a(this, currentTimeMillis, H), booleanQueryParameter);
            return true;
        }
        H.l().d("MUSPageInterceptor", "Empty params");
        return true;
    }

    static {
        t2o.a(815792624);
        t2o.a(578814049);
        HashSet hashSet = new HashSet();
        f28999a = hashSet;
        hashSet.add(yj4.PARAM_UT_PARAMS);
        hashSet.add("_mus_tpl");
        hashSet.add(CXCommonActivity.NAV_OVERLAY);
        hashSet.add("_wx_statusbar_hidden");
        hashSet.add("appId");
        hashSet.add("_xsl_flat_params");
        HashSet hashSet2 = new HashSet();
        b = hashSet2;
        HashSet hashSet3 = new HashSet();
        c = hashSet3;
        hashSet2.add("market.m.taobao.com");
        hashSet2.add("market.wapa.taobao.com");
        hashSet3.add("mo.m.taobao.com");
        hashSet3.add("pre-mo.m.taobao.com");
    }
}

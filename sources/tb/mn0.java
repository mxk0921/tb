package tb;

import android.text.TextUtils;
import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.nextrpc.AURANextRPCEndpoint;
import com.alibaba.android.aura.service.nextrpc.extension.IAURANextRPCPrefetchExtension;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.buy.toggle.AliBuyPerfSwitcher;
import com.taobao.android.cachecleaner.autoclear.biz.data.BizTaskData;
import com.taobao.message.message_open_api.ICallService;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.ck;

/* compiled from: Taobao */
@AURAExtensionImpl(code = "alibuy.impl.nextrpc.prefetch")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class mn0 implements IAURANextRPCPrefetchExtension {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public lo f24159a;
    public AURAGlobalData b;

    static {
        t2o.a(301990001);
        t2o.a(80740478);
    }

    public final void B(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1c0130b", new Object[]{this, map});
        } else if (this.b != null && map != null) {
            String str = map.get(IAURANextRPCPrefetchExtension.DATA_SAVE_TIME);
            ArrayList arrayList = new ArrayList();
            arrayList.add((String) this.f24159a.g("purchaseFrom", String.class));
            arrayList.add((String) this.f24159a.g("itemCount", String.class));
            arrayList.add((String) this.f24159a.g("bucket", String.class));
            HashMap hashMap = new HashMap();
            hashMap.put("savaTime", Long.valueOf(TextUtils.isEmpty(str) ? 0L : Long.valueOf(str).longValue()));
            vm0.h("prefetchSaveTime", hashMap, arrayList, null, 0.001f);
        }
    }

    @Override // com.alibaba.android.aura.service.nextrpc.extension.IAURANextRPCPrefetchExtension
    public void c(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fa8699e", new Object[]{this, str, map});
        } else if (map != null) {
            rbb g = ck.g();
            g.e("预请求 节省 = " + map.get(IAURANextRPCPrefetchExtension.DATA_SAVE_TIME), ck.b.b().i("AURA/performance").g("type", str).g("api", map.get("data_key")).g("hitTime", map.get(IAURANextRPCPrefetchExtension.DATA_HIT_TIME)).g("startTime", map.get(IAURANextRPCPrefetchExtension.DATA_START_TIME)).g("startTime", map.get(IAURANextRPCPrefetchExtension.DATA_START_TIME)).g("receiveDataTime", map.get(IAURANextRPCPrefetchExtension.DATA_RESPONSE_TIME)).a());
            B(map);
            String i = i0r.i();
            HashMap hashMap = new HashMap();
            hashMap.put("c1", sj.c(tj.c(map)));
            sj.b("下单预请求", BizTaskData.MANUAL_TIME, "26607-tracker", "taobao.purchase.prefetch", "prefetch", i, hashMap, str);
        }
    }

    @Override // tb.ybb
    public void onCreate(lo loVar, yi yiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe8206ca", new Object[]{this, loVar, yiVar});
        } else {
            this.f24159a = loVar;
        }
    }

    @Override // tb.lbb
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, hbb hbbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bab53acc", new Object[]{this, aURAFlowData, aURAGlobalData, hbbVar});
        } else {
            this.b = aURAGlobalData;
        }
    }

    @Override // tb.ybb
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        }
    }

    @Override // com.alibaba.android.aura.service.nextrpc.extension.IAURANextRPCPrefetchExtension
    public nk K(AURANextRPCEndpoint aURANextRPCEndpoint, AURANextRPCEndpoint aURANextRPCEndpoint2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nk) ipChange.ipc$dispatch("6b51c788", new Object[]{this, aURANextRPCEndpoint, aURANextRPCEndpoint2});
        }
        if (i0r.a()) {
            nk nkVar = new nk();
            nkVar.c(true);
            return nkVar;
        }
        String string = AliBuyPerfSwitcher.getString("prefetchCompareWhiteList", "websiteLanguage");
        List<String> list = null;
        try {
            if (!TextUtils.isEmpty(string)) {
                list = Arrays.asList(string.split(","));
            }
        } catch (Throwable unused) {
        }
        return x(aURANextRPCEndpoint, aURANextRPCEndpoint2, list);
    }

    public final nk x(AURANextRPCEndpoint aURANextRPCEndpoint, AURANextRPCEndpoint aURANextRPCEndpoint2, List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nk) ipChange.ipc$dispatch("5a745753", new Object[]{this, aURANextRPCEndpoint, aURANextRPCEndpoint2, list});
        }
        nk nkVar = new nk();
        if (TextUtils.isEmpty(aURANextRPCEndpoint2.getKey()) || !aURANextRPCEndpoint2.getKey().equals(aURANextRPCEndpoint.getKey())) {
            nkVar.a().put("missKey", "apiKey");
            nkVar.a().put("missMsg", "missApi");
            nkVar.a().put("prefetchValue", aURANextRPCEndpoint.getKey());
            nkVar.a().put("realValue", aURANextRPCEndpoint2.getKey());
        } else if (aURANextRPCEndpoint2.isNeedEncode() != aURANextRPCEndpoint.isNeedEncode()) {
            nkVar.a().put("missKey", ICallService.KEY_NEED_ECODE);
            nkVar.a().put("missMsg", "missEcode");
            nkVar.a().put("prefetchValue", String.valueOf(aURANextRPCEndpoint.isNeedEncode()));
            nkVar.a().put("realValue", String.valueOf(aURANextRPCEndpoint2.isNeedEncode()));
        } else if (aURANextRPCEndpoint2.isNeedSession() != aURANextRPCEndpoint.isNeedSession()) {
            nkVar.a().put("missKey", "needSession");
            nkVar.a().put("missMsg", "missSession");
            nkVar.a().put("prefetchValue", String.valueOf(aURANextRPCEndpoint.isNeedSession()));
            nkVar.a().put("realValue", String.valueOf(aURANextRPCEndpoint2.isNeedSession()));
        } else if (r(aURANextRPCEndpoint.getDataParams(), aURANextRPCEndpoint2.getDataParams(), list, nkVar) && r(aURANextRPCEndpoint.getRequestHeaders(), aURANextRPCEndpoint2.getRequestHeaders(), list, nkVar)) {
            nkVar.c(true);
        }
        return nkVar;
    }

    public final boolean r(Map<String, String> map, Map<String, String> map2, List<String> list, nk nkVar) {
        String key;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("35c2718d", new Object[]{this, map, map2, list, nkVar})).booleanValue();
        }
        if (map == null && map2 == null) {
            return true;
        }
        if (map == null) {
            nkVar.a().put("prefetchValue", "is null");
            return false;
        } else if (map2 == null) {
            nkVar.a().put("realValue", "is null");
            return false;
        } else {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key2 = entry.getKey();
                if (key2 == null) {
                    return true;
                }
                if (!s84.a(key2, map.get(key2), map2.get(key2), list, nkVar)) {
                    return false;
                }
            }
            Iterator<Map.Entry<String, String>> it = map2.entrySet().iterator();
            while (it.hasNext() && (key = it.next().getKey()) != null) {
                if (!s84.a(key, map.get(key), map2.get(key), list, nkVar)) {
                    return false;
                }
            }
            return true;
        }
    }
}

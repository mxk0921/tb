package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.subservice.biz.IAiService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class tjn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final cfc f28753a;
    public final ConcurrentHashMap<String, String> b = new ConcurrentHashMap<>();
    public final StringBuilder c = new StringBuilder();

    static {
        t2o.a(491782630);
    }

    public tjn(cfc cfcVar) {
        this.f28753a = cfcVar;
    }

    public void a(cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("800c1240", new Object[]{this, cfcVar});
            return;
        }
        String j = j(cfcVar);
        if (!TextUtils.isEmpty(j)) {
            sjn.b(j);
        }
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba71a64b", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str) && !this.b.isEmpty()) {
            this.b.remove(str);
        }
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7c34779", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str) && !this.b.isEmpty()) {
            String remove = this.b.remove(str);
            if (!TextUtils.isEmpty(remove)) {
                this.c.append(remove);
            }
        }
    }

    public final String d(Set<String> set) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dbb23003", new Object[]{this, set});
        }
        StringBuilder sb = new StringBuilder();
        for (String str : set) {
            if (!TextUtils.isEmpty(str)) {
                if (sb.length() == 0) {
                    sb.append(str);
                } else {
                    sb.append("_");
                    sb.append(str);
                }
            }
        }
        return sb.toString();
    }

    public Set<String> g(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("f54a84b1", new Object[]{this, new Boolean(z)});
        }
        Set<String> synchronizedSet = Collections.synchronizedSet(new HashSet());
        IAiService iAiService = (IAiService) this.f28753a.a(IAiService.class);
        if (iAiService != null) {
            List<BaseSectionModel<?>> aiCacheCards = iAiService.getAiCacheCards(this.f28753a.getContainerType().getContainerId());
            if (aiCacheCards != null && !aiCacheCards.isEmpty()) {
                for (BaseSectionModel<?> baseSectionModel : aiCacheCards) {
                    String h = h(baseSectionModel);
                    if (!TextUtils.isEmpty(h)) {
                        synchronizedSet.add(h);
                    }
                }
            }
            if (z) {
                iAiService.clearAiCache(yyj.l().f32522a);
            }
        }
        return synchronizedSet;
    }

    public final String h(BaseSectionModel<?> baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("86542ec3", new Object[]{this, baseSectionModel});
        }
        JSONObject ext = baseSectionModel.getExt();
        if (ext == null) {
            return null;
        }
        return ext.getString("x_exposed");
    }

    public String i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6b9f18c9", new Object[]{this});
        }
        StringBuilder sb = this.c;
        if (sb == null) {
            return null;
        }
        String sb2 = sb.toString();
        if (this.c.length() > 0) {
            StringBuilder sb3 = this.c;
            sb3.delete(0, sb3.length());
        }
        return sb2;
    }

    public Map<String, String> e(boolean z, String str, w1e w1eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("aa8a08bb", new Object[]{this, new Boolean(z), str, w1eVar});
        }
        HashMap hashMap = new HashMap(2);
        if (TextUtils.isEmpty(str)) {
            str = j(this.f28753a);
        }
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("unExposedXExposedIds", str);
            if (w1eVar != null) {
                this.b.put(w1eVar.b(), str);
            }
        }
        hashMap.put("enableZeroPageExposedOpt", String.valueOf(z));
        return hashMap;
    }

    public Map<String, String> f(boolean z, String str, w1e w1eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("ff2b3a4c", new Object[]{this, new Boolean(z), str, w1eVar});
        }
        HashMap hashMap = new HashMap(2);
        String d = d(g(true));
        if (!TextUtils.isEmpty(d)) {
            hashMap.put("unExposedXExposedIds", d);
            if (w1eVar != null) {
                this.b.put(w1eVar.b(), d);
            }
        }
        hashMap.put("enableZeroPageExposedOpt", String.valueOf(z));
        return hashMap;
    }

    public final String j(cfc cfcVar) {
        IContainerDataModel containerData;
        List sections;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ca3eee1e", new Object[]{this, cfcVar});
        }
        IContainerDataService iContainerDataService = (IContainerDataService) cfcVar.a(IContainerDataService.class);
        if (iContainerDataService == null || (containerData = iContainerDataService.getContainerData()) == null || containerData.getBase() == null || (sections = containerData.getBase().getSections()) == null || sections.isEmpty()) {
            return null;
        }
        Set<String> synchronizedSet = Collections.synchronizedSet(new HashSet());
        int c = mve.c("realExposeBufferNumber", 0);
        int i = 0;
        for (Object obj : sections) {
            if (obj instanceof BaseSectionModel) {
                BaseSectionModel baseSectionModel = (BaseSectionModel) obj;
                if (!baseSectionModel.getBooleanValue("isTracked")) {
                    if (i < c) {
                        i++;
                    } else {
                        JSONObject ext = baseSectionModel.getExt();
                        if (ext != null) {
                            String string = ext.getString("x_exposed");
                            if (!TextUtils.isEmpty(string)) {
                                synchronizedSet.add(string);
                            }
                        }
                    }
                }
            }
        }
        synchronizedSet.addAll(g(false));
        return d(synchronizedSet);
    }
}

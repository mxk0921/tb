package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.core.exception.InfoFlowRuntimeException;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class nxy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final cfc f25026a;

    static {
        t2o.a(491782642);
    }

    public nxy(cfc cfcVar) {
        this.f25026a = cfcVar;
    }

    public void a(IContainerInnerDataModel<?> iContainerInnerDataModel, String str) {
        List<?> sections;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bf1ee7d", new Object[]{this, iContainerInnerDataModel, str});
        } else if (iContainerInnerDataModel != null && !TextUtils.isEmpty(str) && (sections = iContainerInnerDataModel.getSections()) != null && !sections.isEmpty()) {
            Iterator<?> it = sections.iterator();
            while (it.hasNext()) {
                JSONObject ext = ((BaseSectionModel) it.next()).getExt();
                if (ext != null) {
                    ext.put("traceId", (Object) str);
                }
            }
        }
    }

    public final JSONObject b() {
        JSONObject ext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("3dfc2e7f", new Object[]{this});
        }
        IContainerDataService iContainerDataService = (IContainerDataService) this.f25026a.a(IContainerDataService.class);
        if (iContainerDataService == null) {
            fve.e("TraceIdCollector", "getRealTimePassParams hostService == null");
            return null;
        }
        c6d pageInfo = iContainerDataService.getPageInfo();
        if (pageInfo == null || (ext = pageInfo.getExt()) == null) {
            return null;
        }
        try {
            return ext.getJSONObject("realtimePassParams");
        } catch (InfoFlowRuntimeException e) {
            fve.c("TraceIdCollector", "获取 realtimePassParams 异常", e);
            return null;
        }
    }

    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ca44cc4f", new Object[]{this});
        }
        JSONObject b = b();
        if (b == null) {
            return null;
        }
        try {
            return b.getString("traceID");
        } catch (Throwable th) {
            fve.c("TraceIdCollector", "获取traceID异常", th);
            return null;
        }
    }
}

package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.core.exception.InfoFlowRuntimeException;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import tb.mz8;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class lvy implements mz8.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference<cfc> f23601a;

    static {
        t2o.a(491782641);
    }

    public lvy(cfc cfcVar) {
        this.f23601a = new WeakReference<>(cfcVar);
    }

    @Override // tb.mz8.a
    public Map<String, String> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("703083e1", new Object[]{this});
        }
        return d();
    }

    public final void b(IMainFeedsViewService<?> iMainFeedsViewService, int i, int i2, Set<String> set, Set<String> set2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99b8bca9", new Object[]{this, iMainFeedsViewService, new Integer(i), new Integer(i2), set, set2});
            return;
        }
        while (i <= i2) {
            BaseSectionModel<?> findItemDataByPosition = iMainFeedsViewService.findItemDataByPosition(i);
            if (findItemDataByPosition != null) {
                String f = f(findItemDataByPosition);
                String e = e(findItemDataByPosition);
                if (!TextUtils.isEmpty(f)) {
                    set.add(f);
                }
                if (!TextUtils.isEmpty(e)) {
                    set2.add(e);
                }
            }
            i++;
        }
    }

    public final Map<String, String> c(cfc cfcVar, Set<String> set, Set<String> set2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("e5f6a2eb", new Object[]{this, cfcVar, set, set2});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("containerId", cfcVar.getContainerType().getContainerId());
        hashMap.put("traceIds", h(set));
        hashMap.put("pvIds", h(set2));
        return hashMap;
    }

    public final Map<String, String> d() {
        IMainFeedsViewService<?> iMainFeedsViewService;
        int[] g;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("ed7028b3", new Object[]{this});
        }
        cfc cfcVar = this.f23601a.get();
        if (cfcVar == null || (iMainFeedsViewService = (IMainFeedsViewService) cfcVar.a(IMainFeedsViewService.class)) == null || (g = g(iMainFeedsViewService)) == null) {
            return null;
        }
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        b(iMainFeedsViewService, g[0], g[1], hashSet, hashSet2);
        return c(cfcVar, hashSet, hashSet2);
    }

    public final String e(BaseSectionModel<?> baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b3727fa", new Object[]{this, baseSectionModel});
        }
        JSONObject args = baseSectionModel.getArgs();
        if (args == null) {
            return null;
        }
        try {
            return args.getString(yj4.PARAM_PVID);
        } catch (InfoFlowRuntimeException e) {
            fve.c("ScreenshotTracker", "获取 pvid 异常", e);
            return null;
        }
    }

    public final String f(BaseSectionModel<?> baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("945aa887", new Object[]{this, baseSectionModel});
        }
        JSONObject ext = baseSectionModel.getExt();
        if (ext == null) {
            return null;
        }
        try {
            return ext.getString("traceId");
        } catch (InfoFlowRuntimeException e) {
            fve.c("ScreenshotTracker", "获取 traceID 异常", e);
            return null;
        }
    }

    public final String h(Iterable<String> iterable) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2b169162", new Object[]{this, iterable});
        }
        if (iterable == null || !iterable.iterator().hasNext()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (String str : iterable) {
            if (!z) {
                sb.append(",");
            }
            sb.append(str);
            z = false;
        }
        return sb.toString();
    }

    public final int[] g(IMainFeedsViewService<?> iMainFeedsViewService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("f8fda354", new Object[]{this, iMainFeedsViewService});
        }
        int[] visiblePositionRange = iMainFeedsViewService.getVisiblePositionRange();
        if (visiblePositionRange != null && visiblePositionRange.length == 2) {
            return visiblePositionRange;
        }
        fve.e("ScreenshotTracker", "range invalid");
        return null;
    }
}

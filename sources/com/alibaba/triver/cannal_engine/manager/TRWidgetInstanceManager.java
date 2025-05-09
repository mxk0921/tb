package com.alibaba.triver.cannal_engine.manager;

import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.triver.cannal_engine.TRWidgetInstance;
import com.alibaba.triver.kit.api.proxy.IDeviceInfoProxy;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import tb.ris;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class TRWidgetInstanceManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static volatile TRWidgetInstanceManager f2936a = null;
    public static Map<String, Map<String, WeakReference<TRWidgetInstance>>> b = null;
    public static int c = 5;

    public TRWidgetInstanceManager() {
        b = new HashMap();
        c = b();
    }

    public static /* synthetic */ int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bcd6076a", new Object[0])).intValue();
        }
        return c;
    }

    public static TRWidgetInstanceManager d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TRWidgetInstanceManager) ipChange.ipc$dispatch("b4960a0c", new Object[0]);
        }
        if (f2936a == null) {
            synchronized (TRWidgetInstanceManager.class) {
                try {
                    if (f2936a == null) {
                        f2936a = new TRWidgetInstanceManager();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f2936a;
    }

    public final int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6be5a9e7", new Object[]{this})).intValue();
        }
        return ris.e(c());
    }

    public final int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3cec5212", new Object[]{this})).intValue();
        }
        int deviceScore = ((IDeviceInfoProxy) RVProxy.get(IDeviceInfoProxy.class)).getDeviceScore();
        if (deviceScore >= 80) {
            return 0;
        }
        if (deviceScore >= 60) {
            return 1;
        }
        return 2;
    }

    public Map<String, WeakReference<TRWidgetInstance>> e(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("36711158", new Object[]{this, str});
        }
        if (!((HashMap) b).containsKey(str)) {
            if ("default".equals(str)) {
                ((HashMap) b).put(str, new HashMap());
            } else {
                ((HashMap) b).put(str, new LinkedHashMap<String, WeakReference<TRWidgetInstance>>(c, 0.75f, true) { // from class: com.alibaba.triver.cannal_engine.manager.TRWidgetInstanceManager.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str2, Object... objArr) {
                        str2.hashCode();
                        int hashCode = str2.hashCode();
                        throw new InstantReloadException("String switch could not find '" + str2 + "' with hashcode " + hashCode + " in com/alibaba/triver/cannal_engine/manager/TRWidgetInstanceManager$1");
                    }

                    @Override // java.util.LinkedHashMap
                    public boolean removeEldestEntry(Map.Entry<String, WeakReference<TRWidgetInstance>> entry) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return ((Boolean) ipChange2.ipc$dispatch("6471a6cf", new Object[]{this, entry})).booleanValue();
                        }
                        if (size() <= TRWidgetInstanceManager.a()) {
                            return false;
                        }
                        if (!(entry == null || entry.getValue() == null || entry.getValue().get() == null)) {
                            RVLogger.e("TRWidgetInstanceManager", "remove instance in cache, scene id : " + str + ",cache id : " + entry.getKey());
                            entry.getValue().get().destroy();
                        }
                        return true;
                    }
                });
            }
        }
        return (Map) ((HashMap) b).get(str);
    }
}

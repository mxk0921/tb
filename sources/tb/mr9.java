package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidInstance;
import com.taobao.android.fluid.core.FluidInstanceConfig;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class mr9 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BIZ_NAME_RECOMMEND_TAB = FluidInstanceConfig.appendBizName(FluidInstanceConfig.CONTAINER_NAME_GG_TAG3, "video");
    public static final String TAG = "FluidPreloadInstanceManager";

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, FluidInstance> f24249a = new HashMap();

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
            return;
        }
        for (Map.Entry entry : new HashMap(this.f24249a).entrySet()) {
            FluidInstance fluidInstance = (FluidInstance) entry.getValue();
            if (fluidInstance != null && !fluidInstance.isDestroyed()) {
                fluidInstance.onDestroy();
            }
        }
        ((HashMap) this.f24249a).clear();
        ir9.b(TAG, "清空全部预加载视频流实例，当前缓存 FluidInstance 个数: " + ((HashMap) this.f24249a).size());
    }

    public FluidInstance b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FluidInstance) ipChange.ipc$dispatch("31a98ad1", new Object[]{this, str});
        }
        if (str == null) {
            return null;
        }
        FluidInstance fluidInstance = (FluidInstance) ((HashMap) this.f24249a).get(str);
        ir9.b(TAG, fluidInstance + " 预加载实例获取，bizName：" + str + "，当前保存 FluidInstance 个数: " + ((HashMap) this.f24249a).size());
        return fluidInstance;
    }

    public void c(String str, FluidInstance fluidInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9155105a", new Object[]{this, str, fluidInstance});
        } else if (str != null && fluidInstance != null) {
            ((HashMap) this.f24249a).put(str, fluidInstance);
            ir9.b(TAG, fluidInstance + " 预加载实例已缓存，bizName：" + str + "，当前保存 FluidInstance 个数: " + ((HashMap) this.f24249a).size());
        }
    }

    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39af3815", new Object[]{this, str});
        } else if (str != null) {
            ir9.b(TAG, ((FluidInstance) ((HashMap) this.f24249a).remove(str)) + " 预加载实例已移除，bizName：" + str + "，当前保存 FluidInstance 个数: " + ((HashMap) this.f24249a).size());
        }
    }

    static {
        t2o.a(468713785);
    }
}

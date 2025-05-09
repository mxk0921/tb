package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ic {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTIVITY_FPS_DISPATCHER = "ACTIVITY_FPS_DISPATCHER";
    public static final String ACTIVITY_LIFECYCLE_DISPATCHER = "ACTIVITY_LIFECYCLE_DISPATCHER";
    public static final String APPLICATION_BACKGROUND_CHANGED_DISPATCHER = "APPLICATION_BACKGROUND_CHANGED_DISPATCHER";
    public static final String APPLICATION_LOW_MEMORY_DISPATCHER = "APPLICATION_LOW_MEMORY_DISPATCHER";
    public static final String BATTERY_DISPATCHER = "BATTERY_DISPATCHER";
    public static final String CLOCKED_MEMORY_DISPATCHER = "CLOCKED_MEMORY_DISPATCHER";
    public static final String CUSTOM_PAGE_LIFECYCLE_DISPATCHER = "CUSTOM_PAGE_LIFECYCLE_DISPATCHER";
    public static final String FRAGMENT_LIFECYCLE_DISPATCHER = "FRAGMENT_LIFECYCLE_DISPATCHER";
    public static final String IMAGE_STAGE_DISPATCHER = "IMAGE_STAGE_DISPATCHER";
    public static final String LOOPER_HEAVY_MSG_DISPATCHER = "LOOPER_HEAVY_MSG_DISPATCHER";
    public static final String NETWORK_STAGE_DISPATCHER = "NETWORK_STAGE_DISPATCHER";
    public static final String PAGE_FIRST_FRAME_DISPATCHER = "PAGE_FIRST_FRAME_DISPATCHER";
    public static final String PAGE_LEAVE_DISPATCHER = "PAGE_LEAVE_DISPATCHER";
    public static final String PAGE_RENDER_DISPATCHER = "PAGE_RENDER_DISPATCHER";
    public static final String WINDOW_EVENT_DISPATCHER = "WINDOW_EVENT_DISPATCHER";

    public static zzb<?> a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zzb) ipChange.ipc$dispatch("877f9d60", new Object[]{str});
        }
        return yq7.b(str);
    }
}

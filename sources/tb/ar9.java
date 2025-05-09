package tb;

import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ar9 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PREFIX_FLUID_CARD_SERVICE = "CARD-";
    public static final String PREFIX_FLUID_CONTAINER_SERVICE = "CONTAINER-";
    public static final String PREFIX_FLUID_DATA_SERVICE = "DATA-";
    public static final String PREFIX_FLUID_DEVICE_SERVICE = "DEVICE-";
    public static final String PREFIX_FLUID_FEEDS_LIST_SERVICE = "LIST-";
    public static final String PREFIX_FLUID_GLOBAL_INTERACTION_SERVICE = "INTERACTION-";
    public static final String PREFIX_FLUID_INSTANCE = "INSTANCE-";
    public static final String PREFIX_FLUID_INTELLIGENCE_SERVICE = "INTELLIGENCE-";
    public static final String PREFIX_FLUID_MEDIA_SERVICE_LIVE = "LIVE-";
    public static final String PREFIX_FLUID_MEDIA_SERVICE_VIDEO = "VIDEO-";
    public static final String PREFIX_FLUID_MESSAGE_SERVICE = "MESSAGE-";
    public static final String PREFIX_FLUID_PRELOAD_SERVICE = "PRELOAD-";
    public static final String PREFIX_FLUID_SCENE_CONFIG_SERVICE = "SCENE-";
    public static final String PREFIX_FLUID_SDK = "SDK-";
    public static final String PREFIX_FLUID_SERVICE = "SERVICE-";
    public static final String PREFIX_FLUID_VIDEO_COLLECTION_SERVICE = "COLLECTION-";

    /* renamed from: a  reason: collision with root package name */
    public final String f15946a;
    public final String b;
    public final Map<String, String> c = new HashMap();
    public static final ar9 PRELOAD_SERVICE_CREATE_PRELOAD_TASK_IS_NULL = new ar9("PRELOAD-createPreloadTaskIsNull", "创建预加载任务为null");
    public static final ar9 PRELOAD_SERVICE_DOWNLOAD_VIDEO_ERROR = new ar9("PRELOAD-downloadVideoError", "下载视频失败");
    public static final ar9 CREATE_DWINSTANCE_ERROR = new ar9("PRELOAD-createDwInstanceError", "创建播放器失败");
    public static final ar9 COMPLETE_PARSE_VIDEO_RES_ERROR = new ar9("PRELOAD-completeParseVideoResError", "解析播控失败");
    public static final ar9 ICON_STREAM_REQUEST_VIDEO_INFO_ERROR = new ar9("PRELOAD-iconStreamRequestVideoInfoError", "小红点请求播控失败");
    public static final ar9 PRELOAD_WITH_DETAIL_ERROR = new ar9("PRELOAD-preloadWithDetailError", "请求detail失败");
    public static final ar9 ADD_VIDEO_VIEW_TO_CONTAINER_PAUSE_ERROR = new ar9("PRELOAD-addVideoViewToContainerPauseError", "添加view到containView错误");
    public static final ar9 ADD_VIDEO_VIEW_TO_CONTAINER_RESUME_ERROR = new ar9("PRELOAD-addVideoViewToContainerResumeError", "添加view到containView错误");
    public static final ar9 SERVICE_CONSTRUCTOR_ERROR = new ar9("SERVICE-1", "服务创建实例失败");
    public static final ar9 SERVICE_CREATE_ERROR = new ar9("SERVICE-2", "服务创建失败");
    public static final ar9 SERVICE_DESTROY_ERROR = new ar9("SERVICE-3", "服务销毁失败");
    public static final ar9 SERVICE_NOT_REGISTER = new ar9("SERVICE-4", "服务未注册");
    public static final ar9 SERVICE_REGISTER_REPEAT_ERROR = new ar9("SERVICE-5", "服务重复注册");
    public static final ar9 SERVICE_ERROR_INSTANCE = new ar9("SERVICE-6", "不是指定服务类型");
    public static final ar9 SERVICE_CLASS_NOT_INTERFACE = new ar9("SERVICE-7", "服务调用类不是接口");
    public static final ar9 SERVICE_REMOTE_NEW_INSTANCE_ERROR = new ar9("SERVICE-8", "远程服务反射创建实例失败");

    public ar9(String str, String str2) {
        this.f15946a = str;
        this.b = str2;
    }

    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c99da60a", new Object[]{this, str, str2});
        } else {
            ((HashMap) this.c).put(str, str2);
        }
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("841e9db9", new Object[]{this});
        }
        try {
            return JSON.toJSONString(this.c);
        } catch (Exception e) {
            ir9.c("FluidErrorCode", "getErrorArgsString", e);
            return "";
        }
    }

    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f72feefa", new Object[]{this});
        }
        return this.f15946a;
    }

    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e1cc388a", new Object[]{this});
        }
        return this.b;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "FluidErrorCode{mErrorCode='" + this.f15946a + "', mErrorMsg='" + this.b + "', mErrorArgs=" + this.c + '}';
    }

    static {
        t2o.a(468713782);
    }
}

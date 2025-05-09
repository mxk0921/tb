package com.alibaba.triver.cannal_engine.common;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.fks;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class TRWidgetConstant {
    public static final String CAMERA_FRAME_DETECT_ERROR = "CAMERA_FRAME_DETECT_ERROR";
    public static final String NATIVE_PERMISSION_DENIED = "NATIVE_PERMISSION_DENIED";
    public static final String WEEX_WIDGET_RENDER_ERROR = "renderError";
    public static final String WEEX_WIDGET_RENDER_START = "renderStart";
    public static final String WEEX_WIDGET_RENDER_SUCCESS = "renderSuccess";
    public static final String WIDGET_API_FAIL = "WIDGET_API_FAIL";
    public static final String WIDGET_CLOUD_FUNC_FAIL = "WIDGET_CLOUD_FUNC_FAIL";
    public static final String WIDGET_CONTAINER_ERR = "WIDGET_CONTAINER_ERR";
    public static final String WIDGET_MTOP_FAIL = "WIDGET_MTOP_FAIL";
    public static final String WIDGET_OFFLINE_ERROR_CODE = "AI_CODE_3003";
    public static final String WIDGET_TYPE_JS_ERROR = "RV_WIDGET_JS_ERROR";
    public static final fks CL_TRIVER_INITING = new fks("CL_TRIVER_INITING", "Triver初始化中");
    public static final fks CL_INVALID_URL = new fks("CL_INVALID_URL", "无效的Url");
    public static final fks CL_ENV_INIT_ERROR = new fks("CL_ENV_INIT_ERROR", "环境初始化异常");
    public static final fks CL_CONTEXT_ERROR = new fks("CL_CONTEXT_ERROR", "Context 异常");
    public static final fks CL_RENDER_CONTAINER_EMPTY = new fks("CL_RENDER_CONTAINER_EMPTY", "渲染容器异常");
    public static final fks CL_JS_ENGINE_INIT_FAIL = new fks("CL_JS_ENGINE_INIT_FAIL", "JSEngine初始化失败");
    public static final fks CL_REACTOR_INIT_FAIL = new fks("CL_REACTOR_INIT_FAIL", "Reactor初始化失败");
    public static final fks CL_APPX_LOAD_ERROR = new fks("CL_APPX_LOAD_ERROR", "卡片Appx加载失败");
    public static final fks CL_PAGE_JS_LOAD_ERROR = new fks("CL_PAGE_JS_LOAD_ERROR", "PageJS加载失败");
    public static final fks CL_UNI_COM_CREATE_FAIL = new fks("CL_UNI_COM_CREATE_FAIL", "unicorn实例创建失败");
    public static final fks CL_JSFM_LOAD_ERROR = new fks("CL_JSFM_LOAD_ERROR", "小部件jsFramwork加载失败");
    public static final fks CL_SCENE_NOT_FOUND = new fks("CL_SCENE_NOT_FOUND", "Scene  not found");
    public static final fks CL_INVALID_RUNTIME_TYPE = new fks("CL_INVALID_RUNTIME_TYPE", "无效的runtime type");
    public static final fks CL_APPX_MINIVERSION_ERROR = new fks("CL_APPX_MINIVERSION_ERROR", "当前框架版本不符合最低版本要求");
    public static final fks CL_PAGE_ERROR = new fks("CL_PAGE_ERROR", "页面错误，需要降级", "default", "bizError");
    public static final fks CL_ENGINE_RENDER_FAILED = new fks("CL_ENGINE_RENDER_FAILED", "小部件引擎渲染失败", "default", "engineError");
    public static final fks CL_ENGINE_MNN_FAILED = new fks("CL_ENGINE_MNN_FAILED", "小部件底层加载MNNPlugin失败", "default", "engineError");
    public static final fks CL_REMOTE_DOWNLOAD_FAILED = new fks("CL_REMOTE_DOWNLOAD_FAILED", "小部件远程化加载失败", "default", "containerError");

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public enum WidgetRenderMode {
        surface,
        texture;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(WidgetRenderMode widgetRenderMode, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/cannal_engine/common/TRWidgetConstant$WidgetRenderMode");
        }

        public static WidgetRenderMode valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (WidgetRenderMode) ipChange.ipc$dispatch("280ff5a6", new Object[]{str});
            }
            return (WidgetRenderMode) Enum.valueOf(WidgetRenderMode.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public enum WidgetState {
        INITING,
        RENDERING,
        SUCCESS,
        FAILED;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(WidgetState widgetState, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/cannal_engine/common/TRWidgetConstant$WidgetState");
        }

        public static WidgetState valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (WidgetState) ipChange.ipc$dispatch("423398a6", new Object[]{str});
            }
            return (WidgetState) Enum.valueOf(WidgetState.class, str);
        }
    }
}

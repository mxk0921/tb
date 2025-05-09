package com.taobao.android.live.plugin.atype.flexalocal.smartlayer.constant;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public enum SmartLayerConstant$SmartErrorCode {
    ERROR_CONTAINER_CREATE_HAS_LAYER("Error_Container_Create_HAS_LAYER", "有弹层在展示"),
    ERROR_CONTAINER_VIEW_MODEL_EMPTY("Error_Container_View_Model_Empty", "ViewModel为空"),
    ERROR_CONTAINER_VIEW_DATA_EMPTY("Error_Container_View_Data_Empty", "请求数据为空"),
    ERROR_CONTAINER_SHOW_LAYER_FAIL("Error_Container_Show_Layer_Fail", "创建弹层失败"),
    ERROR_CONTAINER_SHOW_LAYER_EXCEPTION("Error_Container_Show_Layer_Exception", "创建弹层异常"),
    ERROR_CONTROLLER_CREATE_NO_ROOT("Error_Controller_Create_No_Root", "没有根视图"),
    ERROR_CONTROLLER_RENDER_DX_ERROR("Error_Controller_Render_DX_Error", "DX渲染失败"),
    ERROR_CONTROLLER_RENDER_TEMPLATE_EMPTY("Error_Controller_Render_Template_EMPTY", "业务模版插件为空"),
    ERROR_CONTROLLER_DESTROY("Error_Controller_Destroy", "因页面销毁而关闭"),
    ERROR_CONTROLLER_RESUME_NO_ROOT("Error_Controller_Resume_No_Root", "回页面时没有根视图"),
    ERROR_CONTROLLER_RESUME_NO_NEED("Error_Controller_NO_NEED", "弹层不需要展示"),
    ERROR_CONTROLLER_RESUME_NO_DISPLAY("Error_Controller_NO_DISPLAY", "弹层还未展示被关闭"),
    ERROR_CONTROLLER_RESUME_NO_ENABLE_ENVIRONMENT("Error_Controller_NO_ENABLE_ENVIRONMENT", "不符合pop环境（横屏直播间或大屏设备）");
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String errorCode;
    public String errorMessage;

    SmartLayerConstant$SmartErrorCode(String str, String str2) {
        this.errorCode = str;
        this.errorMessage = str2;
    }

    public static /* synthetic */ Object ipc$super(SmartLayerConstant$SmartErrorCode smartLayerConstant$SmartErrorCode, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/smartlayer/constant/SmartLayerConstant$SmartErrorCode");
    }

    public static SmartLayerConstant$SmartErrorCode valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SmartLayerConstant$SmartErrorCode) ipChange.ipc$dispatch("36116d96", new Object[]{str});
        }
        return (SmartLayerConstant$SmartErrorCode) Enum.valueOf(SmartLayerConstant$SmartErrorCode.class, str);
    }
}

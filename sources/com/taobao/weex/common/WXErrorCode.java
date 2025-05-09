package com.taobao.weex.common;

import anet.channel.strategy.dispatch.DispatchCore;
import com.alibaba.android.umf.constants.UMFConstants$ErrorCode;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.mobile.auth.gatewayauth.Constant;

/* JADX WARN: Init of enum WHITE_SCREEN_REBOOT_EXCEED_LIMIT can be incorrect */
/* JADX WARN: Init of enum WHITE_SCREEN_RESPONSE_TIMEOUT can be incorrect */
/* JADX WARN: Init of enum WX_DEGRAD_EAGLE_RENDER_ERROR can be incorrect */
/* JADX WARN: Init of enum WX_DEGRAD_ERR can be incorrect */
/* JADX WARN: Init of enum WX_DEGRAD_ERR_BUNDLE_CONTENTTYPE_ERROR can be incorrect */
/* JADX WARN: Init of enum WX_DEGRAD_ERR_INSTANCE_CREATE_FAILED can be incorrect */
/* JADX WARN: Init of enum WX_DEGRAD_ERR_INSTANCE_CREATE_FAILED_JS can be incorrect */
/* JADX WARN: Init of enum WX_DEGRAD_ERR_NETWORK_BUNDLE_DOWNLOAD_FAILED can be incorrect */
/* JADX WARN: Init of enum WX_DEGRAD_ERR_NETWORK_CHECK_CONTENT_LENGTH_FAILED can be incorrect */
/* JADX WARN: Init of enum WX_DEGRAD_ERR_OTHER_CAUSE_DEGRADTOH5 can be incorrect */
/* JADX WARN: Init of enum WX_DEGRAD_FORCE_DOWNGRADE can be incorrect */
/* JADX WARN: Init of enum WX_DEGRAD_REMOTE_INSTALL_FAIL can be incorrect */
/* JADX WARN: Init of enum WX_DEGRAD_WAIT_INIT_TIMEOUT can be incorrect */
/* JADX WARN: Init of enum WX_ERROR_DOM_CREATEFINISH can be incorrect */
/* JADX WARN: Init of enum WX_ERROR_DOM_REFRESHFINISH can be incorrect */
/* JADX WARN: Init of enum WX_ERROR_WHITE_SCREEN can be incorrect */
/* JADX WARN: Init of enum WX_ERR_BAD_SO can be incorrect */
/* JADX WARN: Init of enum WX_ERR_COPY_FROM_APK can be incorrect */
/* JADX WARN: Init of enum WX_ERR_DOM_ADDELEMENT can be incorrect */
/* JADX WARN: Init of enum WX_ERR_DOM_ADDEVENT can be incorrect */
/* JADX WARN: Init of enum WX_ERR_DOM_CREATEBODY can be incorrect */
/* JADX WARN: Init of enum WX_ERR_DOM_MOVEELEMENT can be incorrect */
/* JADX WARN: Init of enum WX_ERR_DOM_REMOVEELEMENT can be incorrect */
/* JADX WARN: Init of enum WX_ERR_DOM_REMOVEEVENT can be incorrect */
/* JADX WARN: Init of enum WX_ERR_DOM_SCROLLTO can be incorrect */
/* JADX WARN: Init of enum WX_ERR_DOM_UPDATEATTRS can be incorrect */
/* JADX WARN: Init of enum WX_ERR_DOM_UPDATESTYLE can be incorrect */
/* JADX WARN: Init of enum WX_ERR_FIRST_DOM_ACTION_EXCEPTION can be incorrect */
/* JADX WARN: Init of enum WX_ERR_HASH_MAP_TMP can be incorrect */
/* JADX WARN: Init of enum WX_ERR_INVOKE_NATIVE can be incorrect */
/* JADX WARN: Init of enum WX_ERR_JSBUNDLE_DOWNLOAD can be incorrect */
/* JADX WARN: Init of enum WX_ERR_JSBUNDLE_EMPTY can be incorrect */
/* JADX WARN: Init of enum WX_ERR_JSC_CRASH can be incorrect */
/* JADX WARN: Init of enum WX_ERR_JSDOWNLOAD_END can be incorrect */
/* JADX WARN: Init of enum WX_ERR_JSDOWNLOAD_START can be incorrect */
/* JADX WARN: Init of enum WX_ERR_JSFUNC_PARAM can be incorrect */
/* JADX WARN: Init of enum WX_ERR_JSON_OBJECT can be incorrect */
/* JADX WARN: Init of enum WX_ERR_JS_EXECUTE can be incorrect */
/* JADX WARN: Init of enum WX_ERR_JS_FRAMEWORK can be incorrect */
/* JADX WARN: Init of enum WX_ERR_JS_REINIT_FRAMEWORK can be incorrect */
/* JADX WARN: Init of enum WX_ERR_LOAD_JSLIB can be incorrect */
/* JADX WARN: Init of enum WX_ERR_LOAD_SO can be incorrect */
/* JADX WARN: Init of enum WX_ERR_RELOAD_PAGE can be incorrect */
/* JADX WARN: Init of enum WX_ERR_RELOAD_PAGE_EXCEED_LIMIT can be incorrect */
/* JADX WARN: Init of enum WX_ERR_SINGLE_PROCESS_DLOPEN_FILE_NOT_EXIST can be incorrect */
/* JADX WARN: Init of enum WX_ERR_SINGLE_PROCESS_DLOPEN_FLAIED can be incorrect */
/* JADX WARN: Init of enum WX_ERR_SINGLE_PROCESS_DLSYM_FAILED can be incorrect */
/* JADX WARN: Init of enum WX_ERR_SINGLE_PROCESS_JS_FRAMEWORK can be incorrect */
/* JADX WARN: Init of enum WX_ERR_TEST can be incorrect */
/* JADX WARN: Init of enum WX_FORCEQJS_DEGRADE can be incorrect */
/* JADX WARN: Init of enum WX_JS_FRAMEWORK_INIT_FAILED can be incorrect */
/* JADX WARN: Init of enum WX_JS_FRAMEWORK_INIT_FAILED_FIND_ICU_TIMEOUT can be incorrect */
/* JADX WARN: Init of enum WX_JS_FRAMEWORK_INIT_FAILED_PARAMS_NULL can be incorrect */
/* JADX WARN: Init of enum WX_JS_FRAMEWORK_INIT_MULPROCESS_FAILED can be incorrect */
/* JADX WARN: Init of enum WX_JS_FRAMEWORK_INIT_SINGLE_PROCESS_SUCCESS can be incorrect */
/* JADX WARN: Init of enum WX_JS_FRAMEWORK_INIT_SUCCESS can be incorrect */
/* JADX WARN: Init of enum WX_JS_FRAMEWORK_REINIT_MULPROCESS_FAILED can be incorrect */
/* JADX WARN: Init of enum WX_JS_FRAMEWORK_REINIT_SUCCESS can be incorrect */
/* JADX WARN: Init of enum WX_KEY_EXCEPTION_HERON can be incorrect */
/* JADX WARN: Init of enum WX_KEY_EXCEPTION_HERON_RENDER can be incorrect */
/* JADX WARN: Init of enum WX_KEY_EXCEPTION_INVOKE_BRIDGE can be incorrect */
/* JADX WARN: Init of enum WX_KEY_EXCEPTION_INVOKE_JSSERVICE_EXECUTE can be incorrect */
/* JADX WARN: Init of enum WX_KEY_EXCEPTION_INVOKE_REGISTER_COMPONENT can be incorrect */
/* JADX WARN: Init of enum WX_KEY_EXCEPTION_INVOKE_REGISTER_CONTENT_FAILED can be incorrect */
/* JADX WARN: Init of enum WX_KEY_EXCEPTION_INVOKE_REGISTER_MODULES can be incorrect */
/* JADX WARN: Init of enum WX_KEY_EXCEPTION_JS_DOWNLOAD can be incorrect */
/* JADX WARN: Init of enum WX_KEY_EXCEPTION_JS_DOWNLOAD_FAILED can be incorrect */
/* JADX WARN: Init of enum WX_KEY_EXCEPTION_NO_BUNDLE_TYPE can be incorrect */
/* JADX WARN: Init of enum WX_KEY_EXCEPTION_SDK_INIT can be incorrect */
/* JADX WARN: Init of enum WX_KEY_EXCEPTION_SDK_INIT_CPU_NOT_SUPPORT can be incorrect */
/* JADX WARN: Init of enum WX_KEY_EXCEPTION_SDK_INIT_JSFM_INIT_FAILED can be incorrect */
/* JADX WARN: Init of enum WX_KEY_EXCEPTION_SDK_INIT_TABLE_NOT_SUPPORT can be incorrect */
/* JADX WARN: Init of enum WX_KEY_EXCEPTION_WXBRIDGE can be incorrect */
/* JADX WARN: Init of enum WX_KEY_EXCEPTION_WXBRIDGE_EXCEPTION can be incorrect */
/* JADX WARN: Init of enum WX_RENDER_ERR_BRIDGE_ARG_NULL can be incorrect */
/* JADX WARN: Init of enum WX_RENDER_ERR_CALL_NATIVE_MODULE can be incorrect */
/* JADX WARN: Init of enum WX_RENDER_ERR_COMPONENT_ATTR_KEY can be incorrect */
/* JADX WARN: Init of enum WX_RENDER_ERR_COMPONENT_NOT_REGISTER can be incorrect */
/* JADX WARN: Init of enum WX_RENDER_ERR_CONTAINER_TYPE can be incorrect */
/* JADX WARN: Init of enum WX_RENDER_ERR_INSTANCE_ID_NULL can be incorrect */
/* JADX WARN: Init of enum WX_RENDER_ERR_JS_CREATE_INSTANCE can be incorrect */
/* JADX WARN: Init of enum WX_RENDER_ERR_JS_CREATE_INSTANCE_CONTEXT can be incorrect */
/* JADX WARN: Init of enum WX_RENDER_ERR_LAYER_OVERFLOW can be incorrect */
/* JADX WARN: Init of enum WX_RENDER_ERR_LIST_INVALID_COLUMN_COUNT can be incorrect */
/* JADX WARN: Init of enum WX_RENDER_ERR_NATIVE_RUNTIME can be incorrect */
/* JADX WARN: Init of enum WX_RENDER_ERR_NULL_KEY can be incorrect */
/* JADX WARN: Init of enum WX_RENDER_ERR_TEXTURE_SETBACKGROUND can be incorrect */
/* JADX WARN: Init of enum WX_RENDER_ERR_TRANSITION can be incorrect */
/* JADX WARN: Init of enum WX_RENDER_WAR_GPU_LIMIT_LAYOUT can be incorrect */
/* JADX WARN: Init of enum WX_SUCCESS can be incorrect */
/* JADX WARN: Init of enum WX_USER_CANCEL_REMOTE_INSTALL can be incorrect */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public enum WXErrorCode {
    WX_ERR_LOAD_SO(UMFConstants$ErrorCode.WORKFLOW_CONTAIN_NO_EXECUTOR, "load so error", r8, r9),
    WX_ERR_LOAD_JSLIB("-2002", "unzip JSLib error!", r8, r9),
    WX_ERR_BAD_SO("-2003", "so size error, to reload apk so", r8, r9),
    WX_ERR_COPY_FROM_APK("-2007", "system load so error，copy from APK also error!", r8, r9),
    WX_ERR_JSFUNC_PARAM("-2009", "JS params error!", r8, r9),
    WX_ERR_JSON_OBJECT("-2008", "transform JSON->OBJ  error!", r8, r9),
    WX_ERR_INVOKE_NATIVE("-2012", "Native-> Call ->JS  error!", r8, r9),
    WX_ERR_JS_EXECUTE("-2013", "JavaScript execute error!", r24, r25),
    WX_SUCCESS("0", "successful", r8, r9),
    WX_ERR_DOM_CREATEBODY("-2100", "createBody error", r8, r9),
    WX_ERR_DOM_UPDATEATTRS("-2101", "updateAttrs error", r8, r9),
    WX_ERR_DOM_UPDATESTYLE("-2102", "updateStyle error", r8, r9),
    WX_ERR_DOM_ADDELEMENT("-2103", "addElement error", r8, r9),
    WX_ERR_DOM_REMOVEELEMENT("-2104", "removeElement error", r8, r9),
    WX_ERR_DOM_MOVEELEMENT("-2105", "moveElement error", r8, r9),
    WX_ERR_DOM_ADDEVENT("-2106", "addEvent error", r8, r9),
    WX_ERR_DOM_REMOVEEVENT("-2107", "removeEvent error", r8, r9),
    WX_ERROR_DOM_CREATEFINISH("-2108", "createFinish error", r8, r9),
    WX_ERROR_DOM_REFRESHFINISH("-2109", "refreshFinish error", r8, r9),
    WX_ERR_DOM_SCROLLTO("-2110", "scrollToElement", r8, r9),
    WX_ERR_RELOAD_PAGE("-2111", "reloadPage", r8, r9),
    WX_ERR_RELOAD_PAGE_EXCEED_LIMIT("-2114", "RELOAD_PAGE_EXCEED_LIMIT", r8, r9),
    WX_ERROR_WHITE_SCREEN("-2116", "WHITE_SCREEN", r34, r25),
    WHITE_SCREEN_RESPONSE_TIMEOUT("-2117", "WHITE_SCREEN_RESPONSE_TIMEOUT", r34, r25),
    WHITE_SCREEN_REBOOT_EXCEED_LIMIT("-2118", "WHITE_SCREEN_REBOOT_EXCEED_LIMIT", r34, r25),
    WX_ERR_JSC_CRASH("-2112", "weexjscCrash", r8, r9),
    WX_ERR_FIRST_DOM_ACTION_EXCEPTION("-2113", "dom action is invalid ", r8, r9),
    WX_ERR_JSDOWNLOAD_START("-2201", "js bundle download start", r8, r9),
    WX_ERR_JSBUNDLE_DOWNLOAD("-2299", "js bundle download err", r8, r9),
    WX_ERR_JSBUNDLE_EMPTY("-2203", "js bundle empty", r8, r9),
    WX_ERR_JSDOWNLOAD_END("-2299", "js bundle download end", r8, r9),
    WX_JS_FRAMEWORK_INIT_SUCCESS("-1000", "js framework success", r8, r9),
    WX_JS_FRAMEWORK_REINIT_SUCCESS("-1001", "js framework reinit success", r8, r9),
    WX_ERR_JS_FRAMEWORK("-1002", "js framework error", r8, r9),
    WX_ERR_JS_REINIT_FRAMEWORK(DispatchCore.CHECK_SIGN_FAIL, "js reinit framework error", r8, r9),
    WX_ERR_SINGLE_PROCESS_DLOPEN_FILE_NOT_EXIST(DispatchCore.RESOLVE_ANSWER_FAIL, "so file does not exist", r8, r9),
    WX_ERR_SINGLE_PROCESS_DLOPEN_FLAIED("-1005", "dlopen so file failed", r8, r9),
    WX_ERR_SINGLE_PROCESS_DLSYM_FAILED("-1006", "find function from so file failed", r8, r9),
    WX_ERR_SINGLE_PROCESS_JS_FRAMEWORK("-1007", "js framework  init singleProcess failed", r8, r9),
    WX_JS_FRAMEWORK_INIT_MULPROCESS_FAILED("-1008", "js framework init multiProcess failed", r8, r9),
    WX_JS_FRAMEWORK_REINIT_MULPROCESS_FAILED("-1009", "js framework reinit multiProcess failed", r8, r9),
    WX_JS_FRAMEWORK_INIT_FAILED("-1010", "js framework init failed", r8, r9),
    WX_JS_FRAMEWORK_INIT_SINGLE_PROCESS_SUCCESS("-1011", "js framework init success in single process", r8, r9),
    WX_JS_FRAMEWORK_INIT_FAILED_PARAMS_NULL("-1012", "js framework init failed due to params null", r8, r9),
    WX_JS_FRAMEWORK_INIT_FAILED_FIND_ICU_TIMEOUT("-1013", "find icu failed", r8, r9),
    WX_KEY_EXCEPTION_SDK_INIT("-9000", "[WX_KEY_EXCEPTION_SDK_INIT]", r8, r9),
    WX_KEY_EXCEPTION_SDK_INIT_CPU_NOT_SUPPORT("-9001", "[WX_KEY_EXCEPTION_SDK_INIT_CPU_NOT_SUPPORT] for android cpu is x86", r8, r9),
    WX_KEY_EXCEPTION_SDK_INIT_TABLE_NOT_SUPPORT("-9002", "[WX_KEY_EXCEPTION_SDK_INIT_TABLE_NOT_SUPPORT] for device isTabletDevice", r8, r9),
    WX_KEY_EXCEPTION_SDK_INIT_JSFM_INIT_FAILED("-9003", "[WX_KEY_EXCEPTION_SDK_INIT_JSFM_INIT_FAILED] for jsfm init failed|detail error is:", r8, r9),
    WX_KEY_EXCEPTION_INVOKE_BRIDGE("-9100", "[WX_KEY_EXCEPTION_INVOKE_BRIDGE]", r8, r9),
    WX_KEY_EXCEPTION_INVOKE_REGISTER_CONTENT_FAILED("-9101", "[WX_KEY_EXCEPTION_INVOKE_REGISTER_CONTENT_FAILED] details", r8, r9),
    WX_KEY_EXCEPTION_INVOKE_JSSERVICE_EXECUTE("-9102", "[WX_KEY_EXCEPTION_INVOKE_JSSERVICE_EXECUTE] details", r8, r9),
    WX_KEY_EXCEPTION_INVOKE_REGISTER_MODULES("-9103", "[WX_KEY_EXCEPTION_INVOKE_REGISTER_MODULES] details", r8, r9),
    WX_KEY_EXCEPTION_INVOKE_REGISTER_COMPONENT("-9104", "[WX_KEY_EXCEPTION_INVOKE_REGISTER_COMPONENT] details", r8, r9),
    WX_KEY_EXCEPTION_JS_DOWNLOAD("-9200", "[WX_KEY_EXCEPTION_JS_DOWNLOAD]|", r67, r9),
    WX_KEY_EXCEPTION_JS_DOWNLOAD_FAILED("-9201", "[WX_KEY_EXCEPTION_JS_DOWNLOAD_FAILED] | details", r67, r9),
    WX_KEY_EXCEPTION_WXBRIDGE("-9400", "[js excute runtime error] detail js stack -> ", r24, r25),
    WX_KEY_EXCEPTION_WXBRIDGE_EXCEPTION("-9401", "[js excute runtime error] detail js stack -> ", r24, r25),
    WX_RENDER_ERR_JS_CREATE_INSTANCE("-9600", "white screen cause create instance failed,check js stack ->", r34, r25),
    WX_RENDER_ERR_JS_CREATE_INSTANCE_CONTEXT("-9700", "white screen cause create instanceContext failed,check js stack ->", r34, r25),
    WX_RENDER_ERR_LAYER_OVERFLOW("-9602", "WX_RENDER_ERR_LAYER_OVERFLOW", r8, r9),
    WX_RENDER_ERR_NULL_KEY("-9603", "WX_RENDER_ERR_NULL_KEY", r8, r9),
    WX_RENDER_ERR_NATIVE_RUNTIME("-9604", "WX_RENDER_ERR for js error", r34, r9),
    WX_RENDER_ERR_COMPONENT_NOT_REGISTER("-9605", "WX_RENDER_ERR_COMPONENT_NOT_REGISTER", r8, r9),
    WX_RENDER_ERR_COMPONENT_ATTR_KEY("-9606", "The key passed to Component.updateAttr() is not string", r8, r25),
    WX_RENDER_ERR_BRIDGE_ARG_NULL("-9610", "WX_RENDER_ERR_BRIDGE_ARG_NULL", r8, r9),
    WX_RENDER_ERR_CONTAINER_TYPE("-9611", "WX_RENDER_ERR_CONTAINER_TYPE", r24, r25),
    WX_RENDER_ERR_TRANSITION("-9616", "WX_RENDER_ERR_TRANSITION", r24, r25),
    WX_RENDER_ERR_INSTANCE_ID_NULL("-9618", "WX_RENDER_ERR_INSTANCE_ID_NULL", r8, r9),
    WX_RENDER_ERR_LIST_INVALID_COLUMN_COUNT("-9619", "WX_RENDER_ERR_LIST_INVALID_COLUMNJ_CONUNT", r24, r25),
    WX_RENDER_ERR_TEXTURE_SETBACKGROUND("-9620", "WX_RENDER_ERR_TEXTURE_SETBACKGROUND", r8, r9),
    WX_RENDER_WAR_GPU_LIMIT_LAYOUT("-9621", "WX_RENDER_WAR_GPU_LIMIT_LAYOUT", r24, r25),
    WX_RENDER_ERR_CALL_NATIVE_MODULE("-9622", "WX_CALL_NATIVE_MODULE_ERROR", r8, r9),
    WX_KEY_EXCEPTION_HERON("Heron_-9900", "Error of Heron engine: ", r8, r9),
    WX_KEY_EXCEPTION_HERON_RENDER("Heron_-9901", "Render error of Heron engine: ", r34, r9),
    WX_KEY_EXCEPTION_NO_BUNDLE_TYPE("-9801", "Fatal Error : No bundle type in js bundle head, cause white screen or memory leak!!", r24, r25),
    WX_DEGRAD_ERR("-1000", "degradeToH5|Weex DegradPassivity ->", r89, r25),
    WX_DEGRAD_ERR_INSTANCE_CREATE_FAILED("-1001", "degradeToH5|createInstance fail|wx_create_instance_error", r89, r9),
    WX_DEGRAD_ERR_NETWORK_BUNDLE_DOWNLOAD_FAILED("-1002", "|wx_network_error|js bundle download failed", r67, r9),
    WX_DEGRAD_ERR_NETWORK_CHECK_CONTENT_LENGTH_FAILED(DispatchCore.CHECK_SIGN_FAIL, "degradeToH5|wx_network_error|js bundle content-length check failed", r89, r9),
    WX_DEGRAD_ERR_BUNDLE_CONTENTTYPE_ERROR(DispatchCore.RESOLVE_ANSWER_FAIL, "degradeToH5|wx_user_intercept_error |Content-Type is not application/javascript, Weex render template must be javascript, please check your request!", r89, r9),
    WX_DEGRAD_ERR_OTHER_CAUSE_DEGRADTOH5("-1005", "degradeToH5|for other reason|", r89, r9),
    WX_DEGRAD_ERR_INSTANCE_CREATE_FAILED_JS("-1006", "degradeToH5|createInstance fail|wx_create_instance_error", r89, r25),
    WX_DEGRAD_EAGLE_RENDER_ERROR("Eagle_-1007", "degradeToH5|eagleRenderErr", r89, r9),
    WX_DEGRAD_WAIT_INIT_TIMEOUT("-1009", "degradeToH5|waitInitTimeout", r89, r9),
    WX_DEGRAD_REMOTE_INSTALL_FAIL("-10011", "degradeToH5|remoteInitFail", r34, r9),
    WX_USER_CANCEL_REMOTE_INSTALL("-10012", "userCancel while remoteInit", r34, r9),
    WX_DEGRAD_FORCE_DOWNGRADE("-10013", "degradeToH5|forceDowngrade", r34, r9),
    WX_ERR_HASH_MAP_TMP(Constant.CODE_ERROR_FUNCTION_LIMIT, "WX_ERR_HASH_MAP_TMP", r8, r9),
    WX_FORCEQJS_DEGRADE("-1008", "degradeToH5|forceQJSMode", r89, r9),
    WX_ERR_TEST("test", "test", r8, r9);
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String appendMsg = "";
    private String args;
    private String errorCode;
    private String errorMsg;
    private ErrorGroup mErrorGroup;
    private ErrorType mErrorType;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public enum ErrorGroup {
        JS,
        NATIVE;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(ErrorGroup errorGroup, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/weex/common/WXErrorCode$ErrorGroup");
        }

        public static ErrorGroup valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ErrorGroup) ipChange.ipc$dispatch("bd32153a", new Object[]{str});
            }
            return (ErrorGroup) Enum.valueOf(ErrorGroup.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public enum ErrorType {
        JS_ERROR,
        NATIVE_ERROR,
        RENDER_ERROR,
        DEGRAD_ERROR,
        DOWN_LOAD_ERROR;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(ErrorType errorType, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/weex/common/WXErrorCode$ErrorType");
        }

        public static ErrorType valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ErrorType) ipChange.ipc$dispatch("bc8230e3", new Object[]{str});
            }
            return (ErrorType) Enum.valueOf(ErrorType.class, str);
        }
    }

    static {
        ErrorType errorType = ErrorType.NATIVE_ERROR;
        ErrorGroup errorGroup = ErrorGroup.NATIVE;
        ErrorType errorType2 = ErrorType.JS_ERROR;
        ErrorGroup errorGroup2 = ErrorGroup.JS;
        ErrorType errorType3 = ErrorType.RENDER_ERROR;
        ErrorType errorType4 = ErrorType.DOWN_LOAD_ERROR;
        ErrorType errorType5 = ErrorType.DEGRAD_ERROR;
    }

    WXErrorCode(String str, String str2, ErrorType errorType, ErrorGroup errorGroup) {
        this.errorCode = str;
        this.errorMsg = str2;
        this.mErrorType = errorType;
        this.mErrorGroup = errorGroup;
    }

    public static /* synthetic */ Object ipc$super(WXErrorCode wXErrorCode, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/weex/common/WXErrorCode");
    }

    public static WXErrorCode valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WXErrorCode) ipChange.ipc$dispatch("3ba4e641", new Object[]{str});
        }
        return (WXErrorCode) Enum.valueOf(WXErrorCode.class, str);
    }

    public void appendErrMsg(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("630735a7", new Object[]{this, str});
        } else {
            this.appendMsg = str;
        }
    }

    public String getArgs() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1fd71786", new Object[]{this});
        }
        return this.args;
    }

    public String getErrorCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f72feefa", new Object[]{this});
        }
        return this.errorCode;
    }

    public ErrorGroup getErrorGroup() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ErrorGroup) ipChange.ipc$dispatch("4c881595", new Object[]{this});
        }
        return this.mErrorGroup;
    }

    public String getErrorMsg() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e1cc388a", new Object[]{this});
        }
        return this.errorMsg + this.appendMsg;
    }

    public ErrorType getErrorType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ErrorType) ipChange.ipc$dispatch("a3abeda9", new Object[]{this});
        }
        return this.mErrorType;
    }

    public void setArgs(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f8b19b0", new Object[]{this, str});
        } else {
            this.args = str;
        }
    }
}

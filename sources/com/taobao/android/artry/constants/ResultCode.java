package com.taobao.android.artry.constants;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public enum ResultCode {
    SUCCESS,
    ENGINE_GRAPH_NULL_FROM_WALLE,
    ENGINE_FAILED_LOAD_SO,
    ENGINE_SO_DOWNLOAD_ERROR,
    FAILURE_TAKE_PICTURE_ERROR,
    FAILURE_NOT_SUPPORT_JPEG,
    FAILURE_INVALIDATE_PARAM,
    FAILURE_NULL_RESULT,
    FAILURE_NULL_RESULT_CODE,
    FAILURE_INTERNAL,
    CAMERA_PERMISSION_ERROR,
    FAILED_TO_UPLOAD_PICTURE,
    CV_ALGORITHM_ERROR;
    
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(ResultCode resultCode, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/artry/constants/ResultCode");
    }

    public static ResultCode valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ResultCode) ipChange.ipc$dispatch("40752f48", new Object[]{str});
        }
        return (ResultCode) Enum.valueOf(ResultCode.class, str);
    }
}

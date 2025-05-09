package com.alibaba.security.ccrc.service.enums;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.f;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public enum WukongResultCode {
    ACTIVATE_SUCCESS(100000),
    ACTIVATE_ING(1000001),
    ACTIVATED(1000002),
    UN_ACTIVATE(1000003),
    ACTIVATE_FAIL(1000004),
    DETECT_HIT_ACTION(f.DX_ERROR_CODE_SLIDER_LAYOUT_ITEM_COUNT_0),
    DETECT_NO_HIT(200002),
    DETECT_HIT_NO_ACTION(200001),
    DETECT_PRE_FAIL(200003),
    DETECT_ENGINE_EVALUATE_FAIL(f.DX_ERROR_CODE_SLIDER_LAYOUT_IDLE_SCROLL_TO_FAILED);
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final int code;

    WukongResultCode(int i) {
        this.code = i;
    }

    public static /* synthetic */ Object ipc$super(WukongResultCode wukongResultCode, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/security/ccrc/service/enums/WukongResultCode");
    }

    public static WukongResultCode valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WukongResultCode) ipChange.ipc$dispatch("1dbddfc0", new Object[]{str});
        }
        return (WukongResultCode) Enum.valueOf(WukongResultCode.class, str);
    }

    public int getCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("480bb15d", new Object[]{this})).intValue();
        }
        return this.code;
    }
}

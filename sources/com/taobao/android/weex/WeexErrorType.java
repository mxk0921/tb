package com.taobao.android.weex;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.model.message.PowerMsgType;
import tb.cdw;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public enum WeexErrorType {
    ERR_BIN_DECODE(0),
    ERR_RENDER(1),
    FATAL_RENDER(2),
    ERR_REFRESH(3),
    FATAL_REFRESH(4),
    ERR_INVOKE_CALLBACK(5),
    FATAL_INVOKE_CALLBACK(6),
    ERR_FIRE_EVENT(7),
    FATAL_FIRE_EVENT(8),
    ERR_WINDOW_MSG(9),
    FATAL_WINDOW_MSG(10),
    JS_ERR(11),
    FATAL_ERR(12),
    ERR_DESTROY(13),
    HTTP_ERROR(14),
    ERR_EXECUTE(15),
    FATAL_EXECUTE(16),
    ERR_DISPATCH_EVENT(17),
    FATAL_DISPATCH_EVENT(18),
    UNKNOWN(100),
    WHITE_SCREEN(cdw.T_CORNER_RADIUS),
    JS_RUNTIME_ERROR(cdw.T_GRADIENT_BACKGROUND_COLOR),
    IMAGE_ERROR(cdw.T_ALPHA),
    VIDEO_ERROR(10021),
    RESERVE0(10022),
    FATAL(10023),
    SO_LOAD_FAIL(10024),
    JS_ERROR(10025),
    JS_ENGINE_ERROR(10026),
    MTOP_ERROR(10027),
    WEEX_FRAMEWORK(10028),
    UNICORN(10029),
    AREA_COVERAGE(10030),
    WHITE_SCREEN_PLATFORM_VIEW(PowerMsgType.userLevelEnter),
    WIDGET(10032),
    BUSINESS(PowerMsgType.fansLevelUpgrade),
    WHITE_SCREEN_GE_5S(10034),
    BIZ_CUSTOM_REPORT(10035),
    COMPONENT_COUNT(PowerMsgType.infoCardMsg);
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final int errCode;

    WeexErrorType(int i) {
        this.errCode = i;
    }

    public static /* synthetic */ Object ipc$super(WeexErrorType weexErrorType, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex/WeexErrorType");
    }

    public static WeexErrorType transformErrorType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexErrorType) ipChange.ipc$dispatch("c70ad8f1", new Object[]{new Integer(i)});
        }
        WeexErrorType[] values = values();
        if (i >= 100) {
            int ordinal = (i - 10018) + WHITE_SCREEN.ordinal();
            WeexErrorType weexErrorType = UNKNOWN;
            if (ordinal <= weexErrorType.ordinal() || ordinal >= values.length) {
                return weexErrorType;
            }
            return values[ordinal];
        } else if (i < 0 || i >= UNKNOWN.ordinal()) {
            return UNKNOWN;
        } else {
            return values[i];
        }
    }

    public static WeexErrorType valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexErrorType) ipChange.ipc$dispatch("8c4074a4", new Object[]{str});
        }
        return (WeexErrorType) Enum.valueOf(WeexErrorType.class, str);
    }
}

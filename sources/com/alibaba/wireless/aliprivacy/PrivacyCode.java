package com.alibaba.wireless.aliprivacy;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public enum PrivacyCode {
    SUCCESS(0),
    ERROR_INPUT_PARAMS(-1),
    ERROR_EMPTY_SCENE_CODE(-2),
    ERROR_EMPTY_PERMISSIONS(-3),
    ERROR_WRITE_CACHE(-4);
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final int code;

    PrivacyCode(int i) {
        this.code = i;
    }

    public static /* synthetic */ Object ipc$super(PrivacyCode privacyCode, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/wireless/aliprivacy/PrivacyCode");
    }

    public static PrivacyCode valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PrivacyCode) ipChange.ipc$dispatch("718a260a", new Object[]{str});
        }
        return (PrivacyCode) Enum.valueOf(PrivacyCode.class, str);
    }

    public int getCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("480bb15d", new Object[]{this})).intValue();
        }
        return this.code;
    }
}

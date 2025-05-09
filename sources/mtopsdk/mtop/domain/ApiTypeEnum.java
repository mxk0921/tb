package mtopsdk.mtop.domain;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public enum ApiTypeEnum {
    ISV_OPEN_API("isv_open_api");
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String apiType;

    ApiTypeEnum(String str) {
        this.apiType = str;
    }

    public static /* synthetic */ Object ipc$super(ApiTypeEnum apiTypeEnum, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in mtopsdk/mtop/domain/ApiTypeEnum");
    }

    public static ApiTypeEnum valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ApiTypeEnum) ipChange.ipc$dispatch("ee9069b6", new Object[]{str});
        }
        return (ApiTypeEnum) Enum.valueOf(ApiTypeEnum.class, str);
    }

    public String getApiType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1cffc57b", new Object[]{this});
        }
        return this.apiType;
    }
}

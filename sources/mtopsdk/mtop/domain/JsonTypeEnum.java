package mtopsdk.mtop.domain;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public enum JsonTypeEnum {
    JSON("json"),
    ORIGINALJSON("originaljson");
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String jsonType;

    JsonTypeEnum(String str) {
        this.jsonType = str;
    }

    public static /* synthetic */ Object ipc$super(JsonTypeEnum jsonTypeEnum, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in mtopsdk/mtop/domain/JsonTypeEnum");
    }

    public static JsonTypeEnum valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JsonTypeEnum) ipChange.ipc$dispatch("5d3fffc8", new Object[]{str});
        }
        return (JsonTypeEnum) Enum.valueOf(JsonTypeEnum.class, str);
    }

    public String getJsonType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("da5b7841", new Object[]{this});
        }
        return this.jsonType;
    }
}

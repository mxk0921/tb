package mtopsdk.mtop.domain;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public enum MethodEnum {
    GET("GET"),
    POST("POST"),
    HEAD("HEAD"),
    PATCH("PATCH");
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String method;

    MethodEnum(String str) {
        this.method = str;
    }

    public static /* synthetic */ Object ipc$super(MethodEnum methodEnum, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in mtopsdk/mtop/domain/MethodEnum");
    }

    public static MethodEnum valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MethodEnum) ipChange.ipc$dispatch("4c3f1a89", new Object[]{str});
        }
        return (MethodEnum) Enum.valueOf(MethodEnum.class, str);
    }

    public String getMethod() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5e63d782", new Object[]{this});
        }
        return this.method;
    }
}

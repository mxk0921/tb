package mtopsdk.mtop.domain;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.h1p;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public enum ProtocolEnum {
    HTTP(h1p.HTTP_PREFIX),
    HTTPSECURE(h1p.HTTPS_PREFIX);
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String protocol;

    ProtocolEnum(String str) {
        this.protocol = str;
    }

    public static /* synthetic */ Object ipc$super(ProtocolEnum protocolEnum, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in mtopsdk/mtop/domain/ProtocolEnum");
    }

    public static ProtocolEnum valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ProtocolEnum) ipChange.ipc$dispatch("3342b332", new Object[]{str});
        }
        return (ProtocolEnum) Enum.valueOf(ProtocolEnum.class, str);
    }

    public String getProtocol() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("98ee17ab", new Object[]{this});
        }
        return this.protocol;
    }
}

package mtopsdk.xstate;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public enum NetworkClassEnum {
    NET_WIFI("WIFI"),
    NET_2G("2G"),
    NET_3G("3G"),
    NET_4G("4G"),
    NET_UNKONWN("UNKONWN"),
    NET_NO("NET_NO"),
    NET_ETHERNET("NET_ETHERNET"),
    NET_5G("5G");
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String netClass;

    NetworkClassEnum(String str) {
        this.netClass = str;
    }

    public static /* synthetic */ Object ipc$super(NetworkClassEnum networkClassEnum, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in mtopsdk/xstate/NetworkClassEnum");
    }

    public static NetworkClassEnum valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NetworkClassEnum) ipChange.ipc$dispatch("d11ed1a6", new Object[]{str});
        }
        return (NetworkClassEnum) Enum.valueOf(NetworkClassEnum.class, str);
    }

    public String getNetClass() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2187d448", new Object[]{this});
        }
        return this.netClass;
    }
}

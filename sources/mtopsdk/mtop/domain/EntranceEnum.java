package mtopsdk.mtop.domain;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public enum EntranceEnum {
    GW_INNER("gw"),
    GW_OPEN("gw-open");
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String entrance;

    EntranceEnum(String str) {
        this.entrance = str;
    }

    public static /* synthetic */ Object ipc$super(EntranceEnum entranceEnum, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in mtopsdk/mtop/domain/EntranceEnum");
    }

    public static EntranceEnum valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EntranceEnum) ipChange.ipc$dispatch("a8f199d4", new Object[]{str});
        }
        return (EntranceEnum) Enum.valueOf(EntranceEnum.class, str);
    }

    public String getEntrance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9b8f7a4d", new Object[]{this});
        }
        return this.entrance;
    }
}

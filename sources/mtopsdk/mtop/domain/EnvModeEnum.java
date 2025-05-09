package mtopsdk.mtop.domain;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public enum EnvModeEnum {
    ONLINE(0),
    PREPARE(1),
    TEST(2),
    TEST_SANDBOX(3);
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int envMode;

    EnvModeEnum(int i) {
        this.envMode = i;
    }

    public static /* synthetic */ Object ipc$super(EnvModeEnum envModeEnum, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in mtopsdk/mtop/domain/EnvModeEnum");
    }

    public static EnvModeEnum valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EnvModeEnum) ipChange.ipc$dispatch("b3d2c77a", new Object[]{str});
        }
        return (EnvModeEnum) Enum.valueOf(EnvModeEnum.class, str);
    }

    public int getEnvMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c6022b74", new Object[]{this})).intValue();
        }
        return this.envMode;
    }
}

package anetwork.channel.monitor.speed;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public enum NetworkSpeed {
    Slow("弱网络", 1),
    Fast("强网络", 5);
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final int code;
    private final String desc;

    NetworkSpeed(String str, int i) {
        this.desc = str;
        this.code = i;
    }

    public static /* synthetic */ Object ipc$super(NetworkSpeed networkSpeed, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in anetwork/channel/monitor/speed/NetworkSpeed");
    }

    public static NetworkSpeed valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NetworkSpeed) ipChange.ipc$dispatch("9e691446", new Object[]{str});
        }
        return (NetworkSpeed) Enum.valueOf(NetworkSpeed.class, str);
    }

    public static NetworkSpeed valueOfCode(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NetworkSpeed) ipChange.ipc$dispatch("6d982ed4", new Object[]{new Integer(i)});
        }
        if (i == 1) {
            return Slow;
        }
        return Fast;
    }

    public int getCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("480bb15d", new Object[]{this})).intValue();
        }
        return this.code;
    }

    public String getDesc() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f24b4252", new Object[]{this});
        }
        return this.desc;
    }
}

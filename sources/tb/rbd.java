package tb;

import com.taobao.tao.powermsg.common.PowerMessage;
import com.taobao.tao.powermsg.common.TextPowerMessage;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public interface rbd {
    void countValue(int i, String str, Map<String, Double> map, boolean z, ibd ibdVar, Object... objArr);

    void doFullLink(PowerMessage powerMessage, zkm zkmVar);

    kbd getStableDispatcher(String str);

    boolean queryMessagesByStream(int i, String str, sjl sjlVar);

    int registerDispatcher(int i, String str, kbd kbdVar);

    void registerStableDispatcher(String str, kbd kbdVar);

    void report(int i, PowerMessage powerMessage, int i2);

    void sendMessage(int i, PowerMessage powerMessage, ibd ibdVar, Object... objArr);

    void sendRequest(int i, String str, int i2, int i3, int i4, ibd ibdVar, Object... objArr);

    void sendStreamMessage(int i, PowerMessage powerMessage, sjl sjlVar, ibd ibdVar, Object... objArr);

    void sendText(int i, TextPowerMessage textPowerMessage, ibd ibdVar, Object... objArr);

    void setMsgFetchMode(int i, String str, int i2);

    void subscribe(int i, String str, String str2, String str3, String str4, String str5, ibd ibdVar, sjl sjlVar, Object... objArr);

    void subscribe(int i, String str, String str2, String str3, String str4, String str5, ibd ibdVar, Object... objArr);

    void subscribe(int i, String str, String str2, String str3, String str4, ibd ibdVar, Object... objArr);

    void unRegisterStableDispatcher(String str);

    void unSubscribe(int i, String str, String str2, String str3, String str4, String str5, ibd ibdVar, sjl sjlVar, Object... objArr);

    void unSubscribe(int i, String str, String str2, String str3, String str4, String str5, ibd ibdVar, Object... objArr);

    void unSubscribe(int i, String str, String str2, String str3, String str4, ibd ibdVar, Object... objArr);
}

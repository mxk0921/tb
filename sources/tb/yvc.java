package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.messagekit.core.model.BaseMessage;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class yvc implements awc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(628097239);
        t2o.a(628097241);
    }

    @Override // tb.awc
    public void a(Map<String, Object> map, ikl<BaseMessage> iklVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2bab9cd9", new Object[]{this, map, iklVar});
            return;
        }
        BaseMessage baseMessage = iklVar.f21366a;
        if (baseMessage.msgType == 8) {
            str = "mtop.taobao.powermsg.bc.msg.subscribe";
        } else if (baseMessage.msgType == 10) {
            str = "mtop.taobao.powermsg.bc.msg.unsubscribe";
        } else if (baseMessage.type == 7) {
            map.put("api", "mtop.taobao.powermsg.monitor.ack.upload");
            map.put("req", "post");
            return;
        } else if (baseMessage.type == 6) {
            str = "mtop.taobao.powermsg.report.report";
        } else if (baseMessage.header.g == 401) {
            str = "mtop.taobao.powermsg.msg.pullmsgv0";
        } else if (baseMessage.header.g == 404) {
            str = "mtop.taobao.powermsg.msg.pullhistorymsg";
        } else if (baseMessage.header.g == 405) {
            str = "mtop.taobao.powermsg.bc.msg.pullnativemsg";
        } else if (baseMessage.header.g == 402) {
            str = "mtop.taobao.powermsg.msg.pulltopicstat";
        } else if (baseMessage.header.g == 403) {
            str = "mtop.taobao.powermsg.msg.pulltopicuserlist";
        } else if (baseMessage.type == 2) {
            str = "mtop.taobao.powermsg.msg.count";
        } else if (baseMessage.type == 1) {
            str = "mtop.taobao.powermsg.bc.message.sendmsg";
        } else {
            return;
        }
        map.put("api", str);
    }
}

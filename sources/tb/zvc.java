package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.messagekit.core.model.BaseMessage;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class zvc implements awc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(628097240);
        t2o.a(628097241);
    }

    @Override // tb.awc
    public void a(Map<String, Object> map, ikl<BaseMessage> iklVar) {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2bab9cd9", new Object[]{this, map, iklVar});
            return;
        }
        boolean a2 = n8l.a(iklVar.f21366a.bizCode, n8l.MTOP_API_SWITCH, String.valueOf(37));
        BaseMessage baseMessage = iklVar.f21366a;
        int i = baseMessage.msgType;
        if (i != 8) {
            if (i != 10) {
                int i2 = baseMessage.type;
                if (i2 == 7) {
                    str2 = "mtop.taobao.powermsg.monitor.ack.upload";
                } else if (i2 == 6) {
                    str = "mtop.taobao.powermsg.report.report";
                } else {
                    int i3 = baseMessage.header.g;
                    if (i3 == 401) {
                        str = "mtop.taobao.powermsg.msg.pullmsgv0";
                    } else if (i3 == 404) {
                        if (a2) {
                            str = "mtop.taobao.powermsg.interact.msg.pullhistorymsg";
                        } else {
                            str = "mtop.taobao.powermsg.msg.pullhistorymsg";
                        }
                    } else if (i3 == 405) {
                        if (a2) {
                            str = "mtop.taobao.powermsg.interact.msg.pullnativemsg";
                        } else {
                            str = "mtop.taobao.powermsg.msg.pullnativemsg";
                        }
                    } else if (i3 == 402) {
                        if (a2) {
                            str = "mtop.taobao.powermsg.interact.msg.pulltopicstat";
                        } else {
                            str = "mtop.taobao.powermsg.msg.pulltopicstat";
                        }
                    } else if (i3 == 403) {
                        if (a2) {
                            str = "mtop.taobao.powermsg.interact.msg.pulltopicuserlist";
                        } else {
                            str = "mtop.taobao.powermsg.msg.pulltopicuserlist";
                        }
                    } else if (i2 == 2) {
                        if (a2) {
                            str = "mtop.taobao.powermsg.interact.msg.count";
                        } else {
                            str = "mtop.taobao.powermsg.msg.count";
                        }
                    } else if (i2 == 1) {
                        if (a2) {
                            str = "mtop.taobao.powermsg.interact.msg.sendmsg";
                        } else {
                            str = "mtop.taobao.powermsg.msg.sendmsg";
                        }
                    } else if (i2 == 8) {
                        str = "mtop.common.gettimestamp";
                    } else {
                        return;
                    }
                }
            } else if (a2) {
                str = "mtop.taobao.powermsg.interact.msg.unsubscribe";
            } else {
                str = "mtop.taobao.powermsg.msg.unsubscribe";
            }
            map.put("api", str);
            return;
        } else if (a2) {
            str2 = "mtop.taobao.powermsg.interact.msg.subscribe";
        } else {
            str2 = "mtop.taobao.powermsg.msg.subscribe";
        }
        map.put("api", str2);
        map.put("req", "post");
    }
}

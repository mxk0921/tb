package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.miniLive.services.mtop.RedPacketRainResponse;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class itn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779092003);
    }

    public static void a(ux9 ux9Var, RedPacketRainResponse.RedPacketInfo redPacketInfo, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("485782ac", new Object[]{ux9Var, redPacketInfo, jSONObject});
        } else if (ux9Var instanceof cdr) {
            cdr cdrVar = (cdr) ux9Var;
            cdrVar.n1(redPacketInfo);
            cdrVar.o1(jSONObject);
        }
    }

    public static void b(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bddf990f", new Object[]{ux9Var});
        } else if (ux9Var instanceof cdr) {
            cdr cdrVar = (cdr) ux9Var;
            RedPacketRainResponse.RedPacketInfo W0 = cdrVar.W0();
            JSONObject X0 = cdrVar.X0();
            if (W0 != null && X0 != null) {
                com.alibaba.fastjson.JSONObject jSONObject = new com.alibaba.fastjson.JSONObject();
                jSONObject.put("type", (Object) "miniToLarge");
                com.alibaba.fastjson.JSONObject jSONObject2 = new com.alibaba.fastjson.JSONObject();
                jSONObject2.put("targetAliveId", (Object) pvs.u2());
                jSONObject2.put("targetExtendInfo", (Object) X0.toString());
                jSONObject.put("targetData", (Object) jSONObject2);
                cir.a("RedPacketRainMsg", "VideoViewController toLarge 向H5发生消息 targetAliveId= " + W0.benefitId);
                vkr.c(vx9.d(), "TBLiveWVPlugin.event.liveRoomAppear", jSONObject);
                cdrVar.R0();
            }
        }
    }
}

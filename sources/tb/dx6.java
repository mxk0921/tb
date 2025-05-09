package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.message_sdk.util.OpenArchMessageCheckResult;
import com.taobao.taolive.sdk.model.message.TLiveMsg;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class dx6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final c1h f18128a;
    public fx6<String> b;

    public dx6(c1h c1hVar) {
        this.f18128a = c1hVar;
    }

    public boolean a(String str, TLiveMsg tLiveMsg, e1h e1hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("908a71db", new Object[]{this, str, tLiveMsg, e1hVar})).booleanValue();
        }
        if (!this.f18128a.a()) {
            String str2 = "deduplication[" + this.f18128a.f16771a + f7l.BRACKET_START_STR + str + ")]:" + tLiveMsg;
            w71.a(w71.MODULE_POINT_DEDUPLICATION, w71.ERROR_CODE_NO_RUNNING, str2);
            k6s.a("dx6", str2);
            return false;
        }
        fx6<String> fx6Var = this.b;
        if (fx6Var == null) {
            String str3 = "deduplication[mDeduplicationSet is null (" + str + ")]:" + tLiveMsg;
            w71.a(w71.MODULE_POINT_DEDUPLICATION, w71.ERROR_CODE_LISTENER_IS_NULL, str3);
            k6s.a("dx6", str3);
            return false;
        } else if (fx6Var.b(tLiveMsg.messageId)) {
            w71.c(w71.MODULE_POINT_DEDUPLICATION, "isDeduplication:true;source:" + str + ";subtype:" + tLiveMsg.type);
            return true;
        } else {
            w71.c(w71.MODULE_POINT_DEDUPLICATION, "isDeduplication:false;source:" + str + ";subtype:" + tLiveMsg.type);
            e1hVar.a(OpenArchMessageCheckResult.MessageCheckResultMsgIDDuplicated, tLiveMsg);
            k6s.a("dx6", "deduplication[重复数据上报(" + str + ")]:" + tLiveMsg);
            return false;
        }
    }

    public void b(zqi zqiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("417a7ade", new Object[]{this, zqiVar});
        } else {
            this.b = new fx6<>(this.f18128a.b.f15480a);
        }
    }

    public void c(zqi zqiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94e2fc97", new Object[]{this, zqiVar});
            return;
        }
        fx6<String> fx6Var = this.b;
        if (fx6Var != null) {
            fx6Var.a();
            this.b = null;
        }
    }
}

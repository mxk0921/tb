package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.model.message.TLiveMsg;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class sjm extends yx1 implements awd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public sjm(c1h c1hVar, mtc mtcVar) {
        super(c1hVar, mtcVar);
    }

    public static /* synthetic */ Object ipc$super(sjm sjmVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/message_sdk/receive/PowerMessageReceive");
    }

    @Override // tb.awd
    public void a(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ce5e2af", new Object[]{this, new Integer(i), obj});
            return;
        }
        String str = "onError:" + i + " " + obj;
        k6s.a("sjm", str);
        w71.a(w71.MODULE_POINT_PM_RECEIVE, w71.ERROR_CODE_LISTENER_ERROR, str);
        mtc mtcVar = this.b;
        if (mtcVar != null) {
            ((f1h) mtcVar).a(i, obj);
            return;
        }
        k6s.a("sjm", "onError[OnErrorListener is null]:" + this.f32401a.f16771a);
    }

    public void e(Map<String, Double> map, boolean z, zvd zvdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c70b9f09", new Object[]{this, map, new Boolean(z), zvdVar});
            return;
        }
        bwd x = v2s.o().x();
        c1h c1hVar = this.f32401a;
        x.f(c1hVar.d, c1hVar.e, map, z, zvdVar, new Object[0]);
    }

    public void f(TLiveMsg tLiveMsg, zvd zvdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5b962d4", new Object[]{this, tLiveMsg, zvdVar});
        } else {
            v2s.o().x().i(this.f32401a.d, tLiveMsg, zvdVar, new Object[0]);
        }
    }

    public void g(int i, int i2, int i3, zvd zvdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc60eaa6", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), zvdVar});
            return;
        }
        bwd x = v2s.o().x();
        c1h c1hVar = this.f32401a;
        x.d(c1hVar.d, c1hVar.e, i, i2, i3, zvdVar, new Object[0]);
    }

    @Override // tb.awd
    public void b(TLiveMsg tLiveMsg) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d56b849", new Object[]{this, tLiveMsg});
        } else if (!this.f32401a.a()) {
            String str = "onDispatch[" + this.f32401a.f16771a + "(pm)]:" + tLiveMsg;
            w71.a(w71.MODULE_POINT_PM_RECEIVE, w71.ERROR_CODE_NO_RUNNING, str);
            k6s.a("sjm", str);
        } else if (tLiveMsg != null) {
            c1h c1hVar = this.f32401a;
            tLiveMsg.sendFullTags = c1hVar.h.c(c1hVar.c, tLiveMsg.messageId, tLiveMsg.type);
            c1h c1hVar2 = this.f32401a;
            c1hVar2.h.e(2, "pm", tLiveMsg, c1hVar2);
            if (this.b != null) {
                w71.c(w71.MODULE_POINT_PM_RECEIVE, "subtype:" + tLiveMsg.type);
                ((f1h) this.b).b("pm", tLiveMsg);
                return;
            }
            String str2 = "onError[OnErrorListener is null]:" + this.f32401a.f16771a + " " + tLiveMsg;
            w71.a(w71.MODULE_POINT_PM_RECEIVE, w71.ERROR_CODE_LISTENER_IS_NULL, str2);
            k6s.a("sjm", str2);
        } else {
            w71.a(w71.MODULE_POINT_PM_RECEIVE, w71.ERROR_CODE_DATA_NULL, "onDispatch[onError]:liveMsg is null");
            k6s.a("sjm", "onDispatch[onError]:liveMsg is null");
        }
    }

    public void h(zqi zqiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("417a7ade", new Object[]{this, zqiVar});
            return;
        }
        bwd x = v2s.o().x();
        int i = zqiVar.f32948a;
        String str = zqiVar.b;
        this.f32401a.getClass();
        x.setMsgFetchMode(i, str, 3);
        v2s.o().x().q(zqiVar.f32948a, zqiVar.b, TextUtils.isEmpty(zqiVar.c) ? null : zqiVar.c, zqiVar.d, "tb", zqiVar.e, zqiVar.f, new Object[0]);
        v2s.o().x().o(zqiVar.f32948a, zqiVar.c, this);
    }

    public void i(zqi zqiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94e2fc97", new Object[]{this, zqiVar});
            return;
        }
        bwd x = v2s.o().x();
        c1h c1hVar = this.f32401a;
        x.k(c1hVar.d, c1hVar.e, TextUtils.isEmpty(c1hVar.f) ? null : this.f32401a.f, this.f32401a.g, "tb", zqiVar.e, zqiVar.f, new Object[0]);
        this.b = null;
    }
}

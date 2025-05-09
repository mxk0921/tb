package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tab2interact.core.component.revisitedu.RevisitEduDialog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class evy extends v7<Object> implements RevisitEduDialog.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(689963254);
        t2o.a(689963090);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public evy(jmi jmiVar, vv1 vv1Var, yps ypsVar, RevisitEduDialog revisitEduDialog) {
        super(jmiVar, vv1Var, ypsVar);
        ckf.g(jmiVar, "messageCenter");
        ckf.g(vv1Var, "baseInfoManager");
        ckf.g(ypsVar, "tabBaseInfoManager");
        ckf.g(revisitEduDialog, "revisitEduDialog");
        revisitEduDialog.e(this);
    }

    public static /* synthetic */ Object ipc$super(evy evyVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tab2interact/tabadapter/shortvideo/component/revisitedu/RevisitEduDialogShortVideoTabAdapter");
    }

    @Override // tb.w7
    public Object F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("392caa4", new Object[]{this});
        }
        return null;
    }

    @Override // com.taobao.tab2interact.core.component.revisitedu.RevisitEduDialog.b
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9fb5716", new Object[]{this});
            return;
        }
        String c = G().c();
        if (c != null && L(c)) {
            d(false, c);
        }
    }

    @Override // com.taobao.tab2interact.core.component.revisitedu.RevisitEduDialog.b
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9f092bf", new Object[]{this});
            return;
        }
        String c = G().c();
        if (c != null && L(c)) {
            d(true, c);
        }
    }

    public final void d(boolean z, String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77675db7", new Object[]{this, new Boolean(z), str});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        if (z) {
            str2 = csp.PLAY_ACTIVE_CARD_MEDIA_NAME;
        } else {
            str2 = csp.PAUSE_VIDEO_NAME;
        }
        jSONObject.put((JSONObject) "name", str2);
        dsp.INSTANCE.d(G(), jSONObject, str, null, J());
    }
}

package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.live.plugin.atype.flexalocal.smartlanding.business.SmartLandingTask;
import tb.qe6;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class bh5 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(295698930);
    }

    public static void a(DinamicXEngine dinamicXEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c314c5f", new Object[]{dinamicXEngine});
            return;
        }
        dinamicXEngine.V0(pn5.DX_PARSER_JSONARRAYSTR2TEXTBYKEY, new pn5());
        dinamicXEngine.V0(ri5.DX_PARSER_CALLFUN, new ri5());
        dinamicXEngine.V0(fs5.DX_PARSER_TBLIVE_GETSERVERTIME, new fs5());
        dinamicXEngine.V0(qr5.DX_PARSER_TAOLIVEDXAB, new qr5());
        try {
            km7.c(ss5.e(), new ss5());
            km7.c("tlStrMap", new ef6());
            km7.c(SmartLandingTask.Operation.STR_EQUAL, new fh8());
        } catch (Exception unused) {
        }
        dinamicXEngine.W0(ch6.DX_EVENT_TBLIVE_ADDTOCART, new ch6());
        dinamicXEngine.W0(wg6.DX_EVENT_TBLIVEGOTODETAIL, new wg6());
        dinamicXEngine.W0(yg6.DX_EVENT_TBLIVEROOMACTION, new yg6());
        dinamicXEngine.W0(ah6.DX_EVENT_TBLIVESENDDYNAMICMESSAGE, new ah6());
        dinamicXEngine.W0(qi6.DX_EVENT_TLOPENINTERACTIVECOMPONENT, new qi6());
        dinamicXEngine.W0(gh6.DX_EVENT_TBLIVE_GOODS_SECKILL_ITEM_ADD, new gh6());
        dinamicXEngine.W0(eh6.DX_EVENT_TBLIVE_GOODS_EXPLOSION_ITEM_CLICK_EVENT, new eh6());
        dinamicXEngine.W0(gg6.DX_EVENT_TAOLIVEROOMCOMMONHANDLER, new gg6());
        dinamicXEngine.W0(ph6.DX_EVENT_TBLIVEGOODCASEGOTODETAIL, new ph6());
        dinamicXEngine.W0(ih6.DX_EVENT_TBLIVE_GOODS_TOP_CARD, new ih6());
        dinamicXEngine.W0(kh6.DX_EVENT_TBLIVE_PRESALE, new kh6());
        dinamicXEngine.W0(1544903441687469454L, new uo7());
        dinamicXEngine.e1(qe6.DXTBLTIMER_TBLTIMER, new qe6.b());
    }
}

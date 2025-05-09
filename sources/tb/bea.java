package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import tb.qe6;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class bea implements tac {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(295698967);
        t2o.a(806355157);
    }

    @Override // tb.tac
    public void a(DinamicXEngine dinamicXEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7f43b1e", new Object[]{this, dinamicXEngine});
        } else {
            dinamicXEngine.V0(pn5.DX_PARSER_JSONARRAYSTR2TEXTBYKEY, new pn5());
        }
    }

    @Override // tb.tac
    public void b(DinamicXEngine dinamicXEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdb0b8d9", new Object[]{this, dinamicXEngine});
        } else {
            dinamicXEngine.e1(qe6.DXTBLTIMER_TBLTIMER, new qe6.b());
        }
    }

    @Override // tb.tac
    public void c(DinamicXEngine dinamicXEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed45b5c7", new Object[]{this, dinamicXEngine});
        } else {
            dinamicXEngine.W0(gh6.DX_EVENT_TBLIVE_GOODS_SECKILL_ITEM_ADD, new gh6());
        }
    }

    @Override // tb.tac
    public void d(DinamicXEngine dinamicXEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58d5429c", new Object[]{this, dinamicXEngine});
        } else {
            dinamicXEngine.V0(ri5.DX_PARSER_CALLFUN, new ri5());
        }
    }

    @Override // tb.tac
    public void e(DinamicXEngine dinamicXEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("290e34c6", new Object[]{this, dinamicXEngine});
        } else {
            dinamicXEngine.W0(ah6.DX_EVENT_TBLIVESENDDYNAMICMESSAGE, new ah6());
        }
    }

    @Override // tb.tac
    public void f(DinamicXEngine dinamicXEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74582dc7", new Object[]{this, dinamicXEngine});
        } else {
            dinamicXEngine.W0(yg6.DX_EVENT_TBLIVEROOMACTION, new yg6());
        }
    }

    @Override // tb.tac
    public void g(DinamicXEngine dinamicXEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87aff773", new Object[]{this, dinamicXEngine});
        } else {
            dinamicXEngine.W0(ch6.DX_EVENT_TBLIVE_ADDTOCART, new ch6());
        }
    }

    @Override // tb.tac
    public void h(DinamicXEngine dinamicXEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89cce80a", new Object[]{this, dinamicXEngine});
        } else {
            dinamicXEngine.W0(wg6.DX_EVENT_TBLIVEGOTODETAIL, new wg6());
        }
    }

    @Override // tb.tac
    public void i(DinamicXEngine dinamicXEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28fc5876", new Object[]{this, dinamicXEngine});
        } else {
            dinamicXEngine.V0(fs5.DX_PARSER_TBLIVE_GETSERVERTIME, new fs5());
        }
    }

    @Override // tb.tac
    public void j(DinamicXEngine dinamicXEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c73e3dd7", new Object[]{this, dinamicXEngine});
        } else {
            dinamicXEngine.W0(ph6.DX_EVENT_TBLIVEGOODCASEGOTODETAIL, new ph6());
        }
    }
}

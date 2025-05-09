package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import java.util.HashMap;
import java.util.Map;
import tb.hd6;
import tb.qy5;
import tb.ve6;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class rcm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Map<Long, evb> f27278a = new HashMap();
    public static final Map<Long, mvb> b = new HashMap();

    public static void a(DinamicXEngine dinamicXEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b56413b4", new Object[]{dinamicXEngine});
            return;
        }
        d(dinamicXEngine);
        b(dinamicXEngine);
        c(dinamicXEngine);
    }

    public static void b(DinamicXEngine dinamicXEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28e65aef", new Object[]{dinamicXEngine});
            return;
        }
        dinamicXEngine.W0(b86.DX_EVENT_POPCANCEL, new b86());
        dinamicXEngine.W0(d86.DX_EVENT_POPCONFIRM, new d86());
        dinamicXEngine.W0(c86.DX_EVENT_POPCLICK, new c86());
        dinamicXEngine.W0(uy5.DX_EVENT_HEXPOSEEVENT, new uy5());
        dinamicXEngine.W0(f86.DX_EVENT_POPTRIGGER, new f86());
        dinamicXEngine.W0(ty5.DX_EVENT_HEVENTGROUP, new ty5());
        dinamicXEngine.W0(oz5.DX_EVENT_HSETPOPCLIENTPARAMS, new oz5());
        dinamicXEngine.W0(rz5.DX_EVENT_HSETTOSTATICCACHE, new rz5());
        dinamicXEngine.W0(e86.DX_EVENT_POPMESSAGE, new e86());
        dinamicXEngine.W0(dc6.DX_EVENT_SETCARDMODELEXTEVENTHANDER, new dc6());
        for (Long l : ((HashMap) b).keySet()) {
            dinamicXEngine.W0(l.longValue(), (mvb) ((HashMap) b).get(l));
        }
        ((HashMap) b).clear();
    }

    public static void c(DinamicXEngine dinamicXEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71247da", new Object[]{dinamicXEngine});
            return;
        }
        dinamicXEngine.V0(qk5.DX_PARSER_GETARROWSPOINT, new qk5());
        dinamicXEngine.V0(xl5.DX_PARSER_HGETFROMSTATICCACHE, new xl5());
        dinamicXEngine.V0(gp5.DX_PARSER_POPFETCHVIEWFRAME, new gp5());
        dinamicXEngine.V0(-2517623531547489759L, new mq5());
        dinamicXEngine.V0(cm5.DX_PARSER_HGETSEARCHBARHEIGHT, new cm5());
        dinamicXEngine.V0(fp5.DX_PARSER_POPANCHORFRAME, new fp5());
        for (Long l : ((HashMap) f27278a).keySet()) {
            dinamicXEngine.V0(l.longValue(), (evb) ((HashMap) f27278a).get(l));
        }
        ((HashMap) f27278a).clear();
    }

    public static void d(DinamicXEngine dinamicXEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a5da7ff", new Object[]{dinamicXEngine});
            return;
        }
        dinamicXEngine.e1(qy5.DXHANIMATORIMAGEVIEW_HANIMATORIMAGEVIEW, new qy5.b());
        dinamicXEngine.e1(hd6.DXSTRIKEFRAMELAYOUT_STRIKEFRAMELAYOUT, new hd6.a());
        dinamicXEngine.e1(ve6.DXTBPOPEVENTLAYOUT_TBPOPEVENTLAYOUT, new ve6.a());
    }

    public static void e(long j, mvb mvbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12f9307d", new Object[]{new Long(j), mvbVar});
        } else {
            ((HashMap) b).put(Long.valueOf(j), mvbVar);
        }
    }

    public static void f(long j, evb evbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("331e4c", new Object[]{new Long(j), evbVar});
        } else {
            ((HashMap) f27278a).put(Long.valueOf(j), evbVar);
        }
    }
}

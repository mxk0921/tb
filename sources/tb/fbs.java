package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.pub_kit.config.PubContainerContext;
import com.taobao.themis.pub_kit.guide.model.PubUserGuideModule;
import tb.y2n;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class fbs {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(844103798);
    }

    public static final boolean a(bbs bbsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("16279bc0", new Object[]{bbsVar})).booleanValue();
        }
        ckf.g(bbsVar, "<this>");
        c3n c3nVar = (c3n) bbsVar.g(c3n.class);
        if (c3nVar == null) {
            return false;
        }
        return c3nVar.o();
    }

    public static final PubUserGuideModule b(bbs bbsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PubUserGuideModule) ipChange.ipc$dispatch("a43c14b", new Object[]{bbsVar});
        }
        ckf.g(bbsVar, "<this>");
        y2n y2nVar = (y2n) bbsVar.g(y2n.class);
        if (y2nVar == null) {
            return null;
        }
        return y2nVar.j();
    }

    public static final void c(bbs bbsVar, y2n.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40b12b42", new Object[]{bbsVar, bVar});
            return;
        }
        ckf.g(bbsVar, "<this>");
        ckf.g(bVar, "pubContainerConfigTaskListener");
        y2n y2nVar = (y2n) bbsVar.g(y2n.class);
        if (y2nVar != null) {
            y2nVar.k(bVar);
        }
    }

    public static final JSONObject d(bbs bbsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("7b9ea405", new Object[]{bbsVar});
        }
        ckf.g(bbsVar, "<this>");
        c3n c3nVar = (c3n) bbsVar.g(c3n.class);
        if (c3nVar == null) {
            return null;
        }
        return c3nVar.q();
    }

    public static final JSONArray e(bbs bbsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("dd131366", new Object[]{bbsVar});
        }
        ckf.g(bbsVar, "<this>");
        c3n c3nVar = (c3n) bbsVar.g(c3n.class);
        if (c3nVar == null) {
            return null;
        }
        return c3nVar.s();
    }

    public static final JSONArray f(bbs bbsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("f5a7d18b", new Object[]{bbsVar});
        }
        ckf.g(bbsVar, "<this>");
        c3n c3nVar = (c3n) bbsVar.g(c3n.class);
        if (c3nVar == null) {
            return null;
        }
        return c3nVar.t();
    }

    public static final PubContainerContext g(bbs bbsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PubContainerContext) ipChange.ipc$dispatch("b63fd95e", new Object[]{bbsVar});
        }
        ckf.g(bbsVar, "<this>");
        return (PubContainerContext) bbsVar.g(PubContainerContext.class);
    }
}

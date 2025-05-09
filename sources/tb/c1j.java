package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import tb.be6;
import tb.he6;
import tb.je6;
import tb.ne6;
import tb.oe6;
import tb.ud6;
import tb.wd6;
import tb.xd6;
import tb.yd6;
import tb.zd6;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class c1j implements o5h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779092191);
        t2o.a(806355329);
    }

    public TBLiveDataModel a(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBLiveDataModel) ipChange.ipc$dispatch("5d4e7a83", new Object[]{this, ux9Var});
        }
        return e7w.h(ux9Var);
    }

    public VideoInfo b(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VideoInfo) ipChange.ipc$dispatch("585c4350", new Object[]{this, tBLiveDataModel});
        }
        return cxg.e(tBLiveDataModel);
    }

    public void c(DinamicXEngine dinamicXEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e119ec28", new Object[]{this, dinamicXEngine});
        } else if (dinamicXEngine != null) {
            dinamicXEngine.e1(xd6.DXTBLCOUNTDOWNVIEW_TBLCOUNTDOWNVIEW, new xd6.a());
            dinamicXEngine.e1(ud6.DXTBLANIMATEDVIEW_TBLANIMATEDVIEW, new ud6.b());
            dinamicXEngine.e1(he6.DXTBLIMAGEVIEW_TBLIMAGEVIEW, new he6.a());
            dinamicXEngine.e1(yd6.DXTBLFAVORVIEW_TBLFAVORVIEW, new yd6.a());
            dinamicXEngine.e1(je6.DXTBLMASKVIEW_TBLMASKVIEW, new je6.a());
            dinamicXEngine.e1(oe6.DXTBLTEXTVIEW_TBLTEXTVIEW, new oe6.a());
            dinamicXEngine.e1(wd6.DXTBLCOMMENTVIEW_TBLCOMMENTVIEW, new wd6.a());
            dinamicXEngine.e1(zd6.DXTBLFOLLOWVIEW_TBLFOLLOWVIEW, new zd6.b());
            dinamicXEngine.e1(be6.DXTBLGRIDLAYOUT_TBLGRIDLAYOUT, new be6.a());
            dinamicXEngine.e1(ne6.DXTBLSUBSCRIBEVIEW_TBLSUBSCRIBEVIEW, new ne6.a());
            dinamicXEngine.V0(ur5.DX_PARSER_TBLDEVICELEVEL, new ur5());
            dinamicXEngine.V0(zr5.DX_PARSER_TBLTIMEFOMAT, new zr5());
        }
    }
}

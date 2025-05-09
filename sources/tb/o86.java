package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.s;
import com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.DXTblScrollExposeEventHandler;
import com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.TBLDinamicXCommonClickHandler;
import com.taobao.live.home.dinamic.ability.TBLFollowAbility;
import com.taobao.live.home.dinamic.event.DXTblMtopRefreshEventHandler;
import tb.ae6;
import tb.be6;
import tb.bg6;
import tb.ce6;
import tb.fe6;
import tb.he6;
import tb.ie6;
import tb.je6;
import tb.jir;
import tb.me6;
import tb.mht;
import tb.ne6;
import tb.oe6;
import tb.oht;
import tb.oir;
import tb.qhr;
import tb.qht;
import tb.shr;
import tb.te6;
import tb.thr;
import tb.ud6;
import tb.vd6;
import tb.xd6;
import tb.yd6;
import tb.zd6;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class o86 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(310378610);
    }

    public static void a(s sVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbe99d8e", new Object[]{sVar});
        } else if (sVar != null) {
            sVar.u(fe6.DXTBLHOMEIMAGEVIEW_TBLHOMEIMAGEVIEW, new fe6.b());
            sVar.u(ce6.DXTBLHOMEANIMATEDVIEW_TBLHOMEANIMATEDVIEW, new ce6.a());
            sVar.u(he6.DXTBLIMAGEVIEW_TBLIMAGEVIEW, new he6.a());
            sVar.u(yd6.DXTBLFAVORVIEW_TBLFAVORVIEW, new yd6.a());
            sVar.u(je6.DXTBLMASKVIEW_TBLMASKVIEW, new je6.a());
            sVar.u(oe6.DXTBLTEXTVIEW_TBLTEXTVIEW, new oe6.a());
            sVar.u(wd6.DXTBLCOMMENTVIEW_TBLCOMMENTVIEW, new wd6());
            sVar.u(zd6.DXTBLFOLLOWVIEW_TBLFOLLOWVIEW, new zd6.b());
            sVar.u(be6.DXTBLGRIDLAYOUT_TBLGRIDLAYOUT, new be6.a());
            sVar.u(ne6.DXTBLSUBSCRIBEVIEW_TBLSUBSCRIBEVIEW, new ne6.a());
            sVar.u(me6.DXTBLSLIDERLAYOUT_TBLSLIDERLAYOUT, new me6.a());
            sVar.u(ie6.DXTBLLONGTEXTVIEW_TBLLONGTEXTVIEW, new ie6.a());
            sVar.u(vd6.DXTBLAUTOSCROLLSCROLLERLAYOUT_TBLAUTOSCROLLSCROLLERLAYOUT, new vd6.a());
            sVar.u(ae6.DXTBLFRAMELAYOUT_TBLFRAMELAYOUT, new ae6.a());
            sVar.s(10220236261038765L, new TBLDinamicXCommonClickHandler());
            sVar.s(DXTblScrollExposeEventHandler.DX_EVENT_TBLSCROLLEXPOSE, new DXTblScrollExposeEventHandler());
            sVar.s(5360605235400031797L, new rg6());
            sVar.s(og6.DX_EVENT_TBLDXNOTIFYNATIVE, new og6());
            sVar.s(t3z.DX_EVENT_LCHANNELSHOWMAIDIANLIST, new t3z());
            sVar.r(ur5.DX_PARSER_TBLDEVICELEVEL, new ur5());
            sVar.r(zr5.DX_PARSER_TBLTIMEFOMAT, new zr5());
            sVar.r(os5.DX_PARSER_TBLVSTRTOMAP, new os5());
            sVar.r(jr5.DX_PARSER_TBLVTOARRAY, new jr5());
            sVar.r(ms5.DX_PARSER_TBLVMAPTOJSON, new ms5());
            sVar.r(ls5.DX_PARSER_TBLVJSONTOMAP, new ls5());
            sVar.r(ks5.DX_PARSER_TBLVJSONTOARRAY, new ks5());
            sVar.r(fr5.DX_PARSER_TBLURLENCODE, new fr5());
            sVar.r(zq5.DX_PARSER_TBLFETCHBHXBUFSFEATURE, new zq5());
            sVar.r(dr5.DX_PARSER_TBLFETCHTIMESTAMPINFO, new dr5());
            sVar.r(er5.DX_PARSER_TBLFETCHUSERINFO, new er5());
            sVar.r(dr5.DX_PARSER_TBLFETCHTIMESTAMPINFO, new dr5());
            sVar.r(cr5.DX_PARSER_TBLFETCHMD5, new cr5());
            sVar.r(br5.DX_PARSER_TBLFETCHDEVICEINFO, new br5());
            sVar.r(hs5.DX_PARSER_TBLVHANDLEMTOPDATA, new hs5());
            sVar.r(wr5.DX_PARSER_TBLGETEXPOSE, new wr5());
            sVar.r(br5.DX_PARSER_TBLFETCHDEVICEINFO, new br5());
            sVar.r(6916119436215133091L, new ir5());
            sVar.r(js5.DX_PARSER_TBLVINSERTBELOW, new js5());
            sVar.s(h26.DX_EVENT_LTAP, new h26());
            sVar.s(f26.DX_EVENT_LSCROLLEXPOSE, new f26());
            sVar.s(e26.DX_EVENT_LOPENCHANNEL, new e26());
            sVar.s(DXTblMtopRefreshEventHandler.DX_EVENT_TBLMTOPREFRESH, new DXTblMtopRefreshEventHandler());
            sVar.s(rh6.DX_EVENT_TBLVNATIVECALLCHAIN, new rh6());
            sVar.u(ud6.DXTBLANIMATEDVIEW_TBLANIMATEDVIEW, new ud6.b());
            sVar.u(te6.DXTBLIVEVIEWPAGER_TBLIVEVIEWPAGER, new te6.a());
            sVar.u(xd6.DXTBLCOUNTDOWNVIEW_TBLCOUNTDOWNVIEW, new xd6.a());
            sVar.u(bg6.DXTAOLIVEJELLYMARQUEE_TAOLIVEJELLYMARQUEE, new bg6.b());
            sVar.s(le6.DX_EVENT_TBLOPENCHANNEL, new le6());
            sVar.s(ug6.DX_EVENT_TBLSEARCHTAP, new ug6());
            sVar.s(mg6.DX_EVENT_TBLCARDDATAEXPO, new mg6());
            sVar.s(b26.DX_EVENT_LNEWCHANNELTAP, new b26());
            if (sVar.k() != null) {
                sVar.k().J0(jir.TBLSUBSCRIBE, new jir.e());
                sVar.k().J0(TBLFollowAbility.TBLFOLLOW, new TBLFollowAbility.a());
                sVar.k().J0(oir.TBLVIEWPAGERABILITY, new oir.a());
                sVar.k().J0(shr.TBLCACHE, new shr.c());
                sVar.k().J0(qht.TBLVSYNCTASK, new qht.a());
                sVar.k().J0(oht.TBLUPDATEVIEWPROPERTY, new oht.a());
                sVar.k().J0(thr.TBLCALLEVENTCHAIN, new thr.a());
                sVar.k().J0(qhr.TBLCDNREQUEST, new qhr.b());
                sVar.k().J0(mht.TBLMTOP, new mht.a());
            }
        }
    }
}

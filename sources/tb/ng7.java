package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.meta.structure.list.MetaListPresenter;
import com.taobao.android.meta.structure.list.MetaListWidget;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.android.searchbaseframe.nx3.bean.MuiseCellBean;
import com.taobao.search.m3.M3CellBean;
import com.taobao.search.sf.MainSearchResultActivity;
import com.taobao.search.sf.datasource.CommonBaseDatasource;
import com.taobao.search.sf.datasource.CommonSearchResult;
import com.taobao.search.sf.detailpre.DetailPreRequestUtil;
import com.taobao.search.sf.widgets.list.listcell.baseauction.SFAuctionBaseCellBean;
import java.util.ArrayList;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class ng7 extends ww1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(815792892);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ng7(MetaListWidget metaListWidget) {
        super(metaListWidget);
        ckf.g(metaListWidget, "widget");
    }

    public static /* synthetic */ Object ipc$super(ng7 ng7Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/refactor/list/DetailPreloadPlugin");
    }

    @Override // tb.hsi
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("befd50ee", new Object[]{this});
        } else {
            p();
        }
    }

    @Override // tb.hsi
    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4389135", new Object[]{this});
        } else if (!m()) {
            p();
        }
    }

    public final void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("287b997c", new Object[]{this});
        } else if (o4p.E0()) {
            o02 e = ((acx) a().getModel()).e();
            ckf.e(e, "null cannot be cast to non-null type com.taobao.search.sf.datasource.CommonBaseDatasource");
            CommonBaseDatasource commonBaseDatasource = (CommonBaseDatasource) e;
            CommonSearchResult commonSearchResult = (CommonSearchResult) commonBaseDatasource.getTotalSearchResult();
            if (commonSearchResult != null && commonSearchResult.isPreDetail()) {
                boolean z = !(a().getActivity() instanceof MainSearchResultActivity);
                if (a().u2() instanceof MetaListPresenter) {
                    IP u2 = a().u2();
                    ckf.e(u2, "null cannot be cast to non-null type com.taobao.android.meta.structure.list.MetaListPresenter");
                    Set<Integer> u0 = ((MetaListPresenter) u2).u0();
                    if (u0.size() > 0) {
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        for (Integer num : u0) {
                            if (num.intValue() >= 0 && num.intValue() < commonSearchResult.getCellsCount()) {
                                BaseCellBean cell = commonSearchResult.getCell(num.intValue());
                                if (cell instanceof MuiseCellBean) {
                                    MuiseCellBean muiseCellBean = (MuiseCellBean) cell;
                                    if (muiseCellBean.ndPreview && !TextUtils.isEmpty(muiseCellBean.ndPreviewUrl) && !muiseCellBean.ndPreviewTriggered) {
                                        muiseCellBean.ndPreviewTriggered = true;
                                        arrayList2.add(cell);
                                    }
                                    if (ckf.b("item", muiseCellBean.cardType) && !muiseCellBean.hasPreRequestDetail) {
                                        arrayList.add(cell);
                                        muiseCellBean.hasPreRequestDetail = true;
                                    }
                                } else if (cell instanceof SFAuctionBaseCellBean) {
                                    SFAuctionBaseCellBean sFAuctionBaseCellBean = (SFAuctionBaseCellBean) cell;
                                    if (!sFAuctionBaseCellBean.hasPreRequestDetail && sFAuctionBaseCellBean.auctionBaseBean != null) {
                                        arrayList.add(cell);
                                        sFAuctionBaseCellBean.hasPreRequestDetail = true;
                                    }
                                } else if (cell instanceof M3CellBean) {
                                    M3CellBean m3CellBean = (M3CellBean) cell;
                                    if (!m3CellBean.getHasPreRequestDetail()) {
                                        m3CellBean.setHasPreRequestDetail(true);
                                        arrayList.add(cell);
                                    }
                                }
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            DetailPreRequestUtil.Companion.a().f(commonBaseDatasource.j(), arrayList, commonBaseDatasource.getKeyword(), z);
                        }
                        if (!arrayList2.isEmpty()) {
                            try {
                                if (o4p.K2()) {
                                    DetailPreRequestUtil.Companion.a().g(arrayList2);
                                } else {
                                    DetailPreRequestUtil.Companion.a().h(arrayList2);
                                }
                            } catch (Throwable th) {
                                c4p.o("DetailPreloadPlugin", "trigger nd preload failed", th);
                            }
                        }
                    }
                }
            }
        }
    }
}

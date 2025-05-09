package tb;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.meta.structure.list.MetaListWidget;
import com.taobao.android.searchbaseframe.business.srp.list.uikit.PartnerRecyclerView;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.android.searchbaseframe.nx3.bean.MuiseBean;
import com.taobao.android.searchbaseframe.nx3.bean.MuiseCellBean;
import com.taobao.android.searchbaseframe.nx3.bean.TemplateBean;
import com.taobao.android.searchbaseframe.nx3.bean.WeexCellBean;
import com.taobao.search.jarvis.bean.DynamicCardBean;
import com.taobao.search.m3.M3CellBean;
import com.taobao.search.musie.SearchMuiseViewHolder;
import com.taobao.search.sf.datasource.CommonBaseDatasource;
import com.taobao.search.sf.widgets.list.listcell.baseauction.SFAuctionBaseCellBean;
import com.taobao.uikit.feature.view.TRecyclerView;
import java.util.Map;
import org.android.agoo.common.AgooConstants;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class j48 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final yw1<?, ?, ?, ?> f21755a;
    public final CommonBaseDatasource b;

    static {
        t2o.a(815793479);
    }

    public j48(yw1<?, ?, ?, ?> yw1Var, CommonBaseDatasource commonBaseDatasource) {
        ckf.g(yw1Var, "searchListWidget");
        ckf.g(commonBaseDatasource, "scopeDataSource");
        this.f21755a = yw1Var;
        this.b = commonBaseDatasource;
    }

    public final void b(String str, BaseSearchResult baseSearchResult, DynamicCardBean dynamicCardBean) {
        TRecyclerView.HeaderViewAdapter headerViewAdapter;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27321e4c", new Object[]{this, str, baseSearchResult, dynamicCardBean});
            return;
        }
        RecyclerView recyclerView = ((kib) this.f21755a.t2()).getRecyclerView();
        ckf.e(recyclerView, "null cannot be cast to non-null type com.taobao.android.searchbaseframe.business.srp.list.uikit.PartnerRecyclerView");
        PartnerRecyclerView partnerRecyclerView = (PartnerRecyclerView) recyclerView;
        int headerViewsCount = partnerRecyclerView.getHeaderViewsCount();
        int findFirstPartlyVisibleItemPosition = partnerRecyclerView.findFirstPartlyVisibleItemPosition() - headerViewsCount;
        int findPartlyLastVisibleItemPosition = partnerRecyclerView.findPartlyLastVisibleItemPosition() - headerViewsCount;
        int cellsCount = baseSearchResult.getCellsCount();
        if (findPartlyLastVisibleItemPosition > cellsCount) {
            findPartlyLastVisibleItemPosition = cellsCount;
        }
        if (findFirstPartlyVisibleItemPosition >= 0) {
            i = findFirstPartlyVisibleItemPosition;
        }
        while (i < findPartlyLastVisibleItemPosition) {
            if (i >= 0) {
                if (i < cellsCount) {
                    BaseCellBean cell = baseSearchResult.getCell(i);
                    if (TextUtils.equals(cell.cardType, "item") && TextUtils.equals(cell.itemId, str)) {
                        RecyclerView.Adapter adapter = partnerRecyclerView.getAdapter();
                        if (adapter instanceof TRecyclerView.HeaderViewAdapter) {
                            headerViewAdapter = (TRecyclerView.HeaderViewAdapter) adapter;
                        } else {
                            headerViewAdapter = null;
                        }
                        if (headerViewAdapter != null) {
                            if (cell instanceof SFAuctionBaseCellBean) {
                                SFAuctionBaseCellBean sFAuctionBaseCellBean = (SFAuctionBaseCellBean) cell;
                                if (sFAuctionBaseCellBean.dynamicCardBean == null) {
                                    sFAuctionBaseCellBean.dynamicCardBean = dynamicCardBean;
                                    e(partnerRecyclerView, i, headerViewAdapter);
                                    return;
                                }
                                return;
                            } else if (cell instanceof MuiseCellBean) {
                                MuiseCellBean muiseCellBean = (MuiseCellBean) cell;
                                if (muiseCellBean.mExtraObj.get("dynamicCardBean") == null) {
                                    Map<String, Object> map = muiseCellBean.mExtraObj;
                                    ckf.f(map, "mExtraObj");
                                    map.put("dynamicCardBean", dynamicCardBean);
                                    e(partnerRecyclerView, i, headerViewAdapter);
                                    return;
                                }
                                return;
                            } else if (cell instanceof M3CellBean) {
                                M3CellBean m3CellBean = (M3CellBean) cell;
                                if (m3CellBean.getDynamicCardBean() == null) {
                                    m3CellBean.setDynamicCardBean(dynamicCardBean);
                                    e(partnerRecyclerView, i, headerViewAdapter);
                                    return;
                                }
                                return;
                            } else {
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                } else {
                    return;
                }
            }
            i++;
        }
    }

    public final void c(int i, BaseSearchResult baseSearchResult, DynamicCardBean dynamicCardBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34a7a739", new Object[]{this, new Integer(i), baseSearchResult, dynamicCardBean});
        } else if (i < baseSearchResult.getCellsCount()) {
            BaseCellBean cell = baseSearchResult.getCell(i);
            if (cell instanceof SFAuctionBaseCellBean) {
                SFAuctionBaseCellBean sFAuctionBaseCellBean = (SFAuctionBaseCellBean) cell;
                if (sFAuctionBaseCellBean.dynamicCardBean == null) {
                    sFAuctionBaseCellBean.dynamicCardBean = dynamicCardBean;
                }
            } else if (cell instanceof WeexCellBean) {
                WeexCellBean weexCellBean = (WeexCellBean) cell;
                if (weexCellBean.mExtraObj.get("dynamicCardBean") == null) {
                    Map<String, Object> map = weexCellBean.mExtraObj;
                    ckf.f(map, "mExtraObj");
                    map.put("dynamicCardBean", dynamicCardBean);
                }
            } else if (cell instanceof MuiseCellBean) {
                MuiseCellBean muiseCellBean = (MuiseCellBean) cell;
                if (muiseCellBean.mExtraObj.get("dynamicCardBean") == null) {
                    Map<String, Object> map2 = muiseCellBean.mExtraObj;
                    ckf.f(map2, "mExtraObj");
                    map2.put("dynamicCardBean", dynamicCardBean);
                }
            } else if (cell instanceof M3CellBean) {
                M3CellBean m3CellBean = (M3CellBean) cell;
                if (m3CellBean.getDynamicCardBean() == null) {
                    m3CellBean.setDynamicCardBean(dynamicCardBean);
                }
            }
            this.f21755a.postEvent(v2p.a(i, 1));
        }
    }

    public final void d(DynamicCardBean dynamicCardBean) {
        MuiseCellBean muiseCellBean;
        khq khqVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc5659e8", new Object[]{this, dynamicCardBean});
            return;
        }
        BaseCellBean baseCellBean = dynamicCardBean.mDynamicCellBean;
        ViewGroup viewGroup = null;
        if (baseCellBean instanceof MuiseCellBean) {
            muiseCellBean = (MuiseCellBean) baseCellBean;
        } else {
            muiseCellBean = null;
        }
        if (muiseCellBean != null) {
            MuiseBean muiseBean = muiseCellBean.mMuiseBean;
            ckf.f(muiseBean, "mMuiseBean");
            TemplateBean templateBean = dynamicCardBean.mTemplates.get(muiseCellBean.type);
            if (templateBean != null) {
                nde findComponentOfScope = this.f21755a.findComponentOfScope("childPageWidget");
                if (findComponentOfScope instanceof khq) {
                    khqVar = (khq) findComponentOfScope;
                } else {
                    khqVar = null;
                }
                if (khqVar != null) {
                    View view = khqVar.getView();
                    if (view instanceof ViewGroup) {
                        viewGroup = (ViewGroup) view;
                    }
                    if (viewGroup != null) {
                        Activity activity = this.f21755a.getActivity();
                        ckf.f(activity, "getActivity(...)");
                        MODEL model = this.f21755a.getModel();
                        ckf.f(model, "getModel(...)");
                        jcj jcjVar = new jcj(activity, khqVar, (acx) model, templateBean, viewGroup, new ye0(viewGroup));
                        jcjVar.bindWithData(muiseBean);
                        jcjVar.attachToContainer();
                    }
                }
            }
        }
    }

    public final void e(RecyclerView recyclerView, int i, TRecyclerView.HeaderViewAdapter headerViewAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8828d95", new Object[]{this, recyclerView, new Integer(i), headerViewAdapter});
            return;
        }
        RecyclerView.ViewHolder findViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(headerViewAdapter.getHeadersCount() + i);
        if (findViewHolderForAdapterPosition instanceof SearchMuiseViewHolder) {
            ((SearchMuiseViewHolder) findViewHolderForAdapterPosition).I2();
        } else {
            headerViewAdapter.notifyItemChanged(i + headerViewAdapter.getHeadersCount());
        }
    }

    public final void a(DynamicCardBean dynamicCardBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1572fcae", new Object[]{this, dynamicCardBean});
            return;
        }
        ckf.g(dynamicCardBean, "dynamicCardBean");
        if (((kib) this.f21755a.t2()).getRecyclerView() instanceof PartnerRecyclerView) {
            RESULT totalSearchResult = this.b.getTotalSearchResult();
            MetaListWidget metaListWidget = null;
            BaseSearchResult baseSearchResult = totalSearchResult instanceof BaseSearchResult ? (BaseSearchResult) totalSearchResult : null;
            if (baseSearchResult != null && dynamicCardBean.mDynamicCellBean != null) {
                JSONObject jSONObject = dynamicCardBean.mOriginData;
                String string = jSONObject.getString("recedItems");
                String string2 = jSONObject.getString("recedItem");
                if (!TextUtils.isEmpty(string)) {
                    this.b.setParam("recedItems", string);
                } else if (!TextUtils.isEmpty(string2)) {
                    this.b.addParam("recedItems", string2);
                }
                int e = srl.e(jSONObject.getString("position"), -1);
                String string3 = jSONObject.getString("insertType");
                if (dynamicCardBean.mDynamicCellBean instanceof SFAuctionBaseCellBean) {
                    string3 = sj4.TAB2_SOURCE_OUTSIDE;
                }
                if (TextUtils.equals(string3, sj4.TAB2_SOURCE_OUTSIDE) && e >= 0) {
                    this.b.insertCellToTotal(dynamicCardBean.mDynamicCellBean, e);
                    yw1<?, ?, ?, ?> yw1Var = this.f21755a;
                    if (yw1Var instanceof MetaListWidget) {
                        metaListWidget = (MetaListWidget) yw1Var;
                    }
                    if (metaListWidget != null) {
                        metaListWidget.W2(false);
                    }
                } else if (TextUtils.equals(string3, AgooConstants.MESSAGE_POPUP)) {
                    d(dynamicCardBean);
                } else if (e >= 0) {
                    c(e, baseSearchResult, dynamicCardBean);
                } else {
                    String string4 = jSONObject.getString("itemId");
                    JSONObject d = h19.d(jSONObject, "info");
                    if (d != null && TextUtils.isEmpty(string4)) {
                        string4 = d.getString("itemId");
                    }
                    if (!TextUtils.isEmpty(string4)) {
                        ckf.d(string4);
                        b(string4, baseSearchResult, dynamicCardBean);
                    }
                }
            }
        }
    }
}

package tb;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.search.mmd.datasource.bean.AuctionBaseBean;
import com.taobao.search.musie.NSMuiseViewHolder;
import com.taobao.search.sf.datasource.CommonBaseDatasource;
import com.taobao.search.sf.datasource.CommonSearchResult;
import com.ut.mini.UTAnalytics;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class h6p {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(815792280);
    }

    public static String[] a(Map<String, ?> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("77f1b591", new Object[]{map});
        }
        ArrayList arrayList = new ArrayList();
        if (map != null && !map.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            for (String str : map.keySet()) {
                Object obj = map.get(str);
                if (!TextUtils.isEmpty(str) && obj != null) {
                    sb.append(str);
                    sb.append("=");
                    sb.append(obj);
                    arrayList.add(sb.toString());
                    sb.setLength(0);
                }
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static void b(AuctionBaseBean auctionBaseBean, int i, CommonBaseDatasource commonBaseDatasource, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64365df4", new Object[]{auctionBaseBean, new Integer(i), commonBaseDatasource, view});
        } else if (!o4p.E2()) {
            c(c2v.getInstance().getCurrentPageName(), auctionBaseBean, i, commonBaseDatasource, view);
        }
    }

    public static void d(String str, String str2, Map<String, Object> map, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a4b2f01", new Object[]{str, str2, map, view});
        } else if (!TextUtils.isEmpty(str) && view != null && !o4p.E2()) {
            cqv.A(str, "Search-ItemExposure", str2, view, a(map));
            gtf.i().o(str, "expose", map, null);
        }
    }

    public static void e(AuctionBaseBean auctionBaseBean, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b796e587", new Object[]{auctionBaseBean, view});
        } else if (!o4p.E2()) {
            f(c2v.getInstance().getCurrentPageName(), auctionBaseBean, view);
        }
    }

    public static void f(String str, AuctionBaseBean auctionBaseBean, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1f83551", new Object[]{str, auctionBaseBean, view});
        } else if (auctionBaseBean != null && !auctionBaseBean.itemDisappearTracked && !o4p.E2() && !TextUtils.isEmpty(str) && view != null) {
            cqv.C(str, "Search-ItemExposure", auctionBaseBean.itemId, view, a(new HashMap()));
            auctionBaseBean.itemDisappearTracked = true;
        }
    }

    public static void g(AuctionBaseBean auctionBaseBean, String str, Context context, int i, Map<String, Object> map) {
        Map<String, String> pageProperties;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("395d1815", new Object[]{auctionBaseBean, str, context, new Integer(i), map});
        } else if (auctionBaseBean != null && !o4p.E2()) {
            HashMap hashMap = new HashMap();
            hashMap.put(yj4.PARAM_PVID, auctionBaseBean.rn);
            hashMap.put("index", String.valueOf(i));
            hashMap.put("utLogMap", JSON.toJSONString(auctionBaseBean.utLogMap));
            hashMap.put("keyword", str);
            BaseCellBean baseCellBean = auctionBaseBean.mOutterBean;
            if (baseCellBean != null) {
                hashMap.put(yj4.PARAM_SEARCH_KEYWORD_RN, baseCellBean.rn);
            }
            if (!(context == null || (pageProperties = UTAnalytics.getInstance().getDefaultTracker().getPageProperties(context)) == null || pageProperties.isEmpty())) {
                String str2 = pageProperties.get("spm-url");
                if (!TextUtils.isEmpty(str2)) {
                    hashMap.put("spm-url", str2);
                }
            }
            if (map != null) {
                hashMap.putAll(map);
            }
            cqv.u(c2v.getInstance().getCurrentPageName(), "Search-ItemClick", "", auctionBaseBean.itemId, a(hashMap));
        }
    }

    public static void h(String str, String str2, Map<String, Object> map, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fea58c2e", new Object[]{str, str2, map, obj});
        } else if (!TextUtils.isEmpty(str) && obj != null && !o4p.E2()) {
            c4p.D("SearchUserBehavior", str + " enter, args:%s", map);
            cqv.l(str, str2, obj, a(map));
        }
    }

    public static void i(String str, String str2, Map<String, Object> map, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d588272f", new Object[]{str, str2, map, obj});
        } else if (!TextUtils.isEmpty(str) && obj != null && !o4p.E2()) {
            c4p.D("SearchUserBehavior", str + " leave, args:%s", map);
            cqv.m(str, str2, obj, a(map));
        }
    }

    public static void j(CommonBaseDatasource commonBaseDatasource) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99ee6bb1", new Object[]{commonBaseDatasource});
        } else {
            k(commonBaseDatasource, null);
        }
    }

    public static void k(CommonBaseDatasource commonBaseDatasource, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26dc6b3b", new Object[]{commonBaseDatasource, str});
        } else if (commonBaseDatasource != null && !o4p.E2()) {
            CommonSearchResult commonSearchResult = (CommonSearchResult) commonBaseDatasource.getTotalSearchResult();
            CommonSearchResult commonSearchResult2 = (CommonSearchResult) commonBaseDatasource.getLastSearchResult();
            if (commonSearchResult != null && commonSearchResult2 != null && commonSearchResult2.isSuccess()) {
                HashMap hashMap = new HashMap();
                hashMap.put(yj4.PARAM_SEARCH_KEYWORD_RN, commonSearchResult2.getMainInfo().rn);
                hashMap.put("page", Integer.valueOf(commonSearchResult2.getMainInfo().page));
                hashMap.put("search_sessionid", commonSearchResult.getMainInfo().rn);
                hashMap.put("page_size", String.valueOf(commonSearchResult2.getCellsCount()));
                hashMap.put("query", commonSearchResult.getMainInfo().keyword);
                if (TextUtils.isEmpty(str)) {
                    str = c2v.getInstance().getCurrentPageName();
                }
                l(str, commonSearchResult2.getMainInfo().rn, hashMap);
            }
        }
    }

    public static void l(String str, String str2, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb4e294c", new Object[]{str, str2, map});
        } else if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !o4p.E2()) {
            c4p.m("SearchUserBehavior", "request,id:" + str2);
            cqv.s(str, "Search-Request", str2, a(map));
        }
    }

    public static void m(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c984bff", new Object[]{new Integer(i)});
        } else {
            cqv.G(c2v.getInstance().getCurrentPageName(), NSMuiseViewHolder.ACTION_LIST_SCROLL, 0, i, new String[0]);
        }
    }

    public static void n(int i, List<rm1> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4c4faf0", new Object[]{new Integer(i), list});
        } else {
            cqv.D(c2v.getInstance().getCurrentPageName(), NSMuiseViewHolder.ACTION_LIST_SCROLL, 0.0f, i, list, null);
        }
    }

    public static void o(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b30b7d58", new Object[]{new Integer(i)});
        } else {
            cqv.K(c2v.getInstance().getCurrentPageName(), NSMuiseViewHolder.ACTION_LIST_SCROLL, 0, i, new String[0]);
        }
    }

    public static void p(int i, List<rm1> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93c45a49", new Object[]{new Integer(i), list});
        } else {
            cqv.H(c2v.getInstance().getCurrentPageName(), NSMuiseViewHolder.ACTION_LIST_SCROLL, 0.0f, i, list, null);
        }
    }

    public static void q(int i, List<rm1> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e23c4d0", new Object[]{new Integer(i), list});
        } else {
            cqv.L(c2v.getInstance().getCurrentPageName(), NSMuiseViewHolder.ACTION_LIST_SCROLL, 0.0f, i, list, null);
        }
    }

    public static void c(String str, AuctionBaseBean auctionBaseBean, int i, CommonBaseDatasource commonBaseDatasource, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a54bfd6a", new Object[]{str, auctionBaseBean, new Integer(i), commonBaseDatasource, view});
        } else if (auctionBaseBean != null && !auctionBaseBean.itemAppearTracked && !o4p.E2()) {
            HashMap hashMap = new HashMap();
            hashMap.put(yj4.PARAM_SEARCH_KEYWORD_RN, auctionBaseBean.rn);
            hashMap.put(yj4.PARAM_PVID, auctionBaseBean.rn);
            hashMap.put("item_id", auctionBaseBean.itemId);
            hashMap.put("page", String.valueOf(auctionBaseBean.page));
            hashMap.put(yj4.PARAM_SEARCH_KEYWORD_POS, String.valueOf(i));
            hashMap.put("business", kp8.a(commonBaseDatasource));
            hashMap.put("utLogMap", JSON.toJSONString(auctionBaseBean.utLogMap));
            if (commonBaseDatasource != null) {
                hashMap.put("q", commonBaseDatasource.getKeyword());
                CommonSearchResult commonSearchResult = (CommonSearchResult) commonBaseDatasource.getTotalSearchResult();
                if (commonSearchResult != null) {
                    hashMap.put("sessionid", commonSearchResult.getMainInfo().rn);
                    if (commonSearchResult.getMainInfo().pageTraceArgs != null) {
                        String str2 = commonSearchResult.getMainInfo().pageTraceArgs.get("spm-cnt");
                        if (!TextUtils.isEmpty(str2)) {
                            String replace = str2.replace(".0.0", "");
                            hashMap.put("spm", replace + ".itemlist." + i);
                        }
                    }
                }
            }
            BaseCellBean baseCellBean = auctionBaseBean.mOutterBean;
            if (baseCellBean != null) {
                hashMap.put("pagePos", String.valueOf(baseCellBean.pagePos));
                hashMap.put("pageSize", String.valueOf(baseCellBean.pageSize));
            }
            d(str, auctionBaseBean.itemId, hashMap, view);
            auctionBaseBean.itemAppearTracked = true;
        }
    }
}

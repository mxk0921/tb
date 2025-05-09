package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.datasource.impl.bean.ResultMainInfoBean;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.search.jarvis.action.SearchRerankAction;
import com.taobao.search.sf.datasource.CommonSearchResult;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import tb.h1p;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class i6o extends xpo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final g6o c;

    static {
        t2o.a(815792283);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i6o(g6o g6oVar) {
        super("ReRank");
        ckf.g(g6oVar, "rerankParams");
        this.c = g6oVar;
    }

    private final Map<String, String> e(otf otfVar) {
        String str;
        ResultMainInfoBean mainInfo;
        ResultMainInfoBean mainInfo2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("24db0e94", new Object[]{this, otfVar});
        }
        HashMap hashMap = new HashMap();
        o02 e = otfVar.B2().e();
        ckf.f(e, "getScopeDatasource(...)");
        BaseSearchResult baseSearchResult = (BaseSearchResult) e.getTotalSearchResult();
        String str2 = null;
        hashMap.put(h1p.a.PARAM_KEY_FIRST_RN, (baseSearchResult == null || (mainInfo2 = baseSearchResult.getMainInfo()) == null) ? null : mainInfo2.rn);
        BaseSearchResult baseSearchResult2 = (BaseSearchResult) e.getTotalSearchResult();
        if (!(baseSearchResult2 == null || (mainInfo = baseSearchResult2.getMainInfo()) == null)) {
            str2 = mainInfo.abtest;
        }
        hashMap.put("wlsort", str2);
        if (TextUtils.equals(e.getParamValue("m"), r4p.VALUE_MODULE_INSHOP)) {
            str = "inshop";
        } else {
            str = "mainse";
        }
        hashMap.put("src", str);
        return hashMap;
    }

    private final BaseCellBean f(LinkedList<BaseCellBean> linkedList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseCellBean) ipChange.ipc$dispatch("84106c1d", new Object[]{this, linkedList});
        }
        while (!linkedList.isEmpty()) {
            BaseCellBean pollFirst = linkedList.pollFirst();
            if (ckf.b(pollFirst.cardType, "item")) {
                return pollFirst;
            }
        }
        return null;
    }

    private final BaseCellBean g(LinkedList<BaseCellBean> linkedList, otf otfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseCellBean) ipChange.ipc$dispatch("325a8db9", new Object[]{this, linkedList, otfVar});
        }
        while (!linkedList.isEmpty()) {
            BaseCellBean pollFirst = linkedList.pollFirst();
            if (ckf.b(pollFirst.cardType, "item")) {
                if (!otfVar.E2(pollFirst.itemId)) {
                    return pollFirst;
                }
                c4p.D("[XSearchJarvis]", pollFirst.itemId + " 已曝光过，去重", new Object[0]);
            }
        }
        return null;
    }

    public static /* synthetic */ Object ipc$super(i6o i6oVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/jarvis/action/RerankRunnable");
    }

    @Override // tb.xpo
    public void c() {
        String str;
        int i;
        CharSequence charSequence;
        int i2;
        String str2;
        BaseCellBean baseCellBean;
        String str3;
        String str4;
        ResultMainInfoBean mainInfo;
        i6o i6oVar = this;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15c1193f", new Object[]{i6oVar});
            return;
        }
        g6o g6oVar = i6oVar.c;
        JSONObject a2 = g6oVar.a();
        String b = g6oVar.b();
        ArrayList<BaseCellBean> c = g6oVar.c();
        ArrayList<BaseCellBean> d = g6oVar.d();
        otf e = g6oVar.e();
        o02 e2 = e.B2().e();
        ckf.f(e2, "getScopeDatasource(...)");
        BaseSearchResult baseSearchResult = (BaseSearchResult) e2.getTotalSearchResult();
        String str5 = null;
        String str6 = (baseSearchResult == null || (mainInfo = baseSearchResult.getMainInfo()) == null) ? null : mainInfo.rn;
        if (a2 != null) {
            str5 = a2.getString("skip_remove_repeat");
        }
        boolean equals = TextUtils.equals(str5, "true");
        String str7 = "[XSearchJarvis]";
        if (equals) {
            c4p.D(str7, "不进行去重", new Object[0]);
        }
        if (e2.isTaskRunning()) {
            SearchRerankAction.Companion.c(e, a2);
        } else if (!TextUtils.equals(str6, b)) {
            SearchRerankAction.Companion.b(e, a2);
        } else {
            BaseSearchResult baseSearchResult2 = (BaseSearchResult) e2.getTotalSearchResult();
            if (baseSearchResult2 != null) {
                int v2 = e.v2();
                int intValue = a2 != null ? a2.getIntValue("replace_pos") : 0;
                if (v2 >= 0 && v2 <= baseSearchResult2.getCellsCount()) {
                    if (intValue <= 0) {
                        intValue = v2 + 1;
                    }
                    int cellsCount = baseSearchResult2.getCellsCount();
                    int i3 = 0;
                    int i4 = 0;
                    for (int i5 = intValue; i5 < cellsCount; i5++) {
                        BaseCellBean cell = baseSearchResult2.getCell(i5);
                        if (ckf.b(cell.cardType, "item") && (!cell.isExposed || equals)) {
                            if (!cell.isP4p) {
                                i3++;
                            } else if (!cell.isDynamicLandP4p) {
                                i4++;
                            }
                        }
                    }
                    LinkedList<BaseCellBean> linkedList = new LinkedList<>();
                    int size = c.size();
                    int i6 = 0;
                    while (true) {
                        str = "get(...)";
                        if (i6 >= size) {
                            break;
                        }
                        BaseCellBean baseCellBean2 = c.get(i6);
                        ckf.f(baseCellBean2, str);
                        BaseCellBean baseCellBean3 = baseCellBean2;
                        if (!e.E2(baseCellBean3.itemId) || equals) {
                            linkedList.add(baseCellBean3);
                        }
                        i6++;
                    }
                    LinkedList<BaseCellBean> linkedList2 = new LinkedList<>();
                    int size2 = d.size();
                    int i7 = 0;
                    while (i7 < size2) {
                        BaseCellBean baseCellBean4 = d.get(i7);
                        ckf.f(baseCellBean4, str);
                        BaseCellBean baseCellBean5 = baseCellBean4;
                        if (!e.E2(baseCellBean5.itemId) || equals) {
                            linkedList2.add(baseCellBean5);
                        }
                        i7++;
                        size2 = size2;
                        str = str;
                    }
                    c4p.D(str7, "未曝光自然结果个数" + i3 + ", 广告个数" + i4 + ";重排自然结果个数" + linkedList.size() + ",广告个数" + linkedList2.size(), new Object[0]);
                    if (linkedList.size() >= i3 || equals) {
                        i = intValue;
                        charSequence = "item";
                    } else {
                        if (c.size() > 0) {
                            i = intValue;
                            charSequence = "item";
                            SearchRerankAction.Companion.d(e, i3, linkedList.size(), c.size(), a2);
                        } else {
                            i = intValue;
                            charSequence = "item";
                        }
                        linkedList.clear();
                    }
                    if (linkedList2.size() < i4 && !equals) {
                        if (d.size() > 0) {
                            SearchRerankAction.Companion.e(e, i4, linkedList2.size(), d.size(), a2);
                        }
                        linkedList2.clear();
                    }
                    if (!linkedList.isEmpty() || !linkedList2.isEmpty()) {
                        RESULT totalSearchResult = e.B2().e().getTotalSearchResult();
                        ckf.e(totalSearchResult, "null cannot be cast to non-null type com.taobao.search.sf.datasource.CommonSearchResult");
                        CommonSearchResult commonSearchResult = (CommonSearchResult) totalSearchResult;
                        if (t70.c().f()) {
                            int cellsCount2 = commonSearchResult.getCellsCount();
                            int i8 = i;
                            while (i8 < cellsCount2) {
                                BaseCellBean cell2 = commonSearchResult.getCell(i8);
                                if (!TextUtils.equals(cell2.cardType, charSequence)) {
                                    a2 = a2;
                                } else {
                                    a2 = a2;
                                    StringBuilder sb = new StringBuilder("替换前第");
                                    sb.append(i8);
                                    sb.append("位的");
                                    if (cell2.isP4p) {
                                        str4 = "广告";
                                    } else {
                                        str4 = "自然";
                                    }
                                    sb.append(str4);
                                    sb.append("结果 ");
                                    sb.append(cell2.itemId);
                                    sb.append(", page:");
                                    sb.append(cell2.pageNo);
                                    sb.append(",pagePos:");
                                    sb.append(cell2.pagePos);
                                    sb.append(",pageSize:");
                                    sb.append(cell2.pageSize);
                                    c4p.D(str7, sb.toString(), new Object[0]);
                                }
                                i8++;
                                cellsCount2 = cellsCount2;
                                commonSearchResult = commonSearchResult;
                            }
                        }
                        sen.a("SearchEdgeCompute", "SearchRerankBeforeReplace", i6oVar.e(e));
                        int i9 = Integer.MAX_VALUE;
                        int i10 = i;
                        for (int cellsCount3 = baseSearchResult2.getCellsCount(); i10 < cellsCount3; cellsCount3 = cellsCount3) {
                            BaseCellBean cell3 = baseSearchResult2.getCell(i10);
                            if (!ckf.b(cell3.cardType, charSequence)) {
                                charSequence = charSequence;
                            } else {
                                boolean z = cell3.isP4p;
                                charSequence = charSequence;
                                if ((!z || !cell3.isDynamicLandP4p) && ((!cell3.isExposed || equals) && (!z ? !equals ? (baseCellBean = i6oVar.g(linkedList, e)) != null : (baseCellBean = i6oVar.f(linkedList)) != null : !equals ? (baseCellBean = i6oVar.g(linkedList2, e)) != null : (baseCellBean = i6oVar.f(linkedList2)) != null))) {
                                    a2 = a2;
                                    linkedList = linkedList;
                                    linkedList2 = linkedList2;
                                    charSequence = charSequence;
                                    baseSearchResult2 = baseSearchResult2;
                                    i = i;
                                    str7 = str7;
                                    w3p.INSTANCE.f(i10, baseCellBean, baseSearchResult2, e, h19.d(a2, "utlogmap_dict"));
                                    StringBuilder sb2 = new StringBuilder("rerank: 第 ");
                                    sb2.append(i10);
                                    sb2.append(" 位的");
                                    if (cell3.isP4p) {
                                        str3 = "广告";
                                    } else {
                                        str3 = "自然";
                                    }
                                    sb2.append(str3);
                                    sb2.append("结果 ");
                                    sb2.append(cell3.itemId);
                                    sb2.append(" 被替换为 ");
                                    sb2.append(baseCellBean.itemId);
                                    sb2.append(' ');
                                    c4p.D(str7, sb2.toString(), new Object[0]);
                                    i9 = Math.min(i9, i10);
                                    i10++;
                                    i6oVar = this;
                                }
                            }
                            linkedList = linkedList;
                            linkedList2 = linkedList2;
                            baseSearchResult2 = baseSearchResult2;
                            str7 = str7;
                            i = i;
                            a2 = a2;
                            i10++;
                            i6oVar = this;
                        }
                        if (t70.c().f()) {
                            int cellsCount4 = commonSearchResult.getCellsCount();
                            int i11 = i;
                            while (i11 < cellsCount4) {
                                BaseCellBean cell4 = commonSearchResult.getCell(i11);
                                if (!TextUtils.equals(cell4.cardType, charSequence)) {
                                    i2 = 1;
                                } else {
                                    StringBuilder sb3 = new StringBuilder("替换后第");
                                    sb3.append(i11);
                                    sb3.append("位的");
                                    if (cell4.isP4p) {
                                        str2 = "广告";
                                    } else {
                                        str2 = "自然";
                                    }
                                    sb3.append(str2);
                                    sb3.append("结果 ");
                                    sb3.append(cell4.itemId);
                                    sb3.append(", page:");
                                    sb3.append(cell4.pageNo);
                                    sb3.append(",pagePos:");
                                    sb3.append(cell4.pagePos);
                                    sb3.append(",pageSize:");
                                    sb3.append(cell4.pageSize);
                                    c4p.D(str7, sb3.toString(), new Object[0]);
                                    i2 = 1;
                                }
                                i11 += i2;
                                commonSearchResult = commonSearchResult;
                            }
                        }
                        e.postScopeEvent(v2p.a(i, baseSearchResult2.getCellsCount() - i), "childPageWidget");
                    }
                }
            }
        }
    }
}

package com.taobao.message.lab.comfrm.util;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import tb.ckf;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\f\u0010\u0003\u001a\u0004\u0018\u00010\u0004*\u00020\u0002\u001a\n\u0010\u0005\u001a\u00020\u0001*\u00020\u0002\u001a\f\u0010\u0006\u001a\u0004\u0018\u00010\u0004*\u00020\u0002\u001a\u0010\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\b*\u00020\u0002\u001a9\u0010\t\u001a\u0004\u0018\u00010\n\"\u0004\b\u0000\u0010\u000b*\u0010\u0012\u0004\u0012\u0002H\u000b\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\u0006\u0010\u000e\u001a\u0002H\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u0010¨\u0006\u0011"}, d2 = {"findFirstVisiblePosition", "", "Landroidx/recyclerview/widget/RecyclerView;", "findFirstVisibleViewHoler", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "findLastVisiblePosition", "findLastVisibleViewHoler", "findVisibleViewHolderList", "", "safeGetString", "", "T", "", "", "key", "defalutValue", "(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;", "message_comfrm_release"}, k = 2, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class ExtentionFunctionKt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(537919885);
    }

    public static final int findFirstVisiblePosition(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b40ff2bf", new Object[]{recyclerView})).intValue();
        }
        ckf.g(recyclerView, "$this$findFirstVisiblePosition");
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (!(layoutManager instanceof LinearLayoutManager)) {
            layoutManager = null;
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        if (linearLayoutManager != null) {
            return linearLayoutManager.findFirstVisibleItemPosition();
        }
        return -1;
    }

    public static final RecyclerView.ViewHolder findFirstVisibleViewHoler(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView.ViewHolder) ipChange.ipc$dispatch("59107b3c", new Object[]{recyclerView});
        }
        ckf.g(recyclerView, "$this$findFirstVisibleViewHoler");
        return recyclerView.findViewHolderForPosition(findFirstVisiblePosition(recyclerView));
    }

    public static final int findLastVisiblePosition(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7b4c9037", new Object[]{recyclerView})).intValue();
        }
        ckf.g(recyclerView, "$this$findLastVisiblePosition");
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (!(layoutManager instanceof LinearLayoutManager)) {
            layoutManager = null;
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        if (linearLayoutManager != null) {
            return linearLayoutManager.findLastVisibleItemPosition();
        }
        return -1;
    }

    public static final RecyclerView.ViewHolder findLastVisibleViewHoler(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView.ViewHolder) ipChange.ipc$dispatch("f31d4eb4", new Object[]{recyclerView});
        }
        ckf.g(recyclerView, "$this$findLastVisibleViewHoler");
        return recyclerView.findViewHolderForPosition(findLastVisiblePosition(recyclerView));
    }

    public static final List<RecyclerView.ViewHolder> findVisibleViewHolderList(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("f6162e7f", new Object[]{recyclerView});
        }
        ckf.g(recyclerView, "$this$findVisibleViewHolderList");
        ArrayList arrayList = new ArrayList();
        int findFirstVisiblePosition = findFirstVisiblePosition(recyclerView);
        int findLastVisiblePosition = findLastVisiblePosition(recyclerView);
        if (findFirstVisiblePosition >= findLastVisiblePosition) {
            return arrayList;
        }
        if (findFirstVisiblePosition <= findLastVisiblePosition) {
            while (true) {
                RecyclerView.ViewHolder findViewHolderForPosition = recyclerView.findViewHolderForPosition(findFirstVisiblePosition);
                if (findViewHolderForPosition != null) {
                    arrayList.add(findViewHolderForPosition);
                }
                if (findFirstVisiblePosition == findLastVisiblePosition) {
                    break;
                }
                findFirstVisiblePosition++;
            }
        }
        return arrayList;
    }

    public static final <T> String safeGetString(Map<T, Object> map, T t, String str) {
        String obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("88542156", new Object[]{map, t, str});
        }
        if (map == null) {
            return str;
        }
        try {
            Object obj2 = map.get(t);
            if (obj2 == null) {
                return str;
            }
            if (obj2 instanceof String) {
                obj = (String) obj2;
            } else {
                obj = obj2.toString();
            }
            return obj;
        } catch (Exception unused) {
            return str;
        }
    }

    public static /* synthetic */ String safeGetString$default(Map map, Object obj, String str, int i, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("925acc2e", new Object[]{map, obj, str, new Integer(i), obj2});
        }
        if ((i & 2) != 0) {
            str = null;
        }
        return safeGetString(map, obj, str);
    }
}

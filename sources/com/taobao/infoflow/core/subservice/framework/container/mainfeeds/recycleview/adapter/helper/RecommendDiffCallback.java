package com.taobao.infoflow.core.subservice.framework.container.mainfeeds.recycleview.adapter.helper;

import android.text.TextUtils;
import androidx.recyclerview.widget.DiffUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class RecommendDiffCallback extends DiffUtil.Callback {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BIZ_SECTION_BIZ_CODE = "sectionBizCode";

    /* renamed from: a  reason: collision with root package name */
    public final List<BaseSectionModel> f10672a;
    public final List<BaseSectionModel> b;

    static {
        t2o.a(486539675);
    }

    public RecommendDiffCallback(List<BaseSectionModel> list, List<BaseSectionModel> list2) {
        this.f10672a = list2;
        this.b = list;
    }

    public static /* synthetic */ Object ipc$super(RecommendDiffCallback recommendDiffCallback, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/core/subservice/framework/container/mainfeeds/recycleview/adapter/helper/RecommendDiffCallback");
    }

    public final BaseSectionModel a(List<BaseSectionModel> list, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseSectionModel) ipChange.ipc$dispatch("500469b0", new Object[]{this, list, new Integer(i)});
        }
        if (list == null || list.isEmpty() || i < 0 || i >= list.size()) {
            return null;
        }
        return list.get(i);
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public boolean areContentsTheSame(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a1603f74", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
        }
        if (a(this.b, i) == a(this.f10672a, i2)) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public int getNewListSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f8e07243", new Object[]{this})).intValue();
        }
        List<BaseSectionModel> list = this.f10672a;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public int getOldListSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cc12e44a", new Object[]{this})).intValue();
        }
        List<BaseSectionModel> list = this.b;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public boolean areItemsTheSame(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("501767f6", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
        }
        BaseSectionModel a2 = a(this.b, i);
        BaseSectionModel a3 = a(this.f10672a, i2);
        if (a2 != a3) {
            return (a2 == null || a3 == null || !TextUtils.equals(a2.getString("sectionBizCode"), a3.getString("sectionBizCode"))) ? false : true;
        }
        return true;
    }
}

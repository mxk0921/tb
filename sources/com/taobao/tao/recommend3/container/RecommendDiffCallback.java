package com.taobao.tao.recommend3.container;

import android.text.TextUtils;
import androidx.recyclerview.widget.DiffUtil;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class RecommendDiffCallback extends DiffUtil.Callback {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final List<SectionModel> f12645a;
    public final List<SectionModel> b;

    static {
        t2o.a(729809650);
    }

    public RecommendDiffCallback(List<SectionModel> list, List<SectionModel> list2) {
        this.f12645a = list2;
        this.b = list;
    }

    public static /* synthetic */ Object ipc$super(RecommendDiffCallback recommendDiffCallback, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/recommend3/container/RecommendDiffCallback");
    }

    public final JSONObject a(List<SectionModel> list, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("70f5638e", new Object[]{this, list, new Integer(i)});
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
        JSONObject a2 = a(this.b, i);
        JSONObject a3 = a(this.f12645a, i2);
        if (a2 == a3) {
            return true;
        }
        if (a2 == null || !a2.equals(a3)) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public int getNewListSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f8e07243", new Object[]{this})).intValue();
        }
        List<SectionModel> list = this.f12645a;
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
        List<SectionModel> list = this.b;
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
        JSONObject a2 = a(this.b, i);
        JSONObject a3 = a(this.f12645a, i2);
        if (a2 != a3) {
            return (a2 == null || a3 == null || !TextUtils.equals(a2.getString("sectionBizCode"), a3.getString("sectionBizCode"))) ? false : true;
        }
        return true;
    }
}

package com.taobao.mytaobao.pagev2.diff;

import androidx.recyclerview.widget.DiffUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import java.util.List;
import kotlin.Metadata;
import tb.ckf;
import tb.h3j;
import tb.t2o;
import tb.yz3;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/taobao/mytaobao/pagev2/diff/MtbDxDownloadDiffCallback;", "Landroidx/recyclerview/widget/DiffUtil$Callback;", "taobao_mytaobao_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class MtbDxDownloadDiffCallback extends DiffUtil.Callback {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final List<h3j> f11291a;
    public final List<String> b;

    static {
        t2o.a(745537945);
    }

    public MtbDxDownloadDiffCallback(List<h3j> list, List<String> list2) {
        DXTemplateItem c;
        String str;
        ckf.h(list, "oldList");
        ckf.h(list2, "updatedDxNameList");
        this.f11291a = list;
        this.b = list2;
        int i = 0;
        for (Object obj : list) {
            i++;
            if (i >= 0) {
                h3j h3jVar = (h3j) obj;
                if (ckf.b(h3jVar.a(), "dinamicx") && (c = h3jVar.c()) != null && (str = c.f7343a) != null && this.b.contains(str)) {
                    h3jVar.l(true);
                }
            } else {
                yz3.p();
                throw null;
            }
        }
    }

    public static /* synthetic */ Object ipc$super(MtbDxDownloadDiffCallback mtbDxDownloadDiffCallback, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mytaobao/pagev2/diff/MtbDxDownloadDiffCallback");
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public boolean areContentsTheSame(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a1603f74", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
        }
        if (this.f11291a.get(i).d()) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public boolean areItemsTheSame(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("501767f6", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
        }
        if (i == i2) {
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
        return this.f11291a.size();
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public int getOldListSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cc12e44a", new Object[]{this})).intValue();
        }
        return this.f11291a.size();
    }
}

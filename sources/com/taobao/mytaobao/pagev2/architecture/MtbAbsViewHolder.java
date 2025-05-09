package com.taobao.mytaobao.pagev2.architecture;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import tb.ckf;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/taobao/mytaobao/pagev2/architecture/MtbAbsViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "taobao_mytaobao_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class MtbAbsViewHolder extends RecyclerView.ViewHolder {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f11279a;

    static {
        t2o.a(745537900);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtbAbsViewHolder(View view, String str) {
        super(view);
        ckf.h(view, "v");
        ckf.h(str, "identifier");
        this.f11279a = str;
    }

    public static /* synthetic */ Object ipc$super(MtbAbsViewHolder mtbAbsViewHolder, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mytaobao/pagev2/architecture/MtbAbsViewHolder");
    }

    public final String b0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9b1733ba", new Object[]{this});
        }
        return this.f11279a;
    }
}

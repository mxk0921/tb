package com.taobao.mytaobao.basement.weex;

import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.d1a;

/* compiled from: Taobao */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/view/View$OnLayoutChangeListener;", "invoke"}, k = 3, mv = {1, 1, 15})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class BasementWeexView$layoutChangeListener$2 extends Lambda implements d1a<View.OnLayoutChangeListener> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ BasementWeexView this$0;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a implements View.OnLayoutChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("899df952", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8)});
            } else {
                BasementWeexView.access$processOnLayoutChange(BasementWeexView$layoutChangeListener$2.this.this$0, i, i2, i3, i4);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasementWeexView$layoutChangeListener$2(BasementWeexView basementWeexView) {
        super(0);
        this.this$0 = basementWeexView;
    }

    public static /* synthetic */ Object ipc$super(BasementWeexView$layoutChangeListener$2 basementWeexView$layoutChangeListener$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mytaobao/basement/weex/BasementWeexView$layoutChangeListener$2");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // tb.d1a
    public final View.OnLayoutChangeListener invoke() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View.OnLayoutChangeListener) ipChange.ipc$dispatch("2aee9844", new Object[]{this}) : new a();
    }
}

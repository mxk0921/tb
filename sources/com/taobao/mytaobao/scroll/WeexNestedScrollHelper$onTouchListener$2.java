package com.taobao.mytaobao.scroll;

import android.view.MotionEvent;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.d1a;

/* compiled from: Taobao */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/view/View$OnTouchListener;", "invoke"}, k = 3, mv = {1, 1, 15})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class WeexNestedScrollHelper$onTouchListener$2 extends Lambda implements d1a<View.OnTouchListener> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ WeexNestedScrollHelper this$0;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a implements View.OnTouchListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
            }
            WeexNestedScrollHelper weexNestedScrollHelper = WeexNestedScrollHelper$onTouchListener$2.this.this$0;
            ckf.c(motionEvent, "event");
            WeexNestedScrollHelper.b(weexNestedScrollHelper, motionEvent);
            return true;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WeexNestedScrollHelper$onTouchListener$2(WeexNestedScrollHelper weexNestedScrollHelper) {
        super(0);
        this.this$0 = weexNestedScrollHelper;
    }

    public static /* synthetic */ Object ipc$super(WeexNestedScrollHelper$onTouchListener$2 weexNestedScrollHelper$onTouchListener$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mytaobao/scroll/WeexNestedScrollHelper$onTouchListener$2");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // tb.d1a
    public final View.OnTouchListener invoke() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View.OnTouchListener) ipChange.ipc$dispatch("e21264d1", new Object[]{this}) : new a();
    }
}

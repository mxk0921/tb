package com.taobao.android.turbo.service.pop;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Regex;
import tb.ckf;
import tb.g1a;
import tb.i04;
import tb.mqu;
import tb.tpu;
import tb.xhv;
import tb.yz3;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", AdvanceSetting.NETWORK_TYPE, "Ltb/xhv;", "invoke", "(Ljava/lang/Object;)V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class LiveMsgBoxManager$initShowCnt$1 extends Lambda implements g1a<Object, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ String $today;
    public final /* synthetic */ LiveMsgBoxManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveMsgBoxManager$initShowCnt$1(LiveMsgBoxManager liveMsgBoxManager, String str) {
        super(1);
        this.this$0 = liveMsgBoxManager;
        this.$today = str;
    }

    public static /* synthetic */ Object ipc$super(LiveMsgBoxManager$initShowCnt$1 liveMsgBoxManager$initShowCnt$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/turbo/service/pop/LiveMsgBoxManager$initShowCnt$1");
    }

    @Override // tb.g1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Object obj) {
        List list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5411b1b", new Object[]{this, obj});
        } else if (obj instanceof String) {
            List<String> split = new Regex("=").split((CharSequence) obj, 0);
            if (!split.isEmpty()) {
                ListIterator<String> listIterator = split.listIterator(split.size());
                while (listIterator.hasPrevious()) {
                    if (listIterator.previous().length() != 0) {
                        list = i04.v0(split, listIterator.nextIndex() + 1);
                        break;
                    }
                }
            }
            list = yz3.i();
            Object[] array = list.toArray(new String[0]);
            if (array != null) {
                String[] strArr = (String[]) array;
                if (strArr.length == 2) {
                    String str = strArr[0];
                    String str2 = strArr[1];
                    if (ckf.b(str, this.$today)) {
                        LiveMsgBoxManager.g(this.this$0, mqu.Companion.d(str2, 0));
                        tpu.a aVar = tpu.Companion;
                        tpu.a.b(aVar, LiveMsgBoxManager.TAG, "initShowCnt, today: " + this.$today + ", perDayShowCnt: " + LiveMsgBoxManager.b(this.this$0), null, 4, null);
                        return;
                    }
                    return;
                }
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
    }
}

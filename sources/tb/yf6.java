package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class yf6 extends ob5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_BOTTOM_CARD_HIDE = "bottomCardHide";
    public static final String ACTION_BOTTOM_CARD_SWITCH = "bottomCardSwitch";
    public static final String ACTION_RECOMMEND_ITEM_CLICK = "recommendItemClick";
    public static final String ACTION_TRAIN_BOTTOM_CARD_CLICK = "trainBottomCardClick";
    public static final long DX_EVENT_TAOLIVEHOTRESERVATIONCARDACTION = -9013596898127648120L;

    static {
        t2o.a(295698549);
    }

    public static /* synthetic */ Object ipc$super(yf6 yf6Var, String str, Object... objArr) {
        if (str.hashCode() == 1785185506) {
            super.prepareBindEventWithArgs((Object[]) objArr[0], (DXRuntimeContext) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/bottom/guide/dx/DXTaoLiveHotReservationCardActionEventHandler");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004c, code lost:
        if (r11.equals(tb.yf6.ACTION_BOTTOM_CARD_SWITCH) == false) goto L_0x0046;
     */
    @Override // tb.ob5, tb.mvb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void handleEvent(com.taobao.android.dinamicx.expression.event.DXEvent r11, java.lang.Object[] r12, com.taobao.android.dinamicx.DXRuntimeContext r13) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.yf6.handleEvent(com.taobao.android.dinamicx.expression.event.DXEvent, java.lang.Object[], com.taobao.android.dinamicx.DXRuntimeContext):void");
    }

    @Override // tb.ob5, tb.mvb
    public void prepareBindEventWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a67c4e2", new Object[]{this, objArr, dXRuntimeContext});
        } else {
            super.prepareBindEventWithArgs(objArr, dXRuntimeContext);
        }
    }
}

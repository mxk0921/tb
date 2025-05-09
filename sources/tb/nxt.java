package tb;

import android.text.Layout;
import android.text.Spannable;
import android.text.method.BaseMovementMethod;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class nxt extends BaseMovementMethod {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static nxt f25024a;

    static {
        t2o.a(912262731);
    }

    public static nxt a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nxt) ipChange.ipc$dispatch("266c6200", new Object[0]);
        }
        if (f25024a == null) {
            f25024a = new nxt();
        }
        return f25024a;
    }

    public static /* synthetic */ Object ipc$super(nxt nxtVar, String str, Object... objArr) {
        if (str.hashCode() == 1600562927) {
            return new Boolean(super.onTouchEvent((TextView) objArr[0], (Spannable) objArr[1], (MotionEvent) objArr[2]));
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/transfer/widget/rich/TitleClickLinkMovementMethod");
    }

    @Override // android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    public boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f66a6ef", new Object[]{this, textView, spannable, motionEvent})).booleanValue();
        }
        int action = motionEvent.getAction();
        if (action == 1 || action == 0) {
            int x = ((int) motionEvent.getX()) - textView.getTotalPaddingLeft();
            int y = ((int) motionEvent.getY()) - textView.getTotalPaddingTop();
            int scrollX = x + textView.getScrollX();
            int scrollY = y + textView.getScrollY();
            Layout layout = textView.getLayout();
            int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical(scrollY), scrollX);
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
            if (clickableSpanArr.length != 0) {
                if (action == 1) {
                    clickableSpanArr[0].onClick(textView);
                }
                return true;
            }
        }
        return super.onTouchEvent(textView, spannable, motionEvent);
    }
}

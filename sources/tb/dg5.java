package tb;

import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.infoflow.core.subservice.base.item.dxservice.impl.dinamic3.view.HMultiSelectView;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class dg5 extends ob5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_CHANGEVISIBLEITEM = -279868442483546412L;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ DXRootView f17784a;
        public final /* synthetic */ int b;
        public final /* synthetic */ String c;

        public a(DXRootView dXRootView, int i, String str) {
            this.f17784a = dXRootView;
            this.b = i;
            this.c = str;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                return;
            }
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            ViewGroup.LayoutParams layoutParams = this.f17784a.getLayoutParams();
            layoutParams.height = intValue;
            this.f17784a.setLayoutParams(layoutParams);
            if (intValue == this.b && TextUtils.equals("true", this.c)) {
                ja6.b(HMultiSelectView.FEEDBACK_ROOT_USER_ID, this.f17784a);
            }
        }
    }

    static {
        t2o.a(729809002);
    }

    public static /* synthetic */ Object ipc$super(dg5 dg5Var, String str, Object... objArr) {
        if (str.hashCode() == 1785185506) {
            super.prepareBindEventWithArgs((Object[]) objArr[0], (DXRuntimeContext) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/homepage/dinamic3/eventhandler/DXChangeVisibleItemEventHandler");
    }

    public final void a(DXRootView dXRootView, int i, boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d62aebf", new Object[]{this, dXRootView, new Integer(i), new Boolean(z), str});
        } else if (dXRootView != null && i >= 0) {
            if (!z) {
                ViewGroup.LayoutParams layoutParams = dXRootView.getLayoutParams();
                layoutParams.height = i;
                dXRootView.setLayoutParams(layoutParams);
                return;
            }
            ValueAnimator ofInt = ValueAnimator.ofInt(dXRootView.getHeight(), i);
            ofInt.addUpdateListener(new a(dXRootView, i, str));
            ofInt.setDuration(150L);
            ofInt.start();
        }
    }

    @Override // tb.ob5, tb.mvb
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        int layoutHeight;
        DXRootView L;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
        } else if (objArr.length >= 5) {
            String str = (String) objArr[0];
            String str2 = (String) objArr[3];
            String str3 = (String) objArr[4];
            DXWidgetNode queryWidgetNodeByUserId = dXRuntimeContext.L().getExpandWidgetNode().queryWidgetNodeByUserId((String) objArr[2]);
            if (queryWidgetNodeByUserId != null && (layoutHeight = queryWidgetNodeByUserId.getLayoutHeight()) > 0) {
                cfc c = j18.c(dXRuntimeContext);
                if (c == null) {
                    fve.e("DXChangeVisibleItemEventHandler", "infoFlowContext is null");
                } else if (((IMainFeedsViewService) c.a(IMainFeedsViewService.class)) != null && (L = dXRuntimeContext.L()) != null) {
                    a(L, layoutHeight, TextUtils.equals(str2, "0"), str3);
                }
            }
        }
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

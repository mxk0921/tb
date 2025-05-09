package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.expression.event.DXPageChangeEvent;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class q66 extends ob5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_ONMTBEQUITYSLIDERFINISH = -5998667899133847972L;

    /* renamed from: a  reason: collision with root package name */
    public final ko5 f26536a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f26537a;

        public a(View view) {
            this.f26537a = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.f26537a.setVisibility(8);
            }
        }
    }

    static {
        t2o.a(745538097);
    }

    public q66(ko5 ko5Var) {
        this.f26536a = ko5Var;
    }

    public static /* synthetic */ Object ipc$super(q66 q66Var, String str, Object... objArr) {
        if (str.hashCode() == 1785185506) {
            super.prepareBindEventWithArgs((Object[]) objArr[0], (DXRuntimeContext) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mytaobao/ultron/dinamicX/eventHandler/DXOnMtbEquitySliderFinishEventHandler");
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

    @Override // tb.ob5, tb.mvb
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
        } else if (dXRuntimeContext != null) {
            Object obj = objArr[0];
            if (obj instanceof String) {
                if ("write".equals(String.valueOf(obj)) && objArr.length >= 4) {
                    this.f26536a.k((String) objArr[1], (String) objArr[2], (String) objArr[3]);
                }
                if (dXEvent instanceof DXPageChangeEvent) {
                    try {
                        i = Integer.parseInt((String) objArr[0]);
                    } catch (Exception unused) {
                    }
                    if (((DXPageChangeEvent) dXEvent).pageIndex == i - 1) {
                        View D = dXRuntimeContext.D();
                        D.postDelayed(new a(D), 150L);
                    }
                }
            }
        }
    }
}

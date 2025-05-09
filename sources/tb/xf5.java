package tb;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.ultron.datamodel.imp.DMComponent;
import com.taobao.weex.common.Constants;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class xf5 extends ob5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_CARTSEARCHFOCUS = 6535997198639430927L;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ EditText f31346a;
        public final /* synthetic */ JSONObject b;

        public a(EditText editText, JSONObject jSONObject) {
            this.f31346a = editText;
            this.b = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            InputMethodManager inputMethodManager;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            if (this.f31346a.requestFocus() && (inputMethodManager = (InputMethodManager) this.f31346a.getContext().getSystemService("input_method")) != null) {
                inputMethodManager.showSoftInput(this.f31346a, 1);
            }
            this.b.put(Constants.Event.FOCUS, (Object) "false");
        }
    }

    static {
        t2o.a(478150708);
    }

    public static /* synthetic */ Object ipc$super(xf5 xf5Var, String str, Object... objArr) {
        if (str.hashCode() == 1785185506) {
            super.prepareBindEventWithArgs((Object[]) objArr[0], (DXRuntimeContext) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/icart/dx/DXCartSearchFocusEventHandler");
    }

    @Override // tb.ob5, tb.mvb
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        JSONObject fields;
        EditText editText;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
            return;
        }
        View D = dXRuntimeContext.D();
        DMComponent dMComponent = (DMComponent) ((Map) dXRuntimeContext.q()).get(xo7.TAG_DINAMICX_VIEW_COMPONENT);
        kmb b = yn2.b(dXRuntimeContext);
        if (dMComponent != null && b != null && (fields = dMComponent.getFields()) != null && fields.getBooleanValue(Constants.Event.FOCUS) && (editText = (EditText) D.findViewWithTag("editText")) != null) {
            editText.post(new a(editText, fields));
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

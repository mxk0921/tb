package com.taobao.message.chat.input.uieventhandler;

import com.alipay.android.msp.drivers.actions.MspEventTypes;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.message.chat.component.chatinput.node.IGrowingTextInput;
import kotlin.Metadata;
import tb.ckf;
import tb.ic1;
import tb.ob5;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\f\u001a\u00020\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0010\u0010\b\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0007\u0018\u00010\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/taobao/message/chat/input/uieventhandler/KeyboardUIEventHandler;", "Ltb/ob5;", "<init>", "()V", "Lcom/taobao/android/dinamicx/expression/event/DXEvent;", "event", "", "", "args", "Lcom/taobao/android/dinamicx/DXRuntimeContext;", "runtimeContext", "Ltb/xhv;", "handleEvent", "(Lcom/taobao/android/dinamicx/expression/event/DXEvent;[Ljava/lang/Object;Lcom/taobao/android/dinamicx/DXRuntimeContext;)V", "message_sp_framework_debug"}, k = 1, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class KeyboardUIEventHandler extends ob5 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(552599583);
    }

    public static /* synthetic */ Object ipc$super(KeyboardUIEventHandler keyboardUIEventHandler, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/message/chat/input/uieventhandler/KeyboardUIEventHandler");
    }

    @Override // tb.ob5, tb.mvb
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        DXRootView L;
        DXWidgetNode expandWidgetNode;
        DXRootView L2;
        DXWidgetNode expandWidgetNode2;
        DXRootView L3;
        DXWidgetNode expandWidgetNode3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
            return;
        }
        IGrowingTextInput iGrowingTextInput = null;
        Object L4 = objArr != null ? ic1.L(objArr, 0) : null;
        if (!(L4 instanceof String)) {
            L4 = null;
        }
        String str = (String) L4;
        if (str != null) {
            Object L5 = objArr != null ? ic1.L(objArr, 1) : null;
            if (!(L5 instanceof String)) {
                L5 = null;
            }
            String str2 = (String) L5;
            if (str2 != null) {
                switch (str.hashCode()) {
                    case -1302916015:
                        if (str.equals("openKeyboard")) {
                            DXWidgetNode queryWidgetNodeByUserId = (dXRuntimeContext == null || (L = dXRuntimeContext.L()) == null || (expandWidgetNode = L.getExpandWidgetNode()) == null) ? null : expandWidgetNode.queryWidgetNodeByUserId(str2);
                            if (queryWidgetNodeByUserId instanceof IGrowingTextInput) {
                                iGrowingTextInput = queryWidgetNodeByUserId;
                            }
                            IGrowingTextInput iGrowingTextInput2 = iGrowingTextInput;
                            if (iGrowingTextInput2 != null) {
                                iGrowingTextInput2.showSoftInput();
                                return;
                            }
                            return;
                        }
                        return;
                    case -708785223:
                        if (str.equals("returnKeyClick")) {
                            Object L6 = objArr != null ? ic1.L(objArr, 2) : null;
                            if (!(L6 instanceof String)) {
                                L6 = null;
                            }
                            if (!ckf.b((String) L6, "1")) {
                                DXWidgetNode queryWidgetNodeByUserId2 = (dXRuntimeContext == null || (L2 = dXRuntimeContext.L()) == null || (expandWidgetNode2 = L2.getExpandWidgetNode()) == null) ? null : expandWidgetNode2.queryWidgetNodeByUserId(str2);
                                if (!(queryWidgetNodeByUserId2 instanceof IGrowingTextInput)) {
                                    queryWidgetNodeByUserId2 = null;
                                }
                                IGrowingTextInput iGrowingTextInput3 = (IGrowingTextInput) queryWidgetNodeByUserId2;
                                if (iGrowingTextInput3 != null && ckf.b(str, "returnKeyClick")) {
                                    iGrowingTextInput3.setText(null);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    case -108511653:
                        if (!str.equals("openCustom")) {
                            return;
                        }
                        break;
                    case 1065964361:
                        if (!str.equals(MspEventTypes.ACTION_STRING_HIDE_KEYBOARD)) {
                            return;
                        }
                        break;
                    default:
                        return;
                }
                DXWidgetNode queryWidgetNodeByUserId3 = (dXRuntimeContext == null || (L3 = dXRuntimeContext.L()) == null || (expandWidgetNode3 = L3.getExpandWidgetNode()) == null) ? null : expandWidgetNode3.queryWidgetNodeByUserId(str2);
                if (queryWidgetNodeByUserId3 instanceof IGrowingTextInput) {
                    iGrowingTextInput = queryWidgetNodeByUserId3;
                }
                IGrowingTextInput iGrowingTextInput4 = (IGrowingTextInput) iGrowingTextInput;
                if (iGrowingTextInput4 != null) {
                    iGrowingTextInput4.hideSoftInput();
                }
            }
        }
    }
}

package tb;

import android.content.Context;
import android.graphics.Rect;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.bizmessage.ShowLightOffMessage;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class y3l implements zre {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "openLightOff";
    public static final String KEY_FRAME_COMPONENT_ID = "frameComponentId";
    public static final String KEY_OPEN_SOURCE = "openSource";
    public static final String KEY_TRIGGER_VIEW_RECT = "triggerViewRect";

    /* renamed from: a  reason: collision with root package name */
    public final Context f31830a;

    static {
        t2o.a(912261902);
        t2o.a(912261826);
    }

    public y3l(Context context) {
        this.f31830a = context;
    }

    @Override // tb.zre
    public boolean a(ir irVar, RuntimeAbilityParam... runtimeAbilityParamArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5228eae5", new Object[]{this, irVar, runtimeAbilityParamArr})).booleanValue();
        }
        q84.f(this.f31830a, new ShowLightOffMessage(c(runtimeAbilityParamArr), b(runtimeAbilityParamArr), d(runtimeAbilityParamArr)));
        return true;
    }

    public final String b(RuntimeAbilityParam... runtimeAbilityParamArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f896a2d2", new Object[]{this, runtimeAbilityParamArr});
        }
        if (runtimeAbilityParamArr == null) {
            return null;
        }
        for (RuntimeAbilityParam runtimeAbilityParam : runtimeAbilityParamArr) {
            if (KEY_FRAME_COMPONENT_ID.equals(runtimeAbilityParam.getKey())) {
                return (String) runtimeAbilityParam.getValue();
            }
        }
        return null;
    }

    public final ShowLightOffMessage.Source c(RuntimeAbilityParam... runtimeAbilityParamArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShowLightOffMessage.Source) ipChange.ipc$dispatch("4bbb9c3b", new Object[]{this, runtimeAbilityParamArr});
        }
        if (runtimeAbilityParamArr == null) {
            return null;
        }
        for (RuntimeAbilityParam runtimeAbilityParam : runtimeAbilityParamArr) {
            if (KEY_OPEN_SOURCE.equals(runtimeAbilityParam.getKey())) {
                return (ShowLightOffMessage.Source) runtimeAbilityParam.getValue();
            }
        }
        return null;
    }

    public final Rect d(RuntimeAbilityParam... runtimeAbilityParamArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("7b2be4af", new Object[]{this, runtimeAbilityParamArr});
        }
        if (runtimeAbilityParamArr == null) {
            return null;
        }
        for (RuntimeAbilityParam runtimeAbilityParam : runtimeAbilityParamArr) {
            if (KEY_TRIGGER_VIEW_RECT.equals(runtimeAbilityParam.getKey())) {
                return (Rect) runtimeAbilityParam.getValue();
            }
        }
        return null;
    }
}

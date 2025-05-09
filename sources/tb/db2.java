package tb;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.android.bindingx.core.a;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.ui.component.WXComponent;
import com.taobao.weex.ui.view.gesture.WXGesture;
import com.taobao.weex.ui.view.gesture.WXGestureObservable;
import com.taobao.weex.utils.WXUtils;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class db2 extends nb2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public boolean u = false;
    public WXGesture v = null;

    public db2(Context context, a aVar, Object... objArr) {
        super(context, aVar, objArr);
    }

    public static /* synthetic */ Object ipc$super(db2 db2Var, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -899050889) {
            super.c((Map) objArr[0]);
            return null;
        } else if (hashCode == 433988314) {
            return new Boolean(super.j((String) objArr[0], (String) objArr[1]));
        } else {
            if (hashCode == 662235432) {
                return new Boolean(super.b((String) objArr[0], (String) objArr[1]));
            }
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alibaba/android/bindingx/plugin/weex/BindingXPanHandlerCompat");
        }
    }

    @Override // tb.nb2, tb.i3c
    public boolean b(String str, String str2) {
        WXGesture wXGesture;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2778e928", new Object[]{this, str, str2})).booleanValue();
        }
        boolean b = super.b(str, str2);
        if (!this.u || (wXGesture = this.v) == null) {
            return b;
        }
        try {
            return b | wXGesture.removeTouchListener(this);
        } catch (Throwable th) {
            gfh.b("[BindingXPanHandlerCompat]  disabled failed." + th.getMessage());
            return b;
        }
    }

    @Override // com.alibaba.android.bindingx.core.internal.AbstractEventHandler, tb.i3c
    public void c(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca699277", new Object[]{this, map});
            return;
        }
        super.c(map);
        if (map != null) {
            this.u = WXUtils.getBoolean(map.get("experimentalGestureFeatures"), Boolean.FALSE).booleanValue();
        }
    }

    @Override // tb.nb2, tb.i3c
    public boolean j(String str, String str2) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("19de22da", new Object[]{this, str, str2})).booleanValue();
        }
        if (!this.u) {
            return super.j(str, str2);
        }
        if (TextUtils.isEmpty(this.f)) {
            str3 = this.e;
        } else {
            str3 = this.f;
        }
        WXComponent a2 = zuw.a(str3, str);
        if (a2 == null) {
            return super.j(str, str2);
        }
        View hostView = a2.getHostView();
        if (!(hostView instanceof ViewGroup) || !(hostView instanceof WXGestureObservable)) {
            return super.j(str, str2);
        }
        try {
            WXGesture gestureListener = ((WXGestureObservable) hostView).getGestureListener();
            this.v = gestureListener;
            if (gestureListener == null) {
                return super.j(str, str2);
            }
            gestureListener.addOnTouchListener(this);
            gfh.a("[BindingXPanHandlerCompat] onCreate success. {source:" + str + ",type:" + str2 + "}");
            return true;
        } catch (Throwable th) {
            gfh.b("experimental gesture features open failed." + th.getMessage());
            return super.j(str, str2);
        }
    }
}

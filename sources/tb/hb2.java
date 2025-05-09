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

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class hb2 extends gb2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public WXGesture p = null;

    public hb2(Context context, a aVar, Object... objArr) {
        super(context, aVar, objArr);
    }

    public static /* synthetic */ Object ipc$super(hb2 hb2Var, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 433988314) {
            return new Boolean(super.j((String) objArr[0], (String) objArr[1]));
        }
        if (hashCode == 662235432) {
            return new Boolean(super.b((String) objArr[0], (String) objArr[1]));
        }
        int hashCode2 = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alibaba/android/bindingx/plugin/weex/BindingXRotationHandlerCompat");
    }

    @Override // tb.gb2, tb.i3c
    public boolean b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2778e928", new Object[]{this, str, str2})).booleanValue();
        }
        boolean b = super.b(str, str2);
        WXGesture wXGesture = this.p;
        if (wXGesture == null) {
            return b;
        }
        try {
            return b | wXGesture.removeTouchListener(this);
        } catch (Throwable th) {
            gfh.b("[BindingXRotationHandlerCompat]  disabled failed." + th.getMessage());
            return b;
        }
    }

    @Override // tb.gb2, tb.i3c
    public boolean j(String str, String str2) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("19de22da", new Object[]{this, str, str2})).booleanValue();
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
            this.p = gestureListener;
            if (gestureListener == null) {
                return super.j(str, str2);
            }
            gestureListener.addOnTouchListener(this);
            gfh.a("[BindingXRotationHandlerCompat] onCreate success. {source:" + str + ",type:" + str2 + "}");
            return true;
        } catch (Throwable th) {
            gfh.b("experimental gesture features open failed." + th.getMessage());
            return super.j(str, str2);
        }
    }
}

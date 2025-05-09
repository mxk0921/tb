package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.DWContext;
import com.taobao.avplayer.DWVideoScreenType;
import com.taobao.avplayer.core.component.DWComponent;
import com.taobao.avplayer.core.protocol.DWInteractiveObject;
import com.taobao.media.MediaSystemUtils;
import com.taobao.taobaoavsdk.AVSDKLog;
import java.lang.reflect.Constructor;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class w65 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(452985060);
    }

    public static DWComponent a(Class<? extends DWComponent> cls, DWContext dWContext, DWInteractiveObject dWInteractiveObject, DWVideoScreenType dWVideoScreenType) {
        Constructor<?>[] constructors;
        int length;
        if (cls == null || dWContext == null || dWInteractiveObject == null) {
            AVSDKLog.e(tfb.MODULE_SDK_PAGE, "[DWComponentFactory] class is null");
            return null;
        }
        try {
            if (!DWComponent.class.isAssignableFrom(cls) || (length = (constructors = cls.getConstructors()).length) <= 0) {
                return null;
            }
            for (int i = 0; i < length; i++) {
                Class<?>[] parameterTypes = constructors[i].getParameterTypes();
                if (parameterTypes != null && parameterTypes.length == 3 && parameterTypes[0].isAssignableFrom(DWContext.class) && parameterTypes[1].isAssignableFrom(DWInteractiveObject.class) && parameterTypes[2].isAssignableFrom(DWVideoScreenType.class)) {
                    return (DWComponent) cls.getConstructor(parameterTypes[0], parameterTypes[1], parameterTypes[2]).newInstance(dWContext, dWInteractiveObject, dWVideoScreenType);
                }
            }
            return null;
        } catch (Exception e) {
            if (MediaSystemUtils.isApkDebuggable()) {
                AVSDKLog.e(tfb.MODULE_SDK_PAGE, ew0.k(e));
            }
        }
    }
}

package tb;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mmad.linkage.pop.small.SmallPopView;
import com.taobao.tbpoplayer.view.PopCustomNativeBaseView;
import java.lang.reflect.Constructor;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class icm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, Class<? extends PopCustomNativeBaseView>> f21240a = new ConcurrentHashMap();

    static {
        t2o.a(790626513);
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e10e3c7", new Object[0]);
            return;
        }
        c("nativeSearch", "com.taobao.android.voiceassistant.pop.VoiceAssistantNativePop");
        c(SmallPopView.VIEW_TYPE, "com.taobao.mmad.linkage.pop.small.SmallPopView");
    }

    public static void c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcb5fb5d", new Object[]{str, str2});
            return;
        }
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                ((ConcurrentHashMap) f21240a).put(str, Class.forName(str2));
                fig.c().e(str);
            }
        } catch (Throwable th) {
            wdm.h("PopCustomViewManager.registerViewType.fail!", th);
        }
    }

    public static PopCustomNativeBaseView a(Context context, String str) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) f21240a;
        if (concurrentHashMap.isEmpty()) {
            b();
        }
        if (!SmallPopView.VIEW_TYPE.equals(str) || a9l.w().l0()) {
            Class cls = (Class) concurrentHashMap.get(str);
            if (cls == null || TextUtils.isEmpty(str)) {
                wdm.d("%s.create:use baseItem.", new Object[0]);
                return null;
            }
            try {
                Constructor declaredConstructor = cls.getDeclaredConstructor(Context.class);
                declaredConstructor.setAccessible(true);
                return (PopCustomNativeBaseView) declaredConstructor.newInstance(context);
            } catch (Throwable th) {
                wdm.h("PopCustomViewManager.createLayer.fail!", th);
                return null;
            }
        } else {
            wdm.d("mamaCommercial.orange.switch.notUseNewType", new Object[0]);
            return null;
        }
    }
}

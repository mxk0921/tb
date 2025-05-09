package android.taobao.windvane.extra.jsi;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public enum JsiMode {
    V8(true, false),
    QJS(false, true),
    V8_QJS(true, true);
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final boolean enableQjs;
    private final boolean enableV8;

    JsiMode(boolean z, boolean z2) {
        this.enableV8 = z;
        this.enableQjs = z2;
    }

    public static /* synthetic */ Object ipc$super(JsiMode jsiMode, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in android/taobao/windvane/extra/jsi/JsiMode");
    }

    public static JsiMode valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JsiMode) ipChange.ipc$dispatch("45a462f9", new Object[]{str});
        }
        return (JsiMode) Enum.valueOf(JsiMode.class, str);
    }

    public boolean isQjsEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c2f8089e", new Object[]{this})).booleanValue();
        }
        return this.enableQjs;
    }

    public boolean isV8Enable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d82052fa", new Object[]{this})).booleanValue();
        }
        return this.enableV8;
    }
}

package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class wk extends os {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_DEFAULT_VALUE = "default";
    public static final String KEY_NAME_SPACE = "namespace";
    public static final String KEY_ORANGE_KEY = "key";

    static {
        t2o.a(81789037);
    }

    public static /* synthetic */ Object ipc$super(wk wkVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/aura/taobao/adapter/extension/condition/AURAOrangeCondition");
    }

    @Override // tb.zab
    public boolean a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("63f7f74c", new Object[]{this, map})).booleanValue();
        }
        String str = map.get("namespace");
        String str2 = map.get("key");
        String str3 = map.get("default");
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return Boolean.parseBoolean(str3);
        }
        try {
            return "true".equalsIgnoreCase(OrangeConfig.getInstance().getConfig(str, str2, String.valueOf(str3)));
        } catch (Exception unused) {
            return Boolean.parseBoolean(str3);
        }
    }
}

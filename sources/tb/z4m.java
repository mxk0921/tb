package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.utils.tools.TimeCalculator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class z4m extends av {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PARSER_TAG = "platform";

    static {
        t2o.a(155189271);
    }

    public static /* synthetic */ Object ipc$super(z4m z4mVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/trade/dinamicX/parser/Platform");
    }

    @Override // tb.av, tb.im7
    public Object a(List list, bn7 bn7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ab0b6f88", new Object[]{this, list, bn7Var});
        }
        if (list == null || list.size() < 1) {
            return Boolean.FALSE;
        }
        String valueOf = String.valueOf(list.get(0));
        if (TextUtils.isEmpty(valueOf)) {
            return Boolean.FALSE;
        }
        if (TimeCalculator.PLATFORM_ANDROID.equalsIgnoreCase(valueOf)) {
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
}

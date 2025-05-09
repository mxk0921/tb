package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class aq5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DEFALUT_COLOR = "";
    public static final int DEFAULT_ALPHA = 255;
    public static final long DX_EVENT_ID = k06.a("rgb2hex");

    public static /* synthetic */ Object ipc$super(aq5 aq5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/dinamicx/event/DXDataParserRgb2hex");
    }

    static {
        t2o.a(912261754);
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr == null || objArr.length == 0 || (obj = objArr[0]) == null) {
            return -1;
        }
        try {
            Matcher matcher = Pattern.compile("\\(([^)]+)\\)").matcher((String) obj);
            if (!matcher.find()) {
                return "";
            }
            String[] split = matcher.group(1).split(",");
            if (split.length < 3) {
                return "";
            }
            int parseInt = Integer.parseInt(split[0].trim());
            int parseInt2 = Integer.parseInt(split[1].trim());
            int parseInt3 = Integer.parseInt(split[2].trim());
            int i = 255;
            if (split.length == 4) {
                i = 255 - ((int) (Float.parseFloat(split[3]) * 255.0f));
            }
            return String.format("#%02X%02X%02X%02X", Integer.valueOf(i), Integer.valueOf(parseInt), Integer.valueOf(parseInt2), Integer.valueOf(parseInt3));
        } catch (Exception e) {
            tgh.c("DXDataParserRgb2hex", "rgb2hex parse error", e);
            return "";
        }
    }
}

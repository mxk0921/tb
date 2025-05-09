package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class yp5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_RESOLVE_WIDTH = -5214069675035118580L;

    static {
        t2o.a(157286619);
    }

    public static /* synthetic */ Object ipc$super(yp5 yp5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/vfw/dataparser/DXDataParserResolveWidth");
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        int parseInt;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr != null && objArr.length >= 2) {
            try {
                String str = (String) objArr[0];
                String str2 = (String) objArr[1];
                if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                    Matcher matcher = Pattern.compile("-(\\d+)-(\\d+)\\.").matcher(str);
                    if (!matcher.find()) {
                        return "match_content";
                    }
                    String group = matcher.group(1);
                    String group2 = matcher.group(2);
                    if (!TextUtils.isEmpty(group) && !TextUtils.isEmpty(group2)) {
                        float parseFloat = Float.parseFloat(group);
                        float parseFloat2 = Float.parseFloat(group2);
                        if (!(parseFloat == 0.0f || parseFloat2 == 0.0f)) {
                            float f = parseFloat / parseFloat2;
                            Matcher matcher2 = Pattern.compile("^(\\d+)(\\D+)?$").matcher(str2);
                            if (!matcher2.find()) {
                                return "match_content";
                            }
                            String group3 = matcher2.group(1);
                            String group4 = matcher2.group(2);
                            if (group4 == null) {
                                group4 = "";
                            }
                            if (TextUtils.isEmpty(group3) || (parseInt = Integer.parseInt(group3)) <= 0) {
                                return "match_content";
                            }
                            return ((int) (parseInt * f)) + group4;
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
        return "match_content";
    }
}

package tb;

import android.app.Activity;
import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.g;
import java.util.Locale;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class zh5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_ADAPTIVESCREENCONFIG = 6435735300035904024L;

    static {
        t2o.a(444596711);
    }

    public static /* synthetic */ Object ipc$super(zh5 zh5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/expression/ExepressionEvaluation/DXDataParserAdaptiveScreenConfig");
    }

    @Override // tb.nb5, tb.wvb, tb.xwb
    public String getDxFunctionName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bc5916ec", new Object[]{this});
        }
        return "adaptiveScreenConfig";
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        String str;
        char c = 65535;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (!(objArr == null || objArr.length == 0)) {
            Context h = dXRuntimeContext.h();
            mub p = g.p();
            if (!(h == null || p == null)) {
                if (h instanceof Activity) {
                    str = p.e((Activity) h).toLowerCase(Locale.ROOT);
                } else {
                    str = p.d(h).toLowerCase(Locale.ROOT);
                }
                if (objArr.length == 3) {
                    str.hashCode();
                    switch (str.hashCode()) {
                        case -1078030475:
                            if (str.equals("medium")) {
                                c = 0;
                                break;
                            }
                            break;
                        case 107876:
                            if (str.equals("max")) {
                                c = 1;
                                break;
                            }
                            break;
                        case 108114:
                            if (str.equals("min")) {
                                c = 2;
                                break;
                            }
                            break;
                        case 102742843:
                            if (str.equals("large")) {
                                c = 3;
                                break;
                            }
                            break;
                        case 109548807:
                            if (str.equals("small")) {
                                c = 4;
                                break;
                            }
                            break;
                    }
                    switch (c) {
                        case 0:
                            return objArr[1];
                        case 1:
                        case 3:
                            return objArr[2];
                        case 2:
                        case 4:
                            return objArr[0];
                        default:
                            return null;
                    }
                } else if (objArr.length == 5) {
                    str.hashCode();
                    switch (str.hashCode()) {
                        case -1078030475:
                            if (str.equals("medium")) {
                                c = 0;
                                break;
                            }
                            break;
                        case 107876:
                            if (str.equals("max")) {
                                c = 1;
                                break;
                            }
                            break;
                        case 108114:
                            if (str.equals("min")) {
                                c = 2;
                                break;
                            }
                            break;
                        case 102742843:
                            if (str.equals("large")) {
                                c = 3;
                                break;
                            }
                            break;
                        case 109548807:
                            if (str.equals("small")) {
                                c = 4;
                                break;
                            }
                            break;
                    }
                    switch (c) {
                        case 0:
                            return objArr[2];
                        case 1:
                            return objArr[4];
                        case 2:
                            return objArr[0];
                        case 3:
                            return objArr[3];
                        case 4:
                            return objArr[1];
                        default:
                            return null;
                    }
                }
            }
        }
        return null;
    }
}

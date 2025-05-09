package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import kotlin.TypeCastException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class yh5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final long DX_PARSER_ADAMCONFIG = -4438251361709622285L;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class a {
        static {
            t2o.a(350224415);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(350224414);
    }

    public static /* synthetic */ Object ipc$super(yh5 yh5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/adam/parser/DXDataParserAdamConfig");
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr == null || objArr.length == 0) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        ydf m = hfn.m(ic1.H(objArr), 2);
        int c = m.c();
        int d = m.d();
        int e = m.e();
        if (e < 0 ? c >= d : c <= d) {
            while (true) {
                Object obj = "";
                if (ckf.b(objArr[c], yg.CACHE_KEY_TEMPLATE_INFO)) {
                    if (jSONObject.get(yg.CACHE_KEY_TEMPLATE_INFO) == null) {
                        jSONObject.put((JSONObject) yg.CACHE_KEY_TEMPLATE_INFO, (String) new JSONArray());
                    }
                    Object obj2 = jSONObject.get(yg.CACHE_KEY_TEMPLATE_INFO);
                    if (obj2 != null) {
                        JSONArray jSONArray = (JSONArray) obj2;
                        int i = c + 1;
                        if (objArr.length > i) {
                            obj = objArr[i];
                        }
                        jSONArray.add(obj);
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type com.alibaba.fastjson.JSONArray");
                    }
                } else {
                    String obj3 = objArr[c].toString();
                    int i2 = c + 1;
                    if (objArr.length > i2) {
                        obj = objArr[i2];
                    }
                    jSONObject.put((JSONObject) obj3, (String) obj);
                }
                if (c == d) {
                    break;
                }
                c += e;
            }
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put((JSONObject) "parserAdamConfigPrefix", (String) jSONObject);
        return jSONObject2;
    }
}

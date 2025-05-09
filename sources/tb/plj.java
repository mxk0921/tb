package tb;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.poplayer.exception.PoplayerException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tbpoplayer.nativerender.dsl.ConditionModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class plj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a implements msc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.jdb
        public void O(ErrorResult errorResult) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("14182866", new Object[]{this, errorResult});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class b extends TypeReference<ArrayList<JSONObject>> {
    }

    static {
        t2o.a(790626484);
    }

    public static String b(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7abf558", new Object[]{str, map});
        }
        try {
            Uri.Builder buildUpon = Uri.parse(str).buildUpon();
            for (String str2 : map.keySet()) {
                buildUpon.appendQueryParameter(str2, map.get(str2));
            }
            buildUpon.build();
            return buildUpon.toString();
        } catch (Throwable th) {
            wdm.h("appendParamsUri.error.", th);
            return str;
        }
    }

    public static /* synthetic */ void d(String str, oe8 oe8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("caf2f42b", new Object[]{str, oe8Var});
            return;
        }
        try {
            hji a2 = hji.a();
            if (a2 != null) {
                a2.b(str, new a());
            } else {
                Toast.makeText(oe8Var.j().e(), str, 0).show();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static Bitmap e(me8 me8Var, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("2ce587cf", new Object[]{me8Var, view});
        }
        int o = me8Var.o();
        int h = me8Var.h();
        view.measure(o, h);
        view.layout(0, 0, o, h);
        Bitmap createBitmap = Bitmap.createBitmap(view.getMeasuredWidth(), view.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
        view.draw(new Canvas(createBitmap));
        return createBitmap;
    }

    public static void g(final oe8 oe8Var, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99877fa5", new Object[]{oe8Var, str});
        } else if (c(str, false) && oe8Var != null && oe8Var.j().A() && !oe8Var.j().D()) {
            oe8Var.x(new Runnable() { // from class: tb.olj
                @Override // java.lang.Runnable
                public final void run() {
                    plj.d(str, oe8Var);
                }
            });
        }
    }

    public static int h(oe8 oe8Var, String str) throws PoplayerException {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("91385302", new Object[]{oe8Var, str})).intValue();
        }
        try {
            if ("100%".equals(str)) {
                return -1;
            }
            if ("auto".equals(str)) {
                return -2;
            }
            Float d = a1n.d(oe8Var, str);
            if (d != null) {
                i = (int) oe8Var.g().c(oe8Var.j().e(), d.floatValue());
            }
            return i;
        } catch (Throwable th) {
            wdm.h("transWidthAndHeight.error.", th);
            oe8Var.s("transWidthAndHeightError.size=" + str, String.valueOf(th.getMessage()));
            return 0;
        }
    }

    public static boolean c(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a557ec02", new Object[]{str, new Boolean(z)})).booleanValue();
        }
        return TextUtils.isEmpty(str) ? z : !str.contains("null") && !str.contains("undefined");
    }

    public static int f(oe8 oe8Var, List<JSONObject> list, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d08dde2e", new Object[]{oe8Var, list, new Boolean(z)})).intValue();
        }
        if (list == null || list.isEmpty()) {
            return 0;
        }
        int i = 0;
        for (JSONObject jSONObject : list) {
            String string = jSONObject.getString("type");
            ConditionModel conditionModel = (ConditionModel) jSONObject.getObject("vCondition", ConditionModel.class);
            if (conditionModel != null) {
                boolean a2 = af4.a(conditionModel, oe8Var, false);
                jSONObject.put("vConditionResult", (Object) Boolean.valueOf(a2));
                if (!a2) {
                }
            }
            if (oe8Var.j().q() == 0 && "Video".equals(string)) {
                i++;
            }
            if ((z && vbm.TYPE_CLOSE_BTN.equals(string)) || vbm.TYPE_IMAGE.equals(string)) {
                i++;
            } else if (vbm.TYPE_BLOCK.equals(string)) {
                List list2 = (List) JSON.parseObject(jSONObject.getString("children"), new b().getType(), new Feature[0]);
                int f = f(oe8Var, list2, z);
                jSONObject.put("children", JSON.toJSON(list2));
                i += f;
            }
        }
        return i;
    }
}

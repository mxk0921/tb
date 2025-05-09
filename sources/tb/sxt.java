package tb;

import android.app.Application;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.core.subservice.base.item.dxservice.impl.dinamic3.view.RRichTextView;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.weex.common.Constants;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class sxt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ JSONObject f28345a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ BaseSectionModel d;
        public final /* synthetic */ String e;

        public a(JSONObject jSONObject, String str, String str2, BaseSectionModel baseSectionModel, String str3) {
            this.f28345a = jSONObject;
            this.b = str;
            this.c = str2;
            this.d = baseSectionModel;
            this.e = str3;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                this.f28345a.put("title", (Object) URLEncoder.encode(this.b, "UTF-8"));
                this.f28345a.put("displayTitle", (Object) URLEncoder.encode(this.c, "UTF-8"));
                this.f28345a.putAll(sxt.a(this.d));
            } catch (UnsupportedEncodingException e) {
                fve.c("TitleInfoUserTraceReporter", "title 或 displayTitle 编码出错", e);
            }
            uve.a(this.e, 2201, "InfoFlowItemTitleExpose", null, null, vve.x(null, this.f28345a));
            fve.e("TitleInfoUserTraceReporter", "report:" + this.f28345a.toString());
        }
    }

    static {
        t2o.a(486539530);
    }

    public static /* synthetic */ Map a(BaseSectionModel baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("6a33a934", new Object[]{baseSectionModel});
        }
        return c(baseSectionModel);
    }

    public static JSONObject b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("117f512a", new Object[]{jSONObject});
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("utLogMapEdge");
        if (jSONObject2 != null) {
            return jSONObject2;
        }
        String string = jSONObject.getString("utLogMap");
        try {
            return !TextUtils.isEmpty(string) ? JSON.parseObject(URLDecoder.decode(string, "utf-8")) : jSONObject2;
        } catch (UnsupportedEncodingException e) {
            fve.c("TitleInfoUserTraceReporter", "getAlgorithmParams error", e);
            return jSONObject2;
        }
    }

    public static Map<String, String> c(BaseSectionModel<?> baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("c1505fc7", new Object[]{baseSectionModel});
        }
        JSONObject args = baseSectionModel.getArgs();
        HashMap hashMap = new HashMap();
        if (args != null) {
            hashMap.put(yj4.PARAM_PVID, args.getString(yj4.PARAM_PVID));
            JSONObject b = b(args);
            if (b != null) {
                hashMap.put("x_object_id", b.getString("x_object_id"));
                hashMap.put("x_item_ids", b.getString("x_item_ids"));
                hashMap.put("x_object_type", b.getString("x_object_type"));
            }
        }
        return hashMap;
    }

    public static void d(String str, f83 f83Var, RRichTextView rRichTextView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("469b9ad1", new Object[]{str, f83Var, rRichTextView});
            return;
        }
        BaseSectionModel<?> a2 = f83Var.a();
        if (a2 != null && !a2.containsKey("isTitleTracked")) {
            a2.put("isTitleTracked", (Object) Boolean.TRUE);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fontSize", (Object) (rRichTextView.getTextSize() + "px"));
            jSONObject.put("iconWidth", (Object) (rRichTextView.getIconWidth() + "px"));
            jSONObject.put("titleWidth", (Object) (rRichTextView.getFirstLineTextWidth() + "px"));
            jSONObject.put("width", (Object) (rRichTextView.getMeasuredWidth() + "px"));
            jSONObject.put("actualLines", (Object) Integer.valueOf(rRichTextView.getTitleDisplayLineCount()));
            jSONObject.put(Constants.Name.LINES, (Object) Integer.valueOf(rRichTextView.getTitleLineCount()));
            Application a3 = eue.a();
            if (a3 != null) {
                jSONObject.put(x3w.KEY_NEW_DETAIL_VISIBLE_BLOCK_WIDTH, (Object) Integer.valueOf(pb6.s(a3)));
                jSONObject.put("screenHeight", (Object) Integer.valueOf(pb6.r(a3)));
                jSONObject.put("density", (Object) Float.valueOf(a3.getResources().getDisplayMetrics().density));
            }
            get.a().i(new a(jSONObject, rRichTextView.getOriginalText(), rRichTextView.getDisplayText(), a2, str));
        }
    }
}

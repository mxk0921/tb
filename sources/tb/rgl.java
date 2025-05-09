package tb;

import android.content.Context;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class rgl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(491782452);
    }

    public int a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("67172af0", new Object[]{this, view})).intValue();
        }
        return (view.getHeight() - view.getPaddingBottom()) - view.getPaddingTop();
    }

    public int b(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d89f561f", new Object[]{this, view})).intValue();
        }
        return (view.getWidth() - view.getPaddingLeft()) - view.getPaddingRight();
    }

    public BaseSectionModel<?> c(BaseSectionModel<?> baseSectionModel, Context context, int i, int i2, int i3, int i4, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseSectionModel) ipChange.ipc$dispatch("9bc11b1e", new Object[]{this, baseSectionModel, context, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Boolean(z)});
        }
        JSONObject ext = baseSectionModel.getExt();
        if (ext == null) {
            return baseSectionModel;
        }
        if (z && ext.getBooleanValue("hasProcessed")) {
            return baseSectionModel;
        }
        float f = i2;
        ext.put("hostHeight", (Object) Integer.valueOf(pb6.z(context, f)));
        float f2 = i;
        ext.put("hostWidth", (Object) Integer.valueOf(pb6.z(context, f2)));
        ext.put("nativeHeight", (Object) Integer.valueOf(i2));
        ext.put("nativeWidth", (Object) Integer.valueOf(i));
        float f3 = i3;
        ext.put("offsetX", (Object) Integer.valueOf(pb6.z(context, f3)));
        float f4 = i4;
        ext.put("offsetY", (Object) Integer.valueOf(pb6.z(context, f4)));
        JSONObject jSONObject = ext.getJSONObject("clientCache");
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        jSONObject.put("hostHeight", (Object) Integer.valueOf(pb6.z(context, f)));
        jSONObject.put("hostWidth", (Object) Integer.valueOf(pb6.z(context, f2)));
        jSONObject.put("nativeHeight", (Object) Integer.valueOf(i2));
        jSONObject.put("nativeWidth", (Object) Integer.valueOf(i));
        jSONObject.put("offsetX", (Object) Integer.valueOf(pb6.z(context, f3)));
        jSONObject.put("offsetY", (Object) Integer.valueOf(pb6.z(context, f4)));
        ext.put("clientCache", (Object) jSONObject);
        ext.put("hasProcessed", (Object) Boolean.TRUE);
        return baseSectionModel;
    }
}

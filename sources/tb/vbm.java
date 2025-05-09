package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tbpoplayer.nativerender.dsl.BlockModel;
import com.taobao.tbpoplayer.nativerender.dsl.CounterModel;
import com.taobao.tbpoplayer.nativerender.dsl.HotSpotModel;
import com.taobao.tbpoplayer.nativerender.dsl.ImageModel;
import com.taobao.tbpoplayer.nativerender.dsl.TextModel;
import com.taobao.tbpoplayer.nativerender.dsl.VideoModel;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class vbm {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TYPE_BLOCK = "Block";
    public static final String TYPE_CLOSE_BTN = "CloseBtn";
    public static final String TYPE_COUNTER = "Counter";
    public static final String TYPE_HOTSPOT = "HotSpot";
    public static final String TYPE_IMAGE = "Image";
    public static final String TYPE_TEXT = "Text";
    public static final String TYPE_VIDEO = "Video";

    static {
        t2o.a(790626469);
    }

    public static boolean b(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9d809174", new Object[]{str, new Integer(i)})).booleanValue();
        }
        if (i == 1) {
            return !"Video".equals(str);
        }
        return true;
    }

    public static ubm a(JSONObject jSONObject, oe8 oe8Var, boolean z, boolean z2) {
        String string;
        int q;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ubm) ipChange.ipc$dispatch("8f37dcd7", new Object[]{jSONObject, oe8Var, new Boolean(z), new Boolean(z2)});
        }
        try {
            string = jSONObject.getString("type");
            q = oe8Var.j().q();
        } catch (Throwable th) {
            wdm.h("PopComponentFactory.createPopComponent.error", th);
            oe8Var.s("CreatePopComponentError", "");
        }
        if (!b(string, q)) {
            wdm.d("PopComponentFactory.createPopComponent.isComponentTypeMatchField=false.type=" + string + ".engineField=" + q, new Object[0]);
            return null;
        } else if (TYPE_IMAGE.equals(string)) {
            return new idm(oe8Var, (ImageModel) jSONObject.toJavaObject(ImageModel.class), z2);
        } else {
            if (TYPE_TEXT.equals(string)) {
                return new rhm(oe8Var, (TextModel) jSONObject.toJavaObject(TextModel.class), z2);
            }
            if (TYPE_COUNTER.equals(string)) {
                return new hcm(oe8Var, (CounterModel) jSONObject.toJavaObject(CounterModel.class), z2);
            }
            if (TYPE_BLOCK.equals(string)) {
                return new hbm(oe8Var, (BlockModel) jSONObject.toJavaObject(BlockModel.class), z2);
            }
            if ("Video".equals(string)) {
                return new him(oe8Var, (VideoModel) jSONObject.toJavaObject(VideoModel.class), z2);
            }
            if (!z && TYPE_HOTSPOT.equals(string)) {
                return new bdm(oe8Var, (HotSpotModel) jSONObject.toJavaObject(HotSpotModel.class));
            }
            return null;
        }
    }
}

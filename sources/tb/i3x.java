package tb;

import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class i3x {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(157286805);
    }

    public static void a(FrameLayout frameLayout, IDMComponent iDMComponent) {
        JSONObject fields;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b57a20b5", new Object[]{frameLayout, iDMComponent});
        } else if (frameLayout != null && iDMComponent != null && (fields = iDMComponent.getFields()) != null && fields.containsKey("config")) {
            String string = fields.getJSONObject("config").getString("downgradeStrategy");
            if (TextUtils.isEmpty(string)) {
                string = "invisible";
            }
            string.hashCode();
            if (string.equals("invisible")) {
                frameLayout.setVisibility(4);
            } else if (string.equals("gone")) {
                ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
                if (layoutParams == null) {
                    frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
                    return;
                }
                layoutParams.height = 0;
                frameLayout.requestLayout();
            }
        }
    }

    public static String b(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a1f22a0c", new Object[]{iDMComponent});
        }
        if (iDMComponent == null || !"weex2".equals(iDMComponent.getContainerType())) {
            return null;
        }
        JSONObject fields = iDMComponent.getFields();
        if (fields != null && !TextUtils.isEmpty(fields.getString("url"))) {
            return fields.getString("url");
        }
        JSONObject containerInfo = iDMComponent.getContainerInfo();
        if (containerInfo == null) {
            return null;
        }
        return containerInfo.getString("url");
    }

    public static boolean c(FrameLayout frameLayout, IDMComponent iDMComponent, String str) {
        JSONObject parseObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6e6c8408", new Object[]{frameLayout, iDMComponent, str})).booleanValue();
        }
        if (frameLayout == null || iDMComponent == null || (parseObject = JSON.parseObject(str)) == null || !parseObject.containsKey("height")) {
            return false;
        }
        int intValue = parseObject.getInteger("height").intValue();
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        if (layoutParams == null) {
            frameLayout.setLayoutParams(new RecyclerView.LayoutParams(-1, intValue));
        } else {
            layoutParams.height = intValue;
            frameLayout.requestLayout();
        }
        return true;
    }
}

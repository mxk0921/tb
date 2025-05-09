package tb;

import android.text.TextUtils;
import com.alibaba.android.aura.datamodel.linkage.UMFLinkageTrigger;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.service.event.AURAEventIO;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class msg {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_ACTION = "action";
    public static final String KEY_ADJUST_OPTIMIZE = "needAdjustOptimize";
    public static final String KEY_TARGET = "target";

    static {
        t2o.a(81789121);
    }

    public static UMFLinkageTrigger a(AURAEventIO aURAEventIO) {
        UMFLinkageTrigger uMFLinkageTrigger;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UMFLinkageTrigger) ipChange.ipc$dispatch("10781dd5", new Object[]{aURAEventIO});
        }
        qi eventModel = aURAEventIO.getEventModel();
        String d = eventModel.d();
        String b = b(aURAEventIO);
        JSONObject c = eventModel.c();
        if (c == null) {
            uMFLinkageTrigger = new UMFLinkageTrigger(b, d, null);
        } else {
            String string = c.getString("action");
            String string2 = c.getString("target");
            if (!TextUtils.isEmpty(string2)) {
                b = string2;
            }
            String string3 = c.getString(KEY_ADJUST_OPTIMIZE);
            UMFLinkageTrigger uMFLinkageTrigger2 = new UMFLinkageTrigger(b, d, string);
            uMFLinkageTrigger2.setNeedAdjustOptimize(string3);
            uMFLinkageTrigger = uMFLinkageTrigger2;
        }
        uMFLinkageTrigger.setRenderComponent(c(aURAEventIO));
        return uMFLinkageTrigger;
    }

    public static String b(AURAEventIO aURAEventIO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("415373f5", new Object[]{aURAEventIO});
        }
        AURARenderComponent c = c(aURAEventIO);
        if (c == null || TextUtils.isEmpty(c.key)) {
            return null;
        }
        return c.key;
    }

    public static AURARenderComponent c(AURAEventIO aURAEventIO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURARenderComponent) ipChange.ipc$dispatch("8f794caf", new Object[]{aURAEventIO});
        }
        qi eventModel = aURAEventIO.getEventModel();
        if (eventModel == null) {
            return null;
        }
        return eventModel.j();
    }
}

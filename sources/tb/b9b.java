package tb;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import com.taobao.tao.Globals;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerData;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class b9b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(729809148);
    }

    public static int a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("349dbfae", new Object[]{context})).intValue();
        }
        if (context == null) {
            context = Globals.getApplication();
        }
        if (!h() && !e()) {
            return context.getResources().getDisplayMetrics().widthPixels;
        }
        if (context instanceof Activity) {
            return rhx.a((Activity) context).width();
        }
        return pb6.s(Globals.getApplication());
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("11522a16", new Object[0])).booleanValue();
        }
        return d(z4a.NEW_FACE_PARENT.f32522a);
    }

    public static boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9bb360", new Object[]{str})).booleanValue();
        }
        return d(str);
    }

    public static boolean d(String str) {
        AwesomeGetContainerData u;
        IContainerInnerDataModel<SectionModel> base;
        JSONObject ext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a37af7d", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (!h() && !e()) {
            return false;
        }
        if (e() && g(Globals.getApplication())) {
            return false;
        }
        try {
            imn d = zza.d(str);
            if (d == null || (u = d.u(str)) == null || (base = u.getBase()) == null || (ext = base.getExt()) == null) {
                return false;
            }
            boolean booleanValue = ext.getBooleanValue("isHudScreen");
            bqa.d("HudScreenUtil", str + " isHudScreen: " + booleanValue);
            return booleanValue;
        } catch (Exception e) {
            bqa.b("HudScreenUtil", "isHudScreen error", e);
            return false;
        }
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1d70aa8c", new Object[0])).booleanValue();
        }
        return gj7.a();
    }

    public static boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("174baa08", new Object[0])).booleanValue();
        }
        if (h() || (e() && !g(Globals.getApplication()))) {
            return true;
        }
        return false;
    }

    public static boolean g(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1709c060", new Object[]{context})).booleanValue();
        }
        return gj7.c(context);
    }

    public static boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("28c61cbb", new Object[0])).booleanValue();
        }
        return gj7.e();
    }
}

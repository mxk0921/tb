package tb;

import android.text.TextUtils;
import androidx.core.provider.FontsContractCompat;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.vpm.publish.contentDO.ContentMetaInfo;
import com.taobao.vpm.utils.VPMConstant;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class wp4 extends zzv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static HashMap<String, String> a(ContentMetaInfo contentMetaInfo, f9w f9wVar, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("ca3e1643", new Object[]{contentMetaInfo, f9wVar, hashMap});
        }
        HashMap<String, String> hashMap2 = new HashMap<>();
        if (contentMetaInfo == null) {
            return hashMap2;
        }
        HashMap<String, String> b = b(contentMetaInfo, f9wVar, hashMap);
        b.put("content_monitor_state", String.valueOf(contentMetaInfo.e));
        b.put("content_monitor_result_code", contentMetaInfo.f);
        try {
            JSONObject jSONObject = new JSONObject(b.get("content_monitor_full_message"));
            String str = contentMetaInfo.j;
            if (str != null) {
                jSONObject.put("content_type", str);
            } else {
                jSONObject.put("content_type", "");
            }
            String str2 = contentMetaInfo.i;
            if (str2 != null) {
                jSONObject.put("content_id", str2);
            } else {
                jSONObject.put("content_id", "");
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject("video");
            if (jSONObject2 != null && !TextUtils.isEmpty(contentMetaInfo.g)) {
                jSONObject2.put(FontsContractCompat.Columns.FILE_ID, contentMetaInfo.g);
            }
            if (jSONObject2 != null && !TextUtils.isEmpty(contentMetaInfo.h)) {
                jSONObject2.put("video_info", contentMetaInfo.h);
            }
            jSONObject.put("video", jSONObject2);
            b.put("content_monitor_full_message", jSONObject.toString());
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return b;
    }

    public static HashMap<String, String> b(io4 io4Var, f9w f9wVar, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("4a7ebd0f", new Object[]{io4Var, f9wVar, hashMap});
        }
        HashMap<String, String> hashMap2 = new HashMap<>();
        if (io4Var == null) {
            return hashMap2;
        }
        hashMap2.put("content_monitor_biz_line", io4Var.f21476a);
        hashMap2.put("content_monitor_biz_code", io4Var.b);
        hashMap2.put("content_monitor_trackId", io4Var.d);
        HashMap hashMap3 = new HashMap();
        hashMap3.put("biz_scene", io4Var.c);
        if (f9wVar != null) {
            hashMap3.put("video", f9wVar.getMapParams());
        }
        if (hashMap != null) {
            hashMap3.put("extra", hashMap);
        }
        hashMap2.put("content_monitor_full_message", new JSONObject(hashMap3).toString());
        return hashMap2;
    }

    public static void c(ContentMetaInfo contentMetaInfo, f9w f9wVar, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44ed6039", new Object[]{contentMetaInfo, f9wVar, hashMap});
        } else if (mow.a()) {
            h(VPMConstant.PUBLISH_END_LOG, a(contentMetaInfo, f9wVar, hashMap));
        }
    }

    public static void d(ContentMetaInfo contentMetaInfo, f9w f9wVar, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c37e0df", new Object[]{contentMetaInfo, f9wVar, hashMap});
        } else if (mow.a()) {
            h(VPMConstant.UPLOAD_END_LOG, a(contentMetaInfo, f9wVar, hashMap));
        }
    }

    public static void e(io4 io4Var, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b611253d", new Object[]{io4Var, hashMap});
        } else if (mow.a()) {
            h(VPMConstant.PUBLISH_ENTER_LOG, b(io4Var, null, hashMap));
        }
    }

    public static void f(io4 io4Var, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26bf3ec7", new Object[]{io4Var, hashMap});
        } else if (mow.a()) {
            h(VPMConstant.PUBLISH_START_LOG, b(io4Var, null, hashMap));
        }
    }

    public static void g(io4 io4Var, f9w f9wVar, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61c2b484", new Object[]{io4Var, f9wVar, hashMap});
        } else if (mow.a()) {
            h(VPMConstant.UPLOAD_START_LOG, b(io4Var, f9wVar, hashMap));
        }
    }

    public static void h(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85fe9c66", new Object[]{str, map});
        } else {
            UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder(VPMConstant.Publish_Page_Name, VPMConstant.Publish_Event_Id, str, "", "", map).build());
        }
    }

    public static /* synthetic */ Object ipc$super(wp4 wp4Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/vpm/publish/ContentPublishCommit");
    }
}

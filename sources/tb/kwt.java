package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.framework.db.MspDBHelper;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.NotificationStyle;
import com.taobao.tinct.impl.collect.ChangeRecord;
import com.taobao.tinct.impl.config.a;
import com.taobao.tinct.model.ABChangeInfo;
import com.taobao.tinct.model.BaseChangeInfo;
import com.taobao.tinct.model.ChangeType;
import com.taobao.tinct.model.CustomChangeInfo;
import com.taobao.tinct.model.InstantPatchChangeInfo;
import com.taobao.tinct.model.OrangeChangeInfo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class kwt {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String UPLOAD_TYPE_CHANGE = "change";
    public static final String UPLOAD_TYPE_EFFECT = "effect";
    public static final String UPLOAD_TYPE_LAUNCH = "launch";

    /* renamed from: a  reason: collision with root package name */
    public static tvc f22975a;

    public static void a(ABChangeInfo aBChangeInfo, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6eb75d14", new Object[]{aBChangeInfo, str});
            return;
        }
        try {
            if (a.s(aBChangeInfo.getExperimentId())) {
                b(h(aBChangeInfo, str));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df0d9088", new Object[]{str});
            return;
        }
        tvc tvcVar = f22975a;
        if (tvcVar != null) {
            tvcVar.commit(str);
        }
    }

    public static void c(CustomChangeInfo customChangeInfo, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bda59c46", new Object[]{customChangeInfo, str});
            return;
        }
        try {
            if (a.x(customChangeInfo)) {
                b(i(customChangeInfo, str));
                customChangeInfo.setStatistics();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void d(n48 n48Var, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60a95ca0", new Object[]{n48Var, str});
            return;
        }
        try {
            if (a.z(n48Var)) {
                try {
                    b(k(n48Var, str).toString());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static tvc e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tvc) ipChange.ipc$dispatch("71978593", new Object[0]);
        }
        return f22975a;
    }

    public static void f(h9f h9fVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c9a4920", new Object[]{h9fVar, str});
            return;
        }
        try {
            if (!TextUtils.isEmpty(h9fVar.getVersion()) && a.B(h9fVar)) {
                b(j(h9fVar, str));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void g(ChangeRecord changeRecord) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2d02ad", new Object[]{changeRecord});
            return;
        }
        for (OrangeChangeInfo orangeChangeInfo : changeRecord.orangeChangeMap.values()) {
            m(orangeChangeInfo, "launch");
        }
        InstantPatchChangeInfo instantPatchChangeInfo = changeRecord.instantPatchInfo;
        if (instantPatchChangeInfo != null) {
            n(instantPatchChangeInfo, "launch");
        }
        h9f h9fVar = changeRecord.inlinePatchInfo;
        if (h9fVar != null) {
            n(h9fVar, "launch");
        }
        for (CustomChangeInfo customChangeInfo : changeRecord.customInfo.values()) {
            if (customChangeInfo != null && customChangeInfo.getFullExpireTime() == -1 && a.F(customChangeInfo)) {
                c(customChangeInfo, "launch");
            }
        }
        if (!changeRecord.dynamicChangeInfos.isEmpty()) {
            for (n48 n48Var : changeRecord.dynamicChangeInfos) {
                d(n48Var, "launch");
            }
        }
    }

    public static String h(ABChangeInfo aBChangeInfo, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5a2cc0c4", new Object[]{aBChangeInfo, str});
        }
        if (aBChangeInfo == null) {
            return null;
        }
        try {
            JSONObject k = k(aBChangeInfo, str);
            if (k != null) {
                k.put("experimentId", (Object) aBChangeInfo.getExperimentId());
                k.put("bucketId", (Object) aBChangeInfo.getBucketId());
                k.put("publishId", (Object) aBChangeInfo.getPublishId());
                return k.toJSONString();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String i(BaseChangeInfo baseChangeInfo, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("168bb18c", new Object[]{baseChangeInfo, str});
        }
        if (baseChangeInfo == null) {
            return null;
        }
        try {
            JSONObject k = k(baseChangeInfo, str);
            if (k != null) {
                return k.toJSONString();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String j(InstantPatchChangeInfo instantPatchChangeInfo, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d1fa761e", new Object[]{instantPatchChangeInfo, str});
        }
        if (instantPatchChangeInfo == null) {
            return null;
        }
        try {
            JSONObject k = k(instantPatchChangeInfo, str);
            if (k != null) {
                k.put("verType", (Object) instantPatchChangeInfo.getVerType());
                return k.toJSONString();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static JSONObject k(BaseChangeInfo baseChangeInfo, String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("5c72cbe2", new Object[]{baseChangeInfo, str});
        }
        if (baseChangeInfo == null) {
            return null;
        }
        try {
            if (baseChangeInfo.getChangeType() == ChangeType.CUSTOM) {
                str2 = ((CustomChangeInfo) baseChangeInfo).getCustomType();
            } else {
                str2 = baseChangeInfo.getChangeType().toString();
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", (Object) str);
            jSONObject.put("changeType", (Object) str2);
            if (!TextUtils.isEmpty(baseChangeInfo.getBizName())) {
                jSONObject.put("bizName", (Object) baseChangeInfo.getBizName());
            }
            jSONObject.put(d71.PARAM_TINCT_TAG, (Object) baseChangeInfo.getTinctTag());
            jSONObject.put(v4s.PARAM_IS_INNER, (Object) Boolean.valueOf(a.E()));
            return jSONObject;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String l(OrangeChangeInfo orangeChangeInfo, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("38d80fec", new Object[]{orangeChangeInfo, str});
        }
        if (orangeChangeInfo == null) {
            return null;
        }
        try {
            JSONObject k = k(orangeChangeInfo, str);
            if (k != null) {
                k.put(NotificationStyle.NOTIFICATION_STYLE, (Object) orangeChangeInfo.getNameSpace());
                k.put(MspDBHelper.RecordEntry.COLUMN_NAME_VERSION, (Object) orangeChangeInfo.getVersion());
                k.put("isGray", (Object) Boolean.valueOf(orangeChangeInfo.isGray()));
                return k.toJSONString();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void m(OrangeChangeInfo orangeChangeInfo, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b56eb8c", new Object[]{orangeChangeInfo, str});
            return;
        }
        try {
            if (a.I(orangeChangeInfo)) {
                b(l(orangeChangeInfo, str));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void n(InstantPatchChangeInfo instantPatchChangeInfo, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b411559", new Object[]{instantPatchChangeInfo, str});
            return;
        }
        try {
            if (!TextUtils.isEmpty(instantPatchChangeInfo.getVersion()) && a.D(instantPatchChangeInfo)) {
                b(j(instantPatchChangeInfo, str));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void o(tvc tvcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("500a4b5d", new Object[]{tvcVar});
        } else {
            f22975a = tvcVar;
        }
    }

    public static void p(vks vksVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73cc1b03", new Object[]{vksVar, str});
            return;
        }
        try {
            if (!TextUtils.isEmpty(vksVar.getBucketId()) && a.L()) {
                b(i(vksVar, str));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

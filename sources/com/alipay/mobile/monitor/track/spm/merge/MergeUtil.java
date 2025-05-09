package com.alipay.mobile.monitor.track.spm.merge;

import android.text.TextUtils;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.alipay.mobile.monitor.track.spm.SpmLogCator;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.umipublish.draft.DraftMediaHelper;
import org.json.JSONObject;

/* compiled from: Taobao */
@MpaasClassInfo(BundleName = "android-phone-wallet-spmtracker", ExportJarName = "unknown", Level = DraftMediaHelper.DraftType.PRODUCT, Product = ":android-phone-wallet-spmtracker")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class MergeUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_EXPOSED = "exposed";
    public static final String KEY_RID = "rid";
    public static String MERGE_CONFIG = null;
    public static final String SEPARATOR_ITEM = "&";
    public static final String SEPARATOR_KV = "|";
    public static final String SEPARATOR_PARAM = ";";
    public static final String SEPARATOR_REQUEST = "__";
    public static final String SEPARATOR_RID = ":";

    /* renamed from: a  reason: collision with root package name */
    public static int f4275a = -1;
    public static int b = -1;
    public static String c = "-1";

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
            return;
        }
        JSONObject jSONObject = new JSONObject(str);
        c = jSONObject.getString("switch");
        f4275a = jSONObject.getInt("size");
        b = jSONObject.getInt("count");
    }

    public static String getMergeBlackList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1ce730fe", new Object[0]);
        }
        return "cityid";
    }

    public static int getMergedMaxCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7fdf3847", new Object[0])).intValue();
        }
        int i = b;
        if (i != -1) {
            return i;
        }
        if (TextUtils.isEmpty(MERGE_CONFIG)) {
            return 50;
        }
        try {
            a(MERGE_CONFIG);
            return b;
        } catch (Exception e) {
            SpmLogCator.error("MergeUtil", "parseConfig exception:" + e.toString());
            return 50;
        }
    }

    public static int getMergedMaxSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b811b9fd", new Object[0])).intValue();
        }
        int i = f4275a;
        if (i != -1) {
            return i;
        }
        if (TextUtils.isEmpty(MERGE_CONFIG)) {
            return 14336;
        }
        try {
            a(MERGE_CONFIG);
            return f4275a;
        } catch (Exception e) {
            SpmLogCator.error("MergeUtil", "parseConfig exception:" + e.toString());
            return 14336;
        }
    }

    public static String isMergeActived() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2a46dfe9", new Object[0]);
        }
        if (!"-1".equals(c)) {
            return c;
        }
        if (TextUtils.isEmpty(MERGE_CONFIG)) {
            return "1";
        }
        try {
            a(MERGE_CONFIG);
            return c;
        } catch (Exception e) {
            SpmLogCator.error("MergeUtil", "parseConfig exception:" + e.toString());
            return "1";
        }
    }
}

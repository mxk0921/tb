package tb;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.augecore.data.GroupData;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class dj1 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String AUGE_VERSION = "version";
    public static final String SHARE_PREFERENCE_NAME = "auge_group_cache";

    /* renamed from: a  reason: collision with root package name */
    public static SharedPreferences f17858a;

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3160088a", new Object[]{str});
        } else if (!TextUtils.isEmpty(str)) {
            try {
                SharedPreferences.Editor edit = f17858a.edit();
                edit.remove(str);
                edit.apply();
            } catch (Exception e) {
                hj1.b(jj1.LOG_TAG, e.getMessage());
            }
        }
    }

    public static String b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fa5f8399", new Object[]{str, str2});
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return f17858a.getString(str, str2);
        } catch (Exception e) {
            hj1.b(jj1.LOG_TAG, "AugeCache === getCache异常了：" + e.getMessage());
            return str2;
        }
    }

    public static List<GroupData> c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("690be978", new Object[]{str});
        }
        ArrayList arrayList = new ArrayList();
        try {
            String string = f17858a.getString(str, null);
            if (string == null) {
                return arrayList;
            }
            return JSON.parseArray(string, GroupData.class);
        } catch (Throwable th) {
            hj1.b(jj1.LOG_TAG, "AugeCache === getDataList异常了：" + th.getMessage());
            return arrayList;
        }
    }

    public static void d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{context});
            return;
        }
        f17858a = context.getSharedPreferences(SHARE_PREFERENCE_NAME, 0);
        hj1.a(jj1.LOG_TAG, "AugeCache init success");
    }

    public static void e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c70f0ce", new Object[]{str, str2});
        } else if (!TextUtils.isEmpty(str) && str2 != null) {
            try {
                SharedPreferences.Editor edit = f17858a.edit();
                edit.putString(str, str2);
                edit.apply();
            } catch (Exception e) {
                hj1.b(jj1.LOG_TAG, "AugeCache === putCache异常了：" + e.getMessage());
            }
        }
    }

    public static void f(String str, List<GroupData> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d9e93ec", new Object[]{str, list});
        } else if (!TextUtils.isEmpty(str) && list != null) {
            String jSONString = JSON.toJSONString(list);
            SharedPreferences.Editor edit = f17858a.edit();
            edit.putString(str, jSONString);
            edit.apply();
        }
    }
}

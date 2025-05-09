package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class b75 implements psb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(451936257);
        t2o.a(452985004);
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d21bec01", new Object[]{this})).booleanValue();
        }
        String c = c("enableInstantSeek");
        if (TextUtils.isEmpty(c)) {
            return false;
        }
        try {
            return Boolean.parseBoolean(c);
        } catch (Exception unused) {
            return false;
        }
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ef9ed410", new Object[]{this})).booleanValue();
        }
        String c = c("PlayRateBtnEnable");
        if (TextUtils.isEmpty(c)) {
            return false;
        }
        try {
            return Boolean.parseBoolean(c);
        } catch (Exception unused) {
            return false;
        }
    }

    public String c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d74258f7", new Object[]{this, str});
        }
        return OrangeConfig.getInstance().getConfig("DWInteractive", str, "");
    }

    public boolean f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ee1f5990", new Object[]{this, str})).booleanValue();
        }
        try {
            List<String> d = d();
            if (!(d == null || d.size() == 0)) {
                for (String str2 : d) {
                    if (!TextUtils.isEmpty(str2) && ("ALL_BIZCODE".equalsIgnoreCase(str2) || str2.equalsIgnoreCase(str))) {
                        return true;
                    }
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public boolean g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f2a96913", new Object[]{this, str})).booleanValue();
        }
        try {
            List<String> e = e();
            if (!(e == null || e.size() == 0)) {
                for (String str2 : e) {
                    if (!TextUtils.isEmpty(str2) && ("ALL_BIZCODE".equalsIgnoreCase(str2) || str2.equalsIgnoreCase(str))) {
                        return true;
                    }
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    @Override // tb.gf4
    public String getConfig(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("611c4ee3", new Object[]{this, str, str2, str3});
        }
        if (TextUtils.isEmpty(str)) {
            return OrangeConfig.getInstance().getConfig("DWInteractive", str2, str3);
        }
        return OrangeConfig.getInstance().getConfig(str, str2, str3);
    }

    public boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f506fb3f", new Object[]{this})).booleanValue();
        }
        String c = c("httpsSchemeForVideoUrl");
        if (TextUtils.isEmpty(c)) {
            return true;
        }
        try {
            return Boolean.parseBoolean(c);
        } catch (Exception unused) {
            return true;
        }
    }

    public boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fd8862af", new Object[]{this})).booleanValue();
        }
        String c = c("videoLengthEnable");
        if (TextUtils.isEmpty(c)) {
            return false;
        }
        try {
            return Boolean.parseBoolean(c);
        } catch (Exception unused) {
            return false;
        }
    }

    public List<String> d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("6ba69d00", new Object[]{this});
        }
        try {
            JSONArray jSONArray = new JSONArray(getConfig("DWInteractive", e75.ORANGE_LAZY_PICK_URL_BIZCODE, ""));
            if (jSONArray.length() <= 0) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    if (!TextUtils.isEmpty(jSONArray.optString(i))) {
                        arrayList.add(jSONArray.optString(i));
                    }
                } catch (Throwable unused) {
                    return arrayList;
                }
            }
            return arrayList;
        } catch (Throwable unused2) {
            return null;
        }
    }

    public final List<String> e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("8de2f181", new Object[]{this});
        }
        try {
            JSONArray jSONArray = new JSONArray(getConfig("DWInteractive", "optimizeTextureWhiteList", "[\"DETAILMAIN\",\"DETAIL\",\"SHOP\",\"WEITAO\"]"));
            if (jSONArray.length() <= 0) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    if (!TextUtils.isEmpty(jSONArray.optString(i))) {
                        arrayList.add(jSONArray.optString(i));
                    }
                } catch (Throwable unused) {
                    return arrayList;
                }
            }
            return arrayList;
        } catch (Throwable unused2) {
            return null;
        }
    }

    public boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("70b8a265", new Object[]{this})).booleanValue();
        }
        try {
            String config = OrangeConfig.getInstance().getConfig("DWInteractive", "newPlayerEnable", "true");
            if (!TextUtils.isEmpty(config)) {
                return Boolean.parseBoolean(config);
            }
            return false;
        } catch (Exception unused) {
            return true;
        }
    }
}

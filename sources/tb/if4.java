package tb;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.mnncv.MNNCV;
import com.taobao.mrt.MRT;
import com.taobao.mrt.task.desc.MRTPythonLibDescription;
import com.taobao.mrt.task.desc.MRTTaskDescription;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class if4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final if4 f21283a = new if4();

    public static if4 b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (if4) ipChange.ipc$dispatch("f4cc3826", new Object[0]);
        }
        return f21283a;
    }

    public final String a() {
        SharedPreferences sharedPreferences;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("32dceb3c", new Object[]{this});
        }
        if (MNNCV.isCVDisabled()) {
            kgh.s("ConfigCacheUtil", "[fetchConfigFromLocalCache] disable by OrangeConfig ,key:isCVDisabled");
            return null;
        }
        Context g = MRT.g();
        if (g == null || (sharedPreferences = g.getSharedPreferences(ral.DAI_ORANGE_SWITCH, 0)) == null) {
            return null;
        }
        return sharedPreferences.getString("mnncvConfigCache", null);
    }

    public boolean c(String str) {
        MRTTaskDescription mRTTaskDescription;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ba694b83", new Object[]{this, str})).booleanValue();
        }
        String a2 = a();
        if (TextUtils.isEmpty(a2)) {
            return false;
        }
        aqh aqhVar = new aqh(a2);
        List<MRTPythonLibDescription> list = aqhVar.b;
        if (list != null && list.size() > 0) {
            List<String> tppLibs = MNNCV.getTppLibs();
            for (MRTPythonLibDescription mRTPythonLibDescription : aqhVar.b) {
                if (!tppLibs.contains(mRTPythonLibDescription.resourceName) && !rqh.b().c(mRTPythonLibDescription.resourceName)) {
                    rqh.b().e(mRTPythonLibDescription);
                }
            }
        }
        Iterator<MRTTaskDescription> it = aqhVar.f15937a.iterator();
        while (true) {
            if (!it.hasNext()) {
                mRTTaskDescription = null;
                break;
            }
            mRTTaskDescription = it.next();
            if (mRTTaskDescription != null && str.equals(mRTTaskDescription.name)) {
                break;
            }
        }
        if (mRTTaskDescription == null) {
            return false;
        }
        oqh.d().i(mRTTaskDescription);
        MNNCV.addToValidTaskNameMap(str);
        return true;
    }

    public void d(String str) {
        SharedPreferences sharedPreferences;
        SharedPreferences.Editor edit;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9e7c855", new Object[]{this, str});
            return;
        }
        Context g = MRT.g();
        if (g != null && (sharedPreferences = g.getSharedPreferences(ral.DAI_ORANGE_SWITCH, 0)) != null && (edit = sharedPreferences.edit()) != null) {
            edit.putString("mnncvConfigCache", str).apply();
        }
    }
}

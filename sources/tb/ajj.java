package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mrt.MRT;
import com.taobao.mrt.task.desc.MRTPythonLibDescription;
import com.tmall.android.dai.internal.util.LogUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ajj implements adt {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "NativeApiBridge";
    public static volatile ajj b;

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<MRTPythonLibDescription> f15775a = new ArrayList<>();

    static {
        t2o.a(1034944715);
        t2o.a(1034944593);
    }

    public static ajj b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ajj) ipChange.ipc$dispatch("79a9b090", new Object[0]);
        }
        synchronized (ajj.class) {
            try {
                if (b == null) {
                    b = new ajj();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return b;
    }

    @Override // tb.adt
    public Map<String, String> a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("5e53be4f", new Object[]{this, map});
        }
        LogUtil.d(TAG, "DAI onTask params: " + map);
        HashMap hashMap = new HashMap();
        String str = map.get("__action__");
        if (TextUtils.equals("on_walle_config_update", str)) {
            d42.h().i();
        } else if (TextUtils.equals("register_python_lib", str)) {
            String str2 = map.get("name");
            MRTPythonLibDescription mRTPythonLibDescription = new MRTPythonLibDescription(str2, map.get("mmd5"), map.get("furl"), map.get("fmd5"), null);
            if (MRT.i()) {
                LogUtil.d(TAG, "DAI register lib: " + str2);
                rqh.b().e(mRTPythonLibDescription);
            } else {
                LogUtil.d(TAG, "DAI add pending lib: " + str2);
                this.f15775a.add(mRTPythonLibDescription);
            }
            hashMap.put("success", "true");
        }
        return hashMap;
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e11ca029", new Object[]{this});
            return;
        }
        LogUtil.d(TAG, "DAI onMrtAvalible ");
        Iterator<MRTPythonLibDescription> it = this.f15775a.iterator();
        while (it.hasNext()) {
            MRTPythonLibDescription next = it.next();
            LogUtil.d(TAG, "DAI Register Pending " + next.resourceName);
            rqh.b().e(next);
        }
    }
}

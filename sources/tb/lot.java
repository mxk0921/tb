package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.linkmanager.AfcLifeCycleCenter;
import com.taobao.linkmanager.afc.utils.TFCCommonUtils;
import com.taobao.linkmanager.launcher.TbFcLinkInit;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class lot implements ijc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(744489117);
        t2o.a(467664917);
    }

    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("68837384", new Object[]{this});
        }
        return c21.g().getString("launchType", "COLD");
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ea92bb37", new Object[]{this});
        }
        return AfcLifeCycleCenter.instance().getCurrentActivityName();
    }

    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c959a1e1", new Object[]{this});
        }
        return AfcLifeCycleCenter.instance().getCurrentActivityUrl();
    }

    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d886fbdb", new Object[]{this});
        }
        return c21.g().getString("currFragmentName", null);
    }

    public int e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3cec5212", new Object[]{this})).intValue();
        }
        return c21.g().getInt("deviceLevel", -1);
    }

    public String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6c990156", new Object[]{this});
        }
        return TbFcLinkInit.launchType;
    }

    public String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("50ee13f6", new Object[]{this});
        }
        return TFCCommonUtils.k(TbFcLinkInit.instance().mApplication);
    }

    public long h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("95784991", new Object[]{this})).longValue();
        }
        return c21.g().getLong("startProcessSystemTime", 0L);
    }

    public boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7280f6a3", new Object[]{this})).booleanValue();
        }
        return c21.g().getBoolean("isInBackground", false);
    }
}

package com.taobao.android.diagnose.model;

import android.os.Build;
import android.os.Process;
import com.alipay.android.msp.framework.db.MspDBHelper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OConstant;
import java.util.HashMap;
import java.util.Map;
import tb.br2;
import tb.cl7;
import tb.qp0;
import tb.t2o;
import tb.v4s;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class AppInfo {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int USER_INNER = 1;
    public static final int USER_NORMAL = 0;
    public static final int USER_VIP = 2;
    public final String abi;
    public String accountName;
    public String appVer;
    public final String brand;
    public int deviceLevel;
    public int envIndex;
    public String extDir;
    public final String harmonyVer;
    public String innerDir;
    public boolean isDebug;
    public boolean isInner;
    public String lastExitInfo;
    public String lastLaunchInfo;
    public final String model;
    public final String os;
    public final String osDisplay;
    public final String osSdk;
    public final String osVer;
    public final int pid;
    public String process;
    public final boolean run64Bit;
    private final Map<String, String> startupInfo;
    public String uid;
    public int userType;
    public String utdid;

    static {
        t2o.a(615514174);
    }

    public AppInfo() {
        String str;
        boolean f = cl7.f();
        if (f) {
            str = "harmony";
        } else {
            str = "android";
        }
        this.os = str;
        if (f) {
            this.harmonyVer = cl7.a();
        } else {
            this.harmonyVer = "";
        }
        this.osDisplay = Build.DISPLAY;
        this.osVer = Build.VERSION.RELEASE;
        this.osSdk = Build.VERSION.SDK;
        this.brand = Build.BRAND;
        this.model = Build.MODEL;
        this.abi = Build.CPU_ABI;
        this.appVer = "";
        this.process = "";
        this.isDebug = false;
        this.envIndex = 0;
        this.utdid = "";
        this.uid = "";
        this.accountName = "";
        this.isInner = false;
        this.pid = Process.myPid();
        this.run64Bit = br2.b();
        this.innerDir = "";
        this.extDir = "";
        this.lastLaunchInfo = "";
        this.lastExitInfo = "";
        this.startupInfo = new HashMap();
        this.userType = 0;
        this.deviceLevel = qp0.b();
    }

    public boolean isLowDevice() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("522b454b", new Object[]{this})).booleanValue();
        }
        if (this.deviceLevel == 2) {
            return true;
        }
        return false;
    }

    public void setStartupInfo(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2cdb275", new Object[]{this, map});
        } else if (map != null) {
            synchronized (this.startupInfo) {
                this.startupInfo.putAll(map);
            }
        }
    }

    public HashMap<String, String> toMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("1c79404b", new Object[]{this});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("appVer", this.appVer);
        hashMap.put("process", this.process);
        hashMap.put(v4s.PARAM_IS_DEBUG, String.valueOf(this.isDebug));
        hashMap.put(OConstant.LAUNCH_ENVINDEX, String.valueOf(this.envIndex));
        hashMap.put("brand", this.brand);
        hashMap.put("model", this.model);
        hashMap.put("abi", this.abi);
        hashMap.put("utdid", this.utdid);
        hashMap.put(v4s.PARAM_IS_INNER, String.valueOf(this.isInner));
        hashMap.put("useType", Integer.toBinaryString(this.userType));
        hashMap.put("uid", this.uid);
        hashMap.put("accountName", this.accountName);
        hashMap.put("os", this.os);
        hashMap.put("osDisplay", this.osDisplay);
        hashMap.put("osVer", this.osVer);
        hashMap.put("osSdk", this.osSdk);
        hashMap.put("harmonyVer", this.harmonyVer);
        hashMap.put(MspDBHelper.BizEntry.COLUMN_NAME_PID, String.valueOf(this.pid));
        hashMap.put("run64Bit", String.valueOf(this.run64Bit));
        hashMap.put("deviceLevel", String.valueOf(this.deviceLevel));
        hashMap.put("dataDir", this.innerDir);
        hashMap.put("extDir", this.extDir);
        hashMap.put("lastLaunch", this.lastLaunchInfo);
        hashMap.put("lastExit", this.lastExitInfo);
        synchronized (this.startupInfo) {
            hashMap.putAll(this.startupInfo);
        }
        return hashMap;
    }
}

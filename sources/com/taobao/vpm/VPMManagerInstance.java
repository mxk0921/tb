package com.taobao.vpm;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.vpm.adapter.ICommitAdapter;
import com.taobao.vpm.adapter.IConfigAdapter;
import com.taobao.vpm.utils.VPMConstant;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;
import tb.h8e;
import tb.mow;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class VPMManagerInstance {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static String TAG = "VPMManagerInstance";
    private static volatile boolean mIsLibLoaded;
    private static VPMManagerInstance mVPMManagerInstance;

    private VPMManagerInstance() {
        loadLibrariesOnce();
    }

    private native boolean _collectInfo(long j, String str, float f, float f2);

    private native boolean _filterHAMetricsWithCriteria(String str, boolean z);

    private native String _getHAMetrics(long j, String str);

    private native String _getHAMetrics(String str);

    private static boolean canUseEventId19997() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("99dd5efc", new Object[0])).booleanValue();
        }
        IConfigAdapter iConfigAdapter = VPMAdapterManager.mConfigAdapter;
        if (iConfigAdapter != null) {
            str = iConfigAdapter.getConfig("VPM", "useEventId19997", "true");
        } else {
            str = "false";
        }
        return "true".equals(str);
    }

    private static void commitHAMetrics(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49ff9639", new Object[]{hashMap});
        } else if (hashMap != null && VPMAdapterManager.mCommitAdapter != null) {
            String str = hashMap.get("metric");
            if (!TextUtils.isEmpty(str)) {
                HashMap hashMap2 = new HashMap();
                for (Map.Entry<String, String> entry : hashMap.entrySet()) {
                    if (!"metric".equals(entry.getKey()) && !"version".equals(entry.getKey())) {
                        hashMap2.put(entry.getKey(), entry.getValue());
                    }
                }
                if (hashMap2.size() > 0) {
                    hashMap2.put("action", "get_metrics");
                    hashMap2.put("key", str);
                    VPMAdapterManager.mCommitAdapter.track4Click("Page_vpm", "vpm_ha", hashMap2);
                }
            }
        }
    }

    private static void commitStat(String str, String str2, int i, String str3, String str4, String str5, String str6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80126ba5", new Object[]{str, str2, new Integer(i), str3, str4, str5, str6});
        } else if (str != null && !str.isEmpty() && str3 != null && !str3.isEmpty() && str6 != null && !str6.isEmpty() && VPMAdapterManager.mCommitAdapter != null) {
            commitStat19997(str, str3, str6);
        }
    }

    private static String getConfig(String str, String str2, String str3) {
        String str4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("611c4ee3", new Object[]{str, str2, str3});
        }
        if (VPMAdapterManager.mCommitAdapter == null) {
            return str3;
        }
        if (isAlgoConfigKey(str2)) {
            try {
                str4 = JSON.parseObject(VPMAdapterManager.mConfigAdapter.getConfig(str, VPMConstant.ORANGE_VPM_ALGOCONFIG, str3)).getString(str2);
            } catch (Throwable unused) {
                str4 = str3;
            }
        } else {
            str4 = VPMAdapterManager.mConfigAdapter.getConfig(str, str2, str3);
        }
        if (str4 == null) {
            return str3;
        }
        return str4;
    }

    private HashMap<String, String> getHAMetricsInvalidResult() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("f5f4248a", new Object[]{this});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("metric", "Invalid");
        hashMap.put("Error", "invalid argument");
        return hashMap;
    }

    public static synchronized VPMManagerInstance getInstance() {
        synchronized (VPMManagerInstance.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (VPMManagerInstance) ipChange.ipc$dispatch("50e09465", new Object[0]);
            }
            if (mVPMManagerInstance == null) {
                mVPMManagerInstance = new VPMManagerInstance();
            }
            return mVPMManagerInstance;
        }
    }

    public static void loadLibrariesOnce() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a880bfb", new Object[0]);
            return;
        }
        synchronized (VPMManagerInstance.class) {
            try {
                if (!mIsLibLoaded) {
                    System.loadLibrary("VPM");
                    mIsLibLoaded = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static void onVPMHeartBeatCallback(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98195c1e", new Object[]{str});
        } else if (VPMAdapterManager.mVPMSessionListener != null) {
            VPMAdapterManager.mVPMSessionListener.a(string2Map(str));
        }
    }

    private static void postEventFromNative(Object obj, int i, long j, long j2, long j3, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b257b7bb", new Object[]{obj, new Integer(i), new Long(j), new Long(j2), new Long(j3), obj2});
        }
    }

    private static HashMap<String, String> string2Map(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("e2966e0f", new Object[]{str});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        if (!TextUtils.isEmpty(str)) {
            for (String str2 : str.split(",")) {
                String[] split = str2.split("=");
                if (split.length == 2) {
                    hashMap.put(split[0], split[1]);
                }
            }
        }
        return hashMap;
    }

    public native long _createSession();

    public native void _release();

    public native void _setUserGloabalStatMap(String str);

    public native void _setUserStatMap(String str);

    public void closeSession(VPMSession vPMSession) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ab94d4a", new Object[]{this, vPMSession});
        } else if (vPMSession != null) {
            vPMSession.stop();
        }
    }

    public boolean collectInfo(long j, String str, float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b1841bf3", new Object[]{this, new Long(j), str, new Float(f), new Float(f2)})).booleanValue();
        }
        return _collectInfo(j, str, f, f2);
    }

    public VPMSession createSession() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VPMSession) ipChange.ipc$dispatch("d65d9760", new Object[]{this});
        }
        if (mIsLibLoaded && mIsLibLoaded && mow.b()) {
            long _createSession = _createSession();
            if (_createSession > 0) {
                return new VPMSession(_createSession);
            }
        }
        return null;
    }

    public boolean filterHAMetricsWithCriteria(String str, Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d4d9ca89", new Object[]{this, str, bool})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return _filterHAMetricsWithCriteria(str, bool.booleanValue());
    }

    public HashMap<String, String> getHAMetrics(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("ef6090a8", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return getHAMetricsInvalidResult();
        }
        String _getHAMetrics = _getHAMetrics(str);
        if (TextUtils.isEmpty(_getHAMetrics)) {
            return getHAMetricsInvalidResult();
        }
        HashMap<String, String> string2Map = string2Map(_getHAMetrics);
        commitHAMetrics(string2Map);
        return string2Map;
    }

    public void registerVPMSessionListener(h8e h8eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60d352df", new Object[]{this, h8eVar});
        } else {
            VPMAdapterManager.mVPMSessionListener = h8eVar;
        }
    }

    public void release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
        } else {
            _release();
        }
    }

    public void setUserGloabalStatMap(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a34847ed", new Object[]{this, hashMap});
            return;
        }
        StringBuilder sb = new StringBuilder("");
        for (String str : hashMap.keySet()) {
            sb.append(str + "=" + hashMap.get(str) + ", ");
        }
        sb.delete(sb.length() - 2, sb.length());
        _setUserGloabalStatMap(sb.toString());
    }

    public void setUserStatMap(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2000f111", new Object[]{this, hashMap});
            return;
        }
        StringBuilder sb = new StringBuilder("");
        for (String str : hashMap.keySet()) {
            sb.append(str + "=" + hashMap.get(str) + ", ");
        }
        sb.delete(sb.length() - 2, sb.length());
        _setUserStatMap(sb.toString());
    }

    public void unregisterVPMSessionListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa8fa05a", new Object[]{this});
        } else {
            VPMAdapterManager.mVPMSessionListener = null;
        }
    }

    private static void commitStat19997(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac63dec9", new Object[]{str, str2, str3});
        } else if (canUseEventId19997()) {
            HashMap<String, String> string2Map = string2Map(str3);
            if ("vpm_algorithm_heartbeat".equals(str2) && string2Map != null && string2Map.containsKey("media_url")) {
                String str4 = string2Map.get("media_url");
                if (!TextUtils.isEmpty(str4)) {
                    String decode = URLDecoder.decode(str4);
                    if (!TextUtils.isEmpty(decode)) {
                        string2Map.put("media_url", decode);
                    }
                }
            }
            ICommitAdapter iCommitAdapter = VPMAdapterManager.mCommitAdapter;
            iCommitAdapter.trackCustom(str, 19997, str + "_Button-" + str2, "", "", string2Map);
        } else {
            String[] split = str3.split(",");
            for (int i = 0; i < split.length; i++) {
                if (!TextUtils.isEmpty(split[i]) && split[i].startsWith("media_url=") && split[i].length() > 10) {
                    String str5 = split[i];
                    String decode2 = URLDecoder.decode(str5.substring(10, str5.length()));
                    if (!TextUtils.isEmpty(decode2)) {
                        split[i] = "media_url=" + decode2;
                    }
                }
            }
            VPMAdapterManager.mCommitAdapter.track4Click(str, str2, split);
        }
    }

    private static boolean isAlgoConfigKey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a48cb035", new Object[]{str})).booleanValue();
        }
        return "black_threshold".equals(str) || "block_threshold".equals(str) || "mute_threshold".equals(str) || "lowvoice_threshold".equals(str) || "highvoice_threshold".equals(str) || "novoice_threshold".equals(str) || "audio_proc_win_size".equals(str) || "BlackDetectSwitch".equals(str) || "BlockDetectSwitch".equals(str) || "ExposureDetectSwitch".equals(str) || "GreenScreenDetectSwitch".equals(str) || "StaticFrameDetectSwitch".equals(str);
    }

    public HashMap<String, String> getHAMetrics(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("33f754d6", new Object[]{this, new Long(j), str});
        }
        if (TextUtils.isEmpty(str)) {
            return getHAMetricsInvalidResult();
        }
        String _getHAMetrics = _getHAMetrics(j, str);
        if (TextUtils.isEmpty(_getHAMetrics)) {
            return getHAMetricsInvalidResult();
        }
        return string2Map(_getHAMetrics);
    }
}

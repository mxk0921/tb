package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfigLocal;
import java.util.List;
import java.util.Map;
import mtopsdk.common.util.RemoteConfig;
import mtopsdk.common.util.StringUtils;
import mtopsdk.common.util.SwitchConfigUtil;
import mtopsdk.common.util.TBSdkLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class fmv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static fmv f19413a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class a extends TypeReference<Map<String, Integer>> {
        public a(fmv fmvVar) {
        }
    }

    public static fmv a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fmv) ipChange.ipc$dispatch("3eff35eb", new Object[0]);
        }
        if (f19413a == null) {
            synchronized (fmv.class) {
                try {
                    if (f19413a == null) {
                        f19413a = new fmv();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f19413a;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbe4c16e", new Object[]{this});
            return;
        }
        String config = OrangeConfigLocal.getInstance().getConfig(SwitchConfigUtil.CONFIG_GROUP_MTOPSDK_UPLOAD_SWITCH, SwitchConfigUtil.DEGRADE_BIZCODE_SET_KEY, null);
        if (!StringUtils.isBlank(config)) {
            try {
                List parseArray = JSON.parseArray(config, String.class);
                if (parseArray != null) {
                    RemoteConfig.getInstance().degradeBizcodeSets.clear();
                    RemoteConfig.getInstance().degradeBizcodeSets.addAll(parseArray);
                    if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                        TBSdkLog.i("mtopsdk.UploadSwitchConfigManager", "parse degradeBizcodeSets succeed,degradeBizCodeSetStr=" + config);
                    }
                }
            } catch (Throwable th) {
                TBSdkLog.e("mtopsdk.UploadSwitchConfigManager", "[parseDegradeBizCodeSetConfig]parse degradeBizCodeSetStr error ---", th);
            }
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de2f11ca", new Object[]{this});
            return;
        }
        String config = OrangeConfigLocal.getInstance().getConfig(SwitchConfigUtil.CONFIG_GROUP_MTOPSDK_UPLOAD_SWITCH, SwitchConfigUtil.SEGMENT_SIZE_MAP_KEY, null);
        if (!StringUtils.isBlank(config)) {
            try {
                Map map = (Map) JSON.parseObject(config, new a(this), new Feature[0]);
                if (map != null && map.size() > 0) {
                    for (Map.Entry entry : map.entrySet()) {
                        String str = (String) entry.getKey();
                        Integer num = (Integer) entry.getValue();
                        if (StringUtils.isNotBlank(str) && num != null) {
                            RemoteConfig.getInstance().setSegmentSize(str, num.intValue());
                        }
                    }
                    if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                        TBSdkLog.i("mtopsdk.UploadSwitchConfigManager", "[parseRemoteSegmentSizeMap]  remoteSegmentSizeMap=" + map);
                    }
                }
            } catch (Throwable th) {
                TBSdkLog.e("mtopsdk.UploadSwitchConfigManager", "[parseRemoteSegmentSizeMap]  parse segmentSizeMap configitem key error." + th.toString());
            }
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e082b122", new Object[]{this});
            return;
        }
        String config = OrangeConfigLocal.getInstance().getConfig(SwitchConfigUtil.CONFIG_GROUP_MTOPSDK_UPLOAD_SWITCH, SwitchConfigUtil.USEHTTPS_BIZCODE_SET_KEY, null);
        if (!StringUtils.isBlank(config)) {
            try {
                List parseArray = JSON.parseArray(config, String.class);
                if (parseArray != null) {
                    RemoteConfig.getInstance().useHttpsBizcodeSets.clear();
                    RemoteConfig.getInstance().useHttpsBizcodeSets.addAll(parseArray);
                    if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                        TBSdkLog.i("mtopsdk.UploadSwitchConfigManager", "parse useHttpsBizcodeSetStr succeed,useHttpsBizcodeSetStr=" + config);
                    }
                }
            } catch (Throwable th) {
                TBSdkLog.e("mtopsdk.UploadSwitchConfigManager", "[parseUseHttpsBizCodeSetConfig]parse useHttpsBizcodeSetStr error ---" + th.toString());
            }
        }
    }
}

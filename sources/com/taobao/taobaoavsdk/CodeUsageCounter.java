package com.taobao.taobaoavsdk;

import com.alipay.mobile.common.logging.api.LogContext;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.t2o;
import tb.vox;
import tb.yj4;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class CodeUsageCounter {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static CodeUsageCounter b;

    /* renamed from: a  reason: collision with root package name */
    public final Map<Integer, Integer> f12968a = new HashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public enum componentName {
        dw_adapter_DWInstancePlus(1000),
        dw_adapter_DWEventAdapter(1002),
        dw_adapter_DWImageAdapter(1003),
        dw_adapter_DWLauncher1(1006),
        dw_adapter_DWLauncher2(1007),
        dw_adapter_DWNetworkAdapter(1008),
        dw_adapter_DWStabilityAdapter(1010),
        dw_adapter_DWUserInfoAdapter(1012),
        dw_adapter_DWUserTrackAdapter(1014),
        dw_adapter_TBDWGifInstance(1015),
        dw_adapter_DWNetworkUtilsAdapter(1016),
        dw_adapter_WXInteractiveComponent(1018),
        dw_adapter_WXSplayerModule(1019),
        dw_sdk_DWGifInstance(2000),
        dw_sdk_DWPlayerController(2001),
        dw_sdk_DWScreenOrientationListenerImp(2004),
        dw_sdk_DWWXSDKInstance(2005),
        dw_sdk_DWInteractive(2007),
        dw_sdk_DWFrontCoverManager(vox.CLASS_2008),
        dw_sdk_MenuWindow(2010),
        dw_sdk_NavSeekBar(2013),
        dw_sdk_DWKeyBackController(LogContext.PERFORMANCE_SCORE_ENDURE_2015),
        dw_sdk_DWMuteController(2016),
        dw_sdk_DWNoticeViewController(2017),
        dw_sdk_DWSmallBarViewController(2018),
        dw_sdk_DWToastContainer(2019),
        dw_sdk_DWTopBarController(IMediaPlayer.MEDIA_INFO_PLAYER_INIT_FAILED_ERROR),
        dw_sdk_DWDataManager(2021),
        dw_sdk_DWPlayerControlViewController(2022),
        dw_sdk_DWTBVideoSourceAdapter(yj4.MSG_AUTO_RECOMMEND),
        dw_sdk_DWVideoContainer(2025),
        dw_sdk_DWVideoController(2026),
        dw_sdk_DWVideoViewController(2027);
        
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final int value;

        componentName(int i) {
            this.value = i;
        }

        public static /* synthetic */ Object ipc$super(componentName componentname, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taobaoavsdk/CodeUsageCounter$componentName");
        }

        public static componentName valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (componentName) ipChange.ipc$dispatch("951b4833", new Object[]{str});
            }
            return (componentName) Enum.valueOf(componentName.class, str);
        }

        public int getValue() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("d1b766b5", new Object[]{this})).intValue();
            }
            return this.value;
        }
    }

    static {
        t2o.a(774897838);
    }

    public static synchronized CodeUsageCounter c() {
        synchronized (CodeUsageCounter.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (CodeUsageCounter) ipChange.ipc$dispatch("5b15fc90", new Object[0]);
            }
            if (b == null) {
                b = new CodeUsageCounter();
            }
            return b;
        }
    }

    public void a(componentName componentname) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f18315e", new Object[]{this, componentname});
        } else if (((HashMap) this.f12968a).containsKey(Integer.valueOf(componentname.getValue()))) {
            ((HashMap) this.f12968a).put(Integer.valueOf(componentname.getValue()), Integer.valueOf(((Integer) ((HashMap) this.f12968a).get(Integer.valueOf(componentname.getValue()))).intValue() + 1));
        } else {
            ((HashMap) this.f12968a).put(Integer.valueOf(componentname.getValue()), 1);
        }
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("87befc8c", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry : ((HashMap) this.f12968a).entrySet()) {
            sb.append(entry.getKey());
            sb.append("=");
            sb.append(entry.getValue());
            sb.append("_");
        }
        return sb.toString();
    }
}

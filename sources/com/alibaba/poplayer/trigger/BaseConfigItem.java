package com.alibaba.poplayer.trigger;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.poplayer.PopLayer;
import com.alibaba.poplayer.config.model.keep.KeepModel;
import com.alibaba.poplayer.config.model.style.StyleModel;
import com.alibaba.poplayer.config.model.trigger.TriggerModel;
import com.alibaba.poplayer.config.model.trigger.UriModel;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import tb.pg1;
import tb.t2o;
import tb.wdm;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class BaseConfigItem implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "BaseConfigItem";
    private static final SimpleDateFormat sFormat;
    private static String sTimeZoneId = "";
    public String abGroupID;
    public String abModule;
    @JSONField(name = "actionCallBack")
    public boolean actionCallBack;
    public boolean allShow;
    public String appVersions;
    public boolean appear;
    public String bizId;
    public String bizType;
    public int closeOnTime;
    public String configVersion;
    public String debugInfo;
    public String disableDevice;
    public String[] disableDeviceArray;
    public String disableTime;
    public DisableTimeParam[] disableTimeConfigs;
    public boolean embed;
    public boolean enableHardwareAcceleration;
    public boolean enableSpecialViewTouchIntercept;
    public String endTime;
    public boolean enqueue;
    public boolean exclusive;
    public String extra;
    public boolean forcePopRespectingPriority;
    public boolean forceUpdateUT;
    public String freq;
    public FrequencyConfigInfo freqConfigs;
    public String indexID;
    public String json;
    @JSONField(name = "keep")
    public String keep;
    public KeepModel keepConfigs;
    public String layerType;
    public String localCrowd;
    @JSONField(name = "mode")
    public String mode;
    public String nativeVersion;
    public boolean onlyColdLaunch;
    public String osVersions;
    public String paramContains;
    public String params;
    public String popPreCheckParams;
    public String preCheckGroupId;
    public int priority;
    public String protocolCheck;
    public ProtocolCheck protocolCheckInfo;
    @JSONField(name = "protocolChecks")
    public List<ProtocolCheckItem> protocolChecks;
    @JSONField(name = "sceneCheck")
    public String sceneCheck;
    public String sceneId;
    public boolean showCloseBtn;
    public String startTime;
    @JSONField(name = "style")
    public String style;
    public StyleModel styleConfigs;
    public int times;
    @JSONField(name = "trigger")
    public String trigger;
    public TriggerModel triggerConfigs;
    public String type;
    public String uri;
    public String[] uris;
    public String url;
    public int viewLoadDelayTime;
    public String uuid = pg1.ATOM_EXT_Undefined;
    public int enablePercent = 1000;
    public double modalThreshold = 0.8d;
    public boolean enableFullScreenInImmersive = true;
    private long startTimeStamp = 0;
    private long endTimeStamp = 0;
    @JSONField(name = "accessibility")
    public boolean accessibility = true;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class DisableTimeParam implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public String endTime;
        private long endTimeStamp;
        public String startTime;
        private long startTimeStamp;

        static {
            t2o.a(626000001);
        }

        public long getEndTimeStamp() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("9e38dccc", new Object[]{this})).longValue();
            }
            try {
                if (BaseConfigItem.access$100()) {
                    long j = this.endTimeStamp;
                    if (j > 0) {
                        return j;
                    }
                }
                this.endTimeStamp = BaseConfigItem.access$000(this.endTime);
            } catch (Throwable th) {
                wdm.h("BaseConfigItem.getEndTimeStamp.error.", th);
            }
            return this.endTimeStamp;
        }

        public long getStartTimeStamp() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("e340cf25", new Object[]{this})).longValue();
            }
            try {
                if (BaseConfigItem.access$100()) {
                    long j = this.startTimeStamp;
                    if (j > 0) {
                        return j;
                    }
                }
                this.startTimeStamp = BaseConfigItem.access$000(this.startTime);
            } catch (Throwable th) {
                wdm.h("BaseConfigItem.getStartTimeStamp.error.", th);
            }
            return this.startTimeStamp;
        }

        public void parseDisableTimeParam() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fdf32f92", new Object[]{this});
                return;
            }
            this.startTimeStamp = BaseConfigItem.access$000(this.startTime);
            this.endTimeStamp = BaseConfigItem.access$000(this.endTime);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class FrequencyConfigInfo implements Serializable {
        public long freqEnableSection;
        public long freqFirstOffset;
        public long freqIntervalSecs;
        public int freqMaxCount;
        public long freqSecs;
        public long onceExposeCount;
        public long onceShowCount;

        static {
            t2o.a(626000002);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class ProtocolCheck implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public String paramContains;
        public String uri;
        public String[] uris;

        static {
            t2o.a(626000003);
        }

        public boolean isValid() {
            boolean z;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue();
            }
            boolean isEmpty = TextUtils.isEmpty(this.uri);
            String[] strArr = this.uris;
            if (strArr != null && strArr.length > 0) {
                for (String str : strArr) {
                    if (!TextUtils.isEmpty(str)) {
                        z = true;
                        break;
                    }
                }
            }
            z = false;
            if (!isEmpty || z) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class ProtocolCheckItem implements Serializable {
        public String filter;
        public String[] uris;

        static {
            t2o.a(626000004);
        }
    }

    public static /* synthetic */ long access$000(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("38fae175", new Object[]{str})).longValue();
        }
        return parseTimeStringToTimeStamp(str);
    }

    public static /* synthetic */ boolean access$100() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f1bc42bc", new Object[0])).booleanValue();
        }
        return isTimeZoneSame();
    }

    private static boolean isTimeZoneSame() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("332f5674", new Object[0])).booleanValue();
        }
        String timeZoneFromGMT = PopLayer.getReference().getTimeZoneFromGMT();
        if (TextUtils.isEmpty(timeZoneFromGMT) || timeZoneFromGMT.equals(sTimeZoneId)) {
            return true;
        }
        return false;
    }

    private void parseModels() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43ac1d04", new Object[]{this});
            return;
        }
        try {
            if (this.disableDeviceArray == null && !TextUtils.isEmpty(this.disableDevice)) {
                List parseArray = JSON.parseArray(this.disableDevice, String.class);
                this.disableDeviceArray = (String[]) parseArray.toArray(new String[parseArray.size()]);
            }
        } catch (Throwable th) {
            wdm.h("BaseConfigItem.parseDisableDevice.error.", th);
        }
        try {
            if (this.protocolCheckInfo == null && !TextUtils.isEmpty(this.protocolCheck)) {
                this.protocolCheckInfo = (ProtocolCheck) JSON.parseObject(this.protocolCheck, ProtocolCheck.class);
            }
        } catch (Throwable unused) {
            wdm.a("BaseConfigItem.parseProtocolCheck.error:currentIndexId:" + this.indexID);
        }
        try {
            if (this.disableTimeConfigs == null && !TextUtils.isEmpty(this.disableTime)) {
                List parseArray2 = JSON.parseArray(this.disableTime, DisableTimeParam.class);
                DisableTimeParam[] disableTimeParamArr = (DisableTimeParam[]) parseArray2.toArray(new DisableTimeParam[parseArray2.size()]);
                this.disableTimeConfigs = disableTimeParamArr;
                for (DisableTimeParam disableTimeParam : disableTimeParamArr) {
                    disableTimeParam.parseDisableTimeParam();
                }
            }
        } catch (Throwable unused2) {
            wdm.a("BaseConfigItem.parseDisableTimeParams.error:currentIndexId:" + this.indexID);
        }
        try {
            if (this.freqConfigs == null && !TextUtils.isEmpty(this.freq)) {
                this.freqConfigs = (FrequencyConfigInfo) JSON.parseObject(this.freq, FrequencyConfigInfo.class);
            }
        } catch (Throwable unused3) {
            wdm.a("BaseConfigItem.parseFreq.error:currentIndexId:" + this.indexID);
        }
        try {
            if (this.keepConfigs == null && !TextUtils.isEmpty(this.keep)) {
                this.keepConfigs = (KeepModel) JSON.parseObject(this.keep, KeepModel.class);
            }
        } catch (Throwable unused4) {
            wdm.a("BaseConfigItem.parseKeep.error:currentIndexId:" + this.indexID);
        }
        try {
            if (this.triggerConfigs == null && !TextUtils.isEmpty(this.trigger)) {
                this.triggerConfigs = (TriggerModel) JSON.parseObject(this.trigger, TriggerModel.class);
            }
        } catch (Throwable unused5) {
            wdm.a("BaseConfigItem.parseTrigger.error:currentIndexId:" + this.indexID);
        }
        try {
            if (this.styleConfigs == null && !TextUtils.isEmpty(this.style)) {
                this.styleConfigs = (StyleModel) JSON.parseObject(this.style, StyleModel.class);
            }
        } catch (Throwable unused6) {
            wdm.a("BaseConfigItem.parseStyle.error:currentIndexId:" + this.indexID);
        }
    }

    private static long parseTimeStringToTimeStamp(String str) {
        long time;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("eda79aaf", new Object[]{str})).longValue();
        }
        if (TextUtils.isEmpty(str)) {
            return Long.MAX_VALUE;
        }
        try {
            try {
                SimpleDateFormat simpleDateFormat = sFormat;
                synchronized (simpleDateFormat) {
                    updateTimeZone();
                    time = simpleDateFormat.parse(str).getTime();
                }
                return time;
            } catch (NumberFormatException unused) {
                return Long.MAX_VALUE;
            }
        } catch (ParseException unused2) {
            return Long.parseLong(str);
        }
    }

    private static void updateTimeZone() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d003389", new Object[0]);
            return;
        }
        try {
            String timeZoneFromGMT = PopLayer.getReference().getTimeZoneFromGMT();
            if (!TextUtils.isEmpty(timeZoneFromGMT)) {
                sFormat.setTimeZone(TimeZone.getTimeZone(timeZoneFromGMT));
                sTimeZoneId = timeZoneFromGMT;
            }
        } catch (Throwable th) {
            wdm.h("updateTimeZone error", th);
        }
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return ((BaseConfigItem) obj).uuid.equals(this.uuid);
        }
        return false;
    }

    public long getEndTimeStamp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9e38dccc", new Object[]{this})).longValue();
        }
        try {
            if (isTimeZoneSame()) {
                long j = this.endTimeStamp;
                if (j > 0) {
                    return j;
                }
            }
            this.endTimeStamp = parseTimeStringToTimeStamp(this.endTime);
        } catch (Throwable th) {
            wdm.h("BaseConfigItem.getEndTimeStamp.error.", th);
        }
        return this.endTimeStamp;
    }

    public long getStartTimeStamp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e340cf25", new Object[]{this})).longValue();
        }
        try {
            if (isTimeZoneSame()) {
                long j = this.startTimeStamp;
                if (j > 0) {
                    return j;
                }
            }
            this.startTimeStamp = parseTimeStringToTimeStamp(this.startTime);
        } catch (Throwable th) {
            wdm.h("BaseConfigItem.getStartTimeStamp.error.", th);
        }
        return this.startTimeStamp;
    }

    public boolean isAppMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b385fe65", new Object[]{this})).booleanValue();
        }
        return "app".equals(this.mode);
    }

    public void parseConfigParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b52a98c2", new Object[]{this});
            return;
        }
        parseModels();
        transUriToTrigger();
    }

    public void parseTimeStamps() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29a3b5d7", new Object[]{this});
            return;
        }
        this.startTimeStamp = parseTimeStringToTimeStamp(this.startTime);
        this.endTimeStamp = parseTimeStringToTimeStamp(this.endTime);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        if (!TextUtils.isEmpty(this.json)) {
            return this.json;
        }
        return "{appear=" + this.appear + ", startTime='" + this.startTime + "', endTime='" + this.endTime + "', enablePercent=" + this.enablePercent + ", appVersions='" + this.appVersions + "', osVersions='" + this.osVersions + "', disableDevice='" + this.disableDevice + "', protocolCheck='" + this.protocolCheck + "', uuid='" + this.uuid + "', times=" + this.times + ", embed=" + this.embed + ", modalThreshold=" + this.modalThreshold + ", showCloseBtn=" + this.showCloseBtn + ", layerType='" + this.layerType + "', type='" + this.type + "', params='" + this.params + "', priority=" + this.priority + ", enqueue=" + this.enqueue + ", bizType='" + this.bizType + "', forcePopRespectingPriority=" + this.forcePopRespectingPriority + ", allShow=" + this.allShow + ", popPreCheckParams='" + this.popPreCheckParams + "', localCrowd='" + this.localCrowd + "', freq='" + this.freq + "', enableSpecialViewTouchIntercept=" + this.enableSpecialViewTouchIntercept + ", enableFullScreenInImmersive=" + this.enableFullScreenInImmersive + ", debugInfo='" + this.debugInfo + "', extra=" + this.extra + '}';
    }

    private void transUriToTrigger() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dccf0d80", new Object[]{this});
            return;
        }
        TriggerModel triggerModel = this.triggerConfigs;
        if (triggerModel == null || !triggerModel.isValid()) {
            TriggerModel triggerModel2 = new TriggerModel();
            this.triggerConfigs = triggerModel2;
            triggerModel2.pages = new ArrayList();
            UriModel uriModel = new UriModel();
            uriModel.uris = new ArrayList();
            uriModel.filter = this.paramContains;
            if (!TextUtils.isEmpty(this.uri)) {
                uriModel.uris.add(this.uri);
            }
            String[] strArr = this.uris;
            if (strArr != null) {
                for (String str : strArr) {
                    if (!TextUtils.isEmpty(str)) {
                        uriModel.uris.add(str);
                    }
                }
            }
            this.triggerConfigs.pages.add(uriModel);
        }
    }

    public boolean isKeepLive() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f4c0c66", new Object[]{this})).booleanValue();
        }
        return isAppMode() && this.keep != null && KeepModel.MODE_KEEP_LIVE.equals(this.keepConfigs.mode);
    }

    public boolean isPageLive() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bbd39970", new Object[]{this})).booleanValue();
        }
        return isAppMode() && this.keep != null && KeepModel.MODE_PAGE_LIVE.equals(this.keepConfigs.mode);
    }

    static {
        t2o.a(626000000);
        Locale locale = Locale.CHINA;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale);
        sFormat = simpleDateFormat;
        simpleDateFormat.setCalendar(new GregorianCalendar(TimeZone.getTimeZone("GMT+8"), locale));
    }
}

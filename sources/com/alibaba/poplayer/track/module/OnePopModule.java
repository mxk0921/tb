package com.alibaba.poplayer.track.module;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class OnePopModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EXPOSE_TYPE_APP_MODE_VIEW_ADD = "appModeAdd";
    public static final String EXPOSE_TYPE_EMBED_VIEW_ADD = "embedAdd";
    public static final String EXPOSE_TYPE_INIT = "init";
    public OnePopLoseReasonCode c0;
    public String h0;

    /* renamed from: a  reason: collision with root package name */
    public String f2533a = null;
    public String b = null;
    public String c = null;
    public String d = null;
    public String e = null;
    public String f = null;
    public String g = "init";
    public int h = 0;
    public int i = 0;
    public String j = null;
    public String k = null;
    public String l = null;
    public String m = null;
    public String n = null;
    public String o = null;
    public String p = null;
    public String q = null;
    public String r = null;
    public String s = null;
    public String t = null;
    public boolean u = false;
    public boolean v = false;
    public boolean w = false;
    public String x = "false";
    public String y = "false";
    public String z = "false";
    public String A = "false";
    public String B = "false";
    public String C = "false";
    public long D = 0;
    public String E = null;
    public String F = null;
    public String G = null;
    public String H = null;
    public String I = null;
    public String J = null;
    public String K = null;
    public String L = null;
    public String M = null;
    public String N = null;
    public String O = null;
    public String P = null;
    public String Q = null;
    public String R = null;
    public String S = null;
    public String T = null;
    public String U = null;
    public String V = null;
    public String W = null;
    public String X = "0";
    public int Y = 0;
    public String Z = null;
    public String a0 = "false";
    public String b0 = null;
    public String d0 = null;
    public String e0 = null;
    public String f0 = null;
    public String g0 = null;
    public String i0 = null;
    public String j0 = null;
    public String k0 = null;
    public long l0 = 0;
    public long m0 = 0;
    public long n0 = 0;
    public long o0 = 0;
    public long p0 = 0;
    public long q0 = 0;
    public boolean r0 = true;
    public long s0 = 0;
    public long t0 = 0;
    public long u0 = 0;
    public boolean v0 = false;
    public final JSONObject w0 = new JSONObject();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public enum OnePopLoseReasonCode {
        UCPFilter("UCP检查未通过"),
        ConfigCheckFail("配置检查未通过"),
        LMLifeCycleEnqueue("在队列中持续等待弹出"),
        LMLifeCycleDrop("配置为不入队被丢弃"),
        LMLifeCycleForceDrop("被强制弹出且优先级更高的其他pop移除"),
        LMLifeCycleCheckFail("配置二次检查未通过"),
        CrowdPreCheckCancel("人群预判过程中被页面切换等原因被取消"),
        CrowdPreCheckFail("人群预判失败则关闭"),
        CrowdPreCheckNoPop("人群预判结果为不弹出"),
        MtopPreCheckCancel("Mtop预判过程中被页面切换等原因被取消"),
        MtopPreCheckFail("Mtop预判失败则关闭"),
        MtopPreCheckNoPop("Mtop预判结果为不弹出"),
        OnViewPageSwitchClose("页面切换被关闭"),
        OnViewCustomFilter("pop加载容器自定义过滤"),
        OnViewErrorClose("pop加载容器抛错关闭"),
        OnViewJSClose("页面调用Close接口关闭"),
        other("其他原因");
        
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private String description;

        OnePopLoseReasonCode(String str) {
            this.description = str;
        }

        public static /* synthetic */ Object ipc$super(OnePopLoseReasonCode onePopLoseReasonCode, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/poplayer/track/module/OnePopModule$OnePopLoseReasonCode");
        }

        public static OnePopLoseReasonCode valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (OnePopLoseReasonCode) ipChange.ipc$dispatch("626fa63d", new Object[]{str});
            }
            return (OnePopLoseReasonCode) Enum.valueOf(OnePopLoseReasonCode.class, str);
        }

        public String getDescription() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("b9cffbf3", new Object[]{this});
            }
            return this.description;
        }
    }

    static {
        t2o.a(625999998);
    }

    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c3ed347c", new Object[]{this})).intValue();
        }
        return this.Y;
    }

    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("16f49ae", new Object[]{this});
        }
        return this.Z;
    }

    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("337d74f0", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str) && !str.startsWith("poplayer")) {
            this.Y++;
            this.Z = str;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00c8 A[Catch: all -> 0x0025, TryCatch #0 {all -> 0x0025, blocks: (B:6:0x001b, B:8:0x0020, B:11:0x0028, B:14:0x0031, B:16:0x0035, B:18:0x0039, B:20:0x003d, B:22:0x0049, B:24:0x004f, B:26:0x0055, B:28:0x005d, B:29:0x0065, B:31:0x0083, B:33:0x008b, B:34:0x008f, B:37:0x0096, B:39:0x00a6, B:42:0x00af, B:44:0x00b3, B:46:0x00b7, B:49:0x00c0, B:51:0x00c4, B:53:0x00c8, B:56:0x00d1, B:57:0x00d3, B:59:0x00d7, B:61:0x00e0, B:63:0x00fc, B:65:0x0109, B:67:0x0113, B:71:0x0125), top: B:74:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d7 A[Catch: all -> 0x0025, TryCatch #0 {all -> 0x0025, blocks: (B:6:0x001b, B:8:0x0020, B:11:0x0028, B:14:0x0031, B:16:0x0035, B:18:0x0039, B:20:0x003d, B:22:0x0049, B:24:0x004f, B:26:0x0055, B:28:0x005d, B:29:0x0065, B:31:0x0083, B:33:0x008b, B:34:0x008f, B:37:0x0096, B:39:0x00a6, B:42:0x00af, B:44:0x00b3, B:46:0x00b7, B:49:0x00c0, B:51:0x00c4, B:53:0x00c8, B:56:0x00d1, B:57:0x00d3, B:59:0x00d7, B:61:0x00e0, B:63:0x00fc, B:65:0x0109, B:67:0x0113, B:71:0x0125), top: B:74:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00fc A[Catch: all -> 0x0025, TryCatch #0 {all -> 0x0025, blocks: (B:6:0x001b, B:8:0x0020, B:11:0x0028, B:14:0x0031, B:16:0x0035, B:18:0x0039, B:20:0x003d, B:22:0x0049, B:24:0x004f, B:26:0x0055, B:28:0x005d, B:29:0x0065, B:31:0x0083, B:33:0x008b, B:34:0x008f, B:37:0x0096, B:39:0x00a6, B:42:0x00af, B:44:0x00b3, B:46:0x00b7, B:49:0x00c0, B:51:0x00c4, B:53:0x00c8, B:56:0x00d1, B:57:0x00d3, B:59:0x00d7, B:61:0x00e0, B:63:0x00fc, B:65:0x0109, B:67:0x0113, B:71:0x0125), top: B:74:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0109 A[Catch: all -> 0x0025, TryCatch #0 {all -> 0x0025, blocks: (B:6:0x001b, B:8:0x0020, B:11:0x0028, B:14:0x0031, B:16:0x0035, B:18:0x0039, B:20:0x003d, B:22:0x0049, B:24:0x004f, B:26:0x0055, B:28:0x005d, B:29:0x0065, B:31:0x0083, B:33:0x008b, B:34:0x008f, B:37:0x0096, B:39:0x00a6, B:42:0x00af, B:44:0x00b3, B:46:0x00b7, B:49:0x00c0, B:51:0x00c4, B:53:0x00c8, B:56:0x00d1, B:57:0x00d3, B:59:0x00d7, B:61:0x00e0, B:63:0x00fc, B:65:0x0109, B:67:0x0113, B:71:0x0125), top: B:74:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(com.alibaba.poplayer.trigger.BaseConfigItem r7, com.alibaba.poplayer.trigger.Event r8, java.lang.String r9) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.poplayer.track.module.OnePopModule.a(com.alibaba.poplayer.trigger.BaseConfigItem, com.alibaba.poplayer.trigger.Event, java.lang.String):void");
    }
}

package com.alibaba.triver.base.taobao;

import com.alibaba.android.triver.base.api.ITriverRemoteProxy;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.Dimension;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.Measure;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class TriverRemoteMonitorData {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f2929a;
    public String b;
    public boolean c = true;
    public ITriverRemoteProxy.DependenceMode d = ITriverRemoteProxy.DependenceMode.TRIVER_ONLY;
    public InstallType e = InstallType.EXPLICIT;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public enum InstallType {
        SILENCE,
        EXPLICIT;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(InstallType installType, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/base/taobao/TriverRemoteMonitorData$InstallType");
        }

        public static InstallType valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (InstallType) ipChange.ipc$dispatch("f9ed638e", new Object[]{str});
            }
            return (InstallType) Enum.valueOf(InstallType.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public enum Status {
        Success,
        Fail,
        UserCancel;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(Status status, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/base/taobao/TriverRemoteMonitorData$Status");
        }

        public static Status valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Status) ipChange.ipc$dispatch("144add61", new Object[]{str});
            }
            return (Status) Enum.valueOf(Status.class, str);
        }
    }

    public static void g(String str, String str2, JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a50b04da", new Object[]{str, str2, jSONObject, jSONObject2});
        } else if (jSONObject != null) {
            try {
                if (jSONObject.size() >= 1 && jSONObject2 != null) {
                    DimensionSet create = DimensionSet.create();
                    DimensionValueSet create2 = DimensionValueSet.create();
                    for (String str3 : jSONObject.keySet()) {
                        create.addDimension(new Dimension(str3));
                        create2.setValue(str3, jSONObject.getString(str3));
                    }
                    MeasureSet create3 = MeasureSet.create();
                    MeasureValueSet create4 = MeasureValueSet.create();
                    for (String str4 : jSONObject2.keySet()) {
                        create3.addMeasure(new Measure(str4));
                        create4.setValue(str4, jSONObject2.getDoubleValue(str4));
                    }
                    AppMonitor.register(str, str2, create3, create, true);
                    AppMonitor.Stat.commit(str, str2, create2, create4);
                }
            } catch (Throwable th) {
                RVLogger.e("TriverRemoteMonitorData", th);
            }
        }
    }

    public void a(long j, Status status, String str) {
        String str2;
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbbce3c", new Object[]{this, new Long(j), status, str});
        } else if (status != null) {
            JSONObject jSONObject = new JSONObject();
            InstallType installType = this.e;
            if (installType != null) {
                str2 = installType.name();
            } else {
                str2 = "";
            }
            jSONObject.put("installType", (Object) str2);
            String str4 = this.f2929a;
            if (str4 == null) {
                str4 = "";
            }
            jSONObject.put("bizType", (Object) str4);
            String str5 = this.b;
            if (str5 == null) {
                str5 = "";
            }
            jSONObject.put("bizId", (Object) str5);
            ITriverRemoteProxy.DependenceMode dependenceMode = this.d;
            if (dependenceMode != null) {
                str3 = dependenceMode.name();
            } else {
                str3 = "";
            }
            jSONObject.put("installMode", (Object) str3);
            jSONObject.put("installResult", (Object) status.name());
            if (str == null) {
                str = "";
            }
            jSONObject.put("errorMsg", (Object) str);
            jSONObject.put("needLoad", (Object) String.valueOf(this.c));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("timeCost", (Object) Long.valueOf(j));
            g("Triver", "TriverRemote", jSONObject, jSONObject2);
        }
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef8887dd", new Object[]{this, str});
        } else {
            this.b = str;
        }
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebf7407c", new Object[]{this, str});
        } else {
            this.f2929a = str;
        }
    }

    public void d(ITriverRemoteProxy.DependenceMode dependenceMode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4c76ee4", new Object[]{this, dependenceMode});
        } else {
            this.d = dependenceMode;
        }
    }

    public void e(InstallType installType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("989a93cb", new Object[]{this, installType});
        } else {
            this.e = installType;
        }
    }

    public void f(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7f41ccf", new Object[]{this, new Boolean(z)});
        } else {
            this.c = z;
        }
    }
}

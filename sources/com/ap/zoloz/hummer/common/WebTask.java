package com.ap.zoloz.hummer.common;

import com.alipay.mobile.security.bio.utils.BioLog;
import com.alipay.mobile.security.bio.utils.StringUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.dfb;
import tb.f9b;
import tb.jqn;
import tb.nzw;
import tb.qzd;
import tb.t2o;
import tb.upx;
import tb.vk0;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class WebTask extends TaskTracker {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String url = "";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class a implements dfb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TaskConfig f4612a;

        public a(TaskConfig taskConfig) {
            this.f4612a = taskConfig;
        }

        @Override // tb.dfb
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3ee5ec4b", new Object[]{this});
            } else if (this.f4612a.navigateConfig.containsKey("error")) {
                WebTask webTask = WebTask.this;
                webTask.mITaskTrackerCallback.a(webTask.mHummerContext, ((Integer) ((Map) this.f4612a.navigateConfig.get("error")).get("index")).intValue());
            }
        }

        @Override // tb.dfb
        public void b(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("97c8cf5e", new Object[]{this, new Boolean(z)});
            }
        }
    }

    static {
        t2o.a(245366854);
    }

    public static /* synthetic */ Object ipc$super(WebTask webTask, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ap/zoloz/hummer/common/WebTask");
    }

    public String getUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("de8f0660", new Object[]{this});
        }
        return this.url;
    }

    public void handleResult(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc330421", new Object[]{this, new Integer(i), str});
        } else if (this.mTaskConfig != null && this.mHummerContext != null) {
            BioLog.i("endWebTask result = " + i);
            if (i == 0) {
                if (StringUtil.isNullorEmpty(str)) {
                    this.mHummerContext.u(this.mTaskConfig.name, "Z7033");
                    this.mHummerContext.p(this.mTaskConfig.name, "Z7033");
                    vk0.e().c(this.mIAlertManagerCallback);
                    return;
                }
                i = this.mHummerContext.h(str);
            }
            qzd qzdVar = this.mITaskTrackerCallback;
            if (qzdVar != null) {
                qzdVar.a(this.mHummerContext, i);
            }
        }
    }

    @Override // com.ap.zoloz.hummer.common.TaskTracker
    public void forceQuit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6896bb61", new Object[]{this});
        } else if (this.isLive) {
            BioLog.i("Webtask " + this.mTaskConfig.name + " forceQuit");
            HashMap hashMap = new HashMap();
            hashMap.put("extInfo", "exit " + this.mTaskConfig.name);
            jqn.a().c(upx.TECH_SEED, hashMap);
            nzw.c().b();
            this.isLive = false;
        }
    }

    @Override // com.ap.zoloz.hummer.common.TaskTracker
    public void run(f9b f9bVar, TaskConfig taskConfig, qzd qzdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ad997b2", new Object[]{this, f9bVar, taskConfig, qzdVar});
            return;
        }
        this.mITaskTrackerCallback = qzdVar;
        this.mTaskConfig = taskConfig;
        this.isLive = true;
        if (taskConfig != null && f9bVar != null) {
            this.mHummerContext = f9bVar;
            f9bVar.a("currentTaskName", "context", taskConfig.name);
            this.mIAlertManagerCallback = new a(taskConfig);
            if (!taskConfig.inputParams.containsKey("url")) {
                this.mHummerContext.u(taskConfig.name, "Z7026");
                this.mHummerContext.p(taskConfig.name, "Z7026");
                vk0.e().c(this.mIAlertManagerCallback);
                return;
            }
            String str = (String) this.mHummerContext.o(String.valueOf(((Map) taskConfig.inputParams.get("url")).get("value")));
            this.url = str;
            if (StringUtil.isNullorEmpty(str)) {
                this.mHummerContext.u(taskConfig.name, "Z7020");
                this.mHummerContext.p(taskConfig.name, "Z7020");
                vk0.e().c(this.mIAlertManagerCallback);
            } else if (!nzw.c().e(this.url)) {
                HashMap<String, Object> hashMap = new HashMap<>();
                hashMap.put("url", this.url);
                nzw.c().f(hashMap);
            }
        }
    }
}

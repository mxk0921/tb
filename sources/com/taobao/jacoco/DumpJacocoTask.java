package com.taobao.jacoco;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.ta.utdid2.device.UTUtdid;
import com.taobao.jacoco.data.MtopTaobaoCoverageMetaInfoSaveRequest;
import com.taobao.jacoco.data.MtopTaobaoCoverageMetaInfoSaveResponse;
import com.taobao.jacoco.data.MtopTaobaoCoverageMetaInfoSaveResponseData;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.intf.Mtop;
import org.jacoco.agent.rt.RT;
import tb.eg9;
import tb.elv;
import tb.hhg;
import tb.mmv;
import tb.ndt;
import tb.ozd;
import tb.syp;
import tb.z6e;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class DumpJacocoTask implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String c = "CodeTrack-DumpJacoco";
    private static final SimpleDateFormat d = new SimpleDateFormat("yyyy/MM/dd/HH/mm", Locale.ENGLISH);
    private static final AtomicBoolean e = new AtomicBoolean(false);
    private static final String f = "tmallwireless-ycombinator";
    private static final String g = "onlineAppKey";
    private static final String h = "constantAppkey";
    private static final String i = "appVersion";
    private static final String j = "appKey";
    private static final String k = "appVersion";
    private static final String l = "osType";
    private static final String m = "osVersion";
    private static final String n = "utdid";
    private static final String o = "uploadTime";
    private static final String p = "ANDROID";

    /* renamed from: a  reason: collision with root package name */
    private final Context f10862a;
    private final String b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f10863a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;

        public a(String str, String str2, String str3) {
            this.f10863a = str;
            this.b = str2;
            this.c = str3;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                DumpJacocoTask.a(DumpJacocoTask.this, this.f10863a, this.b, this.c);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b extends syp {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Runnable f10864a;
        public final /* synthetic */ File b;

        public b(DumpJacocoTask dumpJacocoTask, Runnable runnable, File file) {
            this.f10864a = runnable;
            this.b = file;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == 280171132) {
                super.onSuccess((z6e) objArr[0], (ozd) objArr[1]);
                return null;
            } else if (hashCode == 2005480267) {
                super.onFailure((z6e) objArr[0], (ndt) objArr[1]);
                return null;
            } else {
                int hashCode2 = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/jacoco/DumpJacocoTask$2");
            }
        }

        @Override // tb.syp, tb.mzd
        public void onFailure(z6e z6eVar, ndt ndtVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7789334b", new Object[]{this, z6eVar, ndtVar});
                return;
            }
            super.onFailure(z6eVar, ndtVar);
            new StringBuilder("upload failure, delete temp file  == ").append(eg9.b(this.b));
        }

        @Override // tb.syp, tb.mzd
        public void onSuccess(z6e z6eVar, ozd ozdVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("10b3127c", new Object[]{this, z6eVar, ozdVar});
                return;
            }
            super.onSuccess(z6eVar, ozdVar);
            new StringBuilder("upload result = ").append(JSON.toJSONString(ozdVar));
            this.f10864a.run();
            new StringBuilder("upload success, delete temp file  == ").append(eg9.b(this.b));
        }
    }

    public DumpJacocoTask(Context context, String str) {
        this.f10862a = context;
        this.b = str;
    }

    public static /* synthetic */ void a(DumpJacocoTask dumpJacocoTask, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9a7ac8f", new Object[]{dumpJacocoTask, str, str2, str3});
        } else {
            dumpJacocoTask.d(str, str2, str3);
        }
    }

    private String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7734b747", new Object[]{this});
        }
        String str = (String) hhg.a("onlineAppKey", "");
        if (TextUtils.isEmpty(str)) {
            str = (String) hhg.a(h, "");
        }
        String value = UTUtdid.instance(this.f10862a).getValue();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("appKey", (Object) str);
        jSONObject.put("appVersion", (Object) ((String) hhg.a("appVersion", "")));
        jSONObject.put("osType", (Object) p);
        jSONObject.put("osVersion", (Object) Build.VERSION.RELEASE);
        jSONObject.put("utdid", (Object) value);
        jSONObject.put("uploadTime", (Object) Long.valueOf(System.currentTimeMillis()));
        return JSON.toJSONString(jSONObject);
    }

    private byte[] c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("46bc5531", new Object[]{this});
        }
        byte[] executionData = RT.getAgent().getExecutionData(true);
        if (executionData == null || executionData.length == 0) {
            throw new IllegalStateException("executionData is empty");
        }
        new StringBuilder("executionData size = ").append(executionData.length);
        return executionData;
    }

    private void d(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f4d364e", new Object[]{this, str, str2, str3});
            return;
        }
        Mtop instance = Mtop.getInstance(Mtop.Id.INNER);
        if (instance == null) {
            Log.e(c, "mtop == null,  wtf");
            return;
        }
        MtopTaobaoCoverageMetaInfoSaveRequest mtopTaobaoCoverageMetaInfoSaveRequest = new MtopTaobaoCoverageMetaInfoSaveRequest();
        mtopTaobaoCoverageMetaInfoSaveRequest.setMtlBuildId(str);
        mtopTaobaoCoverageMetaInfoSaveRequest.setOssObjectKey(str2 + "/" + str3);
        mtopTaobaoCoverageMetaInfoSaveRequest.setParam(b());
        new StringBuilder("request = ").append(JSON.toJSONString(mtopTaobaoCoverageMetaInfoSaveRequest));
        MtopBusiness.build(instance, mtopTaobaoCoverageMetaInfoSaveRequest).reqMethod(MethodEnum.POST).setSocketTimeoutMilliSecond(5000).setConnectionTimeoutMilliSecond(5000).registerListener((IRemoteListener) new IRemoteBaseListener() { // from class: com.taobao.jacoco.DumpJacocoTask.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i2, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i2), mtopResponse, obj});
                    return;
                }
                Log.e(DumpJacocoTask.c, "error, i = " + i2);
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i2, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i2), mtopResponse, baseOutDo, obj});
                } else if (!(baseOutDo instanceof MtopTaobaoCoverageMetaInfoSaveResponse)) {
                    Log.e(DumpJacocoTask.c, "success, but baseOutDo is not MtopTaobaoQaCovMetaInfoSaveResponse, wtf ??? ");
                } else {
                    MtopTaobaoCoverageMetaInfoSaveResponseData data = ((MtopTaobaoCoverageMetaInfoSaveResponse) baseOutDo).getData();
                    if (data != null && Boolean.parseBoolean(data.getResult())) {
                        Log.e(DumpJacocoTask.c, "success, send record to server success");
                    }
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i2, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i2), mtopResponse, obj});
                    return;
                }
                Log.e(DumpJacocoTask.c, "system-error, i = " + i2);
            }
        }).startRequest(MtopTaobaoCoverageMetaInfoSaveResponse.class);
    }

    private void e(File file, String str, String str2, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ffb03cd", new Object[]{this, file, str, str2, runnable});
            return;
        }
        elv elvVar = new elv();
        elvVar.e(f);
        elvVar.f(str);
        elvVar.g(str2);
        elvVar.h(file.getPath());
        mmv.a(elvVar, new b(this, runnable, file));
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        try {
            if (this.f10862a != null) {
                AtomicBoolean atomicBoolean = e;
                if (!atomicBoolean.compareAndSet(false, true)) {
                    atomicBoolean.set(false);
                    return;
                }
                File d2 = eg9.d(this.f10862a);
                eg9.f(c(), d2);
                if (!TextUtils.isEmpty(this.b)) {
                    String str = this.b;
                    String str2 = str + "_" + System.nanoTime() + "_" + Math.random() + ".exec";
                    String str3 = "coverage/meta_data/" + d.format(new Date());
                    e(d2, str3, str2, new a(str, str3, str2));
                    atomicBoolean.set(false);
                    return;
                }
                throw new IllegalArgumentException("buildId is empty");
            }
            throw new IllegalArgumentException("context == null");
        } catch (Throwable th) {
            try {
                Log.e(c, "", th);
            } finally {
                e.set(false);
            }
        }
    }
}

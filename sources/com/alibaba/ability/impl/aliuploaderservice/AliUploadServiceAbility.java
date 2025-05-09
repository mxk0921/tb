package com.alibaba.ability.impl.aliuploaderservice;

import android.content.Context;
import android.os.SystemClock;
import anet.channel.status.NetworkStatusHelper;
import com.alibaba.ability.MegaUtils;
import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.taobao.android.abilityidl.ability.AbsAliUploadServiceAbility;
import com.taobao.android.abilityidl.ability.AliUploadServiceCompleteResult;
import com.taobao.android.abilityidl.ability.AliUploadServiceProgressResult;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;
import tb.a07;
import tb.bvl;
import tb.ckf;
import tb.gr0;
import tb.jdb;
import tb.jfb;
import tb.kdb;
import tb.mzd;
import tb.ndt;
import tb.omv;
import tb.ozd;
import tb.t2o;
import tb.tsq;
import tb.wsq;
import tb.x6e;
import tb.xhv;
import tb.z6e;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class AliUploadServiceAbility extends AbsAliUploadServiceAbility {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public z6e f1892a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class a implements z6e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f1893a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ gr0 d;

        public a(String str, String str2, String str3, gr0 gr0Var) {
            this.f1893a = str;
            this.b = str2;
            this.c = str3;
            this.d = gr0Var;
        }

        @Override // tb.z6e
        public String getBizType() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("9c07dca2", new Object[]{this});
            }
            return this.f1893a;
        }

        @Override // tb.z6e
        public String getFilePath() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("1bcb7a22", new Object[]{this});
            }
            return this.b;
        }

        @Override // tb.z6e
        public String getFileType() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("105a7e2d", new Object[]{this});
            }
            return this.c;
        }

        @Override // tb.z6e
        public Map<String, String> getMetaInfo() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("8d01c005", new Object[]{this});
            }
            if (this.d.e == null) {
                return null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Map<String, ? extends Object> map = this.d.e;
            if (map == null) {
                return linkedHashMap;
            }
            for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                ckf.f(key, "key");
                linkedHashMap.put(key, value.toString());
            }
            return linkedHashMap;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class b implements mzd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public volatile long f1894a;
        public final /* synthetic */ jfb c;
        public final /* synthetic */ int d;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public static final class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    b.this.c.onCancel();
                }
            }
        }

        /* compiled from: Taobao */
        /* renamed from: com.alibaba.ability.impl.aliuploaderservice.AliUploadServiceAbility$b$b  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public static final class RunnableC0042b implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public final /* synthetic */ ndt b;

            public RunnableC0042b(ndt ndtVar) {
                this.b = ndtVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                jfb jfbVar = b.this.c;
                StringBuilder sb = new StringBuilder("upload error, code: ");
                ndt ndtVar = this.b;
                String str = null;
                sb.append(ndtVar != null ? ndtVar.f24666a : null);
                sb.append(", subCode: ");
                ndt ndtVar2 = this.b;
                sb.append(ndtVar2 != null ? ndtVar2.b : null);
                sb.append(", info: ");
                ndt ndtVar3 = this.b;
                if (ndtVar3 != null) {
                    str = ndtVar3.c;
                }
                sb.append(str);
                jfbVar.O(new ErrorResult("500", sb.toString(), (Map) null, 4, (a07) null));
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public static final class c implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public final /* synthetic */ int b;

            public c(int i) {
                this.b = i;
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                jfb jfbVar = b.this.c;
                AliUploadServiceProgressResult aliUploadServiceProgressResult = new AliUploadServiceProgressResult();
                aliUploadServiceProgressResult.progress = Double.valueOf(this.b);
                xhv xhvVar = xhv.INSTANCE;
                jfbVar.X(aliUploadServiceProgressResult);
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public static final class d implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public final /* synthetic */ ozd b;

            public d(ozd ozdVar) {
                this.b = ozdVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                String str;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                jfb jfbVar = b.this.c;
                AliUploadServiceCompleteResult aliUploadServiceCompleteResult = new AliUploadServiceCompleteResult();
                ozd ozdVar = this.b;
                if (ozdVar != null) {
                    str = ozdVar.a();
                } else {
                    str = null;
                }
                aliUploadServiceCompleteResult.path = str;
                xhv xhvVar = xhv.INSTANCE;
                jfbVar.g0(aliUploadServiceCompleteResult);
            }
        }

        public b(jfb jfbVar, int i) {
            this.c = jfbVar;
            this.d = i;
        }

        @Override // tb.mzd
        public void onCancel(z6e z6eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c7d021ed", new Object[]{this, z6eVar});
                return;
            }
            MegaUtils.C(new a());
            AliUploadServiceAbility.access$setTask$p(AliUploadServiceAbility.this, null);
        }

        @Override // tb.mzd
        public void onFailure(z6e z6eVar, ndt ndtVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7789334b", new Object[]{this, z6eVar, ndtVar});
                return;
            }
            MegaUtils.C(new RunnableC0042b(ndtVar));
            AliUploadServiceAbility.access$setTask$p(AliUploadServiceAbility.this, null);
        }

        @Override // tb.mzd
        public void onPause(z6e z6eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c85aa60f", new Object[]{this, z6eVar});
            }
        }

        @Override // tb.mzd
        public void onProgress(z6e z6eVar, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("34b23fa9", new Object[]{this, z6eVar, new Integer(i)});
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            if (i == 100 || uptimeMillis - this.f1894a >= this.d) {
                this.f1894a = uptimeMillis;
                MegaUtils.C(new c(i));
            }
        }

        @Override // tb.mzd
        public void onResume(z6e z6eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e581d4da", new Object[]{this, z6eVar});
            }
        }

        @Override // tb.mzd
        public void onStart(z6e z6eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f33e623", new Object[]{this, z6eVar});
            }
        }

        @Override // tb.mzd
        public void onSuccess(z6e z6eVar, ozd ozdVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("10b3127c", new Object[]{this, z6eVar, ozdVar});
                return;
            }
            MegaUtils.C(new d(ozdVar));
            AliUploadServiceAbility.access$setTask$p(AliUploadServiceAbility.this, null);
        }

        @Override // tb.mzd
        public void onWait(z6e z6eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e3e24ed2", new Object[]{this, z6eVar});
            }
        }
    }

    static {
        t2o.a(95420417);
    }

    public static final /* synthetic */ z6e access$getTask$p(AliUploadServiceAbility aliUploadServiceAbility) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (z6e) ipChange.ipc$dispatch("d0970e39", new Object[]{aliUploadServiceAbility});
        }
        return aliUploadServiceAbility.f1892a;
    }

    public static final /* synthetic */ void access$setTask$p(AliUploadServiceAbility aliUploadServiceAbility, z6e z6eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc20bddd", new Object[]{aliUploadServiceAbility, z6eVar});
        } else {
            aliUploadServiceAbility.f1892a = z6eVar;
        }
    }

    public static /* synthetic */ Object ipc$super(AliUploadServiceAbility aliUploadServiceAbility, String str, Object... objArr) {
        if (str.hashCode() == -1504501726) {
            super.onDestroy();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ability/impl/aliuploaderservice/AliUploadServiceAbility");
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707fe601", new Object[]{this});
            return;
        }
        z6e z6eVar = this.f1892a;
        if (z6eVar != null) {
            x6e a2 = omv.a();
            if (a2 != null) {
                a2.cancelAsync(z6eVar);
            }
            this.f1892a = null;
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsAliUploadServiceAbility
    public void cancel(kdb kdbVar, jdb jdbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c84bf6c", new Object[]{this, kdbVar, jdbVar});
            return;
        }
        ckf.g(kdbVar, "abilityContext");
        ckf.g(jdbVar, "callback");
        a();
    }

    @Override // tb.st, tb.odb
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        a();
    }

    @Override // com.taobao.android.abilityidl.ability.AbsAliUploadServiceAbility
    public void upload(kdb kdbVar, gr0 gr0Var, jfb jfbVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5d8c1f7", new Object[]{this, kdbVar, gr0Var, jfbVar});
            return;
        }
        ckf.g(kdbVar, "abilityContext");
        ckf.g(gr0Var, "params");
        ckf.g(jfbVar, "events");
        if (this.f1892a == null) {
            NetworkStatusHelper.NetworkStatus status = NetworkStatusHelper.getStatus();
            if (status == null || !ckf.b(gr0Var.d, "WIFI_ONLY") || status == NetworkStatusHelper.NetworkStatus.WIFI) {
                Context context = kdbVar.l().getContext();
                if (context != null) {
                    String businessID = kdbVar.l().getBusinessID();
                    if (businessID.length() <= 0) {
                        businessID = null;
                    }
                    if (businessID != null) {
                        String str2 = gr0Var.b;
                        ckf.f(str2, AdvanceSetting.NETWORK_TYPE);
                        if (str2.length() <= 0) {
                            str2 = null;
                        }
                        if (str2 != null) {
                            String str3 = gr0Var.f20175a;
                            ckf.f(str3, AdvanceSetting.NETWORK_TYPE);
                            if (str3.length() <= 0) {
                                str3 = null;
                            }
                            if (str3 != null) {
                                if (tsq.I(str3, "file://", false, 2, null)) {
                                    str3 = bvl.INSTANCE.b(context, businessID, str3);
                                }
                                File file = new File(str3);
                                try {
                                    if (!file.exists()) {
                                        jfbVar.O(new ErrorResult("NO_EXIST", "Not Exist. Path: " + gr0Var.f20175a, (Map) null, 4, (a07) null));
                                        return;
                                    } else if (!file.isFile()) {
                                        jfbVar.O(new ErrorResult("NOT_FILE", "Not File. Path: " + gr0Var.f20175a, (Map) null, 4, (a07) null));
                                        return;
                                    } else if (str3 != null) {
                                        int d0 = wsq.d0(str3, '.', 0, false, 6, null);
                                        Integer valueOf = Integer.valueOf(d0);
                                        if (d0 == -1) {
                                            valueOf = null;
                                        }
                                        if (valueOf != null) {
                                            str = str3.substring(valueOf.intValue());
                                            ckf.f(str, "(this as java.lang.String).substring(startIndex)");
                                        } else {
                                            str = "";
                                        }
                                        int max = Math.max(gr0Var.c, 300);
                                        x6e a2 = omv.a();
                                        if (a2 != null) {
                                            a aVar = new a(str2, str3, str, gr0Var);
                                            this.f1892a = aVar;
                                            xhv xhvVar = xhv.INSTANCE;
                                            a2.uploadAsync(aVar, new b(jfbVar, max), null);
                                            return;
                                        }
                                        return;
                                    }
                                } catch (SecurityException unused) {
                                    jfbVar.O(new ErrorResult("NO_PERMISSION", "No Permission. Path: " + gr0Var.f20175a, (Map) null, 4, (a07) null));
                                    return;
                                }
                            }
                            jfbVar.O(new ErrorResult("400", "Illegal Path. Path: " + gr0Var.f20175a, (Map) null, 4, (a07) null));
                            return;
                        }
                        jfbVar.O(new ErrorResult("400", "param bizCode is empty", (Map) null, 4, (a07) null));
                        return;
                    }
                    jfbVar.O(new ErrorResult("500", "businessID is empty", (Map) null, 4, (a07) null));
                    return;
                }
                jfbVar.O(new ErrorResult("500", "env.getContext is null", (Map) null, 4, (a07) null));
                return;
            }
            jfbVar.O(new ErrorResult("NETWORK_ERROR", "required network type is " + gr0Var.d + ", but current network type is " + status, (Map) null, 4, (a07) null));
        }
    }
}
